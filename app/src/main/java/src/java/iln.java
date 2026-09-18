import java.util.List;

public final class iln
{
    public final vhk a;
    public ghn b;
    public final ksg c;
    public final ksg d;
    public final ksg e;
    public final ksg f;
    public final xzj g;
    public final inf h;
    
    public iln(final long n, final String s) {
        final r89 v = r89.v;
        this(s, n, new vhk(null, new aqo(100, (List)v, (List)v)));
    }
    
    public iln(String s, int length) {
        if ((length & 0x1) != 0x0) {
            s = "";
        }
        length = s.length();
        this(rhc.c(length, length), s);
    }
    
    public iln(final String s, final long n, final vhk a) {
        this.a = a;
        this.b = new ghn(new hhn((CharSequence)s, rhc.j(s.length(), n), null, null, null, null, null, 124), null, null, null, 14);
        final Boolean booleanFalse = Boolean.FALSE;
        this.c = o50.Q((Object)false);
        this.d = o50.Q((Object)new hhn((CharSequence)s, n, null, null, null, null, null, 124));
        this.e = o50.Q((Object)false);
        this.f = o50.Q((Object)false);
        this.g = new xzj((Object)this);
        this.h = new inf(0, (Object[])new gln[16]);
    }
    
    public final void a(final ghn ghn) {
        final boolean b = ((inf)ghn.a().w).x > 0;
        final boolean c = dnn.c(ghn.B, this.b.B);
        final boolean q = mlc.q((Object)ghn.y, (Object)this.b.y);
        if (b) {
            this.e(this.d(), ghn.i(ghn, 0L, null, null, 15), ghn.a(), 3);
        }
        this.i(ghn, b, c ^ true, true ^ q);
    }
    
    public final void b(final tdc tdc, final boolean b, final int n) {
        final hhn d = this.d();
        if (((inf)this.b.a().w).x == 0 && dnn.c(d.y, this.b.B)) {
            if (mlc.q((Object)d.z, (Object)this.b.C) && mlc.q((Object)d.A, (Object)this.b.E) && mlc.q((Object)d.v, (Object)this.b.D)) {
                return;
            }
            final hhn d2 = this.d();
            final String string = this.b.x.toString();
            final ghn b2 = this.b;
            final long b3 = b2.B;
            final dnn c = b2.C;
            this.j(d2, new hhn((CharSequence)string, b3, c, b2.E, bjq.i(c, b2.D), null, d.w, 32), b);
        }
        else {
            final int x = ((inf)this.b.a().w).x;
            final boolean b4 = false;
            final boolean b5 = x != 0;
            final String string2 = this.b.x.toString();
            final ghn b6 = this.b;
            final long b7 = b6.B;
            final dnn c2 = b6.C;
            final hhn hhn = new hhn((CharSequence)string2, b7, c2, b6.E, bjq.i(c2, b6.D), null, bjq.n(this.b), 32);
            if (tdc == null) {
                boolean b8 = b4;
                if (b5) {
                    b8 = b4;
                    if (b) {
                        b8 = true;
                    }
                }
                this.j(d, hhn, b8);
                this.e(d, hhn, this.b.a(), n);
                return;
            }
            final ghn ghn = new ghn(hhn, this.b.a(), d, null, 8);
            tdc.k(ghn);
            final boolean u0 = rym.u0((CharSequence)ghn.x, (CharSequence)hhn);
            final boolean c3 = dnn.c(ghn.B, hhn.y);
            final nnn y = ghn.y;
            final lln w = hhn.w;
            nnn a;
            if (w != null) {
                a = w.a;
            }
            else {
                a = null;
            }
            final boolean q = mlc.q((Object)y, (Object)a);
            if (u0 && c3 && q) {
                this.j(d, ghn.i(ghn, 0L, hhn.z, null, 13), b);
            }
            else {
                this.i(ghn, u0 ^ true, c3 ^ true, q ^ true);
            }
            this.e(d, this.d(), ghn.a(), n);
        }
    }
    
    public final void c() {
        this.c.setValue((Object)Boolean.FALSE);
        this.g(false);
    }
    
    public final hhn d() {
        return (hhn)this.d.getValue();
    }
    
    public final void e(final hhn hhn, final hhn hhn2, final jmq jmq, int d) {
        d = ge9.D(d);
        final vhk a = this.a;
        if (d == 0) {
            pkq.h(a, hhn, hhn2, jmq, true);
            return;
        }
        if (d == 1) {
            ((ksg)a.x).setValue((Object)null);
            final aqo aqo = (aqo)a.w;
            aqo.b.clear();
            aqo.c.clear();
            return;
        }
        if (d == 2) {
            pkq.h(a, hhn, hhn2, jmq, false);
            return;
        }
        en9.r();
    }
    
    public final void f(final boolean b) {
        this.f.setValue((Object)b);
    }
    
    public final void g(final boolean b) {
        this.e.setValue((Object)b);
    }
    
    public final ghn h() {
        final ksg c = this.c;
        final r7m a = q7m.a();
        lta e;
        if (a != null) {
            e = a.e();
        }
        else {
            e = null;
        }
        final r7m b = q7m.b(a);
        try {
            final boolean booleanValue = (boolean)c.getValue();
            q7m.d(a, b, e);
            if (booleanValue) {
                jac.c("TextFieldState does not support concurrent or nested editing.");
            }
            c.setValue((Object)Boolean.TRUE);
            return new ghn(this.d(), null, null, null, 14);
        }
        finally {
            q7m.d(a, b, e);
        }
    }
    
    public final void i(final ghn ghn, final boolean b, final boolean b2, final boolean b3) {
        final hhn i = ghn.i(this.b, 0L, null, null, 15);
        if (!b && !b3) {
            if (b2) {
                final ghn b4 = this.b;
                final long b5 = ghn.B;
                final int c = dnn.c;
                b4.h(rhc.c((int)(b5 >> 32), (int)(b5 & 0xFFFFFFFFL)));
            }
        }
        else {
            this.b = new ghn(new hhn((CharSequence)ghn.x.toString(), ghn.B, null, null, null, null, bjq.n(ghn), 60), null, null, null, 14);
        }
        if (b || b2 || !mlc.q((Object)i.z, (Object)ghn.C)) {
            this.b.g(null);
        }
        this.j(i, ghn.i(this.b, 0L, null, null, 15), true);
    }
    
    public final void j(final hhn hhn, final hhn value, final boolean b) {
        this.d.setValue((Object)value);
        final inf h = this.h;
        final Object[] v = h.v;
        for (int x = h.x, i = 0; i < x; ++i) {
            ((gln)v[i]).a(hhn, value, b && !rym.u0(hhn.x, (CharSequence)value) && hhn.z != null);
        }
        this.g(false);
    }
    
    @Override
    public final String toString() {
        final r7m a = q7m.a();
        lta e;
        if (a != null) {
            e = a.e();
        }
        else {
            e = null;
        }
        final r7m b = q7m.b(a);
        try {
            final String i = dnn.i(this.d().y);
            final CharSequence x = this.d().x;
            final StringBuilder sb = new StringBuilder("TextFieldState(selection=");
            sb.append(i);
            sb.append(", text=\"");
            sb.append((Object)x);
            sb.append("\")");
            return sb.toString();
        }
        finally {
            q7m.d(a, b, e);
        }
    }
}
