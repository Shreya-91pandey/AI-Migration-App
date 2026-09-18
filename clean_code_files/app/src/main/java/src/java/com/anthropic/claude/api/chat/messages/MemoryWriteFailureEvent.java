package com.anthropic.claude.api.chat.messages;

import java.util.List;

@jzk
public final class MemoryWriteFailureEvent implements StreamEvent
{
    public static final oye Companion;
    public static final d2d[] b;
    public final List a;
    
    static {
        Companion = (oye)new Object();
        b = new d2d[] { ncq.F(2, (jta)new v0e((byte)17)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof MemoryWriteFailureEvent && mlc.q((Object)this.a, (Object)((MemoryWriteFailureEvent)o).a));
    }
    
    @Override
    public final int hashCode() {
        final List a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.l("MemoryWriteFailureEvent(losses=", ")", this.a);
    }
}
