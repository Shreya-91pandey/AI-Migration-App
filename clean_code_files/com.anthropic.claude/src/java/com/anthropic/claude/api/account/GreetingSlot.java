package com.anthropic.claude.api.account;

@jzk
public final class GreetingSlot
{
    public static final v6b Companion;
    public final int a = a;
    public final String b = b;
    
    static {
        Companion = (v6b)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GreetingSlot)) {
            return false;
        }
        final GreetingSlot greetingSlot = (GreetingSlot)o;
        return this.a == greetingSlot.a && mlc.q((Object)this.b, (Object)greetingSlot.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return t.i(this.a, "GreetingSlot(until=", ", text=", this.b, ")");
    }
}
