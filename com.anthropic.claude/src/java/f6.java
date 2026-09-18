import com.anthropic.claude.api.account.AcceptLegalDocsRequest;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import com.anthropic.claude.api.account.CurrentAppealResponse;
import com.anthropic.claude.api.account.UpdateAccountRequest;
import com.anthropic.claude.api.account.AccountDeletableResponse;
import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.result.ApiResult;

public interface f6
{
    @tua("account")
    Object a(final f07<? super ApiResult<Account>> p0);
    
    @tua("account/deletion-allowed")
    Object b(final f07<? super ApiResult<AccountDeletableResponse>> p0);
    
    @smg("account")
    Object c(@wg2 final UpdateAccountRequest p0, final f07<? super ApiResult<Account>> p1);
    
    @tua("account/current_appeal")
    Object d(final f07<? super ApiResult<CurrentAppealResponse>> p0);
    
    @pmg("account/send_product_email_link")
    Object e(@wg2 final SendProductEmailLinkRequest p0, final f07<? super ApiResult<lqo>> p1);
    
    @it7("account")
    Object f(final f07<? super ApiResult<lqo>> p0);
    
    @omg("account/settings")
    Object g(@wg2 final AccountSettings p0, final f07<? super ApiResult<lqo>> p1);
    
    @pmg("account/grove_notice_viewed")
    Object h(final f07<? super ApiResult<lqo>> p0);
    
    @smg("account/accept_legal_docs")
    Object i(@wg2 final AcceptLegalDocsRequest p0, final f07<? super ApiResult<lqo>> p1);
}
