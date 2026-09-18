public final class dgh extends h07
{
    public boolean v;
    public aof w;
    public Object x;
    public final lgh y;
    public int z;
    
    public dgh(final lgh y, final h07 h07) {
        this.y = y;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object x) {
        this.x = x;
        this.z |= Integer.MIN_VALUE;
        return this.y.f(false, this);
    }
}
