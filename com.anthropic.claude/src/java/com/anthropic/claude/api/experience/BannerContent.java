package com.anthropic.claude.api.experience;

import java.util.List;

@jzk
public final class BannerContent implements ExperienceContent
{
    public static final js1 Companion;
    public static final d2d[] f;
    public final String a = a;
    public final String b;
    public final ExperienceAsset c;
    public final List d;
    public final boolean e;
    
    static {
        Companion = (js1)new Object();
        f = new d2d[] { null, null, null, ncq.F(2, (jta)new kh0((byte)24)), null };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BannerContent)) {
            return false;
        }
        final BannerContent bannerContent = (BannerContent)o;
        return mlc.q((Object)this.a, (Object)bannerContent.a) && mlc.q((Object)this.b, (Object)bannerContent.b) && mlc.q((Object)this.c, (Object)bannerContent.c) && mlc.q((Object)this.d, (Object)bannerContent.d) && this.e == bannerContent.e;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final ExperienceAsset c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return Boolean.hashCode(this.e) + smk.k(((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31, 31, this.d);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("BannerContent(title=", this.a, ", description=", this.b, ", asset=");
        t.append((Object)this.c);
        t.append(", buttons=");
        t.append((Object)this.d);
        t.append(", inlineButtons=");
        return ge9.t(t, this.e, ")");
    }
}
