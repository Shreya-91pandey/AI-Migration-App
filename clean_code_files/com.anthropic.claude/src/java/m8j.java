import com.anthropic.claude.api.experience.RemoteActionResponse;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.experience.RemoteActionRequest;

public final class m8j implements l8j
{
    public final vi0 a;
    
    public m8j(final vi0 a) {
        this.a = a;
    }
    
    public final Object a(final String s, final RemoteActionRequest remoteActionRequest, final m6n m6n) {
        final lj0 p3 = lmf.p(2, "organizations/{organization}/remote_action", "organization", s);
        p3.d((Object)remoteActionRequest, (KSerializer)RemoteActionRequest.Companion.serializer());
        return this.a.a(p3.b(), (KSerializer)RemoteActionResponse.Companion.serializer(), (f07)m6n);
    }
}
