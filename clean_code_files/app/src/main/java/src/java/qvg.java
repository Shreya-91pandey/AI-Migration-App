public final class qvg extends gwg
{
    public final float c;
    
    public qvg(final float c) {
        super(3);
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof qvg && Float.compare(this.c, ((qvg)o).c) == 0);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.c);
    }
    
    @Override
    public final String toString() {
        return tj0.j("HorizontalTo(x=", this.c, ")");
    }
}
