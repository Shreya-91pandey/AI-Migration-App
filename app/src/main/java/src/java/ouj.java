import java.util.Set;
import java.util.Arrays;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import android.content.Context;

public final class ouj
{
    public final us4 a;
    public final Context b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public Executor f;
    public Executor g;
    public re h;
    public boolean i;
    public final n48 j;
    public final LinkedHashSet k;
    public final LinkedHashSet l;
    public final ArrayList m;
    public boolean n;
    public boolean o;
    public boolean p;
    
    public ouj(final Context b, final String c) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.j = new n48((byte)2);
        this.k = new LinkedHashSet();
        this.l = new LinkedHashSet();
        this.m = new ArrayList();
        this.n = true;
        this.a = v4j.a((Class)WorkDatabase.class);
        this.b = b;
        this.c = c;
    }
    
    public final void a(m9f... array) {
        final int length = array.length;
        final int n = 0;
        for (final m9f m9f : array) {
            final byte a = m9f.a;
            final LinkedHashSet l = this.l;
            ((Set)l).add((Object)(int)a);
            ((Set)l).add((Object)(int)m9f.b);
        }
        array = (m9f[])Arrays.copyOf((Object[])array, array.length);
        for (int length2 = array.length, j = n; j < length2; ++j) {
            this.j.a(array[j]);
        }
    }
}
