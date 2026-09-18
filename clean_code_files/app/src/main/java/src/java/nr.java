import java.util.Map;
import com.anthropic.claude.sessions.types.SessionResource;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import android.content.SharedPreferences;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.types.strings.SessionId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.ArrayList;
import com.anthropic.claude.types.strings.ElicitationId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.models.organization.DefaultModelConfig;
import java.util.concurrent.CancellationException;
import com.anthropic.claude.types.strings.ToolSearchMode;

public final class nr implements jta
{
    public final byte v;
    public final Object w;
    
    public final Object a() {
        final byte v = this.v;
        int i = 0;
        final lqo a = lqo.a;
        final Object o = null;
        final Object o2 = null;
        Object o3 = null;
        final Object o4 = null;
        final Object o5 = null;
        final Object o6 = null;
        final Object o7 = null;
        final Object w = this.w;
        switch (v) {
            default: {
                return new mv6[((ija[])w).length];
            }
            case 13: {
                final AccountSettings h = ((s3p)w).a.a().h;
                String r;
                if (h != null) {
                    r = h.r;
                }
                else {
                    r = null;
                }
                Object o8 = o7;
                if (r != null) {
                    o8 = new ToolSearchMode(r);
                }
                return o8;
            }
            case 12: {
                ((l13)w).resumeWith((Object)a);
                return a;
            }
            case 11: {
                final b4j b4j = (b4j)w;
                final opc opc = (opc)b4j.v;
                if (opc != null) {
                    opc.g((CancellationException)null);
                }
                b4j.v = null;
                return a;
            }
            case 10: {
                final DefaultModelConfig defaultModelConfig = (DefaultModelConfig)((vhg)w).b.e("console_default_model", DefaultModelConfig.Companion.serializer()).getValue();
                String a2;
                if (defaultModelConfig != null) {
                    a2 = defaultModelConfig.a();
                }
                else {
                    a2 = null;
                }
                Object o9 = o;
                if (a2 != null) {
                    o9 = new ModelId(a2);
                }
                return o9;
            }
            case 9: {
                final ArrayList a3 = ((jva)w).a;
                final tmf tmf = new tmf(a3.size());
                while (i < a3.size()) {
                    final puc puc = (puc)a3.get(i);
                    final Object b = puc.b;
                    final int a4 = puc.a;
                    Object value;
                    if (b != null) {
                        value = new dqc((Object)a4, puc.b);
                    }
                    else {
                        value = a4;
                    }
                    gkf.a(tmf, value, (Object)puc);
                    ++i;
                }
                return new gkf(tmf);
            }
            case 8: {
                k39 m0 = ((ah8)w).a.w.M0();
                String a5 = null;
                Label_0478: {
                    if (m0 != null) {
                        if (m0.e() != z39.w) {
                            m0 = null;
                        }
                        if (m0 != null) {
                            a5 = m0.a();
                            break Label_0478;
                        }
                    }
                    a5 = null;
                }
                Object o10 = o2;
                if (a5 != null) {
                    o10 = new ElicitationId(a5);
                }
                return o10;
            }
            case 7: {
                final yw4 yw4 = (yw4)w;
                final String d = yw4.r.d();
                String a7 = null;
                Label_0887: {
                    if (d != null) {
                        final SharedPreferences j = smk.m("account_prefs", d, yw4.a.getApplicationContext(), 0);
                        Object o11;
                        if ((o11 = j.getAll()) == null) {
                            o11 = s89.v;
                        }
                        final Iterable iterable = (Iterable)((Map)o11).keySet();
                        final ArrayList list = new ArrayList();
                        for (final Object next : iterable) {
                            final String s = (String)next;
                            if (!mlc.q((Object)s, (Object)"conway_saved_client_id")) {
                                s.getClass();
                                if (!rym.E0(s, "conway_composer_draft_", false) && !rym.E0(s, "conway_viewing_fork_", false) && !rym.E0(s, "conway_send_outbox_", false)) {
                                    continue;
                                }
                            }
                            list.add(next);
                        }
                        if (!list.isEmpty()) {
                            final SharedPreferences$Editor edit = j.edit();
                            edit.getClass();
                            final Iterator iterator2 = list.iterator();
                            while (iterator2.hasNext()) {
                                edit.remove((String)iterator2.next());
                            }
                            edit.apply();
                        }
                        String string = j.getString("selected_org_id", (String)null);
                        if (string == null) {
                            string = null;
                        }
                        Object o12;
                        if (string != null) {
                            o12 = new OrganizationId(string);
                        }
                        else {
                            o12 = null;
                        }
                        final ksg q = o50.Q(o12);
                        o50.Q((Object)j.getString("display_email", (String)null));
                        final OrganizationId organizationId = (OrganizationId)q.getValue();
                        String a6;
                        if (organizationId != null) {
                            a6 = organizationId.a;
                        }
                        else {
                            a6 = null;
                        }
                        OrganizationId organizationId2;
                        if (a6 != null) {
                            organizationId2 = new OrganizationId(a6);
                        }
                        else {
                            organizationId2 = null;
                        }
                        if (organizationId2 != null) {
                            a7 = organizationId2.a;
                            break Label_0887;
                        }
                    }
                    a7 = null;
                }
                if (a7 != null) {
                    o3 = new OrganizationId(a7);
                }
                return o3;
            }
            case 6: {
                return new OrganizationId(((qo4)w).c.d);
            }
            case 5: {
                return new ChatId(soh.y(((ChatScreenParams)w).a));
            }
            case 4: {
                final xi4 xi4 = (xi4)w;
                String s2;
                if ((s2 = xi4.l()) == null) {
                    final ModelId modelId = (ModelId)xi4.s.getValue();
                    if (modelId != null) {
                        s2 = modelId.a;
                    }
                    else {
                        s2 = null;
                    }
                }
                Object o13 = o4;
                if (s2 != null) {
                    o13 = new ModelId(s2);
                }
                return o13;
            }
            case 3: {
                ((jta)w).a();
                return a;
            }
            case 2: {
                final yb0 yb0 = (yb0)w;
                String s3 = null;
                Label_1114: {
                    if (!(boolean)((ksg)yb0.D).getValue()) {
                        final ProjectId projectId = (ProjectId)((kn3)yb0.w).a();
                        if (projectId != null) {
                            s3 = projectId.a;
                        }
                        else {
                            s3 = null;
                        }
                        if (s3 != null) {
                            break Label_1114;
                        }
                    }
                    s3 = yb0.q();
                }
                Object o14 = o5;
                if (s3 != null) {
                    o14 = new ProjectId(s3);
                }
                return o14;
            }
            case 1: {
                final xao xao = (xao)w;
                float n = 0.0f;
                if (0.0f > 0.01f) {
                    n = 1.0f;
                }
                return new j86(t08.V(x09.c.a(n), xao.a, xao.b));
            }
            case 0: {
                final SessionResource e = ((vr)w).e();
                String d2;
                if (e != null) {
                    d2 = e.d();
                }
                else {
                    d2 = null;
                }
                Object o15 = o6;
                if (d2 != null) {
                    o15 = new SessionId(d2);
                }
                return o15;
            }
        }
    }
}
