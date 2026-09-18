public enum f3g
{
    A("CODE", 2, "bogosort", (lta)new e3g((byte)6), (zta)new rg6((byte)27)), 
    B("CODE_REQUIRES_ACTION", 3, "code_requires_action", (lta)new e3g((byte)1), (zta)new rg6((byte)21)), 
    C("DISPATCH", 4, "dispatch", (lta)new e3g((byte)2), (zta)new rg6((byte)22)), 
    D("MARKETING", 5, "marketing", (lta)new e3g((byte)3), (zta)new rg6((byte)23)), 
    E("ROUTINES", 6, "routines", (lta)new e3g((byte)4), (zta)new rg6((byte)24));
    
    public static final f3g[] F;
    public static final td9 G;
    
    y("COMPLETION", 0, "completion", (lta)new e3g((byte)0), (zta)new rg6((byte)25)), 
    z("COMPASS", 1, "compass", (lta)new e3g((byte)5), (zta)new rg6((byte)26));
    
    public final String v;
    public final lta w;
    public final zta x;
    
    public f3g(final String s, final int n, final String v, final lta w, final zta x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
}
