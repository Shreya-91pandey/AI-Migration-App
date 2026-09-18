import java.util.List;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.UpdateEvents$FlexibleUpdateShown;
import java.util.Map;
import com.anthropic.claude.types.strings.OrganizationId;

public final class xw4 extends m6n implements zta
{
    public final Object A;
    public final byte w;
    public Object x;
    public final Object y;
    public final Object z;
    
    public xw4(final st4 x, final vfj y, final a1e z, final bnf a, final f07 f07) {
        this.w = 1;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        super(2, f07);
    }
    
    public final f07 create(final Object x, final f07 f07) {
        final byte w = this.w;
        final Object a = this.A;
        final Object z = this.z;
        final Object y = this.y;
        switch (w) {
            default: {
                final xw4 xw4 = new xw4(y, z, a, f07, (byte)2);
                xw4.x = ((OrganizationId)x).a;
                return (f07)xw4;
            }
            case 1: {
                return (f07)new xw4((st4)this.x, (vfj)y, (a1e)z, (bnf)a, f07);
            }
            case 0: {
                final xw4 xw5 = new xw4(y, z, a, f07, (byte)0);
                xw5.x = x;
                return (f07)xw5;
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                final OrganizationId organizationId = (OrganizationId)o;
                final String a2 = organizationId.a;
                ((xw4)this.create(organizationId, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 1: {
                ((xw4)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 0: {
                return ((xw4)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final Object a2 = this.A;
        final Object z = this.z;
        final Object y = this.y;
        switch (w) {
            default: {
                final String s = (String)this.x;
                vt4.g0(o);
                final List a3 = adn.a;
                adn.e(6, "Handling org change", (String)null, (Map)null);
                final tm9 tm9 = (tm9)y;
                final et0 b = tm9.b;
                final o68 a4 = vo8.a;
                rhc.G((oc7)b, (hc7)d58.w, 0, (zta)new sm9(tm9, (f07)null, (byte)1), 2);
                ((lta)z).b((Object)new OrganizationId(s));
                ((jta)a2).a();
                return a;
            }
            case 1: {
                vt4.g0(o);
                final eia eia = (eia)((xom)a2).getValue();
                if (eia instanceof zha) {
                    final st4 st4 = (st4)this.x;
                    final zha zha = (zha)eia;
                    final UpdateEvents$FlexibleUpdateShown updateEvents$FlexibleUpdateShown = new UpdateEvents$FlexibleUpdateShown(zha.b);
                    final KSerializer s2 = yi2.S(a0l.a, (buc)v4j.b((Class)UpdateEvents$FlexibleUpdateShown.class));
                    vt4.b0(s2);
                    st4.b((v10)updateEvents$FlexibleUpdateShown, (KSerializer)s2);
                    ((vfj)y).c.b(zha.a, (mlc)z, igr.a(0).a());
                }
                return a;
            }
            case 0: {
                final oc7 oc7 = (oc7)this.x;
                vt4.g0(o);
                final yw4 yw4 = (yw4)y;
                rhc.G(oc7, (hc7)null, 0, (zta)new ww4(yw4, null, (byte)2), 3);
                final o68 a5 = vo8.a;
                final d58 w2 = d58.w;
                rhc.G(oc7, (hc7)w2, 0, (zta)new ff4(yw4, z, a2, null, (byte)2), 2);
                rhc.G(oc7, (hc7)w2, 0, (zta)new vw4(yw4, null, (byte)2), 2);
                rhc.G(oc7, (hc7)null, 0, (zta)new p10((byte)14, (f07)null, (Object)yw4), 3);
                rhc.G(oc7, (hc7)null, 0, (zta)new ww4(yw4, null, (byte)3), 3);
                final wo8 f = yw4.f;
                rhc.G(oc7, (hc7)((y38)f).a(), 0, (zta)new vw4(yw4, null, (byte)3), 2);
                rhc.G(oc7, (hc7)((y38)f).a(), 0, (zta)new vw4(yw4, null, (byte)4), 2);
                final n33 m = yw4.m;
                rhc.G((oc7)m.d, (hc7)vo8.a, 0, (zta)new m33((byte)0, (f07)null, (Object)m), 2);
                rhc.G(oc7, (hc7)null, 0, (zta)new ww4(yw4, null, (byte)4), 3);
                return rhc.G(oc7, (hc7)null, 0, (zta)new mn((byte)21, (f07)null, (Object)yw4), 3);
            }
        }
    }
}
