public final class lld extends mld
{
    public final nt7 a;
    
    public lld(final nt7 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && lld.class == o.getClass() && this.a.equals(((lld)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + lld.class.getName().hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Success {mOutputData=");
        sb.append((Object)this.a);
        sb.append('}');
        return sb.toString();
    }
}
