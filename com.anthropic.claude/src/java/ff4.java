import android.content.SharedPreferences$Editor;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.api.memory.MemorySettingsResponse;

public final class ff4 extends m6n implements zta
{
    public final byte w;
    public final Object x;
    public final Object y;
    public Object z;
    
    public ff4(final r27 x, final qhc y, final f07 f07) {
        this.w = 3;
        this.x = x;
        this.y = y;
        super(2, f07);
    }
    
    public final f07 create(final Object z, final f07 f07) {
        final byte w = this.w;
        final Object y = this.y;
        final Object x = this.x;
        switch (w) {
            default: {
                return (f07)new ff4(this.z, x, y, f07, (byte)6);
            }
            case 5: {
                return (f07)new ff4(this.z, x, y, f07, (byte)5);
            }
            case 4: {
                return (f07)new ff4(this.z, x, y, f07, (byte)4);
            }
            case 3: {
                final ff4 ff4 = new ff4((r27)x, (qhc)y, f07);
                ff4.z = z;
                return (f07)ff4;
            }
            case 2: {
                return (f07)new ff4(this.z, x, y, f07, (byte)2);
            }
            case 1: {
                return (f07)new ff4(this.z, x, y, f07, (byte)1);
            }
            case 0: {
                return (f07)new ff4(this.z, x, y, f07, (byte)0);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                ((ff4)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 5: {
                return ((ff4)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 4: {
                ((ff4)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 3: {
                ((ff4)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 2: {
                ((ff4)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 1: {
                ((ff4)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 0: {
                ((ff4)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final Object o2 = null;
        switch (w) {
            default: {
                vt4.g0(o);
                final b4j b4j = (b4j)this.z;
                final wom a = ((qa)this.x).a((wom)b4j.v);
                b4j.v = a;
                ((qtm)this.y).a = a;
                return lqo.a;
            }
            case 5: {
                vt4.g0(o);
                return ((egg)this.z).b.a((String)this.x).b((MemorySettingsResponse)this.y, 0);
            }
            case 4: {
                vt4.g0(o);
                final f8 f8 = (f8)this.z;
                final String d = ((s3p)this.x).d;
                final SharedPreferences$Editor edit = f8.a.edit();
                edit.getClass();
                String s;
                if (d == null) {
                    s = null;
                }
                else {
                    s = d;
                }
                edit.putString("selected_org_id", s);
                edit.apply();
                final ksg b = f8.b;
                Object value = o2;
                if (d != null) {
                    value = new OrganizationId(d);
                }
                b.setValue(value);
                final String b2 = ((j6)this.y).a().b;
                final SharedPreferences$Editor edit2 = f8.a.edit();
                edit2.getClass();
                edit2.putString("display_email", b2);
                edit2.apply();
                f8.c.setValue((Object)b2);
                return lqo.a;
            }
            case 3: {
                final oc7 oc7 = (oc7)this.z;
                vt4.g0(o);
                final r27 r27 = (r27)this.x;
                final qhc qhc = (qhc)this.y;
                r27.h = qhc.a.c().h();
                rhc.G(oc7, (hc7)null, 0, (zta)new q27(r27, qhc, (f07)null, (byte)0), 3);
                rhc.G(oc7, (hc7)null, 0, (zta)new q27(r27, qhc, (f07)null, (byte)1), 3);
                rhc.G(oc7, (hc7)null, 0, (zta)new q27(r27, qhc, (f07)null, (byte)2), 3);
                rhc.G(oc7, (hc7)null, 0, (zta)new q27(r27, qhc, (f07)null, (byte)3), 3);
                rhc.G(oc7, (hc7)null, 0, (zta)new q27(r27, qhc, (f07)null, (byte)4), 3);
                return lqo.a;
            }
            case 2: {
                vt4.g0(o);
                final yw4 yw4 = (yw4)this.z;
                final lqn q = yw4.q;
                final jyk jyk = (jyk)this.y;
                synchronized (q) {
                    q.d = (lta)new a0(1, (Object)jyk, (Class)jyk.class, "setEnabled", "setEnabled(Z)V", 0, (byte)13);
                    q.e = (lta)new a0(1, (Object)yw4.p, (Class)xxl.class, "setEnabled", "setEnabled(Z)V", 0, (byte)14);
                    monitorexit(q);
                    final nr nr = new nr((Object)this.z, (byte)7);
                    Label_0655: {
                        if (q.c()) {
                            break Label_0655;
                        }
                        final OrganizationId organizationId = (OrganizationId)nr.a();
                        String a2;
                        if (organizationId != null) {
                            a2 = organizationId.a;
                        }
                        else {
                            a2 = null;
                        }
                        if (a2 == null) {
                            break Label_0655;
                        }
                        synchronized (q) {
                            if (!q.c()) {
                                q.b(a2);
                            }
                            monitorexit(q);
                            final boolean b3 = ((yw4)this.z).n.b();
                            q.d();
                            if (!b3) {
                                final et0 b4 = ((yw4)this.z).b;
                                final o68 a3 = vo8.a;
                                rhc.G((oc7)b4, uuj.s0((hc7)d58.w, (hc7)this.x), 0, (zta)new g24((Object)this.z, (Object)q, (f07)null, (byte)24), 2);
                            }
                            return lqo.a;
                        }
                    }
                }
            }
            case 1: {
                final e17 y3 = ((oc4)this.x).y3;
                vt4.g0(o);
                final String s2 = (String)this.z;
                if (s2 != null && !y3.e()) {
                    y3.i((boolean)((eo3)((d17)this.y).a()).b((Object)new ChatId(s2)));
                }
                return lqo.a;
            }
            case 0: {
                final d17 d2 = (d17)this.y;
                final e17 y4 = ((oc4)this.x).y3;
                vt4.g0(o);
                if (this.z != null && y4.d()) {
                    y4.b(d2);
                }
                else if (!y4.d() && y4.c() == null) {
                    y4.a(d2);
                }
                return lqo.a;
            }
        }
    }
}
