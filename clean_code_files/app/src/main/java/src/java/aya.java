import java.util.Collection;
import android.content.Intent;
import android.content.Context;

public final class aya extends ee
{
    public final dj7 c;
    public final dj7 d;
    
    public aya(final dj7 c, final dj7 d) {
        this.c = c;
        this.d = d;
    }
    
    public final Intent g0(final Context context, final String s) {
        final Intent g0 = super.g0(context, s);
        if (this.d.a()) {
            g0.removeCategory("android.intent.category.OPENABLE");
        }
        final Intent putExtra = g0.putExtra("android.intent.extra.MIME_TYPES", (String[])((Collection)this.c.a()).toArray((Object[])new String[0]));
        putExtra.getClass();
        return putExtra;
    }
}
