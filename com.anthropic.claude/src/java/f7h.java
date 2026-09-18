import com.anthropic.claude.api.verification.SendPhoneVerificationCodeResponse;
import com.anthropic.claude.api.verification.SendPhoneVerificationCodeRequest;
import com.anthropic.claude.api.common.EmptyResponseWithSuccess;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.verification.VerifyPhoneVerificationCodeRequest;

public interface f7h
{
    @pmg("auth/verify_phone_code")
    Object a(@wg2 final VerifyPhoneVerificationCodeRequest p0, final f07<? super ApiResult<EmptyResponseWithSuccess>> p1);
    
    @pmg("auth/send_phone_code")
    Object b(@wg2 final SendPhoneVerificationCodeRequest p0, final f07<? super ApiResult<SendPhoneVerificationCodeResponse>> p1);
}
