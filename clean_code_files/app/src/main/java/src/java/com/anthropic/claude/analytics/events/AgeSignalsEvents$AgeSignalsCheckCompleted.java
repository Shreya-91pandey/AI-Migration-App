package com.anthropic.claude.analytics.events;

@jzk
public final class AgeSignalsEvents$AgeSignalsCheckCompleted implements v10
{
    public static final an Companion;
    public static final d2d[] e;
    public final AgeSignalsEvents$AgeSignalsResult a = a;
    public final int b = b;
    public final long c = c;
    public final boolean d = d;
    
    static {
        Companion = (an)new Object();
        e = new d2d[] { ncq.F(2, (jta)new y5((byte)6)), null, null, null };
    }
    
    public AgeSignalsEvents$AgeSignalsCheckCompleted(final AgeSignalsEvents$AgeSignalsResult a, final int b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = false;
    }
    
    @Override
    public final String a() {
        return "mobile.age_signals.check_completed";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgeSignalsEvents$AgeSignalsCheckCompleted)) {
            return false;
        }
        final AgeSignalsEvents$AgeSignalsCheckCompleted ageSignalsEvents$AgeSignalsCheckCompleted = (AgeSignalsEvents$AgeSignalsCheckCompleted)o;
        return this.a == ageSignalsEvents$AgeSignalsCheckCompleted.a && this.b == ageSignalsEvents$AgeSignalsCheckCompleted.b && this.c == ageSignalsEvents$AgeSignalsCheckCompleted.c && this.d == ageSignalsEvents$AgeSignalsCheckCompleted.d;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.d) + hia.d(hia.y(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AgeSignalsCheckCompleted(result=");
        sb.append((Object)this.a);
        sb.append(", attempt_count=");
        sb.append(this.b);
        sb.append(", duration_ms=");
        sb.append(this.c);
        sb.append(", is_debug_override=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
