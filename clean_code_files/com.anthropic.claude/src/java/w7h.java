import kotlinx.serialization.json.JsonObject;
import java.util.Map;
import java.util.LinkedHashMap;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.EventType;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;

public final class w7h implements deh
{
    public final byte v;
    public s10 w;
    
    private final /* bridge */ void e(final Settings settings, final int n) {
    }
    
    private final void f(final Settings settings, final int n) {
    }
    
    @Override
    public final BaseEvent a(final BaseEvent baseEvent) {
        switch (this.v) {
            default: {
                if (baseEvent.h() == EventType.z) {
                    this.d().z.b = baseEvent.i();
                    this.d().z.a = baseEvent.c();
                    this.d().z.c = ((IdentifyEvent)baseEvent).b;
                }
                else if (baseEvent.h() == EventType.y) {
                    this.d().z.a = baseEvent.c();
                }
                else {
                    if (this.d().z.b != null) {
                        baseEvent.p(String.valueOf((Object)this.d().z.b));
                    }
                    final String a = this.d().z.a;
                    baseEvent.k(this.d().z.a.toString());
                }
                return baseEvent;
            }
            case 0: {
                final LinkedHashMap linkedHashMap = new LinkedHashMap((Map)baseEvent.d());
                ((Map)linkedHashMap).put((Object)"ip", (Object)jrc.c("REDACTED"));
                ((Map)linkedHashMap).remove((Object)"network");
                ((Map)linkedHashMap).remove((Object)"timezone");
                ((Map)linkedHashMap).remove((Object)"screen");
                ((Map)linkedHashMap).remove((Object)"userAgent");
                if (((Map)linkedHashMap).containsKey((Object)"device")) {
                    final Object value = linkedHashMap.get((Object)"device");
                    value.getClass();
                    final LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map)value);
                    ((Map)linkedHashMap2).remove((Object)"id");
                    ((Map)linkedHashMap).put((Object)"device", (Object)new JsonObject((Map)linkedHashMap2));
                }
                baseEvent.l(new JsonObject((Map)linkedHashMap));
                return baseEvent;
            }
        }
    }
    
    @Override
    public final void b(final s10 s10) {
        switch (this.v) {
            default: {
                this.w = s10;
                return;
            }
            case 0: {
                this.w = s10;
            }
        }
    }
    
    @Override
    public final void c(final Settings settings, int v) {
        v = this.v;
    }
    
    @Override
    public final s10 d() {
        switch (this.v) {
            default: {
                final s10 w = this.w;
                if (w != null) {
                    return w;
                }
                mlc.j0("analytics");
                throw null;
            }
            case 0: {
                final s10 w2 = this.w;
                if (w2 != null) {
                    return w2;
                }
                mlc.j0("analytics");
                throw null;
            }
        }
    }
    
    @Override
    public final ceh getType() {
        switch (this.v) {
            default: {
                return ceh.v;
            }
            case 0: {
                return ceh.w;
            }
        }
    }
}
