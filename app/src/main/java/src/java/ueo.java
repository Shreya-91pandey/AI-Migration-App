public final class ueo implements xom
{
    public final zeo v;
    public lta w;
    public lta x;
    public final veo y;
    
    public ueo(final veo y, final zeo v, final lta w, final lta x) {
        this.y = y;
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final void a(final xeo xeo, final Object o, final ig0 ig0) {
        final Object b = this.x.b(xeo.h());
        final boolean h = this.y.c.h();
        final zeo v = this.v;
        if (h) {
            v.g(this.x.b(xeo.d()), b, (bfa)this.w.b(xeo));
            return;
        }
        v.h(b, (bfa)this.w.b(xeo), o, ig0);
    }
    
    @Override
    public final Object getValue() {
        this.a(this.y.c.f(), null, null);
        return this.v.E.getValue();
    }
}
