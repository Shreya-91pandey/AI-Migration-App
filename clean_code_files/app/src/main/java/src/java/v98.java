public abstract class v98 extends hgf
{
    public final int J;
    public hgf K;
    
    public v98() {
        this.J = zxf.e((hgf)this);
    }
    
    @Override
    public final void e1() {
        super.e1();
        for (hgf hgf = this.K; hgf != null; hgf = hgf.A) {
            hgf.n1(super.C);
            if (!hgf.I) {
                hgf.e1();
            }
        }
    }
    
    @Override
    public final void f1() {
        for (hgf hgf = this.K; hgf != null; hgf = hgf.A) {
            hgf.f1();
        }
        super.f1();
    }
    
    @Override
    public final void j1() {
        super.j1();
        for (hgf hgf = this.K; hgf != null; hgf = hgf.A) {
            hgf.j1();
        }
    }
    
    @Override
    public final void k1() {
        for (hgf hgf = this.K; hgf != null; hgf = hgf.A) {
            hgf.k1();
        }
        super.k1();
    }
    
    @Override
    public final void l1() {
        super.l1();
        for (hgf hgf = this.K; hgf != null; hgf = hgf.A) {
            hgf.l1();
        }
    }
    
    @Override
    public final void m1(final hgf v) {
        super.v = v;
        for (hgf hgf = this.K; hgf != null; hgf = hgf.A) {
            hgf.m1(v);
        }
    }
    
    @Override
    public final void n1(final yxf c) {
        super.C = c;
        for (hgf hgf = this.K; hgf != null; hgf = hgf.A) {
            hgf.n1(c);
        }
    }
    
    public final t98 o1(final t98 t98) {
        final hgf z0 = t98.z0();
        if (z0 != t98) {
            hgf hgf;
            if (t98 instanceof hgf) {
                hgf = (hgf)t98;
            }
            else {
                hgf = null;
            }
            hgf z2;
            if (hgf != null) {
                z2 = hgf.z;
            }
            else {
                z2 = null;
            }
            if (z0 != super.v || !mlc.q(z2, this)) {
                en9.q("Cannot delegate to an already delegated node");
                return null;
            }
        }
        else {
            if (z0.I) {
                gac.c("Cannot delegate to an already attached node");
            }
            z0.m1(super.v);
            final int x = super.x;
            final int f = zxf.f(z0);
            z0.x = f;
            final int x2 = super.x;
            final int n = f & 0x2;
            if (n != 0 && (x2 & 0x2) != 0x0 && !(this instanceof a0d)) {
                final StringBuilder sb = new StringBuilder("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ");
                sb.append((Object)this);
                sb.append("\nDelegate Node: ");
                sb.append((Object)z0);
                gac.c(sb.toString());
            }
            z0.A = this.K;
            this.K = z0;
            ((v98)(z0.z = this)).q1(f | super.x, false);
            if (super.I) {
                if (n != 0 && (x & 0x2) == 0x0) {
                    final rxf z3 = soh.L(this).Z;
                    super.v.n1(null);
                    z3.t();
                }
                else {
                    this.n1(super.C);
                }
                z0.e1();
                z0.k1();
                if (!z0.I) {
                    gac.c("autoInvalidateInsertedNode called on unattached node");
                }
                zxf.a(z0, -1, 1);
            }
        }
        return t98;
    }
    
    public final void p1(final t98 t98) {
        hgf k = this.K;
        hgf hgf = null;
        while (k != null) {
            if (k == t98) {
                final boolean i = k.I;
                if (i) {
                    final amf a = zxf.a;
                    if (!i) {
                        gac.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    zxf.a(k, -1, 2);
                    k.l1();
                    k.f1();
                }
                k.m1(k);
                k.y = 0;
                final hgf a2 = k.A;
                if (hgf == null) {
                    this.K = a2;
                }
                else {
                    hgf.A = a2;
                }
                k.A = null;
                k.z = null;
                final int x = super.x;
                final int f = zxf.f((hgf)this);
                this.q1(f, true);
                if (super.I && (x & 0x2) != 0x0) {
                    if ((f & 0x2) == 0x0) {
                        final rxf z = soh.L(this).Z;
                        super.v.n1(null);
                        z.t();
                    }
                }
                return;
            }
            final hgf a3 = k.A;
            hgf = k;
            k = a3;
        }
        uy8.g((Object)t98, "Could not find delegate: ");
    }
    
    public final void q1(int y, final boolean b) {
        final int x = super.x;
        super.x = y;
        if (x != y) {
            final hgf v = super.v;
            if (v == this) {
                super.y = y;
            }
            if (super.I) {
                int x2 = y;
                hgf hgf = this;
                while (true) {
                    y = x2;
                    if (hgf == null) {
                        break;
                    }
                    x2 |= hgf.x;
                    hgf.x = x2;
                    y = x2;
                    if (hgf == v) {
                        break;
                    }
                    hgf = hgf.z;
                }
                int f = y;
                if (b) {
                    f = y;
                    if (hgf == v) {
                        f = zxf.f(v);
                        v.x = f;
                    }
                }
                Label_0139: {
                    if (hgf != null) {
                        final hgf a = hgf.A;
                        if (a != null) {
                            y = a.y;
                            break Label_0139;
                        }
                    }
                    y = 0;
                }
                y |= f;
                while (hgf != null) {
                    y |= hgf.x;
                    hgf.y = y;
                    hgf = hgf.z;
                }
            }
        }
    }
}
