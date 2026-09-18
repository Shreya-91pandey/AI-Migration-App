package com.anthropic.claude.api.chat.messages;

import java.util.Set;

@jzk
public final class VoiceNoteBlock implements ContentBlock
{
    public static final onp Companion;
    public static final d2d[] f;
    public final hfc a;
    public final hfc b;
    public final String c;
    public final String d;
    public final Set e;
    
    static {
        Companion = (onp)new Object();
        f = new d2d[] { null, null, null, null, ncq.F(2, (jta)new axo((byte)7)) };
    }
    
    public VoiceNoteBlock(final hfc a, final hfc b, final String c, final String d, final Set e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static VoiceNoteBlock d(final VoiceNoteBlock voiceNoteBlock, hfc a, hfc b, String c, String d, Set e, final int n) {
        if ((n & 0x1) != 0x0) {
            a = voiceNoteBlock.a;
        }
        if ((n & 0x2) != 0x0) {
            b = voiceNoteBlock.b;
        }
        if ((n & 0x4) != 0x0) {
            c = voiceNoteBlock.c;
        }
        if ((n & 0x8) != 0x0) {
            d = voiceNoteBlock.d;
        }
        if ((n & 0x10) != 0x0) {
            e = voiceNoteBlock.e;
        }
        voiceNoteBlock.getClass();
        return new VoiceNoteBlock(a, b, c, d, e);
    }
    
    @Override
    public final Set a() {
        return this.e;
    }
    
    @Override
    public final hfc b() {
        return this.b;
    }
    
    @Override
    public final hfc c() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VoiceNoteBlock)) {
            return false;
        }
        final VoiceNoteBlock voiceNoteBlock = (VoiceNoteBlock)o;
        return mlc.q((Object)this.a, (Object)voiceNoteBlock.a) && mlc.q((Object)this.b, (Object)voiceNoteBlock.b) && mlc.q((Object)this.c, (Object)voiceNoteBlock.c) && mlc.q((Object)this.d, (Object)voiceNoteBlock.d) && mlc.q((Object)this.e, (Object)voiceNoteBlock.e);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final hfc a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final hfc b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Set e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("VoiceNoteBlock(start_timestamp=");
        sb.append((Object)this.a);
        sb.append(", stop_timestamp=");
        sb.append((Object)this.b);
        sb.append(", text=");
        oz1.A(sb, this.c, ", title=", this.d, ", flags=");
        sb.append((Object)this.e);
        sb.append(")");
        return sb.toString();
    }
}
