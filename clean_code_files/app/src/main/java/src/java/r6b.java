import java.util.Iterator;
import java.util.List;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.Objects;
import android.content.Context;
import java.util.HashMap;

public final class r6b implements tck, j8g, nt9
{
    public static final String J;
    public final vhk A;
    public final frh B;
    public final vhk C;
    public final wn6 D;
    public final HashMap E;
    public Boolean F;
    public final ddb G;
    public final f5q H;
    public final c2l I;
    public final Context v;
    public final HashMap w;
    public final p98 x;
    public boolean y;
    public final Object z;
    
    static {
        J = krd.e("GreedyScheduler");
    }
    
    public r6b(final Context v, final wn6 d, final ddo ddo, final frh b, final vhk c, final f5q h) {
        this.w = new HashMap();
        this.z = new Object();
        this.A = new vhk(new ap2((byte)2));
        this.E = new HashMap();
        this.v = v;
        final j9j f = d.f;
        this.x = new p98(this, f, d.d);
        this.I = new c2l(f, c);
        this.H = h;
        this.G = new ddb(ddo);
        this.D = d;
        this.B = b;
        this.C = c;
    }
    
    @Override
    public final void a(final v5q v5q, final mv6 mv6) {
        final v4q k = ao2.K(v5q);
        final boolean b = mv6 instanceof kv6;
        final vhk c = this.C;
        final c2l i = this.I;
        final vhk a = this.A;
        if (b) {
            if (!a.j(k)) {
                final krd c2 = krd.c();
                k.toString();
                c2.getClass();
                final com v = a.v(k);
                i.R(v);
                ((f5q)c.x).a.execute((Runnable)new n68((Object)c, (Object)v, (Object)null, (byte)5));
            }
        }
        else {
            final krd c3 = krd.c();
            k.toString();
            c3.getClass();
            final com o = a.o(k);
            if (o != null) {
                i.r(o);
                c.u(o, ((lv6)mv6).a());
            }
        }
    }
    
    @Override
    public final void b(final v4q v4q, final boolean b) {
        final com o = this.A.o(v4q);
        if (o != null) {
            this.I.r(o);
        }
        final Object z = this.z;
        synchronized (z) {
            final opc opc = (opc)this.w.remove((Object)v4q);
            monitorexit(z);
            if (opc != null) {
                final krd c = krd.c();
                Objects.toString((Object)v4q);
                c.getClass();
                opc.g((CancellationException)null);
            }
            if (!b) {
                monitorenter(this.z);
                try {
                    this.E.remove((Object)v4q);
                }
                finally {}
            }
        }
    }
    
    @Override
    public final boolean c() {
        return false;
    }
    
    @Override
    public final void d(final String s) {
        Boolean f;
        if ((f = this.F) == null) {
            f = sqh.a(this.v);
            this.F = f;
        }
        if (!f) {
            krd.c().d(r6b.J, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.y) {
            this.B.a(this);
            this.y = true;
        }
        krd.c().getClass();
        final p98 x = this.x;
        if (x != null) {
            final Runnable runnable = (Runnable)x.c.remove((Object)s);
            if (runnable != null) {
                ((Handler)x.b.w).removeCallbacks(runnable);
            }
        }
        final vhk a = this.A;
        final Object x2 = a.x;
        synchronized (x2) {
            final List e = ((ap2)a.w).e(s);
            monitorexit(x2);
            for (final com com : e) {
                this.I.r(com);
                this.C.u(com, -512);
            }
        }
    }
    
    @Override
    public final void e(final v5q... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        r6b.F:Ljava/lang/Boolean;
        //     4: astore          10
        //     6: aload           10
        //     8: astore          9
        //    10: aload           10
        //    12: ifnonnull       33
        //    15: aload_0        
        //    16: getfield        r6b.v:Landroid/content/Context;
        //    19: invokestatic    sqh.a:(Landroid/content/Context;)Z
        //    22: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    25: astore          9
        //    27: aload_0        
        //    28: aload           9
        //    30: putfield        r6b.F:Ljava/lang/Boolean;
        //    33: aload           9
        //    35: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    38: ifne            54
        //    41: invokestatic    krd.c:()Lkrd;
        //    44: getstatic       r6b.J:Ljava/lang/String;
        //    47: ldc_w           "Ignoring schedule request in a secondary process"
        //    50: invokevirtual   krd.d:(Ljava/lang/String;Ljava/lang/String;)V
        //    53: return         
        //    54: aload_0        
        //    55: getfield        r6b.y:Z
        //    58: ifne            74
        //    61: aload_0        
        //    62: getfield        r6b.B:Lfrh;
        //    65: aload_0        
        //    66: invokevirtual   frh.a:(Lnt9;)V
        //    69: aload_0        
        //    70: iconst_1       
        //    71: putfield        r6b.y:Z
        //    74: new             Ljava/util/HashSet;
        //    77: dup            
        //    78: invokespecial   java/util/HashSet.<init>:()V
        //    81: astore          11
        //    83: new             Ljava/util/HashSet;
        //    86: dup            
        //    87: invokespecial   java/util/HashSet.<init>:()V
        //    90: astore          12
        //    92: aload_1        
        //    93: arraylength    
        //    94: istore_3       
        //    95: iconst_0       
        //    96: istore_2       
        //    97: aconst_null    
        //    98: astore          9
        //   100: iload_2        
        //   101: iload_3        
        //   102: if_icmpge       622
        //   105: aload_1        
        //   106: iload_2        
        //   107: aaload         
        //   108: astore          13
        //   110: aload           13
        //   112: invokestatic    ao2.K:(Lv5q;)Lv4q;
        //   115: astore          9
        //   117: aload_0        
        //   118: getfield        r6b.A:Lvhk;
        //   121: aload           9
        //   123: invokevirtual   vhk.j:(Lv4q;)Z
        //   126: ifeq            132
        //   129: goto            611
        //   132: aload_0        
        //   133: getfield        r6b.z:Ljava/lang/Object;
        //   136: astore          14
        //   138: aload           14
        //   140: dup            
        //   141: astore          16
        //   143: monitorenter   
        //   144: aload           13
        //   146: invokestatic    ao2.K:(Lv5q;)Lv4q;
        //   149: astore          15
        //   151: aload_0        
        //   152: getfield        r6b.E:Ljava/util/HashMap;
        //   155: aload           15
        //   157: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   160: checkcast       Lq6b;
        //   163: astore          10
        //   165: aload           10
        //   167: astore          9
        //   169: aload           10
        //   171: ifnonnull       224
        //   174: new             Lq6b;
        //   177: astore          9
        //   179: aload           13
        //   181: getfield        v5q.k:I
        //   184: istore          4
        //   186: aload_0        
        //   187: getfield        r6b.D:Lwn6;
        //   190: getfield        wn6.d:Ly7j;
        //   193: astore          10
        //   195: aload           9
        //   197: iload           4
        //   199: invokestatic    java/lang/System.currentTimeMillis:()J
        //   202: invokespecial   q6b.<init>:(IJ)V
        //   205: aload_0        
        //   206: getfield        r6b.E:Ljava/util/HashMap;
        //   209: aload           15
        //   211: aload           9
        //   213: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   216: pop            
        //   217: goto            224
        //   220: astore_1       
        //   221: goto            617
        //   224: aload           9
        //   226: getfield        q6b.b:J
        //   229: lstore          7
        //   231: aload           13
        //   233: getfield        v5q.k:I
        //   236: aload           9
        //   238: getfield        q6b.a:I
        //   241: isub           
        //   242: iconst_5       
        //   243: isub           
        //   244: iconst_0       
        //   245: invokestatic    java/lang/Math.max:(II)I
        //   248: i2l            
        //   249: lstore          5
        //   251: aload           16
        //   253: monitorexit    
        //   254: aload           13
        //   256: invokevirtual   v5q.a:()J
        //   259: lload           5
        //   261: ldc2_w          30000
        //   264: lmul           
        //   265: lload           7
        //   267: ladd           
        //   268: invokestatic    java/lang/Math.max:(JJ)J
        //   271: lstore          5
        //   273: aload_0        
        //   274: getfield        r6b.D:Lwn6;
        //   277: getfield        wn6.d:Ly7j;
        //   280: astore          9
        //   282: invokestatic    java/lang/System.currentTimeMillis:()J
        //   285: lstore          7
        //   287: aload           13
        //   289: getfield        v5q.b:Lx4q;
        //   292: getstatic       x4q.v:Lx4q;
        //   295: if_acmpne       611
        //   298: lload           7
        //   300: lload           5
        //   302: lcmp           
        //   303: ifge            418
        //   306: aload_0        
        //   307: getfield        r6b.x:Lp98;
        //   310: astore          14
        //   312: aload           14
        //   314: ifnull          611
        //   317: aload           14
        //   319: getfield        p98.b:Lj9j;
        //   322: astore          10
        //   324: aload           14
        //   326: getfield        p98.c:Ljava/util/HashMap;
        //   329: astore          9
        //   331: aload           9
        //   333: aload           13
        //   335: getfield        v5q.a:Ljava/lang/String;
        //   338: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   341: checkcast       Ljava/lang/Runnable;
        //   344: astore          15
        //   346: aload           15
        //   348: ifnull          364
        //   351: aload           10
        //   353: getfield        j9j.w:Ljava/lang/Object;
        //   356: checkcast       Landroid/os/Handler;
        //   359: aload           15
        //   361: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //   364: new             Lo98;
        //   367: dup            
        //   368: aload           14
        //   370: aload           13
        //   372: iconst_0       
        //   373: invokespecial   o98.<init>:(Ljava/lang/Object;Ljava/lang/Object;B)V
        //   376: astore          14
        //   378: aload           9
        //   380: aload           13
        //   382: getfield        v5q.a:Ljava/lang/String;
        //   385: aload           14
        //   387: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   390: pop            
        //   391: invokestatic    java/lang/System.currentTimeMillis:()J
        //   394: lstore          7
        //   396: aload           10
        //   398: getfield        j9j.w:Ljava/lang/Object;
        //   401: checkcast       Landroid/os/Handler;
        //   404: aload           14
        //   406: lload           5
        //   408: lload           7
        //   410: lsub           
        //   411: invokevirtual   android/os/Handler.postDelayed:(Ljava/lang/Runnable;J)Z
        //   414: pop            
        //   415: goto            611
        //   418: getstatic       fv6.j:Lfv6;
        //   421: aload           13
        //   423: getfield        v5q.j:Lfv6;
        //   426: invokestatic    mlc.q:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   429: ifne            525
        //   432: aload           13
        //   434: getfield        v5q.j:Lfv6;
        //   437: astore          9
        //   439: aload           9
        //   441: getfield        fv6.d:Z
        //   444: ifeq            467
        //   447: invokestatic    krd.c:()Lkrd;
        //   450: astore          9
        //   452: aload           13
        //   454: invokevirtual   v5q.toString:()Ljava/lang/String;
        //   457: pop            
        //   458: aload           9
        //   460: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   463: pop            
        //   464: goto            611
        //   467: aload           9
        //   469: getfield        fv6.i:Ljava/util/Set;
        //   472: checkcast       Ljava/util/Collection;
        //   475: invokeinterface java/util/Collection.isEmpty:()Z
        //   480: ifne            503
        //   483: invokestatic    krd.c:()Lkrd;
        //   486: astore          9
        //   488: aload           13
        //   490: invokevirtual   v5q.toString:()Ljava/lang/String;
        //   493: pop            
        //   494: aload           9
        //   496: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   499: pop            
        //   500: goto            611
        //   503: aload           11
        //   505: aload           13
        //   507: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   510: pop            
        //   511: aload           12
        //   513: aload           13
        //   515: getfield        v5q.a:Ljava/lang/String;
        //   518: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   521: pop            
        //   522: goto            611
        //   525: aload_0        
        //   526: getfield        r6b.A:Lvhk;
        //   529: aload           13
        //   531: invokestatic    ao2.K:(Lv5q;)Lv4q;
        //   534: invokevirtual   vhk.j:(Lv4q;)Z
        //   537: ifne            611
        //   540: invokestatic    krd.c:()Lkrd;
        //   543: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   546: pop            
        //   547: aload_0        
        //   548: getfield        r6b.A:Lvhk;
        //   551: aload           13
        //   553: invokestatic    ao2.K:(Lv5q;)Lv4q;
        //   556: invokevirtual   vhk.v:(Lv4q;)Lcom;
        //   559: astore          13
        //   561: aload_0        
        //   562: getfield        r6b.I:Lc2l;
        //   565: aload           13
        //   567: invokevirtual   c2l.R:(Lcom;)V
        //   570: aload_0        
        //   571: getfield        r6b.C:Lvhk;
        //   574: astore          10
        //   576: aload           10
        //   578: getfield        vhk.x:Ljava/lang/Object;
        //   581: checkcast       Lf5q;
        //   584: astore          9
        //   586: new             Ln68;
        //   589: dup            
        //   590: aload           10
        //   592: aload           13
        //   594: aconst_null    
        //   595: iconst_5       
        //   596: invokespecial   n68.<init>:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
        //   599: astore          10
        //   601: aload           9
        //   603: getfield        f5q.a:Lgzk;
        //   606: aload           10
        //   608: invokevirtual   gzk.execute:(Ljava/lang/Runnable;)V
        //   611: iinc            2, 1
        //   614: goto            97
        //   617: aload           16
        //   619: monitorexit    
        //   620: aload_1        
        //   621: athrow         
        //   622: aload_0        
        //   623: getfield        r6b.z:Ljava/lang/Object;
        //   626: astore          10
        //   628: aload           10
        //   630: dup            
        //   631: astore          17
        //   633: monitorenter   
        //   634: aload           11
        //   636: invokevirtual   java/util/HashSet.isEmpty:()Z
        //   639: ifne            787
        //   642: ldc_w           ","
        //   645: aload           12
        //   647: invokestatic    android/text/TextUtils.join:(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
        //   650: pop            
        //   651: invokestatic    krd.c:()Lkrd;
        //   654: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   657: pop            
        //   658: aload           11
        //   660: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //   663: astore          11
        //   665: aload           9
        //   667: astore_1       
        //   668: aload           11
        //   670: invokeinterface java/util/Iterator.hasNext:()Z
        //   675: ifeq            787
        //   678: aload           11
        //   680: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   685: checkcast       Lv5q;
        //   688: astore          12
        //   690: aload           12
        //   692: invokestatic    ao2.K:(Lv5q;)Lv4q;
        //   695: astore          9
        //   697: aload_0        
        //   698: getfield        r6b.w:Ljava/util/HashMap;
        //   701: aload           9
        //   703: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   706: ifne            784
        //   709: aload_0        
        //   710: getfield        r6b.G:Lddb;
        //   713: astore          13
        //   715: aload_0        
        //   716: getfield        r6b.H:Lf5q;
        //   719: getfield        f5q.b:Lic7;
        //   722: astore          14
        //   724: getstatic       n4q.a:I
        //   727: istore_2       
        //   728: aload           14
        //   730: invokestatic    ien.a:(Lhc7;)Lfz6;
        //   733: astore          15
        //   735: new             Ldjh;
        //   738: astore          14
        //   740: aload           14
        //   742: aload           13
        //   744: aload           12
        //   746: aload_0        
        //   747: aload_1        
        //   748: bipush          16
        //   750: invokespecial   djh.<init>:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf07;B)V
        //   753: aload           15
        //   755: aload_1        
        //   756: iconst_0       
        //   757: aload           14
        //   759: iconst_3       
        //   760: invokestatic    rhc.G:(Loc7;Lhc7;ILzta;I)Lwmm;
        //   763: astore          12
        //   765: aload_0        
        //   766: getfield        r6b.w:Ljava/util/HashMap;
        //   769: aload           9
        //   771: aload           12
        //   773: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   776: pop            
        //   777: goto            784
        //   780: astore_1       
        //   781: goto            791
        //   784: goto            668
        //   787: aload           17
        //   789: monitorexit    
        //   790: return         
        //   791: aload           17
        //   793: monitorexit    
        //   794: aload_1        
        //   795: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  144    165    220    622    Any
        //  174    217    220    622    Any
        //  224    254    220    622    Any
        //  617    620    220    622    Any
        //  634    665    780    796    Any
        //  668    777    780    796    Any
        //  787    790    780    796    Any
        //  791    794    780    796    Any
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
}
