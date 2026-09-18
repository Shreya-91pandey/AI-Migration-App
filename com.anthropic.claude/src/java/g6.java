import com.anthropic.claude.api.account.AcceptLegalDocsRequest;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import com.anthropic.claude.api.account.CurrentAppealResponse;
import com.anthropic.claude.api.account.UpdateAccountRequest;
import com.anthropic.claude.api.account.AccountDeletableResponse;
import com.anthropic.claude.api.account.Account;
import kotlinx.serialization.KSerializer;

public final class g6 implements f6
{
    public final vi0 a;
    
    public g6(final vi0 a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final f07 f07) {
        return this.a.a(new lj0(1, "account").b(), (KSerializer)Account.Companion.serializer(), f07);
    }
    
    @Override
    public final Object b(final f07 f07) {
        return this.a.a(new lj0(1, "account/deletion-allowed").b(), (KSerializer)AccountDeletableResponse.Companion.serializer(), f07);
    }
    
    @Override
    public final Object c(final UpdateAccountRequest updateAccountRequest, final f07 f07) {
        final lj0 lj0 = new lj0(3, "account");
        lj0.d((Object)updateAccountRequest, (KSerializer)UpdateAccountRequest.Companion.serializer());
        return this.a.a(lj0.b(), (KSerializer)Account.Companion.serializer(), f07);
    }
    
    @Override
    public final Object d(final f07 f07) {
        return this.a.a(new lj0(1, "account/current_appeal").b(), (KSerializer)CurrentAppealResponse.Companion.serializer(), f07);
    }
    
    @Override
    public final Object e(final SendProductEmailLinkRequest sendProductEmailLinkRequest, final f07 f07) {
        final lj0 lj0 = new lj0(2, "account/send_product_email_link");
        lj0.d((Object)sendProductEmailLinkRequest, (KSerializer)SendProductEmailLinkRequest.Companion.serializer());
        return this.a.a(lj0.b(), (KSerializer)mqo.b, f07);
    }
    
    @Override
    public final Object f(final f07 f07) {
        return this.a.a(new lj0(5, "account").b(), (KSerializer)mqo.b, f07);
    }
    
    @Override
    public final Object g(final AccountSettings accountSettings, final f07 f07) {
        final lj0 lj0 = new lj0(4, "account/settings");
        lj0.d((Object)accountSettings, (KSerializer)AccountSettings.Companion.serializer());
        return this.a.a(lj0.b(), (KSerializer)mqo.b, f07);
    }
    
    @Override
    public final Object h(final f07 f07) {
        return this.a.a(new lj0(2, "account/grove_notice_viewed").b(), (KSerializer)mqo.b, f07);
    }
    
    @Override
    public final Object i(final AcceptLegalDocsRequest acceptLegalDocsRequest, final f07 f07) {
        final lj0 lj0 = new lj0(3, "account/accept_legal_docs");
        lj0.d((Object)acceptLegalDocsRequest, (KSerializer)AcceptLegalDocsRequest.Companion.serializer());
        return this.a.a(lj0.b(), (KSerializer)mqo.b, f07);
    }
}
