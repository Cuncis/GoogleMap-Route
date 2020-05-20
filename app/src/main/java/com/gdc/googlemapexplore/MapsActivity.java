package com.gdc.googlemapexplore;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gdc.googlemapexplore.ver1.FetchURL;
import com.gdc.googlemapexplore.ver1.TaskLoadedCallback;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, TaskLoadedCallback {
    private static final String TAG = "_MapsActivity";

    private GoogleMap googleMap;
    private FusedLocationProviderClient fusedLocationClient;
    private boolean mLocationPermissionGranted = false;
    private Location lastLocation;
    private Button btn_getRoute;
    private MarkerOptions marker = new MarkerOptions();
    private MarkerOptions place1, place2, place3, place4;
    Polyline currentPolyline;

    private static final LatLng HOME = new LatLng(-7.2374363, 112.6274348);
    private static final LatLng T_JUNCTION = new LatLng(-7.2411412, 112.6288518);
    private static final LatLng GAS_STATION = new LatLng(-7.2369845, 112.61866);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmap);
        initView();
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        place1 = new MarkerOptions().position(new LatLng(-7.2374363, 112.6274348)).title("Location 1");
        place2 = new MarkerOptions().position(new LatLng(-7.2411412, 112.6288518)).title("Location 2");
        place3 = new MarkerOptions().position(new LatLng(-7.2404317, 112.6251765)).title("Location 3");
        place4 = new MarkerOptions().position(new LatLng(-7.2369845, 112.61866)).title("Location 4");


        if (!checkGps()) {
            Toast.makeText(this, "GPS not activated", Toast.LENGTH_SHORT).show();
        } else {
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }


        initListener();

    }

    private String getUrl(LatLng origin, LatLng dest, String directionMode) {
        // Origin of route
        String str_origin = "origin=" + origin.latitude + "," + origin.longitude;
        // Destination of route
        String str_dest = "destination=" + dest.latitude + "," + dest.longitude;
        // Mode
        String mode = "mode=" + directionMode;
        // Building the parameters to the web service
        String parameters = str_origin + "&" + str_dest + "&" + mode;
        // Output format
        String output = "json";
        // Building the url to the web service
        String url = "https://maps.googleapis.com/maps/api/directions/" + output + "?" + parameters + "&key=" + getString(R.string.google_maps_key);
        return url;
    }

    private String getUrl2(LatLng origin, LatLng dest, String directionMode) {
        // Origin of route
        String str_origin = "origin=" + origin.latitude + "," + origin.longitude;
        //waypoint
        String waypoints = "waypoints=optimize:true|-7.2411412, 112.6288518|";
        // Destination of route
        String str_dest = "destination=" + dest.latitude + "," + dest.longitude;
        String sensor = "sensor=false";
        // Mode
//        String mode = "mode=" + directionMode;
        // Building the parameters to the web service
        String parameters = str_origin + "&" + waypoints + "&" + str_dest + "&" + sensor;
        // Output format
        String output = "json";
        // Building the url to the web service
        String url = "https://maps.googleapis.com/maps/api/directions/" + output + "?" + parameters + "&key=" + getString(R.string.google_maps_key);
        return url;
    }

//    private String getMapsApiDirectionsUrl() {
//        String origin = "origin=" + LOWER_MANHATTAN.latitude + "," + LOWER_MANHATTAN.longitude;
//        String waypoints = "waypoints=optimize:true|" + BROOKLYN_BRIDGE.latitude + "," + BROOKLYN_BRIDGE.longitude + "|";
//        String destination = "destination=" + WALL_STREET.latitude + "," + WALL_STREET.longitude;
//
//        String sensor = "sensor=false";
//        String params = origin + "&" + waypoints + "&"  + destination + "&" + sensor;
//        String output = "json";
//        return "https://maps.googleapis.com/maps/api/directions/"
//                + output + "?" + params;
//    }

    private boolean checkGps() {
        LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        return manager.isProviderEnabled(LocationManager.GPS_PROVIDER);
    }

    private void getLocationPermission() {
        if (ContextCompat.checkSelfPermission(this.getApplicationContext(), android.Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mLocationPermissionGranted = true;
        } else {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, 1);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        mLocationPermissionGranted = false;
        if (requestCode == 1) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                mLocationPermissionGranted = true;

                getDeviceLocation();
                Log.d(TAG, "onRequestPermissionsResult: Permission Running...");
            }
        }

        updateLocationUI();
    }

    private void updateLocationUI() {
        try {
            if (mLocationPermissionGranted) {
                googleMap.setMyLocationEnabled(true);
                googleMap.getUiSettings().setZoomControlsEnabled(true);
            } else {
                googleMap.setMyLocationEnabled(false);
                googleMap.getUiSettings().setZoomControlsEnabled(false);
                lastLocation = null;
                getLocationPermission();
            }
        } catch (SecurityException e) {
            Log.d(TAG, "updateLocationUI: Error: " + e.getMessage());
        }
    }

    private void getDeviceLocation() {
        try {
            if (mLocationPermissionGranted) {
                Task<Location> locationResult = fusedLocationClient.getLastLocation();
                locationResult.addOnSuccessListener(this, new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        if (location != null) {
                            lastLocation = location;
                            Log.d(TAG, "onSuccess: " + lastLocation);

                            LatLng current = new LatLng(lastLocation.getLatitude(), lastLocation.getLongitude());
//                            LatLng current = new LatLng(40.722543,-73.998585);

                            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(current, 18f));
                            marker.position(current);

//                            googleMap.addMarker(marker);
                            googleMap.addMarker(place1
                                    .icon(bitmapDescriptorFromVector(MapsActivity.this, R.drawable.ic_person_pin_circle_black_24dp))
                                    .snippet("We are here!")).setTag("place1");
                            googleMap.addMarker(place2).setTag("place2");
                            googleMap.addMarker(place3).setTag("place3");
                            googleMap.addMarker(place4).setTag("place4");
                        }
                    }
                });
            }
        } catch (SecurityException e) {
            Log.d(TAG, "getDeviceLocation: Error: " + e.getMessage());
        }
    }

    private BitmapDescriptor bitmapDescriptorFromVector(Context context, int vectorResId) {
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorResId);
        vectorDrawable.setBounds(0, 0, vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight());
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }


    boolean p1 = false, p2 = false, p3 = false, p4 = false;
    private void initListener() {
        btn_getRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                btn_getRoute.setText("Lat: " + lastLocation.getLatitude() + ", Lng; " + lastLocation.getLongitude());
                if (p2) {
                    String url = getUrl2(place1.getPosition(), place2.getPosition(), "Driving");
                    new FetchURL(MapsActivity.this).execute(url);
                } else if (p3) {
                    String url = getUrl2(place1.getPosition(), place3.getPosition(), "Driving");
                    new FetchURL(MapsActivity.this).execute(url);
                } else if (p4) {
                    String url = getUrl2(place1.getPosition(), place4.getPosition(), "Driving");
                    new FetchURL(MapsActivity.this).execute(url);
                } else {
                    Toast.makeText(MapsActivity.this, "Choose ur destination", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initView() {
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        btn_getRoute = findViewById(R.id.btn_getRoute);
    }

    public void drawRoute(String result) {

        try {
            //Tranform the string into a json object
            final JSONObject json = new JSONObject(result);
            JSONArray routeArray = json.getJSONArray("routes");
            JSONObject routes = routeArray.getJSONObject(0);
            JSONObject overviewPolylines = routes.getJSONObject("overview_polyline");
            String encodedString = overviewPolylines.getString("points");
            List<LatLng> list = decodePoly(encodedString);

            Polyline line = googleMap.addPolyline(new PolylineOptions()
                    .addAll(list)
                    .width(12)
                    .color(Color.parseColor("#05b1fb"))//Google maps blue color
                    .geodesic(true)
            );


//            googleMap.addPolyline(line);

        } catch (JSONException e) {

        }
    }

    private ArrayList<LatLng> decodePoly(String encoded) {
        ArrayList<LatLng> poly = new ArrayList<LatLng>();
        int index = 0, len = encoded.length();
        int lat = 0, lng = 0;
        while (index < len) {
            int b, shift = 0, result = 0;
            do {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lat += dlat;
            shift = 0;
            result = 0;
            do {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lng += dlng;

            LatLng position = new LatLng((double) lat / 1E5, (double) lng / 1E5);
            poly.add(position);
        }
        return poly;
    }

    private void getDirectionJson() {

    }

//    private void getGmapData() {
//        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
//        Call<GMapResponse> call = apiInterface.getGmapData("AIzaSyAPBJLBVxvOLO2LinOTDOc-iAKzrsqyzAE",
//                "Surabaya");
//        call.enqueue(new Callback<GMapResponse>() {
//            @Override
//            public void onResponse(Call<GMapResponse> call, Response<GMapResponse> response) {
//                if (response.isSuccessful()) {
//                    Log.d(TAG, "onResponse: " + response.body());
//                } else {
//                    Toast.makeText(MapsActivity.this, "" + response.message(), Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<GMapResponse> call, Throwable t) {
//                Toast.makeText(MapsActivity.this, "Error2: " + t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
//    }

    @Override
    public void onMapReady(GoogleMap map) {
        googleMap = map;

        updateLocationUI();

        getDeviceLocation();

        googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if (marker.getTag().equals("place1")) {
                    p1 = true;
                    p2 = false;
                    p3 = false;
                    p4 = false;
                    Toast.makeText(MapsActivity.this, "Place 1", Toast.LENGTH_SHORT).show();
                } else if (marker.getTag().equals("place2")) {
                    p1 = false;
                    p2 = true;
                    p3 = false;
                    p4 = false;
                    Toast.makeText(MapsActivity.this, "Place 2", Toast.LENGTH_SHORT).show();
                } else if (marker.getTag().equals("place3")) {
                    p1 = false;
                    p2 = false;
                    p3 = true;
                    p4 = false;
                    Toast.makeText(MapsActivity.this, "Place 3", Toast.LENGTH_SHORT).show();
                } else if (marker.getTag().equals("place4")) {
                    p1 = false;
                    p2 = false;
                    p3 = false;
                    p4 = true;
                    Toast.makeText(MapsActivity.this, "Place 4", Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });
    }

    @Override
    public void onTaskDone(Object... values) {
        if (currentPolyline != null) {
            currentPolyline.remove();
        }
        currentPolyline = googleMap.addPolyline((PolylineOptions) values[0]);
    }
}
