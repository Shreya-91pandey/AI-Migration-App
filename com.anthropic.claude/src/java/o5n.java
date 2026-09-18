public abstract class o5n implements b3k
{
    public final vsa v;
    public final String w;
    public boolean x;
    
    public o5n(final vsa v, final String w) {
        this.v = v;
        this.w = w;
    }
    
    public final void c() {
        if (!this.x) {
            return;
        }
        tiq.l(21, "statement is closed");
        throw null;
    }
    
    @Override
    public void o() {
        this.c();
    }
    
    @Override
    public void reset() {
        this.c();
    }
}
