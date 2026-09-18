public final class p8m extends lpm
{
    public Object c;
    
    public p8m(final long n, final Object c) {
        super(n);
        this.c = c;
    }
    
    public final void a(final lpm lpm) {
        lpm.getClass();
        this.c = ((p8m)lpm).c;
    }
    
    public final lpm b() {
        return new p8m(g8m.h().g(), this.c);
    }
    
    public final lpm c(final long n) {
        return new p8m(n, this.c);
    }
}
