import java.util.Map;

public final class ze0 extends qxc implements bua
{
    public final lta w;
    public final efo x;
    
    public ze0(final lta w, final efo x) {
        this.w = w;
        this.x = x;
        super(3);
    }
    
    @Override
    public final Object h(final Object o, Object value, final Object o2) {
        final ooe ooe = (ooe)o;
        final o8h u = ((goe)value).u(((gv6)o2).a);
        long n = 0L;
        Label_0095: {
            if (((flc)ooe).r0()) {
                value = this.x.d.getValue();
                if (!(boolean)this.w.b(value)) {
                    n = 0L;
                    break Label_0095;
                }
            }
            n = ((long)u.v << 32 | ((long)u.w & 0xFFFFFFFFL));
        }
        final int n2 = (int)(n >> 32);
        final int n3 = (int)(0xFFFFFFFFL & n);
        value = new ye0(u, (byte)0);
        return ooe.Y(n2, n3, (Map)s89.v, (lta)value);
    }
}
