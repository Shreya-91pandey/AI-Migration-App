import java.util.function.Function;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.account.VillageWeaverConsentState;
import java.util.Map;
import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.api.account.AccountSettings;
import java.util.concurrent.ConcurrentHashMap;

public final class rp0
{
    public final String a;
    public final f60 b;
    public final rt7 c;
    public final xca d;
    public final jqc e;
    public final wo8 f;
    public final wfg g;
    public final npd h;
    public final ConcurrentHashMap i;
    
    public rp0(final String a, final f60 b, final rt7 c, final xca d, final jqc e, final wo8 f, final wfg g, final npd h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = new ConcurrentHashMap();
    }
    
    public static AccountSettings c(final AccountSettings accountSettings, final AppStartResponse appStartResponse) {
        final AccountSettings h = appStartResponse.a.h;
        Boolean x = null;
        Boolean w;
        if (h != null) {
            w = h.w;
        }
        else {
            w = null;
        }
        if (h != null) {
            x = h.x;
        }
        return AccountSettings.a(accountSettings, (Map)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (Boolean)null, (String)null, (Boolean)null, (VillageWeaverConsentState)null, w, x, (String)null, (Double)null, (String)null, (Boolean)null, 255852543);
    }
    
    public final Object a(final String s, final h07 h07) {
        Object o = null;
        Label_0051: {
            if (h07 instanceof op0) {
                final op0 op0 = (op0)h07;
                final int y = op0.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    op0.y = y + Integer.MIN_VALUE;
                    o = op0;
                    break Label_0051;
                }
            }
            o = new op0(this, h07);
        }
        final Object w = ((op0)o).w;
        final int y2 = ((op0)o).y;
        final pc7 v = pc7.v;
        Object b;
        if (y2 != 0) {
            if (y2 != 1) {
                if (y2 == 2) {
                    final ApiResult v2 = ((op0)o).v;
                    vt4.g0(w);
                    return v2;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                vt4.g0(w);
                b = w;
            }
        }
        else {
            vt4.g0(w);
            final nq b2 = this.b(s);
            final pp0 pp0 = new pp0((Object)this, (Object)s, (f07)null, (byte)0);
            ((op0)o).y = 1;
            if ((b = b2.b((lta)pp0, (h07)o)) == v) {
                return v;
            }
        }
        final ApiResult v3 = (ApiResult)b;
        nj0 nj0;
        if (v3 instanceof nj0) {
            nj0 = (nj0)v3;
        }
        else {
            nj0 = null;
        }
        if (nj0 != null && gu4.c(nj0.b())) {
            ((op0)o).v = v3;
            ((op0)o).y = 2;
            final o68 a = vo8.a;
            Object o2 = rhc.f0((hc7)d58.w, (zta)new np0((byte)0, (f07)null, (Object)this), (f07)o);
            if (o2 != v) {
                o2 = lqo.a;
            }
            if (o2 == v) {
                return v;
            }
        }
        return v3;
    }
    
    public final nq b(final String s) {
        return new nq((Object)((e60)this.c).a().h("app_start").h("acc_".concat(zrn.z(this.a))).h("org_".concat(zrn.z(s))), (Object)"AppStartCache", (Object)AppStartResponse.Companion.serializer(), (Object)this.b, (Object)this.d, (Object)this.e, (Object)this.f, (Object)2332800000L, (Object)new p1((Object)this, (byte)5));
    }
    
    public final Object d(String s, lta w, final h07 h07) {
        qp0 qp2 = null;
        Label_0054: {
            if (h07 instanceof qp0) {
                final qp0 qp0 = (qp0)h07;
                final int a = qp0.A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    qp0.A = a + Integer.MIN_VALUE;
                    qp2 = qp0;
                    break Label_0054;
                }
            }
            qp2 = new qp0(this, h07);
        }
        final Object y = qp2.y;
        final int a2 = qp2.A;
        final pc7 v = pc7.v;
        Label_0275: {
            String v2;
            if (a2 != 0) {
                if (a2 != 1) {
                    if (a2 == 2) {
                        s = (String)qp2.x;
                        try {
                            vt4.g0(y);
                            break Label_0275;
                        }
                        finally {
                            break Label_0275;
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s = (String)qp2.x;
                w = qp2.w;
                v2 = qp2.v;
                vt4.g0(y);
            }
            else {
                vt4.g0(y);
                final Object computeIfAbsent = this.i.computeIfAbsent((Object)new OrganizationId(s), (Function)new mp0((byte)0));
                computeIfAbsent.getClass();
                final Object x = computeIfAbsent;
                qp2.v = s;
                qp2.w = w;
                qp2.x = (aof)x;
                qp2.A = 1;
                if (((aof)x).c((f07)qp2) == v) {
                    return v;
                }
                v2 = s;
                s = (String)x;
            }
            try {
                final nq b = this.b(v2);
                qp2.v = null;
                qp2.w = null;
                qp2.x = (aof)s;
                qp2.A = 2;
                if (b.i(w, (h07)qp2) == v) {
                    return v;
                }
                ((aof)s).g((Object)null);
                return lqo.a;
            }
            finally {}
        }
        ((aof)s).g((Object)null);
        throw;
    }
}
