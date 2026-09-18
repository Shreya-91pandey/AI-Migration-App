import java.util.Collection;
import android.content.SharedPreferences$Editor;
import com.anthropic.claude.sessions.types.SessionExternalMetadataV2;
import com.anthropic.claude.sessions.types.SessionResourceV2;
import com.anthropic.claude.sessions.types.m1;
import com.anthropic.claude.sessions.types.EnvironmentKind;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.EnvironmentListResponse;
import com.anthropic.claude.configs.flags.AgentChatWorkerTypesConfig;
import java.util.Iterator;
import com.anthropic.claude.sessions.types.SessionStatus;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.api.result.ApiResult;
import java.util.List;
import java.util.ArrayList;

public final class wp
{
    public final oll a;
    public final krf b;
    public final uq c;
    public final wq d;
    public final kr e;
    public final br f;
    public final ksg g;
    public final x8m h;
    public boolean i;
    public final ksg j;
    
    public wp(final oll a, final krf b, final uq c, final wq d, final kr e, final br f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = o50.Q((Object)c.a.getString("dispatch_agent_name", (String)null));
        this.h = new x8m();
        this.j = o50.Q((Object)null);
    }
    
    public final Object a(boolean v, final h07 h07) {
        tp tp2 = null;
        Label_0051: {
            if (h07 instanceof tp) {
                final tp tp = (tp)h07;
                final int b = tp.B;
                if ((b & Integer.MIN_VALUE) != 0x0) {
                    tp.B = b + Integer.MIN_VALUE;
                    tp2 = tp;
                    break Label_0051;
                }
            }
            tp2 = new tp(this, h07);
        }
        Object o = tp2.z;
        final int b2 = tp2.B;
        Object o2;
        while (true) {
            z3j y = null;
            String x = null;
            Object w2 = null;
            Label_0259: {
                h07 h8;
                Object y2;
                String x2;
                if (b2 != 0) {
                    if (b2 == 1) {
                        v = tp2.v;
                        y = tp2.y;
                        x = tp2.x;
                        final List w = tp2.w;
                        vt4.g0(o);
                        h8 = (h07)tp2;
                        w2 = w;
                        break Label_0259;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    vt4.g0(o);
                    final ArrayList list = new ArrayList();
                    y2 = new Object();
                    h8 = (h07)tp2;
                    x2 = null;
                    w2 = list;
                }
                o2 = w2;
                if (((z3j)y2).v >= 20) {
                    return o2;
                }
                final Integer n = new Integer(100);
                final List x3 = lq6.X((Object)"cowork-dispatch-local");
                ((tp)h8).w = (List)w2;
                ((tp)h8).x = x2;
                ((tp)h8).y = (z3j)y2;
                ((tp)h8).v = v;
                ((tp)h8).B = 1;
                o = oll.E(this.a, x2, n, x3, (String)null, false, (List)null, h8, 120);
                final pc7 v2 = pc7.v;
                if (o == v2) {
                    return v2;
                }
                final z3j z3j = (z3j)y2;
                x = x2;
                y = z3j;
            }
            final ApiResult apiResult = (ApiResult)o;
            final int z = t.z(apiResult);
            if (z != 0) {
                if (z != 1) {
                    en9.r();
                    return null;
                }
                final tqd l = uqd.l;
                o2 = w2;
                if (((List)w2).isEmpty()) {
                    o2 = w2;
                    if (!v) {
                        this.f.b((Object)xp.v);
                        return w2;
                    }
                }
            }
            else {
                final wll wll = (wll)((qj0)apiResult).b;
                for (final Object next : wll.a()) {
                    final SessionResource sessionResource = (SessionResource)next;
                    if (sessionResource.g() != SessionStatus.B && this.h.containsKey((Object)sessionResource.c())) {
                        ((Collection)w2).add(next);
                    }
                }
                if (v) {
                    o2 = w2;
                    if (!((Collection)w2).isEmpty()) {
                        return o2;
                    }
                }
                final String b3 = wll.b();
                o2 = w2;
                if (b3 != null) {
                    if (!b3.equals(x)) {
                        ++y.v;
                        final String s = b3;
                        final Object y2 = y;
                        final String x2 = s;
                        continue;
                    }
                    o2 = w2;
                }
            }
            break;
        }
        return o2;
    }
    
    public final Object b(final h07 h07) {
        while (true) {
            Label_0035: {
                if (!(h07 instanceof up)) {
                    break Label_0035;
                }
                final up up = (up)h07;
                final int y = up.y;
                if ((y & Integer.MIN_VALUE) == 0x0) {
                    break Label_0035;
                }
                up.y = y + Integer.MIN_VALUE;
                final Object w = up.w;
                final int y2 = up.y;
                List v = null;
                Object b = null;
                Label_0207: {
                    if (y2 == 0) {
                        vt4.g0(w);
                        final AgentChatWorkerTypesConfig agentChatWorkerTypesConfig = (AgentChatWorkerTypesConfig)this.b.a.t("mobile_cowork_worker_types", AgentChatWorkerTypesConfig.Companion.serializer(), lpl.x).getValue();
                        while (true) {
                            Label_0162: {
                                if (agentChatWorkerTypesConfig == null) {
                                    break Label_0162;
                                }
                                v = agentChatWorkerTypesConfig.a();
                                if (v == null) {
                                    break Label_0162;
                                }
                                if (((Collection)v).isEmpty()) {
                                    v = null;
                                }
                                if (v == null) {
                                    break Label_0162;
                                }
                                up.v = v;
                                up.y = 1;
                                b = oll.B(this.a, (String)null, (Integer)null, v, (h07)up, 7);
                                final pc7 v2 = pc7.v;
                                if (b == v2) {
                                    return v2;
                                }
                                break Label_0207;
                            }
                            v = krf.H;
                            continue;
                        }
                    }
                    if (y2 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v = up.v;
                    vt4.g0(w);
                    b = w;
                }
                final ApiResult apiResult = (ApiResult)b;
                final int z = t.z(apiResult);
                final ksg j = this.j;
                if (z != 0) {
                    if (z != 1) {
                        en9.r();
                        return null;
                    }
                    final tqd l = uqd.l;
                    j.setValue((Object)apiResult.toString());
                }
                else {
                    j.setValue((Object)null);
                    for (final EnvironmentResource environmentResource : ((EnvironmentListResponse)((qj0)apiResult).b).a()) {
                        if (environmentResource.b() == EnvironmentKind.y) {
                            final String a = environmentResource.a();
                            String s;
                            if ((s = (String)c86.i1(v)) == null) {
                                s = "cowork";
                            }
                            this.h.put((Object)a, (Object)new sp(s, m1.h(environmentResource)));
                            if (!m1.e(environmentResource)) {
                                continue;
                            }
                            this.i = true;
                        }
                    }
                }
                return lqo.a;
            }
            final up up = new up(this, h07);
            continue;
        }
    }
    
    public final Object c(final h07 h07) {
        vp vp2 = null;
        Label_0047: {
            if (h07 instanceof vp) {
                final vp vp = (vp)h07;
                final int x = vp.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    vp.x = x + Integer.MIN_VALUE;
                    vp2 = vp;
                    break Label_0047;
                }
            }
            vp2 = new vp(this, h07);
        }
        Object o = vp2.v;
        final int x2 = vp2.x;
        final kr e = this.e;
        final wq d = this.d;
        final lqo a = lqo.a;
        final pc7 v = pc7.v;
        Label_0320: {
            Label_0254: {
                if (x2 != 0) {
                    if (x2 != 1) {
                        if (x2 == 2) {
                            vt4.g0(o);
                            break Label_0254;
                        }
                        if (x2 == 3) {
                            vt4.g0(o);
                            break Label_0320;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        vt4.g0(o);
                    }
                }
                else {
                    vt4.g0(o);
                    if (!this.b.f()) {
                        return a;
                    }
                    if (this.g.getValue() != null && (boolean)d.a()) {
                        return a;
                    }
                    vp2.x = 1;
                    if (this.b(vp2) == v) {
                        return v;
                    }
                }
                if (this.h.isEmpty()) {
                    return a;
                }
                if (this.i && !(boolean)d.a()) {
                    e.a();
                }
                vp2.x = 2;
                if ((o = this.a(true, vp2)) == v) {
                    return v;
                }
            }
            final SessionResource sessionResource = (SessionResource)c86.I0((List)o);
            if (sessionResource == null) {
                return a;
            }
            if (!(boolean)d.a()) {
                e.a();
            }
            final String d2 = sessionResource.d();
            vp2.x = 3;
            if ((o = this.a.u(d2, (h07)vp2)) != v) {
                break Label_0320;
            }
            return v;
        }
        final ApiResult apiResult = (ApiResult)o;
        if (apiResult != null) {
            if (apiResult instanceof qj0) {
                this.d(((SessionResourceV2)((qj0)apiResult).b).a());
                return a;
            }
            if (apiResult instanceof pj0) {
                final tqd l = uqd.l;
                return a;
            }
        }
        en9.r();
        return null;
    }
    
    public final void d(final SessionExternalMetadataV2 sessionExternalMetadataV2) {
        String value;
        final String s = value = null;
        if (sessionExternalMetadataV2 != null) {
            final String a = sessionExternalMetadataV2.a();
            value = s;
            if (a != null) {
                final String string = kym.B1((CharSequence)a).toString();
                value = s;
                if (string != null) {
                    value = s;
                    if (string.length() > 0) {
                        value = string;
                    }
                }
            }
        }
        this.g.setValue((Object)value);
        final SharedPreferences$Editor edit = this.c.a.edit();
        if (value == null) {
            edit.remove("dispatch_agent_name");
        }
        else {
            edit.putString("dispatch_agent_name", value);
        }
        edit.apply();
    }
}
