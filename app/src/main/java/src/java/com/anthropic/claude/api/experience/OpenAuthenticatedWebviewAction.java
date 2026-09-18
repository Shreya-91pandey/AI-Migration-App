package com.anthropic.claude.api.experience;

import com.anthropic.claude.types.OriginRelativePath;

@jzk
public final class OpenAuthenticatedWebviewAction implements ExperienceClientAction
{
    public static final dcg Companion;
    public final String a;
    public final String b;
    
    static {
        Companion = new dcg();
    }
    
    public OpenAuthenticatedWebviewAction(final int n, final String a, final String b) {
        if (0x1 != (n & 0x1)) {
            iwq.r(n, 1, ccg.a.getDescriptor());
            throw null;
        }
        this.a = a;
        if ((n & 0x2) == 0x0) {
            this.b = null;
        }
        else {
            this.b = b;
        }
        if (!OriginRelativePath.d(a).equals("/")) {
            return;
        }
        en9.s("url_path is the origin root, not a page");
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpenAuthenticatedWebviewAction)) {
            return false;
        }
        final OpenAuthenticatedWebviewAction openAuthenticatedWebviewAction = (OpenAuthenticatedWebviewAction)o;
        return OriginRelativePath.c(this.a, openAuthenticatedWebviewAction.a) && mlc.q((Object)this.b, (Object)openAuthenticatedWebviewAction.b);
    }
    
    @Override
    public final int hashCode() {
        final int e = OriginRelativePath.e(this.a);
        final String b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return e * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return hia.k("OpenAuthenticatedWebviewAction(url_path=\u2588\u2588, title=", this.b, ")");
    }
}
