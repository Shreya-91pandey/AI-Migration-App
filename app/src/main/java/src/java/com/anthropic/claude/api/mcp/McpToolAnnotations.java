package com.anthropic.claude.api.mcp;

@jzk
public final class McpToolAnnotations
{
    public static final bne Companion;
    public final String a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    
    static {
        Companion = (bne)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpToolAnnotations)) {
            return false;
        }
        final McpToolAnnotations mcpToolAnnotations = (McpToolAnnotations)o;
        return mlc.q((Object)this.a, (Object)mcpToolAnnotations.a) && mlc.q((Object)this.b, (Object)mcpToolAnnotations.b) && mlc.q((Object)this.c, (Object)mcpToolAnnotations.c) && mlc.q((Object)this.d, (Object)mcpToolAnnotations.d) && mlc.q((Object)this.e, (Object)mcpToolAnnotations.e);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final String a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Boolean c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Boolean e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("McpToolAnnotations(title=");
        sb.append(this.a);
        sb.append(", readOnlyHint=");
        sb.append((Object)this.b);
        sb.append(", destructiveHint=");
        ju4.h(sb, this.c, ", idempotentHint=", this.d, ", openWorldHint=");
        return xc2.j(sb, this.e, ")");
    }
}
