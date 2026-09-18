import com.anthropic.claude.api.experience.ExperiencesResponse;
import kotlinx.serialization.KSerializer;

public final class rw9 implements qw9
{
    public final vi0 a;
    
    public rw9(final vi0 a) {
        this.a = a;
    }
    
    public final Object a(final String s, final h07 h07) {
        return this.a.a(oz1.e(1, "organizations/{organization}/experiences", "organization", s), (KSerializer)ExperiencesResponse.Companion.serializer(), (f07)h07);
    }
}
