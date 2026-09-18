import android.graphics.RenderEffect;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Outline;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;

public final class n6b implements i6b
{
    public boolean A;
    public int B;
    public int C;
    public r1 D;
    public int E;
    public final a23 b;
    public final z13 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public byte j;
    public long k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public float t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean z;
    
    public n6b() {
        final a23 b = new a23();
        final z13 c = new z13();
        this.b = b;
        this.c = c;
        final RenderNode d = new RenderNode("graphicsLayer");
        this.d = d;
        this.e = 0L;
        d.setClipToBounds(false);
        this.R(d, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 9205357640488583168L;
        this.l = 1.0f;
        this.m = 1.0f;
        final long b2 = j86.b;
        this.q = b2;
        this.r = b2;
        this.t = 8.0f;
        this.E = 0;
    }
    
    @Override
    public final long A() {
        return this.r;
    }
    
    @Override
    public final void B(final long q) {
        this.q = q;
        zp6.x(this.d, t08.o0(q));
    }
    
    @Override
    public final void C() {
        Paint f;
        if ((f = this.f) == null) {
            f = new Paint();
            this.f = f;
        }
        f.setColorFilter((ColorFilter)null);
        this.S();
    }
    
    @Override
    public final void D(final float l) {
        this.l = l;
        zp6.y(this.d, l);
    }
    
    @Override
    public final float E() {
        return this.t;
    }
    
    @Override
    public final float F() {
        return this.n;
    }
    
    @Override
    public final void G(final boolean u) {
        this.u = u;
        this.Q();
    }
    
    @Override
    public final float H() {
        return 0.0f;
    }
    
    @Override
    public final void I(final int e) {
        this.E = e;
        this.S();
    }
    
    @Override
    public final void J(final float n) {
        this.n = n;
        zp6.B(this.d, n);
    }
    
    @Override
    public final void K(final long r) {
        this.r = r;
        zp6.n(this.d, t08.o0(r));
    }
    
    @Override
    public final Matrix L() {
        Matrix g;
        if ((g = this.g) == null) {
            g = new Matrix();
            this.g = g;
        }
        zp6.o(this.d, g);
        return g;
    }
    
    @Override
    public final void M(final float t) {
        this.t = t;
        zp6.z(this.d, t);
    }
    
    @Override
    public final float N() {
        return this.p;
    }
    
    @Override
    public final float O() {
        return this.m;
    }
    
    @Override
    public final int P() {
        return this.j;
    }
    
    public final void Q() {
        final boolean u = this.u;
        final boolean b = false;
        final boolean z = u && !this.h;
        boolean a = b;
        if (u) {
            a = b;
            if (this.h) {
                a = true;
            }
        }
        if (z != this.z) {
            this.z = z;
            d40.l(this.d, z);
        }
        if (a != this.A) {
            this.A = a;
            d40.t(this.d, a);
        }
    }
    
    public final void R(final RenderNode renderNode, final int n) {
        final Paint f = this.f;
        if (n == 1) {
            d40.k(renderNode, f);
            d40.r(renderNode);
            return;
        }
        if (n == 2) {
            d40.s(renderNode, f);
            d40.v(renderNode);
            return;
        }
        d40.s(renderNode, f);
        d40.r(renderNode);
    }
    
    public final void S() {
        final int e = this.E;
        if (e != 1) {
            if (this.j == 3) {
                if (this.D == null) {
                    this.R(this.d, e);
                    return;
                }
            }
        }
        this.R(this.d, 1);
    }
    
    public final void T() {
        final long k = this.k;
        final RenderNode d = this.d;
        if ((0x7FFFFFFF7FFFFFFFL & k) == 0x7FC000007FC00000L) {
            m6b.p(d, Float.intBitsToFloat((int)(this.e >> 32)) / 2.0f + this.v);
            m6b.v(this.d, Float.intBitsToFloat((int)(this.e & 0xFFFFFFFFL)) / 2.0f + this.w);
            return;
        }
        m6b.p(d, Float.intBitsToFloat((int)(k >> 32)) + this.v);
        m6b.v(this.d, Float.intBitsToFloat((int)(this.k & 0xFFFFFFFFL)) + this.w);
    }
    
    public final void U() {
        final RenderNode d = this.d;
        final int b = this.B;
        m6b.r(d, b - this.v, this.C - this.w, b + (int)Float.intBitsToFloat((int)(this.e >> 32)) + this.x, this.C + (int)Float.intBitsToFloat((int)(this.e & 0xFFFFFFFFL)) + this.y);
    }
    
    @Override
    public final float a() {
        return this.i;
    }
    
    @Override
    public final float b() {
        return this.l;
    }
    
    @Override
    public final void c(final float p) {
        this.p = p;
        zp6.A(this.d, p);
    }
    
    @Override
    public final r1 d() {
        return this.D;
    }
    
    @Override
    public final void e(final float s) {
        this.s = s;
        zp6.C(this.d, s);
    }
    
    @Override
    public final void f(final float o) {
        this.o = o;
        zp6.w(this.d, o);
    }
    
    @Override
    public final void g(final Outline outline, final long n) {
        d40.j(this.d, outline);
        this.h = (outline != null);
        this.Q();
    }
    
    @Override
    public final void h(final int j) {
        this.j = (byte)j;
        Paint f;
        if ((f = this.f) == null) {
            f = new Paint();
            this.f = f;
        }
        zp6.k(f, soh.X(j));
        this.S();
    }
    
    @Override
    public final void i() {
        d40.h(this.d);
    }
    
    @Override
    public final void j(final int b, final long n, final int c) {
        this.B = b;
        this.C = c;
        final boolean b2 = yzl.b(this.e, uoo.Z(n));
        this.e = uoo.Z(n);
        this.U();
        if (!b2 && l6g.c(this.k, 9205357640488583168L)) {
            m6b.p(this.d, (int)(n >> 32) / 2.0f + this.v);
            m6b.v(this.d, (int)(n & 0xFFFFFFFFL) / 2.0f + this.w);
        }
    }
    
    @Override
    public final void k(final x13 x13) {
        m6b.l(g40.b(x13), this.d);
    }
    
    @Override
    public final int l() {
        return this.E;
    }
    
    @Override
    public final he2 m() {
        return null;
    }
    
    @Override
    public final void n(final float m) {
        this.m = m;
        zp6.m(this.d, m);
    }
    
    @Override
    public final float o() {
        return 0.0f;
    }
    
    @Override
    public final void p(final xc8 xc8, final qzc qzc, final g6b w, final k10 k10) {
        final z13 c = this.c;
        final RecordingCanvas e = d40.e(this.d);
        final long n = ((long)Float.floatToRawIntBits((float)this.w) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits((float)this.v) << 32;
        Label_0240: {
            a23 b = null;
            Canvas a2 = null;
            Label_0222: {
                f40 a;
                try {
                    b = this.b;
                    a = b.a;
                    a2 = a.a;
                    a.a = (Canvas)e;
                    final zn0 w2 = c.w;
                    w2.H(xc8);
                    w2.I(qzc);
                    w2.w = w;
                    w2.J(this.e);
                    w2.G((x13)a);
                    if (this.v <= 0.0f) {
                        if (this.w <= 0.0f) {
                            k10.b((Object)c);
                            break Label_0222;
                        }
                    }
                }
                finally {
                    break Label_0240;
                }
                final int n2 = (int)(n >> 32);
                final float intBitsToFloat = Float.intBitsToFloat(n2);
                final int n3 = (int)(n & 0xFFFFFFFFL);
                a.n(intBitsToFloat, Float.intBitsToFloat(n3));
                k10.b((Object)c);
                a.n(-Float.intBitsToFloat(n2), -Float.intBitsToFloat(n3));
            }
            b.a.a = a2;
            m6b.o(this.d);
            return;
        }
        m6b.o(this.d);
    }
    
    @Override
    public final boolean q() {
        return d40.p(this.d);
    }
    
    @Override
    public final float r() {
        return this.s;
    }
    
    @Override
    public final void s(final long k) {
        this.k = k;
        this.T();
    }
    
    @Override
    public final long t() {
        return this.q;
    }
    
    @Override
    public final void u() {
        zp6.l(this.d);
    }
    
    @Override
    public final void v(final float i) {
        this.i = i;
        d40.i(this.d, i);
    }
    
    @Override
    public final void w(final int v, final int w, final int x, final int y) {
        final int n = 0;
        if (v < 0 || w < 0 || x < 0 || y < 0) {
            final StringBuilder o = hia.o(v, w, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            o.append(x);
            o.append(", Bottom: ");
            o.append(y);
            fac.a(o.toString());
        }
        final int v2 = this.v;
        if (v != v2 || w != this.w || x != this.x || y != this.y) {
            int n2 = 0;
            Label_0140: {
                if (v == v2) {
                    n2 = n;
                    if (w == this.w) {
                        break Label_0140;
                    }
                }
                n2 = 1;
            }
            this.v = v;
            this.w = w;
            this.x = x;
            this.y = y;
            this.U();
            if (n2 != 0) {
                this.T();
            }
        }
    }
    
    @Override
    public final float x() {
        return this.o;
    }
    
    @Override
    public final void y(final r1 d) {
        this.D = d;
        if (Build$VERSION.SDK_INT >= 31) {
            final RenderNode d2 = this.d;
            RenderEffect c;
            if (d != null) {
                c = d.c();
            }
            else {
                c = null;
            }
            j50.f(d2, c);
        }
    }
    
    @Override
    public final void z() {
        zp6.v(this.d);
    }
}
