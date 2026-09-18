package com.anthropic.claude.api.experience;

@jzk
public final class ExperienceCooldown
{
    public static final sx9 Companion;
    public final int a = a;
    
    static {
        Companion = new sx9();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ExperienceCooldown && this.a == ((ExperienceCooldown)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return oz1.n("ExperienceCooldown(seconds=", this.a, ")");
    }
}
