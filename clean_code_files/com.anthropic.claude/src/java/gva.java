import java.util.Arrays;
import java.util.HashSet;
import android.os.Trace;
import java.util.Comparator;
import java.util.Set;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public final class gva
{
    public int A;
    public int B;
    public boolean C;
    public final fva D;
    public final ArrayList E;
    public boolean F;
    public u5m G;
    public v5m H;
    public y5m I;
    public boolean J;
    public e3h K;
    public fd3 L;
    public final mi6 M;
    public bva N;
    public wga O;
    public vwl P;
    public final wl6 Q;
    public final hc7 R;
    public boolean S;
    public long T;
    public hva U;
    public final v a;
    public final tl6 b;
    public final v5m c;
    public final xmf d;
    public final fd3 e;
    public final fd3 f;
    public final j9j g;
    public final yl6 h;
    public final ArrayList i;
    public jva j;
    public int k;
    public int l;
    public int m;
    public final dhc n;
    public int[] o;
    public hlf p;
    public boolean q;
    public boolean r;
    public final ArrayList s;
    public final dhc t;
    public e3h u;
    public jlf v;
    public boolean w;
    public final dhc x;
    public boolean y;
    public int z;
    
    public gva(v a, final tl6 b, final v5m c, final xmf d, final fd3 e, final fd3 f, final j9j g, final yl6 h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = new ArrayList();
        this.n = new dhc((byte)1);
        this.s = new ArrayList();
        this.t = new dhc((byte)1);
        this.u = e3h.y;
        this.x = new dhc((byte)1);
        this.z = -1;
        this.C = (b.g() || b.e());
        this.D = new fva(this, (byte)0);
        this.E = new ArrayList();
        final u5m m = c.m();
        m.c();
        this.G = m;
        final v5m h2 = new v5m();
        if (b.g()) {
            h2.d();
        }
        if (b.e()) {
            h2.F = new jlf();
        }
        this.H = h2;
        final y5m o = h2.o();
        o.e(true);
        this.I = o;
        this.M = new mi6(this, e);
        a = (v)this.H.m();
        try {
            final bva a2 = ((u5m)a).a(0);
            ((u5m)a).c();
            this.N = a2;
            this.O = new wga();
            this.Q = new wl6(this);
            final hc7 k = b.k();
            a = (v)this.D();
            if (a == null) {
                a = (v)o89.v;
            }
            this.R = k.F0((hc7)a);
        }
        finally {
            ((u5m)a).c();
        }
    }
    
    public static final iif T(final int n, final gva gva) {
        final int i = gva.G.i(n);
        final u5m g = gva.G;
        final Object p2 = g.p(g.b, n);
        if (i == 126665345 && p2 instanceof gif) {
            ArrayList list = null;
            Label_0083: {
                if (gva.G.d(n)) {
                    list = new ArrayList();
                    U(gva, list, n);
                    if (!list.isEmpty()) {
                        break Label_0083;
                    }
                }
                list = null;
            }
            final u5m g2 = gva.G;
            final Object p3 = g2.p(g2.b, n);
            p3.getClass();
            final gif gif = (gif)p3;
            final Object h = gva.G.h(n, 0);
            final bva a = gva.G.a(n);
            final int n2 = gva.G.b[n * 5 + 3];
            final ArrayList list2 = new ArrayList();
            final ArrayList s = gva.s;
            int j;
            final int n3 = j = r9n.s(n, (List)s);
            if (n3 < 0) {
                j = -(n3 + 1);
            }
            while (j < s.size()) {
                final bmc bmc = (bmc)s.get(j);
                if (bmc.b >= n2 + n) {
                    break;
                }
                list2.add((Object)new yog((Object)bmc.a, bmc.c));
                ++j;
            }
            return new iif(gif, h, gva.h, gva.c, a, (List)list2, gva.m(n), list);
        }
        return null;
    }
    
    public static final void U(final gva gva, final ArrayList list, final int n) {
        for (int n2 = gva.G.b[n * 5 + 3], i = n + 1; i < n2 + n; i += gva.G.b[i * 5 + 3]) {
            if (gva.G.j(i)) {
                final iif t = T(i, gva);
                if (t != null) {
                    list.add((Object)t);
                }
            }
            else if (gva.G.d(i)) {
                U(gva, list, i);
            }
        }
    }
    
    public static final int V(final gva p0, final int p1, final int p2, final boolean p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gva.G:Lu5m;
        //     4: astore          15
        //     6: aload           15
        //     8: iload_2        
        //     9: invokevirtual   u5m.j:(I)Z
        //    12: istore          9
        //    14: iconst_0       
        //    15: istore          5
        //    17: iload           9
        //    19: ifeq            779
        //    22: aload           15
        //    24: iload_2        
        //    25: invokevirtual   u5m.i:(I)I
        //    28: istore          6
        //    30: aload           15
        //    32: aload           15
        //    34: getfield        u5m.b:[I
        //    37: iload_2        
        //    38: invokevirtual   u5m.p:([II)Ljava/lang/Object;
        //    41: astore          13
        //    43: iload           6
        //    45: ldc             126665345
        //    47: if_icmpne       208
        //    50: aload           13
        //    52: instanceof      Lgif;
        //    55: ifeq            208
        //    58: iload_2        
        //    59: aload_0        
        //    60: invokestatic    gva.T:(ILgva;)Liif;
        //    63: astore          16
        //    65: aload           16
        //    67: ifnull          133
        //    70: aload_0        
        //    71: getfield        gva.b:Ltl6;
        //    74: aload           16
        //    76: invokevirtual   tl6.c:(Liif;)V
        //    79: aload_0        
        //    80: getfield        gva.M:Lmi6;
        //    83: invokevirtual   mi6.e:()V
        //    86: aload_0        
        //    87: getfield        gva.M:Lmi6;
        //    90: astore          17
        //    92: aload_0        
        //    93: getfield        gva.h:Lyl6;
        //    96: astore          13
        //    98: aload_0        
        //    99: getfield        gva.b:Ltl6;
        //   102: astore          14
        //   104: aload           17
        //   106: getfield        mi6.b:Lfd3;
        //   109: getfield        fd3.f:Ljfg;
        //   112: astore          17
        //   114: aload           17
        //   116: getstatic       qeg.c:Lqeg;
        //   119: invokevirtual   jfg.j0:(Lgfg;)V
        //   122: aload           17
        //   124: aload           13
        //   126: aload           14
        //   128: aload           16
        //   130: invokestatic    t08.i0:(Ljfg;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   133: iload_3        
        //   134: ifeq            201
        //   137: iload_2        
        //   138: iload_1        
        //   139: if_icmpeq       201
        //   142: aload_0        
        //   143: getfield        gva.M:Lmi6;
        //   146: astore_0       
        //   147: aload_0        
        //   148: invokevirtual   mi6.c:()V
        //   151: aload_0        
        //   152: invokevirtual   mi6.b:()V
        //   155: aload_0        
        //   156: getfield        mi6.a:Lgva;
        //   159: astore          13
        //   161: aload           13
        //   163: getfield        gva.G:Lu5m;
        //   166: iload_2        
        //   167: invokevirtual   u5m.l:(I)Z
        //   170: ifeq            178
        //   173: iconst_1       
        //   174: istore_1       
        //   175: goto            188
        //   178: aload           13
        //   180: getfield        gva.G:Lu5m;
        //   183: iload_2        
        //   184: invokevirtual   u5m.o:(I)I
        //   187: istore_1       
        //   188: iload_1        
        //   189: ifle            199
        //   192: aload_0        
        //   193: iload           4
        //   195: iload_1        
        //   196: invokevirtual   mi6.f:(II)V
        //   199: iconst_0       
        //   200: ireturn        
        //   201: aload           15
        //   203: iload_2        
        //   204: invokevirtual   u5m.o:(I)I
        //   207: ireturn        
        //   208: iload           6
        //   210: sipush          206
        //   213: if_icmpne       760
        //   216: aload           13
        //   218: getstatic       ti6.f:Lsbg;
        //   221: invokestatic    mlc.q:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   224: ifeq            760
        //   227: aload           15
        //   229: iload_2        
        //   230: iconst_0       
        //   231: invokevirtual   u5m.h:(II)Ljava/lang/Object;
        //   234: astore          13
        //   236: aload           13
        //   238: instanceof      Lkva;
        //   241: istore_3       
        //   242: aconst_null    
        //   243: astore          14
        //   245: iload_3        
        //   246: ifeq            259
        //   249: aload           13
        //   251: checkcast       Lkva;
        //   254: astore          13
        //   256: goto            262
        //   259: aconst_null    
        //   260: astore          13
        //   262: aload           13
        //   264: ifnull          277
        //   267: aload           13
        //   269: getfield        kva.a:Lf8j;
        //   272: astore          13
        //   274: goto            280
        //   277: aconst_null    
        //   278: astore          13
        //   280: aload           13
        //   282: instanceof      Ldva;
        //   285: ifeq            295
        //   288: aload           13
        //   290: checkcast       Ldva;
        //   293: astore          14
        //   295: aload           14
        //   297: ifnull          753
        //   300: aload           14
        //   302: getfield        dva.v:Leva;
        //   305: getfield        eva.e:Lumf;
        //   308: astore          13
        //   310: aload           13
        //   312: getfield        umf.b:[Ljava/lang/Object;
        //   315: astore          14
        //   317: aload           13
        //   319: getfield        umf.a:[J
        //   322: astore          13
        //   324: aload           13
        //   326: arraylength    
        //   327: iconst_2       
        //   328: isub           
        //   329: istore          7
        //   331: iload           7
        //   333: iflt            753
        //   336: iconst_0       
        //   337: istore          4
        //   339: iload           5
        //   341: istore_1       
        //   342: aload           13
        //   344: iload           4
        //   346: laload         
        //   347: lstore          11
        //   349: lload           11
        //   351: ldc2_w          -1
        //   354: lxor           
        //   355: bipush          7
        //   357: lshl           
        //   358: lload           11
        //   360: land           
        //   361: ldc2_w          -9187201950435737472
        //   364: land           
        //   365: ldc2_w          -9187201950435737472
        //   368: lcmp           
        //   369: ifeq            740
        //   372: bipush          8
        //   374: istore          5
        //   376: bipush          8
        //   378: iload           4
        //   380: iload           7
        //   382: isub           
        //   383: iconst_m1      
        //   384: ixor           
        //   385: bipush          31
        //   387: iushr          
        //   388: isub           
        //   389: istore          8
        //   391: iload_1        
        //   392: istore          6
        //   394: iload           6
        //   396: iload           8
        //   398: if_icmpge       730
        //   401: ldc2_w          255
        //   404: lload           11
        //   406: land           
        //   407: ldc2_w          128
        //   410: lcmp           
        //   411: ifge            717
        //   414: aload           14
        //   416: iload           4
        //   418: iconst_3       
        //   419: ishl           
        //   420: iload           6
        //   422: iadd           
        //   423: aaload         
        //   424: checkcast       Lgva;
        //   427: astore          16
        //   429: aload           16
        //   431: getfield        gva.c:Lv5m;
        //   434: astore          17
        //   436: aload           17
        //   438: getfield        v5m.w:I
        //   441: ifle            702
        //   444: aload           17
        //   446: getfield        v5m.v:[I
        //   449: iconst_1       
        //   450: iaload         
        //   451: ldc_w           67108864
        //   454: iand           
        //   455: ifeq            702
        //   458: aload           16
        //   460: getfield        gva.h:Lyl6;
        //   463: astore          19
        //   465: aload           19
        //   467: getfield        yl6.y:Ljava/lang/Object;
        //   470: astore          17
        //   472: aload           17
        //   474: dup            
        //   475: astore          21
        //   477: monitorenter   
        //   478: aload           19
        //   480: invokevirtual   yl6.s:()V
        //   483: aload           19
        //   485: getfield        yl6.I:Ltmf;
        //   488: astore          18
        //   490: aload           19
        //   492: invokestatic    rhc.k:()Ltmf;
        //   495: putfield        yl6.I:Ltmf;
        //   498: aload           19
        //   500: getfield        yl6.Q:Lgva;
        //   503: aload           18
        //   505: invokevirtual   gva.n0:(Ltmf;)V
        //   508: aload           21
        //   510: monitorexit    
        //   511: new             Lfd3;
        //   514: dup            
        //   515: invokespecial   fd3.<init>:()V
        //   518: astore          20
        //   520: aload           16
        //   522: aload           20
        //   524: putfield        gva.L:Lfd3;
        //   527: aload           16
        //   529: getfield        gva.c:Lv5m;
        //   532: invokevirtual   v5m.m:()Lu5m;
        //   535: astore          17
        //   537: aload           16
        //   539: aload           17
        //   541: putfield        gva.G:Lu5m;
        //   544: aload           16
        //   546: getfield        gva.M:Lmi6;
        //   549: astore          19
        //   551: aload           19
        //   553: getfield        mi6.b:Lfd3;
        //   556: astore          18
        //   558: aload           19
        //   560: aload           20
        //   562: putfield        mi6.b:Lfd3;
        //   565: aload           16
        //   567: iconst_0       
        //   568: invokevirtual   gva.S:(I)V
        //   571: aload           16
        //   573: getfield        gva.M:Lmi6;
        //   576: astore          20
        //   578: aload           20
        //   580: invokevirtual   mi6.b:()V
        //   583: aload           20
        //   585: getfield        mi6.c:Z
        //   588: ifeq            648
        //   591: aload           20
        //   593: getfield        mi6.b:Lfd3;
        //   596: getfield        fd3.f:Ljfg;
        //   599: getstatic       xeg.c:Lxeg;
        //   602: invokevirtual   jfg.j0:(Lgfg;)V
        //   605: aload           20
        //   607: getfield        mi6.c:Z
        //   610: ifeq            648
        //   613: aload           20
        //   615: iconst_0       
        //   616: invokevirtual   mi6.d:(Z)V
        //   619: aload           20
        //   621: iconst_0       
        //   622: invokevirtual   mi6.d:(Z)V
        //   625: aload           20
        //   627: getfield        mi6.b:Lfd3;
        //   630: getfield        fd3.f:Ljfg;
        //   633: getstatic       geg.c:Lgeg;
        //   636: invokevirtual   jfg.j0:(Lgfg;)V
        //   639: aload           20
        //   641: iconst_0       
        //   642: putfield        mi6.c:Z
        //   645: goto            648
        //   648: iconst_0       
        //   649: istore_1       
        //   650: aload           19
        //   652: aload           18
        //   654: putfield        mi6.b:Lfd3;
        //   657: aload           17
        //   659: invokevirtual   u5m.c:()V
        //   662: goto            702
        //   665: astore_0       
        //   666: goto            679
        //   669: astore_0       
        //   670: aload           19
        //   672: aload           18
        //   674: putfield        mi6.b:Lfd3;
        //   677: aload_0        
        //   678: athrow         
        //   679: aload           17
        //   681: invokevirtual   u5m.c:()V
        //   684: aload_0        
        //   685: athrow         
        //   686: astore_0       
        //   687: aload           19
        //   689: aload           18
        //   691: putfield        yl6.I:Ltmf;
        //   694: aload_0        
        //   695: athrow         
        //   696: astore_0       
        //   697: aload           21
        //   699: monitorexit    
        //   700: aload_0        
        //   701: athrow         
        //   702: aload_0        
        //   703: getfield        gva.b:Ltl6;
        //   706: aload           16
        //   708: getfield        gva.h:Lyl6;
        //   711: invokevirtual   tl6.u:(Lyl6;)V
        //   714: goto            717
        //   717: lload           11
        //   719: iload           5
        //   721: lshr           
        //   722: lstore          11
        //   724: iinc            6, 1
        //   727: goto            394
        //   730: iload           8
        //   732: iload           5
        //   734: if_icmpne       753
        //   737: goto            740
        //   740: iload           4
        //   742: iload           7
        //   744: if_icmpeq       753
        //   747: iinc            4, 1
        //   750: goto            342
        //   753: aload           15
        //   755: iload_2        
        //   756: invokevirtual   u5m.o:(I)I
        //   759: ireturn        
        //   760: aload           15
        //   762: iload_2        
        //   763: invokevirtual   u5m.l:(I)Z
        //   766: ifeq            772
        //   769: goto            988
        //   772: aload           15
        //   774: iload_2        
        //   775: invokevirtual   u5m.o:(I)I
        //   778: ireturn        
        //   779: aload           15
        //   781: iload_2        
        //   782: invokevirtual   u5m.d:(I)Z
        //   785: ifeq            979
        //   788: aload           15
        //   790: getfield        u5m.b:[I
        //   793: iload_2        
        //   794: iconst_5       
        //   795: imul           
        //   796: iconst_3       
        //   797: iadd           
        //   798: iaload         
        //   799: istore          8
        //   801: iload_2        
        //   802: iconst_1       
        //   803: iadd           
        //   804: istore          5
        //   806: iconst_0       
        //   807: istore          6
        //   809: iload           5
        //   811: iload           8
        //   813: iload_2        
        //   814: iadd           
        //   815: if_icmpge       964
        //   818: aload           15
        //   820: iload           5
        //   822: invokevirtual   u5m.l:(I)Z
        //   825: istore          10
        //   827: iload           10
        //   829: ifeq            870
        //   832: aload_0        
        //   833: getfield        gva.M:Lmi6;
        //   836: invokevirtual   mi6.c:()V
        //   839: aload_0        
        //   840: getfield        gva.M:Lmi6;
        //   843: astore          13
        //   845: aload           15
        //   847: iload           5
        //   849: invokevirtual   u5m.n:(I)Ljava/lang/Object;
        //   852: astore          14
        //   854: aload           13
        //   856: invokevirtual   mi6.c:()V
        //   859: aload           13
        //   861: getfield        mi6.h:Ljava/util/ArrayList;
        //   864: aload           14
        //   866: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   869: pop            
        //   870: iload           10
        //   872: ifne            888
        //   875: iload_3        
        //   876: ifeq            882
        //   879: goto            888
        //   882: iconst_0       
        //   883: istore          9
        //   885: goto            891
        //   888: iconst_1       
        //   889: istore          9
        //   891: iload           10
        //   893: ifeq            902
        //   896: iconst_0       
        //   897: istore          7
        //   899: goto            909
        //   902: iload           4
        //   904: iload           6
        //   906: iadd           
        //   907: istore          7
        //   909: iload           6
        //   911: aload_0        
        //   912: iload_1        
        //   913: iload           5
        //   915: iload           9
        //   917: iload           7
        //   919: invokestatic    gva.V:(Lgva;IIZI)I
        //   922: iadd           
        //   923: istore          6
        //   925: iload           10
        //   927: ifeq            944
        //   930: aload_0        
        //   931: getfield        gva.M:Lmi6;
        //   934: invokevirtual   mi6.c:()V
        //   937: aload_0        
        //   938: getfield        gva.M:Lmi6;
        //   941: invokevirtual   mi6.a:()V
        //   944: iload           5
        //   946: aload           15
        //   948: getfield        u5m.b:[I
        //   951: iload           5
        //   953: iconst_5       
        //   954: imul           
        //   955: iconst_3       
        //   956: iadd           
        //   957: iaload         
        //   958: iadd           
        //   959: istore          5
        //   961: goto            809
        //   964: aload           15
        //   966: iload_2        
        //   967: invokevirtual   u5m.l:(I)Z
        //   970: ifeq            976
        //   973: goto            988
        //   976: iload           6
        //   978: ireturn        
        //   979: aload           15
        //   981: iload_2        
        //   982: invokevirtual   u5m.l:(I)Z
        //   985: ifeq            990
        //   988: iconst_1       
        //   989: ireturn        
        //   990: aload           15
        //   992: iload_2        
        //   993: invokevirtual   u5m.o:(I)I
        //   996: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  478    498    696    702    Any
        //  498    508    686    696    Any
        //  537    558    665    669    Any
        //  558    645    669    679    Any
        //  650    657    665    669    Any
        //  670    679    665    669    Any
        //  687    696    696    702    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0648:
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
    
    public final e3h A() {
        return this.l();
    }
    
    public final b0j B() {
        if (this.A == 0) {
            final ArrayList e = this.E;
            if (!e.isEmpty()) {
                return (b0j)oz1.h(1, e);
            }
        }
        return null;
    }
    
    public final boolean C() {
        if (this.F() && !this.w) {
            final b0j b = this.B();
            if (b == null || (b.b & 0x4) == 0x0) {
                return false;
            }
        }
        return true;
    }
    
    public final wl6 D() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }
    
    public final boolean E() {
        return this.S;
    }
    
    public final boolean F() {
        if (!this.S && !this.y && !this.w) {
            final b0j b = this.B();
            if (b != null) {
                if ((b.b & 0x8) == 0x0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void G(final ArrayList p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          7
        //     3: aload           7
        //     5: getfield        gva.b:Ltl6;
        //     8: astore          8
        //    10: aload           7
        //    12: getfield        gva.f:Lfd3;
        //    15: astore          6
        //    17: aload           7
        //    19: getfield        gva.M:Lmi6;
        //    22: astore          10
        //    24: aload           10
        //    26: getfield        mi6.b:Lfd3;
        //    29: astore          11
        //    31: aload           10
        //    33: aload           6
        //    35: putfield        mi6.b:Lfd3;
        //    38: aload           6
        //    40: getfield        fd3.f:Ljfg;
        //    43: getstatic       veg.c:Lveg;
        //    46: invokevirtual   jfg.j0:(Lgfg;)V
        //    49: aload_1        
        //    50: invokeinterface java/util/Collection.size:()I
        //    55: istore_3       
        //    56: iconst_0       
        //    57: istore_2       
        //    58: iload_2        
        //    59: iload_3        
        //    60: if_icmpge       1123
        //    63: aload_1        
        //    64: iload_2        
        //    65: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    70: checkcast       Lyog;
        //    73: astore          6
        //    75: aload           6
        //    77: getfield        yog.v:Ljava/lang/Object;
        //    80: checkcast       Liif;
        //    83: astore          13
        //    85: aload           6
        //    87: getfield        yog.w:Ljava/lang/Object;
        //    90: checkcast       Liif;
        //    93: astore          15
        //    95: aload           13
        //    97: invokevirtual   iif.a:()Lbva;
        //   100: invokestatic    r6k.f:(Lbva;)Lbva;
        //   103: astore          16
        //   105: aload           13
        //   107: invokevirtual   iif.g:()Lv5m;
        //   110: invokestatic    x5m.a:(Lv5m;)Lv5m;
        //   113: astore          17
        //   115: aload           17
        //   117: aload           16
        //   119: invokevirtual   v5m.a:(Lbva;)I
        //   122: istore          4
        //   124: new             Lzgc;
        //   127: astore          12
        //   129: aload           12
        //   131: invokespecial   zgc.<init>:()V
        //   134: aload           10
        //   136: invokevirtual   mi6.b:()V
        //   139: aload           10
        //   141: getfield        mi6.b:Lfd3;
        //   144: getfield        fd3.f:Ljfg;
        //   147: astore          6
        //   149: aload           6
        //   151: getstatic       deg.c:Ldeg;
        //   154: invokevirtual   jfg.j0:(Lgfg;)V
        //   157: aload           6
        //   159: iconst_0       
        //   160: aload           12
        //   162: iconst_1       
        //   163: aload           16
        //   165: invokestatic    t08.h0:(Ljfg;ILjava/lang/Object;ILjava/lang/Object;)V
        //   168: aload           15
        //   170: ifnonnull       357
        //   173: aload           17
        //   175: aload           7
        //   177: getfield        gva.H:Lv5m;
        //   180: if_acmpeq       186
        //   183: goto            208
        //   186: aload           7
        //   188: getfield        gva.I:Ly5m;
        //   191: getfield        y5m.w:Z
        //   194: ifne            203
        //   197: ldc_w           "Check failed"
        //   200: invokestatic    ti6.a:(Ljava/lang/String;)V
        //   203: aload           7
        //   205: invokevirtual   gva.y:()V
        //   208: aload           17
        //   210: invokevirtual   v5m.m:()Lu5m;
        //   213: astore          9
        //   215: aload           9
        //   217: iload           4
        //   219: invokevirtual   u5m.r:(I)V
        //   222: aload           10
        //   224: iload           4
        //   226: putfield        mi6.f:I
        //   229: new             Lfd3;
        //   232: astore          14
        //   234: aload           14
        //   236: invokespecial   fd3.<init>:()V
        //   239: new             Lrj;
        //   242: astore          15
        //   244: aload           15
        //   246: aload           7
        //   248: aload           14
        //   250: aload           9
        //   252: aload           13
        //   254: bipush          29
        //   256: invokespecial   rj.<init>:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
        //   259: getstatic       r89.v:Lr89;
        //   262: astore          7
        //   264: aload_0        
        //   265: astore          6
        //   267: aload           6
        //   269: aconst_null    
        //   270: aconst_null    
        //   271: aconst_null    
        //   272: aload           7
        //   274: aload           15
        //   276: invokevirtual   gva.M:(Lyl6;Lyl6;Ljava/lang/Integer;Ljava/util/List;Ljta;)Ljava/lang/Object;
        //   279: pop            
        //   280: aload           10
        //   282: getfield        mi6.b:Lfd3;
        //   285: astore          7
        //   287: aload           7
        //   289: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   292: pop            
        //   293: aload           14
        //   295: getfield        fd3.f:Ljfg;
        //   298: invokevirtual   jfg.i0:()Z
        //   301: ifne            337
        //   304: aload           7
        //   306: getfield        fd3.f:Ljfg;
        //   309: astore          7
        //   311: aload           7
        //   313: getstatic       zdg.c:Lzdg;
        //   316: invokevirtual   jfg.j0:(Lgfg;)V
        //   319: aload           7
        //   321: iconst_0       
        //   322: aload           14
        //   324: iconst_1       
        //   325: aload           12
        //   327: invokestatic    t08.h0:(Ljfg;ILjava/lang/Object;ILjava/lang/Object;)V
        //   330: goto            337
        //   333: astore_1       
        //   334: goto            350
        //   337: aload           9
        //   339: invokevirtual   u5m.c:()V
        //   342: goto            1016
        //   345: astore_1       
        //   346: goto            1156
        //   349: astore_1       
        //   350: aload           9
        //   352: invokevirtual   u5m.c:()V
        //   355: aload_1        
        //   356: athrow         
        //   357: aload           8
        //   359: aload           15
        //   361: invokevirtual   tl6.p:(Liif;)Lhif;
        //   364: astore          14
        //   366: aload           14
        //   368: ifnull          384
        //   371: aload           14
        //   373: invokevirtual   hif.a:()Lv5m;
        //   376: invokestatic    x5m.a:(Lv5m;)Lv5m;
        //   379: astore          6
        //   381: goto            387
        //   384: aconst_null    
        //   385: astore          6
        //   387: aload           6
        //   389: ifnonnull       405
        //   392: aload           15
        //   394: invokevirtual   iif.g:()Lv5m;
        //   397: invokestatic    x5m.a:(Lv5m;)Lv5m;
        //   400: astore          9
        //   402: goto            409
        //   405: aload           6
        //   407: astore          9
        //   409: aload           6
        //   411: ifnull          516
        //   414: aload           6
        //   416: getfield        v5m.B:Z
        //   419: ifeq            428
        //   422: ldc_w           "use active SlotWriter to create an anchor location instead"
        //   425: invokestatic    ti6.a:(Ljava/lang/String;)V
        //   428: aload           6
        //   430: getfield        v5m.w:I
        //   433: ifle            439
        //   436: goto            445
        //   439: ldc_w           "Parameter index is out of range"
        //   442: invokestatic    pih.a:(Ljava/lang/String;)V
        //   445: aload           6
        //   447: getfield        v5m.D:Ljava/util/ArrayList;
        //   450: astore          18
        //   452: aload           18
        //   454: iconst_0       
        //   455: aload           6
        //   457: getfield        v5m.w:I
        //   460: invokestatic    x5m.c:(Ljava/util/ArrayList;II)I
        //   463: istore          4
        //   465: iload           4
        //   467: ifge            496
        //   470: new             Lbva;
        //   473: astore          6
        //   475: aload           6
        //   477: iconst_0       
        //   478: invokespecial   bva.<init>:(I)V
        //   481: aload           18
        //   483: iload           4
        //   485: iconst_1       
        //   486: iadd           
        //   487: ineg           
        //   488: aload           6
        //   490: invokevirtual   java/util/ArrayList.add:(ILjava/lang/Object;)V
        //   493: goto            508
        //   496: aload           18
        //   498: iload           4
        //   500: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   503: checkcast       Lbva;
        //   506: astore          6
        //   508: aload           6
        //   510: ifnull          516
        //   513: goto            523
        //   516: aload           15
        //   518: invokevirtual   iif.a:()Lbva;
        //   521: astore          6
        //   523: aload           6
        //   525: invokestatic    r6k.f:(Lbva;)Lbva;
        //   528: astore          18
        //   530: new             Ljava/util/ArrayList;
        //   533: astore          6
        //   535: aload           6
        //   537: invokespecial   java/util/ArrayList.<init>:()V
        //   540: aload           9
        //   542: invokevirtual   v5m.m:()Lu5m;
        //   545: astore          19
        //   547: aload           19
        //   549: aload           6
        //   551: aload           9
        //   553: aload           18
        //   555: invokevirtual   v5m.a:(Lbva;)I
        //   558: invokestatic    r9n.n:(Lu5m;Ljava/util/ArrayList;I)V
        //   561: aload           19
        //   563: invokevirtual   u5m.c:()V
        //   566: aload           6
        //   568: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   571: ifne            673
        //   574: aload           10
        //   576: getfield        mi6.b:Lfd3;
        //   579: astore          19
        //   581: aload           19
        //   583: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   586: pop            
        //   587: aload           6
        //   589: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   592: ifne            624
        //   595: aload           19
        //   597: getfield        fd3.f:Ljfg;
        //   600: astore          19
        //   602: aload           19
        //   604: getstatic       aeg.c:Laeg;
        //   607: invokevirtual   jfg.j0:(Lgfg;)V
        //   610: aload           19
        //   612: iconst_1       
        //   613: aload           6
        //   615: iconst_0       
        //   616: aload           12
        //   618: invokestatic    t08.h0:(Ljfg;ILjava/lang/Object;ILjava/lang/Object;)V
        //   621: goto            624
        //   624: aload           7
        //   626: getfield        gva.c:Lv5m;
        //   629: astore          19
        //   631: aload           17
        //   633: aload           19
        //   635: if_acmpeq       641
        //   638: goto            673
        //   641: aload           19
        //   643: aload           16
        //   645: invokevirtual   v5m.a:(Lbva;)I
        //   648: istore          4
        //   650: aload           7
        //   652: iload           4
        //   654: aload           7
        //   656: iload           4
        //   658: invokevirtual   gva.s0:(I)I
        //   661: aload           6
        //   663: invokevirtual   java/util/ArrayList.size:()I
        //   666: iadd           
        //   667: invokevirtual   gva.o0:(II)V
        //   670: goto            673
        //   673: aload           10
        //   675: getfield        mi6.b:Lfd3;
        //   678: getfield        fd3.f:Ljfg;
        //   681: astore          6
        //   683: aload           6
        //   685: getstatic       beg.c:Lbeg;
        //   688: invokevirtual   jfg.j0:(Lgfg;)V
        //   691: aload           6
        //   693: getfield        jfg.h:I
        //   696: aload           6
        //   698: getfield        jfg.c:[Lgfg;
        //   701: aload           6
        //   703: getfield        jfg.d:I
        //   706: iconst_1       
        //   707: isub           
        //   708: aaload         
        //   709: getfield        gfg.b:I
        //   712: isub           
        //   713: istore          4
        //   715: aload           6
        //   717: getfield        jfg.g:[Ljava/lang/Object;
        //   720: astore          6
        //   722: aload           6
        //   724: iload           4
        //   726: aload           14
        //   728: aastore        
        //   729: aload           6
        //   731: iload           4
        //   733: iconst_1       
        //   734: iadd           
        //   735: aload           8
        //   737: aastore        
        //   738: aload           6
        //   740: iload           4
        //   742: iconst_3       
        //   743: iadd           
        //   744: aload           13
        //   746: aastore        
        //   747: aload           6
        //   749: iload           4
        //   751: iconst_2       
        //   752: iadd           
        //   753: aload           15
        //   755: aastore        
        //   756: aload           9
        //   758: invokevirtual   v5m.m:()Lu5m;
        //   761: astore          6
        //   763: aload           7
        //   765: getfield        gva.G:Lu5m;
        //   768: astore          16
        //   770: aload           7
        //   772: getfield        gva.o:[I
        //   775: astore          14
        //   777: aload           7
        //   779: getfield        gva.v:Ljlf;
        //   782: astore          17
        //   784: aload           7
        //   786: aconst_null    
        //   787: putfield        gva.o:[I
        //   790: aload           7
        //   792: aconst_null    
        //   793: putfield        gva.v:Ljlf;
        //   796: aload           7
        //   798: aload           6
        //   800: putfield        gva.G:Lu5m;
        //   803: aload           9
        //   805: aload           18
        //   807: invokestatic    r6k.f:(Lbva;)Lbva;
        //   810: invokevirtual   v5m.a:(Lbva;)I
        //   813: istore          4
        //   815: aload           6
        //   817: iload           4
        //   819: invokevirtual   u5m.r:(I)V
        //   822: aload           10
        //   824: iload           4
        //   826: putfield        mi6.f:I
        //   829: new             Lfd3;
        //   832: astore          18
        //   834: aload           18
        //   836: invokespecial   fd3.<init>:()V
        //   839: aload           10
        //   841: getfield        mi6.b:Lfd3;
        //   844: astore          9
        //   846: aload           10
        //   848: aload           18
        //   850: putfield        mi6.b:Lfd3;
        //   853: aload           10
        //   855: getfield        mi6.e:Z
        //   858: istore          5
        //   860: aload           10
        //   862: iconst_0       
        //   863: putfield        mi6.e:Z
        //   866: aload           15
        //   868: invokevirtual   iif.b:()Lyl6;
        //   871: astore          20
        //   873: aload           13
        //   875: invokevirtual   iif.b:()Lyl6;
        //   878: astore          19
        //   880: aload           6
        //   882: getfield        u5m.g:I
        //   885: istore          4
        //   887: aload           15
        //   889: invokevirtual   iif.d:()Ljava/util/List;
        //   892: astore          21
        //   894: new             Lu78;
        //   897: astore          15
        //   899: aload           15
        //   901: aload           7
        //   903: aload           13
        //   905: bipush          18
        //   907: invokespecial   u78.<init>:(Ljava/lang/Object;Ljava/lang/Object;B)V
        //   910: aload           7
        //   912: aload           20
        //   914: aload           19
        //   916: iload           4
        //   918: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   921: aload           21
        //   923: aload           15
        //   925: invokevirtual   gva.M:(Lyl6;Lyl6;Ljava/lang/Integer;Ljava/util/List;Ljta;)Ljava/lang/Object;
        //   928: pop            
        //   929: aload           10
        //   931: iload           5
        //   933: putfield        mi6.e:Z
        //   936: aload           10
        //   938: aload           9
        //   940: putfield        mi6.b:Lfd3;
        //   943: aload           9
        //   945: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   948: pop            
        //   949: aload           18
        //   951: getfield        fd3.f:Ljfg;
        //   954: invokevirtual   jfg.i0:()Z
        //   957: ifne            986
        //   960: aload           9
        //   962: getfield        fd3.f:Ljfg;
        //   965: astore          9
        //   967: aload           9
        //   969: getstatic       zdg.c:Lzdg;
        //   972: invokevirtual   jfg.j0:(Lgfg;)V
        //   975: aload           9
        //   977: iconst_0       
        //   978: aload           18
        //   980: iconst_1       
        //   981: aload           12
        //   983: invokestatic    t08.h0:(Ljfg;ILjava/lang/Object;ILjava/lang/Object;)V
        //   986: aload           7
        //   988: aload           16
        //   990: putfield        gva.G:Lu5m;
        //   993: aload           7
        //   995: aload           14
        //   997: putfield        gva.o:[I
        //  1000: aload           7
        //  1002: aload           17
        //  1004: putfield        gva.v:Ljlf;
        //  1007: aload           6
        //  1009: invokevirtual   u5m.c:()V
        //  1012: aload           7
        //  1014: astore          6
        //  1016: aload           10
        //  1018: getfield        mi6.b:Lfd3;
        //  1021: getfield        fd3.f:Ljfg;
        //  1024: getstatic       xeg.c:Lxeg;
        //  1027: invokevirtual   jfg.j0:(Lgfg;)V
        //  1030: iinc            2, 1
        //  1033: aload           6
        //  1035: astore          7
        //  1037: goto            58
        //  1040: astore_1       
        //  1041: goto            1108
        //  1044: astore_1       
        //  1045: goto            1085
        //  1048: astore_1       
        //  1049: goto            1075
        //  1052: astore_1       
        //  1053: goto            1065
        //  1056: astore_1       
        //  1057: goto            1065
        //  1060: astore_1       
        //  1061: goto            1065
        //  1064: astore_1       
        //  1065: aload           10
        //  1067: iload           5
        //  1069: putfield        mi6.e:Z
        //  1072: aload_1        
        //  1073: athrow         
        //  1074: astore_1       
        //  1075: aload           10
        //  1077: aload           9
        //  1079: putfield        mi6.b:Lfd3;
        //  1082: aload_1        
        //  1083: athrow         
        //  1084: astore_1       
        //  1085: aload           7
        //  1087: aload           16
        //  1089: putfield        gva.G:Lu5m;
        //  1092: aload           7
        //  1094: aload           14
        //  1096: putfield        gva.o:[I
        //  1099: aload           7
        //  1101: aload           17
        //  1103: putfield        gva.v:Ljlf;
        //  1106: aload_1        
        //  1107: athrow         
        //  1108: aload           6
        //  1110: invokevirtual   u5m.c:()V
        //  1113: aload_1        
        //  1114: athrow         
        //  1115: astore_1       
        //  1116: aload           19
        //  1118: invokevirtual   u5m.c:()V
        //  1121: aload_1        
        //  1122: athrow         
        //  1123: aload           10
        //  1125: invokevirtual   mi6.b:()V
        //  1128: aload           10
        //  1130: getfield        mi6.b:Lfd3;
        //  1133: getfield        fd3.f:Ljfg;
        //  1136: getstatic       heg.c:Lheg;
        //  1139: invokevirtual   jfg.j0:(Lgfg;)V
        //  1142: aload           10
        //  1144: iconst_0       
        //  1145: putfield        mi6.f:I
        //  1148: aload           10
        //  1150: aload           11
        //  1152: putfield        mi6.b:Lfd3;
        //  1155: return         
        //  1156: aload           10
        //  1158: aload           11
        //  1160: putfield        mi6.b:Lfd3;
        //  1163: aload_1        
        //  1164: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  31     56     345    349    Any
        //  63     168    345    349    Any
        //  173    183    345    349    Any
        //  186    203    345    349    Any
        //  203    208    345    349    Any
        //  208    215    345    349    Any
        //  215    259    349    350    Any
        //  259    264    333    337    Any
        //  267    330    333    337    Any
        //  337    342    345    349    Any
        //  350    357    345    349    Any
        //  357    366    345    349    Any
        //  371    381    345    349    Any
        //  392    402    345    349    Any
        //  414    428    345    349    Any
        //  428    436    345    349    Any
        //  439    445    345    349    Any
        //  445    465    345    349    Any
        //  470    493    345    349    Any
        //  496    508    345    349    Any
        //  516    523    345    349    Any
        //  523    547    345    349    Any
        //  547    561    1115   1123   Any
        //  561    621    345    349    Any
        //  624    631    345    349    Any
        //  641    670    345    349    Any
        //  673    722    345    349    Any
        //  756    763    345    349    Any
        //  763    796    1040   1044   Any
        //  796    846    1084   1085   Any
        //  846    860    1074   1075   Any
        //  860    873    1064   1065   Any
        //  873    894    1060   1064   Any
        //  894    910    1056   1060   Any
        //  910    929    1052   1056   Any
        //  929    936    1048   1052   Any
        //  936    986    1044   1048   Any
        //  986    1007   1040   1044   Any
        //  1007   1012   345    349    Any
        //  1016   1030   345    349    Any
        //  1065   1074   1048   1052   Any
        //  1075   1084   1044   1048   Any
        //  1085   1108   1040   1044   Any
        //  1108   1115   345    349    Any
        //  1116   1123   345    349    Any
        //  1123   1148   345    349    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0337:
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
    
    public final void H(final gif gif, final e3h e3h, final Object o, final boolean b) {
        this.d0(126665345, gif);
        this.J();
        this.r0(o);
        final long t = this.T;
        Label_0051: {
            try {
                this.T = 126665345L;
                if (this.S) {
                    y5m.y(this.I);
                }
                break Label_0051;
            }
            finally {
                try {
                    final Throwable t2;
                    kkq.e(t2, (jta)new kca((Object)this, (byte)2));
                }
                finally {
                    this.q(false);
                    this.K = null;
                    this.T = t;
                    this.q(false);
                }
                while (true) {
                    this.P(e3h);
                    Label_0091: {
                        this.a0(202, 0, ti6.d, e3h);
                    }
                    this.K = null;
                    iftrue(Label_0192:)(!this.S || b);
                    this.J = true;
                    final y5m i = this.I;
                    this.b.m(new iif(gif, o, this.h, this.H, i.b(i.F(i.b, i.v)), (List)r89.v, this.l(), (ArrayList)null));
                    Label_0240: {
                        break Label_0240;
                        Label_0192:
                        final boolean w = this.w;
                        final boolean w2;
                        this.w = w2;
                        uuj.k0(this, (zta)new ye6(-59194059, true, new tz7((Object)gif, o, (byte)15)));
                        this.w = w;
                    }
                    this.q(false);
                    this.K = null;
                    this.T = t;
                    this.q(false);
                    return;
                    final boolean w2 = !this.S && !mlc.q(this.G.f(), (Object)e3h);
                    iftrue(Label_0091:)(!w2);
                    continue;
                }
            }
        }
    }
    
    public final Object I(final Object o, final Object o2) {
        final u5m g = this.G;
        final int g2 = g.g;
        Object p2;
        if (g2 < g.h) {
            p2 = g.p(g.b, g2);
        }
        else {
            p2 = null;
        }
        Object d;
        if ((d = r9n.D(p2, o, o2)) == null) {
            d = new dqc(o, o2);
        }
        return d;
    }
    
    public final Object J() {
        final boolean s = this.S;
        final cib a = bi6.a;
        if (s) {
            if (this.r) {
                ti6.a("A call to createNode(), emitNode() or useNode() expected");
                return a;
            }
        }
        else {
            final Object m = this.G.m();
            if (!this.y || m instanceof iqj) {
                return m;
            }
        }
        return a;
    }
    
    public final List K() {
        final tl6 b = this.b;
        final sl6 i = b.i();
        yl6 yl6;
        if (i != null) {
            yl6 = (yl6)i;
        }
        else {
            yl6 = null;
        }
        if (yl6 != null) {
            final v5m a = yl6.A;
            final Integer g = jkq.g(x5m.a(a), b);
            if (g != null) {
                final u5m m = x5m.a(a).m();
                try {
                    final ArrayList t = jkq.t(m, (int)g, Integer.valueOf(0));
                    m.c();
                    return (List)c86.Z0((Collection)t, (Iterable)yl6.Q.K());
                }
                finally {
                    m.c();
                }
            }
        }
        return (List)r89.v;
    }
    
    public final int L(final int n) {
        int i = this.G.q(n) + 1;
        int n2 = 0;
        while (i < n) {
            int n3 = n2;
            if (!this.G.k(i)) {
                n3 = n2 + 1;
            }
            i += this.G.b[i * 5 + 3];
            n2 = n3;
        }
        return n2;
    }
    
    public final Object M(yl6 a, final yl6 m, final Integer n, final List list, final jta jta) {
        while (true) {
            final boolean f = this.F;
            final int k = this.k;
            Label_0227: {
            Label_0107:
                while (true) {
                    int n2 = 0;
                    Label_0101: {
                        b0j b0j;
                        try {
                            this.F = true;
                            this.k = 0;
                            final int size = ((Collection)list).size();
                            n2 = 0;
                            if (n2 >= size) {
                                break Label_0107;
                            }
                            final yog yog = (yog)list.get(n2);
                            b0j = (b0j)yog.v;
                            final Object w = yog.w;
                            if (w != null) {
                                this.m0(b0j, w);
                                break Label_0101;
                            }
                        }
                        finally {
                            break Label_0227;
                        }
                        this.m0(b0j, null);
                    }
                    ++n2;
                    continue;
                }
                Object a3 = null;
                Label_0213: {
                    if (a != null) {
                        int intValue;
                        if (n != null) {
                            intValue = n;
                        }
                        else {
                            intValue = -1;
                        }
                        Label_0199: {
                            if (m != null && !m.equals(a) && intValue >= 0) {
                                a.M = m;
                                a.N = intValue;
                                try {
                                    final Object a2 = jta.a();
                                    a.M = null;
                                    a.N = 0;
                                    a = (yl6)a2;
                                    break Label_0199;
                                }
                                finally {
                                    a.M = null;
                                    a.N = 0;
                                }
                            }
                            a = (yl6)jta.a();
                        }
                        a3 = a;
                        if (a != null) {
                            break Label_0213;
                        }
                    }
                    a3 = jta.a();
                }
                this.F = f;
                this.k = k;
                return a3;
            }
            this.F = f;
            this.k = k;
        }
    }
    
    public final void N() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          28
        //     5: aload_0        
        //     6: getfield        gva.F:Z
        //     9: istore          24
        //    11: aload_0        
        //    12: iconst_1       
        //    13: putfield        gva.F:Z
        //    16: aload_0        
        //    17: getfield        gva.G:Lu5m;
        //    20: astore          27
        //    22: aload           27
        //    24: getfield        u5m.i:I
        //    27: istore          13
        //    29: aload           27
        //    31: getfield        u5m.b:[I
        //    34: astore          26
        //    36: iload           13
        //    38: iconst_5       
        //    39: imul           
        //    40: iconst_3       
        //    41: iadd           
        //    42: istore          10
        //    44: aload           26
        //    46: iload           10
        //    48: iaload         
        //    49: iload           13
        //    51: iadd           
        //    52: istore_3       
        //    53: aload_0        
        //    54: getfield        gva.k:I
        //    57: istore          5
        //    59: aload_0        
        //    60: getfield        gva.T:J
        //    63: lstore          22
        //    65: aload_0        
        //    66: getfield        gva.l:I
        //    69: istore          9
        //    71: aload_0        
        //    72: getfield        gva.m:I
        //    75: istore          8
        //    77: aload           27
        //    79: getfield        u5m.g:I
        //    82: istore_1       
        //    83: aload_0        
        //    84: getfield        gva.s:Ljava/util/ArrayList;
        //    87: astore          30
        //    89: iload_1        
        //    90: aload           30
        //    92: invokestatic    r9n.s:(ILjava/util/List;)I
        //    95: istore_2       
        //    96: iload_2        
        //    97: istore_1       
        //    98: iload_2        
        //    99: ifge            107
        //   102: iload_2        
        //   103: iconst_1       
        //   104: iadd           
        //   105: ineg           
        //   106: istore_1       
        //   107: iload_1        
        //   108: aload           30
        //   110: invokevirtual   java/util/ArrayList.size:()I
        //   113: if_icmpge       139
        //   116: aload           30
        //   118: iload_1        
        //   119: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   122: checkcast       Lbmc;
        //   125: astore          26
        //   127: aload           26
        //   129: getfield        bmc.b:I
        //   132: iload_3        
        //   133: if_icmpge       139
        //   136: goto            142
        //   139: aconst_null    
        //   140: astore          26
        //   142: iconst_1       
        //   143: istore_2       
        //   144: iload           13
        //   146: istore          4
        //   148: iconst_0       
        //   149: istore          6
        //   151: iload_3        
        //   152: istore_1       
        //   153: aload           26
        //   155: astore          27
        //   157: aload           28
        //   159: astore          26
        //   161: aload           27
        //   163: ifnull          1635
        //   166: aload           27
        //   168: getfield        bmc.a:Lb0j;
        //   171: astore          31
        //   173: aload           27
        //   175: getfield        bmc.b:I
        //   178: istore          15
        //   180: iload           15
        //   182: aload           30
        //   184: invokestatic    r9n.s:(ILjava/util/List;)I
        //   187: istore_3       
        //   188: iload_3        
        //   189: iflt            203
        //   192: aload           30
        //   194: iload_3        
        //   195: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   198: checkcast       Lbmc;
        //   201: astore          28
        //   203: aload           27
        //   205: getfield        bmc.c:Ljava/lang/Object;
        //   208: astore          27
        //   210: aload           27
        //   212: ifnonnull       228
        //   215: aload           31
        //   217: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   220: pop            
        //   221: iload_1        
        //   222: istore_3       
        //   223: iload_2        
        //   224: istore_1       
        //   225: goto            558
        //   228: aload           31
        //   230: getfield        b0j.g:Ltmf;
        //   233: astore          32
        //   235: aload           32
        //   237: ifnonnull       243
        //   240: goto            221
        //   243: aload           27
        //   245: instanceof      Lsd8;
        //   248: ifeq            312
        //   251: aload           27
        //   253: checkcast       Lsd8;
        //   256: astore          29
        //   258: aload           29
        //   260: getfield        sd8.x:Lq8m;
        //   263: astore          28
        //   265: aload           28
        //   267: astore          27
        //   269: aload           28
        //   271: ifnonnull       278
        //   274: aload           26
        //   276: astore          27
        //   278: aload           27
        //   280: aload           29
        //   282: invokevirtual   sd8.i:()Lrd8;
        //   285: getfield        rd8.f:Ljava/lang/Object;
        //   288: aload           32
        //   290: aload           29
        //   292: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //   295: invokeinterface q8m.n:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   300: iconst_1       
        //   301: ixor           
        //   302: istore          7
        //   304: iload_1        
        //   305: istore_3       
        //   306: iload           7
        //   308: istore_1       
        //   309: goto            558
        //   312: aload           27
        //   314: instanceof      Lumf;
        //   317: ifeq            555
        //   320: aload           27
        //   322: checkcast       Lumf;
        //   325: astore          28
        //   327: aload           28
        //   329: invokevirtual   umf.h:()Z
        //   332: ifeq            548
        //   335: aload           28
        //   337: getfield        umf.b:[Ljava/lang/Object;
        //   340: astore          27
        //   342: aload           28
        //   344: getfield        umf.a:[J
        //   347: astore          33
        //   349: aload           33
        //   351: arraylength    
        //   352: iconst_2       
        //   353: isub           
        //   354: istore          12
        //   356: iload           12
        //   358: iflt            548
        //   361: iconst_0       
        //   362: istore          7
        //   364: aload           33
        //   366: iload           7
        //   368: laload         
        //   369: lstore          18
        //   371: lload           18
        //   373: ldc2_w          -1
        //   376: lxor           
        //   377: bipush          7
        //   379: lshl           
        //   380: lload           18
        //   382: land           
        //   383: ldc2_w          -9187201950435737472
        //   386: land           
        //   387: ldc2_w          -9187201950435737472
        //   390: lcmp           
        //   391: ifeq            533
        //   394: bipush          8
        //   396: iload           7
        //   398: iload           12
        //   400: isub           
        //   401: iconst_m1      
        //   402: ixor           
        //   403: bipush          31
        //   405: iushr          
        //   406: isub           
        //   407: istore          14
        //   409: iconst_0       
        //   410: istore          11
        //   412: iload           11
        //   414: iload           14
        //   416: if_icmpge       524
        //   419: lload           18
        //   421: ldc2_w          255
        //   424: land           
        //   425: ldc2_w          128
        //   428: lcmp           
        //   429: ifge            511
        //   432: aload           27
        //   434: iload           7
        //   436: iconst_3       
        //   437: ishl           
        //   438: iload           11
        //   440: iadd           
        //   441: aaload         
        //   442: astore          28
        //   444: iload_1        
        //   445: istore_3       
        //   446: aload           28
        //   448: instanceof      Lsd8;
        //   451: ifeq            223
        //   454: aload           28
        //   456: checkcast       Lsd8;
        //   459: astore          34
        //   461: aload           34
        //   463: getfield        sd8.x:Lq8m;
        //   466: astore          29
        //   468: aload           29
        //   470: astore          28
        //   472: aload           29
        //   474: ifnonnull       481
        //   477: aload           26
        //   479: astore          28
        //   481: aload           28
        //   483: aload           34
        //   485: invokevirtual   sd8.i:()Lrd8;
        //   488: getfield        rd8.f:Ljava/lang/Object;
        //   491: aload           32
        //   493: aload           34
        //   495: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //   498: invokeinterface q8m.n:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   503: ifne            511
        //   506: iload_1        
        //   507: istore_3       
        //   508: goto            223
        //   511: lload           18
        //   513: bipush          8
        //   515: lshr           
        //   516: lstore          18
        //   518: iinc            11, 1
        //   521: goto            412
        //   524: iload_1        
        //   525: istore_3       
        //   526: iload           14
        //   528: bipush          8
        //   530: if_icmpne       550
        //   533: iload_1        
        //   534: istore_3       
        //   535: iload           7
        //   537: iload           12
        //   539: if_icmpeq       550
        //   542: iinc            7, 1
        //   545: goto            364
        //   548: iload_1        
        //   549: istore_3       
        //   550: iconst_0       
        //   551: istore_1       
        //   552: goto            558
        //   555: goto            221
        //   558: iload_1        
        //   559: ifeq            1303
        //   562: aload_0        
        //   563: getfield        gva.G:Lu5m;
        //   566: iload           15
        //   568: invokevirtual   u5m.r:(I)V
        //   571: aload_0        
        //   572: getfield        gva.G:Lu5m;
        //   575: getfield        u5m.g:I
        //   578: istore          12
        //   580: aload_0        
        //   581: iload           4
        //   583: iload           12
        //   585: iload           13
        //   587: invokevirtual   gva.Q:(III)V
        //   590: aload_0        
        //   591: getfield        gva.G:Lu5m;
        //   594: iload           12
        //   596: invokevirtual   u5m.q:(I)I
        //   599: istore          4
        //   601: iload           4
        //   603: iload           13
        //   605: if_icmpeq       634
        //   608: aload_0        
        //   609: getfield        gva.G:Lu5m;
        //   612: iload           4
        //   614: invokevirtual   u5m.l:(I)Z
        //   617: ifne            634
        //   620: aload_0        
        //   621: getfield        gva.G:Lu5m;
        //   624: iload           4
        //   626: invokevirtual   u5m.q:(I)I
        //   629: istore          4
        //   631: goto            601
        //   634: aload_0        
        //   635: getfield        gva.G:Lu5m;
        //   638: iload           4
        //   640: invokevirtual   u5m.l:(I)Z
        //   643: ifeq            651
        //   646: iconst_0       
        //   647: istore_1       
        //   648: goto            654
        //   651: iload           5
        //   653: istore_1       
        //   654: iload           4
        //   656: iload           12
        //   658: if_icmpne       667
        //   661: iload_1        
        //   662: istore          7
        //   664: goto            817
        //   667: aload_0        
        //   668: iload           4
        //   670: invokevirtual   gva.s0:(I)I
        //   673: istore          16
        //   675: aload_0        
        //   676: getfield        gva.G:Lu5m;
        //   679: iload           12
        //   681: invokevirtual   u5m.o:(I)I
        //   684: istore          17
        //   686: iload_1        
        //   687: istore          7
        //   689: iload           4
        //   691: istore          11
        //   693: iload           7
        //   695: istore          4
        //   697: iload           4
        //   699: istore          7
        //   701: iload           4
        //   703: iload           16
        //   705: iload           17
        //   707: isub           
        //   708: iload_1        
        //   709: iadd           
        //   710: if_icmpge       817
        //   713: iload           4
        //   715: istore          7
        //   717: iload           11
        //   719: iload           15
        //   721: if_icmpeq       817
        //   724: iload           11
        //   726: iconst_1       
        //   727: iadd           
        //   728: istore          6
        //   730: iload           4
        //   732: istore          7
        //   734: iload           6
        //   736: iload           15
        //   738: if_icmpge       817
        //   741: aload_0        
        //   742: getfield        gva.G:Lu5m;
        //   745: astore          27
        //   747: aload           27
        //   749: getfield        u5m.b:[I
        //   752: iload           6
        //   754: iconst_5       
        //   755: imul           
        //   756: iconst_3       
        //   757: iadd           
        //   758: iaload         
        //   759: iload           6
        //   761: iadd           
        //   762: istore          14
        //   764: iload           6
        //   766: istore          11
        //   768: iload           4
        //   770: istore          7
        //   772: iload           15
        //   774: iload           14
        //   776: if_icmplt       693
        //   779: aload           27
        //   781: iload           6
        //   783: invokevirtual   u5m.l:(I)Z
        //   786: ifeq            795
        //   789: iload_2        
        //   790: istore          6
        //   792: goto            803
        //   795: aload_0        
        //   796: iload           6
        //   798: invokevirtual   gva.s0:(I)I
        //   801: istore          6
        //   803: iload           4
        //   805: iload           6
        //   807: iadd           
        //   808: istore          4
        //   810: iload           14
        //   812: istore          6
        //   814: goto            730
        //   817: aload_0        
        //   818: iload           7
        //   820: putfield        gva.k:I
        //   823: aload_0        
        //   824: aload_0        
        //   825: iload           12
        //   827: invokevirtual   gva.L:(I)I
        //   830: putfield        gva.m:I
        //   833: aload_0        
        //   834: getfield        gva.G:Lu5m;
        //   837: iload           12
        //   839: invokevirtual   u5m.q:(I)I
        //   842: istore          7
        //   844: lconst_0       
        //   845: lstore          18
        //   847: iconst_3       
        //   848: istore          6
        //   850: iconst_0       
        //   851: istore          11
        //   853: iload           12
        //   855: istore          4
        //   857: lload           18
        //   859: lstore          20
        //   861: iload           7
        //   863: iflt            885
        //   866: iload           7
        //   868: iload           13
        //   870: if_icmpne       888
        //   873: lload           18
        //   875: lload           22
        //   877: iload           11
        //   879: invokestatic    java/lang/Long.rotateLeft:(JI)J
        //   882: lxor           
        //   883: lstore          20
        //   885: goto            1138
        //   888: aload_0        
        //   889: getfield        gva.G:Lu5m;
        //   892: astore          28
        //   894: aload           28
        //   896: iload           7
        //   898: invokevirtual   u5m.k:(I)Z
        //   901: istore          25
        //   903: aload           28
        //   905: getfield        u5m.b:[I
        //   908: astore          27
        //   910: iload           25
        //   912: ifeq            979
        //   915: aload           28
        //   917: aload           27
        //   919: iload           7
        //   921: invokevirtual   u5m.p:([II)Ljava/lang/Object;
        //   924: astore          27
        //   926: aload           27
        //   928: ifnull          974
        //   931: aload           27
        //   933: instanceof      Ljava/lang/Enum;
        //   936: ifeq            951
        //   939: aload           27
        //   941: checkcast       Ljava/lang/Enum;
        //   944: invokevirtual   java/lang/Enum.ordinal:()I
        //   947: istore_1       
        //   948: goto            1036
        //   951: aload           27
        //   953: instanceof      Lgif;
        //   956: ifeq            965
        //   959: ldc             126665345
        //   961: istore_1       
        //   962: goto            948
        //   965: aload           27
        //   967: invokevirtual   java/lang/Object.hashCode:()I
        //   970: istore_1       
        //   971: goto            948
        //   974: iconst_0       
        //   975: istore_1       
        //   976: goto            948
        //   979: aload           28
        //   981: iload           7
        //   983: invokevirtual   u5m.i:(I)I
        //   986: istore_1       
        //   987: iload_1        
        //   988: sipush          207
        //   991: if_icmpne       1033
        //   994: aload           28
        //   996: aload           27
        //   998: iload           7
        //  1000: invokevirtual   u5m.b:([II)Ljava/lang/Object;
        //  1003: astore          27
        //  1005: aload           27
        //  1007: ifnull          1033
        //  1010: aload           27
        //  1012: getstatic       bi6.a:Lcib;
        //  1015: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  1018: ifeq            1024
        //  1021: goto            1033
        //  1024: aload           27
        //  1026: invokevirtual   java/lang/Object.hashCode:()I
        //  1029: istore_1       
        //  1030: goto            948
        //  1033: goto            948
        //  1036: iload_1        
        //  1037: ldc             126665345
        //  1039: if_icmpne       1057
        //  1042: lload           18
        //  1044: iload_1        
        //  1045: i2l            
        //  1046: iload           11
        //  1048: invokestatic    java/lang/Long.rotateLeft:(JI)J
        //  1051: lxor           
        //  1052: lstore          20
        //  1054: goto            1138
        //  1057: aload_0        
        //  1058: getfield        gva.G:Lu5m;
        //  1061: iload           7
        //  1063: invokevirtual   u5m.k:(I)Z
        //  1066: ifeq            1075
        //  1069: iconst_0       
        //  1070: istore          12
        //  1072: goto            1083
        //  1075: aload_0        
        //  1076: iload           7
        //  1078: invokevirtual   gva.L:(I)I
        //  1081: istore          12
        //  1083: lload           18
        //  1085: iload_1        
        //  1086: i2l            
        //  1087: iload           6
        //  1089: invokestatic    java/lang/Long.rotateLeft:(JI)J
        //  1092: lxor           
        //  1093: iload           12
        //  1095: i2l            
        //  1096: iload           11
        //  1098: invokestatic    java/lang/Long.rotateLeft:(JI)J
        //  1101: lxor           
        //  1102: lstore          18
        //  1104: iload           6
        //  1106: bipush          6
        //  1108: iadd           
        //  1109: bipush          64
        //  1111: irem           
        //  1112: istore          6
        //  1114: iload           11
        //  1116: bipush          6
        //  1118: iadd           
        //  1119: bipush          64
        //  1121: irem           
        //  1122: istore          11
        //  1124: aload_0        
        //  1125: getfield        gva.G:Lu5m;
        //  1128: iload           7
        //  1130: invokevirtual   u5m.q:(I)I
        //  1133: istore          7
        //  1135: goto            857
        //  1138: aload_0        
        //  1139: lload           20
        //  1141: putfield        gva.T:J
        //  1144: aload_0        
        //  1145: aconst_null    
        //  1146: putfield        gva.K:Le3h;
        //  1149: aload           31
        //  1151: getfield        b0j.d:Lzta;
        //  1154: astore          27
        //  1156: aload           27
        //  1158: ifnull          1296
        //  1161: aload           27
        //  1163: aload_0        
        //  1164: iload_2        
        //  1165: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1168: invokeinterface zta.d:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1173: pop            
        //  1174: aload_0        
        //  1175: aconst_null    
        //  1176: putfield        gva.K:Le3h;
        //  1179: aload_0        
        //  1180: getfield        gva.G:Lu5m;
        //  1183: astore          28
        //  1185: aload           28
        //  1187: getfield        u5m.b:[I
        //  1190: iload           10
        //  1192: iaload         
        //  1193: iload           13
        //  1195: iadd           
        //  1196: istore_1       
        //  1197: aload           28
        //  1199: getfield        u5m.g:I
        //  1202: istore          6
        //  1204: iload           6
        //  1206: iload           13
        //  1208: if_icmplt       1220
        //  1211: iload           6
        //  1213: iload_1        
        //  1214: if_icmpgt       1220
        //  1217: goto            1265
        //  1220: new             Ljava/lang/StringBuilder;
        //  1223: dup            
        //  1224: ldc_w           "Index "
        //  1227: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1230: astore          27
        //  1232: aload           27
        //  1234: iload           13
        //  1236: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1239: pop            
        //  1240: aload           27
        //  1242: ldc_w           " is not a parent of "
        //  1245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1248: pop            
        //  1249: aload           27
        //  1251: iload           6
        //  1253: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1256: pop            
        //  1257: aload           27
        //  1259: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1262: invokestatic    ti6.a:(Ljava/lang/String;)V
        //  1265: aload           28
        //  1267: iload           13
        //  1269: putfield        u5m.i:I
        //  1272: aload           28
        //  1274: iload_1        
        //  1275: putfield        u5m.h:I
        //  1278: aload           28
        //  1280: iconst_0       
        //  1281: putfield        u5m.l:I
        //  1284: aload           28
        //  1286: iconst_0       
        //  1287: putfield        u5m.m:I
        //  1290: iload_2        
        //  1291: istore          6
        //  1293: goto            1567
        //  1296: ldc_w           "Invalid restart scope"
        //  1299: invokestatic    en9.q:(Ljava/lang/String;)V
        //  1302: return         
        //  1303: aload_0        
        //  1304: getfield        gva.E:Ljava/util/ArrayList;
        //  1307: astore          29
        //  1309: aload           29
        //  1311: aload           31
        //  1313: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1316: pop            
        //  1317: aload_0        
        //  1318: getfield        gva.g:Lj9j;
        //  1321: invokevirtual   j9j.q:()V
        //  1324: aload           31
        //  1326: getfield        b0j.a:Lc0j;
        //  1329: astore          32
        //  1331: aload           32
        //  1333: ifnull          1550
        //  1336: aload           31
        //  1338: getfield        b0j.f:Lamf;
        //  1341: astore          28
        //  1343: aload           28
        //  1345: ifnull          1550
        //  1348: aload           31
        //  1350: iload_2        
        //  1351: invokevirtual   b0j.d:(Z)V
        //  1354: aload           28
        //  1356: getfield        amf.b:[Ljava/lang/Object;
        //  1359: astore          27
        //  1361: aload           28
        //  1363: getfield        amf.c:[I
        //  1366: astore          33
        //  1368: aload           28
        //  1370: getfield        amf.a:[J
        //  1373: astore          28
        //  1375: aload           28
        //  1377: arraylength    
        //  1378: iconst_2       
        //  1379: isub           
        //  1380: istore          7
        //  1382: iload           7
        //  1384: iflt            1517
        //  1387: iconst_0       
        //  1388: istore_1       
        //  1389: aload           28
        //  1391: iload_1        
        //  1392: laload         
        //  1393: lstore          18
        //  1395: lload           18
        //  1397: ldc2_w          -1
        //  1400: lxor           
        //  1401: bipush          7
        //  1403: lshl           
        //  1404: lload           18
        //  1406: land           
        //  1407: ldc2_w          -9187201950435737472
        //  1410: land           
        //  1411: ldc2_w          -9187201950435737472
        //  1414: lcmp           
        //  1415: ifeq            1520
        //  1418: bipush          8
        //  1420: iload_1        
        //  1421: iload           7
        //  1423: isub           
        //  1424: iconst_m1      
        //  1425: ixor           
        //  1426: bipush          31
        //  1428: iushr          
        //  1429: isub           
        //  1430: istore          11
        //  1432: iconst_0       
        //  1433: istore_2       
        //  1434: iload_2        
        //  1435: iload           11
        //  1437: if_icmpge       1507
        //  1440: lload           18
        //  1442: ldc2_w          255
        //  1445: land           
        //  1446: ldc2_w          128
        //  1449: lcmp           
        //  1450: ifge            1491
        //  1453: iload_1        
        //  1454: iconst_3       
        //  1455: ishl           
        //  1456: iload_2        
        //  1457: iadd           
        //  1458: istore          12
        //  1460: aload           27
        //  1462: iload           12
        //  1464: aaload         
        //  1465: astore          34
        //  1467: aload           33
        //  1469: iload           12
        //  1471: iaload         
        //  1472: istore          12
        //  1474: aload           32
        //  1476: aload           34
        //  1478: invokeinterface c0j.c:(Ljava/lang/Object;)V
        //  1483: goto            1494
        //  1486: astore          26
        //  1488: goto            1541
        //  1491: goto            1483
        //  1494: iinc            2, 1
        //  1497: lload           18
        //  1499: bipush          8
        //  1501: lshr           
        //  1502: lstore          18
        //  1504: goto            1434
        //  1507: iload           11
        //  1509: bipush          8
        //  1511: if_icmpne       1517
        //  1514: goto            1520
        //  1517: goto            1532
        //  1520: iload_1        
        //  1521: iload           7
        //  1523: if_icmpeq       1517
        //  1526: iinc            1, 1
        //  1529: goto            1389
        //  1532: aload           31
        //  1534: iconst_0       
        //  1535: invokevirtual   b0j.d:(Z)V
        //  1538: goto            1550
        //  1541: aload           31
        //  1543: iconst_0       
        //  1544: invokevirtual   b0j.d:(Z)V
        //  1547: aload           26
        //  1549: athrow         
        //  1550: aload           29
        //  1552: invokevirtual   java/util/ArrayList.size:()I
        //  1555: istore_1       
        //  1556: iconst_1       
        //  1557: istore_2       
        //  1558: aload           29
        //  1560: iload_1        
        //  1561: iconst_1       
        //  1562: isub           
        //  1563: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //  1566: pop            
        //  1567: aload_0        
        //  1568: getfield        gva.G:Lu5m;
        //  1571: getfield        u5m.g:I
        //  1574: aload           30
        //  1576: invokestatic    r9n.s:(ILjava/util/List;)I
        //  1579: istore          7
        //  1581: iload           7
        //  1583: istore_1       
        //  1584: iload           7
        //  1586: ifge            1595
        //  1589: iload           7
        //  1591: iconst_1       
        //  1592: iadd           
        //  1593: ineg           
        //  1594: istore_1       
        //  1595: iload_1        
        //  1596: aload           30
        //  1598: invokevirtual   java/util/ArrayList.size:()I
        //  1601: if_icmpge       1627
        //  1604: aload           30
        //  1606: iload_1        
        //  1607: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1610: checkcast       Lbmc;
        //  1613: astore          27
        //  1615: aload           27
        //  1617: getfield        bmc.b:I
        //  1620: iload_3        
        //  1621: if_icmpge       1627
        //  1624: goto            1630
        //  1627: aconst_null    
        //  1628: astore          27
        //  1630: iload_3        
        //  1631: istore_1       
        //  1632: goto            161
        //  1635: iload           6
        //  1637: ifeq            1689
        //  1640: aload_0        
        //  1641: iload           4
        //  1643: iload           13
        //  1645: iload           13
        //  1647: invokevirtual   gva.Q:(III)V
        //  1650: aload_0        
        //  1651: getfield        gva.G:Lu5m;
        //  1654: invokevirtual   u5m.t:()V
        //  1657: aload_0        
        //  1658: iload           13
        //  1660: invokevirtual   gva.s0:(I)I
        //  1663: istore_1       
        //  1664: aload_0        
        //  1665: iload           5
        //  1667: iload_1        
        //  1668: iadd           
        //  1669: putfield        gva.k:I
        //  1672: aload_0        
        //  1673: iload           9
        //  1675: iload_1        
        //  1676: iadd           
        //  1677: putfield        gva.l:I
        //  1680: aload_0        
        //  1681: iload           8
        //  1683: putfield        gva.m:I
        //  1686: goto            1693
        //  1689: aload_0        
        //  1690: invokevirtual   gva.Y:()V
        //  1693: aload_0        
        //  1694: lload           22
        //  1696: putfield        gva.T:J
        //  1699: aload_0        
        //  1700: iload           24
        //  1702: putfield        gva.F:Z
        //  1705: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  1354   1382   1486   1491   Any
        //  1474   1483   1486   1491   Any
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
    
    public final void O() {
        this.S(this.G.g);
        final mi6 m = this.M;
        m.d(false);
        m.e();
        m.b.f.j0(teg.c);
        final int f = m.f;
        final u5m g = m.a.G;
        m.f = g.b[g.g * 5 + 3] + f;
    }
    
    public final void P(final e3h e3h) {
        jlf v;
        if ((v = this.v) == null) {
            v = new jlf();
            this.v = v;
        }
        v.i(this.G.g, (Object)e3h);
    }
    
    public final void Q(final int n, final int n2, int n3) {
        final u5m g = this.G;
        while (true) {
            Label_0068: {
                if (n == n2) {
                    break Label_0068;
                }
                int q;
                int q2;
                if ((q = n) != (q2 = n3)) {
                    if (n2 == n3) {
                        q = n;
                        q2 = n3;
                    }
                    else if (g.q(n) == n2) {
                        q2 = n2;
                        q = n;
                    }
                    else {
                        if (g.q(n2) == n) {
                            break Label_0068;
                        }
                        if (g.q(n) == g.q(n2)) {
                            q2 = g.q(n);
                            q = n;
                        }
                        else {
                            int i = 0;
                            int q3;
                            int n4;
                            for (q3 = n, n4 = 0; q3 > 0 && q3 != n3; q3 = g.q(q3), ++n4) {}
                            int q4;
                            int n5;
                            for (q4 = n2, n5 = 0; q4 > 0 && q4 != n3; q4 = g.q(q4), ++n5) {}
                            n3 = n;
                            for (int j = 0; j < n4 - n5; ++j) {
                                n3 = g.q(n3);
                            }
                            int q5 = n2;
                            while (i < n5 - n4) {
                                q5 = g.q(q5);
                                ++i;
                            }
                            int q6 = q5;
                            while (true) {
                                q = n;
                                q2 = n3;
                                if (n3 == q6) {
                                    break;
                                }
                                n3 = g.q(n3);
                                q6 = g.q(q6);
                            }
                        }
                    }
                }
                while (q > 0 && q != q2) {
                    if (g.l(q)) {
                        this.M.a();
                    }
                    q = g.q(q);
                }
                this.p(n2, q2);
                return;
            }
            int q2 = n;
            int q = n;
            continue;
        }
    }
    
    public final Object R() {
        final boolean s = this.S;
        final cib a = bi6.a;
        if (s) {
            if (this.r) {
                ti6.a("A call to createNode(), emitNode() or useNode() expected");
                return a;
            }
        }
        else {
            final Object m = this.G.m();
            if (!this.y || m instanceof iqj) {
                if (m instanceof kva) {
                    return ((kva)m).a;
                }
                return m;
            }
        }
        return a;
    }
    
    public final void S(final int n) {
        final boolean l = this.G.l(n);
        final mi6 m = this.M;
        if (l) {
            m.c();
            final Object n2 = this.G.n(n);
            m.c();
            m.h.add(n2);
        }
        V(this, n, n, l, 0);
        m.c();
        if (l) {
            m.a();
        }
    }
    
    public final boolean W(int b, final boolean b2) {
        if ((b & 0x1) == 0x0 && (this.S || this.y)) {
            final vwl p2 = this.P;
            if (p2 != null) {
                final b0j b3 = this.B();
                if (b3 != null) {
                    if (p2.c()) {
                        final int b4 = b3.b;
                        if ((b4 & 0x200) != 0x0) {
                            return true;
                        }
                        b = (b4 | 0x1);
                        b3.b = b;
                        if (this.y) {
                            b = (b4 | 0x81);
                        }
                        else {
                            b &= 0xFFFFFF7F;
                        }
                        b3.b = (b | 0x100);
                        final jfg f = this.M.b.f;
                        f.j0((gfg)seg.c);
                        t08.g0(f, 0, (Object)b3);
                        this.b.t(b3);
                        return false;
                    }
                }
            }
        }
        else if (!b2) {
            if (this.F()) {
                return false;
            }
        }
        return true;
    }
    
    public final void X() {
        if (this.s.isEmpty()) {
            this.l += this.G.s();
            return;
        }
        final u5m g = this.G;
        final int g2 = g.g();
        final int[] b = g.b;
        final int g3 = g.g;
        Object p;
        if (g3 < g.h) {
            p = g.p(b, g3);
        }
        else {
            p = null;
        }
        final Object f = g.f();
        final int m = this.m;
        final cib a = bi6.a;
        Label_0229: {
            long rotateLeft;
            if (p == null) {
                if (f != null && g2 == 207 && !f.equals(a)) {
                    this.T = (Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (long)f.hashCode(), 3) ^ (long)m);
                    break Label_0229;
                }
                rotateLeft = (Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (long)g2, 3) ^ (long)m);
            }
            else {
                int n;
                if (p instanceof Enum) {
                    n = ((Enum)p).ordinal();
                }
                else {
                    n = p.hashCode();
                }
                rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (long)n, 3);
            }
            this.T = rotateLeft;
        }
        final int g4 = g.g;
        boolean b2 = true;
        if ((b[g4 * 5 + 1] & 0x40000000) == 0x0) {
            b2 = false;
        }
        this.f0(null, b2);
        this.N();
        g.e();
        if (p == null) {
            if (f != null && g2 == 207 && !f.equals(a)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ (long)m, 3) ^ (long)f.hashCode(), 3);
                return;
            }
            this.T = Long.rotateRight((long)g2 ^ Long.rotateRight(this.T ^ (long)m, 3), 3);
        }
        else {
            if (p instanceof Enum) {
                this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ (long)((Enum)p).ordinal(), 3);
                return;
            }
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ (long)p.hashCode(), 3);
        }
    }
    
    public final void Y() {
        final u5m g = this.G;
        final int i = g.i;
        int l;
        if (i >= 0) {
            l = (g.b[i * 5 + 1] & 0x3FFFFFF);
        }
        else {
            l = 0;
        }
        this.l = l;
        g.t();
    }
    
    public final void Z() {
        if (this.l != 0) {
            ti6.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!this.S) {
            final b0j b = this.B();
            if (b != null) {
                final int b2 = b.b;
                if ((b2 & 0x80) == 0x0) {
                    b.b = (b2 | 0x10);
                }
            }
            if (this.s.isEmpty()) {
                this.Y();
                return;
            }
            this.N();
        }
    }
    
    public final void a() {
        this.i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        final wga o = this.O;
        o.d.g0();
        o.c.g0();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        final u5m g = this.G;
        if (!g.f) {
            g.c();
        }
        if (!this.I.w) {
            this.y();
        }
    }
    
    public final void a0(int i, int j, Object o, Object o2) {
        final Object o3 = o;
        final Integer value = -1;
        if (this.r) {
            ti6.a("A call to createNode(), emitNode() or useNode() expected");
        }
        final int m = this.m;
        final cib a = bi6.a;
        Label_0173: {
            long rotateLeft;
            if (o3 == null) {
                if (o2 != null && i == 207 && !o2.equals(a)) {
                    this.T = (Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (long)o2.hashCode(), 3) ^ (long)m);
                    break Label_0173;
                }
                rotateLeft = (Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (long)i, 3) ^ (long)m);
            }
            else {
                int n;
                if (o3 instanceof Enum) {
                    n = ((Enum)o3).ordinal();
                }
                else {
                    n = o3.hashCode();
                }
                rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (long)n, 3);
            }
            this.T = rotateLeft;
        }
        if (o3 == null) {
            ++this.m;
        }
        final boolean b = j != 0;
        if (this.S) {
            final u5m g = this.G;
            ++g.k;
            final y5m k = this.I;
            j = k.t;
            if (b) {
                k.R(i, a, true, a);
            }
            else if (o2 != null) {
                if ((o = o3) == null) {
                    o = a;
                }
                k.R(i, o, false, o2);
            }
            else {
                if ((o = o3) == null) {
                    o = a;
                }
                k.R(i, o, false, a);
            }
            final jva l = this.j;
            if (l != null) {
                j = -2 - j;
                o2 = new puc(value, i, j, -1);
                i = this.k;
                l.e.i(j, (Object)new g7b(-1, i - l.b, 0));
                l.d.add(o2);
            }
            this.x(b, null);
            return;
        }
        Label_0404: {
            if (j == 1) {
                if (this.y) {
                    j = 1;
                    break Label_0404;
                }
            }
            j = 0;
        }
        Label_0491: {
            if (this.j == null) {
                final int g2 = this.G.g();
                if (j == 0 && g2 == i) {
                    final u5m g3 = this.G;
                    final int g4 = g3.g;
                    Object p4;
                    if (g4 < g3.h) {
                        p4 = g3.p(g3.b, g4);
                    }
                    else {
                        p4 = null;
                    }
                    if (mlc.q(o3, p4)) {
                        this.f0(o2, b);
                        break Label_0491;
                    }
                }
                final u5m g5 = this.G;
                final int[] b2 = g5.b;
                final ArrayList list = new ArrayList();
                int n2;
                if (g5.k > 0) {
                    n2 = j;
                }
                else {
                    int g6 = g5.g;
                    while (true) {
                        n2 = j;
                        if (g6 >= g5.h) {
                            break;
                        }
                        final int n3 = g6 * 5;
                        final int n4 = b2[n3];
                        final Object p5 = g5.p(b2, g6);
                        final int n5 = b2[n3 + 1];
                        int n6;
                        if ((n5 & 0x40000000) != 0x0) {
                            n6 = 1;
                        }
                        else {
                            n6 = (n5 & 0x3FFFFFF);
                        }
                        list.add((Object)new puc(p5, n4, g6, n6));
                        g6 += b2[n3 + 3];
                    }
                }
                j = n2;
                this.j = new jva(this.k, list);
            }
        }
        final jva j2 = this.j;
        Label_1730: {
            if (j2 != null) {
                final ArrayList d = j2.d;
                final jlf e = j2.e;
                final int b3 = j2.b;
                Object value2;
                if (o3 != null) {
                    value2 = new dqc(i, o3);
                }
                else {
                    value2 = i;
                }
                final tmf a2 = ((gkf)j2.f.getValue()).a;
                final Object g7 = a2.g(value2);
                Object o4;
                if (g7 == null) {
                    o4 = null;
                }
                else if (g7 instanceof emf) {
                    final emf emf = (emf)g7;
                    final Object l2 = emf.l(0);
                    if (emf.i()) {
                        a2.k(value2);
                    }
                    if (emf.b == 1) {
                        a2.m(value2, emf.f());
                    }
                    o4 = l2;
                }
                else {
                    a2.k(value2);
                    o4 = g7;
                }
                final puc puc = (puc)o4;
                if (j != 0 || puc == null) {
                    final u5m g8 = this.G;
                    ++g8.k;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        (this.I = this.H.o()).N();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    final y5m i2 = this.I;
                    j = i2.t;
                    if (b) {
                        i2.R(i, a, true, a);
                    }
                    else if (o2 != null) {
                        if (o == null) {
                            o = a;
                        }
                        i2.R(i, o, false, o2);
                    }
                    else {
                        if (o == null) {
                            o = a;
                        }
                        i2.R(i, o, false, a);
                    }
                    this.N = this.I.b(j);
                    j = -2 - j;
                    o = new puc(value, i, j, -1);
                    e.i(j, (Object)new g7b(-1, this.k - b3, 0));
                    d.add(o);
                    o = new ArrayList();
                    if (b) {
                        i = 0;
                    }
                    else {
                        i = this.k;
                    }
                    o = new jva(i, (ArrayList)o);
                    break Label_1730;
                }
                final int c = puc.c;
                d.add((Object)puc);
                final g7b g7b = (g7b)((sgc)e).b(c);
                if (g7b != null) {
                    i = g7b.b;
                }
                else {
                    i = -1;
                }
                this.k = i + b3;
                final g7b g7b2 = (g7b)((sgc)e).b(c);
                int a3;
                if (g7b2 != null) {
                    a3 = g7b2.a;
                }
                else {
                    a3 = -1;
                }
                final int c2 = j2.c;
                i = a3 - c2;
                if (a3 > c2) {
                    final Object[] c3 = ((sgc)e).c;
                    final long[] a4 = ((sgc)e).a;
                    final int n7 = a4.length - 2;
                    if (n7 >= 0) {
                        int n8 = 0;
                        while (true) {
                            final int n9 = 8;
                            long n10 = a4[n8];
                            if ((~n10 << 7 & n10 & 0x8080808080808080L) != 0x8080808080808080L) {
                                int n11;
                                g7b g7b3;
                                int a5;
                                for (n11 = 8 - (~(n8 - n7) >>> 31), j = 0; j < n11; ++j) {
                                    if ((n10 & 0xFFL) < 128L) {
                                        g7b3 = (g7b)c3[(n8 << 3) + j];
                                        a5 = g7b3.a;
                                        if (a5 == a3) {
                                            g7b3.a = c2;
                                        }
                                        else if (c2 <= a5 && a5 < a3) {
                                            g7b3.a = a5 + 1;
                                        }
                                    }
                                    n10 >>= n9;
                                }
                                j = (i = i);
                                if (n11 != n9) {
                                    break;
                                }
                            }
                            else {
                                j = i;
                            }
                            i = j;
                            if (n8 == n7) {
                                break;
                            }
                            ++n8;
                            i = j;
                        }
                    }
                }
                else {
                    j = (i = i);
                    if (c2 > a3) {
                        final Object[] c4 = ((sgc)e).c;
                        final long[] a6 = ((sgc)e).a;
                        final int n12 = a6.length - 2;
                        i = j;
                        if (n12 >= 0) {
                            int n13 = 0;
                            while (true) {
                                long n14 = a6[n13];
                                if ((~n14 << 7 & n14 & 0x8080808080808080L) != 0x8080808080808080L) {
                                    final int n15 = 8 - (~(n13 - n12) >>> 31);
                                    i = 0;
                                Label_1328_Outer:
                                    while (i < n15) {
                                        if ((n14 & 0xFFL) < 128L) {
                                            final g7b g7b4 = (g7b)c4[(n13 << 3) + i];
                                            final int a7 = g7b4.a;
                                            if (a7 == a3) {
                                                g7b4.a = c2;
                                            }
                                            else if (a3 + 1 <= a7 && a7 < c2) {
                                                g7b4.a = a7 - 1;
                                            }
                                        }
                                        while (true) {
                                            n14 >>= 8;
                                            ++i;
                                            continue Label_1328_Outer;
                                            continue;
                                        }
                                    }
                                    i = j;
                                    if (n15 != 8) {
                                        break;
                                    }
                                }
                                i = j;
                                if (n13 == n12) {
                                    break;
                                }
                                ++n13;
                            }
                        }
                    }
                }
                final mi6 m2 = this.M;
                j = m2.f;
                m2.f = c - m2.a.G.g + j;
                this.G.r(c);
                if (i > 0) {
                    m2.d(false);
                    m2.e();
                    final jfg f = m2.b.f;
                    f.j0(oeg.c);
                    f.e[f.f - f.c[f.d - 1].a] = i;
                }
                this.f0(o2, b);
            }
            o = null;
        }
        this.x(b, (jva)o);
    }
    
    public final void b(final zta zta, final Object o) {
        if (this.S) {
            final jfg c = this.O.c;
            c.j0(dfg.c);
            t08.g0(c, 0, o);
            omo.v(2, (Object)zta);
            t08.g0(c, 1, (Object)zta);
            return;
        }
        final mi6 m = this.M;
        m.b();
        final jfg f = m.b.f;
        f.j0(dfg.c);
        omo.v(2, (Object)zta);
        t08.h0(f, 0, o, 1, (Object)zta);
    }
    
    public final void b0() {
        this.a0(-127, 0, null, null);
    }
    
    public final boolean c(final float n) {
        final Object j = this.J();
        if (j instanceof Float && n == ((Number)j).floatValue()) {
            return false;
        }
        this.r0(n);
        return true;
    }
    
    public final void c0(final int n, final sbg sbg) {
        this.a0(n, 0, sbg, null);
    }
    
    public final boolean d(final int n) {
        final Object j = this.J();
        if (j instanceof Integer && n == ((Number)j).intValue()) {
            return false;
        }
        this.r0(n);
        return true;
    }
    
    public final void d0(final int n, final Object o) {
        this.a0(n, 0, o, null);
    }
    
    public final boolean e(final long n) {
        final Object j = this.J();
        if (j instanceof Long && n == ((Number)j).longValue()) {
            return false;
        }
        this.r0(n);
        return true;
    }
    
    public final void e0() {
        this.a0(125, 1, null, null);
        this.r = true;
    }
    
    public final boolean f(final Object o) {
        if (!mlc.q(this.J(), o)) {
            this.r0(o);
            return true;
        }
        return false;
    }
    
    public final void f0(final Object o, final boolean b) {
        if (b) {
            final u5m g = this.G;
            if (g.k <= 0) {
                if ((g.b[g.g * 5 + 1] & 0x40000000) == 0x0) {
                    pih.a("Expected a node group");
                }
                g.u();
            }
            return;
        }
        if (o != null && this.G.f() != o) {
            final mi6 m = this.M;
            m.getClass();
            m.d(false);
            final jfg f = m.b.f;
            f.j0(cfg.c);
            t08.g0(f, 0, o);
        }
        this.G.u();
    }
    
    public final boolean g(final boolean b) {
        final Object j = this.J();
        if (j instanceof Boolean && b == (boolean)j) {
            return false;
        }
        this.r0(b);
        return true;
    }
    
    public final void g0(final int n) {
        if (this.j != null) {
            this.a0(n, 0, null, null);
            return;
        }
        if (this.r) {
            ti6.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = (Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (long)n, 3) ^ (long)this.m);
        ++this.m;
        final u5m g = this.G;
        final boolean s = this.S;
        final cib a = bi6.a;
        if (s) {
            ++g.k;
            this.I.R(n, a, false, a);
            this.x(false, null);
            return;
        }
        if (g.g() == n) {
            final int g2 = g.g;
            if (g2 >= g.h || (g.b[g2 * 5 + 1] & 0x20000000) == 0x0) {
                g.u();
                this.x(false, null);
                return;
            }
        }
        if (g.k <= 0) {
            final int g3 = g.g;
            if (g3 != g.h) {
                final int k = this.k;
                this.O();
                this.M.f(k, g.s());
                r9n.S(g3, g.g, (List)this.s);
            }
        }
        ++g.k;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            (this.I = this.H.o()).N();
            this.J = false;
            this.K = null;
        }
        final y5m i = this.I;
        i.d();
        final int t = i.t;
        i.R(n, a, false, a);
        this.N = i.b(t);
        this.x(false, null);
    }
    
    public final boolean h(final Object o) {
        if (this.J() != o) {
            this.r0(o);
            return true;
        }
        return false;
    }
    
    public final void h0(final int n) {
        this.a0(n, 0, null, null);
    }
    
    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        final mi6 m = this.M;
        m.c = false;
        m.d.b = 0;
        m.f = 0;
        m.e = true;
        m.g = 0;
        m.h.clear();
        m.i = -1;
        m.j = -1;
        m.k = -1;
        m.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }
    
    public final gva i0(int b) {
        this.g0(b);
        final boolean s = this.S;
        final j9j g = this.g;
        final ArrayList e = this.E;
        final yl6 h = this.h;
        if (s) {
            final b0j b0j = new b0j(h);
            e.add((Object)b0j);
            this.r0(b0j);
            b0j.e = this.B;
            b0j.b &= 0xFFFFFFEF;
            g.q();
            return this;
        }
        b = this.G.i;
        final ArrayList s2 = this.s;
        b = r9n.s(b, (List)s2);
        bmc bmc;
        if (b >= 0) {
            bmc = (bmc)s2.remove(b);
        }
        else {
            bmc = null;
        }
        final Object m = this.G.m();
        b0j b0j2;
        if (mlc.q(m, (Object)bi6.a)) {
            b0j2 = new b0j(h);
            this.r0(b0j2);
        }
        else {
            m.getClass();
            b0j2 = (b0j)m;
        }
        Label_0233: {
            if (bmc == null) {
                final int b2 = b0j2.b;
                if ((b2 & 0x40) != 0x0) {
                    b = 1;
                }
                else {
                    b = 0;
                }
                if (b != 0) {
                    b0j2.b = (b2 & 0xFFFFFFBF);
                }
                if (b == 0) {
                    b = 0;
                    break Label_0233;
                }
            }
            b = 1;
        }
        final int b3 = b0j2.b;
        if (b != 0) {
            b = (b3 | 0x8);
        }
        else {
            b = (b3 & 0xFFFFFFF7);
        }
        b0j2.b = b;
        e.add((Object)b0j2);
        b0j2.e = this.B;
        b0j2.b &= 0xFFFFFFEF;
        g.q();
        b = b0j2.b;
        if ((b & 0x100) != 0x0) {
            b0j2.b = ((b & 0xFFFFFEFF) | 0x200);
            final jfg f = this.M.b.f;
            f.j0((gfg)yeg.c);
            t08.g0(f, 0, (Object)b0j2);
            if (!this.y) {
                b = b0j2.b;
                if ((b & 0x80) != 0x0) {
                    this.y = true;
                    this.z = this.G.i;
                    b0j2.b = (b | 0x400);
                }
            }
        }
        return this;
    }
    
    public final Object j(final sei sei) {
        return ncq.K(this.l(), sei);
    }
    
    public final void j0(final Object o) {
        if (!this.S && this.G.g() == 207 && !mlc.q(this.G.f(), o) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        this.a0(207, 0, null, o);
    }
    
    public final void k(final jta jta) {
        if (!this.r) {
            ti6.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            ti6.a("createNode() can only be called when inserting");
        }
        final dhc n = this.n;
        final int n2 = n.a[n.b - 1];
        final y5m i = this.I;
        final bva b = i.b(i.v);
        ++this.l;
        final wga o = this.O;
        final jfg c = o.c;
        c.j0(leg.d);
        t08.g0(c, 0, (Object)jta);
        c.e[c.f - c.c[c.d - 1].a] = n2;
        t08.g0(c, 1, (Object)b);
        final jfg d = o.d;
        d.j0(leg.e);
        d.e[d.f - d.c[d.d - 1].a] = n2;
        t08.g0(d, 0, (Object)b);
    }
    
    public final void k0() {
        this.a0(125, 2, null, null);
        this.r = true;
    }
    
    public final e3h l() {
        final e3h k = this.K;
        if (k != null) {
            return k;
        }
        return this.m(this.G.i);
    }
    
    public final void l0() {
        this.m = 0;
        this.G = this.c.m();
        this.a0(100, 0, null, null);
        final tl6 b = this.b;
        b.w();
        final e3h j = b.j();
        this.x.e((int)(this.w ? 1 : 0));
        this.w = this.f(j);
        this.K = null;
        if (!this.q) {
            this.q = b.f();
        }
        boolean c;
        if (!(c = this.C)) {
            c = b.g();
            this.C = c;
        }
        e3h n = j;
        if (c) {
            final b09 a = xl6.a();
            a.getClass();
            n = j.n(a, new zpm(this.D()));
        }
        this.u = n;
        final Set set = (Set)ncq.K(n, (sei)oec.a);
        if (set != null) {
            set.add((Object)this.z());
            b.r(set);
        }
        this.a0(Long.hashCode(b.h()), 0, null, null);
    }
    
    public final e3h m(int i) {
        final boolean s = this.S;
        final sbg d = ti6.d;
        if (s && this.J) {
            y5m k;
            for (int j = this.I.v; j > 0; j = k.F(k.b, j)) {
                if (this.I.r(j) == 202 && mlc.q(this.I.s(j), (Object)d)) {
                    final Object p = this.I.p(j);
                    p.getClass();
                    return this.K = (e3h)p;
                }
                k = this.I;
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    final u5m g = this.G;
                    if (mlc.q(g.p(g.b, i), (Object)d)) {
                        final jlf v = this.v;
                        e3h l;
                        if (v == null || (l = (e3h)((sgc)v).b(i)) == null) {
                            final u5m g2 = this.G;
                            final Object b = g2.b(g2.b, i);
                            b.getClass();
                            l = (e3h)b;
                        }
                        return this.K = l;
                    }
                }
                i = this.G.q(i);
            }
        }
        return this.K = this.u;
    }
    
    public final boolean m0(final b0j b0j, Object c) {
        final bva c2 = b0j.c;
        if (c2 != null) {
            final int a = this.G.a.a(r6k.f(c2));
            if (this.F && a >= this.G.g) {
                final ArrayList s = this.s;
                final int s2 = r9n.s(a, (List)s);
                if (s2 < 0) {
                    final int n = -(s2 + 1);
                    if (!(c instanceof sd8)) {
                        c = null;
                    }
                    s.add(n, (Object)new bmc(b0j, a, c));
                    return true;
                }
                final bmc bmc = (bmc)s.get(s2);
                if (!(c instanceof sd8)) {
                    bmc.c = null;
                    return true;
                }
                final Object c3 = bmc.c;
                if (c3 == null) {
                    bmc.c = c;
                    return true;
                }
                if (c3 instanceof umf) {
                    ((umf)c3).a(c);
                    return true;
                }
                final umf a2 = kak.a;
                final umf c4 = new umf(2);
                c4.k(c3);
                c4.k(c);
                bmc.c = c4;
                return true;
            }
        }
        return false;
    }
    
    public final sh6 n() {
        if (this.b.l()) {
            final ygd a = lq6.A();
            a.addAll((Collection)jkq.f(this.I));
            a.addAll((Collection)jkq.d(this.G));
            a.addAll((Collection)this.K());
            return new sh6((List)lq6.n(a), this.C);
        }
        return null;
    }
    
    public final void n0(final tmf tmf) {
        final ArrayList s = this.s;
        for (int p = lq6.P((List)s); -1 < p; --p) {
            final bmc bmc = (bmc)s.get(p);
            final bva c = bmc.a.c;
            bva f;
            if (c != null) {
                f = r6k.f(c);
            }
            else {
                f = null;
            }
            if (f != null && f.a()) {
                final int b = bmc.b;
                final int a = f.a;
                if (b != a) {
                    bmc.b = a;
                }
            }
            else {
                s.remove(p);
            }
        }
        final Object[] b2 = tmf.b;
        final Object[] c2 = tmf.c;
        final long[] a2 = tmf.a;
        final int n = a2.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a2[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final int n5 = (n2 << 3) + i;
                            final Object o = b2[n5];
                            final Object o2 = c2[n5];
                            o.getClass();
                            final b0j b0j = (b0j)o;
                            final bva c3 = b0j.c;
                            if (c3 != null) {
                                final int a3 = r6k.f(c3).a;
                                Object o3;
                                if ((o3 = o2) == vzq.C) {
                                    o3 = null;
                                }
                                s.add((Object)new bmc(b0j, a3, o3));
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
        g86.s0((List)s, (Comparator)r9n.b);
    }
    
    public final void o(tmf a, final zta zta) {
        final ArrayList s = this.s;
        if (this.F) {
            ti6.a("Reentrant composition is not supported");
        }
        this.g.q();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(g8m.h().g());
            this.v = null;
            this.n0(a);
            this.k = 0;
            this.F = true;
            Label_0096: {
                try {
                    this.l0();
                    final Object j = this.J();
                    if (j != zta && zta != null) {
                        this.r0(zta);
                    }
                    break Label_0096;
                }
                finally {
                    try {
                        final Throwable t;
                        kkq.e(t, (jta)new h87((Object)this, (byte)13));
                    }
                    finally {
                        this.F = false;
                        s.clear();
                        this.a();
                        if (!this.I.w) {
                            ti6.a("Check failed");
                        }
                        this.y();
                    }
                    Label_0246: {
                    Label_0254:
                        while (true) {
                            final Object j;
                            while (true) {
                                ((inf)a).l(((inf)a).x - 1);
                                this.w();
                                this.F = false;
                                s.clear();
                                iftrue(Label_0246:)(this.I.w);
                                ti6.a("Check failed");
                                break Label_0246;
                                Label_0202: {
                                    this.X();
                                }
                                continue;
                                Object o = null;
                                this.c0(200, (sbg)o);
                                omo.v(2, j);
                                uuj.k0(this, (zta)j);
                                this.q(false);
                                continue;
                                o = this.D;
                                a = (tmf)r8m.a();
                                try {
                                    ((inf)a).b(o);
                                    o = ti6.b;
                                    if (zta != null) {
                                        this.c0(200, (sbg)o);
                                        uuj.k0(this, zta);
                                        this.q(false);
                                        continue;
                                    }
                                }
                                finally {
                                    break Label_0254;
                                }
                                break;
                            }
                            iftrue(Label_0202:)(!this.w || j == null || j.equals(bi6.a));
                            continue;
                        }
                        ((inf)a).l(((inf)a).x - 1);
                    }
                    this.y();
                }
            }
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final void o0(final int n, final int n2) {
        if (this.s0(n) != n2) {
            if (n < 0) {
                hlf p2;
                if ((p2 = this.p) == null) {
                    p2 = new hlf();
                    this.p = p2;
                }
                p2.f(n, n2);
                return;
            }
            int[] o;
            if ((o = this.o) == null) {
                o = new int[this.G.c];
                iw0.T0(o, -1);
                this.o = o;
            }
            o[n] = n2;
        }
    }
    
    public final void p(final int n, final int n2) {
        if (n > 0 && n != n2) {
            this.p(this.G.q(n), n2);
            if (this.G.l(n)) {
                final Object n3 = this.G.n(n);
                final mi6 m = this.M;
                m.c();
                m.h.add(n3);
            }
        }
    }
    
    public final void p0(int n, final int n2) {
        final int s0 = this.s0(n);
        if (s0 != n2) {
            final ArrayList i = this.i;
            final int n3 = i.size() - 1;
            int j = n;
            n = n3;
            while (j != -1) {
                final int n4 = this.s0(j) + (n2 - s0);
                this.o0(j, n4);
                int n5 = n;
                int n6;
                while (true) {
                    n6 = n;
                    if (-1 >= n5) {
                        break;
                    }
                    final jva jva = (jva)i.get(n5);
                    if (jva != null && jva.a(j, n4)) {
                        n6 = n5 - 1;
                        break;
                    }
                    --n5;
                }
                final u5m g = this.G;
                if (j < 0) {
                    j = g.i;
                    n = n6;
                }
                else {
                    if (g.l(j)) {
                        break;
                    }
                    j = this.G.q(j);
                    n = n6;
                }
            }
        }
    }
    
    public final void q(final boolean b) {
        final dhc n = this.n;
        final int n2 = n.a[n.b - 2] - 1;
        final boolean s = this.S;
        final cib a = bi6.a;
        Label_0398: {
            if (s) {
                final y5m i = this.I;
                final int v = i.v;
                final int r = i.r(v);
                final Object s2 = this.I.s(v);
                final Object p = this.I.p(v);
                long n3;
                if (s2 == null) {
                    if (p != null && r == 207 && !p.equals(a)) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T ^ (long)n2, 3) ^ (long)p.hashCode(), 3);
                        break Label_0398;
                    }
                    n3 = (Long.rotateRight(this.T ^ (long)n2, 3) ^ (long)r);
                }
                else {
                    int n4;
                    if (s2 instanceof Enum) {
                        n4 = ((Enum)s2).ordinal();
                    }
                    else {
                        n4 = s2.hashCode();
                    }
                    n3 = (Long.rotateRight(this.T, 3) ^ (long)n4);
                }
                this.T = Long.rotateRight(n3, 3);
            }
            else {
                final u5m g = this.G;
                final int j = g.i;
                final int k = g.i(j);
                final u5m g2 = this.G;
                final Object p2 = g2.p(g2.b, j);
                final u5m g3 = this.G;
                final Object b2 = g3.b(g3.b, j);
                long n5;
                if (p2 == null) {
                    if (b2 != null && k == 207 && !b2.equals(a)) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T ^ (long)n2, 3) ^ (long)b2.hashCode(), 3);
                        break Label_0398;
                    }
                    n5 = (Long.rotateRight(this.T ^ (long)n2, 3) ^ (long)k);
                }
                else {
                    int n6;
                    if (p2 instanceof Enum) {
                        n6 = ((Enum)p2).ordinal();
                    }
                    else {
                        n6 = p2.hashCode();
                    }
                    n5 = (Long.rotateRight(this.T, 3) ^ (long)n6);
                }
                this.T = Long.rotateRight(n5, 3);
            }
        }
        final int l = this.l;
        final jva m = this.j;
        Object s3 = this.s;
        final mi6 m2 = this.M;
        dhc dhc2 = null;
        List list4 = null;
        Label_1623: {
            if (m != null) {
                final jlf e = m.e;
                final int b3 = m.b;
                final ArrayList a2 = m.a;
                if (a2.size() > 0) {
                    final ArrayList d = m.d;
                    final HashSet set = new HashSet(d.size());
                    for (int size = ((Collection)d).size(), n7 = 0; n7 < size; ++n7) {
                        set.add(((List)d).get(n7));
                    }
                    final umf a3 = kak.a;
                    final umf umf = new umf();
                    final int size2 = d.size();
                    final int size3 = a2.size();
                    int n8 = 0;
                    int n9 = 0;
                    int n10 = 0;
                    while (n8 < size3) {
                        final puc puc = (puc)a2.get(n8);
                        if (!set.contains((Object)puc)) {
                            final g7b g7b = (g7b)((sgc)e).b(puc.c);
                            int b4;
                            if (g7b != null) {
                                b4 = g7b.b;
                            }
                            else {
                                b4 = -1;
                            }
                            final int c = puc.c;
                            m2.f(b4 + b3, puc.d);
                            m.a(c, 0);
                            m2.f += c - m2.a.G.g;
                            this.G.r(c);
                            this.O();
                            this.G.s();
                            r9n.S(c, this.G.b[c * 5 + 3] + c, (List)s3);
                        }
                        else if (!umf.c((Object)puc)) {
                            if (n9 < size2) {
                                final puc puc2 = (puc)d.get(n9);
                                if (puc2 != puc) {
                                    final g7b g7b2 = (g7b)((sgc)e).b(puc2.c);
                                    int b5;
                                    if (g7b2 != null) {
                                        b5 = g7b2.b;
                                    }
                                    else {
                                        b5 = -1;
                                    }
                                    umf.a((Object)puc2);
                                    if (b5 != n10) {
                                        final g7b g7b3 = (g7b)((sgc)e).b(puc2.c);
                                        int l2;
                                        if (g7b3 != null) {
                                            l2 = g7b3.c;
                                        }
                                        else {
                                            l2 = puc2.d;
                                        }
                                        final int j2 = b5 + b3;
                                        final int k2 = n10 + b3;
                                        if (l2 > 0) {
                                            final int l3 = m2.l;
                                            if (l3 > 0 && m2.j == j2 - l3 && m2.k == k2 - l3) {
                                                m2.l = l3 + l2;
                                            }
                                            else {
                                                m2.c();
                                                m2.j = j2;
                                                m2.k = k2;
                                                m2.l = l2;
                                            }
                                        }
                                        else {
                                            m2.getClass();
                                        }
                                        if (b5 > n10) {
                                            Object[] c2 = ((sgc)e).c;
                                            long[] a4 = ((sgc)e).a;
                                            final int n11 = a4.length - 2;
                                            if (n11 >= 0) {
                                                int n12 = 0;
                                                while (true) {
                                                    long n13 = a4[n12];
                                                    final List list = (List)s3;
                                                    long[] array2;
                                                    Object[] array3;
                                                    if ((~n13 << 7 & n13 & 0x8080808080808080L) != 0x8080808080808080L) {
                                                        final int n14 = 8 - (~(n12 - n11) >>> 31);
                                                        for (int n15 = 0; n15 < n14; ++n15) {
                                                            if ((n13 & 0xFFL) < 128L) {
                                                                final g7b g7b4 = (g7b)c2[(n12 << 3) + n15];
                                                                final int b6 = g7b4.b;
                                                                if (b5 <= b6 && b6 < b5 + l2) {
                                                                    g7b4.b = b6 - b5 + n10;
                                                                }
                                                                else if (n10 <= b6 && b6 < b5) {
                                                                    g7b4.b = b6 + l2;
                                                                }
                                                            }
                                                            n13 >>= 8;
                                                        }
                                                        final Object[] array = c2;
                                                        array2 = a4;
                                                        s3 = list;
                                                        if (n14 != 8) {
                                                            break;
                                                        }
                                                        array3 = array;
                                                    }
                                                    else {
                                                        final Object[] array4 = c2;
                                                        array2 = a4;
                                                        array3 = array4;
                                                    }
                                                    s3 = list;
                                                    if (n12 == n11) {
                                                        break;
                                                    }
                                                    ++n12;
                                                    s3 = list;
                                                    final Object[] array5 = array3;
                                                    a4 = array2;
                                                    c2 = array5;
                                                }
                                            }
                                        }
                                        else {
                                            final List list2 = (List)(s3 = s3);
                                            if (n10 > b5) {
                                                final Object[] c3 = ((sgc)e).c;
                                                final long[] a5 = ((sgc)e).a;
                                                final int n16 = a5.length - 2;
                                                s3 = list2;
                                                if (n16 >= 0) {
                                                    int n17 = 0;
                                                    long[] array6 = a5;
                                                    while (true) {
                                                        long n18 = array6[n17];
                                                        long[] array7;
                                                        if ((~n18 << 7 & n18 & 0x8080808080808080L) != 0x8080808080808080L) {
                                                            final int n19 = 8 - (~(n17 - n16) >>> 31);
                                                            for (int n20 = 0; n20 < n19; ++n20) {
                                                                if ((n18 & 0xFFL) < 128L) {
                                                                    final g7b g7b5 = (g7b)c3[(n17 << 3) + n20];
                                                                    final int b7 = g7b5.b;
                                                                    if (b5 <= b7 && b7 < b5 + l2) {
                                                                        g7b5.b = b7 - b5 + n10;
                                                                    }
                                                                    else if (b5 + 1 <= b7 && b7 < n10) {
                                                                        g7b5.b = b7 - l2;
                                                                    }
                                                                }
                                                                n18 >>= 8;
                                                            }
                                                            array7 = array6;
                                                            s3 = list2;
                                                            if (n19 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        else {
                                                            array7 = array6;
                                                        }
                                                        s3 = list2;
                                                        if (n17 == n16) {
                                                            break;
                                                        }
                                                        ++n17;
                                                        array6 = array7;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                else {
                                    ++n8;
                                }
                                ++n9;
                                final g7b g7b6 = (g7b)((sgc)e).b(puc2.c);
                                int n21;
                                if (g7b6 != null) {
                                    n21 = g7b6.c;
                                }
                                else {
                                    n21 = puc2.d;
                                }
                                n10 += n21;
                                continue;
                            }
                            continue;
                        }
                        ++n8;
                    }
                    final dhc dhc = n;
                    final List list3 = (List)s3;
                    m2.c();
                    dhc2 = dhc;
                    list4 = list3;
                    if (a2.size() > 0) {
                        final u5m g4 = this.G;
                        m2.f += g4.h - m2.a.G.g;
                        g4.t();
                        dhc2 = dhc;
                        list4 = list3;
                    }
                    break Label_1623;
                }
            }
            final dhc dhc3 = n;
            list4 = (List)s3;
            dhc2 = dhc3;
        }
        final boolean s4 = this.S;
        if (!s4) {
            final u5m g5 = this.G;
            final int n22 = g5.m - g5.l;
            if (n22 > 0) {
                if (n22 > 0) {
                    m2.d(false);
                    m2.e();
                    final jfg f = m2.b.f;
                    f.j0(bfg.c);
                    f.e[f.f - f.c[f.d - 1].a] = n22;
                }
                else {
                    m2.getClass();
                }
            }
        }
        final int k3 = this.k;
        while (true) {
            final u5m g6 = this.G;
            if (g6.k > 0) {
                break;
            }
            final int g7 = g6.g;
            if (g7 == g6.h) {
                break;
            }
            this.O();
            m2.f(k3, this.G.s());
            r9n.S(g7, this.G.g, list4);
        }
        int n23;
        if (s4) {
            n23 = l;
            if (b) {
                final wga o = this.O;
                final jfg d2 = o.d;
                if (d2.d == 0) {
                    ti6.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                final jfg c4 = o.c;
                final gfg[] c5 = d2.c;
                final int d3 = d2.d - 1;
                d2.d = d3;
                final gfg gfg = c5[d3];
                c5[d3] = null;
                c4.j0(gfg);
                final Object[] g8 = d2.g;
                final Object[] g9 = c4.g;
                final int h = c4.h;
                final int b8 = gfg.b;
                final int h2 = d2.h;
                final int n24 = h2 - b8;
                System.arraycopy((Object)g8, n24, (Object)g9, h - b8, h2 - n24);
                final Object[] g10 = d2.g;
                final int h3 = d2.h;
                Arrays.fill(g10, h3 - b8, h3, (Object)null);
                final int[] e2 = d2.e;
                final int[] e3 = c4.e;
                final int f2 = c4.f;
                final int a6 = gfg.a;
                final int f3 = d2.f;
                iw0.J0(f2 - a6, f3 - a6, f3, e2, e3);
                d2.h -= b8;
                d2.f -= a6;
                n23 = 1;
            }
            final u5m g11 = this.G;
            if (g11.k <= 0) {
                pih.a("Unbalanced begin/end empty");
            }
            --g11.k;
            final y5m i2 = this.I;
            final int v2 = i2.v;
            i2.i();
            if (this.G.k <= 0) {
                final int n25 = -2 - v2;
                this.I.j();
                this.I.e(true);
                final bva n26 = this.N;
                final boolean i3 = this.O.c.i0();
                final v5m h4 = this.H;
                if (i3) {
                    m2.b();
                    m2.d(false);
                    m2.e();
                    m2.c();
                    final jfg f4 = m2.b.f;
                    f4.j0(meg.c);
                    t08.h0(f4, 0, (Object)n26, 1, (Object)h4);
                }
                else {
                    final wga o2 = this.O;
                    m2.b();
                    m2.d(false);
                    m2.e();
                    m2.c();
                    final jfg f5 = m2.b.f;
                    f5.j0(neg.c);
                    t08.i0(f5, (Object)n26, (Object)h4, (Object)o2);
                    this.O = new wga();
                }
                this.S = false;
                if (this.c.w != 0) {
                    this.o0(n25, 0);
                    this.p0(n25, n23);
                }
            }
        }
        else {
            if (b) {
                m2.a();
            }
            final int i4 = m2.a.G.i;
            final dhc d4 = m2.d;
            if (d4.c(-1) > i4) {
                ti6.a("Missed recording an endGroup");
            }
            if (d4.c(-1) == i4) {
                m2.d(false);
                d4.d();
                m2.b.f.j0(geg.c);
            }
            final int i5 = this.G.i;
            if (l != this.s0(i5)) {
                this.p0(i5, l);
            }
            n23 = l;
            if (b) {
                n23 = 1;
            }
            this.G.e();
            m2.c();
        }
        final ArrayList i6 = this.i;
        final jva j3 = (jva)i6.remove(i6.size() - 1);
        if (j3 != null && !s4) {
            ++j3.c;
        }
        this.j = j3;
        this.k = dhc2.d() + n23;
        this.m = dhc2.d();
        this.l = dhc2.d() + n23;
    }
    
    public final void q0(final Object o) {
        Object o2 = o;
        if (o instanceof f8j) {
            o2 = new kva((f8j)o, this.m - 1);
            if (this.S) {
                final jfg f = this.M.b.f;
                f.j0(reg.c);
                t08.g0(f, 0, o2);
            }
            this.d.add(o);
        }
        this.r0(o2);
    }
    
    public final void r() {
        this.q(false);
        final b0j b = this.B();
        if (b != null) {
            final int b2 = b.b;
            if ((b2 & 0x1) != 0x0) {
                b.b = (b2 | 0x2);
            }
        }
    }
    
    public final void r0(final Object o) {
        if (this.S) {
            this.I.T(o);
            return;
        }
        final u5m g = this.G;
        final boolean n = g.n;
        final mi6 m = this.M;
        if (!n) {
            final bva a = g.a(g.i);
            final jfg f = m.b.f;
            f.j0(ydg.c);
            t08.h0(f, 0, (Object)a, 1, o);
            return;
        }
        final int n2 = g.l - x5m.d(g.b, g.i) - 1;
        if (m.a.G.i - m.f < 0) {
            final u5m g2 = this.G;
            final bva a2 = g2.a(g2.i);
            final jfg f2 = m.b.f;
            f2.j0(leg.f);
            t08.h0(f2, 0, o, 1, (Object)a2);
            f2.e[f2.f - f2.c[f2.d - 1].a] = n2;
            return;
        }
        m.d(true);
        final jfg f3 = m.b.f;
        f3.j0(leg.g);
        t08.g0(f3, 0, o);
        f3.e[f3.f - f3.c[f3.d - 1].a] = n2;
    }
    
    public final void s() {
        this.q(false);
    }
    
    public final int s0(final int n) {
        if (n >= 0) {
            final int[] o = this.o;
            if (o != null) {
                final int n2 = o[n];
                if (n2 >= 0) {
                    return n2;
                }
            }
            return this.G.o(n);
        }
        final hlf p = this.p;
        if (p == null || p.c(n) < 0) {
            return 0;
        }
        final int c = p.c(n);
        if (c >= 0) {
            return p.c[c];
        }
        final StringBuilder sb = new StringBuilder("Cannot find value for key ");
        sb.append(n);
        qiq.u(sb.toString());
        throw null;
    }
    
    public final void t() {
        this.q(true);
    }
    
    public final void t0() {
        if (!this.r) {
            ti6.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            ti6.a("useNode() called while inserting");
        }
        final u5m g = this.G;
        final Object n = g.n(g.i);
        final mi6 m = this.M;
        m.c();
        m.h.add(n);
        if (this.y && n instanceof kh6) {
            m.b();
            m.b.f.j0((gfg)ffg.c);
        }
    }
    
    public final void u() {
        this.q(false);
    }
    
    public final b0j v() {
        final ArrayList e = this.E;
        b0j b0j;
        if (!e.isEmpty()) {
            b0j = (b0j)e.remove(e.size() - 1);
        }
        else {
            b0j = null;
        }
        if (b0j != null) {
            b0j.b &= 0xFFFFFFF7;
            this.g.q();
            final int b = this.B;
            final amf f = b0j.f;
            Object o2 = null;
            Label_0267: {
                if (f != null) {
                    if ((b0j.b & 0x10) == 0x0) {
                        final Object[] b2 = f.b;
                        final int[] c = f.c;
                        final long[] a = f.a;
                        final int n = a.length - 2;
                        if (n >= 0) {
                            int n2 = 0;
                            while (true) {
                                long n3 = a[n2];
                                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                                    final int n4 = 8 - (~(n2 - n) >>> 31);
                                    for (int i = 0; i < n4; ++i) {
                                        if ((n3 & 0xFFL) < 128L) {
                                            final int n5 = (n2 << 3) + i;
                                            final Object o = b2[n5];
                                            if (c[n5] != b) {
                                                o2 = new df0(b0j, b, f);
                                                break Label_0267;
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
                }
                o2 = null;
            }
            final mi6 m = this.M;
            if (o2 != null) {
                final jfg f2 = m.b.f;
                f2.j0(feg.c);
                t08.h0(f2, 0, o2, 1, (Object)this.h);
            }
            final int b3 = b0j.b;
            if ((b3 & 0x200) != 0x0) {
                b0j.b = (b3 & 0xFFFFFDFF);
                final jfg f3 = m.b.f;
                f3.j0((gfg)ieg.c);
                t08.g0(f3, 0, (Object)b0j);
                final int b4 = b0j.b;
                b0j.b = (b4 & 0xFFFFFF7F);
                if ((b4 & 0x400) != 0x0) {
                    b0j.b = (b4 & 0xFFFFFB7F);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        while (true) {
            Label_0531: {
                if (b0j == null) {
                    break Label_0531;
                }
                final int b5 = b0j.b;
                if ((b5 & 0x10) != 0x0) {
                    break Label_0531;
                }
                if ((b5 & 0x1) == 0x0) {
                    if (!this.q) {
                        break Label_0531;
                    }
                }
                if (b0j.c == null) {
                    bva c2;
                    if (this.S) {
                        final y5m j = this.I;
                        c2 = j.b(j.v);
                    }
                    else {
                        final u5m g = this.G;
                        c2 = g.a(g.i);
                    }
                    b0j.c = c2;
                }
                b0j.b &= 0xFFFFFFFB;
                this.q(false);
                return b0j;
            }
            b0j = null;
            continue;
        }
    }
    
    public final void w() {
        boolean w = false;
        this.q(false);
        this.b.d();
        this.q(false);
        final mi6 m = this.M;
        if (m.c) {
            m.d(false);
            m.d(false);
            m.b.f.j0(geg.c);
            m.c = false;
        }
        m.b();
        if (m.d.b != 0) {
            ti6.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            ti6.a("Start/end imbalance");
        }
        this.i();
        this.G.c();
        if (this.x.d() != 0) {
            w = true;
        }
        this.w = w;
    }
    
    public final void x(final boolean b, final jva j) {
        this.i.add((Object)this.j);
        this.j = j;
        final int l = this.l;
        final dhc n = this.n;
        n.e(l);
        n.e(this.m);
        n.e(this.k);
        if (b) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }
    
    public final void y() {
        final v5m h = new v5m();
        if (this.C) {
            h.d();
        }
        if (this.b.e()) {
            h.F = new jlf();
        }
        this.H = h;
        final y5m o = h.o();
        o.e(true);
        this.I = o;
    }
    
    public final vl6 z() {
        hva u;
        if ((u = this.U) == null) {
            u = new hva((sl6)this.h);
            this.U = u;
        }
        return (vl6)u;
    }
}
