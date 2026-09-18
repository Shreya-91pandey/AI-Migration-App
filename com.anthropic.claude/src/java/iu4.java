import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.app.ClaudeAppDestination$Detail$SessionRouterLoadingScreen;

public abstract class iu4
{
    public static final boolean a(final Object o, final Object o2) {
        if (o instanceof ClaudeAppDestination$Detail$SessionRouterLoadingScreen) {
            return true;
        }
        final boolean b = o instanceof ClaudeAppDestination.Detail.Chat;
        final Object o3 = null;
        ClaudeAppDestination.Detail.Chat chat;
        if (b) {
            chat = (ClaudeAppDestination.Detail.Chat)o;
        }
        else {
            chat = null;
        }
        Object a2 = null;
        Label_0053: {
            if (chat != null) {
                final ChatScreenParams a = chat.a;
                if (a != null) {
                    a2 = a.a;
                    break Label_0053;
                }
            }
            a2 = null;
        }
        om4 om4;
        if (a2 instanceof om4) {
            om4 = (om4)a2;
        }
        else {
            om4 = null;
        }
        if (om4 != null) {
            final String a3 = om4.a;
            ClaudeAppDestination.Detail.Chat chat2;
            if (o2 instanceof ClaudeAppDestination.Detail.Chat) {
                chat2 = (ClaudeAppDestination.Detail.Chat)o2;
            }
            else {
                chat2 = null;
            }
            Object h = o3;
            if (chat2 != null) {
                final ChatScreenParams a4 = chat2.a;
                h = o3;
                if (a4 != null) {
                    h = a4.h;
                }
            }
            if (h != null) {
                return h.equals(a3);
            }
        }
        return false;
    }
}
