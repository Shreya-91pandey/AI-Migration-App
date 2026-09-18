public final class xy6
{
    public final ksg a;
    
    public xy6() {
        this.a = o50.Q(uy6.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof xy6 && mlc.q(((xy6)o).a.getValue(), this.a.getValue()));
    }
    
    @Override
    public final int hashCode() {
        return this.a.getValue().hashCode();
    }
    
    @Override
    public final String toString() {
        final wy6 wy6 = (wy6)this.a.getValue();
        final StringBuilder sb = new StringBuilder("ContextMenuState(status=");
        sb.append((Object)wy6);
        sb.append(")");
        return sb.toString();
    }
}
