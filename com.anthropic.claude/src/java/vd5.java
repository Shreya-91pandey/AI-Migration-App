import com.anthropic.claude.analytics.events.CodeEvents$CodeSessionListEntrySource;
import kotlinx.serialization.KSerializer;

public final class vd5
{
    public final KSerializer serializer() {
        return (KSerializer)CodeEvents$CodeSessionListEntrySource.v.getValue();
    }
}
