package com.anthropic.claude.analytics;

import com.anthropic.claude.analytics.events.ConversationStoreType;

@jzk
public final class ChatScreenAnalyticsProperties
{
    public static final f84 Companion;
    public static final d2d[] d;
    public final String a = a;
    public final String b = b;
    public final ConversationStoreType c = c;
    
    static {
        Companion = (f84)new Object();
        d = new d2d[] { null, null, ncq.F(2, (jta)new h64((byte)2)) };
    }
    
    public ChatScreenAnalyticsProperties(final String a, final String b, final ConversationStoreType c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatScreenAnalyticsProperties)) {
            return false;
        }
        final ChatScreenAnalyticsProperties chatScreenAnalyticsProperties = (ChatScreenAnalyticsProperties)o;
        return mlc.q((Object)this.a, (Object)chatScreenAnalyticsProperties.a) && mlc.q((Object)this.b, (Object)chatScreenAnalyticsProperties.b) && this.c == chatScreenAnalyticsProperties.c;
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(this.a.hashCode() * 31, 31, this.b);
        final ConversationStoreType c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return j + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("ChatScreenAnalyticsProperties(organizationUuid=", this.a, ", conversationUuid=", this.b, ", store_type=");
        t.append((Object)this.c);
        t.append(")");
        return t.toString();
    }
}
