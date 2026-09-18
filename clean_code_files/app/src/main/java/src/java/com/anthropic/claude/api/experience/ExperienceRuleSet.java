package com.anthropic.claude.api.experience;

@jzk
public final class ExperienceRuleSet
{
    public static final my9 Companion;
    public final ExperienceRateLimit a;
    public final ExperienceCooldown b;
    
    static {
        Companion = (my9)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperienceRuleSet)) {
            return false;
        }
        final ExperienceRuleSet set = (ExperienceRuleSet)o;
        return mlc.q((Object)this.a, (Object)set.a) && mlc.q((Object)this.b, (Object)set.b);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final ExperienceRateLimit a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final ExperienceCooldown b = this.b;
        if (b != null) {
            hashCode = Integer.hashCode(b.a);
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ExperienceRuleSet(rate_limit=");
        sb.append((Object)this.a);
        sb.append(", cooldown=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
