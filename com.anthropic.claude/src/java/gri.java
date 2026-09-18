import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudInterruptReason;
import kotlinx.serialization.KSerializer;

public final class gri
{
    public final KSerializer serializer() {
        return (KSerializer)ReadAloudEvents$ReadAloudInterruptReason.v.getValue();
    }
}
