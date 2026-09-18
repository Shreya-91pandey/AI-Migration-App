package com.anthropic.claude.api.chat.tool;

@jzk
public final class ToolResultKnowledge implements ToolResultContent
{
    public static final f7o Companion;
    public static final d2d[] d;
    public final String a = a;
    public final String b;
    public final SourceMetadata c;
    
    static {
        Companion = (f7o)new Object();
        d = new d2d[] { null, null, ncq.F(2, (jta)new smn((byte)22)) };
    }
    
    public ToolResultKnowledge(final String a, final String b, final WebpageMetadata c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ToolResultKnowledge)) {
            return false;
        }
        final ToolResultKnowledge toolResultKnowledge = (ToolResultKnowledge)o;
        return mlc.q((Object)this.a, (Object)toolResultKnowledge.a) && mlc.q((Object)this.b, (Object)toolResultKnowledge.b) && mlc.q((Object)this.c, (Object)toolResultKnowledge.c);
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
        return this.c.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("ToolResultKnowledge(title=", this.a, ", url=", this.b, ", metadata=");
        t.append((Object)this.c);
        t.append(")");
        return t.toString();
    }
}
