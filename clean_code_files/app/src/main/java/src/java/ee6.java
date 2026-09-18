import android.os.BaseBundle;
import java.util.Map;
import android.util.Log;
import java.util.Iterator;
import android.content.IntentSender;
import android.content.IntentSender$SendIntentException;
import android.os.Build$VERSION;
import java.util.Arrays;
import android.text.TextUtils;
import java.util.HashSet;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import android.os.Parcelable;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class ee6
{
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final ArrayList d;
    public final transient LinkedHashMap e;
    public final LinkedHashMap f;
    public final Bundle g;
    public final ge6 h;
    
    public ee6(final ge6 h) {
        this.h = h;
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new Bundle();
    }
    
    public final boolean a(final int n, final int n2, final Intent intent) {
        final String s = (String)this.a.get((Object)n);
        if (s == null) {
            return false;
        }
        final ne ne = (ne)this.e.get((Object)s);
        be a;
        if (ne != null) {
            a = ne.a;
        }
        else {
            a = null;
        }
        if (a != null) {
            final ArrayList d = this.d;
            if (d.contains((Object)s)) {
                ne.a.f(ne.b.K(n2, intent));
                d.remove((Object)s);
                return true;
            }
        }
        ((Map)this.f).remove((Object)s);
        this.g.putParcelable(s, (Parcelable)new ae(n2, intent));
        return true;
    }
    
    public final void b(final int n, rhc ex, final Object o, final cvj cvj) {
        final ge6 h = this.h;
        final w4 b = ((rhc)ex).B((Context)h, o);
        final int n2 = 0;
        if (b != null) {
            new Handler(Looper.getMainLooper()).post((Runnable)new de6((Object)this, n, (Object)b, (byte)0));
            return;
        }
        final Intent n3 = ((rhc)ex).n((Context)h, o);
        if (n3.getExtras() != null) {
            final Bundle extras = n3.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                n3.setExtrasClassLoader(((Context)h).getClassLoader());
            }
        }
        if (n3.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            ex = (IntentSender$SendIntentException)n3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            n3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        else if (cvj != null) {
            ex = (IntentSender$SendIntentException)cvj.N();
        }
        else {
            ex = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(n3.getAction())) {
            String[] stringArrayExtra;
            if ((stringArrayExtra = n3.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS")) == null) {
                stringArrayExtra = new String[0];
            }
            final HashSet set = new HashSet();
            for (int i = 0; i < stringArrayExtra.length; ++i) {
                if (TextUtils.isEmpty((CharSequence)stringArrayExtra[i])) {
                    en9.s(oz1.p(new StringBuilder("Permission request for permissions "), Arrays.toString((Object[])stringArrayExtra), " must not contain null or empty values"));
                    return;
                }
                if (Build$VERSION.SDK_INT < 33 && TextUtils.equals((CharSequence)stringArrayExtra[i], (CharSequence)"android.permission.POST_NOTIFICATIONS")) {
                    set.add((Object)i);
                }
            }
            final int size = set.size();
            String[] array;
            if (size > 0) {
                array = new String[stringArrayExtra.length - size];
            }
            else {
                array = stringArrayExtra;
            }
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int n4 = 0;
                int n5;
                for (int j = n2; j < stringArrayExtra.length; ++j, n4 = n5) {
                    n5 = n4;
                    if (!set.contains((Object)j)) {
                        array[n4] = stringArrayExtra[j];
                        n5 = n4 + 1;
                    }
                }
            }
            h.requestPermissions(stringArrayExtra, n);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(n3.getAction())) {
            final uhc uhc = (uhc)n3.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                uhc.getClass();
                final IntentSender d = uhc.d();
                final Intent a = uhc.a();
                final int b2 = uhc.b();
                final int c = uhc.c();
                try {
                    h.startIntentSenderForResult(d, n, a, b2, c, 0, (Bundle)ex);
                    return;
                }
                catch (final IntentSender$SendIntentException ex2) {}
            }
            catch (final IntentSender$SendIntentException ex) {}
            new Handler(Looper.getMainLooper()).post((Runnable)new de6((Object)this, n, (Object)ex, (byte)1));
            return;
        }
        h.startActivityForResult(n3, n, (Bundle)ex);
    }
    
    public final pe c(final String s, final rhc rhc, final be be) {
        this.d(s);
        ((Map)this.e).put((Object)s, (Object)new ne(be, rhc));
        final LinkedHashMap f = this.f;
        if (((Map)f).containsKey((Object)s)) {
            final Object value = f.get((Object)s);
            ((Map)f).remove((Object)s);
            be.f(value);
        }
        final Bundle g = this.g;
        final ae ae = (ae)tsf.G(g, s, (Class)ae.class);
        if (ae != null) {
            g.remove(s);
            be.f(rhc.K(ae.v, ae.w));
        }
        return new pe(this, s, rhc, (byte)1);
    }
    
    public final void d(final String s) {
        final LinkedHashMap b = this.b;
        if (b.get((Object)s) != null) {
            return;
        }
        final y5 y5 = new y5((byte)3);
        for (final Number n : new av6((uyk)new bxa((Object)y5, (Object)new nk0((jta)y5, (byte)2), (byte)0))) {
            final int intValue = n.intValue();
            final LinkedHashMap a = this.a;
            if (!((Map)a).containsKey((Object)intValue)) {
                final int intValue2 = n.intValue();
                ((Map)a).put((Object)intValue2, (Object)s);
                ((Map)b).put((Object)s, (Object)intValue2);
                return;
            }
        }
        oyl.i("Sequence contains no element matching the predicate.");
    }
    
    public final void e(final String s) {
        if (!this.d.contains((Object)s)) {
            final Integer n = (Integer)((Map)this.b).remove((Object)s);
            if (n != null) {
                ((Map)this.a).remove((Object)n);
            }
        }
        ((Map)this.e).remove((Object)s);
        final LinkedHashMap f = this.f;
        if (((Map)f).containsKey((Object)s)) {
            final StringBuilder u = ge9.u("Dropping pending result for request ", s, ": ");
            u.append(f.get((Object)s));
            Log.w("ActivityResultRegistry", u.toString());
            ((Map)f).remove((Object)s);
        }
        final Bundle g = this.g;
        if (((BaseBundle)g).containsKey(s)) {
            final ae ae = (ae)tsf.G(g, s, (Class)ae.class);
            final StringBuilder sb = new StringBuilder("Dropping pending result for request ");
            sb.append(s);
            sb.append(": ");
            sb.append((Object)ae);
            Log.w("ActivityResultRegistry", sb.toString());
            g.remove(s);
        }
        final LinkedHashMap c = this.c;
        final oe oe = (oe)c.get((Object)s);
        if (oe != null) {
            final ArrayList b = oe.b;
            final Iterator iterator = b.iterator();
            while (iterator.hasNext()) {
                oe.a.d((fbd)iterator.next());
            }
            b.clear();
            ((Map)c).remove((Object)s);
        }
    }
}
