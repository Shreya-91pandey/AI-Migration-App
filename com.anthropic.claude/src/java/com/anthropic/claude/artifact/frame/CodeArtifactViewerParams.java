package com.anthropic.claude.artifact.frame;

import com.anthropic.claude.analytics.events.CodeEvents$ArtifactOpenSource;

@jzk
public final class CodeArtifactViewerParams
{
    public static final x65 Companion;
    public static final d2d[] d;
    public final ArtifactViewerTarget a = a;
    public final ArtifactOpenOrigin b = b;
    public final CodeEvents$ArtifactOpenSource c;
    
    static {
        Companion = new x65();
        d = new d2d[] { null, ncq.F(2, (jta)new y15((byte)25)), ncq.F(2, (jta)new y15((byte)26)) };
    }
    
    public CodeArtifactViewerParams(final ArtifactViewerTarget a, final ArtifactOpenOrigin b, final CodeEvents$ArtifactOpenSource c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CodeArtifactViewerParams)) {
            return false;
        }
        final CodeArtifactViewerParams codeArtifactViewerParams = (CodeArtifactViewerParams)o;
        return mlc.q((Object)this.a, (Object)codeArtifactViewerParams.a) && mlc.q((Object)this.b, (Object)codeArtifactViewerParams.b) && this.c == codeArtifactViewerParams.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final CodeEvents$ArtifactOpenSource c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CodeArtifactViewerParams(target=");
        sb.append((Object)this.a);
        sb.append(", origin=");
        sb.append((Object)this.b);
        sb.append(", entrySource=");
        sb.append((Object)this.c);
        sb.append(")");
        return sb.toString();
    }
}
