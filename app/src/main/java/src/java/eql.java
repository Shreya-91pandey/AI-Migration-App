public final class eql
{
    public final nvj a;
    public final nvj b;
    public final nvj c;
    public final nvj d;
    public final nvj e;
    public final nvj f;
    public final nvj g;
    public final nvj h;
    public bv8 i;
    
    public eql() {
        final nvj a = cql.a;
        final nvj b = cql.b;
        final nvj c = cql.c;
        final nvj d = cql.d;
        final nvj f = cql.f;
        final nvj e = cql.e;
        final nvj g = cql.g;
        final nvj h = cql.h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = f;
        this.f = e;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof eql)) {
            return false;
        }
        final eql eql = (eql)o;
        return mlc.q((Object)this.a, (Object)eql.a) && mlc.q((Object)this.b, (Object)eql.b) && mlc.q((Object)this.c, (Object)eql.c) && mlc.q((Object)this.d, (Object)eql.d) && mlc.q((Object)this.e, (Object)eql.e) && mlc.q((Object)this.f, (Object)eql.f) && mlc.q((Object)this.g, (Object)eql.g) && mlc.q((Object)this.h, (Object)eql.h);
    }
    
    @Override
    public final int hashCode() {
        return this.h.hashCode() + (this.g.hashCode() + (this.f.hashCode() + (this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31) * 31) * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Shapes(extraSmall=");
        sb.append((Object)this.a);
        sb.append(", small=");
        sb.append((Object)this.b);
        sb.append(", medium=");
        sb.append((Object)this.c);
        sb.append(", large=");
        sb.append((Object)this.d);
        sb.append(", largeIncreased=");
        sb.append((Object)this.f);
        sb.append(", extraLarge=");
        sb.append((Object)this.e);
        sb.append(", extralargeIncreased=");
        sb.append((Object)this.g);
        sb.append(", extraExtraLarge=");
        sb.append((Object)this.h);
        sb.append(")");
        return sb.toString();
    }
}
