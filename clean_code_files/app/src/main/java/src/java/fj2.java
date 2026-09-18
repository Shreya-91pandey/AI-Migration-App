public final class fj2
{
    public final itl a;
    public final efo b;
    public final jta c;
    public final ksg d;
    public final ksg e;
    public bfa f;
    public final ej2 g;
    public final ksg h;
    public k2j i;
    public k2j j;
    public final ej2 k;
    
    public fj2(final itl a, final efo b, final veo veo, final kj2 kj2, final jta c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = o50.Q(veo);
        this.e = o50.Q(kj2);
        this.f = gj2.a;
        this.g = new ej2(this, (byte)1);
        this.h = o50.Q(null);
        this.k = new ej2(this, (byte)0);
    }
    
    public final void a(final k2j i, final k2j j, final vf0 vf0, final k2j k2j, final hg0 hg0) {
        if (this.a.a()) {
            this.i = i;
            this.j = j;
            final ksg h = this.h;
            if (h.getValue() == null) {
                Object o;
                if ((o = vf0) == null) {
                    o = this.e.getValue();
                }
                this.f = ((kj2)o).a();
            }
            h.setValue((Object)((veo)this.d.getValue()).a(this.g, k2j, hg0, this.k));
        }
    }
    
    public final boolean b() {
        return (boolean)this.b.d.getValue();
    }
    
    public final k2j c() {
        if (this.a.a()) {
            final xom xom = (xom)this.h.getValue();
            if (xom != null) {
                final k2j k2j = (k2j)xom.getValue();
                if (k2j != null) {
                    final long a = ((l6g)this.c.a()).a;
                    if (!l6g.c(a, 0L)) {
                        return k2j.m(a);
                    }
                    return k2j;
                }
            }
        }
        return null;
    }
    
    public final boolean d() {
        efo b = this.b;
        while (true) {
            final efo b2 = b.b;
            if (b2 == null) {
                break;
            }
            b = b2;
        }
        return mlc.q(b.a.i(), b.d.getValue()) ^ true;
    }
}
