final class ikg extends ogf
{
    @Override
    public final hgf create() {
        final v98 v98 = new v98();
        ((jkg)v98).L = null;
        return v98;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ikg)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
    
    @Override
    public final void update(final hgf hgf) {
        final jkg jkg = (jkg)hgf;
        final t98 l = jkg.L;
        if (l != null) {
            jkg.p1(l);
        }
        jkg.L = null;
        jkg.L = null;
    }
}
