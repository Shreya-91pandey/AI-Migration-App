package anthropic.claude.usercontent;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class UnknownMessage extends a
{
    public static final ProtoAdapter<UnknownMessage> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String type;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new UnknownMessage$Companion$ADAPTER.UnknownMessage$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)UnknownMessage.class), m7n.x);
    }
    
    public UnknownMessage() {
        this(null, null, 3, null);
    }
    
    public UnknownMessage(final String type, final is2 is2) {
        super(UnknownMessage.ADAPTER, is2);
        this.type = type;
    }
    
    public final UnknownMessage copy(final String s, final is2 is2) {
        return new UnknownMessage(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UnknownMessage)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final UnknownMessage unknownMessage = (UnknownMessage)o;
        return mlc.q((Object)unknownFields, (Object)unknownMessage.unknownFields()) && mlc.q((Object)this.type, (Object)unknownMessage.type);
    }
    
    public final String getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.type.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.type, "type=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "UnknownMessage{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
