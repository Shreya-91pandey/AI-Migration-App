public final class uc8
{
    public int a;
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof uc8 && this.a == ((uc8)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return oz1.n("DeltaCounter(count=", this.a, ")");
    }
}
