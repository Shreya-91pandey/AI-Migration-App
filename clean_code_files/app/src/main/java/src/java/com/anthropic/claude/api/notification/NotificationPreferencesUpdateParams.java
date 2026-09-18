package com.anthropic.claude.api.notification;

@jzk
public final class NotificationPreferencesUpdateParams
{
    public static final v2g Companion;
    public final Preferences a = a;
    
    static {
        Companion = new v2g();
    }
    
    public NotificationPreferencesUpdateParams(final Preferences a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof NotificationPreferencesUpdateParams && mlc.q((Object)this.a, (Object)((NotificationPreferencesUpdateParams)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("NotificationPreferencesUpdateParams(preferences=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
