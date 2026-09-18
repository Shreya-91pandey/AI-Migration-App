import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.List;
import java.util.Map;
import com.anthropic.claude.api.errors.ClaudeApiErrorException;
import com.anthropic.claude.ui.components.error.a;
import com.anthropic.claude.analytics.events.AppStartEvents$BootstrapValidCookie;
import com.anthropic.claude.analytics.events.AppStartEvents$BootstrapExpiredCookie;
import com.anthropic.claude.analytics.events.AppStartEvents$BootstrapNoCookie;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.AppStartEvents$BootstrapRedirectToLogin;
import com.anthropic.claude.analytics.health.HealthMetricAction;
import io.sentry.p7;
import io.sentry.q1;
import com.anthropic.claude.api.result.ApiResult;

public final class nnd extends m6n implements bua
{
    public ApiResult A;
    public ond B;
    public long C;
    public byte D;
    public q1 E;
    public final ond F;
    public final long G;
    public x3j w;
    public String x;
    public x3j y;
    public ApiResult z;
    
    public nnd(final ond f, final long g, final f07 f2) {
        this.F = f;
        this.G = g;
        super(3, f2);
    }
    
    public static final boolean r(final x3j x3j, final ond ond, final q1 q1, long c0, final pj0 pj0) {
        nj0 nj0;
        if (pj0 instanceof nj0) {
            nj0 = (nj0)pj0;
        }
        else {
            nj0 = null;
        }
        if (nj0 != null && gu4.c(nj0.b())) {
            x3j.v = true;
            ond.e0(null);
            final ksg o = ond.O;
            e8 value;
            if ((value = (e8)o.getValue()) == null) {
                value = new e8(ond.v, ond.z, ond.F, ond.J, new zqb(ond));
            }
            rhc.G((oc7)value.a, (hc7)null, 0, (zta)new d8(value, (f07)null, (byte)0), 3);
            o.setValue((Object)value);
            q1.b(p7.PERMISSION_DENIED);
            final xk0 g = ond.G;
            c0 = ond.c0(ond, c0);
            if (!g.b.get()) {
                shb.a(g.a, HealthMetricAction.I, (dkj)xjj.a, (String)null, (String)null, Long.valueOf(c0), (phb)null, (lhb)null, 108);
            }
            ond.H.d(ond.y, (dkj)new zjj(bk0.d(pj0), yt4.y.a()), (String)null);
            return true;
        }
        return false;
    }
    
    public static final Object t(final ond ond, final q1 q1, final long n, final nnd nnd) {
        final st4 f = ond.F;
        final AppStartEvents$BootstrapRedirectToLogin appStartEvents$BootstrapRedirectToLogin = new AppStartEvents$BootstrapRedirectToLogin("missing_organization");
        final KSerializer serializer = AppStartEvents$BootstrapRedirectToLogin.Companion.serializer();
        vt4.b0(serializer);
        f.b((v10)appStartEvents$BootstrapRedirectToLogin, (KSerializer)serializer);
        final zjj zjj = new zjj("client_error", "missing_organization");
        ond.G.a((dkj)zjj, null, ond.c0(ond, n), null);
        ond.H.d(ond.y, (dkj)zjj, (String)null);
        ond.e0(null);
        q1.b(p7.UNAUTHENTICATED);
        final Object a = ond.J.a(evd.z, false, (m6n)nnd);
        if (a == pc7.v) {
            return a;
        }
        return lqo.a;
    }
    
    public final Object h(final Object o, final Object o2, final Object o3) {
        final oc7 oc7 = (oc7)o;
        final q1 e = (q1)o2;
        final nnd nnd = new nnd(this.F, this.G, (f07)o3);
        nnd.E = e;
        return nnd.invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object w) {
        final ond f = this.F;
        final ksg o = f.O;
        final st4 f2 = f.F;
        final r9 h = f.H;
        final xk0 g = f.G;
        final ksg m = f.M;
        final String y = f.y;
        q1 e = this.E;
        final byte d = this.D;
        final ckj a = ckj.a;
        final f68 a2 = f68.a;
        final long g2 = this.G;
        final lqo a3 = lqo.a;
        final pc7 v = pc7.v;
        q1 q1 = null;
        ApiResult z2 = null;
        Object y3 = null;
        String x6 = null;
        dkj dkj3 = null;
        Object o8 = null;
        Label_2400: {
            x3j y2 = null;
            x3j w2 = null;
            dkj dkj = null;
            String s = null;
            Label_2352: {
                while (true) {
                    ond b = null;
                    x3j x3j = null;
                    Object o2 = null;
                    String s2 = null;
                    ApiResult a6 = null;
                    ApiResult apiResult = null;
                    Label_2153: {
                        ApiResult a13 = null;
                        Label_1994: {
                            ApiResult a7 = null;
                            String s8 = null;
                            Label_1941: {
                                x3j w3 = null;
                                String s3 = null;
                                Label_1617: {
                                    long c = 0L;
                                    ond b2 = null;
                                    ApiResult a8 = null;
                                    x3j y4 = null;
                                    Object o3 = null;
                                    Object o4 = null;
                                    Label_1407: {
                                        while (true) {
                                            Object o5 = null;
                                            Label_1017: {
                                                Label_0941: {
                                                    Label_0902: {
                                                        final ApiResult a4;
                                                        switch (d) {
                                                            default: {
                                                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                                                return null;
                                                            }
                                                            case 11: {
                                                                final f07 f3 = (f07)this.B;
                                                                final ApiResult z = this.z;
                                                                y2 = this.y;
                                                                final String x = this.x;
                                                                w2 = this.w;
                                                                vt4.g0(w);
                                                                dkj = (dkj)a;
                                                                q1 = e;
                                                                z2 = z;
                                                                s = x;
                                                                break Label_2352;
                                                            }
                                                            case 10: {
                                                                b = this.B;
                                                                a4 = this.A;
                                                                final ApiResult z3 = this.z;
                                                                x3j = this.y;
                                                                final String x2 = this.x;
                                                                o2 = this.w;
                                                                vt4.g0(w);
                                                                q1 = e;
                                                                s2 = x2;
                                                                z2 = z3;
                                                                break;
                                                            }
                                                            case 9: {
                                                                b = this.B;
                                                                final ApiResult a5 = this.A;
                                                                final ApiResult z4 = this.z;
                                                                x3j = this.y;
                                                                final String x3 = this.x;
                                                                o2 = this.w;
                                                                vt4.g0(w);
                                                                s2 = x3;
                                                                q1 = e;
                                                                a6 = a5;
                                                                apiResult = z4;
                                                                break Label_2153;
                                                            }
                                                            case 7:
                                                            case 8: {
                                                                final f07 f4 = (f07)this.B;
                                                                a7 = this.A;
                                                                apiResult = this.z;
                                                                y3 = this.y;
                                                                final String x4 = this.x;
                                                                w3 = this.w;
                                                                vt4.g0(w);
                                                                s3 = x4;
                                                                break Label_1617;
                                                            }
                                                            case 6: {
                                                                c = this.C;
                                                                b2 = this.B;
                                                                a8 = this.A;
                                                                apiResult = this.z;
                                                                y4 = this.y;
                                                                final String x5 = this.x;
                                                                final x3j w4 = this.w;
                                                                vt4.g0(w);
                                                                o3 = w;
                                                                s3 = x5;
                                                                o4 = w4;
                                                                break Label_1407;
                                                            }
                                                            case 5: {
                                                                y3 = this.y;
                                                                x6 = this.x;
                                                                final x3j w5 = this.w;
                                                                vt4.g0(w);
                                                                q1 = e;
                                                                final Object d2 = w;
                                                                w = w5;
                                                                break Label_0491;
                                                            }
                                                            case 4: {
                                                                final g68 g3 = (g68)this.x;
                                                                vt4.g0(w);
                                                                return a3;
                                                            }
                                                            case 3: {
                                                                final x3j w6 = this.w;
                                                                vt4.g0(w);
                                                                o5 = w;
                                                                w = w6;
                                                                break Label_1017;
                                                            }
                                                            case 2: {
                                                                vt4.g0(w);
                                                                break Label_0941;
                                                            }
                                                            case 1: {
                                                                vt4.g0(w);
                                                                break Label_0902;
                                                            }
                                                            case 0: {
                                                                vt4.g0(w);
                                                                final Boolean true = Boolean.TRUE;
                                                                m.setValue((Object)true);
                                                                f.e0(null);
                                                                final Object w7 = new Object();
                                                                final pgf a9 = ba7.a;
                                                                final x97 b3 = ba7.b(f.A);
                                                                Boolean value;
                                                                if (b3 != null) {
                                                                    value = (b3.c < System.currentTimeMillis());
                                                                }
                                                                else {
                                                                    value = null;
                                                                }
                                                                if (value == null) {
                                                                    final AppStartEvents$BootstrapNoCookie appStartEvents$BootstrapNoCookie = new AppStartEvents$BootstrapNoCookie();
                                                                    final KSerializer serializer = AppStartEvents$BootstrapNoCookie.Companion.serializer();
                                                                    vt4.b0(serializer);
                                                                    f2.b((v10)appStartEvents$BootstrapNoCookie, (KSerializer)serializer);
                                                                }
                                                                else if (value.equals(true)) {
                                                                    final AppStartEvents$BootstrapExpiredCookie appStartEvents$BootstrapExpiredCookie = new AppStartEvents$BootstrapExpiredCookie();
                                                                    final KSerializer serializer2 = AppStartEvents$BootstrapExpiredCookie.Companion.serializer();
                                                                    vt4.b0(serializer2);
                                                                    f2.b((v10)appStartEvents$BootstrapExpiredCookie, (KSerializer)serializer2);
                                                                }
                                                                else {
                                                                    if (!value.equals(Boolean.FALSE)) {
                                                                        en9.r();
                                                                        return null;
                                                                    }
                                                                    final Object o6 = new Object();
                                                                    final KSerializer serializer3 = AppStartEvents$BootstrapValidCookie.Companion.serializer();
                                                                    vt4.b0(serializer3);
                                                                    f2.b((v10)o6, (KSerializer)serializer3);
                                                                }
                                                                if (!mlc.q((Object)value, (Object)Boolean.FALSE)) {
                                                                    final AppStartEvents$BootstrapRedirectToLogin appStartEvents$BootstrapRedirectToLogin = new AppStartEvents$BootstrapRedirectToLogin();
                                                                    final KSerializer serializer4 = AppStartEvents$BootstrapRedirectToLogin.Companion.serializer();
                                                                    vt4.b0(serializer4);
                                                                    f2.b((v10)appStartEvents$BootstrapRedirectToLogin, (KSerializer)serializer4);
                                                                    g.a((dkj)a, "logged_out", null, null);
                                                                    String s4;
                                                                    if (value == null) {
                                                                        s4 = "saved_credential_missing";
                                                                    }
                                                                    else {
                                                                        s4 = "server_session_invalid";
                                                                    }
                                                                    h.d(y, (dkj)new zjj("client_error", s4), (String)null);
                                                                    e.b(p7.UNAUTHENTICATED);
                                                                    final bvd j = f.J;
                                                                    this.E = null;
                                                                    this.w = null;
                                                                    this.D = 1;
                                                                    if (j.a(evd.x, false, (m6n)this) == v) {
                                                                        return v;
                                                                    }
                                                                    break Label_0902;
                                                                }
                                                                else {
                                                                    this.E = e;
                                                                    this.w = (x3j)w7;
                                                                    this.D = 3;
                                                                    final String w8 = f.w;
                                                                    Object z5;
                                                                    if (w8 != null) {
                                                                        z5 = new e68(w8);
                                                                    }
                                                                    else {
                                                                        z5 = f.Z((h07)this);
                                                                    }
                                                                    o5 = z5;
                                                                    w = w7;
                                                                    if (z5 == v) {
                                                                        return v;
                                                                    }
                                                                    break Label_1017;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        final pc7 pc7 = v;
                                                        final mn2 k = b.K;
                                                        final rnd rnd = new rnd(s2, b.x);
                                                        this.E = q1;
                                                        this.w = (x3j)o2;
                                                        this.x = s2;
                                                        this.y = x3j;
                                                        this.z = z2;
                                                        this.A = a4;
                                                        this.B = null;
                                                        this.D = 11;
                                                        if (((stk)k).a((f07)this, (Object)rnd) == pc7) {
                                                            return v;
                                                        }
                                                        y2 = x3j;
                                                        final String s5 = s2;
                                                        dkj = (dkj)a;
                                                        s = s5;
                                                        w2 = (x3j)o2;
                                                        break Label_2352;
                                                        final Object d2;
                                                        final ApiResult apiResult2 = (ApiResult)d2;
                                                        Label_2598: {
                                                            if (apiResult2 != null) {
                                                                final boolean b4 = apiResult2 instanceof qj0;
                                                                if (!b4) {
                                                                    if (!(apiResult2 instanceof pj0)) {
                                                                        break Label_2598;
                                                                    }
                                                                    f.e0(com.anthropic.claude.ui.components.error.a.b((pj0)apiResult2));
                                                                }
                                                                if (!b4) {
                                                                    if (!(apiResult2 instanceof pj0)) {
                                                                        en9.r();
                                                                        return null;
                                                                    }
                                                                    final pj0 pj0 = (pj0)apiResult2;
                                                                    if (pj0 instanceof nj0) {
                                                                        final nj0 nj0 = (nj0)apiResult2;
                                                                        final int a10 = nj0.a();
                                                                        final long g4 = this.G;
                                                                        Label_1914: {
                                                                            if (a10 != 401) {
                                                                                if (nj0.a() != 403) {
                                                                                    if (nj0.a() != 404) {
                                                                                        break Label_1914;
                                                                                    }
                                                                                    final List a11 = adn.a;
                                                                                    adn.f((Throwable)new ClaudeApiErrorException(nj0.b(), "App start 404"), "App start 404", (lpl)null, (Map)null, (List)null, 60);
                                                                                    this.E = q1;
                                                                                    this.w = (x3j)w;
                                                                                    this.x = x6;
                                                                                    this.y = (x3j)y3;
                                                                                    this.z = apiResult2;
                                                                                    this.A = apiResult2;
                                                                                    this.B = f;
                                                                                    this.C = g4;
                                                                                    this.D = 6;
                                                                                    final Object z6 = f.Z((h07)this);
                                                                                    if (z6 == v) {
                                                                                        return v;
                                                                                    }
                                                                                    final String s6 = x6;
                                                                                    final ApiResult apiResult3 = apiResult2;
                                                                                    final x3j x3j2 = (x3j)y3;
                                                                                    b2 = f;
                                                                                    final ApiResult apiResult4 = apiResult3;
                                                                                    e = q1;
                                                                                    o4 = w;
                                                                                    s3 = s6;
                                                                                    c = g4;
                                                                                    y4 = x3j2;
                                                                                    apiResult = apiResult4;
                                                                                    o3 = z6;
                                                                                    a8 = apiResult3;
                                                                                    break Label_1407;
                                                                                }
                                                                            }
                                                                            final boolean r = r((x3j)w, f, q1, g4, (pj0)nj0);
                                                                            final q1 q2 = q1;
                                                                            if (r) {
                                                                                final String s7 = x6;
                                                                                a7 = apiResult2;
                                                                                apiResult = apiResult2;
                                                                                q1 = q2;
                                                                                s8 = s7;
                                                                                break Label_1941;
                                                                            }
                                                                            final List a12 = adn.a;
                                                                            adn.f((Throwable)new ClaudeApiErrorException(nj0.b(), smk.p(nj0.a(), "400 auth error during app start: ")), smk.p(nj0.a(), "400 auth error during app start: "), (lpl)null, (Map)null, (List)null, 60);
                                                                            q2.b(p7.UNAUTHENTICATED);
                                                                        }
                                                                        final String s9 = x6;
                                                                        a7 = apiResult2;
                                                                        apiResult = apiResult2;
                                                                        s8 = s9;
                                                                        break Label_1941;
                                                                    }
                                                                    if (!(pj0 instanceof oj0)) {
                                                                        en9.r();
                                                                        return null;
                                                                    }
                                                                }
                                                                a13 = apiResult2;
                                                                apiResult = apiResult2;
                                                                break Label_1994;
                                                            }
                                                        }
                                                        en9.r();
                                                        return null;
                                                    }
                                                    final mn2 i = f.K;
                                                    this.E = null;
                                                    this.w = null;
                                                    this.D = 2;
                                                    if (((stk)i).a((f07)this, (Object)pnd.a) == v) {
                                                        return v;
                                                    }
                                                }
                                                m.setValue((Object)Boolean.FALSE);
                                                return a3;
                                            }
                                            final g68 g5 = (g68)o5;
                                            if (g5 instanceof e68) {
                                                x6 = ((e68)g5).a;
                                                y3 = new Object();
                                                final er0 d3 = f.D;
                                                this.E = e;
                                                this.w = (x3j)w;
                                                this.x = x6;
                                                this.y = (x3j)y3;
                                                this.D = 5;
                                                final Object d2 = d3.d(x6, (h07)this);
                                                q1 = e;
                                                if (d2 == v) {
                                                    return v;
                                                }
                                                continue;
                                            }
                                            else {
                                                final pc7 pc8 = v;
                                                if (mlc.q((Object)g5, (Object)a2)) {
                                                    this.E = null;
                                                    this.w = null;
                                                    this.x = null;
                                                    this.D = 4;
                                                    if (t(f, e, g2, this) == pc8) {
                                                        return v;
                                                    }
                                                    return a3;
                                                }
                                                else {
                                                    if (g5 instanceof d68) {
                                                        final d68 d4 = (d68)g5;
                                                        if (!r((x3j)w, f, e, this.G, d4.a())) {
                                                            o.setValue((Object)null);
                                                            f.e0(com.anthropic.claude.ui.components.error.a.b(d4.a()));
                                                            w = new zjj(d4.a());
                                                            g.a((dkj)w, null, ond.c0(f, g2), null);
                                                            f.P = h.d(y, (dkj)w, (String)null);
                                                        }
                                                        m.setValue((Object)Boolean.FALSE);
                                                        return a3;
                                                    }
                                                    en9.r();
                                                    return null;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    final g68 g6 = (g68)o3;
                                    Label_1777: {
                                        if (g6 instanceof e68) {
                                            final String a14 = ((e68)g6).a;
                                            if (mlc.q((Object)a14, (Object)s3)) {
                                                SilentException.a(new SilentException("Default org is the same as the not found org: ".concat(OrganizationId.a(s3))), (lpl)null, (List)null, 7);
                                                e.b(p7.UNKNOWN_ERROR);
                                                b2.e0((xh9)new vh9());
                                                break Label_1777;
                                            }
                                            final List a15 = adn.a;
                                            adn.e(6, "Retrying app start with default org ID: ".concat(OrganizationId.a(a14)), (String)null, (Map)null);
                                            y4.v = true;
                                            final mn2 l = b2.K;
                                            final qnd qnd = new qnd(a14);
                                            this.E = e;
                                            this.w = (x3j)o4;
                                            this.x = s3;
                                            this.y = y4;
                                            this.z = apiResult;
                                            this.A = a8;
                                            this.B = null;
                                            this.D = 7;
                                            if (((stk)l).a((f07)this, (Object)qnd) == v) {
                                                return v;
                                            }
                                        }
                                        else if (mlc.q((Object)g6, (Object)a2)) {
                                            y4.v = true;
                                            this.E = e;
                                            this.w = (x3j)o4;
                                            this.x = s3;
                                            this.y = y4;
                                            this.z = apiResult;
                                            this.A = a8;
                                            this.B = null;
                                            this.D = 8;
                                            if (t(b2, e, c, this) == v) {
                                                return v;
                                            }
                                        }
                                        else {
                                            if (!(g6 instanceof d68)) {
                                                en9.r();
                                                return null;
                                            }
                                            if (!r((x3j)o4, b2, e, c, ((d68)g6).a())) {
                                                e.b(p7.UNKNOWN_ERROR);
                                                b2.e0((xh9)new vh9());
                                            }
                                            break Label_1777;
                                        }
                                        final qj0 qj0 = (qj0)a8;
                                        y3 = y4;
                                        w3 = (x3j)o4;
                                        a7 = qj0;
                                        break Label_1617;
                                    }
                                    final Object o7 = o4;
                                    a7 = a8;
                                    y3 = y4;
                                    q1 = e;
                                    s8 = s3;
                                    w = o7;
                                    break Label_1941;
                                }
                                final q1 q3 = e;
                                s8 = s3;
                                w = w3;
                                q1 = q3;
                            }
                            a13 = a7;
                            x6 = s8;
                        }
                        final pc7 pc9 = v;
                        final dkj dkj2 = (dkj)a;
                        if (a13 != null) {
                            if (a13 instanceof qj0) {
                                final AppStartResponse appStartResponse = (AppStartResponse)((qj0)a13).b;
                                this.E = q1;
                                this.w = (x3j)w;
                                this.x = x6;
                                this.y = (x3j)y3;
                                this.z = apiResult;
                                this.A = a13;
                                this.B = f;
                                this.D = 9;
                                if (f.a0(appStartResponse, x6, q1, (h07)this) == pc9) {
                                    return v;
                                }
                                a6 = a13;
                                final String s10 = x6;
                                b = f;
                                x3j = (x3j)y3;
                                o2 = w;
                                s2 = s10;
                                break Label_2153;
                            }
                            else {
                                dkj3 = dkj2;
                                if (a13 instanceof pj0) {
                                    z2 = apiResult;
                                    o8 = w;
                                    break Label_2400;
                                }
                            }
                        }
                        en9.r();
                        return null;
                    }
                    final pc7 pc10 = v;
                    final egg e2 = b.E;
                    this.E = q1;
                    this.w = (x3j)o2;
                    this.x = s2;
                    this.y = x3j;
                    this.z = apiResult;
                    this.A = a6;
                    this.B = b;
                    this.D = 10;
                    if (e2.a(s2, (h07)this) == pc10) {
                        return v;
                    }
                    final ApiResult apiResult5 = a6;
                    z2 = apiResult;
                    ApiResult a4 = apiResult5;
                    continue;
                }
            }
            final x3j x3j3 = w2;
            x6 = s;
            final x3j x3j4 = y2;
            o8 = x3j3;
            y3 = x3j4;
            dkj3 = dkj;
        }
        if (z2 instanceof qj0) {
            w = new phb(y, x6);
            g.a(dkj3, "logged_in", ond.c0(f, g2), (phb)w);
            h.d(y, dkj3, x6);
        }
        else if (!((x3j)y3).v) {
            if (!((x3j)o8).v) {
                if (z2 instanceof pj0) {
                    w = new zjj((pj0)z2);
                    g.a((dkj)w, null, ond.c0(f, g2), null);
                    f.P = h.d(y, (dkj)w, (String)null);
                }
            }
        }
        if (!((x3j)o8).v) {
            o.setValue((Object)null);
        }
        if (!((x3j)y3).v) {
            m.setValue((Object)Boolean.FALSE);
        }
        if (f.N.getValue() != null) {
            q1.b(p7.UNKNOWN_ERROR);
            return a3;
        }
        return a3;
    }
}
