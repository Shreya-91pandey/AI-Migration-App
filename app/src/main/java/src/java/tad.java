public enum tad
{
    public static final tad[] A;
    
    v("DESTROYED", 0), 
    w("INITIALIZED", 1), 
    x("CREATED", 2), 
    y("STARTED", 3), 
    z("RESUMED", 4);
    
    public final boolean a(final tad tad) {
        return this.compareTo((Enum)tad) >= 0;
    }
}
