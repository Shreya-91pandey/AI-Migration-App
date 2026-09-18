import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Currency;
import java.util.UUID;
import java.net.InetAddress;
import java.net.URI;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.Locale;
import java.util.Map;
import java.util.Collection;
import io.sentry.r3;
import io.sentry.m2;
import java.util.TimeZone;
import io.sentry.v5;
import io.sentry.q;
import java.util.Date;
import io.sentry.vendor.gson.stream.c;
import io.sentry.b1;
import io.sentry.y;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import com.google.android.gms.internal.play_billing.e;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import android.util.Log;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReference;
import java.util.EnumMap;
import java.util.LinkedHashMap;

public final class qd6 implements zr0, ojc, ffr
{
    public final byte v;
    public int w;
    public Object x;
    
    public qd6(final byte v) {
        switch (this.v = v) {
            default: {
                this.x = new LinkedHashMap();
                return;
            }
            case 11: {
                final int t = jn6.O1.t;
                this.w = t;
                if (t != 1) {
                    final Object x = new Object();
                    final jn6 o1 = jn6.O1;
                    ((xs8)x).v = (true ^ o1.w);
                    if (o1.u) {
                        new(cxg.class)();
                    }
                    this.x = x;
                }
                else {
                    this.x = new q78((byte)9);
                }
            }
        }
    }
    
    public qd6(int w, final byte v) {
        switch (this.v = v) {
            default: {
                w = c(w);
                this.x = new zog[w];
                this.w = w - 1;
                return;
            }
            case 12: {
                qmo.c.getClass();
                int i;
                for (i = 4; i < w * 2; i <<= 1) {}
                this(new Object[i * 2], 0, (byte)12);
                return;
            }
            case 6: {
                final EnumMap x = new EnumMap((Class)xci.class);
                this.x = x;
                this.w = w;
                x.put((Enum)xci.v, (Object)new ay7(w));
                x.put((Enum)xci.w, new Object());
                return;
            }
            case 4: {
                w = c(w);
                this.x = new qd6[w];
                this.w = w - 1;
            }
        }
    }
    
    public qd6(final int w, final Object x) {
        this.v = 3;
        this.w = w;
        this.x = x;
    }
    
    public qd6(final String s, final int w) {
        this.v = 1;
        this.w = w;
        this.x = new AtomicReference((Object)s);
    }
    
    public qd6(final uba x, final int n) {
        this.v = 10;
        this.x = x;
        this(n, false, (byte)10);
    }
    
    public static int c(int n) {
        if (n <= 0) {
            en9.s("Cache capacity must be > 0");
            return 0;
        }
        int n2;
        if ((n2 = n) > 1073741824) {
            n2 = 1073741824;
        }
        n = -1 >>> Integer.numberOfLeadingZeros(n2 - 1);
        if (n < 0) {
            return 1;
        }
        if (n >= 1073741824) {
            return 1073741824;
        }
        return n + 1;
    }
    
    public static qd6 l(final Resources resources, int next, final Resources$Theme resources$Theme) {
        final XmlResourceParser xml = resources.getXml(next);
        final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
        do {
            next = ((XmlPullParser)xml).next();
        } while (next != 2 && next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        final String name = ((XmlPullParser)xml).getName();
        name.getClass();
        if (name.equals((Object)"gradient")) {
            return new qd6(t2r.f(resources, xml, attributeSet, resources$Theme), 0, (byte)0);
        }
        if (name.equals((Object)"selector")) {
            return new qd6(null, y86.b(resources, (XmlPullParser)xml, attributeSet, resources$Theme).getDefaultColor(), (byte)0);
        }
        final String positionDescription = ((XmlPullParser)xml).getPositionDescription();
        final StringBuilder sb = new StringBuilder();
        sb.append(positionDescription);
        sb.append(": unsupported complex color tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
    
    public static void m(final String s) {
        if (!s.equalsIgnoreCase(":memory:")) {
            int n = s.length() - 1;
            int i = 0;
            int n2 = 0;
            while (i <= n) {
                int n3;
                if (n2 == 0) {
                    n3 = i;
                }
                else {
                    n3 = n;
                }
                final boolean b = mlc.u((int)s.charAt(n3), 32) <= 0;
                if (n2 == 0) {
                    if (!b) {
                        n2 = 1;
                    }
                    else {
                        ++i;
                    }
                }
                else {
                    if (!b) {
                        break;
                    }
                    --n;
                }
            }
            if (s.subSequence(i, n + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(s));
                try {
                    SQLiteDatabase.deleteDatabase(new File(s));
                }
                catch (final Exception ex) {
                    Log.w("SupportSQLite", "delete failed: ", (Throwable)ex);
                }
            }
        }
    }
    
    public String a(final e e) {
        final qb2 qb2 = (qb2)this.x;
        qb2.E((rb2)new j4q((Object)qb2, (Object)e, false, (byte)7), this.w);
        return "reconnectIfNeeded";
    }
    
    public String b() {
        final Object value = ((AtomicReference)this.x).get();
        value.getClass();
        return (String)value;
    }
    
    public void d(final String s) {
        ((AtomicReference)this.x).set((Object)s);
    }
    
    public void e(final char c) {
        this.n(this.w, 1);
        ((char[])this.x)[this.w++] = c;
    }
    
    public void f() {
        if (this.w++ >= 10) {
            this.w = 0;
            final Iterator iterator = ((LinkedHashMap)this.x).values().iterator();
            while (iterator.hasNext()) {
                final ArrayList list = (ArrayList)iterator.next();
                if (list.size() <= 1) {
                    final jui jui = (jui)c86.I0((List)list);
                    a1c a1c;
                    if (jui != null) {
                        a1c = (a1c)((Reference)jui.b()).get();
                    }
                    else {
                        a1c = null;
                    }
                    if (a1c != null) {
                        continue;
                    }
                    iterator.remove();
                }
                else {
                    final int size = ((Collection)list).size();
                    int i = 0;
                    int n = 0;
                    while (i < size) {
                        final int n2 = i - n;
                        int n3 = n;
                        if (((Reference)((jui)((List)list).get(n2)).b()).get() == null) {
                            ((List)list).remove(n2);
                            n3 = n + 1;
                        }
                        ++i;
                        n = n3;
                    }
                    if (!list.isEmpty()) {
                        continue;
                    }
                    iterator.remove();
                }
            }
        }
    }
    
    public int g() {
        return this.w;
    }
    
    public void h(final String s) {
        this.n(this.w, s.length() + 2);
        final char[] array = (char[])this.x;
        final int w = this.w;
        final int n = w + 1;
        array[w] = '\"';
        final int length = s.length();
        s.getChars(0, length, array, n);
        final int n2 = length + n;
        for (int i = n; i < n2; ++i) {
            final char c = array[i];
            final byte[] b = zxm.b;
            if (c < b.length && b[c] != 0) {
                for (int j = i - n; j < s.length(); ++j) {
                    this.n(i, 2);
                    final char char1 = s.charAt(j);
                    final byte[] b2 = zxm.b;
                    if (char1 < b2.length) {
                        final byte b3 = b2[char1];
                        if (b3 == 0) {
                            final char[] array2 = (char[])this.x;
                            final int n3 = i + 1;
                            array2[i] = char1;
                            i = n3;
                        }
                        else if (b3 == 1) {
                            final String s2 = zxm.a[char1];
                            s2.getClass();
                            this.n(i, s2.length());
                            s2.getChars(0, s2.length(), (char[])this.x, i);
                            i += s2.length();
                            this.w = i;
                        }
                        else {
                            final char[] array3 = (char[])this.x;
                            array3[i] = '\\';
                            array3[i + 1] = (char)b3;
                            i += 2;
                            this.w = i;
                        }
                    }
                    else {
                        final char[] array4 = (char[])this.x;
                        final int n4 = i + 1;
                        array4[i] = char1;
                        i = n4;
                    }
                }
                this.n(i, 1);
                ((char[])this.x)[i] = '\"';
                this.w = i + 1;
                return;
            }
        }
        array[n2] = '\"';
        this.w = n2 + 1;
    }
    
    public Object i(Object o, final int n, final int n2, final oyl oyl, final oyl oyl2, final oyl oyl3) {
        final qd6[] array = (qd6[])this.x;
        final int w = this.w;
        int n5 = 0;
        Label_0181: {
            switch (oyl.v) {
                default: {
                    final CharSequence charSequence = (CharSequence)o;
                    final int min = Integer.min(charSequence.length(), n2);
                    if (n < 0 || min <= 0) {
                        break;
                    }
                    int n3 = n;
                    int n4 = 0;
                    while (true) {
                        n5 = n4;
                        if (n3 >= min) {
                            break Label_0181;
                        }
                        n4 = n4 * 31 + mbn.b(charSequence.charAt(n3));
                        ++n3;
                    }
                    break;
                }
                case 5: {
                    final String s = (String)o;
                    final int min2 = Integer.min(s.length(), n2);
                    if (n < 0 || min2 <= 0) {
                        break;
                    }
                    int n6 = n;
                    int n7 = 0;
                    while (true) {
                        n5 = n7;
                        if (n6 >= min2) {
                            break Label_0181;
                        }
                        n7 = n7 * 31 + s.charAt(n6);
                        ++n6;
                    }
                    break;
                }
            }
            n5 = 0;
        }
        int n8 = n5 & w;
        int n9 = n5;
        int n10 = 1;
        qd6[] array2 = array;
        while (true) {
            final int n11 = n9 & w;
            final qd6 qd6 = array2[n11];
            if (qd6 == null) {
                o = oyl3.b(o, n5, n, n2);
                array2[n11] = new qd6(n5, o);
                return o;
            }
            final Object x = qd6.x;
            if (n5 == qd6.w) {
                int n14 = 0;
                Label_0542: {
                    switch (oyl2.v) {
                        default: {
                            final CharSequence charSequence2 = (CharSequence)o;
                            final mbn mbn = (mbn)x;
                            final int min3 = Integer.min(charSequence2.length(), n2);
                            if (n >= 0 && min3 >= 0) {
                                if (min3 - n == mbn.length()) {
                                    for (int n12 = n, n13 = 0, n14 = 1; n14 != 0 && n12 < min3; ++n12, ++n13) {
                                        if (charSequence2.charAt(n12) == mbn.charAt(n13)) {
                                            n14 = 1;
                                        }
                                        else {
                                            n14 = 0;
                                        }
                                    }
                                    break Label_0542;
                                }
                            }
                            break;
                        }
                        case 6: {
                            final qd6[] array3 = array2;
                            final int n15 = n8;
                            final String s2 = (String)o;
                            final lbn lbn = (lbn)x;
                            final int min4 = Integer.min(s2.length(), n2);
                            if (n < 0 || min4 < 0) {
                                break;
                            }
                            if (min4 - n != lbn.v.length()) {
                                break;
                            }
                            int n16 = n;
                            int n17 = 1;
                            for (int n18 = 0; n17 != 0 && n16 < min4; ++n16, ++n18) {
                                if (s2.charAt(n16) == lbn.v.charAt(n18)) {
                                    n17 = 1;
                                }
                                else {
                                    n17 = 0;
                                }
                            }
                            final int n19 = n17;
                            n8 = n15;
                            array2 = array3;
                            n14 = n19;
                            break Label_0542;
                        }
                    }
                    n14 = 0;
                }
                if (n14 != 0) {
                    return x;
                }
            }
            if (n10 == 3) {
                o = oyl3.b(o, n5, n, n2);
                array2[n8] = new qd6(n5, o);
                return o;
            }
            n9 = Integer.reverseBytes(n9 * -1640532531) * -1640532531;
            ++n10;
        }
    }
    
    public void j(final String s) {
        final int length = s.length();
        if (length == 0) {
            return;
        }
        this.n(this.w, length);
        s.getChars(0, s.length(), (char[])this.x, this.w);
        this.w += length;
    }
    
    public Object k(final Object o, final iua iua) {
        final zog[] array = (zog[])this.x;
        final int w = this.w;
        if (o == null) {
            return null;
        }
        final int hashCode = o.hashCode();
        int n = 1;
        int n2 = hashCode;
        while (true) {
            final int n3 = n2 & w;
            final zog zog = array[n3];
            if (zog == null) {
                final Object apply = iua.apply(o);
                array[n3] = new zog(o, apply);
                return apply;
            }
            if (o.equals(zog.a)) {
                return zog.b;
            }
            if (n == 3) {
                final Object apply2 = iua.apply(o);
                array[hashCode & w] = new zog(o, apply2);
                return apply2;
            }
            n2 = Integer.reverseBytes(n2 * -1640532531) * -1640532531;
            ++n;
        }
    }
    
    public void n(int n, int n2) {
        n2 += n;
        final char[] array = (char[])this.x;
        if (array.length <= n2) {
            final int n3 = n * 2;
            if ((n = n2) < n3) {
                n = n3;
            }
            this.x = Arrays.copyOf(array, n);
        }
    }
    
    public int o(final Object o) {
        final int length = ((Object[])this.x).length;
        final wab c = qmo.c;
        final int identityHashCode = System.identityHashCode(o);
        int n = (identityHashCode ^ identityHashCode >>> 16) << 1;
        while (true) {
            n &= length - 1;
            final Object o2 = ((Object[])this.x)[n];
            if (o2 == o || o2 == null) {
                break;
            }
            n += 2;
        }
        return n;
    }
    
    public Object p(Object o) {
        final int o2 = this.o(o);
        final Object[] array = (Object[])this.x;
        if (array[o2] == null) {
            return null;
        }
        o = array[o2 + 1];
        o.getClass();
        return o;
    }
    
    public void q(int n, final pb1 pb1) {
        while (true) {
            final int n2 = n >> 1;
            if (n2 == 0) {
                break;
            }
            final pb1 pb2 = ((pb1[])this.x)[n2];
            pb2.getClass();
            if (mlc.v(0L, pb1.h - pb2.h) <= 0) {
                break;
            }
            pb2.g = n;
            ((pb1[])this.x)[n] = pb2;
            n = n2;
        }
        ((pb1[])this.x)[n] = pb1;
        pb1.g = n;
    }
    
    public void r(final vsa vsa, final int n, final int n2) {
        ((uba)this.x).r((t2k)new g5n(vsa), n, n2);
    }
    
    public Object s(final Class clazz, final Object o) {
        int o2 = this.o(clazz);
        final Object[] array = (Object[])this.x;
        if (array[o2] != null) {
            ++o2;
            final Object o3 = array[o2];
            o3.getClass();
            ((Object[])this.x)[o2] = o;
            return o3;
        }
        array[o2] = clazz;
        array[o2 + 1] = o;
        final int w = this.w + 1;
        this.w = w;
        if (w * 4 > array.length) {
            final int n = array.length * 2;
            this.x = new Object[n];
            for (int i = 0; i < array.length; i += 2) {
                final Object o4 = array[i];
                if (o4 != null) {
                    final wab c = qmo.c;
                    final int identityHashCode = System.identityHashCode(o4);
                    int n2 = (identityHashCode ^ identityHashCode >>> 16) << 1;
                    Object[] array2;
                    while (true) {
                        n2 &= n - 1;
                        array2 = (Object[])this.x;
                        if (array2[n2] == null) {
                            break;
                        }
                        n2 += 2;
                    }
                    array2[n2] = o4;
                    array2[n2 + 1] = array[i + 1];
                }
            }
        }
        return null;
    }
    
    public void t(pb1 pb1) {
        int g = pb1.g;
        if (g == -1) {
            en9.s("Failed requirement.");
            return;
        }
        final int w = this.w;
        final pb1 pb2 = ((pb1[])this.x)[w];
        pb2.getClass();
        pb1.g = -1;
        ((pb1[])this.x)[w] = null;
        this.w = w - 1;
        if (pb1 == pb2) {
            return;
        }
        final int v = mlc.v(0L, pb2.h - pb1.h);
        if (v == 0) {
            ((pb1[])this.x)[g] = pb2;
            pb2.g = g;
            return;
        }
        if (v < 0) {
            while (true) {
                final int n = g << 1;
                final int n2 = n + 1;
                final int w2 = this.w;
                if (n2 <= w2) {
                    final pb1 pb3 = ((pb1[])this.x)[n];
                    pb3.getClass();
                    pb1 = ((pb1[])this.x)[n2];
                    pb1.getClass();
                    if (mlc.v(0L, pb1.h - pb3.h) < 0) {
                        pb1 = pb3;
                    }
                }
                else {
                    if (n > w2) {
                        break;
                    }
                    pb1 = ((pb1[])this.x)[n];
                    pb1.getClass();
                }
                if (mlc.v(0L, pb1.h - pb2.h) <= 0) {
                    break;
                }
                final int g2 = pb1.g;
                pb1.g = g;
                ((pb1[])this.x)[g] = pb1;
                g = g2;
            }
            ((pb1[])this.x)[g] = pb2;
            pb2.g = g;
            return;
        }
        this.q(g, pb2);
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 5: {
                return new String((char[])this.x, 0, this.w);
            }
        }
    }
    
    public void u(final y y, final b1 b1, final Object o) {
        final c c = (c)y.w;
        if (o == null) {
            c.p();
            return;
        }
        if (o instanceof Character) {
            y.B(Character.toString((char)o));
            return;
        }
        if (o instanceof String) {
            y.B((String)o);
            return;
        }
        if (o instanceof Boolean) {
            y.C((boolean)o);
            return;
        }
        if (o instanceof Number) {
            y.A((Number)o);
            return;
        }
        if (o instanceof Date) {
            final Date date = (Date)o;
            try {
                y.B(q.f(date.getTime()));
            }
            catch (final Exception ex) {
                b1.f(v5.ERROR, "Error when serializing Date", (Throwable)ex);
                c.p();
            }
        }
        else if (o instanceof TimeZone) {
            final TimeZone timeZone = (TimeZone)o;
            try {
                y.B(timeZone.getID());
            }
            catch (final Exception ex2) {
                b1.f(v5.ERROR, "Error when serializing TimeZone", (Throwable)ex2);
                c.p();
            }
        }
        else {
            if (o instanceof m2) {
                ((m2)o).serialize((r3)y, b1);
                return;
            }
            if (o instanceof Collection) {
                this.v(y, b1, (Collection)o);
                return;
            }
            final boolean b2 = o instanceof boolean[];
            final int n = 0;
            int i = 0;
            final int n2 = 0;
            final int n3 = 0;
            final int n4 = 0;
            final int n5 = 0;
            final int n6 = 0;
            final int n7 = 0;
            if (b2) {
                final boolean[] array = (boolean[])o;
                final ArrayList list = new ArrayList(array.length);
                for (int length = array.length, j = n7; j < length; ++j) {
                    list.add((Object)array[j]);
                }
                this.v(y, b1, (Collection)list);
                return;
            }
            if (o instanceof byte[]) {
                final byte[] array2 = (byte[])o;
                final ArrayList list2 = new ArrayList(array2.length);
                for (int length2 = array2.length, k = n; k < length2; ++k) {
                    list2.add((Object)array2[k]);
                }
                this.v(y, b1, (Collection)list2);
                return;
            }
            if (o instanceof short[]) {
                final short[] array3 = (short[])o;
                final ArrayList list3 = new ArrayList(array3.length);
                while (i < array3.length) {
                    list3.add((Object)array3[i]);
                    ++i;
                }
                this.v(y, b1, (Collection)list3);
                return;
            }
            if (o instanceof char[]) {
                final char[] array4 = (char[])o;
                final ArrayList list4 = new ArrayList(array4.length);
                for (int length3 = array4.length, l = n2; l < length3; ++l) {
                    list4.add((Object)array4[l]);
                }
                this.v(y, b1, (Collection)list4);
                return;
            }
            if (o instanceof int[]) {
                final int[] array5 = (int[])o;
                final ArrayList list5 = new ArrayList(array5.length);
                for (int length4 = array5.length, n8 = n3; n8 < length4; ++n8) {
                    list5.add((Object)array5[n8]);
                }
                this.v(y, b1, (Collection)list5);
                return;
            }
            if (o instanceof long[]) {
                final long[] array6 = (long[])o;
                final ArrayList list6 = new ArrayList(array6.length);
                for (int length5 = array6.length, n9 = n4; n9 < length5; ++n9) {
                    list6.add((Object)array6[n9]);
                }
                this.v(y, b1, (Collection)list6);
                return;
            }
            if (o instanceof float[]) {
                final float[] array7 = (float[])o;
                final ArrayList list7 = new ArrayList(array7.length);
                for (int length6 = array7.length, n10 = n5; n10 < length6; ++n10) {
                    list7.add((Object)array7[n10]);
                }
                this.v(y, b1, (Collection)list7);
                return;
            }
            if (o instanceof double[]) {
                final double[] array8 = (double[])o;
                final ArrayList list8 = new ArrayList(array8.length);
                for (int length7 = array8.length, n11 = n6; n11 < length7; ++n11) {
                    list8.add((Object)array8[n11]);
                }
                this.v(y, b1, (Collection)list8);
                return;
            }
            if (o.getClass().isArray()) {
                this.v(y, b1, (Collection)Arrays.asList((Object[])o));
                return;
            }
            if (o instanceof Map) {
                this.w(y, b1, (Map)o);
                return;
            }
            if (o instanceof Locale) {
                y.B(o.toString());
                return;
            }
            if (o instanceof AtomicIntegerArray) {
                this.v(y, b1, (Collection)io.sentry.util.e.a((AtomicIntegerArray)o));
                return;
            }
            if (o instanceof AtomicBoolean) {
                y.C(((AtomicBoolean)o).get());
                return;
            }
            if (o instanceof URI) {
                y.B(o.toString());
                return;
            }
            if (o instanceof InetAddress) {
                y.B(o.toString());
                return;
            }
            if (o instanceof UUID) {
                y.B(o.toString());
                return;
            }
            if (o instanceof Currency) {
                y.B(o.toString());
                return;
            }
            if (o instanceof Calendar) {
                this.w(y, b1, (Map)io.sentry.util.e.b((Calendar)o));
                return;
            }
            if (o.getClass().isEnum()) {
                y.B(o.toString());
                return;
            }
            try {
                pw x;
                if ((x = (pw)this.x) == null) {
                    x = new pw(this.w, (byte)12);
                    this.x = x;
                }
                this.u(y, b1, x.i(b1, o));
            }
            catch (final Exception ex3) {
                b1.f(v5.ERROR, "Failed serializing unknown object.", (Throwable)ex3);
                y.B("[OBJECT]");
            }
        }
    }
    
    public void v(final y y, final b1 b1, final Collection collection) {
        final c c = (c)y.w;
        c.L();
        c.c();
        final int x = c.x;
        int[] w;
        final int[] array = w = c.w;
        if (x == array.length) {
            w = Arrays.copyOf(array, x * 2);
            c.w = w;
        }
        w[c.x++] = 1;
        c.v.write(91);
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.u(y, b1, iterator.next());
        }
        c.g(']', 1, 2);
    }
    
    public void w(final y y, final b1 b1, final Map map) {
        y.n();
        for (final Object next : map.keySet()) {
            if (next instanceof String) {
                y.s((String)next);
                this.u(y, b1, map.get(next));
            }
        }
        y.p();
    }
    
    public void writeLong(final long n) {
        this.j(String.valueOf(n));
    }
    
    public void x(final vse vse, final a1c a1c, final Map map, final long n) {
        final LinkedHashMap linkedHashMap = (LinkedHashMap)this.x;
        Object value;
        if ((value = linkedHashMap.get((Object)vse)) == null) {
            value = new ArrayList();
            ((Map)linkedHashMap).put((Object)vse, value);
        }
        final ArrayList list = (ArrayList)value;
        final jui jui = new jui(new WeakReference((Object)a1c), map, n);
        if (list.isEmpty()) {
            ((Collection)list).add((Object)jui);
        }
        else {
            final int size = ((Collection)list).size();
            int i = 0;
            while (i < size) {
                final jui jui2 = (jui)list.get(i);
                if (n >= jui2.c()) {
                    if (((Reference)jui2.b()).get() == a1c) {
                        list.set(i, (Object)jui);
                        break;
                    }
                    list.add(i, (Object)jui);
                    break;
                }
                else {
                    ++i;
                }
            }
        }
        this.f();
    }
}
