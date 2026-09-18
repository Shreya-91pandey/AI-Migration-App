import android.os.BaseBundle;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import android.net.Uri;
import android.content.ContentUris;
import android.provider.CalendarContract$Events;
import java.util.concurrent.CancellationException;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemAvailability;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemStatus;
import java.time.Instant;
import java.util.concurrent.Executor;
import java.util.Objects;
import android.text.TextUtils;
import java.text.Bidi;
import android.provider.CalendarContract$Reminders;
import android.provider.CalendarContract$Attendees;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemRecurrence;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItem;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrence;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemAvailability;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemStatus;
import java.time.OffsetDateTime;
import android.content.ContentValues;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItem;
import com.squareup.wire.ProtoAdapter;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import com.anthropic.claude.db.ClaudeDatabase;
import android.text.Layout;
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class uy7 implements oi6, gfi, jrg, ie6, d2d
{
    public static final byte[] A;
    public Object v;
    public Object w;
    public final Object x;
    public Object y;
    public Object z;
    
    static {
        A = new byte[0];
    }
    
    public uy7(final byte b) {
        switch (b) {
            default: {
                this.v = new Object();
                this.x = new AtomicInteger(0);
                this.y = new emf();
                this.z = new emf();
                return;
            }
            case 17: {
                this.x = new ArrayList();
                this.y = new ArrayList();
            }
        }
    }
    
    public uy7(final Context v, final f60 w, final bz2 x, final wz2 y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = new e3a((Object)v, (Object)y, (byte)25);
    }
    
    public uy7(final Context context, final ffa w, final lfa x, final re0 y, final m8f z) {
        final o3b v = new o3b(context, gfq.m, (wh0)wh0.a, n3b.c);
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public uy7(final Layout v) {
        this.v = v;
        final ArrayList w = new ArrayList();
        final int n = 0;
        int n2 = 0;
        int i;
        do {
            i = kym.V0(((Layout)this.v).getText(), '\n', n2, 4);
            if (i < 0) {
                i = ((Layout)this.v).getText().length();
            }
            else {
                ++i;
            }
            w.add((Object)i);
            n2 = i;
        } while (i < ((Layout)this.v).getText().length());
        this.w = w;
        final int size = w.size();
        final ArrayList x = new ArrayList(size);
        for (int j = n; j < size; ++j) {
            x.add((Object)null);
        }
        this.x = x;
        this.y = new boolean[((ArrayList)this.w).size()];
        ((ArrayList)this.w).size();
    }
    
    public uy7(final bfa v) {
        this.v = v;
        this.w = new cj2();
        this.x = new cj2();
        this.y = vt4.c;
    }
    
    public uy7(final ClaudeDatabase v, final j9j j9j) {
        this.v = v;
        final e6c e6c = new e6c(j9j);
        this.w = e6c;
        this.x = new cof();
        this.y = new b37(this);
        this.z = e6c;
    }
    
    public uy7(final kr v, final kr w, final a09 x) {
        final y7j c = y7j.C;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = c;
        this.z = new dum(this);
    }
    
    public uy7(final oc4 z) {
        this.z = z;
        this.v = r8m.b((jta)new ga4(z, (byte)25));
        this.w = r8m.b((jta)new ga4(z, (byte)26));
        this.x = r8m.b((jta)new ga4(z, (byte)27));
        this.y = r8m.b((jta)new ga4(z, (byte)28));
    }
    
    public uy7(final og0 v, final xc8 xc8, final tna tna, final mnn mnn, final List w, final boolean b) {
        this.v = v;
        this.w = w;
        this.x = ncq.F(3, (jta)new wjf(this, (byte)0));
        this.y = ncq.F(3, (jta)new wjf(this, (byte)1));
        final mrg b2 = mnn.b;
        final og0 a = pg0.a;
        final ArrayList y = v.y;
        final String w2 = v.w;
        final r89 v2 = r89.v;
        Object k1;
        if (y != null) {
            k1 = c86.k1((Iterable)y, (Comparator)new jna((byte)6));
        }
        else {
            k1 = v2;
        }
        final ArrayList list = new ArrayList();
        final pv0 pv0 = new pv0();
        int size = ((Collection)k1).size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final ng0 ng0 = (ng0)((List)k1).get(i);
            final ng0 a2 = ng0.a(ng0, (kg0)b2.a((mrg)ng0.a), 0, 0, 14);
            final Object a3 = a2.a;
            final int c = a2.c;
            final int b3 = a2.b;
            int c2 = n;
            final int n2 = size;
            while (c2 < b3 && !pv0.isEmpty()) {
                final ng0 ng2 = (ng0)pv0.last();
                final int c3 = ng2.c;
                final Object a4 = ng2.a;
                if (b3 < c3) {
                    list.add((Object)new ng0(c2, b3, a4));
                    c2 = b3;
                }
                else {
                    list.add((Object)new ng0(c2, c3, a4));
                    c2 = ng2.c;
                    while (!pv0.isEmpty() && c2 == ((ng0)pv0.last()).c) {
                        pv0.removeLast();
                    }
                }
            }
            int n3;
            if ((n3 = c2) < b3) {
                list.add((Object)new ng0(c2, b3, (Object)b2));
                n3 = b3;
            }
            final ng0 ng3 = (ng0)pv0.s();
            if (ng3 != null) {
                final int c4 = ng3.c;
                final Object a5 = ng3.a;
                final int b4 = ng3.b;
                if (b4 == b3 && c4 == c) {
                    pv0.removeLast();
                    pv0.addLast((Object)new ng0(b3, c, (Object)((mrg)a5).a((mrg)a3)));
                }
                else if (b4 == c4) {
                    list.add((Object)new ng0(b4, c4, a5));
                    pv0.removeLast();
                    pv0.addLast((Object)new ng0(b3, c, a3));
                }
                else {
                    if (c4 < c) {
                        fvd.w();
                        throw null;
                    }
                    pv0.addLast((Object)new ng0(b3, c, (Object)((mrg)a5).a((mrg)a3)));
                }
            }
            else {
                pv0.addLast((Object)new ng0(b3, c, a3));
            }
            ++i;
            size = n2;
            n = n3;
        }
        while (n <= w2.length() && !pv0.isEmpty()) {
            final ng0 ng4 = (ng0)pv0.last();
            final Object a6 = ng4.a;
            final int c5 = ng4.c;
            list.add((Object)new ng0(n, c5, a6));
            while (!pv0.isEmpty() && c5 == ((ng0)pv0.last()).c) {
                pv0.removeLast();
            }
            n = c5;
        }
        if (n < w2.length()) {
            list.add((Object)new ng0(n, w2.length(), (Object)b2));
        }
        if (list.isEmpty()) {
            list.add((Object)new ng0(0, 0, (Object)b2));
        }
        final ArrayList z = new ArrayList(list.size());
        for (int size2 = list.size(), j = 0; j < size2; ++j) {
            final ng0 ng5 = (ng0)list.get(j);
            final int b5 = ng5.b;
            final int c6 = ng5.c;
            String substring;
            if (b5 != c6) {
                substring = w2.substring(b5, c6);
            }
            else {
                substring = "";
            }
            Object b6;
            if ((b6 = pg0.b(v, b5, c6, new p50((byte)3))) == null) {
                b6 = v2;
            }
            final og0 og0 = new og0(substring, (List)b6);
            Object o = ng5.a;
            if (((mrg)o).b == 0) {
                o = new mrg(((mrg)o).a, b2.b, ((mrg)o).c, ((mrg)o).d, ((mrg)o).e, ((mrg)o).f, ((mrg)o).g, ((mrg)o).h, ((mrg)o).i);
            }
            final mnn mnn2 = new mnn(mnn.a, b2.a((mrg)o));
            List v3 = og0.v;
            if (v3 == null) {
                v3 = (List)v2;
            }
            final List list2 = (List)this.w;
            final ArrayList list3 = new ArrayList(list2.size());
            for (int size3 = ((Collection)list2).size(), l = 0; l < size3; ++l) {
                final ng0 ng6 = (ng0)list2.get(l);
                final int b7 = ng6.b;
                final int c7 = ng6.c;
                if (pg0.c(b5, c6, b7, c7)) {
                    if (b5 > b7 || c7 > c6) {
                        hac.a("placeholder can not overlap with paragraph.");
                    }
                    list3.add((Object)new ng0(b7 - b5, c7 - b5, ng6.a));
                }
            }
            z.add((Object)new irg(new e90(substring, mnn2, v3, (List)list3, tna, xc8, b), b5, c6));
        }
        this.z = z;
    }
    
    public uy7(final pm4 v, final z7m x, final d5g y, final fz6 z) {
        this.v = v;
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = soh.y(v);
    }
    
    public uy7(final rv7 z, final List list, final hc7 x) {
        this.z = z;
        this.v = new cof();
        this.w = soh.c();
        this.x = x;
        this.y = c86.s1((Iterable)list);
    }
    
    public uy7(final se6 se6) {
        this.v = new ArrayList((Collection)se6.a);
        this.w = new ArrayList((Collection)se6.b);
        this.x = new ArrayList((Collection)se6.c);
        final List list = (List)se6.f.getValue();
        final ArrayList y = new ArrayList();
        final Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            y.add((Object)new p1((Object)iterator.next(), (byte)25));
        }
        this.y = y;
        final List list2 = (List)se6.g.getValue();
        final ArrayList z = new ArrayList();
        final Iterator iterator2 = ((Iterable)list2).iterator();
        while (iterator2.hasNext()) {
            z.add((Object)new re6((u18)iterator2.next(), (byte)1));
        }
        this.z = z;
    }
    
    public uy7(final tpj tpj) {
        this.x = new ArrayList();
        this.y = new ArrayList();
        final b03 b = tpj.b;
        final List f = tpj.f;
        this.v = b;
        this.w = tpj.c;
        final List d = tpj.d;
        for (int size = d.size(), e = tpj.e, i = 1; i < size - e; ++i) {
            ((ArrayList)this.x).add((Object)d.get(i));
        }
        for (int size2 = f.size(), g = tpj.g, j = 0; j < size2 - g; ++j) {
            ((ArrayList)this.y).add((Object)f.get(j));
        }
        this.z = tpj.h;
    }
    
    public uy7(final ud6 ud6, final ie6 z) {
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        final HashSet set3 = new HashSet();
        final HashSet set4 = new HashSet();
        final HashSet set5 = new HashSet();
        final Set c = ud6.c;
        final Set g = ud6.g;
        for (final dd8 dd8 : c) {
            final boolean c2 = dd8.c;
            final byte b = dd8.b;
            final bmi a = dd8.a;
            if (!c2) {
                if (b == 2) {
                    set4.add((Object)a);
                }
                else {
                    set.add((Object)a);
                }
            }
            else if ((c2 ? 1 : 0) == 2) {
                set3.add((Object)a);
            }
            else if (b == 2) {
                set5.add((Object)a);
            }
            else {
                set2.add((Object)a);
            }
        }
        if (!g.isEmpty()) {
            set.add((Object)bmi.a((Class)lhi.class));
        }
        this.v = Collections.unmodifiableSet((Set)set);
        this.w = Collections.unmodifiableSet((Set)set2);
        Collections.unmodifiableSet((Set)set3);
        this.x = Collections.unmodifiableSet((Set)set4);
        this.y = Collections.unmodifiableSet((Set)set5);
        this.z = z;
    }
    
    public uy7(final us4 v, final g0e w, final lrc x, final g0e y) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public uy7(final us4 v, final nob x, final Map y, final String w, final m7n z) {
        this.v = v;
        this.x = x;
        this.y = y;
        this.w = w;
        this.z = z;
    }
    
    public static void E(final j1f j1f, final int n, final s8a s8a, final Object o) {
        if (j1f.b == null) {
            final Object b = new Object();
            j1f.b = (an2)b;
            (j1f.c = new vdi((pn2)b)).a(j1f.a);
            j1f.a = is2.y;
        }
        final ProtoAdapter a = s8a.a();
        a.getClass();
        final vdi c = j1f.c;
        c.getClass();
        a.encodeWithTag(c, n, o);
    }
    
    public static ContentValues J(final EventUpdateV0InputEventUpdatesItem eventUpdateV0InputEventUpdatesItem) {
        final ContentValues contentValues = new ContentValues();
        final String j = eventUpdateV0InputEventUpdatesItem.j();
        if (j != null) {
            contentValues.put("title", j);
        }
        final OffsetDateTime h = eventUpdateV0InputEventUpdatesItem.h();
        if (h != null) {
            contentValues.put("dtstart", Long.valueOf(h.toInstant().toEpochMilli()));
        }
        final OffsetDateTime c = eventUpdateV0InputEventUpdatesItem.c();
        if (c != null) {
            contentValues.put("dtend", Long.valueOf(c.toInstant().toEpochMilli()));
        }
        final Boolean a = eventUpdateV0InputEventUpdatesItem.a();
        if (a != null) {
            contentValues.put("allDay", Integer.valueOf((int)(((boolean)a) ? 1 : 0)));
        }
        final String f = eventUpdateV0InputEventUpdatesItem.f();
        if (f != null) {
            contentValues.put("eventLocation", f);
        }
        final String d = eventUpdateV0InputEventUpdatesItem.d();
        if (d != null) {
            contentValues.put("description", d);
        }
        final EventUpdateV0InputEventUpdatesItemStatus i = eventUpdateV0InputEventUpdatesItem.i();
        final int n = 0;
        if (i != null) {
            final int ordinal = ((Enum)i).ordinal();
            int n2;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        en9.r();
                        return null;
                    }
                    n2 = 2;
                }
                else {
                    n2 = 0;
                }
            }
            else {
                n2 = 1;
            }
            contentValues.put("eventStatus", Integer.valueOf(n2));
        }
        final EventUpdateV0InputEventUpdatesItemAvailability b = eventUpdateV0InputEventUpdatesItem.b();
        if (b != null) {
            final int ordinal2 = ((Enum)b).ordinal();
            int n3 = n;
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        en9.r();
                        return null;
                    }
                    n3 = 2;
                }
                else {
                    n3 = 1;
                }
            }
            contentValues.put("availability", Integer.valueOf(n3));
        }
        final EventUpdateV0InputEventUpdatesItemRecurrence g = eventUpdateV0InputEventUpdatesItem.g();
        if (g != null) {
            final String a2 = g.a();
            if (a2 != null) {
                contentValues.put("rrule", a2);
            }
        }
        return contentValues;
    }
    
    public static String Z(final EventCreateV1InputNewEventsItem eventCreateV1InputNewEventsItem) {
        final OffsetDateTime c = eventCreateV1InputNewEventsItem.c();
        if (!mlc.q((Object)eventCreateV1InputNewEventsItem.a(), (Object)Boolean.TRUE) && c != null && c.isBefore(eventCreateV1InputNewEventsItem.g())) {
            return "end_time is before start_time";
        }
        final EventCreateV1InputNewEventsItemRecurrence f = eventCreateV1InputNewEventsItem.f();
        if (f != null) {
            if (llc.g(f.a()) == null) {
                return "recurrence rule is empty";
            }
        }
        return null;
    }
    
    public void A(final l8a l8a, final us4 us4) {
        ((ArrayList)this.y).add((Object)new jd0((Object)l8a, (Object)us4, (byte)22));
    }
    
    public q13 B(final rn1 rn1, final jta jta) {
        final Object o = new Object();
        ((z3j)o).v = -1;
        final Object v;
        monitorenter(v = this.v);
        Label_0325: {
            try {
                final Throwable t = (Throwable)this.w;
                if (t != null) {
                    rn1.b(t);
                    final my8 z = zyo.z;
                    monitorexit(v);
                    return (q13)z;
                }
            }
            finally {
                break Label_0325;
            }
            final cc1 cc1 = (cc1)this.x;
            int value;
            int n;
            do {
                value = cc1.get();
                n = value + 1;
            } while (!cc1.compareAndSet(value, n));
            final boolean b = (0x7FFFFFF & n) == 0x1;
            ((z3j)o).v = (n >>> 27 & 0xF);
            final Throwable t2;
            ((emf)this.y).b((Object)t2);
            monitorexit(v);
            if (b && jta != null) {
                try {
                    jta.a();
                }
                finally {
                    Object v2;
                    while (true) {
                        monitorenter(v2 = this.v);
                        while (true) {
                            try {
                                if (this.w != null) {
                                    monitorexit(v2);
                                    return (q13)new e3a(new qn1((Object)t2, (Object)this, o, (byte)0));
                                }
                                final Throwable w;
                                this.w = w;
                                final emf emf = (emf)this.y;
                                final Object[] a = emf.a;
                                for (int b2 = emf.b, i = 0; i < b2; ++i) {
                                    ((rn1)a[i]).b(w);
                                }
                            }
                            finally {
                                break;
                            }
                            ((emf)this.y).e();
                            final cc1 cc2 = (cc1)this.x;
                            int value2;
                            do {
                                value2 = cc2.get();
                            } while (!cc2.compareAndSet(value2, ((value2 >>> 27 & 0xF) + 1 & 0xF) << 27));
                            continue;
                        }
                    }
                    monitorexit(v2);
                }
            }
            return (q13)new e3a(new qn1((Object)t2, (Object)this, o, (byte)0));
        }
        monitorexit(v);
    }
    
    public void C(final String s, final List list) {
        final Integer value = 1;
        if (list != null) {
            for (final String s2 : list) {
                final ContentValues contentValues = new ContentValues();
                contentValues.put("event_id", s);
                contentValues.put("attendeeEmail", s2);
                contentValues.put("attendeeRelationship", value);
                contentValues.put("attendeeType", value);
                contentValues.put("attendeeStatus", Integer.valueOf(3));
                ((Context)this.v).getContentResolver().insert(CalendarContract$Attendees.CONTENT_URI, contentValues);
            }
        }
    }
    
    public void D(final String s, final ArrayList list) {
        if (list != null) {
            for (final yog yog : list) {
                final int intValue = ((Number)yog.v).intValue();
                final int intValue2 = ((Number)yog.w).intValue();
                final ContentValues contentValues = new ContentValues();
                contentValues.put("event_id", s);
                contentValues.put("minutes", Integer.valueOf(intValue));
                contentValues.put("method", Integer.valueOf(intValue2));
                ((Context)this.v).getContentResolver().insert(CalendarContract$Reminders.CONTENT_URI, contentValues);
            }
        }
    }
    
    public Bidi F(final int n) {
        final Layout layout = (Layout)this.v;
        final ArrayList list = (ArrayList)this.w;
        final ArrayList list2 = (ArrayList)this.x;
        final boolean[] array = (boolean[])this.y;
        if (array[n]) {
            return (Bidi)list2.get(n);
        }
        int intValue;
        if (n == 0) {
            intValue = 0;
        }
        else {
            intValue = ((Number)list.get(n - 1)).intValue();
        }
        final int intValue2 = ((Number)list.get(n)).intValue();
        final int n2 = intValue2 - intValue;
        final char[] array2 = (char[])this.z;
        while (true) {
            Label_0131: {
                if (array2 == null) {
                    break Label_0131;
                }
                final char[] array3 = array2;
                if (array2.length < n2) {
                    break Label_0131;
                }
                final char[] array4 = array3;
                TextUtils.getChars(layout.getText(), intValue, intValue2, array4, 0);
                Bidi bidi = null;
                Label_0221: {
                    if (Bidi.requiresBidi(array4, 0, n2)) {
                        int n3;
                        if (layout.getParagraphDirection(layout.getLineForOffset(this.P(n))) == -1) {
                            n3 = 1;
                        }
                        else {
                            n3 = 0;
                        }
                        if ((bidi = new Bidi(array4, 0, (byte[])null, 0, n2, n3)).getRunCount() != 1) {
                            break Label_0221;
                        }
                    }
                    bidi = null;
                }
                list2.set(n, (Object)bidi);
                array[n] = true;
                char[] z = array4;
                if (bidi != null) {
                    z = (char[])this.z;
                    if (array4 == z) {
                        z = null;
                    }
                }
                this.z = z;
                return bidi;
            }
            final char[] array3 = new char[n2];
            continue;
        }
    }
    
    public void G(final String s) {
        Objects.requireNonNull((Object)s, "baseUrl == null");
        final hpb hpb = new hpb((byte)0);
        hpb.g((ipb)null, s);
        final ipb b = hpb.b();
        final ArrayList f = b.f;
        if ("".equals(f.get(f.size() - 1))) {
            this.w = b;
            return;
        }
        uy8.l((Object)b, "baseUrl must end in /: ");
    }
    
    public tpj H() {
        final ArrayList list = (ArrayList)this.x;
        if (this.w != null) {
            Object o;
            if ((o = this.v) == null) {
                o = new h7g();
            }
            Object a;
            if ((a = this.z) == null) {
                a = rah.a;
            }
            final o55 c = rah.c;
            final ArrayList list2 = new ArrayList((Collection)this.y);
            final List t = c.t((Executor)a);
            list2.addAll((Collection)t);
            final List u = c.u();
            final int size = u.size();
            final ArrayList list3 = new ArrayList(list.size() + 1 + size);
            list3.add((Object)new bo2((byte)0));
            list3.addAll((Collection)list);
            list3.addAll((Collection)u);
            return new tpj((b03)o, (ipb)this.w, Collections.unmodifiableList((List)list3), size, Collections.unmodifiableList((List)list2), t.size(), (Executor)a);
        }
        en9.q("Base URL required.");
        return null;
    }
    
    public ContentValues I(final EventCreateV1InputNewEventsItem eventCreateV1InputNewEventsItem, String s, final Boolean b) {
        final f60 f60 = (f60)this.w;
        final ContentValues contentValues = new ContentValues();
        contentValues.put("calendar_id", s);
        contentValues.put("title", eventCreateV1InputNewEventsItem.i());
        final Boolean a = eventCreateV1InputNewEventsItem.a();
        final Boolean true = Boolean.TRUE;
        final int q = mlc.q((Object)a, (Object)true) ? 1 : 0;
        final EventCreateV1InputNewEventsItemRecurrence f61 = eventCreateV1InputNewEventsItem.f();
        Label_0085: {
            if (f61 != null) {
                s = f61.a();
                if (s != null) {
                    s = llc.g(s);
                    break Label_0085;
                }
            }
            s = null;
        }
        final long epochMilli = eventCreateV1InputNewEventsItem.g().toInstant().toEpochMilli();
        Long value;
        if (q != 0) {
            final OffsetDateTime c = eventCreateV1InputNewEventsItem.c();
            long h;
            if (c != null) {
                h = llc.h(eventCreateV1InputNewEventsItem.g(), c);
            }
            else {
                h = 1L;
            }
            value = h;
        }
        else {
            value = null;
        }
        long epochMilli2 = 0L;
        Label_0206: {
            if (value != null) {
                epochMilli2 = value * 86400000L + epochMilli;
            }
            else {
                final OffsetDateTime c2 = eventCreateV1InputNewEventsItem.c();
                if (c2 != null) {
                    final Instant instant = c2.toInstant();
                    if (instant != null) {
                        epochMilli2 = instant.toEpochMilli();
                        break Label_0206;
                    }
                }
                epochMilli2 = 3600000L + epochMilli;
            }
        }
        contentValues.put("dtstart", Long.valueOf(epochMilli));
        if (s != null) {
            String s2;
            if (value != null) {
                s2 = hia.i(((Number)value).longValue(), "P", "D");
            }
            else {
                s2 = y6r.n(epochMilli2 - epochMilli);
            }
            contentValues.put("duration", s2);
            contentValues.put("rrule", s);
            if (mlc.q((Object)b, (Object)true)) {
                contentValues.put("_sync_id", String.valueOf(System.currentTimeMillis()));
            }
        }
        else {
            contentValues.put("dtend", Long.valueOf(epochMilli2));
        }
        contentValues.put("allDay", Integer.valueOf(q));
        s = eventCreateV1InputNewEventsItem.e();
        if (s != null) {
            contentValues.put("eventLocation", s);
        }
        s = eventCreateV1InputNewEventsItem.d();
        if (s != null) {
            contentValues.put("description", s);
        }
        contentValues.put("eventTimezone", f60.b());
        final EventCreateV1InputNewEventsItemStatus h2 = eventCreateV1InputNewEventsItem.h();
        final int n = 0;
        if (h2 != null) {
            final int ordinal = ((Enum)h2).ordinal();
            int n2;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        en9.r();
                        return null;
                    }
                    n2 = 2;
                }
                else {
                    n2 = 0;
                }
            }
            else {
                n2 = 1;
            }
            contentValues.put("eventStatus", Integer.valueOf(n2));
        }
        final EventCreateV1InputNewEventsItemAvailability b2 = eventCreateV1InputNewEventsItem.b();
        if (b2 != null) {
            final int ordinal2 = ((Enum)b2).ordinal();
            int n3 = n;
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        en9.r();
                        return null;
                    }
                    n3 = 2;
                }
                else {
                    n3 = 1;
                }
            }
            contentValues.put("availability", Integer.valueOf(n3));
        }
        return contentValues;
    }
    
    public Object K(final h07 h07) {
        final rv7 rv7 = (rv7)this.z;
        Object o = null;
        Label_0058: {
            if (h07 instanceof tu7) {
                final tu7 tu7 = (tu7)h07;
                final int x = tu7.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    tu7.x = x + Integer.MIN_VALUE;
                    o = tu7;
                    break Label_0058;
                }
            }
            o = new tu7(this, h07);
        }
        Object v = ((tu7)o).v;
        final int x2 = ((tu7)o).x;
        if (x2 != 0) {
            if (x2 != 1) {
                if (x2 == 2) {
                    vt4.g0(v);
                    return lqo.a;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                vt4.g0(v);
            }
        }
        else {
            vt4.g0(v);
            ((tu7)o).x = 1;
            v = null;
        }
        final yci yci = (yci)v;
        final hc7 hc7 = (hc7)this.x;
        final p10 p = new p10(rv7, yci, this, (f07)null);
        ((tu7)o).x = 2;
        final Object f0 = rhc.f0(hc7, (zta)p, (f07)o);
        final pc7 v2 = pc7.v;
        if (f0 == v2) {
            return v2;
        }
        return lqo.a;
    }
    
    public void L(final lta lta) {
        final Object v;
        monitorenter(v = this.v);
        Label_0122: {
            emf z;
            try {
                z = (emf)this.y;
                this.y = this.z;
                this.z = z;
                final cc1 cc1 = (cc1)this.x;
                int value;
                do {
                    value = cc1.get();
                } while (!cc1.compareAndSet(value, ((value >>> 27 & 0xF) + 1 & 0xF) << 27));
                for (int b = z.b, i = 0; i < b; ++i) {
                    lta.b(z.g(i));
                }
            }
            finally {
                break Label_0122;
            }
            z.e();
            monitorexit(v);
            return;
        }
        monitorexit(v);
    }
    
    public float M(final int n, final boolean b) {
        final Layout layout = (Layout)this.v;
        final int lineEnd = layout.getLineEnd(layout.getLineForOffset(n));
        int n2 = n;
        if (n > lineEnd) {
            n2 = lineEnd;
        }
        if (b) {
            return layout.getPrimaryHorizontal(n2);
        }
        return layout.getSecondaryHorizontal(n2);
    }
    
    public float N(int i, final boolean b, final boolean b2) {
        final Layout layout = (Layout)this.v;
        if (!b2) {
            return this.M(i, b);
        }
        final int z = twl.z(layout, i, b2);
        final int lineStart = layout.getLineStart(z);
        final int lineEnd = layout.getLineEnd(z);
        if (i != lineStart && i != lineEnd) {
            return this.M(i, b);
        }
        if (i == 0 || i == layout.getText().length()) {
            return this.M(i, b);
        }
        final int o = this.O(i, b2);
        int n;
        if (layout.getParagraphDirection(layout.getLineForOffset(this.P(o))) == -1) {
            n = 1;
        }
        else {
            n = 0;
        }
        final int r = this.R(lineEnd, lineStart);
        final int p3 = this.P(o);
        final Bidi f = this.F(o);
        Bidi lineBidi;
        if (f != null) {
            lineBidi = f.createLineBidi(lineStart - p3, r - p3);
        }
        else {
            lineBidi = null;
        }
        if (lineBidi == null || lineBidi.getRunCount() == 1) {
            final boolean rtlChar = layout.isRtlCharAt(lineStart);
            int n2;
            if (b || (n2 = n) == (rtlChar ? 1 : 0)) {
                if (n == 0) {
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
            }
            if (i != lineStart) {
                if (n2 == 0) {
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
            }
            if (n2 != 0) {
                return layout.getLineLeft(z);
            }
            return layout.getLineRight(z);
        }
        else {
            final int runCount = lineBidi.getRunCount();
            final szc[] array = new szc[runCount];
            for (int j = 0; j < runCount; ++j) {
                array[j] = new szc(lineBidi.getRunStart(j) + lineStart, lineBidi.getRunLimit(j) + lineStart, lineBidi.getRunLevel(j) % 2 == 1);
            }
            final int runCount2 = lineBidi.getRunCount();
            final byte[] array2 = new byte[runCount2];
            for (int k = 0; k < runCount2; ++k) {
                array2[k] = (byte)lineBidi.getRunLevel(k);
            }
            Bidi.reorderVisually(array2, 0, (Object[])array, 0, runCount);
            if (i == lineStart) {
                int l = 0;
                while (true) {
                    while (l < runCount) {
                        if (array[l].b() == i) {
                            final szc szc = array[l];
                            int n3;
                            if (!b && n != (szc.c() ? 1 : 0)) {
                                n3 = n;
                            }
                            else if (n == 0) {
                                n3 = 1;
                            }
                            else {
                                n3 = 0;
                            }
                            if (l == 0 && n3 != 0) {
                                return layout.getLineLeft(z);
                            }
                            if (l == runCount - 1 && n3 == 0) {
                                return layout.getLineRight(z);
                            }
                            if (n3 != 0) {
                                return layout.getPrimaryHorizontal(array[l - 1].b());
                            }
                            return layout.getPrimaryHorizontal(array[l + 1].b());
                        }
                        else {
                            ++l;
                        }
                    }
                    l = -1;
                    continue;
                }
            }
            int r2;
            if (i > r) {
                r2 = this.R(i, lineStart);
            }
            else {
                r2 = i;
            }
            i = 0;
            while (true) {
                while (i < runCount) {
                    if (array[i].a() == r2) {
                        final szc szc2 = array[i];
                        int n4;
                        if (!b && n != (szc2.c() ? 1 : 0)) {
                            if (n == 0) {
                                n4 = 1;
                            }
                            else {
                                n4 = 0;
                            }
                        }
                        else {
                            n4 = n;
                        }
                        if (i == 0 && n4 != 0) {
                            return layout.getLineLeft(z);
                        }
                        if (i == runCount - 1 && n4 == 0) {
                            return layout.getLineRight(z);
                        }
                        if (n4 != 0) {
                            return layout.getPrimaryHorizontal(array[i - 1].a());
                        }
                        return layout.getPrimaryHorizontal(array[i + 1].a());
                    }
                    else {
                        ++i;
                    }
                }
                i = -1;
                continue;
            }
        }
    }
    
    public int O(final int n, final boolean b) {
        final ArrayList list = (ArrayList)this.w;
        int j = lq6.j(list, (Comparable)n);
        if (j < 0) {
            j = -(j + 1);
        }
        else {
            ++j;
        }
        if (b && j > 0) {
            final int n2 = j - 1;
            if (n == ((Number)list.get(n2)).intValue()) {
                return n2;
            }
        }
        return j;
    }
    
    public int P(final int n) {
        if (n == 0) {
            return 0;
        }
        return ((Number)((ArrayList)this.w).get(n - 1)).intValue();
    }
    
    public boolean Q() {
        final ffa ffa = (ffa)this.w;
        ffa.a();
        final Context a = ffa.a;
        try {
            final PackageManager packageManager = a.getPackageManager();
            if (packageManager != null) {
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128);
                final Bundle metaData = applicationInfo.metaData;
                if (metaData != null && ((BaseBundle)metaData).containsKey("firebase_messaging_installation_id_enabled")) {
                    return ((BaseBundle)applicationInfo.metaData).getBoolean("firebase_messaging_installation_id_enabled");
                }
            }
            return false;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public int R(int i, final int n) {
        while (i > n) {
            final char char1 = ((Layout)this.v).getText().charAt(i - 1);
            if (char1 != ' ' && char1 != '\n' && char1 != '\u1680' && (mlc.u((int)char1, 8192) < 0 || mlc.u((int)char1, 8202) > 0 || char1 == '\u2007') && char1 != '\u205f' && char1 != '\u3000') {
                return i;
            }
            --i;
        }
        return i;
    }
    
    public Object S(final String s, final h07 h07) {
        vw2 vw3 = null;
        Label_0053: {
            if (h07 instanceof vw2) {
                final vw2 vw2 = (vw2)h07;
                final int x = vw2.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    vw2.x = x + Integer.MIN_VALUE;
                    vw3 = vw2;
                    break Label_0053;
                }
            }
            vw3 = new vw2(this, h07);
        }
        final Object v = vw3.v;
        final int x2 = vw3.x;
        Label_0092: {
            if (x2 == 0) {
                break Label_0092;
            }
            Label_0084: {
                if (x2 != 1) {
                    break Label_0084;
                }
                try {
                    vt4.g0(v);
                    Object o = v;
                    final boolean booleanValue;
                    Label_0157: {
                        booleanValue = (boolean)o;
                    }
                    return booleanValue;
                    vt4.g0(v);
                    final o77 o2 = (o77)this.v;
                    final String s2 = (String)this.w;
                    final String s3 = (String)this.x;
                    vw3.x = 1;
                    final Object s4 = o2.s(s2, s3, s, (h07)vw3);
                    final pc7 v2 = pc7.v;
                    iftrue(Label_0157:)((o = s4) != v2);
                    return v2;
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                catch (final Exception ex) {}
                catch (final CancellationException ex2) {
                    throw ex2;
                }
            }
        }
        final List a = adn.a;
        final Exception ex;
        adn.f((Throwable)kej.a(ex, "record read failed"), "executed client tool read failed", lpl.w, (Map)null, (List)null, 40);
        return false;
    }
    
    public Object T(String v, h07 w) {
        final String s = (String)this.x;
        final String s2 = (String)this.w;
        final o77 o77 = (o77)this.v;
        Object o78;
        int z;
        Object o79;
        int z2;
        pc7 v2;
        k00 k00;
        String s3;
        h07 h07;
        List a;
        jta jta;
        k57 k2;
        k57 k3;
        boolean contains;
        Object u;
        Block_12_Outer:Block_10_Outer:
        while (true) {
            Label_0067: {
                if (!(w instanceof ww2)) {
                    break Label_0067;
                }
                o78 = w;
                z = ((ww2)o78).z;
                if ((z & Integer.MIN_VALUE) == 0x0) {
                    break Label_0067;
                }
                ((ww2)o78).z = z + Integer.MIN_VALUE;
                o79 = ((ww2)o78).x;
                z2 = ((ww2)o78).z;
                v2 = pc7.v;
                Label_0180: {
                    if (z2 == 0) {
                        break Label_0180;
                    }
                    Label_0172: {
                        if (z2 == 1) {
                            break Label_0172;
                        }
                        Label_0164: {
                            if (z2 == 2) {
                                break Label_0164;
                            }
                            Label_0495: {
                                if (z2 != 3) {
                                    if (z2 == 4) {
                                        vt4.g0(o79);
                                        break Label_0495;
                                    }
                                    en9.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                w = (h07)((ww2)o78).w;
                                v = ((ww2)o78).v;
                                try {
                                    while (true) {
                                        while (true) {
                                            while (true) {
                                                Label_0395: {
                                                    try {
                                                        vt4.g0(o79);
                                                        break Label_0395;
                                                    }
                                                    catch (final Exception ex) {}
                                                    break Label_0395;
                                                    try {
                                                        try {
                                                            k00 = new k00((Object)this, (Object)v, (Object)w, (f07)null, (byte)2);
                                                            s3 = v;
                                                            h07 = w;
                                                            try {
                                                                ((ww2)o78).v = v;
                                                                s3 = v;
                                                                h07 = w;
                                                                ((ww2)o78).w = (String)w;
                                                                s3 = v;
                                                                h07 = w;
                                                                ((ww2)o78).z = 3;
                                                                s3 = v;
                                                                h07 = w;
                                                                if ((o79 = o77.t(s2, s, (lta)k00, (h07)o78)) == v2) {
                                                                    return v2;
                                                                }
                                                                s3 = v;
                                                                h07 = w;
                                                                v = (String)o79;
                                                                return v;
                                                            }
                                                            catch (final Exception o79) {
                                                                v = s3;
                                                                w = h07;
                                                            }
                                                        }
                                                        catch (final Exception o79) {}
                                                    }
                                                    catch (final Exception o79) {}
                                                }
                                                a = adn.a;
                                                adn.f((Throwable)kej.a((Exception)o79, "record write failed"), "executed client tool write failed", lpl.w, (Map)null, (List)null, 40);
                                                ((ww2)o78).v = null;
                                                ((ww2)o78).w = null;
                                                ((ww2)o78).z = 4;
                                                if ((o79 = this.U((String)w, v, (h07)o78)) == v2) {
                                                    return v2;
                                                }
                                                return o79;
                                                ((ww2)o78).v = null;
                                                ((ww2)o78).w = null;
                                                ((ww2)o78).z = 1;
                                                iftrue(Label_0280:)(this.W(v, (h07)o78) != v2);
                                                return v2;
                                                Label_0284: {
                                                    k2 = (k57)jta.a();
                                                }
                                                iftrue(Label_0504:)(k2 == null || k2.a);
                                                continue Block_12_Outer;
                                            }
                                            vt4.g0(o79);
                                            return o79;
                                            k3 = (k57)jta.a();
                                            iftrue(Label_0280:)(k3 == null || k3.a);
                                            continue Block_10_Outer;
                                        }
                                        vt4.g0(o79);
                                        return kt9.a;
                                        vt4.g0(o79);
                                        w = (h07)hia.k(o77.j(s2, s), "/", v);
                                        contains = o77.i.contains((Object)w);
                                        jta = (jta)this.y;
                                        iftrue(Label_0284:)(!contains);
                                        continue;
                                    }
                                    Label_0280: {
                                        return kt9.a;
                                    }
                                }
                                catch (final CancellationException ex2) {
                                    throw ex2;
                                }
                            }
                        }
                    }
                }
                Label_0504: {
                    ((ww2)o78).v = null;
                }
                ((ww2)o78).w = null;
                ((ww2)o78).z = 2;
                u = this.U((String)w, v, (h07)o78);
                if (u != v2) {
                    return u;
                }
                return v2;
            }
            o78 = new ww2(this, w);
            continue;
        }
    }
    
    public Object U(String v, final String s, final h07 h07) {
        Object o = null;
        Label_0056: {
            if (h07 instanceof xw2) {
                final xw2 xw2 = (xw2)h07;
                final int y = xw2.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    xw2.y = y + Integer.MIN_VALUE;
                    o = xw2;
                    break Label_0056;
                }
            }
            o = new xw2(this, h07);
        }
        final Object w = ((xw2)o).w;
        final int y2 = ((xw2)o).y;
        Object o2;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ((xw2)o).v;
            vt4.g0(w);
            o2 = w;
        }
        else {
            vt4.g0(w);
            ((xw2)o).v = v;
            ((xw2)o).y = 1;
            final Object s2 = this.S(s, (h07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = s2) == v2) {
                return v2;
            }
        }
        if (!(boolean)o2) {
            if (((o77)this.v).i.add((Object)v)) {
                return lt9.a;
            }
        }
        return kt9.a;
    }
    
    public Object V(h07 v) {
        final vc6 vc6 = (vc6)this.w;
        Object o = null;
        Label_0060: {
            if (v instanceof k2k) {
                o = v;
                final int z = ((k2k)o).z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ((k2k)o).z = z + Integer.MIN_VALUE;
                    break Label_0060;
                }
            }
            o = new k2k(this, v);
        }
        final Object x = ((k2k)o).x;
        final int z2 = ((k2k)o).z;
        final lqo a = lqo.a;
        final pc7 v2 = pc7.v;
        h07 h07 = null;
        Label_0271: {
            int w;
            if (z2 != 0) {
                if (z2 != 1) {
                    if (z2 == 2) {
                        v = (h07)((k2k)o).v;
                        try {
                            vt4.g0(x);
                            break Label_0271;
                        }
                        finally {
                            break Label_0271;
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w = ((k2k)o).w;
                v = (h07)((k2k)o).v;
                vt4.g0(x);
            }
            else {
                vt4.g0(x);
                if (((bqc)vc6).R0()) {
                    return a;
                }
                final Object v3 = this.v;
                ((k2k)o).v = (aof)v3;
                w = 0;
                ((k2k)o).w = 0;
                ((k2k)o).z = 1;
                v = (h07)v3;
                if (((cof)v3).c((f07)o) == v2) {
                    return v2;
                }
            }
            try {
                if (((bqc)vc6).R0()) {
                    ((aof)v).g((Object)null);
                    return a;
                }
                ((k2k)o).v = (aof)v;
                ((k2k)o).w = w;
                ((k2k)o).z = 2;
                if (this.K((h07)o) == v2) {
                    return v2;
                }
                h07 = v;
                v = h07;
                ((bqc)vc6).S((Object)a);
                ((aof)h07).g((Object)null);
                return a;
            }
            finally {}
        }
        ((aof)v).g((Object)null);
        throw h07;
    }
    
    public Object W(final String s, final h07 h07) {
        Object o = null;
        Label_0053: {
            if (h07 instanceof yw2) {
                final yw2 yw2 = (yw2)h07;
                final int x = yw2.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    yw2.x = x + Integer.MIN_VALUE;
                    o = yw2;
                    break Label_0053;
                }
            }
            o = new yw2(this, h07);
        }
        final Object v = ((yw2)o).v;
        final int x2 = ((yw2)o).x;
        Label_0089: {
            if (x2 == 0) {
                break Label_0089;
            }
            Label_0081: {
                if (x2 != 1) {
                    break Label_0081;
                }
                try {
                    vt4.g0(v);
                    return lqo.a;
                    vt4.g0(v);
                    final o77 o2 = (o77)this.v;
                    final String s2 = (String)this.w;
                    final String s3 = (String)this.x;
                    final j30 j30 = new j30((Object)this, (Object)s, (f07)null, (byte)3);
                    ((yw2)o).x = 1;
                    final Object t = o2.t(s2, s3, (lta)j30, (h07)o);
                    final pc7 v2 = pc7.v;
                    iftrue(Label_0196:)(t != v2);
                    return v2;
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                catch (final Exception ex) {}
                catch (final CancellationException ex2) {
                    throw ex2;
                }
            }
        }
        final List a = adn.a;
        final Exception ex;
        adn.f((Throwable)kej.a(ex, "record save failed"), "executed client tool write failed", lpl.w, (Map)null, (List)null, 40);
        Label_0196: {
            return lqo.a;
        }
    }
    
    public ygc X(final float n) {
        final cj2 cj2 = (cj2)this.w;
        ygc y;
        if (n == 0.0f) {
            y = cj2.a();
        }
        else {
            final cj2 cj3 = (cj2)this.x;
            if (n == 1.0f) {
                y = cj3.a();
            }
            else {
                Label_0150: {
                    if (cj2.b()) {
                        if (cj3.b()) {
                            final jcn jcn = (jcn)this.z;
                            if (jcn != null && mlc.q(jcn.d, (Object)cj2.a())) {
                                final jcn jcn2 = (jcn)this.z;
                                jcn2.getClass();
                                if (mlc.q(jcn2.c, (Object)cj3.a())) {
                                    break Label_0150;
                                }
                            }
                            this.z = new jcn((cg0)this.v, (dlo)vt4.d, (Object)cj2.a(), (Object)cj3.a(), (ig0)null);
                        }
                    }
                }
                final jcn jcn3 = (jcn)this.z;
                if (jcn3 == null || (y = (ygc)jcn3.f((long)(jcn3.b() * n))) == null) {
                    y = vt4.c;
                }
            }
        }
        return (ygc)(this.y = y);
    }
    
    public yog Y(final String s, final ContentValues contentValues) {
        final Long h0 = rym.H0(s);
        Uri withAppendedId;
        if (h0 != null) {
            withAppendedId = ContentUris.withAppendedId(CalendarContract$Events.CONTENT_URI, ((Number)h0).longValue());
        }
        else {
            withAppendedId = null;
        }
        if (withAppendedId == null) {
            return new yog((Object)Boolean.FALSE, (Object)s);
        }
        return new yog((Object)(((Context)this.v).getContentResolver().update(withAppendedId, contentValues, (String)null, (String[])null) > 0), (Object)s);
    }
    
    @Override
    public String a() {
        return ((oc4)this.z).w.a();
    }
    
    public Object a0(f07 w, zta zta) {
        Object o = null;
        Label_0051: {
            if (w instanceof c37) {
                o = w;
                final int z = ((c37)o).z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ((c37)o).z = z + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            o = new c37(this, w);
        }
        final Object x = ((c37)o).x;
        final int z2 = ((c37)o).z;
        final pc7 v = pc7.v;
        Label_0244: {
            if (z2 != 0) {
                if (z2 != 1) {
                    if (z2 == 2) {
                        w = (f07)((c37)o).w;
                        try {
                            vt4.g0(x);
                            o = w;
                            w = (f07)x;
                            break Label_0244;
                        }
                        finally {
                            break Label_0244;
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w = (f07)((c37)o).w;
                zta = (zta)((c37)o).v;
                vt4.g0(x);
            }
            else {
                vt4.g0(x);
                final cof w2 = (cof)this.x;
                ((c37)o).v = (m6n)zta;
                ((c37)o).w = (aof)w2;
                ((c37)o).z = 1;
                w = (f07)w2;
                if (w2.c((f07)o) == v) {
                    return v;
                }
            }
            try {
                final b37 b37 = (b37)this.y;
                ((c37)o).v = null;
                ((c37)o).w = (aof)w;
                ((c37)o).z = 2;
                final Object d = zta.d((Object)b37, o);
                if (d == v) {
                    return v;
                }
                o = w;
                w = (f07)d;
                ((aof)o).g((Object)null);
                return w;
            }
            finally {}
        }
        ((aof)w).g((Object)null);
        throw;
    }
    
    public boolean b() {
        return this.z != null;
    }
    
    public Object b0(final fko fko, final k57 k57, final h07 h07) {
        final z7m z7m = (z7m)this.x;
        return z7m.c.t(z7m.a, z7m.b, (lta)new x7m(z7m, fko, k57, (f07)null), h07);
    }
    
    @Override
    public boolean c() {
        return (boolean)((sd8)this.y).getValue();
    }
    
    public Object c0(final String s, int d, final qrb qrb) {
        final fz6 fz6 = (fz6)this.z;
        final String s2 = (String)this.w;
        final qo4 b = ((d5g)this.y).b;
        d = ge9.D(d);
        final pc7 v = pc7.v;
        final lqo a = lqo.a;
        if (d != 0) {
            if (d != 1) {
                if (d == 2) {
                    b.h.o((Object)fz6, s2, (String)null);
                    return a;
                }
                en9.r();
                return null;
            }
            else {
                final Object v2 = b.v(s2, s, fz6, (h07)qrb);
                if (v2 == v) {
                    return v2;
                }
            }
        }
        else {
            final Object u = b.u(s2, s, fz6, (h07)qrb);
            if (u == v) {
                return u;
            }
        }
        return a;
    }
    
    public Object d(final Class clazz) {
        if (!((Set)this.v).contains((Object)bmi.a(clazz))) {
            fvd.i((Object)clazz, (Object)".", "Attempting to request an undeclared dependency ");
            return null;
        }
        final Object d = ((ie6)this.z).d(clazz);
        if (!clazz.equals(lhi.class)) {
            return d;
        }
        final lhi lhi = (lhi)d;
        return new apj();
    }
    
    public boolean e() {
        final ArrayList list = (ArrayList)this.z;
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (((irg)list.get(i)).a.e()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean f() {
        return (boolean)((sd8)this.v).getValue();
    }
    
    public Set g(final bmi bmi) {
        if (((Set)this.x).contains((Object)bmi)) {
            return ((ie6)this.z).g(bmi);
        }
        fvd.i((Object)bmi, (Object)">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }
    
    public Object get() {
        return new p68((Executor)((gfi)this.v).get(), (o8f)((gfi)this.w).get(), (zn0)((tze)this.x).get(), (a3k)((gfi)this.y).get(), (a3k)((gfi)this.z).get());
    }
    
    public Object getValue() {
        final tcp tcp = (tcp)this.z;
        if (tcp != null) {
            return tcp;
        }
        final c2l c2l = new c2l(((ge6)((g0e)this.w).w).s(), (vcp)((lrc)this.x).a(), (im7)((ge6)((g0e)this.y).w).b());
        final us4 us4 = (us4)this.v;
        final String b = us4.b();
        if (b != null) {
            return this.z = c2l.D(us4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        en9.s("Local and anonymous classes can not be ViewModels");
        return null;
    }
    
    @Override
    public boolean h() {
        return (boolean)((sd8)this.x).getValue();
    }
    
    public hfi i(final Class clazz) {
        return this.v(bmi.a(clazz));
    }
    
    @Override
    public boolean j() {
        return ((oc4)this.z).m1();
    }
    
    @Override
    public boolean k() {
        return ((oc4)this.z).q1();
    }
    
    @Override
    public boolean l() {
        return (boolean)((sd8)this.w).getValue();
    }
    
    @Override
    public boolean m() {
        final oc4 oc4 = (oc4)this.z;
        return oc4.A0() && !oc4.y3.f();
    }
    
    @Override
    public void n() {
        final qno p0 = ((oc4)this.z).P0;
        p0.f = ((Number)p0.a.a()).longValue();
        final apm e = p0.e;
        Object value;
        Object a;
        do {
            value = e.getValue();
            final jno jno = (jno)value;
            if (jno != null) {
                a = jno;
                if (!jno.equals(hno.a)) {
                    continue;
                }
            }
            a = gno.a;
        } while (!e.j(value, a));
        p0.c();
    }
    
    @Override
    public void o(final int n, final ChatEvents$AttachmentSource chatEvents$AttachmentSource) {
        p24 g0 = ((oc4)this.z).G0();
        if (g0 == null) {
            g0 = null;
        }
        if (g0 != null) {
            g0.a.e(n, chatEvents$AttachmentSource);
        }
    }
    
    public float p() {
        return ((Number)((d2d)this.x).getValue()).floatValue();
    }
    
    @Override
    public boolean q() {
        return ((oc4)this.z).w.c;
    }
    
    public hfi r(final bmi bmi) {
        if (((Set)this.y).contains((Object)bmi)) {
            return ((ie6)this.z).r(bmi);
        }
        fvd.i((Object)bmi, (Object)">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }
    
    @Override
    public String s() {
        return ((oc4)this.z).z0();
    }
    
    @Override
    public String t() {
        return ((oc4)this.z).w.b;
    }
    
    @Override
    public Set u() {
        final String s = (String)((oc4)this.z).W0.j.getValue();
        if (s != null) {
            return rml.K((Object)s);
        }
        return (Set)z89.v;
    }
    
    public hfi v(final bmi bmi) {
        if (((Set)this.w).contains((Object)bmi)) {
            return ((ie6)this.z).v(bmi);
        }
        fvd.i((Object)bmi, (Object)">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }
    
    public Object w(final bmi bmi) {
        if (((Set)this.v).contains((Object)bmi)) {
            return ((ie6)this.z).w(bmi);
        }
        fvd.i((Object)bmi, (Object)".", "Attempting to request an undeclared dependency ");
        return null;
    }
    
    @Override
    public boolean x() {
        return ((oc4)this.z).Z2.l;
    }
    
    public float y() {
        return ((Number)((d2d)this.y).getValue()).floatValue();
    }
    
    public void z(final kc0 kc0, final us4 us4) {
        ((ArrayList)this.w).add((Object)new yog((Object)kc0, (Object)us4));
    }
}
