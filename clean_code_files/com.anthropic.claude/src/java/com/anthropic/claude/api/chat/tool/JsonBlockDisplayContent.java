package com.anthropic.claude.api.chat.tool;

@jzk
public final class JsonBlockDisplayContent implements ToolDisplayContent
{
    public static final uqc Companion;
    public final String a = a;
    
    static {
        Companion = (uqc)new Object();
    }
    
    public JsonBlockDisplayContent(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof JsonBlockDisplayContent && mlc.q((Object)this.a, (Object)((JsonBlockDisplayContent)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("JsonBlockDisplayContent(json_block=", this.a, ")");
    }
}
