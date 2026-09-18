package com.anthropic.claude.api.events;

@jzk
public final class BatchEventLoggingResponse
{
    public static final gz1 Companion;
    public final int a = a;
    public final int b = b;
    
    static {
        Companion = (gz1)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchEventLoggingResponse)) {
            return false;
        }
        final BatchEventLoggingResponse batchEventLoggingResponse = (BatchEventLoggingResponse)o;
        return this.a == batchEventLoggingResponse.a && this.b == batchEventLoggingResponse.b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        return hia.g(this.a, this.b, "BatchEventLoggingResponse(accepted_count=", ", rejected_count=", ")");
    }
}
