public final class qb7 extends ogf
{
    public final boolean A;
    public final o6g B;
    public final dkn C;
    public final y4c D;
    public final xma E;
    public final leo v;
    public final mln w;
    public final j7d x;
    public final boolean y;
    public final boolean z;
    
    public qb7(final leo v, final mln w, final j7d x, final boolean y, final boolean z, final boolean a, final o6g b, final dkn c, final y4c d, final xma e) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public final hgf create() {
        final v98 v98 = new v98();
        ((tb7)v98).L = this.v;
        ((tb7)v98).M = this.w;
        ((tb7)v98).N = this.x;
        ((tb7)v98).O = this.y;
        ((tb7)v98).P = this.z;
        ((tb7)v98).Q = this.A;
        ((tb7)v98).R = this.B;
        final dkn c = this.C;
        ((tb7)v98).S = c;
        ((tb7)v98).T = this.D;
        ((tb7)v98).U = this.E;
        c.g = (jta)new rb7((tb7)v98, (byte)3);
        return (hgf)v98;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof qb7) {
                final qb7 qb7 = (qb7)o;
                if (this.v.equals((Object)qb7.v)) {
                    if (mlc.q((Object)this.w, (Object)qb7.w)) {
                        if (this.x != qb7.x) {
                            return false;
                        }
                        if (this.y == qb7.y) {
                            if (this.z == qb7.z) {
                                if (this.A == qb7.A) {
                                    if (this.B.equals(qb7.B)) {
                                        if (this.C != qb7.C) {
                                            return false;
                                        }
                                        if (mlc.q((Object)this.D, (Object)qb7.D)) {
                                            if (mlc.q((Object)this.E, (Object)qb7.E)) {
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
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        return this.E.hashCode() + (this.D.hashCode() + (this.C.hashCode() + (this.B.hashCode() + smk.l(smk.l(smk.l((this.x.hashCode() + (this.w.hashCode() + this.v.hashCode() * 31) * 31) * 31, 31, this.y), 31, this.z), 31, this.A)) * 31) * 31) * 31;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CoreTextFieldSemanticsModifier(transformedText=");
        sb.append((Object)this.v);
        sb.append(", value=");
        sb.append((Object)this.w);
        sb.append(", state=");
        sb.append((Object)this.x);
        sb.append(", readOnly=");
        sb.append(this.y);
        sb.append(", enabled=");
        p3g.i(sb, this.z, ", isPassword=", this.A, ", offsetMapping=");
        sb.append((Object)this.B);
        sb.append(", manager=");
        sb.append((Object)this.C);
        sb.append(", imeOptions=");
        sb.append((Object)this.D);
        sb.append(", focusRequester=");
        sb.append((Object)this.E);
        sb.append(")");
        return sb.toString();
    }
    
    public final void update(final hgf hgf) {
        final tb7 tb7 = (tb7)hgf;
        final boolean p = tb7.P;
        final int n = 0;
        final boolean b = p && !tb7.O;
        final boolean q = tb7.Q;
        final y4c t = tb7.T;
        final dkn s = tb7.S;
        final boolean y = this.y;
        final boolean z = this.z;
        int n2 = n;
        if (z) {
            n2 = n;
            if (!y) {
                n2 = 1;
            }
        }
        tb7.L = this.v;
        final mln w = this.w;
        tb7.M = w;
        tb7.N = this.x;
        tb7.O = y;
        tb7.P = z;
        tb7.R = this.B;
        final dkn c = this.C;
        tb7.S = c;
        final y4c d = this.D;
        tb7.T = d;
        tb7.U = this.E;
        if (z != p || n2 != (b ? 1 : 0) || !mlc.q((Object)d, (Object)t) || this.A != q || !dnn.d(w.b)) {
            soh.L((t98)tb7).T();
        }
        if (c != s) {
            c.g = (jta)new vg4((Object)tb7, (byte)18);
        }
    }
}
