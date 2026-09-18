public final class kqg
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof kqg) {
            if (this.a == ((kqg)o).a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        String p;
        if (a == 0) {
            p = "Hidden";
        }
        else if (a == 1) {
            p = "Exiting";
        }
        else if (a == 2) {
            p = "Entering";
        }
        else if (a == 3) {
            p = "Shown";
        }
        else if (a == 5) {
            p = "ExitingModal";
        }
        else if (a == 6) {
            p = "EnteringModal";
        }
        else {
            p = smk.p(a, "Unknown value=");
        }
        return hia.k("PaneMotion.Type[", p, "]");
    }
}
