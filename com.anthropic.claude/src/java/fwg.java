public final class fwg extends gwg
{
    public final float c;
    
    public fwg(final float c) {
        super(3);
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fwg && Float.compare(this.c, ((fwg)o).c) == 0);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.c);
    }
    
    @Override
    public final String toString() {
        return tj0.j("VerticalTo(y=", this.c, ")");
    }
}
