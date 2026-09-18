package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class ClaudeCompletionResponse extends a
{
    public static final ProtoAdapter<ClaudeCompletionResponse> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String completion;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new ClaudeCompletionResponse$Companion$ADAPTER.ClaudeCompletionResponse$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)ClaudeCompletionResponse.class), m7n.x);
    }
    
    public ClaudeCompletionResponse() {
        this(null, null, 3, null);
    }
    
    public ClaudeCompletionResponse(final String completion, final is2 is2) {
        super(ClaudeCompletionResponse.ADAPTER, is2);
        this.completion = completion;
    }
    
    public final ClaudeCompletionResponse copy(final String s, final is2 is2) {
        return new ClaudeCompletionResponse(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ClaudeCompletionResponse)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final ClaudeCompletionResponse claudeCompletionResponse = (ClaudeCompletionResponse)o;
        return mlc.q((Object)unknownFields, (Object)claudeCompletionResponse.unknownFields()) && mlc.q((Object)this.completion, (Object)claudeCompletionResponse.completion);
    }
    
    public final String getCompletion() {
        return this.completion;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.completion.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.completion, "completion=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "ClaudeCompletionResponse{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
