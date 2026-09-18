public final class ew0 extends r7c
{
    public final fw0 y;
    
    public ew0(final fw0 y) {
        this.y = y;
        super(y.x);
    }
    
    @Override
    public final Object a(final int n) {
        return this.y.w[n];
    }
    
    @Override
    public final void c(final int n) {
        this.y.a(n);
    }
}
