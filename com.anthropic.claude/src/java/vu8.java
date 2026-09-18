import java.util.Collection;
import java.util.List;

public abstract class vu8 extends v98 implements teh, m8c, zl6, mv8
{
    public zhg L;
    public lta M;
    public boolean N;
    public llf O;
    public mn2 P;
    public ev8 Q;
    public boolean R;
    public boolean S;
    public yt8 T;
    public long U;
    public jxa V;
    public jxa W;
    public bu8 X;
    public au8 Y;
    public zt8 Z;
    public j9r a0;
    public zzc b0;
    public j04 c0;
    public l8c d0;
    
    public vu8(final lta m, final boolean n, final llf o, final zhg l) {
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.U = 0L;
    }
    
    public static void v1(final vu8 vu8, final peh peh, final long n, long n2, final int n3) {
        if ((n3 & 0x4) != 0x0) {
            n2 = 0L;
        }
        au8 y;
        if ((y = vu8.Y) == null) {
            y = new au8();
            vu8.Y = y;
        }
        y.t(peh);
        y.u(n);
        final j04 c0 = vu8.c0;
        final zhg l = vu8.L;
        if (c0 == null) {
            vu8.c0 = new j04(l, 2);
        }
        else {
            c0.M(l);
            final j04 c2 = vu8.c0;
            if (c2 != null) {
                c2.J(n2);
            }
        }
        y.v(false);
        vu8.a0 = (j9r)y;
    }
    
    public final Object A1(eu8 v, final h07 h07) {
        tu8 tu8 = null;
        Label_0049: {
            if (h07 instanceof tu8) {
                tu8 = (tu8)h07;
                final int z = tu8.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    tu8.z = z + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            tu8 = new tu8(this, h07);
        }
        final Object x = tu8.x;
        final int z2 = tu8.z;
        final pc7 v2 = pc7.v;
        eu8 eu8 = null;
        ev8 q2 = null;
        Label_0267: {
            ev8 w = null;
            Label_0262: {
                eu8 v3;
                if (z2 != 0) {
                    if (z2 != 1) {
                        if (z2 == 2) {
                            w = tu8.w;
                            v = tu8.v;
                            vt4.g0(x);
                            break Label_0262;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        v3 = tu8.v;
                        vt4.g0(x);
                    }
                }
                else {
                    vt4.g0(x);
                    final ev8 q = this.Q;
                    v3 = v;
                    if (q != null) {
                        final llf o = this.O;
                        v3 = v;
                        if (o != null) {
                            final dv8 dv8 = new dv8(q);
                            tu8.v = v;
                            tu8.z = 1;
                            v3 = v;
                            if (o.a((eic)dv8, (f07)tu8) == v2) {
                                return v2;
                            }
                        }
                    }
                }
                final ev8 w2 = new ev8();
                final llf o2 = this.O;
                eu8 = v3;
                q2 = w2;
                if (o2 == null) {
                    break Label_0267;
                }
                tu8.v = v3;
                tu8.w = w2;
                tu8.z = 2;
                if (o2.a((eic)w2, (f07)tu8) != v2) {
                    v = v3;
                    w = w2;
                    break Label_0262;
                }
                return v2;
            }
            eu8 = v;
            q2 = w;
        }
        this.Q = q2;
        this.x1(eu8.a());
        return lqo.a;
    }
    
    public final Object B1(final fu8 v, final h07 h07) {
        uu8 uu8 = null;
        Label_0049: {
            if (h07 instanceof uu8) {
                uu8 = (uu8)h07;
                final int y = uu8.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    uu8.y = y + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            uu8 = new uu8(this, h07);
        }
        final Object w = uu8.w;
        final int y2 = uu8.y;
        fu8 v2 = null;
        Label_0177: {
            if (y2 != 0) {
                if (y2 != 1) {
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2 = uu8.v;
                vt4.g0(w);
            }
            else {
                vt4.g0(w);
                final ev8 q = this.Q;
                v2 = v;
                if (q == null) {
                    break Label_0177;
                }
                final llf o = this.O;
                v2 = v;
                if (o != null) {
                    final fv8 fv8 = new fv8(q);
                    uu8.v = v;
                    uu8.y = 1;
                    final Object a = o.a((eic)fv8, (f07)uu8);
                    final pc7 v3 = pc7.v;
                    v2 = v;
                    if (a == v3) {
                        return v3;
                    }
                }
            }
            this.Q = null;
        }
        this.y1(v2);
        return lqo.a;
    }
    
    public final xd3 C1() {
        final mn2 p = this.P;
        if (p != null) {
            return (xd3)p;
        }
        en9.s("Events channel not initialized.");
        return null;
    }
    
    @Override
    public final void D(final o70 o70, final keh keh) {
        if (this.N) {
            l8c d0;
            if ((d0 = this.d0) == null) {
                d0 = new l8c(this);
                this.d0 = d0;
            }
            if (this.W == null) {
                final jxa e = o1r.e((ixa)d0);
                this.o1((t98)e);
                this.W = e;
            }
            final l8c d2 = this.d0;
            if (d2 != null) {
                d2.d(o70, keh);
            }
        }
    }
    
    public final zzc D1() {
        final zzc b0 = this.b0;
        if (b0 != null) {
            return b0;
        }
        en9.s("Velocity Tracker not initialized.");
        return null;
    }
    
    public final void E1(final long n, final peh peh) {
        this.U = l6g.i(this.U, n);
        jar.o(this.D1(), peh);
        ((stk)this.C1()).e((Object)new du8(n));
    }
    
    public final void F1(final peh peh, final peh peh2, long h) {
        if (this.b0 == null) {
            this.b0 = new zzc((byte)26);
        }
        jar.o(this.D1(), peh);
        h = l6g.h(peh2.e(), h);
        if (this.M.b(xeh.a(peh.j()))) {
            if (!this.R) {
                if (this.P == null) {
                    this.P = ao2.c(Integer.MAX_VALUE, 0, 6);
                }
                this.H1();
            }
            ((stk)this.C1()).e((Object)new eu8(h, 0));
        }
    }
    
    @Override
    public void G(final jeh jeh, final keh keh, long n) {
        final int n2 = 1;
        this.S = true;
        if (this.N) {
            if (this.V == null) {
                final jxa e = o1r.e((ixa)this);
                this.o1((t98)e);
                this.V = e;
            }
            Object o;
            if ((o = this.a0) == null) {
                if ((o = this.T) == null) {
                    o = new yt8();
                    this.T = (yt8)o;
                }
                this.a0 = (j9r)o;
            }
            final boolean b = o instanceof yt8;
            final keh v = keh.v;
            final keh w = keh.w;
            if (b) {
                final yt8 yt8 = (yt8)o;
                if (!jeh.a.isEmpty()) {
                    if (ccn.h(jeh, false)) {
                        final peh peh = (peh)c86.G0(jeh.a);
                        int q;
                        if (ru8.a[ge9.D(yt8.q())] == 1) {
                            if (!this.G1()) {
                                q = 1;
                            }
                            else {
                                q = 2;
                            }
                        }
                        else {
                            q = yt8.q();
                        }
                        yt8.t(q);
                        if (keh == v) {
                            if (q == 2) {
                                peh.a();
                                yt8.u(true);
                            }
                            yt8.v(true);
                        }
                        if (keh == w) {
                            if (q == 1) {
                                v1(this, peh, peh.d(), 0L, 12);
                                return;
                            }
                            if (yt8.r()) {
                                this.F1(peh, peh, 0L);
                                this.E1(0L, peh);
                                n = peh.d();
                                bu8 x;
                                if ((x = this.X) == null) {
                                    x = new bu8();
                                    this.X = x;
                                }
                                x.r(n);
                                this.a0 = (j9r)x;
                            }
                        }
                    }
                }
            }
            else {
                final boolean b2 = o instanceof au8;
                final keh x2 = keh.x;
                final peh peh2 = null;
                final peh peh3 = null;
                if (b2) {
                    final au8 au8 = (au8)o;
                    if (keh != v) {
                        final List a = jeh.a;
                        final int size = ((Collection)a).size();
                        int i = 0;
                        while (true) {
                            while (i < size) {
                                final Object value = a.get(i);
                                if (ri2.C(((peh)value).d(), au8.r())) {
                                    peh peh4 = null;
                                    Label_0515: {
                                        if ((peh4 = (peh)value) == null) {
                                            final int size2 = ((Collection)a).size();
                                            int j = 0;
                                            while (true) {
                                                while (j < size2) {
                                                    final Object value2 = a.get(j);
                                                    if (((peh)value2).f()) {
                                                        peh4 = (peh)value2;
                                                        if (peh4 == null) {
                                                            this.t1();
                                                            return;
                                                        }
                                                        au8.u(peh4.d());
                                                        break Label_0515;
                                                    }
                                                    else {
                                                        ++j;
                                                    }
                                                }
                                                final Object value2 = null;
                                                continue;
                                            }
                                        }
                                    }
                                    if (keh == w) {
                                        if (!peh4.l()) {
                                            if (i1r.h(peh4)) {
                                                final int size3 = ((Collection)a).size();
                                                int n3 = 0;
                                                Object value3;
                                                while (true) {
                                                    value3 = peh3;
                                                    if (n3 >= size3) {
                                                        break;
                                                    }
                                                    value3 = a.get(n3);
                                                    if (((peh)value3).f()) {
                                                        break;
                                                    }
                                                    ++n3;
                                                }
                                                final peh peh5 = (peh)value3;
                                                if (peh5 == null) {
                                                    this.t1();
                                                }
                                                else {
                                                    au8.u(peh5.d());
                                                }
                                            }
                                            else {
                                                final float h = qu8.h((jap)uoo.z(this, (sei)hm6.u), peh4.j());
                                                final j04 c0 = this.c0;
                                                if (c0 == null) {
                                                    en9.s("Touch slop detector not initialized.");
                                                    return;
                                                }
                                                n = j04.A(c0, i1r.q(peh4), h);
                                                if ((0x7FFFFFFF7FFFFFFFL & n) != 0x7FC000007FC00000L) {
                                                    final long k = l6g.i(this.U, i1r.p(peh4));
                                                    this.U = k;
                                                    final float n4 = (float)Math.atan2((double)Math.abs(Float.intBitsToFloat((int)(this.U & 0xFFFFFFFFL))), (double)Math.abs(Float.intBitsToFloat((int)(k >> 32)))) * 57.29578f;
                                                    final zhg l = this.L;
                                                    boolean b3 = false;
                                                    Label_0810: {
                                                        if (l != null) {
                                                            final nv8 a2 = tv8.a;
                                                            if ((l != zhg.w) ? (n4 <= 30.0f || n4 > 90.0f) : (n4 > 30.0f)) {
                                                                b3 = false;
                                                                break Label_0810;
                                                            }
                                                        }
                                                        b3 = true;
                                                    }
                                                    final Object o2 = new Object();
                                                    final fi2 fi2 = new fi2(n4, o2, (byte)3);
                                                    final nv8 a3 = tv8.a;
                                                    o1r.i((v98)this, (lta)new mv5((Object)fi2, (byte)14));
                                                    if (!b3 && ((x3j)o2).v) {
                                                        au8.v(true);
                                                    }
                                                    else {
                                                        peh4.a();
                                                        final peh q2 = au8.q();
                                                        q2.getClass();
                                                        this.F1(q2, peh4, n);
                                                        this.E1(n, peh4);
                                                        n = peh4.d();
                                                        bu8 x3;
                                                        if ((x3 = this.X) == null) {
                                                            x3 = new bu8();
                                                            this.X = x3;
                                                        }
                                                        x3.r(n);
                                                        this.a0 = (j9r)x3;
                                                    }
                                                }
                                                else {
                                                    au8.v(true);
                                                    this.U = l6g.i(this.U, i1r.q(peh4));
                                                }
                                            }
                                        }
                                        else {
                                            final peh q3 = au8.q();
                                            if (q3 == null) {
                                                en9.s("AwaitTouchSlop.initialDown was not initialized");
                                                return;
                                            }
                                            n = au8.r();
                                            final j04 c2 = this.c0;
                                            if (c2 == null) {
                                                en9.s("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                return;
                                            }
                                            this.u1(q3, n, c2);
                                        }
                                    }
                                    if (keh != x2 || !au8.s()) {
                                        return;
                                    }
                                    if (!peh4.l()) {
                                        au8.v(false);
                                        return;
                                    }
                                    final peh q4 = au8.q();
                                    if (q4 == null) {
                                        en9.s("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                    n = au8.r();
                                    final j04 c3 = this.c0;
                                    if (c3 != null) {
                                        this.u1(q4, n, c3);
                                        return;
                                    }
                                    en9.s("AwaitTouchSlop.touchSlopDetector was not initialized");
                                    return;
                                }
                                else {
                                    ++i;
                                }
                            }
                            final Object value = null;
                            continue;
                        }
                    }
                }
                else if (o instanceof zt8) {
                    final zt8 zt8 = (zt8)o;
                    if (keh == x2) {
                        final List a4 = jeh.a;
                        final int size4 = ((Collection)a4).size();
                        int n5 = 0;
                        int n6;
                        while (true) {
                            n6 = n2;
                            if (n5 >= size4) {
                                break;
                            }
                            if (((peh)a4.get(n5)).l()) {
                                n6 = 0;
                                break;
                            }
                            ++n5;
                        }
                        final int size5 = ((Collection)a4).size();
                        int n7 = 0;
                        while (n7 < size5) {
                            if (((peh)a4.get(n7)).f()) {
                                if (a4.isEmpty()) {
                                    break;
                                }
                                if (n6 == 0) {
                                    return;
                                }
                                n = ((peh)c86.G0(a4)).e();
                                final peh q5 = zt8.q();
                                q5.getClass();
                                n = l6g.h(n, q5.e());
                                final peh q6 = zt8.q();
                                if (q6 != null) {
                                    v1(this, q6, zt8.r(), n, 8);
                                    return;
                                }
                                en9.s("AwaitGesturePickup.initialDown was not initialized.");
                                return;
                            }
                            else {
                                ++n7;
                            }
                        }
                        this.t1();
                    }
                }
                else if (o instanceof bu8) {
                    final bu8 bu8 = (bu8)o;
                    if (keh == w) {
                        n = bu8.q();
                        final List a5 = jeh.a;
                        final int size6 = ((Collection)a5).size();
                        int n8 = 0;
                        while (true) {
                            while (n8 < size6) {
                                final Object value4 = a5.get(n8);
                                if (ri2.C(((peh)value4).d(), n)) {
                                    final peh peh6 = (peh)value4;
                                    if (peh6 == null) {
                                        return;
                                    }
                                    final boolean h2 = i1r.h(peh6);
                                    final cu8 a6 = cu8.a;
                                    if (h2) {
                                        final List a7 = jeh.a;
                                        final int size7 = ((Collection)a7).size();
                                        int n9 = 0;
                                        Object value5;
                                        while (true) {
                                            value5 = peh2;
                                            if (n9 >= size7) {
                                                break;
                                            }
                                            value5 = a7.get(n9);
                                            if (((peh)value5).f()) {
                                                break;
                                            }
                                            ++n9;
                                        }
                                        final peh peh7 = (peh)value5;
                                        if (peh7 == null) {
                                            if (!peh6.l() && i1r.h(peh6)) {
                                                final float f = ((jap)uoo.z(this, (sei)hm6.u)).f();
                                                jar.o(this.D1(), peh6);
                                                n = this.D1().d(iar.g(f, f));
                                                this.D1().y();
                                                ((stk)this.C1()).e((Object)new fu8(tv8.c(n)));
                                                this.S = false;
                                            }
                                            else {
                                                ((stk)this.C1()).e((Object)a6);
                                            }
                                            this.t1();
                                            return;
                                        }
                                        bu8.r(peh7.d());
                                        return;
                                    }
                                    else {
                                        if (peh6.l()) {
                                            ((stk)this.C1()).e((Object)a6);
                                            return;
                                        }
                                        if (l6g.d(i1r.q(peh6)) == 0.0f) {
                                            return;
                                        }
                                        this.E1(i1r.p(peh6), peh6);
                                        peh6.a();
                                        return;
                                    }
                                }
                                else {
                                    ++n8;
                                }
                            }
                            final Object value4 = null;
                            continue;
                        }
                    }
                }
                else {
                    en9.r();
                }
            }
        }
    }
    
    public boolean G1() {
        final chk m0 = ((lgk)this).m0;
        if (!m0.a.a()) {
            final w60 b = m0.b;
            if (b == null || !b.e()) {
                return false;
            }
        }
        return true;
    }
    
    public final void H1() {
        this.R = true;
        if (this.P == null) {
            this.P = ao2.c(Integer.MAX_VALUE, 0, 6);
        }
        rhc.G(this.c1(), null, 0, (zta)new fh((byte)14, (f07)null, (Object)this), 3);
    }
    
    public final void I1(final lta m, final boolean n, final llf o, final zhg l, boolean b) {
        this.M = m;
        final boolean n2 = this.N;
        final boolean b2 = true;
        if (n2 != n) {
            if (!(this.N = n)) {
                final jxa w = this.W;
                if (w != null) {
                    this.p1((t98)w);
                }
                final jxa v = this.V;
                if (v != null) {
                    this.p1((t98)v);
                }
                this.W = null;
                this.V = null;
                this.r1();
                this.d0 = null;
            }
            b = true;
        }
        if (!mlc.q(this.O, o)) {
            this.r1();
            this.O = o;
        }
        if (this.L != l) {
            this.L = l;
            b = b2;
        }
        if (b) {
            if (this.S) {
                this.t1();
                if (this.R) {
                    ((stk)this.C1()).e((Object)cu8.a);
                }
                this.b0 = null;
            }
            final l8c d0 = this.d0;
            if (d0 != null) {
                d0.f();
            }
        }
    }
    
    @Override
    public final void V() {
        if (this.S) {
            this.t1();
            if (this.R) {
                ((stk)this.C1()).e((Object)cu8.a);
            }
            this.b0 = null;
        }
        this.S = false;
    }
    
    @Override
    public final String d0() {
        if (this.N) {
            final j9r a0 = this.a0;
            if (a0 instanceof yt8) {
                if (!((yt8)a0).s()) {
                    return "idle";
                }
            }
            else if (!(a0 instanceof au8)) {
                if (!(a0 instanceof zt8)) {
                    if (a0 instanceof bu8) {
                        return "recognized";
                    }
                    return "idle";
                }
            }
            return "waiting";
        }
        return "idle";
    }
    
    @Override
    public final void h1() {
        this.R = false;
        this.r1();
        final jxa w = this.W;
        if (w != null) {
            this.p1((t98)w);
        }
        final jxa v = this.V;
        if (v != null) {
            this.p1((t98)v);
        }
        this.W = null;
        this.V = null;
    }
    
    @Override
    public final zhg n0() {
        return this.L;
    }
    
    public final void r1() {
        final ev8 q = this.Q;
        if (q != null) {
            final llf o = this.O;
            if (o != null) {
                o.b((eic)new dv8(q));
            }
            this.Q = null;
        }
    }
    
    public abstract Object s1(final nh6 p0, final fh p1);
    
    public final void t1() {
        this.U = 0L;
        yt8 t;
        if ((t = this.T) == null) {
            t = new yt8();
            this.T = t;
        }
        t.t(3);
        t.u(false);
        t.v(false);
        this.a0 = (j9r)t;
    }
    
    public final void u1(final peh peh, final long n, final j04 j04) {
        zt8 z;
        if ((z = this.Z) == null) {
            z = new zt8();
            this.Z = z;
        }
        z.s(peh);
        z.t(n);
        j04.K(j04);
        this.a0 = (j9r)z;
    }
    
    public final void w1(final gu8 gu8) {
        if (gu8 instanceof eu8 && !this.R) {
            this.R = true;
            this.H1();
        }
        ((stk)this.C1()).e((Object)gu8);
    }
    
    public void x1(final long n) {
    }
    
    @Override
    public final void y0() {
        final l8c d0 = this.d0;
        if (d0 != null) {
            d0.f();
        }
    }
    
    public void y1(final fu8 fu8) {
        if (!super.I) {
            return;
        }
        rhc.G(this.c1(), null, 0, (zta)new mr((Object)this, (Object)fu8, (f07)null, (byte)1), 3);
    }
    
    public final Object z1(final h07 h07) {
        Object o = null;
        Label_0047: {
            if (h07 instanceof su8) {
                final su8 su8 = (su8)h07;
                final int x = su8.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    su8.x = x + Integer.MIN_VALUE;
                    o = su8;
                    break Label_0047;
                }
            }
            o = new su8(this, h07);
        }
        final Object v = ((su8)o).v;
        final int x2 = ((su8)o).x;
        Label_0144: {
            if (x2 != 0) {
                if (x2 != 1) {
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vt4.g0(v);
            }
            else {
                vt4.g0(v);
                final ev8 q = this.Q;
                if (q == null) {
                    break Label_0144;
                }
                final llf o2 = this.O;
                if (o2 != null) {
                    final dv8 dv8 = new dv8(q);
                    ((su8)o).x = 1;
                    final Object a = o2.a((eic)dv8, (f07)o);
                    final pc7 v2 = pc7.v;
                    if (a == v2) {
                        return v2;
                    }
                }
            }
            this.Q = null;
        }
        this.y1(new fu8(0L));
        return lqo.a;
    }
}
