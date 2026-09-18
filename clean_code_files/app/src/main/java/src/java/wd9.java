import kotlinx.serialization.encoding.Encoder;
import com.anthropic.claude.api.Iso8601ParseException;
import java.time.format.DateTimeParseException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.encoding.Decoder;
import com.anthropic.claude.sessions.types.SdkUnknownMessage;
import com.anthropic.claude.sessions.types.SdkNonAssistantMessage;
import com.anthropic.claude.sessions.types.SdkAssistantMessage;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;

public abstract class wd9 implements KSerializer
{
    public final byte a;
    public final Object b;
    public final SerialDescriptor c;
    
    public wd9(final KSerializer kSerializer, final byte a) {
        switch (this.a = a) {
            default: {
                this.b = kSerializer;
                this.c = kSerializer.getDescriptor();
                return;
            }
            case 1: {
                this.b = kSerializer;
                Object descriptor = kSerializer.getDescriptor();
                if (!((SerialDescriptor)descriptor).d()) {
                    descriptor = new dzk((SerialDescriptor)descriptor);
                }
                this.c = (SerialDescriptor)descriptor;
            }
        }
    }
    
    public wd9(final us4 b) {
        this.a = 2;
        this.b = b;
        final StringBuilder sb = new StringBuilder("JsonContentPolymorphicSerializer<");
        sb.append(b.c());
        sb.append('>');
        this.c = (SerialDescriptor)ljq.q(sb.toString(), (o50)lfh.k, new SerialDescriptor[0]);
    }
    
    public void a(final Exception ex, final String s) {
        final tqd l = uqd.l;
        final z08 y = z08.y;
        final String c = v4j.a((Class)ex.getClass()).c();
        try {
            ri2.c.h(y, s, c);
        }
        finally {
            final tqd i = uqd.l;
        }
    }
    
    public KSerializer b(JsonElement jsonElement) {
        jsonElement = (JsonElement)jrc.i(jsonElement).get((Object)"role");
        String a;
        if (jsonElement != null) {
            a = jrc.j(jsonElement).a();
        }
        else {
            a = null;
        }
        KSerializer kSerializer;
        if (mlc.q((Object)a, (Object)"assistant")) {
            kSerializer = SdkAssistantMessage.Companion.serializer();
        }
        else if (mlc.q((Object)a, (Object)"user")) {
            kSerializer = SdkNonAssistantMessage.Companion.serializer();
        }
        else {
            kSerializer = SdkUnknownMessage.Companion.serializer();
        }
        return kSerializer;
    }
    
    public Object deserialize(final Decoder decoder) {
        final byte a = this.a;
        final Object o = null;
        final Object o2 = null;
        switch (a) {
            default: {
                final grc g = rml.g(decoder);
                final JsonElement k = g.k();
                final KSerializer b = this.b(k);
                b.getClass();
                return g.c().a((KSerializer)b, k);
            }
            case 1: {
                final KSerializer kSerializer = (KSerializer)this.b;
                grc grc;
                if (decoder instanceof grc) {
                    grc = (grc)decoder;
                }
                else {
                    grc = null;
                }
                Object o3;
                if (grc == null) {
                    o3 = decoder.v((KSerializer)kSerializer);
                }
                else {
                    final JsonElement i = grc.k();
                    if (i instanceof JsonNull) {
                        o3 = o2;
                    }
                    else if (kSerializer.getDescriptor().b() instanceof foh && !(i instanceof JsonPrimitive)) {
                        this.a((Exception)new IllegalArgumentException("structured element for primitive-kind target"), kSerializer.getDescriptor().a());
                        o3 = o2;
                    }
                    else {
                        Label_0290: {
                            try {
                                o3 = grc.c().a((KSerializer)kSerializer, i);
                                return o3;
                            }
                            catch (final Exception ex) {
                                goto Label_0238;
                            }
                            catch (final IllegalArgumentException ex2) {}
                            catch (final SerializationException ex3) {
                                break Label_0290;
                            }
                            catch (final DateTimeParseException ex4) {
                                throw ex4;
                            }
                            catch (final Iso8601ParseException ex5) {
                                throw ex5;
                            }
                            final IllegalArgumentException ex2;
                            this.a((Exception)ex2, kSerializer.getDescriptor().a());
                            o3 = o2;
                            return o3;
                        }
                        final SerializationException ex3;
                        this.a((Exception)ex3, kSerializer.getDescriptor().a());
                        o3 = o2;
                    }
                }
                return o3;
            }
            case 0: {
                Object o4 = o;
                if (decoder.t()) {
                    try {
                        o4 = ((KSerializer)this.b).deserialize(decoder);
                    }
                    catch (final SerializationException ex6) {
                        final tqd l = uqd.l;
                        final z08 w = z08.w;
                        final String a2 = this.c.a();
                        final String c = v4j.a((Class)ex6.getClass()).c();
                        try {
                            ri2.c.h(w, a2, c);
                        }
                        finally {
                            final tqd j = uqd.l;
                            o4 = o;
                        }
                    }
                }
                return o4;
            }
        }
    }
    
    public final SerialDescriptor getDescriptor() {
        final byte a = this.a;
        Object c;
        final SerialDescriptor serialDescriptor = (SerialDescriptor)(c = this.c);
        switch (a) {
            default: {
                c = serialDescriptor;
                return (SerialDescriptor)c;
            }
            case 0:
            case 1: {
                return (SerialDescriptor)c;
            }
        }
    }
    
    public final void serialize(final Encoder encoder, Object o) {
        final byte a = this.a;
        final Object b = this.b;
        switch (a) {
            default: {
                final vee a2 = encoder.a();
                final us4 us4 = (us4)b;
                KSerializer x;
                if ((x = a2.x((rtc)us4, o)) == null) {
                    final KSerializer u = yi2.U((rtc)v4j.a((Class)o.getClass()));
                    if (u == null) {
                        final us4 a3 = v4j.a((Class)o.getClass());
                        String s;
                        if ((s = a3.c()) == null) {
                            s = String.valueOf((Object)a3);
                        }
                        o = new StringBuilder("in the scope of '");
                        ((StringBuilder)o).append(us4.c());
                        ((StringBuilder)o).append('\'');
                        throw new IllegalArgumentException(lmf.t("Class '", s, "' is not registered for polymorphic serialization ", ((StringBuilder)o).toString(), ".\nMark the base class as 'sealed' or register the serializer explicitly."));
                    }
                    x = u;
                }
                x.serialize(encoder, o);
                return;
            }
            case 1: {
                if (o == null) {
                    encoder.f();
                }
                else {
                    encoder.K(o, (KSerializer)b);
                }
                return;
            }
            case 0: {
                final Enum enum1 = (Enum)o;
                final KSerializer kSerializer = (KSerializer)b;
                enum1.getClass();
                kSerializer.serialize(encoder, (Object)enum1);
            }
        }
    }
}
