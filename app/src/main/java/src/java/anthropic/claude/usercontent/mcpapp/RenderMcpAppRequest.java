package anthropic.claude.usercontent.mcpapp;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class RenderMcpAppRequest extends a
{
    public static final ProtoAdapter<RenderMcpAppRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String connector_url;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String conversation_uuid;
    @h3q(adapter = "anthropic.claude.usercontent.mcpapp.McpAppHostCapability#ADAPTER", label = g3q.x, schemaIndex = 6, tag = 7)
    private final List<McpAppHostCapability> host_capabilities;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 2, tag = 3)
    private final String sandbox_url_query;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 3, tag = 4)
    private final String server_name;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 1, tag = 2)
    private final String server_uuid;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String ui_domain;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new RenderMcpAppRequest$Companion$ADAPTER.RenderMcpAppRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)RenderMcpAppRequest.class), m7n.x);
    }
    
    public RenderMcpAppRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
    
    public RenderMcpAppRequest(final String conversation_uuid, final String server_uuid, final String sandbox_url_query, final String server_name, final String ui_domain, final String connector_url, final List<? extends McpAppHostCapability> list, final is2 is2) {
        super(RenderMcpAppRequest.ADAPTER, is2);
        this.conversation_uuid = conversation_uuid;
        this.server_uuid = server_uuid;
        this.sandbox_url_query = sandbox_url_query;
        this.server_name = server_name;
        this.ui_domain = ui_domain;
        this.connector_url = connector_url;
        this.host_capabilities = (List<McpAppHostCapability>)ear.l("host_capabilities", (List)list);
    }
    
    public final RenderMcpAppRequest copy(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final List<? extends McpAppHostCapability> list, final is2 is2) {
        return new RenderMcpAppRequest(s, s2, s3, s4, s5, s6, list, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RenderMcpAppRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final RenderMcpAppRequest renderMcpAppRequest = (RenderMcpAppRequest)o;
        return mlc.q((Object)unknownFields, (Object)renderMcpAppRequest.unknownFields()) && mlc.q((Object)this.conversation_uuid, (Object)renderMcpAppRequest.conversation_uuid) && mlc.q((Object)this.server_uuid, (Object)renderMcpAppRequest.server_uuid) && mlc.q((Object)this.sandbox_url_query, (Object)renderMcpAppRequest.sandbox_url_query) && mlc.q((Object)this.server_name, (Object)renderMcpAppRequest.server_name) && mlc.q((Object)this.ui_domain, (Object)renderMcpAppRequest.ui_domain) && mlc.q((Object)this.connector_url, (Object)renderMcpAppRequest.connector_url) && mlc.q((Object)this.host_capabilities, (Object)renderMcpAppRequest.host_capabilities);
    }
    
    public final String getConnector_url() {
        return this.connector_url;
    }
    
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }
    
    public final List<McpAppHostCapability> getHost_capabilities() {
        return this.host_capabilities;
    }
    
    public final String getSandbox_url_query() {
        return this.sandbox_url_query;
    }
    
    public final String getServer_name() {
        return this.server_name;
    }
    
    public final String getServer_uuid() {
        return this.server_uuid;
    }
    
    public final String getUi_domain() {
        return this.ui_domain;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            final int j = smk.j(smk.j(smk.j(smk.j(this.unknownFields().hashCode() * 37, 37, this.conversation_uuid), 37, this.server_uuid), 37, this.sandbox_url_query), 37, this.server_name);
            final String ui_domain = this.ui_domain;
            int hashCode2 = 0;
            int hashCode3;
            if (ui_domain != null) {
                hashCode3 = ui_domain.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            final String connector_url = this.connector_url;
            if (connector_url != null) {
                hashCode2 = connector_url.hashCode();
            }
            return super.hashCode = this.host_capabilities.hashCode() + ((j + hashCode3) * 37 + hashCode2) * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.conversation_uuid, "conversation_uuid=", list);
        ca9.t(this.server_uuid, "server_uuid=", list);
        ca9.t(this.sandbox_url_query, "sandbox_url_query=", list);
        ca9.t(this.server_name, "server_name=", list);
        final String ui_domain = this.ui_domain;
        if (ui_domain != null) {
            ca9.t(ui_domain, "ui_domain=", list);
        }
        final String connector_url = this.connector_url;
        if (connector_url != null) {
            ca9.t(connector_url, "connector_url=", list);
        }
        if (!((Collection)this.host_capabilities).isEmpty()) {
            y1j.i("host_capabilities=", (List)this.host_capabilities, list);
        }
        return c86.N0((Iterable)list, (CharSequence)", ", "RenderMcpAppRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
