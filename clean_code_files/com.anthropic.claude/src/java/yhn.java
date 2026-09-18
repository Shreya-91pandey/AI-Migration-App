import android.view.InputEvent;
import java.util.concurrent.CancellationException;
import android.view.autofill.AutofillValue;
import java.util.List;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class yhn extends v98 implements bw8, pbh, xsk, x2b, teh, ruc, zl6, mgf, k5g, jzc, uma
{
    public peo L;
    public qmn M;
    public ykn N;
    public tdc O;
    public boolean P;
    public boolean Q;
    public mvc R;
    public boolean S;
    public llf T;
    public ymf U;
    public final lna V;
    public final t6n W;
    public nt8 X;
    public final st8 Y;
    public z0q Z;
    public wmm a0;
    public final qb0 b0;
    public final thn c0;
    public wmm d0;
    public final rhn e0;
    public final ksg f0;
    
    public yhn(final peo l, final qmn m, final ykn n, final tdc o, final boolean p10, final boolean q, final mvc r, final boolean s, final llf t, final ymf u) {
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p10;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.T = t;
        this.U = u;
        n.n = (jta)new rhn(this, (byte)3);
        this.V = new lna(t, new shn(this, (byte)0), 2);
        final t6n a = p6n.a((PointerInputEventHandler)new v60((Object)this, (byte)2));
        this.o1((t98)a);
        this.W = a;
        final st8 y = new st8(new tt8((Object)new e0j((Object)new rhn(this, (byte)5), (byte)18), (Object)new cin(new shn(this, (byte)1), new thn(this, (byte)0), new shn(this, (byte)2), new shn(this, (byte)3), new shn(this, (byte)4), new shn(this, (byte)5)), (byte)0), 1);
        this.o1((t98)y);
        this.Y = y;
        this.b0 = (qb0)new v();
        this.c0 = new thn(this, (byte)1);
        this.e0 = new rhn(this, (byte)4);
        this.f0 = o50.Q((Object)Boolean.FALSE);
    }
    
    public final void F0() {
        yi2.I((hgf)this, (jta)new rhn(this, (byte)1));
    }
    
    public final void G(final jeh jeh, final keh keh, final long n) {
        this.W.G(jeh, keh, n);
    }
    
    public final void I0(final k0d k0d) {
        k0d.a();
        if (this.f0.getValue()) {
            Object o = uoo.z((zl6)this, (sei)cm1.a);
            final long a = ((j86)uoo.z((zl6)this, (sei)cm1.b)).a;
            final long c = t08.c(1308617531);
            final int i = j86.i;
            if (!foo.a(a, c)) {
                o = new cam(a);
            }
            cw8.U0((cw8)k0d, (qm2)o, 0L, 0L, 0.0f, (dw8)null, 0, 126);
        }
    }
    
    public final void O(final qma qma) {
        final ykn n = this.N;
        final qmn b = n.b;
        final omn c = b.c();
        k2j k2j = k2j.e;
        if (c != null) {
            if (!n.h) {
                k2j = eup.z;
            }
            else {
                final hhn f = n.a.f();
                if (dnn.d(f.y)) {
                    k2j = n.a(c, f);
                }
                else {
                    final long y = f.y;
                    if (!dnn.d(y)) {
                        final int n2 = (int)(y >> 32);
                        final vjf b2 = c.b;
                        final int d = b2.d(n2);
                        final int n3 = (int)(0xFFFFFFFFL & y);
                        final int d2 = b2.d(n3);
                        if (d == d2) {
                            final float f2 = c.f(n2, true);
                            final float f3 = c.f(n3, true);
                            k2j = new k2j(Math.min(f2, f3), b2.f(d), Math.max(f2, f3), b2.b(d2));
                        }
                        else {
                            k2j = c.k(dnn.g(y), dnn.f(y)).g();
                        }
                    }
                }
                k2j = fkq.m(b, k2j);
            }
        }
        qma.d(k2j);
    }
    
    public final boolean Q(final KeyEvent keyEvent) {
        final peo l = this.L;
        final qmn m = this.M;
        final ykn n = this.N;
        final z9m v1 = this.v1();
        final boolean b = this.P && !this.Q;
        final boolean s = this.S;
        final uhn uhn = new uhn(this, (byte)0);
        final qb0 b2 = this.b0;
        b2.getClass();
        final mth mth = (mth)((v)b2).a;
        if (hbr.c(ibr.j(keyEvent), 2) && ((InputEvent)keyEvent).isFromSource(257) && (miq.o(keyEvent) && niq.m(keyEvent))) {
            n.C(false);
        }
        final long i = ibr.i(keyEvent);
        if (hbr.c(ibr.j(keyEvent), 1)) {
            final slf slf = (slf)((v)b2).c;
            if (slf != null && slf.a(i)) {
                final slf slf2 = (slf)((v)b2).c;
                if (slf2 != null) {
                    slf2.e(i);
                }
                return true;
            }
        }
        else if (!hbr.c(ibr.j(keyEvent), 0) || niq.m(keyEvent)) {
            final boolean j = niq.m(keyEvent);
            final float n2 = Float.NaN;
            boolean b3 = false;
            Label_1677: {
                juc k;
                while (true) {
                    Label_0319: {
                        if (!j) {
                            break Label_0319;
                        }
                        final Integer a = ((l08)((v)b2).b).a(keyEvent);
                        if (a == null) {
                            break Label_0319;
                        }
                        final String string = bar.d((int)a, new StringBuilder(2)).toString();
                        if (b) {
                            peo.k(l, (CharSequence)string, miq.o(keyEvent) ^ true, miq.n(keyEvent), 4);
                            mth.a = Float.NaN;
                            b3 = true;
                            break Label_1677;
                        }
                        b3 = false;
                        break Label_1677;
                    }
                    k = zn2.j.j(keyEvent);
                    if (k == null) {
                        continue;
                    }
                    if (k.a() && !b) {
                        continue;
                    }
                    break;
                }
                final omn c = m.c();
                nzc e = m.e();
                float intBitsToFloat = n2;
                if (e != null) {
                    final boolean p = e.p();
                    final k2j k2j = null;
                    if (!p) {
                        e = null;
                    }
                    intBitsToFloat = n2;
                    if (e != null) {
                        nzc b4 = m.b();
                        k2j l2 = k2j;
                        if (b4 != null) {
                            if (!b4.p()) {
                                b4 = null;
                            }
                            l2 = k2j;
                            if (b4 != null) {
                                l2 = b4.L(e, true);
                            }
                        }
                        intBitsToFloat = n2;
                        if (l2 != null) {
                            intBitsToFloat = Float.intBitsToFloat((int)(l2.g() & 0xFFFFFFFFL));
                        }
                    }
                }
                final erk erk = new erk(l, c, miq.o(keyEvent), miq.n(keyEvent), intBitsToFloat, mth);
                final ksg g = l.g;
                final iln a2 = l.a;
                boolean booleanValue = false;
                while (true) {
                    switch (((Enum)k).ordinal()) {
                        default: {
                            en9.r();
                            return false;
                        }
                        case 47: {
                            final iln iln = (iln)a2.g.v;
                            final vhk a3 = iln.a;
                            final aqo aqo = (aqo)a3.w;
                            final v8m c2 = aqo.c;
                            if (!c2.isEmpty() && ((ksg)a3.x).getValue() == null) {
                                if (c2.isEmpty()) {
                                    jac.c("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
                                }
                                final Object x0 = h86.x0((List)c2);
                                aqo.b.add(x0);
                                qkq.o(iln, (unn)x0);
                            }
                            break Label_1502;
                        }
                        case 46: {
                            final iln iln2 = (iln)a2.g.v;
                            final vhk a4 = iln2.a;
                            final aqo aqo2 = (aqo)a4.w;
                            final v8m b5 = aqo2.b;
                            if (!b5.isEmpty() || ((ksg)a4.x).getValue() != null) {
                                a4.k();
                                if (b5.isEmpty()) {
                                    jac.c("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
                                }
                                final Object x2 = h86.x0((List)b5);
                                aqo2.c.add(x2);
                                qkq.q(iln2, (unn)x2);
                            }
                            break Label_1502;
                        }
                        case 45: {
                            if (!s) {
                                peo.k(l, (CharSequence)"\t", miq.o(keyEvent) ^ true, miq.n(keyEvent), 4);
                                break Label_1502;
                            }
                            booleanValue = false;
                            break;
                        }
                        case 44: {
                            if (!s) {
                                peo.k(l, (CharSequence)"\n", miq.o(keyEvent) ^ true, miq.n(keyEvent), 4);
                                break Label_1502;
                            }
                            booleanValue = (boolean)uhn.a();
                            break;
                        }
                        case 48: {
                            booleanValue = true;
                            break;
                        }
                        case 43: {
                            erk.d();
                            continue;
                        }
                        case 42: {
                            erk.C();
                            erk.H();
                            continue;
                        }
                        case 41: {
                            erk.B();
                            erk.H();
                            continue;
                        }
                        case 40: {
                            erk.A();
                            erk.H();
                            continue;
                        }
                        case 39: {
                            erk.D();
                            erk.H();
                            continue;
                        }
                        case 38: {
                            erk.u();
                            erk.H();
                            continue;
                        }
                        case 37: {
                            erk.q();
                            erk.H();
                            continue;
                        }
                        case 36: {
                            erk.x();
                            erk.H();
                            continue;
                        }
                        case 35: {
                            erk.o();
                            erk.H();
                            continue;
                        }
                        case 34: {
                            erk.y();
                            erk.H();
                            continue;
                        }
                        case 33: {
                            erk.z();
                            erk.H();
                            continue;
                        }
                        case 32: {
                            erk.m();
                            erk.H();
                            continue;
                        }
                        case 31: {
                            erk.F();
                            erk.H();
                            continue;
                        }
                        case 30: {
                            erk.l();
                            erk.H();
                            continue;
                        }
                        case 29: {
                            erk.E();
                            erk.H();
                            continue;
                        }
                        case 28: {
                            erk.w();
                            erk.H();
                            continue;
                        }
                        case 27: {
                            erk.n();
                            erk.H();
                            continue;
                        }
                        case 26: {
                            erk.G();
                            continue;
                        }
                        case 25: {
                            erk.A();
                            erk.c();
                            continue;
                        }
                        case 24: {
                            erk.D();
                            erk.c();
                            continue;
                        }
                        case 23: {
                            erk.r();
                            erk.c();
                            continue;
                        }
                        case 22: {
                            erk.v();
                            erk.c();
                            continue;
                        }
                        case 21: {
                            erk.p();
                            erk.c();
                            continue;
                        }
                        case 20: {
                            erk.t();
                            erk.c();
                            continue;
                        }
                        case 17:
                        case 18:
                        case 19: {
                            this.c0.d((Object)k, (Object)miq.n(keyEvent));
                            continue;
                        }
                        case 16: {
                            erk.y();
                            continue;
                        }
                        case 15: {
                            erk.z();
                            continue;
                        }
                        case 14: {
                            erk.m();
                            continue;
                        }
                        case 13: {
                            erk.F();
                            continue;
                        }
                        case 12: {
                            ((ga8)v1).b();
                            continue;
                        }
                        case 11: {
                            erk.l();
                            continue;
                        }
                        case 10: {
                            erk.E();
                            continue;
                        }
                        case 9: {
                            erk.C();
                            continue;
                        }
                        case 8: {
                            erk.B();
                            continue;
                        }
                        case 7: {
                            erk.A();
                            continue;
                        }
                        case 6: {
                            erk.D();
                            continue;
                        }
                        case 5: {
                            erk.u();
                            continue;
                        }
                        case 4: {
                            erk.q();
                            continue;
                        }
                        case 3: {
                            erk.o();
                            continue;
                        }
                        case 2: {
                            erk.x();
                            continue;
                        }
                        case 1: {
                            erk.b(new qhm((byte)24));
                            continue;
                        }
                        case 0: {
                            erk.a(new qhm((byte)23));
                            continue;
                        }
                    }
                    break;
                }
                if (k == juc.G || k == juc.H || k == juc.w || k == juc.x) {
                    booleanValue = (dnn.c(erk.e().y, erk.g()) ^ true);
                }
                if (!dnn.c(erk.g(), erk.e().y)) {
                    l.m(erk.g());
                }
                b3 = booleanValue;
                if (erk.h() != 0) {
                    final int h = erk.h();
                    b3 = booleanValue;
                    if (h != 0) {
                        if (dnn.d(a2.d().y)) {
                            g.setValue((Object)new jrk(h, h));
                            b3 = booleanValue;
                        }
                        else {
                            g.setValue((Object)new jrk(erk.f().a, h));
                            b3 = booleanValue;
                        }
                    }
                }
            }
            if (b3) {
                slf c3;
                if ((c3 = (slf)((v)b2).c) == null) {
                    c3 = new slf(3);
                    ((v)b2).c = c3;
                }
                c3.d(i);
            }
            return b3;
        }
        return false;
    }
    
    public final void V() {
        this.W.V();
    }
    
    public final boolean X0() {
        return true;
    }
    
    public final void c(final long m) {
        this.Y.M = m;
    }
    
    public final void g1() {
        yi2.I((hgf)this, (jta)new rhn(this, (byte)1));
        this.N.o = (jta)this.e0;
        if (this.P) {
            this.o1((t98)this.V);
        }
    }
    
    public final void h1() {
        this.s1();
        this.N.o = null;
    }
    
    public final void j(final itk itk) {
        final hhn d = this.L.d();
        final long y = d.y;
        final og0 og0 = new og0(this.L.a.d().x.toString());
        final auc[] a = ftk.a;
        final htk f = etk.F;
        final auc[] a2 = ftk.a;
        final auc auc = a2[18];
        f.getClass();
        itk.a(f, og0);
        final og0 og2 = new og0(d.x.toString());
        final htk g = etk.G;
        final auc auc2 = a2[19];
        g.getClass();
        itk.a(g, og2);
        final htk h = etk.H;
        final auc auc3 = a2[20];
        final dnn dnn = new dnn(y);
        h.getClass();
        itk.a(h, dnn);
        final dnn z = this.L.a.d().z;
        final htk i = etk.I;
        final auc auc4 = a2[21];
        i.getClass();
        itk.a(i, z);
        final sdc sdc = new sdc((boolean)this.L.a.e.getValue(), (boolean)this.L.a.f.getValue());
        final htk m = etk.M;
        final auc auc5 = a2[27];
        m.getClass();
        itk.a(m, sdc);
        if (!this.P) {
            ftk.a(itk);
        }
        final boolean b = this.P && !this.Q;
        final htk q = etk.Q;
        final auc auc6 = a2[28];
        q.getClass();
        itk.a(q, b);
        ftk.j(itk, wab.N);
        ftk.n(itk, new b70(AutofillValue.forText(ien.N((CharSequence)d))));
        ftk.f(itk, (lta)new qhn(b, this, (byte)0));
        final int c = this.R.c;
        if (c == 6) {
            hy6.a.getClass();
            ftk.l(itk, (hy6)fy6.c);
        }
        else if (c == 7) {
            hy6.a.getClass();
            ftk.l(itk, (hy6)fy6.b);
        }
        else if (c == 8) {
            hy6.a.getClass();
            ftk.l(itk, (hy6)fy6.b);
        }
        else if (c == 4) {
            hy6.a.getClass();
            ftk.l(itk, (hy6)fy6.d);
        }
        ftk.b(itk, (lta)new shn(this, (byte)6));
        if (b) {
            itk.a(rsk.k, new t3((String)null, (aua)new qhn(b, this, (byte)1)));
            itk.a(rsk.o, new t3((String)null, (aua)new qhn(b, this, (byte)2)));
        }
        itk.a(rsk.j, new t3((String)null, (aua)new tf0((Object)this, (byte)8)));
        final int c2 = this.R.c();
        ftk.g(itk, c2, (jta)new vhn(this, c2));
        ftk.e(itk, (String)null, (jta)new rhn(this, (byte)7));
        ftk.h(itk, (String)null, (jta)new rhn(this, (byte)8));
        if (!dnn.d(y)) {
            itk.a(rsk.q, new t3((String)null, (aua)new rhn(this, (byte)9)));
            if (this.P && !this.Q) {
                itk.a(rsk.r, new t3((String)null, (aua)new rhn(this, (byte)0)));
            }
        }
        if (b) {
            itk.a(rsk.s, new t3((String)null, (aua)new rhn(this, (byte)6)));
        }
        final tdc o = this.O;
        if (o != null) {
            o.j(itk);
        }
        if (this.P) {
            this.V.j(itk);
        }
    }
    
    public final boolean p(final KeyEvent keyEvent) {
        final peo l = this.L;
        final ykn n = this.N;
        final mma mma = (mma)uoo.z((zl6)this, (sei)hm6.i);
        this.v1();
        this.b0.getClass();
        if (!dnn.d(l.f().y) && gbr.c(keyEvent)) {
            final peo a = n.a;
            if (!dnn.d(a.f().y)) {
                final iln a2 = a.a;
                final tdc b = a.b;
                a2.b.a().q();
                final ghn b2 = a2.b;
                zbq.s(b2, (int)(b2.B & 0xFFFFFFFFL));
                a2.b(b, true, 1);
                a2.g(true);
                a2.f(a2.b.z);
            }
            n.D(false);
            n.E(snn.v);
            return true;
        }
        return false;
    }
    
    public final boolean r1(final int n) {
        if (n == 6) {
            ((mma)uoo.z((zl6)this, (sei)hm6.i)).a(1);
            return true;
        }
        if (n == 5) {
            ((mma)uoo.z((zl6)this, (sei)hm6.i)).a(2);
            return true;
        }
        if (n == 7) {
            ((ga8)this.v1()).a();
            return true;
        }
        return false;
    }
    
    public final void s1() {
        final wmm d0 = this.d0;
        if (d0 != null) {
            ((bqc)d0).g((CancellationException)null);
        }
        this.d0 = null;
        final ymf u = this.U;
        if (u != null) {
            u.i();
        }
    }
    
    public final void t(final nzc nzc) {
        this.Y.getClass();
    }
    
    public final void t1() {
        final nt8 x = this.X;
        if (x != null) {
            this.T.b((eic)new ot8(x));
            this.X = null;
        }
    }
    
    public final void u0(final yxf value) {
        this.M.f.setValue((Object)value);
        if (this.P) {
            this.V.u0(value);
        }
    }
    
    public final boolean u1() {
        if (this.V.Q.t1().b()) {
            final z0q z = this.Z;
            if (z != null && ((n6d)z).b()) {
                return true;
            }
        }
        return false;
    }
    
    public final z9m v1() {
        final z9m z9m = (z9m)uoo.z((zl6)this, (sei)hm6.r);
        if (z9m != null) {
            return z9m;
        }
        en9.q("No software keyboard controller");
        return null;
    }
    
    public final void w1(final boolean b) {
        if (!b) {
            final Boolean e = this.R.e;
            if (e != null && !e) {
                return;
            }
        }
        this.d0 = rhc.G(((hgf)this).c1(), (hc7)null, 4, (zta)new frd(this, rml.x((mgf)this), null, (byte)18), 1);
    }
}
