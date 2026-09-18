package com.anthropic.claude.api.chat.messages;

@jzk
public final class ContentBlockStartEvent implements StreamEvent
{
    public static final vw6 Companion;
    public static final d2d[] c;
    public final int a = a;
    public final ContentBlock b = b;
    
    static {
        Companion = (vw6)new Object();
        c = new d2d[] { null, ncq.F(2, (jta)new cm6((byte)13)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContentBlockStartEvent)) {
            return false;
        }
        final ContentBlockStartEvent contentBlockStartEvent = (ContentBlockStartEvent)o;
        return this.a == contentBlockStartEvent.a && mlc.q((Object)this.b, (Object)contentBlockStartEvent.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ContentBlockStartEvent(index=");
        sb.append(this.a);
        sb.append(", content_block=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
