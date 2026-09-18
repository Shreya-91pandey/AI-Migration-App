public final class p7m implements mz8
{
    public final byte a;
    
    public p7m(final int a) {
        this.a = (byte)a;
    }
    
    @Override
    public final q6p a(final dlo dlo) {
        return (q6p)new v6p((int)this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof p7m && ((p7m)o).a == this.a;
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
}
