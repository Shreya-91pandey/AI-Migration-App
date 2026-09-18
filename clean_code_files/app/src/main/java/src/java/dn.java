import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsErrorType;
import kotlinx.serialization.KSerializer;

public final class dn
{
    public final KSerializer serializer() {
        return (KSerializer)AgeSignalsEvents$AgeSignalsErrorType.v.getValue();
    }
}
