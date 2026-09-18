import com.anthropic.claude.analytics.events.CodeEvents$ArtifactOpenDestination;
import com.anthropic.claude.artifact.frame.k;
import com.anthropic.claude.artifact.frame.CodeArtifactViewerParams;
import com.anthropic.claude.artifact.frame.ArtifactViewerTarget;
import com.anthropic.claude.analytics.events.CodeEvents$ArtifactOpenSource;
import com.anthropic.claude.artifact.frame.ArtifactOpenOrigin;
import com.anthropic.claude.artifact.frame.ArtifactLink;

public final class q65
{
    public final c51 a;
    public final zx0 b;
    public final lz4 c;
    public final boolean d;
    
    public q65(final c51 a, final zx0 b, final lz4 c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (b != null);
    }
    
    public final void a(final ArtifactLink artifactLink, final ArtifactOpenOrigin artifactOpenOrigin, final String s, final CodeEvents$ArtifactOpenSource codeEvents$ArtifactOpenSource) {
        final ArtifactViewerTarget artifactViewerTarget = new ArtifactViewerTarget(s, artifactLink);
        final CodeArtifactViewerParams value = new CodeArtifactViewerParams(artifactViewerTarget, artifactOpenOrigin, codeEvents$ArtifactOpenSource);
        final c51 a = this.a;
        a.getClass();
        final int a2 = k.a(artifactViewerTarget.a(), a.b);
        final int d = ge9.D(a2);
        CodeEvents$ArtifactOpenDestination codeEvents$ArtifactOpenDestination;
        if (d != 0) {
            if (d != 1) {
                en9.r();
                return;
            }
            codeEvents$ArtifactOpenDestination = CodeEvents$ArtifactOpenDestination.w;
        }
        else {
            codeEvents$ArtifactOpenDestination = CodeEvents$ArtifactOpenDestination.x;
        }
        final t5k a3 = a.a(value);
        if (a3 != null) {
            a3.L(codeEvents$ArtifactOpenDestination, d51.a(value));
        }
        if (a2 == 2) {
            a.h.setValue((Object)value);
        }
        final int d2 = ge9.D(a2);
        if (d2 == 0) {
            this.c.b((Object)artifactLink.a());
            return;
        }
        if (d2 == 1) {
            return;
        }
        en9.r();
    }
    
    public final void b(final String s, final ArtifactOpenOrigin artifactOpenOrigin, final String s2, final CodeEvents$ArtifactOpenSource codeEvents$ArtifactOpenSource) {
        final zx0 b = this.b;
        if (b == null) {
            return;
        }
        final w6j a = x01.a;
        this.a(new ArtifactLink(s, b, b.a()), artifactOpenOrigin, s2, codeEvents$ArtifactOpenSource);
    }
}
