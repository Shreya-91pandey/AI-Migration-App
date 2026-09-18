import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import kotlinx.serialization.KSerializer;

public final class vw8
{
    public final KSerializer serializer() {
        return (KSerializer)DrawerEvents$DrawerItem.v.getValue();
    }
}
