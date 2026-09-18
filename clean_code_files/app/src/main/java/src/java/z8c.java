public final class z8c
{
    public final inf a;
    public final ksg b;
    public long c;
    public final ksg d;
    
    public z8c() {
        this.a = new inf(0, (Object[])new x8c[16]);
        this.b = o50.Q(Boolean.FALSE);
        this.c = Long.MIN_VALUE;
        this.d = o50.Q(Boolean.TRUE);
    }
    
    public final void a(final int n, final gva gva) {
        gva.i0(-318043801);
        int n2;
        if (gva.h((Object)this)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            final Object r = gva.R();
            final cib a = bi6.a;
            Object q;
            if ((q = r) == a) {
                q = o50.Q(null);
                gva.q0(q);
            }
            final bnf bnf = (bnf)q;
            if (!(boolean)this.d.getValue() && !(boolean)this.b.getValue()) {
                gva.g0(-143455237);
                gva.q(false);
            }
            else {
                gva.g0(-144841960);
                final boolean h = gva.h((Object)this);
                final Object r2 = gva.R();
                zta zta;
                if (h || (zta = (zta)r2) == a) {
                    zta = new l10(bnf, this, null, (byte)6);
                    gva.q0((Object)zta);
                }
                mlc.f(zta, gva, this);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new l0((Object)this, n, (byte)14);
        }
    }
}
