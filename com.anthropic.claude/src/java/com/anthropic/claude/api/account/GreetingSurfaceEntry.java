package com.anthropic.claude.api.account;

import java.util.List;

@jzk
public final class GreetingSurfaceEntry
{
    public static final x6b Companion;
    public static final d2d[] d;
    public final String a = a;
    public final List b;
    public final List c;
    
    static {
        Companion = (x6b)new Object();
        d = new d2d[] { null, ncq.F(2, (jta)new ux8((byte)25)), ncq.F(2, (jta)new ux8((byte)26)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GreetingSurfaceEntry)) {
            return false;
        }
        final GreetingSurfaceEntry greetingSurfaceEntry = (GreetingSurfaceEntry)o;
        return mlc.q((Object)this.a, (Object)greetingSurfaceEntry.a) && mlc.q((Object)this.b, (Object)greetingSurfaceEntry.b) && mlc.q((Object)this.c, (Object)greetingSurfaceEntry.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final List b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return this.c.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        return p3g.e(guc.l("GreetingSurfaceEntry(surface=", this.a, ", days=", this.b, ", default_slots="), this.c, ")");
    }
}
