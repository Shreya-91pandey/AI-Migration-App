public final class e3h extends g3h implements bm6
{
    public static final e3h y;
    
    static {
        y = (e3h)new g3h(fgo.e, 0);
    }
    
    @Override
    public final /* bridge */ boolean containsKey(final Object o) {
        return o instanceof sei && super.containsKey(o);
    }
    
    @Override
    public final /* bridge */ boolean containsValue(final Object o) {
        return o instanceof a6p && super.containsValue(o);
    }
    
    @Override
    public final k3h g() {
        final k3h k3h = new k3h(this);
        ((d3h)k3h).B = this;
        return k3h;
    }
    
    @Override
    public final /* bridge */ Object get(final Object o) {
        if (!(o instanceof sei)) {
            return null;
        }
        return super.get(o);
    }
    
    public final /* bridge */ Object getOrDefault(final Object o, final Object o2) {
        if (!(o instanceof sei)) {
            return o2;
        }
        return super.getOrDefault((Object)o, (Object)o2);
    }
    
    public final k3h j() {
        final k3h k3h = new k3h(this);
        ((d3h)k3h).B = this;
        return k3h;
    }
    
    public final e3h n(final sei sei, final a6p a6p) {
        final ci6 u = super.v.u(sei.hashCode(), 0, sei, a6p);
        if (u == null) {
            return this;
        }
        return (e3h)new g3h((fgo)u.b, super.w + (u.a ? 1 : 0));
    }
}
