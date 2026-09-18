public enum bna
{
    v("Active", 0), 
    w("ActiveParent", 1), 
    x("Inactive", 3);
    
    public static final bna[] y;
    
    public final boolean a() {
        final int ordinal = this.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        en9.r();
        return false;
    }
    
    public final boolean b() {
        final int ordinal = this.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return true;
                }
                if (ordinal != 3) {
                    en9.r();
                    return false;
                }
            }
            return false;
        }
        return true;
    }
}
