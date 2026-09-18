import java.util.concurrent.CancellationException;
import android.content.ClipDescription;

public final class ykn
{
    public final d55 A;
    public final peo a;
    public final qmn b;
    public xc8 c;
    public final g66 d;
    public final oc7 e;
    public final lbh f;
    public y45 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public ccb k;
    public cy1 l;
    public final ksg m;
    public jta n;
    public jta o;
    public final ksg p;
    public final ksg q;
    public final ksg r;
    public final ksg s;
    public final ksg t;
    public final ksg u;
    public final ksg v;
    public rzl w;
    public int x;
    public vlh y;
    public final sd8 z;
    
    public ykn(final peo a, final qmn b, final xc8 c, final boolean i, final boolean j, final x9o d, final oc7 e, final lbh f, final y45 g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (g66)d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.i = i;
        this.j = j;
        this.m = o50.Q((Object)Boolean.TRUE);
        this.p = o50.Q((Object)new l6g(9205357640488583168L));
        this.q = o50.Q((Object)new l6g(9205357640488583168L));
        this.r = o50.Q((Object)null);
        this.s = o50.Q((Object)kkn.v);
        final Boolean booleanFalse = Boolean.FALSE;
        this.t = o50.Q((Object)false);
        this.u = o50.Q((Object)snn.v);
        this.v = o50.Q((Object)false);
        this.x = -1;
        this.z = r8m.b((jta)new px1(this, (byte)3));
        this.A = new d55(this.g);
    }
    
    public static final void k(final a4j a4j, final a4j a4j2, final ykn ykn) {
        if ((a4j.v & 0x7FFFFFFF7FFFFFFFL) != 0x7FC000007FC00000L) {
            a4j.v = 9205357640488583168L;
            a4j2.v = 9205357640488583168L;
            ykn.g();
        }
    }
    
    public static final void m(final a4j a4j, final a4j a4j2, final ykn ykn) {
        if ((a4j.v & 0x7FFFFFFF7FFFFFFFL) != 0x7FC000007FC00000L) {
            ykn.g();
            a4j.v = 9205357640488583168L;
            a4j2.v = 0L;
            ykn.x = -1;
        }
    }
    
    public final boolean A(long c) {
        final omn c2 = this.b.c();
        if (c2 != null) {
            final int g = c2.b.g(c);
            if (g != -1) {
                final peo a = this.a;
                final long g2 = a.g(g);
                final long i = a.i(g2);
                int n;
                if (dnn.d(g2) && dnn.d(i)) {
                    n = 1;
                }
                else if (!dnn.d(g2) && !dnn.d(i)) {
                    n = 3;
                }
                else if (dnn.d(g2) && !dnn.d(i)) {
                    n = 2;
                }
                else {
                    n = 4;
                }
                final int d = ge9.D(n);
                final jrk jrk = null;
                jrk value;
                final jrk jrk2 = value = null;
                Label_0167: {
                    if (d != 0) {
                        if (d != 1) {
                            if (d != 2) {
                                if (d != 3) {
                                    en9.r();
                                    return false;
                                }
                                value = jrk2;
                            }
                            else {
                                if (m3r.h(c, c2.c((int)(i >> 32)), c2.c((int)(i & 0xFFFFFFFFL))) >= 0) {
                                    c = (g2 & 0xFFFFFFFFL);
                                    value = jrk;
                                    break Label_0167;
                                }
                                value = jrk2;
                            }
                        }
                        else if (m3r.h(c, c2.c((int)(i >> 32)), c2.c((int)(i & 0xFFFFFFFFL))) < 0) {
                            value = new jrk(1, 1);
                        }
                        else {
                            value = new jrk(2, 2);
                        }
                    }
                    c = g2 >> 32;
                }
                final int n2 = (int)c;
                c = rhc.c(n2, n2);
                if (!dnn.c(c, a.a.d().y) || (value != null && !value.equals(a.e()))) {
                    a.n(c);
                    if (value != null) {
                        a.g.setValue((Object)value);
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void B() {
        final peo a = this.a;
        final iln a2 = a.a;
        final tdc b = a.b;
        a2.b.a().q();
        final ghn b2 = a2.b;
        zbq.r(b2, 0, b2.x.length());
        a2.b(b, true, 1);
        a2.g(true);
        a2.f(a2.b.z);
    }
    
    public final void C(final boolean b) {
        this.m.setValue((Object)b);
    }
    
    public final void D(final boolean b) {
        this.t.setValue((Object)b);
    }
    
    public final void E(final snn value) {
        this.u.setValue((Object)value);
    }
    
    public final Object F(final h07 h07) {
        Object o = null;
        Label_0049: {
            if (h07 instanceof wkn) {
                final wkn wkn = (wkn)h07;
                final int x = wkn.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    wkn.x = x + Integer.MIN_VALUE;
                    o = wkn;
                    break Label_0049;
                }
            }
            o = new wkn(this, h07);
        }
        final Object v = ((wkn)o).v;
        final int x2 = ((wkn)o).x;
        final ksg u = this.u;
        final snn v2 = snn.v;
        Label_0100: {
            if (x2 == 0) {
                break Label_0100;
            }
            Label_0092: {
                if (x2 != 1) {
                    break Label_0092;
                }
                Label_0143: {
                    try {
                        vt4.g0(v);
                        final Object o2 = v;
                        break Label_0143;
                    }
                    finally {
                        this.D(false);
                        if (u.getValue() != v2) {
                            this.w();
                        }
                        Label_0170: {
                            return lqo.a;
                        }
                        vt4.g0(v);
                        final rf0 rf0 = new rf0((byte)28, null, this);
                        ((wkn)o).x = 1;
                        final Object m = ien.m((f07)o, (zta)rf0);
                        final pc7 v3 = pc7.v;
                        final Object o2;
                        iftrue(Label_0143:)((o2 = m) != v3);
                        return v3;
                        final opc opc = (opc)o2;
                        this.D(false);
                        iftrue(Label_0170:)(u.getValue() == v2);
                        Block_8: {
                            break Block_8;
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this.w();
                        return lqo.a;
                    }
                }
            }
        }
    }
    
    public final lqo G() {
        final d55 a = this.A;
        final y45 a2 = a.a;
        final boolean hasPrimaryClip = t8r.m(a2).hasPrimaryClip();
        a.b = hasPrimaryClip;
        boolean c;
        final boolean b = c = false;
        if (hasPrimaryClip) {
            final ClipDescription primaryClipDescription = t8r.m(a2).getPrimaryClipDescription();
            c = b;
            if (primaryClipDescription != null) {
                c = b;
                if (primaryClipDescription.hasMimeType("text/*")) {
                    c = true;
                }
            }
        }
        a.c = c;
        return lqo.a;
    }
    
    public final void H(final qbb value, final long n) {
        this.r.setValue((Object)value);
        this.q.setValue((Object)new l6g(n));
    }
    
    public final long I(final hhn hhn, int x, final int n, final boolean b, final ypk ypk, final boolean b2, final boolean b3, final dcb dcb) {
        final long y = hhn.y;
        final dnn dnn = new dnn(y);
        dnn dnn2 = null;
        Label_0046: {
            if (!b3) {
                dnn2 = dnn;
                if (b2) {
                    break Label_0046;
                }
                if (!dnn.d(y)) {
                    dnn2 = dnn;
                    break Label_0046;
                }
            }
            dnn2 = null;
        }
        final omn c = this.b.c();
        long n2;
        if (c == null) {
            n2 = dnn.b;
        }
        else if (dnn2 == null && mlc.q((Object)ypk, (Object)wab.f0)) {
            n2 = rhc.c(x, n);
        }
        else {
            final int x2 = this.x;
            long n3;
            if (dnn2 != null) {
                n3 = dnn2.a;
            }
            else {
                n3 = dnn.b;
            }
            final rzl h = k1r.h(c, x, n, x2, n3, dnn2 == null, b);
            if (dnn2 != null && !h.m((qqk)this.w)) {
                n2 = dnn2.a;
            }
            else {
                n2 = ypk.a((qqk)h).d();
                this.w = h;
                if (!b) {
                    x = n;
                }
                this.x = x;
            }
        }
        if (dcb != null && (dnn.g(n2) != dnn.g(y) || dnn.f(n2) != dnn.f(y))) {
            final ccb k = this.k;
            if (k != null) {
                k.a(dcb.c());
            }
        }
        return n2;
    }
    
    public final k2j a(final omn omn, final hhn hhn) {
        if (!dnn.d(hhn.y)) {
            return k2j.e;
        }
        final k2j c = omn.c((int)(hhn.y >> 32));
        float n;
        if ((n = (float)Math.floor((double)this.c.w0(2.0f))) < 1.0f) {
            n = 1.0f;
        }
        float n2;
        if (omn.a.h == qzc.v) {
            n2 = n / 2.0f + c.a;
        }
        else {
            n2 = c.c - n / 2.0f;
        }
        final float n3 = (float)(int)(omn.c >> 32);
        final float n4 = n / 2.0f;
        final float n5 = n3 - n4;
        float n6 = n2;
        if (n2 > n5) {
            n6 = n5;
        }
        float n7 = n6;
        if (n6 < n4) {
            n7 = n4;
        }
        float n8;
        if ((int)n % 2 == 1) {
            n8 = (float)Math.floor((double)n7) + 0.5f;
        }
        else {
            n8 = (float)Math.rint((double)n7);
        }
        return new k2j(n8 - n4, c.b, n8 + n4, c.d);
    }
    
    public final boolean b() {
        return this.r() && dnn.d(this.a.f().y);
    }
    
    public final boolean c() {
        return !dnn.d(this.a.f().y);
    }
    
    public final boolean d() {
        return !dnn.d(this.a.f().y) && this.r();
    }
    
    public final boolean e() {
        if (this.r()) {
            final d55 a = this.A;
            if (a.c) {
                return true;
            }
            final jta o = this.o;
            d09 d09;
            if (o != null) {
                d09 = (d09)o.a();
            }
            else {
                d09 = null;
            }
            if (d09 != null && a.b) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean f() {
        final peo a = this.a;
        return dnn.e(a.f().y) != a.f().x.length();
    }
    
    public final void g() {
        this.r.setValue((Object)null);
        this.q.setValue((Object)new l6g(9205357640488583168L));
        this.p.setValue((Object)new l6g(9205357640488583168L));
    }
    
    public final Object h(final boolean b, final m6n m6n) {
        final peo a = this.a;
        og0 og2;
        if (!dnn.d(a.f().y)) {
            final hhn f = a.f();
            final og0 og0 = og2 = new og0(f.x.subSequence(dnn.g(f.y), dnn.f(f.y)).toString());
            if (b) {
                a.a();
                og2 = og0;
            }
        }
        else {
            og2 = null;
        }
        if (og2 != null) {
            final Object a2 = this.g.a(pdr.m(og2), (h07)m6n);
            if (a2 == pc7.v) {
                return a2;
            }
        }
        return lqo.a;
    }
    
    public final Object i(final m6n m6n) {
        final peo a = this.a;
        og0 og0;
        if (!dnn.d(a.f().y) && this.r()) {
            final hhn f = a.f();
            og0 = new og0(f.x.subSequence(dnn.g(f.y), dnn.f(f.y)).toString());
            a.c(false);
        }
        else {
            og0 = null;
        }
        if (og0 != null) {
            final Object a2 = this.g.a(pdr.m(og0), (h07)m6n);
            if (a2 == pc7.v) {
                return a2;
            }
        }
        return lqo.a;
    }
    
    public final Object j(ueh w, h07 v) {
        while (true) {
            Label_0040: {
                if (!(v instanceof okn)) {
                    break Label_0040;
                }
                final Object o = v;
                final int z = ((okn)o).z;
                if ((z & Integer.MIN_VALUE) == 0x0) {
                    break Label_0040;
                }
                ((okn)o).z = z + Integer.MIN_VALUE;
                final Object x = ((okn)o).x;
                final int z2 = ((okn)o).z;
                Throwable t = null;
                Label_0262: {
                    if (z2 != 0) {
                        if (z2 == 1) {
                            w = (ueh)((okn)o).w;
                            v = (h07)((okn)o).v;
                            try {
                                vt4.g0(x);
                                break Label_0262;
                            }
                            finally {
                                final Object v2;
                                t = (Throwable)v2;
                                break Label_0262;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(x);
                    final Object v2 = new Object();
                    ((a4j)v2).v = 9205357640488583168L;
                    v = (h07)new Object();
                    ((a4j)v).v = 9205357640488583168L;
                    try {
                        final z6n z6n = new z6n(v2, (Object)this, (Object)v, (byte)5);
                        final ikn ikn = new ikn((a4j)v2, (a4j)v, this, (byte)1);
                        final ikn ikn2 = new ikn((a4j)v2, (a4j)v, this, (byte)2);
                        final b4n b4n = new b4n((Object)v, (Object)this, v2, (byte)3);
                        ((okn)o).v = (a4j)v2;
                        ((okn)o).w = (a4j)v;
                        ((okn)o).z = 1;
                        final Object e = qu8.e(w, (lta)z6n, (jta)ikn, (jta)ikn2, (zta)b4n, (f07)o);
                        final pc7 v3 = pc7.v;
                        if (e == v3) {
                            return v3;
                        }
                        w = (ueh)v;
                        v = (h07)v2;
                        k((a4j)v, (a4j)w, this);
                        return lqo.a;
                    }
                    finally {
                        w = (ueh)v;
                        v = (h07)v2;
                    }
                }
                k((a4j)v, (a4j)w, this);
                throw t;
            }
            final Object o = new okn(this, v);
            continue;
        }
    }
    
    public final Object l(final ueh ueh, final boolean b, h07 h07) {
        while (true) {
            Label_0043: {
                if (!(h07 instanceof pkn)) {
                    break Label_0043;
                }
                final Object o = h07;
                final int a = ((pkn)o).A;
                if ((a & Integer.MIN_VALUE) == 0x0) {
                    break Label_0043;
                }
                ((pkn)o).A = a + Integer.MIN_VALUE;
                Object y = ((pkn)o).y;
                final int a2 = ((pkn)o).A;
                Object w = null;
                a4j v = null;
                Label_0309: {
                    if (a2 != 0) {
                        if (a2 == 1) {
                            h07 = (h07)((pkn)o).x;
                            w = ((pkn)o).w;
                            v = ((pkn)o).v;
                            try {
                                vt4.g0(y);
                                break Label_0309;
                            }
                            finally {
                                break Label_0309;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(y);
                    y = new Object();
                    ((a4j)y).v = 9205357640488583168L;
                    w = new Object();
                    ((a4j)w).v = 0L;
                    if (b) {
                        h07 = (h07)qbb.w;
                    }
                    else {
                        h07 = (h07)qbb.x;
                    }
                    while (true) {
                        try {
                            final ye4 ye4 = new ye4(y, (Object)this, (Object)h07, w, b, (byte)5);
                            final ikn ikn = new ikn((a4j)y, this, (a4j)w, (byte)3);
                            final ikn ikn2 = new ikn((a4j)y, this, (a4j)w, (byte)0);
                            v = (a4j)y;
                            try {
                                final ry ry = new ry(w, (Object)this, (Object)h07, (Object)v, b, (byte)22);
                                final h07 x = h07;
                                try {
                                    ((pkn)o).v = v;
                                    ((pkn)o).w = (a4j)w;
                                    ((pkn)o).x = (qbb)x;
                                    ((pkn)o).A = 1;
                                    final Object e = qu8.e(ueh, (lta)ye4, (jta)ikn, (jta)ikn2, (zta)ry, (f07)o);
                                    h07 = (h07)pc7.v;
                                    if (e == h07) {
                                        return h07;
                                    }
                                    h07 = x;
                                    if (this.q() == h07) {
                                        m(v, (a4j)w, this);
                                    }
                                    return lqo.a;
                                }
                                finally {}
                                v = (a4j)y;
                            }
                            finally {}
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                if (this.q() == h07) {
                    m(v, (a4j)w, this);
                }
            }
            final Object o = new pkn(this, h07);
            continue;
        }
    }
    
    public final Object n(final ueh ueh, final m6n m6n) {
        final Object o1 = ((t6n)ueh).o1((f07)m6n, (zta)new vy1((byte)3, (f07)null, (Object)this));
        if (o1 == pc7.v) {
            return o1;
        }
        return lqo.a;
    }
    
    public final din o(final boolean b) {
        final hhn f = this.a.f();
        final boolean booleanValue = (boolean)this.t.getValue();
        final kkn kkn = (kkn)this.s.getValue();
        final kkn v = kkn.v;
        boolean u = false;
        final boolean b2 = kkn == v;
        final qbb q = this.q();
        if (booleanValue && b2 && dnn.d(f.y) && f.A == null && f.x.length() > 0) {
            if (q != qbb.v) {
                final r7m a = q7m.a();
                Object o;
                if (a != null) {
                    o = a.e();
                }
                else {
                    o = null;
                }
                final r7m b3 = q7m.b(a);
                try {
                    final long c = this.p().c();
                    q7m.d(a, b3, (lta)o);
                    o = this.v();
                    if (o != null) {
                        u = tsf.u(c, tsf.Y((nzc)o));
                    }
                    if (!u) {
                        return din.f;
                    }
                }
                finally {
                    q7m.d(a, b3, (lta)o);
                }
            }
            long c2;
            if (b) {
                c2 = this.p().c();
            }
            else {
                c2 = 9205357640488583168L;
            }
            return new din(true, c2, 0.0f, 1, false);
        }
        return din.f;
    }
    
    public final k2j p() {
        final omn c = this.b.c();
        if (c == null) {
            return k2j.e;
        }
        return this.a(c, this.a.f());
    }
    
    public final qbb q() {
        return (qbb)this.r.getValue();
    }
    
    public final boolean r() {
        return this.i && !this.j;
    }
    
    public final long s() {
        final ksg q = this.q;
        final long a = ((l6g)q.getValue()).a;
        long b = 9205357640488583168L;
        if ((a & 0x7FFFFFFF7FFFFFFFL) == 0x7FC000007FC00000L) {
            return 9205357640488583168L;
        }
        final ksg p = this.p;
        if ((((l6g)p.getValue()).a & 0x7FFFFFFF7FFFFFFFL) == 0x7FC000007FC00000L) {
            return fkq.k(this.b, ((l6g)q.getValue()).a);
        }
        final long a2 = ((l6g)q.getValue()).a;
        final long a3 = ((l6g)p.getValue()).a;
        final nzc v = this.v();
        if (v != null) {
            b = v.b(0L);
        }
        return l6g.i(a2, l6g.h(a3, b));
    }
    
    public final long t(final boolean b) {
        final omn c = this.b.c();
        if (c == null) {
            return 0L;
        }
        final long y = this.a.f().y;
        long n;
        if (b) {
            final int c2 = dnn.c;
            n = y >> 32;
        }
        else {
            final int c3 = dnn.c;
            n = (0xFFFFFFFFL & y);
        }
        return mkq.p(c, (int)n, b, dnn.h(y));
    }
    
    public final din u(final boolean b, final boolean b2) {
        qbb qbb;
        if (b) {
            qbb = qbb.w;
        }
        else {
            qbb = qbb.x;
        }
        final omn c = this.b.c();
        final din f = din.f;
        if (c != null) {
            final peo a = this.a;
            final long y = a.f().y;
            if (!dnn.d(y)) {
                final long t = this.t(b);
                if (this.s.getValue() == kkn.v) {
                    if (this.q() != qbb) {
                        final nzc v = this.v();
                        if (v == null || !tsf.u(t, tsf.Y(v))) {
                            return f;
                        }
                    }
                    if (a.f().A == null) {
                        int max;
                        if (b) {
                            max = (int)(y >> 32);
                        }
                        else {
                            max = Math.max((int)(y & 0xFFFFFFFFL) - 1, 0);
                        }
                        final int a2 = c.a(max);
                        final boolean h = dnn.h(y);
                        long f2;
                        if (b2) {
                            final nzc v2 = this.v();
                            f2 = t;
                            if (v2 != null) {
                                f2 = fkq.f(t, tsf.Y(v2));
                            }
                        }
                        else {
                            f2 = 9205357640488583168L;
                        }
                        long n;
                        if (b) {
                            n = y >> 32;
                        }
                        else {
                            n = (y & 0xFFFFFFFFL);
                        }
                        return new din(true, f2, ckq.f(c, (int)n), a2, h);
                    }
                }
            }
        }
        return f;
    }
    
    public final nzc v() {
        final nzc e = this.b.e();
        if (e != null && e.p()) {
            return e;
        }
        return null;
    }
    
    public final void w() {
        if (twl.C) {
            final vgn vgn = (vgn)((g66)this.d).w;
            if (vgn != null) {
                final wmm p = vgn.P;
                if (p != null) {
                    ((bqc)p).g((CancellationException)null);
                    vgn.P = null;
                }
            }
        }
        else {
            final cy1 l = this.l;
            if (l != null) {
                final qnn a = l.a;
                if (a.a() == 1) {
                    a.d();
                }
            }
        }
    }
    
    public final void x() {
        final lbh f = this.f;
        if (f != null) {
            final peo a = this.a;
            final CharSequence x = a.f().x;
            final long y = a.f().y;
            if (x.length() > 0 && !dnn.d(y)) {
                rhc.G(this.e, (hc7)null, 4, (zta)new jbh(f, x, y, this, (f07)null), 1);
            }
        }
    }
    
    public final Object y(boolean v, final h07 h07) {
        Object o = null;
        Label_0053: {
            if (h07 instanceof skn) {
                final skn skn = (skn)h07;
                final int z = skn.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    skn.z = z + Integer.MIN_VALUE;
                    o = skn;
                    break Label_0053;
                }
            }
            o = new skn(this, h07);
        }
        Object o2 = ((skn)o).x;
        final int z2 = ((skn)o).z;
        final lqo a = lqo.a;
        final pc7 v2 = pc7.v;
        d09 w = null;
        Label_0218: {
            if (z2 != 0) {
                if (z2 == 1) {
                    vt4.g0(o2);
                    return a;
                }
                if (z2 != 2) {
                    if (z2 == 3) {
                        vt4.g0(o2);
                        return a;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    v = ((skn)o).v;
                    w = ((skn)o).w;
                    vt4.g0(o2);
                }
            }
            else {
                vt4.g0(o2);
                final jta o3 = this.o;
                if (o3 != null) {
                    w = (d09)o3.a();
                    if (w != null) {
                        final y45 g = this.g;
                        ((skn)o).w = w;
                        ((skn)o).v = v;
                        ((skn)o).z = 2;
                        if ((o2 = g.b((h07)o)) == v2) {
                            return v2;
                        }
                        break Label_0218;
                    }
                }
                ((skn)o).z = 1;
                if (this.z(v, (h07)o) == v2) {
                    return v2;
                }
                return a;
            }
        }
        final w45 w2 = (w45)o2;
        if (w2 == null) {
            ((skn)o).w = null;
            ((skn)o).z = 3;
            if (this.z(v, (h07)o) != v2) {
                return a;
            }
        }
        else {
            final vec a2 = w.b.a(new vec(w2, w2.b(), 2));
            if (a2 == null) {
                return a;
            }
            final w45 a3 = a2.a();
            if (a3 == null) {
                return a;
            }
            final String o4 = u5r.o(a3);
            if (o4 != null) {
                peo.k(this.a, (CharSequence)o4, false, v, 10);
                return a;
            }
            return a;
        }
        return v2;
    }
    
    public final Object z(boolean b, final h07 h07) {
        Object o = null;
        Label_0053: {
            if (h07 instanceof tkn) {
                final tkn tkn = (tkn)h07;
                final int y = tkn.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    tkn.y = y + Integer.MIN_VALUE;
                    o = tkn;
                    break Label_0053;
                }
            }
            o = new tkn(this, h07);
        }
        Object o2 = ((tkn)o).w;
        final int y2 = ((tkn)o).y;
        final lqo a = lqo.a;
        final pc7 v = pc7.v;
        Label_0207: {
            if (y2 != 0) {
                if (y2 != 1) {
                    if (y2 == 2) {
                        b = ((tkn)o).v;
                        vt4.g0(o2);
                        break Label_0207;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    b = ((tkn)o).v;
                    vt4.g0(o2);
                }
            }
            else {
                vt4.g0(o2);
                final y45 g = this.g;
                ((tkn)o).v = b;
                ((tkn)o).y = 1;
                if ((o2 = g.b((h07)o)) == v) {
                    return v;
                }
            }
            final w45 w45 = (w45)o2;
            if (w45 == null) {
                return a;
            }
            ((tkn)o).v = b;
            ((tkn)o).y = 2;
            if ((o2 = pdr.k(w45)) != v) {
                break Label_0207;
            }
            return v;
        }
        final String s = (String)o2;
        if (s != null) {
            peo.k(this.a, (CharSequence)s, false, b, 10);
        }
        return a;
    }
}
