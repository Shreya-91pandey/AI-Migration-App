public final class aak
{
    public final float a;
    public final long b;
    public final bfa c;
    
    public aak(final float a, final long b, final bfa c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof aak)) {
            return false;
        }
        final aak aak = (aak)o;
        return Float.compare(this.a, aak.a) == 0 && jeo.a(this.b, aak.b) && mlc.q(this.c, aak.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = Float.hashCode(this.a);
        final int c = jeo.c;
        return this.c.hashCode() + hia.d(hashCode * 31, this.b, 31);
    }
    
    @Override
    public final String toString() {
        final String b = jeo.b(this.b);
        final StringBuilder sb = new StringBuilder("Scale(scale=");
        sb.append(this.a);
        sb.append(", transformOrigin=");
        sb.append(b);
        sb.append(", animationSpec=");
        sb.append((Object)this.c);
        sb.append(")");
        return sb.toString();
    }
}
