public final class vug extends h07
{
    public String v;
    public lta w;
    public Object x;
    public final xug y;
    public int z;
    
    public vug(final xug y, final h07 h07) {
        this.y = y;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object x) {
        this.x = x;
        this.z |= Integer.MIN_VALUE;
        return this.y.b(null, null, this);
    }
}
