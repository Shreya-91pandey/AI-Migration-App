package com.anthropic.claude.api.mcp;

@jzk
public final class McpResource
{
    public static final nle Companion;
    public final String a = a;
    public final String b = b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    
    static {
        Companion = (nle)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpResource)) {
            return false;
        }
        final McpResource mcpResource = (McpResource)o;
        return mlc.q((Object)this.a, (Object)mcpResource.a) && mlc.q((Object)this.b, (Object)mcpResource.b) && mlc.q((Object)this.c, (Object)mcpResource.c) && mlc.q((Object)this.d, (Object)mcpResource.d) && mlc.q((Object)this.e, (Object)mcpResource.e) && mlc.q((Object)this.f, (Object)mcpResource.f);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(this.a.hashCode() * 31, 31, this.b);
        int hashCode = 0;
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final String d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final Boolean f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return (((j + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("McpResource(name=", this.a, ", uri=", this.b, ", description=");
        oz1.A(t, this.c, ", displayName=", this.d, ", mimeType=");
        t.append(this.e);
        t.append(", hidden=");
        t.append((Object)this.f);
        t.append(")");
        return t.toString();
    }
}
