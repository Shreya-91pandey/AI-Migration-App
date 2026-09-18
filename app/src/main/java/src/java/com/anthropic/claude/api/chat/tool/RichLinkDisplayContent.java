package com.anthropic.claude.api.chat.tool;

@jzk
public final class RichLinkDisplayContent implements ToolDisplayContent
{
    public static final ksj Companion;
    public final RichItem a = a;
    public final Boolean b;
    
    static {
        Companion = (ksj)new Object();
    }
    
    public RichLinkDisplayContent(final RichItem a, final Boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RichLinkDisplayContent)) {
            return false;
        }
        final RichLinkDisplayContent richLinkDisplayContent = (RichLinkDisplayContent)o;
        return mlc.q((Object)this.a, (Object)richLinkDisplayContent.a) && mlc.q((Object)this.b, (Object)richLinkDisplayContent.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Boolean b = this.b;
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
        final StringBuilder sb = new StringBuilder("RichLinkDisplayContent(link=");
        sb.append((Object)this.a);
        sb.append(", is_trusted=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
