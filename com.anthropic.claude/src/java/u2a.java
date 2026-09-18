import androidx.window.extensions.WindowExtensionsProvider;

public abstract class u2a
{
    static {
        v4j.a((Class)u2a.class).c();
    }
    
    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        }
        catch (final NoClassDefFoundError | UnsupportedOperationException | NullPointerException ex) {
            return 0;
        }
    }
}
