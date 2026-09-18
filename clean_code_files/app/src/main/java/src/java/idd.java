public final class idd
{
    public static final idd d;
    public final float a;
    public final int b;
    public final int c;
    
    static {
        d = new idd(fdd.c, 17, 0);
    }
    
    public idd(final float a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof idd)) {
            return false;
        }
        final idd idd = (idd)o;
        final float a = idd.a;
        final float b = fdd.b;
        return Float.compare(this.a, a) == 0 && this.b == idd.b && this.c == idd.c;
    }
    
    @Override
    public final int hashCode() {
        final float b = fdd.b;
        return Integer.hashCode(this.c) + hia.y(this.b, Float.hashCode(this.a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final String b = fdd.b(this.a);
        String s = "Invalid";
        final int b2 = this.b;
        String s2;
        if (b2 == 1) {
            s2 = "LineHeightStyle.Trim.FirstLineTop";
        }
        else if (b2 == 16) {
            s2 = "LineHeightStyle.Trim.LastLineBottom";
        }
        else if (b2 == 17) {
            s2 = "LineHeightStyle.Trim.Both";
        }
        else if (b2 == 0) {
            s2 = "LineHeightStyle.Trim.None";
        }
        else {
            s2 = "Invalid";
        }
        final int c = this.c;
        if (c == 0) {
            s = "LineHeightStyle.Mode.Fixed";
        }
        else if (c == 1) {
            s = "LineHeightStyle.Mode.Minimum";
        }
        else if (c == 2) {
            s = "LineHeightStyle.Mode.Tight";
        }
        return oz1.p(oz1.t("LineHeightStyle(alignment=", b, ", trim=", s2, ",mode="), s, ")");
    }
}
