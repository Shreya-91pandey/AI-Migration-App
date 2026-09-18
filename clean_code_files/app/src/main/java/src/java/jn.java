public final class jn
{
    public final int a;
    public final wn b;
    
    public jn(final int a, final wn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jn)) {
            return false;
        }
        final jn jn = (jn)o;
        return this.a == jn.a && this.b == jn.b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Stamped(gen=");
        sb.append(this.a);
        sb.append(", result=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
