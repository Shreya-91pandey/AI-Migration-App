import com.anthropic.claude.types.strings.SessionId;
import com.anthropic.claude.sessions.types.SessionResource;

public final class b3l
{
    public final he3 a;
    
    public b3l() {
        this.a = new he3();
    }
    
    public final void a(final SessionResource sessionResource, final String s) {
        final SessionId sessionId = new SessionId(s);
        final he3 a = this.a;
        final a3l a3l = (a3l)((lyd)a).c((Object)sessionId);
        final SessionId sessionId2 = new SessionId(s);
        a3l a2;
        if (a3l != null) {
            a2 = a3l.a(a3l, sessionResource);
        }
        else {
            a2 = new a3l(sessionResource);
        }
        ((lyd)a).d((Object)sessionId2, (Object)a2);
    }
}
