import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.Set;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.Locale;
import android.os.LocaleList;
import java.util.Map$Entry;
import com.squareup.moshi.JsonDataException;
import java.util.ListIterator;
import java.util.Collection;
import com.anthropic.claude.types.strings.MessageId;
import java.util.HashSet;
import androidx.compose.ui.node.LayoutNode;
import java.lang.reflect.InvocationTargetException;
import java.time.DayOfWeek;
import com.anthropic.claude.api.account.GreetingSlot;
import com.anthropic.claude.api.account.GreetingDay;
import com.anthropic.claude.api.account.GreetingSurfaceEntry;
import java.time.ZonedDateTime;
import com.anthropic.claude.conversation.model.q0;
import android.content.SharedPreferences;
import android.content.Context;
import java.util.Iterator;
import java.util.NoSuchElementException;
import android.content.ComponentName;
import android.app.Activity;
import java.util.List;
import java.util.ArrayList;
import android.os.Trace;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public abstract class omo
{
    public static final ye6 a;
    public static final ye6 b;
    public static final ye6 c;
    public static final ye6 d;
    public static final kjh e;
    public static final rv0 f;
    public static final zmm g;
    public static final zmm h;
    public static final zmm i;
    public static final zmm j;
    public static final zmm k;
    public static final zmm l;
    public static final zmm m;
    public static final zmm n;
    public static final zmm o;
    public static long p;
    public static Method q;
    public static Method r;
    public static Method s;
    
    public static final float A(final float n, final float n2) {
        if (n2 == 0.0f) {
            return 0.0f;
        }
        if (n2 > 0.0f) {
            if (n <= n2) {
                return n;
            }
        }
        else if (n >= n2) {
            return n;
        }
        return n2;
    }
    
    public static final void B(final int n, final String s) {
        if (Build$VERSION.SDK_INT >= 29) {
            bec.b(n, h0(s));
            return;
        }
        final String h0 = h0(s);
        try {
            Method s2;
            if ((s2 = omo.s) == null) {
                s2 = (omo.s = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE));
            }
            if (s2 != null) {
                s2.invoke((Object)null, new Object[] { omo.p, h0, n });
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        catch (final Exception ex) {
            N(ex);
        }
    }
    
    public static final sfk C(final int n, final ArrayList list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (((sfk)list.get(i)).a() == n) {
                return (sfk)list.get(i);
            }
        }
        return null;
    }
    
    public static final int D(final int n, final List list) {
        final int c = ((hrg)c86.P0(list)).c;
        if (n > ((hrg)c86.P0(list)).c) {
            final StringBuilder sb = new StringBuilder("Index ");
            sb.append(n);
            sb.append(" should be less or equal than last line's end ");
            sb.append(c);
            hac.a(sb.toString());
        }
        int n2 = list.size() - 1;
        int i = 0;
        while (true) {
            while (i <= n2) {
                final int n3 = i + n2 >>> 1;
                final hrg hrg = (hrg)list.get(n3);
                int n4;
                if (hrg.b > n) {
                    n4 = 1;
                }
                else if (hrg.c <= n) {
                    n4 = -1;
                }
                else {
                    n4 = 0;
                }
                if (n4 < 0) {
                    i = n3 + 1;
                }
                else {
                    final int n5 = n3;
                    if (n4 > 0) {
                        n2 = n3 - 1;
                    }
                    else {
                        if (n5 >= 0 && n5 < ((Collection)list).size()) {
                            return n5;
                        }
                        final int size = list.size();
                        final String a = ald.a(list, (String)null, (lta)new gfe((byte)10), 31);
                        final StringBuilder o = hia.o(n5, size, "Found paragraph index ", " should be in range [0, ", ").\nDebug info: index=");
                        o.append(n);
                        o.append(", paragraphs=[");
                        o.append(a);
                        o.append("]");
                        hac.a(o.toString());
                        return n5;
                    }
                }
            }
            final int n5 = -(i + 1);
            continue;
        }
    }
    
    public static final int E(final int n, final List list) {
        int n2 = list.size() - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final hrg hrg = (hrg)list.get(n3);
            int n4;
            if (hrg.d > n) {
                n4 = 1;
            }
            else if (hrg.e <= n) {
                n4 = -1;
            }
            else {
                n4 = 0;
            }
            if (n4 < 0) {
                i = n3 + 1;
            }
            else {
                if (n4 <= 0) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final int F(final ArrayList list, final float n) {
        if (n <= 0.0f) {
            return 0;
        }
        if (n >= ((hrg)c86.P0((List)list)).g) {
            return lq6.P((List)list);
        }
        int n2 = list.size() - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final hrg hrg = (hrg)list.get(n3);
            int n4;
            if (hrg.f > n) {
                n4 = 1;
            }
            else if (hrg.g <= n) {
                n4 = -1;
            }
            else {
                n4 = 0;
            }
            if (n4 < 0) {
                i = n3 + 1;
            }
            else {
                if (n4 <= 0) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final void G(final ArrayList list, final long n, final lta lta) {
        for (int i = D(dnn.g(n), (List)list); i < list.size(); ++i) {
            final hrg hrg = (hrg)list.get(i);
            if (hrg.b >= dnn.f(n)) {
                break;
            }
            if (hrg.b != hrg.c) {
                lta.b(hrg);
            }
        }
    }
    
    public static z0k H(Object o, final String s) {
        ComponentName componentName;
        if (o instanceof Activity) {
            componentName = ((Activity)o).getComponentName();
        }
        else {
            componentName = null;
        }
        if (componentName == null) {
            final boolean b = o instanceof String;
            String s2;
            if (b) {
                s2 = (String)o;
            }
            else if (o instanceof Number) {
                s2 = o.toString();
            }
            else if (o instanceof Enum) {
                s2 = hia.k(o.getClass().getName(), "@", ((Enum)o).name());
            }
            else {
                s2 = o.toString();
            }
            String s3;
            if (b) {
                s3 = (String)o;
            }
            else if (o instanceof Number) {
                s3 = o.toString();
            }
            else if (o instanceof Enum) {
                s3 = hia.k(o.getClass().getName(), ".", ((Enum)o).name());
            }
            else if ((s3 = o.getClass().getCanonicalName()) == null) {
                s3 = o.getClass().getSimpleName();
            }
            String s4;
            if ((s4 = s) == null) {
                String s5;
                if (b) {
                    s5 = (String)o;
                }
                else if (o instanceof Number) {
                    s5 = o.toString();
                }
                else if (o instanceof Enum) {
                    s5 = ((Enum)o).name();
                }
                else {
                    s5 = o.getClass().getName();
                }
                s4 = s5;
            }
            return new z0k(s2, s3, s4);
        }
        final String className = componentName.getClassName();
        final int identityHashCode = System.identityHashCode(o);
        o = new StringBuilder();
        ((StringBuilder)o).append(className);
        ((StringBuilder)o).append("@");
        ((StringBuilder)o).append(identityHashCode);
        final String string = ((StringBuilder)o).toString();
        final String packageName = componentName.getPackageName();
        packageName.getClass();
        String s6;
        if (packageName.length() == 0) {
            s6 = componentName.getClassName();
            s6.getClass();
        }
        else {
            final String className2 = componentName.getClassName();
            className2.getClass();
            final String packageName2 = componentName.getPackageName();
            o = new StringBuilder();
            ((StringBuilder)o).append(packageName2);
            ((StringBuilder)o).append(".");
            if (rym.E0(className2, ((StringBuilder)o).toString(), false)) {
                s6 = componentName.getClassName();
                s6.getClass();
            }
            else {
                final String className3 = componentName.getClassName();
                className3.getClass();
                if (kym.J0((CharSequence)className3, '.')) {
                    s6 = componentName.getClassName();
                    s6.getClass();
                }
                else {
                    s6 = smk.t(componentName.getPackageName(), ".", componentName.getClassName());
                }
            }
        }
        String className4 = s;
        if (s == null) {
            className4 = componentName.getClassName();
            className4.getClass();
        }
        return new z0k(string, s6, className4);
    }
    
    public static klj I(final zrc zrc) {
        Label_0330: {
            Label_0321: {
                Label_0312: {
                    int n = 0;
                    int n3 = 0;
                    Object o2 = null;
                Label_0219:
                    while (true) {
                    Label_0216:
                        while (true) {
                            int n2 = 0;
                            Label_0293: {
                                while (true) {
                                    int n4;
                                    try {
                                        final String i = zrc.o("status").i();
                                        i.getClass();
                                        final int[] f = ge9.F(3);
                                        final int length = f.length;
                                        n = 0;
                                        n2 = 0;
                                        if (n2 >= length) {
                                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                                        }
                                        n3 = f[n2];
                                        if (!lmf.n(n3).equals(i)) {
                                            break Label_0293;
                                        }
                                        final irc o = zrc.o("interfaces");
                                        if (o == null) {
                                            break Label_0216;
                                        }
                                        final ArrayList v = o.d().v;
                                        final ArrayList list = new ArrayList(v.size());
                                        final Iterator iterator = v.iterator();
                                        while (true) {
                                            o2 = list;
                                            if (!iterator.hasNext()) {
                                                break Label_0219;
                                            }
                                            final String j = ((irc)iterator.next()).i();
                                            j.getClass();
                                            final xlj[] values = xlj.values();
                                            final int length2 = values.length;
                                            n4 = 0;
                                            if (n4 >= length2) {
                                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                                            }
                                            final xlj xlj = values[n4];
                                            if (!xlj.v.equals(j)) {
                                                break;
                                            }
                                            list.add((Object)xlj);
                                        }
                                    }
                                    catch (final NullPointerException ex) {
                                        break Label_0312;
                                    }
                                    catch (final NumberFormatException ex2) {
                                        break Label_0321;
                                    }
                                    catch (final IllegalStateException ex3) {
                                        break Label_0330;
                                    }
                                    ++n4;
                                    continue;
                                }
                            }
                            ++n2;
                            continue;
                        }
                        o2 = null;
                        break;
                    }
                    final irc o3 = zrc.o("effective_type");
                    int e = n;
                    if (o3 != null) {
                        final String k = o3.i();
                        e = n;
                        if (k != null) {
                            e = dbr.e(k);
                        }
                    }
                    final irc o4 = zrc.o("cellular");
                    glj c;
                    if (o4 != null) {
                        c = nar.c(o4.e());
                    }
                    else {
                        c = null;
                    }
                    return new klj(n3, (List)o2, e, c);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Connectivity", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Connectivity", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Connectivity", (Throwable)ex3);
        return null;
    }
    
    public static SharedPreferences J(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }
    
    public static final omn K(final tsk tsk) {
        final ArrayList list = new ArrayList();
        Object g;
        if ((g = tsk.v.g(rsk.a)) == null) {
            g = null;
        }
        final t3 t3 = (t3)g;
        if (t3 != null) {
            final lta lta = (lta)t3.b;
            if (lta != null && (boolean)lta.b(list)) {
                return (omn)list.get(0);
            }
        }
        return null;
    }
    
    public static final sdo L(final q0 q0) {
        final pvk o = q0.o;
        if (o instanceof kvk) {
            final kvk kvk = (kvk)o;
            return (sdo)new qdo(kvk.c(), kvk.d(), q0.h, q0.i);
        }
        if (!mlc.q(o, mvk.a) && !mlc.q(o, lvk.a)) {
            if (!mlc.q(o, nvk.a) && !mlc.q(o, ovk.a)) {
                if (!(o instanceof c0h)) {
                    en9.r();
                }
            }
            return null;
        }
        return (sdo)new rdo(q0.k, q0.l, q0.n, q0.m, q0.g);
    }
    
    public static final String M(List list, final String s, final ZonedDateTime zonedDateTime) {
        while (true) {
        Label_0296_Outer:
            for (final Object next : list) {
                if (mlc.q(((GreetingSurfaceEntry)next).a, s)) {
                    final GreetingSurfaceEntry greetingSurfaceEntry = (GreetingSurfaceEntry)next;
                    if (greetingSurfaceEntry != null) {
                        list = greetingSurfaceEntry.b;
                        Label_0252: {
                            Label_0247: {
                                if (list != null) {
                                    while (true) {
                                        for (final Object next2 : list) {
                                            final String a = ((GreetingDay)next2).a;
                                            final DayOfWeek dayOfWeek = zonedDateTime.getDayOfWeek();
                                            dayOfWeek.getClass();
                                            String s2 = null;
                                            switch (e7.a[((Enum)dayOfWeek).ordinal()]) {
                                                default: {
                                                    en9.r();
                                                    return null;
                                                }
                                                case 7: {
                                                    s2 = "sun";
                                                    break;
                                                }
                                                case 6: {
                                                    s2 = "sat";
                                                    break;
                                                }
                                                case 5: {
                                                    s2 = "fri";
                                                    break;
                                                }
                                                case 4: {
                                                    s2 = "thu";
                                                    break;
                                                }
                                                case 3: {
                                                    s2 = "wed";
                                                    break;
                                                }
                                                case 2: {
                                                    s2 = "tue";
                                                    break;
                                                }
                                                case 1: {
                                                    s2 = "mon";
                                                    break;
                                                }
                                            }
                                            if (mlc.q(a, s2)) {
                                                final GreetingDay greetingDay = (GreetingDay)next2;
                                                final GreetingDay greetingDay2 = greetingDay;
                                                if (greetingDay2 == null || (list = greetingDay2.b) == null) {
                                                    break Label_0247;
                                                }
                                                break Label_0252;
                                            }
                                        }
                                        final GreetingDay greetingDay = null;
                                        continue Label_0296_Outer;
                                    }
                                }
                            }
                            list = greetingSurfaceEntry.c;
                        }
                        while (true) {
                            for (final Object next3 : list) {
                                if (zonedDateTime.getHour() < ((GreetingSlot)next3).a) {
                                    final GreetingSlot greetingSlot = (GreetingSlot)next3;
                                    if (greetingSlot != null) {
                                        return greetingSlot.b;
                                    }
                                    return null;
                                }
                            }
                            Object next3 = null;
                            continue;
                        }
                    }
                    return null;
                }
            }
            Object next = null;
            continue;
        }
    }
    
    public static void N(final Exception ex) {
        if (!(ex instanceof InvocationTargetException)) {
            return;
        }
        final Throwable cause = ((InvocationTargetException)ex).getCause();
        if (!(cause instanceof RuntimeException)) {
            uy8.i(cause);
            return;
        }
        throw cause;
    }
    
    public static final int O(final int n, final int n2) {
        return n >> n2 & 0x1F;
    }
    
    public static final boolean P() {
        if (Build$VERSION.SDK_INT >= 29) {
            return bec.d();
        }
        try {
            Method q;
            if ((q = omo.q) == null) {
                omo.p = Trace.class.getField("TRACE_TAG_APP").getLong((Object)null);
                q = (omo.q = Trace.class.getMethod("isTagEnabled", Long.TYPE));
            }
            if (q != null) {
                final Object invoke = q.invoke((Object)null, new Object[] { omo.p });
                invoke.getClass();
                return (boolean)invoke;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        catch (final Exception ex) {
            N(ex);
            return false;
        }
    }
    
    public static boolean Q(final int n, final Object o) {
        if (o instanceof aua) {
            int e;
            if (o instanceof kua) {
                e = ((kua)o).e();
            }
            else if (o instanceof jta) {
                e = 0;
            }
            else if (o instanceof lta) {
                e = 1;
            }
            else if (o instanceof zta) {
                e = 2;
            }
            else if (o instanceof bua) {
                e = 3;
            }
            else if (o instanceof cua) {
                e = 4;
            }
            else if (o instanceof dua) {
                e = 5;
            }
            else if (o instanceof eua) {
                e = 6;
            }
            else if (o instanceof fua) {
                e = 7;
            }
            else if (o instanceof gua) {
                e = 8;
            }
            else if (o instanceof hua) {
                e = 9;
            }
            else if (o instanceof kta) {
                e = 10;
            }
            else if (o instanceof mta) {
                e = 11;
            }
            else if (o instanceof ota) {
                e = 13;
            }
            else if (o instanceof pta) {
                e = 14;
            }
            else if (o instanceof qta) {
                e = 15;
            }
            else if (o instanceof rta) {
                e = 16;
            }
            else if (o instanceof sta) {
                e = 17;
            }
            else if (o instanceof tta) {
                e = 18;
            }
            else if (o instanceof uta) {
                e = 19;
            }
            else if (o instanceof wta) {
                e = 20;
            }
            else if (o instanceof xta) {
                e = 21;
            }
            else {
                e = -1;
            }
            if (e == n) {
                return true;
            }
        }
        return false;
    }
    
    public static final boolean R(final LayoutNode layoutNode) {
        if (layoutNode.D != null) {
            final LayoutNode g = layoutNode.G();
            LayoutNode d;
            if (g != null) {
                d = g.D;
            }
            else {
                d = null;
            }
            if (d == null || layoutNode.t().b) {
                return true;
            }
        }
        return false;
    }
    
    public static final HashSet S(final o2 o2) {
        final ArrayList list = new ArrayList();
        final ListIterator listIterator = ((n1)o2).listIterator(0);
        while (((Iterator)listIterator).hasNext()) {
            final Object next = ((Iterator)listIterator).next();
            if (next instanceof q0) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList();
        for (final Object next2 : list) {
            if (((q0)next2).o.isOpen()) {
                list2.add(next2);
            }
        }
        final HashSet set = new HashSet();
        for (final q0 q0 : list2) {
            final u6f a = q0.a;
            MessageId messageId = null;
            String a2;
            if (a != null) {
                a2 = a.a;
            }
            else {
                a2 = null;
            }
            MessageId messageId2;
            if (a2 != null) {
                messageId2 = new MessageId(a2);
            }
            else {
                messageId2 = null;
            }
            final String c = q0.c;
            if (c != null) {
                messageId = new MessageId(c);
            }
            h86.t0((Collection)set, (Iterable)iw0.W0((Object[])new MessageId[] { messageId2, messageId }));
        }
        return set;
    }
    
    public static final igf T(final igf igf, final dng dng) {
        return igf.E((igf)new gng(dng));
    }
    
    public static final igf U(final igf igf, final float n) {
        return igf.E((igf)new zmg(n, n, n, n));
    }
    
    public static final igf V(final igf igf, final float n, final float n2) {
        return igf.E((igf)new zmg(n, n2, n, n2));
    }
    
    public static igf W(final igf igf, float n, float n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = 0.0f;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        return V(igf, n, n2);
    }
    
    public static final igf X(final igf igf, final float n, final float n2, final float n3, final float n4) {
        return igf.E((igf)new zmg(n, n2, n3, n4));
    }
    
    public static igf Y(final igf igf, float n, float n2, float n3, float n4, final int n5) {
        if ((n5 & 0x1) != 0x0) {
            n = 0.0f;
        }
        if ((n5 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        if ((n5 & 0x4) != 0x0) {
            n3 = 0.0f;
        }
        if ((n5 & 0x8) != 0x0) {
            n4 = 0.0f;
        }
        return X(igf, n, n2, n3, n4);
    }
    
    public static int Z(final ftc ftc, final String s, final int n, final int n2) {
        final int nextInt = ftc.nextInt();
        if (nextInt >= n && nextInt <= n2) {
            return nextInt;
        }
        final String q = ftc.q();
        final StringBuilder s2 = oz1.s(nextInt, "Expected ", s, " but was ", " at path ");
        s2.append(q);
        throw new JsonDataException(s2.toString());
    }
    
    public static final void a(final int n, final int n2, final jta jta, final gva gva, boolean b) {
        gva.i0(-361453782);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0x6) == 0x0) {
            int n5;
            if (gva.g(b)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n | n5);
        }
        else {
            n4 = n;
        }
        int n6 = n4;
        if ((n & 0x30) == 0x0) {
            int n7;
            if (gva.h((Object)jta)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n4 | n7);
        }
        final boolean b2 = true;
        if (gva.W(n6 & 0x1, (n6 & 0x13) != 0x12)) {
            if (n3 != 0) {
                b = true;
            }
            Object o = vod.a(gva);
            if (o == null) {
                gva.g0(535274673);
                o = wod.a(gva);
            }
            else {
                gva.g0(535271790);
            }
            gva.q(false);
            if (o == null) {
                en9.q("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            final boolean f = gva.f(o);
            final Object r = gva.R();
            final cib a = bi6.a;
            lo1 lo1;
            if (f || (lo1 = (lo1)r) == a) {
                final boolean b3 = o instanceof crf;
                d8g e = null;
                crf crf;
                if (b3) {
                    crf = (crf)o;
                }
                else {
                    crf = null;
                }
                c2l a2;
                if (crf != null) {
                    a2 = crf.a();
                }
                else {
                    a2 = null;
                }
                f8g f8g;
                if (o instanceof f8g) {
                    f8g = (f8g)o;
                }
                else {
                    f8g = null;
                }
                if (f8g != null) {
                    e = f8g.e();
                }
                lo1 = new lo1(a2, e);
                gva.q0((Object)lo1);
            }
            final lo1 lo2 = lo1;
            final long t = gva.T;
            final boolean f2 = gva.f((Object)lo2);
            final boolean e2 = gva.e(t);
            final Object r2 = gva.R();
            ko1 ko1;
            if ((f2 | e2) || (ko1 = (ko1)r2) == a) {
                ko1 = new ko1(new mo1(t, o));
                ((fh6)ko1).c = (jta)new lv4((byte)14);
                gva.q0((Object)ko1);
            }
            final fh6 fh6 = (fh6)ko1;
            gva.g0(-585307852);
            final boolean h = gva.h((Object)fh6);
            final boolean b4 = (n6 & 0x70) == 0x20;
            final Object r3 = gva.R();
            Object o2;
            if ((b4 | h) || (o2 = r3) == a) {
                o2 = new jd0((Object)fh6, (Object)jta, (byte)4);
                gva.q0(o2);
            }
            mlc.l((jta)o2, gva);
            final boolean h2 = gva.h((Object)fh6);
            final int n8 = n6 & 0xE;
            final boolean b5 = n8 == 4 && b2;
            final Object r4 = gva.R();
            Object o3;
            if ((h2 | b5) || (o3 = r4) == a) {
                o3 = new no1((ko1)fh6, b, (byte)0);
                gva.q0(o3);
            }
            t08.l((Object)b, (Object)fh6, (gbd)null, (lta)o3, gva, n8);
            final boolean h3 = gva.h((Object)lo2);
            final boolean h4 = gva.h((Object)fh6);
            final Object r5 = gva.R();
            Object o4;
            if ((h3 | h4) || (o4 = r5) == a) {
                o4 = new e4((Object)lo2, (Object)fh6, (byte)4);
                gva.q0(o4);
            }
            mlc.b(lo2, fh6, (lta)o4, gva);
            gva.q(false);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new oo1(b, jta, n, n2, (byte)0);
        }
    }
    
    public static final void a0(final l13 l13, f07 a0, final boolean b) {
        final Object q = l13.q();
        final Throwable e = l13.e(q);
        Object f;
        if (e != null) {
            f = new jpj(e);
        }
        else {
            f = l13.f(q);
        }
        if (b) {
            a0.getClass();
            final oo8 oo8 = (oo8)a0;
            final h07 z = oo8.z;
            final Object b2 = oo8.B;
            final hc7 context = z.getContext();
            final Object c = asn.c(context, b2);
            if (c != asn.a) {
                a0 = twl.a0(z, context, c);
            }
            else {
                a0 = null;
            }
            try {
                z.resumeWith(f);
                if (a0 != null && !((zpo)a0).q0()) {
                    return;
                }
                asn.a(context, c);
                return;
            }
            finally {
                if (a0 == null || ((zpo)a0).q0()) {
                    asn.a(context, c);
                }
            }
        }
        ((f07)a0).resumeWith(f);
    }
    
    public static final void b(final boolean b, final jta jta, igf v, long n, ufk ufk, tgh tgh, aql aql, long d, float n2, final ye6 ye6, final gva gva, final int n3, final int n4, final int n5) {
        gva.i0(-1736009003);
        int n7;
        if ((n3 & 0x6) == 0x0) {
            int n6;
            if (gva.g(b)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n7 = (n6 | n3);
        }
        else {
            n7 = n3;
        }
        int n8 = n7;
        if ((n3 & 0x30) == 0x0) {
            int n9;
            if (gva.h((Object)jta)) {
                n9 = 32;
            }
            else {
                n9 = 16;
            }
            n8 = (n7 | n9);
        }
        final int n10 = n5 & 0x4;
        int n13 = 0;
        Label_0156: {
            int n11;
            if (n10 != 0) {
                n11 = (n8 | 0x180);
            }
            else {
                n11 = n8;
                if ((n3 & 0x180) == 0x0) {
                    int n12;
                    if (gva.f((Object)v)) {
                        n12 = 256;
                    }
                    else {
                        n12 = 128;
                    }
                    n13 = (n8 | n12);
                    break Label_0156;
                }
            }
            n13 = n11;
        }
        final int n14 = n5 & 0x8;
        int n15;
        if (n14 != 0) {
            n15 = (n13 | 0xC00);
        }
        else {
            n15 = n13;
            if ((n3 & 0xC00) == 0x0) {
                int n16;
                if (gva.e(n)) {
                    n16 = 2048;
                }
                else {
                    n16 = 1024;
                }
                n15 = (n13 | n16);
            }
        }
        int n17 = n15;
        if ((n3 & 0x6000) == 0x0) {
            n17 = (n15 | 0x2000);
        }
        final int n18 = n5 & 0x20;
        int n21 = 0;
        Label_0312: {
            int n19;
            if (n18 != 0) {
                n19 = (n17 | 0x30000);
            }
            else {
                n19 = n17;
                if ((n3 & 0x30000) == 0x0) {
                    int n20;
                    if (gva.f((Object)tgh)) {
                        n20 = 131072;
                    }
                    else {
                        n20 = 65536;
                    }
                    n21 = (n17 | n20);
                    break Label_0312;
                }
            }
            n21 = n19;
        }
        if ((n3 & 0x180000) == 0x0) {
            int n22;
            if ((n5 & 0x40) == 0x0 && gva.f((Object)aql)) {
                n22 = 1048576;
            }
            else {
                n22 = 524288;
            }
            n21 |= n22;
        }
        int n24;
        if ((n3 & 0xC00000) == 0x0) {
            int n23;
            if ((n5 & 0x80) == 0x0 && gva.e(d)) {
                n23 = 8388608;
            }
            else {
                n23 = 4194304;
            }
            n24 = (n21 | n23);
        }
        else {
            n24 = n21;
        }
        int n25 = n24;
        if ((n3 & 0x6000000) == 0x0) {
            int n26;
            if ((n5 & 0x100) == 0x0 && gva.c(0.0f)) {
                n26 = 67108864;
            }
            else {
                n26 = 33554432;
            }
            n25 = (n24 | n26);
        }
        if ((n3 & 0x30000000) == 0x0) {
            int n27;
            if ((n5 & 0x200) == 0x0 && gva.c(n2)) {
                n27 = 536870912;
            }
            else {
                n27 = 268435456;
            }
            n25 |= n27;
        }
        int n28 = n4 | 0x6;
        if ((n4 & 0x30) == 0x0) {
            int n29;
            if (gva.h((Object)ye6)) {
                n29 = 32;
            }
            else {
                n29 = 16;
            }
            n28 |= n29;
        }
        if (gva.W(n25 & 0x1, (n25 & 0x12492493) != 0x12492492 || (n28 & 0x13) != 0x12)) {
            gva.b0();
            int n33;
            aql f;
            ufk ufk3;
            if ((n3 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n30 = n25 & 0xFFFF1FFF;
                if ((n5 & 0x40) != 0x0) {
                    n30 = (n25 & 0xFFC71FFF);
                }
                int n31 = n30;
                if ((n5 & 0x80) != 0x0) {
                    n31 = (n30 & 0xFE3FFFFF);
                }
                int n32 = n31;
                if ((n5 & 0x100) != 0x0) {
                    n32 = (n31 & 0xF1FFFFFF);
                }
                n33 = n32;
                if ((n5 & 0x200) != 0x0) {
                    n33 = (n32 & 0x8FFFFFFF);
                }
                final ufk ufk2 = ufk;
                f = aql;
                final long n34 = n;
                n = d;
                ufk3 = ufk2;
                d = n34;
            }
            else {
                if (n10 != 0) {
                    v = (igf)fgf.v;
                }
                if (n14 != 0) {
                    n = ((long)Float.floatToRawIntBits(0.0f) << 32 | ((long)Float.floatToRawIntBits(0.0f) & 0xFFFFFFFFL));
                }
                final ufk t = rhc.T(0, 1, gva);
                final int n35 = n25 & 0xFFFF1FFF;
                if (n18 != 0) {
                    tgh = new tgh(true, false, 30);
                }
                int n36;
                if ((n5 & 0x40) != 0x0) {
                    final cy4 a = qy4.a;
                    f = qy4.b(gva).f;
                    n36 = (n25 & 0xFFC71FFF);
                }
                else {
                    f = aql;
                    n36 = n35;
                }
                if ((n5 & 0x80) != 0x0) {
                    final tgh a2 = rze.a;
                    d = s86.d(36, gva);
                    n36 &= 0xFE3FFFFF;
                }
                int n37 = n36;
                if ((n5 & 0x100) != 0x0) {
                    final tgh a3 = rze.a;
                    n37 = (n36 & 0xF1FFFFFF);
                }
                if ((n5 & 0x200) != 0x0) {
                    final tgh a4 = rze.a;
                    n33 = (n37 & 0x8FFFFFFF);
                    n2 = 3.0f;
                }
                else {
                    n33 = n37;
                }
                ufk3 = t;
                final long n38 = d;
                d = n;
                n = n38;
            }
            gva.r();
            h(b, jta, q4r.n(v), d, ufk3, tgh, f, n, n2, uuj.t0(-256740230, (aua)new zy3((Object)c6r.h(gva), (Object)ye6, (byte)2), gva), gva, n33 & 0x7FFFFC7E, 54, 0);
            final aql aql2 = f;
            final long n39 = n;
            n = d;
            ufk = ufk3;
            aql = aql2;
            d = n39;
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new qx4(b, jta, v, n, ufk, tgh, aql, d, n2, ye6, n3, n4, n5);
        }
    }
    
    public static final ygc b0(final k2j k2j) {
        return new ygc(Math.round(k2j.a), Math.round(k2j.b), Math.round(k2j.c), Math.round(k2j.d));
    }
    
    public static final void c(final ui6 ui6, final boolean b, final ye6 ye6, final ye6 ye7, final zta zta, final ye6 ye8, igf igf, final gva gva, final int n, final int n2) {
        gva.i0(162874288);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.d(((Enum)ui6).ordinal())) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        int n5 = n4;
        if ((n & 0x30) == 0x0) {
            int n6;
            if (gva.g(b)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        int n7 = n5;
        if ((n & 0x180) == 0x0) {
            int n8;
            if (gva.h((Object)ye6)) {
                n8 = 256;
            }
            else {
                n8 = 128;
            }
            n7 = (n5 | n8);
        }
        int n9 = n7;
        if ((n & 0xC00) == 0x0) {
            int n10;
            if (gva.h((Object)ye7)) {
                n10 = 2048;
            }
            else {
                n10 = 1024;
            }
            n9 = (n7 | n10);
        }
        int n11 = n9;
        if ((n & 0x6000) == 0x0) {
            int n12;
            if (gva.h((Object)zta)) {
                n12 = 16384;
            }
            else {
                n12 = 8192;
            }
            n11 = (n9 | n12);
        }
        int n13 = n11;
        if ((0x30000 & n) == 0x0) {
            int n14;
            if (gva.h((Object)ye8)) {
                n14 = 131072;
            }
            else {
                n14 = 65536;
            }
            n13 = (n11 | n14);
        }
        final int n15 = n2 & 0x40;
        int n16;
        if (n15 != 0) {
            n16 = (n13 | 0x180000);
        }
        else {
            n16 = n13;
            if ((0x180000 & n) == 0x0) {
                int n17;
                if (gva.f((Object)igf)) {
                    n17 = 1048576;
                }
                else {
                    n17 = 524288;
                }
                n16 = (n13 | n17);
            }
        }
        if (gva.W(n16 & 0x1, (0x92493 & n16) != 0x92492)) {
            final Object v = fgf.v;
            if (n15 != 0) {
                igf = (igf)v;
            }
            final ui6 x = ui6.x;
            float n18;
            if (ui6 == x && zta == null) {
                n18 = 0.0f;
            }
            else {
                n18 = 8.0f;
            }
            final xom a = md0.a(n18, null, "mic end padding", gva, 384, 10);
            final jzj a2 = hzj.a((gv0)t08.a, wab.I, gva, 48);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, igf);
            vh6.e.getClass();
            gva.k0();
            final boolean s = gva.S;
            final lrc n19 = LayoutNode.n0;
            if (s) {
                gva.k((jta)n19);
            }
            else {
                gva.t0();
            }
            final rg6 a3 = awp.A;
            k8e.P((zta)a3, gva, a2);
            final rg6 z = awp.z;
            k8e.P((zta)z, gva, l);
            final rg6 b3 = awp.B;
            k8e.P((zta)b3, gva, hashCode);
            k8e.C(gva);
            final rg6 y = awp.y;
            k8e.P((zta)y, gva, b2);
            final igf y2 = Y((igf)v, 0.0f, 0.0f, ((qs8)a.getValue()).v, 0.0f, 11);
            final mb2 x2 = wab.x;
            final moe c = rj2.c((gx)x2, false);
            final int hashCode2 = Long.hashCode(gva.T);
            final e3h i = gva.l();
            final igf b4 = ien.B(gva, y2);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n19);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a3, gva, c);
            k8e.P((zta)z, gva, i);
            oz1.v(hashCode2, gva, b3, gva);
            k8e.P((zta)y, gva, b4);
            d((n16 >> 3 & 0xE) | 0xC30, uuj.t0(-1344851994, (aua)new bc3(ye8, (byte)2), gva), gva, null, "dictation microphone button", b);
            gva.q(true);
            final moe c2 = rj2.c((gx)x2, false);
            final int hashCode3 = Long.hashCode(gva.T);
            final e3h j = gva.l();
            final igf b5 = ien.B(gva, (igf)v);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n19);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a3, gva, c2);
            k8e.P((zta)z, gva, j);
            oz1.v(hashCode3, gva, b3, gva);
            k8e.P((zta)y, gva, b5);
            d(3120, uuj.t0(2106958031, (aua)new bc3(ye6, (byte)3), gva), gva, null, "send button", ui6 == ui6.v);
            d(3120, uuj.t0(1658937912, (aua)new bc3(ye7, (byte)4), gva), gva, null, "stop button", ui6 == ui6.w);
            if (zta != null) {
                gva.g0(28721859);
                d(3120, uuj.t0(-1070619756, (aua)new xp4(zta, (byte)1), gva), gva, null, "idle action", ui6 == x);
                gva.q(false);
            }
            else {
                gva.g0(28890995);
                gva.q(false);
            }
            gva.q(true);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new fl6(ui6, b, ye6, ye7, zta, ye8, igf, n, n2);
        }
    }
    
    public static final uc0 c0(final zc0 zc0, final int n) {
        while (true) {
            for (final Object next : (Iterable)zc0.getLayoutNodeToHolder().entrySet()) {
                if (((LayoutNode)((Map$Entry)next).getKey()).w == n) {
                    final Map$Entry map$Entry = (Map$Entry)next;
                    if (map$Entry != null) {
                        return (uc0)map$Entry.getValue();
                    }
                    return null;
                }
            }
            Object next = null;
            continue;
        }
    }
    
    public static final void d(final int n, final ye6 ye6, final gva gva, igf v, final String s, final boolean b) {
        gva.i0(319056981);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.g(b)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n & 0x30) == 0x0) {
            int n4;
            if (gva.f((Object)s)) {
                n4 = 32;
            }
            else {
                n4 = 16;
            }
            n3 |= n4;
        }
        int n6;
        final int n5 = n6 = (n3 | 0x180);
        if ((n & 0xC00) == 0x0) {
            int n7;
            if (gva.h((Object)ye6)) {
                n7 = 2048;
            }
            else {
                n7 = 1024;
            }
            n6 = (n5 | n7);
        }
        if (gva.W(n6 & 0x1, (n6 & 0x493) != 0x492)) {
            final id9 a = pc9.g(null, 3).a(pc9.i(null, 0.0f, 7));
            final ev9 a2 = pc9.h(null, 3).a(pc9.j(null, 0.0f, 7));
            final ye6 t0 = uuj.t0(3449981, (aua)new gl6(ye6, (byte)0), gva);
            v = (igf)fgf.v;
            ljq.h(b, v, a, a2, s, (bua)t0, gva, (n6 & 0xE) | 0x30D80 | (n6 >> 3 & 0x70) | (n6 << 9 & 0xE000), 0);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new hl6(b, s, v, ye6, n);
        }
    }
    
    public static final Object d0(final zta zta, final h07 h07) {
        final mdk mdk = new mdk((f07)h07, h07.getContext());
        return t08.m0(mdk, true, (Object)mdk, zta);
    }
    
    public static final void e(final ye6 ye6, final ye6 ye7, final igf igf, final igf igf2, final gva gva, final int n) {
        gva.i0(141571113);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)ye6)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)ye7)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.f((Object)igf)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.f((Object)igf2)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        if (gva.W(n8 & 0x1, (n8 & 0x493) != 0x492)) {
            final eup g = t08.g;
            final lb2 h = wab.H;
            final jzj a = hzj.a((gv0)g, h, gva, 54);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, igf);
            vh6.e.getClass();
            gva.k0();
            final boolean s = gva.S;
            final lrc n10 = LayoutNode.n0;
            if (s) {
                gva.k((jta)n10);
            }
            else {
                gva.t0();
            }
            final rg6 a2 = awp.A;
            k8e.P((zta)a2, gva, a);
            final rg6 z = awp.z;
            k8e.P((zta)z, gva, l);
            final rg6 b2 = awp.B;
            k8e.P((zta)b2, gva, hashCode);
            k8e.C(gva);
            final rg6 y = awp.y;
            k8e.P((zta)y, gva, b);
            final igf z2 = rhc.Z(igf2, rhc.T(0, 1, gva), true, false);
            final mzj a3 = mzj.a;
            final igf a4 = a3.a(z2, 1.0f, false);
            final fv0 a5 = t08.a;
            final jzj a6 = hzj.a((gv0)a5, h, gva, 48);
            final int hashCode2 = Long.hashCode(gva.T);
            final e3h i = gva.l();
            final igf b3 = ien.B(gva, a4);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n10);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a2, gva, a6);
            k8e.P((zta)z, gva, i);
            oz1.v(hashCode2, gva, b2, gva);
            k8e.P((zta)y, gva, b3);
            ye6.h((Object)a3, (Object)gva, (Object)((n8 << 3 & 0x70) | 0x6));
            gva.q(true);
            final igf y2 = Y((igf)fgf.v, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            final jzj a7 = hzj.a((gv0)a5, h, gva, 48);
            final int hashCode3 = Long.hashCode(gva.T);
            final e3h j = gva.l();
            final igf b4 = ien.B(gva, y2);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n10);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a2, gva, a7);
            k8e.P((zta)z, gva, j);
            oz1.v(hashCode3, gva, b2, gva);
            k8e.P((zta)y, gva, b4);
            ye7.h((Object)a3, (Object)gva, (Object)((n8 & 0x70) | 0x6));
            gva.q(true);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new el6((Object)ye6, (aua)ye7, igf, (Object)igf2, n, (byte)0);
        }
    }
    
    public static void e0(Object o, final String s) {
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        o = new ClassCastException(hia.k(name, " cannot be cast to ", s));
        mlc.g0((RuntimeException)o, omo.class.getName());
        throw o;
    }
    
    public static final void f(final efo efo, igf v, bfa i0, lta lta, final ye6 ye6, final gva gva, final int n, final int n2) {
        final r1 a = efo.a;
        gva.i0(-1877370462);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)efo)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x1;
        int n8 = 0;
        Label_0119: {
            int n6;
            if (n5 != 0) {
                n6 = (n4 | 0x30);
            }
            else {
                n6 = n4;
                if ((n & 0x30) == 0x0) {
                    int n7;
                    if (gva.f((Object)v)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n4 | n7);
                    break Label_0119;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x2;
        int n12 = 0;
        Label_0187: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x180) == 0x0) {
                    int n11;
                    if (gva.h((Object)i0)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0187;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x4;
        int n16 = 0;
        Label_0255: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0xC00) == 0x0) {
                    int n15;
                    if (gva.h((Object)lta)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0255;
                }
            }
            n16 = n14;
        }
        int n17 = n16;
        if ((n & 0x6000) == 0x0) {
            int n18;
            if (gva.h((Object)ye6)) {
                n18 = 16384;
            }
            else {
                n18 = 8192;
            }
            n17 = (n16 | n18);
        }
        if (gva.W(n17 & 0x1, (n17 & 0x2493) != 0x2492)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            if (n9 != 0) {
                i0 = ri2.I0(0, 0, null, 7);
            }
            final cib a2 = bi6.a;
            if (n13 != 0) {
                Object o;
                if ((o = gva.R()) == a2) {
                    o = n10.I;
                    gva.q0(o);
                }
                lta = (lta)o;
            }
            Object r;
            if ((r = gva.R()) == a2) {
                r = new v8m();
                ((v8m)r).add(a.i());
                gva.q0(r);
            }
            final v8m v8m = (v8m)r;
            Object r2;
            if ((r2 = gva.R()) == a2) {
                final long[] a3 = jak.a;
                r2 = new tmf();
                gva.q0(r2);
            }
            final tmf tmf = (tmf)r2;
            final ksg d = efo.d;
            if (mlc.q(a.i(), d.getValue())) {
                gva.g0(321145192);
                if (v8m.size() == 1 && mlc.q(v8m.get(0), d.getValue())) {
                    gva.g0(321469824);
                    gva.q(false);
                }
                else {
                    gva.g0(321279546);
                    final boolean b = (n17 & 0xE) == 0x4;
                    final Object r3 = gva.R();
                    lta lta2;
                    if (b || (lta2 = (lta)r3) == a2) {
                        lta2 = new k10(efo, (byte)4);
                        gva.q0((Object)lta2);
                    }
                    h86.w0((lta)lta2, (List)v8m);
                    tmf.a();
                    gva.q(false);
                }
                gva.q(false);
            }
            else {
                gva.g0(321475776);
                gva.q(false);
            }
            if (!tmf.b(d.getValue())) {
                gva.g0(321536443);
                final ListIterator listIterator = v8m.listIterator();
                int n19 = 0;
                while (true) {
                    final xgd xgd = (xgd)listIterator;
                    if (!xgd.hasNext()) {
                        n19 = -1;
                        break;
                    }
                    if (mlc.q(lta.b(xgd.next()), lta.b(d.getValue()))) {
                        break;
                    }
                    ++n19;
                }
                if (n19 == -1) {
                    v8m.add(d.getValue());
                }
                else {
                    v8m.set(n19, d.getValue());
                }
                tmf.a();
                for (int size = v8m.size(), j = 0; j < size; ++j) {
                    final Object value = v8m.get(j);
                    tmf.m(value, uuj.t0(-934471669, new jq7(efo, i0, value, ye6), gva));
                }
                gva.q(false);
            }
            else {
                gva.g0(322279296);
                gva.q(false);
            }
            final moe c = rj2.c((gx)wab.x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, v);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c);
            k8e.P((zta)awp.z, gva, l);
            k8e.x(gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b2);
            gva.g0(-1312707512);
            for (int size2 = v8m.size(), k = 0; k < size2; ++k) {
                final Object value2 = v8m.get(k);
                gva.d0(1171574969, lta.b(value2));
                final zta zta = (zta)tmf.g(value2);
                if (zta == null) {
                    gva.g0(1959122128);
                }
                else {
                    ge9.B(gva, 1171576145, 0, zta, gva);
                }
                gva.q(false);
                gva.q(false);
            }
            gva.q(false);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = new iq7(efo, v, i0, lta, ye6, n, n2, (byte)1);
        }
    }
    
    public static final String f0(final int n) {
        if (n == 0) {
            return "android.widget.Button";
        }
        if (n == 1) {
            return "android.widget.CheckBox";
        }
        if (n == 3) {
            return "android.widget.RadioButton";
        }
        if (n == 5) {
            return "android.widget.ImageView";
        }
        if (n == 6) {
            return "android.widget.Spinner";
        }
        if (n == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
    
    public static final void g(final Object o, igf v, bfa i0, String s, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(-513216493);
        int n4;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f(o);
            }
            else {
                b = gva.h(o);
            }
            int n3;
            if (b) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x30) == 0x0) {
                int n7;
                if (gva.f((Object)v)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        final int n8 = n2 & 0x4;
        int n9;
        if (n8 != 0) {
            n9 = (n6 | 0x180);
        }
        else {
            n9 = n6;
            if ((n & 0x180) == 0x0) {
                int n10;
                if (gva.h((Object)i0)) {
                    n10 = 256;
                }
                else {
                    n10 = 128;
                }
                n9 = (n6 | n10);
            }
        }
        final int n11 = n2 & 0x8;
        int n12;
        if (n11 != 0) {
            n12 = (n9 | 0xC00);
        }
        else {
            n12 = n9;
            if ((n & 0xC00) == 0x0) {
                int n13;
                if (gva.f((Object)s)) {
                    n13 = 2048;
                }
                else {
                    n13 = 1024;
                }
                n12 = (n9 | n13);
            }
        }
        if ((n & 0x6000) == 0x0) {
            int n14;
            if (gva.h((Object)ye6)) {
                n14 = 16384;
            }
            else {
                n14 = 8192;
            }
            n12 |= n14;
        }
        if (gva.W(n12 & 0x1, (n12 & 0x2493) != 0x2492)) {
            if (n5 != 0) {
                v = (igf)fgf.v;
            }
            if (n8 != 0) {
                i0 = ri2.I0(0, 0, null, 7);
            }
            if (n11 != 0) {
                s = "Crossfade";
            }
            f(xp7.Z(o, s, gva, (n12 & 0xE) | (n12 >> 6 & 0x70), 0), v, i0, null, ye6, gva, n12 & 0xE3F0, 4);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = new iq7(o, v, i0, s, ye6, n, n2, (byte)0);
        }
    }
    
    public static final ArrayList g0(final LocaleList list) {
        final ArrayList list2 = new ArrayList();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Locale value = list.get(i);
            if (value != null) {
                list2.add((Object)value);
            }
        }
        if (list2.isEmpty()) {
            final Locale default1 = Locale.getDefault();
            final StringBuilder sb = new StringBuilder("LocaleList is empty, falling back to getDefault: ");
            sb.append((Object)default1);
            SilentException.a(new SilentException(sb.toString()), (lpl)null, (List)null, 7);
            Locale us;
            if ((us = default1) == null) {
                us = Locale.US;
            }
            us.getClass();
            list2.add((Object)us);
        }
        return list2;
    }
    
    public static final void h(final boolean b, final jta jta, igf v, long n, ufk t, tgh a, aql l, final long n2, float n3, final ye6 ye6, final gva gva, final int n4, final int n5, final int n6) {
        gva.i0(1725609375);
        int n8;
        if ((n4 & 0x6) == 0x0) {
            int n7;
            if (gva.g(b)) {
                n7 = 4;
            }
            else {
                n7 = 2;
            }
            n8 = (n7 | n4);
        }
        else {
            n8 = n4;
        }
        if ((n4 & 0x30) == 0x0) {
            int n9;
            if (gva.h((Object)jta)) {
                n9 = 32;
            }
            else {
                n9 = 16;
            }
            n8 |= n9;
        }
        final int n10 = n6 & 0x4;
        int n13 = 0;
        Label_0155: {
            int n11;
            if (n10 != 0) {
                n11 = (n8 | 0x180);
            }
            else {
                n11 = n8;
                if ((n4 & 0x180) == 0x0) {
                    int n12;
                    if (gva.f((Object)v)) {
                        n12 = 256;
                    }
                    else {
                        n12 = 128;
                    }
                    n13 = (n8 | n12);
                    break Label_0155;
                }
            }
            n13 = n11;
        }
        final int n14 = n6 & 0x8;
        int n17 = 0;
        Label_0224: {
            int n15;
            if (n14 != 0) {
                n15 = (n13 | 0xC00);
            }
            else {
                n15 = n13;
                if ((n4 & 0xC00) == 0x0) {
                    int n16;
                    if (gva.e(n)) {
                        n16 = 2048;
                    }
                    else {
                        n16 = 1024;
                    }
                    n17 = (n13 | n16);
                    break Label_0224;
                }
            }
            n17 = n15;
        }
        if ((n4 & 0x6000) == 0x0) {
            int n18;
            if ((n6 & 0x10) == 0x0 && gva.f((Object)t)) {
                n18 = 16384;
            }
            else {
                n18 = 8192;
            }
            n17 |= n18;
        }
        final int n19 = n6 & 0x20;
        int n22 = 0;
        Label_0344: {
            int n20;
            if (n19 != 0) {
                n20 = (n17 | 0x30000);
            }
            else {
                n20 = n17;
                if ((n4 & 0x30000) == 0x0) {
                    int n21;
                    if (gva.f((Object)a)) {
                        n21 = 131072;
                    }
                    else {
                        n21 = 65536;
                    }
                    n22 = (n17 | n21);
                    break Label_0344;
                }
            }
            n22 = n20;
        }
        if ((n4 & 0x180000) == 0x0) {
            int n23;
            if ((n6 & 0x40) == 0x0 && gva.f((Object)l)) {
                n23 = 1048576;
            }
            else {
                n23 = 524288;
            }
            n22 |= n23;
        }
        int n24 = n22;
        if ((n4 & 0xC00000) == 0x0) {
            int n25;
            if (gva.e(n2)) {
                n25 = 8388608;
            }
            else {
                n25 = 4194304;
            }
            n24 = (n22 | n25);
        }
        final int n26 = n6 & 0x100;
        int n27 = 100663296;
        int n28 = 0;
        Label_0503: {
            if (n26 == 0) {
                n28 = n24;
                if ((n4 & 0x6000000) != 0x0) {
                    break Label_0503;
                }
                if (gva.c(0.0f)) {
                    n27 = 67108864;
                }
                else {
                    n27 = 33554432;
                }
            }
            n28 = (n24 | n27);
        }
        final int n29 = n6 & 0x200;
        int n32 = 0;
        Label_0574: {
            int n30;
            if (n29 != 0) {
                n30 = (n28 | 0x30000000);
            }
            else {
                n30 = n28;
                if ((n4 & 0x30000000) == 0x0) {
                    int n31;
                    if (gva.c(n3)) {
                        n31 = 536870912;
                    }
                    else {
                        n31 = 268435456;
                    }
                    n32 = (n28 | n31);
                    break Label_0574;
                }
            }
            n32 = n30;
        }
        int n33;
        if ((n6 & 0x400) != 0x0) {
            n33 = (n5 | 0x6);
        }
        else if ((n5 & 0x6) == 0x0) {
            int n34;
            if (gva.f((Object)null)) {
                n34 = 4;
            }
            else {
                n34 = 2;
            }
            n33 = (n5 | n34);
        }
        else {
            n33 = n5;
        }
        if ((n5 & 0x30) == 0x0) {
            int n35;
            if (gva.h((Object)ye6)) {
                n35 = 32;
            }
            else {
                n35 = 16;
            }
            n33 |= n35;
        }
        tgh tgh;
        aql aql3;
        if (gva.W(n32 & 0x1, (n32 & 0x12492493) != 0x12492492 || (n33 & 0x13) != 0x12)) {
            gva.b0();
            igf igf;
            aql aql2;
            if ((n4 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n36 = n32;
                if ((n6 & 0x10) != 0x0) {
                    n36 = (n32 & 0xFFFF1FFF);
                }
                n32 = n36;
                if ((n6 & 0x40) != 0x0) {
                    n32 = (n36 & 0xFFC7FFFF);
                }
                final aql aql = l;
                tgh = a;
                igf = v;
                aql2 = aql;
            }
            else {
                if (n10 != 0) {
                    v = (igf)fgf.v;
                }
                if (n14 != 0) {
                    n = Float.floatToRawIntBits(0.0f);
                    n = (((long)Float.floatToRawIntBits(0.0f) & 0xFFFFFFFFL) | n << 32);
                }
                if ((n6 & 0x10) != 0x0) {
                    t = rhc.T(0, 1, gva);
                    n32 &= 0xFFFF1FFF;
                }
                if (n19 != 0) {
                    a = rze.a;
                }
                if ((n6 & 0x40) != 0x0) {
                    final tgh a2 = rze.a;
                    l = vt4.L(4, gva);
                    n32 &= 0xFFC7FFFF;
                }
                if (n26 != 0) {
                    final tgh a3 = rze.a;
                }
                if (n29 != 0) {
                    final tgh a4 = rze.a;
                    n3 = 3.0f;
                }
                final igf igf2 = v;
                aql2 = l;
                tgh = a;
                igf = igf2;
            }
            gva.r();
            final Object r = gva.R();
            final cib a5 = bi6.a;
            Object o = r;
            if (r == a5) {
                o = new enf((Object)Boolean.FALSE);
                gva.q0(o);
            }
            final enf enf = (enf)o;
            enf.s(b);
            if (!(boolean)enf.x.getValue() && !(boolean)enf.y.getValue()) {
                gva.g0(1166904067);
                gva.q(false);
            }
            else {
                gva.g0(1165885407);
                final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
                final boolean b2 = (n32 & 0x1C00) == 0x800;
                final boolean f = gva.f((Object)xc8);
                final Object r2 = gva.R();
                fz8 fz8;
                if ((b2 | f) || (fz8 = (fz8)r2) == a5) {
                    fz8 = new fz8(n, xc8);
                    gva.q0((Object)fz8);
                }
                final fz8 fz9 = fz8;
                w90.a((sgh)fz9, jta, tgh, uuj.t0(-917492520, (aua)new r80(igf, enf, fz9, t, aql2, n2, n3, ye6), gva), gva, (n32 & 0x70) | 0xC00 | (n32 >> 9 & 0x380), 0);
                gva.q(false);
            }
            final igf igf3 = igf;
            aql3 = aql2;
            v = igf3;
        }
        else {
            gva.Z();
            final tgh tgh2 = a;
            aql3 = l;
            tgh = tgh2;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new s80(b, jta, v, n, t, tgh, aql3, n2, n3, ye6, n4, n5, n6);
        }
    }
    
    public static String h0(final String s) {
        if (s.length() <= 127) {
            return s;
        }
        return s.substring(0, 127);
    }
    
    public static final void i(final ye6 ye6, final jta jta, igf v, zta zta, boolean b, uze b2, dng b3, final gva gva, final int n, final int n2) {
        gva.i0(-532959117);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.h((Object)ye6)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)jta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 |= n5;
        }
        final int n6 = n2 & 0x4;
        int n9 = 0;
        Label_0155: {
            int n7;
            if (n6 != 0) {
                n7 = (n4 | 0x180);
            }
            else {
                n7 = n4;
                if ((n & 0x180) == 0x0) {
                    int n8;
                    if (gva.f((Object)v)) {
                        n8 = 256;
                    }
                    else {
                        n8 = 128;
                    }
                    n9 = (n4 | n8);
                    break Label_0155;
                }
            }
            n9 = n7;
        }
        final int n10 = n2 & 0x8;
        int n11;
        if (n10 != 0) {
            n11 = (n9 | 0xC00);
        }
        else {
            n11 = n9;
            if ((n & 0xC00) == 0x0) {
                int n12;
                if (gva.h((Object)zta)) {
                    n12 = 2048;
                }
                else {
                    n12 = 1024;
                }
                n11 = (n9 | n12);
            }
        }
        final int n13 = n11 | 0x6000;
        final int n14 = n2 & 0x20;
        int n15;
        if (n14 != 0) {
            n15 = (0x36000 | n11);
        }
        else {
            n15 = n13;
            if ((0x30000 & n) == 0x0) {
                int n16;
                if (gva.g(b)) {
                    n16 = 131072;
                }
                else {
                    n16 = 65536;
                }
                n15 = (n13 | n16);
            }
        }
        int n17 = n15;
        if ((0x180000 & n) == 0x0) {
            n17 = (n15 | 0x80000);
        }
        final int n18 = n2 & 0x80;
        int n19;
        if (n18 != 0) {
            n19 = (n17 | 0xC00000);
        }
        else {
            n19 = n17;
            if ((0xC00000 & n) == 0x0) {
                int n20;
                if (gva.f((Object)b3)) {
                    n20 = 8388608;
                }
                else {
                    n20 = 4194304;
                }
                n19 = (n17 | n20);
            }
        }
        final int n21 = n19 | 0x6000000;
        final boolean b4 = true;
        if (gva.W(n21 & 0x1, (0x2492493 & n21) != 0x2492492)) {
            gva.b0();
            int n22;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n22 = (n21 & 0xFFC7FFFF);
            }
            else {
                if (n6 != 0) {
                    v = (igf)fgf.v;
                }
                if (n10 != 0) {
                    zta = null;
                }
                if (n14 != 0) {
                    b = b4;
                }
                final tgh a = rze.a;
                b2 = rze.b(gva);
                if (n18 != 0) {
                    b3 = (dng)rze.b;
                }
                n22 = (n21 & 0xFFC7FFFF);
            }
            gva.r();
            f0f.b(ye6, jta, v, zta, b, b2, b3, gva, 0xFFFFFFE & n22);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new q80(ye6, jta, v, zta, b, b2, b3, n, n2);
        }
    }
    
    public static final void j(final xd3 xd3, final x6m x6m, final gva gva, final int n) {
        gva.i0(1219848931);
        int n3;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)xd3);
            }
            else {
                b = gva.h((Object)xd3);
            }
            int n2;
            if (b) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.f((Object)x6m)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        boolean b2 = true;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            gva.d0(-251244888, (Object)x6m);
            if ((n4 & 0x70) != 0x20) {
                b2 = false;
            }
            final Object r = gva.R();
            Object o;
            if (b2 || (o = r) == bi6.a) {
                o = new p10((byte)26, (f07)null, (Object)x6m);
                gva.q0(o);
            }
            ach.e(xd3, (zta)o, gva, n4 & 0xE);
            gva.q(false);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new we6((Object)xd3, (Object)x6m, n, (byte)4);
        }
    }
    
    public static final ygc k(final long n, final long n2) {
        final int n3 = (int)(n >> 32);
        final int n4 = (int)(n & 0xFFFFFFFFL);
        return new ygc(n3, n4, (int)(n2 >> 32) + n3, (int)(n2 & 0xFFFFFFFFL) + n4);
    }
    
    public static hng l(float n, float n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = 0.0f;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        return new hng(n, n2, n, n2);
    }
    
    public static hng m(float n, float n2, float n3, float n4, final int n5) {
        if ((n5 & 0x1) != 0x0) {
            n = 0.0f;
        }
        if ((n5 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        if ((n5 & 0x4) != 0x0) {
            n3 = 0.0f;
        }
        if ((n5 & 0x8) != 0x0) {
            n4 = 0.0f;
        }
        return new hng(n, n2, n3, n4);
    }
    
    public static final void n(final int n, final gva gva) {
        gva.i0(-478098542);
        if (gva.W(n & 0x1, n != 0)) {
            final odk a = ii8.a(gva);
            final boolean f = gva.f((Object)null);
            final boolean f2 = gva.f((Object)a);
            final Object r = gva.R();
            final cib a2 = bi6.a;
            Object o;
            if ((f | f2) || (o = r) == a2) {
                o = a.d((Class)ep0.class, (emi)null);
                gva.q0(o);
            }
            final ep0 ep0 = (ep0)o;
            final odk a3 = ii8.a(gva);
            final boolean f3 = gva.f((Object)null);
            final boolean f4 = gva.f((Object)a3);
            final Object r2 = gva.R();
            Object o2;
            if ((f3 | f4) || (o2 = r2) == a2) {
                o2 = a3.d((Class)krf.class, (emi)null);
                gva.q0(o2);
            }
            final krf krf = (krf)o2;
            final boolean h = gva.h((Object)ep0);
            final boolean h2 = gva.h((Object)krf);
            final Object r3 = gva.R();
            Object o3;
            if ((h | h2) || (o3 = r3) == a2) {
                o3 = new frd((Object)ep0, (Object)krf, (f07)null, (byte)28);
                gva.q0(o3);
            }
            mlc.g(ep0, krf, (zta)o3, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new dtk(n);
        }
    }
    
    public static w4n o() {
        return (w4n)new ppc((opc)null);
    }
    
    public static final Object p(final tfk tfk, float v, dg0 w, final v08 v2, final lta lta, final h07 h07) {
        Object o = null;
        Label_0060: {
            if (h07 instanceof l7m) {
                final l7m l7m = (l7m)h07;
                final int z = l7m.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    l7m.z = z + Integer.MIN_VALUE;
                    o = l7m;
                    break Label_0060;
                }
            }
            o = new l7m(h07);
        }
        final Object y = ((l7m)o).y;
        final int z2 = ((l7m)o).z;
        y3j x;
        if (z2 != 0) {
            if (z2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((l7m)o).v;
            x = ((l7m)o).x;
            w = ((l7m)o).w;
            vt4.g0(y);
        }
        else {
            vt4.g0(y);
            final Object x2 = new Object();
            boolean b;
            if (((Number)w.a()).floatValue() == 0.0f) {
                b = true;
            }
            else {
                b = false;
            }
            final k7m k7m = new k7m(v, (y3j)x2, tfk, lta, (byte)0);
            ((l7m)o).w = w;
            ((l7m)o).x = (y3j)x2;
            ((l7m)o).v = v;
            ((l7m)o).z = 1;
            final Object o2 = uoo.o(w, v2, b ^ true, (lta)k7m, (h07)o);
            final pc7 v3 = pc7.v;
            if (o2 == v3) {
                return v3;
            }
            x = (y3j)x2;
        }
        return new zf0(new Float(v - x.v), w);
    }
    
    public static final void q(final bg0 bg0, final tfk tfk, final lta lta, final float n) {
        float b;
        try {
            b = tfk.b(n);
        }
        catch (final CancellationException ex) {
            bg0.a();
            b = 0.0f;
        }
        lta.b(b);
        if (Math.abs(n - b) > 0.5f) {
            bg0.a();
        }
    }
    
    public static final Object r(final tfk tfk, float v, float n, dg0 x, final cg0 cg0, final lta lta, final h07 h07) {
        while (true) {
            Label_0049: {
                if (!(h07 instanceof m7m)) {
                    break Label_0049;
                }
                final m7m m7m = (m7m)h07;
                final int a = m7m.A;
                if ((a & Integer.MIN_VALUE) == 0x0) {
                    break Label_0049;
                }
                m7m.A = a + Integer.MIN_VALUE;
                final Object o = m7m;
                final Object z = ((m7m)o).z;
                final int a2 = ((m7m)o).A;
                y3j y;
                if (a2 != 0) {
                    if (a2 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n = ((m7m)o).w;
                    v = ((m7m)o).v;
                    y = ((m7m)o).y;
                    x = ((m7m)o).x;
                    vt4.g0(z);
                }
                else {
                    vt4.g0(z);
                    final Object y2 = new Object();
                    final float floatValue = ((Number)x.a()).floatValue();
                    final Float n2 = new Float(v);
                    boolean b;
                    if (((Number)x.a()).floatValue() == 0.0f) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    final k7m k7m = new k7m(n, (y3j)y2, tfk, lta, (byte)1);
                    ((m7m)o).x = x;
                    ((m7m)o).y = (y3j)y2;
                    ((m7m)o).v = v;
                    ((m7m)o).w = floatValue;
                    ((m7m)o).A = 1;
                    final Object p7 = uoo.p(x, n2, cg0, b ^ true, (lta)k7m, (h07)o);
                    final pc7 v2 = pc7.v;
                    if (p7 == v2) {
                        return v2;
                    }
                    y = (y3j)y2;
                    n = floatValue;
                }
                n = A(((Number)x.a()).floatValue(), n);
                return new zf0(new Float(v - y.v), yi2.q(x, 0.0f, n, 29));
            }
            final Object o = new m7m(h07);
            continue;
        }
    }
    
    public static Collection s(final Object o) {
        if (o instanceof stc) {
            if (!(o instanceof ttc)) {
                e0(o, "kotlin.collections.MutableCollection");
                throw null;
            }
        }
        try {
            return (Collection)o;
        }
        catch (final ClassCastException ex) {
            mlc.g0((RuntimeException)ex, omo.class.getName());
            throw ex;
        }
    }
    
    public static List t(final Object o) {
        if (o instanceof stc) {
            if (!(o instanceof utc)) {
                e0(o, "kotlin.collections.MutableList");
                throw null;
            }
        }
        try {
            return (List)o;
        }
        catch (final ClassCastException ex) {
            mlc.g0((RuntimeException)ex, omo.class.getName());
            throw ex;
        }
    }
    
    public static Map u(final Object o) {
        if (o instanceof stc) {
            if (!(o instanceof wtc)) {
                e0(o, "kotlin.collections.MutableMap");
                throw null;
            }
        }
        try {
            return (Map)o;
        }
        catch (final ClassCastException ex) {
            mlc.g0((RuntimeException)ex, omo.class.getName());
            throw ex;
        }
    }
    
    public static void v(final int n, final Object o) {
        if (o != null && !Q(n, o)) {
            final StringBuilder sb = new StringBuilder("kotlin.jvm.functions.Function");
            sb.append(n);
            e0(o, sb.toString());
            throw null;
        }
    }
    
    public static final void w(final int n, final String s) {
        if (Build$VERSION.SDK_INT >= 29) {
            bec.a(n, h0(s));
            return;
        }
        final String h0 = h0(s);
        try {
            Method r;
            if ((r = omo.r) == null) {
                r = (omo.r = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE));
            }
            if (r != null) {
                r.invoke((Object)null, new Object[] { omo.p, h0, n });
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        catch (final Exception ex) {
            N(ex);
        }
    }
    
    public static final n90 x(final lta lta) {
        return new n90((Object)new ConcurrentHashMap(), (Object)lta, (byte)2);
    }
    
    public static final float y(final dng dng, final qzc qzc) {
        if (qzc == qzc.v) {
            return dng.c(qzc);
        }
        return dng.b(qzc);
    }
    
    public static final float z(final dng dng, final qzc qzc) {
        if (qzc == qzc.v) {
            return dng.b(qzc);
        }
        return dng.c(qzc);
    }
}
