import com.anthropic.claude.analytics.events.ConversationStoreType;
import kotlinx.serialization.KSerializer;

public final class o87
{
    public final KSerializer serializer() {
        return (KSerializer)ConversationStoreType.v.getValue();
    }
}
