package com.anthropic.claude.analytics.events;

@jzk
public final class VoiceEvents$VoiceEntryTapped implements v10
{
    public static final rlp Companion;
    public static final d2d[] b;
    public final VoiceEvents$VoiceEntrySource a = a;
    
    static {
        Companion = new rlp();
        b = new d2d[] { ncq.F(2, (jta)new tkp((byte)13)) };
    }
    
    public VoiceEvents$VoiceEntryTapped(final VoiceEvents$VoiceEntrySource a) {
        this.a = a;
    }
    
    public final String a() {
        return "claudeai.voice.entry.tapped";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof VoiceEvents$VoiceEntryTapped && this.a == ((VoiceEvents$VoiceEntryTapped)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("VoiceEntryTapped(entry_source=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
