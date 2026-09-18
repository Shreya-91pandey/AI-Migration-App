import android.view.ViewParent;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

public final class j6b implements gmg
{
    public long A;
    public boolean B;
    public final float[] C;
    public float[] D;
    public boolean E;
    public xc8 F;
    public qzc G;
    public final z13 H;
    public int I;
    public long J;
    public k8e K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final p8a P;
    public g6b v;
    public final d6b w;
    public final AndroidComposeView x;
    public zta y;
    public jta z;
    
    public j6b(final g6b v, final d6b w, final AndroidComposeView x, final zta y, final jta z) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = 9223372034707292159L;
        this.C = l8e.a();
        this.F = (xc8)r6k.a();
        this.G = qzc.v;
        this.H = new z13();
        this.J = jeo.b;
        this.N = true;
        this.P = new p8a((Object)this, (byte)2);
    }
    
    public final float[] a() {
        float[] d;
        if ((d = this.D) == null) {
            d = l8e.a();
            this.D = d;
        }
        if (!this.M) {
            if (Float.isNaN(d[0])) {
                return null;
            }
        }
        else {
            this.M = false;
            final float[] b = this.b();
            if (this.N) {
                return b;
            }
            if (!o50.F(b, d)) {
                d[0] = Float.NaN;
                return null;
            }
        }
        return d;
    }
    
    public final float[] b() {
        final boolean l = this.L;
        final float[] c = this.C;
        if (l) {
            final g6b v = this.v;
            final long z = v.z;
            final i6b a = v.a;
            long k = z;
            if ((0x7FFFFFFF7FFFFFFFL & z) == 0x7FC000007FC00000L) {
                k = ach.K(uoo.Z(this.A));
            }
            l8e.e(this.C, Float.intBitsToFloat((int)(k >> 32)), Float.intBitsToFloat((int)(k & 0xFFFFFFFFL)), a.F(), a.x(), a.H(), a.o(), a.r(), a.b(), a.O(), 1040);
            this.L = false;
            this.N = lq6.U(c);
        }
        return c;
    }
    
    public final void c() {
        if (!this.E && !this.B) {
            ((View)this.x).invalidate();
            this.f(true);
        }
    }
    
    public final void d(final long t) {
        final boolean m = AndroidComposeView.m();
        final AndroidComposeView x = this.x;
        if (m) {
            x.N(-4.0f);
        }
        final g6b v = this.v;
        if (!ugc.b(v.t, t)) {
            v.t = t;
            v.a.j((int)(t >> 32), v.u, (int)(t & 0xFFFFFFFFL));
        }
        final ViewParent parent = ((View)x).getParent();
        if (parent != null) {
            parent.onDescendantInvalidated((View)x, (View)x);
        }
    }
    
    public final void e(final long a) {
        if (!chc.b(a, this.A)) {
            if (AndroidComposeView.m()) {
                this.x.N(-4.0f);
            }
            this.A = a;
            this.c();
        }
    }
    
    public final void f(final boolean e) {
        if (e != this.E) {
            this.E = e;
            final AndroidComposeView x = this.x;
            final emf v = x.V;
            final boolean a0 = x.a0;
            if (!e) {
                if (!a0) {
                    v.k((Object)this);
                    final emf w = x.W;
                    if (w != null) {
                        w.k((Object)this);
                    }
                }
            }
            else {
                if (!a0) {
                    v.b((Object)this);
                    return;
                }
                emf w2;
                if ((w2 = x.W) == null) {
                    w2 = new emf();
                    x.W = w2;
                }
                w2.b((Object)this);
            }
        }
    }
    
    public final void g() {
        AndroidComposeView.m();
        if (this.E) {
            if (!jeo.a(this.J, jeo.b) && !chc.b(this.v.u, this.A)) {
                final g6b v = this.v;
                final long z = ((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(this.J & 0xFFFFFFFFL)) * (int)(this.A & 0xFFFFFFFFL)) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(this.J >> 32)) * (int)(this.A >> 32)) << 32;
                if (!l6g.c(v.z, z)) {
                    v.z = z;
                    v.a.s(z);
                }
            }
            this.v.f(this.F, this.G, this.A, (lta)this.P);
            this.f(false);
        }
    }
}
