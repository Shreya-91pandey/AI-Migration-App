import java.util.Set;
import java.util.HashMap;

public final class y8m
{
    public final lta a;
    public Object b;
    public amf c;
    public int d;
    public final tmf e;
    public final tmf f;
    public final umf g;
    public final inf h;
    public final fva i;
    public boolean j;
    public int k;
    public final tmf l;
    public final HashMap m;
    
    public y8m(final lta a) {
        this.a = a;
        this.d = -1;
        this.e = rhc.k();
        this.f = new tmf();
        this.g = new umf();
        this.h = new inf(0, new sd8[16]);
        this.i = new fva(this, (byte)1);
        this.l = rhc.k();
        this.m = new HashMap();
    }
    
    public final boolean a(final Set p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          26
        //     5: aload_1        
        //     6: instanceof      Llak;
        //     9: istore          20
        //    11: aload_0        
        //    12: getfield        y8m.h:Linf;
        //    15: astore          30
        //    17: aload_0        
        //    18: getfield        y8m.l:Ltmf;
        //    21: astore          22
        //    23: aload_0        
        //    24: getfield        y8m.m:Ljava/util/HashMap;
        //    27: astore          31
        //    29: aload_0        
        //    30: getfield        y8m.e:Ltmf;
        //    33: astore          32
        //    35: aload_0        
        //    36: getfield        y8m.g:Lumf;
        //    39: astore          33
        //    41: iload           20
        //    43: ifeq            1878
        //    46: aload_1        
        //    47: checkcast       Llak;
        //    50: getfield        lak.v:Lumf;
        //    53: astore_1       
        //    54: aload_1        
        //    55: getfield        umf.b:[Ljava/lang/Object;
        //    58: astore          23
        //    60: aload_1        
        //    61: getfield        umf.a:[J
        //    64: astore          25
        //    66: aload           25
        //    68: arraylength    
        //    69: iconst_2       
        //    70: isub           
        //    71: istore_2       
        //    72: iload_2        
        //    73: iflt            1872
        //    76: iconst_0       
        //    77: istore          7
        //    79: iconst_0       
        //    80: istore          20
        //    82: aload           31
        //    84: astore_1       
        //    85: aload           26
        //    87: astore          24
        //    89: aload           25
        //    91: iload           7
        //    93: laload         
        //    94: lstore          14
        //    96: lload           14
        //    98: ldc2_w          -1
        //   101: lxor           
        //   102: bipush          7
        //   104: lshl           
        //   105: lload           14
        //   107: land           
        //   108: ldc2_w          -9187201950435737472
        //   111: land           
        //   112: ldc2_w          -9187201950435737472
        //   115: lcmp           
        //   116: ifeq            1797
        //   119: bipush          8
        //   121: iload           7
        //   123: iload_2        
        //   124: isub           
        //   125: iconst_m1      
        //   126: ixor           
        //   127: bipush          31
        //   129: iushr          
        //   130: isub           
        //   131: istore_3       
        //   132: iconst_0       
        //   133: istore          8
        //   135: iload           8
        //   137: iload_3        
        //   138: if_icmpge       1762
        //   141: lload           14
        //   143: ldc2_w          255
        //   146: land           
        //   147: ldc2_w          128
        //   150: lcmp           
        //   151: ifge            1714
        //   154: aload           23
        //   156: iload           7
        //   158: iconst_3       
        //   159: ishl           
        //   160: iload           8
        //   162: iadd           
        //   163: aaload         
        //   164: astore          29
        //   166: aload           29
        //   168: instanceof      Lkpm;
        //   171: ifeq            189
        //   174: aload           29
        //   176: checkcast       Lkpm;
        //   179: iconst_2       
        //   180: invokevirtual   kpm.e:(I)Z
        //   183: ifne            189
        //   186: goto            1714
        //   189: aload_0        
        //   190: getfield        y8m.j:Z
        //   193: ifne            1369
        //   196: aload           22
        //   198: aload           29
        //   200: invokevirtual   tmf.c:(Ljava/lang/Object;)Z
        //   203: ifeq            1369
        //   206: aload_0        
        //   207: iconst_1       
        //   208: putfield        y8m.j:Z
        //   211: aload           22
        //   213: aload           29
        //   215: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //   218: astore          28
        //   220: aload           28
        //   222: ifnull          1314
        //   225: aload           28
        //   227: instanceof      Lumf;
        //   230: ifeq            882
        //   233: aload           28
        //   235: checkcast       Lumf;
        //   238: astore          26
        //   240: aload           26
        //   242: getfield        umf.b:[Ljava/lang/Object;
        //   245: astore          31
        //   247: aload           26
        //   249: getfield        umf.a:[J
        //   252: astore          34
        //   254: aload           34
        //   256: arraylength    
        //   257: iconst_2       
        //   258: isub           
        //   259: istore          10
        //   261: iload           10
        //   263: iflt            853
        //   266: iconst_0       
        //   267: istore          9
        //   269: aload           34
        //   271: iload           9
        //   273: laload         
        //   274: lstore          16
        //   276: lload           16
        //   278: ldc2_w          -1
        //   281: lxor           
        //   282: bipush          7
        //   284: lshl           
        //   285: lload           16
        //   287: land           
        //   288: ldc2_w          -9187201950435737472
        //   291: land           
        //   292: ldc2_w          -9187201950435737472
        //   295: lcmp           
        //   296: ifeq            803
        //   299: bipush          8
        //   301: iload           9
        //   303: iload           10
        //   305: isub           
        //   306: iconst_m1      
        //   307: ixor           
        //   308: bipush          31
        //   310: iushr          
        //   311: isub           
        //   312: istore          11
        //   314: iconst_0       
        //   315: istore          4
        //   317: iload           4
        //   319: iload           11
        //   321: if_icmpge       743
        //   324: lload           16
        //   326: ldc2_w          255
        //   329: land           
        //   330: ldc2_w          128
        //   333: lcmp           
        //   334: ifge            707
        //   337: aload           31
        //   339: iload           9
        //   341: iconst_3       
        //   342: ishl           
        //   343: iload           4
        //   345: iadd           
        //   346: aaload         
        //   347: checkcast       Lsd8;
        //   350: astore          28
        //   352: aload           28
        //   354: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   357: pop            
        //   358: aload_1        
        //   359: aload           28
        //   361: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   364: astore          35
        //   366: aload           28
        //   368: getfield        sd8.x:Lq8m;
        //   371: astore          27
        //   373: aload           27
        //   375: astore          26
        //   377: aload           27
        //   379: ifnonnull       386
        //   382: aload           24
        //   384: astore          26
        //   386: aload           26
        //   388: aload           28
        //   390: invokevirtual   sd8.i:()Lrd8;
        //   393: getfield        rd8.f:Ljava/lang/Object;
        //   396: aload           35
        //   398: invokeinterface q8m.n:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   403: ifne            687
        //   406: aload           32
        //   408: aload           28
        //   410: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //   413: astore          27
        //   415: aload           27
        //   417: ifnull          650
        //   420: aload           27
        //   422: instanceof      Lumf;
        //   425: ifeq            663
        //   428: aload           27
        //   430: checkcast       Lumf;
        //   433: astore          26
        //   435: aload           26
        //   437: getfield        umf.b:[Ljava/lang/Object;
        //   440: astore          35
        //   442: aload           26
        //   444: getfield        umf.a:[J
        //   447: astore          27
        //   449: aload           27
        //   451: arraylength    
        //   452: iconst_2       
        //   453: isub           
        //   454: istore          12
        //   456: iload           12
        //   458: iflt            650
        //   461: iconst_0       
        //   462: istore          5
        //   464: aload_1        
        //   465: astore          26
        //   467: aload           27
        //   469: astore_1       
        //   470: aload_1        
        //   471: iload           5
        //   473: laload         
        //   474: lstore          18
        //   476: aload           22
        //   478: astore          27
        //   480: lload           18
        //   482: ldc2_w          -1
        //   485: lxor           
        //   486: bipush          7
        //   488: lshl           
        //   489: lload           18
        //   491: land           
        //   492: ldc2_w          -9187201950435737472
        //   495: land           
        //   496: ldc2_w          -9187201950435737472
        //   499: lcmp           
        //   500: ifeq            608
        //   503: bipush          8
        //   505: iload           5
        //   507: iload           12
        //   509: isub           
        //   510: iconst_m1      
        //   511: ixor           
        //   512: bipush          31
        //   514: iushr          
        //   515: isub           
        //   516: istore          13
        //   518: iconst_0       
        //   519: istore          6
        //   521: iload           20
        //   523: istore          21
        //   525: iload           6
        //   527: iload           13
        //   529: if_icmpge       584
        //   532: lload           18
        //   534: ldc2_w          255
        //   537: land           
        //   538: ldc2_w          128
        //   541: lcmp           
        //   542: ifge            571
        //   545: aload           33
        //   547: aload           35
        //   549: iload           5
        //   551: iconst_3       
        //   552: ishl           
        //   553: iload           6
        //   555: iadd           
        //   556: aaload         
        //   557: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //   560: pop            
        //   561: iconst_1       
        //   562: istore          21
        //   564: goto            571
        //   567: astore_1       
        //   568: goto            1362
        //   571: lload           18
        //   573: bipush          8
        //   575: lshr           
        //   576: lstore          18
        //   578: iinc            6, 1
        //   581: goto            525
        //   584: aload_1        
        //   585: astore          28
        //   587: iload           21
        //   589: istore          20
        //   591: aload           27
        //   593: astore_1       
        //   594: aload           26
        //   596: astore          22
        //   598: iload           13
        //   600: bipush          8
        //   602: if_icmpne       704
        //   605: goto            615
        //   608: aload_1        
        //   609: astore          28
        //   611: iload           20
        //   613: istore          21
        //   615: iload           21
        //   617: istore          20
        //   619: aload           27
        //   621: astore_1       
        //   622: aload           26
        //   624: astore          22
        //   626: iload           5
        //   628: iload           12
        //   630: if_icmpeq       704
        //   633: iinc            5, 1
        //   636: aload           27
        //   638: astore          22
        //   640: aload           28
        //   642: astore_1       
        //   643: iload           21
        //   645: istore          20
        //   647: goto            470
        //   650: aload           22
        //   652: astore          26
        //   654: aload_1        
        //   655: astore          22
        //   657: aload           26
        //   659: astore_1       
        //   660: goto            704
        //   663: aload           22
        //   665: astore          26
        //   667: aload_1        
        //   668: astore          22
        //   670: aload           33
        //   672: aload           27
        //   674: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //   677: pop            
        //   678: iconst_1       
        //   679: istore          20
        //   681: aload           26
        //   683: astore_1       
        //   684: goto            704
        //   687: aload           22
        //   689: astore          26
        //   691: aload           30
        //   693: aload           28
        //   695: invokevirtual   inf.b:(Ljava/lang/Object;)V
        //   698: aload_1        
        //   699: astore          22
        //   701: aload           26
        //   703: astore_1       
        //   704: goto            720
        //   707: aload           22
        //   709: astore          26
        //   711: aload_1        
        //   712: astore          22
        //   714: aload           26
        //   716: astore_1       
        //   717: goto            704
        //   720: lload           16
        //   722: bipush          8
        //   724: lshr           
        //   725: lstore          16
        //   727: iinc            4, 1
        //   730: aload           22
        //   732: astore          26
        //   734: aload_1        
        //   735: astore          22
        //   737: aload           26
        //   739: astore_1       
        //   740: goto            317
        //   743: iload_2        
        //   744: istore          6
        //   746: iload_3        
        //   747: istore_2       
        //   748: iload           20
        //   750: istore          21
        //   752: aload           23
        //   754: astore          28
        //   756: iload           6
        //   758: istore          5
        //   760: iload_2        
        //   761: istore          4
        //   763: aload           22
        //   765: astore          27
        //   767: aload_1        
        //   768: astore          26
        //   770: iload           11
        //   772: bipush          8
        //   774: if_icmpne       783
        //   777: iload           6
        //   779: istore_3       
        //   780: goto            811
        //   783: iload           21
        //   785: istore          20
        //   787: aload           28
        //   789: astore          22
        //   791: iload           5
        //   793: istore_3       
        //   794: iload           4
        //   796: istore_2       
        //   797: aload           27
        //   799: astore_1       
        //   800: goto            871
        //   803: iload_2        
        //   804: istore          4
        //   806: iload_3        
        //   807: istore_2       
        //   808: iload           4
        //   810: istore_3       
        //   811: iload           20
        //   813: istore          21
        //   815: aload           23
        //   817: astore          28
        //   819: iload_3        
        //   820: istore          5
        //   822: iload_2        
        //   823: istore          4
        //   825: aload           22
        //   827: astore          27
        //   829: aload_1        
        //   830: astore          26
        //   832: iload           9
        //   834: iload           10
        //   836: if_icmpeq       783
        //   839: iinc            9, 1
        //   842: iload_3        
        //   843: istore          4
        //   845: iload_2        
        //   846: istore_3       
        //   847: iload           4
        //   849: istore_2       
        //   850: goto            269
        //   853: iload_2        
        //   854: istore          4
        //   856: iload_3        
        //   857: istore_2       
        //   858: aload_1        
        //   859: astore          26
        //   861: aload           22
        //   863: astore_1       
        //   864: iload           4
        //   866: istore_3       
        //   867: aload           23
        //   869: astore          22
        //   871: aload           26
        //   873: astore          23
        //   875: iload           20
        //   877: istore          21
        //   879: goto            1347
        //   882: aload           23
        //   884: astore          26
        //   886: aload           22
        //   888: astore          27
        //   890: iload_2        
        //   891: istore          4
        //   893: iload_3        
        //   894: istore          5
        //   896: lload           14
        //   898: lstore          16
        //   900: aload           28
        //   902: checkcast       Lsd8;
        //   905: astore          23
        //   907: aload_1        
        //   908: astore          28
        //   910: aload           28
        //   912: aload           23
        //   914: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   917: astore          31
        //   919: aload           23
        //   921: getfield        sd8.x:Lq8m;
        //   924: astore          22
        //   926: aload           22
        //   928: astore_1       
        //   929: aload           22
        //   931: ifnonnull       937
        //   934: aload           24
        //   936: astore_1       
        //   937: aload_1        
        //   938: aload           23
        //   940: invokevirtual   sd8.i:()Lrd8;
        //   943: getfield        rd8.f:Ljava/lang/Object;
        //   946: aload           31
        //   948: invokeinterface q8m.n:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   953: ifne            1279
        //   956: aload           32
        //   958: aload           23
        //   960: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //   963: astore          31
        //   965: aload           28
        //   967: astore          23
        //   969: iload           20
        //   971: istore          21
        //   973: lload           16
        //   975: lstore          14
        //   977: aload           26
        //   979: astore          22
        //   981: iload           4
        //   983: istore_3       
        //   984: iload           5
        //   986: istore_2       
        //   987: aload           27
        //   989: astore_1       
        //   990: aload           31
        //   992: ifnull          879
        //   995: aload           31
        //   997: instanceof      Lumf;
        //  1000: ifeq            1244
        //  1003: aload           31
        //  1005: checkcast       Lumf;
        //  1008: astore_1       
        //  1009: aload_1        
        //  1010: getfield        umf.b:[Ljava/lang/Object;
        //  1013: astore          31
        //  1015: aload_1        
        //  1016: getfield        umf.a:[J
        //  1019: astore          34
        //  1021: aload           34
        //  1023: arraylength    
        //  1024: iconst_2       
        //  1025: isub           
        //  1026: istore          9
        //  1028: aload           28
        //  1030: astore          23
        //  1032: iload           20
        //  1034: istore          21
        //  1036: lload           16
        //  1038: lstore          14
        //  1040: aload           26
        //  1042: astore          22
        //  1044: iload           4
        //  1046: istore_3       
        //  1047: iload           5
        //  1049: istore_2       
        //  1050: aload           27
        //  1052: astore_1       
        //  1053: iload           9
        //  1055: iflt            879
        //  1058: iconst_0       
        //  1059: istore          6
        //  1061: iload           20
        //  1063: istore          21
        //  1065: aload           34
        //  1067: iload           6
        //  1069: laload         
        //  1070: lstore          14
        //  1072: iload           21
        //  1074: istore          20
        //  1076: lload           14
        //  1078: ldc2_w          -1
        //  1081: lxor           
        //  1082: bipush          7
        //  1084: lshl           
        //  1085: lload           14
        //  1087: land           
        //  1088: ldc2_w          -9187201950435737472
        //  1091: land           
        //  1092: ldc2_w          -9187201950435737472
        //  1095: lcmp           
        //  1096: ifeq            1202
        //  1099: bipush          8
        //  1101: iload           6
        //  1103: iload           9
        //  1105: isub           
        //  1106: iconst_m1      
        //  1107: ixor           
        //  1108: bipush          31
        //  1110: iushr          
        //  1111: isub           
        //  1112: istore          10
        //  1114: iconst_0       
        //  1115: istore_2       
        //  1116: iload           21
        //  1118: istore          20
        //  1120: iload_2        
        //  1121: iload           10
        //  1123: if_icmpge       1170
        //  1126: lload           14
        //  1128: ldc2_w          255
        //  1131: land           
        //  1132: ldc2_w          128
        //  1135: lcmp           
        //  1136: ifge            1157
        //  1139: aload           33
        //  1141: aload           31
        //  1143: iload           6
        //  1145: iconst_3       
        //  1146: ishl           
        //  1147: iload_2        
        //  1148: iadd           
        //  1149: aaload         
        //  1150: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //  1153: pop            
        //  1154: iconst_1       
        //  1155: istore          20
        //  1157: lload           14
        //  1159: bipush          8
        //  1161: lshr           
        //  1162: lstore          14
        //  1164: iinc            2, 1
        //  1167: goto            1120
        //  1170: aload           28
        //  1172: astore          23
        //  1174: iload           20
        //  1176: istore          21
        //  1178: lload           16
        //  1180: lstore          14
        //  1182: aload           26
        //  1184: astore          22
        //  1186: iload           4
        //  1188: istore_3       
        //  1189: iload           5
        //  1191: istore_2       
        //  1192: aload           27
        //  1194: astore_1       
        //  1195: iload           10
        //  1197: bipush          8
        //  1199: if_icmpne       879
        //  1202: aload           28
        //  1204: astore          23
        //  1206: iload           20
        //  1208: istore          21
        //  1210: lload           16
        //  1212: lstore          14
        //  1214: aload           26
        //  1216: astore          22
        //  1218: iload           4
        //  1220: istore_3       
        //  1221: iload           5
        //  1223: istore_2       
        //  1224: aload           27
        //  1226: astore_1       
        //  1227: iload           6
        //  1229: iload           9
        //  1231: if_icmpeq       879
        //  1234: iinc            6, 1
        //  1237: iload           20
        //  1239: istore          21
        //  1241: goto            1065
        //  1244: aload           33
        //  1246: aload           31
        //  1248: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //  1251: pop            
        //  1252: iconst_1       
        //  1253: istore          21
        //  1255: aload           28
        //  1257: astore          23
        //  1259: lload           16
        //  1261: lstore          14
        //  1263: aload           26
        //  1265: astore          22
        //  1267: iload           4
        //  1269: istore_3       
        //  1270: iload           5
        //  1272: istore_2       
        //  1273: aload           27
        //  1275: astore_1       
        //  1276: goto            879
        //  1279: aload           30
        //  1281: aload           23
        //  1283: invokevirtual   inf.b:(Ljava/lang/Object;)V
        //  1286: aload           28
        //  1288: astore          23
        //  1290: iload           20
        //  1292: istore          21
        //  1294: lload           16
        //  1296: lstore          14
        //  1298: aload           26
        //  1300: astore          22
        //  1302: iload           4
        //  1304: istore_3       
        //  1305: iload           5
        //  1307: istore_2       
        //  1308: aload           27
        //  1310: astore_1       
        //  1311: goto            879
        //  1314: aload           23
        //  1316: astore          27
        //  1318: aload           22
        //  1320: astore          26
        //  1322: iload_2        
        //  1323: istore          4
        //  1325: iload_3        
        //  1326: istore_2       
        //  1327: aload_1        
        //  1328: astore          23
        //  1330: iload           20
        //  1332: istore          21
        //  1334: aload           27
        //  1336: astore          22
        //  1338: iload           4
        //  1340: istore_3       
        //  1341: aload           26
        //  1343: astore_1       
        //  1344: goto            879
        //  1347: aload_0        
        //  1348: iconst_0       
        //  1349: putfield        y8m.j:Z
        //  1352: aload           22
        //  1354: astore          26
        //  1356: aload_1        
        //  1357: astore          22
        //  1359: goto            1388
        //  1362: aload_0        
        //  1363: iconst_0       
        //  1364: putfield        y8m.j:Z
        //  1367: aload_1        
        //  1368: athrow         
        //  1369: iload_2        
        //  1370: istore          4
        //  1372: iload_3        
        //  1373: istore_2       
        //  1374: iload           4
        //  1376: istore_3       
        //  1377: aload           23
        //  1379: astore          26
        //  1381: iload           20
        //  1383: istore          21
        //  1385: aload_1        
        //  1386: astore          23
        //  1388: aload           32
        //  1390: aload           29
        //  1392: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1395: astore          29
        //  1397: aload           23
        //  1399: astore_1       
        //  1400: iload           21
        //  1402: istore          20
        //  1404: lload           14
        //  1406: lstore          16
        //  1408: aload           26
        //  1410: astore          28
        //  1412: iload_3        
        //  1413: istore          4
        //  1415: iload_2        
        //  1416: istore          5
        //  1418: aload           22
        //  1420: astore          27
        //  1422: aload           29
        //  1424: ifnull          1711
        //  1427: aload           29
        //  1429: instanceof      Lumf;
        //  1432: ifeq            1679
        //  1435: aload           29
        //  1437: checkcast       Lumf;
        //  1440: astore_1       
        //  1441: aload_1        
        //  1442: getfield        umf.b:[Ljava/lang/Object;
        //  1445: astore          29
        //  1447: aload_1        
        //  1448: getfield        umf.a:[J
        //  1451: astore          31
        //  1453: aload           31
        //  1455: arraylength    
        //  1456: iconst_2       
        //  1457: isub           
        //  1458: istore          9
        //  1460: aload           23
        //  1462: astore_1       
        //  1463: iload           21
        //  1465: istore          20
        //  1467: lload           14
        //  1469: lstore          16
        //  1471: aload           26
        //  1473: astore          28
        //  1475: iload_3        
        //  1476: istore          4
        //  1478: iload_2        
        //  1479: istore          5
        //  1481: aload           22
        //  1483: astore          27
        //  1485: iload           9
        //  1487: iflt            1711
        //  1490: iconst_0       
        //  1491: istore          6
        //  1493: iload           21
        //  1495: istore          20
        //  1497: aload           31
        //  1499: iload           6
        //  1501: laload         
        //  1502: lstore          16
        //  1504: iload           20
        //  1506: istore          21
        //  1508: lload           16
        //  1510: ldc2_w          -1
        //  1513: lxor           
        //  1514: bipush          7
        //  1516: lshl           
        //  1517: lload           16
        //  1519: land           
        //  1520: ldc2_w          -9187201950435737472
        //  1523: land           
        //  1524: ldc2_w          -9187201950435737472
        //  1527: lcmp           
        //  1528: ifeq            1637
        //  1531: bipush          8
        //  1533: iload           6
        //  1535: iload           9
        //  1537: isub           
        //  1538: iconst_m1      
        //  1539: ixor           
        //  1540: bipush          31
        //  1542: iushr          
        //  1543: isub           
        //  1544: istore          10
        //  1546: iconst_0       
        //  1547: istore          4
        //  1549: iload           20
        //  1551: istore          21
        //  1553: iload           4
        //  1555: iload           10
        //  1557: if_icmpge       1605
        //  1560: lload           16
        //  1562: ldc2_w          255
        //  1565: land           
        //  1566: ldc2_w          128
        //  1569: lcmp           
        //  1570: ifge            1592
        //  1573: aload           33
        //  1575: aload           29
        //  1577: iload           6
        //  1579: iconst_3       
        //  1580: ishl           
        //  1581: iload           4
        //  1583: iadd           
        //  1584: aaload         
        //  1585: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //  1588: pop            
        //  1589: iconst_1       
        //  1590: istore          21
        //  1592: lload           16
        //  1594: bipush          8
        //  1596: lshr           
        //  1597: lstore          16
        //  1599: iinc            4, 1
        //  1602: goto            1553
        //  1605: aload           23
        //  1607: astore_1       
        //  1608: iload           21
        //  1610: istore          20
        //  1612: lload           14
        //  1614: lstore          16
        //  1616: aload           26
        //  1618: astore          28
        //  1620: iload_3        
        //  1621: istore          4
        //  1623: iload_2        
        //  1624: istore          5
        //  1626: aload           22
        //  1628: astore          27
        //  1630: iload           10
        //  1632: bipush          8
        //  1634: if_icmpne       1711
        //  1637: aload           23
        //  1639: astore_1       
        //  1640: iload           21
        //  1642: istore          20
        //  1644: lload           14
        //  1646: lstore          16
        //  1648: aload           26
        //  1650: astore          28
        //  1652: iload_3        
        //  1653: istore          4
        //  1655: iload_2        
        //  1656: istore          5
        //  1658: aload           22
        //  1660: astore          27
        //  1662: iload           6
        //  1664: iload           9
        //  1666: if_icmpeq       1711
        //  1669: iinc            6, 1
        //  1672: iload           21
        //  1674: istore          20
        //  1676: goto            1497
        //  1679: aload           33
        //  1681: aload           29
        //  1683: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //  1686: pop            
        //  1687: iconst_1       
        //  1688: istore          20
        //  1690: aload           22
        //  1692: astore          27
        //  1694: iload_2        
        //  1695: istore          5
        //  1697: iload_3        
        //  1698: istore          4
        //  1700: aload           26
        //  1702: astore          28
        //  1704: lload           14
        //  1706: lstore          16
        //  1708: aload           23
        //  1710: astore_1       
        //  1711: goto            1735
        //  1714: lload           14
        //  1716: lstore          16
        //  1718: aload           23
        //  1720: astore          28
        //  1722: iload_2        
        //  1723: istore          4
        //  1725: iload_3        
        //  1726: istore          5
        //  1728: aload           22
        //  1730: astore          27
        //  1732: goto            1711
        //  1735: iinc            8, 1
        //  1738: aload           28
        //  1740: astore          23
        //  1742: iload           4
        //  1744: istore_2       
        //  1745: iload           5
        //  1747: istore_3       
        //  1748: lload           16
        //  1750: bipush          8
        //  1752: lshr           
        //  1753: lstore          14
        //  1755: aload           27
        //  1757: astore          22
        //  1759: goto            135
        //  1762: aload_1        
        //  1763: astore          26
        //  1765: iload           20
        //  1767: istore          21
        //  1769: iload_3        
        //  1770: bipush          8
        //  1772: if_icmpne       1875
        //  1775: aload           22
        //  1777: astore_1       
        //  1778: aload           23
        //  1780: astore          22
        //  1782: aload           24
        //  1784: astore          23
        //  1786: aload           25
        //  1788: astore          24
        //  1790: aload           26
        //  1792: astore          25
        //  1794: goto            1834
        //  1797: aload           25
        //  1799: astore          27
        //  1801: aload           24
        //  1803: astore          28
        //  1805: aload           23
        //  1807: astore          26
        //  1809: aload           22
        //  1811: astore          29
        //  1813: aload_1        
        //  1814: astore          25
        //  1816: aload           27
        //  1818: astore          24
        //  1820: aload           28
        //  1822: astore          23
        //  1824: aload           26
        //  1826: astore          22
        //  1828: aload           29
        //  1830: astore_1       
        //  1831: goto            1794
        //  1834: iload           20
        //  1836: istore          21
        //  1838: iload           7
        //  1840: iload_2        
        //  1841: if_icmpeq       1875
        //  1844: iinc            7, 1
        //  1847: aload           25
        //  1849: astore          26
        //  1851: aload           24
        //  1853: astore          25
        //  1855: aload           23
        //  1857: astore          24
        //  1859: aload           22
        //  1861: astore          23
        //  1863: aload_1        
        //  1864: astore          22
        //  1866: aload           26
        //  1868: astore_1       
        //  1869: goto            89
        //  1872: iconst_0       
        //  1873: istore          21
        //  1875: goto            3081
        //  1878: aload_1        
        //  1879: checkcast       Ljava/lang/Iterable;
        //  1882: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1887: astore_1       
        //  1888: iconst_0       
        //  1889: istore          20
        //  1891: aload_1        
        //  1892: invokeinterface java/util/Iterator.hasNext:()Z
        //  1897: ifeq            3074
        //  1900: aload_1        
        //  1901: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1906: astore          23
        //  1908: aload           23
        //  1910: instanceof      Lkpm;
        //  1913: ifeq            1934
        //  1916: aload           23
        //  1918: checkcast       Lkpm;
        //  1921: iconst_2       
        //  1922: invokevirtual   kpm.e:(I)Z
        //  1925: ifne            1934
        //  1928: aload_1        
        //  1929: astore          23
        //  1931: goto            3068
        //  1934: aload           22
        //  1936: astore          24
        //  1938: aload_0        
        //  1939: getfield        y8m.j:Z
        //  1942: ifne            2848
        //  1945: aload           22
        //  1947: aload           23
        //  1949: invokevirtual   tmf.c:(Ljava/lang/Object;)Z
        //  1952: ifeq            2844
        //  1955: aload_0        
        //  1956: iconst_1       
        //  1957: putfield        y8m.j:Z
        //  1960: aload           22
        //  1962: aload           23
        //  1964: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1967: astore          25
        //  1969: aload           25
        //  1971: ifnull          2809
        //  1974: aload           25
        //  1976: instanceof      Lumf;
        //  1979: ifeq            2509
        //  1982: aload           25
        //  1984: checkcast       Lumf;
        //  1987: astore          25
        //  1989: aload           25
        //  1991: getfield        umf.b:[Ljava/lang/Object;
        //  1994: astore          24
        //  1996: aload           25
        //  1998: getfield        umf.a:[J
        //  2001: astore          29
        //  2003: aload           29
        //  2005: arraylength    
        //  2006: iconst_2       
        //  2007: isub           
        //  2008: istore          6
        //  2010: iload           6
        //  2012: iflt            2809
        //  2015: iconst_0       
        //  2016: istore_2       
        //  2017: aload           23
        //  2019: astore          25
        //  2021: aload_1        
        //  2022: astore          23
        //  2024: aload           29
        //  2026: iload_2        
        //  2027: laload         
        //  2028: lstore          14
        //  2030: lload           14
        //  2032: ldc2_w          -1
        //  2035: lxor           
        //  2036: bipush          7
        //  2038: lshl           
        //  2039: lload           14
        //  2041: land           
        //  2042: ldc2_w          -9187201950435737472
        //  2045: land           
        //  2046: ldc2_w          -9187201950435737472
        //  2049: lcmp           
        //  2050: ifeq            2457
        //  2053: bipush          8
        //  2055: iload_2        
        //  2056: iload           6
        //  2058: isub           
        //  2059: iconst_m1      
        //  2060: ixor           
        //  2061: bipush          31
        //  2063: iushr          
        //  2064: isub           
        //  2065: istore          7
        //  2067: iconst_0       
        //  2068: istore_3       
        //  2069: aload           24
        //  2071: astore          27
        //  2073: aload           22
        //  2075: astore          24
        //  2077: aload           25
        //  2079: astore_1       
        //  2080: iload_3        
        //  2081: iload           7
        //  2083: if_icmpge       2404
        //  2086: lload           14
        //  2088: ldc2_w          255
        //  2091: land           
        //  2092: ldc2_w          128
        //  2095: lcmp           
        //  2096: ifge            2388
        //  2099: aload           27
        //  2101: iload_2        
        //  2102: iconst_3       
        //  2103: ishl           
        //  2104: iload_3        
        //  2105: iadd           
        //  2106: aaload         
        //  2107: checkcast       Lsd8;
        //  2110: astore          28
        //  2112: aload           28
        //  2114: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2117: pop            
        //  2118: aload           31
        //  2120: aload           28
        //  2122: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2125: astore          34
        //  2127: aload           28
        //  2129: getfield        sd8.x:Lq8m;
        //  2132: astore          25
        //  2134: aload           25
        //  2136: astore          22
        //  2138: aload           25
        //  2140: ifnonnull       2147
        //  2143: aload           26
        //  2145: astore          22
        //  2147: aload           22
        //  2149: aload           28
        //  2151: invokevirtual   sd8.i:()Lrd8;
        //  2154: getfield        rd8.f:Ljava/lang/Object;
        //  2157: aload           34
        //  2159: invokeinterface q8m.n:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2164: ifne            2378
        //  2167: aload           32
        //  2169: aload           28
        //  2171: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2174: astore          22
        //  2176: aload           22
        //  2178: ifnull          2375
        //  2181: aload           22
        //  2183: instanceof      Lumf;
        //  2186: ifeq            2361
        //  2189: aload           22
        //  2191: checkcast       Lumf;
        //  2194: astore          22
        //  2196: aload           22
        //  2198: getfield        umf.b:[Ljava/lang/Object;
        //  2201: astore          25
        //  2203: aload           22
        //  2205: getfield        umf.a:[J
        //  2208: astore          22
        //  2210: aload           22
        //  2212: arraylength    
        //  2213: iconst_2       
        //  2214: isub           
        //  2215: istore          8
        //  2217: iload           8
        //  2219: iflt            2375
        //  2222: iconst_0       
        //  2223: istore          4
        //  2225: aload           22
        //  2227: iload           4
        //  2229: laload         
        //  2230: lstore          16
        //  2232: lload           16
        //  2234: ldc2_w          -1
        //  2237: lxor           
        //  2238: bipush          7
        //  2240: lshl           
        //  2241: lload           16
        //  2243: land           
        //  2244: ldc2_w          -9187201950435737472
        //  2247: land           
        //  2248: ldc2_w          -9187201950435737472
        //  2251: lcmp           
        //  2252: ifeq            2345
        //  2255: bipush          8
        //  2257: iload           4
        //  2259: iload           8
        //  2261: isub           
        //  2262: iconst_m1      
        //  2263: ixor           
        //  2264: bipush          31
        //  2266: iushr          
        //  2267: isub           
        //  2268: istore          9
        //  2270: iconst_0       
        //  2271: istore          5
        //  2273: iload           5
        //  2275: iload           9
        //  2277: if_icmpge       2332
        //  2280: lload           16
        //  2282: ldc2_w          255
        //  2285: land           
        //  2286: ldc2_w          128
        //  2289: lcmp           
        //  2290: ifge            2312
        //  2293: aload           33
        //  2295: aload           25
        //  2297: iload           4
        //  2299: iconst_3       
        //  2300: ishl           
        //  2301: iload           5
        //  2303: iadd           
        //  2304: aaload         
        //  2305: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //  2308: pop            
        //  2309: iconst_1       
        //  2310: istore          20
        //  2312: goto            2319
        //  2315: astore_1       
        //  2316: goto            2837
        //  2319: lload           16
        //  2321: bipush          8
        //  2323: lshr           
        //  2324: lstore          16
        //  2326: iinc            5, 1
        //  2329: goto            2273
        //  2332: iload           9
        //  2334: bipush          8
        //  2336: if_icmpne       2342
        //  2339: goto            2345
        //  2342: goto            2375
        //  2345: iload           4
        //  2347: iload           8
        //  2349: if_icmpeq       2358
        //  2352: iinc            4, 1
        //  2355: goto            2225
        //  2358: goto            2375
        //  2361: aload           33
        //  2363: aload           22
        //  2365: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //  2368: pop            
        //  2369: iconst_1       
        //  2370: istore          20
        //  2372: goto            2375
        //  2375: goto            2385
        //  2378: aload           30
        //  2380: aload           28
        //  2382: invokevirtual   inf.b:(Ljava/lang/Object;)V
        //  2385: goto            2391
        //  2388: goto            2385
        //  2391: iinc            3, 1
        //  2394: lload           14
        //  2396: bipush          8
        //  2398: lshr           
        //  2399: lstore          14
        //  2401: goto            2080
        //  2404: aload_1        
        //  2405: astore          22
        //  2407: aload           24
        //  2409: astore_1       
        //  2410: aload           27
        //  2412: astore          25
        //  2414: iload           20
        //  2416: istore          21
        //  2418: aload           22
        //  2420: astore          28
        //  2422: aload_1        
        //  2423: astore          27
        //  2425: aload           23
        //  2427: astore          24
        //  2429: iload           7
        //  2431: bipush          8
        //  2433: if_icmpne       2439
        //  2436: goto            2468
        //  2439: iload           21
        //  2441: istore          20
        //  2443: aload           28
        //  2445: astore_1       
        //  2446: aload           27
        //  2448: astore          22
        //  2450: aload           24
        //  2452: astore          23
        //  2454: goto            2506
        //  2457: aload           22
        //  2459: astore_1       
        //  2460: aload           25
        //  2462: astore          22
        //  2464: aload           24
        //  2466: astore          25
        //  2468: iload           20
        //  2470: istore          21
        //  2472: aload           22
        //  2474: astore          28
        //  2476: aload_1        
        //  2477: astore          27
        //  2479: aload           23
        //  2481: astore          24
        //  2483: iload_2        
        //  2484: iload           6
        //  2486: if_icmpeq       2439
        //  2489: iinc            2, 1
        //  2492: aload           25
        //  2494: astore          24
        //  2496: aload           22
        //  2498: astore          25
        //  2500: aload_1        
        //  2501: astore          22
        //  2503: goto            2024
        //  2506: goto            2822
        //  2509: aload_1        
        //  2510: astore          24
        //  2512: aload           23
        //  2514: astore_1       
        //  2515: aload           25
        //  2517: checkcast       Lsd8;
        //  2520: astore          28
        //  2522: aload           31
        //  2524: aload           28
        //  2526: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2529: astore          27
        //  2531: aload           28
        //  2533: getfield        sd8.x:Lq8m;
        //  2536: astore          25
        //  2538: aload           25
        //  2540: astore          23
        //  2542: aload           25
        //  2544: ifnonnull       2551
        //  2547: aload           26
        //  2549: astore          23
        //  2551: aload           23
        //  2553: aload           28
        //  2555: invokevirtual   sd8.i:()Lrd8;
        //  2558: getfield        rd8.f:Ljava/lang/Object;
        //  2561: aload           27
        //  2563: invokeinterface q8m.n:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2568: ifne            2795
        //  2571: aload           32
        //  2573: aload           28
        //  2575: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2578: astore          23
        //  2580: iload           20
        //  2582: istore          21
        //  2584: aload           23
        //  2586: ifnull          2784
        //  2589: aload           23
        //  2591: instanceof      Lumf;
        //  2594: ifeq            2770
        //  2597: aload           23
        //  2599: checkcast       Lumf;
        //  2602: astore          25
        //  2604: aload           25
        //  2606: getfield        umf.b:[Ljava/lang/Object;
        //  2609: astore          23
        //  2611: aload           25
        //  2613: getfield        umf.a:[J
        //  2616: astore          25
        //  2618: aload           25
        //  2620: arraylength    
        //  2621: iconst_2       
        //  2622: isub           
        //  2623: istore          4
        //  2625: iload           20
        //  2627: istore          21
        //  2629: iload           4
        //  2631: iflt            2784
        //  2634: iconst_0       
        //  2635: istore_2       
        //  2636: aload           25
        //  2638: iload_2        
        //  2639: laload         
        //  2640: lstore          14
        //  2642: iload           20
        //  2644: istore          21
        //  2646: lload           14
        //  2648: ldc2_w          -1
        //  2651: lxor           
        //  2652: bipush          7
        //  2654: lshl           
        //  2655: lload           14
        //  2657: land           
        //  2658: ldc2_w          -9187201950435737472
        //  2661: land           
        //  2662: ldc2_w          -9187201950435737472
        //  2665: lcmp           
        //  2666: ifeq            2751
        //  2669: bipush          8
        //  2671: iload_2        
        //  2672: iload           4
        //  2674: isub           
        //  2675: iconst_m1      
        //  2676: ixor           
        //  2677: bipush          31
        //  2679: iushr          
        //  2680: isub           
        //  2681: istore          5
        //  2683: iconst_0       
        //  2684: istore_3       
        //  2685: iload_3        
        //  2686: iload           5
        //  2688: if_icmpge       2734
        //  2691: lload           14
        //  2693: ldc2_w          255
        //  2696: land           
        //  2697: ldc2_w          128
        //  2700: lcmp           
        //  2701: ifge            2721
        //  2704: aload           33
        //  2706: aload           23
        //  2708: iload_2        
        //  2709: iconst_3       
        //  2710: ishl           
        //  2711: iload_3        
        //  2712: iadd           
        //  2713: aaload         
        //  2714: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //  2717: pop            
        //  2718: iconst_1       
        //  2719: istore          20
        //  2721: lload           14
        //  2723: bipush          8
        //  2725: lshr           
        //  2726: lstore          14
        //  2728: iinc            3, 1
        //  2731: goto            2685
        //  2734: iload           5
        //  2736: bipush          8
        //  2738: if_icmpne       2748
        //  2741: iload           20
        //  2743: istore          21
        //  2745: goto            2751
        //  2748: goto            2788
        //  2751: iload_2        
        //  2752: iload           4
        //  2754: if_icmpeq       2767
        //  2757: iinc            2, 1
        //  2760: iload           21
        //  2762: istore          20
        //  2764: goto            2636
        //  2767: goto            2784
        //  2770: aload           33
        //  2772: aload           23
        //  2774: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //  2777: pop            
        //  2778: iconst_1       
        //  2779: istore          20
        //  2781: goto            2788
        //  2784: iload           21
        //  2786: istore          20
        //  2788: aload           24
        //  2790: astore          23
        //  2792: goto            2506
        //  2795: aload           30
        //  2797: aload           28
        //  2799: invokevirtual   inf.b:(Ljava/lang/Object;)V
        //  2802: aload           24
        //  2804: astore          23
        //  2806: goto            2506
        //  2809: aload_1        
        //  2810: astore          24
        //  2812: aload           23
        //  2814: astore_1       
        //  2815: aload           24
        //  2817: astore          23
        //  2819: goto            2506
        //  2822: aload_0        
        //  2823: iconst_0       
        //  2824: putfield        y8m.j:Z
        //  2827: aload_1        
        //  2828: astore          25
        //  2830: iload           20
        //  2832: istore          21
        //  2834: goto            2862
        //  2837: aload_0        
        //  2838: iconst_0       
        //  2839: putfield        y8m.j:Z
        //  2842: aload_1        
        //  2843: athrow         
        //  2844: aload           22
        //  2846: astore          24
        //  2848: aload           23
        //  2850: astore          25
        //  2852: aload           24
        //  2854: astore          22
        //  2856: aload_1        
        //  2857: astore          23
        //  2859: goto            2830
        //  2862: aload           32
        //  2864: aload           25
        //  2866: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2869: astore_1       
        //  2870: iload           21
        //  2872: istore          20
        //  2874: aload_1        
        //  2875: ifnull          3068
        //  2878: aload_1        
        //  2879: instanceof      Lumf;
        //  2882: ifeq            3058
        //  2885: aload_1        
        //  2886: checkcast       Lumf;
        //  2889: astore          24
        //  2891: aload           24
        //  2893: getfield        umf.b:[Ljava/lang/Object;
        //  2896: astore_1       
        //  2897: aload           24
        //  2899: getfield        umf.a:[J
        //  2902: astore          24
        //  2904: aload           24
        //  2906: arraylength    
        //  2907: iconst_2       
        //  2908: isub           
        //  2909: istore          4
        //  2911: iload           21
        //  2913: istore          20
        //  2915: iload           4
        //  2917: iflt            3068
        //  2920: iconst_0       
        //  2921: istore_2       
        //  2922: iload           21
        //  2924: istore          20
        //  2926: aload           24
        //  2928: iload_2        
        //  2929: laload         
        //  2930: lstore          14
        //  2932: iload           20
        //  2934: istore          21
        //  2936: lload           14
        //  2938: ldc2_w          -1
        //  2941: lxor           
        //  2942: bipush          7
        //  2944: lshl           
        //  2945: lload           14
        //  2947: land           
        //  2948: ldc2_w          -9187201950435737472
        //  2951: land           
        //  2952: ldc2_w          -9187201950435737472
        //  2955: lcmp           
        //  2956: ifeq            3038
        //  2959: bipush          8
        //  2961: iload_2        
        //  2962: iload           4
        //  2964: isub           
        //  2965: iconst_m1      
        //  2966: ixor           
        //  2967: bipush          31
        //  2969: iushr          
        //  2970: isub           
        //  2971: istore          5
        //  2973: iconst_0       
        //  2974: istore_3       
        //  2975: iload           20
        //  2977: istore          21
        //  2979: iload_3        
        //  2980: iload           5
        //  2982: if_icmpge       3027
        //  2985: lload           14
        //  2987: ldc2_w          255
        //  2990: land           
        //  2991: ldc2_w          128
        //  2994: lcmp           
        //  2995: ifge            3014
        //  2998: aload           33
        //  3000: aload_1        
        //  3001: iload_2        
        //  3002: iconst_3       
        //  3003: ishl           
        //  3004: iload_3        
        //  3005: iadd           
        //  3006: aaload         
        //  3007: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //  3010: pop            
        //  3011: iconst_1       
        //  3012: istore          21
        //  3014: lload           14
        //  3016: bipush          8
        //  3018: lshr           
        //  3019: lstore          14
        //  3021: iinc            3, 1
        //  3024: goto            2979
        //  3027: iload           21
        //  3029: istore          20
        //  3031: iload           5
        //  3033: bipush          8
        //  3035: if_icmpne       3068
        //  3038: iload           21
        //  3040: istore          20
        //  3042: iload_2        
        //  3043: iload           4
        //  3045: if_icmpeq       3068
        //  3048: iinc            2, 1
        //  3051: iload           21
        //  3053: istore          20
        //  3055: goto            2926
        //  3058: aload           33
        //  3060: aload_1        
        //  3061: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //  3064: pop            
        //  3065: iconst_1       
        //  3066: istore          20
        //  3068: aload           23
        //  3070: astore_1       
        //  3071: goto            1891
        //  3074: iload           20
        //  3076: istore          21
        //  3078: goto            1875
        //  3081: aload_0        
        //  3082: getfield        y8m.j:Z
        //  3085: ifne            3551
        //  3088: aload           30
        //  3090: getfield        inf.x:I
        //  3093: istore_3       
        //  3094: iload_3        
        //  3095: ifeq            3551
        //  3098: aload           30
        //  3100: getfield        inf.v:[Ljava/lang/Object;
        //  3103: astore          22
        //  3105: iconst_0       
        //  3106: istore_2       
        //  3107: aload           30
        //  3109: astore_1       
        //  3110: iload_2        
        //  3111: iload_3        
        //  3112: if_icmpge       3547
        //  3115: aload           22
        //  3117: iload_2        
        //  3118: aaload         
        //  3119: checkcast       Lsd8;
        //  3122: astore          24
        //  3124: invokestatic    g8m.h:()Lr7m;
        //  3127: invokevirtual   r7m.g:()J
        //  3130: invokestatic    java/lang/Long.hashCode:(J)I
        //  3133: istore          7
        //  3135: aload           32
        //  3137: aload           24
        //  3139: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3142: astore          26
        //  3144: aload           26
        //  3146: ifnull          3526
        //  3149: aload           26
        //  3151: instanceof      Lumf;
        //  3154: istore          20
        //  3156: aload_0        
        //  3157: getfield        y8m.f:Ltmf;
        //  3160: astore          27
        //  3162: iload           20
        //  3164: ifeq            3464
        //  3167: aload           26
        //  3169: checkcast       Lumf;
        //  3172: astore          23
        //  3174: aload           23
        //  3176: getfield        umf.b:[Ljava/lang/Object;
        //  3179: astore          28
        //  3181: aload           23
        //  3183: getfield        umf.a:[J
        //  3186: astore          29
        //  3188: aload           29
        //  3190: arraylength    
        //  3191: iconst_2       
        //  3192: isub           
        //  3193: istore          8
        //  3195: iload           8
        //  3197: iflt            3453
        //  3200: iconst_0       
        //  3201: istore          6
        //  3203: aload           24
        //  3205: astore          23
        //  3207: aload           29
        //  3209: iload           6
        //  3211: laload         
        //  3212: lstore          14
        //  3214: aload           22
        //  3216: astore          24
        //  3218: iload_2        
        //  3219: istore          5
        //  3221: lload           14
        //  3223: ldc2_w          -1
        //  3226: lxor           
        //  3227: bipush          7
        //  3229: lshl           
        //  3230: lload           14
        //  3232: land           
        //  3233: ldc2_w          -9187201950435737472
        //  3236: land           
        //  3237: ldc2_w          -9187201950435737472
        //  3240: lcmp           
        //  3241: ifeq            3400
        //  3244: bipush          8
        //  3246: iload           6
        //  3248: iload           8
        //  3250: isub           
        //  3251: iconst_m1      
        //  3252: ixor           
        //  3253: bipush          31
        //  3255: iushr          
        //  3256: isub           
        //  3257: istore          9
        //  3259: iconst_0       
        //  3260: istore_2       
        //  3261: iload_2        
        //  3262: iload           9
        //  3264: if_icmpge       3363
        //  3267: lload           14
        //  3269: ldc2_w          255
        //  3272: land           
        //  3273: ldc2_w          128
        //  3276: lcmp           
        //  3277: ifge            3347
        //  3280: aload           28
        //  3282: iload           6
        //  3284: iconst_3       
        //  3285: ishl           
        //  3286: iload_2        
        //  3287: iadd           
        //  3288: aaload         
        //  3289: astore          25
        //  3291: aload           27
        //  3293: aload           25
        //  3295: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3298: checkcast       Lamf;
        //  3301: astore          22
        //  3303: aload           22
        //  3305: ifnonnull       3329
        //  3308: new             Lamf;
        //  3311: dup            
        //  3312: invokespecial   amf.<init>:()V
        //  3315: astore          22
        //  3317: aload           27
        //  3319: aload           25
        //  3321: aload           22
        //  3323: invokevirtual   tmf.m:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  3326: goto            3332
        //  3329: goto            3326
        //  3332: aload_0        
        //  3333: aload           23
        //  3335: iload           7
        //  3337: aload           25
        //  3339: aload           22
        //  3341: invokevirtual   y8m.b:(Ljava/lang/Object;ILjava/lang/Object;Lamf;)V
        //  3344: goto            3350
        //  3347: goto            3344
        //  3350: lload           14
        //  3352: bipush          8
        //  3354: lshr           
        //  3355: lstore          14
        //  3357: iinc            2, 1
        //  3360: goto            3261
        //  3363: iload_3        
        //  3364: istore          4
        //  3366: aload_1        
        //  3367: astore          25
        //  3369: aload           24
        //  3371: astore          22
        //  3373: iload           5
        //  3375: istore_3       
        //  3376: aload           25
        //  3378: astore_1       
        //  3379: iload           4
        //  3381: istore_2       
        //  3382: iload           9
        //  3384: bipush          8
        //  3386: if_icmpne       3534
        //  3389: aload           23
        //  3391: astore          26
        //  3393: aload           25
        //  3395: astore          23
        //  3397: goto            3410
        //  3400: aload           23
        //  3402: astore          26
        //  3404: iload_3        
        //  3405: istore          4
        //  3407: aload_1        
        //  3408: astore          23
        //  3410: aload           24
        //  3412: astore          22
        //  3414: iload           5
        //  3416: istore_3       
        //  3417: aload           23
        //  3419: astore_1       
        //  3420: iload           4
        //  3422: istore_2       
        //  3423: iload           6
        //  3425: iload           8
        //  3427: if_icmpeq       3534
        //  3430: iinc            6, 1
        //  3433: aload           24
        //  3435: astore          22
        //  3437: iload           5
        //  3439: istore_2       
        //  3440: aload           23
        //  3442: astore_1       
        //  3443: iload           4
        //  3445: istore_3       
        //  3446: aload           26
        //  3448: astore          23
        //  3450: goto            3207
        //  3453: iload_3        
        //  3454: istore          4
        //  3456: iload_2        
        //  3457: istore_3       
        //  3458: iload           4
        //  3460: istore_2       
        //  3461: goto            3534
        //  3464: iload_3        
        //  3465: istore          4
        //  3467: aload           27
        //  3469: aload           26
        //  3471: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3474: checkcast       Lamf;
        //  3477: astore          25
        //  3479: aload           25
        //  3481: astore          23
        //  3483: aload           25
        //  3485: ifnonnull       3506
        //  3488: new             Lamf;
        //  3491: dup            
        //  3492: invokespecial   amf.<init>:()V
        //  3495: astore          23
        //  3497: aload           27
        //  3499: aload           26
        //  3501: aload           23
        //  3503: invokevirtual   tmf.m:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  3506: aload_0        
        //  3507: aload           24
        //  3509: iload           7
        //  3511: aload           26
        //  3513: aload           23
        //  3515: invokevirtual   y8m.b:(Ljava/lang/Object;ILjava/lang/Object;Lamf;)V
        //  3518: iload_2        
        //  3519: istore_3       
        //  3520: iload           4
        //  3522: istore_2       
        //  3523: goto            3534
        //  3526: iload_2        
        //  3527: istore          4
        //  3529: iload_3        
        //  3530: istore_2       
        //  3531: iload           4
        //  3533: istore_3       
        //  3534: iload_3        
        //  3535: iconst_1       
        //  3536: iadd           
        //  3537: istore          4
        //  3539: iload_2        
        //  3540: istore_3       
        //  3541: iload           4
        //  3543: istore_2       
        //  3544: goto            3110
        //  3547: aload_1        
        //  3548: invokevirtual   inf.h:()V
        //  3551: iload           21
        //  3553: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  211    220    567    571    Any
        //  225    261    567    571    Any
        //  337    373    567    571    Any
        //  386    415    567    571    Any
        //  420    456    567    571    Any
        //  545    561    567    571    Any
        //  670    678    567    571    Any
        //  691    698    567    571    Any
        //  900    907    567    571    Any
        //  910    926    567    571    Any
        //  937    965    567    571    Any
        //  995    1028   567    571    Any
        //  1139   1154   567    571    Any
        //  1244   1252   567    571    Any
        //  1279   1286   567    571    Any
        //  1960   1969   2315   2319   Any
        //  1974   2010   2315   2319   Any
        //  2099   2134   2315   2319   Any
        //  2147   2176   2315   2319   Any
        //  2181   2217   2315   2319   Any
        //  2293   2309   2315   2319   Any
        //  2361   2369   2315   2319   Any
        //  2378   2385   2315   2319   Any
        //  2515   2538   2315   2319   Any
        //  2551   2580   2315   2319   Any
        //  2589   2625   2315   2319   Any
        //  2704   2718   2315   2319   Any
        //  2770   2778   2315   2319   Any
        //  2795   2802   2315   2319   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Attempt to invoke virtual method 'g5.m0 g5.d2.L()' on a null object reference
        //     at e5.d0.e(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:26)
        //     at e5.c0.s(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:1643)
        //     at q5.g.o(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2651)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2099)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1100)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        //     at java.lang.Thread.run(Thread.java:1572)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void b(final Object o, int n, final Object o2, final amf amf) {
        if (this.k <= 0) {
            int c = amf.c(o);
            int n2;
            if (c < 0) {
                c ^= -1;
                n2 = -1;
            }
            else {
                n2 = amf.c[c];
            }
            amf.b[c] = o;
            amf.c[c] = n;
            if (o instanceof sd8 && n2 != n) {
                final rd8 i = ((sd8)o).i();
                this.m.put(o, i.f);
                final amf e = i.e;
                final tmf l = this.l;
                rhc.V(l, o);
                final Object[] b = e.b;
                final long[] a = e.a;
                final int n3 = a.length - 2;
                if (n3 >= 0) {
                    n = 0;
                    while (true) {
                        long n4 = a[n];
                        if ((~n4 << 7 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n5 = 8 - (~(n - n3) >>> 31);
                            for (int j = 0; j < n5; ++j) {
                                if ((n4 & 0xFFL) < 128L) {
                                    final jpm jpm = (jpm)b[(n << 3) + j];
                                    if (jpm instanceof kpm) {
                                        ((kpm)jpm).g(2);
                                    }
                                    rhc.d(l, (Object)jpm, o);
                                }
                                n4 >>= 8;
                            }
                            if (n5 != 8) {
                                break;
                            }
                        }
                        if (n == n3) {
                            break;
                        }
                        ++n;
                    }
                }
            }
            if (n2 == -1) {
                if (o instanceof kpm) {
                    ((kpm)o).g(2);
                }
                rhc.d(this.e, o, o2);
            }
        }
    }
    
    public final void c(final Object o, final Object o2) {
        final tmf e = this.e;
        rhc.U(e, o2, o);
        if (o2 instanceof sd8 && !e.c(o2)) {
            rhc.V(this.l, o2);
            this.m.remove(o2);
        }
    }
    
    public final void d(final kmg kmg) {
        final tmf f = this.f;
        final long[] a = f.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                final int n4 = 7;
                final long n5 = -9187201950435737472L;
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int n6 = 8;
                    final int n7 = 8 - (~(n2 - n) >>> 31);
                    int n17;
                    for (int i = 0; i < n7; i = n17) {
                        if ((n3 & 0xFFL) < 128L) {
                            final int n8 = (n2 << 3) + i;
                            final Object o = f.b[n8];
                            final amf amf = (amf)f.c[n8];
                            final Boolean b = (Boolean)kmg.b(o);
                            if (b) {
                                final Object[] b2 = amf.b;
                                final int[] c = amf.c;
                                final long[] a2 = amf.a;
                                final int n9 = a2.length - 2;
                                if (n9 >= 0) {
                                    final int n10 = 0;
                                    int n11 = n6;
                                    int n12 = n10;
                                    while (true) {
                                        long n13 = a2[n12];
                                        if ((~n13 << n4 & n13 & n5) != n5) {
                                            final int n14 = 8 - (~(n12 - n9) >>> 31);
                                            for (int j = 0; j < n14; ++j) {
                                                if ((n13 & 0xFFL) < 128L) {
                                                    final int n15 = (n12 << 3) + j;
                                                    final Object o2 = b2[n15];
                                                    final int n16 = c[n15];
                                                    this.c(o, o2);
                                                }
                                                n13 >>= n11;
                                            }
                                            if (n14 != n11) {
                                                break;
                                            }
                                        }
                                        if (n12 == n9) {
                                            break;
                                        }
                                        ++n12;
                                        n11 = 8;
                                    }
                                }
                            }
                            if (b) {
                                f.l(n8);
                            }
                            n6 = 8;
                        }
                        n17 = i + 1;
                        final int n18 = n6;
                        n3 >>= n6;
                        n6 = n18;
                    }
                    if (n7 != n6) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
    }
}
