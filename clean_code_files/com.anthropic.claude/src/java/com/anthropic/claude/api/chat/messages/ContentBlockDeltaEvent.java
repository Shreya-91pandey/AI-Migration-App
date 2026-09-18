package com.anthropic.claude.api.chat.messages;

@jzk
public final class ContentBlockDeltaEvent implements StreamEvent
{
    public static final pw6 Companion;
    public static final d2d[] c;
    public final int a = a;
    public final ContentBlockDelta b = b;
    
    static {
        Companion = (pw6)new Object();
        c = new d2d[] { null, ncq.F(2, (jta)new cm6((byte)12)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContentBlockDeltaEvent)) {
            return false;
        }
        final ContentBlockDeltaEvent contentBlockDeltaEvent = (ContentBlockDeltaEvent)o;
        return this.a == contentBlockDeltaEvent.a && mlc.q((Object)this.b, (Object)contentBlockDeltaEvent.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ContentBlockDeltaEvent(index=");
        sb.append(this.a);
        sb.append(", delta=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
