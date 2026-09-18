public final class m0e extends h07
{
    public Object v;
    public final wb0 w;
    public int x;
    
    public m0e(final wb0 w, final f07 f07) {
        this.w = w;
        super(f07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        return this.w.b(false, (f07)this);
    }
}
