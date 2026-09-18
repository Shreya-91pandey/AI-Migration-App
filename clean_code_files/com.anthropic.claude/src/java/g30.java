public final class g30 extends vu8
{
    public m30 e0;
    public Boolean f0;
    public gia g0;
    public gia h0;
    public xc8 i0;
    
    @Override
    public final boolean G1() {
        return this.e0.l.getValue() != null;
    }
    
    public final Object J1(final float v, final h07 h07) {
        d30 d31 = null;
        Label_0054: {
            if (h07 instanceof d30) {
                final d30 d30 = (d30)h07;
                final int y = d30.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    d30.y = y + Integer.MIN_VALUE;
                    d31 = d30;
                    break Label_0054;
                }
            }
            d31 = new d30(this, h07);
        }
        final Object w = d31.w;
        final int y2 = d31.y;
        if (y2 == 0) {
            vt4.g0(w);
            final boolean d32 = this.e0.d();
            final pc7 v2 = pc7.v;
            if (d32) {
                final m30 e0 = this.e0;
                d31.y = 1;
                if (!e0.d()) {
                    jac.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
                }
                final Object value = e0.g.getValue();
                final b48 c = e0.c();
                final float f = e0.f();
                final lta b = e0.b;
                if (b == null) {
                    mlc.j0("positionalThreshold");
                    throw null;
                }
                final jta c2 = e0.c;
                if (c2 == null) {
                    mlc.j0("velocityThreshold");
                    throw null;
                }
                final Object v3 = ri2.v(c, f, v, b, c2);
                Object o;
                if (e0.a.b(v3)) {
                    o = ri2.m(e0, v3, v, d31);
                }
                else {
                    o = ri2.m(e0, value, v, d31);
                }
                if (o != v2) {
                    return o;
                }
            }
            else {
                final Object v4 = new Object();
                ((y3j)v4).v = v;
                final m30 e2 = this.e0;
                final f30 f2 = new f30(this, (y3j)v4, v, (f07)null);
                d31.v = (y3j)v4;
                d31.y = 2;
                if (m30.b(e2, (bua)f2, (h07)d31) != v2) {
                    final y3j v5 = (y3j)v4;
                    return new Float(v5.v);
                }
            }
            return v2;
        }
        if (y2 == 1) {
            vt4.g0(w);
            return w;
        }
        if (y2 != 2) {
            en9.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        final y3j v5 = d31.v;
        vt4.g0(w);
        return new Float(v5.v);
    }
    
    public final boolean K1() {
        final Boolean f0 = this.f0;
        if (f0 == null) {
            return soh.L(this).V == qzc.w && super.L == zhg.w;
        }
        f0.getClass();
        return f0;
    }
    
    public final void L1(final gia gia) {
        Object h0 = gia;
        if (gia == null) {
            final alo a = r20.a;
            final f3 b = r20.b;
            final xc8 u = soh.L(this).U;
            this.i0 = u;
            h0 = new j7m((n7m)new zn0(this.e0, b, new t20(u, (byte)0)), ri2.b, (cg0)a);
        }
        this.h0 = (gia)h0;
    }
    
    @Override
    public final void f() {
        this.V();
        if (super.I) {
            final xc8 u = soh.L(this).U;
            final xc8 i0 = this.i0;
            if (i0 == null || !i0.equals(u)) {
                this.i0 = u;
                this.L1(this.g0);
            }
        }
    }
    
    @Override
    public final void g1() {
        this.L1(this.g0);
    }
    
    @Override
    public final Object s1(final nh6 nh6, final fh fh) {
        final Object b = m30.b(this.e0, (bua)new c30(nh6, this, (f07)null), (h07)fh);
        if (b == pc7.v) {
            return b;
        }
        return lqo.a;
    }
}
