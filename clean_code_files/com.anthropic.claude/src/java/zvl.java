import java.util.Set;

public final class zvl
{
    public final Set a;
    public final jta b;
    public final lta c;
    public final boolean d;
    public final m30 e;
    public bfa f;
    public bfa g;
    
    public zvl(final Set a, final jta b, final fwl fwl, final lta c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (!a.contains((Object)fwl.w)) {
            en9.s("Expanded must be one of the enabled values.");
            throw null;
        }
        if (a.contains((Object)fwl)) {
            final int a2 = zul.a;
            this.e = new m30(c, (Object)fwl);
            this.f = (bfa)ri2.z0();
            this.g = (bfa)ri2.z0();
            return;
        }
        en9.s("The initial value must be one of the enabled values.");
        throw null;
    }
    
    public final Object a(final gia gia, final float n, final h07 h07) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof yvl) {
                final yvl yvl = (yvl)h07;
                final int y = yvl.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    yvl.y = y + Integer.MIN_VALUE;
                    o = yvl;
                    break Label_0054;
                }
            }
            o = new yvl(this, h07);
        }
        final Object w = ((yvl)o).w;
        final int y2 = ((yvl)o).y;
        y3j v;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((yvl)o).v;
            vt4.g0(w);
        }
        else {
            vt4.g0(w);
            final Object v2 = new Object();
            final v53 v3 = new v53((y3j)v2, gia, this, n, (f07)null);
            ((yvl)o).v = (y3j)v2;
            ((yvl)o).y = 1;
            final Object b = m30.b(this.e, (bua)v3, (h07)o);
            final pc7 v4 = pc7.v;
            if (b == v4) {
                return v4;
            }
            v = (y3j)v2;
        }
        return new Float(v.v);
    }
    
    public final Object b(final fwl fwl, final bfa bfa, final h07 h07) {
        final m30 e = this.e;
        Object a = e.a((Object)fwl, lnf.v, (cua)new v20(e, (cg0)bfa, (f07)null), h07);
        final lqo a2 = lqo.a;
        final pc7 v = pc7.v;
        if (a != v) {
            a = a2;
        }
        if (a == v) {
            return a;
        }
        return a2;
    }
    
    public final Object c(final h07 h07) {
        final lta c = this.c;
        final fwl w = fwl.w;
        if (c.b((Object)w)) {
            final Object b = this.b(w, this.f, h07);
            if (b == pc7.v) {
                return b;
            }
        }
        return lqo.a;
    }
    
    public final fwl d() {
        return (fwl)this.e.h.getValue();
    }
    
    public final boolean e() {
        return this.e.c().c(fwl.x);
    }
    
    public final fwl f() {
        return (fwl)this.e.i.getValue();
    }
    
    public final Object g(final m6n m6n) {
        final Set a = this.a;
        final fwl v = fwl.v;
        if (a.contains((Object)v)) {
            if (this.c.b((Object)v)) {
                final Object b = this.b(v, this.g, (h07)m6n);
                if (b == pc7.v) {
                    return b;
                }
            }
            return lqo.a;
        }
        en9.q("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        return null;
    }
    
    public final boolean h() {
        return this.e.g.getValue() != fwl.v;
    }
    
    public final Object i(final m6n m6n) {
        final Set a = this.a;
        final fwl x = fwl.x;
        if (a.contains((Object)x)) {
            if (this.c.b((Object)x)) {
                final Object b = this.b(x, this.g, (h07)m6n);
                if (b == pc7.v) {
                    return b;
                }
            }
            return lqo.a;
        }
        en9.q("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        return null;
    }
    
    public final Object j(final m6n m6n) {
        fwl fwl;
        if (this.e()) {
            fwl = fwl.x;
        }
        else {
            fwl = fwl.w;
        }
        if (this.c.b((Object)fwl)) {
            final Object b = this.b(fwl, this.f, (h07)m6n);
            if (b == pc7.v) {
                return b;
            }
        }
        return lqo.a;
    }
}
