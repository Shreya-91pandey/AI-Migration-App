package com.anthropic.claude.api.mcp;

import com.anthropic.claude.types.strings.McpServerId;
import kotlinx.serialization.json.JsonObject;
import java.util.Set;
import java.util.List;

@jzk
public final class McpServer
{
    public static final sle Companion;
    public static final d2d[] r;
    public final String a = a;
    public final String b = b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final Boolean f;
    public final McpAuthStatus g;
    public final String h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final Set m;
    public final JsonObject n;
    public final ConnectorOrigin o;
    public final String p;
    public final String q;
    
    static {
        Companion = (sle)new Object();
        r = new d2d[] { null, null, null, null, null, null, null, null, ncq.F(2, (jta)new v0e((byte)7)), ncq.F(2, (jta)new v0e((byte)8)), ncq.F(2, (jta)new v0e((byte)9)), ncq.F(2, (jta)new v0e((byte)10)), ncq.F(2, (jta)new v0e((byte)11)), null, null, null, null };
    }
    
    public McpServer(final String a, final String b, final String c, final String d, final Boolean e, final Boolean f, final McpAuthStatus g, final String h, final List i, final List j, final List k, final List l, final Set m, final JsonObject n, final ConnectorOrigin o, final String p17, final String q) {
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
        this.p = p17;
        this.q = q;
    }
    
    public static McpServer a(final McpServer mcpServer, List i, List j, List k, final int n) {
        Boolean b = Boolean.FALSE;
        final String a = mcpServer.a;
        final String b2 = mcpServer.b;
        final String c = mcpServer.c;
        final String d = mcpServer.d;
        if ((n & 0x10) != 0x0) {
            b = mcpServer.e;
        }
        final Boolean f = mcpServer.f;
        final McpAuthStatus g = mcpServer.g;
        final String h = mcpServer.h;
        if ((n & 0x100) != 0x0) {
            i = mcpServer.i;
        }
        if ((n & 0x200) != 0x0) {
            j = mcpServer.j;
        }
        if ((n & 0x400) != 0x0) {
            k = mcpServer.k;
        }
        return new McpServer(a, b2, c, d, b, f, g, h, i, j, k, mcpServer.l, mcpServer.m, mcpServer.n, mcpServer.o, mcpServer.p, mcpServer.q);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpServer)) {
            return false;
        }
        final McpServer mcpServer = (McpServer)o;
        return mlc.q((Object)this.a, (Object)mcpServer.a) && mlc.q((Object)this.b, (Object)mcpServer.b) && mlc.q((Object)this.c, (Object)mcpServer.c) && mlc.q((Object)this.d, (Object)mcpServer.d) && mlc.q((Object)this.e, (Object)mcpServer.e) && mlc.q((Object)this.f, (Object)mcpServer.f) && this.g == mcpServer.g && mlc.q((Object)this.h, (Object)mcpServer.h) && mlc.q((Object)this.i, (Object)mcpServer.i) && mlc.q((Object)this.j, (Object)mcpServer.j) && mlc.q((Object)this.k, (Object)mcpServer.k) && mlc.q((Object)this.l, (Object)mcpServer.l) && mlc.q((Object)this.m, (Object)mcpServer.m) && mlc.q((Object)this.n, (Object)mcpServer.n) && this.o == mcpServer.o && mlc.q((Object)this.p, (Object)mcpServer.p) && mlc.q((Object)this.q, (Object)mcpServer.q);
    }
    
    @Override
    public final int hashCode() {
        final int j = smk.j(this.a.hashCode() * 31, 31, this.b);
        final int n = 0;
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final String d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final Boolean e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = e.hashCode();
        }
        final Boolean f = this.f;
        int hashCode4;
        if (f == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = f.hashCode();
        }
        final McpAuthStatus g = this.g;
        int hashCode5;
        if (g == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = g.hashCode();
        }
        final String h = this.h;
        int hashCode6;
        if (h == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = h.hashCode();
        }
        final List i = this.i;
        int hashCode7;
        if (i == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = i.hashCode();
        }
        final List k = this.j;
        int hashCode8;
        if (k == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = k.hashCode();
        }
        final List l = this.k;
        int hashCode9;
        if (l == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = l.hashCode();
        }
        final List m = this.l;
        int hashCode10;
        if (m == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = m.hashCode();
        }
        final int o = lmf.o(this.m, ((((((((((j + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31, 31);
        final JsonObject n2 = this.n;
        int hashCode11;
        if (n2 == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = n2.v.hashCode();
        }
        final ConnectorOrigin o2 = this.o;
        int hashCode12;
        if (o2 == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = o2.hashCode();
        }
        final String p = this.p;
        int hashCode13;
        if (p == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = p.hashCode();
        }
        final String q = this.q;
        int hashCode14;
        if (q == null) {
            hashCode14 = n;
        }
        else {
            hashCode14 = q.hashCode();
        }
        return (((o + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("McpServer(uuid=", McpServerId.a(this.a), ", name=", this.b, ", url=");
        oz1.A(t, this.c, ", custom_oauth_client_id=", this.d, ", connected=");
        ju4.h(t, this.e, ", usedAuthentication=", this.f, ", authStatus=");
        t.append((Object)this.g);
        t.append(", iconUrl=");
        t.append(this.h);
        t.append(", tools=");
        t.append((Object)this.i);
        t.append(", prompts=");
        t.append((Object)this.j);
        t.append(", resources=");
        t.append((Object)this.k);
        t.append(", allowed_link_domains=");
        t.append((Object)this.l);
        t.append(", cai_flags=");
        t.append((Object)this.m);
        t.append(", capabilities=");
        t.append((Object)this.n);
        t.append(", connectorOrigin=");
        t.append((Object)this.o);
        t.append(", directoryEntryName=");
        t.append(this.p);
        t.append(", mcpClientSessionId=");
        return oz1.p(t, this.q, ")");
    }
}
