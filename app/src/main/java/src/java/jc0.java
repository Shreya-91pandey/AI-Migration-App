import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.content.Context;

public final class jc0 implements vyo
{
    public final Context a;
    
    public jc0(final Context a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s) {
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
        }
        catch (final ActivityNotFoundException ex) {
            throw new IllegalArgumentException(hia.k("Can't open ", s, "."), (Throwable)ex);
        }
    }
}
