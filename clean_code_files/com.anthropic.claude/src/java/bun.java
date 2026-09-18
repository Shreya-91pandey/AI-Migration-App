import android.os.Looper;

public abstract class bun
{
    public static final long a;
    
    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        }
        catch (final Exception ex) {
            id = -1L;
        }
        a = id;
    }
}
