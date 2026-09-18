public final class hd extends qtl
{
    public final c2l a;
    public final ksg b;
    public final ksg c;
    
    public hd(final c2l a, final zql zql, final k2j k2j) {
        this.a = a;
        this.b = o50.Q(zql);
        this.c = o50.Q(k2j);
    }
    
    @Override
    public final qtl a(final url url, final zql value, final long n, final long n2, final long n3) {
        final ksg b = this.b;
        qt7.Y(this.a, n, n2, n3, mlc.q(b.getValue(), value) ^ true);
        b.setValue((Object)value);
        return this;
    }
    
    @Override
    public final k2j c() {
        return (k2j)this.c.getValue();
    }
    
    @Override
    public final boolean d() {
        return true;
    }
    
    @Override
    public final c2l e() {
        return this.a;
    }
    
    @Override
    public final qtl h() {
        final c2l a = this.a;
        rml.f(l6g.i(((l6g)((ksg)a.z).getValue()).a, ((l6g)((ksg)a.y).getValue()).a), ((yzl)((ksg)a.w).getValue()).a);
        final vrl n = ((zql)this.b.getValue()).N;
        final ysl ysl = (ysl)n.l().b.getValue();
        n.l();
        final nzc b = n.h().b.B;
        if (b != null) {
            uoo.Z(b.k());
            ysl.getClass();
            return qwf.a;
        }
        en9.s("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }
    
    @Override
    public final void i(final k2j value) {
        this.c.setValue((Object)value);
    }
}
