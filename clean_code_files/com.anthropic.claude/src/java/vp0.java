import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchStartType;
import kotlinx.serialization.KSerializer;

public final class vp0
{
    public final KSerializer serializer() {
        return (KSerializer)AppStartEvents$AppLaunchStartType.v.getValue();
    }
}
