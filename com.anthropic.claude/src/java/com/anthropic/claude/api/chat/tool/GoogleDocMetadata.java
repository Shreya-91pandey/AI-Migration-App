package com.anthropic.claude.api.chat.tool;

@jzk
public final class GoogleDocMetadata implements SourceMetadata
{
    public static final v3b Companion;
    public final String a = a;
    public final String b;
    
    static {
        Companion = (v3b)new Object();
    }
    
    public GoogleDocMetadata(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GoogleDocMetadata)) {
            return false;
        }
        final GoogleDocMetadata googleDocMetadata = (GoogleDocMetadata)o;
        return mlc.q((Object)this.a, (Object)googleDocMetadata.a) && mlc.q((Object)this.b, (Object)googleDocMetadata.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        return lmf.t("GoogleDocMetadata(doc_uuid=", this.a, ", owner=", this.b, ")");
    }
}
