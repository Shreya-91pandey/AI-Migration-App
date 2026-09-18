import kotlinx.serialization.KSerializer;

public interface zzk
{
    void b(final rtc p0, final lta p1);
    
    void c(final rtc p0, final lta p1);
    
    default void e(final rtc rtc, final d07 d07) {
        this.f(rtc, (lta)new e0j((Object)d07, (byte)9));
    }
    
    void f(final rtc p0, final lta p1);
    
    void h(final rtc p0, final rtc p1, final KSerializer p2);
}
