public final class ymn
{
    public static final ymn c;
    public static final ymn d;
    public final int a;
    public final boolean b;
    
    static {
        c = new ymn(2, false);
        d = new ymn(1, true);
    }
    
    public ymn(final int a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ymn)) {
            return false;
        }
        final ymn ymn = (ymn)o;
        return this.a == ymn.a && this.b == ymn.b;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.b) + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        if (this.equals(ymn.c)) {
            return "TextMotion.Static";
        }
        if (this.equals(ymn.d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
