public final class gq7 extends q4r
{
    public final lb2 b;
    
    public gq7(final lb2 b) {
        this.b = b;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof gq7 && mlc.q((Object)this.b, (Object)((gq7)o).b));
    }
    
    public final int g(final int n, final int n2, final qzc qzc, final o8h o8h, final int n3) {
        return this.b.a(n2, n);
    }
    
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("VerticalCrossAxisAlignment(vertical=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
