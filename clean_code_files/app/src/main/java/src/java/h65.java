public final class h65 implements k65
{
    public final String a;
    
    public h65(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof h65 && mlc.q((Object)this.a, (Object)((h65)o).a));
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("Published(host=", this.a, ")");
    }
}
