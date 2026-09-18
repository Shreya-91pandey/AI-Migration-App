import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Arrays;
import android.os.Bundle;

public final class e9k implements h9k
{
    public final e3a a;
    public boolean b;
    public Bundle c;
    public final l7n d;
    
    public e9k(final e3a a, final ycp ycp) {
        this.a = a;
        this.d = new l7n((jta)new lce((Object)ycp, (byte)27));
    }
    
    @Override
    public final Bundle a() {
        final Bundle v = ach.v((yog[])Arrays.copyOf((Object[])new yog[0], 0));
        final Bundle c = this.c;
        if (c != null) {
            v.putAll(c);
        }
        for (final Map$Entry map$Entry : ((f9k)this.d.getValue()).b.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Bundle a = ((a9k)map$Entry.getValue()).a().a();
            if (!ek.t(a)) {
                v.putBundle(s, a);
            }
        }
        this.b = false;
        return v;
    }
    
    public final void b() {
        if (!this.b) {
            final Bundle e = this.a.e("androidx.lifecycle.internal.SavedStateHandlesProvider");
            final Bundle v = ach.v((yog[])Arrays.copyOf((Object[])new yog[0], 0));
            final Bundle c = this.c;
            if (c != null) {
                v.putAll(c);
            }
            if (e != null) {
                v.putAll(e);
            }
            this.c = v;
            this.b = true;
            final f9k f9k = (f9k)this.d.getValue();
        }
    }
}
