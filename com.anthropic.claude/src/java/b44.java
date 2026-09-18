import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.chat.ChatLiveStatus;

public final class b44 extends ae9
{
    public static final b44 e;
    
    static {
        ChatLiveStatus.Companion.getClass();
        e = (b44)new ae9((KSerializer)ChatLiveStatus.v.getValue(), ChatLiveStatus.x);
    }
}
