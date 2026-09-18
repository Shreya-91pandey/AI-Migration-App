public final class l8m extends lpm
{
    public float c;
    
    public l8m(final float c, final long n) {
        super(n);
        this.c = c;
    }
    
    public final void a(final lpm lpm) {
        lpm.getClass();
        this.c = ((l8m)lpm).c;
    }
    
    public final lpm b() {
        return this.c(g8m.h().g());
    }
    
    public final lpm c(final long n) {
        return new l8m(this.c, n);
    }
}
