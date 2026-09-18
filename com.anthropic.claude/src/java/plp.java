import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEntrySource;
import kotlinx.serialization.KSerializer;

public final class plp
{
    public final KSerializer serializer() {
        return (KSerializer)VoiceEvents$VoiceEntrySource.v.getValue();
    }
}
