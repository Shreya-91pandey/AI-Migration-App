import java.util.concurrent.atomic.AtomicBoolean;
import java.io.File;

public final class vca implements r55
{
    public final File a;
    public final wzk b;
    public final ozl c;
    public final h87 d;
    public final AtomicBoolean e;
    public final cof f;
    
    public vca(final File a, final wzk b, final ozl c, final h87 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new AtomicBoolean(false);
        this.f = new cof();
    }
    
    public final Object a(co4 co4, h07 v) {
        Object o = null;
        Label_0049: {
            if (v instanceof tca) {
                o = v;
                final int z = ((tca)o).z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ((tca)o).z = z + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new tca(this, v);
        }
        final Object x = ((tca)o).x;
        final int z2 = ((tca)o).z;
        final cof f = this.f;
        boolean w = false;
        Label_0254: {
            if (z2 != 0) {
                if (z2 == 1) {
                    w = ((tca)o).w;
                    co4 = (co4)((tca)o).v;
                    try {
                        vt4.g0(x);
                        final boolean b = w;
                    }
                    finally {
                        final Object o2 = co4;
                        co4 = (co4)v;
                        break Label_0254;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(x);
            if (this.e.get()) {
                en9.q("StorageConnection has already been disposed.");
                return null;
            }
            w = f.f();
            try {
                v = (h07)new rca(this.a, this.b);
                Object o2;
                try {
                    ((tca)o).v = (rca)v;
                    ((tca)o).w = w;
                    ((tca)o).z = 1;
                    co4 = (co4)co4.h(v, w, o);
                    final pc7 v2 = pc7.v;
                    if (co4 == v2) {
                        return v2;
                    }
                    final boolean b = w;
                    try {
                        ((r55)v).close();
                    }
                    finally {}
                    if (v == null) {
                        if (b) {
                            f.g((Object)null);
                        }
                        return co4;
                    }
                    try {
                        throw v;
                    }
                    finally {
                        w = b;
                    }
                }
                finally {
                    o2 = v;
                }
                try {
                    ((r55)o2).close();
                }
                finally {
                    final Throwable t;
                    soh.j((Throwable)co4, t);
                }
                throw co4;
            }
            finally {}
        }
        if (w) {
            f.g((Object)null);
        }
    }
    
    public final Object b(final qv7 p0, final h07 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Luca;
        //     4: ifeq            38
        //     7: aload_2        
        //     8: checkcast       Luca;
        //    11: astore          5
        //    13: aload           5
        //    15: getfield        uca.C:I
        //    18: istore_3       
        //    19: iload_3        
        //    20: ldc             -2147483648
        //    22: iand           
        //    23: ifeq            38
        //    26: aload           5
        //    28: iload_3        
        //    29: ldc             -2147483648
        //    31: iadd           
        //    32: putfield        uca.C:I
        //    35: goto            49
        //    38: new             Luca;
        //    41: dup            
        //    42: aload_0        
        //    43: aload_2        
        //    44: invokespecial   uca.<init>:(Lvca;Lh07;)V
        //    47: astore          5
        //    49: aload           5
        //    51: getfield        uca.A:Ljava/lang/Object;
        //    54: astore          6
        //    56: aload           5
        //    58: getfield        uca.C:I
        //    61: istore_3       
        //    62: aload_0        
        //    63: getfield        vca.a:Ljava/io/File;
        //    66: astore          8
        //    68: getstatic       pc7.v:Lpc7;
        //    71: astore          9
        //    73: iload_3        
        //    74: ifeq            159
        //    77: iload_3        
        //    78: iconst_1       
        //    79: if_icmpeq       132
        //    82: iload_3        
        //    83: iconst_2       
        //    84: if_icmpne       125
        //    87: aload           5
        //    89: getfield        uca.y:Lxda;
        //    92: astore          4
        //    94: aload           5
        //    96: getfield        uca.x:Ljava/io/File;
        //    99: astore_2       
        //   100: aload           5
        //   102: getfield        uca.w:Laof;
        //   105: astore_1       
        //   106: aload           6
        //   108: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   111: aload_2        
        //   112: astore          5
        //   114: goto            412
        //   117: astore          7
        //   119: aload_2        
        //   120: astore          5
        //   122: goto            518
        //   125: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   127: invokestatic    en9.q:(Ljava/lang/String;)V
        //   130: aconst_null    
        //   131: areturn        
        //   132: aload           5
        //   134: getfield        uca.z:I
        //   137: istore_3       
        //   138: aload           5
        //   140: getfield        uca.w:Laof;
        //   143: astore_1       
        //   144: aload           5
        //   146: getfield        uca.v:Lqv7;
        //   149: astore          7
        //   151: aload           6
        //   153: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   156: goto            261
        //   159: aload           6
        //   161: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //   164: aload_0        
        //   165: getfield        vca.e:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   168: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   171: ifne            682
        //   174: aload           8
        //   176: invokevirtual   java/io/File.getCanonicalFile:()Ljava/io/File;
        //   179: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //   182: astore_2       
        //   183: aload_2        
        //   184: ifnull          211
        //   187: aload_2        
        //   188: invokevirtual   java/io/File.mkdirs:()Z
        //   191: pop            
        //   192: aload_2        
        //   193: invokevirtual   java/io/File.isDirectory:()Z
        //   196: ifeq            202
        //   199: goto            211
        //   202: aload           8
        //   204: ldc             "Unable to create parent directories of "
        //   206: invokestatic    ebq.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   209: aconst_null    
        //   210: areturn        
        //   211: aload           5
        //   213: aload_1        
        //   214: putfield        uca.v:Lqv7;
        //   217: aload_0        
        //   218: getfield        vca.f:Lcof;
        //   221: astore_2       
        //   222: aload           5
        //   224: aload_2        
        //   225: putfield        uca.w:Laof;
        //   228: iconst_0       
        //   229: istore_3       
        //   230: aload           5
        //   232: iconst_0       
        //   233: putfield        uca.z:I
        //   236: aload           5
        //   238: iconst_1       
        //   239: putfield        uca.C:I
        //   242: aload_1        
        //   243: astore          7
        //   245: aload_2        
        //   246: astore_1       
        //   247: aload_2        
        //   248: aload           5
        //   250: invokevirtual   cof.c:(Lf07;)Ljava/lang/Object;
        //   253: aload           9
        //   255: if_acmpne       261
        //   258: goto            402
        //   261: aload_1        
        //   262: astore          4
        //   264: new             Ljava/io/File;
        //   267: astore_2       
        //   268: aload_1        
        //   269: astore          4
        //   271: aload           8
        //   273: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   276: astore          6
        //   278: aload_1        
        //   279: astore          4
        //   281: new             Ljava/lang/StringBuilder;
        //   284: astore          10
        //   286: aload_1        
        //   287: astore          4
        //   289: aload           10
        //   291: invokespecial   java/lang/StringBuilder.<init>:()V
        //   294: aload_1        
        //   295: astore          4
        //   297: aload           10
        //   299: aload           6
        //   301: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   304: pop            
        //   305: aload_1        
        //   306: astore          4
        //   308: aload           10
        //   310: ldc             ".tmp"
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: pop            
        //   316: aload_1        
        //   317: astore          4
        //   319: aload_2        
        //   320: aload           10
        //   322: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   325: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   328: aload_1        
        //   329: astore          4
        //   331: new             Lrca;
        //   334: dup            
        //   335: aload_2        
        //   336: aload_0        
        //   337: getfield        vca.b:Lwzk;
        //   340: invokespecial   rca.<init>:(Ljava/io/File;Lwzk;)V
        //   343: astore          6
        //   345: aload           5
        //   347: aconst_null    
        //   348: putfield        uca.v:Lqv7;
        //   351: aload           5
        //   353: aload_1        
        //   354: putfield        uca.w:Laof;
        //   357: aload           5
        //   359: aload_2        
        //   360: putfield        uca.x:Ljava/io/File;
        //   363: aload           5
        //   365: aload           6
        //   367: putfield        uca.y:Lxda;
        //   370: aload           5
        //   372: iload_3        
        //   373: putfield        uca.z:I
        //   376: aload           5
        //   378: iconst_2       
        //   379: putfield        uca.C:I
        //   382: aload           7
        //   384: aload           6
        //   386: aload           5
        //   388: invokeinterface zta.d:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   393: astore          4
        //   395: aload           4
        //   397: aload           9
        //   399: if_acmpne       405
        //   402: aload           9
        //   404: areturn        
        //   405: aload           6
        //   407: astore          4
        //   409: aload_2        
        //   410: astore          5
        //   412: aload           4
        //   414: invokeinterface r55.close:()V
        //   419: aconst_null    
        //   420: astore          7
        //   422: goto            427
        //   425: astore          7
        //   427: aload           7
        //   429: ifnonnull       497
        //   432: aload_1        
        //   433: astore          6
        //   435: aload_1        
        //   436: astore_2       
        //   437: aload           5
        //   439: astore          4
        //   441: aload           5
        //   443: invokevirtual   java/io/File.exists:()Z
        //   446: ifeq            486
        //   449: aload_1        
        //   450: astore          6
        //   452: aload_1        
        //   453: astore_2       
        //   454: aload           5
        //   456: astore          4
        //   458: aload           5
        //   460: aload           8
        //   462: invokestatic    c5q.o:(Ljava/io/File;Ljava/io/File;)V
        //   465: goto            486
        //   468: astore_1       
        //   469: aload           6
        //   471: astore          4
        //   473: goto            672
        //   476: astore          5
        //   478: aload_2        
        //   479: astore_1       
        //   480: aload           4
        //   482: astore_2       
        //   483: goto            564
        //   486: aload_1        
        //   487: aconst_null    
        //   488: invokeinterface aof.g:(Ljava/lang/Object;)V
        //   493: getstatic       lqo.a:Llqo;
        //   496: areturn        
        //   497: aload_1        
        //   498: astore          6
        //   500: aload_1        
        //   501: astore_2       
        //   502: aload           5
        //   504: astore          4
        //   506: aload           7
        //   508: athrow         
        //   509: astore          7
        //   511: aload           6
        //   513: astore          4
        //   515: aload_2        
        //   516: astore          5
        //   518: aload           4
        //   520: invokeinterface r55.close:()V
        //   525: goto            546
        //   528: astore          9
        //   530: aload_1        
        //   531: astore          6
        //   533: aload_1        
        //   534: astore_2       
        //   535: aload           5
        //   537: astore          4
        //   539: aload           7
        //   541: aload           9
        //   543: invokestatic    soh.j:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   546: aload_1        
        //   547: astore          6
        //   549: aload_1        
        //   550: astore_2       
        //   551: aload           5
        //   553: astore          4
        //   555: aload           7
        //   557: athrow         
        //   558: astore_1       
        //   559: goto            672
        //   562: astore          5
        //   564: aload_1        
        //   565: astore          4
        //   567: aload_2        
        //   568: invokevirtual   java/io/File.exists:()Z
        //   571: ifeq            582
        //   574: aload_1        
        //   575: astore          4
        //   577: aload_2        
        //   578: invokevirtual   java/io/File.delete:()Z
        //   581: pop            
        //   582: aload_1        
        //   583: astore          4
        //   585: new             Ljava/io/IOException;
        //   588: astore          6
        //   590: aload_1        
        //   591: astore          4
        //   593: new             Ljava/lang/StringBuilder;
        //   596: astore          7
        //   598: aload_1        
        //   599: astore          4
        //   601: aload           7
        //   603: ldc             "Unable to rename "
        //   605: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   608: aload_1        
        //   609: astore          4
        //   611: aload           7
        //   613: aload_2        
        //   614: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   617: pop            
        //   618: aload_1        
        //   619: astore          4
        //   621: aload           7
        //   623: ldc             " to "
        //   625: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   628: pop            
        //   629: aload_1        
        //   630: astore          4
        //   632: aload           7
        //   634: aload           8
        //   636: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   639: pop            
        //   640: aload_1        
        //   641: astore          4
        //   643: aload           7
        //   645: ldc             ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
        //   647: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   650: pop            
        //   651: aload_1        
        //   652: astore          4
        //   654: aload           6
        //   656: aload           7
        //   658: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   661: aload           5
        //   663: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   666: aload_1        
        //   667: astore          4
        //   669: aload           6
        //   671: athrow         
        //   672: aload           4
        //   674: aconst_null    
        //   675: invokeinterface aof.g:(Ljava/lang/Object;)V
        //   680: aload_1        
        //   681: athrow         
        //   682: ldc             "StorageConnection has already been disposed."
        //   684: invokestatic    en9.q:(Ljava/lang/String;)V
        //   687: aconst_null    
        //   688: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  106    111    117    125    Any
        //  264    268    558    562    Any
        //  271    278    558    562    Any
        //  281    286    558    562    Any
        //  289    294    558    562    Any
        //  297    305    558    562    Any
        //  308    316    558    562    Any
        //  319    328    558    562    Any
        //  331    345    562    564    Ljava/io/IOException;
        //  331    345    558    562    Any
        //  345    395    509    518    Any
        //  412    419    425    427    Any
        //  441    449    476    486    Ljava/io/IOException;
        //  441    449    468    476    Any
        //  458    465    476    486    Ljava/io/IOException;
        //  458    465    468    476    Any
        //  506    509    476    486    Ljava/io/IOException;
        //  506    509    468    476    Any
        //  518    525    528    546    Any
        //  539    546    476    486    Ljava/io/IOException;
        //  539    546    468    476    Any
        //  555    558    476    486    Ljava/io/IOException;
        //  555    558    468    476    Any
        //  567    574    558    562    Any
        //  577    582    558    562    Any
        //  585    590    558    562    Any
        //  593    598    558    562    Any
        //  601    608    558    562    Any
        //  611    618    558    562    Any
        //  621    629    558    562    Any
        //  632    640    558    562    Any
        //  643    651    558    562    Any
        //  654    666    558    562    Any
        //  669    672    558    562    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0402:
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
    
    @Override
    public final void close() {
        this.e.set(true);
        this.d.a();
    }
}
