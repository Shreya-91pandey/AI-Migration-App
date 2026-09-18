import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsResult;
import kotlinx.serialization.KSerializer;

public final class en
{
    public final KSerializer serializer() {
        return (KSerializer)AgeSignalsEvents$AgeSignalsResult.v.getValue();
    }
}
