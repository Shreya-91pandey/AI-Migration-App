import java.util.Iterator;
import java.util.Set;
import androidx.work.impl.WorkDatabase;

public final class b6q
{
    public final WorkDatabase a;
    public final fd8 b;
    
    public b6q(final WorkDatabase a) {
        this.a = a;
        this.b = new fd8((byte)5);
    }
    
    public final void a(final String s, final Set set) {
        final Iterator iterator = ((Iterable)set).iterator();
        while (iterator.hasNext()) {
            xp7.L(this.a, false, true, (lta)new tyl((Object)this, (Object)new a6q((String)iterator.next(), s), (byte)24));
        }
    }
}
