public final class kvi extends ogf
{
    public final lvi v;
    
    public kvi(final lvi v) {
        this.v = v;
    }
    
    @Override
    public final hgf create() {
        return new mvi(this.v);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kvi && mlc.q(this.v, ((kvi)o).v));
    }
    
    @Override
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ReceiveContentElement(receiveContentListener=");
        sb.append((Object)this.v);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public final void update(final hgf hgf) {
        ((mvi)hgf).L = this.v;
    }
}
