public final class mw1 extends h07
{
    public Object v;
    public Object w;
    public Object x;
    public final muj y;
    public int z;
    
    public mw1(final muj y, final h07 h07) {
        this.y = y;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object x) {
        this.x = x;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(null, this);
    }
}
