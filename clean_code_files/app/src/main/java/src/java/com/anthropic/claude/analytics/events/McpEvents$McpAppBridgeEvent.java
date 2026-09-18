package com.anthropic.claude.analytics.events;

@jzk
public final class McpEvents$McpAppBridgeEvent implements v10
{
    public static final che Companion;
    public final String a = a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    
    static {
        Companion = (che)new Object();
    }
    
    public McpEvents$McpAppBridgeEvent(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final String a() {
        return "mcp_app.bridge_event";
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpEvents$McpAppBridgeEvent)) {
            return false;
        }
        final McpEvents$McpAppBridgeEvent mcpEvents$McpAppBridgeEvent = (McpEvents$McpAppBridgeEvent)o;
        return mlc.q((Object)this.a, (Object)mcpEvents$McpAppBridgeEvent.a) && mlc.q((Object)this.b, (Object)mcpEvents$McpAppBridgeEvent.b) && mlc.q((Object)this.c, (Object)mcpEvents$McpAppBridgeEvent.c) && mlc.q((Object)this.d, (Object)mcpEvents$McpAppBridgeEvent.d) && mlc.q((Object)this.e, (Object)mcpEvents$McpAppBridgeEvent.e) && mlc.q((Object)this.f, (Object)mcpEvents$McpAppBridgeEvent.f) && mlc.q((Object)this.g, (Object)mcpEvents$McpAppBridgeEvent.g) && mlc.q((Object)this.h, (Object)mcpEvents$McpAppBridgeEvent.h) && mlc.q((Object)this.i, (Object)mcpEvents$McpAppBridgeEvent.i);
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
        final int j = smk.j((hashCode * 31 + hashCode3) * 31, 31, this.c);
        final String d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final int i = smk.j((j + hashCode4) * 31, 31, this.e);
        final String f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final String g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final String h = this.h;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final String k = this.i;
        if (k != null) {
            hashCode2 = k.hashCode();
        }
        return (((i + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = oz1.t("McpAppBridgeEvent(organization_uuid=", this.a, ", server_uuid=", this.b, ", tool_name=");
        oz1.A(t, this.c, ", tool_use_id=", this.d, ", event_type=");
        oz1.A(t, this.e, ", server_name=", this.f, ", redacted_url=");
        oz1.A(t, this.g, ", log_logger=", this.h, ", host_view_session_id=");
        return oz1.p(t, this.i, ")");
    }
}
