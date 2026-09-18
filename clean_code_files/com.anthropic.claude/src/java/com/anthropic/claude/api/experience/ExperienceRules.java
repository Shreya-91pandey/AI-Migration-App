package com.anthropic.claude.api.experience;

import java.util.Map;

@jzk
public final class ExperienceRules
{
    public static final oy9 Companion;
    public static final d2d[] c;
    public final ExperienceRuleSet a;
    public final Map b;
    
    static {
        Companion = (oy9)new Object();
        c = new d2d[] { null, ncq.F(2, (jta)new ux8((byte)7)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperienceRules)) {
            return false;
        }
        final ExperienceRules experienceRules = (ExperienceRules)o;
        return mlc.q((Object)this.a, (Object)experienceRules.a) && mlc.q((Object)this.b, (Object)experienceRules.b);
    }
    
    @Override
    public final int hashCode() {
        final ExperienceRuleSet a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.b.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ExperienceRules(global=");
        sb.append((Object)this.a);
        sb.append(", placements=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
