public final class bi2
{
    public final float a;
    public final cam b;
    
    public bi2(final float a, final cam b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof bi2) {
                final bi2 bi2 = (bi2)o;
                if (qs8.e(this.a, bi2.a)) {
                    if (this.b.equals((Object)bi2.b)) {
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
        return this.b.hashCode() + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final String f = qs8.f(this.a);
        final StringBuilder sb = new StringBuilder("BorderStroke(width=");
        sb.append(f);
        sb.append(", brush=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
