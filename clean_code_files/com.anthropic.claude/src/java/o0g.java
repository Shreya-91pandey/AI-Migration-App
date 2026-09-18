import com.anthropic.claude.api.notification.TrackPushOpenRequest;
import java.util.List;
import com.anthropic.claude.api.notification.TestPushResponse;
import com.anthropic.claude.api.notification.TestPushRequest;
import com.anthropic.claude.api.notification.NotificationChannelSchema;
import com.anthropic.claude.api.notification.NotificationChannelUpdateParams;
import com.anthropic.claude.api.notification.NotificationPreferencesUpdateParams;
import com.anthropic.claude.api.notification.NotificationPreferencesSchema;
import com.anthropic.claude.api.result.ApiResult;

public interface o0g
{
    @tua("organizations/{organization_uuid}/notification/preferences")
    Object a(@gvg("organization_uuid") final String p0, @gmi("workspace_id") final String p1, final f07<? super ApiResult<NotificationPreferencesSchema>> p2);
    
    @omg("organizations/{organization_uuid}/notification/preferences")
    Object b(@gvg("organization_uuid") final String p0, @wg2 final NotificationPreferencesUpdateParams p1, @gmi("workspace_id") final String p2, final f07<? super ApiResult<NotificationPreferencesSchema>> p3);
    
    @pmg("organizations/{organization_uuid}/notification/channels")
    Object c(@gvg("organization_uuid") final String p0, @wg2 final NotificationChannelUpdateParams p1, @gmi("workspace_id") final String p2, final f07<? super ApiResult<NotificationChannelSchema>> p3);
    
    @pmg("organizations/{organization_uuid}/notification/debug/test_push")
    Object d(@gvg("organization_uuid") final String p0, @wg2 final TestPushRequest p1, final f07<? super ApiResult<TestPushResponse>> p2);
    
    @tua("organizations/{organization_uuid}/notification/channels")
    Object e(@gvg("organization_uuid") final String p0, @gmi("workspace_id") final String p1, final f07<? super ApiResult<? extends List<NotificationChannelSchema>>> p2);
    
    @pmg("organizations/{organization_uuid}/notification/push/track_open")
    Object f(@gvg("organization_uuid") final String p0, @wg2 final TrackPushOpenRequest p1, final f07<? super ApiResult<lqo>> p2);
}
