package com.anthropic.claude.analytics.screens;

import com.anthropic.claude.analytics.events.ConversationStoreType;

@jzk
public final class AnalyticsScreens$ChatScreen implements AnalyticsScreen
{
    public static final j20 Companion;
    public static final d2d[] d;
    public final String a = a;
    public final String b = b;
    public final ConversationStoreType c;
    
    static {
        Companion = (j20)new Object();
        d = new d2d[] { null, null, ncq.F(2, (jta)new y5((byte)10)) };
    }
    
    public AnalyticsScreens$ChatScreen(final String a, final String b, final ConversationStoreType c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyticsScreens$ChatScreen)) {
            return false;
        }
        final AnalyticsScreens$ChatScreen analyticsScreens$ChatScreen = (AnalyticsScreens$ChatScreen)o;
        return mlc.q((Object)this.a, (Object)analyticsScreens$ChatScreen.a) && mlc.q((Object)this.b, (Object)analyticsScreens$ChatScreen.b) && this.c == analyticsScreens$ChatScreen.c;
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
        final StringBuilder t = oz1.t("ChatScreen(organization_uuid=", this.a, ", conversation_uuid=", this.b, ", store_type=");
        t.append((Object)this.c);
        t.append(")");
        return t.toString();
    }
}
