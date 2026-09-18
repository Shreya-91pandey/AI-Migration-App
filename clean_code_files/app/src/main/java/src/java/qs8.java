public final class qs8 implements Comparable
{
    public final float v = v;
    
    public static int b(final float n, final float n2) {
        if (!Float.isNaN(n) && !Float.isNaN(n2)) {
            return Float.compare(n, n2);
        }
        return 0;
    }
    
    public static final boolean e(final float n, final float n2) {
        return Float.compare(n, n2) == 0;
    }
    
    public static String f(final float n) {
        if (Float.isNaN(n)) {
            return "Dp.Unspecified";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(".dp");
        return sb.toString();
    }
    
    public final int compareTo(final Object o) {
        return b(this.v, ((qs8)o).v);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof qs8) {
            if (Float.compare(this.v, ((qs8)o).v) == 0) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.v);
    }
    
    @Override
    public final String toString() {
        return f(this.v);
    }
}
