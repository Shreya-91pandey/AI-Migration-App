import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;

public interface kl6
{
    void E(final boh p0, final int p1, final char p2);
    
    void H(final SerialDescriptor p0, final int p1, final double p2);
    
    default boolean L() {
        return true;
    }
    
    Encoder M(final boh p0, final int p1);
    
    void N(final SerialDescriptor p0, final int p1, final long p2);
    
    void g();
    
    void j(final SerialDescriptor p0, final int p1, final KSerializer p2, final Object p3);
    
    void m(final SerialDescriptor p0, final int p1, final float p2);
    
    void n(final int p0, final int p1, final SerialDescriptor p2);
    
    void q(final boh p0, final int p1, final byte p2);
    
    void u(final SerialDescriptor p0, final int p1, final boolean p2);
    
    void v(final SerialDescriptor p0, final int p1, final String p2);
    
    void w(final SerialDescriptor p0, final int p1, final KSerializer p2, final Object p3);
    
    void y(final boh p0, final int p1, final short p2);
}
