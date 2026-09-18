package com.anthropic.claude.api.chat.tool;

@jzk
public final class CodeBlockDisplayContent implements ToolDisplayContent
{
    public static final b75 Companion;
    public final String a = a;
    public final String b = b;
    public final String c;
    public final boolean d;
    
    static {
        Companion = (b75)new Object();
    }
    
    public CodeBlockDisplayContent(final String a, final String b, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CodeBlockDisplayContent)) {
            return false;
        }
        final CodeBlockDisplayContent codeBlockDisplayContent = (CodeBlockDisplayContent)o;
        return mlc.q((Object)this.a, (Object)codeBlockDisplayContent.a) && mlc.q((Object)this.b, (Object)codeBlockDisplayContent.b) && mlc.q((Object)this.c, (Object)codeBlockDisplayContent.c) && this.d == codeBlockDisplayContent.d;
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(this.a.hashCode() * 31, 31, this.b);
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return Boolean.hashCode(this.d) + (j + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        return xc2.l(oz1.t("CodeBlockDisplayContent(language=", this.a, ", code=", this.b, ", filename="), this.c, ", isTruncated=", this.d, ")");
    }
}
