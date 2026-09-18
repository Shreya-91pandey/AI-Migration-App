import java.util.Iterator;
import kotlinx.serialization.encoding.Encoder;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import java.util.Map$Entry;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.encoding.Decoder;
import com.anthropic.claude.api.account.GrowthBookFeature;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;

public final class h8d implements KSerializer
{
    public static final h8d a;
    public static final afd b;
    public static final SerialDescriptor c;
    
    static {
        a = (h8d)new Object();
        c = (SerialDescriptor)(b = new afd((KSerializer)hym.a, GrowthBookFeature.Companion.serializer())).c;
    }
    
    public final Object deserialize(Decoder iterator) {
        final boolean b = iterator instanceof grc;
        final JsonObject jsonObject = null;
        grc grc;
        if (b) {
            grc = (grc)iterator;
        }
        else {
            grc = null;
        }
        if (grc == null) {
            return ((k0)h8d.b).deserialize(iterator);
        }
        final JsonElement k = grc.k();
        JsonObject jsonObject2 = jsonObject;
        if (k instanceof JsonObject) {
            jsonObject2 = (JsonObject)k;
        }
        if (jsonObject2 == null) {
            return s89.v;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        iterator = (Decoder)jsonObject2.v.entrySet().iterator();
        while (((Iterator)iterator).hasNext()) {
            final Map$Entry map$Entry = (Map$Entry)((Iterator)iterator).next();
            final String s = (String)map$Entry.getKey();
            final JsonElement jsonElement = (JsonElement)map$Entry.getValue();
            try {
                ((Map)linkedHashMap).put((Object)s, grc.c().a((KSerializer)GrowthBookFeature.Companion.serializer(), jsonElement));
            }
            catch (final Exception ex) {
                final List a = adn.a;
                adn.f((Throwable)ex, smk.s("Failed to parse GrowthBook feature: ", s), (lpl)null, (Map)null, (List)null, 60);
            }
        }
        return linkedHashMap;
    }
    
    public final SerialDescriptor getDescriptor() {
        return h8d.c;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        ((j4e)h8d.b).serialize(encoder, (Object)o);
    }
}
