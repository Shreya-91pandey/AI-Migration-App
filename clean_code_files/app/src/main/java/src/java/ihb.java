import com.anthropic.claude.types.strings.ChatId;

public final class ihb implements lhb
{
    public final String a;
    
    public ihb(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ihb && mlc.q((Object)this.a, (Object)((ihb)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.k("Conversation(id=", ChatId.b(this.a), ")");
    }
}
