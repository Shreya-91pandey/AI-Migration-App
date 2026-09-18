public final class mtl extends qxc implements bua
{
    public final ye6 w;
    
    public mtl(final ye6 w) {
        this.w = w;
        super(3);
    }
    
    @Override
    public final Object h(Object z, Object o, final Object o2) {
        final cyd cyd = (cyd)z;
        final gva gva = (gva)o;
        ((Number)o2).intValue();
        o = gva.R();
        final cib a = bi6.a;
        z = o;
        if (o == a) {
            z = mlc.z((hc7)o89.v, gva);
            gva.q0(z);
        }
        final oc7 oc7 = (oc7)z;
        o = gva.R();
        if ((z = o) == a) {
            z = new itl(cyd, oc7);
            gva.q0(z);
        }
        final itl itl = (itl)z;
        z = new otl(itl);
        this.w.m((Object)itl, z, (Object)gva, (Object)6);
        return lqo.a;
    }
}
