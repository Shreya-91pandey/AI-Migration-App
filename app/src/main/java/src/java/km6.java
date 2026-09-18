public final class km6 implements a6p
{
    public final lta a;
    
    public km6(final lta a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final e3h e3h) {
        return this.a.b((Object)e3h);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof km6 && mlc.q((Object)this.a, (Object)((km6)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ComputedValueHolder(compute=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
