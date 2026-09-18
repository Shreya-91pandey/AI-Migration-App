public final class t5q
{
    public String a;
    public x4q b;
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof t5q)) {
            return false;
        }
        final t5q t5q = (t5q)o;
        return mlc.q((Object)this.a, (Object)t5q.a) && this.b == t5q.b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("IdAndState(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append((Object)this.b);
        sb.append(')');
        return sb.toString();
    }
}
