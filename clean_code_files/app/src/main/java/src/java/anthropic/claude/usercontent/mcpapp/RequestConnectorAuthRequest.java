package anthropic.claude.usercontent.mcpapp;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class RequestConnectorAuthRequest extends a
{
    public static final ProtoAdapter<RequestConnectorAuthRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String server_uuid;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new RequestConnectorAuthRequest$Companion$ADAPTER.RequestConnectorAuthRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)RequestConnectorAuthRequest.class), m7n.x);
    }
    
    public RequestConnectorAuthRequest() {
        this(null, null, 3, null);
    }
    
    public RequestConnectorAuthRequest(final String server_uuid, final is2 is2) {
        super(RequestConnectorAuthRequest.ADAPTER, is2);
        this.server_uuid = server_uuid;
    }
    
    public final RequestConnectorAuthRequest copy(final String s, final is2 is2) {
        return new RequestConnectorAuthRequest(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RequestConnectorAuthRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final RequestConnectorAuthRequest requestConnectorAuthRequest = (RequestConnectorAuthRequest)o;
        return mlc.q((Object)unknownFields, (Object)requestConnectorAuthRequest.unknownFields()) && mlc.q((Object)this.server_uuid, (Object)requestConnectorAuthRequest.server_uuid);
    }
    
    public final String getServer_uuid() {
        return this.server_uuid;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.server_uuid.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.server_uuid, "server_uuid=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "RequestConnectorAuthRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
