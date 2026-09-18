import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import java.util.LinkedHashMap;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonPrimitive;
import com.anthropic.claude.api.account.SubscriptionPauseHint;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;

public final class f2n implements KSerializer
{
    public static final f2n a;
    public static final SerialDescriptor b;
    
    static {
        a = (f2n)new Object();
        b = JsonElement.Companion.serializer().getDescriptor();
    }
    
    public final Object deserialize(final Decoder decoder) {
        final JsonElement k = ((grc)decoder).k();
        if (k instanceof JsonNull) {
            return SubscriptionPauseHint.w;
        }
        if (k instanceof JsonPrimitive) {
            final JsonPrimitive jsonPrimitive = (JsonPrimitive)k;
            if (jsonPrimitive.d() && mlc.q((Object)jsonPrimitive.a(), (Object)"absent")) {
                return SubscriptionPauseHint.v;
            }
        }
        return SubscriptionPauseHint.x;
    }
    
    public final SerialDescriptor getDescriptor() {
        return f2n.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final int ordinal = ((SubscriptionPauseHint)o).ordinal();
        Object o2;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    en9.r();
                    return;
                }
                o2 = new JsonObject((Map)new LinkedHashMap());
            }
            else {
                o2 = JsonNull.INSTANCE;
            }
        }
        else {
            o2 = jrc.c("absent");
        }
        ((prc)encoder).D((JsonElement)o2);
    }
}
