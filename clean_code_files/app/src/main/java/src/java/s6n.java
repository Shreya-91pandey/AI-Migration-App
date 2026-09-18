import java.util.concurrent.CancellationException;
import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;

public final class s6n implements xc8, f07
{
    public final t6n v;
    public final l13 w;
    public l13 x;
    public keh y;
    public final t6n z;
    
    public s6n(final t6n t6n, final l13 w) {
        this.z = t6n;
        this.v = t6n;
        this.w = w;
        this.y = keh.w;
    }
    
    public final int E0(final long n) {
        return ((xc8)this.v).E0(n);
    }
    
    public final float I(final long n) {
        return ((xc8)this.v).I(n);
    }
    
    public final int L0(final float n) {
        return ((xc8)this.v).L0(n);
    }
    
    public final long T0(final long n) {
        return ((xc8)this.v).T0(n);
    }
    
    public final float W0(final long n) {
        return ((xc8)this.v).W0(n);
    }
    
    public final long X(final int n) {
        return ((xc8)this.v).X(n);
    }
    
    public final long Z(final float n) {
        return ((xc8)this.v).Z(n);
    }
    
    public final Object a(final keh y, final f07 f07) {
        final l13 x = new l13(1, ljq.K(f07));
        x.r();
        this.y = y;
        this.x = x;
        return x.p();
    }
    
    public final long b() {
        final t6n z = this.z;
        final long t0 = ((xc8)z).T0(soh.L((t98)z).W.e());
        final long t2 = z.T;
        return (long)Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int)(t0 >> 32)) - (int)(t2 >> 32)) / 2.0f) << 32 | ((long)Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int)(t0 & 0xFFFFFFFFL)) - (int)(t2 & 0xFFFFFFFFL)) / 2.0f) & 0xFFFFFFFFL);
    }
    
    public final jap d() {
        return soh.L((t98)this.z).W;
    }
    
    public final Object e(final long n, zta v, wv1 g) {
        Object o = null;
        Label_0055: {
            if (g instanceof q6n) {
                o = g;
                final int y = ((q6n)o).y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ((q6n)o).y = y + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            o = new q6n(this, (wv1)g);
        }
        final Object w = ((q6n)o).w;
        final int y2 = ((q6n)o).y;
        Object o2 = null;
        Object d = null;
        Label_0239: {
            if (y2 != 0) {
                if (y2 == 1) {
                    v = (zta)((q6n)o).v;
                    try {
                        vt4.g0(w);
                    }
                    finally {
                        o2 = v;
                        d = g;
                        break Label_0239;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(w);
            if (n <= 0L) {
                final l13 x = this.x;
                if (x != null) {
                    x.resumeWith((Object)new jpj((Throwable)new PointerEventTimeoutCancellationException(n)));
                }
            }
            g = rhc.G(this.z.c1(), (hc7)null, 0, (zta)new v82(n, this, (f07)null), 3);
            try {
                ((q6n)o).v = (wmm)g;
                ((q6n)o).y = 1;
                d = v.d((Object)this, o);
                final pc7 v2 = pc7.v;
                if (d == v2) {
                    return v2;
                }
                ((opc)g).g((CancellationException)CancelTimeoutCancellationException.v);
                return d;
            }
            finally {
                o2 = g;
            }
        }
        ((opc)o2).g((CancellationException)CancelTimeoutCancellationException.v);
        throw d;
    }
    
    public final float e0(final int n) {
        return ((xc8)this.v).e0(n);
    }
    
    public final Object f(final long n, final zta zta, final wv1 wv1) {
        Object o = null;
        Label_0059: {
            if (wv1 instanceof r6n) {
                final r6n r6n = (r6n)wv1;
                final int x = r6n.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    r6n.x = x + Integer.MIN_VALUE;
                    o = r6n;
                    break Label_0059;
                }
            }
            o = new r6n(this, wv1);
        }
        final Object v = ((r6n)o).v;
        final int x2 = ((r6n)o).x;
        Label_0099: {
            if (x2 == 0) {
                break Label_0099;
            }
            Label_0092: {
                if (x2 != 1) {
                    break Label_0092;
                }
                try {
                    vt4.g0(v);
                    return v;
                    vt4.g0(v);
                    ((r6n)o).x = 1;
                    final Object e = this.e(n, zta, (wv1)o);
                    final pc7 v2 = pc7.v;
                    iftrue(Label_0133:)(e != v2);
                    return v2;
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                    Label_0133: {
                        return e;
                    }
                }
                catch (final PointerEventTimeoutCancellationException ex) {
                    return null;
                }
            }
        }
    }
    
    public final hc7 getContext() {
        return (hc7)o89.v;
    }
    
    public final float getDensity() {
        return this.v.getDensity();
    }
    
    public final float i0(final float n) {
        return n / this.v.getDensity();
    }
    
    public final float o0() {
        return this.v.o0();
    }
    
    public final void resumeWith(final Object o) {
        final t6n z = this.z;
        final inf q = z.Q;
        synchronized (q) {
            z.P.k(this);
            monitorexit(q);
            this.w.resumeWith(o);
        }
    }
    
    public final float w0(final float n) {
        return this.v.getDensity() * n;
    }
    
    public final long x(final float n) {
        return ((xc8)this.v).x(n);
    }
    
    public final long y(final long n) {
        return ((xc8)this.v).y(n);
    }
}
