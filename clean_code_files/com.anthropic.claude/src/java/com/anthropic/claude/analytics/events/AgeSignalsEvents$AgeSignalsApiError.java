package com.anthropic.claude.analytics.events;

@jzk
public final class AgeSignalsEvents$AgeSignalsApiError implements v10
{
    public static final xm Companion;
    public static final d2d[] d;
    public final int a = a;
    public final AgeSignalsEvents$AgeSignalsErrorType b = b;
    public final int c = c;
    
    static {
        Companion = (xm)new Object();
        d = new d2d[] { null, ncq.F(2, (jta)new y5((byte)5)), null };
    }
    
    public AgeSignalsEvents$AgeSignalsApiError(final int a, final AgeSignalsEvents$AgeSignalsErrorType b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String a() {
        return "mobile.age_signals.api_error";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgeSignalsEvents$AgeSignalsApiError)) {
            return false;
        }
        final AgeSignalsEvents$AgeSignalsApiError ageSignalsEvents$AgeSignalsApiError = (AgeSignalsEvents$AgeSignalsApiError)o;
        return this.a == ageSignalsEvents$AgeSignalsApiError.a && this.b == ageSignalsEvents$AgeSignalsApiError.b && this.c == ageSignalsEvents$AgeSignalsApiError.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() + Integer.hashCode(this.a) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AgeSignalsApiError(error_code=");
        sb.append(this.a);
        sb.append(", error_type=");
        sb.append((Object)this.b);
        sb.append(", attempt_number=");
        return smk.q(this.c, ")", sb);
    }
}
