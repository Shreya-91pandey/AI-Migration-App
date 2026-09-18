import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.encoding.Decoder;
import java.util.Map;
import java.util.List;
import java.util.Collections;
import com.anthropic.claude.core.telemetry.SilentException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;

public final class r1o implements KSerializer
{
    public final KSerializer a;
    public final SerialDescriptor b;
    
    public r1o() {
        final KSerializer v = k8e.v((KSerializer)hym.a);
        this.a = v;
        this.b = v.getDescriptor();
    }
    
    public static void a(final String s) {
        final List a = adn.a;
        final SilentException ex = new SilentException("Degrading mistyped string value to null");
        final Map singletonMap = Collections.singletonMap((Object)"value_kind", (Object)s);
        singletonMap.getClass();
        adn.f((Throwable)ex, (String)null, lpl.w, singletonMap, (List)null, 50);
    }
    
    public final Object deserialize(final Decoder decoder) {
        grc grc;
        if (decoder instanceof grc) {
            grc = (grc)decoder;
        }
        else {
            grc = null;
        }
        if (grc == null) {
            return this.a.deserialize(decoder);
        }
        final JsonElement k = grc.k();
        if (!(k instanceof JsonPrimitive)) {
            String c;
            if ((c = v4j.a((Class)((JsonPrimitive)k).getClass()).c()) == null) {
                c = "non-primitive";
            }
            a(c);
            return null;
        }
        if (k == JsonNull.INSTANCE) {
            return null;
        }
        final JsonPrimitive jsonPrimitive = (JsonPrimitive)k;
        if (jsonPrimitive.d()) {
            return jsonPrimitive.a();
        }
        a("non-string primitive");
        return null;
    }
    
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        this.a.serialize(encoder, (Object)o);
    }
}
