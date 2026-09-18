import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.api.login.SendMagicLinkResponse;
import com.anthropic.claude.api.login.SendMagicLinkRequest;
import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.login.VerifyGoogleMobileRequest;

public interface qrd
{
    @pmg("auth/verify_google_mobile")
    Object a(@wg2 final VerifyGoogleMobileRequest p0, final f07<? super ApiResult<VerifyResponse>> p1);
    
    @pmg("auth/send_magic_link")
    Object b(@wg2 final SendMagicLinkRequest p0, final f07<? super ApiResult<SendMagicLinkResponse>> p1);
    
    @tua("enterprise_auth/sso_callback")
    Object c(@gmi("code") final String p0, @gmi("state") final String p1, final f07<? super ApiResult<VerifyResponse>> p2);
    
    @pmg("auth/verify_magic_link")
    Object d(@wg2 final VerifyMagicLinkRequest p0, final f07<? super ApiResult<VerifyResponse>> p1);
}
