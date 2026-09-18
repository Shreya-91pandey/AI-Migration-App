import java.util.Collection;
import android.net.ConnectivityManager;
import android.os.Build$VERSION;
import java.util.ArrayList;

public final class ddb
{
    public final ArrayList a;
    
    public ddb(final byte b) {
        switch (b) {
            default: {
                this.a = new ArrayList(20);
                return;
            }
            case 1: {
                this.a = new ArrayList(32);
            }
        }
    }
    
    public ddb(final ddo ddo) {
        final int a = n4q.a;
        final cv6 b = ddo.b;
        final ttf d = ddo.d;
        final ArrayList a2 = lq6.a0((Object[])new bv6[] { (bv6)new qz1(b, (byte)0), (bv6)new qz1((cv6)ddo.c, (byte)1), (bv6)new qz1(ddo.e, (byte)2) });
        if (Build$VERSION.SDK_INT >= 28) {
            final Object systemService = ddo.a.getSystemService("connectivity");
            systemService.getClass();
            a2.add((Object)new ltf((ConnectivityManager)systemService));
        }
        else {
            d.getClass();
            a2.addAll((Collection)lq6.Y((Object[])new vv1[] { (vv1)new osf(d, (byte)0), (vv1)new osf(d, (byte)1), (vv1)new itf(d), (vv1)new etf(d) }));
        }
        this.a = a2;
    }
    
    public void a(final String s, final String s2) {
        t08.R(s);
        t08.S(s2, s);
        t08.u(this, s, s2);
    }
    
    public void b() {
        this.a.add((Object)ovg.c);
    }
    
    public void c(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.a.add((Object)new pvg(n, n2, n3, n4, n5, n6));
    }
    
    public void d(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.a.add((Object)new xvg(n, n2, n3, n4, n5, n6));
    }
    
    public void e(final float n) {
        this.a.add((Object)new qvg(n));
    }
    
    public void f(final float n) {
        this.a.add((Object)new yvg(n));
    }
    
    public void g(final float n, final float n2) {
        this.a.add((Object)new rvg(n, n2));
    }
    
    public void h(final float n, final float n2) {
        this.a.add((Object)new zvg(n, n2));
    }
    
    public void i(final float n, final float n2) {
        this.a.add((Object)new svg(n, n2));
    }
    
    public void j(final String s) {
        int n = 0;
        while (true) {
            final ArrayList a = this.a;
            if (n >= a.size()) {
                break;
            }
            int n2 = n;
            if (s.equalsIgnoreCase((String)a.get(n))) {
                a.remove(n);
                a.remove(n);
                n2 = n - 2;
            }
            n = n2 + 2;
        }
    }
    
    public void k(final String s, final String s2) {
        t08.R(s);
        t08.S(s2, s);
        this.j(s);
        t08.u(this, s, s2);
    }
    
    public void l(final float n) {
        this.a.add((Object)new fwg(n));
    }
    
    public void m(final float n) {
        this.a.add((Object)new ewg(n));
    }
}
