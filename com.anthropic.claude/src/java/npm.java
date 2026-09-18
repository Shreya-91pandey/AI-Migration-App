public final class npm extends lpm
{
    public n4h c;
    public int d;
    
    public npm(final long n, final n4h c) {
        super(n);
        this.c = c;
    }
    
    public final void a(final lpm lpm) {
        final Object c = r9n.c;
        synchronized (c) {
            lpm.getClass();
            this.c = ((npm)lpm).c;
            this.d = ((npm)lpm).d;
        }
    }
    
    public final lpm b() {
        return new npm(g8m.h().g(), this.c);
    }
    
    public final lpm c(final long n) {
        return new npm(n, this.c);
    }
}
