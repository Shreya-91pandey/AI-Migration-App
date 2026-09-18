public final class ad3 extends h07
{
    public Object v;
    public final bd3 w;
    public int x;
    
    public ad3(final bd3 w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        this.w.Y(null, this);
        return pc7.v;
    }
}
