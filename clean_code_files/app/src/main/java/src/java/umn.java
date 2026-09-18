import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import androidx.compose.foundation.b;

public final class umn
{
    public final ksg a;
    public og0 b;
    public final v8m c;
    
    public umn(final og0 og0) {
        this.a = o50.Q((Object)null);
        this.b = og0.a((lta)new jkn((byte)5));
        this.c = new v8m();
    }
    
    public static ng0 c(final ng0 ng0, final omn omn) {
        final vjf b = omn.b;
        final int c = b.c(b.f - 1, false);
        if (ng0.b < c) {
            return ng0.a(ng0, (kg0)null, 0, Math.min(ng0.c, c), 11);
        }
        return null;
    }
    
    public final void a(final int n, final gva gva) {
        gva.i0(1154651354);
        int n2;
        if (gva.h((Object)this)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        final boolean b = false;
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            final vyo vyo = (vyo)gva.j((sei)hm6.t);
            final og0 b2 = this.b;
            final List b3 = b2.b(b2.w.length());
            final int size = ((Collection)b3).size();
            int i = 0;
            boolean b4 = b;
            while (i < size) {
                final ng0 ng0 = (ng0)b3.get(i);
                final int b5 = ng0.b;
                final Object a = ng0.a;
                if (b5 != ng0.c) {
                    gva.g0(725478935);
                    final Object r = gva.R();
                    final cib a2 = bi6.a;
                    llf g;
                    if ((g = (llf)r) == a2) {
                        g = oz1.g(gva);
                    }
                    final llf llf = g;
                    final igf f = zrn.F((igf)fgf.v, (lta)new tyl((Object)this, (Object)ng0, (byte)11));
                    Object r2;
                    if ((r2 = gva.R()) == a2) {
                        r2 = new jkn((byte)6);
                        gva.q0(r2);
                    }
                    final igf d = c5q.D(wsk.b((lta)r2, f, b4).E((igf)new enn(new oe6((Object)this, (Object)ng0, (byte)8))), llf);
                    neh.a.getClass();
                    final igf f2 = x90.F(d, x90.f);
                    final boolean h = gva.h((Object)this);
                    final boolean f3 = gva.f((Object)ng0);
                    final boolean h2 = gva.h((Object)vyo);
                    final Object r3 = gva.R();
                    Object o;
                    if ((h | f3 | h2) || (o = r3) == a2) {
                        o = new kkk(this, ng0, vyo);
                        gva.q0(o);
                    }
                    rj2.a(androidx.compose.foundation.b.d(f2, llf, false, (iuj)null, (jta)null, (jta)o, 508), gva, 0);
                    final vdd vdd = (vdd)a;
                    final vmn b6 = vdd.b();
                    if (b6 == null || (b6.a == null && b6.b == null && b6.c == null && b6.d == null)) {
                        gva.g0(728331710);
                        gva.q(false);
                    }
                    else {
                        gva.g0(726303039);
                        Object r4;
                        if ((r4 = gva.R()) == a2) {
                            r4 = new ted(llf);
                            gva.q0(r4);
                        }
                        final ted ted = (ted)r4;
                        Object r5 = gva.R();
                        Object d2 = null;
                        if (r5 == a2) {
                            r5 = new khn((byte)2, null, ted);
                            gva.q0(r5);
                        }
                        mlc.f((zta)r5, gva, (Object)lqo.a);
                        final hsg b7 = ted.b;
                        final hsg b8 = ted.b;
                        final boolean b9 = (b7.h() & 0x2) != 0x0;
                        final boolean b10 = (b8.h() & 0x1) != 0x0;
                        final boolean b11 = (b8.h() & 0x4) != 0x0;
                        final vmn b12 = vdd.b();
                        hcm a3;
                        if (b12 != null) {
                            a3 = b12.a;
                        }
                        else {
                            a3 = null;
                        }
                        final vmn b13 = vdd.b();
                        hcm b14;
                        if (b13 != null) {
                            b14 = b13.b;
                        }
                        else {
                            b14 = null;
                        }
                        final vmn b15 = vdd.b();
                        hcm c;
                        if (b15 != null) {
                            c = b15.c;
                        }
                        else {
                            c = null;
                        }
                        final vmn b16 = vdd.b();
                        if (b16 != null) {
                            d2 = b16.d;
                        }
                        final boolean h3 = gva.h((Object)this);
                        final boolean f4 = gva.f((Object)ng0);
                        final Object r6 = gva.R();
                        Object o2;
                        if ((h3 | f4) || (o2 = r6) == a2) {
                            o2 = new tyl(this, ng0, ted);
                            gva.q0(o2);
                        }
                        this.b(new Object[] { b9, b10, b11, a3, b14, c, d2 }, (lta)o2, gva, n3 << 6 & 0x380);
                        gva.q(false);
                    }
                    b4 = false;
                    gva.q(false);
                }
                else {
                    gva.g0(728345598);
                    gva.q(b4);
                }
                ++i;
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new f0l(this, n);
        }
    }
    
    public final void b(final Object[] array, final lta lta, final gva gva, final int n) {
        gva.i0(-2083052099);
        int n3;
        if ((n & 0x30) == 0x0) {
            int n2;
            if (gva.h((Object)lta)) {
                n2 = 32;
            }
            else {
                n2 = 16;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x180) == 0x0) {
            int n5;
            if (gva.h((Object)this)) {
                n5 = 256;
            }
            else {
                n5 = 128;
            }
            n4 = (n3 | n5);
        }
        gva.d0(-358306546, (Object)array.length);
        final boolean d = gva.d(array.length);
        final boolean b = false;
        int n6;
        if (d) {
            n6 = 4;
        }
        else {
            n6 = 0;
        }
        int n7 = n4 | n6;
        for (int length = array.length, i = 0; i < length; ++i) {
            int n8;
            if (gva.h(array[i])) {
                n8 = 4;
            }
            else {
                n8 = 0;
            }
            n7 |= n8;
        }
        gva.q(false);
        int n9 = n7;
        if ((n7 & 0xE) == 0x0) {
            n9 = (n7 | 0x2);
        }
        if (gva.W(n9 & 0x1, (n9 & 0x93) != 0x92)) {
            final hdk hdk = new hdk(2);
            final ArrayList list = (ArrayList)hdk.v;
            hdk.a((Object)lta);
            hdk.c((Object)array);
            final Object[] array2 = list.toArray(new Object[list.size()]);
            final boolean h = gva.h((Object)this);
            boolean b2 = b;
            if ((n9 & 0x70) == 0x20) {
                b2 = true;
            }
            final Object r = gva.R();
            Object o;
            if ((h | b2) || (o = r) == bi6.a) {
                o = new ly1(this, lta, (byte)1);
                gva.q0(o);
            }
            mlc.d(array2, (lta)o, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wf0(n, (Object)this, (Object)array, (Object)lta, (byte)16);
        }
    }
}
