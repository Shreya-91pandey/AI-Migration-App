public enum zx0
{
    public static final zx0[] A;
    public static final td9 B;
    
    y("Prod", 0, "prod", (oi0)mi0.g, "frame.claudeusercontent.com"), 
    z("Staging", 1, "staging", (oi0)ni0.g, "frame.staging.claudeusercontent.com");
    
    public final String v;
    public final oi0 w;
    public final String x;
    
    public zx0(final String s, final int n, final String v, final oi0 w, final String x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final String a() {
        return kym.g1(this.w.a(), "https://");
    }
}
