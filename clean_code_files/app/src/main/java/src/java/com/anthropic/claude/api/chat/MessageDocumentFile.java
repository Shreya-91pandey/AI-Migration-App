package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.FileId;

@jzk
public final class MessageDocumentFile implements MessageFile
{
    public static final g3f Companion;
    public final String a = a;
    public final String b = b;
    public final MessageImageAsset c = c;
    public final MessageDocumentAsset d = d;
    public final hfc e;
    public final String f;
    public final String g;
    public final Long h;
    public final String i;
    
    static {
        Companion = (g3f)new Object();
    }
    
    public MessageDocumentFile(final String a, final String b, final MessageImageAsset c, final MessageDocumentAsset d, final Long h, final String i) {
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
        if (!(o instanceof MessageDocumentFile)) {
            return false;
        }
        final MessageDocumentFile messageDocumentFile = (MessageDocumentFile)o;
        return FileId.b(this.a, messageDocumentFile.a) && mlc.q((Object)this.b, (Object)messageDocumentFile.b) && mlc.q((Object)this.c, (Object)messageDocumentFile.c) && mlc.q((Object)this.d, (Object)messageDocumentFile.d) && mlc.q((Object)this.e, (Object)messageDocumentFile.e) && mlc.q((Object)this.f, (Object)messageDocumentFile.f) && mlc.q((Object)this.g, (Object)messageDocumentFile.g) && mlc.q((Object)this.h, (Object)messageDocumentFile.h) && mlc.q((Object)this.i, (Object)messageDocumentFile.i);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(FileId.c(this.a) * 31, 31, this.b);
        final int hashCode = this.c.hashCode();
        final int hashCode2 = this.d.hashCode();
        int hashCode3 = 0;
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
            hashCode3 = i.hashCode();
        }
        return (((((hashCode2 + (hashCode + j) * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("MessageDocumentFile(file_uuid=", FileId.d(this.a), ", file_name=", this.b, ", thumbnail_asset=");
        t.append((Object)this.c);
        t.append(", document_asset=");
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
