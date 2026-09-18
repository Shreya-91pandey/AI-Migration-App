import java.util.Iterator;
import com.anthropic.claude.api.recents.RecentsSectionsResponse;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.api.project.RecentSurface;
import java.util.ArrayList;
import java.util.List;

public final class kxi implements jxi
{
    public final vi0 a;
    
    public kxi(final vi0 a) {
        this.a = a;
    }
    
    public final Object a(String s, final Integer n, final String s2, final String s3, final List list, final ArrayList list2, final h07 h07) {
        final lj0 p7 = lmf.p(1, "organizations/{organization_uuid}/recents", "organization_uuid", s);
        p7.g(n, "limit");
        s = s2;
        if (s2 == null) {
            s = null;
        }
        p7.h("section", s);
        if ((s = s3) == null) {
            s = null;
        }
        p7.h("cursor", s);
        if (list != null) {
            final Iterator iterator = ((Iterable)list).iterator();
            while (iterator.hasNext()) {
                p7.h("surfaces", ((RecentSurface)iterator.next()).v);
            }
        }
        if (list2 != null) {
            final Iterator iterator2 = ((Iterable)list2).iterator();
            while (iterator2.hasNext()) {
                p7.h("include", ((RecentSurface)iterator2.next()).v);
            }
        }
        return this.a.a(p7.b(), (KSerializer)RecentsSectionsResponse.Companion.serializer(), (f07)h07);
    }
}
