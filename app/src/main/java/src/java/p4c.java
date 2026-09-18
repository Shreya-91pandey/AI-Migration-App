public final class p4c
{
    public final o4c a;
    public final int b;
    
    public p4c(final o4c a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof p4c) {
                final p4c p4c = (p4c)o;
                if (this.a.equals((Object)p4c.a)) {
                    if (this.b == p4c.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append((Object)this.a);
        sb.append(", configFlags=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
