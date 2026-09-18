import java.util.Map;
import java.util.Collections;

public final class c2a
{
    public static volatile c2a a;
    public static final c2a b;
    
    static {
        final Object b2 = new Object();
        final Map empty_MAP = Collections.EMPTY_MAP;
        b = (c2a)b2;
    }
    
    public static c2a a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_0       
        //     4: getstatic       c2a.a:Lc2a;
        //     7: astore_0       
        //     8: aload_0        
        //     9: ifnonnull       88
        //    12: ldc             Lc2a;.class
        //    14: dup            
        //    15: astore_2       
        //    16: monitorenter   
        //    17: getstatic       c2a.a:Lc2a;
        //    20: astore_1       
        //    21: aload_1        
        //    22: astore_0       
        //    23: aload_1        
        //    24: ifnonnull       80
        //    27: getstatic       x1a.a:Ljava/lang/Class;
        //    30: astore_1       
        //    31: aconst_null    
        //    32: astore_0       
        //    33: aload_1        
        //    34: ifnonnull       40
        //    37: goto            58
        //    40: aload_1        
        //    41: ldc             "getEmptyRegistry"
        //    43: aconst_null    
        //    44: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    47: aconst_null    
        //    48: aconst_null    
        //    49: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    52: checkcast       Lc2a;
        //    55: astore_1       
        //    56: aload_1        
        //    57: astore_0       
        //    58: aload_0        
        //    59: ifnull          65
        //    62: goto            69
        //    65: getstatic       c2a.b:Lc2a;
        //    68: astore_0       
        //    69: aload_0        
        //    70: putstatic       c2a.a:Lc2a;
        //    73: goto            80
        //    76: astore_0       
        //    77: goto            84
        //    80: aload_2        
        //    81: monitorexit    
        //    82: aload_0        
        //    83: areturn        
        //    84: aload_2        
        //    85: monitorexit    
        //    86: aload_0        
        //    87: athrow         
        //    88: aload_0        
        //    89: areturn        
        //    90: astore_1       
        //    91: goto            58
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     21     76     88     Any
        //  27     31     76     88     Any
        //  40     56     90     94     Ljava/lang/Exception;
        //  40     56     76     88     Any
        //  65     69     76     88     Any
        //  69     73     76     88     Any
        //  80     82     76     88     Any
        //  84     86     76     88     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
