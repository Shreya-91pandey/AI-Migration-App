package com.anthropic.claude.api.experience;

import java.util.List;

@jzk
public final class ChatInputBannerContent implements ExperienceContent
{
    public static final jy3 Companion;
    public static final d2d[] h;
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final Boolean e;
    public final Integer f;
    public final ChatInputBannerSeverity g;
    
    static {
        Companion = (jy3)new Object();
        h = new d2d[] { null, null, null, ncq.F(2, (jta)new kc2((byte)12)), null, null, null };
    }
    
    public ChatInputBannerContent(final List d) {
        final ChatInputBannerSeverity w = ChatInputBannerSeverity.w;
        this.a = "Give Claude Pro for free";
        this.b = "Invite a friend \u2014 if they subscribe you **both** get a bonus month.";
        this.c = "gift";
        this.d = d;
        this.e = null;
        this.f = null;
        this.g = w;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatInputBannerContent)) {
            return false;
        }
        final ChatInputBannerContent chatInputBannerContent = (ChatInputBannerContent)o;
        return mlc.q((Object)this.a, (Object)chatInputBannerContent.a) && mlc.q((Object)this.b, (Object)chatInputBannerContent.b) && mlc.q((Object)this.c, (Object)chatInputBannerContent.c) && mlc.q((Object)this.d, (Object)chatInputBannerContent.d) && mlc.q((Object)this.e, (Object)chatInputBannerContent.e) && mlc.q((Object)this.f, (Object)chatInputBannerContent.f) && this.g == chatInputBannerContent.g;
    }
    
    @Override
    public final int hashCode() {
        final int n = 0;
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final String c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final int k = smk.k(((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31, 31, this.d);
        final Boolean e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final Integer f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = n;
        }
        else {
            hashCode5 = f.hashCode();
        }
        return this.g.hashCode() + ((k + hashCode4) * 31 + hashCode5) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("ChatInputBannerContent(title=", this.a, ", description=", this.b, ", title_icon=");
        p3g.h(this.c, ", buttons=", ", dismissible=", t, this.d);
        t.append((Object)this.e);
        t.append(", min_messages=");
        t.append((Object)this.f);
        t.append(", severity=");
        t.append((Object)this.g);
        t.append(")");
        return t.toString();
    }
}
