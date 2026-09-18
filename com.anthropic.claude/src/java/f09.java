public final class f09 implements a6p
{
    public final ksg a;
    
    public f09(final ksg a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final e3h e3h) {
        return this.a.getValue();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof f09 && this.a == ((f09)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DynamicValueHolder(state=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
