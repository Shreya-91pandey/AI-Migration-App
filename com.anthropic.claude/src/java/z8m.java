import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class z8m
{
    public final lta a;
    public final AtomicReference b;
    public boolean c;
    public final f0l d;
    public final e0j e;
    public final inf f;
    public final Object g;
    public re h;
    public y8m i;
    public long j;
    
    public z8m(final lta a) {
        this.a = a;
        this.b = new AtomicReference((Object)null);
        this.d = new f0l((Object)this, (byte)2);
        this.e = new e0j((Object)this, (byte)12);
        this.f = new inf(0, new y8m[16]);
        this.g = new Object();
        this.j = -1L;
    }
    
    public final void a() {
        final Object g;
        monitorenter(g = this.g);
        Label_0092: {
            try {
                final inf f = this.f;
                final Object[] v = f.v;
                for (int x = f.x, i = 0; i < x; ++i) {
                    final y8m y8m = (y8m)v[i];
                    y8m.e.a();
                    y8m.f.a();
                    y8m.l.a();
                    y8m.m.clear();
                }
            }
            finally {
                break Label_0092;
            }
            monitorexit(g);
            return;
        }
        monitorexit(g);
    }
    
    public final void b(final Object o) {
        while (true) {
            final Object g;
            monitorenter(g = this.g);
            Label_0343: {
                inf f = null;
                int x = 0;
                int n2 = 0;
                Object[] array = null;
            Label_0319:
                while (true) {
                    int n4;
                    int i = 0;
                    try {
                        f = this.f;
                        x = f.x;
                        final int n = 0;
                        n2 = 0;
                        array = f.v;
                        if (n >= x) {
                            break Label_0319;
                        }
                        final y8m y8m = (y8m)array[n];
                        final amf amf = (amf)y8m.f.k(o);
                        Label_0253: {
                            if (amf != null) {
                                array = amf.b;
                                final int[] c = amf.c;
                                final long[] a = amf.a;
                                final int n3 = a.length - 2;
                                if (n3 >= 0) {
                                    n4 = 0;
                                    while (true) {
                                        long n5 = a[n4];
                                        if ((~n5 << 7 & n5 & 0x8080808080808080L) != 0x8080808080808080L) {
                                            int n6;
                                            for (n6 = 8 - (~(n4 - n3) >>> 31), i = 0; i < n6; ++i) {
                                                if ((n5 & 0xFFL) < 128L) {
                                                    final int n7 = (n4 << 3) + i;
                                                    final Object o2 = array[n7];
                                                    final int n8 = c[n7];
                                                    y8m.c(o, o2);
                                                }
                                                n5 >>= 8;
                                            }
                                            i = n;
                                            if (n6 != 8) {
                                                break Label_0253;
                                            }
                                        }
                                        i = n;
                                        if (n4 == n3) {
                                            break Label_0253;
                                        }
                                        ++n4;
                                    }
                                }
                            }
                            i = n;
                        }
                        if (!y8m.f.j()) {
                            n4 = n2 + 1;
                        }
                        else if ((n4 = n2) > 0) {
                            array = f.v;
                            array[i - n2] = array[i];
                            n4 = n2;
                        }
                    }
                    finally {
                        break Label_0343;
                    }
                    final int n = i + 1;
                    n2 = n4;
                    continue;
                }
                final int x2 = x - n2;
                Arrays.fill(array, x2, x, (Object)null);
                f.x = x2;
                monitorexit(g);
                return;
            }
            monitorexit(g);
        }
    }
    
    public final boolean c() {
        final Object g = this.g;
        synchronized (g) {
            final boolean c = this.c;
            monitorexit(g);
            if (c) {
                return false;
            }
            boolean b = false;
            while (true) {
                final AtomicReference b2 = this.b;
                Set set2 = null;
            Label_0034:
                while (true) {
                    final Object value = b2.get();
                    final Object o = null;
                    final Set set = null;
                    Object o2 = null;
                    if (value == null) {
                        set2 = set;
                        break;
                    }
                    Set set4;
                    if (value instanceof Set) {
                        final Set set3 = (Set)value;
                        o2 = o;
                        set4 = set3;
                    }
                    else {
                        if (!(value instanceof List)) {
                            ti6.b("Unexpected notification");
                            ebq.a();
                            return false;
                        }
                        final List list = (List)value;
                        set4 = (Set)list.get(0);
                        if (list.size() == 2) {
                            o2 = list.get(1);
                        }
                        else if (list.size() > 2) {
                            o2 = list.subList(1, list.size());
                        }
                    }
                    while (!b2.compareAndSet(value, o2)) {
                        if (b2.get() != value) {
                            continue Label_0034;
                        }
                    }
                    set2 = set4;
                    break;
                }
                if (set2 == null) {
                    return b;
                }
                final Object g2;
                monitorenter(g2 = this.g);
                Label_0279: {
                    try {
                        final inf f = this.f;
                        final Object[] v = f.v;
                        for (int x = f.x, i = 0; i < x; ++i) {
                            b = (((y8m)v[i]).a(set2) || b);
                        }
                    }
                    finally {
                        break Label_0279;
                    }
                    monitorexit(g2);
                    continue;
                }
                monitorexit(g2);
            }
        }
    }
    
    public final void d(final Object p0, final lta p1, final jta p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: lstore          15
        //     5: aload_0        
        //     6: getfield        z8m.g:Ljava/lang/Object;
        //     9: astore          23
        //    11: aload           23
        //    13: dup            
        //    14: astore          28
        //    16: monitorenter   
        //    17: aload_0        
        //    18: getfield        z8m.f:Linf;
        //    21: astore          24
        //    23: aload           24
        //    25: getfield        inf.v:[Ljava/lang/Object;
        //    28: astore          22
        //    30: aload           24
        //    32: getfield        inf.x:I
        //    35: istore          5
        //    37: iconst_0       
        //    38: istore          4
        //    40: iload           4
        //    42: iload           5
        //    44: if_icmpge       75
        //    47: aload           22
        //    49: iload           4
        //    51: aaload         
        //    52: astore          21
        //    54: aload           21
        //    56: checkcast       Ly8m;
        //    59: getfield        y8m.a:Llta;
        //    62: aload_2        
        //    63: if_acmpne       69
        //    66: goto            78
        //    69: iinc            4, 1
        //    72: goto            40
        //    75: aconst_null    
        //    76: astore          21
        //    78: aload           21
        //    80: checkcast       Ly8m;
        //    83: astore          22
        //    85: iconst_1       
        //    86: istore          4
        //    88: aload           22
        //    90: astore          21
        //    92: aload           22
        //    94: ifnonnull       125
        //    97: new             Ly8m;
        //   100: astore          21
        //   102: aload_2        
        //   103: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   106: pop            
        //   107: iconst_1       
        //   108: aload_2        
        //   109: invokestatic    omo.v:(ILjava/lang/Object;)V
        //   112: aload           21
        //   114: aload_2        
        //   115: invokespecial   y8m.<init>:(Llta;)V
        //   118: aload           24
        //   120: aload           21
        //   122: invokevirtual   inf.b:(Ljava/lang/Object;)V
        //   125: aload_0        
        //   126: getfield        z8m.i:Ly8m;
        //   129: astore          22
        //   131: aload_0        
        //   132: getfield        z8m.j:J
        //   135: lstore          13
        //   137: aload           28
        //   139: monitorexit    
        //   140: lload           13
        //   142: ldc2_w          -1
        //   145: lcmp           
        //   146: ifeq            202
        //   149: lload           13
        //   151: lload           15
        //   153: lcmp           
        //   154: ifne            160
        //   157: goto            202
        //   160: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   163: invokevirtual   java/lang/Thread.getName:()Ljava/lang/String;
        //   166: astore          23
        //   168: lload           13
        //   170: ldc             "Detected multithreaded access to SnapshotStateObserver: previousThreadId="
        //   172: ldc             "), currentThread={id="
        //   174: invokestatic    smk.u:(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: astore_2       
        //   178: aload_2        
        //   179: lload           15
        //   181: ldc             ", name="
        //   183: aload           23
        //   185: invokestatic    smk.x:(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V
        //   188: aload_2        
        //   189: ldc             "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."
        //   191: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   194: pop            
        //   195: aload_2        
        //   196: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   199: invokestatic    pih.a:(Ljava/lang/String;)V
        //   202: aload_0        
        //   203: getfield        z8m.g:Ljava/lang/Object;
        //   206: astore_2       
        //   207: aload_2        
        //   208: dup            
        //   209: astore          29
        //   211: monitorenter   
        //   212: aload_0        
        //   213: aload           21
        //   215: putfield        z8m.i:Ly8m;
        //   218: aload_0        
        //   219: lload           15
        //   221: putfield        z8m.j:J
        //   224: aload           29
        //   226: monitorexit    
        //   227: aload_0        
        //   228: getfield        z8m.e:Le0j;
        //   231: astore          26
        //   233: aload           21
        //   235: getfield        y8m.b:Ljava/lang/Object;
        //   238: astore          23
        //   240: aload           21
        //   242: getfield        y8m.c:Lamf;
        //   245: astore          24
        //   247: aload           21
        //   249: getfield        y8m.d:I
        //   252: istore          9
        //   254: aload           21
        //   256: aload_1        
        //   257: putfield        y8m.b:Ljava/lang/Object;
        //   260: aload           21
        //   262: aload           21
        //   264: getfield        y8m.f:Ltmf;
        //   267: aload_1        
        //   268: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //   271: checkcast       Lamf;
        //   274: putfield        y8m.c:Lamf;
        //   277: aload           21
        //   279: getfield        y8m.d:I
        //   282: iconst_m1      
        //   283: if_icmpne       307
        //   286: aload           21
        //   288: invokestatic    g8m.h:()Lr7m;
        //   291: invokevirtual   r7m.g:()J
        //   294: invokestatic    java/lang/Long.hashCode:(J)I
        //   297: putfield        y8m.d:I
        //   300: goto            307
        //   303: astore_1       
        //   304: goto            940
        //   307: aload           21
        //   309: getfield        y8m.i:Lfva;
        //   312: astore_1       
        //   313: invokestatic    r8m.a:()Linf;
        //   316: astore          25
        //   318: aload           25
        //   320: aload_1        
        //   321: invokevirtual   inf.b:(Ljava/lang/Object;)V
        //   324: aload           26
        //   326: ifnonnull       343
        //   329: aload_3        
        //   330: invokeinterface jta.a:()Ljava/lang/Object;
        //   335: pop            
        //   336: goto            538
        //   339: astore_1       
        //   340: goto            915
        //   343: getstatic       g8m.b:Ltze;
        //   346: invokevirtual   tze.get:()Ljava/lang/Object;
        //   349: checkcast       Lr7m;
        //   352: astore_1       
        //   353: aload_1        
        //   354: instanceof      Lmfo;
        //   357: ifeq            461
        //   360: aload_1        
        //   361: checkcast       Lmfo;
        //   364: getfield        mfo.t:J
        //   367: invokestatic    eqi.T:()J
        //   370: lcmp           
        //   371: ifne            461
        //   374: aload_1        
        //   375: checkcast       Lmfo;
        //   378: getfield        mfo.r:Llta;
        //   381: astore_2       
        //   382: aload_1        
        //   383: checkcast       Lmfo;
        //   386: getfield        mfo.s:Llta;
        //   389: astore          27
        //   391: aload_1        
        //   392: checkcast       Lmfo;
        //   395: aload           26
        //   397: aload_2        
        //   398: iconst_1       
        //   399: invokestatic    g8m.i:(Llta;Llta;Z)Llta;
        //   402: putfield        mfo.r:Llta;
        //   405: aload_1        
        //   406: checkcast       Lmfo;
        //   409: aload           27
        //   411: putfield        mfo.s:Llta;
        //   414: aload_3        
        //   415: invokeinterface jta.a:()Ljava/lang/Object;
        //   420: pop            
        //   421: aload_1        
        //   422: checkcast       Lmfo;
        //   425: aload_2        
        //   426: putfield        mfo.r:Llta;
        //   429: aload_1        
        //   430: checkcast       Lmfo;
        //   433: aload           27
        //   435: putfield        mfo.s:Llta;
        //   438: goto            538
        //   441: astore_3       
        //   442: aload_1        
        //   443: checkcast       Lmfo;
        //   446: aload_2        
        //   447: putfield        mfo.r:Llta;
        //   450: aload_1        
        //   451: checkcast       Lmfo;
        //   454: aload           27
        //   456: putfield        mfo.s:Llta;
        //   459: aload_3        
        //   460: athrow         
        //   461: aload_1        
        //   462: ifnull          472
        //   465: aload_1        
        //   466: instanceof      Lzmf;
        //   469: ifeq            475
        //   472: goto            485
        //   475: aload_1        
        //   476: aload           26
        //   478: invokevirtual   r7m.u:(Llta;)Lr7m;
        //   481: astore_1       
        //   482: goto            518
        //   485: new             Lmfo;
        //   488: astore_2       
        //   489: aload_1        
        //   490: instanceof      Lzmf;
        //   493: ifeq            504
        //   496: aload_1        
        //   497: checkcast       Lzmf;
        //   500: astore_1       
        //   501: goto            506
        //   504: aconst_null    
        //   505: astore_1       
        //   506: aload_2        
        //   507: aload_1        
        //   508: aload           26
        //   510: aconst_null    
        //   511: iconst_1       
        //   512: iconst_0       
        //   513: invokespecial   mfo.<init>:(Lzmf;Llta;Llta;ZZ)V
        //   516: aload_2        
        //   517: astore_1       
        //   518: aload_1        
        //   519: invokevirtual   r7m.j:()Lr7m;
        //   522: astore_2       
        //   523: aload_3        
        //   524: invokeinterface jta.a:()Ljava/lang/Object;
        //   529: pop            
        //   530: aload_2        
        //   531: invokestatic    r7m.q:(Lr7m;)V
        //   534: aload_1        
        //   535: invokevirtual   r7m.c:()V
        //   538: aload           25
        //   540: aload           25
        //   542: getfield        inf.x:I
        //   545: iconst_1       
        //   546: isub           
        //   547: invokevirtual   inf.l:(I)Ljava/lang/Object;
        //   550: pop            
        //   551: aload           21
        //   553: getfield        y8m.b:Ljava/lang/Object;
        //   556: astore_2       
        //   557: aload_2        
        //   558: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   561: pop            
        //   562: aload           21
        //   564: getfield        y8m.d:I
        //   567: istore          8
        //   569: aload           21
        //   571: getfield        y8m.c:Lamf;
        //   574: astore_1       
        //   575: aload_1        
        //   576: ifnull          816
        //   579: lload           13
        //   581: lstore          15
        //   583: aload_1        
        //   584: getfield        amf.a:[J
        //   587: astore_3       
        //   588: lload           13
        //   590: lstore          15
        //   592: aload_3        
        //   593: arraylength    
        //   594: iconst_2       
        //   595: isub           
        //   596: istore          10
        //   598: iload           10
        //   600: iflt            816
        //   603: iconst_0       
        //   604: istore          5
        //   606: aload_3        
        //   607: iload           5
        //   609: laload         
        //   610: lstore          17
        //   612: lload           17
        //   614: ldc2_w          -1
        //   617: lxor           
        //   618: bipush          7
        //   620: lshl           
        //   621: lload           17
        //   623: land           
        //   624: ldc2_w          -9187201950435737472
        //   627: land           
        //   628: ldc2_w          -9187201950435737472
        //   631: lcmp           
        //   632: ifeq            791
        //   635: bipush          8
        //   637: iload           5
        //   639: iload           10
        //   641: isub           
        //   642: iconst_m1      
        //   643: ixor           
        //   644: bipush          31
        //   646: iushr          
        //   647: isub           
        //   648: istore          11
        //   650: iconst_0       
        //   651: istore          6
        //   653: iload           6
        //   655: iload           11
        //   657: if_icmpge       773
        //   660: lload           17
        //   662: ldc2_w          255
        //   665: land           
        //   666: ldc2_w          128
        //   669: lcmp           
        //   670: ifge            760
        //   673: iload           5
        //   675: iconst_3       
        //   676: ishl           
        //   677: iload           6
        //   679: iadd           
        //   680: istore          12
        //   682: lload           13
        //   684: lstore          15
        //   686: aload_1        
        //   687: getfield        amf.b:[Ljava/lang/Object;
        //   690: iload           12
        //   692: aaload         
        //   693: astore          25
        //   695: lload           13
        //   697: lstore          19
        //   699: lload           19
        //   701: lstore          15
        //   703: aload_1        
        //   704: getfield        amf.c:[I
        //   707: iload           12
        //   709: iaload         
        //   710: iload           8
        //   712: if_icmpeq       722
        //   715: iload           4
        //   717: istore          7
        //   719: goto            725
        //   722: iconst_0       
        //   723: istore          7
        //   725: iload           7
        //   727: ifeq            742
        //   730: lload           19
        //   732: lstore          15
        //   734: aload           21
        //   736: aload_2        
        //   737: aload           25
        //   739: invokevirtual   y8m.c:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   742: iload           7
        //   744: ifeq            760
        //   747: lload           19
        //   749: lstore          15
        //   751: aload_1        
        //   752: iload           12
        //   754: invokevirtual   amf.f:(I)V
        //   757: goto            760
        //   760: iinc            6, 1
        //   763: lload           17
        //   765: bipush          8
        //   767: lshr           
        //   768: lstore          17
        //   770: goto            653
        //   773: lload           13
        //   775: lstore          15
        //   777: lload           15
        //   779: lstore          13
        //   781: iload           11
        //   783: bipush          8
        //   785: if_icmpne       823
        //   788: goto            795
        //   791: lload           13
        //   793: lstore          15
        //   795: lload           15
        //   797: lstore          13
        //   799: iload           5
        //   801: iload           10
        //   803: if_icmpeq       823
        //   806: iinc            5, 1
        //   809: lload           15
        //   811: lstore          13
        //   813: goto            606
        //   816: goto            823
        //   819: astore_1       
        //   820: goto            889
        //   823: lload           13
        //   825: lstore          15
        //   827: aload           21
        //   829: aload           23
        //   831: putfield        y8m.b:Ljava/lang/Object;
        //   834: lload           13
        //   836: lstore          15
        //   838: aload           21
        //   840: aload           24
        //   842: putfield        y8m.c:Lamf;
        //   845: lload           13
        //   847: lstore          15
        //   849: aload           21
        //   851: iload           9
        //   853: putfield        y8m.d:I
        //   856: aload_0        
        //   857: getfield        z8m.g:Ljava/lang/Object;
        //   860: astore_1       
        //   861: aload_1        
        //   862: dup            
        //   863: astore          30
        //   865: monitorenter   
        //   866: aload_0        
        //   867: aload           22
        //   869: putfield        z8m.i:Ly8m;
        //   872: aload_0        
        //   873: lload           13
        //   875: putfield        z8m.j:J
        //   878: aload           30
        //   880: monitorexit    
        //   881: return         
        //   882: astore_2       
        //   883: aload           30
        //   885: monitorexit    
        //   886: aload_2        
        //   887: athrow         
        //   888: astore_1       
        //   889: lload           15
        //   891: lstore          13
        //   893: goto            940
        //   896: astore_2       
        //   897: goto            908
        //   900: astore_3       
        //   901: aload_2        
        //   902: invokestatic    r7m.q:(Lr7m;)V
        //   905: aload_3        
        //   906: athrow         
        //   907: astore_2       
        //   908: aload_1        
        //   909: invokevirtual   r7m.c:()V
        //   912: aload_2        
        //   913: athrow         
        //   914: astore_1       
        //   915: aload           25
        //   917: aload           25
        //   919: getfield        inf.x:I
        //   922: iconst_1       
        //   923: isub           
        //   924: invokevirtual   inf.l:(I)Ljava/lang/Object;
        //   927: pop            
        //   928: aload_1        
        //   929: athrow         
        //   930: astore_1       
        //   931: goto            940
        //   934: astore_1       
        //   935: aload           29
        //   937: monitorexit    
        //   938: aload_1        
        //   939: athrow         
        //   940: aload_0        
        //   941: getfield        z8m.g:Ljava/lang/Object;
        //   944: astore_2       
        //   945: aload_2        
        //   946: dup            
        //   947: astore          29
        //   949: monitorenter   
        //   950: aload_0        
        //   951: aload           22
        //   953: putfield        z8m.i:Ly8m;
        //   956: aload_0        
        //   957: lload           13
        //   959: putfield        z8m.j:J
        //   962: aload           29
        //   964: monitorexit    
        //   965: aload_1        
        //   966: athrow         
        //   967: astore_1       
        //   968: aload           29
        //   970: monitorexit    
        //   971: aload_1        
        //   972: athrow         
        //   973: astore_1       
        //   974: aload           28
        //   976: monitorexit    
        //   977: aload_1        
        //   978: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  17     37     973    979    Any
        //  54     66     973    979    Any
        //  78     85     973    979    Any
        //  97     125    973    979    Any
        //  125    137    973    979    Any
        //  202    212    303    307    Any
        //  212    224    934    940    Any
        //  224    300    303    307    Any
        //  307    318    303    307    Any
        //  318    324    339    343    Any
        //  329    336    339    343    Any
        //  343    391    339    343    Any
        //  391    421    441    461    Any
        //  421    438    339    343    Any
        //  442    461    339    343    Any
        //  465    472    339    343    Any
        //  475    482    339    343    Any
        //  485    501    339    343    Any
        //  506    516    339    343    Any
        //  518    523    896    900    Any
        //  523    530    900    908    Any
        //  530    534    896    900    Any
        //  534    538    339    343    Any
        //  538    575    303    307    Any
        //  583    588    819    823    Any
        //  592    598    819    823    Any
        //  686    695    819    823    Any
        //  703    715    888    889    Any
        //  734    742    888    889    Any
        //  751    757    888    889    Any
        //  827    834    888    889    Any
        //  838    845    888    889    Any
        //  849    856    888    889    Any
        //  866    878    882    888    Any
        //  901    907    907    908    Any
        //  908    914    914    915    Any
        //  915    930    930    934    Any
        //  935    940    930    934    Any
        //  950    962    967    973    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0722:
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
    
    public final void e() {
        final f0l d = this.d;
        g8m.b((lta)g8m.a);
        final Object c = g8m.c;
        synchronized (c) {
            g8m.h = (List)c86.a1((Collection)g8m.h, (Object)d);
            monitorexit(c);
            this.h = new re(d, (byte)13);
        }
    }
}
