import java.util.Collection;
import com.anthropic.claude.conversation.FailureKind;
import com.anthropic.claude.api.chat.ChatFeedback;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import java.util.Iterator;
import com.anthropic.claude.api.chat.InputMode;
import java.util.ArrayList;
import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.types.strings.MessageId;
import java.util.HashSet;

public abstract class brh
{
    public static final HashSet a;
    
    static {
        a = new HashSet();
    }
    
    public static final uqh a(final yqh yqh) {
        return new uqh(yqh.b(), yqh.g(), yqh.h(), yqh.n(), yqh.p(), yqh.l(), yqh.f(), yqh.d(), yqh.a(), yqh.e(), yqh.i(), yqh.c(), yqh.j(), yqh.k(), yqh.m(), yqh.o(), 0);
    }
    
    public static final vqh b(final zqh zqh) {
        final int t = p3g.t(zqh);
        if (t == 0) {
            return (vqh)a((yqh)zqh);
        }
        final k4a k4a = null;
        if (t == 1) {
            final xqh xqh = (xqh)zqh;
            final String b = xqh.b();
            final int n = xqh.n();
            final InputMode o = xqh.o();
            final boolean v = xqh.v();
            final xko r = xqh.r();
            final boolean k = xqh.k();
            Object e = xqh.e();
            final String b2 = xqh.b();
            Label_0238: {
                if (e == null || !((Collection)e).isEmpty()) {
                    final Iterator iterator = ((Iterable)e).iterator();
                    while (iterator.hasNext()) {
                        if (!(((tsg)iterator.next()) instanceof qtg)) {
                            if (brh.a.add((Object)new MessageId(b2))) {
                                SilentException.a(new SilentException("chat parse emitted a non-ParsedContentBlock on ".concat(MessageId.a(b2))), lpl.w, (List)null, 6);
                            }
                            final ArrayList list = new ArrayList();
                            for (final Object next : e) {
                                if (next instanceof qtg) {
                                    list.add(next);
                                }
                            }
                            e = list;
                            break Label_0238;
                        }
                    }
                }
                e.getClass();
            }
            final List b3 = nc8.b((List)e, xqh.h(), xqh.c());
            final boolean s = xqh.s();
            final boolean l = xqh.l();
            final List h = xqh.h();
            final List c = xqh.c();
            final ApiHelpline m = xqh.m();
            final ChatFeedback d = xqh.d();
            final String q = xqh.q();
            final boolean t2 = xqh.t();
            final FailureKind g = xqh.g();
            k4a c2 = k4a;
            if (g != null) {
                c2 = c(g);
            }
            return (vqh)new tqh(b, n, o, r, v, b3, k, s, l, h, c, m, d, q, t2, c2, xqh.u(), xqh.f(), xqh.j(), 0);
        }
        en9.r();
        return null;
    }
    
    public static final k4a c(final FailureKind failureKind) {
        final int ordinal = ((Enum)failureKind).ordinal();
        if (ordinal == 0) {
            return k4a.v;
        }
        if (ordinal == 1) {
            return k4a.w;
        }
        if (ordinal == 2) {
            return k4a.x;
        }
        if (ordinal == 3) {
            return k4a.y;
        }
        if (ordinal == 4) {
            return k4a.z;
        }
        en9.r();
        return null;
    }
}
