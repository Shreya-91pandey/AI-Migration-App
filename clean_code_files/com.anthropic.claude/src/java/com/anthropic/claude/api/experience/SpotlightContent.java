package com.anthropic.claude.api.experience;

import java.util.List;

@jzk
public final class SpotlightContent implements ExperienceContent
{
    public static final ugm Companion;
    public static final d2d[] k;
    public final String a = a;
    public final String b;
    public final ExperienceAsset c;
    public final String d;
    public final List e;
    public final BulletsStyle f;
    public final List g;
    public final boolean h;
    public final ExperienceToggle i;
    public final boolean j;
    
    static {
        Companion = (ugm)new Object();
        k = new d2d[] { null, null, null, null, ncq.F(2, (jta)new s8k((byte)13)), null, ncq.F(2, (jta)new s8k((byte)14)), null, null, null };
    }
    
    public SpotlightContent(final String a, final String b, final ExperienceAsset c, final String d, final List e, final BulletsStyle f, final List g, final boolean h, final ExperienceToggle i, final boolean j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpotlightContent)) {
            return false;
        }
        final SpotlightContent spotlightContent = (SpotlightContent)o;
        return mlc.q((Object)this.a, (Object)spotlightContent.a) && mlc.q((Object)this.b, (Object)spotlightContent.b) && mlc.q((Object)this.c, (Object)spotlightContent.c) && mlc.q((Object)this.d, (Object)spotlightContent.d) && mlc.q((Object)this.e, (Object)spotlightContent.e) && this.f == spotlightContent.f && mlc.q((Object)this.g, (Object)spotlightContent.g) && this.h == spotlightContent.h && mlc.q((Object)this.i, (Object)spotlightContent.i) && this.j == spotlightContent.j;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int n = 0;
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final ExperienceAsset c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final String d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final int l = smk.l(smk.k((this.f.hashCode() + smk.k((((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h);
        final ExperienceToggle i = this.i;
        int hashCode5;
        if (i == null) {
            hashCode5 = n;
        }
        else {
            hashCode5 = i.hashCode();
        }
        return Boolean.hashCode(this.j) + (l + hashCode5) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("SpotlightContent(title=", this.a, ", description=", this.b, ", asset=");
        t.append((Object)this.c);
        t.append(", badge_title=");
        t.append(this.d);
        t.append(", bullets=");
        t.append((Object)this.e);
        t.append(", bullets_style=");
        t.append((Object)this.f);
        t.append(", buttons=");
        t.append((Object)this.g);
        t.append(", dismissible=");
        t.append(this.h);
        t.append(", toggle=");
        t.append((Object)this.i);
        t.append(", require_scroll_to_bottom=");
        t.append(this.j);
        t.append(")");
        return t.toString();
    }
}
