public final class enf extends r1
{
    public final ksg x;
    public final ksg y;
    
    public enf(final Object o) {
        super((byte)5);
        this.x = o50.Q(o);
        this.y = o50.Q(o);
    }
    
    @Override
    public final Object i() {
        return this.x.getValue();
    }
    
    @Override
    public final Object k() {
        return this.y.getValue();
    }
    
    @Override
    public final void o(final Object value) {
        this.x.setValue(value);
    }
    
    public final boolean r() {
        return mlc.q(this.x.getValue(), this.y.getValue()) && !(boolean)((ksg)super.w).getValue();
    }
    
    public final void s(final Object value) {
        this.y.setValue(value);
    }
}
