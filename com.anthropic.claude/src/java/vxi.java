import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;

public final class vxi implements ayi
{
    public final ChatConversationWithProjectReference a;
    
    public vxi(final ChatConversationWithProjectReference a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof vxi && mlc.q((Object)this.a, (Object)((vxi)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Chat(conversation=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
