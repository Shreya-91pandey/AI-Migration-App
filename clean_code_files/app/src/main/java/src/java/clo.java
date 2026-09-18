public final class clo implements bqg
{
    public final oun a;
    public final oun b;
    
    public clo(final oun a, final oun b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        clo clo;
        if (o instanceof clo) {
            clo = (clo)o;
        }
        else {
            clo = null;
        }
        return clo != null && (this.a == clo.a && this.b == clo.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
}
