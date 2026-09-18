package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings.ModelId;

@jzk
public final class ModelThinkingDefault
{
    public static final xff Companion;
    public static final d2d[] c;
    public final String a = a;
    public final ThinkingState b;
    
    static {
        Companion = (xff)new Object();
        c = new d2d[] { null, ncq.F(2, (jta)new mff((byte)1)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelThinkingDefault)) {
            return false;
        }
        final ModelThinkingDefault modelThinkingDefault = (ModelThinkingDefault)o;
        return mlc.q((Object)this.a, (Object)modelThinkingDefault.a) && mlc.q((Object)this.b, (Object)modelThinkingDefault.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final ThinkingState b = this.b;
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
        final String a = ModelId.a(this.a);
        final StringBuilder sb = new StringBuilder("ModelThinkingDefault(id=");
        sb.append(a);
        sb.append(", thinking=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
