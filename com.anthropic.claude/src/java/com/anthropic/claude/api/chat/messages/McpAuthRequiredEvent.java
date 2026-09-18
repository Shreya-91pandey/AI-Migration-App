package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.ToolUseId;

@jzk
public final class McpAuthRequiredEvent implements StreamEvent
{
    public static final wfe Companion;
    public final String a = a;
    public final String b = b;
    
    static {
        Companion = (wfe)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpAuthRequiredEvent)) {
            return false;
        }
        final McpAuthRequiredEvent mcpAuthRequiredEvent = (McpAuthRequiredEvent)o;
        return mlc.q((Object)this.a, (Object)mcpAuthRequiredEvent.a) && ToolUseId.b(this.b, mcpAuthRequiredEvent.b);
    }
    
    @Override
    public final int hashCode() {
        return ToolUseId.c(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return lmf.t("McpAuthRequiredEvent(server_id=", McpServerId.a(this.a), ", tool_use_id=", ToolUseId.d(this.b), ")");
    }
}
