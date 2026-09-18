package com.anthropic.claude.api.mcp;

import java.util.List;

@jzk
public final class McpToolUiMeta
{
    public static final vne Companion;
    public static final d2d[] c;
    public final String a;
    public final List b;
    
    static {
        Companion = (vne)new Object();
        c = new d2d[] { null, ncq.F(2, (jta)new v0e((byte)13)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpToolUiMeta)) {
            return false;
        }
        final McpToolUiMeta mcpToolUiMeta = (McpToolUiMeta)o;
        return mlc.q((Object)this.a, (Object)mcpToolUiMeta.a) && mlc.q((Object)this.b, (Object)mcpToolUiMeta.b);
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
        final List b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return rua.i("McpToolUiMeta(resourceUri=", this.a, ", visibility=", this.b, ")");
    }
}
