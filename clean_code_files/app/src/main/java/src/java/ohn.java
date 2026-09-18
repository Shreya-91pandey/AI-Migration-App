import java.util.concurrent.CancellationException;

public final class ohn extends ogf
{
    public final boolean A;
    public final mvc B;
    public final boolean C;
    public final llf D;
    public final ymf E;
    public final peo v;
    public final qmn w;
    public final ykn x;
    public final tdc y;
    public final boolean z;
    
    public ohn(final peo v, final qmn w, final ykn x, final tdc y, final boolean z, final boolean a, final mvc b, final boolean c, final llf d, final ymf e) {
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
        return (hgf)new yhn(this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E);
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof ohn) {
                final ohn ohn = (ohn)o;
                if (mlc.q((Object)this.v, (Object)ohn.v)) {
                    if (mlc.q((Object)this.w, (Object)ohn.w)) {
                        if (this.x != ohn.x) {
                            return false;
                        }
                        if (mlc.q((Object)this.y, (Object)ohn.y)) {
                            if (this.z == ohn.z) {
                                if (this.A == ohn.A) {
                                    if (this.B.equals(ohn.B)) {
                                        if (this.C == ohn.C) {
                                            if (mlc.q((Object)this.D, (Object)ohn.D)) {
                                                if (mlc.q((Object)this.E, (Object)ohn.E)) {
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
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        final int hashCode = this.v.hashCode();
        final int hashCode2 = this.w.hashCode();
        final int hashCode3 = this.x.hashCode();
        final int n = 0;
        final tdc y = this.y;
        int hashCode4;
        if (y == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = y.hashCode();
        }
        final int l = smk.l((this.D.hashCode() + smk.l((this.B.hashCode() + smk.l(smk.l(((hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + hashCode4) * 31, 31, this.z), 31, this.A)) * 961, 31, this.C)) * 31, 31, false);
        final ymf e = this.E;
        int hashCode5;
        if (e == null) {
            hashCode5 = n;
        }
        else {
            hashCode5 = e.hashCode();
        }
        return l + hashCode5;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TextFieldDecoratorModifier(textFieldState=");
        sb.append((Object)this.v);
        sb.append(", textLayoutState=");
        sb.append((Object)this.w);
        sb.append(", textFieldSelectionState=");
        sb.append((Object)this.x);
        sb.append(", filter=");
        sb.append((Object)this.y);
        sb.append(", enabled=");
        p3g.i(sb, this.z, ", readOnly=", this.A, ", keyboardOptions=");
        sb.append((Object)this.B);
        sb.append(", keyboardActionHandler=null, singleLine=");
        sb.append(this.C);
        sb.append(", interactionSource=");
        sb.append((Object)this.D);
        sb.append(", isPassword=false, stylusHandwritingTrigger=");
        sb.append((Object)this.E);
        sb.append(")");
        return sb.toString();
    }
    
    public final void update(final hgf hgf) {
        final yhn yhn = (yhn)hgf;
        final t6n w = yhn.W;
        final lna v = yhn.V;
        final boolean p = yhn.P;
        boolean b = true;
        final boolean b2 = p && !yhn.Q;
        final peo l = yhn.L;
        final mvc r = yhn.R;
        final ykn n = yhn.N;
        final llf t = yhn.T;
        final ymf u = yhn.U;
        final boolean z = this.z;
        final boolean a = this.A;
        if (!z || a) {
            b = false;
        }
        final peo v2 = this.v;
        yhn.L = v2;
        yhn.M = this.w;
        final ykn x = this.x;
        yhn.N = x;
        yhn.O = this.y;
        yhn.P = z;
        yhn.Q = a;
        final mvc b3 = this.B;
        yhn.R = b3;
        yhn.S = this.C;
        final llf d = this.D;
        yhn.T = d;
        final ymf e = this.E;
        yhn.U = e;
        if (b != b2 || !mlc.q((Object)v2, (Object)l) || !b3.equals(r) || !mlc.q((Object)e, (Object)u)) {
            if (b && (yhn.u1() || yhn.d0 != null)) {
                yhn.w1(false);
            }
            else if (!b) {
                yhn.s1();
            }
        }
        if (z != p || b != b2 || b3.c() != r.c()) {
            soh.L((t98)yhn).T();
        }
        if (x != n) {
            w.q1();
            if (((hgf)yhn).I) {
                x.o = (jta)yhn.e0;
                if (yhn.u1()) {
                    final wmm a2 = yhn.a0;
                    if (a2 != null) {
                        ((bqc)a2).g((CancellationException)null);
                        yhn.a0 = rhc.G(((hgf)yhn).c1(), (hc7)null, 0, (zta)new zx1(x, (f07)null, (byte)3), 3);
                    }
                }
            }
            x.n = (jta)new rhn(yhn, (byte)2);
        }
        if (!mlc.q((Object)d, (Object)t)) {
            w.q1();
            if (((hgf)v).I) {
                v.t1(d);
            }
        }
        if (z != p) {
            if (z) {
                yhn.o1((t98)v);
                v.t1(d);
                return;
            }
            yhn.p1((t98)v);
        }
    }
}
