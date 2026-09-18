import java.net.URLConnection;
import android.view.View;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import androidx.compose.ui.node.LayoutNode;
import android.content.Context;
import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;

public class wab implements gc7, djn, ne6, by6, tkf, ad, nrf, xxf, psh
{
    public static final mb2 A;
    public static final mb2 B;
    public static final mb2 C;
    public static final mb2 D;
    public static final mb2 E;
    public static final mb2 F;
    public static final lb2 G;
    public static final lb2 H;
    public static final lb2 I;
    public static final kb2 J;
    public static final kb2 K;
    public static final kb2 L;
    public static final u50 M;
    public static final u50 N;
    public static final u50 O;
    public static final wab P;
    public static final wab Q;
    public static final wab R;
    public static final jqg S;
    public static final jqg T;
    public static final jqg U;
    public static final jqg V;
    public static final jqg W;
    public static final jqg X;
    public static final jqg Y;
    public static final jqg Z;
    public static final jqg a0;
    public static final jqg b0;
    public static final jqg c0;
    public static final jqg d0;
    public static final ypk e0;
    public static final ypk f0;
    public static final ypk g0;
    public static final ypk h0;
    public static final ypk i0;
    public static final wab j0;
    public static final wab k0;
    public static final wab l0;
    public static final wab w;
    public static final mb2 x;
    public static final mb2 y;
    public static final mb2 z;
    public final byte v;
    
    public static izp l(final lta lta, final gva gva) {
        Object r;
        if ((r = gva.R()) == bi6.a) {
            r = lta.b("claudeai_home_widget_v2");
            gva.q0(r);
        }
        if (((xom)r).getValue()) {
            return izp.z;
        }
        return izp.y;
    }
    
    public static HttpURLConnection n(String openConnection) {
        try {
            openConnection = (String)new URL(openConnection).openConnection();
            openConnection.getClass();
            openConnection = openConnection;
            ((URLConnection)openConnection).setConnectTimeout(15000);
            ((URLConnection)openConnection).setReadTimeout(201000);
            ((URLConnection)openConnection).setRequestProperty("User-Agent", "analytics-kotlin/1.19.2");
            ((URLConnection)openConnection).setDoInput(true);
            return (HttpURLConnection)openConnection;
        }
        catch (final MalformedURLException ex) {
            final IOException ex2 = new IOException("Attempted to use malformed url: ".concat(openConnection), (Throwable)ex);
            ifc.x((Throwable)ex2);
            throw ex2;
        }
    }
    
    public static izp o(final t2b t2b) {
        if (((sd8)((u2b)t2b).a.s("claudeai_home_widget_v2")).getValue()) {
            return izp.z;
        }
        return izp.y;
    }
    
    public boolean a(final hgf hgf) {
        return false;
    }
    
    public void b(final Context context) {
    }
    
    public int c() {
        return 8;
    }
    
    public boolean d(final hgf hgf) {
        return ach.R(ien.g(soh.L(hgf), false));
    }
    
    public long e(long n, long n2) {
        final float max = Math.max(Float.intBitsToFloat((int)(n2 >> 32)) / Float.intBitsToFloat((int)(n >> 32)), Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)) / Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)));
        n = Float.floatToRawIntBits(max);
        n2 = Float.floatToRawIntBits(max);
        final int a = bak.a;
        return n << 32 | (n2 & 0xFFFFFFFFL);
    }
    
    public void f(final hx7 hx7) {
    }
    
    public void g(final LayoutNode layoutNode, long e1, final dkb dkb, final int n, final boolean b) {
        final yxf outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        final xtf s0 = yxf.s0;
        e1 = outerCoordinator$ui.e1(e1, true);
        layoutNode.getOuterCoordinator$ui().n1((xxf)yxf.y0, e1, dkb, 1, b);
    }
    
    public void h(final int n, final Object o) {
    }
    
    public boolean i(final dkb dkb, final LayoutNode layoutNode) {
        return false;
    }
    
    public boolean j(final LayoutNode layoutNode) {
        final tsk i = layoutNode.I();
        int n = 0;
        if (i != null) {
            n = n;
            if (i.y) {
                n = 1;
            }
        }
        return (n ^ 0x1) != 0x0;
    }
    
    public Object k(final uy7 uy7) {
        switch (this.v) {
            default: {
                return new i9j(uy7.i((Class)vzq.class));
            }
            case 9: {
                final ArrayList list = new ArrayList((Collection)uy7.g(bmi.a((Class)vxc.class)));
                ao2.B("No delegate creator registered.", list.isEmpty() ^ true);
                Collections.sort((List)list, (Comparator)jna.A);
                return new wzq((Context)uy7.d((Class)Context.class), (vxc)list.get(0));
            }
        }
    }
    
    public void m(final tjc tjc, final Context context) {
    }
    
    public pdp p(final View view, final float n, final float n2) {
        return null;
    }
    
    public pdp q(final View view, final float n, final float n2) {
        return null;
    }
    
    public HttpURLConnection r(final String s) {
        final StringBuilder sb = new StringBuilder("https://");
        sb.append(s);
        sb.append("/b");
        final HttpURLConnection n = n(sb.toString());
        ((URLConnection)n).setRequestProperty("Content-Type", "text/plain");
        ((URLConnection)n).setRequestProperty("Content-Encoding", "gzip");
        ((URLConnection)n).setDoOutput(true);
        n.setChunkedStreamingMode(0);
        return n;
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 8: {
                return "TextFieldLineLimits.SingleLine";
            }
        }
    }
}
