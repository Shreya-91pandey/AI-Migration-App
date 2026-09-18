import java.time.format.DateTimeFormatter;

public abstract class lmc
{
    public static final DateTimeFormatter a;
    
    static {
        final DateTimeFormatter iso_INSTANT = DateTimeFormatter.ISO_INSTANT;
        iso_INSTANT.getClass();
        a = iso_INSTANT;
    }
}
