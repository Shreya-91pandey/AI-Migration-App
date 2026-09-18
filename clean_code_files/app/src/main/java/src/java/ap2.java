import java.util.AbstractMap;
import java.util.Map;
import androidx.sqlite.driver.bundled.BundledSQLiteConnectionKt;
import androidx.sqlite.driver.bundled.BundledSQLiteDriverKt;
import java.util.List;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class ap2 implements v2k
{
    public final LinkedHashMap v;
    
    public ap2(final byte b) {
        switch (b) {
            default: {
                this.v = new LinkedHashMap();
                return;
            }
            case 2: {
                this.v = new LinkedHashMap();
                return;
            }
            case 1: {
                this.v = new LinkedHashMap();
            }
        }
    }
    
    public nt7 a() {
        final nt7 nt7 = new nt7(this.v);
        ri2.C0(nt7);
        return nt7;
    }
    
    public void b(final Object o, final String s) {
        Object o2;
        if (o == null) {
            o2 = null;
        }
        else {
            final us4 a = v4j.a((Class)o.getClass());
            o2 = o;
            if (!a.equals((Object)v4j.a(Boolean.TYPE))) {
                o2 = o;
                if (!a.equals((Object)v4j.a(Byte.TYPE))) {
                    o2 = o;
                    if (!a.equals((Object)v4j.a(Integer.TYPE))) {
                        o2 = o;
                        if (!a.equals((Object)v4j.a(Long.TYPE))) {
                            o2 = o;
                            if (!a.equals((Object)v4j.a(Float.TYPE))) {
                                o2 = o;
                                if (!a.equals((Object)v4j.a(Double.TYPE))) {
                                    o2 = o;
                                    if (!a.equals((Object)v4j.a((Class)String.class))) {
                                        o2 = o;
                                        if (!a.equals((Object)v4j.a((Class)Boolean[].class))) {
                                            o2 = o;
                                            if (!a.equals((Object)v4j.a((Class)Byte[].class))) {
                                                o2 = o;
                                                if (!a.equals((Object)v4j.a((Class)Integer[].class))) {
                                                    o2 = o;
                                                    if (!a.equals((Object)v4j.a((Class)Long[].class))) {
                                                        o2 = o;
                                                        if (!a.equals((Object)v4j.a((Class)Float[].class))) {
                                                            o2 = o;
                                                            if (!a.equals((Object)v4j.a((Class)Double[].class))) {
                                                                if (a.equals((Object)v4j.a((Class)String[].class))) {
                                                                    o2 = o;
                                                                }
                                                                else if (a.equals((Object)v4j.a((Class)boolean[].class))) {
                                                                    o2 = yv7.a((boolean[])o);
                                                                }
                                                                else if (a.equals((Object)v4j.a((Class)byte[].class))) {
                                                                    o2 = yv7.b((byte[])o);
                                                                }
                                                                else if (a.equals((Object)v4j.a((Class)int[].class))) {
                                                                    o2 = yv7.e((int[])o);
                                                                }
                                                                else if (a.equals((Object)v4j.a((Class)long[].class))) {
                                                                    o2 = yv7.f((long[])o);
                                                                }
                                                                else if (a.equals((Object)v4j.a((Class)float[].class))) {
                                                                    o2 = yv7.d((float[])o);
                                                                }
                                                                else {
                                                                    if (!a.equals((Object)v4j.a((Class)double[].class))) {
                                                                        oyl.j("Key ", (Object)s, (Object)" has invalid type ", (Object)a);
                                                                        return;
                                                                    }
                                                                    o2 = yv7.c((double[])o);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ((Map)this.v).put((Object)s, o2);
    }
    
    public void c(final HashMap hashMap) {
        for (final Map$Entry map$Entry : ((Map)hashMap).entrySet()) {
            this.b(map$Entry.getValue(), (String)map$Entry.getKey());
        }
    }
    
    public com d(final v4q v4q) {
        return (com)((Map)this.v).remove((Object)v4q);
    }
    
    public List e(final String s) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap v = this.v;
        for (final Map$Entry map$Entry : v.entrySet()) {
            if (mlc.q((Object)((v4q)map$Entry.getKey()).a, (Object)s)) {
                ((AbstractMap)linkedHashMap).put(map$Entry.getKey(), map$Entry.getValue());
            }
        }
        final Iterator iterator2 = ((Iterable)linkedHashMap.keySet()).iterator();
        while (iterator2.hasNext()) {
            ((Map)v).remove((Object)iterator2.next());
        }
        return c86.s1((Iterable)linkedHashMap.values());
    }
    
    public com f(final v4q v4q) {
        final LinkedHashMap v = this.v;
        Object value;
        if ((value = v.get((Object)v4q)) == null) {
            value = new com(v4q);
            ((Map)v).put((Object)v4q, value);
        }
        return (com)value;
    }
    
    public t2k m(String s) {
        final int a = zo2.a;
        s = (String)new yo2(BundledSQLiteDriverKt.a(s));
        Label_0109: {
            try {
                Label_0094: {
                    for (final Map$Entry map$Entry : this.v.entrySet()) {
                        final String s2 = (String)map$Entry.getKey();
                        final String s3 = (String)map$Entry.getValue();
                        if (((yo2)s).w) {
                            break Label_0094;
                        }
                        BundledSQLiteConnectionKt.c(((yo2)s).v, s2, s3);
                    }
                    return (t2k)s;
                }
                tiq.l(21, "connection is closed");
                throw null;
            }
            finally {
                break Label_0109;
            }
            return (t2k)s;
        }
        ((yo2)s).close();
    }
    
    public boolean n() {
        return false;
    }
}
