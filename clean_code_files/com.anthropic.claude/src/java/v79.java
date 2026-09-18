public final class v79
{
    public final int a = a;
    
    public static String a(final int n) {
        if (n == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (n == 1) {
            return "EmojiSupportMatch.None";
        }
        if (n == 2) {
            return "EmojiSupportMatch.All";
        }
        return oz1.n("Invalid(value=", n, ")");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof v79) {
            if (this.a == ((v79)o).a) {
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
