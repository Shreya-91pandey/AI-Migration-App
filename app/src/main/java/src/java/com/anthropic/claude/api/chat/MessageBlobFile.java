package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.FileId;

@jzk
public final class MessageBlobFile implements MessageFile
{
    public static final v1f Companion;
    public final String a = a;
    public final String b = b;
    public final hfc c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;
    
    static {
        Companion = (v1f)new Object();
    }
    
    public MessageBlobFile(final int n, Long f, final String a, final String b, String d, String e) {
        if ((n & 0x8) != 0x0) {
            d = null;
        }
        if ((n & 0x10) != 0x0) {
            e = null;
        }
        if ((n & 0x20) != 0x0) {
            f = null;
        }
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = null;
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
        if (!(o instanceof MessageBlobFile)) {
            return false;
        }
        final MessageBlobFile messageBlobFile = (MessageBlobFile)o;
        return FileId.b(this.a, messageBlobFile.a) && mlc.q((Object)this.b, (Object)messageBlobFile.b) && mlc.q((Object)this.c, (Object)messageBlobFile.c) && mlc.q((Object)this.d, (Object)messageBlobFile.d) && mlc.q((Object)this.e, (Object)messageBlobFile.e) && mlc.q((Object)this.f, (Object)messageBlobFile.f) && mlc.q((Object)this.g, (Object)messageBlobFile.g);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(FileId.c(this.a) * 31, 31, this.b);
        int hashCode = 0;
        final hfc c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final String d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final Long f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final String g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((((j + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("MessageBlobFile(file_uuid=", FileId.d(this.a), ", file_name=", this.b, ", created_at=");
        t.append((Object)this.c);
        t.append(", path=");
        t.append(this.d);
        t.append(", sanitized_name=");
        tj0.s(t, this.e, ", size_bytes=", this.f, ", download_source=");
        return oz1.p(t, this.g, ")");
    }
}
