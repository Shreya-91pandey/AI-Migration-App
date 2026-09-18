package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class ExecuteToolResponse extends a
{
    public static final ProtoAdapter<ExecuteToolResponse> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 1, tag = 2)
    private final String error;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String status;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 2, tag = 3)
    private final String tool_id;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new ExecuteToolResponse$Companion$ADAPTER.ExecuteToolResponse$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)ExecuteToolResponse.class), m7n.x);
    }
    
    public ExecuteToolResponse() {
        this(null, null, null, null, 15, null);
    }
    
    public ExecuteToolResponse(final String status, final String error, final String tool_id, final is2 is2) {
        super(ExecuteToolResponse.ADAPTER, is2);
        this.status = status;
        this.error = error;
        this.tool_id = tool_id;
    }
    
    public final ExecuteToolResponse copy(final String s, final String s2, final String s3, final is2 is2) {
        return new ExecuteToolResponse(s, s2, s3, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ExecuteToolResponse)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final ExecuteToolResponse executeToolResponse = (ExecuteToolResponse)o;
        return mlc.q((Object)unknownFields, (Object)executeToolResponse.unknownFields()) && mlc.q((Object)this.status, (Object)executeToolResponse.status) && mlc.q((Object)this.error, (Object)executeToolResponse.error) && mlc.q((Object)this.tool_id, (Object)executeToolResponse.tool_id);
    }
    
    public final String getError() {
        return this.error;
    }
    
    public final String getStatus() {
        return this.status;
    }
    
    public final String getTool_id() {
        return this.tool_id;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.tool_id.hashCode() + smk.j(smk.j(this.unknownFields().hashCode() * 37, 37, this.status), 37, this.error);
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.status, "status=", list);
        ca9.t(this.error, "error=", list);
        ca9.t(this.tool_id, "tool_id=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "ExecuteToolResponse{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
