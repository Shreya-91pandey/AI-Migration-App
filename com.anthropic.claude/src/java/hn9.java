import com.anthropic.claude.api.events.BatchEventLoggingResponse;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.events.BatchEventLoggingRequest;

public interface hn9
{
    @edb({ "x-service-name: claude-android" })
    @pmg("event_logging/v2/batch")
    Object a(@zcb("x-organization-uuid") final String p0, @wg2 final BatchEventLoggingRequest p1, final f07<? super ApiResult<BatchEventLoggingResponse>> p2);
    
    @edb({ "x-service-name: claude-android" })
    @pmg("event_logging/v2/batch")
    Object b(@wg2 final BatchEventLoggingRequest p0, final f07<? super ApiResult<BatchEventLoggingResponse>> p1);
}
