import java.util.AbstractCollection;
import java.util.ListIterator;
import java.util.Iterator;
import com.anthropic.claude.core.telemetry.SilentException;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.CarPlatformEvents$ConnectionChanged;
import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.Collection;
import com.anthropic.claude.types.strings.ToolUseId;
import com.anthropic.claude.types.strings.MessageId;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public final class l33 implements jja
{
    public final byte v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;
    
    public Object a(final int[] array, final f07 f07) {
        final String[] array2 = (String[])this.y;
        final jja jja = (jja)this.x;
        final b4j b4j = (b4j)this.w;
        Object o = null;
        Label_0078: {
            if (f07 instanceof rgo) {
                final rgo rgo = (rgo)f07;
                final int y = rgo.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    rgo.y = y + Integer.MIN_VALUE;
                    o = rgo;
                    break Label_0078;
                }
            }
            o = new rgo(this, f07);
        }
        final Object w = ((rgo)o).w;
        final int y2 = ((rgo)o).y;
        int[] v3 = null;
        Label_0339: {
            if (y2 == 0) {
                vt4.g0(w);
                final Object v = b4j.v;
                final pc7 v2 = pc7.v;
                if (v == null) {
                    final Set n1 = iw0.n1((Object[])array2);
                    ((rgo)o).v = array;
                    ((rgo)o).y = 1;
                    v3 = array;
                    if (jja.l((Object)n1, (f07)o) != v2) {
                        break Label_0339;
                    }
                }
                else {
                    final int[] array3 = (int[])this.z;
                    final ArrayList list = new ArrayList();
                    for (int length = array2.length, i = 0, n2 = 0; i < length; ++i, ++n2) {
                        final String s = array2[i];
                        final Object v4 = b4j.v;
                        if (v4 == null) {
                            en9.q("Required value was null.");
                            return null;
                        }
                        final int[] array4 = (int[])v4;
                        final int n3 = array3[n2];
                        if (array4[n3] != array[n3]) {
                            list.add((Object)s);
                        }
                    }
                    v3 = array;
                    if (list.isEmpty()) {
                        break Label_0339;
                    }
                    final Set w2 = c86.w1((Iterable)list);
                    ((rgo)o).v = array;
                    ((rgo)o).y = 2;
                    v3 = array;
                    if (jja.l((Object)w2, (f07)o) != v2) {
                        break Label_0339;
                    }
                }
                return v2;
            }
            if (y2 != 1 && y2 != 2) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v3 = ((rgo)o).v;
            vt4.g0(w);
        }
        b4j.v = v3;
        return lqo.a;
    }
    
    public final Object l(Object v, final f07 f07) {
        final byte v2 = this.v;
        final Object o = null;
        final Object o2 = null;
        final lqo a = lqo.a;
        final Object z = this.z;
        final Object y = this.y;
        final Object x = this.x;
        final Object w = this.w;
        switch (v2) {
            default: {
                return this.a((int[])v, f07);
            }
            case 3: {
                final boolean booleanValue = (boolean)v;
                final dkn dkn = (dkn)w;
                final j7d j7d = (j7d)x;
                if (booleanValue && j7d.b()) {
                    eqi.o0((amn)y, j7d, dkn.r(), (y4c)z, dkn.b);
                }
                else {
                    eqi.V(j7d);
                }
                return a;
            }
            case 2: {
                final yog yog = (yog)v;
                final HashSet set = (HashSet)w;
                final LinkedHashSet set2 = (LinkedHashSet)x;
                final List list = (List)yog.v;
                final MessageId messageId = (MessageId)yog.w;
                Object a2 = o2;
                if (messageId != null) {
                    a2 = messageId.a;
                }
                final HashSet set3 = new HashSet();
                final Iterator iterator = ((Iterable)list).iterator();
                while (iterator.hasNext()) {
                    set3.add((Object)ToolUseId.a(((a49)iterator.next()).h()));
                }
                final ArrayList list2 = new ArrayList();
                for (final Object next : set2) {
                    if (!set3.contains((Object)ToolUseId.a(((ToolUseId)next).e()))) {
                        list2.add(next);
                    }
                }
                final a8e a8e = new a8e((Object)list2, (byte)1);
                final on3 on3 = (on3)y;
                final Iterator iterator3 = a8e.iterator();
                while (true) {
                    final ListIterator v3 = ((vqj)iterator3).v;
                    if (!v3.hasPrevious()) {
                        break;
                    }
                    on3.b(v3.previous());
                }
                ((AbstractCollection)set2).retainAll((Collection)set3);
                ((AbstractCollection)set).retainAll((Collection)set3);
                for (final a49 a3 : list) {
                    final String d = a3.d();
                    if ((a2 == null || !mlc.q((Object)d, a2)) && set.add((Object)ToolUseId.a(a3.h()))) {
                        w27.b("client tool ask held while its turn is not open: ".concat(ToolUseId.d(a3.h())));
                    }
                }
                final ArrayList list3 = new ArrayList();
                for (final Object next2 : list) {
                    final a49 a4 = (a49)next2;
                    final String d2 = a4.d();
                    if (a2 != null && mlc.q((Object)d2, a2) && ((Set)set2).add((Object)ToolUseId.a(a4.h()))) {
                        list3.add(next2);
                    }
                }
                final va4 va4 = (va4)z;
                final Iterator iterator6 = list3.iterator();
                while (iterator6.hasNext()) {
                    va4.b(iterator6.next());
                }
                return a;
            }
            case 1: {
                final b4j b4j = (b4j)w;
                Object o3 = null;
                Label_0687: {
                    if (f07 instanceof if3) {
                        final if3 if3 = (if3)f07;
                        final int y2 = if3.y;
                        if ((y2 & Integer.MIN_VALUE) != 0x0) {
                            if3.y = y2 + Integer.MIN_VALUE;
                            o3 = if3;
                            break Label_0687;
                        }
                    }
                    o3 = new if3(this, f07);
                }
                final Object w2 = ((if3)o3).w;
                final int y3 = ((if3)o3).y;
                Object v4;
                if (y3 != 0) {
                    if (y3 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o;
                    }
                    v4 = ((if3)o3).v;
                    vt4.g0(w2);
                }
                else {
                    vt4.g0(w2);
                    final opc opc = (opc)b4j.v;
                    v4 = v;
                    if (opc != null) {
                        opc.g(new CancellationException("Child of the scoped flow was cancelled"));
                        ((if3)o3).v = v;
                        ((if3)o3).y = 1;
                        final Object l = opc.L((f07)o3);
                        final pc7 v5 = pc7.v;
                        v4 = v;
                        if (l == v5) {
                            return v5;
                        }
                    }
                }
                b4j.v = rhc.G((oc7)x, (hc7)null, 4, (zta)new hf3((jf3)y, (jja)z, v4, (f07)null), 1);
                return a;
            }
            case 0: {
                final Boolean v6 = (Boolean)v;
                final boolean booleanValue2 = v6;
                final b4j b4j2 = (b4j)z;
                final a4j a4j = (a4j)y;
                final n33 n33 = (n33)x;
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final pn0 pn0 = (pn0)n33.c.w.getValue();
                final long b = pn0.b(elapsedRealtime);
                final Long f8 = pn0.f;
                final boolean b2 = f8 != null && elapsedRealtime - ((Number)f8).longValue() >= 10000L;
                final boolean b3 = pn0.a && (b == a4j.v || b2);
                final b4j b4j3 = (b4j)w;
                final Boolean b4 = (Boolean)b4j3.v;
                b4j3.v = v6;
                a4j.v = b;
                if (b4 == null) {
                    goto Label_1157;
                }
                Label_1052: {
                    if (!booleanValue2) {
                        final Long n34 = (Long)b4j2.v;
                        if (n34 != null) {
                            v = new Long(elapsedRealtime - ((Number)n34).longValue());
                            break Label_1052;
                        }
                    }
                    v = null;
                }
                Object v7;
                if (booleanValue2 && b3) {
                    v7 = new Long(elapsedRealtime);
                }
                else {
                    v7 = null;
                }
                b4j2.v = v7;
                try {
                    final st4 b5 = n33.b;
                    final CarPlatformEvents$ConnectionChanged carPlatformEvents$ConnectionChanged = new CarPlatformEvents$ConnectionChanged(booleanValue2, (Long)v, b3);
                    final KSerializer serializer = CarPlatformEvents$ConnectionChanged.Companion.serializer();
                    vt4.b0(serializer);
                    b5.b((v10)carPlatformEvents$ConnectionChanged, (KSerializer)serializer);
                    goto Label_1157;
                }
                catch (final Exception ex) {
                    SilentException.a(new SilentException("Car platform change emit failed: ".concat(t4r.e((Throwable)ex))), lpl.w, (List)null, 6);
                }
                catch (final CancellationException ex2) {
                    throw ex2;
                }
                break;
            }
        }
    }
}
