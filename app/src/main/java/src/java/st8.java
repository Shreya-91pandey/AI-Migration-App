public final class st8 extends hgf implements wfo, ut8, jzc
{
    public final lta J;
    public st8 K;
    public ut8 L;
    public long M;
    
    public st8(tt8 j, final int n) {
        if ((n & 0x2) != 0x0) {
            j = null;
        }
        this.J = (lta)j;
        this.M = 0L;
    }
    
    public final void G0(final mt8 mt8) {
        final ut8 l = this.L;
        if (l == null) {
            final st8 k = this.K;
            if (k != null) {
                k.G0(mt8);
            }
            return;
        }
        l.G0(mt8);
    }
    
    public final void H0(final mt8 mt8) {
        final st8 k = this.K;
        st8 i;
        if (k != null && ljq.y(k, i9r.k(mt8))) {
            i = k;
        }
        else {
            Object o;
            if (!super.v.I) {
                o = null;
            }
            else {
                final Object o2 = new Object();
                o50.c0((wfo)this, (lta)new sd(o2, (Object)this, (Object)mt8, (byte)7));
                o = ((b4j)o2).v;
            }
            i = (st8)o;
        }
        if (i != null && k == null) {
            i.z(mt8);
            i.H0(mt8);
            final ut8 l = this.L;
            if (l != null) {
                l.x0(mt8);
            }
        }
        else if (i == null && k != null) {
            final ut8 j = this.L;
            if (j != null) {
                j.z(mt8);
                j.H0(mt8);
            }
            k.x0(mt8);
        }
        else if (!mlc.q((Object)i, (Object)k)) {
            if (i != null) {
                i.z(mt8);
                i.H0(mt8);
            }
            if (k != null) {
                k.x0(mt8);
            }
        }
        else if (i != null) {
            i.H0(mt8);
        }
        else {
            final ut8 m = this.L;
            if (m != null) {
                m.H0(mt8);
            }
        }
        this.K = i;
    }
    
    public final void N(final mt8 mt8) {
        final mv5 mv5 = new mv5((Object)mt8, (byte)13);
        if (mv5.b((Object)this) != vfo.v) {
            return;
        }
        o50.c0((wfo)this, (lta)mv5);
    }
    
    public final boolean Y0(final mt8 mt8) {
        final st8 k = this.K;
        if (k == null) {
            final ut8 l = this.L;
            return l != null && l.Y0(mt8);
        }
        return k.Y0(mt8);
    }
    
    public final void c(final long m) {
        this.M = m;
    }
    
    public final void h1() {
        this.L = null;
        this.K = null;
    }
    
    public final Object u() {
        return def.x;
    }
    
    public final void x0(final mt8 mt8) {
        final ut8 l = this.L;
        if (l != null) {
            l.x0(mt8);
        }
        final st8 k = this.K;
        if (k != null) {
            k.x0(mt8);
        }
        this.K = null;
    }
    
    public final void z(final mt8 mt8) {
        final ut8 l = this.L;
        if (l == null) {
            final st8 k = this.K;
            if (k != null) {
                k.z(mt8);
            }
            return;
        }
        l.z(mt8);
    }
}
