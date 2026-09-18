import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public final class o69 implements Runnable
{
    public final ArrayList v;
    public final byte w;
    
    public o69(final List list, final int w, final Throwable t) {
        lq6.t((Object)list, "initCallbacks cannot be null");
        this.v = new ArrayList((Collection)list);
        this.w = (byte)w;
    }
    
    public final void run() {
        final ArrayList v = this.v;
        final int size = v.size();
        final byte w = this.w;
        int i = 0;
        final int n = 0;
        if (w != 1) {
            for (int j = n; j < size; ++j) {
                ((n69)v.get(j)).a();
            }
        }
        else {
            while (i < size) {
                ((n69)v.get(i)).b();
                ++i;
            }
        }
    }
}
