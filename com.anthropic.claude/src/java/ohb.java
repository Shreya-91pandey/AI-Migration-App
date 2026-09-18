import com.anthropic.claude.analytics.health.HealthMetricOutcome;
import kotlinx.serialization.KSerializer;

public final class ohb
{
    public final KSerializer serializer() {
        return (KSerializer)HealthMetricOutcome.v.getValue();
    }
}
