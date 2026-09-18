final class pl2 extends ogf
{
    public final rl2 v;
    
    public pl2(final rl2 v) {
        this.v = v;
    }
    
    public final hgf create() {
        return new sl2(this.v);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof pl2 && mlc.q((Object)this.v, (Object)((pl2)o).v));
    }
    
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final void update(final hgf hgf) {
        ((sl2)hgf).o1(this.v);
    }
}
