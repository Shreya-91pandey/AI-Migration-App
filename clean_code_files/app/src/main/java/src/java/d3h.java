public final class d3h extends k3h
{
    public e3h B;
    
    @Override
    public final /* bridge */ boolean containsKey(final Object o) {
        return o instanceof sei && super.containsKey(o);
    }
    
    public final /* bridge */ boolean containsValue(final Object o) {
        return o instanceof a6p && super.containsValue((Object)o);
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
    
    public final e3h n() {
        final fgo x = super.x;
        g3h b = this.B;
        if (x != b.v) {
            super.w = new eup((byte)18);
            b = new g3h(super.x, super.A);
        }
        return this.B = (e3h)b;
    }
    
    @Override
    public final /* bridge */ Object remove(final Object o) {
        if (!(o instanceof sei)) {
            return null;
        }
        return super.remove(o);
    }
}
