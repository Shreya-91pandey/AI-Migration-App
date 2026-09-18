package com.anthropic.claude.api.chat.messages;

@jzk
public final class MessageDeltaEvent implements StreamEvent
{
    public static final c3f Companion;
    public final MessageDelta a;
    
    static {
        Companion = (c3f)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof MessageDeltaEvent && mlc.q((Object)this.a, (Object)((MessageDeltaEvent)o).a));
    }
    
    @Override
    public final int hashCode() {
        final MessageDelta a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MessageDeltaEvent(delta=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
