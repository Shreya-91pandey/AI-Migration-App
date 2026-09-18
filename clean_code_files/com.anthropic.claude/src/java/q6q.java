public final class q6q extends h07
{
    public Object v;
    public final r6q w;
    public int x;
    
    public q6q(final r6q w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(this);
    }
}
