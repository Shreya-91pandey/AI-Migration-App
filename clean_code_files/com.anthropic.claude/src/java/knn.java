import java.util.Map;
import android.os.Trace;
import java.util.HashMap;

public final class knn extends hgf implements a0d, bw8, xsk
{
    public String J;
    public mnn K;
    public tna L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public o86 Q;
    public HashMap R;
    public krg S;
    public inn T;
    public jnn U;
    
    public final void I0(final k0d k0d) {
        if (!super.I) {
            return;
        }
        jnn u = this.U;
        krg krg = null;
        Label_0062: {
            if (u != null) {
                if (!u.c()) {
                    u = null;
                }
                if (u != null && (krg = u.a()) != null) {
                    break Label_0062;
                }
            }
            krg = this.o1();
        }
        final a90 j = krg.j;
        Label_0372: {
            if (j == null) {
                break Label_0372;
            }
            final x13 t = k0d.v.w.t();
            final boolean k = krg.k;
            if (k) {
                final long l = krg.l;
                final float n = (float)(int)(l >> 32);
                final float n2 = (float)(int)(l & 0xFFFFFFFFL);
                t.g();
                t.m(0.0f, 0.0f, n, n2, 1);
            }
            Label_0180: {
                try {
                    final mnn i = this.K;
                    final hcm a = i.a;
                    wgn wgn;
                    if ((wgn = a.m) == null) {
                        wgn = wgn.b;
                    }
                    break Label_0180;
                }
                finally {
                    if (k) {
                        t.p();
                    }
                    final mnn i;
                    final hcm a;
                    final wgn wgn;
                    Object o;
                    long n3 = 0L;
                    rpl rpl;
                    qm2 b;
                    o86 q = null;
                    Label_0331:Label_0345_Outer:
                    while (true) {
                    Label_0345:
                        while (true) {
                            while (true) {
                            Block_10_Outer:
                                while (true) {
                                Label_0292:
                                    while (true) {
                                    Label_0222_Outer:
                                        while (true) {
                                            while (true) {
                                                Block_11: {
                                                    while (true) {
                                                        iftrue(Label_0222:)((o = a.p) != null);
                                                        break Block_11;
                                                        t.p();
                                                        return;
                                                        n3 = i.c();
                                                        break Label_0331;
                                                        Label_0326: {
                                                            n3 = j86.b;
                                                        }
                                                        break Label_0331;
                                                        rpl = rpl.d;
                                                        continue Block_10_Outer;
                                                    }
                                                    b = i.b();
                                                    iftrue(Label_0264:)(b == null);
                                                    j.f(t, b, i.a.a.a(), rpl, wgn, (dw8)o);
                                                    break Label_0345;
                                                    n3 = q.a();
                                                    break Label_0292;
                                                }
                                                o = gea.a;
                                                continue Label_0345_Outer;
                                            }
                                            Label_0287: {
                                                n3 = j86.h;
                                            }
                                            break Label_0292;
                                            Label_0357:
                                            return;
                                            iftrue(Label_0201:)((rpl = a.n) != null);
                                            continue Label_0222_Outer;
                                        }
                                        Label_0264: {
                                            q = this.Q;
                                        }
                                        iftrue(Label_0287:)(q == null);
                                        continue;
                                    }
                                    iftrue(Label_0304:)(n3 == 16L);
                                    break Label_0345;
                                    iftrue(Label_0357:)(!k);
                                    continue Block_10_Outer;
                                }
                                Label_0304: {
                                    iftrue(Label_0326:)(i.c() == 16L);
                                }
                                continue Label_0345_Outer;
                            }
                            j.e(t, n3, rpl, wgn, (dw8)o);
                            continue Label_0345;
                        }
                        continue Label_0331;
                    }
                }
            }
        }
        final krg s = this.S;
        final jnn u2 = this.U;
        final StringBuilder sb = new StringBuilder("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=");
        sb.append((Object)s);
        sb.append(", textSubstitution=");
        sb.append((Object)u2);
        sb.append(")");
        jac.b(sb.toString());
        ebq.a();
    }
    
    public final int M0(final wxd wxd, final goe goe, final int n) {
        jnn u = this.U;
        krg krg = null;
        Label_0044: {
            if (u != null) {
                if (!u.c()) {
                    u = null;
                }
                if (u != null && (krg = u.a()) != null) {
                    break Label_0044;
                }
            }
            krg = this.o1();
        }
        krg.d((xc8)wxd);
        return zn2.q(krg.e(((flc)wxd).getLayoutDirection()).p());
    }
    
    public final noe b(final ooe ooe, final goe goe, long l) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            jnn u = this.U;
            krg krg = null;
            Label_0057: {
                if (u != null) {
                    if (!u.c()) {
                        u = null;
                    }
                    if (u != null && (krg = u.a()) != null) {
                        break Label_0057;
                    }
                }
                krg = this.o1();
            }
            krg.d(ooe);
            final boolean b = krg.b(l, ooe.getLayoutDirection());
            final jrg n = krg.n;
            if (n != null) {
                n.e();
            }
            final a90 j = krg.j;
            j.getClass();
            final mmn d = j.d;
            l = krg.l;
            if (b) {
                soh.J((t98)this, 2).p1();
                HashMap r;
                if ((r = this.R) == null) {
                    r = new HashMap(2);
                    this.R = r;
                }
                ((Map)r).put((Object)kx.a, (Object)Math.round(d.d(0) + 0.0f));
                ((Map)r).put((Object)kx.b, (Object)Math.round(d.d(d.g - 1) + 0.0f));
            }
            final int n2 = (int)(l >> 32);
            final int n3 = (int)(l & 0xFFFFFFFFL);
            final o8h u2 = goe.u(ri2.F(n2, n2, n3, n3));
            final HashMap r2 = this.R;
            r2.getClass();
            return ooe.Y(n2, n3, (Map)r2, (lta)new t40(u2, (byte)12));
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final boolean d1() {
        return false;
    }
    
    public final int g(final wxd wxd, final goe goe, final int n) {
        jnn u = this.U;
        krg krg = null;
        Label_0044: {
            if (u != null) {
                if (!u.c()) {
                    u = null;
                }
                if (u != null && (krg = u.a()) != null) {
                    break Label_0044;
                }
            }
            krg = this.o1();
        }
        krg.d((xc8)wxd);
        return krg.a(n, ((flc)wxd).getLayoutDirection());
    }
    
    public final int h(final wxd wxd, final goe goe, final int n) {
        jnn u = this.U;
        krg krg = null;
        Label_0044: {
            if (u != null) {
                if (!u.c()) {
                    u = null;
                }
                if (u != null && (krg = u.a()) != null) {
                    break Label_0044;
                }
            }
            krg = this.o1();
        }
        krg.d((xc8)wxd);
        return krg.a(n, ((flc)wxd).getLayoutDirection());
    }
    
    public final void j(final itk itk) {
        inn t;
        if ((t = this.T) == null) {
            t = new inn(this, (byte)0);
            this.T = t;
        }
        ftk.x(itk, new og0(this.J));
        final jnn u = this.U;
        if (u != null) {
            final boolean c = u.c();
            final htk e = etk.E;
            final auc[] a = ftk.a;
            final auc auc = a[17];
            e.getClass();
            itk.a(e, c);
            final og0 og0 = new og0(u.b());
            final htk d = etk.D;
            final auc auc2 = a[16];
            d.getClass();
            itk.a(d, og0);
        }
        itk.a(rsk.l, new t3((String)null, (aua)new inn(this, (byte)1)));
        itk.a(rsk.m, new t3((String)null, (aua)new inn(this, (byte)2)));
        itk.a(rsk.n, new t3((String)null, (aua)new wfk((Object)this, (byte)20)));
        ftk.b(itk, (lta)t);
    }
    
    public final int k(final wxd wxd, final goe goe, final int n) {
        jnn u = this.U;
        krg krg = null;
        Label_0044: {
            if (u != null) {
                if (!u.c()) {
                    u = null;
                }
                if (u != null && (krg = u.a()) != null) {
                    break Label_0044;
                }
            }
            krg = this.o1();
        }
        krg.d((xc8)wxd);
        return zn2.q(krg.e(((flc)wxd).getLayoutDirection()).y());
    }
    
    public final krg o1() {
        final mnn k = this.K;
        krg s;
        if ((s = this.S) == null) {
            s = new krg(this.J, k, this.L, this.M, this.N, this.O, this.P);
            this.S = s;
        }
        s.getClass();
        return s;
    }
}
