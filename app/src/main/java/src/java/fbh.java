public final class fbh
{
    public static final fbh c;
    public final boolean a;
    public final int b;
    
    static {
        c = new fbh(0, false);
    }
    
    public fbh() {
        this.a = false;
        this.b = 0;
    }
    
    public fbh(final int b, final boolean a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fbh)) {
            return false;
        }
        final fbh fbh = (fbh)o;
        return this.a == fbh.a && this.b == fbh.b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + Boolean.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = v79.a(this.b);
        final StringBuilder sb = new StringBuilder("PlatformParagraphStyle(includeFontPadding=");
        sb.append(this.a);
        sb.append(", emojiSupportMatch=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
