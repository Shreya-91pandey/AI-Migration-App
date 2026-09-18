import java.util.AbstractMap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Iterator;
import android.net.Uri;
import java.util.Map$Entry;
import java.util.Set;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import android.content.Intent;
import java.util.LinkedHashMap;
import android.content.Context;

public final class ke extends rhc
{
    public final byte c;
    
    public static w4 g0(final Context context, final String[] array) {
        if (array.length == 0) {
            return new w4((Object)s89.v);
        }
        final int length = array.length;
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            if (t08.s(context, array[i]) != 0) {
                return null;
            }
        }
        int v;
        if ((v = z5e.V(array.length)) < 16) {
            v = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(v);
        for (int length2 = array.length, j = n; j < length2; ++j) {
            ((Map)linkedHashMap).put((Object)array[j], (Object)Boolean.TRUE);
        }
        return new w4((Object)linkedHashMap);
    }
    
    public static Map h0(int i, final Intent intent) {
        if (i == -1) {
            if (intent != null) {
                final String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                final int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra != null) {
                    if (stringArrayExtra != null) {
                        final ArrayList list = new ArrayList(intArrayExtra.length);
                        int length;
                        for (length = intArrayExtra.length, i = 0; i < length; ++i) {
                            list.add((Object)(intArrayExtra[i] == 0));
                        }
                        return y5e.k0((List)c86.y1((Iterable)iw0.W0((Object[])stringArrayExtra), (Iterable)list));
                    }
                }
            }
        }
        return (Map)s89.v;
    }
    
    @Override
    public w4 B(final Context context, final Object o) {
        final byte c = this.c;
        final w4 w4 = null;
        final w4 w5 = null;
        switch (c) {
            default: {
                return super.B(context, o);
            }
            case 6: {
                final w4 g0 = g0(context, (String[])((Collection)o).toArray((Object[])new String[0]));
                w4 w6 = w5;
                if (g0 != null) {
                    final Object b = g0.b();
                    b.getClass();
                    final Map map = (Map)b;
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (final Map$Entry map$Entry : map.entrySet()) {
                        final Boolean b2 = (Boolean)map$Entry.getValue();
                        b2.getClass();
                        if (b2) {
                            ((AbstractMap)linkedHashMap).put(map$Entry.getKey(), map$Entry.getValue());
                        }
                    }
                    w6 = new w4((Object)linkedHashMap.keySet());
                }
                return w6;
            }
            case 4: {
                final Uri uri = (Uri)o;
                return null;
            }
            case 1: {
                w4 w7 = w4;
                if (t08.s(context, (String)o) == 0) {
                    w7 = new w4((Object)Boolean.TRUE);
                }
                return w7;
            }
            case 0: {
                return g0(context, (String[])o);
            }
        }
    }
    
    @Override
    public final Object K(int n, final Intent intent) {
        final byte c = this.c;
        final boolean b = false;
        boolean b2 = false;
        switch (c) {
            default: {
                final Map h0 = h0(n, intent);
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (final Map$Entry map$Entry : h0.entrySet()) {
                    final Boolean b3 = (Boolean)map$Entry.getValue();
                    b3.getClass();
                    if (b3) {
                        ((AbstractMap)linkedHashMap).put(map$Entry.getKey(), map$Entry.getValue());
                    }
                }
                return linkedHashMap.keySet();
            }
            case 5: {
                return new ae(n, intent);
            }
            case 4: {
                if (n == -1) {
                    b2 = true;
                }
                return b2;
            }
            case 3: {
                return new ae(n, intent);
            }
            case 2: {
                return new ae(n, intent);
            }
            case 1: {
                Boolean b5;
                if (intent != null && n == -1) {
                    final int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean b4 = b;
                    if (intArrayExtra != null) {
                        final int length = intArrayExtra.length;
                        n = 0;
                        while (true) {
                            b4 = b;
                            if (n >= length) {
                                break;
                            }
                            if (intArrayExtra[n] == 0) {
                                b4 = true;
                                break;
                            }
                            ++n;
                        }
                    }
                    b5 = b4;
                }
                else {
                    b5 = Boolean.FALSE;
                }
                return b5;
            }
            case 0: {
                return h0(n, intent);
            }
        }
    }
    
    @Override
    public final Intent n(final Context context, final Object o) {
        switch (this.c) {
            default: {
                final Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[])((Collection)o).toArray((Object[])new String[0]));
                putExtra.getClass();
                return putExtra;
            }
            case 5: {
                final uhc uhc = (uhc)o;
                final Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                final Intent a = uhc.a();
                Object n = uhc;
                if (a != null) {
                    final Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    n = uhc;
                    if (bundleExtra != null) {
                        intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                        a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                        n = uhc;
                        if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                            final u6g u6g = new u6g(uhc.d());
                            u6g.v(uhc.c(), uhc.b());
                            n = u6g.n();
                        }
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)n);
                if (vra.I(2)) {
                    intent.toString();
                }
                return intent;
            }
            case 4: {
                final Intent addFlags = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", (Parcelable)o).addFlags(1).addFlags(2);
                addFlags.getClass();
                return addFlags;
            }
            case 3: {
                final Intent putExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)o);
                putExtra2.getClass();
                return putExtra2;
            }
            case 2: {
                return (Intent)o;
            }
            case 1: {
                final Intent putExtra3 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[] { (String)o });
                putExtra3.getClass();
                return putExtra3;
            }
            case 0: {
                final Intent putExtra4 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[])o);
                putExtra4.getClass();
                return putExtra4;
            }
        }
    }
}
