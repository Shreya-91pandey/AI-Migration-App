public abstract class gac
{
    public static final void a(final String s) {
        throw new IllegalArgumentException(s);
    }
    
    public static final Void b(final String s) {
        throw new IllegalArgumentException(s);
    }
    
    public static final void c(final String s) {
        throw new IllegalStateException(s);
    }
    
    public static final Void d(final String s) {
        throw new IllegalStateException(s);
    }
    
    public static final void e(final String s) {
        throw new IndexOutOfBoundsException(s);
    }
}
