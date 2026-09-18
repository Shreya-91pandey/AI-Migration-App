import java.util.Collection;
import java.util.List;

public final class atk
{
    public final tsk a;
    public final klf b;
    
    public atk(zsk zsk, final sgc sgc) {
        this.a = zsk.d;
        final List j = zsk.j(4, zsk);
        this.b = new klf(j.size());
        for (int size = ((Collection)j).size(), i = 0; i < size; ++i) {
            zsk = (zsk)j.get(i);
            if (sgc.a(zsk.f)) {
                this.b.a(zsk.f);
            }
        }
    }
}
