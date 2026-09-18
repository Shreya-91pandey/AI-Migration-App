public final class tca extends h07
{
    public rca v;
    public boolean w;
    public Object x;
    public final vca y;
    public int z;
    
    public tca(final vca y, final h07 h07) {
        this.y = y;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object x) {
        this.x = x;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(null, this);
    }
}
