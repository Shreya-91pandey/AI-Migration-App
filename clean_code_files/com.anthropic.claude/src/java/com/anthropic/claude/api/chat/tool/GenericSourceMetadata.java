package com.anthropic.claude.api.chat.tool;

@jzk
public final class GenericSourceMetadata implements SourceMetadata
{
    public static final fxa Companion;
    public final String a;
    public final String b;
    public final String c;
    
    static {
        Companion = (fxa)new Object();
    }
    
    public GenericSourceMetadata(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenericSourceMetadata)) {
            return false;
        }
        final GenericSourceMetadata genericSourceMetadata = (GenericSourceMetadata)o;
        return mlc.q((Object)this.a, (Object)genericSourceMetadata.a) && mlc.q((Object)this.b, (Object)genericSourceMetadata.b) && mlc.q((Object)this.c, (Object)genericSourceMetadata.c);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final String a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return oz1.p(oz1.t("GenericSourceMetadata(preview_title=", this.a, ", icon_url=", this.b, ", source="), this.c, ")");
    }
}
