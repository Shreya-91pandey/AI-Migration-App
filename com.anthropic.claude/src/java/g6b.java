import android.graphics.Bitmap;
import android.graphics.Path;
import android.os.Build$VERSION;
import android.os.Build;
import android.graphics.Outline;
import android.graphics.RectF;

public final class g6b
{
    public static final fzc C;
    public boolean A;
    public RectF B;
    public final i6b a;
    public xc8 b;
    public qzc c;
    public lta d;
    public final k10 e;
    public Outline f;
    public boolean g;
    public long h;
    public long i;
    public float j;
    public k8e k;
    public g90 l;
    public g90 m;
    public boolean n;
    public z13 o;
    public y80 p;
    public int q;
    public final gb0 r;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    
    static {
        Object c;
        if (mlc.q((Object)Build.FINGERPRINT, (Object)"robolectric")) {
            c = hzn.F;
        }
        else if (Build$VERSION.SDK_INT >= 28) {
            c = vzq.A;
        }
        else {
            c = zyo.E;
        }
        C = (fzc)c;
    }
    
    public g6b(final i6b a) {
        this.a = a;
        this.b = (xc8)qt7.a;
        this.c = qzc.v;
        this.d = (lta)n10.W;
        this.e = new k10((Object)this, (byte)8);
        this.g = true;
        this.h = 0L;
        this.i = 9205357640488583168L;
        this.r = (gb0)new Object();
        a.G(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }
    
    public final void a() {
        if (this.g) {
            final boolean a = this.A;
            Outline outline = null;
            final i6b a2 = this.a;
            if (!a && a2.N() <= 0.0f) {
                a2.G(false);
                a2.g(null, 0L);
            }
            else {
                final g90 l = this.l;
                if (l != null) {
                    RectF b;
                    if ((b = this.B) == null) {
                        b = new RectF();
                        this.B = b;
                    }
                    final boolean b2 = l instanceof g90;
                    if (!b2) {
                        oyl.s("Unable to obtain android.graphics.Path");
                        return;
                    }
                    final Path a3 = l.a;
                    a3.computeBounds(b, false);
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    Outline f2;
                    if (sdk_INT <= 28 && !a3.isConvex()) {
                        final Outline f = this.f;
                        if (f != null) {
                            f.setEmpty();
                        }
                        this.n = true;
                        f2 = null;
                    }
                    else {
                        if ((f2 = this.f) == null) {
                            f2 = new Outline();
                            this.f = f2;
                        }
                        if (sdk_INT >= 30) {
                            if (!b2) {
                                oyl.s("Unable to obtain android.graphics.Path");
                                return;
                            }
                            p4.t(f2, a3);
                        }
                        else {
                            if (!b2) {
                                oyl.s("Unable to obtain android.graphics.Path");
                                return;
                            }
                            f2.setConvexPath(a3);
                        }
                        f2.offset(this.v, this.w);
                        this.n = (f2.canClip() ^ true);
                    }
                    this.l = l;
                    if (f2 != null) {
                        f2.setAlpha(a2.a());
                        outline = f2;
                    }
                    a2.g(outline, (0xFFFFFFFFL & (long)Math.round(b.height())) | (long)Math.round(b.width()) << 32);
                    if (this.n && this.A) {
                        a2.G(false);
                        a2.i();
                    }
                    else {
                        a2.G(this.A);
                    }
                }
                else {
                    a2.G(this.A);
                    Outline f3;
                    if ((f3 = this.f) == null) {
                        f3 = new Outline();
                        this.f = f3;
                    }
                    long z = uoo.Z(this.u);
                    final long h = this.h;
                    final long i = this.i;
                    if (i != 9205357640488583168L) {
                        z = i;
                    }
                    final int n = (int)(h >> 32);
                    final int round = Math.round(Float.intBitsToFloat(n));
                    final int n2 = (int)(h & 0xFFFFFFFFL);
                    f3.setRoundRect(round, Math.round(Float.intBitsToFloat(n2)), Math.round(Float.intBitsToFloat((int)(z >> 32)) + Float.intBitsToFloat(n)), Math.round(Float.intBitsToFloat((int)(0xFFFFFFFFL & z)) + Float.intBitsToFloat(n2)), this.j);
                    f3.setAlpha(a2.a());
                    a2.g(f3, uoo.X(z));
                }
            }
        }
        this.g = false;
    }
    
    public final void b() {
        if (this.s && this.q == 0) {
            final gb0 r = this.r;
            final g6b g6b = (g6b)r.w;
            if (g6b != null) {
                --g6b.q;
                g6b.b();
                r.w = null;
            }
            final umf umf = (umf)r.y;
            if (umf != null) {
                final Object[] b = umf.b;
                final long[] a = umf.a;
                final int n = a.length - 2;
                if (n >= 0) {
                    int n2 = 0;
                    while (true) {
                        long n3 = a[n2];
                        if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n4 = 8 - (~(n2 - n) >>> 31);
                            for (int i = 0; i < n4; ++i) {
                                if ((0xFFL & n3) < 128L) {
                                    final g6b g6b2 = (g6b)b[(n2 << 3) + i];
                                    --g6b2.q;
                                    g6b2.b();
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
                umf.b();
            }
            this.a.i();
        }
    }
    
    public final void c(final x13 p0, final g6b p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        g6b.s:Z
        //     4: ifeq            8
        //     7: return         
        //     8: aload_0        
        //     9: getfield        g6b.h:J
        //    12: lstore          15
        //    14: aload_1        
        //    15: invokestatic    g40.b:(Lx13;)Landroid/graphics/Canvas;
        //    18: astore          24
        //    20: aload           24
        //    22: invokevirtual   android/graphics/Canvas.isHardwareAccelerated:()Z
        //    25: istore          21
        //    27: aload_0        
        //    28: getfield        g6b.a:Li6b;
        //    31: astore          25
        //    33: iload           21
        //    35: ifne            360
        //    38: aload_0        
        //    39: getfield        g6b.t:J
        //    42: lstore          17
        //    44: lload           17
        //    46: bipush          32
        //    48: lshr           
        //    49: l2i            
        //    50: i2f            
        //    51: fstore          10
        //    53: fload           10
        //    55: aload_0        
        //    56: getfield        g6b.v:I
        //    59: i2f            
        //    60: fsub           
        //    61: fstore          7
        //    63: lload           17
        //    65: ldc2_w          4294967295
        //    68: land           
        //    69: l2i            
        //    70: i2f            
        //    71: fstore_3       
        //    72: fload_3        
        //    73: aload_0        
        //    74: getfield        g6b.w:I
        //    77: i2f            
        //    78: fsub           
        //    79: fstore          5
        //    81: aload_0        
        //    82: getfield        g6b.u:J
        //    85: lstore          17
        //    87: lload           17
        //    89: bipush          32
        //    91: lshr           
        //    92: l2i            
        //    93: i2f            
        //    94: fstore          11
        //    96: aload_0        
        //    97: getfield        g6b.x:I
        //   100: i2f            
        //   101: fstore          4
        //   103: lload           17
        //   105: ldc2_w          4294967295
        //   108: land           
        //   109: l2i            
        //   110: i2f            
        //   111: fstore          8
        //   113: aload_0        
        //   114: getfield        g6b.y:I
        //   117: i2f            
        //   118: fstore          6
        //   120: aload           25
        //   122: invokeinterface i6b.a:()F
        //   127: fstore          9
        //   129: aload           25
        //   131: invokeinterface i6b.m:()Lhe2;
        //   136: astore          26
        //   138: aload           25
        //   140: invokeinterface i6b.P:()I
        //   145: istore          12
        //   147: fload           9
        //   149: fconst_1       
        //   150: fcmpg          
        //   151: iflt            188
        //   154: iload           12
        //   156: iconst_3       
        //   157: if_icmpne       188
        //   160: aload           26
        //   162: ifnonnull       188
        //   165: aload           25
        //   167: invokeinterface i6b.l:()I
        //   172: iconst_1       
        //   173: if_icmpne       179
        //   176: goto            188
        //   179: aload           24
        //   181: invokevirtual   android/graphics/Canvas.save:()I
        //   184: pop            
        //   185: goto            265
        //   188: aload_0        
        //   189: getfield        g6b.p:Ly80;
        //   192: astore          23
        //   194: aload           23
        //   196: astore          22
        //   198: aload           23
        //   200: ifnonnull       214
        //   203: invokestatic    uoo.d:()Ly80;
        //   206: astore          22
        //   208: aload_0        
        //   209: aload           22
        //   211: putfield        g6b.p:Ly80;
        //   214: aload           22
        //   216: fload           9
        //   218: invokevirtual   y80.d:(F)V
        //   221: aload           22
        //   223: iload           12
        //   225: invokevirtual   y80.e:(I)V
        //   228: aload           22
        //   230: aload           26
        //   232: invokevirtual   y80.g:(Lhe2;)V
        //   235: aload           24
        //   237: fload           7
        //   239: fload           5
        //   241: fload           10
        //   243: fload           11
        //   245: fadd           
        //   246: fload           4
        //   248: fadd           
        //   249: fload_3        
        //   250: fload           8
        //   252: fadd           
        //   253: fload           6
        //   255: fadd           
        //   256: aload           22
        //   258: getfield        y80.a:Landroid/graphics/Paint;
        //   261: invokevirtual   android/graphics/Canvas.saveLayer:(FFFFLandroid/graphics/Paint;)I
        //   264: pop            
        //   265: aload           24
        //   267: fload           7
        //   269: fload           5
        //   271: invokevirtual   android/graphics/Canvas.translate:(FF)V
        //   274: aload           25
        //   276: invokeinterface i6b.L:()Landroid/graphics/Matrix;
        //   281: astore          22
        //   283: aload           22
        //   285: aload_0        
        //   286: getfield        g6b.v:I
        //   289: i2f            
        //   290: aload_0        
        //   291: getfield        g6b.w:I
        //   294: i2f            
        //   295: invokevirtual   android/graphics/Matrix.preTranslate:(FF)Z
        //   298: pop            
        //   299: aload           24
        //   301: aload           22
        //   303: invokevirtual   android/graphics/Canvas.concat:(Landroid/graphics/Matrix;)V
        //   306: aload_0        
        //   307: getfield        g6b.h:J
        //   310: lstore          17
        //   312: aload_0        
        //   313: getfield        g6b.v:I
        //   316: i2f            
        //   317: fstore_3       
        //   318: aload_0        
        //   319: getfield        g6b.w:I
        //   322: i2f            
        //   323: fstore          4
        //   325: fload_3        
        //   326: invokestatic    java/lang/Float.floatToRawIntBits:(F)I
        //   329: i2l            
        //   330: lstore          19
        //   332: aload_0        
        //   333: lload           17
        //   335: fload           4
        //   337: invokestatic    java/lang/Float.floatToRawIntBits:(F)I
        //   340: i2l            
        //   341: ldc2_w          4294967295
        //   344: land           
        //   345: lload           19
        //   347: bipush          32
        //   349: lshl           
        //   350: lor            
        //   351: invokestatic    l6g.h:(JJ)J
        //   354: putfield        g6b.h:J
        //   357: goto            360
        //   360: aload_0        
        //   361: invokevirtual   g6b.a:()V
        //   364: aload           25
        //   366: invokeinterface i6b.q:()Z
        //   371: ifne            409
        //   374: aload_0        
        //   375: getfield        g6b.b:Lxc8;
        //   378: astore          23
        //   380: aload_0        
        //   381: getfield        g6b.c:Lqzc;
        //   384: astore          22
        //   386: aload_0        
        //   387: getfield        g6b.e:Lk10;
        //   390: astore          26
        //   392: aload           25
        //   394: aload           23
        //   396: aload           22
        //   398: aload_0        
        //   399: aload           26
        //   401: invokeinterface i6b.p:(Lxc8;Lqzc;Lg6b;Lk10;)V
        //   406: goto            409
        //   409: aload           25
        //   411: invokeinterface i6b.N:()F
        //   416: fstore_3       
        //   417: iconst_0       
        //   418: istore          12
        //   420: fload_3        
        //   421: fconst_0       
        //   422: fcmpl          
        //   423: ifle            432
        //   426: iconst_1       
        //   427: istore          13
        //   429: goto            435
        //   432: iconst_0       
        //   433: istore          13
        //   435: iload           13
        //   437: ifeq            446
        //   440: aload_1        
        //   441: invokeinterface x13.s:()V
        //   446: iload           21
        //   448: ifne            464
        //   451: aload_0        
        //   452: getfield        g6b.A:Z
        //   455: ifeq            464
        //   458: iconst_1       
        //   459: istore          14
        //   461: goto            467
        //   464: iconst_0       
        //   465: istore          14
        //   467: iload           14
        //   469: ifeq            598
        //   472: aload_1        
        //   473: invokeinterface x13.g:()V
        //   478: aload_0        
        //   479: invokevirtual   g6b.e:()Lk8e;
        //   482: astore          23
        //   484: aload           23
        //   486: instanceof      Lrig;
        //   489: ifeq            507
        //   492: aload_1        
        //   493: aload           23
        //   495: checkcast       Lrig;
        //   498: getfield        rig.e:Lk2j;
        //   501: invokestatic    x13.q:(Lx13;Lk2j;)V
        //   504: goto            598
        //   507: aload           23
        //   509: instanceof      Lsig;
        //   512: ifeq            569
        //   515: aload_0        
        //   516: getfield        g6b.m:Lg90;
        //   519: astore          22
        //   521: aload           22
        //   523: ifnull          534
        //   526: aload           22
        //   528: invokevirtual   g90.l:()V
        //   531: goto            545
        //   534: invokestatic    j90.a:()Lg90;
        //   537: astore          22
        //   539: aload_0        
        //   540: aload           22
        //   542: putfield        g6b.m:Lg90;
        //   545: aload           22
        //   547: aload           23
        //   549: checkcast       Lsig;
        //   552: getfield        sig.e:Llvj;
        //   555: invokestatic    g90.e:(Lg90;Llvj;)V
        //   558: aload_1        
        //   559: aload           22
        //   561: invokeinterface x13.l:(Lg90;)V
        //   566: goto            598
        //   569: aload           23
        //   571: instanceof      Lqig;
        //   574: ifeq            594
        //   577: aload_1        
        //   578: aload           23
        //   580: checkcast       Lqig;
        //   583: getfield        qig.e:Lg90;
        //   586: invokeinterface x13.l:(Lg90;)V
        //   591: goto            598
        //   594: invokestatic    en9.r:()V
        //   597: return         
        //   598: aload_2        
        //   599: ifnull          781
        //   602: aload_2        
        //   603: getfield        g6b.r:Lgb0;
        //   606: astore_2       
        //   607: aload_2        
        //   608: getfield        gb0.v:Z
        //   611: ifne            620
        //   614: ldc_w           "Only add dependencies during a tracking"
        //   617: invokestatic    fac.a:(Ljava/lang/String;)V
        //   620: aload_2        
        //   621: getfield        gb0.y:Ljava/lang/Object;
        //   624: checkcast       Lumf;
        //   627: astore          22
        //   629: aload           22
        //   631: ifnull          644
        //   634: aload           22
        //   636: aload_0        
        //   637: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //   640: pop            
        //   641: goto            717
        //   644: aload_2        
        //   645: getfield        gb0.w:Ljava/lang/Object;
        //   648: checkcast       Lg6b;
        //   651: ifnull          712
        //   654: getstatic       kak.a:Lumf;
        //   657: astore          22
        //   659: new             Lumf;
        //   662: dup            
        //   663: invokespecial   umf.<init>:()V
        //   666: astore          22
        //   668: aload_2        
        //   669: getfield        gb0.w:Ljava/lang/Object;
        //   672: checkcast       Lg6b;
        //   675: astore          23
        //   677: aload           23
        //   679: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   682: pop            
        //   683: aload           22
        //   685: aload           23
        //   687: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //   690: pop            
        //   691: aload           22
        //   693: aload_0        
        //   694: invokevirtual   umf.a:(Ljava/lang/Object;)Z
        //   697: pop            
        //   698: aload_2        
        //   699: aload           22
        //   701: putfield        gb0.y:Ljava/lang/Object;
        //   704: aload_2        
        //   705: aconst_null    
        //   706: putfield        gb0.w:Ljava/lang/Object;
        //   709: goto            717
        //   712: aload_2        
        //   713: aload_0        
        //   714: putfield        gb0.w:Ljava/lang/Object;
        //   717: aload_2        
        //   718: getfield        gb0.z:Ljava/lang/Object;
        //   721: checkcast       Lumf;
        //   724: astore          22
        //   726: aload           22
        //   728: ifnull          744
        //   731: aload           22
        //   733: aload_0        
        //   734: invokevirtual   umf.l:(Ljava/lang/Object;)Z
        //   737: iconst_1       
        //   738: ixor           
        //   739: istore          12
        //   741: goto            766
        //   744: aload_2        
        //   745: getfield        gb0.x:Ljava/lang/Object;
        //   748: checkcast       Lg6b;
        //   751: aload_0        
        //   752: if_acmpeq       761
        //   755: iconst_1       
        //   756: istore          12
        //   758: goto            766
        //   761: aload_2        
        //   762: aconst_null    
        //   763: putfield        gb0.x:Ljava/lang/Object;
        //   766: iload           12
        //   768: ifeq            781
        //   771: aload_0        
        //   772: aload_0        
        //   773: getfield        g6b.q:I
        //   776: iconst_1       
        //   777: iadd           
        //   778: putfield        g6b.q:I
        //   781: aload_1        
        //   782: checkcast       Lf40;
        //   785: getfield        f40.a:Landroid/graphics/Canvas;
        //   788: invokevirtual   android/graphics/Canvas.isHardwareAccelerated:()Z
        //   791: ifne            1018
        //   794: aload_0        
        //   795: getfield        g6b.o:Lz13;
        //   798: astore          22
        //   800: aload           22
        //   802: astore_2       
        //   803: aload           22
        //   805: ifnonnull       821
        //   808: new             Lz13;
        //   811: dup            
        //   812: invokespecial   z13.<init>:()V
        //   815: astore_2       
        //   816: aload_0        
        //   817: aload_2        
        //   818: putfield        g6b.o:Lz13;
        //   821: aload_2        
        //   822: getfield        z13.w:Lzn0;
        //   825: astore          22
        //   827: aload_0        
        //   828: getfield        g6b.b:Lxc8;
        //   831: astore          29
        //   833: aload_0        
        //   834: getfield        g6b.c:Lqzc;
        //   837: astore          28
        //   839: aload_0        
        //   840: getfield        g6b.u:J
        //   843: invokestatic    uoo.Z:(J)J
        //   846: lstore          19
        //   848: aload           22
        //   850: invokevirtual   zn0.w:()Lxc8;
        //   853: astore          23
        //   855: aload           22
        //   857: invokevirtual   zn0.y:()Lqzc;
        //   860: astore          27
        //   862: aload           22
        //   864: invokevirtual   zn0.t:()Lx13;
        //   867: astore          26
        //   869: aload           22
        //   871: invokevirtual   zn0.A:()J
        //   874: lstore          17
        //   876: aload           22
        //   878: getfield        zn0.w:Ljava/lang/Object;
        //   881: checkcast       Lg6b;
        //   884: astore          25
        //   886: aload           22
        //   888: aload           29
        //   890: invokevirtual   zn0.H:(Lxc8;)V
        //   893: aload           22
        //   895: aload           28
        //   897: invokevirtual   zn0.I:(Lqzc;)V
        //   900: aload           22
        //   902: aload_1        
        //   903: invokevirtual   zn0.G:(Lx13;)V
        //   906: aload           22
        //   908: lload           19
        //   910: invokevirtual   zn0.J:(J)V
        //   913: aload           22
        //   915: aload_0        
        //   916: putfield        zn0.w:Ljava/lang/Object;
        //   919: aload_1        
        //   920: invokeinterface x13.g:()V
        //   925: aload_0        
        //   926: aload_2        
        //   927: invokevirtual   g6b.d:(Lcw8;)V
        //   930: aload_1        
        //   931: invokeinterface x13.p:()V
        //   936: aload           22
        //   938: aload           23
        //   940: invokevirtual   zn0.H:(Lxc8;)V
        //   943: aload           22
        //   945: aload           27
        //   947: invokevirtual   zn0.I:(Lqzc;)V
        //   950: aload           22
        //   952: aload           26
        //   954: invokevirtual   zn0.G:(Lx13;)V
        //   957: aload           22
        //   959: lload           17
        //   961: invokevirtual   zn0.J:(J)V
        //   964: aload           22
        //   966: aload           25
        //   968: putfield        zn0.w:Ljava/lang/Object;
        //   971: goto            1026
        //   974: astore_2       
        //   975: aload_1        
        //   976: invokeinterface x13.p:()V
        //   981: aload           22
        //   983: aload           23
        //   985: invokevirtual   zn0.H:(Lxc8;)V
        //   988: aload           22
        //   990: aload           27
        //   992: invokevirtual   zn0.I:(Lqzc;)V
        //   995: aload           22
        //   997: aload           26
        //   999: invokevirtual   zn0.G:(Lx13;)V
        //  1002: aload           22
        //  1004: lload           17
        //  1006: invokevirtual   zn0.J:(J)V
        //  1009: aload           22
        //  1011: aload           25
        //  1013: putfield        zn0.w:Ljava/lang/Object;
        //  1016: aload_2        
        //  1017: athrow         
        //  1018: aload           25
        //  1020: aload_1        
        //  1021: invokeinterface i6b.k:(Lx13;)V
        //  1026: iload           14
        //  1028: ifeq            1037
        //  1031: aload_1        
        //  1032: invokeinterface x13.p:()V
        //  1037: iload           13
        //  1039: ifeq            1048
        //  1042: aload_1        
        //  1043: invokeinterface x13.i:()V
        //  1048: iload           21
        //  1050: ifne            1058
        //  1053: aload           24
        //  1055: invokevirtual   android/graphics/Canvas.restore:()V
        //  1058: aload_0        
        //  1059: lload           15
        //  1061: putfield        g6b.h:J
        //  1064: return         
        //  1065: astore          22
        //  1067: goto            409
        //  1070: astore          22
        //  1072: goto            409
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  374    392    1065   1070   Any
        //  392    406    1070   1075   Any
        //  925    930    974    1018   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0409:
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
    
    public final void d(final cw8 cw8) {
        final gb0 r = this.r;
        r.x = r.w;
        final umf umf = (umf)r.y;
        if (umf != null && umf.h()) {
            umf z;
            if ((z = (umf)r.z) == null) {
                final umf a = kak.a;
                z = new umf();
                r.z = z;
            }
            z.j(umf);
            umf.b();
        }
        r.v = true;
        this.d.b((Object)cw8);
        r.v = false;
        final g6b g6b = (g6b)r.x;
        if (g6b != null) {
            --g6b.q;
            g6b.b();
        }
        final umf umf2 = (umf)r.z;
        if (umf2 != null && umf2.h()) {
            final Object[] b = umf2.b;
            final long[] a2 = umf2.a;
            final int n = a2.length - 2;
            if (n >= 0) {
                int n2 = 0;
                while (true) {
                    long n3 = a2[n2];
                    if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n4 = 8 - (~(n2 - n) >>> 31);
                        for (int i = 0; i < n4; ++i) {
                            if ((0xFFL & n3) < 128L) {
                                final g6b g6b2 = (g6b)b[(n2 << 3) + i];
                                --g6b2.q;
                                g6b2.b();
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
            umf2.b();
        }
    }
    
    public final k8e e() {
        final k8e k = this.k;
        final g90 l = this.l;
        if (k != null) {
            return k;
        }
        if (l != null) {
            return this.k = new qig(l);
        }
        long z = uoo.Z(this.u);
        final long h = this.h;
        final long i = this.i;
        if (i != 9205357640488583168L) {
            z = i;
        }
        final float intBitsToFloat = Float.intBitsToFloat((int)(h >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(h & 0xFFFFFFFFL));
        final float n = Float.intBitsToFloat((int)(z >> 32)) + intBitsToFloat;
        final float n2 = Float.intBitsToFloat((int)(z & 0xFFFFFFFFL)) + intBitsToFloat2;
        final float j = this.j;
        k8e m;
        if (j > 0.0f) {
            m = new sig(t08.p(intBitsToFloat, intBitsToFloat2, n, n2, (long)Float.floatToRawIntBits(j) << 32 | (0xFFFFFFFFL & (long)Float.floatToRawIntBits(j))));
        }
        else {
            m = new rig(new k2j(intBitsToFloat, intBitsToFloat2, n, n2));
        }
        return this.k = m;
    }
    
    public final void f(final xc8 b, final qzc c, final long u, final lta d) {
        final boolean b2 = chc.b(this.u, u);
        final i6b a = this.a;
        if (!b2) {
            this.u = u;
            final long t = this.t;
            a.j((int)(t >> 32), u, (int)(t & 0xFFFFFFFFL));
            if (this.i == 9205357640488583168L) {
                this.g = true;
                this.a();
            }
        }
        this.b = b;
        this.c = c;
        this.d = d;
        a.p(b, c, this, this.e);
    }
    
    public final void g(final float n) {
        final i6b a = this.a;
        if (a.a() == n) {
            return;
        }
        a.v(n);
    }
    
    public final void h(final float j, long i, final long k) {
        i = l6g.i(i, ((long)Float.floatToRawIntBits((float)this.w) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits((float)this.v) << 32);
        if (l6g.c(this.h, i) && yzl.b(this.i, k) && this.j == j && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = i;
        this.i = k;
        this.j = j;
        this.a();
    }
    
    public final Object i(final h07 h07) {
        Object o = null;
        Label_0049: {
            if (h07 instanceof f6b) {
                final f6b f6b = (f6b)h07;
                final int x = f6b.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    f6b.x = x + Integer.MIN_VALUE;
                    o = f6b;
                    break Label_0049;
                }
            }
            o = new f6b(this, h07);
        }
        final Object v = ((f6b)o).v;
        final int x2 = ((f6b)o).x;
        Object o2;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            o2 = v;
        }
        else {
            vt4.g0(v);
            ((f6b)o).x = 1;
            final Object m = g6b.C.m(this, (f07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = m) == v2) {
                return v2;
            }
        }
        return new n70((Bitmap)o2);
    }
}
