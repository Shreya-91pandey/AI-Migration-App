package com.anthropic.claude.api.skills;

import com.anthropic.claude.types.strings.EmailAddress;

@jzk
public final class Skill
{
    public static final r0m Companion;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final SkillCreatorType e;
    public final SkillPartition f;
    public final Boolean g;
    public final SkillOwner h;
    public final String i;
    
    static {
        Companion = (r0m)new Object();
    }
    
    public Skill(final int n, final String a, final String b, String c, final String d) {
        if ((n & 0x4) != 0x0) {
            c = null;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
    
    public final v1m a() {
        final SkillOwner h = this.h;
        String a2 = null;
        Label_0053: {
            if (h != null) {
                final String a = h.a();
                if (a != null) {
                    EmailAddress emailAddress = new EmailAddress(a);
                    if (kym.Y0((CharSequence)a)) {
                        emailAddress = null;
                    }
                    if (emailAddress != null) {
                        a2 = emailAddress.a;
                        break Label_0053;
                    }
                }
            }
            a2 = null;
        }
        if (this.e == SkillCreatorType.w) {
            return (v1m)q1m.a;
        }
        if (mlc.q((Object)this.g, (Object)Boolean.TRUE)) {
            if (a2 != null) {
                return (v1m)new t1m(a2);
            }
            return (v1m)s1m.a;
        }
        else {
            final SkillPartition y = SkillPartition.y;
            final SkillPartition f = this.f;
            if (f == y) {
                return (v1m)r1m.a;
            }
            if (f != SkillPartition.x) {
                if (f != null || this.i != null) {
                    return null;
                }
            }
            return (v1m)u1m.a;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Skill)) {
            return false;
        }
        final Skill skill = (Skill)o;
        return mlc.q((Object)this.a, (Object)skill.a) && mlc.q((Object)this.b, (Object)skill.b) && mlc.q((Object)this.c, (Object)skill.c) && mlc.q((Object)this.d, (Object)skill.d) && this.e == skill.e && this.f == skill.f && mlc.q((Object)this.g, (Object)skill.g) && mlc.q((Object)this.h, (Object)skill.h) && mlc.q((Object)this.i, (Object)skill.i);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final String a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final SkillCreatorType e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final SkillPartition f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final Boolean g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final SkillOwner h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final String i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return (((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("Skill(id=", this.a, ", name=", this.b, ", display_name=");
        oz1.A(t, this.c, ", description=", this.d, ", creator_type=");
        t.append((Object)this.e);
        t.append(", partition_by=");
        t.append((Object)this.f);
        t.append(", is_shared=");
        t.append((Object)this.g);
        t.append(", owner=");
        t.append((Object)this.h);
        t.append(", backing_plugin_id=");
        return oz1.p(t, this.i, ")");
    }
}
