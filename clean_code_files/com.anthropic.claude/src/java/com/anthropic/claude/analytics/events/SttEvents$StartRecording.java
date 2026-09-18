package com.anthropic.claude.analytics.events;

@jzk
public final class SttEvents$StartRecording implements v10
{
    public static final zzm Companion;
    public final String a = a;
    public final String b = b;
    public final String c = c;
    public final String d = d;
    public final String e;
    public final String f;
    public final String g;
    
    static {
        Companion = new zzm();
    }
    
    public SttEvents$StartRecording(final String a, final String b, final String c, final String d, final String e, final String f, final String g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final String a() {
        return "mobile_stt_start_recording";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SttEvents$StartRecording)) {
            return false;
        }
        final SttEvents$StartRecording sttEvents$StartRecording = (SttEvents$StartRecording)o;
        return mlc.q((Object)this.a, (Object)sttEvents$StartRecording.a) && mlc.q((Object)this.b, (Object)sttEvents$StartRecording.b) && mlc.q((Object)this.c, (Object)sttEvents$StartRecording.c) && mlc.q((Object)this.d, (Object)sttEvents$StartRecording.d) && mlc.q((Object)this.e, (Object)sttEvents$StartRecording.e) && mlc.q((Object)this.f, (Object)sttEvents$StartRecording.f) && mlc.q((Object)this.g, (Object)sttEvents$StartRecording.g);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(smk.j(smk.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        int hashCode = 0;
        final String e = this.e;
        int hashCode2;
        if (e == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = e.hashCode();
        }
        final String f = this.f;
        int hashCode3;
        if (f == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = f.hashCode();
        }
        final String g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((j + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("StartRecording(organization_uuid=", this.a, ", conversation_uuid=", this.b, ", language=");
        oz1.A(t, this.c, ", transcriber=", this.d, ", surface=");
        oz1.A(t, this.e, ", session_id=", this.f, ", entry_mode=");
        return oz1.p(t, this.g, ")");
    }
}
