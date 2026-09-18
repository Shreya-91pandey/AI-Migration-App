import java.util.Collection;
import java.util.WeakHashMap;
import android.view.ViewParent;
import android.view.View;
import android.graphics.Rect;
import java.util.Collections;
import android.os.Build$VERSION;
import java.util.List;
import android.view.View$OnAttachStateChangeListener;

public final class gec extends g66 implements Runnable, u7g, View$OnAttachStateChangeListener
{
    public final tmf A;
    public final hsg B;
    public final emf C;
    public final v8m D;
    public boolean x;
    public int y;
    public h2q z;
    
    public gec() {
        super(1);
        final tmf a = new tmf(9);
        n2q.a.getClass();
        a.m((Object)m2q.b, (Object)new d3q("caption bar"));
        a.m((Object)m2q.c, (Object)new d3q("display cutout"));
        a.m((Object)m2q.d, (Object)new d3q("ime"));
        a.m((Object)m2q.e, (Object)new d3q("mandatory system gestures"));
        a.m((Object)m2q.f, (Object)new d3q("navigation bars"));
        a.m((Object)m2q.g, (Object)new d3q("status bars"));
        a.m((Object)m2q.h, (Object)new d3q("system gestures"));
        a.m((Object)m2q.i, (Object)new d3q("tappable element"));
        a.m((Object)m2q.j, (Object)new d3q("waterfall"));
        this.A = a;
        this.B = new hsg(0);
        this.C = new emf(4);
        this.D = new v8m();
    }
    
    public final void a(final l1q l1q) {
        final boolean b = false;
        this.x = false;
        final int d = l1q.a.d();
        this.y &= ~d;
        this.z = null;
        final n2q n2q = (n2q)((sgc)p2q.a).b(d);
        if (n2q != null) {
            final Object g = this.A.g((Object)n2q);
            g.getClass();
            final d3q d3q = (d3q)g;
            d3q.c.i(0.0f);
            d3q.e.i(1.0f);
            d3q.d.i(0L);
            d3q.c.i(0.0f);
            d3q.b.setValue(Boolean.FALSE);
            d3q.j = -1L;
            d3q.k = -1L;
            final hsg b2 = this.B;
            b2.i(b2.h() + 1);
            final Object c = g8m.c;
            synchronized (c) {
                final umf h = g8m.j.h;
                int n = b ? 1 : 0;
                if (h != null) {
                    final boolean h2 = h.h();
                    n = (b ? 1 : 0);
                    if (h2) {
                        n = 1;
                    }
                }
                monitorexit(c);
                if (n != 0) {
                    g8m.c();
                }
            }
        }
    }
    
    public final void b(final l1q l1q) {
        this.x = true;
    }
    
    public final h2q c(final h2q h2q, final List list) {
        for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
            final l1q l1q = (l1q)list.get(i);
            final n2q n2q = (n2q)((sgc)p2q.a).b(l1q.a.d());
            if (n2q != null) {
                final Object g = this.A.g((Object)n2q);
                g.getClass();
                final d3q d3q = (d3q)g;
                if (d3q.b.getValue()) {
                    final k1q a = l1q.a;
                    d3q.c.i(a.c());
                    d3q.e.i(a.a());
                    d3q.d.i(a.b());
                }
            }
        }
        this.g(h2q);
        return h2q;
    }
    
    public final vhk d(final l1q l1q, final vhk vhk) {
        final h2q z = this.z;
        final boolean b = false;
        this.x = false;
        this.z = null;
        if (l1q.a.b() > 0L && z != null) {
            final int d = l1q.a.d();
            this.y |= d;
            final n2q n2q = (n2q)((sgc)p2q.a).b(d);
            if (n2q != null) {
                final Object g = this.A.g((Object)n2q);
                g.getClass();
                final d3q d3q = (d3q)g;
                final dec i = z.a.i(d);
                final long k = (long)i.a << 48 | (long)i.b << 32 | (long)i.c << 16 | (long)i.d;
                final long h = d3q.h;
                if (!ncq.w(k, h)) {
                    d3q.j = h;
                    d3q.k = k;
                    d3q.b.setValue(Boolean.TRUE);
                    final k1q a = l1q.a;
                    d3q.c.i(a.c());
                    d3q.e.i(a.a());
                    d3q.d.i(a.b());
                    final hsg b2 = this.B;
                    b2.i(b2.h() + 1);
                    final Object c = g8m.c;
                    synchronized (c) {
                        final umf h2 = g8m.j.h;
                        int n = b ? 1 : 0;
                        if (h2 != null) {
                            final boolean h3 = h2.h();
                            n = (b ? 1 : 0);
                            if (h3) {
                                n = 1;
                            }
                        }
                        monitorexit(c);
                        if (n != 0) {
                            g8m.c();
                            return vhk;
                        }
                    }
                }
            }
        }
        return vhk;
    }
    
    public final void g(final h2q h2q) {
        final jlf a = p2q.a;
        final int[] b = ((sgc)a).b;
        Object[] c = ((sgc)a).c;
        long[] a2 = ((sgc)a).a;
        final int n = a2.length - 2;
        int n14;
        int n15;
        if (n >= 0) {
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            while (true) {
                long n5 = a2[n2];
                Object[] array2;
                long[] array3;
                if ((~n5 << 7 & n5 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int n6 = 8;
                    final int n7 = 8 - (~(n2 - n) >>> 31);
                    int n10;
                    int n13;
                    for (int i = 0; i < n7; ++i, n6 = n13, n3 = n10) {
                        if ((n5 & 0xFFL) < 128L) {
                            final int n8 = (n2 << 3) + i;
                            final int n9 = b[n8];
                            final n2q n2q = (n2q)c[n8];
                            final dec j = h2q.a.i(n9);
                            final long h = (long)j.a << 48 | (long)j.b << 32 | (long)j.c << 16 | (long)j.d;
                            final Object g = this.A.g((Object)n2q);
                            g.getClass();
                            final d3q d3q = (d3q)g;
                            n10 = n3;
                            int n11 = n4;
                            if (!ncq.w(h, d3q.h)) {
                                d3q.h = h;
                                final boolean w = ncq.w(h, 0L);
                                n10 = 1;
                                n11 = n4;
                                if (!w) {
                                    n11 = 1;
                                    n10 = n10;
                                }
                            }
                            if (n9 != 8) {
                                final dec k = h2q.a.j(n9);
                                final long l = (long)k.b << 32 | (long)k.a << 48 | (long)k.c << 16 | (long)k.d;
                                n4 = n11;
                                if (!ncq.w(d3q.i, l)) {
                                    d3q.i = l;
                                    final boolean w2 = ncq.w(l, 0L);
                                    final int n12 = n10 = 1;
                                    n4 = n11;
                                    if (!w2) {
                                        n4 = 1;
                                        n10 = n12;
                                    }
                                }
                            }
                            else {
                                n4 = n11;
                            }
                            d3q.a.setValue(h2q.a.u(n9));
                            n13 = 8;
                        }
                        else {
                            n10 = n3;
                            n13 = n6;
                        }
                        n5 >>= n13;
                    }
                    final long[] array = a2;
                    n14 = n3;
                    n15 = n4;
                    if (n7 != n6) {
                        break;
                    }
                    array2 = c;
                    array3 = array;
                }
                else {
                    final Object[] array4 = c;
                    array3 = a2;
                    array2 = array4;
                }
                n14 = n3;
                n15 = n4;
                if (n2 == n) {
                    break;
                }
                ++n2;
                final Object[] array5 = array2;
                a2 = array3;
                c = array5;
            }
        }
        else {
            n14 = 0;
            n15 = 0;
        }
        final yo8 h2 = h2q.a.h();
        long n16;
        if (h2 == null) {
            n16 = 0L;
        }
        else {
            final dec a3 = h2.a();
            n16 = ((long)a3.a << 48 | (long)a3.b << 32 | (long)a3.c << 16 | (long)a3.d);
        }
        final tmf a4 = this.A;
        n2q.a.getClass();
        final Object g2 = a4.g((Object)m2q.j);
        g2.getClass();
        final d3q d3q2 = (d3q)g2;
        d3q2.a.setValue(ncq.w(n16, 0L) ^ true);
        int n17 = n15;
        if (!ncq.w(d3q2.h, n16)) {
            d3q2.h = n16;
            d3q2.i = n16;
            final boolean w3 = ncq.w(n16, 0L);
            final int n18 = n14 = 1;
            n17 = n15;
            if (!w3) {
                n17 = 1;
                n14 = n18;
            }
        }
        int n19;
        if (h2 == null) {
            final emf c2 = this.C;
            n19 = n17;
            if (c2.b > 0) {
                c2.e();
                this.D.clear();
                n14 = 1;
                n19 = n17;
            }
        }
        else {
            List list;
            if (Build$VERSION.SDK_INT >= 28) {
                list = zh0.c(h2.a);
            }
            else {
                list = Collections.EMPTY_LIST;
            }
            final int size = list.size();
            final emf c3 = this.C;
            int n20;
            if (size < c3.b) {
                c3.m(list.size(), this.C.b);
                this.D.j(list.size(), this.D.size());
                n20 = 1;
            }
            else {
                final int size2 = list.size();
                final int b2 = this.C.b;
                int n21 = 0;
                n20 = n14;
                while (n21 < size2 - b2) {
                    final emf c4 = this.C;
                    c4.b((Object)o50.Q(list.get(c4.b)));
                    this.D.add(new mcc(smk.p(this.C.b, "display cutout rect ")));
                    ++n21;
                    n20 = 1;
                }
            }
            for (int size3 = ((Collection)list).size(), n22 = 0; n22 < size3; ++n22) {
                final Rect value = (Rect)list.get(n22);
                final bnf bnf = (bnf)this.C.g(n22);
                if (!mlc.q(((xom)bnf).getValue(), (Object)value)) {
                    bnf.setValue(value);
                    n20 = 1;
                }
            }
            n14 = n20;
            n19 = n17;
            if (!((Collection)list).isEmpty()) {
                n19 = 1;
                n14 = n20;
            }
        }
        if ((n19 != 0 || this.B.h() != 0) && n14 != 0) {
            final hsg b3 = this.B;
            b3.i(b3.h() + 1);
            final Object c5 = g8m.c;
            synchronized (c5) {
                final umf h3 = g8m.j.h;
                final boolean b4 = h3 != null && h3.h();
                monitorexit(c5);
                if (b4) {
                    g8m.c();
                }
            }
        }
    }
    
    public final h2q j(final View view, final h2q z) {
        if (this.x) {
            this.z = z;
            if (Build$VERSION.SDK_INT == 30) {
                view.post((Runnable)this);
                return z;
            }
        }
        else if (this.y == 0) {
            this.g(z);
        }
        return z;
    }
    
    public final void onViewAttachedToWindow(View view) {
        final ViewParent parent = view.getParent();
        View view2;
        if (parent instanceof View) {
            view2 = (View)parent;
        }
        else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        final WeakHashMap a = gap.a;
        w9p.c(view, (u7g)this);
        l1q.a(view, (g66)this);
    }
    
    public final void onViewDetachedFromWindow(View view) {
        final ViewParent parent = view.getParent();
        View view2;
        if (parent instanceof View) {
            view2 = (View)parent;
        }
        else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        final WeakHashMap a = gap.a;
        w9p.c(view, (u7g)null);
        l1q.a(view, (g66)null);
    }
    
    public final void run() {
        if (this.x) {
            this.y = 0;
            this.x = false;
            final h2q z = this.z;
            if (z != null) {
                this.g(z);
                this.z = null;
            }
        }
    }
}
