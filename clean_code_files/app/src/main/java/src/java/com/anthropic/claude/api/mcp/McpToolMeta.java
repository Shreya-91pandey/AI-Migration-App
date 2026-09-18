package com.anthropic.claude.api.mcp;

@jzk
public final class McpToolMeta
{
    public static final one Companion;
    public final McpToolUiMeta a;
    public final String b;
    
    static {
        Companion = (one)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpToolMeta)) {
            return false;
        }
        final McpToolMeta mcpToolMeta = (McpToolMeta)o;
        return mlc.q((Object)this.a, (Object)mcpToolMeta.a) && mlc.q((Object)this.b, (Object)mcpToolMeta.b);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final McpToolUiMeta a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("McpToolMeta(ui=");
        sb.append((Object)this.a);
        sb.append(", uiResourceUri=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
