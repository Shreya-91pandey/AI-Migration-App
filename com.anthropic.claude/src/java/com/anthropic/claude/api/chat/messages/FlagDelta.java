package com.anthropic.claude.api.chat.messages;

@jzk
public final class FlagDelta implements ContentBlockDelta
{
    public static final gha Companion;
    public final MessageFlag a = a;
    public final ApiHelpline b;
    
    static {
        Companion = (gha)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlagDelta)) {
            return false;
        }
        final FlagDelta flagDelta = (FlagDelta)o;
        return mlc.q((Object)this.a, (Object)flagDelta.a) && mlc.q((Object)this.b, (Object)flagDelta.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final ApiHelpline b = this.b;
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
        final StringBuilder sb = new StringBuilder("FlagDelta(flag=");
        sb.append((Object)this.a);
        sb.append(", helpline=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
