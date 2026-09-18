import java.util.concurrent.Future;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import android.content.Context;
import com.google.android.gms.net.a;
import java.util.concurrent.CancellationException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;

public final class o98 implements Runnable
{
    public final byte v;
    public Object w;
    public final Object x;
    
    public o98(final czk x) {
        this.v = 2;
        this.x = x;
    }
    
    private final void a() {
        synchronized (this) {
            ((byl)this.x).v = this.w;
        }
    }
    
    private final void b() {
        final y2r y2r = (y2r)this.x;
        final Object x = y2r.x;
        synchronized (x) {
            ((h8g)y2r.y).m((cgr)this.w);
        }
    }
    
    private final void c() {
        final y2r y2r = (y2r)this.x;
        final Object x = y2r.x;
        synchronized (x) {
            final o8g o8g = (o8g)y2r.y;
            final Exception h = ((cgr)this.w).h();
            ao2.z((Object)h);
            o8g.s(h);
        }
    }
    
    private final void d() {
        final y2r y2r = (y2r)this.x;
        final Object x = y2r.x;
        synchronized (x) {
            ((a9g)y2r.y).c(((cgr)this.w).i());
        }
    }
    
    public void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          4
        //     3: iconst_0       
        //     4: istore_1       
        //     5: iload_1        
        //     6: istore_2       
        //     7: aload_0        
        //     8: getfield        o98.x:Ljava/lang/Object;
        //    11: checkcast       Lczk;
        //    14: getfield        czk.w:Ljava/util/ArrayDeque;
        //    17: astore          6
        //    19: iload_1        
        //    20: istore_2       
        //    21: aload           6
        //    23: dup            
        //    24: astore          10
        //    26: monitorenter   
        //    27: iload           4
        //    29: istore_3       
        //    30: iload           4
        //    32: ifne            94
        //    35: aload_0        
        //    36: getfield        o98.x:Ljava/lang/Object;
        //    39: checkcast       Lczk;
        //    42: astore          7
        //    44: aload           7
        //    46: getfield        czk.x:I
        //    49: iconst_4       
        //    50: if_icmpne       74
        //    53: aload           10
        //    55: monitorexit    
        //    56: iload_1        
        //    57: ifeq            144
        //    60: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    63: invokevirtual   java/lang/Thread.interrupt:()V
        //    66: goto            144
        //    69: astore          7
        //    71: goto            267
        //    74: aload           7
        //    76: aload           7
        //    78: getfield        czk.y:J
        //    81: lconst_1       
        //    82: ladd           
        //    83: putfield        czk.y:J
        //    86: aload           7
        //    88: iconst_4       
        //    89: putfield        czk.x:I
        //    92: iconst_1       
        //    93: istore_3       
        //    94: aload_0        
        //    95: getfield        o98.x:Ljava/lang/Object;
        //    98: checkcast       Lczk;
        //   101: getfield        czk.w:Ljava/util/ArrayDeque;
        //   104: invokevirtual   java/util/ArrayDeque.poll:()Ljava/lang/Object;
        //   107: checkcast       Ljava/lang/Runnable;
        //   110: astore          7
        //   112: aload_0        
        //   113: aload           7
        //   115: putfield        o98.w:Ljava/lang/Object;
        //   118: aload           7
        //   120: ifnonnull       145
        //   123: aload_0        
        //   124: getfield        o98.x:Ljava/lang/Object;
        //   127: checkcast       Lczk;
        //   130: iconst_1       
        //   131: putfield        czk.x:I
        //   134: aload           10
        //   136: monitorexit    
        //   137: iload_1        
        //   138: ifeq            144
        //   141: goto            60
        //   144: return         
        //   145: aload           10
        //   147: monitorexit    
        //   148: iload_1        
        //   149: istore_2       
        //   150: invokestatic    java/lang/Thread.interrupted:()Z
        //   153: istore          5
        //   155: iload_1        
        //   156: iload           5
        //   158: ior            
        //   159: istore_1       
        //   160: aload_0        
        //   161: getfield        o98.w:Ljava/lang/Object;
        //   164: checkcast       Ljava/lang/Runnable;
        //   167: invokeinterface java/lang/Runnable.run:()V
        //   172: iload_1        
        //   173: istore_2       
        //   174: aload_0        
        //   175: aconst_null    
        //   176: putfield        o98.w:Ljava/lang/Object;
        //   179: iload_3        
        //   180: istore          4
        //   182: goto            5
        //   185: astore          6
        //   187: goto            275
        //   190: astore          6
        //   192: goto            255
        //   195: astore          9
        //   197: getstatic       czk.A:Ljava/util/logging/Logger;
        //   200: astore          7
        //   202: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //   205: astore          6
        //   207: new             Ljava/lang/StringBuilder;
        //   210: astore          8
        //   212: aload           8
        //   214: invokespecial   java/lang/StringBuilder.<init>:()V
        //   217: aload           8
        //   219: ldc             "Exception while executing runnable "
        //   221: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   224: pop            
        //   225: aload           8
        //   227: aload_0        
        //   228: getfield        o98.w:Ljava/lang/Object;
        //   231: checkcast       Ljava/lang/Runnable;
        //   234: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   237: pop            
        //   238: aload           7
        //   240: aload           6
        //   242: aload           8
        //   244: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   247: aload           9
        //   249: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   252: goto            172
        //   255: iload_1        
        //   256: istore_2       
        //   257: aload_0        
        //   258: aconst_null    
        //   259: putfield        o98.w:Ljava/lang/Object;
        //   262: iload_1        
        //   263: istore_2       
        //   264: aload           6
        //   266: athrow         
        //   267: aload           10
        //   269: monitorexit    
        //   270: iload_1        
        //   271: istore_2       
        //   272: aload           7
        //   274: athrow         
        //   275: iload_2        
        //   276: ifeq            285
        //   279: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   282: invokevirtual   java/lang/Thread.interrupt:()V
        //   285: aload           6
        //   287: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      19     185    288    Any
        //  21     27     185    288    Any
        //  35     56     69     275    Any
        //  74     92     69     275    Any
        //  94     118    69     275    Any
        //  123    137    69     275    Any
        //  145    148    69     275    Any
        //  150    155    185    288    Any
        //  160    172    195    255    Ljava/lang/RuntimeException;
        //  160    172    190    267    Any
        //  174    179    185    288    Any
        //  197    252    190    267    Any
        //  257    262    185    288    Any
        //  264    267    185    288    Any
        //  267    270    69     275    Any
        //  272    275    185    288    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0172:
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
    
    public final void run() {
        final byte v = this.v;
        int n = 0;
        final int n2 = 0;
        switch (v) {
            default: {
                final cgr cgr = (cgr)this.w;
                final Exception ex2;
                Label_0132: {
                    try {
                        cgr.l(((Callable)this.x).call());
                        return;
                    }
                    catch (final Exception ex) {
                        break Label_0132;
                    }
                    cgr.n((Exception)new RuntimeException((Throwable)ex2));
                    return;
                }
                cgr.n(ex2);
                return;
            }
            case 12: {
                Object o = this.x;
                Object b = ((y2r)o).y;
                Label_0250: {
                    try {
                        final cgr b2 = ((i3n)((y2r)o).x).b(((cgr)this.w).i());
                        b = rcn.b;
                        b2.e((Executor)b, (a9g)o);
                        b2.d((Executor)b, (o8g)o);
                        o = new y2r((Executor)b, (g8g)o);
                        b2.b.e((zer)o);
                        b2.p();
                    }
                    catch (final Exception ex3) {
                        break Label_0250;
                    }
                    catch (final RuntimeExecutionException ex4) {
                        if (((Throwable)ex4).getCause() instanceof Exception) {
                            ((y2r)o).s((Exception)((Throwable)ex4).getCause());
                            return;
                        }
                        ((cgr)b).n((Exception)ex4);
                        final Exception ex3;
                        ((cgr)b).n(ex3);
                    }
                    catch (final CancellationException ex5) {}
                }
                return;
            }
            case 11: {
                this.d();
                return;
            }
            case 10: {
                this.c();
                return;
            }
            case 9: {
                this.b();
                return;
            }
            case 8: {
                final rqq rqq = (rqq)this.x;
                Object o2 = rqq.y;
                Label_0446: {
                    try {
                        final cgr cgr2 = (cgr)rqq.x.f((cgr)this.w);
                        if (cgr2 == null) {
                            rqq.s((Exception)new NullPointerException("Continuation returned null"));
                        }
                        else {
                            o2 = rcn.b;
                            cgr2.e((Executor)o2, (a9g)rqq);
                            cgr2.d((Executor)o2, (o8g)rqq);
                            o2 = new y2r((Executor)o2, (g8g)rqq);
                            cgr2.b.e((zer)o2);
                            cgr2.p();
                        }
                    }
                    catch (final Exception ex6) {
                        break Label_0446;
                    }
                    catch (final RuntimeExecutionException ex7) {
                        if (((Throwable)ex7).getCause() instanceof Exception) {
                            ((cgr)o2).n((Exception)((Throwable)ex7).getCause());
                            return;
                        }
                        ((cgr)o2).n((Exception)ex7);
                        final Exception ex6;
                        ((cgr)o2).n(ex6);
                    }
                }
                return;
            }
            case 7: {
                final cgr cgr3 = (cgr)this.w;
                final boolean d = cgr3.d;
                final rqq rqq2 = (rqq)this.x;
                if (d) {
                    rqq2.y.o();
                }
                else {
                    Label_0574: {
                        try {
                            ((rqq)this.x).y.l(rqq2.x.f(cgr3));
                        }
                        catch (final Exception ex8) {
                            break Label_0574;
                        }
                        catch (final RuntimeExecutionException ex9) {
                            final boolean b3 = ((Throwable)ex9).getCause() instanceof Exception;
                            final rqq rqq3 = (rqq)this.x;
                            if (b3) {
                                rqq3.y.n((Exception)((Throwable)ex9).getCause());
                                return;
                            }
                            rqq3.y.n((Exception)ex9);
                            final Exception ex8;
                            ((rqq)this.x).y.n(ex8);
                        }
                    }
                }
                return;
            }
            case 6: {
                final q3b a = com.google.android.gms.net.a.a;
                final Context context = (Context)this.w;
                final qcn qcn = (qcn)this.x;
                try {
                    com.google.android.gms.net.a.c(context);
                    qcn.b((Object)null);
                }
                catch (final Exception ex10) {
                    qcn.a(ex10);
                }
                return;
            }
            case 5: {
                final Object o3 = this.w;
                final boolean cancelled = ((Future)o3).isCancelled();
                final l13 l13 = (l13)this.x;
                int n3 = n2;
                if (cancelled) {
                    o3r.e(l13);
                    goto Label_0815;
                }
                while (true) {
                    try {
                        final Object value = ((Future)o3).get();
                        Label_0758: {
                            if (n3 == 0) {
                                break Label_0758;
                            }
                            try {
                                Thread.currentThread().interrupt();
                                l13.resumeWith(value);
                            }
                            catch (final ExecutionException o3) {}
                        }
                    }
                    catch (final InterruptedException ex11) {
                        n3 = 1;
                        continue;
                    }
                    finally {
                        if (n3 != 0) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    break;
                }
            }
            case 4: {
                this.a();
                return;
            }
            case 3: {
                try {
                    ((Runnable)this.x).run();
                    final Object y = ((gzk)this.w).y;
                    synchronized (y) {
                        ((gzk)this.w).a();
                    }
                }
                finally {
                    final Object y2 = ((gzk)this.w).y;
                    synchronized (y2) {
                        ((gzk)this.w).a();
                        monitorexit(y2);
                    }
                }
            }
            case 2: {
                try {
                    this.e();
                }
                catch (final Error error) {
                    final ArrayDeque w = ((czk)this.x).w;
                    synchronized (w) {
                        ((czk)this.x).x = 1;
                        monitorexit(w);
                        throw error;
                    }
                }
            }
            case 1: {
                while (true) {
                    try {
                        ((Runnable)this.w).run();
                    }
                    finally {
                        final Throwable t;
                        r9n.H((hc7)o89.v, t);
                    }
                    try {
                        final Runnable k1 = ((hcd)this.x).k1();
                        if (k1 != null) {
                            this.w = k1;
                            final int n4 = n + 1;
                            if ((n = n4) < 16) {
                                continue;
                            }
                            final hcd hcd = (hcd)this.x;
                            n = n4;
                            if (!po8.c(hcd.x, (hc7)hcd)) {
                                continue;
                            }
                            final hcd hcd2 = (hcd)this.x;
                            po8.b(hcd2.x, (hc7)hcd2, (Runnable)this);
                        }
                        return;
                    }
                    finally {
                        final hcd hcd3 = (hcd)this.x;
                        final Object b4 = hcd3.B;
                        synchronized (b4) {
                            hcd.C.decrementAndGet((Object)hcd3);
                            monitorexit(b4);
                        }
                    }
                }
                break;
            }
            case 0: {
                final krd c = krd.c();
                final int d2 = p98.d;
                final v5q v5q = (v5q)this.w;
                c.getClass();
                ((p98)this.x).a.e(v5q);
            }
        }
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 2: {
                final Runnable runnable = (Runnable)this.w;
                String s;
                if (runnable != null) {
                    final StringBuilder sb = new StringBuilder("SequentialExecutorWorker{running=");
                    sb.append((Object)runnable);
                    sb.append("}");
                    s = sb.toString();
                }
                else {
                    final StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                    sb2.append(y1j.s(((czk)this.x).x));
                    sb2.append("}");
                    s = sb2.toString();
                }
                return s;
            }
        }
    }
}
