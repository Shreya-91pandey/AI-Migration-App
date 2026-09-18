import com.anthropic.claude.api.project.ProjectUpdateParams;
import com.anthropic.claude.api.project.Project;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.project.ProjectCreateParams;

public final class ovh implements nvh
{
    public final vi0 a;
    
    public ovh(final vi0 a) {
        this.a = a;
    }
    
    public final Object b(final String s, final ProjectCreateParams projectCreateParams, final m6n m6n) {
        final lj0 p3 = lmf.p(2, "organizations/{organization_uuid}/projects", "organization_uuid", s);
        p3.d((Object)projectCreateParams, (KSerializer)ProjectCreateParams.Companion.serializer());
        return this.a.a(p3.b(), (KSerializer)Project.Companion.serializer(), (f07)m6n);
    }
    
    public final Object c(final String s, final String s2, final ProjectUpdateParams projectUpdateParams, final h07 h07) {
        final lj0 p4 = lmf.p(3, "organizations/{organization_uuid}/projects/{project_uuid}", "organization_uuid", s);
        p4.e("project_uuid", s2);
        p4.d((Object)projectUpdateParams, (KSerializer)ProjectUpdateParams.Companion.serializer());
        return this.a.a(p4.b(), (KSerializer)Project.Companion.serializer(), (f07)h07);
    }
}
