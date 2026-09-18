import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.j;
import java.util.concurrent.ConcurrentHashMap;

public final class dei
{
    public static final dei c;
    public final v2b a;
    public final ConcurrentHashMap b;
    
    static {
        c = new dei();
    }
    
    public dei() {
        this.b = new ConcurrentHashMap();
        this.a = new v2b((byte)2);
    }
    
    public final bdk a(final Class clazz) {
        ejc.a(clazz, "messageType");
        final ConcurrentHashMap b = this.b;
        final bdk bdk = (bdk)b.get((Object)clazz);
        if (bdk != null) {
            return bdk;
        }
        final Class a = j.a;
        final boolean assignable = f.class.isAssignableFrom(clazz);
        h2a a2 = null;
        if (!assignable) {
            final Class a3 = w30.a;
            final Class a4 = j.a;
            if (a4 != null) {
                if (!a4.isAssignableFrom(clazz)) {
                    en9.s("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                    return null;
                }
            }
        }
        final cqi a5 = ((i1e)this.a.w).a(clazz);
        Object o;
        if ((a5.d & 0x2) == 0x2) {
            final Class a6 = w30.a;
            if (f.class.isAssignableFrom(clazz)) {
                o = i.j((k)j.c, m2a.a, a5.a);
            }
            else {
                final k b2 = j.b;
                final h2a b3 = m2a.b;
                if (b3 == null) {
                    en9.q("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                o = i.j(b2, b3, a5.a);
            }
        }
        else {
            final Class a7 = w30.a;
            if (f.class.isAssignableFrom(clazz)) {
                final dvf b4 = ivf.b;
                final hid b5 = kid.b;
                final m c = j.c;
                if (ge9.D(a5.a()) != 1) {
                    a2 = m2a.a;
                }
                o = h.w(a5, b4, b5, (k)c, a2, e4e.b);
            }
            else {
                final dvf a8 = ivf.a;
                final hid a9 = kid.a;
                final k b6 = j.b;
                h2a b7;
                if (ge9.D(a5.a()) != 1) {
                    b7 = m2a.b;
                    if (b7 == null) {
                        en9.q("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                }
                else {
                    b7 = null;
                }
                o = h.w(a5, a8, a9, b6, b7, e4e.a);
            }
        }
        final bdk bdk2 = (bdk)b.putIfAbsent((Object)clazz, o);
        if (bdk2 != null) {
            return bdk2;
        }
        return (bdk)o;
    }
}
