import java.util.concurrent.ExecutorService;
import java.util.Iterator;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import com.google.android.gms.common.api.ApiException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.a;
import android.content.Context;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import android.view.inputmethod.InputContentInfo;
import android.os.Parcelable;
import android.os.Bundle;
import java.util.IllegalFormatException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import android.os.Process;
import java.util.concurrent.Executors;
import android.util.SparseIntArray;
import android.graphics.Region;

public final class xzj implements sia, pcc, pum, v2k, l7b, jg0, ftp, o8g
{
    public Object v;
    
    public xzj(final byte b) {
        switch (b) {
            default: {
                this.v = new Region();
                return;
            }
            case 17: {
                final Object d = p3b.d;
                this.v = new SparseIntArray();
                return;
            }
            case 10: {
                this.v = Executors.newSingleThreadScheduledExecutor();
            }
        }
    }
    
    public xzj(final String s) {
        this.v = hia.g(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(s);
    }
    
    public xzj(final xc8 xc8) {
        this.v = new jia(fgm.a, xc8);
    }
    
    public static String v(final String s, final String s2, final Object... array) {
        String s3 = s2;
        if (array.length > 0) {
            try {
                s3 = String.format(Locale.US, s2, array);
            }
            catch (final IllegalFormatException ex) {
                Log.e("PlayCore", "Unable to format ".concat(s2), (Throwable)ex);
                s3 = lmf.s(s2, " [", TextUtils.join((CharSequence)", ", array), "]");
            }
        }
        return hia.k(s, " : ", s3);
    }
    
    public boolean a(final xa9 xa9, final int n, Bundle bundle) {
        final spm spm = (spm)this.v;
        Bundle bundle2 = bundle;
        if ((n & 0x1) != 0x0) {
            try {
                xa9.F();
                final InputContentInfo o = xa9.O();
                if (bundle == null) {
                    bundle = new Bundle();
                }
                else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", (Parcelable)o);
                bundle2 = bundle;
            }
            catch (final Exception ex) {
                ex.toString();
                return false;
            }
        }
        final yb0 a = spm.a;
        final vec p3 = j9r.p(xa9, bundle2);
        final d09 d09 = (d09)a.B;
        return d09 != null && (mlc.q(d09.b.a(p3), p3) ^ true);
    }
    
    public Object b(final Object o) {
        return ((qqn)o).z();
    }
    
    public void c(final jtp jtp, final re re) {
        ((WebViewProviderFactoryBoundaryInterface)this.v).startUpWebView((InvocationHandler)new xi2((Object)new zzc((Object)jtp)), (InvocationHandler)new xi2((Object)new vre((Object)new uxa((Object)re, (byte)16), (byte)24)));
    }
    
    public WebViewProviderBoundaryInterface createWebView(final WebView webView) {
        return (WebViewProviderBoundaryInterface)yi2.i(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)this.v).createWebView(webView));
    }
    
    public qpp d(final v2b v2b) {
        return (qpp)new vhk((Object)this.v, (Object)v2b, (byte)12);
    }
    
    public void e(final jtp jtp, final vhk vhk) {
        ((WebViewProviderFactoryBoundaryInterface)this.v).startUpWebView((Consumer)new gtp((Object)jtp, (byte)0), (Consumer)new htp(vhk, (byte)0), (Consumer)new htp(vhk, (byte)1));
    }
    
    public void f(final ygc ygc) {
        ((Region)this.v).set(ygc.a, ygc.b, ygc.c, ygc.d);
    }
    
    public void g(final Runnable runnable) {
        try {
            ((ExecutorService)this.v).submit(runnable);
        }
        catch (final RejectedExecutionException ex) {}
    }
    
    public mia get(final int n) {
        return (via)this.v;
    }
    
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface)yi2.i(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)this.v).getStatics());
    }
    
    @Override
    public float h() {
        return 0.0f;
    }
    
    public int i(final Context context, final a a) {
        ao2.z(context);
        ao2.z(a);
        final int g = a.g();
        final SparseIntArray sparseIntArray = (SparseIntArray)this.v;
        synchronized (sparseIntArray) {
            final int value = sparseIntArray.get(g, -1);
            monitorexit(sparseIntArray);
            if (value != -1) {
                return value;
            }
            final SparseIntArray sparseIntArray2 = (SparseIntArray)this.v;
            monitorenter(sparseIntArray2);
            final int n = 0;
            int n2 = 0;
        Block_9_Outer:
            while (true) {
                Label_0104: {
                    try {
                        if (n2 >= sparseIntArray2.size()) {
                            break Label_0104;
                        }
                        final int key = sparseIntArray2.keyAt(n2);
                        if (key > g && sparseIntArray2.get(key) == 0) {
                            final int n3 = n;
                            break Label_0104;
                        }
                        break Label_0104;
                    }
                    finally {
                        monitorexit(sparseIntArray);
                        ++n2;
                        continue Block_9_Outer;
                        final int n3 = -1;
                        break Label_0104;
                        int b = 0;
                    Label_0131:
                        while (true) {
                            b = ((q3b)p3b.e).b(context, g);
                            break Label_0131;
                            b = n3;
                            iftrue(Label_0131:)(n3 != -1);
                            continue;
                        }
                        sparseIntArray2.put(g, b);
                        return b;
                    }
                }
                break;
            }
        }
    }
    
    @Override
    public float j(final float n, long n2) {
        n2 /= 1000000L;
        return ((jia)this.v).a(n).b(n2);
    }
    
    public void k(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 3)) {
            v((String)this.v, s, array);
        }
    }
    
    public String[] l() {
        return ((WebViewProviderFactoryBoundaryInterface)this.v).getSupportedFeatures();
    }
    
    public t2k m(final String obj) {
        final i5n i5n = (i5n)this.v;
        final String databaseName = i5n.getDatabaseName();
        if (databaseName == null) {
            if (!obj.equals(":memory:")) {
                oyl.g((Object)hia.k("This driver is configured to open an in-memory database but a file-based named '", obj, "' was requested."));
                return null;
            }
        }
        else if (!databaseName.equals(obj)) {
            if (!kym.s1('/', databaseName, databaseName).equals(kym.s1('/', obj, obj))) {
                oyl.g((Object)lmf.t("This driver is configured to open a database named '", i5n.getDatabaseName(), "' but '", obj, "' was requested."));
                return null;
            }
        }
        return (t2k)new g5n(i5n.k0());
    }
    
    public boolean n() {
        return true;
    }
    
    @Override
    public long o(final float n) {
        final jia jia = (jia)this.v;
        final float[] a = d70.a;
        return (long)(Math.exp(d70.a(n, jia.v * jia.w) / (kia.a - 1.0)) * 1000.0) * 1000000L;
    }
    
    public void p(final RemoteException ex, final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", v((String)this.v, s, array), (Throwable)ex);
        }
    }
    
    @Override
    public float q(final float n, final float n2) {
        final jia jia = (jia)this.v;
        final float[] a = d70.a;
        final float v = jia.v;
        final float w = jia.w;
        final double a2 = d70.a(n2, v * w);
        final double n3 = kia.a;
        return Math.signum(n2) * (float)(Math.exp(n3 / (n3 - 1.0) * a2) * (v * w)) + n;
    }
    
    @Override
    public float r(long n, final float n2, final float n3) {
        n /= 1000000L;
        return ((jia)this.v).a(n3).a(n) + n2;
    }
    
    public void s(final Exception ex) {
        if (ex instanceof ApiException) {
            final np6 y = ((ApiException)ex).v.y;
            if (y != null && y.w == 24) {
                ((AtomicLong)((jmq)this.v).x).set(SystemClock.elapsedRealtime());
            }
        }
    }
    
    public Iterator t() {
        return ((Iterable)this.v).iterator();
    }
    
    public void u(final String s, final Object... array) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", v((String)this.v, s, array));
        }
    }
}
