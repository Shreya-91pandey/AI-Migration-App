public final class w8c implements cg0
{
    public final mz8 a;
    public final int b;
    public final long c;
    
    public w8c(final mz8 a, final int b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a instanceof alo) {
            final alo alo = (alo)a;
            if (alo.a != 0) {
                return;
            }
            if (alo.b != 0) {
                return;
            }
        }
        else if (a instanceof p7m) {
            if (((p7m)a).a != 0) {
                return;
            }
        }
        else {
            if (!(a instanceof qvc)) {
                return;
            }
            if (((qvc)a).a.a != 0) {
                return;
            }
        }
        en9.s("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }
    
    @Override
    public final o6p a(final dlo dlo) {
        return new e0k(this.a.a(dlo), this.b, this.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof w8c) {
            final w8c w8c = (w8c)o;
            if (mlc.q(w8c.a, this.a) && w8c.b == this.b && w8c.c == this.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.c) + hia.b(this.b, this.a.hashCode() * 31, 31);
    }
}
