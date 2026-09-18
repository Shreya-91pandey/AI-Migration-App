import com.anthropic.claude.api.referral.ReferralEligibility;
import com.anthropic.claude.api.result.ApiResult;

public interface f4j
{
    @tua("organizations/{organization}/referral/eligibility")
    Object a(@gvg("organization") final String p0, final f07<? super ApiResult<ReferralEligibility>> p1);
}
