import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.f;

public abstract class twa implements Cloneable
{
    public final f v;
    public f w;
    
    public twa(final f v) {
        this.v = v;
        if (!v.f()) {
            this.w = v.i();
            return;
        }
        en9.s("Default instance must be immutable.");
        throw null;
    }
    
    public static void d(final iei iei, final int n) {
        final StringBuilder sb = new StringBuilder("Element at index ");
        sb.append(iei.x - n);
        sb.append(" is null.");
        final String string = sb.toString();
        for (int i = iei.x - 1; i >= n; --i) {
            iei.remove(i);
        }
        throw new NullPointerException(string);
    }
    
    public final f a() {
        final f b = this.b();
        b.getClass();
        if (f.e(b, true)) {
            return b;
        }
        throw new UninitializedMessageException();
    }
    
    public final f b() {
        final boolean f = this.w.f();
        final f w = this.w;
        if (!f) {
            return w;
        }
        w.g();
        return this.w;
    }
    
    public final void c() {
        if (!this.w.f()) {
            final f i = this.v.i();
            final f w = this.w;
            final dei c = dei.c;
            c.getClass();
            c.a(i.getClass()).a(i, w);
            this.w = i;
        }
    }
    
    public final Object clone() {
        final twa twa = (twa)this.v.b(5);
        twa.w = this.b();
        return twa;
    }
}
