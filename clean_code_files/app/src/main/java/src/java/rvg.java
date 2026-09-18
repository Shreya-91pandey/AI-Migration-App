public final class rvg extends gwg
{
    public final float c;
    public final float d;
    
    public rvg(final float c, final float d) {
        super(3);
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rvg)) {
            return false;
        }
        final rvg rvg = (rvg)o;
        return Float.compare(this.c, rvg.c) == 0 && Float.compare(this.d, rvg.d) == 0;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.d) + Float.hashCode(this.c) * 31;
    }
    
    @Override
    public final String toString() {
        return ge9.s("LineTo(x=", this.c, ", y=", this.d, ")");
    }
}
