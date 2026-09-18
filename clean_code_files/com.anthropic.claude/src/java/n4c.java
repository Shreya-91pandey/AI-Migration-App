import java.util.List;
import java.util.ArrayList;

public final class n4c
{
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final m4c j;
    public boolean k;
    
    public n4c(String a, final float b, final float c, final float d, final float e, long h, int g, boolean h2, final int n) {
        if ((n & 0x1) != 0x0) {
            a = "";
        }
        if ((n & 0x20) != 0x0) {
            h = j86.h;
        }
        if ((n & 0x40) != 0x0) {
            g = 5;
        }
        if ((n & 0x80) != 0x0) {
            h2 = false;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = h;
        this.g = g;
        this.h = h2;
        (this.i = new ArrayList()).add((Object)(this.j = new m4c(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023)));
    }
    
    public static void b(final n4c n4c, final String s, final List list) {
        n4c.a(s, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list);
    }
    
    public static void d(final n4c n4c, final List list, int a, cam cam, cam cam2, float n, int a2, int a3, float n2, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            a = l6p.a;
            a = 0;
        }
        if ((n3 & 0x8) != 0x0) {
            cam = null;
        }
        if ((n3 & 0x20) != 0x0) {
            cam2 = null;
        }
        if ((n3 & 0x80) != 0x0) {
            n = 0.0f;
        }
        if ((n3 & 0x100) != 0x0) {
            a2 = l6p.a;
            a2 = 0;
        }
        if ((n3 & 0x200) != 0x0) {
            a3 = l6p.a;
            a3 = 0;
        }
        if ((n3 & 0x400) != 0x0) {
            n2 = 4.0f;
        }
        n4c.c(1.0f, 1.0f, n, n2, 0.0f, 1.0f, 0.0f, a, a2, a3, cam, cam2, "", list);
    }
    
    public final void a(final String s, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final List list) {
        if (this.k) {
            gac.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        this.i.add((Object)new m4c(s, n, n2, n3, n4, n5, n6, n7, list, 512));
    }
    
    public final void c(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final int n8, final int n9, final int n10, final qm2 qm2, final qm2 qm3, final String s, final List list) {
        if (this.k) {
            gac.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((m4c)oz1.h(1, this.i)).j.add((Object)new n6p(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, qm2, qm3, s, list));
    }
    
    public final o4c e() {
        if (this.k) {
            gac.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (this.i.size() > 1) {
            this.f();
        }
        final m4c j = this.j;
        final o4c o4c = new o4c(this.a, this.b, this.c, this.d, this.e, new k6p(j.a, j.b, j.c, j.d, j.e, j.f, j.g, j.h, j.i, j.j), this.f, this.g, this.h);
        this.k = true;
        return o4c;
    }
    
    public final void f() {
        if (this.k) {
            gac.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        final ArrayList i = this.i;
        final m4c m4c = (m4c)i.remove(i.size() - 1);
        ((m4c)oz1.h(1, i)).j.add((Object)new k6p(m4c.a, m4c.b, m4c.c, m4c.d, m4c.e, m4c.f, m4c.g, m4c.h, m4c.i, m4c.j));
    }
}
