import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import androidx.compose.runtime.ComposeRuntimeError;

public abstract class ti6
{
    public static boolean a;
    public static final sbg b;
    public static final sbg c;
    public static final sbg d;
    public static final sbg e;
    public static final sbg f;
    
    static {
        b = new sbg("provider");
        c = new sbg("provider");
        d = new sbg("compositionLocalMap");
        e = new sbg("providers");
        f = new sbg("reference");
    }
    
    public static final void a(final String s) {
        throw new ComposeRuntimeError(hia.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", s, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }
    
    public static final Void b(final String s) {
        throw new ComposeRuntimeError(hia.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", s, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }
    
    public static final hif c(final yl6 yl6, iif o, final y5m y5m, final it0 it0) {
        cib a = bi6.a;
        v5m v5m = new v5m();
        if (y5m.e != null) {
            v5m.d();
        }
        if (y5m.f != null) {
            v5m.F = new jlf();
        }
        final int t = y5m.t;
        if (it0 != null && y5m.E(t) > 0) {
            int n;
            for (n = y5m.v; n > 0 && !y5m.x(n); n = y5m.F(y5m.b, n)) {}
            if (n >= 0 && y5m.x(n)) {
                final Object d = y5m.D(n);
                int i = n + 1;
                final int t2 = y5m.t(n);
                int n2 = 0;
                while (i < t2 + n) {
                    final int n3 = y5m.t(i) + i;
                    if (n3 > t) {
                        break;
                    }
                    int e;
                    if (y5m.x(i)) {
                        e = 1;
                    }
                    else {
                        e = y5m.E(i);
                    }
                    n2 += e;
                    i = n3;
                }
                int e2;
                if (y5m.x(t)) {
                    e2 = 1;
                }
                else {
                    e2 = y5m.E(t);
                }
                it0.b(d);
                it0.e(n2, e2);
                it0.g();
            }
        }
        bva a2 = o.a();
        v5m v5m3;
        if (a2.a()) {
            yl6.getClass();
            Object v;
            if (yl6.I.e > 0) {
                final ArrayList list = new ArrayList();
                final tmf j = yl6.I;
                long[] a3 = j.a;
                int n4 = a3.length - 2;
                if (n4 >= 0) {
                    int n5 = 0;
                    while (true) {
                        long n6 = a3[n5];
                        bva bva2;
                        long[] array;
                        cib cib2;
                        v5m v5m4;
                        if ((~n6 << 7 & n6 & 0x8080808080808080L) != 0x8080808080808080L) {
                            int n7 = 8;
                            final int n8 = 8 - (~(n5 - n4) >>> 31);
                            int k = 0;
                            final bva bva = a2;
                            while (k < n8) {
                                int n20;
                                int n23;
                                if ((n6 & 0xFFL) < 128L) {
                                    final int n9 = (n5 << 3) + k;
                                    final Object o2 = j.b[n9];
                                    final Object o3 = j.c[n9];
                                    o2.getClass();
                                    int n19;
                                    boolean g = false;
                                    if (o3 instanceof umf) {
                                        final umf umf = (umf)o3;
                                        final Object[] b = umf.b;
                                        final long[] a4 = umf.a;
                                        final int n10 = a4.length - 2;
                                        int n18;
                                        if (n10 >= 0) {
                                            int n11 = 0;
                                            int n12 = n7;
                                            while (true) {
                                                long n13 = a4[n11];
                                                int n17;
                                                if ((~n13 << 7 & n13 & 0x8080808080808080L) != 0x8080808080808080L) {
                                                    final int n14 = 8 - (~(n11 - n10) >>> 31);
                                                    for (int l = 0; l < n14; ++l) {
                                                        if ((n13 & 0xFFL) < 128L) {
                                                            final int n15 = (n11 << 3) + l;
                                                            final Object o4 = b[n15];
                                                            final b0j b0j = (b0j)o2;
                                                            final bva c = b0j.c;
                                                            if (c != null) {
                                                                final bva f = r6k.f(bva);
                                                                final bva f2 = r6k.f(c);
                                                                final int c2 = y5m.c(f);
                                                                final int n16 = y5m.b[c2 * 5 + 3];
                                                                final int a5 = f2.a;
                                                                if (c2 <= a5 && a5 < n16 + c2) {
                                                                    list.add((Object)new yog((Object)b0j, o4));
                                                                    umf.m(n15);
                                                                }
                                                            }
                                                        }
                                                        n13 >>= n12;
                                                    }
                                                    n17 = (n18 = n4);
                                                    n19 = k;
                                                    if (n14 != n12) {
                                                        break;
                                                    }
                                                }
                                                else {
                                                    n17 = n4;
                                                }
                                                n18 = n17;
                                                n19 = k;
                                                if (n11 == n10) {
                                                    break;
                                                }
                                                ++n11;
                                                n12 = 8;
                                                n4 = n17;
                                            }
                                        }
                                        else {
                                            n18 = n4;
                                            n19 = k;
                                        }
                                        g = umf.g();
                                        n20 = n18;
                                    }
                                    else {
                                        final int n21 = n4;
                                        n19 = k;
                                        o3.getClass();
                                        final b0j b0j2 = (b0j)o2;
                                        final bva c3 = b0j2.c;
                                        Label_0864: {
                                            if (c3 != null) {
                                                final bva f3 = r6k.f(bva);
                                                final bva f4 = r6k.f(c3);
                                                final int c4 = y5m.c(f3);
                                                final int n22 = y5m.b[c4 * 5 + 3];
                                                final int a6 = f4.a;
                                                if (c4 <= a6 && a6 < n22 + c4) {
                                                    list.add((Object)new yog((Object)b0j2, o3));
                                                    g = true;
                                                    break Label_0864;
                                                }
                                            }
                                            g = false;
                                        }
                                        n20 = n21;
                                    }
                                    if (g) {
                                        j.l(n9);
                                    }
                                    n7 = 8;
                                    n23 = n19;
                                }
                                else {
                                    n23 = k;
                                    n20 = n4;
                                }
                                n6 >>= n7;
                                ++n23;
                                n4 = n20;
                                k = n23;
                            }
                            bva2 = bva;
                            final cib cib = a;
                            final v5m v5m2 = v5m;
                            v = list;
                            a = cib;
                            v5m3 = v5m2;
                            if (n8 != n7) {
                                break;
                            }
                            array = a3;
                            cib2 = cib;
                            v5m4 = v5m2;
                        }
                        else {
                            array = a3;
                            v5m4 = v5m;
                            cib2 = a;
                            bva2 = a2;
                        }
                        v = list;
                        a = cib2;
                        v5m3 = v5m4;
                        if (n5 == n4) {
                            break;
                        }
                        ++n5;
                        a2 = bva2;
                        a = cib2;
                        v5m = v5m4;
                        a3 = array;
                    }
                }
                else {
                    v5m3 = v5m;
                    v = list;
                }
            }
            else {
                v5m3 = v5m;
                v = r89.v;
            }
            o.h(c86.Z0((Collection)o.d(), (Iterable)v));
        }
        else {
            v5m3 = v5m;
        }
        Object o5 = v5m3.o();
        try {
            ((y5m)o5).d();
            ((y5m)o5).R(126665345, o.c(), false, a);
            y5m.y((y5m)o5);
            ((y5m)o5).T(o.f());
            final List c5 = y5m.C(r6k.f(o.a()), (y5m)o5);
            ((y5m)o5).M();
            ((y5m)o5).i();
            ((y5m)o5).j();
            ((y5m)o5).e(true);
            o5 = new hif(v5m3);
            if (!((Collection)c5).isEmpty()) {
                for (int size = ((Collection)c5).size(), n24 = 0; n24 < size; ++n24) {
                    final bva bva3 = (bva)c5.get(n24);
                    if (v5m3.r(bva3)) {
                        int a7 = v5m3.a(bva3);
                        final int d2 = x5m.d(v5m3.v, a7);
                        int length;
                        if (++a7 < v5m3.w) {
                            length = v5m3.v[a7 * 5 + 4];
                        }
                        else {
                            length = v5m3.x.length;
                        }
                        Object o6;
                        if (length - d2 > 0) {
                            o6 = v5m3.x[d2];
                        }
                        else {
                            o6 = a;
                        }
                        if (o6 instanceof b0j) {
                            final si6 si6 = new si6(yl6, o);
                            o = (iif)v5m3.o();
                            try {
                                x90.m((y5m)o, c5, (c0j)si6);
                                ((y5m)o).e(true);
                                return (hif)o5;
                            }
                            finally {
                                ((y5m)o).e(false);
                            }
                        }
                    }
                }
            }
            return (hif)o5;
        }
        finally {
            ((y5m)o5).e(false);
        }
    }
}
