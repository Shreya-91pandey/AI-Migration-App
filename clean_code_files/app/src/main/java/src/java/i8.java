import com.anthropic.claude.api.account.UpdateAccountProfileRequest;
import com.anthropic.claude.api.account.AccountProfile;
import com.anthropic.claude.api.account.AvatarImageResponse;
import com.anthropic.claude.api.result.ApiResult;

public interface i8
{
    @mkf
    @pmg("account_avatar_image")
    Object a(@hug final okf p0, final f07<? super ApiResult<AvatarImageResponse>> p1);
    
    @tua("account_profile")
    Object b(final f07<? super ApiResult<AccountProfile>> p0);
    
    @it7("account_avatar_image")
    Object c(final f07<? super ApiResult<lqo>> p0);
    
    @smg("account_profile")
    Object d(@wg2 final UpdateAccountProfileRequest p0, final f07<? super ApiResult<AccountProfile>> p1);
}
