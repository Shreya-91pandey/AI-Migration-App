package com.anthropic.claude.api.experience;

@jzk
public final class Experience
{
    public static final lw9 Companion;
    public static final d2d[] i;
    public final String a = a;
    public final String b = b;
    public final ExperiencePlacement c;
    public final ExperienceTier d;
    public final ExperienceContent e;
    public final boolean f;
    public final String g;
    public final ExperienceConfig h;
    
    static {
        Companion = (lw9)new Object();
        i = new d2d[] { null, null, null, null, ncq.F(2, (jta)new ux8((byte)5)), null, null, null };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Experience)) {
            return false;
        }
        final Experience experience = (Experience)o;
        return mlc.q((Object)this.a, (Object)experience.a) && mlc.q((Object)this.b, (Object)experience.b) && this.c == experience.c && this.d == experience.d && mlc.q((Object)this.e, (Object)experience.e) && this.f == experience.f && mlc.q((Object)this.g, (Object)experience.g) && mlc.q((Object)this.h, (Object)experience.h);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(this.a.hashCode() * 31, 31, this.b);
        final int n = 0;
        final ExperiencePlacement c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final ExperienceTier d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final ExperienceContent e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = e.hashCode();
        }
        final int l = smk.l((((j + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31, 31, this.f);
        final String g = this.g;
        int hashCode4;
        if (g == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = g.hashCode();
        }
        final ExperienceConfig h = this.h;
        int hashCode5;
        if (h == null) {
            hashCode5 = n;
        }
        else {
            hashCode5 = h.hashCode();
        }
        return (l + hashCode4) * 31 + hashCode5;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("Experience(id=", this.a, ", key=", this.b, ", placement_key=");
        t.append((Object)this.c);
        t.append(", tier=");
        t.append((Object)this.d);
        t.append(", content=");
        t.append((Object)this.e);
        t.append(", enabled=");
        t.append(this.f);
        t.append(", exp_id=");
        t.append(this.g);
        t.append(", config=");
        t.append((Object)this.h);
        t.append(")");
        return t.toString();
    }
}
