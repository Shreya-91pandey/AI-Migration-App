import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchDestination;
import kotlinx.serialization.KSerializer;

public final class up0
{
    public final KSerializer serializer() {
        return (KSerializer)AppStartEvents$AppLaunchDestination.v.getValue();
    }
}
