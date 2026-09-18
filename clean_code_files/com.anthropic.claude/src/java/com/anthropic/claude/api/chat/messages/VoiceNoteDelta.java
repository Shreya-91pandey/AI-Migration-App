package com.anthropic.claude.api.chat.messages;

@jzk
public final class VoiceNoteDelta implements ContentBlockDelta
{
    public static final qnp Companion;
    public final String a = a;
    
    static {
        Companion = (qnp)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof VoiceNoteDelta && mlc.q((Object)this.a, (Object)((VoiceNoteDelta)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("VoiceNoteDelta(partial_text=", this.a, ")");
    }
}
