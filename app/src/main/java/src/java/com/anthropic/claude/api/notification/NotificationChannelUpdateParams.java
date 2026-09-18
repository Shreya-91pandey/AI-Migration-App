package com.anthropic.claude.api.notification;

@jzk
public final class NotificationChannelUpdateParams
{
    public static final x0g Companion;
    public static final d2d[] f;
    public final NotificationChannelType a = a;
    public final String b = b;
    public final ClientPlatform c = c;
    public final String d = d;
    public final Boolean e = e;
    
    static {
        Companion = new x0g();
        f = new d2d[] { ncq.F(2, (jta)new r0g((byte)5)), null, ncq.F(2, (jta)new r0g((byte)6)), null, null };
    }
    
    public NotificationChannelUpdateParams(final Boolean e, final String d) {
        final NotificationChannelType w = NotificationChannelType.w;
        final ClientPlatform w2 = ClientPlatform.w;
        this.a = w;
        this.b = "com.anthropic.claude";
        this.c = w2;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotificationChannelUpdateParams)) {
            return false;
        }
        final NotificationChannelUpdateParams notificationChannelUpdateParams = (NotificationChannelUpdateParams)o;
        return this.a == notificationChannelUpdateParams.a && mlc.q((Object)this.b, (Object)notificationChannelUpdateParams.b) && this.c == notificationChannelUpdateParams.c && mlc.q((Object)this.d, (Object)notificationChannelUpdateParams.d) && mlc.q((Object)this.e, (Object)notificationChannelUpdateParams.e);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j((this.c.hashCode() + smk.j(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        final Boolean e = this.e;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        return j + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("NotificationChannelUpdateParams(channel_type=");
        sb.append((Object)this.a);
        sb.append(", client_app_name=");
        sb.append(this.b);
        sb.append(", client_platform=");
        sb.append((Object)this.c);
        sb.append(", registration_token=");
        sb.append(this.d);
        sb.append(", os_push_permission_granted=");
        return xc2.j(sb, this.e, ")");
    }
}
