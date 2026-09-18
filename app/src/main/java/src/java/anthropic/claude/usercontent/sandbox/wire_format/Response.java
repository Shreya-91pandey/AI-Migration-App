package anthropic.claude.usercontent.sandbox.wire_format;

import java.util.ArrayList;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class Response extends a
{
    public static final ProtoAdapter<Response> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String channel;
    @h3q(adapter = "com.squareup.wire.AnyMessage#ADAPTER", label = g3q.A, schemaIndex = 3, tag = 4)
    private final AnyMessage payload;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestId", label = g3q.A, schemaIndex = 1, tag = 2)
    private final String request_id;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = g3q.A, schemaIndex = 2, tag = 3)
    private final int status;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new Response$Companion$ADAPTER.Response$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)Response.class), m7n.x);
    }
    
    public Response() {
        this(null, null, 0, null, null, 31, null);
    }
    
    public Response(final String channel, final String request_id, final int status, final AnyMessage payload, final is2 is2) {
        super(Response.ADAPTER, is2);
        this.channel = channel;
        this.request_id = request_id;
        this.status = status;
        this.payload = payload;
    }
    
    public final Response copy(final String s, final String s2, final int n, final AnyMessage anyMessage, final is2 is2) {
        return new Response(s, s2, n, anyMessage, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Response)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final Response response = (Response)o;
        return mlc.q((Object)unknownFields, (Object)response.unknownFields()) && mlc.q((Object)this.channel, (Object)response.channel) && mlc.q((Object)this.request_id, (Object)response.request_id) && this.status == response.status && mlc.q((Object)this.payload, (Object)response.payload);
    }
    
    public final String getChannel() {
        return this.channel;
    }
    
    public final AnyMessage getPayload() {
        return this.payload;
    }
    
    public final String getRequest_id() {
        return this.request_id;
    }
    
    public final int getStatus() {
        return this.status;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if ((hashCode = super.hashCode) == 0) {
            final int y = hia.y(this.status, smk.j(smk.j(this.unknownFields().hashCode() * 37, 37, this.channel), 37, this.request_id), 37);
            final AnyMessage payload = this.payload;
            int hashCode2;
            if (payload != null) {
                hashCode2 = payload.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            hashCode = y + hashCode2;
            super.hashCode = hashCode;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.channel, "channel=", list);
        ca9.t(this.request_id, "request_id=", list);
        y1j.g(this.status, "status=", list);
        final AnyMessage payload = this.payload;
        if (payload != null) {
            final StringBuilder sb = new StringBuilder("payload=");
            sb.append((Object)payload);
            list.add((Object)sb.toString());
        }
        return c86.N0((Iterable)list, (CharSequence)", ", "Response{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
