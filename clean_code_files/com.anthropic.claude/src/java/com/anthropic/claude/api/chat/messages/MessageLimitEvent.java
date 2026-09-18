package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.common.RateLimit;

@jzk
public final class MessageLimitEvent implements StreamEvent
{
    public static final y5f Companion;
    public final RateLimit a = a;
    
    static {
        Companion = (y5f)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof MessageLimitEvent && mlc.q((Object)this.a, (Object)((MessageLimitEvent)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MessageLimitEvent(message_limit=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
