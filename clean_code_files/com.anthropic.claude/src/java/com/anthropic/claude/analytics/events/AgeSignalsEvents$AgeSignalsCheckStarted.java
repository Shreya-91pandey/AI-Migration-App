package com.anthropic.claude.analytics.events;

@jzk
public final class AgeSignalsEvents$AgeSignalsCheckStarted implements v10
{
    public static final cn Companion;
    public final boolean a = a;
    
    static {
        Companion = (cn)new Object();
    }
    
    public AgeSignalsEvents$AgeSignalsCheckStarted() {
        this.a = false;
    }
    
    @Override
    public final String a() {
        return "mobile.age_signals.check_started";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof AgeSignalsEvents$AgeSignalsCheckStarted && this.a == ((AgeSignalsEvents$AgeSignalsCheckStarted)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return a6l.f("AgeSignalsCheckStarted(is_debug_override=", ")", this.a);
    }
}
