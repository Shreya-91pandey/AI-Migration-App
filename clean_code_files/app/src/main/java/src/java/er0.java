import java.util.Collection;
import java.util.Iterator;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.Membership;
import java.util.function.Function;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.AppStartEvents$MaybeRefreshSkipped;
import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.api.account.GrowthBookSchema;
import com.anthropic.claude.api.account.CurrentUserAccess;
import com.anthropic.claude.api.account.FeatureAccessStatus;
import com.anthropic.claude.api.feature.Feature;
import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.api.result.ApiResult;
import java.util.Map;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;

public final class er0
{
    public static final Set r;
    public final rp0 a;
    public final j6 b;
    public final fff c;
    public final st4 d;
    public final lqn e;
    public final vn0 f;
    public final e6a g;
    public final f6a h;
    public final ir0 i;
    public final jr0 j;
    public final kr0 k;
    public final opd l;
    public final rh2 m;
    public final f60 n;
    public final wo8 o;
    public final jqc p;
    public final ConcurrentHashMap q;
    
    static {
        r = iw0.n1((Object[])new Integer[] { 401, 403, 404 });
    }
    
    public er0(final rp0 a, final j6 b, final fff c, final st4 d, final lqn e, final vn0 f, final e6a g, final f6a h, final ir0 i, final jr0 j, final kr0 k, final opd l, final rh2 m, final f60 n, final wo8 o, final jqc p16) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
        this.q = new ConcurrentHashMap();
    }
    
    public final Object a(final h07 h07) {
        Object o = null;
        Label_0051: {
            if (h07 instanceof rq0) {
                final rq0 rq0 = (rq0)h07;
                final int x = rq0.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    rq0.x = x + Integer.MIN_VALUE;
                    o = rq0;
                    break Label_0051;
                }
            }
            o = new rq0(this, h07);
        }
        final Object v = ((rq0)o).v;
        final int x2 = ((rq0)o).x;
        boolean b = false;
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
            final sq0 sq0 = new sq0(2, (f07)null, (byte)0);
            ((rq0)o).x = 1;
            final Object f0 = rhc.f0((hc7)w, (zta)sq0, (f07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = f0) == v2) {
                return v2;
            }
        }
        final Boolean b2 = (Boolean)o2;
        if (!mlc.q((Object)b2, (Object)Boolean.TRUE)) {
            if (mlc.q((Object)b2, (Object)Boolean.FALSE)) {
                b = true;
            }
            else {
                if (b2 != null) {
                    en9.r();
                    return null;
                }
                oz1.x("Sentry returned null for isCrashedLastRun", (lpl)null, (List)null, 7);
            }
        }
        return b;
    }
    
    public final Object b(String v, final h07 h07) {
        tq0 tq2 = null;
        Label_0051: {
            if (h07 instanceof tq0) {
                final tq0 tq0 = (tq0)h07;
                final int y = tq0.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    tq0.y = y + Integer.MIN_VALUE;
                    tq2 = tq0;
                    break Label_0051;
                }
            }
            tq2 = new tq0(this, h07);
        }
        final Object w = tq2.w;
        final pc7 v2 = pc7.v;
        final int y2 = tq2.y;
        boolean b = true;
        Object a;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = tq2.v;
            vt4.g0(w);
            a = w;
        }
        else {
            vt4.g0(w);
            final List a2 = adn.a;
            adn.e(6, "Fetching app start data from network for org: ".concat(OrganizationId.a(v)), (String)null, (Map)null);
            final rp0 a3 = this.a;
            tq2.v = v;
            tq2.y = 1;
            if ((a = a3.a(v, tq2)) == v2) {
                return v2;
            }
        }
        final ApiResult apiResult = (ApiResult)a;
        if (apiResult != null) {
            if (apiResult instanceof qj0) {
                final AppStartResponse appStartResponse = (AppStartResponse)((qj0)apiResult).b;
                final lqn e = this.e;
                final CurrentUserAccess d = appStartResponse.d;
                final lqn lqn;
                monitorenter(lqn = e);
                if (d != null) {
                    try {
                        final FeatureAccessStatus a4 = d.a(Feature.I);
                        if (a4 != null) {
                            if (a4 == FeatureAccessStatus.x) {
                                b = false;
                            }
                            e.e(v, b);
                            return apiResult;
                        }
                    }
                    finally {
                        monitorexit(lqn);
                    }
                }
                monitorexit(lqn);
                return apiResult;
            }
            if (apiResult instanceof pj0) {
                return apiResult;
            }
        }
        en9.r();
        return null;
    }
    
    public final Object c(final h07 h07, String v, final boolean b) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof uq0) {
                final uq0 uq0 = (uq0)h07;
                final int y = uq0.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    uq0.y = y + Integer.MIN_VALUE;
                    o = uq0;
                    break Label_0054;
                }
            }
            o = new uq0(this, h07);
        }
        final Object w = ((uq0)o).w;
        final int y2 = ((uq0)o).y;
        boolean b2 = true;
        Object o2;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((uq0)o).v;
            vt4.g0(w);
            o2 = w;
        }
        else {
            vt4.g0(w);
            final o68 a = vo8.a;
            final d58 w2 = d58.w;
            final vq0 vq0 = new vq0(this, v, b, null);
            ((uq0)o).v = v;
            ((uq0)o).y = 1;
            final Object f0 = rhc.f0((hc7)w2, (zta)vq0, (f07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = f0) == v2) {
                return v2;
            }
        }
        final AppStartResponse appStartResponse = (AppStartResponse)o2;
        if (appStartResponse == null) {
            return null;
        }
        final GrowthBookSchema b3 = appStartResponse.b;
        boolean b4 = false;
        Label_0223: {
            if (b3 != null) {
                final Map a2 = b3.a;
                if (a2 != null && (a2.isEmpty() ^ true)) {
                    b4 = true;
                    break Label_0223;
                }
            }
            b4 = false;
        }
        final CurrentUserAccess d = appStartResponse.d;
        Label_0265: {
            if (d != null) {
                final List a3 = d.a;
                if (a3 != null && (((Collection)a3).isEmpty() ^ true)) {
                    break Label_0265;
                }
            }
            b2 = false;
        }
        if (b4 && b2) {
            final List a4 = adn.a;
            adn.e(6, "Using cached app start data for org: ".concat(OrganizationId.a(v)), (String)null, (Map)null);
            return new qj0(200, appStartResponse);
        }
        final List a5 = adn.a;
        adn.e(6, ge9.t(smk.v("Cached app start data incomplete for org: ", OrganizationId.a(v), " (growthbook=", ", featureAccess=", b4), b2, ")"), (String)null, (Map)null);
        return null;
    }
    
    public final Object d(String v, final h07 h07) {
        h07 h8 = null;
        Label_0049: {
            if (h07 instanceof wq0) {
                h8 = h07;
                final int z = ((wq0)h8).z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ((wq0)h8).z = z + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            h8 = new wq0(this, h07);
        }
        Object o = ((wq0)h8).x;
        final int z2 = ((wq0)h8).z;
        final pc7 v2 = pc7.v;
        pj0 pj0 = null;
        Label_0372: {
            Label_0263: {
                if (z2 != 0) {
                    if (z2 != 1) {
                        if (z2 == 2) {
                            v = ((wq0)h8).v;
                            vt4.g0(o);
                            break Label_0263;
                        }
                        if (z2 == 3) {
                            final pj0 w = ((wq0)h8).w;
                            final String v3 = ((wq0)h8).v;
                            vt4.g0(o);
                            pj0 = w;
                            v = v3;
                            break Label_0372;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        v = ((wq0)h8).v;
                        vt4.g0(o);
                    }
                }
                else {
                    vt4.g0(o);
                    ((wq0)h8).v = v;
                    ((wq0)h8).z = 1;
                    if ((o = this.c(h8, v, false)) == v2) {
                        return v2;
                    }
                }
                final ApiResult apiResult = (ApiResult)o;
                if (apiResult != null) {
                    return apiResult;
                }
                final lbg h9 = this.h(v);
                final xq0 xq0 = new xq0(this, v, (f07)null, (byte)0);
                final xq0 xq2 = new xq0(this, v, (f07)null, (byte)1);
                ((wq0)h8).v = v;
                ((wq0)h8).z = 2;
                if ((o = h9.a((lta)xq0, (lta)xq2, h8)) == v2) {
                    return v2;
                }
            }
            final ApiResult apiResult2 = (ApiResult)o;
            if (!(apiResult2 instanceof pj0)) {
                return apiResult2;
            }
            final pj0 w2 = (pj0)apiResult2;
            if (w2 instanceof nj0) {
                final nj0 nj0 = (nj0)w2;
                if (er0.r.contains((Object)nj0.a()) && !gu4.d(nj0.b())) {
                    return apiResult2;
                }
            }
            ((wq0)h8).v = v;
            ((wq0)h8).w = w2;
            ((wq0)h8).z = 3;
            o = this.c(h8, v, true);
            if (o != v2) {
                pj0 = (pj0)apiResult2;
                break Label_0372;
            }
            return v2;
        }
        final ApiResult apiResult3 = (ApiResult)o;
        if (apiResult3 != null) {
            final List a = adn.a;
            adn.e(6, "Serving app start cache from another language after a failed fetch for org: ".concat(OrganizationId.a(v)), (String)null, (Map)null);
            return apiResult3;
        }
        return pj0;
    }
    
    public final Object e(String f, final AppStartResponse w, final h07 h07) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof ar0) {
                final ar0 ar0 = (ar0)h07;
                final int z = ar0.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ar0.z = z + Integer.MIN_VALUE;
                    o = ar0;
                    break Label_0054;
                }
            }
            o = new ar0(this, h07);
        }
        final Object x = ((ar0)o).x;
        final int z2 = ((ar0)o).z;
        final lqo a = lqo.a;
        final String s = null;
        AppStartResponse w2;
        String v;
        if (z2 != 0) {
            if (z2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w2 = ((ar0)o).w;
            v = ((ar0)o).v;
            vt4.g0(x);
        }
        else {
            vt4.g0(x);
            ((ar0)o).v = f;
            ((ar0)o).w = w;
            ((ar0)o).z = 1;
            Object f2 = rhc.f0((hc7)((y38)this.o).a(), (zta)new zq0(null, f, w, this, null), (f07)o);
            final pc7 v2 = pc7.v;
            if (f2 != v2) {
                f2 = a;
            }
            if (f2 == v2) {
                return v2;
            }
            final String s2 = f;
            w2 = w;
            v = s2;
        }
        final Organization c = y3p.c(w2.a, v);
        final Account a2 = w2.a;
        final String a3 = a2.a;
        final String b = a2.b;
        w1n z3;
        if (c != null) {
            z3 = r6k.z(c);
        }
        else {
            z3 = null;
        }
        f = s;
        if (c != null && (f = c.f) == null) {
            f = "unknown";
        }
        this.d.e(a3, v, b, z3, f);
        if (c == null) {
            SilentException.a(new SilentException(hia.k("Organization ", OrganizationId.a(v), " not found in account during app start init")), (lpl)null, (List)null, 7);
        }
        return a;
    }
    
    public final Object f(String v, AppStartResponse w, final zn0 zn0, final h07 h07) {
        while (true) {
            Label_0047: {
                if (!(h07 instanceof br0)) {
                    break Label_0047;
                }
                final br0 br0 = (br0)h07;
                final int z = br0.z;
                if ((z & Integer.MIN_VALUE) == 0x0) {
                    break Label_0047;
                }
                br0.z = z + Integer.MIN_VALUE;
                final Object o = br0;
                final Object x = ((br0)o).x;
                final int z2 = ((br0)o).z;
                final lqo a = lqo.a;
                final pc7 v2 = pc7.v;
                if (z2 != 0) {
                    if (z2 != 1) {
                        if (z2 == 2) {
                            vt4.g0(x);
                            return a;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        w = ((br0)o).w;
                        v = ((br0)o).v;
                        vt4.g0(x);
                    }
                }
                else {
                    vt4.g0(x);
                    ((br0)o).v = v;
                    ((br0)o).w = w;
                    ((br0)o).z = 1;
                    Object f0 = rhc.f0((hc7)((y38)this.o).a(), (zta)new zq0(zn0, v, w, this, null), (f07)o);
                    if (f0 != v2) {
                        f0 = a;
                    }
                    if (f0 == v2) {
                        return v2;
                    }
                }
                final Organization c = y3p.c(w.a, v);
                if (c == null) {
                    SilentException.a(new SilentException(hia.k("Organization ", OrganizationId.a(v), " not found in account during app start refresh")), (lpl)null, (List)null, 7);
                    return a;
                }
                final w1n z3 = r6k.z(c);
                String f2;
                if ((f2 = c.f) == null) {
                    f2 = "unknown";
                }
                ((br0)o).v = null;
                ((br0)o).w = null;
                ((br0)o).z = 2;
                if (this.d.a(v, z3, f2, (f07)o) != v2) {
                    return a;
                }
                return v2;
            }
            final Object o = new br0(this, h07);
            continue;
        }
    }
    
    public final Object g(String v, final h07 h07) {
        cr0 cr2 = null;
        Label_0051: {
            if (h07 instanceof cr0) {
                final cr0 cr0 = (cr0)h07;
                final int y = cr0.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    cr0.y = y + Integer.MIN_VALUE;
                    cr2 = cr0;
                    break Label_0051;
                }
            }
            cr2 = new cr0(this, h07);
        }
        final Object w = cr2.w;
        final int y2 = cr2.y;
        ApiResult apiResult;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = cr2.v;
            vt4.g0(w);
            apiResult = (ApiResult)w;
        }
        else {
            vt4.g0(w);
            final lbg h8 = this.h(v);
            final long a = this.m.a();
            final pp0 pp0 = new pp0((Object)this, (Object)v, (f07)null, (byte)1);
            cr2.v = v;
            cr2.y = 1;
            final Object b = h8.b(a, (lta)pp0, cr2);
            final pc7 v2 = pc7.v;
            if ((apiResult = (ApiResult)b) == v2) {
                return v2;
            }
        }
        final ApiResult apiResult2 = apiResult;
        if (apiResult2 == null) {
            final AppStartEvents$MaybeRefreshSkipped appStartEvents$MaybeRefreshSkipped = new AppStartEvents$MaybeRefreshSkipped(v);
            final KSerializer serializer = AppStartEvents$MaybeRefreshSkipped.Companion.serializer();
            vt4.b0(serializer);
            this.d.b((v10)appStartEvents$MaybeRefreshSkipped, (KSerializer)serializer);
        }
        return apiResult2;
    }
    
    public final lbg h(final String s) {
        final Object computeIfAbsent = this.q.computeIfAbsent((Object)new OrganizationId(s), (Function)new zg0((lta)new dr0((Object)this, (byte)0), (byte)1));
        computeIfAbsent.getClass();
        return (lbg)computeIfAbsent;
    }
    
    public final zn0 i(final String s) {
        final Account a = this.b.a();
        final AccountSettings h = a.h;
        final Iterator iterator = ((Iterable)a.g).iterator();
        while (true) {
            Object next;
            do {
                final boolean hasNext = iterator.hasNext();
                final Object o = null;
                if (!hasNext) {
                    next = null;
                    final Membership membership = (Membership)next;
                    Object e = o;
                    if (membership != null) {
                        e = membership.e;
                    }
                    return new zn0((Object)h, e, (Object)this.c.a(s));
                }
                next = iterator.next();
            } while (!mlc.q((Object)((Membership)next).a.a, (Object)s));
            continue;
        }
    }
}
