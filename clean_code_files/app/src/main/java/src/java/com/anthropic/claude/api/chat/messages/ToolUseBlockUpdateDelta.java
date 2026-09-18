package com.anthropic.claude.api.chat.messages;

import java.util.List;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;

@jzk
public final class ToolUseBlockUpdateDelta implements ContentBlockDelta
{
    public static final k9o Companion;
    public static final d2d[] h;
    public final String a;
    public final ToolDisplayContent b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    
    static {
        Companion = (k9o)new Object();
        h = new d2d[] { null, ncq.F(2, (jta)new smn((byte)28)), null, null, null, null, ncq.F(2, (jta)new smn((byte)29)) };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ToolUseBlockUpdateDelta)) {
            return false;
        }
        final ToolUseBlockUpdateDelta toolUseBlockUpdateDelta = (ToolUseBlockUpdateDelta)o;
        return mlc.q((Object)this.a, (Object)toolUseBlockUpdateDelta.a) && mlc.q((Object)this.b, (Object)toolUseBlockUpdateDelta.b) && mlc.q((Object)this.c, (Object)toolUseBlockUpdateDelta.c) && mlc.q((Object)this.d, (Object)toolUseBlockUpdateDelta.d) && mlc.q((Object)this.e, (Object)toolUseBlockUpdateDelta.e) && mlc.q((Object)this.f, (Object)toolUseBlockUpdateDelta.f) && mlc.q((Object)this.g, (Object)toolUseBlockUpdateDelta.g);
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
        final ToolDisplayContent b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final List g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return (((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ToolUseBlockUpdateDelta(message=");
        sb.append(this.a);
        sb.append(", display_content=");
        sb.append((Object)this.b);
        sb.append(", integration_name=");
        oz1.A(sb, this.c, ", integration_icon_url=", this.d, ", icon_name=");
        oz1.A(sb, this.e, ", approval_key=", this.f, ", approval_options=");
        return p3g.e(sb, this.g, ")");
    }
}
