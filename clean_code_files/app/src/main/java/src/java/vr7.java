import java.util.AbstractMap;
import com.segment.analytics.kotlin.core.Settings;
import java.util.Iterator;
import kotlinx.serialization.json.JsonElement;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import java.util.Map$Entry;
import java.util.LinkedHashMap;
import com.segment.analytics.kotlin.core.BaseEvent;
import java.util.Set;

public final class vr7 implements deh
{
    public static final Set y;
    public final String v;
    public final String w;
    public s10 x;
    
    static {
        y = rml.K((Object)"email");
    }
    
    public vr7(final String v, final String w) {
        this.v = v;
        this.w = w;
    }
    
    @Override
    public final BaseEvent a(final BaseEvent baseEvent) {
        final n48 n48 = new n48((byte)1);
        itc.a(n48, baseEvent.d());
        ri2.m0(n48, "ant_device_id", this.v);
        ri2.m0(n48, "primary_language", this.w);
        final JsonObject c = this.d().z.c;
        if (c != null) {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (final Map$Entry map$Entry : c.v.entrySet()) {
                if (!vr7.y.contains((Object)map$Entry.getKey())) {
                    ((AbstractMap)linkedHashMap).put(map$Entry.getKey(), map$Entry.getValue());
                }
            }
            n48.c("traits", (JsonElement)new JsonObject((Map)linkedHashMap));
        }
        baseEvent.l(new JsonObject((Map)n48.a));
        return baseEvent;
    }
    
    @Override
    public final void b(final s10 x) {
        this.x = x;
    }
    
    @Override
    public final /* bridge */ void c(final Settings settings, final int n) {
    }
    
    @Override
    public final s10 d() {
        final s10 x = this.x;
        if (x != null) {
            return x;
        }
        mlc.j0("analytics");
        throw null;
    }
    
    @Override
    public final ceh getType() {
        return ceh.w;
    }
}
