import com.anthropic.claude.api.errors.ClaudeApiErrorException;
import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.api.result.ApiResult;
import java.util.List;
import java.util.Map;

public final class ew4 extends tvj
{
    public final cxm A;
    public final z8b B;
    public final cof C;
    public final s3p w;
    public final er0 x;
    public final a8j y;
    public final u1p z;
    
    public ew4(final s3p w, final er0 x, final vn0 vn0, final a8j y, final u1p z, final cxm a, final z8b b, final wo8 wo8) {
        super(wo8);
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = new cof();
        rhc.G((oc7)super.v, (hc7)null, 0, (zta)new p10((Object)vn0, (Object)this, (f07)null, (byte)13), 3);
        rhc.G((oc7)super.v, (hc7)null, 0, (zta)new pn((byte)5, (f07)null, (Object)this), 3);
    }
    
    public final void Z() {
        final z8b b = this.B;
        final Boolean x = (Boolean)b.u("mobile_networking_cronet_holdout").getValue();
        final boolean booleanValue = x;
        final List a = adn.a;
        final StringBuilder sb = new StringBuilder("Setting Cronet holdout state to ");
        sb.append(booleanValue);
        adn.e(6, sb.toString(), (String)null, (Map)null);
        this.z.x = x;
        final boolean h = b.h("android_json_bulk_stream_reader");
        final StringBuilder sb2 = new StringBuilder("Setting JSON bulk reader state to ");
        sb2.append(h);
        adn.e(6, sb2.toString(), (String)null, (Map)null);
        this.A.c = h;
    }
    
    public final Object a0(boolean b, f07 f07) {
        Object o = null;
        Label_0049: {
            if (f07 instanceof dw4) {
                o = f07;
                final int c = ((dw4)o).C;
                if ((c & Integer.MIN_VALUE) != 0x0) {
                    ((dw4)o).C = c + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new dw4(this, f07);
        }
        final Object a = ((dw4)o).A;
        final int c2 = ((dw4)o).C;
        final lqo a2 = lqo.a;
        final er0 x = this.x;
        final pc7 v = pc7.v;
        Label_1051: {
            Object z = null;
            final Object o6;
            Label_0814: {
                Label_0807: {
                    Object o2 = null;
                    Object a3 = null;
                    Label_0566: {
                        Object o3 = null;
                        Object o4 = null;
                        final String s;
                        Label_0528: {
                            Label_0433: {
                                if (c2 != 0) {
                                    if (c2 != 1) {
                                        if (c2 != 2) {
                                            if (c2 != 3) {
                                                if (c2 == 4) {
                                                    z = ((dw4)o).z;
                                                    f07 = (f07)((dw4)o).w;
                                                    try {
                                                        vt4.g0(a);
                                                        break Label_0807;
                                                    }
                                                    finally {
                                                        break Label_1051;
                                                    }
                                                }
                                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                            b = ((dw4)o).v;
                                            o2 = ((dw4)o).y;
                                            final String x2 = ((dw4)o).x;
                                            o3 = (f07 = (f07)((dw4)o).w);
                                            try {
                                                vt4.g0(a);
                                                o4 = a;
                                                break Label_0528;
                                            }
                                            finally {
                                                break Label_1051;
                                            }
                                        }
                                        b = ((dw4)o).v;
                                        o2 = ((dw4)o).y;
                                        final String x3 = ((dw4)o).x;
                                        z = (f07 = (f07)((dw4)o).w);
                                        vt4.g0(a);
                                        a3 = a;
                                        final Object o5 = z;
                                        break Label_0433;
                                    }
                                    b = ((dw4)o).v;
                                    f07 = (f07)((dw4)o).w;
                                    vt4.g0(a);
                                }
                                else {
                                    vt4.g0(a);
                                    final Object c3 = this.C;
                                    ((dw4)o).w = (aof)c3;
                                    ((dw4)o).v = b;
                                    ((dw4)o).C = 1;
                                    f07 = (f07)c3;
                                    if (((cof)c3).c((f07)o) == v) {
                                        return v;
                                    }
                                }
                                while (true) {
                                    try {
                                        z = this.w.d;
                                        final zn0 i = x.i((String)z);
                                        if (!b) {
                                            break Label_0433;
                                        }
                                        ((dw4)o).w = (aof)f07;
                                        ((dw4)o).x = (String)z;
                                        ((dw4)o).y = i;
                                        ((dw4)o).v = b;
                                        ((dw4)o).C = 2;
                                        o2 = x.h((String)z);
                                        final xq0 xq0 = new xq0(x, (String)z, (f07)null, (byte)2);
                                        a3 = new lo((byte)8);
                                        a3 = ((lbg)o2).a((lta)a3, (lta)xq0, (h07)o);
                                        if (a3 == v) {
                                            return v;
                                        }
                                        o2 = i;
                                        final Object o5 = f07;
                                        final String x3 = (String)z;
                                        f07 = (f07)o5;
                                        z = a3;
                                        a3 = x3;
                                        break Label_0566;
                                        break Label_1051;
                                    }
                                    finally {
                                        continue;
                                    }
                                    break;
                                }
                            }
                            ((dw4)o).w = (aof)f07;
                            ((dw4)o).x = (String)z;
                            ((dw4)o).y = (zn0)o6;
                            ((dw4)o).v = b;
                            ((dw4)o).C = 3;
                            final Object g = x.g((String)z, (h07)o);
                            if (g == v) {
                                return v;
                            }
                            o2 = o6;
                            o3 = f07;
                            final lta lta = (lta)g;
                            s = (String)z;
                            o4 = lta;
                        }
                        final ApiResult apiResult = (ApiResult)(z = o4);
                        a3 = s;
                        o6 = o3;
                        if (apiResult == null) {
                            ((aof)o3).g((Object)null);
                            return a2;
                        }
                    }
                    final List a4 = adn.a;
                    final StringBuilder sb = new StringBuilder("App start refreshed (force=");
                    sb.append(b);
                    sb.append(")");
                    adn.e(6, sb.toString(), (String)null, (Map)null);
                    int n;
                    if (z == null) {
                        n = -1;
                    }
                    else if (z instanceof qj0) {
                        n = 0;
                    }
                    else if (z instanceof pj0) {
                        n = 1;
                    }
                    else {
                        n = -2;
                    }
                    if (n != 0) {
                        if (n == 1) {
                            break Label_0814;
                        }
                        throw new RuntimeException();
                    }
                    else {
                        final AppStartResponse appStartResponse = (AppStartResponse)((qj0)z).b;
                        ((dw4)o).w = (aof)o6;
                        ((dw4)o).x = null;
                        ((dw4)o).y = null;
                        ((dw4)o).z = (ApiResult)z;
                        ((dw4)o).v = b;
                        ((dw4)o).C = 4;
                        if (x.f((String)a3, appStartResponse, (zn0)o2, (h07)o) != v) {
                            break Label_0807;
                        }
                    }
                    return v;
                }
                this.Z();
            }
            int n2;
            if (z == null) {
                n2 = -1;
            }
            else if (z instanceof qj0) {
                n2 = 0;
            }
            else if (z instanceof pj0) {
                n2 = 1;
            }
            else {
                n2 = -2;
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    throw new RuntimeException();
                }
                final pj0 pj0 = (pj0)z;
                int n3;
                if (pj0 == null) {
                    n3 = -1;
                }
                else if (pj0 instanceof nj0) {
                    n3 = 0;
                }
                else if (pj0 instanceof oj0) {
                    n3 = 1;
                }
                else {
                    n3 = -2;
                }
                if (n3 != 0) {
                    if (n3 != 1) {
                        throw new RuntimeException();
                    }
                }
                else {
                    final nj0 nj0 = (nj0)z;
                    final List a5 = adn.a;
                    adn.f((Throwable)new ClaudeApiErrorException(nj0.b(), "Failed to refresh app start data"), "Failed to refresh app start data", (lpl)null, (Map)null, (List)null, 60);
                }
            }
            ((aof)o6).g((Object)null);
            return a2;
        }
        ((aof)f07).g((Object)null);
    }
}
