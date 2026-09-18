import java.util.Map;
import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;

public class zmf extends r7m
{
    public static final int[] n;
    public final lta e;
    public final lta f;
    public int g;
    public umf h;
    public ArrayList i;
    public e8m j;
    public int[] k;
    public int l;
    public boolean m;
    
    static {
        n = new int[0];
    }
    
    public zmf(final long n, final e8m e8m, final lta e, final lta f) {
        super(n, e8m);
        this.e = e;
        this.f = f;
        this.j = e8m.z;
        this.k = zmf.n;
        this.l = 1;
    }
    
    public final void A(final long n) {
        final Object c = g8m.c;
        synchronized (c) {
            this.j = this.j.m(n);
        }
    }
    
    public void B(final umf h) {
        this.h = h;
    }
    
    public zmf C(final lta lta, final lta lta2) {
        if (super.c) {
            pih.a("Cannot use a disposed snapshot");
        }
        if (this.m) {
            if (super.d < 0) {
                pih.b("Unsupported operation on a disposed or applied snapshot");
            }
        }
        this.A(this.g());
        final Object c = g8m.c;
        synchronized (c) {
            final long e = g8m.e;
            g8m.e = e + 1L;
            g8m.d = g8m.d.m(e);
            final e8m d = this.d();
            this.r(d.m(e));
            final vrf vrf = new vrf(e, g8m.a(d, this.g() + 1L, e), g8m.i(lta, this.y(), true), g8m.j(lta2, this.i()), this);
            monitorexit(c);
            if (!this.m && !super.c) {
                final long g = this.g();
                synchronized (c) {
                    final long e2 = g8m.e;
                    g8m.e = e2 + 1L;
                    this.s(e2);
                    g8m.d = g8m.d.m(this.g());
                    monitorexit(c);
                    this.r(g8m.a(this.d(), g + 1L, this.g()));
                    return (zmf)vrf;
                }
            }
            return (zmf)vrf;
        }
    }
    
    @Override
    public final void b() {
        g8m.d = g8m.d.d(this.g()).a(this.j);
    }
    
    @Override
    public void c() {
        if (!super.c) {
            super.c = true;
            final Object c = g8m.c;
            synchronized (c) {
                this.o();
                monitorexit(c);
                this.l();
            }
        }
    }
    
    @Override
    public int h() {
        return this.g;
    }
    
    @Override
    public lta i() {
        return this.f;
    }
    
    @Override
    public void k() {
        ++this.l;
    }
    
    @Override
    public void l() {
        if (this.l <= 0) {
            pih.a("no pending nested snapshots");
        }
        final int l = this.l - 1;
        this.l = l;
        if (l == 0 && !this.m) {
            final umf x = this.x();
            if (x != null) {
                if (this.m) {
                    pih.b("Unsupported operation on a snapshot that has been applied");
                }
                this.B(null);
                final long g = this.g();
                final Object[] b = x.b;
                final long[] a = x.a;
                final int n = a.length - 2;
                if (n >= 0) {
                    int n2 = 0;
                    while (true) {
                        long n3 = a[n2];
                        if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n4 = 8 - (~(n2 - n) >>> 31);
                            for (int i = 0; i < n4; ++i) {
                                if ((0xFFL & n3) < 128L) {
                                    for (lpm lpm = ((jpm)b[(n2 << 3) + i]).a(); lpm != null; lpm = lpm.b) {
                                        final long a2 = lpm.a;
                                        if (a2 == g || c86.A0((Iterable)this.j, (Object)a2)) {
                                            final cyl a3 = g8m.a;
                                            lpm.a = 0L;
                                        }
                                    }
                                }
                                n3 >>= 8;
                            }
                            if (n4 != 8) {
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
            this.a();
        }
    }
    
    @Override
    public void m() {
        if (!this.m) {
            if (!super.c) {
                this.v();
            }
        }
    }
    
    @Override
    public void n(final jpm jpm) {
        umf x;
        if ((x = this.x()) == null) {
            final umf a = kak.a;
            x = new umf();
            this.B(x);
        }
        x.a((Object)jpm);
    }
    
    @Override
    public final void p() {
        for (int length = this.k.length, i = 0; i < length; ++i) {
            g8m.t(this.k[i]);
        }
        this.o();
    }
    
    @Override
    public void t(final int g) {
        this.g = g;
    }
    
    @Override
    public r7m u(final lta lta) {
        if (super.c) {
            pih.a("Cannot use a disposed snapshot");
        }
        if (this.m) {
            if (super.d < 0) {
                pih.b("Unsupported operation on a disposed or applied snapshot");
            }
        }
        final long g = this.g();
        this.A(this.g());
        final Object c = g8m.c;
        synchronized (c) {
            final long e = g8m.e;
            g8m.e = e + 1L;
            g8m.d = g8m.d.m(e);
            final wrf wrf = new wrf(e, g8m.a(this.d(), g + 1L, e), g8m.i(lta, this.y(), true), this);
            monitorexit(c);
            if (!this.m && !super.c) {
                final long g2 = this.g();
                synchronized (c) {
                    final long e2 = g8m.e;
                    g8m.e = e2 + 1L;
                    this.s(e2);
                    g8m.d = g8m.d.m(this.g());
                    monitorexit(c);
                    this.r(g8m.a(this.d(), g2 + 1L, this.g()));
                    return wrf;
                }
            }
            return wrf;
        }
    }
    
    public final void v() {
        this.A(this.g());
        if (!this.m && !super.c) {
            final long g = this.g();
            final Object c = g8m.c;
            synchronized (c) {
                final long e = g8m.e;
                g8m.e = e + 1L;
                this.s(e);
                g8m.d = g8m.d.m(this.g());
                monitorexit(c);
                this.r(g8m.a(this.d(), g + 1L, this.g()));
            }
        }
    }
    
    public uoo w() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   zmf.x:()Lumf;
        //     4: astore          10
        //     6: aload           10
        //     8: ifnull          38
        //    11: getstatic       g8m.j:Lb3b;
        //    14: getfield        r7m.b:J
        //    17: lstore          5
        //    19: lload           5
        //    21: aload_0        
        //    22: getstatic       g8m.d:Le8m;
        //    25: lload           5
        //    27: invokevirtual   e8m.d:(J)Le8m;
        //    30: invokestatic    g8m.m:(JLzmf;Le8m;)Ljava/util/HashMap;
        //    33: astore          8
        //    35: goto            41
        //    38: aconst_null    
        //    39: astore          8
        //    41: getstatic       r89.v:Lr89;
        //    44: astore          9
        //    46: getstatic       g8m.c:Ljava/lang/Object;
        //    49: astore          11
        //    51: aload           11
        //    53: dup            
        //    54: astore          13
        //    56: monitorenter   
        //    57: aload_0        
        //    58: invokestatic    g8m.v:(Lr7m;)V
        //    61: aload           10
        //    63: ifnull          171
        //    66: aload           10
        //    68: getfield        umf.d:I
        //    71: ifne            77
        //    74: goto            171
        //    77: getstatic       g8m.j:Lb3b;
        //    80: astore          9
        //    82: aload_0        
        //    83: getstatic       g8m.e:J
        //    86: aload           10
        //    88: aload           8
        //    90: getstatic       g8m.d:Le8m;
        //    93: aload           9
        //    95: getfield        r7m.b:J
        //    98: invokevirtual   e8m.d:(J)Le8m;
        //   101: invokevirtual   zmf.z:(JLumf;Ljava/util/HashMap;Le8m;)Luoo;
        //   104: astore          8
        //   106: aload           8
        //   108: getstatic       t7m.e:Lt7m;
        //   111: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   114: istore          7
        //   116: iload           7
        //   118: ifne            127
        //   121: aload           13
        //   123: monitorexit    
        //   124: aload           8
        //   126: areturn        
        //   127: aload_0        
        //   128: invokevirtual   zmf.b:()V
        //   131: aload           9
        //   133: getfield        zmf.h:Lumf;
        //   136: astore          8
        //   138: aload           9
        //   140: getstatic       g8m.a:Lcyl;
        //   143: invokestatic    g8m.u:(Lb3b;Llta;)Ljava/lang/Object;
        //   146: pop            
        //   147: aload_0        
        //   148: aconst_null    
        //   149: invokevirtual   zmf.B:(Lumf;)V
        //   152: aload           9
        //   154: aconst_null    
        //   155: putfield        zmf.h:Lumf;
        //   158: getstatic       g8m.h:Ljava/util/List;
        //   161: astore          9
        //   163: goto            220
        //   166: astore          8
        //   168: goto            726
        //   171: aload_0        
        //   172: invokevirtual   zmf.b:()V
        //   175: getstatic       g8m.j:Lb3b;
        //   178: astore          12
        //   180: aload           12
        //   182: getfield        zmf.h:Lumf;
        //   185: astore          8
        //   187: aload           12
        //   189: getstatic       g8m.a:Lcyl;
        //   192: invokestatic    g8m.u:(Lb3b;Llta;)Ljava/lang/Object;
        //   195: pop            
        //   196: aload           8
        //   198: ifnull          217
        //   201: aload           8
        //   203: invokevirtual   umf.h:()Z
        //   206: ifeq            217
        //   209: getstatic       g8m.h:Ljava/util/List;
        //   212: astore          9
        //   214: goto            220
        //   217: aconst_null    
        //   218: astore          8
        //   220: aload           13
        //   222: monitorexit    
        //   223: aload_0        
        //   224: iconst_1       
        //   225: putfield        zmf.m:Z
        //   228: aload           8
        //   230: ifnull          293
        //   233: new             Llak;
        //   236: dup            
        //   237: aload           8
        //   239: invokespecial   lak.<init>:(Lumf;)V
        //   242: astore          11
        //   244: aload           8
        //   246: invokevirtual   umf.g:()Z
        //   249: ifne            293
        //   252: aload           9
        //   254: invokeinterface java/util/Collection.size:()I
        //   259: istore_2       
        //   260: iconst_0       
        //   261: istore_1       
        //   262: iload_1        
        //   263: iload_2        
        //   264: if_icmpge       293
        //   267: aload           9
        //   269: iload_1        
        //   270: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   275: checkcast       Lzta;
        //   278: aload           11
        //   280: aload_0        
        //   281: invokeinterface zta.d:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   286: pop            
        //   287: iinc            1, 1
        //   290: goto            262
        //   293: aload           10
        //   295: ifnull          358
        //   298: aload           10
        //   300: invokevirtual   umf.h:()Z
        //   303: ifeq            358
        //   306: new             Llak;
        //   309: dup            
        //   310: aload           10
        //   312: invokespecial   lak.<init>:(Lumf;)V
        //   315: astore          11
        //   317: aload           9
        //   319: invokeinterface java/util/Collection.size:()I
        //   324: istore_2       
        //   325: iconst_0       
        //   326: istore_1       
        //   327: iload_1        
        //   328: iload_2        
        //   329: if_icmpge       358
        //   332: aload           9
        //   334: iload_1        
        //   335: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   340: checkcast       Lzta;
        //   343: aload           11
        //   345: aload_0        
        //   346: invokeinterface zta.d:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   351: pop            
        //   352: iinc            1, 1
        //   355: goto            327
        //   358: getstatic       g8m.c:Ljava/lang/Object;
        //   361: astore          9
        //   363: aload           9
        //   365: dup            
        //   366: astore          14
        //   368: monitorenter   
        //   369: aload_0        
        //   370: invokevirtual   zmf.p:()V
        //   373: invokestatic    g8m.d:()V
        //   376: aload           8
        //   378: ifnull          523
        //   381: aload           8
        //   383: getfield        umf.b:[Ljava/lang/Object;
        //   386: astore          11
        //   388: aload           8
        //   390: getfield        umf.a:[J
        //   393: astore          8
        //   395: aload           8
        //   397: arraylength    
        //   398: iconst_2       
        //   399: isub           
        //   400: istore_3       
        //   401: iload_3        
        //   402: iflt            523
        //   405: iconst_0       
        //   406: istore_1       
        //   407: aload           8
        //   409: iload_1        
        //   410: laload         
        //   411: lstore          5
        //   413: lload           5
        //   415: ldc2_w          -1
        //   418: lxor           
        //   419: bipush          7
        //   421: lshl           
        //   422: lload           5
        //   424: land           
        //   425: ldc2_w          -9187201950435737472
        //   428: land           
        //   429: ldc2_w          -9187201950435737472
        //   432: lcmp           
        //   433: ifeq            512
        //   436: bipush          8
        //   438: iload_1        
        //   439: iload_3        
        //   440: isub           
        //   441: iconst_m1      
        //   442: ixor           
        //   443: bipush          31
        //   445: iushr          
        //   446: isub           
        //   447: istore          4
        //   449: iconst_0       
        //   450: istore_2       
        //   451: iload_2        
        //   452: iload           4
        //   454: if_icmpge       505
        //   457: lload           5
        //   459: ldc2_w          255
        //   462: land           
        //   463: ldc2_w          128
        //   466: lcmp           
        //   467: ifge            492
        //   470: aload           11
        //   472: iload_1        
        //   473: iconst_3       
        //   474: ishl           
        //   475: iload_2        
        //   476: iadd           
        //   477: aaload         
        //   478: checkcast       Ljpm;
        //   481: invokestatic    g8m.p:(Ljpm;)V
        //   484: goto            492
        //   487: astore          8
        //   489: goto            720
        //   492: lload           5
        //   494: bipush          8
        //   496: lshr           
        //   497: lstore          5
        //   499: iinc            2, 1
        //   502: goto            451
        //   505: iload           4
        //   507: bipush          8
        //   509: if_icmpne       523
        //   512: iload_1        
        //   513: iload_3        
        //   514: if_icmpeq       523
        //   517: iinc            1, 1
        //   520: goto            407
        //   523: aload           10
        //   525: ifnull          662
        //   528: aload           10
        //   530: getfield        umf.b:[Ljava/lang/Object;
        //   533: astore          8
        //   535: aload           10
        //   537: getfield        umf.a:[J
        //   540: astore          10
        //   542: aload           10
        //   544: arraylength    
        //   545: iconst_2       
        //   546: isub           
        //   547: istore_3       
        //   548: iload_3        
        //   549: iflt            662
        //   552: iconst_0       
        //   553: istore_1       
        //   554: aload           10
        //   556: iload_1        
        //   557: laload         
        //   558: lstore          5
        //   560: lload           5
        //   562: ldc2_w          -1
        //   565: lxor           
        //   566: bipush          7
        //   568: lshl           
        //   569: lload           5
        //   571: land           
        //   572: ldc2_w          -9187201950435737472
        //   575: land           
        //   576: ldc2_w          -9187201950435737472
        //   579: lcmp           
        //   580: ifeq            651
        //   583: bipush          8
        //   585: iload_1        
        //   586: iload_3        
        //   587: isub           
        //   588: iconst_m1      
        //   589: ixor           
        //   590: bipush          31
        //   592: iushr          
        //   593: isub           
        //   594: istore          4
        //   596: iconst_0       
        //   597: istore_2       
        //   598: iload_2        
        //   599: iload           4
        //   601: if_icmpge       644
        //   604: lload           5
        //   606: ldc2_w          255
        //   609: land           
        //   610: ldc2_w          128
        //   613: lcmp           
        //   614: ifge            631
        //   617: aload           8
        //   619: iload_1        
        //   620: iconst_3       
        //   621: ishl           
        //   622: iload_2        
        //   623: iadd           
        //   624: aaload         
        //   625: checkcast       Ljpm;
        //   628: invokestatic    g8m.p:(Ljpm;)V
        //   631: lload           5
        //   633: bipush          8
        //   635: lshr           
        //   636: lstore          5
        //   638: iinc            2, 1
        //   641: goto            598
        //   644: iload           4
        //   646: bipush          8
        //   648: if_icmpne       662
        //   651: iload_1        
        //   652: iload_3        
        //   653: if_icmpeq       662
        //   656: iinc            1, 1
        //   659: goto            554
        //   662: aload_0        
        //   663: getfield        zmf.i:Ljava/util/ArrayList;
        //   666: astore          8
        //   668: aload           8
        //   670: ifnull          708
        //   673: aload           8
        //   675: invokeinterface java/util/Collection.size:()I
        //   680: istore_2       
        //   681: iconst_0       
        //   682: istore_1       
        //   683: iload_1        
        //   684: iload_2        
        //   685: if_icmpge       708
        //   688: aload           8
        //   690: iload_1        
        //   691: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   696: checkcast       Ljpm;
        //   699: invokestatic    g8m.p:(Ljpm;)V
        //   702: iinc            1, 1
        //   705: goto            683
        //   708: aload_0        
        //   709: aconst_null    
        //   710: putfield        zmf.i:Ljava/util/ArrayList;
        //   713: aload           14
        //   715: monitorexit    
        //   716: getstatic       t7m.e:Lt7m;
        //   719: areturn        
        //   720: aload           14
        //   722: monitorexit    
        //   723: aload           8
        //   725: athrow         
        //   726: aload           13
        //   728: monitorexit    
        //   729: aload           8
        //   731: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  57     61     166    171    Any
        //  66     74     166    171    Any
        //  77     116    166    171    Any
        //  127    163    166    171    Any
        //  171    196    166    171    Any
        //  201    214    166    171    Any
        //  369    376    487    492    Any
        //  381    401    487    492    Any
        //  470    484    487    492    Any
        //  528    548    487    492    Any
        //  617    631    487    492    Any
        //  662    668    487    492    Any
        //  673    681    487    492    Any
        //  688    702    487    492    Any
        //  708    713    487    492    Any
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
    
    public umf x() {
        return this.h;
    }
    
    public lta y() {
        return this.e;
    }
    
    public final uoo z(final long a, final umf umf, final HashMap hashMap, final e8m e8m) {
        e8m j = this.d().m(this.g()).j(this.j);
        Object[] b = umf.b;
        long[] a2 = umf.a;
        final int n = a2.length - 2;
        List list = null;
        Object z0 = null;
        Label_0570: {
            Object o2;
            List list2;
            if (n >= 0) {
                int n2 = 0;
                Object o = null;
                o2 = null;
                while (true) {
                    long n3 = a2[n2];
                    long[] array2;
                    Object[] array3;
                    if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n4 = 8 - (~(n2 - n) >>> 31);
                        for (int i = 0; i < n4; ++i) {
                            if ((n3 & 0xFFL) < 128L) {
                                final jpm jpm = (jpm)b[(n2 << 3) + i];
                                final lpm a3 = jpm.a();
                                final lpm r = g8m.r(a3, a, e8m);
                                if (r != null) {
                                    final lpm r2 = g8m.r(a3, this.g(), j);
                                    if (r2 != null) {
                                        if (r2.a != 1L && !r.equals(r2)) {
                                            final lpm r3 = g8m.r(a3, this.g(), this.d());
                                            if (r3 == null) {
                                                g8m.q();
                                                throw null;
                                            }
                                            lpm d;
                                            if (hashMap == null || (d = (lpm)((Map)hashMap).get((Object)r)) == null) {
                                                d = jpm.d(r2, r, r3);
                                            }
                                            if (d == null) {
                                                return new s7m(this);
                                            }
                                            if (!d.equals(r3)) {
                                                if (d.equals(r)) {
                                                    if (o == null) {
                                                        o = new ArrayList();
                                                    }
                                                    ((List)o).add((Object)new yog((Object)jpm, (Object)r.c(this.g())));
                                                    if (o2 == null) {
                                                        o2 = new ArrayList();
                                                    }
                                                    ((List)o2).add((Object)jpm);
                                                }
                                                else {
                                                    if (o == null) {
                                                        o = new ArrayList();
                                                    }
                                                    yog yog;
                                                    if (!d.equals(r2)) {
                                                        yog = new yog((Object)jpm, (Object)d);
                                                    }
                                                    else {
                                                        yog = new yog((Object)jpm, (Object)r2.c(this.g()));
                                                    }
                                                    ((List)o).add((Object)yog);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            n3 >>= 8;
                        }
                        final e8m e8m2 = j;
                        final Object[] array = b;
                        array2 = a2;
                        list = (List)o;
                        z0 = o2;
                        if (n4 != 8) {
                            break Label_0570;
                        }
                        array3 = array;
                        j = e8m2;
                    }
                    else {
                        final Object[] array4 = b;
                        array2 = a2;
                        array3 = array4;
                    }
                    if (n2 == n) {
                        list2 = (List)o;
                        break;
                    }
                    ++n2;
                    final long[] array5 = array2;
                    b = array3;
                    a2 = array5;
                }
            }
            else {
                list2 = null;
                o2 = null;
            }
            z0 = o2;
            list = list2;
        }
        if (list != null) {
            this.v();
            final int size = ((Collection)list).size();
            int k = 0;
            while (k < size) {
                final yog yog2 = (yog)list.get(k);
                final jpm jpm2 = (jpm)yog2.v;
                final lpm lpm = (lpm)yog2.w;
                lpm.a = a;
                final Object c = g8m.c;
                synchronized (c) {
                    lpm.b = jpm2.a();
                    jpm2.f(lpm);
                    monitorexit(c);
                    ++k;
                    continue;
                }
                break;
            }
        }
        if (z0 != null) {
            for (int size2 = ((Collection)z0).size(), l = 0; l < size2; ++l) {
                umf.l((Object)((List)z0).get(l));
            }
            final ArrayList m = this.i;
            if (m != null) {
                z0 = c86.Z0((Collection)m, (Iterable)z0);
            }
            this.i = (ArrayList)z0;
        }
        return t7m.e;
    }
}
