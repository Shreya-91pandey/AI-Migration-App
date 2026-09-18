public final class uv2
{
    public final nmn a;
    
    public uv2(final nmn a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof uv2) {
                final nmn a = this.a;
                final og0 a2 = a.a;
                final nmn a3 = ((uv2)o).a;
                if (mlc.q((Object)a2, (Object)a3.a)) {
                    if (a.b.d(a3.b)) {
                        if (mlc.q((Object)a.c, (Object)a3.c)) {
                            if (a.d == a3.d) {
                                if (a.e == a3.e) {
                                    if (a.f == a3.f) {
                                        if (mlc.q((Object)a.g, (Object)a3.g)) {
                                            if (a.h == a3.h) {
                                                if (a.i == a3.i) {
                                                    if (gv6.c(a.j, a3.j)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final nmn a = this.a;
        final int hashCode = a.a.hashCode();
        final mnn b = a.b;
        final hcm a2 = b.a;
        final long b2 = a2.b;
        final wnn[] b3 = vnn.b;
        final int hashCode2 = Long.hashCode(b2);
        final zoa c = a2.c;
        final int n = 0;
        int v;
        if (c != null) {
            v = c.v;
        }
        else {
            v = 0;
        }
        final soa d = a2.d;
        int hashCode3;
        if (d != null) {
            hashCode3 = Integer.hashCode(d.a);
        }
        else {
            hashCode3 = 0;
        }
        final toa e = a2.e;
        int hashCode4;
        if (e != null) {
            hashCode4 = Integer.hashCode(e.a);
        }
        else {
            hashCode4 = 0;
        }
        final una f = a2.f;
        int hashCode5;
        if (f != null) {
            hashCode5 = f.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final String g = a2.g;
        int hashCode6;
        if (g != null) {
            hashCode6 = g.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int d2 = hia.d((((((hashCode2 * 31 + v) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31, a2.h, 31);
        final zw1 i = a2.i;
        int hashCode7;
        if (i != null) {
            hashCode7 = Float.hashCode(i.a);
        }
        else {
            hashCode7 = 0;
        }
        final tln j = a2.j;
        int hashCode8;
        if (j != null) {
            hashCode8 = j.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final jpd k = a2.k;
        int hashCode9;
        if (k != null) {
            hashCode9 = k.v.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final long l = a2.l;
        final int m = j86.i;
        final int d3 = hia.d((((d2 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31, l, 31);
        final nbh o = a2.o;
        int hashCode10;
        if (o != null) {
            hashCode10 = o.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final int hashCode11 = b.b.hashCode();
        final vbh c2 = b.c;
        int hashCode12 = n;
        if (c2 != null) {
            hashCode12 = c2.hashCode();
        }
        return Long.hashCode(a.j) + (a.i.hashCode() + (a.h.hashCode() + (a.g.hashCode() + hia.y(a.f, smk.l((smk.k(((hashCode11 + (d3 + hashCode10) * 31) * 31 + hashCode12 + hashCode * 31) * 31, 31, a.c) + a.d) * 31, 31, a.e), 31)) * 31) * 31) * 31;
    }
}
