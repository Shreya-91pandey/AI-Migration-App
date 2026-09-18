public final class cm2 extends rn1
{
    public l13 a;
    public lta b;
    
    @Override
    public final void a() {
        this.b = null;
        this.a = null;
    }
    
    @Override
    public final void b(final Throwable t) {
        final l13 a = this.a;
        if (a != null) {
            a.resumeWith((Object)new jpj(t));
        }
    }
}
