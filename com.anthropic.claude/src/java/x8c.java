public final class x8c implements xom
{
    public boolean A;
    public boolean B;
    public long C;
    public final z8c D;
    public Number v;
    public Number w;
    public final elo x;
    public final ksg y;
    public jcn z;
    
    public x8c(final z8c d, final Number v, final Number w, final elo x, final w8c w8c) {
        this.D = d;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = o50.Q(v);
        this.z = new jcn(w8c, x, this.v, this.w, null);
    }
    
    @Override
    public final Object getValue() {
        return this.y.getValue();
    }
}
