import java.util.Collection;
import java.net.URLConnection;
import java.lang.ref.Reference;
import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;
import android.util.Log;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import java.util.WeakHashMap;

public final class tze implements jqh, t8k, gfi, w97, zgq
{
    public final byte v;
    public Object w;
    public Object x;
    public Object y;
    
    public tze(final byte v) {
        switch (this.v = v) {
            default: {
                final long[] a = jak.a;
                this.w = new tmf();
                return;
            }
            case 17: {
                return;
            }
            case 16: {
                this.w = new WeakHashMap();
                this.x = new WeakHashMap();
                this.y = new WeakHashMap();
                return;
            }
            case 12: {
                this.w = new AtomicReference((Object)ien.d);
                this.x = new Object();
            }
        }
    }
    
    public tze(final int n) {
        this.v = 13;
        lyd w;
        if (n != 1) {
            w = new lyd(n);
        }
        else {
            w = null;
        }
        this.w = w;
    }
    
    public tze(final Context context, final String w, final rjc x) {
        this.v = 5;
        this.w = w;
        this.x = x;
        this.y = new WeakReference((Object)context);
    }
    
    public tze(final SharedPreferences w, final ScheduledThreadPoolExecutor y) {
        this.v = 11;
        this.x = new ArrayDeque();
        this.w = w;
        this.y = y;
    }
    
    public tze(final d0j d0j) {
        this.v = 2;
        this.w = new AtomicInteger(0);
        this.x = new uy7((byte)1);
        this.y = new nob((Object)this, (Object)d0j, (byte)18);
    }
    
    public tze(final ffa x, final FirebaseMessaging y, final lfa w) {
        this.v = 14;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public tze(final Runnable w) {
        this.v = 0;
        this.x = new CopyOnWriteArrayList();
        this.y = new HashMap();
        this.w = w;
    }
    
    public tze(final jnk jnk) {
        this.v = 9;
        this.w = new xtm();
        this.x = vo8.a;
        final d58 w = d58.w;
        this.y = ien.a(uuj.s0((hc7)omo.o(), (hc7)new uw4((gc7)o55.x, (byte)3)));
    }
    
    public tze(final tun tun) {
        this.v = 1;
        this.w = new zmk((Object)tun);
        this.x = o50.Q((Object)Boolean.FALSE);
        this.y = new ynf();
    }
    
    public tze(final us4 w) {
        this.v = 3;
        this.w = w;
        this.x = new ArrayList();
    }
    
    public static Object a(final cgr cgr) {
        try {
            return ri2.o(cgr, 30L);
        }
        catch (final InterruptedException | TimeoutException ex) {
            throw new IOException("SERVICE_NOT_AVAILABLE", (Throwable)ex);
        }
        catch (final ExecutionException ex2) {
            final Throwable cause = ((Throwable)ex2).getCause();
            if (cause instanceof IOException) {
                throw (IOException)cause;
            }
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            throw new IOException((Throwable)ex2);
        }
    }
    
    public static tze e(final SharedPreferences sharedPreferences, final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        final tze tze = new tze(sharedPreferences, scheduledThreadPoolExecutor);
        final ArrayDeque arrayDeque;
        monitorenter(arrayDeque = (ArrayDeque)tze.x);
        Label_0103: {
            try {
                ((ArrayDeque)tze.x).clear();
                final String string = ((SharedPreferences)tze.w).getString("topic_operation_queue", "");
                if (TextUtils.isEmpty((CharSequence)string) || !string.contains((CharSequence)",")) {
                    break Label_0103;
                }
                final String[] split = string.split(",", -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                break Label_0103;
            }
            finally {
                monitorexit(arrayDeque);
                final String[] split;
                final int length = split.length;
                int n = 0;
                while (true) {
                    Block_7: {
                        while (true) {
                            break Label_0109;
                            Label_0147: {
                                monitorexit(arrayDeque);
                            }
                            return tze;
                            iftrue(Label_0147:)(n >= length);
                            break Block_7;
                            final String s;
                            ((ArrayDeque)tze.x).add((Object)s);
                            Label_0141:
                            ++n;
                            continue;
                        }
                        monitorexit(arrayDeque);
                        return tze;
                    }
                    final String s = split[n];
                    iftrue(Label_0141:)(TextUtils.isEmpty((CharSequence)s));
                    continue;
                }
            }
        }
    }
    
    public void b(final a a) {
        final us4 us4 = (us4)this.w;
        for (final yog yog : (ArrayList)this.x) {
            final rtc rtc = (rtc)yog.v;
            final KSerializer kSerializer = (KSerializer)yog.w;
            rtc.getClass();
            kSerializer.getClass();
            a.g(a, (rtc)us4, rtc, kSerializer);
        }
        final lta lta = (lta)this.y;
        if (lta != null) {
            a.d((rtc)us4, lta);
        }
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public void d() {
        final Context context = (Context)((Reference)this.y).get();
        if (context != null) {
            final Object m;
            monitorenter(m = a5q.m);
            while (true) {
                Label_0045: {
                    try {
                        final a5q a5q = a5q.k;
                        if (a5q != null) {
                            monitorexit(m);
                            break Label_0052;
                        }
                        break Label_0045;
                    }
                    finally {
                        monitorexit(m);
                        Label_0131: {
                            return;
                        }
                        final a5q a5q;
                        iftrue(Label_0131:)(a5q == null);
                        final String s = (String)this.w;
                        final rjc rjc = (rjc)this.x;
                        try {
                            final a5q e = a5q.e(context);
                            e.getClass();
                            e.a("DatadogBackgroundUpload/".concat(s));
                        }
                        catch (final IllegalStateException ex) {
                            c5q.F(rjc, 5, lq6.Y((Object[])new qjc[] { qjc.w, qjc.x }), (jta)g5q.x, (Throwable)ex, 48);
                        }
                        return;
                        a5q = a5q.l;
                        monitorexit(m);
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    @Override
    public void f() {
    }
    
    public Object g(final Object o) {
        final hdk hdk = (hdk)this.y;
        final ire ire = (ire)this.w;
        final String c = ((jqc)hdk.v).c(o, (KSerializer)this.x);
        final vej a = xej.a;
        return vzq.u(c, ire);
    }
    
    public Object get() {
        switch (this.v) {
            default: {
                return new tfo((l55)new eup((byte)27), (l55)new p3((byte)27), (p68)((uy7)this.w).get(), (nq)((ve6)this.x).get(), (c2l)((c2l)this.y).get());
            }
            case 12: {
                final long t = eqi.T();
                Object y;
                if (t == bun.a) {
                    y = this.y;
                }
                else {
                    final nsn nsn = (nsn)((AtomicReference)this.w).get();
                    final int a = nsn.a(t);
                    if (a >= 0) {
                        y = nsn.c[a];
                    }
                    else {
                        y = null;
                    }
                }
                return y;
            }
            case 8: {
                return new zn0((Context)((gfi)this.w).get(), (Object)((gfi)this.x).get(), (Object)((awp)this.y).get());
            }
        }
    }
    
    @Override
    public void h() {
        final Context context = (Context)((Reference)this.y).get();
        if (context != null) {
            final Object m;
            monitorenter(m = a5q.m);
            while (true) {
                Label_0045: {
                    try {
                        final a5q a5q = a5q.k;
                        if (a5q != null) {
                            monitorexit(m);
                            break Label_0052;
                        }
                        break Label_0045;
                    }
                    finally {
                        monitorexit(m);
                        Label_0074: {
                            return;
                        }
                        final a5q a5q;
                        iftrue(Label_0074:)(a5q == null);
                        Block_6: {
                            break Block_6;
                            a5q = a5q.l;
                            monitorexit(m);
                            continue;
                        }
                        rml.N(context, (String)this.w, (rjc)this.x);
                    }
                }
                break;
            }
        }
    }
    
    public void i(final lta y) {
        if (this.y == null) {
            this.y = y;
            return;
        }
        final StringBuilder sb = new StringBuilder("Default deserializer provider is already registered for class ");
        sb.append((Object)this.w);
        fvd.p(sb, (Object)": ", (Object)this.y);
    }
    
    public tun j() {
        return (tun)((zmk)this.w).x.getValue();
    }
    
    public void k(String s, final String s2, final String s3, final String s4) {
        final ffa ffa = (ffa)this.x;
        if (s2 == null || s3 == null) {
            uy8.h("FIS auth token or FIS ID is empty");
            return;
        }
        ffa.a();
        final ufa c = ffa.c;
        final String c2 = c.c;
        ffa.a();
        final String a = c.a;
        if (c2 == null) {
            uy8.h("Project ID or API Key is missing");
            return;
        }
        final URL url = new URL(lmf.u(oz1.t("https://fcmregistrations.googleapis.com/v1/projects/", c2, "/registrations/", s3, "/topicSubscriptions/"), s, ":", s4));
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            url.toString();
        }
        s = (String)url.openConnection();
        ((HttpURLConnection)s).setRequestMethod("POST");
        ((URLConnection)s).setRequestProperty("x-goog-api-key", a);
        ((URLConnection)s).setRequestProperty("x-goog-firebase-installations-auth", s2);
        ((URLConnection)s).setDoOutput(false);
        try {
            try {
                final int responseCode = ((HttpURLConnection)s).getResponseCode();
                ((HttpURLConnection)s).disconnect();
                if (responseCode >= 200 && responseCode < 300) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    return;
                }
                if (responseCode == 404 || responseCode == 403) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        ((HttpURLConnection)s).getResponseMessage();
                    }
                    final StringBuilder u = ge9.u("Topic ", s4, " failed: ");
                    u.append(((HttpURLConnection)s).getResponseMessage());
                    throw new IOException(u.toString());
                }
                if (responseCode >= 500) {
                    uy8.h("INTERNAL_SERVER_ERROR");
                    return;
                }
                s = (String)new StringBuilder("Topic ");
                ((StringBuilder)s).append(s4);
                ((StringBuilder)s).append(" failed with status: ");
                ((StringBuilder)s).append(responseCode);
                throw new IOException(((StringBuilder)s).toString());
            }
            finally {}
        }
        catch (final IOException ex) {
            throw new IOException("SERVICE_NOT_AVAILABLE", (Throwable)ex);
        }
        ((HttpURLConnection)s).disconnect();
    }
    
    public void l(final Object y) {
        final long t = eqi.T();
        if (t == bun.a) {
            this.y = y;
            return;
        }
        final Object x;
        monitorenter(x = this.x);
        Label_0093: {
            nsn nsn;
            int a;
            try {
                nsn = (nsn)((AtomicReference)this.w).get();
                a = nsn.a(t);
                if (a < 0) {
                    ((AtomicReference)this.w).set((Object)nsn.b(t, y));
                    monitorexit(x);
                    return;
                }
            }
            finally {
                break Label_0093;
            }
            final Throwable t2;
            nsn.c[a] = t2;
            monitorexit(x);
            return;
        }
        monitorexit(x);
    }
    
    public void m(final us4 us4, final KSerializer kSerializer) {
        ((ArrayList)this.x).add((Object)new yog((Object)us4, (Object)kSerializer));
    }
    
    public void n() {
        final tmf tmf = (tmf)this.w;
        final String s = (String)this.x;
        final List list = (List)tmf.k((Object)s);
        if (list != null) {
            list.remove((Object)this.y);
        }
        if (list != null) {
            if (!((Collection)list).isEmpty()) {
                tmf.m((Object)s, (Object)list);
            }
        }
    }
    
    public Object zza() {
        return new uzq((hfr)((zgq)this.w).zza(), (lmq)((zgq)this.x).zza(), ((g70)((gfk)this.y).v).a);
    }
}
