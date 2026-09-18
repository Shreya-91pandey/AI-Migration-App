import com.anthropic.claude.api.artifacts.ArtifactVersionsResponse;
import kotlinx.serialization.KSerializer;

public interface s51
{
    default Object a(final s51 s51, final String s52, final String s53, final h07 h07) {
        final vi0 a = ((t51)s51).a;
        final lj0 p4 = lmf.p(1, "organizations/{organization}/artifacts/{conversationUuid}/versions", "organization", s52);
        p4.e("conversationUuid", s53);
        p4.h("fields", "meta");
        return a.a(p4.b(), (KSerializer)ArtifactVersionsResponse.Companion.serializer(), (f07)h07);
    }
}
