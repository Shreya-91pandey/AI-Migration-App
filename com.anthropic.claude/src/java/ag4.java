import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.api.chat.ChatFeedback;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import androidx.compose.ui.node.LayoutNode;

public final class ag4 implements bua
{
    public final byte v;
    public final Object w;
    public final Object x;
    public final Object y;
    
    public final Object h(final Object o, final Object o2, final Object o3) {
        final byte v = this.v;
        final lqo a = lqo.a;
        final Object y = this.y;
        final Object x = this.x;
        final Object w = this.w;
        switch (v) {
            default: {
                final wyl wyl = (wyl)o;
                final gva gva = (gva)o2;
                int intValue;
                final int n = intValue = ((Number)o3).intValue();
                if ((n & 0x6) == 0x0) {
                    int n2;
                    if (gva.f((Object)wyl)) {
                        n2 = 4;
                    }
                    else {
                        n2 = 2;
                    }
                    intValue = (n | n2);
                }
                if ((intValue & 0x13) == 0x12 && gva.F()) {
                    gva.Z();
                }
                else {
                    final igf igf = (igf)w;
                    final ye6 ye6 = (ye6)x;
                    final dq4 dq4 = (dq4)y;
                    final moe c = rj2.c((gx)wab.x, false);
                    final int hashCode = Long.hashCode(gva.T);
                    final e3h l = gva.l();
                    final igf b = ien.B(gva, igf);
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
                    ye6.m((Object)wyl, (Object)dq4.a, (Object)gva, (Object)(intValue & 0xE));
                    gva.q(true);
                }
                return a;
            }
            case 1: {
                final ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource = (ChatMessageActionEvents$ActionSource)o;
                final String a2 = ((MessageId)o2).a;
                final ChatFeedback chatFeedback = (ChatFeedback)o3;
                final oc4 oc4 = (oc4)w;
                final gwj gwj = (gwj)x;
                final st4 st4 = (st4)y;
                while (true) {
                    Label_0397: {
                        if (chatFeedback == null) {
                            break Label_0397;
                        }
                        final ChatFeedbackType b3 = chatFeedback.b();
                        if (b3 == null) {
                            break Label_0397;
                        }
                        ChatFeedbackType chatFeedbackType;
                        if ((chatFeedbackType = b3) == ChatFeedbackType.x) {
                            chatFeedbackType = null;
                        }
                        final ChatFeedbackType i;
                        if ((i = chatFeedbackType) == null) {
                            break Label_0397;
                        }
                        rg4.f(oc4, gwj, st4, chatMessageActionEvents$ActionSource, a2, chatFeedback, i);
                        return a;
                    }
                    ChatFeedbackType i = ChatFeedbackType.I;
                    continue;
                }
            }
            case 0: {
                rg4.f((oc4)w, (gwj)x, (st4)y, (ChatMessageActionEvents$ActionSource)o, ((MessageId)o2).a, (ChatFeedback)o3, ChatFeedbackType.x);
                return a;
            }
        }
    }
}
