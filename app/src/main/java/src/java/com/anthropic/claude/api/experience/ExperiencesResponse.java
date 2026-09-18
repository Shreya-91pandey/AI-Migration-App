package com.anthropic.claude.api.experience;

import java.util.List;

@jzk
public final class ExperiencesResponse
{
    public static final zz9 Companion;
    public static final d2d[] c;
    public final List a = a;
    public final ExperienceRules b;
    
    static {
        Companion = (zz9)new Object();
        c = new d2d[] { ncq.F(2, (jta)new ux8((byte)9)), null };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperiencesResponse)) {
            return false;
        }
        final ExperiencesResponse experiencesResponse = (ExperiencesResponse)o;
        return mlc.q((Object)this.a, (Object)experiencesResponse.a) && mlc.q((Object)this.b, (Object)experiencesResponse.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final ExperienceRules b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ExperiencesResponse(experiences=");
        sb.append((Object)this.a);
        sb.append(", rules=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
