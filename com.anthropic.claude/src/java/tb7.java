import android.view.autofill.AutofillValue;

public final class tb7 extends v98 implements xsk
{
    public leo L;
    public mln M;
    public j7d N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public o6g R;
    public dkn S;
    public y4c T;
    public xma U;
    
    public static void r1(final j7d j7d, final String s, final boolean b, final boolean b2) {
        if (!b) {
            if (b2) {
                final dmn e = j7d.e;
                final gb7 v = j7d.v;
                if (e != null) {
                    final mln e2 = j7d.d.e(lq6.Y((Object[])new t19[] { (t19)new ua8(), (t19)new sa6(s, 1) }));
                    e.a((mln)null, e2);
                    v.b((Object)e2);
                    return;
                }
                final int length = s.length();
                v.b((Object)new mln(s, rhc.c(length, length), 4));
            }
        }
    }
    
    public final boolean X0() {
        return true;
    }
    
    public final void j(final itk itk) {
        final boolean q = this.Q;
        final og0 a = this.M.a;
        final auc[] a2 = ftk.a;
        final htk f = etk.F;
        final auc[] a3 = ftk.a;
        final auc auc = a3[18];
        f.getClass();
        itk.a(f, a);
        final og0 a4 = this.L.a;
        final htk g = etk.G;
        final auc auc2 = a3[19];
        g.getClass();
        itk.a(g, a4);
        final long b = this.M.b;
        final htk h = etk.H;
        final auc auc3 = a3[20];
        final dnn dnn = new dnn(b);
        h.getClass();
        itk.a(h, dnn);
        ftk.j(itk, wab.N);
        ftk.n(itk, new b70(AutofillValue.forText(ien.N((CharSequence)this.M.a))));
        ftk.f(itk, (lta)new sb7(this, (byte)0));
        final int d = this.T.d;
        Label_0264: {
            if (d == 6) {
                hy6.a.getClass();
                ftk.l(itk, (hy6)fy6.c);
            }
            else {
                if (d != 7) {
                    if (d != 8) {
                        if (d == 4) {
                            hy6.a.getClass();
                            ftk.l(itk, (hy6)fy6.d);
                        }
                        break Label_0264;
                    }
                }
                hy6.a.getClass();
                ftk.l(itk, (hy6)fy6.b);
            }
        }
        if (!this.P) {
            ftk.a(itk);
        }
        if (q) {
            itk.a(etk.N, lqo.a);
        }
        final boolean b2 = this.P && !this.O;
        final htk q2 = etk.Q;
        final auc auc4 = a3[28];
        q2.getClass();
        itk.a(q2, b2);
        ftk.b(itk, (lta)new sb7(this, (byte)1));
        if (b2) {
            itk.a(rsk.k, new t3((String)null, (aua)new sb7(this, (byte)2)));
            itk.a(rsk.o, new t3((String)null, (aua)new sb7(this, itk)));
        }
        itk.a(rsk.j, new t3((String)null, (aua)new tf0((Object)this, (byte)3)));
        ftk.g(itk, this.T.e, (jta)new rb7(this, (byte)5));
        ftk.e(itk, (String)null, (jta)new rb7(this, (byte)6));
        ftk.h(itk, (String)null, (jta)new rb7(this, (byte)0));
        if (!dnn.d(this.M.b) && !q) {
            itk.a(rsk.q, new t3((String)null, (aua)new rb7(this, (byte)1)));
            if (this.P && !this.O) {
                itk.a(rsk.r, new t3((String)null, (aua)new rb7(this, (byte)2)));
            }
        }
        if (this.P && !this.O) {
            itk.a(rsk.s, new t3((String)null, (aua)new rb7(this, (byte)4)));
        }
    }
}
