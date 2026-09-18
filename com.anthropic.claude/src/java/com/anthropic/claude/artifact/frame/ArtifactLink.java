package com.anthropic.claude.artifact.frame;

import com.anthropic.claude.types.strings.CodeArtifactId;

@jzk(with = w01.class)
public final class ArtifactLink
{
    public static final u01 Companion;
    public final String a;
    public final zx0 b;
    public final String c;
    
    static {
        Companion = new u01();
    }
    
    public ArtifactLink(final String a, final zx0 b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final String a() {
        return lmf.s("https://", this.c, "/code/artifact/", this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArtifactLink)) {
            return false;
        }
        final ArtifactLink artifactLink = (ArtifactLink)o;
        return CodeArtifactId.b(this.a, artifactLink.a) && this.b == artifactLink.b && mlc.q((Object)this.c, (Object)artifactLink.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + CodeArtifactId.c(this.a) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final l65 companion = CodeArtifactId.Companion;
        final StringBuilder sb = new StringBuilder("ArtifactLink(id=\u2588\u2588, env=");
        sb.append((Object)this.b);
        sb.append(", viewerHost=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
