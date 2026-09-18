import java.util.Map;
import java.util.HashMap;

public final class j0d
{
    public final nx a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public nx h;
    public final HashMap i;
    public final byte j;
    
    public j0d(final nx a, final byte j) {
        this.j = j;
        this.a = a;
        this.b = true;
        this.i = new HashMap();
    }
    
    public final void a(final hx hx, int n, yxf yxf) {
        final float n2 = (float)n;
        final long n3 = Float.floatToRawIntBits(n2);
        final long n4 = Float.floatToRawIntBits(n2);
        long n5 = n3 << 32;
        long n6 = n4 & 0xFFFFFFFFL;
        long n7 = 0L;
    Label_0294:
        while (true) {
            n7 = (n5 | n6);
            yxf t;
            do {
                switch (this.j) {
                    default: {
                        final yxd f1 = yxf.f1();
                        f1.getClass();
                        final long q = f1.Q;
                        n7 = l6g.i(((long)Float.floatToRawIntBits((float)(int)(q & 0xFFFFFFFFL)) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits((float)(int)(q >> 32)) << 32, n7);
                        break;
                    }
                    case 0: {
                        final gmg q2 = yxf.q0;
                        long b = n7;
                        if (q2 != null) {
                            final j6b j6b = (j6b)q2;
                            final float[] b2 = j6b.b();
                            if (j6b.N) {
                                b = n7;
                            }
                            else {
                                b = l8e.b(n7, b2);
                            }
                        }
                        n7 = zrn.N(b, yxf.c0);
                        break;
                    }
                }
                t = yxf.T;
                t.getClass();
                if (t.equals(this.a.d())) {
                    break Label_0294;
                }
                yxf = t;
            } while (!this.b(t).containsKey((Object)hx));
            final float n8 = (float)this.c(t, hx);
            final long n9 = Float.floatToRawIntBits(n8);
            final long n10 = Float.floatToRawIntBits(n8);
            n5 = n9 << 32;
            n6 = (n10 & 0xFFFFFFFFL);
            yxf = t;
        }
        float n11;
        if (hx instanceof olb) {
            n11 = Float.intBitsToFloat((int)(n7 & 0xFFFFFFFFL));
        }
        else {
            n11 = Float.intBitsToFloat((int)(n7 >> 32));
        }
        final int round = Math.round(n11);
        final HashMap i = this.i;
        n = round;
        if (i.containsKey((Object)hx)) {
            n = ((Number)y5e.X((Object)hx, (Map)i)).intValue();
            final olb a = kx.a;
            n = ((Number)hx.a.d((Object)n, (Object)round)).intValue();
        }
        i.put((Object)hx, (Object)n);
    }
    
    public final Map b(final yxf yxf) {
        switch (this.j) {
            default: {
                final yxd f1 = yxf.f1();
                f1.getClass();
                return f1.y0().c();
            }
            case 0: {
                return yxf.y0().c();
            }
        }
    }
    
    public final int c(final yxf yxf, final hx hx) {
        switch (this.j) {
            default: {
                final yxd f1 = yxf.f1();
                f1.getClass();
                return f1.S(hx);
            }
            case 0: {
                return yxf.S(hx);
            }
        }
    }
    
    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }
    
    public final boolean e() {
        this.h();
        return this.h != null;
    }
    
    public final void f() {
        this.b = true;
        final nx a = this.a;
        final nx g = a.g();
        if (g == null) {
            return;
        }
        if (this.c) {
            g.P();
        }
        else if (this.e || this.d) {
            g.requestLayout();
        }
        if (this.f) {
            a.P();
        }
        if (this.g) {
            a.requestLayout();
        }
        g.c().f();
    }
    
    public final void g() {
        final HashMap i = this.i;
        i.clear();
        final i1 i2 = new i1((Object)this, (byte)2);
        final nx a = this.a;
        a.e(i2);
        i.putAll(this.b(a.d()));
        this.b = false;
    }
    
    public final void h() {
        final boolean d = this.d();
        nx h = this.a;
        Label_0142: {
            if (!d) {
                final nx g = h.g();
                if (g == null) {
                    return;
                }
                h = g.c().h;
                if (h == null || !h.c().d()) {
                    final nx h2 = this.h;
                    if (h2 == null) {
                        return;
                    }
                    if (h2.c().d()) {
                        return;
                    }
                    final nx g2 = h2.g();
                    if (g2 != null) {
                        final j0d c = g2.c();
                        if (c != null) {
                            c.h();
                        }
                    }
                    final nx g3 = h2.g();
                    if (g3 != null) {
                        final j0d c2 = g3.c();
                        if (c2 != null) {
                            h = c2.h;
                            break Label_0142;
                        }
                    }
                    h = null;
                }
            }
        }
        this.h = h;
    }
}
