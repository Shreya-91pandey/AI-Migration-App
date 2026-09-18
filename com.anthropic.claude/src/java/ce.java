import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import android.content.Intent;
import android.content.Context;
import android.os.Build$VERSION;

public class ce extends rhc
{
    public final byte c;
    public final Object d;
    
    public ce(final String d, final byte c) {
        switch (this.c = c) {
            default: {
                this.d = d;
                return;
            }
            case 1: {
                Object d2;
                if (Build$VERSION.SDK_INT >= 34) {
                    d2 = new ke((byte)6);
                }
                else {
                    d2 = new yhb(d);
                }
                this.d = d2;
            }
        }
    }
    
    @Override
    public final Object K(final int n, Intent intent) {
        switch (this.c) {
            default: {
                final Object k = ((rhc)this.d).K(n, intent);
                k.getClass();
                return k;
            }
            case 0: {
                Object data = null;
                if (n != -1) {
                    intent = null;
                }
                if (intent != null) {
                    data = intent.getData();
                }
                return data;
            }
        }
    }
    
    public Intent g0(final Context context, final String s) {
        final Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType((String)this.d).putExtra("android.intent.extra.TITLE", s);
        putExtra.getClass();
        return putExtra;
    }
    
    @Override
    public Intent n(final Context context, final Object o) {
        switch (this.c) {
            default: {
                final Set set = (Set)o;
                final Iterable iterable = (Iterable)set;
                final boolean b = iterable instanceof Collection;
                final Intent intent = null;
                if (!b || !((Collection)iterable).isEmpty()) {
                    final Iterator iterator = iterable.iterator();
                    while (iterator.hasNext()) {
                        if (rym.E0((String)iterator.next(), "android.permission.health.", false)) {
                            continue;
                        }
                        en9.s("Unsupported health connect permission");
                        return intent;
                    }
                }
                Intent n;
                if (!((Collection)set).isEmpty()) {
                    n = ((rhc)this.d).n(context, set);
                    n.getClass();
                }
                else {
                    en9.s("At least one permission is required!");
                    n = intent;
                }
                return n;
            }
            case 0: {
                return this.g0(context, (String)o);
            }
        }
    }
}
