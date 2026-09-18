import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.api.result.ApiResult;

public interface wfg
{
    @tua("bootstrap/{organizationUuid}/app_start")
    Object a(@gvg("organizationUuid") final String p0, @gmi("growthbook_format") final String p1, @gmi("include_system_prompts") final boolean p2, final f07<? super ApiResult<AppStartResponse>> p3);
}
