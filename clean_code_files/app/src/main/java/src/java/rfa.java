import android.os.BaseBundle;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.SharedPreferences;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;

public final class rfa
{
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;
    
    public rfa() {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = true;
    }
    
    public rfa(final b4d b, final f1n c, final ikh d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = true;
    }
    
    public rfa(final bc7 b, final xzg c, final awp d, final boolean a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public rfa(final FirebaseMessaging d, final t1n b) {
        this.d = d;
        this.b = b;
    }
    
    public rfa(final Object c) {
        this.b = new vzq((byte)17);
        this.c = c;
        this.d = s89.v;
    }
    
    public boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dup            
        //     2: astore          4
        //     4: monitorenter   
        //     5: aload_0        
        //     6: dup            
        //     7: astore          4
        //     9: monitorenter   
        //    10: aload_0        
        //    11: getfield        rfa.a:Z
        //    14: istore_1       
        //    15: iload_1        
        //    16: ifeq            25
        //    19: aload           4
        //    21: monitorexit    
        //    22: goto            78
        //    25: aload_0        
        //    26: invokevirtual   rfa.b:()Ljava/lang/Boolean;
        //    29: astore_2       
        //    30: aload_0        
        //    31: aload_2        
        //    32: putfield        rfa.c:Ljava/lang/Object;
        //    35: aload_2        
        //    36: ifnonnull       70
        //    39: new             Luy8;
        //    42: astore_2       
        //    43: aload_2        
        //    44: bipush          16
        //    46: invokespecial   uy8.<init>:(B)V
        //    49: aload_0        
        //    50: getfield        rfa.b:Ljava/lang/Object;
        //    53: checkcast       Lt1n;
        //    56: checkcast       Lpi9;
        //    59: aload_2        
        //    60: invokevirtual   pi9.a:(Luy8;)V
        //    63: goto            70
        //    66: astore_2       
        //    67: goto            152
        //    70: aload_0        
        //    71: iconst_1       
        //    72: putfield        rfa.a:Z
        //    75: aload           4
        //    77: monitorexit    
        //    78: aload_0        
        //    79: getfield        rfa.c:Ljava/lang/Object;
        //    82: checkcast       Ljava/lang/Boolean;
        //    85: astore_2       
        //    86: aload_2        
        //    87: ifnull          102
        //    90: aload_2        
        //    91: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    94: istore_1       
        //    95: goto            141
        //    98: astore_2       
        //    99: goto            157
        //   102: aload_0        
        //   103: getfield        rfa.d:Ljava/lang/Object;
        //   106: checkcast       Lcom/google/firebase/messaging/FirebaseMessaging;
        //   109: getfield        com/google/firebase/messaging/FirebaseMessaging.a:Lffa;
        //   112: astore_2       
        //   113: aload_2        
        //   114: invokevirtual   ffa.a:()V
        //   117: aload_2        
        //   118: getfield        ffa.g:Le2d;
        //   121: invokevirtual   e2d.get:()Ljava/lang/Object;
        //   124: checkcast       Lpt7;
        //   127: astore_2       
        //   128: aload_2        
        //   129: dup            
        //   130: astore          5
        //   132: monitorenter   
        //   133: aload_2        
        //   134: getfield        pt7.a:Z
        //   137: istore_1       
        //   138: aload           5
        //   140: monitorexit    
        //   141: aload           4
        //   143: monitorexit    
        //   144: iload_1        
        //   145: ireturn        
        //   146: astore_3       
        //   147: aload           5
        //   149: monitorexit    
        //   150: aload_3        
        //   151: athrow         
        //   152: aload           4
        //   154: monitorexit    
        //   155: aload_2        
        //   156: athrow         
        //   157: aload           4
        //   159: monitorexit    
        //   160: aload_2        
        //   161: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  5      10     98     162    Any
        //  10     15     66     157    Any
        //  19     22     98     162    Any
        //  25     35     66     157    Any
        //  39     63     66     157    Any
        //  70     75     66     157    Any
        //  75     78     98     162    Any
        //  78     86     98     162    Any
        //  90     95     98     162    Any
        //  102    133    98     162    Any
        //  133    138    146    152    Any
        //  138    141    98     162    Any
        //  147    150    146    152    Any
        //  150    152    98     162    Any
        //  152    155    66     157    Any
        //  155    157    98     162    Any
        //  157    160    98     162    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 89 out of bounds for length 89
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
    
    public Boolean b() {
        final ffa a = ((FirebaseMessaging)this.d).a;
        a.a();
        final Context a2 = a.a;
        final SharedPreferences sharedPreferences = a2.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return sharedPreferences.getBoolean("auto_init", false);
        }
        try {
            final PackageManager packageManager = a2.getPackageManager();
            if (packageManager != null) {
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a2.getPackageName(), 128);
                if (applicationInfo != null) {
                    final Bundle metaData = applicationInfo.metaData;
                    if (metaData != null && ((BaseBundle)metaData).containsKey("firebase_messaging_auto_init_enabled")) {
                        return ((BaseBundle)applicationInfo.metaData).getBoolean("firebase_messaging_auto_init_enabled");
                    }
                }
            }
            return null;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
}
