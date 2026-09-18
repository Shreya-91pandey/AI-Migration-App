import android.widget.EdgeEffect;
import android.os.Build$VERSION;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import android.content.Context;

public final class w60
{
    public final xc8 a;
    public long b;
    public final k19 c;
    public final ksg d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final v98 i;
    
    public w60(final Context context, final xc8 a, final long n, final hng hng) {
        this.a = a;
        this.b = 9205357640488583168L;
        final k19 c = new k19(context, t08.o0(n));
        this.c = c;
        this.d = new ksg((Object)lqo.a, (q8m)cib.A);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        final t6n a2 = p6n.a((PointerInputEventHandler)new v60(this, (byte)0));
        Object i;
        if (Build$VERSION.SDK_INT >= 31) {
            i = new kxm(a2, this, c);
        }
        else {
            i = new g3b(a2, this, c, hng);
        }
        this.i = (v98)i;
    }
    
    public final void a() {
        final k19 c = this.c;
        final EdgeEffect d = c.d;
        final boolean b = true;
        boolean b2;
        if (d != null) {
            d.onRelease();
            b2 = (d.isFinished() ^ true);
        }
        else {
            b2 = false;
        }
        final EdgeEffect e = c.e;
        boolean b3 = b2;
        if (e != null) {
            e.onRelease();
            b3 = (!e.isFinished() || b2);
        }
        final EdgeEffect f = c.f;
        boolean b4 = b3;
        if (f != null) {
            f.onRelease();
            b4 = (!f.isFinished() || b3);
        }
        final EdgeEffect g = c.g;
        int n = b4 ? 1 : 0;
        if (g != null) {
            g.onRelease();
            n = (b ? 1 : 0);
            if (g.isFinished()) {
                if (b4) {
                    n = (b ? 1 : 0);
                }
                else {
                    n = 0;
                }
            }
        }
        if (n != 0) {
            this.d();
        }
    }
    
    public final Object b(long v, final zta zta, final h07 h07) {
        t60 t61 = null;
        Label_0059: {
            if (h07 instanceof t60) {
                final t60 t60 = (t60)h07;
                final int y = t60.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    t60.y = y + Integer.MIN_VALUE;
                    t61 = t60;
                    break Label_0059;
                }
            }
            t61 = new t60(this, h07);
        }
        final Object w = t61.w;
        final int y2 = t61.y;
        final lqo a = lqo.a;
        final k19 c = this.c;
        Object d2 = null;
        Label_0478: {
            if (y2 == 0) {
                vt4.g0(w);
                final boolean d = yzl.d(this.g);
                final pc7 v2 = pc7.v;
                if (d) {
                    final f7p a2 = f7p.a(v);
                    t61.y = 1;
                    if (zta.d(a2, t61) != v2) {
                        return a;
                    }
                }
                else {
                    final boolean g = k19.g(c.f);
                    final xc8 a3 = this.a;
                    float a4;
                    if (g && f7p.d(v) < 0.0f) {
                        a4 = y9r.a(c.c(), f7p.d(v), Float.intBitsToFloat((int)(this.g >> 32)), a3);
                    }
                    else if (k19.g(c.g) && f7p.d(v) > 0.0f) {
                        a4 = -y9r.a(c.d(), -f7p.d(v), Float.intBitsToFloat((int)(this.g >> 32)), a3);
                    }
                    else {
                        a4 = 0.0f;
                    }
                    float a5;
                    if (k19.g(c.d) && f7p.e(v) < 0.0f) {
                        a5 = y9r.a(c.e(), f7p.e(v), Float.intBitsToFloat((int)(0xFFFFFFFFL & this.g)), a3);
                    }
                    else if (k19.g(c.e) && f7p.e(v) > 0.0f) {
                        a5 = -y9r.a(c.b(), -f7p.e(v), Float.intBitsToFloat((int)(0xFFFFFFFFL & this.g)), a3);
                    }
                    else {
                        a5 = 0.0f;
                    }
                    final long g2 = iar.g(a4, a5);
                    if (!f7p.c(g2)) {
                        this.d();
                    }
                    v = f7p.f(v, g2);
                    final f7p a6 = f7p.a(v);
                    t61.v = v;
                    t61.y = 2;
                    d2 = zta.d(a6, t61);
                    if (d2 != v2) {
                        break Label_0478;
                    }
                }
                return v2;
            }
            if (y2 == 1) {
                vt4.g0(w);
                return a;
            }
            if (y2 != 2) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = t61.v;
            vt4.g0(w);
            d2 = w;
        }
        v = f7p.f(v, ((f7p)d2).j());
        this.f = false;
        if (f7p.d(v) > 0.0f) {
            y9r.k(c.c(), k8e.H(f7p.d(v)));
        }
        else if (f7p.d(v) < 0.0f) {
            y9r.k(c.d(), -k8e.H(f7p.d(v)));
        }
        if (f7p.e(v) > 0.0f) {
            y9r.k(c.e(), k8e.H(f7p.e(v)));
        }
        else if (f7p.e(v) < 0.0f) {
            y9r.k(c.b(), -k8e.H(f7p.e(v)));
        }
        this.a();
        return a;
    }
    
    public final long c() {
        long n = this.b;
        if ((0x7FFFFFFF7FFFFFFFL & n) == 0x7FC000007FC00000L) {
            n = ach.K(this.g);
        }
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) / Float.intBitsToFloat((int)(this.g & 0xFFFFFFFFL))) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n >> 32)) / Float.intBitsToFloat((int)(this.g >> 32))) << 32;
    }
    
    public final void d() {
        if (this.e) {
            this.d.setValue((Object)lqo.a);
        }
    }
    
    public final boolean e() {
        final k19 c = this.c;
        final EdgeEffect d = c.d;
        if (d == null || y9r.f(d) == 0.0f) {
            final EdgeEffect e = c.e;
            if (e == null || y9r.f(e) == 0.0f) {
                final EdgeEffect f = c.f;
                if (f == null || y9r.f(f) == 0.0f) {
                    final EdgeEffect g = c.g;
                    if (g == null || y9r.f(g) == 0.0f) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public final float f(final long n) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(this.c() >> 32));
        final int n2 = (int)(n & 0xFFFFFFFFL);
        final float n3 = Float.intBitsToFloat(n2) / Float.intBitsToFloat((int)(this.g & 0xFFFFFFFFL));
        final EdgeEffect b = this.c.b();
        final float n4 = -y9r.l(b, -n3, 1.0f - intBitsToFloat);
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(this.g & 0xFFFFFFFFL));
        if (y9r.f(b) == 0.0f) {
            return intBitsToFloat2 * n4;
        }
        return Float.intBitsToFloat(n2);
    }
    
    public final float g(final long n) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(this.c() & 0xFFFFFFFFL));
        final int n2 = (int)(n >> 32);
        final float n3 = Float.intBitsToFloat(n2) / Float.intBitsToFloat((int)(this.g >> 32));
        final EdgeEffect c = this.c.c();
        final float l = y9r.l(c, n3, 1.0f - intBitsToFloat);
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(this.g >> 32));
        if (y9r.f(c) == 0.0f) {
            return intBitsToFloat2 * l;
        }
        return Float.intBitsToFloat(n2);
    }
    
    public final float h(final long n) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(this.c() & 0xFFFFFFFFL));
        final int n2 = (int)(n >> 32);
        final float n3 = Float.intBitsToFloat(n2) / Float.intBitsToFloat((int)(this.g >> 32));
        final EdgeEffect d = this.c.d();
        final float n4 = -y9r.l(d, -n3, intBitsToFloat);
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(this.g >> 32));
        if (y9r.f(d) == 0.0f) {
            return intBitsToFloat2 * n4;
        }
        return Float.intBitsToFloat(n2);
    }
    
    public final float i(final long n) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(this.c() >> 32));
        final int n2 = (int)(n & 0xFFFFFFFFL);
        final float n3 = Float.intBitsToFloat(n2) / Float.intBitsToFloat((int)(this.g & 0xFFFFFFFFL));
        final EdgeEffect e = this.c.e();
        final float l = y9r.l(e, n3, intBitsToFloat);
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(this.g & 0xFFFFFFFFL));
        if (y9r.f(e) == 0.0f) {
            return intBitsToFloat2 * l;
        }
        return Float.intBitsToFloat(n2);
    }
    
    public final void j(long n) {
        final boolean b = yzl.b(this.g, 0L);
        final boolean b2 = yzl.b(n, this.g);
        this.g = n;
        if (!b2) {
            final int h = k8e.H(Float.intBitsToFloat((int)(n >> 32)));
            final int h2 = k8e.H(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)));
            n = h;
            n = (((long)h2 & 0xFFFFFFFFL) | n << 32);
            final k19 c = this.c;
            c.c = n;
            final EdgeEffect d = c.d;
            if (d != null) {
                d.setSize((int)(n >> 32), (int)(n & 0xFFFFFFFFL));
            }
            final EdgeEffect e = c.e;
            if (e != null) {
                e.setSize((int)(n >> 32), (int)(n & 0xFFFFFFFFL));
            }
            final EdgeEffect f = c.f;
            if (f != null) {
                f.setSize((int)(n & 0xFFFFFFFFL), (int)(n >> 32));
            }
            final EdgeEffect g = c.g;
            if (g != null) {
                g.setSize((int)(n & 0xFFFFFFFFL), (int)(n >> 32));
            }
            final EdgeEffect h3 = c.h;
            if (h3 != null) {
                h3.setSize((int)(n >> 32), (int)(n & 0xFFFFFFFFL));
            }
            final EdgeEffect i = c.i;
            if (i != null) {
                i.setSize((int)(n >> 32), (int)(n & 0xFFFFFFFFL));
            }
            final EdgeEffect j = c.j;
            if (j != null) {
                j.setSize((int)(n & 0xFFFFFFFFL), (int)(n >> 32));
            }
            final EdgeEffect k = c.k;
            if (k != null) {
                k.setSize((int)(0xFFFFFFFFL & n), (int)(n >> 32));
            }
        }
        if (!b && !b2) {
            this.a();
        }
    }
}
