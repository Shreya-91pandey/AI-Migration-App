public final class lec implements dng
{
    public final d1q b;
    public final xc8 c;
    
    public lec(final d1q b, final xc8 c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final float a() {
        final d1q b = this.b;
        final xc8 c = this.c;
        return c.e0(b.c(c));
    }
    
    @Override
    public final float b(final qzc qzc) {
        final d1q b = this.b;
        final xc8 c = this.c;
        return c.e0(b.d(c, qzc));
    }
    
    @Override
    public final float c(final qzc qzc) {
        final d1q b = this.b;
        final xc8 c = this.c;
        return c.e0(b.b(c, qzc));
    }
    
    @Override
    public final float d() {
        final d1q b = this.b;
        final xc8 c = this.c;
        return c.e0(b.a(c));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lec)) {
            return false;
        }
        final lec lec = (lec)o;
        return mlc.q((Object)this.b, (Object)lec.b) && mlc.q((Object)this.c, (Object)lec.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + this.b.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("InsetsPaddingValues(insets=");
        sb.append((Object)this.b);
        sb.append(", density=");
        sb.append((Object)this.c);
        sb.append(")");
        return sb.toString();
    }
}
