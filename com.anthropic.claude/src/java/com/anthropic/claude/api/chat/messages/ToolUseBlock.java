package com.anthropic.claude.api.chat.messages;

import java.util.Set;
import java.util.List;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolUseInput;

@jzk
public final class ToolUseBlock implements ContentBlock
{
    public static final i9o Companion;
    public static final d2d[] s;
    public final hfc a;
    public final hfc b;
    public final String c;
    public final String d;
    public final ToolUseInput e;
    public final String f;
    public final ToolDisplayContent g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final Boolean n;
    public final Boolean o;
    public final String p;
    public final Boolean q;
    public final Set r;
    
    static {
        Companion = (i9o)new Object();
        s = new d2d[] { null, null, null, null, null, null, ncq.F(2, (jta)new smn((byte)25)), null, null, null, null, null, ncq.F(2, (jta)new smn((byte)26)), null, null, null, null, ncq.F(2, (jta)new smn((byte)27)) };
    }
    
    public ToolUseBlock(final hfc a, final hfc b, final String c, final String d, final ToolUseInput e, final String f, final ToolDisplayContent g, final String h, final String i, final String j, final String k, final String l, final List m, final Boolean n, final Boolean o, final String p18, final Boolean q, final Set r) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p18;
        this.q = q;
        this.r = r;
    }
    
    public static ToolUseBlock d(final ToolUseBlock toolUseBlock, ToolUseInput e, String f, ToolDisplayContent g, String h, String i, String k, String l, List m, Set r, final int n) {
        Boolean b = Boolean.FALSE;
        final hfc a = toolUseBlock.a;
        hfc b2;
        if ((n & 0x2) != 0x0) {
            b2 = toolUseBlock.b;
        }
        else {
            b2 = null;
        }
        final String c = toolUseBlock.c;
        final String d = toolUseBlock.d;
        if ((n & 0x10) != 0x0) {
            e = toolUseBlock.e;
        }
        if ((n & 0x20) != 0x0) {
            f = toolUseBlock.f;
        }
        if ((n & 0x40) != 0x0) {
            g = toolUseBlock.g;
        }
        if ((n & 0x80) != 0x0) {
            h = toolUseBlock.h;
        }
        if ((n & 0x100) != 0x0) {
            i = toolUseBlock.i;
        }
        final String j = toolUseBlock.j;
        if ((n & 0x400) != 0x0) {
            k = toolUseBlock.k;
        }
        if ((n & 0x800) != 0x0) {
            l = toolUseBlock.l;
        }
        if ((n & 0x1000) != 0x0) {
            m = toolUseBlock.m;
        }
        if ((n & 0x2000) != 0x0) {
            b = toolUseBlock.n;
        }
        final Boolean o = toolUseBlock.o;
        final String p11 = toolUseBlock.p;
        final Boolean q = toolUseBlock.q;
        if ((n & 0x20000) != 0x0) {
            r = toolUseBlock.r;
        }
        toolUseBlock.getClass();
        return new ToolUseBlock(a, b2, c, d, e, f, g, h, i, j, k, l, m, b, o, p11, q, r);
    }
    
    @Override
    public final Set a() {
        return this.r;
    }
    
    @Override
    public final hfc b() {
        return this.b;
    }
    
    @Override
    public final hfc c() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ToolUseBlock)) {
            return false;
        }
        final ToolUseBlock toolUseBlock = (ToolUseBlock)o;
        return mlc.q((Object)this.a, (Object)toolUseBlock.a) && mlc.q((Object)this.b, (Object)toolUseBlock.b) && mlc.q((Object)this.c, (Object)toolUseBlock.c) && mlc.q((Object)this.d, (Object)toolUseBlock.d) && mlc.q((Object)this.e, (Object)toolUseBlock.e) && mlc.q((Object)this.f, (Object)toolUseBlock.f) && mlc.q((Object)this.g, (Object)toolUseBlock.g) && mlc.q((Object)this.h, (Object)toolUseBlock.h) && mlc.q((Object)this.i, (Object)toolUseBlock.i) && mlc.q((Object)this.j, (Object)toolUseBlock.j) && mlc.q((Object)this.k, (Object)toolUseBlock.k) && mlc.q((Object)this.l, (Object)toolUseBlock.l) && mlc.q((Object)this.m, (Object)toolUseBlock.m) && mlc.q((Object)this.n, (Object)toolUseBlock.n) && mlc.q((Object)this.o, (Object)toolUseBlock.o) && mlc.q((Object)this.p, (Object)toolUseBlock.p) && mlc.q((Object)this.q, (Object)toolUseBlock.q) && mlc.q((Object)this.r, (Object)toolUseBlock.r);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final hfc a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final hfc b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int j = smk.j((hashCode2 * 31 + hashCode3) * 31, 31, this.c);
        final String d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final int hashCode5 = this.e.hashCode();
        final String f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final ToolDisplayContent g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        final String h = this.h;
        int hashCode8;
        if (h == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = h.hashCode();
        }
        final String i = this.i;
        int hashCode9;
        if (i == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = i.hashCode();
        }
        final String k = this.j;
        int hashCode10;
        if (k == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = k.hashCode();
        }
        final String l = this.k;
        int hashCode11;
        if (l == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = l.hashCode();
        }
        final String m = this.l;
        int hashCode12;
        if (m == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = m.hashCode();
        }
        final List m2 = this.m;
        int hashCode13;
        if (m2 == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = m2.hashCode();
        }
        final Boolean n = this.n;
        int hashCode14;
        if (n == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = n.hashCode();
        }
        final Boolean o = this.o;
        int hashCode15;
        if (o == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = o.hashCode();
        }
        final String p = this.p;
        int hashCode16;
        if (p == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = p.hashCode();
        }
        final Boolean q = this.q;
        int hashCode17;
        if (q == null) {
            hashCode17 = 0;
        }
        else {
            hashCode17 = q.hashCode();
        }
        final Set r = this.r;
        if (r != null) {
            hashCode = r.hashCode();
        }
        return (((((((((((((hashCode5 + (j + hashCode4) * 31) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode17) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ToolUseBlock(start_timestamp=");
        sb.append((Object)this.a);
        sb.append(", stop_timestamp=");
        sb.append((Object)this.b);
        sb.append(", name=");
        oz1.A(sb, this.c, ", id=", this.d, ", input=");
        sb.append((Object)this.e);
        sb.append(", message=");
        sb.append(this.f);
        sb.append(", display_content=");
        sb.append((Object)this.g);
        sb.append(", integration_name=");
        sb.append(this.h);
        sb.append(", integration_icon_url=");
        oz1.A(sb, this.i, ", tool_identifier=", this.j, ", icon_name=");
        oz1.A(sb, this.k, ", approval_key=", this.l, ", approval_options=");
        sb.append((Object)this.m);
        sb.append(", is_mcp_app=");
        sb.append((Object)this.n);
        sb.append(", hidden_in_chat=");
        xc2.p(sb, this.o, ", tool_origin=", this.p, ", input_incomplete=");
        sb.append((Object)this.q);
        sb.append(", flags=");
        sb.append((Object)this.r);
        sb.append(")");
        return sb.toString();
    }
}
