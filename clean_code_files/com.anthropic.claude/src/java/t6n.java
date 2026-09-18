import java.util.Collection;
import java.util.concurrent.CancellationException;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import java.util.ArrayList;
import java.util.List;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class t6n extends hgf implements ueh, xc8, teh
{
    public Object J;
    public Object K;
    public Object[] L;
    public PointerInputEventHandler M;
    public wmm N;
    public jeh O;
    public final inf P;
    public final inf Q;
    public final inf R;
    public jeh S;
    public long T;
    
    public t6n(final Object j, final Object k, final Object[] l, final PointerInputEventHandler m) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.O = p6n.a;
        final inf inf = new inf(0, new s6n[16]);
        this.P = inf;
        this.Q = inf;
        this.R = new inf(0, new s6n[16]);
        this.T = 0L;
    }
    
    public final void G(jeh jeh, final keh keh, final long t) {
        this.T = t;
        if (keh == keh.v) {
            this.O = jeh;
        }
        if (this.N == null) {
            this.N = rhc.G(this.c1(), (hc7)null, 4, (zta)new lq((byte)17, (f07)null, (Object)this), 1);
        }
        this.p1(jeh, keh);
        final List a = jeh.a;
        while (true) {
            for (int size = ((Collection)a).size(), i = 0; i < size; ++i) {
                if (!i1r.h((peh)a.get(i))) {
                    this.S = jeh;
                    return;
                }
            }
            jeh = null;
            continue;
        }
    }
    
    public final void V() {
        final jeh s = this.S;
        if (s != null) {
            final List a = s.a;
            final int size = ((Collection)a).size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                if (((peh)a.get(i)).f()) {
                    final ArrayList list = new ArrayList(a.size());
                    for (int size2 = ((Collection)a).size(), j = n; j < size2; ++j) {
                        final peh peh = (peh)a.get(j);
                        list.add((Object)new peh(peh.d(), peh.k(), peh.e(), peh.g(), peh.k(), peh.e(), peh.f(), peh.f(), peh.j()));
                    }
                    final jeh o = new jeh((List)list, null);
                    this.p1(this.O = o, keh.v);
                    this.p1(o, keh.w);
                    this.p1(o, keh.x);
                    this.S = null;
                    return;
                }
            }
        }
    }
    
    public final void V0() {
        this.q1();
    }
    
    public final void f() {
        this.q1();
    }
    
    public final float getDensity() {
        return soh.L((t98)this).U.getDensity();
    }
    
    public final void h1() {
        this.q1();
    }
    
    public final float o0() {
        return soh.L((t98)this).U.o0();
    }
    
    public final Object o1(final f07 f07, final zta zta) {
        final l13 l13 = new l13(1, ljq.K(f07));
        l13.r();
        final s6n s6n = new s6n(this, l13);
        final inf q = this.Q;
        synchronized (q) {
            this.P.b(s6n);
            new m6k(ljq.K(ljq.z((f07)s6n, (f07)s6n, zta)), (Object)pc7.v).resumeWith((Object)lqo.a);
            monitorexit(q);
            l13.v((lta)new gwb((Object)s6n, (byte)22));
            return l13.p();
        }
    }
    
    public final void p1(final jeh jeh, final keh keh) {
        final inf q = this.Q;
        synchronized (q) {
            final inf r = this.R;
            r.d(r.x, this.P);
            monitorexit(q);
            Label_0239: {
                Label_0231: {
                    final Throwable t;
                    Label_0155: {
                        try {
                            final int ordinal = ((Enum)keh).ordinal();
                            if (ordinal == 0) {
                                break Label_0155;
                            }
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    break Label_0155;
                                }
                                throw new RuntimeException();
                            }
                        }
                        finally {
                            break Label_0239;
                        }
                        final inf r2 = this.R;
                        int i = r2.x - 1;
                        final Object[] v = r2.v;
                        if (i < v.length) {
                            while (i >= 0) {
                                final s6n s6n = (s6n)v[i];
                                if (keh == s6n.y) {
                                    final l13 x = s6n.x;
                                    if (x != null) {
                                        s6n.x = null;
                                        x.resumeWith((Object)t);
                                    }
                                }
                                --i;
                            }
                        }
                        break Label_0231;
                    }
                    final inf r3 = this.R;
                    final Object[] v2 = r3.v;
                    for (int x2 = r3.x, j = 0; j < x2; ++j) {
                        final s6n s6n2 = (s6n)v2[j];
                        if (keh == s6n2.y) {
                            final l13 x3 = s6n2.x;
                            if (x3 != null) {
                                s6n2.x = null;
                                x3.resumeWith((Object)t);
                            }
                        }
                    }
                }
                this.R.h();
                return;
            }
            this.R.h();
        }
    }
    
    public final void q1() {
        final wmm n = this.N;
        if (n != null) {
            ((bqc)n).x((CancellationException)new PointerInputResetException());
            this.N = null;
        }
    }
}
