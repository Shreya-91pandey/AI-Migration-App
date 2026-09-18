public final class xzl
{
    public static final xzl c;
    public final kl8 a;
    public final kl8 b;
    
    static {
        final il8 a = il8.a;
        c = new xzl(a, a);
    }
    
    public xzl(final kl8 a, final kl8 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof xzl) {
                final xzl xzl = (xzl)o;
                if (this.a.equals(xzl.a)) {
                    if (this.b.equals(xzl.b)) {
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
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Size(width=");
        sb.append((Object)this.a);
        sb.append(", height=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
