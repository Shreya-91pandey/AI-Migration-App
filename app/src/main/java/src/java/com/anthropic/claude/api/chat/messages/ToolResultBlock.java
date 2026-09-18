package com.anthropic.claude.api.chat.messages;

import java.util.Set;
import kotlinx.serialization.json.JsonObject;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import java.util.List;

@jzk
public final class ToolResultBlock implements ContentBlock
{
    public static final t6o Companion;
    public static final d2d[] q;
    public final hfc a;
    public final hfc b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;
    public final String g;
    public final ToolDisplayContent h;
    public final String i;
    public final String j;
    public final String k;
    public final JsonObject l;
    public final JsonObject m;
    public final Boolean n;
    public final String o;
    public final Set p;
    
    static {
        Companion = (t6o)new Object();
        q = new d2d[] { null, null, null, null, ncq.F(2, (jta)new smn((byte)18)), null, null, ncq.F(2, (jta)new smn((byte)19)), null, null, null, null, null, null, null, ncq.F(2, (jta)new smn((byte)20)) };
    }
    
    public ToolResultBlock(final hfc a, final hfc b, final String c, final String d, final List e, final boolean f, final String g, final ToolDisplayContent h, final String i, final String j, final String k, final JsonObject l, final JsonObject m, final Boolean n, final String o, final Set p16) {
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
        this.p = p16;
    }
    
    public static ToolResultBlock d(final ToolResultBlock toolResultBlock, List e, Set p4, final int n) {
        final hfc a = toolResultBlock.a;
        hfc b;
        if ((n & 0x2) != 0x0) {
            b = toolResultBlock.b;
        }
        else {
            b = null;
        }
        final String c = toolResultBlock.c;
        final String d = toolResultBlock.d;
        if ((n & 0x10) != 0x0) {
            e = toolResultBlock.e;
        }
        final boolean f = toolResultBlock.f;
        final String g = toolResultBlock.g;
        final ToolDisplayContent h = toolResultBlock.h;
        final String i = toolResultBlock.i;
        final String j = toolResultBlock.j;
        final String k = toolResultBlock.k;
        final JsonObject l = toolResultBlock.l;
        final JsonObject m = toolResultBlock.m;
        final Boolean n2 = toolResultBlock.n;
        final String o = toolResultBlock.o;
        if ((n & 0x8000) != 0x0) {
            p4 = toolResultBlock.p;
        }
        toolResultBlock.getClass();
        return new ToolResultBlock(a, b, c, d, e, f, g, h, i, j, k, l, m, n2, o, p4);
    }
    
    @Override
    public final Set a() {
        return this.p;
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
        if (!(o instanceof ToolResultBlock)) {
            return false;
        }
        final ToolResultBlock toolResultBlock = (ToolResultBlock)o;
        return mlc.q((Object)this.a, (Object)toolResultBlock.a) && mlc.q((Object)this.b, (Object)toolResultBlock.b) && mlc.q((Object)this.c, (Object)toolResultBlock.c) && mlc.q((Object)this.d, (Object)toolResultBlock.d) && mlc.q((Object)this.e, (Object)toolResultBlock.e) && this.f == toolResultBlock.f && mlc.q((Object)this.g, (Object)toolResultBlock.g) && mlc.q((Object)this.h, (Object)toolResultBlock.h) && mlc.q((Object)this.i, (Object)toolResultBlock.i) && mlc.q((Object)this.j, (Object)toolResultBlock.j) && mlc.q((Object)this.k, (Object)toolResultBlock.k) && mlc.q((Object)this.l, (Object)toolResultBlock.l) && mlc.q((Object)this.m, (Object)toolResultBlock.m) && mlc.q((Object)this.n, (Object)toolResultBlock.n) && mlc.q((Object)this.o, (Object)toolResultBlock.o) && mlc.q((Object)this.p, (Object)toolResultBlock.p);
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
        final int l = smk.l(smk.k((j + hashCode4) * 31, 31, this.e), 31, this.f);
        final String g = this.g;
        int hashCode5;
        if (g == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = g.hashCode();
        }
        final ToolDisplayContent h = this.h;
        int hashCode6;
        if (h == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = h.hashCode();
        }
        final String i = this.i;
        int hashCode7;
        if (i == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = i.hashCode();
        }
        final String k = this.j;
        int hashCode8;
        if (k == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = k.hashCode();
        }
        final String m = this.k;
        int hashCode9;
        if (m == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = m.hashCode();
        }
        final JsonObject l2 = this.l;
        int hashCode10;
        if (l2 == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = l2.v.hashCode();
        }
        final JsonObject m2 = this.m;
        int hashCode11;
        if (m2 == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = m2.v.hashCode();
        }
        final Boolean n = this.n;
        int hashCode12;
        if (n == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = n.hashCode();
        }
        final String o = this.o;
        int hashCode13;
        if (o == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = o.hashCode();
        }
        final Set p = this.p;
        if (p != null) {
            hashCode = p.hashCode();
        }
        return (((((((((l + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ToolResultBlock(start_timestamp=");
        sb.append((Object)this.a);
        sb.append(", stop_timestamp=");
        sb.append((Object)this.b);
        sb.append(", name=");
        oz1.A(sb, this.c, ", tool_use_id=", this.d, ", content=");
        sb.append((Object)this.e);
        sb.append(", is_error=");
        sb.append(this.f);
        sb.append(", message=");
        sb.append(this.g);
        sb.append(", display_content=");
        sb.append((Object)this.h);
        sb.append(", integration_name=");
        oz1.A(sb, this.i, ", integration_icon_url=", this.j, ", icon_name=");
        sb.append(this.k);
        sb.append(", structured_content=");
        sb.append((Object)this.l);
        sb.append(", meta=");
        sb.append((Object)this.m);
        sb.append(", hidden_in_chat=");
        sb.append((Object)this.n);
        sb.append(", tool_origin=");
        sb.append(this.o);
        sb.append(", flags=");
        sb.append((Object)this.p);
        sb.append(")");
        return sb.toString();
    }
}
