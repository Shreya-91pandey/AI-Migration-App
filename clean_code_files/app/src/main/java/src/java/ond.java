import io.sentry.p7;
import io.sentry.q1;
import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.api.account.Organization;
import java.util.Collections;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.api.account.Account;
import java.util.List;
import java.util.Map;
import com.anthropic.claude.api.errors.ClaudeApiErrorException;
import com.anthropic.claude.api.result.ApiResult;
import android.os.SystemClock;

public final class ond extends tvj
{
    public final o8k A;
    public final f60 B;
    public final ep0 C;
    public final er0 D;
    public final egg E;
    public final st4 F;
    public final xk0 G;
    public final r9 H;
    public final gjc I;
    public final bvd J;
    public final mn2 K;
    public final mn2 L;
    public final ksg M;
    public final ksg N;
    public final ksg O;
    public int P;
    public final String w;
    public final wn x;
    public final String y;
    public final f6 z;
    
    public ond(final String w, final wn x, final String y, final f6 z, final o8k a, final f60 b, final ep0 c, final er0 d, final egg e, final st4 f, final xk0 g, final r9 h, final gjc i, final bvd j, final wo8 wo8) {
        super(wo8);
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = ach.d();
        this.L = ach.d();
        this.M = o50.Q((Object)Boolean.FALSE);
        this.N = o50.Q((Object)null);
        this.O = o50.Q((Object)null);
        r8m.b((jta)new kca((Object)this, (byte)29));
    }
    
    public static final long c0(final ond ond, final long n) {
        ond.B.getClass();
        return SystemClock.elapsedRealtime() - n;
    }
    
    public final Object Z(final h07 h07) {
        Object o = null;
        Label_0047: {
            if (h07 instanceof lnd) {
                final lnd lnd = (lnd)h07;
                final int x = lnd.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    lnd.x = x + Integer.MIN_VALUE;
                    o = lnd;
                    break Label_0047;
                }
            }
            o = new lnd(this, h07);
        }
        final Object v = ((lnd)o).v;
        final int x2 = ((lnd)o).x;
        ApiResult apiResult;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            apiResult = (ApiResult)v;
        }
        else {
            vt4.g0(v);
            ((lnd)o).x = 1;
            final Object a = this.z.a((f07)o);
            final pc7 v2 = pc7.v;
            if ((apiResult = (ApiResult)a) == v2) {
                return v2;
            }
        }
        final ApiResult apiResult2 = apiResult;
        final int z = t.z(apiResult2);
        if (z != 0) {
            if (z != 1) {
                en9.r();
                return null;
            }
            final int v3 = guc.v((pj0)apiResult2);
            if (v3 != 0) {
                if (v3 != 1) {
                    en9.r();
                    return null;
                }
            }
            else {
                final nj0 nj0 = (nj0)apiResult2;
                nj0 nj2;
                if (nj0 != null) {
                    nj2 = nj0;
                }
                else {
                    nj2 = null;
                }
                if (nj2 == null || !gu4.c(nj2.b())) {
                    final List a2 = adn.a;
                    adn.f((Throwable)new ClaudeApiErrorException(nj0.b(), "Failed to fetch account to find an org ID"), "Failed to fetch account to find an org ID", (lpl)null, (Map)null, (List)null, 60);
                }
            }
        }
        final int w = guc.w(apiResult2);
        if (w == 0) {
            return new d68((pj0)apiResult2);
        }
        if (w != 1) {
            en9.r();
            return null;
        }
        final qj0 qj0 = (qj0)apiResult2;
        final Organization b = y3p.b((Account)qj0.b);
        if (b == null) {
            final List a3 = adn.a;
            final SilentException ex = new SilentException("Account has no chat-capable organization at app start");
            final Map singletonMap = Collections.singletonMap((Object)"membership_count", (Object)new Integer(((Account)qj0.b).g.size()));
            singletonMap.getClass();
            adn.f((Throwable)ex, (String)null, lpl.w, singletonMap, lq6.Y((Object[])new String[] { "missing_organization", "app_start" }), 18);
            return f68.a;
        }
        return new e68(b.a);
    }
    
    public final Object a0(AppStartResponse v, final String s, q1 v2, final h07 h07) {
        mnd mnd2 = null;
        Label_0059: {
            if (h07 instanceof mnd) {
                final mnd mnd = (mnd)h07;
                final int y = mnd.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    mnd.y = y + Integer.MIN_VALUE;
                    mnd2 = mnd;
                    break Label_0059;
                }
            }
            mnd2 = new mnd(this, h07);
        }
        final Object w = mnd2.w;
        final int y2 = mnd2.y;
        Exception ex = null;
        Label_0168: {
            if (y2 != 0) {
                if (y2 == 1) {
                    final Object o = v = (AppStartResponse)mnd2.v;
                    try {
                        vt4.g0(w);
                        break Label_0168;
                    }
                    catch (final Exception ex) {
                        break Label_0168;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(w);
            v2 = y7j.P("loading_app.handle_bootstrap", "Handle bootstrap", (q1)v2);
            try {
                final er0 d = this.D;
                mnd2.v = (q1)v2;
                mnd2.y = 1;
                final Object e = d.e(s, v, mnd2);
                final pc7 v3 = pc7.v;
                if (e == v3) {
                    return v3;
                }
                final Object o = v2;
                if ((v2 = ((q1)o).a()) == null) {
                    v2 = p7.OK;
                }
                ((q1)o).k((p7)v2);
                return lqo.a;
            }
            catch (final Exception ex2) {
                ex = ex2;
                v = (AppStartResponse)v2;
            }
        }
        ((q1)v).k(p7.INTERNAL_ERROR);
        throw ex;
    }
    
    public final void b0() {
        if (this.M.getValue()) {
            return;
        }
        this.P = 0;
        this.B.getClass();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        ((bqc)rhc.G((oc7)super.v, (hc7)null, 0, (zta)new djh((byte)7, (f07)null, (Object)new nnd(this, elapsedRealtime, null)), 3)).U0((lta)new knd(this, elapsedRealtime));
    }
    
    public final void d0() {
        final List a = adn.a;
        adn.e(6, "Retrying user session load", (String)null, (Map)null);
        final int p = this.P;
        if (p != 0) {
            r9.b(this.H, this.y, p);
        }
        this.b0();
    }
    
    public final void e0(final xh9 value) {
        this.N.setValue((Object)value);
    }
}
