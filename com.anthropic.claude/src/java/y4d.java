public final class y4d extends hgf implements xsk
{
    public jta J;
    public s4d K;
    public zhg L;
    public boolean M;
    public boolean N;
    public dfk O;
    public final w4d P;
    public w4d Q;
    
    public y4d(final jta j, final s4d k, final zhg l, final boolean m, final boolean n) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.P = new w4d(this, (byte)0);
        this.o1();
    }
    
    public final boolean d1() {
        return false;
    }
    
    public final void j(final itk itk) {
        ftk.z(itk);
        itk.a(etk.P, this.P);
        final zhg l = this.L;
        final dfk o = this.O;
        if (l == zhg.v) {
            if (o == null) {
                mlc.j0("scrollAxisRange");
                throw null;
            }
            final htk w = etk.w;
            final auc auc = ftk.a[13];
            w.getClass();
            itk.a(w, o);
        }
        else {
            if (o == null) {
                mlc.j0("scrollAxisRange");
                throw null;
            }
            ftk.o(itk, o);
        }
        final w4d q = this.Q;
        if (q != null) {
            itk.a(rsk.f, new t3((String)null, (aua)q));
        }
        itk.a(rsk.C, new t3((String)null, (aua)new e0j((Object)new x4d(this, (byte)2), (byte)7)));
        final u76 e = this.K.e();
        final htk f = etk.f;
        final auc auc2 = ftk.a[24];
        f.getClass();
        itk.a(f, e);
    }
    
    public final void o1() {
        this.O = new dfk((jta)new x4d(this, (byte)0), (jta)new x4d(this, (byte)1), this.N);
        w4d q;
        if (this.M) {
            q = new w4d(this, (byte)1);
        }
        else {
            q = null;
        }
        this.Q = q;
    }
}
