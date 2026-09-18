package com.anthropic.claude.api.experience;

@jzk
public final class ExperienceRateLimit
{
    public static final ky9 Companion;
    public final int a = a;
    public final hfc b = b;
    
    static {
        Companion = new ky9();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperienceRateLimit)) {
            return false;
        }
        final ExperienceRateLimit experienceRateLimit = (ExperienceRateLimit)o;
        return this.a == experienceRateLimit.a && mlc.q((Object)this.b, (Object)experienceRateLimit.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ExperienceRateLimit(remaining=");
        sb.append(this.a);
        sb.append(", reset_at=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
