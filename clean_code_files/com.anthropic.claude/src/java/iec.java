final class iec extends ogf
{
    public final d1q v;
    
    public iec(final d1q v) {
        this.v = v;
    }
    
    public final hgf create() {
        return new kec(this.v);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof iec && mlc.q((Object)((iec)o).v, (Object)this.v));
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        final kec kec = (kec)hgf;
        final d1q l = kec.L;
        final d1q v = this.v;
        if (!mlc.q((Object)v, (Object)l)) {
            kec.L = v;
            kec.p1();
        }
    }
}
