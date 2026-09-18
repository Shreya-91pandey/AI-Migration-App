public final class ud0 extends qxc implements zta
{
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final bua E;
    public final byte w;
    public final efo x;
    public final lta y;
    public final igf z;
    
    public ud0(final efo x, final igf z, final lta y, final gx d, final lta b, final lta c, final ye6 e, final int a) {
        this.w = 0;
        this.x = x;
        this.z = z;
        this.y = y;
        this.D = d;
        this.B = b;
        this.C = c;
        this.E = (bua)e;
        this.A = a;
        super(2);
    }
    
    public ud0(final efo x, final lta y, final igf z, final id9 b, final ev9 c, final zta d, final bua e, final int a) {
        this.w = 1;
        this.x = x;
        this.y = y;
        this.z = z;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.A = a;
        super(2);
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final int a2 = this.A;
        final Object d = this.D;
        final Object c = this.C;
        final Object b = this.B;
        switch (w) {
            default: {
                final gva gva = (gva)o;
                ((Number)o2).intValue();
                ljq.a(this.x, this.y, this.z, (id9)b, (ev9)c, (zta)d, this.E, gva, ri2.K0(a2 | 0x1));
                return a;
            }
            case 0: {
                final gva gva2 = (gva)o;
                ((Number)o2).intValue();
                vt4.c(this.x, this.z, this.y, (gx)d, (lta)b, (lta)c, (ye6)this.E, gva2, ri2.K0(a2 | 0x1));
                return a;
            }
        }
    }
}
