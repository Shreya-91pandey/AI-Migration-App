import androidx.datastore.preferences.protobuf.f;
import java.util.Collections;
import java.util.concurrent.Executor;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileInputStream;
import java.util.logging.Logger;
import java.util.Map;
import androidx.datastore.preferences.protobuf.e;
import java.util.Set;
import java.util.Map$Entry;
import android.content.Context;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.google.firebase.components.ComponentRegistrar;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class o55 implements gc7, ne6, wzk, sia, pe6, by6, i9c, h8n, vzk, cul, q8m, hak
{
    public static final o55 A;
    public static final o55 B;
    public static final o55 C;
    public static final o55 D;
    public static final o55 E;
    public static final o55 w;
    public static final o55 x;
    public static final o55 y;
    public static final o55 z;
    public final byte v;
    
    public o55(final int n, final TimeUnit timeUnit) {
        this.v = 23;
        timeUnit.toNanos((long)n);
        final String lowerCase = ((Enum)timeUnit).name().toLowerCase(Locale.ROOT);
        if (n == 1) {
            lowerCase.substring(0, lowerCase.length() - 1);
        }
        new AtomicLong(System.nanoTime());
    }
    
    public static hfc v(long n) {
        long n3;
        final long n2 = n3 = n / 1000L;
        if ((n ^ 0x3E8L) < 0L) {
            n3 = n2;
            if (n2 * 1000L != n) {
                n3 = n2 - 1L;
            }
        }
        n %= 1000L;
        final int n4 = (int)((n + (0x3E8L & ((n ^ 0x3E8L) & (-n | n)) >> 63)) * 1000000L);
        if (n3 < -31557014167219200L) {
            return hfc.x;
        }
        if (n3 > 31556889864403199L) {
            return hfc.y;
        }
        return w(n3, n4);
    }
    
    public static hfc w(long n, final long n2) {
        long n4;
        final long n3 = n4 = n2 / 1000000000L;
        if ((n2 ^ 0x3B9ACA00L) < 0L) {
            n4 = n3;
            if (n3 * 1000000000L != n2) {
                n4 = n3 - 1L;
            }
        }
        final long n5 = n + n4;
        if ((n ^ n5) < 0L && (n4 ^ n) >= 0L) {
            if (n > 0L) {
                return hfc.y;
            }
            return hfc.x;
        }
        else {
            if (n5 < -31557014167219200L) {
                return hfc.x;
            }
            if (n5 > 31556889864403199L) {
                return hfc.y;
            }
            n = n2 % 1000000000L;
            return new hfc(n5, (int)(n + (((n ^ 0x3B9ACA00L) & (-n | n)) >> 63 & 0x3B9ACA00L)));
        }
    }
    
    public static hfc y(final String s) {
        return ri2.h0((CharSequence)s).toInstant();
    }
    
    @Override
    public List a(final ComponentRegistrar componentRegistrar) {
        final ArrayList list = new ArrayList();
        for (final ud6 ud6 : componentRegistrar.getComponents()) {
            final String a = ud6.a;
            ud6 ud7 = ud6;
            if (a != null) {
                ud7 = new ud6(a, ud6.b, ud6.c, (int)(ud6.d ? 1 : 0), (int)(ud6.e ? 1 : 0), (ne6)new oe6((Object)a, (Object)ud6, (byte)0), ud6.g);
            }
            list.add((Object)ud7);
        }
        return (List)list;
    }
    
    @Override
    public void b(final Context context) {
    }
    
    @Override
    public b9c c() {
        return (b9c)new tz1((Float)null, (Boolean)null);
    }
    
    @Override
    public ija d(final u1n u1n) {
        return (ija)new m22((Object)ttl.v, (byte)4);
    }
    
    @Override
    public long e(long n, long n2) {
        final float n3 = Float.intBitsToFloat((int)(n2 >> 32)) / Float.intBitsToFloat((int)(n >> 32));
        n = Float.floatToRawIntBits(n3);
        n2 = Float.floatToRawIntBits(n3);
        final int a = bak.a;
        return n << 32 | (n2 & 0xFFFFFFFFL);
    }
    
    @Override
    public Object f() {
        return k8e.o();
    }
    
    @Override
    public void g(Object value, final wsi wsi) {
        final Map a = ((mmf)value).a();
        final pjh o = rjh.o();
        for (final Map$Entry map$Entry : a.entrySet()) {
            final kjh kjh = (kjh)map$Entry.getKey();
            value = map$Entry.getValue();
            final String a2 = kjh.a;
            vjh vjh;
            if (value instanceof Boolean) {
                final ujh w = vjh.w();
                final boolean booleanValue = (boolean)value;
                ((twa)w).c();
                ((vjh)((twa)w).w).x(booleanValue);
                vjh = (vjh)((twa)w).a();
            }
            else if (value instanceof Float) {
                final ujh w2 = vjh.w();
                final float floatValue = ((Number)value).floatValue();
                ((twa)w2).c();
                ((vjh)((twa)w2).w).A(floatValue);
                vjh = (vjh)((twa)w2).a();
            }
            else if (value instanceof Double) {
                final ujh w3 = vjh.w();
                final double doubleValue = ((Number)value).doubleValue();
                ((twa)w3).c();
                ((vjh)((twa)w3).w).z(doubleValue);
                vjh = (vjh)((twa)w3).a();
            }
            else if (value instanceof Integer) {
                final ujh w4 = vjh.w();
                final int intValue = ((Number)value).intValue();
                ((twa)w4).c();
                ((vjh)((twa)w4).w).B(intValue);
                vjh = (vjh)((twa)w4).a();
            }
            else if (value instanceof Long) {
                final ujh w5 = vjh.w();
                final long longValue = ((Number)value).longValue();
                ((twa)w5).c();
                ((vjh)((twa)w5).w).C(longValue);
                vjh = (vjh)((twa)w5).a();
            }
            else if (value instanceof String) {
                final ujh w6 = vjh.w();
                final String s = (String)value;
                ((twa)w6).c();
                ((vjh)((twa)w6).w).D(s);
                vjh = (vjh)((twa)w6).a();
            }
            else if (value instanceof Set) {
                final ujh w7 = vjh.w();
                final sjh p2 = tjh.p();
                final Iterable iterable = (Iterable)value;
                ((twa)p2).c();
                ((tjh)((twa)p2).w).m(iterable);
                ((twa)w7).c();
                ((vjh)((twa)w7).w).E((tjh)((twa)p2).a());
                vjh = (vjh)((twa)w7).a();
            }
            else {
                if (!(value instanceof byte[])) {
                    en9.q("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                final ujh w8 = vjh.w();
                final byte[] array = (byte[])value;
                final fs2 d = fs2.d(array, 0, array.length);
                ((twa)w8).c();
                ((vjh)((twa)w8).w).y(d);
                vjh = (vjh)((twa)w8).a();
            }
            o.getClass();
            a2.getClass();
            ((twa)o).c();
            ((rjh)((twa)o).w).n().put((Object)a2, (Object)vjh);
        }
        final rjh rjh = (rjh)((twa)o).a();
        final int a3 = ((f)rjh).a((bdk)null);
        final Logger f = e.f;
        int n;
        if ((n = a3) > 4096) {
            n = 4096;
        }
        final e e = new e(wsi, n);
        ((f)rjh).l(e);
        if (e.d > 0) {
            e.k();
        }
    }
    
    @Override
    public float h() {
        return 0.0f;
    }
    
    @Override
    public Object i(final FileInputStream fileInputStream) {
        try {
            final rjh p = rjh.p(fileInputStream);
            final mmf mmf = new mmf(false);
            final ljh[] array = (ljh[])Arrays.copyOf((Object[])new ljh[0], 0);
            mmf.b();
            if (array.length <= 0) {
                final Map m = p.m();
                m.getClass();
                for (final Map$Entry map$Entry : m.entrySet()) {
                    final String s = (String)map$Entry.getKey();
                    final vjh vjh = (vjh)map$Entry.getValue();
                    s.getClass();
                    vjh.getClass();
                    final int v = vjh.v();
                    int n;
                    if (v == 0) {
                        n = -1;
                    }
                    else {
                        n = mjh.a[ge9.D(v)];
                    }
                    switch (n) {
                        default: {
                            en9.r();
                            return null;
                        }
                        case 9: {
                            throw new IOException("Value not set.", (Throwable)null);
                        }
                        case 8: {
                            final kjh kjh = new kjh(s);
                            final fs2 n2 = vjh.n();
                            final int size = n2.size();
                            byte[] b;
                            if (size == 0) {
                                b = ejc.b;
                            }
                            else {
                                b = new byte[size];
                                n2.e(b, size);
                            }
                            mmf.e(kjh, (Object)b);
                            continue;
                        }
                        case 7: {
                            final kjh kjh2 = new kjh(s);
                            final zic o = vjh.u().o();
                            o.getClass();
                            mmf.e(kjh2, (Object)c86.w1((Iterable)o));
                            continue;
                        }
                        case 6: {
                            mmf.e(new kjh(s), (Object)vjh.t());
                            continue;
                        }
                        case 5: {
                            mmf.e(new kjh(s), (Object)vjh.s());
                            continue;
                        }
                        case 4: {
                            mmf.e(new kjh(s), (Object)vjh.r());
                            continue;
                        }
                        case 3: {
                            mmf.e(new kjh(s), (Object)vjh.p());
                            continue;
                        }
                        case 2: {
                            mmf.e(new kjh(s), (Object)vjh.q());
                            continue;
                        }
                        case 1: {
                            mmf.e(new kjh(s), (Object)vjh.m());
                            continue;
                        }
                        case -1: {
                            throw new IOException("Value case is null.", (Throwable)null);
                        }
                    }
                }
                return mmf.g();
            }
            final ljh ljh = array[0];
            throw null;
        }
        catch (final InvalidProtocolBufferException ex) {
            throw new IOException("Unable to parse preferences proto.", (Throwable)ex);
        }
    }
    
    @Override
    public float j(final float n, final long n2) {
        return 0.0f;
    }
    
    @Override
    public Object k(final uy7 uy7) {
        switch (this.v) {
            default: {
                return new wxc((wzq)uy7.d((Class)wzq.class), (qt9)uy7.d((Class)qt9.class));
            }
            case 3: {
                final Object w = uy7.w(new bmi((Class)vbd.class, (Class)Executor.class));
                w.getClass();
                return eqi.W((Executor)w);
            }
        }
    }
    
    @Override
    public g8n l() {
        return new g8n();
    }
    
    @Override
    public String m(final Object o) {
        final j0k j0k = (j0k)o;
        final zrc zrc = new zrc();
        zrc.m("type", "view");
        zrc.m("viewId", j0k.a);
        zrc.l((Number)j0k.b, "documentVersion");
        zrc.k(j0k.c, "hasAccessibility");
        return ((irc)zrc).toString();
    }
    
    @Override
    public boolean n(final Object o, final Object o2) {
        final yin yin = (yin)o;
        final yin yin2 = (yin)o2;
        if (yin != null && yin2 != null) {
            if (yin.e != yin2.e || yin.f != yin2.f || yin.b != yin2.b || !mlc.q(yin.c, yin2.c) || !gv6.c(yin.d, yin2.d)) {
                return false;
            }
        }
        else if (yin == null ^ yin2 == null) {
            return false;
        }
        return true;
    }
    
    @Override
    public long o(final float n) {
        return 0L;
    }
    
    @Override
    public sed p(int i, int f, final String s) {
        final int length = s.length();
        final int n = i + 3;
        if (n < length && s.charAt(i + 1) == '/') {
            if (s.charAt(i + 2) == '/') {
                --i;
                int n2 = -1;
                int n3 = -1;
                while (i >= f) {
                    final char char1 = s.charAt(i);
                    int n4;
                    int n5;
                    if (tjq.h(char1)) {
                        n4 = i;
                        n5 = n3;
                    }
                    else if (tjq.i(char1)) {
                        n5 = i;
                        n4 = n2;
                    }
                    else {
                        n4 = n2;
                        n5 = n3;
                        if (char1 != '+') {
                            n4 = n2;
                            n5 = n3;
                            if (char1 != '-') {
                                n4 = n2;
                                n5 = n3;
                                if (char1 != '.') {
                                    break;
                                }
                            }
                        }
                    }
                    --i;
                    n2 = n4;
                    n3 = n5;
                }
                if ((i = n2) > 0) {
                    i = n2;
                    if (n2 - 1 == n3) {
                        i = -1;
                    }
                }
                if (i != -1) {
                    f = tjq.f(n, s);
                    if (f != -1) {
                        return new sed(ued.v, i, f + 1);
                    }
                }
            }
        }
        return null;
    }
    
    @Override
    public float q(final float n, final float n2) {
        return 0.0f;
    }
    
    @Override
    public float r(final long n, final float n2, final float n3) {
        return 0.0f;
    }
    
    @Override
    public void s() {
    }
    
    public List t(final Executor executor) {
        return Collections.singletonList((Object)new j38(executor));
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 25: {
                return "SharingStarted.Eagerly";
            }
        }
    }
    
    public List u() {
        return Collections.EMPTY_LIST;
    }
}
