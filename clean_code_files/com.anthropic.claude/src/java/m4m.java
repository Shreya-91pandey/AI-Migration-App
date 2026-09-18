public final class m4m
{
    public final lta a;
    public final bfa b;
    
    public m4m(final bfa b, final lta a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m4m)) {
            return false;
        }
        final m4m m4m = (m4m)o;
        return mlc.q(this.a, m4m.a) && mlc.q(this.b, m4m.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Slide(slideOffset=");
        sb.append((Object)this.a);
        sb.append(", animationSpec=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
