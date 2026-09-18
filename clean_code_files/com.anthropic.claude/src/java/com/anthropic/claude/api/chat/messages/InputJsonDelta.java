package com.anthropic.claude.api.chat.messages;

@jzk
public final class InputJsonDelta implements ContentBlockDelta
{
    public static final tcc Companion;
    public final String a = a;
    
    static {
        Companion = (tcc)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof InputJsonDelta && mlc.q((Object)this.a, (Object)((InputJsonDelta)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("InputJsonDelta(partial_json=", this.a, ")");
    }
}
