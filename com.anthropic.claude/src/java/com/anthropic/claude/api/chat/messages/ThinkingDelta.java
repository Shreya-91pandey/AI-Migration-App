package com.anthropic.claude.api.chat.messages;

@jzk
public final class ThinkingDelta implements ContentBlockDelta
{
    public static final uon Companion;
    public final String a = a;
    
    static {
        Companion = (uon)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ThinkingDelta && mlc.q((Object)this.a, (Object)((ThinkingDelta)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("ThinkingDelta(thinking=", this.a, ")");
    }
}
