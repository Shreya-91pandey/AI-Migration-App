package anthropic.claude.usercontent.sandbox.wire_format;

import java.util.ArrayList;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class Request extends a
{
    public static final ProtoAdapter<Request> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String channel;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 2, tag = 3)
    private final String method;
    @h3q(adapter = "com.squareup.wire.AnyMessage#ADAPTER", label = g3q.A, schemaIndex = 3, tag = 4)
    private final AnyMessage payload;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestId", label = g3q.A, schemaIndex = 1, tag = 2)
    private final String request_id;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new Request$Companion$ADAPTER.Request$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)Request.class), m7n.x);
    }
    
    public Request() {
        this(null, null, null, null, null, 31, null);
    }
    
    public Request(final String channel, final String request_id, final String method, final AnyMessage payload, final is2 is2) {
        super(Request.ADAPTER, is2);
        this.channel = channel;
        this.request_id = request_id;
        this.method = method;
        this.payload = payload;
    }
    
    public final Request copy(final String s, final String s2, final String s3, final AnyMessage anyMessage, final is2 is2) {
        return new Request(s, s2, s3, anyMessage, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Request)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final Request request = (Request)o;
        return mlc.q((Object)unknownFields, (Object)request.unknownFields()) && mlc.q((Object)this.channel, (Object)request.channel) && mlc.q((Object)this.request_id, (Object)request.request_id) && mlc.q((Object)this.method, (Object)request.method) && mlc.q((Object)this.payload, (Object)request.payload);
    }
    
    public final String getChannel() {
        return this.channel;
    }
    
    public final String getMethod() {
        return this.method;
    }
    
    public final AnyMessage getPayload() {
        return this.payload;
    }
    
    public final String getRequest_id() {
        return this.request_id;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if ((hashCode = super.hashCode) == 0) {
            final int j = smk.j(smk.j(smk.j(this.unknownFields().hashCode() * 37, 37, this.channel), 37, this.request_id), 37, this.method);
            final AnyMessage payload = this.payload;
            int hashCode2;
            if (payload != null) {
                hashCode2 = payload.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            hashCode = j + hashCode2;
            super.hashCode = hashCode;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.channel, "channel=", list);
        ca9.t(this.request_id, "request_id=", list);
        ca9.t(this.method, "method=", list);
        final AnyMessage payload = this.payload;
        if (payload != null) {
            final StringBuilder sb = new StringBuilder("payload=");
            sb.append((Object)payload);
            list.add((Object)sb.toString());
        }
        return c86.N0((Iterable)list, (CharSequence)", ", "Request{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
