import java.util.List;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import android.content.SharedPreferences$Editor;
import java.io.Serializable;
import io.sentry.protocol.i0;
import io.sentry.v4;
import java.util.Map;
import io.sentry.util.b;
import java.util.LinkedHashMap;

public final class r3p extends tvj
{
    public final i4p w;
    
    public r3p(final j6 j6, final s3p s3p, final mli mli, final vn0 vn0, final m5b m5b, final y1n b, final ko7 ko7, final s57 s57, final cc8 cc8, final lqn lqn, final st4 st4, final xxl xxl, final ep0 ep0, final i4p w, final o3p o3p, final wo8 wo8) {
        super(wo8);
        this.w = w;
        final String c = s3p.c;
        final String d = s3p.d;
        final w1n z = r6k.z(s3p.d());
        synchronized (lqn) {
            lqn.c = (kqn)new hqn(d);
            lqn.b(d);
            monitorexit(lqn);
            final boolean h = ep0.h();
            final Object o = new Object();
            ((i0)o).w = c;
            Object b2;
            if ((b2 = ((i0)o).B) == null) {
                b2 = new LinkedHashMap();
            }
            ((Map)b2).put((Object)"current_organization_id", (Object)d);
            ((i0)o).B = b.m((Map)b2);
            v4.o((i0)o);
            v4.n("subscription_level", z.v);
            v4.n("is_ant", String.valueOf(h));
            synchronized (xxl) {
                xxl.c = c;
                if (!xxl.b) {
                    monitorexit(xxl);
                }
                else {
                    sxl.b(c);
                    monitorexit(xxl);
                }
                final fz6 v = super.v;
                if (w.b == null) {
                    w.b = rhc.G((oc7)v, (hc7)null, 4, (zta)new h4p(w, (f07)null), 1);
                }
                final String b3 = j6.a().b;
                String f;
                if ((f = s3p.d().f) == null) {
                    f = "unknown";
                }
                st4.e(c, d, b3, z, f);
                final String v2 = z.v;
                ep0.v.setValue((Object)v2);
                final SharedPreferences$Editor edit = ep0.a.edit();
                edit.getClass();
                edit.putString("last_subscription_level", v2);
                edit.apply();
                m5b.b = b;
                final et0 a = m5b.a;
                final o68 a2 = vo8.a;
                final d58 w2 = d58.w;
                rhc.G((oc7)a, (hc7)w2, 0, (zta)new pn((byte)18, (f07)null, (Object)m5b), 2);
                rhc.G((oc7)super.v, (hc7)null, 0, (zta)new khn((byte)7, (f07)null, (Object)ko7), 3);
                if (s57.l.compareAndSet(false, true)) {
                    rhc.G((oc7)s57.k, (hc7)null, 0, (zta)new m33((byte)2, (f07)null, (Object)s57), 3);
                }
                cc8.a();
                rhc.G((oc7)super.v, (hc7)w2, 0, (zta)new h80((byte)19, (f07)null, (Object)o3p), 2);
                final ili ili = (ili)mli;
                rhc.G((oc7)ili.g, (hc7)w2, 0, (zta)new l10((byte)7, (f07)null, (Serializable)c, (Object)ili, (Object)d), 2);
                rhc.G((oc7)super.v, (hc7)null, 0, (zta)new djh((Object)vn0, (Object)this, (Object)ko7, (f07)null, (byte)14), 3);
            }
        }
    }
    
    @Override
    public final void onDestroy() {
        super.onDestroy();
        final i4p w = this.w;
        final wmm b = w.b;
        if (b != null) {
            ((bqc)b).g((CancellationException)null);
            w.b = null;
            for (final f4p f4p : w.a) {
                final List a = adn.a;
                final String a2 = f4p.a();
                final Iterator iterator2 = ((Iterable)adn.a).iterator();
                while (iterator2.hasNext()) {
                    ((len)iterator2.next()).c(a2);
                }
            }
        }
    }
}
