package com.anthropic.claude.api.model;

import java.util.ArrayList;
import java.util.List;

@jzk
public final class ThinkingOptions
{
    public static final gpn Companion;
    public static final d2d[] c;
    public final List a;
    public final List b;
    
    static {
        Companion = (gpn)new Object();
        c = new d2d[] { ncq.F(2, (jta)new smn((byte)11)), ncq.F(2, (jta)new smn((byte)12)) };
    }
    
    public ThinkingOptions(final ArrayList a, final ArrayList b) {
        this.a = (List)a;
        this.b = (List)b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThinkingOptions)) {
            return false;
        }
        final ThinkingOptions thinkingOptions = (ThinkingOptions)o;
        return mlc.q((Object)this.a, (Object)thinkingOptions.a) && mlc.q((Object)this.b, (Object)thinkingOptions.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ThinkingOptions(effort_options=");
        sb.append((Object)this.a);
        sb.append(", mode_options=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
