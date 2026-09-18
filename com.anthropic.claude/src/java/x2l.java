public final class x2l extends h07
{
    public ux4 v;
    public rdk w;
    public Object x;
    public final p3 y;
    public int z;
    
    public x2l(final p3 y, final h07 h07) {
        this.y = y;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(Object r) {
        this.x = r;
        this.z |= Integer.MIN_VALUE;
        r = this.y.r((ux4)null, (String)null, (String)null, (h07)this);
        if (r == pc7.v) {
            return r;
        }
        final odk odk = (odk)r;
        if (odk != null) {
            return new ndk(odk);
        }
        return null;
    }
}
