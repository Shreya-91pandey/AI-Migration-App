import android.graphics.RecordingCanvas;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import android.graphics.RenderNode;

public final class kxm extends v98 implements bw8
{
    public final w60 L;
    public final k19 M;
    public RenderNode N;
    
    public kxm(final t6n t6n, final w60 l, final k19 m) {
        this.L = l;
        this.M = m;
        this.o1((t98)t6n);
    }
    
    public static boolean r1(final float n, final EdgeEffect edgeEffect, final Canvas canvas) {
        if (n == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        final int save = canvas.save();
        canvas.rotate(n);
        final boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
    
    @Override
    public final void I0(final k0d k0d) {
        final z13 v = k0d.v;
        final long i = ((cw8)v).i();
        final w60 l = this.L;
        l.j(i);
        final Canvas b = g40.b(v.w.t());
        l.d.getValue();
        if (yzl.d(((cw8)v).i())) {
            k0d.a();
            return;
        }
        final boolean hardwareAccelerated = b.isHardwareAccelerated();
        final k19 m = this.M;
        if (!hardwareAccelerated) {
            final EdgeEffect d = m.d;
            if (d != null) {
                d.finish();
            }
            final EdgeEffect e = m.e;
            if (e != null) {
                e.finish();
            }
            final EdgeEffect f = m.f;
            if (f != null) {
                f.finish();
            }
            final EdgeEffect g = m.g;
            if (g != null) {
                g.finish();
            }
            final EdgeEffect h = m.h;
            if (h != null) {
                h.finish();
            }
            final EdgeEffect j = m.i;
            if (j != null) {
                j.finish();
            }
            final EdgeEffect k = m.j;
            if (k != null) {
                k.finish();
            }
            final EdgeEffect k2 = m.k;
            if (k2 != null) {
                k2.finish();
            }
            k0d.a();
            return;
        }
        float w0 = k0d.w0(30.0f);
        final boolean b2 = k19.f(m.d) || k19.g(m.h) || k19.f(m.e) || k19.g(m.i);
        final boolean b3 = k19.f(m.f) || k19.g(m.j) || k19.f(m.g) || k19.g(m.k);
        if (b2 && b3) {
            m6b.q(this.s1(), b.getWidth(), b.getHeight());
        }
        else if (b2) {
            m6b.q(this.s1(), k8e.H(w0) * 2 + b.getWidth(), b.getHeight());
        }
        else {
            if (!b3) {
                k0d.a();
                return;
            }
            m6b.q(this.s1(), b.getWidth(), k8e.H(w0) * 2 + b.getHeight());
        }
        final RecordingCanvas d2 = m6b.d(this.s1());
        final boolean g2 = k19.g(m.j);
        final zhg w2 = zhg.w;
        if (g2) {
            EdgeEffect j2;
            if ((j2 = m.j) == null) {
                j2 = m.a(w2);
                m.j = j2;
            }
            r1(90.0f, j2, (Canvas)d2);
            j2.finish();
        }
        int r1;
        if (k19.f(m.f)) {
            final EdgeEffect c = m.c();
            r1 = (r1(270.0f, c, (Canvas)d2) ? 1 : 0);
            if (k19.g(m.f)) {
                final float intBitsToFloat = Float.intBitsToFloat((int)(l.c() & 0xFFFFFFFFL));
                EdgeEffect j3;
                if ((j3 = m.j) == null) {
                    j3 = m.a(w2);
                    m.j = j3;
                }
                y9r.l(j3, y9r.f(c), 1.0f - intBitsToFloat);
            }
        }
        else {
            r1 = 0;
        }
        final boolean g3 = k19.g(m.h);
        final zhg v2 = zhg.v;
        if (g3) {
            EdgeEffect h2;
            if ((h2 = m.h) == null) {
                h2 = m.a(v2);
                m.h = h2;
            }
            r1(180.0f, h2, (Canvas)d2);
            h2.finish();
        }
        int n = r1;
        if (k19.f(m.d)) {
            final EdgeEffect e2 = m.e();
            int n2;
            if (!r1(0.0f, e2, (Canvas)d2) && r1 == 0) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            n = n2;
            if (k19.g(m.d)) {
                final float intBitsToFloat2 = Float.intBitsToFloat((int)(l.c() >> 32));
                EdgeEffect h3;
                if ((h3 = m.h) == null) {
                    h3 = m.a(v2);
                    m.h = h3;
                }
                y9r.l(h3, y9r.f(e2), intBitsToFloat2);
                n = n2;
            }
        }
        if (k19.g(m.k)) {
            EdgeEffect k3;
            if ((k3 = m.k) == null) {
                k3 = m.a(w2);
                m.k = k3;
            }
            r1(270.0f, k3, (Canvas)d2);
            k3.finish();
        }
        int n3 = n;
        if (k19.f(m.g)) {
            final EdgeEffect d3 = m.d();
            int n4;
            if (!r1(90.0f, d3, (Canvas)d2) && n == 0) {
                n4 = 0;
            }
            else {
                n4 = 1;
            }
            n3 = n4;
            if (k19.g(m.g)) {
                final float intBitsToFloat3 = Float.intBitsToFloat((int)(l.c() & 0xFFFFFFFFL));
                EdgeEffect k4;
                if ((k4 = m.k) == null) {
                    k4 = m.a(w2);
                    m.k = k4;
                }
                y9r.l(k4, y9r.f(d3), intBitsToFloat3);
                n3 = n4;
            }
        }
        if (k19.g(m.i)) {
            EdgeEffect i2;
            if ((i2 = m.i) == null) {
                i2 = m.a(v2);
                m.i = i2;
            }
            r1(0.0f, i2, (Canvas)d2);
            i2.finish();
        }
        int n5 = n3;
        if (k19.f(m.e)) {
            final EdgeEffect b4 = m.b();
            int n6;
            if (!r1(180.0f, b4, (Canvas)d2) && n3 == 0) {
                n6 = 0;
            }
            else {
                n6 = 1;
            }
            if (k19.g(m.e)) {
                final float intBitsToFloat4 = Float.intBitsToFloat((int)(l.c() >> 32));
                EdgeEffect i3;
                if ((i3 = m.i) == null) {
                    i3 = m.a(v2);
                    m.i = i3;
                }
                y9r.l(i3, y9r.f(b4), 1.0f - intBitsToFloat4);
            }
            n5 = n6;
        }
        if (n5 != 0) {
            l.d();
        }
        float n7;
        if (b3) {
            n7 = 0.0f;
        }
        else {
            n7 = w0;
        }
        if (b2) {
            w0 = 0.0f;
        }
        final qzc layoutDirection = k0d.getLayoutDirection();
        final f40 f2 = new f40();
        f2.a = (Canvas)d2;
        final long i4 = ((cw8)v).i();
        final xc8 w3 = v.w.w();
        final qzc y = v.w.y();
        final x13 t = v.w.t();
        final long a = v.w.A();
        final zn0 w4 = v.w;
        final g6b w5 = (g6b)w4.w;
        w4.H((xc8)k0d);
        w4.I(layoutDirection);
        w4.G((x13)f2);
        w4.J(i4);
        w4.w = null;
        f2.g();
        Label_1509: {
            try {
                ((jy7)v.w.v).G(n7, w0);
                final k0d k0d2 = k0d;
                k0d2.a();
                final z13 z13 = v;
                final zn0 zn0 = z13.w;
                final Object o = zn0.v;
                final jy7 jy7 = (jy7)o;
                final float n8 = n7;
                n7 = -n8;
                final float n9 = w0;
                w0 = -n9;
                final jy7 jy8 = jy7;
                final float n10 = n7;
                final float n11 = w0;
                jy8.G(n10, n11);
                final f40 f3 = f2;
                f3.p();
                final z13 z14 = v;
                final zn0 zn2 = z14.w;
                final zn0 zn4;
                final zn0 zn3 = zn4 = zn2;
                final xc8 xc8 = w3;
                zn4.H(xc8);
                final zn0 zn5 = zn3;
                final qzc qzc = y;
                zn5.I(qzc);
                final zn0 zn6 = zn3;
                final x13 x13 = t;
                zn6.G(x13);
                final zn0 zn7 = zn3;
                final long n12 = a;
                zn7.J(n12);
                final zn0 zn8 = zn3;
                final g6b g6b = w5;
                zn8.w = g6b;
                final kxm kxm = this;
                final RenderNode renderNode = kxm.s1();
                m6b.u(renderNode);
                final Canvas canvas = b;
                final int n13 = canvas.save();
                final Canvas canvas2 = b;
                final float n14 = n7;
                final float n15 = w0;
                canvas2.translate(n14, n15);
                final Canvas canvas3 = b;
                final kxm kxm2 = this;
                final RenderNode renderNode2 = kxm2.s1();
                m6b.t(canvas3, renderNode2);
                final Canvas canvas4 = b;
                final int n16 = n13;
                canvas4.restoreToCount(n16);
                return;
            }
            finally {
                break Label_1509;
            }
            try {
                final k0d k0d2 = k0d;
                k0d2.a();
                final z13 z13 = v;
                final zn0 zn0 = z13.w;
                final Object o = zn0.v;
                final jy7 jy7 = (jy7)o;
                final float n8 = n7;
                n7 = -n8;
                final float n9 = w0;
                w0 = -n9;
                final jy7 jy8 = jy7;
                final float n10 = n7;
                final float n11 = w0;
                jy8.G(n10, n11);
                final f40 f3 = f2;
                f3.p();
                final z13 z14 = v;
                final zn0 zn2 = z14.w;
                final zn0 zn4;
                final zn0 zn3 = zn4 = zn2;
                final xc8 xc8 = w3;
                zn4.H(xc8);
                final zn0 zn5 = zn3;
                final qzc qzc = y;
                zn5.I(qzc);
                final zn0 zn6 = zn3;
                final x13 x13 = t;
                zn6.G(x13);
                final zn0 zn7 = zn3;
                final long n12 = a;
                zn7.J(n12);
                final zn0 zn8 = zn3;
                final g6b g6b = w5;
                zn8.w = g6b;
                final kxm kxm = this;
                final RenderNode renderNode = kxm.s1();
                m6b.u(renderNode);
                final Canvas canvas = b;
                final int n13 = canvas.save();
                final Canvas canvas2 = b;
                final float n14 = n7;
                final float n15 = w0;
                canvas2.translate(n14, n15);
                final Canvas canvas3 = b;
                final kxm kxm2 = this;
                final RenderNode renderNode2 = kxm2.s1();
                m6b.t(canvas3, renderNode2);
                final Canvas canvas4 = b;
                final int n16 = n13;
                canvas4.restoreToCount(n16);
                return;
            }
            finally {
                ((jy7)v.w.v).G(-n7, -w0);
            }
        }
        f2.p();
        final zn0 w6 = v.w;
        w6.H(w3);
        w6.I(y);
        w6.G(t);
        w6.J(a);
        w6.w = w5;
    }
    
    public final RenderNode s1() {
        RenderNode n;
        if ((n = this.N) == null) {
            n = ipe.e();
            this.N = n;
        }
        return n;
    }
}
