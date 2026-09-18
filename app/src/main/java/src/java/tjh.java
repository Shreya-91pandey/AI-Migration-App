import java.util.Iterator;
import java.nio.charset.Charset;
import java.util.RandomAccess;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import androidx.datastore.preferences.protobuf.f;

public final class tjh extends f
{
    private static final tjh DEFAULT_INSTANCE;
    private static volatile gug PARSER;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private zic strings_;
    
    static {
        f.j((Class)tjh.class, (f)(DEFAULT_INSTANCE = new tjh()));
    }
    
    public tjh() {
        this.strings_ = iei.z;
    }
    
    public static tjh n() {
        return tjh.DEFAULT_INSTANCE;
    }
    
    public static sjh p() {
        return (sjh)tjh.DEFAULT_INSTANCE.b(5);
    }
    
    public final Object b(int d) {
        d = ge9.D(d);
        if (d == 0) {
            return 1;
        }
        if (d == 2) {
            return new cqi(tjh.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "strings_" });
        }
        if (d == 3) {
            return new tjh();
        }
        if (d == 4) {
            return new twa(tjh.DEFAULT_INSTANCE);
        }
        if (d == 5) {
            return tjh.DEFAULT_INSTANCE;
        }
        if (d == 6) {
            final gug parser = tjh.PARSER;
            if (parser == null) {
                final Class<tjh> clazz;
                monitorenter(clazz = tjh.class);
                Label_0078: {
                    try {
                        gug parser2;
                        if ((parser2 = tjh.PARSER) == null) {
                            parser2 = (tjh.PARSER = (gug)new ywa());
                        }
                        break Label_0078;
                    }
                    finally {
                        monitorexit(clazz);
                        monitorexit(clazz);
                        return;
                    }
                }
            }
            return parser;
        }
        throw null;
    }
    
    public final void m(final Iterable iterable) {
        iei strings_;
        final zic zic = strings_ = (iei)this.strings_;
        if (!((iei)zic).v) {
            final iei iei = (iei)zic;
            strings_ = iei.d(iei.x * 2);
            this.strings_ = strings_;
        }
        final Charset a = ejc.a;
        if (iterable instanceof l6d) {
            ((l6d)iterable).g();
            fvd.c();
            return;
        }
        if (iterable instanceof joh) {
            strings_.addAll((Collection)iterable);
            return;
        }
        if (iterable instanceof Collection) {
            final int size = ((Collection)iterable).size();
            if (strings_ instanceof ArrayList) {
                ((ArrayList)strings_).ensureCapacity(strings_.x + size);
            }
            else if (strings_ instanceof iei) {
                final iei iei2 = strings_;
                final int n = iei2.x + size;
                final Object[] w = iei2.w;
                if (n > w.length) {
                    if (w.length == 0) {
                        iei2.w = new Object[Math.max(n, 10)];
                    }
                    else {
                        int i;
                        for (i = w.length; i < n; i = Math.max(i * 3 / 2 + 1, 10)) {}
                        iei2.w = Arrays.copyOf(iei2.w, i);
                    }
                }
            }
        }
        final iei iei3 = strings_;
        final int x = iei3.x;
        if (iterable instanceof List && iterable instanceof RandomAccess) {
            final List list = (List)iterable;
            for (int size2 = list.size(), j = 0; j < size2; ++j) {
                final Object value = list.get(j);
                if (value == null) {
                    twa.d(iei3, x);
                    throw null;
                }
                iei3.add(value);
            }
        }
        else {
            for (final Object next : iterable) {
                if (next == null) {
                    twa.d(iei3, x);
                    throw null;
                }
                iei3.add(next);
            }
        }
    }
    
    public final zic o() {
        return this.strings_;
    }
}
