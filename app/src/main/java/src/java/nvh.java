import com.anthropic.claude.api.project.PaginatedProjectsResponse;
import kotlinx.serialization.KSerializer;

public interface nvh
{
    default Object a(final nvh nvh, final String s, String s2, final Integer n, Integer n2, String s3, final Boolean b, final h07 h07, final int n3) {
        Boolean booleanTrue = Boolean.TRUE;
        if ((n3 & 0x2) != 0x0) {
            s2 = null;
        }
        if ((n3 & 0x8) != 0x0) {
            n2 = null;
        }
        if ((n3 & 0x10) != 0x0) {
            s3 = null;
        }
        if ((n3 & 0x20) != 0x0) {
            true = null;
        }
        final vi0 a = ((ovh)nvh).a;
        final lj0 p9 = lmf.p(1, "organizations/{organization_uuid}/projects_v2", "organization_uuid", s);
        p9.h("filter", s2);
        p9.g(n, "limit");
        p9.g(n2, "offset");
        p9.h("searchQuery", s3);
        p9.f(true, "starred");
        p9.f(b, "is_archived");
        return a.a(p9.b(), (KSerializer)PaginatedProjectsResponse.Companion.serializer(), (f07)h07);
    }
}
