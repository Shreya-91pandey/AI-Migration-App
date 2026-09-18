public final class a1e extends mlc
{
    public final le g;
    
    public a1e(final le g) {
        this.g = g;
    }
    
    @Override
    public final void Q(final Object o, final cvj cvj) {
        final pe a = this.g.a;
        if (a != null) {
            a.Q(o, cvj);
            return;
        }
        en9.q("Launcher has not been initialized");
    }
}
