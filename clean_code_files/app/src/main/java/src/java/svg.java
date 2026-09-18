public final class svg extends gwg
{
    public final float c;
    public final float d;
    
    public svg(final float c, final float d) {
        super(3);
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof svg)) {
            return false;
        }
        final svg svg = (svg)o;
        return Float.compare(this.c, svg.c) == 0 && Float.compare(this.d, svg.d) == 0;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.d) + Float.hashCode(this.c) * 31;
    }
    
    @Override
    public final String toString() {
        return ge9.s("MoveTo(x=", this.c, ", y=", this.d, ")");
    }
}
