public final class upg implements gv8, tfk
{
    public final ypg a;
    
    public upg(final ypg a) {
        this.a = a;
    }
    
    @Override
    public final void a(float floatValue) {
        final ypg a = this.a.o.a;
        floatValue = ((Number)a.a.b((Object)floatValue)).floatValue();
        final int f = a.f;
        if (f == -1) {
            return;
        }
        a.i((int)(f + floatValue));
    }
    
    @Override
    public final float b(final float n) {
        final ypg a = this.a;
        final int d = a.d();
        this.a(n);
        return (float)(a.d() - d);
    }
}
