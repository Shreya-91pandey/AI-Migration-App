import java.lang.ref.Reference;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;
import java.util.Map;
import androidx.compose.ui.node.LayoutNode;

public abstract class wxd extends o8h implements whf, jmg, ooe
{
    public static final avd N;
    public static final avd O;
    public uxd A;
    public lta B;
    public zta C;
    public lta D;
    public q8h E;
    public tmf F;
    public boolean G;
    public tmf H;
    public boolean I;
    public boolean J;
    public final xxd K;
    public kob L;
    public tmf M;
    
    static {
        N = new avd((byte)4);
        O = new avd((byte)5);
    }
    
    public wxd() {
        this.K = new xxd(this, (byte)0);
    }
    
    public static void G0(final yxf yxf) {
        final yxf s = yxf.S;
        final LayoutNode p = yxf.P;
        LayoutNode p2;
        if (s != null) {
            p2 = s.P;
        }
        else {
            p2 = null;
        }
        if (!mlc.q((Object)p2, (Object)p)) {
            p.t().p.S.f();
            return;
        }
        final nx g = p.t().p.g();
        if (g != null) {
            final j0d s2 = ((loe)g).S;
            if (s2 != null) {
                s2.f();
            }
        }
    }
    
    @Override
    public boolean A() {
        return this.x0().V();
    }
    
    public abstract long D0();
    
    @Override
    public final void E(final boolean b) {
        final wxd z0 = this.z0();
        LayoutNode x0;
        if (z0 != null) {
            x0 = z0.x0();
        }
        else {
            x0 = null;
        }
        if (mlc.q((Object)x0, (Object)this.x0())) {
            this.G = b;
            return;
        }
        final int n = 0;
        int v;
        if (x0 != null) {
            v = x0.v();
        }
        else {
            v = 0;
        }
        if (v != 3) {
            int v2 = n;
            if (x0 != null) {
                v2 = x0.v();
            }
            if (v2 != 4) {
                return;
            }
        }
        this.G = b;
    }
    
    public final uxd F0() {
        uxd a;
        if ((a = this.A) == null) {
            a = new uxd(this);
            this.A = a;
        }
        return a;
    }
    
    public final void H0(final umf umf) {
        final Object[] b = umf.b;
        final long[] a = umf.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final LayoutNode layoutNode = (LayoutNode)((Reference)b[(n2 << 3) + i]).get();
                            if (layoutNode != null) {
                                if (this.r0()) {
                                    layoutNode.q0(false);
                                }
                                else {
                                    layoutNode.s0(false);
                                }
                            }
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
    
    public abstract void I0();
    
    public final noe J0(final int n, final int n2, final Map map, final lta lta, final lta lta2) {
        if ((n & 0xFF000000) != 0x0 || (0xFF000000 & n2) != 0x0) {
            final StringBuilder sb = new StringBuilder("Size(");
            sb.append(n);
            sb.append(" x ");
            sb.append(n2);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            gac.c(sb.toString());
        }
        return (noe)new vxd(n, n2, map, lta, lta2, this);
    }
    
    public final void M0() {
        final kob l = this.L;
        if (l != null) {
            for (int a = l.a, i = 0; i < a; ++i) {
                ((wlb[])l.b)[i] = null;
                ((float[])l.c)[i] = Float.NaN;
                ((byte[])(Object)l.d)[i] = 0;
            }
            l.a = 0;
        }
        final tmf m = this.M;
        if (m == null) {
            return;
        }
        final Object[] c = m.c;
        final long[] a2 = m.a;
        final int n = a2.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a2[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int j = 0; j < n4; ++j) {
                        if ((0xFFL & n3) < 128L) {
                            this.H0((umf)c[(n2 << 3) + j]);
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
        m.a();
    }
    
    @Override
    public final int S(final hx hx) {
        if (this.v0()) {
            final int h0 = this.h0(hx);
            if (h0 != Integer.MIN_VALUE) {
                final boolean b = hx instanceof i8p;
                final long z = super.z;
                long n;
                if (b) {
                    n = z >> 32;
                }
                else {
                    n = (0xFFFFFFFFL & z);
                }
                return h0 + (int)n;
            }
        }
        return Integer.MIN_VALUE;
    }
    
    public final void f0(final LayoutNode layoutNode, final wlb wlb) {
        final tmf m = this.M;
        int n = 7;
        long n2 = -9187201950435737472L;
        int n24 = 0;
        long n25 = 0L;
        long n26 = 0L;
        Label_0518: {
            if (m != null) {
                final Object[] c = m.c;
                long[] a = m.a;
                final int n3 = a.length - 2;
                if (n3 >= 0) {
                    int n4 = 0;
                    long n5 = 128L;
                    while (true) {
                        int n6 = 8;
                        final long n7 = a[n4];
                        long n23;
                        long n27;
                        if ((~n7 << n & n7 & n2) != n2) {
                            final int n8 = 8 - (~(n4 - n3) >>> 31);
                            final int n9 = 0;
                            final long n10 = n2;
                            final int n11 = n;
                            int i = n9;
                            long n12 = n7;
                            while (i < n8) {
                                long[] array;
                                if ((n12 & 0xFFL) < n5) {
                                    final umf umf = (umf)c[(n4 << 3) + i];
                                    final Object[] b = umf.b;
                                    final long[] a2 = umf.a;
                                    final int n13 = a2.length - 2;
                                    long n20;
                                    if (n13 >= 0) {
                                        int n14 = 0;
                                        int n15 = n6;
                                        while (true) {
                                            long n16 = a2[n14];
                                            int n19;
                                            if ((~n16 << n11 & n16 & n10) != n10) {
                                                final int n17 = 8 - (~(n14 - n13) >>> 31);
                                                for (int j = 0; j < n17; ++j) {
                                                    if ((n16 & 0xFFL) < n5) {
                                                        final int n18 = (n14 << 3) + j;
                                                        final LayoutNode layoutNode2 = (LayoutNode)((Reference)b[n18]).get();
                                                        if (layoutNode2 == null || !layoutNode2.V()) {
                                                            umf.m(n18);
                                                        }
                                                    }
                                                    n16 >>= n15;
                                                }
                                                n19 = i;
                                                array = a;
                                                n20 = n12;
                                                i = n19;
                                                if (n17 != n15) {
                                                    break;
                                                }
                                            }
                                            else {
                                                n19 = i;
                                            }
                                            array = a;
                                            n20 = n12;
                                            i = n19;
                                            if (n14 == n13) {
                                                break;
                                            }
                                            ++n14;
                                            i = n19;
                                            n15 = 8;
                                        }
                                    }
                                    else {
                                        n20 = n12;
                                        array = a;
                                    }
                                    n6 = 8;
                                    n12 = n20;
                                }
                                else {
                                    array = a;
                                }
                                final int n21 = n6;
                                n12 >>= n6;
                                ++i;
                                a = array;
                                n6 = n21;
                            }
                            n = n11;
                            final long n22 = n10;
                            n23 = n5;
                            n24 = n;
                            n25 = n22;
                            n26 = n23;
                            if (n8 != n6) {
                                break Label_0518;
                            }
                            n27 = n22;
                        }
                        else {
                            final long n28 = n2;
                            n23 = n5;
                            n27 = n28;
                        }
                        n24 = n;
                        n25 = n27;
                        n26 = n23;
                        if (n4 == n3) {
                            break Label_0518;
                        }
                        ++n4;
                        final long n29 = n27;
                        n5 = n23;
                        n2 = n29;
                    }
                }
            }
            n24 = 7;
            n25 = -9187201950435737472L;
            n26 = 128L;
        }
        final tmf k = this.M;
        if (k != null) {
            final long[] a3 = k.a;
            final int n30 = a3.length - 2;
            if (n30 >= 0) {
                int n31 = 0;
                while (true) {
                    long n32 = a3[n31];
                    if ((~n32 << n24 & n32 & n25) != n25) {
                        final int n33 = 8 - (~(n31 - n30) >>> 31);
                        for (int l = 0; l < n33; ++l) {
                            if ((n32 & 0xFFL) < n26) {
                                final int n34 = (n31 << 3) + l;
                                final Object o = k.b[n34];
                                final umf umf2 = (umf)k.c[n34];
                                final wlb wlb2 = (wlb)o;
                                if (umf2.g()) {
                                    k.l(n34);
                                }
                            }
                            n32 >>= 8;
                        }
                        if (n33 != 8) {
                            break;
                        }
                    }
                    if (n31 == n30) {
                        break;
                    }
                    ++n31;
                }
            }
        }
        tmf m2;
        if ((m2 = this.M) == null) {
            m2 = new tmf();
            this.M = m2;
        }
        Object g;
        if ((g = m2.g((Object)wlb)) == null) {
            g = new umf();
            m2.m((Object)wlb, g);
        }
        ((umf)g).k((Object)new WeakReference((Object)layoutNode));
    }
    
    public abstract int h0(final hx p0);
    
    public final void m0(final q8h q8h, long n, long n2) {
        final tmf m = this.M;
        kob l;
        if ((l = this.L) == null) {
            l = new kob();
            this.L = l;
        }
        final Owner j = this.x0().J;
        if (j != null) {
            final lmg snapshotObserver = j.getSnapshotObserver();
            if (snapshotObserver != null) {
                snapshotObserver.a.d(q8h, (lta)wxd.N, (jta)new txd(this, n, n2, q8h));
            }
        }
        int r0 = this.r0() ? 1 : 0;
        final umf umf = (umf)l.e;
        final umf umf2 = (umf)l.f;
        for (int a = l.a, i = 0; i < a; ++i) {
            final byte b = ((byte[])(Object)l.d)[i];
            if (b == 3) {
                final wlb wlb = ((wlb[])l.b)[i];
                wlb.getClass();
                umf2.k((Object)wlb);
            }
            else if (b != 0 && m != null) {
                final wlb wlb2 = ((wlb[])l.b)[i];
                wlb2.getClass();
                final umf umf3 = (umf)m.k((Object)wlb2);
                if (umf3 != null) {
                    umf.j(umf3);
                }
            }
        }
        final int a2 = l.a;
        int k = 0;
        int n3 = 0;
        while (k < a2) {
            final byte[] array = (Object)l.d;
            int n4;
            if (array[k] == 2) {
                n4 = n3 + 1;
            }
            else if ((n4 = n3) > 0) {
                final wlb[] array2 = (wlb[])l.b;
                array2[k - n3] = array2[k];
                n4 = n3;
            }
            array[k] = 2;
            ++k;
            n3 = n4;
        }
        for (int a3 = l.a, n5 = a3 - n3; n5 < a3; ++n5) {
            ((wlb[])l.b)[n5] = null;
        }
        l.a -= n3;
        final wxd z0 = this.z0();
        final Object[] b2 = umf2.b;
        final long[] a4 = umf2.a;
        final int n6 = a4.length - 2;
        final int n7 = 7;
        n = -9187201950435737472L;
        int n13;
        int n14;
        if (n6 >= 0) {
            int n8 = 0;
            while (true) {
                final int n9 = 8;
                n2 = a4[n8];
                if ((~n2 << n7 & n2 & n) != n) {
                    final int n10 = 8 - (~(n8 - n6) >>> 31);
                    for (int n11 = 0; n11 < n10; ++n11) {
                        if ((n2 & 0xFFL) < 128L) {
                            final wlb wlb3 = (wlb)b2[(n8 << 3) + n11];
                            wxd wxd;
                            if (z0 == null) {
                                wxd = this;
                            }
                            else {
                                wxd = z0;
                            }
                            wxd wxd2 = wxd;
                            while (true) {
                                final kob l2 = wxd2.L;
                                if (l2 != null && iw0.G0((Object[])l2.b, (Object)wlb3)) {
                                    break;
                                }
                                final wxd z2 = wxd2.z0();
                                if (z2 == null) {
                                    break;
                                }
                                wxd2 = z2;
                            }
                            final int n12 = r0;
                            final tmf m2 = wxd2.M;
                            umf umf4;
                            if (m2 != null) {
                                umf4 = (umf)m2.k((Object)wlb3);
                            }
                            else {
                                umf4 = null;
                            }
                            r0 = n12;
                            if (umf4 != null) {
                                wxd.H0(umf4);
                                r0 = n12;
                            }
                        }
                        n2 >>= n9;
                    }
                    n2 = n;
                    n13 = r0;
                    n14 = n7;
                    if (n10 != n9) {
                        break;
                    }
                }
                n2 = n;
                n13 = r0;
                n14 = n7;
                if (n8 == n6) {
                    break;
                }
                ++n8;
            }
        }
        else {
            n14 = 7;
            n2 = -9187201950435737472L;
            n13 = r0;
        }
        umf2.b();
        final Object[] b3 = umf.b;
        final long[] a5 = umf.a;
        final int n15 = a5.length - 2;
        if (n15 >= 0) {
            int n16 = 0;
            while (true) {
                n = a5[n16];
                if ((~n << n14 & n & n2) != n2) {
                    final int n17 = 8 - (~(n16 - n15) >>> 31);
                    int n18 = 0;
                Label_0842_Outer:
                    while (n18 < n17) {
                        if ((n & 0xFFL) < 128L) {
                            final LayoutNode layoutNode = (LayoutNode)((Reference)b3[(n16 << 3) + n18]).get();
                            if (layoutNode != null) {
                                if (n13 != 0) {
                                    layoutNode.q0(false);
                                }
                                else {
                                    layoutNode.s0(false);
                                }
                            }
                        }
                        while (true) {
                            n >>= 8;
                            ++n18;
                            continue Label_0842_Outer;
                            continue;
                        }
                    }
                    if (n17 != 8) {
                        break;
                    }
                }
                if (n16 == n15) {
                    break;
                }
                ++n16;
            }
        }
        umf.b();
    }
    
    public final void n0(final noe v) {
        if (!this.J) {
            final lta g = v.g();
            final zta f = v.f();
            final lta e = v.e();
            final long n = 0L;
            if (f != null) {
                if (f != this.C || e != this.D) {
                    this.C = f;
                    this.D = e;
                    this.M0();
                    return;
                }
                final tmf h = this.H;
                long n2 = -9187201950435737472L;
                final int n3 = 8;
                uxd uxd3;
                long n9;
                if (h != null) {
                    final Object[] c = h.c;
                    final long[] a = h.a;
                    final int n4 = a.length - 2;
                    if (n4 >= 0) {
                        int n5 = 0;
                        uxd uxd = null;
                        while (true) {
                            long n6 = a[n5];
                            long n8;
                            if ((~n6 << 7 & n6 & n2) != n2) {
                                final int n7 = 8 - (~(n5 - n4) >>> 31);
                                for (int i = 0; i < n7; ++i) {
                                    if ((n6 & 0xFFL) < 128L) {
                                        final uxd uxd2 = (uxd)c[(n5 << 3) + i];
                                        if (uxd2.v) {
                                            uxd = uxd2;
                                        }
                                    }
                                    n6 >>= 8;
                                }
                                n8 = n2;
                                uxd3 = uxd;
                                n9 = n8;
                                if (n7 != 8) {
                                    break;
                                }
                            }
                            else {
                                n8 = n2;
                            }
                            uxd3 = uxd;
                            n9 = n8;
                            if (n5 == n4) {
                                break;
                            }
                            ++n5;
                            n2 = n8;
                        }
                    }
                    else {
                        n9 = -9187201950435737472L;
                        uxd3 = null;
                    }
                }
                else {
                    n9 = -9187201950435737472L;
                    uxd3 = null;
                }
                if (uxd3 != null) {
                    final nzc u0 = this.u0();
                    final long r = zrn.R(u0.t(0L));
                    final long k = u0.k();
                    if (!ugc.b(r, uxd3.w) || !chc.b(k, uxd3.x)) {
                        final tmf h2 = this.H;
                        if (h2 != null) {
                            final Object[] b = h2.b;
                            final Object[] c2 = h2.c;
                            final long[] a2 = h2.a;
                            final int n10 = a2.length - 2;
                            if (n10 >= 0) {
                                int n11 = 0;
                                final int n12 = n3;
                                final int n13 = n10;
                                while (true) {
                                    long n14 = a2[n11];
                                    if ((~n14 << 7 & n14 & n9) != n9) {
                                        final int n15 = 8 - (~(n11 - n13) >>> 31);
                                        for (int j = 0; j < n15; ++j) {
                                            if ((n14 & 0xFFL) < 128L) {
                                                final int n16 = (n11 << 3) + j;
                                                final Object o = b[n16];
                                                final uxd uxd4 = (uxd)c2[n16];
                                                final wlb wlb = (wlb)o;
                                                final boolean b2 = uxd4.v && (!chc.b(uxd4.x, k) || !ugc.b(uxd4.w, r));
                                                uxd4.x = k;
                                                uxd4.w = r;
                                                uxd4.v = false;
                                                if (b2) {
                                                    final kob l = this.L;
                                                    if (l != null) {
                                                        l.a(wlb);
                                                    }
                                                    final tmf m = this.M;
                                                    umf umf;
                                                    if (m != null) {
                                                        umf = (umf)m.g((Object)wlb);
                                                    }
                                                    else {
                                                        umf = null;
                                                    }
                                                    if (umf != null) {
                                                        this.H0(umf);
                                                        umf.b();
                                                    }
                                                }
                                            }
                                            n14 >>= n12;
                                        }
                                        if (n15 != n12) {
                                            break;
                                        }
                                    }
                                    if (n11 == n13) {
                                        break;
                                    }
                                    ++n11;
                                }
                            }
                        }
                    }
                }
            }
            else {
                final long n17 = 9223372034707292159L;
                if (g == null) {
                    this.M0();
                    this.B = null;
                    this.C = null;
                    this.D = null;
                    final uxd a3 = this.A;
                    if (a3 != null) {
                        a3.v = false;
                    }
                    if (a3 != null) {
                        a3.w = 9223372034707292159L;
                    }
                }
                else {
                    final int n18 = 0;
                    this.C = null;
                    this.D = null;
                    int n20;
                    final int n19 = n20 = ((this.B != g) ? 1 : 0);
                    long r2 = n17;
                    long k2 = n;
                    if (n19 == 0) {
                        n20 = n19;
                        r2 = n17;
                        k2 = n;
                        if (this.F0().v) {
                            final nzc u2 = this.u0();
                            r2 = zrn.R(u2.t(0L));
                            k2 = u2.k();
                            int n21 = 0;
                            Label_0840: {
                                if (ugc.b(r2, this.F0().w)) {
                                    n21 = n18;
                                    if (chc.b(k2, this.F0().x)) {
                                        break Label_0840;
                                    }
                                }
                                n21 = 1;
                            }
                            n20 = n21;
                        }
                    }
                    if (n20 != 0) {
                        q8h e2 = this.E;
                        if (e2 != null) {
                            e2.v = v;
                        }
                        else {
                            e2 = new q8h(v, this, (wlb)null);
                            this.E = e2;
                        }
                        this.m0(e2, r2, k2);
                        this.B = v.g();
                    }
                }
            }
        }
    }
    
    public abstract wxd q0();
    
    public boolean r0() {
        return false;
    }
    
    public abstract nzc u0();
    
    public abstract boolean v0();
    
    public abstract LayoutNode x0();
    
    public abstract noe y0();
    
    public abstract wxd z0();
}
