import com.anthropic.claude.application.ClaudeApplication;
import java.util.HashSet;

public final class tom
{
    public static final HashSet d;
    public final String a;
    public final String b;
    public final byte c;
    
    static {
        d = new HashSet();
    }
    
    public tom(final String a, final String b, final byte c) {
        this.c = c;
        this.a = a;
        this.b = b;
        tom.d.add((Object)this);
    }
    
    public final boolean a(final ClaudeApplication p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        tom.c:B
        //     4: istore_2       
        //     5: iconst_1       
        //     6: istore          4
        //     8: iload_2        
        //     9: tableswitch {
        //                0: 41
        //          default: 28
        //        }
        //    28: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    31: bipush          28
        //    33: if_icmplt       41
        //    36: iconst_1       
        //    37: istore_2       
        //    38: goto            43
        //    41: iconst_0       
        //    42: istore_2       
        //    43: iload           4
        //    45: istore_3       
        //    46: iload_2        
        //    47: ifne            226
        //    50: getstatic       nsp.a:Landroid/net/Uri;
        //    53: astore          5
        //    55: invokestatic    android/webkit/WebView.getCurrentWebViewPackage:()Landroid/content/pm/PackageInfo;
        //    58: astore          5
        //    60: aconst_null    
        //    61: astore          6
        //    63: aload           5
        //    65: ifnull          71
        //    68: goto            122
        //    71: ldc             "android.webkit.WebViewUpdateService"
        //    73: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    76: ldc             "getCurrentWebViewPackageName"
        //    78: aconst_null    
        //    79: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    82: aconst_null    
        //    83: aconst_null    
        //    84: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    87: checkcast       Ljava/lang/String;
        //    90: astore          5
        //    92: aload           5
        //    94: ifnonnull       100
        //    97: goto            119
        //   100: aload_1        
        //   101: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   104: astore          7
        //   106: aload           7
        //   108: aload           5
        //   110: iconst_0       
        //   111: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   114: astore          5
        //   116: goto            122
        //   119: aconst_null    
        //   120: astore          5
        //   122: aload           5
        //   124: ifnonnull       133
        //   127: aload           6
        //   129: astore_1       
        //   130: goto            196
        //   133: new             Landroid/content/ComponentName;
        //   136: dup            
        //   137: aload           5
        //   139: getfield        android/content/pm/PackageInfo.packageName:Ljava/lang/String;
        //   142: ldc             "org.chromium.android_webview.services.StartupFeatureMetadataHolder"
        //   144: invokespecial   android/content/ComponentName.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   147: astore          5
        //   149: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   152: bipush          33
        //   154: if_icmplt       180
        //   157: invokestatic    o4.b:()Landroid/content/pm/PackageManager$ComponentInfoFlags;
        //   160: astore          7
        //   162: aload_1        
        //   163: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   166: aload           5
        //   168: aload           7
        //   170: invokestatic    o4.d:(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;Landroid/content/pm/PackageManager$ComponentInfoFlags;)Landroid/content/pm/ServiceInfo;
        //   173: getfield        android/content/pm/ServiceInfo.metaData:Landroid/os/Bundle;
        //   176: astore_1       
        //   177: goto            196
        //   180: aload_1        
        //   181: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   184: aload           5
        //   186: sipush          640
        //   189: invokevirtual   android/content/pm/PackageManager.getServiceInfo:(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;
        //   192: getfield        android/content/pm/ServiceInfo.metaData:Landroid/os/Bundle;
        //   195: astore_1       
        //   196: aload_1        
        //   197: ifnonnull       205
        //   200: iconst_0       
        //   201: istore_3       
        //   202: goto            214
        //   205: aload_1        
        //   206: aload_0        
        //   207: getfield        tom.b:Ljava/lang/String;
        //   210: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //   213: istore_3       
        //   214: iload_3        
        //   215: ifeq            224
        //   218: iload           4
        //   220: istore_3       
        //   221: goto            226
        //   224: iconst_0       
        //   225: istore_3       
        //   226: iload_3        
        //   227: ireturn        
        //   228: astore          5
        //   230: goto            119
        //   233: astore_1       
        //   234: aload           6
        //   236: astore_1       
        //   237: goto            196
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  71     92     228    233    Ljava/lang/ClassNotFoundException;
        //  71     92     228    233    Ljava/lang/IllegalAccessException;
        //  71     92     228    233    Ljava/lang/reflect/InvocationTargetException;
        //  71     92     228    233    Ljava/lang/NoSuchMethodException;
        //  106    116    228    233    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  162    177    233    240    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  180    196    233    240    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0180:
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
