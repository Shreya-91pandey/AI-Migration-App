import com.anthropic.claude.types.strings.ElicitationId;

public final class ah8
{
    public final fn3 a;
    public final p84 b;
    public final aa4 c;
    public final yo3 d;
    public final kgl e;
    public final fz6 f;
    public final ksg g;
    public final ksg h;
    public String i;
    public wmm j;
    public final ksg k;
    public wmm l;
    public final sd8 m;
    
    public ah8(final fn3 a, final p84 b, final aa4 c, final yo3 d, final kgl e, final fz6 f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = o50.Q((Object)null);
        this.h = o50.Q((Object)null);
        this.k = o50.Q((Object)Boolean.FALSE);
        final def d2 = def.D;
        final og8 og8 = new og8(this, (byte)1);
        final tze a2 = r8m.a;
        this.m = new sd8((jta)og8, (q8m)d2);
    }
    
    public static boolean e(final tg8 tg8, final k39 k39) {
        final int m = o47.m(tg8);
        if (m == 0) {
            return mlc.q((Object)((sg8)tg8).a().a(), (Object)k39.a());
        }
        if (m != 1 && m != 2 && m != 3) {
            en9.r();
            return false;
        }
        return c7r.g(tg8.a(), k39);
    }
    
    public final Object a(k39 v, final h07 h07) {
        Object o = null;
        Label_0051: {
            if (h07 instanceof ug8) {
                final ug8 ug8 = (ug8)h07;
                final int y = ug8.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ug8.y = y + Integer.MIN_VALUE;
                    o = ug8;
                    break Label_0051;
                }
            }
            o = new ug8(this, h07);
        }
        final Object w = ((ug8)o).w;
        final int y2 = ((ug8)o).y;
        Object o2;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((ug8)o).v;
            vt4.g0(w);
            o2 = w;
        }
        else {
            vt4.g0(w);
            final vg8 vg8 = new vg8(this, (f07)null, (byte)0);
            ((ug8)o).v = v;
            ((ug8)o).y = 1;
            final Enum b = this.b((lta)vg8, (h07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = b) == v2) {
                return v2;
            }
        }
        if (o2 == null) {
            this.i = v.a();
        }
        return o2;
    }
    
    public final Enum b(final lta lta, final h07 h07) {
        Object o = null;
        Label_0051: {
            if (h07 instanceof wg8) {
                final wg8 wg8 = (wg8)h07;
                final int x = wg8.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    wg8.x = x + Integer.MIN_VALUE;
                    o = wg8;
                    break Label_0051;
                }
            }
            o = new wg8(this, h07);
        }
        final Object v = ((wg8)o).v;
        final int x2 = ((wg8)o).x;
        Object o2;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            o2 = v;
        }
        else {
            vt4.g0(v);
            final xg8 xg8 = new xg8(lta, (f07)null, (byte)0);
            ((wg8)o).x = 1;
            final Object s = niq.s("device step-up verification", (Object)lh8.y, (lta)xg8, (h07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = s) == v2) {
                return (Enum)v2;
            }
        }
        return (Enum)c7r.h((lh8)o2);
    }
    
    public final tg8 c() {
        return (tg8)this.g.getValue();
    }
    
    public final boolean d(final k39 k39) {
        final tg8 c = this.c();
        final int w = o47.w(c);
        if (w != -1) {
            if (w == 0 || w == 1) {
                return e(c, k39);
            }
            if (w != 2) {
                if (w != 3) {
                    en9.r();
                    return false;
                }
            }
            else if (e(c, k39) && !((q39)k39).b()) {
                return true;
            }
        }
        return false;
    }
    
    public final void f(final k39 k39, final lg8 lg8) {
        this.g((tg8)new rg8(k39));
        this.c.d((Object)k39, (Object)lg8);
    }
    
    public final void g(final tg8 value) {
        this.g.setValue((Object)value);
    }
    
    public final void h(final String s) {
        ElicitationId value;
        if (s != null) {
            value = new ElicitationId(s);
        }
        else {
            value = null;
        }
        this.h.setValue((Object)value);
    }
    
    public final Enum i(final k39 k39, final h07 h07) {
        Object o = null;
        Label_0051: {
            if (h07 instanceof yg8) {
                final yg8 yg8 = (yg8)h07;
                final int x = yg8.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    yg8.x = x + Integer.MIN_VALUE;
                    o = yg8;
                    break Label_0051;
                }
            }
            o = new yg8(this, h07);
        }
        final Object v = ((yg8)o).v;
        final int x2 = ((yg8)o).x;
        Object o2;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            o2 = v;
        }
        else {
            vt4.g0(v);
            final Boolean booleanFalse = Boolean.FALSE;
            final pn4 pn4 = new pn4((Object)k39, (Object)this, (f07)null, (byte)3);
            ((yg8)o).x = 1;
            final Object s = niq.s("session step-up sign-in", (Object)false, (lta)pn4, (h07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = s) == v2) {
                return (Enum)v2;
            }
        }
        if (o2) {
            return null;
        }
        return (Enum)ih8.y;
    }
}
