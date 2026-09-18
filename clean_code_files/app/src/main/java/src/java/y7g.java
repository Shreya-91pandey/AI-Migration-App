public final class y7g extends drf
{
    public final z7g d;
    public boolean e;
    
    public y7g(final z7g d, final a8g a8g) {
        super(a8g, d.b);
        this.d = d;
        this.e = true;
    }
    
    @Override
    public final void a() {
        this.d.a();
    }
    
    @Override
    public final void b() {
        this.d.b();
    }
    
    @Override
    public final void c(final brf brf) {
        this.d.c(new go1(brf));
    }
    
    @Override
    public final void d(final brf brf) {
        this.d.d(new go1(brf));
    }
    
    public final void g(final boolean e) {
        this.e = e;
        this.f(e && this.d.b);
    }
}
