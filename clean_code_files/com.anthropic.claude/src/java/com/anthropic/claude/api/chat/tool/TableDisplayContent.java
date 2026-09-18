package com.anthropic.claude.api.chat.tool;

import java.util.Set;
import java.util.List;

@jzk
public final class TableDisplayContent implements ToolDisplayContent
{
    public static final oan Companion;
    public static final d2d[] c;
    public final List a = a;
    public final Set b;
    
    static {
        Companion = (oan)new Object();
        c = new d2d[] { ncq.F(2, (jta)new s8k((byte)24)), ncq.F(2, (jta)new s8k((byte)25)) };
    }
    
    public TableDisplayContent(final List a, final Set b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TableDisplayContent)) {
            return false;
        }
        final TableDisplayContent tableDisplayContent = (TableDisplayContent)o;
        return mlc.q((Object)this.a, (Object)tableDisplayContent.a) && mlc.q((Object)this.b, (Object)tableDisplayContent.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TableDisplayContent(table=");
        sb.append((Object)this.a);
        sb.append(", truncatedRows=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
