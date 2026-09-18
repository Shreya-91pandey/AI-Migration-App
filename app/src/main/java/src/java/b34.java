import com.anthropic.claude.api.chat.ProxiedSession;
import com.anthropic.claude.api.chat.ProxiedSessionState;
import com.anthropic.claude.api.chat.ChatLiveStatus;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;

public final class b34 implements c34
{
    public final ChatConversationWithProjectReference a;
    public final boolean b;
    public final nm4 c;
    public final hfc d;
    public final int e;
    public final boolean f;
    
    public b34(final ChatConversationWithProjectReference a, final boolean b) {
        this.a = a;
        this.b = b;
        this.c = new nm4(a.a);
        final hfc x = hfc.x;
        this.d = o55.v(a.c.getTime());
        final Boolean m = a.m;
        final Boolean true = Boolean.TRUE;
        final boolean q = mlc.q((Object)m, (Object)true);
        boolean b2 = true;
        final boolean b3 = b || a.o == ChatLiveStatus.w;
        final boolean q2 = mlc.q((Object)a.p, (Object)true);
        final ProxiedSession q3 = a.q;
        ProxiedSessionState a2;
        if (q3 != null) {
            a2 = q3.a();
        }
        else {
            a2 = null;
        }
        if (a2 != ProxiedSessionState.y) {
            b2 = false;
        }
        this.e = rjq.h(q, b3, q2, b2);
        this.f = a.h;
    }
    
    public final int a() {
        return this.e;
    }
    
    public final pm4 b() {
        return (pm4)this.c;
    }
    
    public final hfc c() {
        return this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b34)) {
            return false;
        }
        final b34 b34 = (b34)o;
        return mlc.q((Object)this.a, (Object)b34.a) && this.b == b34.b;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Chat(chat=");
        sb.append((Object)this.a);
        sb.append(", replyInFlight=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
