package com.anthropic.claude.api.chat.messages;

@jzk
public final class ContentBlockStopEvent implements StreamEvent
{
    public static final zw6 Companion;
    public final int a = a;
    public final hfc b = b;
    public final String c;
    public final Boolean d;
    public final Boolean e;
    
    static {
        Companion = (zw6)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContentBlockStopEvent)) {
            return false;
        }
        final ContentBlockStopEvent contentBlockStopEvent = (ContentBlockStopEvent)o;
        return this.a == contentBlockStopEvent.a && mlc.q((Object)this.b, (Object)contentBlockStopEvent.b) && mlc.q((Object)this.c, (Object)contentBlockStopEvent.c) && mlc.q((Object)this.d, (Object)contentBlockStopEvent.d) && mlc.q((Object)this.e, (Object)contentBlockStopEvent.e);
    }
    
    @Override
    public final int hashCode() {
        final int e = t.e(Integer.hashCode(this.a) * 31, 31, this.b);
        int hashCode = 0;
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final Boolean d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final Boolean e2 = this.e;
        if (e2 != null) {
            hashCode = e2.hashCode();
        }
        return ((e + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ContentBlockStopEvent(index=");
        sb.append(this.a);
        sb.append(", stop_timestamp=");
        sb.append((Object)this.b);
        sb.append(", disposition=");
        sb.append(this.c);
        sb.append(", collapsible=");
        sb.append((Object)this.d);
        sb.append(", summary_pending=");
        return xc2.j(sb, this.e, ")");
    }
}
