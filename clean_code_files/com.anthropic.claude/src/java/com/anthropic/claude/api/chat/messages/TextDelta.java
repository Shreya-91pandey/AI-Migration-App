package com.anthropic.claude.api.chat.messages;

@jzk
public final class TextDelta implements ContentBlockDelta
{
    public static final zgn Companion;
    public final String a = a;
    
    static {
        Companion = (zgn)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof TextDelta && mlc.q((Object)this.a, (Object)((TextDelta)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("TextDelta(text=", this.a, ")");
    }
}
