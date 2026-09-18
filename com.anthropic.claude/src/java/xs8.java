import kotlinx.serialization.KSerializer;

public final class xs8 implements icb, zzk, vof
{
    public boolean v;
    
    public xs8(final boolean v) {
        this.v = v;
    }
    
    @Override
    public boolean a(final xzl xzl) {
        return this.v;
    }
    
    @Override
    public void b(final rtc rtc, final lta lta) {
    }
    
    @Override
    public void c(final rtc rtc, final lta lta) {
    }
    
    @Override
    public boolean d() {
        return this.v;
    }
    
    @Override
    public void f(final rtc rtc, final lta lta) {
    }
    
    @Override
    public boolean g() {
        return this.v;
    }
    
    @Override
    public void h(final rtc rtc, final rtc rtc2, final KSerializer kSerializer) {
        final o50 b = kSerializer.getDescriptor().b();
        if (!(b instanceof mfh) && !mlc.q((Object)b, (Object)hzk.k)) {
            if (this.v) {
                if (mlc.q((Object)b, (Object)xym.l) || mlc.q((Object)b, (Object)xym.m) || b instanceof foh || b instanceof izk) {
                    en9.m("Serializer for ", ((us4)rtc2).c(), " of kind ", b, " cannot be serialized polymorphically with class discriminator.");
                }
            }
            return;
        }
        en9.m("Serializer for ", ((us4)rtc2).c(), " can't be registered as a subclass for polymorphic serialization because its kind ", b, " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }
}
