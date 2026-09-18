import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ChatId;

public final class sl3
{
    public final String a;
    public final boolean b;
    public final String c;
    
    public sl3(final String a, final String c, final boolean b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof sl3)) {
            return false;
        }
        final sl3 sl3 = (sl3)o;
        if (!mlc.q((Object)this.a, (Object)sl3.a)) {
            return false;
        }
        if (this.b != sl3.b) {
            return false;
        }
        final String c = sl3.c;
        final String c2 = this.c;
        if (c2 == null) {
            if (c == null) {
                return true;
            }
        }
        else if (c != null) {
            return c2.equals(c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int l = smk.l(this.a.hashCode() * 31, 31, this.b);
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return l + hashCode;
    }
    
    @Override
    public final String toString() {
        final String b = ChatId.b(this.a);
        final String c = this.c;
        String a;
        if (c == null) {
            a = "null";
        }
        else {
            a = MessageId.a(c);
        }
        return oz1.p(smk.v("ChatScope(chatId=", b, ", isTemporary=", ", messageId=", this.b), a, ")");
    }
}
