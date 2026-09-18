import kotlinx.coroutines.TimeoutCancellationException;
import java.util.concurrent.locks.ReentrantLock;

public final class sfh
{
    public final byte a;
    public final lta b;
    public final ReentrantLock c;
    public final cof d;
    public int e;
    public boolean f;
    public final dq6[] g;
    public final ntk h;
    public final pv0 i;
    
    public sfh(final int a, final lta b) {
        this.a = (byte)a;
        this.b = b;
        this.c = new ReentrantLock();
        this.d = new cof();
        this.g = new dq6[a];
        this.h = (ntk)new mtk(a);
        this.i = new pv0(a);
    }
    
    public final Object a(final h07 h07) {
        final pv0 i = this.i;
        ofh ofh2 = null;
        Label_0053: {
            if (h07 instanceof ofh) {
                final ofh ofh = (ofh)h07;
                final int x = ofh.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    ofh.x = x + Integer.MIN_VALUE;
                    ofh2 = ofh;
                    break Label_0053;
                }
            }
            ofh2 = new ofh(this, h07);
        }
        final Object v = ofh2.v;
        final int x2 = ofh2.x;
        final ReentrantLock c = this.c;
        final ntk h8 = this.h;
        final pc7 v2 = pc7.v;
        final Object u;
        Label_0238: {
            if (x2 != 0) {
                if (x2 != 1) {
                    Label_0107: {
                        if (x2 == 2) {
                            Label_0335: {
                                try {
                                    vt4.g0(v);
                                    break Label_0238;
                                }
                                finally {
                                    break Label_0335;
                                }
                                break Label_0107;
                            }
                            ((mtk)h8).d();
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vt4.g0(v);
            }
            else {
                vt4.g0(v);
                ofh2.x = 1;
                if (((mtk)h8).a((h07)ofh2) == v2) {
                    return v2;
                }
            }
            c.lock();
            Label_0328: {
                Label_0319: {
                    try {
                        if (this.f) {
                            break Label_0319;
                        }
                        if (!i.isEmpty()) {
                            final Object removeLast = i.removeLast();
                            c.unlock();
                            return removeLast;
                        }
                    }
                    finally {
                        break Label_0328;
                    }
                    c.unlock();
                    if (this.e >= this.a) {
                        throw new IllegalStateException("Check failed.");
                    }
                    final cof d = this.d;
                    final yz4 yz4 = new yz4((byte)3, null, this);
                    final ofh ofh3;
                    ofh3.x = 2;
                    if ((u = zn2.U((aof)d, (lta)yz4, (h07)ofh3)) == v2) {
                        return v2;
                    }
                    break Label_0238;
                }
                tiq.l(21, "Connection pool is closed");
                throw null;
            }
            c.unlock();
            return v2;
        }
        final dq6 dq6 = (dq6)u;
        c.lock();
        Label_0300: {
            try {
                if (!this.f) {
                    this.g[this.e++] = dq6;
                    c.unlock();
                    return dq6;
                }
            }
            finally {
                break Label_0300;
            }
            dq6.close();
            tiq.l(21, "Connection pool is closed");
            throw null;
        }
        c.unlock();
    }
    
    public final Object b(long v, gp6 w, h07 h07) {
        Label_0059: {
            if (h07 instanceof qfh) {
                final qfh qfh = (qfh)h07;
                final int a = qfh.A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    qfh.A = a + Integer.MIN_VALUE;
                    h07 = qfh;
                    break Label_0059;
                }
            }
            h07 = new qfh(this, h07);
        }
        final Object y = ((qfh)h07).y;
        final int a2 = ((qfh)h07).A;
    Block_15_Outer:
        while (true) {
            Label_0253: {
                Object x = null;
                Object x2 = null;
                Label_0213: {
                    if (a2 != 0) {
                        if (a2 == 1) {
                            v = ((qfh)h07).v;
                            x = ((qfh)h07).x;
                            w = (gp6)((qfh)h07).w;
                            try {
                                vt4.g0(y);
                                break Label_0213;
                            }
                            finally {
                                x2 = w;
                                final gp6 gp6;
                                w = gp6;
                                break Label_0213;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(y);
                    x2 = new Object();
                    try {
                        final o10 o10 = new o10(x2, (Object)this, (f07)null, (byte)29);
                        ((qfh)h07).w = (jta)w;
                        ((qfh)h07).x = (b4j)x2;
                        ((qfh)h07).v = v;
                        ((qfh)h07).A = 1;
                        final Object i0 = r6k.i0(v, (zta)o10, h07);
                        final pc7 v2 = pc7.v;
                        if (i0 == v2) {
                            return v2;
                        }
                        break Label_0253;
                    }
                    finally {
                        final gp6 gp7 = w;
                        final gp6 gp8;
                        w = gp8;
                        x = x2;
                        x2 = gp7;
                    }
                }
                final Object o11 = x2;
                final gp6 gp9 = w;
                x2 = x;
                w = (gp6)o11;
                x = gp9;
                Label_0275: {
                    try {
                        if (x instanceof TimeoutCancellationException) {
                            ((jta)w).a();
                            break Label_0275;
                        }
                        break Label_0275;
                    }
                    finally {
                        h07 = (h07)((b4j)x2).v;
                        if (h07 != null) {
                            this.e((dq6)h07);
                        }
                        continue Block_15_Outer;
                        Label_0298: {
                            throw x;
                        }
                        while (true) {
                            final Object v3 = ((b4j)x2).v;
                            iftrue(Label_0295:)(v3 == null);
                            return v3;
                            iftrue(Label_0298:)(x != null);
                            continue;
                        }
                    }
                }
            }
            break;
        }
    }
    
    public final void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        sfh.c:Ljava/util/concurrent/locks/ReentrantLock;
        //     4: astore_3       
        //     5: aload_3        
        //     6: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //     9: aload_0        
        //    10: iconst_1       
        //    11: putfield        sfh.f:Z
        //    14: aload_0        
        //    15: getfield        sfh.g:[Ldq6;
        //    18: astore          4
        //    20: aload           4
        //    22: arraylength    
        //    23: istore_2       
        //    24: iconst_0       
        //    25: istore_1       
        //    26: iload_1        
        //    27: iload_2        
        //    28: if_icmpge       61
        //    31: aload           4
        //    33: iload_1        
        //    34: aaload         
        //    35: astore          5
        //    37: aload           5
        //    39: ifnull          55
        //    42: aload           5
        //    44: invokevirtual   dq6.close:()V
        //    47: goto            55
        //    50: astore          4
        //    52: goto            66
        //    55: iinc            1, 1
        //    58: goto            26
        //    61: aload_3        
        //    62: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //    65: return         
        //    66: aload_3        
        //    67: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //    70: aload           4
        //    72: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  9      24     50     55     Any
        //  42     47     50     55     Any
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
    
    public final void d(final StringBuilder sb) {
        final pv0 i = this.i;
        final ReentrantLock c = this.c;
        c.lock();
        Label_0465: {
            ygd a;
            int n;
            try {
                a = lq6.A();
                final int x = i.x;
                n = 0;
                for (int j = 0; j < x; ++j) {
                    a.add(i.get(j));
                }
            }
            finally {
                break Label_0465;
            }
            final ygd n2 = lq6.n(a);
            final String string = this.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("\t");
            sb2.append(string);
            sb2.append(" (");
            final StringBuilder sb3;
            sb3.append(sb2.toString());
            final byte a2 = this.a;
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("capacity=");
            sb4.append((int)a2);
            sb4.append(", ");
            sb3.append(sb4.toString());
            final int max = Math.max(u51.a.getIntVolatile((Object)this.h, mtk.A), 0);
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("permits=");
            sb5.append(max);
            sb5.append(", ");
            sb3.append(sb5.toString());
            final int a3 = ((k2)n2).a();
            final String n3 = c86.N0((Iterable)n2, (CharSequence)null, (String)null, (String)null, (lta)null, 63);
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("queue=(size=");
            sb6.append(a3);
            sb6.append(")[");
            sb6.append(n3);
            sb6.append("]");
            sb3.append(sb6.toString());
            sb3.append(")");
            sb3.append('\n');
            final dq6[] g = this.g;
            final int length = g.length;
            final int n4 = 0;
            int k = n;
            int n5 = n4;
            while (k < length) {
                final dq6 dq6 = g[k];
                ++n5;
                String string2;
                if (dq6 != null) {
                    string2 = dq6.v.toString();
                }
                else {
                    string2 = null;
                }
                final StringBuilder sb7 = new StringBuilder();
                sb7.append("\t\t[");
                sb7.append(n5);
                sb7.append("] - ");
                sb7.append(string2);
                sb3.append(sb7.toString());
                sb3.append('\n');
                if (dq6 != null) {
                    dq6.n(sb3);
                }
                ++k;
            }
            c.unlock();
            return;
        }
        c.unlock();
    }
    
    public final void e(final dq6 dq6) {
        final ReentrantLock c = this.c;
        c.lock();
        try {
            this.i.addLast((Object)dq6);
            c.unlock();
            ((mtk)this.h).d();
        }
        finally {
            c.unlock();
        }
    }
}
