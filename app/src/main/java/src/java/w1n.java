public enum w1n
{
    public static final w1n[] A;
    
    w("FREE", 0, "free"), 
    x("PRO", 1, "pro"), 
    y("MAX", 2, "max"), 
    z("RAVEN", 3, "raven");
    
    public final String v;
    
    public w1n(final String s, final int n, final String v) {
        this.v = v;
    }
    
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
}
