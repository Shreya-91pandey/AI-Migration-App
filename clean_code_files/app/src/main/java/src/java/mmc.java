import java.time.temporal.TemporalAccessor;
import java.time.ZoneOffset;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.format.DateTimeParseException;
import java.time.OffsetDateTime;
import java.time.Instant;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.KSerializer;

public final class mmc implements KSerializer
{
    public static final mmc a;
    public static final noh b;
    
    static {
        a = (mmc)new Object();
        b = ljq.n("Date", foh.s);
    }
    
    public final Object deserialize(final Decoder decoder) {
        final DateTimeFormatter a = lmc.a;
        final String p = decoder.p();
        Instant instant;
        try {
            instant = Instant.parse((CharSequence)p);
        }
        catch (final DateTimeParseException ex) {
            instant = OffsetDateTime.parse((CharSequence)p).toInstant();
        }
        final Date from = Date.from(instant);
        from.getClass();
        return from;
    }
    
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)mmc.b;
    }
    
    public final void serialize(final Encoder encoder, final Object o) {
        final String format = lmc.a.format((TemporalAccessor)((Date)o).toInstant().atOffset(ZoneOffset.UTC));
        format.getClass();
        encoder.O(format);
    }
}
