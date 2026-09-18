package anthropic.claude.usercontent.mcpapp;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class JsonRpcEnvelope extends a
{
    public static final ProtoAdapter<JsonRpcEnvelope> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String message;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new JsonRpcEnvelope$Companion$ADAPTER.JsonRpcEnvelope$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)JsonRpcEnvelope.class), m7n.x);
    }
    
    public JsonRpcEnvelope() {
        this(null, null, 3, null);
    }
    
    public JsonRpcEnvelope(final String message, final is2 is2) {
        super(JsonRpcEnvelope.ADAPTER, is2);
        this.message = message;
    }
    
    public final JsonRpcEnvelope copy(final String s, final is2 is2) {
        return new JsonRpcEnvelope(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof JsonRpcEnvelope)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final JsonRpcEnvelope jsonRpcEnvelope = (JsonRpcEnvelope)o;
        return mlc.q((Object)unknownFields, (Object)jsonRpcEnvelope.unknownFields()) && mlc.q((Object)this.message, (Object)jsonRpcEnvelope.message);
    }
    
    public final String getMessage() {
        return this.message;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.message.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.message, "message=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "JsonRpcEnvelope{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
