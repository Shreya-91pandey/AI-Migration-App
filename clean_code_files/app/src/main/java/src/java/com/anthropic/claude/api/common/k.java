package com.anthropic.claude.api.common;

import com.anthropic.claude.api.notice.Notice;

public abstract class k
{
    public static final Notice a(final RateLimit rateLimit) {
        if (rateLimit instanceof RateLimit.WithinLimit) {
            return ((RateLimit.WithinLimit)rateLimit).a;
        }
        if (!(rateLimit instanceof RateLimit.Limited)) {
            en9.r();
            return null;
        }
        final RateLimit.Limited limited = (RateLimit.Limited)rateLimit;
        final ResolvedLimit c = limited.c();
        if (c != null) {
            return c.a();
        }
        return limited.a();
    }
    
    public static final boolean b(final RateLimit rateLimit) {
        return rateLimit instanceof RateLimit.ExceedsLimit && c((RateLimit.Limited)rateLimit) != null;
    }
    
    public static final hfc c(final RateLimit.Limited limited) {
        final ResolvedLimit c = limited.c();
        if (c != null) {
            final hfc b = c.b();
            if (b != null) {
                return b;
            }
        }
        return limited.e();
    }
}
