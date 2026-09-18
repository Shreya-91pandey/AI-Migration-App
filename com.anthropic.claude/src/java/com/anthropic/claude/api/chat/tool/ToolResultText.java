package com.anthropic.claude.api.chat.tool;

@jzk
public final class ToolResultText implements ToolResultContent
{
    public static final v7o Companion;
    public final String a = a;
    public final String b;
    
    static {
        Companion = (v7o)new Object();
    }
    
    public ToolResultText(final String a) {
        this.a = a;
        this.b = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ToolResultText)) {
            return false;
        }
        final ToolResultText toolResultText = (ToolResultText)o;
        return mlc.q((Object)this.a, (Object)toolResultText.a) && mlc.q((Object)this.b, (Object)toolResultText.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        return lmf.t("ToolResultText(text=", this.a, ", uuid=", this.b, ")");
    }
}
