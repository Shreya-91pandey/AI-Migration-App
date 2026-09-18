package com.anthropic.claude.api.chat.tool;

@jzk
public final class WebpageMetadata implements SourceMetadata
{
    public static final iup Companion;
    public final String a;
    public final String b;
    public final String c;
    
    static {
        Companion = (iup)new Object();
    }
    
    public WebpageMetadata(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WebpageMetadata)) {
            return false;
        }
        final WebpageMetadata webpageMetadata = (WebpageMetadata)o;
        return mlc.q((Object)this.a, (Object)webpageMetadata.a) && mlc.q((Object)this.b, (Object)webpageMetadata.b) && mlc.q((Object)this.c, (Object)webpageMetadata.c);
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
        if (b != null) {
            hashCode = b.hashCode();
        }
        return this.c.hashCode() + (hashCode2 * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        return oz1.p(oz1.t("WebpageMetadata(favicon_url=", this.a, ", site_name=", this.b, ", site_domain="), this.c, ")");
    }
}
