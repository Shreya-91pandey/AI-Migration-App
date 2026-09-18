public final class fgh extends h07
{
    public int A;
    public Object v;
    public Throwable w;
    public boolean x;
    public Object y;
    public final lgh z;
    
    public fgh(final lgh z, final f07 f07) {
        this.z = z;
        super(f07);
    }
    
    public final Object invokeSuspend(final Object y) {
        this.y = y;
        this.A |= Integer.MIN_VALUE;
        return this.z.h(null, null, (f07)this);
    }
}
