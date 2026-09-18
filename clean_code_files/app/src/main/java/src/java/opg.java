public final class opg extends ppg
{
    public final float a;
    
    public opg(final float a) {
        this.a = a;
    }
    
    @Override
    public final String a(final r98 r98) {
        return r9n.G(r98, 2131757431, (int)(this.a * 100.0f));
    }
    
    @Override
    public final int c(final int n, final xc8 xc8) {
        return ncq.o(k8e.H(n * this.a), 0, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof opg && this.a == ((opg)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return tj0.j("PaneExpansionAnchor(Proportion = ", this.a, ")");
    }
}
