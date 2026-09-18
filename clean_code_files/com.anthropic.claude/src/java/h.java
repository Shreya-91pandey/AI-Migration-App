public final class h implements Runnable
{
    public final byte v;
    public final Object w;
    
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        h.v:B
        //     4: tableswitch {
        //                0: 1428
        //                1: 1336
        //                2: 1323
        //                3: 1256
        //                4: 882
        //                5: 443
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: getfield        h.w:Ljava/lang/Object;
        //    48: checkcast       Lwcn;
        //    51: astore          12
        //    53: aload           12
        //    55: dup            
        //    56: astore          21
        //    58: monitorenter   
        //    59: aload           12
        //    61: aload           12
        //    63: getfield        wcn.g:I
        //    66: iconst_1       
        //    67: iadd           
        //    68: putfield        wcn.g:I
        //    71: aload           12
        //    73: invokevirtual   wcn.b:()Llcn;
        //    76: astore          11
        //    78: aload           21
        //    80: monitorexit    
        //    81: aload           11
        //    83: ifnonnull       89
        //    86: goto            408
        //    89: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    92: astore          14
        //    94: aload           14
        //    96: invokevirtual   java/lang/Thread.getName:()Ljava/lang/String;
        //    99: astore          13
        //   101: aload           14
        //   103: aload           11
        //   105: getfield        lcn.a:Ljava/lang/String;
        //   108: invokevirtual   java/lang/Thread.setName:(Ljava/lang/String;)V
        //   111: aload_0        
        //   112: getfield        h.w:Ljava/lang/Object;
        //   115: checkcast       Lwcn;
        //   118: getfield        wcn.b:Ljava/util/logging/Logger;
        //   121: astore          15
        //   123: aload           11
        //   125: getfield        lcn.c:Lvcn;
        //   128: astore          12
        //   130: aload           12
        //   132: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   135: pop            
        //   136: aload           15
        //   138: getstatic       java/util/logging/Level.FINE:Ljava/util/logging/Level;
        //   141: invokevirtual   java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
        //   144: istore          10
        //   146: iload           10
        //   148: ifeq            174
        //   151: invokestatic    java/lang/System.nanoTime:()J
        //   154: lstore_2       
        //   155: aload           15
        //   157: aload           11
        //   159: aload           12
        //   161: ldc             "starting"
        //   163: invokestatic    rbr.e:(Ljava/util/logging/Logger;Llcn;Lvcn;Ljava/lang/String;)V
        //   166: goto            178
        //   169: astore          15
        //   171: goto            362
        //   174: ldc2_w          -1
        //   177: lstore_2       
        //   178: aload           11
        //   180: invokevirtual   lcn.a:()J
        //   183: lstore          4
        //   185: iload           10
        //   187: ifeq            240
        //   190: invokestatic    java/lang/System.nanoTime:()J
        //   193: lstore          6
        //   195: new             Ljava/lang/StringBuilder;
        //   198: astore          16
        //   200: aload           16
        //   202: invokespecial   java/lang/StringBuilder.<init>:()V
        //   205: aload           16
        //   207: ldc             "finished run in "
        //   209: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   212: pop            
        //   213: aload           16
        //   215: lload           6
        //   217: lload_2        
        //   218: lsub           
        //   219: invokestatic    rbr.f:(J)Ljava/lang/String;
        //   222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   225: pop            
        //   226: aload           15
        //   228: aload           11
        //   230: aload           12
        //   232: aload           16
        //   234: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   237: invokestatic    rbr.e:(Ljava/util/logging/Logger;Llcn;Lvcn;Ljava/lang/String;)V
        //   240: aload_0        
        //   241: getfield        h.w:Ljava/lang/Object;
        //   244: checkcast       Lwcn;
        //   247: astore          15
        //   249: aload           15
        //   251: dup            
        //   252: astore          22
        //   254: monitorenter   
        //   255: aload           15
        //   257: aload           11
        //   259: lload           4
        //   261: iconst_1       
        //   262: invokevirtual   wcn.a:(Llcn;JZ)V
        //   265: aload           15
        //   267: invokevirtual   wcn.b:()Llcn;
        //   270: astore          12
        //   272: aload           22
        //   274: monitorexit    
        //   275: aload           12
        //   277: astore          11
        //   279: aload           12
        //   281: ifnonnull       101
        //   284: aload           14
        //   286: aload           13
        //   288: invokevirtual   java/lang/Thread.setName:(Ljava/lang/String;)V
        //   291: goto            408
        //   294: astore          12
        //   296: aload           22
        //   298: monitorexit    
        //   299: aload           12
        //   301: athrow         
        //   302: astore          17
        //   304: iload           10
        //   306: ifeq            359
        //   309: invokestatic    java/lang/System.nanoTime:()J
        //   312: lstore          4
        //   314: new             Ljava/lang/StringBuilder;
        //   317: astore          16
        //   319: aload           16
        //   321: invokespecial   java/lang/StringBuilder.<init>:()V
        //   324: aload           16
        //   326: ldc             "failed a run in "
        //   328: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   331: pop            
        //   332: aload           16
        //   334: lload           4
        //   336: lload_2        
        //   337: lsub           
        //   338: invokestatic    rbr.f:(J)Ljava/lang/String;
        //   341: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   344: pop            
        //   345: aload           15
        //   347: aload           11
        //   349: aload           12
        //   351: aload           16
        //   353: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   356: invokestatic    rbr.e:(Ljava/util/logging/Logger;Llcn;Lvcn;Ljava/lang/String;)V
        //   359: aload           17
        //   361: athrow         
        //   362: aload_0        
        //   363: getfield        h.w:Ljava/lang/Object;
        //   366: checkcast       Lwcn;
        //   369: astore          12
        //   371: aload           12
        //   373: dup            
        //   374: astore          21
        //   376: monitorenter   
        //   377: aload           12
        //   379: aload           11
        //   381: ldc2_w          -1
        //   384: iconst_0       
        //   385: invokevirtual   wcn.a:(Llcn;JZ)V
        //   388: aload           21
        //   390: monitorexit    
        //   391: aload           15
        //   393: instanceof      Ljava/lang/InterruptedException;
        //   396: ifeq            414
        //   399: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   402: invokevirtual   java/lang/Thread.interrupt:()V
        //   405: goto            284
        //   408: return         
        //   409: astore          11
        //   411: goto            425
        //   414: aload           15
        //   416: athrow         
        //   417: astore          11
        //   419: aload           21
        //   421: monitorexit    
        //   422: aload           11
        //   424: athrow         
        //   425: aload           14
        //   427: aload           13
        //   429: invokevirtual   java/lang/Thread.setName:(Ljava/lang/String;)V
        //   432: aload           11
        //   434: athrow         
        //   435: astore          11
        //   437: aload           21
        //   439: monitorexit    
        //   440: aload           11
        //   442: athrow         
        //   443: aload_0        
        //   444: getfield        h.w:Ljava/lang/Object;
        //   447: checkcast       Lj9m;
        //   450: astore          14
        //   452: aload           14
        //   454: invokevirtual   j9m.a:()V
        //   457: aload           14
        //   459: getfield        j9m.g:Ljava/util/List;
        //   462: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   467: astore          15
        //   469: aload           15
        //   471: invokeinterface java/util/Iterator.hasNext:()Z
        //   476: ifeq            881
        //   479: aload           15
        //   481: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   486: checkcast       Ljava/lang/String;
        //   489: astore          16
        //   491: aload           14
        //   493: getfield        j9m.k:J
        //   496: lstore_2       
        //   497: aload           14
        //   499: getfield        j9m.b:Ljava/util/concurrent/atomic/AtomicLong;
        //   502: astore          12
        //   504: getstatic       h9m.v:Lh9m;
        //   507: astore          11
        //   509: aload           14
        //   511: getfield        j9m.a:Ljava/util/concurrent/atomic/AtomicReference;
        //   514: astore          13
        //   516: getstatic       h9m.w:Lh9m;
        //   519: astore          17
        //   521: aload           13
        //   523: aload           17
        //   525: invokevirtual   java/util/concurrent/atomic/AtomicReference.getAndSet:(Ljava/lang/Object;)Ljava/lang/Object;
        //   528: checkcast       Lh9m;
        //   531: aload           17
        //   533: if_acmpeq       469
        //   536: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   539: lstore          8
        //   541: aload           14
        //   543: getfield        j9m.d:Lcom/lyft/kronos/internal/ntp/a;
        //   546: aload           16
        //   548: aload           14
        //   550: getfield        j9m.h:J
        //   553: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   556: invokevirtual   com/lyft/kronos/internal/ntp/a.d:(Ljava/lang/String;Ljava/lang/Long;)Ld9m;
        //   559: astore          17
        //   561: aload           17
        //   563: getfield        d9m.a:J
        //   566: lstore          6
        //   568: aload           17
        //   570: getfield        d9m.c:J
        //   573: lstore          4
        //   575: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   578: aload           17
        //   580: getfield        d9m.b:J
        //   583: lsub           
        //   584: lload           6
        //   586: lload           4
        //   588: ladd           
        //   589: ladd           
        //   590: lconst_0       
        //   591: lcmp           
        //   592: iflt            720
        //   595: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   598: lload           8
        //   600: lsub           
        //   601: lstore          4
        //   603: lload           4
        //   605: lload_2        
        //   606: lcmp           
        //   607: ifgt            643
        //   610: aload           14
        //   612: getfield        j9m.e:Lvhk;
        //   615: aload           17
        //   617: invokevirtual   vhk.w:(Ld9m;)V
        //   620: aload           13
        //   622: aload           11
        //   624: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   627: aload           12
        //   629: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   632: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   635: goto            881
        //   638: astore          20
        //   640: goto            799
        //   643: new             Lcom/lyft/kronos/internal/ntp/NTPSyncException;
        //   646: astore          18
        //   648: new             Ljava/lang/StringBuilder;
        //   651: astore          17
        //   653: aload           17
        //   655: ldc             "Ignoring response from "
        //   657: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   660: aload           17
        //   662: aload           16
        //   664: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   667: pop            
        //   668: aload           17
        //   670: ldc             " because the network latency ("
        //   672: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   675: pop            
        //   676: aload           17
        //   678: lload           4
        //   680: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   683: pop            
        //   684: aload           17
        //   686: ldc             " ms) is longer than the required value ("
        //   688: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   691: pop            
        //   692: aload           17
        //   694: lload_2        
        //   695: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   698: pop            
        //   699: aload           17
        //   701: ldc             " ms"
        //   703: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   706: pop            
        //   707: aload           18
        //   709: aload           17
        //   711: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   714: invokespecial   com/lyft/kronos/internal/ntp/NTPSyncException.<init>:(Ljava/lang/String;)V
        //   717: aload           18
        //   719: athrow         
        //   720: new             Lcom/lyft/kronos/internal/ntp/NTPSyncException;
        //   723: astore          19
        //   725: new             Ljava/lang/StringBuilder;
        //   728: astore          18
        //   730: aload           18
        //   732: ldc             "Invalid time "
        //   734: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   737: aload           17
        //   739: getfield        d9m.a:J
        //   742: lstore          4
        //   744: aload           17
        //   746: getfield        d9m.c:J
        //   749: lstore_2       
        //   750: aload           18
        //   752: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   755: aload           17
        //   757: getfield        d9m.b:J
        //   760: lsub           
        //   761: lload           4
        //   763: lload_2        
        //   764: ladd           
        //   765: ladd           
        //   766: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   769: pop            
        //   770: aload           18
        //   772: ldc             " received from "
        //   774: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   777: pop            
        //   778: aload           18
        //   780: aload           16
        //   782: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   785: pop            
        //   786: aload           19
        //   788: aload           18
        //   790: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   793: invokespecial   com/lyft/kronos/internal/ntp/NTPSyncException.<init>:(Ljava/lang/String;)V
        //   796: aload           19
        //   798: athrow         
        //   799: aload           14
        //   801: getfield        j9m.f:Lord;
        //   804: getfield        ord.v:Lrjc;
        //   807: astore          19
        //   809: getstatic       qjc.w:Lqjc;
        //   812: astore          18
        //   814: new             Lzo1;
        //   817: astore          17
        //   819: aload           17
        //   821: aload           16
        //   823: bipush          18
        //   825: invokespecial   zo1.<init>:(Ljava/lang/String;B)V
        //   828: aload           19
        //   830: iconst_5       
        //   831: aload           18
        //   833: aload           17
        //   835: aload           20
        //   837: iconst_0       
        //   838: bipush          48
        //   840: invokestatic    c5q.E:(Lrjc;ILqjc;Ljta;Ljava/lang/Throwable;ZI)V
        //   843: aload           13
        //   845: aload           11
        //   847: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   850: aload           12
        //   852: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   855: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   858: goto            469
        //   861: astore          14
        //   863: aload           13
        //   865: aload           11
        //   867: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   870: aload           12
        //   872: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   875: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   878: aload           14
        //   880: athrow         
        //   881: return         
        //   882: aload_0        
        //   883: getfield        h.w:Ljava/lang/Object;
        //   886: checkcast       Luzg;
        //   889: getfield        uzg.y:Z
        //   892: ifne            1255
        //   895: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   898: invokevirtual   java/lang/Thread.isInterrupted:()Z
        //   901: ifne            1255
        //   904: aload_0        
        //   905: getfield        h.w:Ljava/lang/Object;
        //   908: checkcast       Luzg;
        //   911: invokevirtual   uzg.g:()Z
        //   914: istore          10
        //   916: aload_0        
        //   917: getfield        h.w:Ljava/lang/Object;
        //   920: checkcast       Luzg;
        //   923: getfield        uzg.v:Lhjf;
        //   926: astore          11
        //   928: iload           10
        //   930: ifeq            992
        //   933: aload           11
        //   935: lconst_1       
        //   936: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   939: invokevirtual   hjf.poll:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //   942: checkcast       Lwzg;
        //   945: astore          12
        //   947: aload_0        
        //   948: getfield        h.w:Ljava/lang/Object;
        //   951: checkcast       Luzg;
        //   954: astore          11
        //   956: aload           11
        //   958: getfield        uzg.A:Lowd;
        //   961: astore          13
        //   963: aload           11
        //   965: getfield        uzg.x:Lawp;
        //   968: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   971: pop            
        //   972: aload           13
        //   974: invokestatic    java/lang/System.currentTimeMillis:()J
        //   977: invokevirtual   owd.b:(J)V
        //   980: aload           12
        //   982: astore          11
        //   984: aload           12
        //   986: ifnonnull       1002
        //   989: goto            882
        //   992: aload           11
        //   994: invokevirtual   hjf.take:()Ljava/lang/Object;
        //   997: checkcast       Lwzg;
        //  1000: astore          11
        //  1002: aload           11
        //  1004: instanceof      Ltzg;
        //  1007: ifeq            1044
        //  1010: aload_0        
        //  1011: getfield        h.w:Ljava/lang/Object;
        //  1014: checkcast       Luzg;
        //  1017: getfield        uzg.v:Lhjf;
        //  1020: getstatic       zyo.F:Lzyo;
        //  1023: invokevirtual   hjf.drain:(Ly6f;)I
        //  1026: pop            
        //  1027: aload_0        
        //  1028: getfield        h.w:Ljava/lang/Object;
        //  1031: checkcast       Luzg;
        //  1034: getfield        uzg.z:Ljava/util/concurrent/atomic/AtomicInteger;
        //  1037: invokevirtual   java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        //  1040: pop            
        //  1041: goto            882
        //  1044: aload           11
        //  1046: iconst_0       
        //  1047: invokeinterface wzg.e:(Z)Z
        //  1052: pop            
        //  1053: aload_0        
        //  1054: getfield        h.w:Ljava/lang/Object;
        //  1057: checkcast       Luzg;
        //  1060: invokevirtual   uzg.g:()Z
        //  1063: ifeq            1158
        //  1066: aload_0        
        //  1067: getfield        h.w:Ljava/lang/Object;
        //  1070: checkcast       Luzg;
        //  1073: getfield        uzg.A:Lowd;
        //  1076: astore          13
        //  1078: aload           13
        //  1080: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1083: pop            
        //  1084: aload           11
        //  1086: instanceof      Lszg;
        //  1089: ifne            1095
        //  1092: goto            1158
        //  1095: aload           11
        //  1097: checkcast       Lszg;
        //  1100: astore          12
        //  1102: aload           12
        //  1104: iconst_1       
        //  1105: iconst_2       
        //  1106: invokevirtual   szg.g:(II)Z
        //  1109: ifne            1115
        //  1112: goto            1158
        //  1115: aload           13
        //  1117: getfield        owd.c:Ljava/util/ArrayList;
        //  1120: astore          11
        //  1122: aload           12
        //  1124: invokevirtual   szg.h:()Z
        //  1127: ifeq            1133
        //  1130: goto            882
        //  1133: aload           11
        //  1135: invokevirtual   java/util/ArrayList.size:()I
        //  1138: sipush          4096
        //  1141: if_icmpne       1147
        //  1144: goto            882
        //  1147: aload           11
        //  1149: aload           12
        //  1151: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1154: pop            
        //  1155: goto            882
        //  1158: aload           11
        //  1160: invokeinterface wzg.d:()J
        //  1165: ldc2_w          1000000
        //  1168: ldiv           
        //  1169: lstore_2       
        //  1170: aload_0        
        //  1171: getfield        h.w:Ljava/lang/Object;
        //  1174: checkcast       Luzg;
        //  1177: getfield        uzg.x:Lawp;
        //  1180: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1183: pop            
        //  1184: lload_2        
        //  1185: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1188: ldc2_w          5000
        //  1191: lsub           
        //  1192: lcmp           
        //  1193: ifgt            1206
        //  1196: aload           11
        //  1198: invokeinterface wzg.a:()V
        //  1203: goto            882
        //  1206: aload           11
        //  1208: invokeinterface wzg.c:()Z
        //  1213: ifeq            1226
        //  1216: aload           11
        //  1218: invokeinterface wzg.a:()V
        //  1223: goto            882
        //  1226: aload_0        
        //  1227: getfield        h.w:Ljava/lang/Object;
        //  1230: checkcast       Luzg;
        //  1233: aload           11
        //  1235: invokevirtual   uzg.c:(Lwzg;)V
        //  1238: ldc2_w          100
        //  1241: invokestatic    java/lang/Thread.sleep:(J)V
        //  1244: goto            882
        //  1247: astore          11
        //  1249: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //  1252: invokevirtual   java/lang/Thread.interrupt:()V
        //  1255: return         
        //  1256: aload_0        
        //  1257: getfield        h.w:Ljava/lang/Object;
        //  1260: checkcast       Lolf;
        //  1263: getfield        olf.a:Ljava/lang/Object;
        //  1266: astore          11
        //  1268: aload           11
        //  1270: dup            
        //  1271: astore          23
        //  1273: monitorenter   
        //  1274: aload_0        
        //  1275: getfield        h.w:Ljava/lang/Object;
        //  1278: checkcast       Lolf;
        //  1281: getfield        olf.f:Ljava/lang/Object;
        //  1284: astore          12
        //  1286: aload_0        
        //  1287: getfield        h.w:Ljava/lang/Object;
        //  1290: checkcast       Lolf;
        //  1293: getstatic       olf.k:Ljava/lang/Object;
        //  1296: putfield        olf.f:Ljava/lang/Object;
        //  1299: aload           23
        //  1301: monitorexit    
        //  1302: aload_0        
        //  1303: getfield        h.w:Ljava/lang/Object;
        //  1306: checkcast       Lolf;
        //  1309: aload           12
        //  1311: invokevirtual   olf.i:(Ljava/lang/Object;)V
        //  1314: return         
        //  1315: astore          12
        //  1317: aload           23
        //  1319: monitorexit    
        //  1320: aload           12
        //  1322: athrow         
        //  1323: aload_0        
        //  1324: getfield        h.w:Ljava/lang/Object;
        //  1327: checkcast       Lvra;
        //  1330: iconst_1       
        //  1331: invokevirtual   vra.A:(Z)Z
        //  1334: pop            
        //  1335: return         
        //  1336: aload_0        
        //  1337: getfield        h.w:Ljava/lang/Object;
        //  1340: checkcast       Landroidx/compose/ui/platform/AndroidComposeView;
        //  1343: astore          12
        //  1345: aload           12
        //  1347: aload_0        
        //  1348: invokevirtual   android/view/View.removeCallbacks:(Ljava/lang/Runnable;)Z
        //  1351: pop            
        //  1352: aload           12
        //  1354: getfield        androidx/compose/ui/platform/AndroidComposeView.I0:Landroid/view/MotionEvent;
        //  1357: astore          11
        //  1359: aload           11
        //  1361: ifnull          1427
        //  1364: aload           11
        //  1366: invokevirtual   android/view/MotionEvent.getActionMasked:()I
        //  1369: istore_1       
        //  1370: iload_1        
        //  1371: bipush          10
        //  1373: if_icmpeq       1427
        //  1376: iload_1        
        //  1377: iconst_1       
        //  1378: if_icmpeq       1427
        //  1381: iload_1        
        //  1382: bipush          7
        //  1384: if_icmpeq       1410
        //  1387: iload_1        
        //  1388: bipush          8
        //  1390: if_icmpeq       1404
        //  1393: iload_1        
        //  1394: bipush          9
        //  1396: if_icmpeq       1410
        //  1399: iconst_2       
        //  1400: istore_1       
        //  1401: goto            1413
        //  1404: bipush          9
        //  1406: istore_1       
        //  1407: goto            1413
        //  1410: bipush          7
        //  1412: istore_1       
        //  1413: aload           12
        //  1415: aload           11
        //  1417: iload_1        
        //  1418: aload           12
        //  1420: getfield        androidx/compose/ui/platform/AndroidComposeView.J0:J
        //  1423: iconst_0       
        //  1424: invokevirtual   androidx/compose/ui/platform/AndroidComposeView.J:(Landroid/view/MotionEvent;IJZ)V
        //  1427: return         
        //  1428: aload_0        
        //  1429: getfield        h.w:Ljava/lang/Object;
        //  1432: checkcast       Ljava/util/concurrent/CountDownLatch;
        //  1435: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //  1438: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  59     78     435    443    Any
        //  101    146    169    435    Any
        //  151    166    169    435    Any
        //  178    185    302    362    Any
        //  190    240    169    435    Any
        //  240    255    169    435    Any
        //  255    272    294    302    Any
        //  272    275    169    435    Any
        //  296    302    169    435    Any
        //  309    359    169    435    Any
        //  359    362    169    435    Any
        //  362    377    409    414    Any
        //  377    388    417    425    Any
        //  388    405    409    414    Any
        //  414    417    409    414    Any
        //  419    425    409    414    Any
        //  541    603    638    881    Any
        //  610    620    638    881    Any
        //  643    720    638    881    Any
        //  720    799    638    881    Any
        //  799    843    861    881    Any
        //  882    916    1247   1255   Ljava/lang/InterruptedException;
        //  933    980    1247   1255   Ljava/lang/InterruptedException;
        //  992    1002   1247   1255   Ljava/lang/InterruptedException;
        //  1002   1041   1247   1255   Ljava/lang/InterruptedException;
        //  1044   1092   1247   1255   Ljava/lang/InterruptedException;
        //  1095   1112   1247   1255   Ljava/lang/InterruptedException;
        //  1115   1130   1247   1255   Ljava/lang/InterruptedException;
        //  1133   1144   1247   1255   Ljava/lang/InterruptedException;
        //  1147   1155   1247   1255   Ljava/lang/InterruptedException;
        //  1158   1203   1247   1255   Ljava/lang/InterruptedException;
        //  1206   1223   1247   1255   Ljava/lang/InterruptedException;
        //  1226   1244   1247   1255   Ljava/lang/InterruptedException;
        //  1274   1302   1315   1323   Any
        //  1317   1320   1315   1323   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0408:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
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
}
