package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class SendConversationMessageRequest extends a
{
    public static final ProtoAdapter<SendConversationMessageRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String message;
    @h3q(adapter = "anthropic.claude.usercontent.sandbox.SendConversationMessageRequest$MessageType#ADAPTER", label = g3q.A, schemaIndex = 1, tag = 2)
    private final SendConversationMessageRequest.SendConversationMessageRequest$MessageType message_type;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new SendConversationMessageRequest$Companion$ADAPTER.SendConversationMessageRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)SendConversationMessageRequest.class), m7n.x);
    }
    
    public SendConversationMessageRequest() {
        this(null, null, null, 7, null);
    }
    
    public SendConversationMessageRequest(final String message, final SendConversationMessageRequest.SendConversationMessageRequest$MessageType message_type, final is2 is2) {
        super(SendConversationMessageRequest.ADAPTER, is2);
        this.message = message;
        this.message_type = message_type;
    }
    
    public final SendConversationMessageRequest copy(final String s, final SendConversationMessageRequest.SendConversationMessageRequest$MessageType sendConversationMessageRequest$MessageType, final is2 is2) {
        return new SendConversationMessageRequest(s, sendConversationMessageRequest$MessageType, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SendConversationMessageRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final SendConversationMessageRequest sendConversationMessageRequest = (SendConversationMessageRequest)o;
        return mlc.q((Object)unknownFields, (Object)sendConversationMessageRequest.unknownFields()) && mlc.q((Object)this.message, (Object)sendConversationMessageRequest.message) && this.message_type == sendConversationMessageRequest.message_type;
    }
    
    public final String getMessage() {
        return this.message;
    }
    
    public final SendConversationMessageRequest.SendConversationMessageRequest$MessageType getMessage_type() {
        return this.message_type;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.message_type.hashCode() + smk.j(this.unknownFields().hashCode() * 37, 37, this.message);
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.message, "message=", list);
        final SendConversationMessageRequest.SendConversationMessageRequest$MessageType message_type = this.message_type;
        final StringBuilder sb = new StringBuilder("message_type=");
        sb.append((Object)message_type);
        list.add((Object)sb.toString());
        return c86.N0((Iterable)list, (CharSequence)", ", "SendConversationMessageRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
