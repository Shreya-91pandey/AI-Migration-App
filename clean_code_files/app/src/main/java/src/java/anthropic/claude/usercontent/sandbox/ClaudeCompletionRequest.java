package anthropic.claude.usercontent.sandbox;

import java.util.ArrayList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.a;

public final class ClaudeCompletionRequest extends a
{
    public static final ProtoAdapter<ClaudeCompletionRequest> ADAPTER;
    public static final Companion Companion;
    private static final long serialVersionUID = 0L;
    @h3q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = g3q.A, schemaIndex = 0, tag = 1)
    private final String prompt;
    
    static {
        Companion = new Companion(null);
        ADAPTER = (ProtoAdapter)new ClaudeCompletionRequest$Companion$ADAPTER.ClaudeCompletionRequest$Companion$ADAPTER$1(s8a.y, (rtc)v4j.a((Class)ClaudeCompletionRequest.class), m7n.x);
    }
    
    public ClaudeCompletionRequest() {
        this(null, null, 3, null);
    }
    
    public ClaudeCompletionRequest(final String prompt, final is2 is2) {
        super(ClaudeCompletionRequest.ADAPTER, is2);
        this.prompt = prompt;
    }
    
    public final ClaudeCompletionRequest copy(final String s, final is2 is2) {
        return new ClaudeCompletionRequest(s, is2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ClaudeCompletionRequest)) {
            return false;
        }
        final is2 unknownFields = this.unknownFields();
        final ClaudeCompletionRequest claudeCompletionRequest = (ClaudeCompletionRequest)o;
        return mlc.q((Object)unknownFields, (Object)claudeCompletionRequest.unknownFields()) && mlc.q((Object)this.prompt, (Object)claudeCompletionRequest.prompt);
    }
    
    public final String getPrompt() {
        return this.prompt;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = super.hashCode;
        if (hashCode == 0) {
            return super.hashCode = this.prompt.hashCode() + this.unknownFields().hashCode() * 37;
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        ca9.t(this.prompt, "prompt=", list);
        return c86.N0((Iterable)list, (CharSequence)", ", "ClaudeCompletionRequest{", "}", (lta)null, 56);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
    }
}
