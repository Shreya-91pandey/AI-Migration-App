public final class sig extends k8e
{
    public final lvj e;
    public final g90 f;
    
    public sig(final lvj e) {
        this.e = e;
        g90 f;
        if (!t08.U(e)) {
            final g90 a = j90.a();
            g90.e(a, e);
            f = a;
        }
        else {
            f = null;
        }
        this.f = f;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof sig) {
                if (this.e.equals(((sig)o).e)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return this.e.hashCode();
    }
    
    public final k2j u() {
        final lvj e = this.e;
        return new k2j(e.a, e.b, e.c, e.d);
    }
}
