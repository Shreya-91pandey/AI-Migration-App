import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public final class eun implements ojf
{
    public final ypg a;
    public final mun b;
    public final ksg c;
    public final ksg d;
    public final ksg e;
    
    public eun(final pqg pqg, final tun tun, final ypg a, final gun gun, final mun b) {
        this.a = a;
        this.b = b;
        this.c = o50.Q((Object)pqg);
        this.d = o50.Q((Object)tun);
        this.e = o50.Q((Object)gun);
    }
    
    @Override
    public final noe b(final ooe ooe, final List list, final long n) {
        final ArrayList list2 = (ArrayList)list;
        int i = 0;
        final goe goe = (goe)c86.I0((List)list2.get(0));
        final goe goe2 = (goe)c86.I0((List)list2.get(1));
        final goe goe3 = (goe)c86.I0((List)list2.get(2));
        final goe goe4 = (goe)c86.I0((List)list2.get(3));
        for (List subList = list2.subList(0, 3); i < ((Collection)subList).size(); ++i) {
            final List list3 = (List)subList.get(i);
            if (list3.size() > 1) {
                final goe goe5 = (goe)list3.get(1);
                return ooe.Y(gv6.i(n), gv6.h(n), (Map)s89.v, (lta)new cun(n, this, ooe, goe, goe2, goe3, goe4, goe5));
            }
        }
        final goe goe5 = (goe)c86.I0((List)list2.get(4));
        return ooe.Y(gv6.i(n), gv6.h(n), (Map)s89.v, (lta)new cun(n, this, ooe, goe, goe2, goe3, goe4, goe5));
    }
    
    public final ygd f(final ooe ooe, final gun gun, final goe goe, final tun tun, final goe goe2, final goe goe3, final long n, final lta lta) {
        final ygd a = lq6.A();
        final dun dun = new dun(tun, lta, this, a, goe, ooe, n, goe2, goe3);
        dun.b((Object)gun.a);
        dun.b((Object)oun.v);
        dun.b((Object)gun.b);
        return lq6.n(a);
    }
    
    public final pqg g() {
        return (pqg)this.c.getValue();
    }
    
    public final void h(final ygc j, final iqg iqg, final boolean b) {
        iqg.j = j;
        final lqg b2 = this.b.b(iqg.c);
        if (!b && !mlc.q((Object)iqg.d, (Object)awp.G)) {
            b2.f = iqg.i;
            return;
        }
        final ygc i = iqg.j;
        if (i != null) {
            if (!b2.g) {
                long b3;
                if (b2.h) {
                    b3 = b2.d;
                }
                else {
                    b3 = i.d();
                }
                b2.b = b3;
                long c;
                if (b2.h) {
                    c = b2.e;
                }
                else {
                    c = i.e();
                }
                b2.c = c;
                b2.g = true;
            }
            b2.d = i.d();
            b2.e = i.e();
            b2.h = true;
        }
    }
    
    public final void i(final ygc ygc, final int n, final iqg iqg, final List list, final boolean b) {
        iqg iqg2;
        if (list.isEmpty()) {
            iqg2 = null;
        }
        else {
            iqg2 = (iqg)list.get(0);
        }
        final oun c = iqg.c;
        final int c2 = ygc.c();
        iqg.f = c2;
        if (iqg2 != null) {
            this.h(ygc.a(ygc, 0, ygc.b + c2 + n, 0, 0, 13), iqg2, b);
        }
        this.h(ygc.a(ygc, 0, 0, 0, ygc.b + iqg.f, 7), iqg, b);
    }
    
    public final void j(final ygc ygc, final int n, final int n2, final List list, final ygd ygd, final boolean b) {
        if (!list.isEmpty()) {
            final int n3 = ygc.f() - (list.size() - 1) * n;
            final int size = ((Collection)list).size();
            final int n4 = 0;
            int i = 0;
            int n5 = 0;
            while (i < size) {
                n5 += ((iqg)list.get(i)).e;
                ++i;
            }
            if (n3 > n5) {
                final Iterator iterator = ((Iterable)list).iterator();
                if (!iterator.hasNext()) {
                    oyl.r();
                    return;
                }
                Object next = iterator.next();
                Object o;
                if (!iterator.hasNext()) {
                    o = next;
                }
                else {
                    int b2 = ((iqg)next).b;
                    do {
                        final Object next2 = iterator.next();
                        final byte b3 = ((iqg)next2).b;
                        o = next;
                        int n6;
                        if ((n6 = b2) < b3) {
                            o = next2;
                            n6 = b3;
                        }
                        next = o;
                        b2 = n6;
                    } while (iterator.hasNext());
                }
                final iqg iqg = (iqg)o;
                iqg.e += n3 - n5;
            }
            else if (n3 < n5) {
                final float n7 = n3 / (float)n5;
                for (int size2 = ((Collection)list).size(), j = 0; j < size2; ++j) {
                    final iqg iqg2 = (iqg)list.get(j);
                    iqg2.e *= (int)n7;
                }
            }
            int a = ygc.a;
            for (int size3 = ((Collection)list).size(), k = n4; k < size3; ++k) {
                final iqg iqg3 = (iqg)list.get(k);
                final int e = iqg3.e;
                this.i(new ygc(a, ygc.b, a + e, ygc.d), n2, iqg3, (List)ygd, b);
                a += e + n;
            }
        }
    }
}
