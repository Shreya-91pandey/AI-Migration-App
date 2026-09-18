import com.anthropic.claude.analytics.events.ConversationStoreType;

public final class ap3 implements f4p
{
    public final ax3 a;
    public final String b;
    
    public ap3(final ax3 a) {
        this.a = a;
        this.b = zo3.a;
    }
    
    @Override
    public final String a() {
        return this.b;
    }
    
    @Override
    public final String b() {
        final int ordinal = ((Enum)this.a.a()).ordinal();
        ConversationStoreType conversationStoreType;
        if (ordinal != 0) {
            if (ordinal != 1) {
                en9.r();
                return null;
            }
            conversationStoreType = ConversationStoreType.y;
        }
        else {
            conversationStoreType = ConversationStoreType.x;
        }
        return tsf.I(conversationStoreType);
    }
}
