import com.anthropic.claude.api.model.ModelSelectorState;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.bootstrap.ModelSelectorStateBody;

public final class qff implements pff
{
    public final vi0 a;
    
    public qff(final vi0 a) {
        this.a = a;
    }
    
    public final Object a(final String s, final String s2, final ModelSelectorStateBody modelSelectorStateBody, final h07 h07) {
        final lj0 p4 = lmf.p(4, "organizations/{organizationUuid}/model_selector_state/{surface}", "organizationUuid", s);
        p4.e("surface", s2);
        p4.d((Object)modelSelectorStateBody, (KSerializer)ModelSelectorStateBody.Companion.serializer());
        return this.a.a(p4.b(), (KSerializer)ModelSelectorState.Companion.serializer(), (f07)h07);
    }
}
