public final class ow1 extends h07
{
    public int A;
    public Object v;
    public Object w;
    public int x;
    public Object y;
    public final muj z;
    
    public ow1(final muj z, final h07 h07) {
        this.z = z;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object y) {
        this.y = y;
        this.A |= Integer.MIN_VALUE;
        return this.z.d(null, this);
    }
}
