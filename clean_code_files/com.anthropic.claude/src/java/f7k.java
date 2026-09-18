import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import androidx.window.extensions.core.util.function.Consumer;
import android.content.Context;

public final class f7k
{
    public final ClassLoader a;
    public final bw6 b;
    public final bw6 c;
    
    public f7k(final ClassLoader a, final bw6 b) {
        this.a = a;
        this.b = b;
        this.c = new bw6(a);
    }
    
    public static final boolean d(final f7k f7k) {
        final Class loadClass = f7k.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        loadClass.getClass();
        final Method method = loadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        final Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (Modifier.isPublic(method.getModifiers())) {
            method2.getClass();
            if (Modifier.isPublic(method2.getModifiers())) {
                return true;
            }
        }
        return false;
    }
    
    public final WindowLayoutComponent a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        f7k.c:Lbw6;
        //     4: astore          4
        //     6: iconst_0       
        //     7: istore_3       
        //     8: aload           4
        //    10: getfield        bw6.a:Ljava/lang/ClassLoader;
        //    13: ldc             "androidx.window.extensions.WindowExtensionsProvider"
        //    15: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    18: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    21: pop            
        //    22: iload_3        
        //    23: istore_2       
        //    24: new             Llce;
        //    27: dup            
        //    28: aload           4
        //    30: bipush          24
        //    32: invokespecial   lce.<init>:(Ljava/lang/Object;B)V
        //    35: ldc             "WindowExtensionsProvider#getWindowExtensions is not valid"
        //    37: invokestatic    qt7.b0:(Ljta;Ljava/lang/String;)Z
        //    40: ifeq            189
        //    43: iload_3        
        //    44: istore_2       
        //    45: new             Le7k;
        //    48: dup            
        //    49: aload_0        
        //    50: iconst_0       
        //    51: invokespecial   e7k.<init>:(Lf7k;B)V
        //    54: ldc             "WindowExtensions#getWindowLayoutComponent is not valid"
        //    56: invokestatic    qt7.b0:(Ljta;Ljava/lang/String;)Z
        //    59: ifeq            189
        //    62: iload_3        
        //    63: istore_2       
        //    64: new             Le7k;
        //    67: dup            
        //    68: aload_0        
        //    69: iconst_1       
        //    70: invokespecial   e7k.<init>:(Lf7k;B)V
        //    73: ldc             "FoldingFeature class is not valid"
        //    75: invokestatic    qt7.b0:(Ljta;Ljava/lang/String;)Z
        //    78: ifeq            189
        //    81: invokestatic    u2a.a:()I
        //    84: istore_1       
        //    85: iload_1        
        //    86: iconst_1       
        //    87: if_icmpge       95
        //    90: iload_3        
        //    91: istore_2       
        //    92: goto            189
        //    95: iload_1        
        //    96: iconst_1       
        //    97: if_icmpne       108
        //   100: aload_0        
        //   101: invokevirtual   f7k.c:()Z
        //   104: istore_2       
        //   105: goto            189
        //   108: iload_1        
        //   109: iconst_5       
        //   110: if_icmpge       121
        //   113: aload_0        
        //   114: invokevirtual   f7k.b:()Z
        //   117: istore_2       
        //   118: goto            189
        //   121: iload_3        
        //   122: istore_2       
        //   123: aload_0        
        //   124: invokevirtual   f7k.b:()Z
        //   127: ifeq            189
        //   130: iload_3        
        //   131: istore_2       
        //   132: new             Le7k;
        //   135: dup            
        //   136: aload_0        
        //   137: iconst_3       
        //   138: invokespecial   e7k.<init>:(Lf7k;B)V
        //   141: ldc             "DisplayFoldFeature is not valid"
        //   143: invokestatic    qt7.b0:(Ljta;Ljava/lang/String;)Z
        //   146: ifeq            189
        //   149: iload_3        
        //   150: istore_2       
        //   151: new             Le7k;
        //   154: dup            
        //   155: aload_0        
        //   156: iconst_2       
        //   157: invokespecial   e7k.<init>:(Lf7k;B)V
        //   160: ldc             "SupportedWindowFeatures is not valid"
        //   162: invokestatic    qt7.b0:(Ljta;Ljava/lang/String;)Z
        //   165: ifeq            189
        //   168: iload_3        
        //   169: istore_2       
        //   170: new             Le7k;
        //   173: dup            
        //   174: aload_0        
        //   175: iconst_4       
        //   176: invokespecial   e7k.<init>:(Lf7k;B)V
        //   179: ldc             "WindowLayoutComponent#getSupportedWindowFeatures is not valid"
        //   181: invokestatic    qt7.b0:(Ljta;Ljava/lang/String;)Z
        //   184: ifeq            189
        //   187: iconst_1       
        //   188: istore_2       
        //   189: aconst_null    
        //   190: astore          5
        //   192: aload           5
        //   194: astore          4
        //   196: iload_2        
        //   197: ifeq            210
        //   200: invokestatic    androidx/window/extensions/WindowExtensionsProvider.getWindowExtensions:()Landroidx/window/extensions/WindowExtensions;
        //   203: invokeinterface androidx/window/extensions/WindowExtensions.getWindowLayoutComponent:()Landroidx/window/extensions/layout/WindowLayoutComponent;
        //   208: astore          4
        //   210: aload           4
        //   212: areturn        
        //   213: astore          4
        //   215: iload_3        
        //   216: istore_2       
        //   217: goto            189
        //   220: astore          4
        //   222: aload           5
        //   224: astore          4
        //   226: goto            210
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  8      22     213    220    Ljava/lang/ClassNotFoundException;
        //  8      22     213    220    Ljava/lang/NoClassDefFoundError;
        //  200    210    220    229    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0210:
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
    
    public final boolean b() {
        if (this.c()) {
            final StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
            sb.append(Context.class.getName());
            sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
            if (qt7.b0((jta)new e7k(this, (byte)6), sb.toString())) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean c() {
        final StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Activity.class.getName());
        sb.append(", java.util.function.Consumer) is not valid");
        return qt7.b0((jta)new e7k(this, (byte)5), sb.toString());
    }
}
