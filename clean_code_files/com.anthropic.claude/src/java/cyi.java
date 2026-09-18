import java.util.AbstractMap;
import kotlinx.serialization.encoding.Encoder;
import java.util.Iterator;
import com.anthropic.claude.api.recents.RecentsRow$Session;
import kotlinx.serialization.json.JsonObject;
import java.util.Map;
import java.util.Map$Entry;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonNull;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;

public final class cyi implements KSerializer
{
    public static final cyi a;
    public static final ezk b;
    
    static {
        a = (cyi)new Object();
        if (!kym.Y0((CharSequence)"RecentsRow")) {
            final vs4 vs4 = new vs4("RecentsRow");
            b = new ezk("RecentsRow", (o50)xym.k, vs4.c.size(), iw0.m1((Object[])new SerialDescriptor[0]), vs4);
            return;
        }
        en9.s("Blank serial names are prohibited");
    }
    
    public final Object deserialize(final Decoder decoder) {
        final grc grc = (grc)decoder;
        final JsonElement k = grc.k();
        final JsonElement jsonElement = (JsonElement)jrc.i(k).get((Object)"type");
        Object o = null;
        String f;
        if (jsonElement != null) {
            f = jrc.f(jrc.j(jsonElement));
        }
        else {
            f = null;
        }
        if (f != null) {
            final int hashCode = f.hashCode();
            if (hashCode != -1434379820) {
                if (hashCode != -309310695) {
                    if (hashCode == 3052376) {
                        if (f.equals((Object)"chat")) {
                            return new vxi((ChatConversationWithProjectReference)grc.c().a((KSerializer)ChatConversationWithProjectReference.Companion.serializer(), k));
                        }
                    }
                }
                else if (f.equals((Object)"project")) {
                    final jqc c = grc.c();
                    final KSerializer kSerializer = Project.Companion.serializer();
                    final JsonObject i = jrc.i(k);
                    JsonElement jsonElement2 = (JsonElement)i.get((Object)"project_type");
                    if (jsonElement2 == null || jsonElement2 instanceof JsonNull) {
                        jsonElement2 = null;
                    }
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (final Map$Entry map$Entry : i.v.entrySet()) {
                        final String s = (String)map$Entry.getKey();
                        if (!mlc.q((Object)s, (Object)"type") && !mlc.q((Object)s, (Object)"project_type")) {
                            ((AbstractMap)linkedHashMap).put(map$Entry.getKey(), map$Entry.getValue());
                        }
                    }
                    if (jsonElement2 != null) {
                        o = new yog((Object)"type", (Object)jsonElement2);
                    }
                    return new wxi((Project)c.a(kSerializer, (JsonElement)new JsonObject(y5e.f0(lq6.Z(o), (Map)linkedHashMap))));
                }
            }
            else if (f.equals((Object)"cowork_session")) {
                return grc.c().a((KSerializer)RecentsRow$Session.Companion.serializer(), k);
            }
        }
        final z08 x = z08.x;
        try {
            ri2.c.h(x, "RecentsRow", (String)null);
        }
        finally {
            final tqd l = uqd.l;
        }
        return zxi.a;
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)cyi.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final ayi ayi = (ayi)o;
        throw new UnsupportedOperationException("RecentsRow is decode-only (response envelope)");
    }
}
