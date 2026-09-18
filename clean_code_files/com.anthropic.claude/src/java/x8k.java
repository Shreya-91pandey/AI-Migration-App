import java.util.Map;
import android.os.Bundle;

public final class x8k implements u8k, j9k
{
    public final v8k v;
    public jbd w;
    public e3a x;
    
    public x8k(final v8k v) {
        this.v = v;
        final Object f = v.f("androidx.savedstate.SavedStateRegistry");
        Bundle bundle;
        if (f instanceof Bundle) {
            bundle = (Bundle)f;
        }
        else {
            bundle = null;
        }
        if (bundle != null && this.x == null) {
            (this.x = new e3a(new i9k((j9k)this, new lce((Object)this, (byte)28)))).M(bundle);
        }
        v.a((jta)new lce((Object)this, (byte)26), "androidx.savedstate.SavedStateRegistry");
    }
    
    public final t8k a(final jta jta, final String s) {
        return this.v.a(jta, s);
    }
    
    public final boolean b(final Object o) {
        return this.v.b(o);
    }
    
    public final Map c() {
        return this.v.c();
    }
    
    public final vad d() {
        jbd w;
        if ((w = this.w) == null) {
            w = new jbd((gbd)this, false);
            this.w = w;
        }
        return (vad)w;
    }
    
    public final Object f(final String s) {
        return this.v.f(s);
    }
    
    public final e3a x() {
        e3a x;
        if ((x = this.x) == null) {
            x = new e3a(new i9k((j9k)this, new lce((Object)this, (byte)28)));
            (this.x = x).M((Bundle)null);
        }
        return (e3a)x.x;
    }
}
