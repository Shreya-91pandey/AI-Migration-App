import java.lang.reflect.InvocationHandler;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;
import android.net.Uri;

public abstract class nsp
{
    public static final Uri a;
    public static final Uri b;
    public static final WeakHashMap c;
    
    static {
        a = Uri.parse("*");
        b = Uri.parse("");
        c = new WeakHashMap();
    }
    
    public static void a(final kxa kxa, final String s, final Set set) {
        if (wsp.d.b()) {
            xa9.N(c((WebView)kxa).a.addDocumentStartJavaScript(s, (String[])set.toArray((Object[])new String[0])));
            return;
        }
        oyl.s("This method is not supported by the current version of the framework and the current WebView APK");
    }
    
    public static void b(final WebView webView, final String s, final Set set, final msp msp) {
        if (wsp.c.b()) {
            c(webView).a.addWebMessageListener(s, (String[])set.toArray((Object[])new String[0]), (InvocationHandler)new xi2((Object)new gfk((Object)msp)));
            return;
        }
        oyl.s("This method is not supported by the current version of the framework and the current WebView APK");
    }
    
    public static etp c(final WebView webView) {
        if (wsp.h.b()) {
            final WeakHashMap c = nsp.c;
            etp etp;
            if ((etp = (etp)c.get((Object)webView)) == null) {
                etp = new etp(xsp.a.createWebView(webView));
                c.put((Object)webView, (Object)etp);
            }
            return etp;
        }
        return new etp(xsp.a.createWebView(webView));
    }
}
