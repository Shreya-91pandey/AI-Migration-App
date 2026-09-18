import java.io.FileOutputStream;

public final class wda extends m6n implements lta
{
    public final Object A;
    public FileOutputStream w;
    public FileOutputStream x;
    public boolean y;
    public final xda z;
    
    public wda(final xda z, final Object a, final f07 f07) {
        this.z = z;
        this.A = a;
        super(1, f07);
    }
    
    public final Object b(final Object o) {
        return ((wda)this.create((f07)o)).invokeSuspend(lqo.a);
    }
    
    public final f07 create(final f07 f07) {
        return (f07)new wda(this.z, this.A, f07);
    }
    
    public final Object invokeSuspend(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        wda.y:Z
        //     4: istore_2       
        //     5: getstatic       lqo.a:Llqo;
        //     8: astore          7
        //    10: aload_0        
        //    11: getfield        wda.z:Lxda;
        //    14: astore          6
        //    16: iload_2        
        //    17: ifeq            61
        //    20: iload_2        
        //    21: iconst_1       
        //    22: if_icmpne       54
        //    25: aload_0        
        //    26: getfield        wda.x:Ljava/io/FileOutputStream;
        //    29: astore          5
        //    31: aload_0        
        //    32: getfield        wda.w:Ljava/io/FileOutputStream;
        //    35: astore          4
        //    37: aload           4
        //    39: astore_3       
        //    40: aload_1        
        //    41: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //    44: aload           5
        //    46: astore_1       
        //    47: goto            141
        //    50: astore_1       
        //    51: goto            173
        //    54: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    56: invokestatic    en9.q:(Ljava/lang/String;)V
        //    59: aconst_null    
        //    60: areturn        
        //    61: aload_1        
        //    62: invokestatic    vt4.g0:(Ljava/lang/Object;)V
        //    65: new             Ljava/io/FileOutputStream;
        //    68: astore_1       
        //    69: aload_1        
        //    70: aload           6
        //    72: getfield        rca.a:Ljava/io/File;
        //    75: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    78: aload_0        
        //    79: getfield        wda.A:Ljava/lang/Object;
        //    82: astore          5
        //    84: aload           6
        //    86: getfield        rca.b:Lwzk;
        //    89: astore_3       
        //    90: new             Lwsi;
        //    93: astore          4
        //    95: aload           4
        //    97: aload_1        
        //    98: invokespecial   wsi.<init>:(Ljava/io/FileOutputStream;)V
        //   101: aload_0        
        //   102: aload_1        
        //   103: putfield        wda.w:Ljava/io/FileOutputStream;
        //   106: aload_0        
        //   107: aload_1        
        //   108: putfield        wda.x:Ljava/io/FileOutputStream;
        //   111: aload_0        
        //   112: iconst_1       
        //   113: putfield        wda.y:Z
        //   116: aload_3        
        //   117: aload           5
        //   119: aload           4
        //   121: invokeinterface wzk.g:(Ljava/lang/Object;Lwsi;)V
        //   126: getstatic       pc7.v:Lpc7;
        //   129: astore_3       
        //   130: aload           7
        //   132: aload_3        
        //   133: if_acmpne       138
        //   136: aload_3        
        //   137: areturn        
        //   138: aload_1        
        //   139: astore          4
        //   141: aload           4
        //   143: astore_3       
        //   144: aload_1        
        //   145: invokevirtual   java/io/FileOutputStream.getFD:()Ljava/io/FileDescriptor;
        //   148: invokevirtual   java/io/FileDescriptor.sync:()V
        //   151: aload           4
        //   153: aconst_null    
        //   154: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   157: aload           7
        //   159: areturn        
        //   160: astore_1       
        //   161: goto            185
        //   164: astore_3       
        //   165: aload_1        
        //   166: astore          4
        //   168: aload_3        
        //   169: astore_1       
        //   170: aload           4
        //   172: astore_3       
        //   173: aload_1        
        //   174: athrow         
        //   175: astore          4
        //   177: aload_3        
        //   178: aload_1        
        //   179: invokestatic    zn2.r:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   182: aload           4
        //   184: athrow         
        //   185: aload_1        
        //   186: astore_3       
        //   187: aload_1        
        //   188: instanceof      Ljava/io/FileNotFoundException;
        //   191: ifeq            210
        //   194: aload           6
        //   196: getfield        rca.a:Ljava/io/File;
        //   199: invokevirtual   java/io/File.getParent:()Ljava/lang/String;
        //   202: aload_1        
        //   203: checkcast       Ljava/io/FileNotFoundException;
        //   206: invokestatic    l7r.o:(Ljava/lang/String;Ljava/io/FileNotFoundException;)Ljava/lang/Exception;
        //   209: astore_3       
        //   210: aload_3        
        //   211: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  40     44     50     54     Any
        //  65     84     160    212    Ljava/lang/Exception;
        //  84     126    164    173    Any
        //  144    151    50     54     Any
        //  151    157    160    212    Ljava/lang/Exception;
        //  173    175    175    185    Any
        //  177    185    160    212    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0138:
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
