package com.anthropic.claude.api.chat.messages;

@jzk
public final class ThinkingSummaryDelta implements ContentBlockDelta
{
    public static final wpn Companion;
    public final ThinkingSummary a = a;
    
    static {
        Companion = (wpn)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ThinkingSummaryDelta && mlc.q((Object)this.a, (Object)((ThinkingSummaryDelta)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ThinkingSummaryDelta(summary=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
