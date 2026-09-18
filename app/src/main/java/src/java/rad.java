public enum rad
{
    private static final sd9 $ENTRIES;
    private static final rad[] $VALUES;
    public static final pad Companion;
    
    ON_ANY("ON_ANY", 6), 
    ON_CREATE("ON_CREATE", 0), 
    ON_DESTROY("ON_DESTROY", 5), 
    ON_PAUSE("ON_PAUSE", 3), 
    ON_RESUME("ON_RESUME", 2), 
    ON_START("ON_START", 1), 
    ON_STOP("ON_STOP", 4);
    
    static {
        Companion = (pad)new Object();
    }
    
    public final tad a() {
        switch (qad.a[this.ordinal()]) {
            default: {
                en9.r();
                return null;
            }
            case 7: {
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)this);
                sb.append(" has no target state");
                throw new IllegalArgumentException(sb.toString());
            }
            case 6: {
                return tad.v;
            }
            case 5: {
                return tad.z;
            }
            case 3:
            case 4: {
                return tad.y;
            }
            case 1:
            case 2: {
                return tad.x;
            }
        }
    }
}
