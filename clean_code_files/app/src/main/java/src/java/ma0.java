import android.view.ViewParent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.a;
import androidx.compose.material3.ripple.RippleNodeConfiguration;

public final class ma0 extends hgf implements zl6, k5g, bw8, jzc
{
    public final llf J;
    public final jta K;
    public float L;
    public long M;
    public boolean N;
    public final emf O;
    public final id0 P;
    public final id0 Q;
    public o78 R;
    public RippleNodeConfiguration S;
    public ptj T;
    public stj U;
    
    public ma0(final llf j, final a k) {
        this.J = j;
        this.K = (jta)k;
        this.M = 0L;
        this.O = new emf();
        this.P = zn2.a(0.0f);
        this.Q = zn2.a(0.0f);
    }
    
    public final void F0() {
        this.o1(true);
    }
    
    public final void I0(final k0d k0d) {
        k0d.a();
        final z13 v = k0d.v;
        final x13 t = v.w.t();
        final stj u = this.U;
        if (u != null) {
            final RippleNodeConfiguration o1 = this.o1(false);
            float n;
            if (o1.c instanceof cuj) {
                n = 0.1f;
            }
            else {
                n = 0.0f;
            }
            u.e(this.M, k8e.H(this.L), o1.a().a(), n);
            u.draw(g40.b(t));
        }
        final float floatValue = ((Number)this.P.e()).floatValue();
        if (floatValue > 0.0f) {
            final RippleNodeConfiguration o2 = this.o1(false);
            final long b = j86.b(floatValue, o2.a().a());
            if (o2.a) {
                final float intBitsToFloat = Float.intBitsToFloat((int)(v.i() >> 32));
                final float intBitsToFloat2 = Float.intBitsToFloat((int)(v.i() & 0xFFFFFFFFL));
                final zn0 w = v.w;
                final long a = w.A();
                w.t().g();
                try {
                    ((jy7)w.v).m(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                    final float l = this.L;
                    try {
                        cw8.C0(k0d, b, l, 0L, null, 124);
                        oz1.w(w, a);
                    }
                    finally {}
                }
                finally {}
                oz1.w(w, a);
            }
            else {
                cw8.C0(k0d, b, this.L, 0L, null, 124);
            }
        }
        if (((Number)this.Q.e()).floatValue() > 0.0f) {
            o78 r;
            if ((r = this.R) == null) {
                r = new o78((Object)this);
            }
            this.R = r;
            this.o1(false);
        }
    }
    
    public final void c(final long n) {
        this.N = true;
        this.M = uoo.Z(n);
        int i = 0;
        if (this.q1(this.o1(false))) {
            x90.z((bw8)this);
        }
        final emf o = this.O;
        final Object[] a = o.a;
        while (i < o.b) {
            this.p1((xlh)a[i]);
            ++i;
        }
        o.e();
    }
    
    public final boolean d1() {
        return false;
    }
    
    public final void g1() {
        this.o1(false);
        rhc.G(this.c1(), (hc7)null, 0, (zta)new frd((byte)7, (f07)null, (Object)this), 3);
    }
    
    public final void h1() {
        final ptj t = this.T;
        if (t != null) {
            t.a(this);
        }
        this.R = null;
        this.S = null;
        this.N = false;
        this.M = 0L;
        this.L = 0.0f;
        this.O.e();
    }
    
    public final RippleNodeConfiguration o1(final boolean b) {
        final RippleNodeConfiguration s = this.S;
        final Object o = new Object();
        boolean b2;
        if (!b && s != null) {
            ((b4j)o).v = s;
            b2 = false;
        }
        else {
            yi2.I((hgf)this, (jta)new nob(o, (Object)this, (byte)28));
            final Object v = ((b4j)o).v;
            if (v == null) {
                mlc.j0("resolvedConfiguration");
                throw null;
            }
            b2 = (((RippleNodeConfiguration)v).equals((Object)s) ^ true);
        }
        final Object v2 = ((b4j)o).v;
        if (v2 == null) {
            mlc.j0("resolvedConfiguration");
            throw null;
        }
        final RippleNodeConfiguration s2 = (RippleNodeConfiguration)v2;
        this.S = s2;
        if (b2) {
            this.q1(s2);
            x90.z((bw8)this);
        }
        final Object v3 = ((b4j)o).v;
        if (v3 != null) {
            return (RippleNodeConfiguration)v3;
        }
        mlc.j0("resolvedConfiguration");
        throw null;
    }
    
    public final void p1(final xlh xlh) {
        if (xlh instanceof vlh) {
            final vlh vlh = (vlh)xlh;
            final long m = this.M;
            final float l = this.L;
            ptj t = this.T;
            Label_0167: {
                if (t == null) {
                    Object o;
                    ViewParent parent;
                    for (o = uoo.z((zl6)this, (sei)q50.f); !(o instanceof ViewGroup); o = parent) {
                        parent = ((View)o).getParent();
                        if (!(parent instanceof View)) {
                            oyl.g((Object)lmf.r(o, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"));
                            return;
                        }
                    }
                    final ViewGroup viewGroup = (ViewGroup)o;
                    while (true) {
                        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                            final View child = viewGroup.getChildAt(i);
                            if (child instanceof ptj) {
                                t = (ptj)child;
                                this.T = t;
                                break Label_0167;
                            }
                        }
                        t = new ptj(((View)viewGroup).getContext());
                        viewGroup.addView((View)t);
                        continue;
                    }
                }
            }
            final stj b = t.b(this);
            final RippleNodeConfiguration o2 = this.o1(false);
            float n;
            if (o2.c instanceof cuj) {
                n = 0.1f;
            }
            else {
                n = 0.0f;
            }
            b.b(vlh, o2.a, m, k8e.H(l), o2.a().a(), n, new s5((Object)this, (byte)3));
            this.U = b;
            x90.z((bw8)this);
            return;
        }
        if (xlh instanceof wlh) {
            final stj u = this.U;
            if (u != null) {
                u.d();
            }
        }
        else if (xlh instanceof ulh) {
            final stj u2 = this.U;
            if (u2 != null) {
                u2.d();
            }
        }
    }
    
    public final boolean q1(final RippleNodeConfiguration rippleNodeConfiguration) {
        final boolean n = this.N;
        boolean b = false;
        if (n) {
            final xc8 u = soh.L((t98)this).U;
            float w0;
            if (Float.isNaN(rippleNodeConfiguration.b)) {
                final boolean a = rippleNodeConfiguration.a;
                final long m = this.M;
                final float n2 = w0 = l6g.d(((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(m & 0xFFFFFFFFL))) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(m >> 32))) << 32) / 2.0f;
                if (a) {
                    w0 = n2 + u.w0(10.0f);
                }
            }
            else {
                w0 = u.w0(rippleNodeConfiguration.b);
            }
            if (this.L == w0) {
                b = true;
            }
            if (!b) {
                this.L = w0;
            }
            return b ^ true;
        }
        return false;
    }
}
