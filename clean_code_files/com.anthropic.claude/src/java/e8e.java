public final class e8e
{
    public final r86 a;
    public final tno b;
    public final eql c;
    public final xhf d;
    
    public e8e(final r86 a, final tno b, final eql c, final xhf d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && e8e.class == o.getClass()) {
            final e8e e8e = (e8e)o;
            return mlc.q((Object)this.a, (Object)e8e.a) && mlc.q((Object)this.b, (Object)e8e.b) && mlc.q((Object)this.c, (Object)e8e.c) && mlc.q((Object)this.d, (Object)e8e.d);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Values(colorScheme=");
        sb.append((Object)this.a);
        sb.append(", typography=");
        sb.append((Object)this.b);
        sb.append(", shapes=");
        sb.append((Object)this.c);
        sb.append(", motionScheme=");
        sb.append((Object)this.d);
        sb.append(")");
        return sb.toString();
    }
}
