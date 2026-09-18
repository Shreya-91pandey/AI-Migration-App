import com.anthropic.claude.analytics.events.PushEvents$FailureCause;
import kotlinx.serialization.KSerializer;

public final class qki
{
    public final KSerializer serializer() {
        return (KSerializer)PushEvents$FailureCause.v.getValue();
    }
}
