import java.util.List;

public final class m30
{
    public final lta a;
    public lta b;
    public jta c;
    public cg0 d;
    public v08 e;
    public final ynf f;
    public final ksg g;
    public final ksg h;
    public final sd8 i;
    public final gsg j;
    public final gsg k;
    public final ksg l;
    public final ksg m;
    public final l30 n;
    
    public m30(final Object o) {
        this.a = (lta)new f3((byte)27);
        this.f = new ynf();
        this.g = o50.Q(o);
        this.h = o50.Q(o);
        this.i = r8m.b((jta)new h30(this, (byte)0));
        this.j = new gsg(Float.NaN);
        r8m.c((jta)new h30(this, (byte)1));
        this.k = new gsg(0.0f);
        this.l = o50.Q(null);
        this.m = o50.Q(new b48((List)r89.v, new float[0]));
        this.n = new l30(this);
    }
    
    public m30(final lta a, final Object o) {
        this(o);
        this.a = a;
    }
    
    public static Object b(final m30 m30, final bua bua, final h07 h07) {
        final Object a = m30.f.a(lnf.v, (lta)new j30((Object)m30, (Object)bua, (f07)null, (byte)0), h07);
        if (a == pc7.v) {
            return a;
        }
        return lqo.a;
    }
    
    public static void h(final m30 m30, final b48 b48) {
        final gsg j = m30.j;
        final sd8 i = m30.i;
        Object o;
        if (!Float.isNaN(j.h())) {
            if ((o = b48.a(m30.j.h())) == null) {
                o = i.getValue();
            }
        }
        else {
            o = i.getValue();
        }
        m30.g(b48, o);
    }
    
    public final Object a(Object a, final lnf lnf, final cua cua, final h07 h07) {
        k30 k31 = null;
        Label_0059: {
            if (h07 instanceof k30) {
                final k30 k30 = (k30)h07;
                final int x = k30.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    k30.x = x + Integer.MIN_VALUE;
                    k31 = k30;
                    break Label_0059;
                }
            }
            k31 = new k30(this, h07);
        }
        final Object v = k31.v;
        final int x2 = k31.x;
        final ksg l = this.l;
        Label_0174: {
            if (x2 != 0) {
                Label_0102: {
                    if (x2 == 1) {
                        Label_0183: {
                            try {
                                vt4.g0(v);
                                break Label_0174;
                            }
                            finally {
                                break Label_0183;
                            }
                            break Label_0102;
                        }
                        l.setValue((Object)null);
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            if (this.c().c(a)) {
                final ynf f = this.f;
                final k00 k32 = new k00((Object)this, a, (Object)cua, (f07)null, (byte)1);
                k31.x = 1;
                a = f.a(lnf, (lta)k32, (f07)k31);
                final pc7 v2 = pc7.v;
                if (a == v2) {
                    return v2;
                }
            }
            else {
                if (this.a.b(a)) {
                    this.h.setValue(a);
                    this.g.setValue(a);
                    return lqo.a;
                }
                return lqo.a;
            }
        }
        l.setValue((Object)null);
        return lqo.a;
    }
    
    public final b48 c() {
        return (b48)this.m.getValue();
    }
    
    public final boolean d() {
        return this.b != null && this.c != null && this.d != null && this.e != null;
    }
    
    public final float e(final float n) {
        final gsg j = this.j;
        float h;
        if (Float.isNaN(j.h())) {
            h = 0.0f;
        }
        else {
            h = j.h();
        }
        return ncq.n(h + n, this.c().e(), this.c().d());
    }
    
    public final float f() {
        final gsg j = this.j;
        if (Float.isNaN(j.h())) {
            jac.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return j.h();
    }
    
    public final void g(b48 b, final Object value) {
        if (!mlc.q(this.c(), b)) {
            this.m.setValue((Object)b);
            final ynf f = this.f;
            final cof b2 = f.b;
            b = (b48)f.b;
            final boolean f2 = b2.f();
            final ksg l = this.l;
            Label_0125: {
                if (f2) {
                    Label_0118: {
                        try {
                            final l30 n = this.n;
                            final float f3 = this.c().f(value);
                            if (!Float.isNaN(f3)) {
                                l30.b(n, f3);
                                l.setValue((Object)null);
                            }
                        }
                        finally {
                            break Label_0118;
                        }
                        this.g.setValue(value);
                        this.h.setValue(value);
                        ((cof)b).g((Object)null);
                        break Label_0125;
                    }
                    ((cof)b).g((Object)null);
                }
            }
            if (!f2) {
                l.setValue(value);
            }
        }
    }
}
