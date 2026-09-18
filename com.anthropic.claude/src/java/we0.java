public final class we0 extends qxc implements zta
{
    public final String A;
    public final bua B;
    public final int C;
    public final byte D;
    public final boolean w;
    public final igf x;
    public final id9 y;
    public final ev9 z;
    
    public we0(final boolean w, final igf x, final id9 y, final ev9 z, final String a, final bua b, final int c, final int d) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = (byte)d;
        super(2);
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        final gva gva = (gva)o;
        ((Number)o2).intValue();
        ljq.h(this.w, this.x, this.y, this.z, this.A, this.B, gva, ri2.K0(this.C | 0x1), this.D);
        return lqo.a;
    }
}
