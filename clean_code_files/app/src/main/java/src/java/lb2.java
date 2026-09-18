public final class lb2
{
    public final float a;
    
    public lb2(final float a) {
        this.a = a;
    }
    
    public final int a(final int n, final int n2) {
        return Math.round((1.0f + this.a) * ((n2 - n) / 2.0f));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof lb2 && Float.compare(this.a, ((lb2)o).a) == 0);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return tj0.j("Vertical(bias=", this.a, ")");
    }
}
