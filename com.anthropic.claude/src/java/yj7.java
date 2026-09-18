import android.content.Intent;
import android.content.Context;

public final class yj7 extends ce
{
    public static final yj7 e;
    
    static {
        e = (yj7)new ce("*/*", (byte)0);
    }
    
    public final Intent g0(final Context context, final String s) {
        final Intent setType = super.g0(context, s).setType(m8r.j(s, "application/octet-stream"));
        setType.getClass();
        return setType;
    }
}
