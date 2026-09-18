public final class fv7 extends h07
{
    public boolean v;
    public vom w;
    public Object x;
    public final rv7 y;
    public int z;
    
    public fv7(final rv7 y, final f07 f07) {
        this.y = y;
        super(f07);
    }
    
    public final Object invokeSuspend(final Object x) {
        this.x = x;
        this.z |= Integer.MIN_VALUE;
        return this.y.e(false, (f07)this);
    }
}
