import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.privacyconsents.UpsertConsentRequest;

public final class bph implements aph
{
    public final vi0 a;
    
    public bph(final vi0 a) {
        this.a = a;
    }
    
    public final Object a(final String s, final UpsertConsentRequest upsertConsentRequest, final h07 h07) {
        final lj0 lj0 = new lj0(3, "/v1/privacy-consents");
        lj0.c("x-organization-uuid", s);
        lj0.d((Object)upsertConsentRequest, (KSerializer)UpsertConsentRequest.Companion.serializer());
        return this.a.a(lj0.b(), (KSerializer)mqo.b, (f07)h07);
    }
}
