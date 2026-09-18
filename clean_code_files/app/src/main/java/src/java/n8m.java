public final class n8m extends lpm
{
    public long c;
    
    public n8m(final long n, final long c) {
        super(n);
        this.c = c;
    }
    
    public final void a(final lpm lpm) {
        lpm.getClass();
        this.c = ((n8m)lpm).c;
    }
    
    public final lpm b() {
        return this.c(g8m.h().g());
    }
    
    public final lpm c(final long n) {
        return new n8m(n, this.c);
    }
}
