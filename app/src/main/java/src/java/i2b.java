import com.anthropic.claude.api.account.BootstrapResponse;

public final class i2b
{
    public final l7n a;
    public final nq b;
    
    public i2b(final f60 f60, final rt7 rt7, final xca xca, final jqc jqc, final wo8 wo8, final l7n a) {
        this.a = a;
        this.b = new nq(((e60)rt7).a().h("global_bootstrap"), "GlobalBootstrapCache", BootstrapResponse.Companion.serializer(), f60, xca, jqc, wo8, 256);
    }
}
