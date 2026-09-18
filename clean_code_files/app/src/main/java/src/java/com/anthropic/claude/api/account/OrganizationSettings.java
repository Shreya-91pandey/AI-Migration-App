package com.anthropic.claude.api.account;

import java.util.List;

@jzk
public final class OrganizationSettings
{
    public static final yhg Companion;
    public static final d2d[] f;
    public final String a = a;
    public final List b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    
    static {
        Companion = (yhg)new Object();
        f = new d2d[] { null, ncq.F(2, (jta)new mff((byte)14)), null, null, null };
    }
    
    public OrganizationSettings() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrganizationSettings)) {
            return false;
        }
        final OrganizationSettings organizationSettings = (OrganizationSettings)o;
        return mlc.q((Object)this.a, (Object)organizationSettings.a) && mlc.q((Object)this.b, (Object)organizationSettings.b) && mlc.q((Object)this.c, (Object)organizationSettings.c) && mlc.q((Object)this.d, (Object)organizationSettings.d) && mlc.q((Object)this.e, (Object)organizationSettings.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final List b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Boolean c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Boolean e = this.e;
        if (e != null) {
            hashCode2 = e.hashCode();
        }
        return (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder l = guc.l("OrganizationSettings(claude_console_privacy=", this.a, ", allowed_invite_domains=", this.b, ", cowork_remote_control_enabled=");
        ju4.h(l, this.c, ", claude_code_hide_managed_environments=", this.d, ", claude_code_disable_googleapis.compute=");
        return xc2.j(l, this.e, ")");
    }
}
