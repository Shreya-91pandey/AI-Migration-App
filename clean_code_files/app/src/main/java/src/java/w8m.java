public final class w8m extends lpm
{
    public g3h c;
    public int d;
    
    public w8m(final long n, final g3h c) {
        super(n);
        this.c = c;
    }
    
    public final void a(final lpm lpm) {
        lpm.getClass();
        final w8m w8m = (w8m)lpm;
        final Object b = twl.B;
        synchronized (b) {
            this.c = w8m.c;
            this.d = w8m.d;
        }
    }
    
    public final lpm b() {
        return new w8m(g8m.h().g(), this.c);
    }
    
    public final lpm c(final long n) {
        return new w8m(n, this.c);
    }
}
