import com.anthropic.claude.api.verification.SendPhoneVerificationCodeResponse;
import com.anthropic.claude.api.verification.SendPhoneVerificationCodeRequest;
import com.anthropic.claude.api.common.EmptyResponseWithSuccess;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.verification.VerifyPhoneVerificationCodeRequest;

public final class g7h implements f7h
{
    public final vi0 a;
    
    public g7h(final vi0 a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final VerifyPhoneVerificationCodeRequest verifyPhoneVerificationCodeRequest, final f07 f07) {
        final lj0 lj0 = new lj0(2, "auth/verify_phone_code");
        lj0.d((Object)verifyPhoneVerificationCodeRequest, (KSerializer)VerifyPhoneVerificationCodeRequest.Companion.serializer());
        return this.a.a(lj0.b(), (KSerializer)EmptyResponseWithSuccess.Companion.serializer(), f07);
    }
    
    @Override
    public final Object b(final SendPhoneVerificationCodeRequest sendPhoneVerificationCodeRequest, final f07 f07) {
        final lj0 lj0 = new lj0(2, "auth/send_phone_code");
        lj0.d((Object)sendPhoneVerificationCodeRequest, (KSerializer)SendPhoneVerificationCodeRequest.Companion.serializer());
        return this.a.a(lj0.b(), (KSerializer)SendPhoneVerificationCodeResponse.Companion.serializer(), f07);
    }
}
