package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.FileId;

@jzk
public final class MessageImageFile implements MessageFile
{
    public static final n5f Companion;
    public final String a = a;
    public final String b = b;
    public final MessageImageAsset c = c;
    public final MessageImageAsset d;
    public final hfc e;
    public final String f;
    public final String g;
    public final Long h;
    public final String i;
    
    static {
        Companion = (n5f)new Object();
    }
    
    public MessageImageFile(final String a, final String b, final MessageImageAsset c, final MessageImageAsset d, final Long h, final String i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final String a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageImageFile)) {
            return false;
        }
        final MessageImageFile messageImageFile = (MessageImageFile)o;
        return FileId.b(this.a, messageImageFile.a) && mlc.q((Object)this.b, (Object)messageImageFile.b) && mlc.q((Object)this.c, (Object)messageImageFile.c) && mlc.q((Object)this.d, (Object)messageImageFile.d) && mlc.q((Object)this.e, (Object)messageImageFile.e) && mlc.q((Object)this.f, (Object)messageImageFile.f) && mlc.q((Object)this.g, (Object)messageImageFile.g) && mlc.q((Object)this.h, (Object)messageImageFile.h) && mlc.q((Object)this.i, (Object)messageImageFile.i);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(FileId.c(this.a) * 31, 31, this.b);
        final int hashCode = this.c.hashCode();
        int hashCode2 = 0;
        final MessageImageAsset d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final hfc e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final String f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final String g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final Long h = this.h;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final String i = this.i;
        if (i != null) {
            hashCode2 = i.hashCode();
        }
        return ((((((hashCode + j) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("MessageImageFile(file_uuid=", FileId.d(this.a), ", file_name=", this.b, ", thumbnail_asset=");
        t.append((Object)this.c);
        t.append(", preview_asset=");
        t.append((Object)this.d);
        t.append(", created_at=");
        t.append((Object)this.e);
        t.append(", path=");
        t.append(this.f);
        t.append(", sanitized_name=");
        tj0.s(t, this.g, ", size_bytes=", this.h, ", document_id=");
        return oz1.p(t, this.i, ")");
    }
}
