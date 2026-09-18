import com.anthropic.claude.analytics.events.CodeEvents$ArtifactOpenSource;
import kotlinx.serialization.KSerializer;

public final class d95
{
    public final KSerializer serializer() {
        return (KSerializer)CodeEvents$ArtifactOpenSource.v.getValue();
    }
}
