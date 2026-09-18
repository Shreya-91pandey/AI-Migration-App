final class eln extends ogf
{
    public final mnn v;
    
    public eln(final mnn v) {
        this.v = v;
    }
    
    public final hgf create() {
        return new fln(this.v);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof eln && mlc.q((Object)this.v, (Object)((eln)o).v));
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        final fln fln = (fln)hgf;
        fln.getClass();
        final mnn f = k8e.F(this.v, soh.L((t98)fln).V);
        fln.o1(f, (tna)uoo.z((zl6)fln, (sei)hm6.k));
        final dln l = fln.L;
        if (l != null) {
            dln.a(l, null, null, f, 23);
            soh.L((t98)fln).R();
            return;
        }
        throw hia.s("Min size state is not set.");
    }
}
