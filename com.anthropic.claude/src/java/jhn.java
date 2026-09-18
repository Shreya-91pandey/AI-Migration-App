import java.util.concurrent.CancellationException;

public final class jhn extends ogf
{
    public final ykn A;
    public final qm2 B;
    public final boolean C;
    public final ufk D;
    public final zhg E;
    public final g66 F;
    public final lbh G;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final qmn y;
    public final peo z;
    
    public jhn(final boolean v, final boolean w, final boolean x, final qmn y, final peo z, final ykn a, final qm2 b, final boolean c, final ufk d, final zhg e, final g66 f, final lbh g) {
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
        this.F = f;
        this.G = g;
    }
    
    public final hgf create() {
        return (hgf)new mhn(this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof jhn) {
                final jhn jhn = (jhn)o;
                if (this.v == jhn.v) {
                    if (this.w == jhn.w) {
                        if (this.x == jhn.x) {
                            if (mlc.q((Object)this.y, (Object)jhn.y)) {
                                if (mlc.q((Object)this.z, (Object)jhn.z)) {
                                    if (this.A != jhn.A) {
                                        return false;
                                    }
                                    if (mlc.q((Object)this.B, (Object)jhn.B)) {
                                        if (this.C == jhn.C) {
                                            if (mlc.q((Object)this.D, (Object)jhn.D)) {
                                                if (this.E == jhn.E) {
                                                    if (mlc.q((Object)this.F, (Object)jhn.F)) {
                                                        if (mlc.q((Object)this.G, (Object)jhn.G)) {
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
                }
            }
            return false;
        }
        return true;
    }
    
    public final int hashCode() {
        final int l = smk.l((this.B.hashCode() + (this.A.hashCode() + (this.z.hashCode() + (this.y.hashCode() + smk.l(smk.l(Boolean.hashCode(this.v) * 31, 31, this.w), 31, this.x)) * 31) * 31) * 31) * 31, 31, this.C);
        final int hashCode = this.D.hashCode();
        final int hashCode2 = this.E.hashCode();
        final int hashCode3 = this.F.hashCode();
        final lbh g = this.G;
        int hashCode4;
        if (g == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = g.hashCode();
        }
        return (hashCode3 + (hashCode2 + (hashCode + l) * 31) * 31) * 31 + hashCode4;
    }
    
    public final String toString() {
        final StringBuilder m = idn.m("TextFieldCoreModifier(isFocused=", ", isDragHovered=", ", isTouchDragInProgress=", this.v, this.w);
        m.append(this.x);
        m.append(", textLayoutState=");
        m.append((Object)this.y);
        m.append(", textFieldState=");
        m.append((Object)this.z);
        m.append(", textFieldSelectionState=");
        m.append((Object)this.A);
        m.append(", cursorBrush=");
        m.append((Object)this.B);
        m.append(", writeable=");
        m.append(this.C);
        m.append(", scrollState=");
        m.append((Object)this.D);
        m.append(", orientation=");
        m.append((Object)this.E);
        m.append(", toolbarRequester=");
        m.append((Object)this.F);
        m.append(", platformSelectionBehaviors=");
        m.append((Object)this.G);
        m.append(")");
        return m.toString();
    }
    
    public final void update(final hgf hgf) {
        final mhn mhn = (mhn)hgf;
        final boolean r1 = mhn.r1();
        final boolean l = mhn.L;
        final peo o = mhn.O;
        final qmn n = mhn.N;
        final ykn p = mhn.P;
        final ufk s = mhn.S;
        final boolean v = this.v;
        mhn.L = v;
        final ykn a = this.A;
        a.h = v;
        final boolean w = this.w;
        mhn.M = w;
        final qmn y = this.y;
        mhn.N = y;
        final peo z = this.z;
        mhn.O = z;
        mhn.P = a;
        mhn.Q = this.B;
        mhn.R = this.C;
        final ufk d = this.D;
        mhn.S = d;
        mhn.T = this.E;
        final g66 f = this.F;
        mhn.U = f;
        mhn.V = this.G;
        mhn.c0.r1(z, a, y, v || w || this.x);
        final vgn d2 = mhn.d0;
        d2.L.w = null;
        d2.L = f;
        f.w = d2;
        int v2;
        if (((hgf)d2).I) {
            v2 = 3;
        }
        else {
            v2 = 2;
        }
        f.v = v2;
        if (!mhn.r1()) {
            final wmm x = mhn.X;
            if (x != null) {
                ((bqc)x).g((CancellationException)null);
            }
            mhn.X = null;
            final pr7 w2 = mhn.W;
            if (w2 != null) {
                final opc opc = (opc)w2.b.getAndSet((Object)null);
                if (opc != null) {
                    opc.g((CancellationException)null);
                }
            }
        }
        else if (!l || !mlc.q((Object)o, (Object)z) || !r1) {
            mhn.s1();
        }
        if (mlc.q((Object)o, (Object)z) && mlc.q((Object)n, (Object)y) && mlc.q((Object)p, (Object)a) && mlc.q((Object)s, (Object)d)) {
            return;
        }
        soh.L((t98)mhn).R();
    }
}
