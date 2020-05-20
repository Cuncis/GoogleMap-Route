package com.gdc.googlemapexplore.util;

public class Constant {
    public static final String directionsResponse = "{\n" +
            "  \"geocoded_waypoints\": [\n" +
            "    {\n" +
            "      \"geocoder_status\": \"OK\",\n" +
            "      \"place_id\": \"ChIJNVBqtdz71y0RKqu2-ZYW71w\",\n" +
            "      \"types\": [\n" +
            "        \"street_address\"\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"geocoder_status\": \"OK\",\n" +
            "      \"place_id\": \"ChIJN6kf5C_-1y0Rq1RWYjIawZE\",\n" +
            "      \"types\": [\n" +
            "        \"route\"\n" +
            "      ]\n" +
            "    }\n" +
            "  ],\n" +
            "  \"routes\": [\n" +
            "    {\n" +
            "      \"bounds\": {\n" +
            "        \"northeast\": {\n" +
            "          \"lat\": -7.237258000000001,\n" +
            "          \"lng\": 112.7438047\n" +
            "        },\n" +
            "        \"southwest\": {\n" +
            "          \"lat\": -7.2797311,\n" +
            "          \"lng\": 112.6274124\n" +
            "        }\n" +
            "      },\n" +
            "      \"copyrights\": \"Map data ©2020\",\n" +
            "      \"legs\": [\n" +
            "        {\n" +
            "          \"distance\": {\n" +
            "            \"text\": \"15,6 km\",\n" +
            "            \"value\": 15574\n" +
            "          },\n" +
            "          \"duration\": {\n" +
            "            \"text\": \"41 min\",\n" +
            "            \"value\": 2438\n" +
            "          },\n" +
            "          \"end_address\": \"Jl. Pd. Benowo Indah, Babat Jerawat, Kec. Pakal, Kota SBY, Jawa Timur 60197, Indonesia\",\n" +
            "          \"end_location\": {\n" +
            "            \"lat\": -7.237258000000001,\n" +
            "            \"lng\": 112.6274297\n" +
            "          },\n" +
            "          \"start_address\": \"Jl. Keputran No.65A, RT.012/RW.01, Keputran, Kec. Tegalsari, Kota SBY, Jawa Timur 60265, Indonesia\",\n" +
            "          \"start_location\": {\n" +
            "            \"lat\": -7.276987,\n" +
            "            \"lng\": 112.743731\n" +
            "          },\n" +
            "          \"steps\": [\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,4 km\",\n" +
            "                \"value\": 366\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 73\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.273907299999999,\n" +
            "                \"lng\": 112.7435858\n" +
            "              },\n" +
            "              \"html_instructions\": \"Ambil arah <b>utara</b> menuju <b>Jl. Kayoon</b>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"dhlk@igcoT}@LuATk@F]Ba@@C?u@?]Ak@Ci@Gi@IC?]GiA]GAC?A?C?GNIX\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.276987,\n" +
            "                \"lng\": 112.743731\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"20 m\",\n" +
            "                \"value\": 20\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 11\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2740262,\n" +
            "                \"lng\": 112.7434609\n" +
            "              },\n" +
            "              \"html_instructions\": \"Belok <b>kiri</b> ke <b>Jl. Kayoon</b>\",\n" +
            "              \"maneuver\": \"turn-left\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"|tkk@mfcoTDNPH\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.273907299999999,\n" +
            "                \"lng\": 112.7435858\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,1 km\",\n" +
            "                \"value\": 144\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 39\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.273349199999999,\n" +
            "                \"lng\": 112.7423484\n" +
            "              },\n" +
            "              \"html_instructions\": \"Belok <b>kanan</b> ke <b>Jl. Jend. Basuki Rachmat</b>\",\n" +
            "              \"maneuver\": \"turn-right\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"tukk@secoTKNk@bAk@~@c@hA\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2740262,\n" +
            "                \"lng\": 112.7434609\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,5 km\",\n" +
            "                \"value\": 456\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 63\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.277328100000001,\n" +
            "                \"lng\": 112.7413782\n" +
            "              },\n" +
            "              \"html_instructions\": \"Belok <b>kiri</b> setelah Alfamart Urip Sumoharjo (di sebelah kiri)\",\n" +
            "              \"maneuver\": \"turn-left\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"lqkk@u~boThA^pAZ|@Nj@JRDvATl@Hr@H~@J^Dr@Hx@Hp@FB@bAH\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.273349199999999,\n" +
            "                \"lng\": 112.7423484\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,3 km\",\n" +
            "                \"value\": 268\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 38\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.279693099999999,\n" +
            "                \"lng\": 112.7409061\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Raya Darmo</b>/<wbr/><b>Jl. Raya Surabaya - Malang</b>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"hjlk@sxboTNBfMxA\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.277328100000001,\n" +
            "                \"lng\": 112.7413782\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"1,3 km\",\n" +
            "                \"value\": 1325\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"4 min\",\n" +
            "                \"value\": 240\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2780465,\n" +
            "                \"lng\": 112.7290429\n" +
            "              },\n" +
            "              \"html_instructions\": \"Belok <b>kanan</b> ke <b>Jl. R.A Kartini</b><div style=\\\"font-size:0.9em\\\">Lewati Mie Mapan Kartini (di kanan)</div>\",\n" +
            "              \"maneuver\": \"turn-right\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"`ylk@uuboTAZDN@F@H?HAd@WnBUnCAFMjAGn@ObCYzC[|CGh@OfBGf@CRCNA@Gl@EVW|FOx@SpCYdEE`@Eb@EVKhAWxD?n@A`@Bj@\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.279693099999999,\n" +
            "                \"lng\": 112.7409061\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"74 m\",\n" +
            "                \"value\": 74\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 12\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2775223,\n" +
            "                \"lng\": 112.7286352\n" +
            "              },\n" +
            "              \"html_instructions\": \"Belok <b>kanan</b> ke <b>Jl. Diponegoro</b>\",\n" +
            "              \"maneuver\": \"turn-right\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"xnlk@ok`oT]Tg@^c@X\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2780465,\n" +
            "                \"lng\": 112.7290429\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,3 km\",\n" +
            "                \"value\": 327\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 48\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.275263000000001,\n" +
            "                \"lng\": 112.726766\n" +
            "              },\n" +
            "              \"html_instructions\": \"Ambil jalur sebelah <b>kiri</b> dan tetap di <b>Jl. Diponegoro</b>\",\n" +
            "              \"maneuver\": \"turn-slight-left\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"nklk@_i`oT?HA@ABCBaAv@WR}@p@iA|@k@b@]VGDm@b@s@f@e@V\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2775223,\n" +
            "                \"lng\": 112.7286352\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"2,2 km\",\n" +
            "                \"value\": 2179\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"6 min\",\n" +
            "                \"value\": 346\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.267688000000001,\n" +
            "                \"lng\": 112.7094382\n" +
            "              },\n" +
            "              \"html_instructions\": \"Belok sedikit ke <b>kiri</b> menuju <b>Jl. Banyu Urip</b><div style=\\\"font-size:0.9em\\\">Lewati Warkop Paloma 1927 (di kiri 2,1&nbsp;km lagi)</div>\",\n" +
            "              \"maneuver\": \"turn-slight-left\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"j}kk@i}_oTAB?@C@MRIJMJKJGF?BAHEPCJGNKPCDe@b@WXSVUZILMRMRQPSRYLKF[LQHYLWP]TMHKJ_@\\\\s@l@UP[X_@\\\\UZ[f@GL_@h@IJ?@QVMNk@p@gArAQXCDCFCHEVMj@Q|@Ih@CTAL?B?PAj@?`B?ZGjACRG`@Qp@]hAIV_@|@Q`@ABUj@Ob@EPEPCRS~AIr@Ix@QfAEVAHCPI^aAhCo@lBKX[bACHAHALEd@Ev@?P?N?d@@`AEp@Id@I^EVCREl@Aj@@n@?P?P?JAZEh@CVGXGXMb@Wt@\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.275263000000001,\n" +
            "                \"lng\": 112.726766\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,3 km\",\n" +
            "                \"value\": 305\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 49\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2662691,\n" +
            "                \"lng\": 112.707127\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Simokalangan</b>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"`njk@_q|nTGTK^GVCHETQl@Sh@MZUf@INKLGJKHON]VOLKJY^GJU`@\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.267688000000001,\n" +
            "                \"lng\": 112.7094382\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,3 km\",\n" +
            "                \"value\": 301\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 43\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.266947599999999,\n" +
            "                \"lng\": 112.704529\n" +
            "              },\n" +
            "              \"html_instructions\": \"Di Alfamidi Simo Pomahan, <b>Jl. Simokalangan</b> belok <b>kiri</b> dan menjadi <b>Jl. Simo Pomahan I</b>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"dejk@qb|nTAVD`@@B@DBHXz@Tb@T\\\\FLDP@PBTB`@Fr@FfAHbABP\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2662691,\n" +
            "                \"lng\": 112.707127\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,4 km\",\n" +
            "                \"value\": 421\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 45\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.266514,\n" +
            "                \"lng\": 112.7010747\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Simo Jawar</b>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"lijk@ir{nTj@vDNx@DRBJBHHTDN?@DTA^Cf@Eb@ITKTOTOVSVYXYXABW\\\\INGNAD\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.266947599999999,\n" +
            "                \"lng\": 112.704529\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"1,2 km\",\n" +
            "                \"value\": 1181\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"3 min\",\n" +
            "                \"value\": 166\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2609204,\n" +
            "                \"lng\": 112.692363\n" +
            "              },\n" +
            "              \"html_instructions\": \"<b>Jl. Simo Jawar</b> belok sedikit ke <b>kiri</b> dan menjadi <b>Jl. Sukomanunggal</b>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"tfjk@u|znTAFAJ?N?P?P?FANCNITKVKXMZYt@Od@a@fAYb@GNGJS^KVOj@_@tAc@jAQd@MZQXUZ[Xa@Z[TEB]VKHQJA@OJq@n@URONOLk@n@SVOP_@n@QRSb@MZKRENAB[|@CHITM`@IRCHEHEFEFGBGDIDGBODWDMDSJMJA@WVKRIRGP?BGRETCLG\\\\\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.266514,\n" +
            "                \"lng\": 112.7010747\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"1,3 km\",\n" +
            "                \"value\": 1324\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"3 min\",\n" +
            "                \"value\": 169\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2586658,\n" +
            "                \"lng\": 112.680667\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Gedangasin</b>/<wbr/><b>Jl. Raya Tandes Lor</b><div style=\\\"font-size:0.9em\\\">Lanjutkan untuk mengikuti Jl. Raya Tandes Lor</div>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"vcik@gfynTKt@EXETU|@YrAEVCZEZCd@EZCf@ARARAZANCNCPCLAFCFCFIJMVKPMRCDADEJCJCLEX]tBWfBIf@Gf@E\\\\AZQ|BK|AAXEpAC~@[|CK|AEp@Gz@IxB?hBAh@C^Il@_@hBANADCF\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2609204,\n" +
            "                \"lng\": 112.692363\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,3 km\",\n" +
            "                \"value\": 302\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 42\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2585602,\n" +
            "                \"lng\": 112.677943\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Raya Balongsari</b><div style=\\\"font-size:0.9em\\\">Lewati pompa bensin/<wbr/>SPBU (di sebelah kiri)</div>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"tuhk@e}vnTKr@Eb@G~@?NBx@ClA?fAAJ@j@AN@P@f@@f@\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2586658,\n" +
            "                \"lng\": 112.680667\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,5 km\",\n" +
            "                \"value\": 499\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 54\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2580655,\n" +
            "                \"lng\": 112.6734746\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Raya Bibis</b>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"~thk@clvnTKvB?LEr@Gv@C`@O~@K^CJCNEVEZ?RATEjAAVCRABALAN?DAF?N?\\\\@b@Bh@@X@NAR?LAHCT\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2585602,\n" +
            "                \"lng\": 112.677943\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,2 km\",\n" +
            "                \"value\": 161\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 29\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.257887299999999,\n" +
            "                \"lng\": 112.672035\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Raya Manukan Wetan</b>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"|qhk@epunTADE`@CTAJCP?VA^AdAIPALAb@\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2580655,\n" +
            "                \"lng\": 112.6734746\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"1,0 km\",\n" +
            "                \"value\": 1014\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"3 min\",\n" +
            "                \"value\": 164\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2557147,\n" +
            "                \"lng\": 112.6632176\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Raya Manukan Kulon</b><div style=\\\"font-size:0.9em\\\">Lewati ATM Mandiri (di kanan)</div>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"xphk@ggunTANCJALELGPIRKPQXMTIRIXA@CJCNANAJAJARGz@Cb@Ch@AN?b@@d@?@Cr@GnBERK\\\\w@vBm@vBMd@IZ?@AFOj@[hBE^S`BE`@?RAb@?@Ar@Eb@Ct@Gd@AH?@Kb@GXG\\\\Oh@CH\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.257887299999999,\n" +
            "                \"lng\": 112.672035\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"1,0 km\",\n" +
            "                \"value\": 998\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"3 min\",\n" +
            "                \"value\": 155\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2530101,\n" +
            "                \"lng\": 112.6546299\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Banjar Sugihan</b>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"dchk@cpsnTWnAADCJGXGVSz@Mb@IXGZIZETI\\\\EJAFK^A@Up@a@`AA@O^M\\\\Kj@ER]tBAFi@vAMXIR?@GTEJKh@I`@OxA?BWxAAFCLEXId@G\\\\EXAFEh@Cj@CREVIf@I\\\\ETGZCH?BMt@CP\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2557147,\n" +
            "                \"lng\": 112.6632176\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,7 km\",\n" +
            "                \"value\": 653\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"2 min\",\n" +
            "                \"value\": 134\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2516626,\n" +
            "                \"lng\": 112.6488723\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Raya Kandangan</b>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"hrgk@mzqnT?BCHKn@CJG\\\\CLMf@Ot@?DEPUnA[pBO|@E^G`@Mp@Mx@?@EXAJE\\\\G`@?N?DAJCLANA@EZCRCRMbAEVAHEZEVCPATGt@\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2530101,\n" +
            "                \"lng\": 112.6546299\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,4 km\",\n" +
            "                \"value\": 442\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 75\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.250235699999998,\n" +
            "                \"lng\": 112.645158\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Klakah Rejo Surabaya</b><div style=\\\"font-size:0.9em\\\">Lewati Indomaret Klakah Rejo 2 (di kanan)</div>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"zigk@mvpnTCb@AHIj@CNETI`@IZCJUv@GNMj@Kb@m@|A_@|@CFO\\\\M\\\\[x@ADM^EJCFCNERAJ\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2516626,\n" +
            "                \"lng\": 112.6488723\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,2 km\",\n" +
            "                \"value\": 161\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 24\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2498618,\n" +
            "                \"lng\": 112.6437473\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Moroseneng</b>/<wbr/><b>Jl. Raya Sememi</b><div style=\\\"font-size:0.9em\\\">Lanjutkan untuk mengikuti Jl. Moroseneng</div>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"~`gk@g_pnTKv@CJOz@CLGVGp@W`A\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.250235699999998,\n" +
            "                \"lng\": 112.645158\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"1,7 km\",\n" +
            "                \"value\": 1685\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"3 min\",\n" +
            "                \"value\": 204\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.242736900000001,\n" +
            "                \"lng\": 112.6307524\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Raya Kandangan</b>/<wbr/><b>Jl. Raya Sememi</b><div style=\\\"font-size:0.9em\\\">Lanjutkan untuk mengikuti Jl. Raya Sememi</div>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"r~fk@mvonT@LK`@cA`BEDWVUZ_@ZWTo@p@EFw@t@ED[f@KPGPGTEVAFMf@Kv@CRAPGj@Ef@Eb@QjAMx@CNCTE\\\\A\\\\AVEbAGb@Mr@M`@Wt@Ob@MVOVIPMRMTMLONOPIHSNKFQJMFOFmAn@UNSREDUZYl@cA~BcA~BmAhC}@vB[p@]x@y@lBITiAvCCDIFED\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2498618,\n" +
            "                \"lng\": 112.6437473\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,3 km\",\n" +
            "                \"value\": 263\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 38\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.241711999999999,\n" +
            "                \"lng\": 112.6286297\n" +
            "              },\n" +
            "              \"html_instructions\": \"Teruskan ke <b>Jl. Raya Babat Jerawat</b>\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"brek@eemnTA@URMTQXWd@Wl@Wp@Qj@Qn@GVCHI`@On@?@CH\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.242736900000001,\n" +
            "                \"lng\": 112.6307524\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,4 km\",\n" +
            "                \"value\": 409\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"2 min\",\n" +
            "                \"value\": 104\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.2382531,\n" +
            "                \"lng\": 112.6298314\n" +
            "              },\n" +
            "              \"html_instructions\": \"Belok <b>kanan</b> ke <b>Jl. Pd. Benowo Indah</b>\",\n" +
            "              \"maneuver\": \"turn-right\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"tkek@}wlnTo@O_B]QEC?MAQCKCQAC@A?E?e@Gm@KUEMEk@Qg@QgA[WGA?oAa@CCGCy@_@\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.241711999999999,\n" +
            "                \"lng\": 112.6286297\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            },\n" +
            "            {\n" +
            "              \"distance\": {\n" +
            "                \"text\": \"0,3 km\",\n" +
            "                \"value\": 296\n" +
            "              },\n" +
            "              \"duration\": {\n" +
            "                \"text\": \"1 min\",\n" +
            "                \"value\": 73\n" +
            "              },\n" +
            "              \"end_location\": {\n" +
            "                \"lat\": -7.237258000000001,\n" +
            "                \"lng\": 112.6274297\n" +
            "              },\n" +
            "              \"html_instructions\": \"Belok <b>kiri</b> untuk tetap di <b>Jl. Pd. Benowo Indah</b><div style=\\\"font-size:0.9em\\\">Lewati Alfamart Benowo Indah (di kiri)</div>\",\n" +
            "              \"maneuver\": \"turn-left\",\n" +
            "              \"polyline\": {\n" +
            "                \"points\": \"`vdk@m_mnTa@pBYx@EJa@~ASr@_@nAYdAA@QC\"\n" +
            "              },\n" +
            "              \"start_location\": {\n" +
            "                \"lat\": -7.2382531,\n" +
            "                \"lng\": 112.6298314\n" +
            "              },\n" +
            "              \"travel_mode\": \"DRIVING\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"traffic_speed_entry\": [],\n" +
            "          \"via_waypoint\": []\n" +
            "        }\n" +
            "      ],\n" +
            "      \"overview_polyline\": {\n" +
            "        \"points\": \"dhlk@igcoTsCb@iAJyB?uAKm@IgBe@KAE?Qh@DNPHw@rAk@~@c@hAhA^pAZhBZjBZ`Ed@bD\\\\rALfMxAAZFV@RAd@WnBWvCUzBObCYzCc@fEWnCQrA]tGOx@SpC_@fFKz@c@bGApABj@]TkAx@GRaFzD_CdB{AdAi@l@SRALI\\\\S`@uAzA{@pAe@d@e@Tm@Vq@^k@^k@h@eCvByAzBi@t@sBdCU^[tA[fBEb@AbDGfBKt@o@zBi@tAy@tBKb@WrBk@lEEZI^aAhC{@fC_@lAOtB@hCOvAOv@I`A?zAAjAI`AOr@y@nCc@dBa@dA_@v@SX[Xm@d@e@j@]l@AVD`@BH\\\\dAj@`AL^Df@JtAPjCn@hE\\\\bBT|@EfAOx@k@bAiAnAa@l@ITCt@?XE^o@bBi@zAa@fAYb@OZ_@v@o@`Cu@pBMZg@t@_BnA}@n@gB~A{@|@c@h@q@bAa@~@o@dBe@tAIRKNa@Rg@Ja@POLc@j@Y|@]vB{@`EStBYxDMd@q@hAOb@_AdGQnAGx@]zEGjBC~@[|CQnCQtDArCMlAa@xBELQvAGnA?fCAnCBx@@f@KvBE`AKxAc@zBKfAG`BEj@Ef@AV@`ADfBWhCAv@AdAIPCp@EZGZQd@u@tAKZGZGz@QxCA~BGnBERcAtCeAzDQr@a@hCS`BEt@I|BKzAAJk@dCa@jBq@pCa@fB]pA{@vBO^YhAc@hCk@~A_@dAQt@I`@OxAW|AET]vBOpB_@rBm@nDiA|F{AxJWjCk@fEIh@IjAShB]~A]fAYnAaB`Ey@|BSv@QnA[`BGp@W`A@LK`@iAfBm@r@w@p@u@x@}@z@g@x@Of@G^Y~AEd@SvBg@jDOvCUvAe@vAw@dB[h@]\\\\YZ_@V}BjAi@b@[`@oFvLqDpIsAlDMLGFURMTi@~@o@~Ao@|B]|AeDs@}@KE@k@GcAQy@WiCu@sAe@aAc@a@pBYx@g@jBoAjEQC\"\n" +
            "      },\n" +
            "      \"summary\": \"Jl. Banyu Urip\",\n" +
            "      \"warnings\": [],\n" +
            "      \"waypoint_order\": []\n" +
            "    }\n" +
            "  ],\n" +
            "  \"status\": \"OK\"\n" +
            "}";
}
