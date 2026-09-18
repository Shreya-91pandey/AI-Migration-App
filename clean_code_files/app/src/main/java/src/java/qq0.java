import com.anthropic.claude.analytics.events.AppStartEvents$PlayServicesStatus;
import kotlinx.serialization.KSerializer;

public final class qq0
{
    public final KSerializer serializer() {
        return (KSerializer)AppStartEvents$PlayServicesStatus.v.getValue();
    }
}
