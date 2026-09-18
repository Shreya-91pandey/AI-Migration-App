final class fw8 extends ogf
{
    public final lta v;
    
    public fw8(final lta v) {
        this.v = v;
    }
    
    public final hgf create() {
        return new lv2(new nv2(), this.v);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fw8 && this.v == ((fw8)o).v);
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        final lv2 lv2 = (lv2)hgf;
        lv2.L = this.v;
        lv2.o1();
    }
}
