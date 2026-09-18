public final class veo
{
    public final elo a;
    public final ksg b;
    public final efo c;
    
    public veo(final efo c, final elo a, final String s) {
        this.c = c;
        this.a = a;
        this.b = o50.Q(null);
    }
    
    public final ueo a(final lta w, final Object o, final ig0 ig0, final lta x) {
        final ksg b = this.b;
        final ueo ueo = (ueo)b.getValue();
        final efo c = this.c;
        ueo value = ueo;
        if (ueo == null) {
            final Object b2 = x.b(c.a.i());
            final Object b3 = x.b(c.a.i());
            final elo a = this.a;
            final ig0 ig2 = (ig0)a.a().b(b3);
            ig2.d();
            final zeo zeo = new zeo(c, b2, ig2, a);
            value = new ueo(this, zeo, w, x);
            b.setValue((Object)value);
            c.j.add((Object)zeo);
        }
        value.x = x;
        value.w = w;
        value.a(c.f(), o, ig0);
        return value;
    }
}
