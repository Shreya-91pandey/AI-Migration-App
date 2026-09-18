import com.anthropic.claude.analytics.events.AppStartEvents$InstallSource;
import kotlinx.serialization.KSerializer;

public final class jq0
{
    public final KSerializer serializer() {
        return (KSerializer)AppStartEvents$InstallSource.v.getValue();
    }
}
