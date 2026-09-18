package com.anthropic.claude.api.mcp;

import com.anthropic.claude.types.strings.McpToolKey;
import kotlinx.serialization.json.JsonObject;

@jzk
public final class McpTool
{
    public static final zme Companion;
    public final String a = a;
    public final String b;
    public final String c;
    public final String d;
    public final McpToolAnnotations e;
    public final String f;
    public final String g;
    public final McpToolMeta h;
    public final McpToolMaxPermission i;
    public final McpToolMaxPermission j;
    public final JsonObject k;
    
    static {
        Companion = (zme)new Object();
    }
    
    public McpTool(final String a, final String b, final String c, final String d, final McpToolAnnotations e, final String f, final String g, final McpToolMeta h, final McpToolMaxPermission i, final McpToolMaxPermission j, final JsonObject k) {
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
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpTool)) {
            return false;
        }
        final McpTool mcpTool = (McpTool)o;
        if (!mlc.q((Object)this.a, (Object)mcpTool.a)) {
            return false;
        }
        if (!mlc.q((Object)this.b, (Object)mcpTool.b)) {
            return false;
        }
        if (!mlc.q((Object)this.c, (Object)mcpTool.c)) {
            return false;
        }
        if (!mlc.q((Object)this.d, (Object)mcpTool.d)) {
            return false;
        }
        if (!mlc.q((Object)this.e, (Object)mcpTool.e)) {
            return false;
        }
        final String f = mcpTool.f;
        final String f2 = this.f;
        boolean equals = false;
        Label_0145: {
            if (f2 == null) {
                if (f == null) {
                    equals = true;
                    break Label_0145;
                }
            }
            else if (f != null) {
                equals = f2.equals(f);
                break Label_0145;
            }
            equals = false;
        }
        if (!equals) {
            return false;
        }
        final String g = mcpTool.g;
        final String g2 = this.g;
        if (g2 == null) {
            if (g == null) {
                final boolean equals2 = true;
                return equals2 && mlc.q((Object)this.h, (Object)mcpTool.h) && this.i == mcpTool.i && this.j == mcpTool.j && mlc.q((Object)this.k, (Object)mcpTool.k);
            }
        }
        else if (g != null) {
            final boolean equals2 = g2.equals(g);
            return equals2 && mlc.q((Object)this.h, (Object)mcpTool.h) && this.i == mcpTool.i && this.j == mcpTool.j && mlc.q((Object)this.k, (Object)mcpTool.k);
        }
        final boolean equals2 = false;
        return equals2 && mlc.q((Object)this.h, (Object)mcpTool.h) && this.i == mcpTool.i && this.j == mcpTool.j && mlc.q((Object)this.k, (Object)mcpTool.k);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final String b = this.b;
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
        final McpToolAnnotations e = this.e;
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
        final String g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final McpToolMeta h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final McpToolMaxPermission i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final McpToolMaxPermission j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final JsonObject k = this.k;
        if (k != null) {
            hashCode2 = k.v.hashCode();
        }
        return (((((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        String a = "null";
        final String f = this.f;
        String a2;
        if (f == null) {
            a2 = "null";
        }
        else {
            a2 = McpToolKey.a(f);
        }
        final String g = this.g;
        if (g != null) {
            a = McpToolKey.a(g);
        }
        final StringBuilder t = oz1.t("McpTool(name=", this.a, ", description=", this.b, ", display_description=");
        oz1.A(t, this.c, ", displayName=", this.d, ", annotations=");
        t.append((Object)this.e);
        t.append(", enabled_key=");
        t.append(a2);
        t.append(", always_approved_key=");
        t.append(a);
        t.append(", _meta=");
        t.append((Object)this.h);
        t.append(", effective_max_permission=");
        t.append((Object)this.i);
        t.append(", default_user_permission=");
        t.append((Object)this.j);
        t.append(", bootstrapEntry=");
        t.append((Object)this.k);
        t.append(")");
        return t.toString();
    }
}
