import com.anthropic.claude.api.purchase.AndroidIapUsageCreditProductsResponse;
import kotlinx.serialization.KSerializer;

public final class szb implements rzb
{
    public final vi0 a;
    
    public szb(final vi0 a) {
        this.a = a;
    }
    
    public final Object a(final String s, final String s2, final ho7 ho7) {
        final lj0 p3 = lmf.p(1, "organizations/{organization_uuid}/prepaid/iap/android", "organization_uuid", s);
        p3.h("storefront", s2);
        return this.a.a(p3.b(), (KSerializer)AndroidIapUsageCreditProductsResponse.Companion.serializer(), (f07)ho7);
    }
}
