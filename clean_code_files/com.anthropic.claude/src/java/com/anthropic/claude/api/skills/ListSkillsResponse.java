package com.anthropic.claude.api.skills;

import java.util.List;

@jzk
public final class ListSkillsResponse
{
    public static final wkd Companion;
    public static final d2d[] b;
    public final List a;
    
    static {
        Companion = (wkd)new Object();
        b = new d2d[] { ncq.F(2, (jta)new lrc((byte)3)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ListSkillsResponse && mlc.q((Object)this.a, (Object)((ListSkillsResponse)o).a));
    }
    
    @Override
    public final int hashCode() {
        final List a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.l("ListSkillsResponse(skills=", ")", this.a);
    }
}
