import com.anthropic.claude.api.usage.OverageSpendLimitUpdateRequest;
import com.anthropic.claude.api.usage.OverageSpendLimitResponse;
import com.anthropic.claude.api.usage.UpdateSpendLimitRequest;
import com.anthropic.claude.api.usage.UsageResponse;
import kotlinx.serialization.KSerializer;

public final class hzo implements gzo
{
    public final vi0 a;
    
    public hzo(final vi0 a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final String s, final m6n m6n) {
        return this.a.a(oz1.e(1, "organizations/{orgId}/usage", "orgId", s), (KSerializer)UsageResponse.Companion.serializer(), (f07)m6n);
    }
    
    @Override
    public final Object b(final String s, final UpdateSpendLimitRequest updateSpendLimitRequest, final mdl mdl) {
        final lj0 p3 = lmf.p(3, "organizations/{orgId}/overage_spend_limit", "orgId", s);
        p3.d((Object)updateSpendLimitRequest, (KSerializer)UpdateSpendLimitRequest.Companion.serializer());
        return this.a.a(p3.b(), (KSerializer)OverageSpendLimitResponse.Companion.serializer(), (f07)mdl);
    }
    
    @Override
    public final Object c(final String s, final OverageSpendLimitUpdateRequest overageSpendLimitUpdateRequest, final g16 g16) {
        final lj0 p3 = lmf.p(3, "organizations/{orgId}/overage_spend_limit", "orgId", s);
        p3.d((Object)overageSpendLimitUpdateRequest, (KSerializer)OverageSpendLimitUpdateRequest.Companion.serializer());
        return this.a.a(p3.b(), (KSerializer)OverageSpendLimitResponse.Companion.serializer(), (f07)g16);
    }
}
