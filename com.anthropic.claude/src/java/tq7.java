import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.Decoder;
import com.anthropic.claude.api.experience.ExperienceClientAction;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.KSerializer;

public final class tq7 implements KSerializer
{
    public static final tq7 a;
    public static final sq7 b;
    public static final SerialDescriptor c;
    
    static {
        a = (tq7)new Object();
        c = (b = (sq7)new wd9((KSerializer)new uv0(ExperienceClientAction.Companion.serializer(), (byte)0), (byte)1)).c;
    }
    
    public final Object deserialize(final Decoder decoder) {
        Object v;
        if ((v = tq7.b.deserialize(decoder)) == null) {
            v = r89.v;
        }
        return v;
    }
    
    public final SerialDescriptor getDescriptor() {
        return tq7.c;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        tq7.b.serialize(encoder, (Object)o);
    }
}
