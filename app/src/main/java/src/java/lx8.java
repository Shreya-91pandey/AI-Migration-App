import java.util.Set;
import com.anthropic.claude.app.c1;
import com.anthropic.claude.app.ClaudeAppDestination;
import java.util.List;

public abstract class lx8
{
    public static final xll a(final frg frg, final vk6 vk6) {
        final ksg w = frg.w;
        final fp4 fp4 = (fp4)c86.R0((List)((rp4)w.getValue()).a);
        final Object o = null;
        ClaudeAppDestination.List list;
        if (fp4 != null) {
            list = (ClaudeAppDestination.List)fp4.a;
        }
        else {
            list = null;
        }
        final fp4 fp5 = (fp4)c86.R0((List)((rp4)w.getValue()).b);
        ClaudeAppDestination.Detail detail;
        if (fp5 != null) {
            detail = (ClaudeAppDestination.Detail)fp5.a;
        }
        else {
            detail = null;
        }
        final zp4 d = ((rp4)w.getValue()).d;
        final fp4 fp6 = (fp4)c86.I0((List)((rp4)w.getValue()).a);
        ClaudeAppDestination.List list2;
        if (fp6 != null) {
            list2 = (ClaudeAppDestination.List)fp6.a;
        }
        else {
            list2 = null;
        }
        final xll xll = new xll();
        Object o2 = null;
        Label_0232: {
            Label_0230: {
                if (detail != null) {
                    if (detail instanceof ClaudeAppDestination.Detail.Chat) {
                        final pm4 a = ((ClaudeAppDestination.Detail.Chat)detail).a.a;
                        if (a != null) {
                            if (a instanceof nm4) {
                                o2 = new ipk(((nm4)a).a);
                                break Label_0232;
                            }
                            if (a instanceof om4) {
                                break Label_0230;
                            }
                        }
                        en9.r();
                        return null;
                    }
                    if (detail instanceof ClaudeAppDestination.Detail.ProjectDetails) {
                        o2 = new lpk(((ClaudeAppDestination.Detail.ProjectDetails)detail).a.a());
                        break Label_0232;
                    }
                }
            }
            o2 = null;
        }
        if (o2 != null) {
            xll.add(o2);
        }
        final String b = c1.b(detail, vk6);
        if (b != null) {
            xll.add((Object)new npk(b));
        }
        if (o2 == null || d == zp4.w) {
            Object o3;
            if (list instanceof ClaudeAppDestination.List.CoworkScheduled) {
                o3 = o;
                if (list2 != null) {
                    o3 = b(list2);
                }
            }
            else {
                o3 = o;
                if (list != null) {
                    o3 = b(list);
                }
            }
            if (o3 != null) {
                xll.add(o3);
            }
        }
        return rml.j((Set)xll);
    }
    
    public static final opk b(final ClaudeAppDestination.List list) {
        switch (o47.x(list)) {
            default: {
                en9.r();
                return null;
            }
            case 10: {
                return (opk)new lpk(((ClaudeAppDestination.List.ProjectDetails)list).a.a());
            }
            case 9: {
                return (opk)epk.a;
            }
            case 8:
            case 11: {
                return null;
            }
            case 7: {
                return (opk)mpk.a;
            }
            case 6: {
                return (opk)kpk.a;
            }
            case 3:
            case 4:
            case 5: {
                return (opk)jpk.a;
            }
            case 2: {
                return (opk)fpk.a;
            }
            case 1: {
                return (opk)hpk.a;
            }
            case 0: {
                return (opk)gpk.a;
            }
        }
    }
}
