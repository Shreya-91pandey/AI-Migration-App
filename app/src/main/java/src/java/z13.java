import android.graphics.Paint;
import android.graphics.Shader;

public final class z13 implements cw8
{
    public final y13 v;
    public final zn0 w;
    public y80 x;
    public y80 y;
    
    public z13() {
        final ad8 a = qt7.a;
        final Object v = new Object();
        ((y13)v).a = (xc8)a;
        ((y13)v).b = qzc.v;
        ((y13)v).c = m89.a;
        ((y13)v).d = 0L;
        this.v = (y13)v;
        final Object w = new Object();
        ((zn0)w).x = this;
        ((zn0)w).v = new jy7(w, (byte)8);
        this.w = (zn0)w;
    }
    
    public static y80 a(final z13 z13, long b, final dw8 dw8, final float n, final he2 he2, final int n2) {
        final y80 c = z13.c(dw8);
        if (n != 1.0f) {
            b = j86.b(j86.c(b) * n, b);
        }
        final long a = c.a();
        final int i = j86.i;
        if (!foo.a(a, b)) {
            c.f(b);
        }
        if (c.c != null) {
            c.j(null);
        }
        if (!mlc.q((Object)c.d, (Object)he2)) {
            c.g(he2);
        }
        if (c.b != n2) {
            c.e(n2);
        }
        if (c.a.isFilterBitmap()) {
            return c;
        }
        c.h(1);
        return c;
    }
    
    @Override
    public final void A0(final coi coi, final float n, final long n2) {
        this.v.c.c(n, n2, this.b((qm2)coi, gea.a, 1.0f, null, 3, 1));
    }
    
    @Override
    public final void B(final n70 n70, final long n71, final float n72, final he2 he2, final int n73) {
        this.v.c.o(n70, n71, this.b(null, gea.a, n72, he2, n73, 1));
    }
    
    @Override
    public final zn0 B0() {
        return this.w;
    }
    
    @Override
    public final void F(final long n, final float n2, final float n3, final long n4, final long n5, final float n6, final dw8 dw8) {
        final x13 c = this.v.c;
        final int n7 = (int)(n4 >> 32);
        final float intBitsToFloat = Float.intBitsToFloat(n7);
        final int n8 = (int)(n4 & 0xFFFFFFFFL);
        c.t(intBitsToFloat, Float.intBitsToFloat(n8), Float.intBitsToFloat((int)(n5 >> 32)) + Float.intBitsToFloat(n7), Float.intBitsToFloat((int)(n5 & 0xFFFFFFFFL)) + Float.intBitsToFloat(n8), n2, n3, a(this, n, dw8, n6, null, 3));
    }
    
    @Override
    public final void N0(final long n, final float n2, final long n3, final dw8 dw8, final int n4) {
        this.v.c.c(n2, n3, a(this, n, dw8, 1.0f, null, n4));
    }
    
    @Override
    public final void R(final long n, final long n2, final long n3, final float n4, final int n5) {
        final x13 c = this.v.c;
        y80 y;
        if ((y = this.y) == null) {
            y = uoo.d();
            y.n(1);
            this.y = y;
        }
        final Paint a = y.a;
        final long a2 = y.a();
        final int i = j86.i;
        if (!foo.a(a2, n)) {
            y.f(n);
        }
        if (y.c != null) {
            y.j(null);
        }
        if (!mlc.q((Object)y.d, (Object)null)) {
            y.g(null);
        }
        if (y.b != 3) {
            y.e(3);
        }
        if (a.getStrokeWidth() != n4) {
            y.m(n4);
        }
        if (a.getStrokeMiter() != 4.0f) {
            a.setStrokeMiter(4.0f);
        }
        if (y.b() != n5) {
            y.k(n5);
        }
        if (y.c() != 0) {
            y.l(0);
        }
        if (!mlc.q((Object)y.e, (Object)null)) {
            y.i(null);
        }
        if (!a.isFilterBitmap()) {
            y.h(1);
        }
        c.h(n2, n3, y);
    }
    
    @Override
    public final void S0(final long n, final long n2, final long n3, final float n4, final dw8 dw8, final he2 he2, final int n5) {
        final x13 c = this.v.c;
        final int n6 = (int)(n2 >> 32);
        final float intBitsToFloat = Float.intBitsToFloat(n6);
        final int n7 = (int)(n2 & 0xFFFFFFFFL);
        c.j(intBitsToFloat, Float.intBitsToFloat(n7), Float.intBitsToFloat((int)(n3 >> 32)) + Float.intBitsToFloat(n6), Float.intBitsToFloat((int)(n3 & 0xFFFFFFFFL)) + Float.intBitsToFloat(n7), a(this, n, dw8, n4, he2, n5));
    }
    
    public final y80 b(final qm2 qm2, final dw8 dw8, final float n, final he2 he2, final int n2, final int n3) {
        final y80 c = this.c(dw8);
        final Paint a = c.a;
        if (qm2 != null) {
            qm2.a(n, this.i(), c);
        }
        else {
            if (c.c != null) {
                c.j(null);
            }
            final long a2 = c.a();
            final long b = j86.b;
            if (!foo.a(a2, b)) {
                c.f(b);
            }
            if (a.getAlpha() / 255.0f != n) {
                c.d(n);
            }
        }
        if (!mlc.q((Object)c.d, (Object)he2)) {
            c.g(he2);
        }
        if (c.b != n2) {
            c.e(n2);
        }
        if ((a.isFilterBitmap() ? 1 : 0) == n3) {
            return c;
        }
        c.h(n3);
        return c;
    }
    
    public final y80 c(final dw8 dw8) {
        if (mlc.q((Object)dw8, (Object)gea.a)) {
            y80 x;
            if ((x = this.x) == null) {
                x = uoo.d();
                x.n(0);
                this.x = x;
            }
            return x;
        }
        if (dw8 instanceof tym) {
            y80 y;
            if ((y = this.y) == null) {
                y = uoo.d();
                y.n(1);
                this.y = y;
            }
            final Paint a = y.a;
            final float strokeWidth = a.getStrokeWidth();
            final tym tym = (tym)dw8;
            final ivg e = tym.e;
            final float a2 = tym.a;
            if (strokeWidth != a2) {
                y.m(a2);
            }
            final int b = y.b();
            final int c = tym.c;
            if (b != c) {
                y.k(c);
            }
            final float strokeMiter = a.getStrokeMiter();
            final float b2 = tym.b;
            if (strokeMiter != b2) {
                a.setStrokeMiter(b2);
            }
            final int c2 = y.c();
            final int d = tym.d;
            if (c2 != d) {
                y.l(d);
            }
            if (!mlc.q((Object)y.e, (Object)e)) {
                y.i(e);
            }
            return y;
        }
        en9.r();
        return null;
    }
    
    public final float getDensity() {
        return this.v.a.getDensity();
    }
    
    @Override
    public final qzc getLayoutDirection() {
        return this.v.b;
    }
    
    @Override
    public final void l(final g90 g90, final qm2 qm2, final float n, final dw8 dw8, final int n2) {
        this.v.c.d(g90, this.b(qm2, dw8, n, null, n2, 1));
    }
    
    @Override
    public final void l0(final qm2 qm2, final long n, final long n2, final float n3, final dw8 dw8, final int n4) {
        final x13 c = this.v.c;
        final int n5 = (int)(n >> 32);
        final float intBitsToFloat = Float.intBitsToFloat(n5);
        final int n6 = (int)(n & 0xFFFFFFFFL);
        c.j(intBitsToFloat, Float.intBitsToFloat(n6), Float.intBitsToFloat((int)(n2 >> 32)) + Float.intBitsToFloat(n5), Float.intBitsToFloat((int)(0xFFFFFFFFL & n2)) + Float.intBitsToFloat(n6), this.b(qm2, dw8, n3, null, n4, 1));
    }
    
    @Override
    public final void m(final g90 g90, final long n, final float n2, final dw8 dw8) {
        this.v.c.d(g90, a(this, n, dw8, n2, null, 3));
    }
    
    public final float o0() {
        return this.v.a.o0();
    }
    
    @Override
    public final void p0(final long n, final long n2, final long n3, final long n4, final dw8 dw8, final float n5, final int n6) {
        final x13 c = this.v.c;
        final int n7 = (int)(n2 >> 32);
        final float intBitsToFloat = Float.intBitsToFloat(n7);
        final int n8 = (int)(n2 & 0xFFFFFFFFL);
        c.f(intBitsToFloat, Float.intBitsToFloat(n8), Float.intBitsToFloat((int)(n3 >> 32)) + Float.intBitsToFloat(n7), Float.intBitsToFloat((int)(n3 & 0xFFFFFFFFL)) + Float.intBitsToFloat(n8), Float.intBitsToFloat((int)(n4 >> 32)), Float.intBitsToFloat((int)(n4 & 0xFFFFFFFFL)), a(this, n, dw8, n5, null, n6));
    }
    
    @Override
    public final void q(final n70 n70, final long n71, final long n72, final long n73, final long n74, final float n75, final he2 he2, final int n76) {
        this.v.c.e(n70, n71, n72, n73, n74, this.b(null, gea.a, n75, he2, 3, n76));
    }
    
    @Override
    public final void t0(final qm2 qm2, final long n, final long n2, final long n3, final float n4, final dw8 dw8) {
        final x13 c = this.v.c;
        final int n5 = (int)(n >> 32);
        final float intBitsToFloat = Float.intBitsToFloat(n5);
        final int n6 = (int)(n & 0xFFFFFFFFL);
        c.f(intBitsToFloat, Float.intBitsToFloat(n6), Float.intBitsToFloat((int)(n2 >> 32)) + Float.intBitsToFloat(n5), Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)) + Float.intBitsToFloat(n6), Float.intBitsToFloat((int)(n3 >> 32)), Float.intBitsToFloat((int)(n3 & 0xFFFFFFFFL)), this.b(qm2, dw8, n4, null, 3, 1));
    }
}
