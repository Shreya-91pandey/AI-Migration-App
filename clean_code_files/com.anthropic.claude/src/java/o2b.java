public final class o2b implements s2b
{
    public final pj0 a;
    
    public o2b(final pj0 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof o2b && mlc.q((Object)this.a, (Object)((o2b)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Failure(failure=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
