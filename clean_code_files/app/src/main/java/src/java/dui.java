public final class dui implements m0m
{
    public final xzl v;
    
    public dui(final xzl v) {
        this.v = v;
    }
    
    @Override
    public final Object c(final f07 f07) {
        return this.v;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof dui) {
                if (this.v.equals(((dui)o).v)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RealSizeResolver(size=");
        sb.append((Object)this.v);
        sb.append(")");
        return sb.toString();
    }
}
