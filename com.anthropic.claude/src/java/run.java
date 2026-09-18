public final class run implements sqg
{
    public final mun v;
    public efo w;
    public tze x;
    
    public run(final mun v) {
        this.v = v;
    }
    
    @Override
    public final efo a() {
        final efo w = this.w;
        if (w != null) {
            return w;
        }
        mlc.j0("scaffoldStateTransition");
        throw null;
    }
    
    @Override
    public final float b() {
        final tze x = this.x;
        if (x == null) {
            mlc.j0("transitionState");
            throw null;
        }
        final tun tun = (tun)((zmk)x.w).y.getValue();
        final tze x2 = this.x;
        if (x2 == null) {
            mlc.j0("transitionState");
            throw null;
        }
        if (mlc.q((Object)tun, (Object)x2.j())) {
            return 1.0f;
        }
        final tze x3 = this.x;
        if (x3 != null) {
            return ((zmk)x3.w).E.h();
        }
        mlc.j0("transitionState");
        throw null;
    }
    
    @Override
    public final mun g() {
        return this.v;
    }
}
