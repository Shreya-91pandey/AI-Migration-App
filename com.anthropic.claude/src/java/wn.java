public enum wn
{
    A("Declared", 5), 
    B("Unknown", 6), 
    C("RetryableError", 7), 
    D("Skipped", 8);
    
    public static final wn[] E;
    
    v("Loading", 0), 
    w("Verified", 1), 
    x("Supervised", 2), 
    y("DeclaredAdult", 3), 
    z("DeclaredMinor", 4);
    
    public final boolean a() {
        return this == wn.x || this == wn.z;
    }
}
