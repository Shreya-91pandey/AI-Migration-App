import org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface;
import android.content.Context;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import android.net.Uri;
import java.lang.reflect.InvocationHandler;
import android.webkit.WebView;
import java.util.concurrent.CountDownLatch;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

public final class gfk implements t45, r6p, WebMessageListenerBoundaryInterface, wcq, a9g, o8g, g8g, zgq
{
    public Object v;
    
    public gfk(final byte b) {
        switch (b) {
            default: {
                this.v = o50.Q(Boolean.FALSE);
                return;
            }
            case 14: {
                this.v = new CountDownLatch(1);
            }
        }
    }
    
    public gfk(final float n, final float n2, final ig0 ig0) {
        final int[] a = p6p.a;
        Object v;
        if (ig0 == null && n == 1.0f && n2 == 1500.0f) {
            v = w68.v;
        }
        else if (ig0 != null) {
            v = new vre(n, n2, ig0);
        }
        else {
            v = new Object();
            ((xzj)v).v = new via(n, n2);
        }
        this.v = new c2l((jg0)v);
    }
    
    @Override
    public boolean a() {
        return false;
    }
    
    public void b() {
        ((CountDownLatch)this.v).countDown();
    }
    
    public void c(final Object o) {
        ((CountDownLatch)this.v).countDown();
    }
    
    public long d(final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        return ((c2l)this.v).d(ig0, ig2, ig3);
    }
    
    public ig0 e(final long n, final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        return ((c2l)this.v).e(n, ig0, ig2, ig3);
    }
    
    public Object f() {
        return this.v;
    }
    
    public String[] getSupportedFeatures() {
        return new String[] { "WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER" };
    }
    
    public ig0 i(final long n, final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        return ((c2l)this.v).i(n, ig0, ig2, ig3);
    }
    
    public Object j(xd3 j, final jta jta) {
        if (this.v == null) {
            pih.b("Called runAndWatch on a manager that has been disposed of");
        }
        final r1 r1 = (r1)this.v;
        if (r1 instanceof szl) {
            final szl szl = (szl)r1;
            final stk b = szl.B;
            if (b != null && !b.equals(j)) {
                final fkf v = new fkf();
                final stk b2 = szl.B;
                if (b2 == null) {
                    pih.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
                }
                final umf z = szl.z;
                if (z == null) {
                    final Object x = szl.x;
                    x.getClass();
                    v.r(b2, x);
                }
                else {
                    final Object[] b3 = z.b;
                    final long[] a = z.a;
                    final int n = a.length - 2;
                    if (n >= 0) {
                        int n2 = 0;
                        while (true) {
                            long n3 = a[n2];
                            if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                                final int n4 = 8 - (~(n2 - n) >>> 31);
                                for (int i = 0; i < n4; ++i) {
                                    if ((0xFFL & n3) < 128L) {
                                        v.r(b2, b3[(n2 << 3) + i]);
                                    }
                                    n3 >>= 8;
                                }
                                if (n4 != 8) {
                                    break;
                                }
                            }
                            if (n2 == n) {
                                break;
                            }
                            ++n2;
                        }
                    }
                }
                v.e();
                szl.g();
                this.v = v;
            }
        }
        final r1 r2 = (r1)this.v;
        r2.getClass();
        final r7m u = g8m.h().u(r2.m((stk)j));
        r2.d((stk)j);
        Label_0366: {
            try {
                j = (xd3)u.j();
                final jta jta2 = jta;
                final Object o = jta2.a();
                final xd3 xd3 = j;
                r7m.q((r7m)xd3);
                final r7m r7m = u;
                r7m.c();
                final r1 r3 = r2;
                r3.e();
                return o;
            }
            finally {
                final xd3 xd4;
                j = xd4;
                break Label_0366;
            }
            try {
                final jta jta2 = jta;
                final Object o = jta2.a();
                final xd3 xd3 = j;
                r7m.q((r7m)xd3);
                final r7m r7m = u;
                r7m.c();
                final r1 r3 = r2;
                r3.e();
                return o;
            }
            finally {
                r7m.q((r7m)j);
            }
        }
        u.c();
        throw j;
    }
    
    public ig0 k(final ig0 ig0, final ig0 ig2, final ig0 ig3) {
        return ((c2l)this.v).k(ig0, ig2, ig3);
    }
    
    public void l(final boolean b) {
        ((ljq)this.v).Y(b);
    }
    
    public void onPostMessage(final WebView webView, final InvocationHandler invocationHandler, final Uri uri, final boolean b, final InvocationHandler invocationHandler2) {
        final WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface)yi2.i(WebMessageBoundaryInterface.class, invocationHandler);
        final InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        final k3p[] array = new k3p[ports.length];
        for (int i = 0; i < ports.length; ++i) {
            array[i] = new k3p(ports[i]);
        }
        fsp fsp;
        if (((bj0)wsp.a).b()) {
            final WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface)yi2.i(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            final int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    fsp = null;
                }
                else {
                    fsp = new fsp(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), array);
                }
            }
            else {
                fsp = new fsp(webMessagePayloadBoundaryInterface.getAsString(), array);
            }
        }
        else {
            fsp = new fsp(webMessageBoundaryInterface.getData(), array);
        }
        if (fsp != null) {
            final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface)yi2.i(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            ((msp)this.v).g(webView, fsp, uri, b, (dpc)((IsomorphicObjectBoundaryInterface)jsReplyProxyBoundaryInterface).getOrCreatePeer((Callable)new u48((Object)jsReplyProxyBoundaryInterface, (byte)2)));
        }
    }
    
    public void s(final Exception ex) {
        ((CountDownLatch)this.v).countDown();
    }
    
    @Override
    public Object z(final Context context, final Object o, final String s, final x4o x4o) {
        final lqo lqo = (lqo)o;
        return sdr.t((Object)m4p.a(((j4p)this.v).g.f()));
    }
    
    public Object zza() {
        return ((g70)this.v).a;
    }
}
