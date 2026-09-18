package com.anthropic.claude.app;

public final class b3
{
    public final ClaudeAppDestination.List a;
    public final ClaudeAppDestination.Detail b;
    public final zp4 c;
    
    public b3(final ClaudeAppDestination.List a, final ClaudeAppDestination.Detail b, final zp4 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b3)) {
            return false;
        }
        final b3 b3 = (b3)o;
        return mlc.q((Object)this.a, (Object)b3.a) && mlc.q((Object)this.b, (Object)b3.b) && this.c == b3.c;
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final ClaudeAppDestination.List a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final ClaudeAppDestination.Detail b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return this.c.hashCode() + (hashCode2 * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PaneState(main=");
        sb.append((Object)this.a);
        sb.append(", detail=");
        sb.append((Object)this.b);
        sb.append(", mode=");
        sb.append((Object)this.c);
        sb.append(")");
        return sb.toString();
    }
}
