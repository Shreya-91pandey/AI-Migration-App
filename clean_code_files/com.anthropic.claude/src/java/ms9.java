import java.util.Queue;
import java.io.InputStream;
import java.util.ArrayDeque;
import io.sentry.android.core.e1;
import java.io.File;
import java.io.EOFException;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import io.sentry.android.core.SentryAndroidOptions;

public final class ms9
{
    public boolean a;
    public final Object b;
    public Object c;
    
    public ms9() {
        this.b = new Object();
    }
    
    public ms9(final SentryAndroidOptions b) {
        this.c = new ArrayList();
        this.a = false;
        this.b = b;
    }
    
    public ms9(final Object b, final wmm c, final boolean a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public ms9(final rwd b, final sv9 c) {
        this.b = b;
        this.c = c;
    }
    
    public static void d(final BufferedInputStream bufferedInputStream, long n) {
        while (n > 0L) {
            final long skip = ((InputStream)bufferedInputStream).skip(n);
            if (skip == 0L) {
                if (((InputStream)bufferedInputStream).read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                --n;
            }
            else {
                n -= skip;
            }
        }
    }
    
    public boolean a(final long n) {
        final ArrayList list = (ArrayList)((sv9)this.c).v();
        while (true) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final Object value = list.get(i);
                if (ri2.C(((reh)value).d(), n)) {
                    final reh reh = (reh)value;
                    return reh != null && reh.a();
                }
            }
            final Object value = null;
            continue;
        }
    }
    
    public e1 b(final BufferedInputStream p0, final int p1, final File p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        ms9.b:Ljava/lang/Object;
        //     4: checkcast       Lio/sentry/android/core/SentryAndroidOptions;
        //     7: astore          9
        //     9: aconst_null    
        //    10: astore          5
        //    12: aconst_null    
        //    13: astore          7
        //    15: aconst_null    
        //    16: astore          8
        //    18: aload           5
        //    20: astore          4
        //    22: new             Lio/sentry/android/core/d1;
        //    25: astore          10
        //    27: aload           5
        //    29: astore          4
        //    31: aload           10
        //    33: aload_1        
        //    34: iload_2        
        //    35: invokespecial   io/sentry/android/core/d1.<init>:(Ljava/io/BufferedInputStream;I)V
        //    38: aload           7
        //    40: astore          5
        //    42: new             Ljava/io/InputStreamReader;
        //    45: astore          11
        //    47: aload           7
        //    49: astore          5
        //    51: aload           11
        //    53: aload           10
        //    55: getstatic       java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
        //    58: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    61: new             Lio/sentry/l2;
        //    64: astore          12
        //    66: aload           12
        //    68: aload           11
        //    70: invokespecial   io/sentry/l2.<init>:(Ljava/io/Reader;)V
        //    73: aload           12
        //    75: getfield        io/sentry/l2.v:Lio/sentry/vendor/gson/stream/a;
        //    78: astore          13
        //    80: aload           12
        //    82: invokevirtual   io/sentry/l2.K0:()V
        //    85: aconst_null    
        //    86: astore          4
        //    88: aconst_null    
        //    89: astore_1       
        //    90: aload           4
        //    92: astore          5
        //    94: aload_1        
        //    95: astore          6
        //    97: aload           13
        //    99: invokevirtual   io/sentry/vendor/gson/stream/a.peek:()Lio/sentry/vendor/gson/stream/b;
        //   102: getstatic       io/sentry/vendor/gson/stream/b.NAME:Lio/sentry/vendor/gson/stream/b;
        //   105: if_acmpne       228
        //   108: aload           13
        //   110: invokevirtual   io/sentry/vendor/gson/stream/a.h0:()Ljava/lang/String;
        //   113: astore          5
        //   115: aload           5
        //   117: invokevirtual   java/lang/String.hashCode:()I
        //   120: istore_2       
        //   121: iload_2        
        //   122: ldc             55126294
        //   124: if_icmpeq       163
        //   127: iload_2        
        //   128: ldc             1874684019
        //   130: if_icmpeq       136
        //   133: goto            192
        //   136: aload           5
        //   138: ldc             "platform"
        //   140: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   143: ifeq            192
        //   146: aload           12
        //   148: invokevirtual   io/sentry/l2.M:()Ljava/lang/String;
        //   151: astore          5
        //   153: aload_1        
        //   154: astore          6
        //   156: goto            204
        //   159: astore_1       
        //   160: goto            289
        //   163: aload           5
        //   165: ldc             "timestamp"
        //   167: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   170: ifeq            192
        //   173: aload           12
        //   175: aload           9
        //   177: invokevirtual   io/sentry/y6.getLogger:()Lio/sentry/b1;
        //   180: invokevirtual   io/sentry/l2.n0:(Lio/sentry/b1;)Ljava/util/Date;
        //   183: astore          6
        //   185: aload           4
        //   187: astore          5
        //   189: goto            204
        //   192: aload           12
        //   194: invokevirtual   io/sentry/l2.y:()V
        //   197: aload_1        
        //   198: astore          6
        //   200: aload           4
        //   202: astore          5
        //   204: aload           5
        //   206: astore          4
        //   208: aload           6
        //   210: astore_1       
        //   211: aload           5
        //   213: ifnull          90
        //   216: aload           5
        //   218: astore          4
        //   220: aload           6
        //   222: astore_1       
        //   223: aload           6
        //   225: ifnull          90
        //   228: aload           8
        //   230: astore_1       
        //   231: ldc             "native"
        //   233: aload           5
        //   235: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   238: ifeq            263
        //   241: aload           8
        //   243: astore_1       
        //   244: aload           6
        //   246: ifnull          263
        //   249: new             Lio/sentry/android/core/e1;
        //   252: astore_1       
        //   253: aload_1        
        //   254: aload_3        
        //   255: aload           6
        //   257: invokevirtual   java/util/Date.getTime:()J
        //   260: invokespecial   io/sentry/android/core/e1.<init>:(Ljava/io/File;J)V
        //   263: aload_1        
        //   264: astore          5
        //   266: aload           11
        //   268: invokevirtual   java/io/Reader.close:()V
        //   271: aload_1        
        //   272: astore          4
        //   274: aload           10
        //   276: invokevirtual   io/sentry/android/core/d1.close:()V
        //   279: aload_1        
        //   280: areturn        
        //   281: astore_1       
        //   282: goto            341
        //   285: astore_1       
        //   286: goto            315
        //   289: aload           11
        //   291: invokevirtual   java/io/Reader.close:()V
        //   294: goto            309
        //   297: astore          4
        //   299: aload           7
        //   301: astore          5
        //   303: aload_1        
        //   304: aload           4
        //   306: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   309: aload           7
        //   311: astore          5
        //   313: aload_1        
        //   314: athrow         
        //   315: aload           10
        //   317: invokevirtual   io/sentry/android/core/d1.close:()V
        //   320: goto            335
        //   323: astore          6
        //   325: aload           5
        //   327: astore          4
        //   329: aload_1        
        //   330: aload           6
        //   332: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   335: aload           5
        //   337: astore          4
        //   339: aload_1        
        //   340: athrow         
        //   341: aload           9
        //   343: invokevirtual   io/sentry/y6.getLogger:()Lio/sentry/b1;
        //   346: getstatic       io/sentry/v5.DEBUG:Lio/sentry/v5;
        //   349: aload_1        
        //   350: ldc             "Error parsing event JSON from: %s"
        //   352: iconst_1       
        //   353: anewarray       Ljava/lang/Object;
        //   356: dup            
        //   357: iconst_0       
        //   358: aload_3        
        //   359: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   362: aastore        
        //   363: invokeinterface io/sentry/b1.e:(Lio/sentry/v5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   368: aload           4
        //   370: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  22     27     281    285    Any
        //  31     38     281    285    Any
        //  42     47     285    341    Any
        //  51     61     285    341    Any
        //  61     85     159    315    Any
        //  97     121    159    315    Any
        //  136    153    159    315    Any
        //  163    185    159    315    Any
        //  192    197    159    315    Any
        //  231    241    159    315    Any
        //  249    263    159    315    Any
        //  266    271    285    341    Any
        //  274    279    281    285    Any
        //  289    294    297    309    Any
        //  303    309    285    341    Any
        //  313    315    285    341    Any
        //  315    320    323    335    Any
        //  329    335    281    285    Any
        //  339    341    281    285    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 179 out of bounds for length 179
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
    
    public ub2 c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          5
        //     5: new             Ljava/io/ByteArrayInputStream;
        //     8: astore          6
        //    10: getstatic       java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
        //    13: astore          4
        //    15: aload           6
        //    17: aload_1        
        //    18: aload           4
        //    20: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //    23: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    26: aload           5
        //    28: aload           6
        //    30: aload           4
        //    32: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    35: new             Lio/sentry/l2;
        //    38: astore          7
        //    40: aload           7
        //    42: aload           5
        //    44: invokespecial   io/sentry/l2.<init>:(Ljava/io/Reader;)V
        //    47: aload           7
        //    49: getfield        io/sentry/l2.v:Lio/sentry/vendor/gson/stream/a;
        //    52: astore          6
        //    54: aload           7
        //    56: invokevirtual   io/sentry/l2.K0:()V
        //    59: iconst_m1      
        //    60: istore_2       
        //    61: aconst_null    
        //    62: astore_1       
        //    63: iload_2        
        //    64: istore_3       
        //    65: aload_1        
        //    66: astore          4
        //    68: aload           6
        //    70: invokevirtual   io/sentry/vendor/gson/stream/a.peek:()Lio/sentry/vendor/gson/stream/b;
        //    73: getstatic       io/sentry/vendor/gson/stream/b.NAME:Lio/sentry/vendor/gson/stream/b;
        //    76: if_acmpne       184
        //    79: aload           6
        //    81: invokevirtual   io/sentry/vendor/gson/stream/a.h0:()Ljava/lang/String;
        //    84: astore          4
        //    86: aload           4
        //    88: invokevirtual   java/lang/String.hashCode:()I
        //    91: istore_3       
        //    92: iload_3        
        //    93: ldc             -1106363674
        //    95: if_icmpeq       133
        //    98: iload_3        
        //    99: ldc             3575610
        //   101: if_icmpeq       107
        //   104: goto            155
        //   107: aload           4
        //   109: ldc             "type"
        //   111: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   114: ifeq            155
        //   117: aload           7
        //   119: invokevirtual   io/sentry/l2.M:()Ljava/lang/String;
        //   122: astore          4
        //   124: iload_2        
        //   125: istore_3       
        //   126: goto            165
        //   129: astore_1       
        //   130: goto            217
        //   133: aload           4
        //   135: ldc             "length"
        //   137: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   140: ifeq            155
        //   143: aload           7
        //   145: invokevirtual   io/sentry/l2.nextInt:()I
        //   148: istore_3       
        //   149: aload_1        
        //   150: astore          4
        //   152: goto            165
        //   155: aload           7
        //   157: invokevirtual   io/sentry/l2.y:()V
        //   160: aload_1        
        //   161: astore          4
        //   163: iload_2        
        //   164: istore_3       
        //   165: iload_3        
        //   166: istore_2       
        //   167: aload           4
        //   169: astore_1       
        //   170: aload           4
        //   172: ifnull          63
        //   175: iload_3        
        //   176: istore_2       
        //   177: aload           4
        //   179: astore_1       
        //   180: iload_3        
        //   181: iflt            63
        //   184: iload_3        
        //   185: iflt            210
        //   188: new             Lub2;
        //   191: astore_1       
        //   192: aload_1        
        //   193: aload           4
        //   195: iload_3        
        //   196: invokespecial   ub2.<init>:(Ljava/lang/String;I)V
        //   199: aload           5
        //   201: invokevirtual   java/io/Reader.close:()V
        //   204: aload_1        
        //   205: areturn        
        //   206: astore_1       
        //   207: goto            235
        //   210: aload           5
        //   212: invokevirtual   java/io/Reader.close:()V
        //   215: aconst_null    
        //   216: areturn        
        //   217: aload           5
        //   219: invokevirtual   java/io/Reader.close:()V
        //   222: goto            233
        //   225: astore          4
        //   227: aload_1        
        //   228: aload           4
        //   230: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   233: aload_1        
        //   234: athrow         
        //   235: aload_0        
        //   236: getfield        ms9.b:Ljava/lang/Object;
        //   239: checkcast       Lio/sentry/android/core/SentryAndroidOptions;
        //   242: invokevirtual   io/sentry/y6.getLogger:()Lio/sentry/b1;
        //   245: getstatic       io/sentry/v5.DEBUG:Lio/sentry/v5;
        //   248: aload_1        
        //   249: ldc             "Error parsing item header"
        //   251: iconst_0       
        //   252: anewarray       Ljava/lang/Object;
        //   255: invokeinterface io/sentry/b1.e:(Lio/sentry/v5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   260: aconst_null    
        //   261: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  0      35     206    210    Any
        //  35     59     129    235    Any
        //  68     92     129    235    Any
        //  107    124    129    235    Any
        //  133    149    129    235    Any
        //  155    160    129    235    Any
        //  188    199    129    235    Any
        //  199    204    206    210    Any
        //  210    215    206    210    Any
        //  217    222    225    233    Any
        //  227    233    206    210    Any
        //  233    235    206    210    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0217:
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
    
    public void e(final zer zer) {
        final Object b;
        monitorenter(b = this.b);
        Label_0046: {
            try {
                ArrayDeque c;
                if ((c = (ArrayDeque)this.c) == null) {
                    c = new ArrayDeque();
                    this.c = c;
                }
                break Label_0046;
            }
            finally {
                monitorexit(b);
                final ArrayDeque c;
                ((Queue)c).add((Object)zer);
                monitorexit(b);
            }
        }
    }
    
    public void f(final cgr cgr) {
        final Object b = this.b;
        Object o;
        monitorenter(o = b);
        Label_0096: {
            try {
                if (this.c == null || this.a) {
                    break Label_0096;
                }
                this.a = true;
                monitorexit(o);
                while (true) {
                    monitorenter(o = b);
                    Label_0074: {
                        try {
                            final zer zer = (zer)((ArrayDeque)this.c).poll();
                            if (zer == null) {
                                this.a = false;
                                monitorexit(o);
                                return;
                            }
                            break Label_0074;
                        }
                        finally {
                            monitorexit(o);
                            monitorexit(o);
                            final zer zer;
                            zer.a(cgr);
                        }
                    }
                }
            }
            finally {
                monitorexit(o);
                monitorexit(o);
            }
        }
    }
}
