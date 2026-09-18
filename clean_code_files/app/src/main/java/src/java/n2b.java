import com.anthropic.claude.api.account.GrowthBookSchema;
import com.anthropic.claude.api.account.BootstrapResponse;
import java.util.List;
import java.util.Map;
import com.anthropic.claude.api.result.ApiResult;

public final class n2b
{
    public final i2b a;
    public final t2b b;
    public final rh2 c;
    public final apm d;
    public final lbg e;
    public final usi f;
    
    public n2b(final i2b a, final t2b b, final vn0 vn0, final rh2 c, final f60 f60, final wo8 wo8) {
        this.a = a;
        this.b = b;
        this.c = c;
        final apm a2 = bpm.a((Object)p2b.a);
        this.d = a2;
        this.e = new lbg(vn0, f60);
        this.f = lq6.i(a2);
    }
    
    public final Object a(final h07 h07) {
        Object o = null;
        Label_0047: {
            if (h07 instanceof k2b) {
                final k2b k2b = (k2b)h07;
                final int x = k2b.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    k2b.x = x + Integer.MIN_VALUE;
                    o = k2b;
                    break Label_0047;
                }
            }
            o = new k2b(this, h07);
        }
        final Object v = ((k2b)o).v;
        final int x2 = ((k2b)o).x;
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
            final apm d = this.d;
            final s2b s2b = (s2b)d.getValue();
            if (s2b instanceof r2b) {
                return ((r2b)s2b).a;
            }
            final nw2 nw2 = new nw2(2, (f07)null, (byte)4);
            ((k2b)o).x = 1;
            final Object a = vt4.A((ija)d, (zta)nw2, (f07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = a) == v2) {
                return v2;
            }
        }
        final s2b s2b2 = (s2b)o2;
        if (s2b2 != null) {
            if (s2b2 instanceof r2b) {
                return ((r2b)s2b2).a;
            }
        }
        return null;
    }
    
    public final Object b(final h07 h07) {
        Object o = null;
        Label_0047: {
            if (h07 instanceof l2b) {
                final l2b l2b = (l2b)h07;
                final int x = l2b.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    l2b.x = x + Integer.MIN_VALUE;
                    o = l2b;
                    break Label_0047;
                }
            }
            o = new l2b(this, h07);
        }
        final Object v = ((l2b)o).v;
        final int x2 = ((l2b)o).x;
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
            final o68 a = vo8.a;
            final d58 w = d58.w;
            final pn pn = new pn((byte)16, (f07)null, (Object)this);
            ((l2b)o).x = 1;
            final Object f0 = rhc.f0((hc7)w, (zta)pn, (f07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = f0) == v2) {
                return v2;
            }
        }
        final ApiResult apiResult = (ApiResult)o2;
        if (apiResult == null) {
            final List a2 = adn.a;
            adn.e(6, "Global bootstrap refresh skipped, already fresh", (String)null, (Map)null);
        }
        return apiResult;
    }
    
    public final Object c(final h07 h07) {
        h07 h8 = null;
        Label_0045: {
            if (h07 instanceof m2b) {
                h8 = h07;
                final int a = ((m2b)h8).A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    ((m2b)h8).A = a + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            h8 = new m2b(this, h07);
        }
        final Object y = ((m2b)h8).y;
        final int a2 = ((m2b)h8).A;
        final apm d = this.d;
        final pc7 v = pc7.v;
        ApiResult w = null;
        ApiResult v2 = null;
        Label_0380: {
            BootstrapResponse x = null;
            Label_0323: {
                Object b;
                if (a2 != 0) {
                    if (a2 != 1) {
                        if (a2 == 2) {
                            x = ((m2b)h8).x;
                            w = ((m2b)h8).w;
                            v2 = ((m2b)h8).v;
                            vt4.g0(y);
                            break Label_0323;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        vt4.g0(y);
                        b = y;
                    }
                }
                else {
                    vt4.g0(y);
                    Object value;
                    s2b a3;
                    do {
                        value = d.getValue();
                        final s2b s2b = (s2b)value;
                        if (s2b instanceof r2b) {
                            a3 = s2b;
                        }
                        else {
                            a3 = null;
                        }
                        if (a3 != null) {
                            continue;
                        }
                        a3 = q2b.a;
                    } while (!d.j(value, (Object)a3));
                    final List a4 = adn.a;
                    adn.e(6, "Refreshing global bootstrap", (String)null, (Map)null);
                    ((m2b)h8).A = 1;
                    final i2b a5 = this.a;
                    if ((b = a5.b.b((lta)new yz4((byte)1, (f07)null, (Object)a5), h8)) == v) {
                        return v;
                    }
                }
                w = (ApiResult)b;
                if (w != null) {
                    if (w instanceof qj0) {
                        x = (BootstrapResponse)((qj0)w).b;
                        final GrowthBookSchema b2 = x.b;
                        if (b2 == null) {
                            final List a6 = adn.a;
                            adn.f((Throwable)new IllegalStateException("Global bootstrap response missing GrowthBook schema"), (String)null, lpl.y, (Map)null, (List)null, 58);
                            v2 = w;
                            break Label_0323;
                        }
                        ((m2b)h8).v = w;
                        ((m2b)h8).w = w;
                        ((m2b)h8).x = x;
                        ((m2b)h8).A = 2;
                        if (((u2b)this.b).a.c(b2, h8) == v) {
                            return v;
                        }
                        v2 = w;
                        break Label_0323;
                    }
                    else if (w instanceof pj0) {
                        v2 = w;
                        break Label_0380;
                    }
                }
                en9.r();
                return null;
            }
            d.n((Object)null, (Object)new r2b(x));
        }
        Label_0467: {
            if (w != null) {
                if (!(w instanceof qj0)) {
                    if (!(w instanceof pj0)) {
                        break Label_0467;
                    }
                    final o2b o2b = new o2b((pj0)w);
                    Object value2;
                    Object o;
                    do {
                        value2 = d.getValue();
                        final s2b s2b2 = (s2b)value2;
                        if (s2b2 instanceof r2b) {
                            o = s2b2;
                        }
                        else {
                            o = null;
                        }
                        if (o != null) {
                            continue;
                        }
                        o = o2b;
                    } while (!d.j(value2, o));
                }
                return v2;
            }
        }
        en9.r();
        return null;
    }
}
