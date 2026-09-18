public final class icd
{
    public static final int b = 66305;
    public static final int c = 131587;
    public static final int d = 66562;
    public final int a = a;
    
    public static String a(int n) {
        final int n2 = n & 0xFF;
        String s = "Invalid";
        String s2;
        if (n2 == 1) {
            s2 = "Strategy.Simple";
        }
        else if (n2 == 2) {
            s2 = "Strategy.HighQuality";
        }
        else if (n2 == 3) {
            s2 = "Strategy.Balanced";
        }
        else if (n2 == 0) {
            s2 = "Strategy.Unspecified";
        }
        else {
            s2 = "Invalid";
        }
        final int n3 = n >> 8 & 0xFF;
        String s3;
        if (n3 == 1) {
            s3 = "Strictness.None";
        }
        else if (n3 == 2) {
            s3 = "Strictness.Loose";
        }
        else if (n3 == 3) {
            s3 = "Strictness.Normal";
        }
        else if (n3 == 4) {
            s3 = "Strictness.Strict";
        }
        else if (n3 == 0) {
            s3 = "Strictness.Unspecified";
        }
        else {
            s3 = "Invalid";
        }
        n = (n >> 16 & 0xFF);
        if (n == 1) {
            s = "WordBreak.None";
        }
        else if (n == 2) {
            s = "WordBreak.Phrase";
        }
        else if (n == 0) {
            s = "WordBreak.Unspecified";
        }
        return oz1.p(oz1.t("LineBreak(strategy=", s2, ", strictness=", s3, ", wordBreak="), s, ")");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof icd) {
            if (this.a == ((icd)o).a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return a(this.a);
    }
}
