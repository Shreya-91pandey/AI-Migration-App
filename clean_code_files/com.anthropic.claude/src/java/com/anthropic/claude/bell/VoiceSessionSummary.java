package com.anthropic.claude.bell;

import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.AudioCaptureSessionId;
import com.anthropic.claude.types.strings.VoiceSessionId;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEntrySource;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;

@jzk
public final class VoiceSessionSummary
{
    public static final yop Companion;
    public static final d2d[] o;
    public final String a = a;
    public final String b = b;
    public final String c = c;
    public final long d = d;
    public final long e = e;
    public final String f = f;
    public final String g = g;
    public final VoiceEvents$VoiceActivationMode h = h;
    public final VoiceEvents$VoiceEntrySource i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final Long m;
    public final Long n;
    
    static {
        Companion = (yop)new Object();
        o = new d2d[] { null, null, null, null, null, null, null, ncq.F(2, (jta)new axo((byte)8)), ncq.F(2, (jta)new axo((byte)9)), null, null, null, null, null };
    }
    
    public VoiceSessionSummary(final String a, final String b, final String c, final long d, final long e, final String f, final String g, final VoiceEvents$VoiceActivationMode h, VoiceEvents$VoiceEntrySource w, final boolean j, String k, Long m, Long n, final int n2) {
        if ((n2 & 0x100) != 0x0) {
            w = VoiceEvents$VoiceEntrySource.w;
        }
        final Long n3 = null;
        if ((n2 & 0x400) != 0x0) {
            k = null;
        }
        final boolean l = (n2 & 0x800) == 0x0;
        if ((n2 & 0x1000) != 0x0) {
            m = null;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = n3;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = w;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof VoiceSessionSummary) {
                final VoiceSessionSummary voiceSessionSummary = (VoiceSessionSummary)o;
                if (mlc.q((Object)this.a, (Object)voiceSessionSummary.a)) {
                    if (mlc.q((Object)this.b, (Object)voiceSessionSummary.b)) {
                        if (VoiceSessionId.a(this.c, voiceSessionSummary.c)) {
                            if (this.d == voiceSessionSummary.d) {
                                if (this.e == voiceSessionSummary.e) {
                                    if (mlc.q((Object)this.f, (Object)voiceSessionSummary.f)) {
                                        if (mlc.q((Object)this.g, (Object)voiceSessionSummary.g)) {
                                            if (this.h == voiceSessionSummary.h) {
                                                if (this.i == voiceSessionSummary.i) {
                                                    if (this.j == voiceSessionSummary.j) {
                                                        final String k = voiceSessionSummary.k;
                                                        final String i = this.k;
                                                        boolean b = false;
                                                        Label_0224: {
                                                            if (i == null) {
                                                                if (k == null) {
                                                                    b = true;
                                                                    break Label_0224;
                                                                }
                                                            }
                                                            else if (k != null) {
                                                                b = AudioCaptureSessionId.b(i, k);
                                                                break Label_0224;
                                                            }
                                                            b = false;
                                                        }
                                                        if (b) {
                                                            if (this.l == voiceSessionSummary.l) {
                                                                if (mlc.q((Object)this.m, (Object)voiceSessionSummary.m)) {
                                                                    if (mlc.q((Object)this.n, (Object)voiceSessionSummary.n)) {
                                                                        return true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int l = smk.l((this.i.hashCode() + (this.h.hashCode() + smk.j(smk.j(hia.d(hia.d((VoiceSessionId.b(this.c) + smk.j(this.a.hashCode() * 31, 31, this.b)) * 31, this.d, 31), this.e, 31), 31, this.f), 31, this.g)) * 31) * 31, 31, this.j);
        int hashCode = 0;
        final String k = this.k;
        int c;
        if (k == null) {
            c = 0;
        }
        else {
            c = AudioCaptureSessionId.c(k);
        }
        final int i = smk.l((l + c) * 31, 31, this.l);
        final Long m = this.m;
        int hashCode2;
        if (m == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = m.hashCode();
        }
        final Long n = this.n;
        if (n != null) {
            hashCode = n.hashCode();
        }
        return (i + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = OrganizationId.a(this.a);
        final String b = ChatId.b(this.b);
        final String c = VoiceSessionId.c(this.c);
        final String k = this.k;
        String d;
        if (k == null) {
            d = "null";
        }
        else {
            d = AudioCaptureSessionId.d(k);
        }
        final StringBuilder t = oz1.t("VoiceSessionSummary(organizationId=", a, ", conversationId=", b, ", voiceSessionId=");
        t.append(c);
        t.append(", sessionDurationMs=");
        t.append(this.d);
        smk.y(t, ", numTurns=", this.e, ", inputType=");
        oz1.A(t, this.f, ", outputType=", this.g, ", activationMode=");
        t.append((Object)this.h);
        t.append(", entrySource=");
        t.append((Object)this.i);
        t.append(", isTemporary=");
        a6l.k(t, this.j, ", audioCaptureSessionId=", d, ", isDictation=");
        t.append(this.l);
        t.append(", numFocusLosses=");
        t.append((Object)this.m);
        t.append(", focusTransientLossTotalMs=");
        return t.k(t, this.n, ")");
    }
}
