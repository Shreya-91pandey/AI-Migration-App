public final class kjh
{
    public final String a;
    
    public kjh(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof kjh && mlc.q((Object)this.a, (Object)((kjh)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
