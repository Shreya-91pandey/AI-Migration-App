import com.segment.analytics.kotlin.core.Settings;
import java.util.Map;
import kotlinx.serialization.json.JsonPrimitive;
import com.segment.analytics.kotlin.core.TrackEvent;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.anthropic.claude.analytics.events.McpEvents$McpAppBridgeEvent;
import java.util.Set;

public final class cy7 implements deh
{
    public static final String x;
    public static final Set y;
    public final gy7 v;
    public s10 w;
    
    static {
        x = McpEvents$McpAppBridgeEvent.Companion.serializer().getDescriptor().a();
        y = iw0.n1((Object[])new String[] { "ui/notifications/size-changed", "ui/notifications/tool-input-partial", "ui/notifications/tool-input-delta", "ui/notifications/host-context-changed" });
    }
    
    public cy7(final gy7 v) {
        this.v = v;
    }
    
    @Override
    public final BaseEvent a(final BaseEvent baseEvent) {
        if (baseEvent instanceof TrackEvent) {
            final TrackEvent trackEvent = (TrackEvent)baseEvent;
            final String b = trackEvent.b;
            if (mlc.q((Object)b, (Object)cy7.x)) {
                final Iterable iterable = (Iterable)cy7.y;
                final Object value = trackEvent.a.get((Object)"event_type");
                final boolean b2 = value instanceof JsonPrimitive;
                Object a = null;
                JsonPrimitive jsonPrimitive;
                if (b2) {
                    jsonPrimitive = (JsonPrimitive)value;
                }
                else {
                    jsonPrimitive = null;
                }
                if (jsonPrimitive != null) {
                    a = jsonPrimitive.a();
                }
                if (c86.A0(iterable, a)) {
                    return baseEvent;
                }
            }
            this.v.b(b, (Map)yi2.e0(trackEvent.a));
        }
        return baseEvent;
    }
    
    @Override
    public final void b(final s10 w) {
        this.w = w;
    }
    
    @Override
    public final /* bridge */ void c(final Settings settings, final int n) {
    }
    
    @Override
    public final s10 d() {
        final s10 w = this.w;
        if (w != null) {
            return w;
        }
        mlc.j0("analytics");
        throw null;
    }
    
    @Override
    public final ceh getType() {
        return ceh.y;
    }
}
