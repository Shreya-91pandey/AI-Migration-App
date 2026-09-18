public final class bv8
{
    public final aql a;
    public final aql b;
    public final aql c;
    
    public bv8(final aql a, final aql b, final aql c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && o instanceof bv8) {
            final bv8 bv8 = (bv8)o;
            return mlc.q((Object)this.a, (Object)bv8.a) && mlc.q((Object)this.b, (Object)bv8.b) && mlc.q((Object)this.c, (Object)bv8.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
}
