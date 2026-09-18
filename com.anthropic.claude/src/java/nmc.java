import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

public final class nmc implements KSerializer
{
    public static final nmc a;
    public static final noh b;
    
    static {
        a = (nmc)new Object();
        b = ljq.n("com.anthropic.claude.api.Iso8601Instant", foh.s);
    }
    
    public final Object deserialize(final Decoder decoder) {
        final String p = decoder.p();
        try {
            final hfc x = hfc.x;
            return o55.v(o55.y(p).h());
        }
        catch (final IllegalArgumentException ex) {
            throw new RuntimeException("Malformed ISO 8601 timestamp");
        }
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)nmc.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final hfc hfc = (hfc)o;
        final hfc x = hfc.x;
        encoder.O(o55.v(hfc.h()).toString());
    }
}
