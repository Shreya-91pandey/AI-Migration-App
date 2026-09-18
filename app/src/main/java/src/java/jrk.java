public final class jrk
{
    public final int a;
    public final int b;
    
    public jrk(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof jrk) {
                final jrk jrk = (jrk)o;
                if (this.a == jrk.a) {
                    if (this.b == jrk.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return ge9.D(this.b) + ge9.D(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SelectionWedgeAffinity(startAffinity=");
        sb.append(ybp.o(this.a));
        sb.append(", endAffinity=");
        sb.append(ybp.o(this.b));
        sb.append(")");
        return sb.toString();
    }
}
