public final class oeo extends h07
{
    public Object v;
    public final peo w;
    public int x;
    
    public oeo(final peo w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        this.w.b(null, this);
        return pc7.v;
    }
}
