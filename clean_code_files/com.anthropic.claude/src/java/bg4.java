import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.chat.ChatScreenParams;

public final class bg4 implements zta
{
    public final gwj v;
    public final ChatScreenParams w;
    public final oc4 x;
    public final st4 y;
    
    public bg4(final gwj v, final ChatScreenParams w, final oc4 x, final st4 y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public final Object d(final Object o, final Object o2) {
        final ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource = (ChatMessageActionEvents$ActionSource)o;
        final String a = ((MessageId)o2).a;
        final String a2 = this.w.a();
        final oc4 x = this.x;
        this.v.b((lta)new vy((Object[])new ChatScreenModalBottomSheetDestination[] { new ChatScreenModalBottomSheetDestination.Share(a2, x.w1.size()) }, (byte)18), (zta)new q94((byte)15));
        final ChatMessageActionEvents$ChatMessageActionClicked chatMessageActionEvents$ChatMessageActionClicked = new ChatMessageActionEvents$ChatMessageActionClicked(x.y.d, x.q1, a, chatMessageActionEvents$ActionSource, ChatMessageActionEvents$ChatMessageAction.B);
        final KSerializer serializer = ChatMessageActionEvents$ChatMessageActionClicked.Companion.serializer();
        vt4.b0(serializer);
        this.y.b((v10)chatMessageActionEvents$ChatMessageActionClicked, (KSerializer)serializer);
        return lqo.a;
    }
}
