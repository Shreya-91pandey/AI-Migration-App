package com.anthropic.claude.api.chat.tool;

import java.util.List;
import java.util.Map;

@jzk
public final class ObjectProperty implements PropertyDefinition
{
    public static final m4g Companion;
    public static final d2d[] d;
    public final String a;
    public final Map b;
    public final List c;
    
    static {
        Companion = (m4g)new Object();
        d = new d2d[] { null, ncq.F(2, (jta)new mff((byte)8)), ncq.F(2, (jta)new mff((byte)9)) };
    }
    
    public ObjectProperty(final String a, final Map b, final List c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectProperty)) {
            return false;
        }
        final ObjectProperty objectProperty = (ObjectProperty)o;
        return mlc.q((Object)this.a, (Object)objectProperty.a) && mlc.q((Object)this.b, (Object)objectProperty.b) && mlc.q((Object)this.c, (Object)objectProperty.c);
    }
    
    @Override
    public final String getDescription() {
        return this.a;
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final String a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Map b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final List c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ObjectProperty(description=");
        sb.append(this.a);
        sb.append(", properties=");
        sb.append((Object)this.b);
        sb.append(", required=");
        return p3g.e(sb, this.c, ")");
    }
}
