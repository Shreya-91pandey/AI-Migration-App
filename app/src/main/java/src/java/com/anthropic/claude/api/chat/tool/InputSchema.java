package com.anthropic.claude.api.chat.tool;

import java.util.List;
import java.util.Map;

@jzk
public final class InputSchema
{
    public static final hdc Companion;
    public static final d2d[] d;
    public final String a = a;
    public final Map b;
    public final List c;
    
    static {
        Companion = (hdc)new Object();
        d = new d2d[] { null, ncq.F(2, (jta)new geb((byte)20)), ncq.F(2, (jta)new geb((byte)21)) };
    }
    
    public InputSchema(final List c, final Map b) {
        this.a = "object";
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InputSchema)) {
            return false;
        }
        final InputSchema inputSchema = (InputSchema)o;
        return mlc.q((Object)this.a, (Object)inputSchema.a) && mlc.q((Object)this.b, (Object)inputSchema.b) && mlc.q((Object)this.c, (Object)inputSchema.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + t.f(this.a.hashCode() * 31, 31, this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("InputSchema(type=");
        sb.append(this.a);
        sb.append(", properties=");
        sb.append((Object)this.b);
        sb.append(", required=");
        return p3g.e(sb, this.c, ")");
    }
}
