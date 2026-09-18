package com.anthropic.claude.api.notification;

@jzk
public final class ChannelPreference
{
    public static final fg3 Companion;
    public final Boolean a;
    public final Boolean b;
    
    static {
        Companion = (fg3)new Object();
    }
    
    public ChannelPreference(final Boolean a, final Boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChannelPreference)) {
            return false;
        }
        final ChannelPreference channelPreference = (ChannelPreference)o;
        return mlc.q((Object)this.a, (Object)channelPreference.a) && mlc.q((Object)this.b, (Object)channelPreference.b);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Boolean a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ChannelPreference(enable_email=");
        sb.append((Object)this.a);
        sb.append(", enable_push=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
