import androidx.compose.ui.node.LayoutNode;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.AccountId;

public final class a78 implements bua
{
    public final byte v;
    public final Object w;
    public final bua x;
    
    public final Object h(final Object o, final Object o2, final Object o3) {
        final byte v = this.v;
        final lqo a = lqo.a;
        final bua x = this.x;
        final Object w = this.w;
        switch (v) {
            default: {
                final AccountId accountId = (AccountId)o;
                final String a2 = accountId.a;
                final OrganizationId organizationId = (OrganizationId)o2;
                final String a3 = organizationId.a;
                final wn wn = (wn)o3;
                ((jta)w).a();
                x.h((Object)accountId, (Object)organizationId, (Object)wn);
                return a;
            }
            case 0: {
                final wyl wyl = (wyl)o;
                final gva gva = (gva)o2;
                final int intValue = ((Number)o3).intValue();
                final yf0 yf0 = (yf0)w;
                int n = intValue;
                if ((intValue & 0x6) == 0x0) {
                    int n2;
                    if (gva.f((Object)wyl)) {
                        n2 = 4;
                    }
                    else {
                        n2 = 2;
                    }
                    n = (intValue | n2);
                }
                if ((n & 0x13) == 0x12 && gva.F()) {
                    gva.Z();
                }
                else {
                    final ylm d = yf0.d;
                    gva.g0(-1963449556);
                    igf a4;
                    if (d == null) {
                        a4 = null;
                    }
                    else {
                        a4 = d.a(wyl, yf0.b, gva, n & 0xE);
                    }
                    gva.q(false);
                    Object v2 = a4;
                    if (a4 == null) {
                        v2 = fgf.v;
                    }
                    final ye6 ye6 = (ye6)x;
                    final moe c = rj2.c((gx)wab.x, false);
                    final int hashCode = Long.hashCode(gva.T);
                    final e3h l = gva.l();
                    final igf b = ien.B(gva, (igf)v2);
                    vh6.e.getClass();
                    gva.k0();
                    if (gva.S) {
                        gva.k((jta)LayoutNode.n0);
                    }
                    else {
                        gva.t0();
                    }
                    k8e.P((zta)awp.A, gva, (Object)c);
                    k8e.P((zta)awp.z, gva, (Object)l);
                    final rg6 b2 = awp.B;
                    if (gva.S || !mlc.q(gva.R(), (Object)hashCode)) {
                        gva.q0((Object)hashCode);
                        gva.b((zta)b2, (Object)hashCode);
                    }
                    k8e.P((zta)awp.y, gva, (Object)b);
                    ye6.m((Object)wyl, (Object)yf0.a, (Object)gva, (Object)(n & 0xE));
                    gva.q(true);
                }
                return a;
            }
        }
    }
}
