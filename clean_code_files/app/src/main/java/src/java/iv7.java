public final class iv7 extends h07
{
    public boolean v;
    public m6n w;
    public Object x;
    public final rv7 y;
    public int z;
    
    public iv7(final rv7 y, final h07 h07) {
        this.y = y;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object x) {
        this.x = x;
        this.z |= Integer.MIN_VALUE;
        return this.y.f(false, null, this);
    }
}
