import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.List;

public final class rv7 implements ou7
{
    public final sca a;
    public final uc7 b;
    public final fz6 c;
    public final n6k d;
    public final cof e;
    public int f;
    public wmm g;
    public final j9j h;
    public final uy7 i;
    public final l7n j;
    public final l7n k;
    public final c2l l;
    
    public rv7(final sca a, final List list, final uc7 b, final hc7 hc7) {
        this.a = a;
        this.b = b;
        final opc opc = (opc)hc7.M0((gc7)o55.z);
        if (opc != null) {
            final fz6 a2 = ien.a(hc7.F0((hc7)opc));
            this.c = a2;
            this.d = new n6k((zta)new av7((byte)0, (f07)null, (Object)this));
            this.e = new cof();
            this.h = new j9j((byte)12);
            this.i = new uy7(this, list, a2.v);
            this.j = new l7n((jta)new su7(this, (byte)0));
            this.k = new l7n((jta)new su7(this, (byte)1));
            this.l = new c2l(a2, new i1((Object)this, (byte)23), new rg6((byte)11), new p10((byte)23, (f07)null, (Object)this));
            return;
        }
        fvd.j((Object)hc7, "Missing Job on Coroutine context: ");
        throw null;
    }
    
    @Override
    public final Object a(final zta zta, final h07 h07) {
        x90.u(this.c.v);
        return zn2.R("DataStore.updateData", (yci)null, (lta)new ip6(this, zta, null, (byte)2), h07);
    }
    
    public final Object b(h07 v) {
        Object o = null;
        Label_0047: {
            if (v instanceof bv7) {
                final bv7 bv7 = (bv7)v;
                final int y = bv7.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    bv7.y = y + Integer.MIN_VALUE;
                    o = bv7;
                    break Label_0047;
                }
            }
            o = new bv7(this, v);
        }
        final Object w = ((bv7)o).w;
        final int y2 = ((bv7)o).y;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = (h07)((bv7)o).v;
            vt4.g0(w);
        }
        else {
            vt4.g0(w);
            final cof e = this.e;
            ((bv7)o).v = e;
            ((bv7)o).y = 1;
            final Object c = e.c((f07)o);
            final pc7 v2 = pc7.v;
            if (c == v2) {
                return v2;
            }
            v = (h07)e;
        }
        Label_0179: {
            Label_0168: {
                try {
                    final int f = this.f - 1;
                    this.f = f;
                    if (f != 0) {
                        break Label_0168;
                    }
                    final wmm g = this.g;
                    if (g != null) {
                        ((bqc)g).g((CancellationException)null);
                    }
                }
                finally {
                    break Label_0179;
                }
                this.g = null;
            }
            ((aof)v).g((Object)null);
            return lqo.a;
        }
        ((aof)v).g((Object)null);
    }
    
    public final ozl c() {
        return (ozl)this.k.getValue();
    }
    
    public final Object d(h07 v) {
        Object o = null;
        Label_0047: {
            if (v instanceof cv7) {
                final cv7 cv7 = (cv7)v;
                final int y = cv7.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    cv7.y = y + Integer.MIN_VALUE;
                    o = cv7;
                    break Label_0047;
                }
            }
            o = new cv7(this, v);
        }
        final Object w = ((cv7)o).w;
        final int y2 = ((cv7)o).y;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = (h07)((cv7)o).v;
            vt4.g0(w);
        }
        else {
            vt4.g0(w);
            final cof e = this.e;
            ((cv7)o).v = e;
            ((cv7)o).y = 1;
            final Object c = e.c((f07)o);
            final pc7 v2 = pc7.v;
            if (c == v2) {
                return v2;
            }
            v = (h07)e;
        }
        Label_0192: {
            try {
                final int f = this.f + 1;
                this.f = f;
                if (f == 1) {
                    this.g = rhc.G((oc7)this.c, (hc7)null, 0, (zta)new m33((byte)3, (f07)null, (Object)this), 3);
                }
            }
            finally {
                break Label_0192;
            }
            ((aof)v).g((Object)null);
            return lqo.a;
        }
        ((aof)v).g((Object)null);
    }
    
    public final Object e(boolean v, final f07 f07) {
        fv7 fv7 = null;
        Label_0049: {
            if (f07 instanceof fv7) {
                fv7 = (fv7)f07;
                final int z = fv7.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    fv7.z = z + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            fv7 = new fv7(this, f07);
        }
        Object o = fv7.x;
        final int z2 = fv7.z;
        final j9j h = this.h;
        final pc7 v2 = pc7.v;
        yog yog = null;
        Label_0392: {
            Label_0387: {
                Label_0319: {
                    vom w;
                    if (z2 != 0) {
                        if (z2 != 1) {
                            if (z2 == 2) {
                                vt4.g0(o);
                                break Label_0319;
                            }
                            if (z2 == 3) {
                                vt4.g0(o);
                                break Label_0387;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        else {
                            v = fv7.v;
                            w = fv7.w;
                            vt4.g0(o);
                        }
                    }
                    else {
                        vt4.g0(o);
                        w = h.v();
                        if (w instanceof spo) {
                            en9.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return null;
                        }
                        final ozl c = this.c();
                        fv7.w = w;
                        fv7.v = v;
                        fv7.z = 1;
                        if ((o = c.a()) == v2) {
                            return v2;
                        }
                    }
                    final int intValue = ((Number)o).intValue();
                    final boolean b = w instanceof ot7;
                    int a;
                    if (b) {
                        a = ((ot7)w).a;
                    }
                    else {
                        a = -1;
                    }
                    if (b && intValue == a) {
                        return w;
                    }
                    final hv7 hv7 = new hv7(this, a, (f07)null);
                    if (v) {
                        final ozl c2 = this.c();
                        final gv7 gv7 = new gv7(this, hv7, v, (f07)null);
                        fv7.w = null;
                        fv7.v = v;
                        fv7.z = 2;
                        if ((o = c2.b((lta)gv7, fv7)) == v2) {
                            return v2;
                        }
                    }
                    else {
                        final ozl c3 = this.c();
                        final dy5 dy5 = new dy5((Object)this, (Serializable)hv7, (f07)null, (byte)2);
                        fv7.w = null;
                        fv7.v = v;
                        fv7.z = 3;
                        if ((o = c3.c((zta)dy5, fv7)) == v2) {
                            return v2;
                        }
                        break Label_0387;
                    }
                }
                yog = (yog)o;
                break Label_0392;
            }
            yog = (yog)o;
        }
        final vom vom = (vom)yog.v;
        if (yog.w) {
            h.E(vom);
        }
        return vom;
    }
    
    public final Object f(boolean v, zta zta, final h07 h07) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof iv7) {
                final iv7 iv7 = (iv7)h07;
                final int z = iv7.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    iv7.z = z + Integer.MIN_VALUE;
                    o = iv7;
                    break Label_0054;
                }
            }
            o = new iv7(this, h07);
        }
        Object x = ((iv7)o).x;
        final int z2 = ((iv7)o).z;
        if (z2 != 0) {
            if (z2 != 1) {
                if (z2 == 2) {
                    vt4.g0(x);
                    return x;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                v = ((iv7)o).v;
                zta = (zta)((iv7)o).w;
                vt4.g0(x);
            }
        }
        else {
            vt4.g0(x);
            ((iv7)o).w = (m6n)zta;
            ((iv7)o).v = v;
            ((iv7)o).z = 1;
            x = null;
        }
        final yci yci = (yci)x;
        final hc7 v2 = this.c.v;
        final sf0 sf0 = new sf0(this, yci, v, zta, null);
        ((iv7)o).w = null;
        ((iv7)o).v = v;
        ((iv7)o).z = 2;
        final Object f0 = rhc.f0(v2, (zta)sf0, (f07)o);
        final pc7 v3 = pc7.v;
        if (f0 == v3) {
            return v3;
        }
        return f0;
    }
    
    public final Object g(final yci yci, final h07 h07) {
        mv7 mv8 = null;
        Label_0051: {
            if (h07 instanceof mv7) {
                final mv7 mv7 = (mv7)h07;
                final int x = mv7.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    mv7.x = x + Integer.MIN_VALUE;
                    mv8 = mv7;
                    break Label_0051;
                }
            }
            mv8 = new mv7(this, h07);
        }
        final Object v = mv8.v;
        final int x2 = mv8.x;
        final pc7 v2 = pc7.v;
        Label_0104: {
            if (x2 == 0) {
                break Label_0104;
            }
            if (x2 != 1) {
                if (x2 == 2) {
                    vt4.g0(v);
                    return v;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                vt4.g0(v);
                Label_0182: {
                    mv8.x = 2;
                }
                final Object e = this.e(false, (f07)mv8);
                if (e != v2) {
                    return e;
                }
                return v2;
                vt4.g0(v);
                final j9j h8 = this.h;
                iftrue(Label_0132:)(!(h8.v() instanceof nea));
                return h8.v();
                Label_0132:
                mv8.x = 1;
                Object o = zn2.R("DataStore.readAndInitOrPropagateAndThrowFailure", yci, (lta)new ev7(this, null), (h07)mv8);
                iftrue(Label_0169:)(o != v2);
                while (true) {
                    iftrue(Label_0182:)(o != v2);
                    return v2;
                    continue;
                    Label_0169:
                    o = lqo.a;
                    continue;
                }
            }
            finally {
                final Throwable t;
                return new dsi(-1, t);
            }
        }
    }
    
    @Override
    public final ija getData() {
        return (ija)this.d;
    }
    
    public final Object h(Object v, final boolean b, final h07 h07) {
        ov7 ov8 = null;
        Label_0054: {
            if (h07 instanceof ov7) {
                final ov7 ov7 = (ov7)h07;
                final int y = ov7.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ov7.y = y + Integer.MIN_VALUE;
                    ov8 = ov7;
                    break Label_0054;
                }
            }
            ov8 = new ov7(this, h07);
        }
        final Object w = ov8.w;
        final int y2 = ov8.y;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ov8.v;
            vt4.g0(w);
        }
        else {
            vt4.g0(w);
            final Object v2 = new Object();
            final vca vca = (vca)this.j.getValue();
            v = new qv7(this, (z3j)v2, v, b, null);
            ov8.v = (z3j)v2;
            ov8.y = 1;
            final Object b2 = vca.b((qv7)v, ov8);
            final pc7 v3 = pc7.v;
            if (b2 == v3) {
                return v3;
            }
            v = v2;
        }
        return new Integer(((z3j)v).v);
    }
}
