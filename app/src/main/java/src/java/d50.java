public final class d50 extends h07
{
    public klf v;
    public en2 w;
    public Object x;
    public final f50 y;
    public int z;
    
    public d50(final f50 y, final h07 h07) {
        this.y = y;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object x) {
        this.x = x;
        this.z |= Integer.MIN_VALUE;
        return this.y.l(this);
    }
}
