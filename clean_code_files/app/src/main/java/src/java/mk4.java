import com.anthropic.claude.api.share.ChatSnapshotSummary;
import kotlinx.serialization.KSerializer;

public final class mk4 implements lk4
{
    public final vi0 a;
    
    public mk4(final vi0 a) {
        this.a = a;
    }
    
    public final Object a(final String s, final String s2, final h07 h07) {
        final lj0 p3 = lmf.p(5, "organizations/{organization}/share/{snapshot}", "organization", s);
        p3.e("snapshot", s2);
        return this.a.a(p3.b(), (KSerializer)mqo.b, (f07)h07);
    }
    
    public final Object b(final String s, final String s2, final h07 h07) {
        final lj0 p3 = lmf.p(1, "organizations/{organization}/chat_conversations/{chat}/shares", "organization", s);
        p3.e("chat", s2);
        return this.a.a(p3.b(), (KSerializer)new uv0(ChatSnapshotSummary.Companion.serializer(), (byte)0), (f07)h07);
    }
}
