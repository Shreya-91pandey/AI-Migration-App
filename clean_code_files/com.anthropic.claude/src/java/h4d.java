public final class h4d implements xom
{
    public final byte v;
    public final short w;
    public final ksg x;
    public int y;
    
    public h4d(final int y, final int v, final int w) {
        this.v = (byte)v;
        this.w = (short)w;
        final int n = y / v * v;
        this.x = new ksg((Object)ncq.T(Math.max(n - w, 0), n + v + w), (q8m)def.D);
        this.y = y;
    }
    
    public final void a(int w) {
        if (w != this.y) {
            this.y = w;
            final byte v = this.v;
            final int n = w / v * v;
            w = this.w;
            this.x.setValue((Object)ncq.T(Math.max(n - w, 0), n + v + w));
        }
    }
    
    public final Object getValue() {
        return this.x.getValue();
    }
}
