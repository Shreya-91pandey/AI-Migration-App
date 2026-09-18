package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.types.strings.MessageId;

@jzk
public final class MessageStartEvent implements StreamEvent
{
    public static final v7f Companion;
    public final CompletionMessage a = a;
    public final String b;
    
    static {
        Companion = (v7f)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageStartEvent)) {
            return false;
        }
        final MessageStartEvent messageStartEvent = (MessageStartEvent)o;
        if (!mlc.q((Object)this.a, (Object)messageStartEvent.a)) {
            return false;
        }
        final String b = messageStartEvent.b;
        final String b2 = this.b;
        if (b2 == null) {
            if (b == null) {
                return true;
            }
        }
        else if (b != null) {
            return b2.equals(b);
        }
        return false;
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
        final String b = this.b;
        String a;
        if (b == null) {
            a = "null";
        }
        else {
            a = MessageId.a(b);
        }
        final StringBuilder sb = new StringBuilder("MessageStartEvent(message=");
        sb.append((Object)this.a);
        sb.append(", discarded_parent_message_uuid=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
