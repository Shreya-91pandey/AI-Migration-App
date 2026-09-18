package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class ExecuteToolRequest extends a
{
    public static final ProtoAdapter<ExecuteToolRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 3, tag = 4)
    private final String conversation_uuid;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 1, tag = 2)
    private final String input;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String name;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 2, tag = 3)
    private final String tool_id;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new ExecuteToolRequest$Companion$ADAPTER.ExecuteToolRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)ExecuteToolRequest.class), m7n.x);
    }
    
    public ExecuteToolRequest() {
        this(null, null, null, null, null, 31, null);
    }
    
    public ExecuteToolRequest(final String name, final String input, final String tool_id, final String conversation_uuid, final is2 is2) {
        super(ExecuteToolRequest.ADAPTER, is2);
        this.name = name;
        this.input = input;
        this.tool_id = tool_id;
        this.conversation_uuid = conversation_uuid;
    }
    
    public final ExecuteToolRequest copy(final String s, final String s2, final String s3, final String s4, final is2 is2) {
        return new ExecuteToolRequest(s, s2, s3, s4, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ExecuteToolRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final ExecuteToolRequest executeToolRequest = (ExecuteToolRequest)o;
        return mlc.q((Object)unknownFields, (Object)executeToolRequest.unknownFields()) && mlc.q((Object)this.name, (Object)executeToolRequest.name) && mlc.q((Object)this.input, (Object)executeToolRequest.input) && mlc.q((Object)this.tool_id, (Object)executeToolRequest.tool_id) && mlc.q((Object)this.conversation_uuid, (Object)executeToolRequest.conversation_uuid);
    }
    
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }
    
    public final String getInput() {
        return this.input;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getTool_id() {
        return this.tool_id;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.conversation_uuid.hashCode() + smk.j(smk.j(smk.j(this.unknownFields().hashCode() * 37, 37, this.name), 37, this.input), 37, this.tool_id);
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.name, "name=", list);
        ca9.t(this.input, "input=", list);
        ca9.t(this.tool_id, "tool_id=", list);
        ca9.t(this.conversation_uuid, "conversation_uuid=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "ExecuteToolRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
