package com.anthropic.claude.api.chat.messages;

@jzk
public final class CitationEndDelta implements ContentBlockDelta
{
    public static final sr4 Companion;
    public final String a = a;
    
    static {
        Companion = (sr4)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof CitationEndDelta && mlc.q((Object)this.a, (Object)((CitationEndDelta)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("CitationEndDelta(citation_uuid=", this.a, ")");
    }
}
