public final class l2b extends h07
{
    public Object v;
    public final n2b w;
    public int x;
    
    public l2b(final n2b w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        return this.w.b(this);
    }
}
