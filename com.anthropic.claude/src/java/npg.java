public abstract class npg extends ppg
{
    public final float a;
    public final byte b;
    public final byte c;
    
    public npg(final int n, final float a) {
        this.a = a;
        this.b = (byte)n;
        this.c = (byte)n;
    }
    
    @Override
    public final int b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof npg) {
                final npg npg = (npg)o;
                if (qs8.e(this.a, npg.a) && ejq.v((int)this.c, (int)npg.c)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return ejq.z((int)this.c) + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return hia.k("PaneExpansionAnchor(Offset = ", qs8.f(this.a), ")");
    }
}
