import java.util.List;
import java.util.Collection;

public final class vrl implements ezc, f8j
{
    public final ksg A;
    public final ksg B;
    public final ksg C;
    public final ksg D;
    public boolean E;
    public g90 F;
    public vrl G;
    public zql H;
    public final ksg I;
    public final ksg v;
    public final gsg w;
    public final ksg x;
    public final ksg y;
    public final ksg z;
    
    public vrl(final url url, final fj2 fj2, final ctl ctl, final boolean b, final atl atl, final etl etl, final float n) {
        this.v = o50.Q(Boolean.FALSE);
        this.w = new gsg(n);
        this.x = o50.Q(Boolean.TRUE);
        this.y = o50.Q(url);
        this.z = o50.Q(fj2);
        this.A = o50.Q(ctl);
        this.B = o50.Q(b);
        this.C = o50.Q(atl);
        this.D = o50.Q(etl);
        this.I = o50.Q(null);
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void b() {
        final itl b = this.h().b;
        final url h = this.h();
        h.d.setValue((Object)c86.X0((Iterable)h.b(), (Object)this));
        h.e.setValue((Object)c86.X0((Iterable)h.c(), (Object)this));
        h.f();
        b.e();
        b.D.k(this);
        final hsg c = b.C;
        c.i(c.h() + 1);
        if (h.b().isEmpty()) {
            rhc.G(h.b.w, null, 0, (zta)new lrl((Object)h, (Object)this, (f07)null, (byte)1), 3);
        }
        this.h().c.b();
    }
    
    @Override
    public final void c(final k0d p0, final d6b p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        k0d.v:Lz13;
        //     4: astore          15
        //     6: aload_0        
        //     7: invokevirtual   vrl.j:()Z
        //    10: istore          14
        //    12: aload_0        
        //    13: getfield        vrl.I:Lksg;
        //    16: astore          16
        //    18: iload           14
        //    20: ifeq            45
        //    23: aload           16
        //    25: invokevirtual   ksg.getValue:()Ljava/lang/Object;
        //    28: checkcast       Lg6b;
        //    31: ifnonnull       45
        //    34: aload           16
        //    36: aload_2        
        //    37: invokeinterface d6b.c:()Lg6b;
        //    42: invokevirtual   ksg.setValue:(Ljava/lang/Object;)V
        //    45: aload           16
        //    47: invokevirtual   ksg.getValue:()Ljava/lang/Object;
        //    50: checkcast       Lg6b;
        //    53: astore          16
        //    55: aload           16
        //    57: ifnonnull       63
        //    60: goto            709
        //    63: aload_0        
        //    64: invokevirtual   vrl.h:()Lurl;
        //    67: getfield        url.c:Lrtl;
        //    70: invokevirtual   rtl.a:()Lqtl;
        //    73: invokevirtual   qtl.c:()Lk2j;
        //    76: astore_2       
        //    77: aload_2        
        //    78: ifnonnull       84
        //    81: goto            709
        //    84: aload_0        
        //    85: invokevirtual   vrl.j:()Z
        //    88: ifeq            709
        //    91: aload_2        
        //    92: invokevirtual   k2j.h:()J
        //    95: lstore          8
        //    97: lload           8
        //    99: bipush          32
        //   101: lshr           
        //   102: l2i            
        //   103: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   106: fstore          6
        //   108: lload           8
        //   110: ldc2_w          4294967295
        //   113: land           
        //   114: l2i            
        //   115: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   118: fstore          7
        //   120: aload_0        
        //   121: invokevirtual   vrl.f:()Lhsl;
        //   124: astore          17
        //   126: aload           17
        //   128: ifnull          140
        //   131: aload           17
        //   133: getfield        hsl.e:Lnzc;
        //   136: astore_2       
        //   137: goto            142
        //   140: aconst_null    
        //   141: astore_2       
        //   142: aload_0        
        //   143: invokevirtual   vrl.h:()Lurl;
        //   146: getfield        url.b:Litl;
        //   149: getfield        itl.A:Lnzc;
        //   152: astore          19
        //   154: aload           19
        //   156: ifnull          703
        //   159: fconst_1       
        //   160: fstore_3       
        //   161: aload           17
        //   163: ifnull          320
        //   166: aload           17
        //   168: getfield        hsl.c:Lbyl;
        //   171: astore          18
        //   173: aload           17
        //   175: invokevirtual   hsl.d:()Z
        //   178: iconst_1       
        //   179: if_icmpne       320
        //   182: aload_2        
        //   183: ifnull          320
        //   186: aload_2        
        //   187: invokeinterface nzc.p:()Z
        //   192: ifeq            320
        //   195: aload           19
        //   197: invokeinterface nzc.p:()Z
        //   202: ifeq            320
        //   205: aload           18
        //   207: getfield        byl.y:Ljava/lang/Object;
        //   210: checkcast       Lksg;
        //   213: invokevirtual   ksg.getValue:()Ljava/lang/Object;
        //   216: checkcast       Ljava/lang/Boolean;
        //   219: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   222: ifeq            237
        //   225: aload           18
        //   227: getfield        byl.v:Ljava/lang/Object;
        //   230: checkcast       Lgsg;
        //   233: invokevirtual   gsg.h:()F
        //   236: fstore_3       
        //   237: aload           18
        //   239: getfield        byl.z:Ljava/lang/Object;
        //   242: checkcast       Lksg;
        //   245: invokevirtual   ksg.getValue:()Ljava/lang/Object;
        //   248: checkcast       Ljava/lang/Boolean;
        //   251: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   254: ifeq            279
        //   257: aload           18
        //   259: getfield        byl.A:Ljava/lang/Object;
        //   262: checkcast       Lksg;
        //   265: invokevirtual   ksg.getValue:()Ljava/lang/Object;
        //   268: checkcast       Ljeo;
        //   271: getfield        jeo.a:J
        //   274: lstore          8
        //   276: goto            284
        //   279: getstatic       jeo.b:J
        //   282: lstore          8
        //   284: aload_2        
        //   285: aload           19
        //   287: lload           8
        //   289: invokestatic    srl.a:(Lnzc;Lnzc;J)J
        //   292: lstore          8
        //   294: lload           8
        //   296: bipush          32
        //   298: lshr           
        //   299: l2i            
        //   300: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   303: fstore          5
        //   305: lload           8
        //   307: ldc2_w          4294967295
        //   310: land           
        //   311: l2i            
        //   312: invokestatic    java/lang/Float.intBitsToFloat:(I)F
        //   315: fstore          4
        //   317: goto            326
        //   320: fconst_0       
        //   321: fstore          5
        //   323: fconst_0       
        //   324: fstore          4
        //   326: aload_0        
        //   327: getfield        vrl.F:Lg90;
        //   330: astore          18
        //   332: aload           15
        //   334: getfield        z13.w:Lzn0;
        //   337: getfield        zn0.v:Ljava/lang/Object;
        //   340: checkcast       Ljy7;
        //   343: fconst_0       
        //   344: fconst_0       
        //   345: invokevirtual   jy7.G:(FF)V
        //   348: fload           5
        //   350: invokestatic    java/lang/Float.floatToRawIntBits:(F)I
        //   353: i2l            
        //   354: lstore          12
        //   356: fload           4
        //   358: invokestatic    java/lang/Float.floatToRawIntBits:(F)I
        //   361: i2l            
        //   362: lstore          10
        //   364: aload           15
        //   366: getfield        z13.w:Lzn0;
        //   369: astore_2       
        //   370: aload_2        
        //   371: invokevirtual   zn0.A:()J
        //   374: lstore          8
        //   376: aload_2        
        //   377: invokevirtual   zn0.t:()Lx13;
        //   380: invokeinterface x13.g:()V
        //   385: aload_2        
        //   386: getfield        zn0.v:Ljava/lang/Object;
        //   389: checkcast       Ljy7;
        //   392: lload           12
        //   394: bipush          32
        //   396: lshl           
        //   397: lload           10
        //   399: ldc2_w          4294967295
        //   402: land           
        //   403: lor            
        //   404: fload_3        
        //   405: fload_3        
        //   406: invokevirtual   jy7.D:(JFF)V
        //   409: aload           18
        //   411: ifnull          565
        //   414: aload           15
        //   416: getfield        z13.w:Lzn0;
        //   419: astore          17
        //   421: aload           17
        //   423: invokevirtual   zn0.A:()J
        //   426: lstore          10
        //   428: aload           17
        //   430: invokevirtual   zn0.t:()Lx13;
        //   433: invokeinterface x13.g:()V
        //   438: aload           17
        //   440: getfield        zn0.v:Ljava/lang/Object;
        //   443: checkcast       Ljy7;
        //   446: aload           18
        //   448: invokevirtual   jy7.k:(Lg90;)V
        //   451: aload           15
        //   453: getfield        z13.w:Lzn0;
        //   456: getfield        zn0.v:Ljava/lang/Object;
        //   459: checkcast       Ljy7;
        //   462: fload           6
        //   464: fload           7
        //   466: invokevirtual   jy7.G:(FF)V
        //   469: aload_1        
        //   470: aload           16
        //   472: invokestatic    r9n.p:(Lcw8;Lg6b;)V
        //   475: aload           15
        //   477: getfield        z13.w:Lzn0;
        //   480: getfield        zn0.v:Ljava/lang/Object;
        //   483: checkcast       Ljy7;
        //   486: fload           6
        //   488: fneg           
        //   489: fload           7
        //   491: fneg           
        //   492: invokevirtual   jy7.G:(FF)V
        //   495: aload           17
        //   497: invokevirtual   zn0.t:()Lx13;
        //   500: invokeinterface x13.p:()V
        //   505: aload           17
        //   507: lload           10
        //   509: invokevirtual   zn0.J:(J)V
        //   512: goto            609
        //   515: astore_1       
        //   516: goto            668
        //   519: astore_1       
        //   520: goto            546
        //   523: astore_1       
        //   524: aload           15
        //   526: getfield        z13.w:Lzn0;
        //   529: getfield        zn0.v:Ljava/lang/Object;
        //   532: checkcast       Ljy7;
        //   535: fload           6
        //   537: fneg           
        //   538: fload           7
        //   540: fneg           
        //   541: invokevirtual   jy7.G:(FF)V
        //   544: aload_1        
        //   545: athrow         
        //   546: aload           17
        //   548: invokevirtual   zn0.t:()Lx13;
        //   551: invokeinterface x13.p:()V
        //   556: aload           17
        //   558: lload           10
        //   560: invokevirtual   zn0.J:(J)V
        //   563: aload_1        
        //   564: athrow         
        //   565: aload           15
        //   567: getfield        z13.w:Lzn0;
        //   570: getfield        zn0.v:Ljava/lang/Object;
        //   573: checkcast       Ljy7;
        //   576: fload           6
        //   578: fload           7
        //   580: invokevirtual   jy7.G:(FF)V
        //   583: aload_1        
        //   584: aload           16
        //   586: invokestatic    r9n.p:(Lcw8;Lg6b;)V
        //   589: aload           15
        //   591: getfield        z13.w:Lzn0;
        //   594: getfield        zn0.v:Ljava/lang/Object;
        //   597: checkcast       Ljy7;
        //   600: fload           6
        //   602: fneg           
        //   603: fload           7
        //   605: fneg           
        //   606: invokevirtual   jy7.G:(FF)V
        //   609: aload_2        
        //   610: invokevirtual   zn0.t:()Lx13;
        //   613: invokeinterface x13.p:()V
        //   618: aload_2        
        //   619: lload           8
        //   621: invokevirtual   zn0.J:(J)V
        //   624: aload           15
        //   626: getfield        z13.w:Lzn0;
        //   629: getfield        zn0.v:Ljava/lang/Object;
        //   632: checkcast       Ljy7;
        //   635: fconst_0       
        //   636: fconst_0       
        //   637: invokevirtual   jy7.G:(FF)V
        //   640: return         
        //   641: astore_1       
        //   642: goto            685
        //   645: astore_1       
        //   646: aload           15
        //   648: getfield        z13.w:Lzn0;
        //   651: getfield        zn0.v:Ljava/lang/Object;
        //   654: checkcast       Ljy7;
        //   657: fload           6
        //   659: fneg           
        //   660: fload           7
        //   662: fneg           
        //   663: invokevirtual   jy7.G:(FF)V
        //   666: aload_1        
        //   667: athrow         
        //   668: aload_2        
        //   669: invokevirtual   zn0.t:()Lx13;
        //   672: invokeinterface x13.p:()V
        //   677: aload_2        
        //   678: lload           8
        //   680: invokevirtual   zn0.J:(J)V
        //   683: aload_1        
        //   684: athrow         
        //   685: aload           15
        //   687: getfield        z13.w:Lzn0;
        //   690: getfield        zn0.v:Ljava/lang/Object;
        //   693: checkcast       Ljy7;
        //   696: fconst_0       
        //   697: fconst_0       
        //   698: invokevirtual   jy7.G:(FF)V
        //   701: aload_1        
        //   702: athrow         
        //   703: ldc_w           "Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead."
        //   706: invokestatic    en9.s:(Ljava/lang/String;)V
        //   709: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  348    385    641    645    Any
        //  385    409    515    519    Any
        //  414    438    515    519    Any
        //  438    469    519    523    Any
        //  469    475    523    546    Any
        //  475    495    519    523    Any
        //  495    512    515    519    Any
        //  524    546    519    523    Any
        //  546    565    515    519    Any
        //  565    583    515    519    Any
        //  583    589    645    668    Any
        //  589    609    515    519    Any
        //  609    624    641    645    Any
        //  646    668    515    519    Any
        //  668    685    641    645    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 314 out of bounds for length 314
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.util.Objects.checkIndex(Objects.java:371)
        //     at java.util.ArrayList.get(ArrayList.java:435)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:284)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2125)
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
    
    @Override
    public final void d() {
        final itl b = this.h().b;
        final hsg c = b.C;
        final url h = this.h();
        h.d.setValue((Object)c86.a1((Collection)h.b(), (Object)this));
        h.f();
        b.e();
        final emf d = b.D;
        final Object[] a = d.a;
        while (true) {
            for (int b2 = d.b, i = 0; i < b2; ++i) {
                final ezc ezc = (ezc)a[i];
                final boolean b3 = ezc instanceof vrl;
                Object h2 = null;
                vrl vrl;
                if (b3) {
                    vrl = (vrl)ezc;
                }
                else {
                    vrl = null;
                }
                if (vrl != null) {
                    h2 = vrl.h();
                }
                if (mlc.q(h2, this.h())) {
                    if (i != -1 && i < d.b - 1) {
                        d.a(i + 1, this);
                    }
                    else {
                        d.b(this);
                    }
                    c.i(c.h() + 1);
                    this.h().c.b();
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    @Override
    public final float e() {
        return this.w.h();
    }
    
    public final hsl f() {
        this.l().b.getValue().getClass();
        final zql h = this.H;
        final vrl vrl = null;
        hsl o1;
        if (h != null) {
            o1 = h.o1();
        }
        else {
            o1 = null;
        }
        boolean k;
        if (this.n()) {
            k = !this.k();
        }
        else {
            k = this.k();
        }
        if (k) {
            final List c = this.h().c();
            final int size = ((Collection)c).size();
            int n = 0;
            Object value;
            while (true) {
                value = vrl;
                if (n >= size) {
                    break;
                }
                value = c.get(n);
                final vrl vrl2 = (vrl)value;
                final boolean n2 = vrl2.n();
                int i = vrl2.k() ? 1 : 0;
                if (!n2) {
                    if (i == 0) {
                        i = 1;
                    }
                    else {
                        i = 0;
                    }
                }
                if (i != 0) {
                    break;
                }
                ++n;
            }
            final vrl vrl3 = (vrl)value;
            if (vrl3 != null) {
                final zql h2 = vrl3.H;
                if (h2 != null) {
                    final hsl o2 = h2.o1();
                    if (o2 != null) {
                        return o2;
                    }
                }
            }
        }
        return o1;
    }
    
    public final fj2 g() {
        return (fj2)this.z.getValue();
    }
    
    public final url h() {
        return (url)this.y.getValue();
    }
    
    public final boolean i() {
        return this.g().b() || (this.h().c.a().d() && !this.h().c.a().b()) || !(boolean)this.B.getValue();
    }
    
    public final boolean j() {
        return this.i() && this.h().c.a().d() && this.m() && (boolean)this.x.getValue() && (this.h().b.a() || this.n());
    }
    
    public final boolean k() {
        return this.g().b();
    }
    
    public final etl l() {
        return (etl)this.D.getValue();
    }
    
    public final boolean m() {
        final etl l = this.l();
        if (this.v.getValue()) {
            l.b.getValue().getClass();
            return true;
        }
        return false;
    }
    
    public final boolean n() {
        final zql h = this.H;
        if (h != null) {
            final hsl o1 = h.o1();
            if (o1 != null && o1.d()) {
                return true;
            }
        }
        return false;
    }
}
