import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.ToolUseId;
import com.anthropic.claude.api.skills.Skill;

public final class dr0 implements lta
{
    public final byte v;
    public final Object w;
    
    public final Object b(final Object o) {
        final byte v = this.v;
        final boolean b = false;
        boolean b2 = false;
        final lqo a = lqo.a;
        final Object w = this.w;
        switch (v) {
            default: {
                final Skill skill = (Skill)o;
                final String a2 = skill.a;
                if (a2 != null) {
                    if (!kym.Y0((CharSequence)a2)) {
                        if (uuj.l0(skill.b)) {
                            b2 = true;
                            return b2;
                        }
                    }
                }
                final z3j z3j = (z3j)w;
                ++z3j.v;
                return b2;
            }
            case 5: {
                final Throwable t = (Throwable)o;
                ((l13)w).resumeWith((Object)a);
                return a;
            }
            case 4: {
                final zee zee = (zee)((x8m)((pfe)w).x.e).get(((ToolUseId)o).e());
                boolean b3 = b;
                if (zee != null) {
                    b3 = b;
                    if (zee.e()) {
                        b3 = true;
                    }
                }
                return b3;
            }
            case 3: {
                final AccountId accountId = (AccountId)o;
                final String a3 = accountId.a;
                return ((ep0)((odk)w).d((Class)ep0.class, (emi)null)).j().contains((Object)accountId);
            }
            case 2: {
                final Throwable t2 = (Throwable)o;
                ((c03)w).cancel();
                return a;
            }
            case 1: {
                final Throwable t3 = (Throwable)o;
                ((q13)w).cancel();
                return a;
            }
            case 0: {
                final String a4 = ((OrganizationId)o).a;
                final er0 er0 = (er0)w;
                return new lbg(er0.f, er0.n);
            }
        }
    }
}
