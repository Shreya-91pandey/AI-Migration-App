import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class ejc
{
    public static final Charset a;
    public static final byte[] b;
    
    static {
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        final byte[] b2 = new byte[0];
        ByteBuffer.wrap(b = b2);
        final b b3 = new b(b2, 0, 0, false);
        try {
            b3.e(0);
        }
        catch (final InvalidProtocolBufferException ex) {
            throw new IllegalArgumentException((Throwable)ex);
        }
    }
    
    public static void a(final Object o, final String s) {
        if (o != null) {
            return;
        }
        fvd.k(s);
    }
    
    public static int b(final long n) {
        return (int)(n ^ n >>> 32);
    }
}
