public final class dvg implements ep6
{
    public final v2k v;
    public final String w;
    public final zta x;
    public final l7n y;
    
    public dvg(final v2k v, final String w, final zta x) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = new l7n((jta)new lce((Object)this, (byte)10));
    }
    
    public final void close() {
        final l7n y = this.y;
        if (y.b()) {
            ((AutoCloseable)y.getValue()).close();
        }
    }
    
    @Override
    public final Object h(final boolean b, final zta zta, final h07 h07) {
        final zug zug = (zug)((f07)h07).getContext().M0((gc7)zug.w);
        xug v;
        if (zug != null) {
            v = zug.v;
        }
        else {
            v = null;
        }
        if (v != null) {
            return zta.d((Object)v, (Object)h07);
        }
        final xug xug = new xug(this.x, (t2k)this.y.getValue());
        return rhc.f0((hc7)new zug(xug), (zta)new frd((Object)zta, (Object)xug, (f07)null, (byte)6), (f07)h07);
    }
}
