public final class ygm implements bfa
{
    public final float a;
    public final float b;
    public final Object c;
    
    public ygm(final float a, final float b, final Object c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ygm) {
            final ygm ygm = (ygm)o;
            if (ygm.a == this.a && ygm.b == this.b && mlc.q(ygm.c, this.c)) {
                return true;
            }
        }
        return false;
    }
    
    public final gfk f(final dlo dlo) {
        final Object c = this.c;
        ig0 ig0;
        if (c == null) {
            ig0 = null;
        }
        else {
            ig0 = (ig0)dlo.a().b(c);
        }
        return new gfk(this.a, this.b, ig0);
    }
    
    @Override
    public final int hashCode() {
        final Object c = this.c;
        int hashCode;
        if (c != null) {
            hashCode = c.hashCode();
        }
        else {
            hashCode = 0;
        }
        return Float.hashCode(this.b) + oz1.d(this.a, hashCode * 31, 31);
    }
}
