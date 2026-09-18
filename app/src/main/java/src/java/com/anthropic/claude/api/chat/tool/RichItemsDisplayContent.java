package com.anthropic.claude.api.chat.tool;

import java.util.List;

@jzk
public final class RichItemsDisplayContent implements ToolDisplayContent
{
    public static final isj Companion;
    public static final d2d[] c;
    public final List a;
    public final Boolean b;
    
    static {
        Companion = (isj)new Object();
        c = new d2d[] { ncq.F(2, (jta)new lih((byte)27)), null };
    }
    
    public RichItemsDisplayContent(final List a, final Boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RichItemsDisplayContent)) {
            return false;
        }
        final RichItemsDisplayContent richItemsDisplayContent = (RichItemsDisplayContent)o;
        return mlc.q((Object)this.a, (Object)richItemsDisplayContent.a) && mlc.q((Object)this.b, (Object)richItemsDisplayContent.b);
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
        final StringBuilder sb = new StringBuilder("RichItemsDisplayContent(content=");
        sb.append((Object)this.a);
        sb.append(", is_trusted=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
