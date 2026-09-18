package com.anthropic.claude.api.chat.messages;

@jzk
public final class ContentBlockRetractEvent implements StreamEvent
{
    public static final tw6 Companion;
    public final Integer a;
    
    static {
        Companion = (tw6)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ContentBlockRetractEvent && mlc.q((Object)this.a, (Object)((ContentBlockRetractEvent)o).a));
    }
    
    @Override
    public final int hashCode() {
        final Integer a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ContentBlockRetractEvent(from_index=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
