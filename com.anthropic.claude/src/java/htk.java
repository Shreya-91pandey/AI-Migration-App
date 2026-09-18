public final class htk
{
    public final String a;
    public final zta b;
    public final boolean c;
    
    public htk(final String s, final int n) {
        this(s);
        this.c = true;
    }
    
    public htk(final String a, final zta b) {
        this.a = a;
        this.b = b;
    }
    
    public htk(final String s, final boolean c, final zta zta) {
        this(s, zta);
        this.c = c;
    }
    
    @Override
    public final String toString() {
        return smk.s("AccessibilityKey: ", this.a);
    }
}
