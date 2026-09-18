public final class epm extends lpm
{
    public p2 c;
    public int d;
    public int e;
    
    public epm(final long n, final p2 c) {
        super(n);
        this.c = c;
    }
    
    public final void a(final lpm lpm) {
        final Object f = r6k.f;
        synchronized (f) {
            lpm.getClass();
            this.c = ((epm)lpm).c;
            this.d = ((epm)lpm).d;
            this.e = ((epm)lpm).e;
        }
    }
    
    public final lpm b() {
        return this.c(g8m.h().g());
    }
    
    public final lpm c(final long n) {
        return new epm(n, this.c);
    }
}
