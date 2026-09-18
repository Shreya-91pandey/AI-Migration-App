package com.anthropic.claude.api.events;

import java.util.ArrayList;
import java.util.List;

@jzk
public final class BatchEventLoggingRequest
{
    public static final ez1 Companion;
    public static final d2d[] b;
    public final List a = a;
    
    static {
        Companion = (ez1)new Object();
        b = new d2d[] { ncq.F(2, (jta)new kh0((byte)26)) };
    }
    
    public BatchEventLoggingRequest(final ArrayList a) {
        this.a = (List)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof BatchEventLoggingRequest && mlc.q((Object)this.a, (Object)((BatchEventLoggingRequest)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.l("BatchEventLoggingRequest(events=", ")", this.a);
    }
}
