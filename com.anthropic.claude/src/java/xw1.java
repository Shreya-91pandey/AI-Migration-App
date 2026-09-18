public final class xw1 extends m6n implements lta
{
    public final v2k A;
    public final String B;
    public final String C;
    public t2k D;
    public byte w;
    public final it9 x;
    public final x3j y;
    public final muj z;
    
    public xw1(final it9 x, final x3j y, final f07 f07, final muj z, final v2k a, final String b, final String c) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        super(1, f07);
    }
    
    public final Object b(final Object o) {
        return ((xw1)this.create((f07)o)).invokeSuspend(lqo.a);
    }
    
    public final f07 create(final f07 f07) {
        return (f07)new xw1(this.x, this.y, f07, this.z, this.A, this.B, this.C);
    }
    
    public final Object invokeSuspend(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        xw1.x:Lit9;
        //     4: getfield        it9.b:Le3a;
        //     7: astore          7
        //     9: aload_0        
        //    10: getfield        xw1.w:B
        //    13: istore_2       
        //    14: aload_0        
        //    15: getfield        xw1.y:Lx3j;
        //    18: astore          6
        //    20: aload_0        
        //    21: getfield        xw1.z:Lmuj;
        //    24: astore          8
        //    26: iload_2        
        //    27: ifeq            95
        //    30: iload_2        
        //    31: iconst_1       
        //    32: if_icmpeq       71
        //    35: iload_2        
        //    36: iconst_2       
        //    37: if_icmpne       64
        //    40: aload_0        
        //    41: getfield        xw1.D:Lt2k;
        //    44: astore          5
        //    46: aload           5
        //    48: astore          4
        //    50: aload_1        
        //    51: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //    54: aload           5
        //    56: astore_1       
        //    57: goto            275
        //    60: astore_1       
        //    61: goto            322
        //    64: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    66: invokestatic    en9.q:(Ljava/lang/String;)V
        //    69: aconst_null    
        //    70: areturn        
        //    71: aload_0        
        //    72: getfield        xw1.D:Lt2k;
        //    75: astore          4
        //    77: aload           4
        //    79: astore          5
        //    81: aload_1        
        //    82: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //    85: aload           4
        //    87: astore_1       
        //    88: goto            209
        //    91: astore_1       
        //    92: goto            221
        //    95: aload_1        
        //    96: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //    99: aload           7
        //   101: ifnull          116
        //   104: aload           7
        //   106: invokevirtual   e3a.G:()V
        //   109: goto            116
        //   112: astore_1       
        //   113: goto            394
        //   116: aload           6
        //   118: iconst_1       
        //   119: putfield        x3j.v:Z
        //   122: aload           8
        //   124: getfield        muj.b:Z
        //   127: ifne            336
        //   130: aload_0        
        //   131: getfield        xw1.A:Lv2k;
        //   134: aload_0        
        //   135: getfield        xw1.B:Ljava/lang/String;
        //   138: invokeinterface v2k.m:(Ljava/lang/String;)Lt2k;
        //   143: astore_1       
        //   144: aload_1        
        //   145: astore          4
        //   147: aload           8
        //   149: getfield        muj.a:Z
        //   152: istore_3       
        //   153: getstatic       pc7.v:Lpc7;
        //   156: astore          9
        //   158: iload_3        
        //   159: ifne            237
        //   162: aload_1        
        //   163: astore          5
        //   165: aload           8
        //   167: iconst_1       
        //   168: putfield        muj.b:Z
        //   171: aload_1        
        //   172: astore          5
        //   174: aload_0        
        //   175: aload_1        
        //   176: putfield        xw1.D:Lt2k;
        //   179: aload_1        
        //   180: astore          5
        //   182: aload_0        
        //   183: iconst_1       
        //   184: putfield        xw1.w:B
        //   187: aload_1        
        //   188: astore          5
        //   190: aload           8
        //   192: aload_1        
        //   193: aload_0        
        //   194: invokevirtual   muj.d:(Lt2k;Lh07;)Ljava/lang/Object;
        //   197: astore          4
        //   199: aload           4
        //   201: aload           9
        //   203: if_acmpne       209
        //   206: goto            272
        //   209: aload_1        
        //   210: astore          4
        //   212: aload           8
        //   214: iconst_0       
        //   215: putfield        muj.b:Z
        //   218: goto            275
        //   221: aload           5
        //   223: astore          4
        //   225: aload           8
        //   227: iconst_0       
        //   228: putfield        muj.b:Z
        //   231: aload           5
        //   233: astore          4
        //   235: aload_1        
        //   236: athrow         
        //   237: aload_1        
        //   238: astore          4
        //   240: aload_0        
        //   241: aload_1        
        //   242: putfield        xw1.D:Lt2k;
        //   245: aload_1        
        //   246: astore          4
        //   248: aload_0        
        //   249: iconst_2       
        //   250: putfield        xw1.w:B
        //   253: aload_1        
        //   254: astore          4
        //   256: aload           8
        //   258: aload_1        
        //   259: aload_0        
        //   260: invokevirtual   muj.b:(Lt2k;Lh07;)Ljava/lang/Object;
        //   263: astore          5
        //   265: aload           5
        //   267: aload           9
        //   269: if_acmpne       275
        //   272: aload           9
        //   274: areturn        
        //   275: aload           7
        //   277: ifnull          320
        //   280: aload           7
        //   282: getfield        e3a.x:Ljava/lang/Object;
        //   285: checkcast       Ljava/nio/channels/FileChannel;
        //   288: astore          4
        //   290: aload           4
        //   292: ifnonnull       298
        //   295: goto            320
        //   298: aload           4
        //   300: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //   303: aload           7
        //   305: aconst_null    
        //   306: putfield        e3a.x:Ljava/lang/Object;
        //   309: aload_1        
        //   310: areturn        
        //   311: astore_1       
        //   312: aload           7
        //   314: aconst_null    
        //   315: putfield        e3a.x:Ljava/lang/Object;
        //   318: aload_1        
        //   319: athrow         
        //   320: aload_1        
        //   321: areturn        
        //   322: aload           4
        //   324: invokeinterface java/lang/AutoCloseable.close:()V
        //   329: aload_1        
        //   330: athrow         
        //   331: astore          4
        //   333: goto            348
        //   336: new             Ljava/lang/IllegalStateException;
        //   339: astore_1       
        //   340: aload_1        
        //   341: ldc             "Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?"
        //   343: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   346: aload_1        
        //   347: athrow         
        //   348: aload           7
        //   350: ifnull          391
        //   353: aload           7
        //   355: getfield        e3a.x:Ljava/lang/Object;
        //   358: checkcast       Ljava/nio/channels/FileChannel;
        //   361: astore_1       
        //   362: aload_1        
        //   363: ifnonnull       369
        //   366: goto            391
        //   369: aload_1        
        //   370: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //   373: aload           7
        //   375: aconst_null    
        //   376: putfield        e3a.x:Ljava/lang/Object;
        //   379: goto            391
        //   382: astore_1       
        //   383: aload           7
        //   385: aconst_null    
        //   386: putfield        e3a.x:Ljava/lang/Object;
        //   389: aload_1        
        //   390: athrow         
        //   391: aload           4
        //   393: athrow         
        //   394: aload           6
        //   396: getfield        x3j.v:Z
        //   399: ifne            419
        //   402: ldc             "Unable to open database '"
        //   404: aload_0        
        //   405: getfield        xw1.C:Ljava/lang/String;
        //   408: ldc             "'. Was a proper path / name used in Room's database builder?"
        //   410: invokestatic    hia.k:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   413: aload_1        
        //   414: invokestatic    fvd.o:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   417: aconst_null    
        //   418: areturn        
        //   419: aload_1        
        //   420: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  50     54     60     64     Any
        //  81     85     91     237    Any
        //  104    109    112    421    Any
        //  116    144    331    394    Any
        //  147    153    60     64     Any
        //  165    171    91     237    Any
        //  174    179    91     237    Any
        //  182    187    91     237    Any
        //  190    199    91     237    Any
        //  212    218    60     64     Any
        //  225    231    60     64     Any
        //  235    237    60     64     Any
        //  240    245    60     64     Any
        //  248    253    60     64     Any
        //  256    265    60     64     Any
        //  280    290    112    421    Any
        //  298    303    311    320    Any
        //  303    309    112    421    Any
        //  312    320    112    421    Any
        //  322    331    331    394    Any
        //  336    348    331    394    Any
        //  353    362    112    421    Any
        //  369    373    382    391    Any
        //  373    379    112    421    Any
        //  383    391    112    421    Any
        //  391    394    112    421    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 216 out of bounds for length 216
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.util.Objects.checkIndex(Objects.java:371)
        //     at java.util.ArrayList.get(ArrayList.java:435)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:714)
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
}
