package com.anthropic.claude.api.account;

import java.util.List;

@jzk
public final class GreetingDay
{
    public static final t6b Companion;
    public static final d2d[] c;
    public final String a = a;
    public final List b = b;
    
    static {
        Companion = (t6b)new Object();
        c = new d2d[] { null, ncq.F(2, (jta)new ux8((byte)24)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GreetingDay)) {
            return false;
        }
        final GreetingDay greetingDay = (GreetingDay)o;
        return mlc.q((Object)this.a, (Object)greetingDay.a) && mlc.q((Object)this.b, (Object)greetingDay.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return rua.i("GreetingDay(day=", this.a, ", slots=", this.b, ")");
    }
}
