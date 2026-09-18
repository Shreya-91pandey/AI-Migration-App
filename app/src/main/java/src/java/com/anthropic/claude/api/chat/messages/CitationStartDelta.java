package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.chat.citation.Citation;

@jzk
public final class CitationStartDelta implements ContentBlockDelta
{
    public static final hs4 Companion;
    public final Citation a = a;
    
    static {
        Companion = (hs4)new Object();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof CitationStartDelta && mlc.q((Object)this.a, (Object)((CitationStartDelta)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CitationStartDelta(citation=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
