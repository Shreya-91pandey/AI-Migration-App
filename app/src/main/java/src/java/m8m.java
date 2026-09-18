public final class m8m extends lpm
{
    public int c;
    
    public m8m(final long n, final int c) {
        super(n);
        this.c = c;
    }
    
    public final void a(final lpm lpm) {
        lpm.getClass();
        this.c = ((m8m)lpm).c;
    }
    
    public final lpm b() {
        return this.c(g8m.h().g());
    }
    
    public final lpm c(final long n) {
        return new m8m(n, this.c);
    }
}
