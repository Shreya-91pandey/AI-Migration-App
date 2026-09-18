import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import java.util.Collection;
import android.util.Log;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public final class n48
{
    public LinkedHashMap a;
    
    public n48(final byte b) {
        switch (b) {
            default: {
                int v;
                if ((v = z5e.V(d86.p0((Iterable)z89.v, 10))) < 16) {
                    v = 16;
                }
                final LinkedHashMap a = new LinkedHashMap(v);
                q89.v.getClass();
                this.a = a;
                return;
            }
            case 2: {
                this.a = new LinkedHashMap();
                return;
            }
            case 1: {
                this.a = new LinkedHashMap();
            }
        }
    }
    
    public void a(final m9f m9f) {
        final byte a = m9f.a;
        final byte b = m9f.b;
        final LinkedHashMap a2 = this.a;
        final Integer value = (Integer)a;
        Object value2;
        if ((value2 = a2.get((Object)value)) == null) {
            value2 = new TreeMap();
            ((Map)a2).put((Object)value, value2);
        }
        final TreeMap treeMap = (TreeMap)value2;
        if (((Map)treeMap).containsKey((Object)(int)b)) {
            final StringBuilder sb = new StringBuilder("Overriding migration ");
            sb.append(treeMap.get((Object)(int)b));
            sb.append(" with ");
            sb.append((Object)m9f);
            Log.w("ROOM", sb.toString());
        }
        ((Map)treeMap).put((Object)(int)b, (Object)m9f);
    }
    
    public boolean b(String d) {
        final boolean b = false;
        Object iterator = null;
        while (true) {
            try {
                final hpb hpb = new hpb((byte)0);
                hpb.g((ipb)null, d);
                final Object b2 = hpb.b();
                if (b2 == null) {
                    return false;
                }
                d = ((ipb)b2).d;
                iterator = this.a.keySet();
                boolean b3;
                if (iterator instanceof Collection && ((Collection)iterator).isEmpty()) {
                    b3 = b;
                }
                else {
                    iterator = ((Iterable)iterator).iterator();
                    StringBuilder sb;
                    do {
                        b3 = b;
                        if (!((Iterator)iterator).hasNext()) {
                            return b3;
                        }
                        final String s = (String)((Iterator)iterator).next();
                        if (mlc.q((Object)s, (Object)"*") || mlc.q((Object)d, (Object)s)) {
                            break;
                        }
                        sb = new StringBuilder(".");
                        sb.append(s);
                    } while (!rym.y0(d, sb.toString(), false));
                    b3 = true;
                }
                return b3;
            }
            catch (final IllegalArgumentException ex) {
                final Object b2 = iterator;
                continue;
            }
            break;
        }
    }
    
    public JsonElement c(final String s, final JsonElement jsonElement) {
        return (JsonElement)((Map)this.a).put((Object)s, (Object)jsonElement);
    }
}
