import com.anthropic.claude.artifact.frame.ArtifactOpenOrigin;
import com.anthropic.claude.artifact.frame.ArtifactLink;
import com.anthropic.claude.analytics.events.CodeEvents$CodeSurface;
import com.anthropic.claude.artifact.frame.ArtifactOpenOrigin$ExternalDeepLink;
import com.anthropic.claude.artifact.frame.ArtifactOpenOrigin$Gallery;
import com.anthropic.claude.artifact.frame.ArtifactOpenOrigin$SharedChat;
import com.anthropic.claude.artifact.frame.ArtifactOpenOrigin$Chat;
import com.anthropic.claude.types.strings.SessionId;
import com.anthropic.claude.artifact.frame.ArtifactOpenOrigin$InSession;
import com.anthropic.claude.artifact.frame.CodeArtifactViewerParams;

public final class c51
{
    public final z8b a;
    public final oi0 b;
    public final o8k c;
    public final s3p d;
    public final st4 e;
    public final jta f;
    public final jta g;
    public final ksg h;
    
    public c51(final z8b a, final oi0 b, final o8k c, final s3p d, final st4 e) {
        final a51 c2 = a51.C;
        final b51 c3 = b51.C;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (jta)c2;
        this.g = (jta)c3;
        this.h = o50.Q((Object)null);
    }
    
    public final t5k a(final CodeArtifactViewerParams codeArtifactViewerParams) {
        final ArtifactLink a = codeArtifactViewerParams.a.a();
        final ArtifactOpenOrigin b = codeArtifactViewerParams.b;
        final boolean b2 = b instanceof ArtifactOpenOrigin$InSession;
        final st4 e = this.e;
        if (b2) {
            final ArtifactOpenOrigin$InSession artifactOpenOrigin$InSession = (ArtifactOpenOrigin$InSession)b;
            final String a2 = artifactOpenOrigin$InSession.a();
            if (a2 != null) {
                SessionId sessionId = new SessionId(a2);
                if (!artifactOpenOrigin$InSession.b()) {
                    sessionId = null;
                }
                String a3;
                if (sessionId != null) {
                    a3 = sessionId.a;
                }
                else {
                    a3 = null;
                }
                if (a3 != null) {
                    return new t5k(e, a3, a, artifactOpenOrigin$InSession.getSurface(), d51.a(codeArtifactViewerParams));
                }
            }
            return null;
        }
        if (!(b instanceof ArtifactOpenOrigin$Chat) && !mlc.q((Object)b, (Object)ArtifactOpenOrigin$SharedChat.INSTANCE) && !(b instanceof ArtifactOpenOrigin$Gallery) && !mlc.q((Object)b, (Object)ArtifactOpenOrigin$ExternalDeepLink.INSTANCE)) {
            en9.r();
            return null;
        }
        return new t5k(e, (String)null, a, (CodeEvents$CodeSurface)null, d51.a(codeArtifactViewerParams));
    }
}
