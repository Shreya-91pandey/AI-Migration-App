import kotlinx.serialization.encoding.Encoder;
import java.util.List;
import kotlinx.serialization.SerializationException;
import java.util.Map;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;

public abstract class ae9 implements KSerializer
{
    public final KSerializer a;
    public final Enum b;
    public final SerialDescriptor c;
    public boolean d;
    
    public ae9(final KSerializer a, final Enum b) {
        this.a = a;
        this.b = b;
        this.c = a.getDescriptor();
    }
    
    public boolean a() {
        return true;
    }
    
    public final Object deserialize(final Decoder decoder) {
        if (!decoder.t()) {
            return this.b;
        }
        try {
            return this.a.deserialize(decoder);
        }
        catch (final SerializationException ex) {
            final tqd l = uqd.l;
            if (this.a()) {
                final z08 v = z08.v;
                final String a = this.c.a();
                final String c = v4j.a((Class)ex.getClass()).c();
                try {
                    ri2.c.h(v, a, c);
                }
                finally {
                    final tqd i = uqd.l;
                }
            }
            else if (!this.d) {
                this.d = true;
                try {
                    final List a2 = adn.a;
                    final String a3 = this.c.a();
                    final Enum b = this.b;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(a3);
                    sb.append(": unrecognised value decoded as ");
                    sb.append((Object)b);
                    adn.e(6, sb.toString(), (String)null, (Map)null);
                }
                finally {
                    final tqd j = uqd.l;
                }
            }
            return this.b;
        }
    }
    
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        this.a.serialize(encoder, (Object)o);
    }
}
