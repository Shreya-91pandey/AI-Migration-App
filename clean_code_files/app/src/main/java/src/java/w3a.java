public final class w3a
{
    public final float a;
    public final bfa b;
    
    public w3a(final float a, final bfa b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w3a)) {
            return false;
        }
        final w3a w3a = (w3a)o;
        return Float.compare(this.a, w3a.a) == 0 && mlc.q(this.b, w3a.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Fade(alpha=");
        sb.append(this.a);
        sb.append(", animationSpec=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
