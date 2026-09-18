public final class cnb extends hgf implements teh
{
    public llf J;
    public wmb K;
    
    @Override
    public final void G(final jeh jeh, final keh keh, final long n) {
        if (keh == keh.w) {
            final int f = jeh.f;
            if (f == 4) {
                rhc.G(this.c1(), null, 0, (zta)new bnb(this, (f07)null, (byte)0), 3);
                return;
            }
            if (f == 5) {
                rhc.G(this.c1(), null, 0, (zta)new bnb(this, (f07)null, (byte)1), 3);
            }
        }
    }
    
    @Override
    public final void V() {
        this.q1();
    }
    
    @Override
    public final void h1() {
        this.q1();
    }
    
    public final Object o1(final h07 h07) {
        Object o = null;
        Label_0047: {
            if (h07 instanceof zmb) {
                final zmb zmb = (zmb)h07;
                final int y = zmb.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    zmb.y = y + Integer.MIN_VALUE;
                    o = zmb;
                    break Label_0047;
                }
            }
            o = new zmb(this, h07);
        }
        final Object w = ((zmb)o).w;
        final int y2 = ((zmb)o).y;
        Object v;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((zmb)o).v;
            vt4.g0(w);
        }
        else {
            vt4.g0(w);
            if (this.K != null) {
                return lqo.a;
            }
            final Object v2 = new Object();
            final llf j = this.J;
            ((zmb)o).v = (wmb)v2;
            ((zmb)o).y = 1;
            final Object a = j.a((eic)v2, (f07)o);
            final pc7 v3 = pc7.v;
            if (a == v3) {
                return v3;
            }
            v = v2;
        }
        this.K = (wmb)v;
        return lqo.a;
    }
    
    public final Object p1(final h07 h07) {
        Object o = null;
        Label_0047: {
            if (h07 instanceof anb) {
                final anb anb = (anb)h07;
                final int x = anb.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    anb.x = x + Integer.MIN_VALUE;
                    o = anb;
                    break Label_0047;
                }
            }
            o = new anb(this, h07);
        }
        final Object v = ((anb)o).v;
        final int x2 = ((anb)o).x;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
        }
        else {
            vt4.g0(v);
            final wmb k = this.K;
            if (k == null) {
                return lqo.a;
            }
            final xmb xmb = new xmb(k);
            final llf j = this.J;
            ((anb)o).x = 1;
            final Object a = j.a((eic)xmb, (f07)o);
            final pc7 v2 = pc7.v;
            if (a == v2) {
                return v2;
            }
        }
        this.K = null;
        return lqo.a;
    }
    
    public final void q1() {
        final wmb k = this.K;
        if (k != null) {
            this.J.b((eic)new xmb(k));
            this.K = null;
        }
    }
}
