import com.anthropic.claude.api.memory.MemorySettingsResponse;
import com.anthropic.claude.api.memory.MemorySettingsGesture;
import com.anthropic.claude.api.memory.MemorySynthesisResponse;
import kotlinx.serialization.KSerializer;

public final class tse implements sse
{
    public final vi0 a;
    
    public tse(final vi0 a) {
        this.a = a;
    }
    
    public final Object a(String s, final String s2, final h07 h07) {
        final lj0 p3 = lmf.p(1, "organizations/{organization_uuid}/memory", "organization_uuid", s);
        s = s2;
        if (s2 == null) {
            s = null;
        }
        p3.h("project_uuid", s);
        return this.a.a(p3.b(), (KSerializer)MemorySynthesisResponse.Companion.serializer(), (f07)h07);
    }
    
    public final Object b(final String s, final MemorySettingsGesture memorySettingsGesture, final m6n m6n) {
        final lj0 p3 = lmf.p(2, "organizations/{organization_uuid}/memory/settings", "organization_uuid", s);
        p3.d((Object)memorySettingsGesture, (KSerializer)MemorySettingsGesture.Companion.serializer());
        return this.a.a(p3.b(), (KSerializer)MemorySettingsResponse.Companion.serializer(), (f07)m6n);
    }
}
