import java.io.OutputStream;
import android.database.Cursor;
import android.os.BaseBundle;
import java.util.AbstractCollection;
import android.os.LocaleList;
import android.os.Trace;
import androidx.startup.StartupException;
import android.os.Bundle;
import java.lang.reflect.Type;
import androidx.compose.ui.node.LayoutNode;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import java.util.Collection;
import java.util.Set;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import java.util.Map$Entry;
import java.util.ArrayList;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import android.util.Log;
import android.util.Base64;
import android.os.PersistableBundle;
import android.app.job.JobInfo$Builder;
import android.app.job.JobInfo;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.Locale;
import com.anthropic.claude.api.chat.messages.ComposerNotice;
import java.io.FileOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import android.content.Context;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;

public final class zn0 implements xv7, n7m, e03, k9m, o5a
{
    public static final byte[] A;
    public static volatile zn0 y;
    public static final Object z;
    public Object v;
    public Object w;
    public Object x;
    
    public zn0(final byte b) {
        switch (b) {
            default: {
                this.x = new wab((byte)26);
                return;
            }
            case 29: {
                this.v = new vee(new avd((byte)19), new avd((byte)20));
                this.w = new x8m();
                this.x = new LinkedHashMap();
                return;
            }
            case 22: {
                this.v = new tmf();
                return;
            }
            case 21: {
                this.v = new j9j((byte)14);
                this.w = new j9j((byte)14);
                this.x = new j9j((byte)14);
                return;
            }
            case 15: {
                this.x = new LinkedHashSet();
                return;
            }
            case 6: {
                this.v = new lyd(16);
                final long[] a = jak.a;
                this.w = new tmf();
                this.x = new wab((byte)26);
            }
        }
    }
    
    public zn0(final k9m v) {
        this.v = v;
        this.w = new zsi(v.c());
        this.x = new xsi(v.m());
    }
    
    public zn0(final lta v, final pv2 w) {
        this.v = v;
        this.w = w;
        this.x = new x8m();
    }
    
    public zn0(final mn2 v) {
        this.v = v;
        final bsl b = csl.b(8, 2, 1);
        this.w = b;
        this.x = ri2.p((ija)mka.a(new ija[] { (ija)new un0((Object)xp7.O(v), (byte)1), (ija)b }), 0);
    }
    
    public static zn0 x(final Context context) {
        if (zn0.y == null) {
            final Object z;
            monitorenter(z = zn0.z);
            Label_0073: {
                try {
                    if (zn0.y == null) {
                        final Object y = new Object();
                        ((zn0)y).x = context.getApplicationContext();
                        ((zn0)y).w = new HashSet();
                        ((zn0)y).v = new HashMap();
                        zn0.y = (zn0)y;
                    }
                    break Label_0073;
                }
                finally {
                    monitorexit(z);
                    monitorexit(z);
                }
            }
        }
        return zn0.y;
    }
    
    public long A() {
        return ((z13)this.x).v.d;
    }
    
    public boolean B() {
        return (((AbstractCollection)((j9j)this.v).w).isEmpty() && ((AbstractCollection)((j9j)this.x).w).isEmpty() && ((AbstractCollection)((j9j)this.w).w).isEmpty()) ^ true;
    }
    
    public boolean C(final String s) {
        final File file = (File)this.x;
        boolean b = false;
        if (file != null) {
            final String name = file.getName();
            name.getClass();
            if (!rym.y0(name, s, false)) {
                final FileOutputStream fileOutputStream = (FileOutputStream)this.w;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                this.w = null;
                this.x = null;
            }
        }
        File x;
        if ((x = (File)this.x) == null) {
            x = new File((File)this.v, s);
            this.x = x;
        }
        if (!x.exists()) {
            x.createNewFile();
            b = true;
        }
        FileOutputStream w;
        if ((w = (FileOutputStream)this.w) == null) {
            w = new FileOutputStream(x, true);
        }
        this.w = w;
        return b;
    }
    
    public int D(final ComposerNotice composerNotice) {
        final String a = composerNotice.a;
        final up8 up8 = (up8)this.v;
        String a3 = null;
        Label_0036: {
            if (up8 != null) {
                final ComposerNotice a2 = up8.a();
                if (a2 != null) {
                    a3 = a2.a;
                    break Label_0036;
                }
            }
            a3 = null;
        }
        if (mlc.q(a3, a)) {
            return 2;
        }
        final yj6 yj6 = (yj6)this.w;
        if (yj6 != null) {
            if (pkq.g(composerNotice).a(yj6) <= 0) {
                return 4;
            }
        }
        final tp8 f = r8r.f(composerNotice);
        if (f instanceof rp8) {
            final up8 a4 = ((rp8)f).a();
            final up8 up9 = (up8)this.v;
            if (up9 != null && pkq.g(composerNotice).a(pkq.g(up9.a())) < 0) {
                return 3;
            }
            this.v = a4;
            return 1;
        }
        else {
            if (f.equals(qp8.a)) {
                final tqd l = uqd.l;
                return 5;
            }
            if (f instanceof sp8) {
                if (((Set)this.x).add((Object)a)) {
                    final sp8 sp8 = (sp8)f;
                    final String e = o47.e(sp8.a());
                    final Locale root = Locale.ROOT;
                    final String lowerCase = e.toLowerCase(root);
                    lowerCase.getClass();
                    final tqd i = uqd.l;
                    final List a5 = adn.a;
                    final SilentException ex = new SilentException("Composer notice dropped as invalid: ".concat(lowerCase));
                    final yog yog = new yog((Object)"reason", (Object)lowerCase);
                    final String lowerCase2 = ((Enum)sp8.b()).name().toLowerCase(root);
                    lowerCase2.getClass();
                    adn.f((Throwable)ex, (String)null, lpl.x, y5e.Z(new yog[] { yog, new yog((Object)"action_style", (Object)lowerCase2) }), lq6.Y("composer_notice_invalid", lowerCase), 18);
                }
                return 5;
            }
            en9.r();
            return 0;
        }
    }
    
    public void E(final yl1 yl1, final int n, final boolean b) {
        final tl1 tl1 = (tl1)this.w;
        final Context context = (Context)this.x;
        final ComponentName componentName = new ComponentName(context, (Class)JobInfoSchedulerService.class);
        final JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        final Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(yl1.a.getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(woh.a(yl1.c)).array());
        final byte[] b2 = yl1.b;
        if (b2 != null) {
            adler32.update(b2);
        }
        final int n2 = (int)adler32.getValue();
        if (!b) {
            for (final JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                final int int1 = ((BaseBundle)jobInfo.getExtras()).getInt("attemptNumber");
                if (jobInfo.getId() == n2) {
                    if (int1 >= n) {
                        c5q.t(yl1, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                    break;
                }
            }
        }
        final SQLiteDatabase c = ((a3k)this.v).c();
        final String a = yl1.a;
        final voh c2 = yl1.c;
        Object extras = c.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] { a, String.valueOf(woh.a(c2)) });
        try {
            Long n3;
            if (((Cursor)extras).moveToNext()) {
                n3 = ((Cursor)extras).getLong(0);
            }
            else {
                n3 = 0L;
            }
            ((Cursor)extras).close();
            final long longValue = n3;
            final JobInfo$Builder jobInfo$Builder = new JobInfo$Builder(n2, componentName);
            jobInfo$Builder.setMinimumLatency(tl1.a(c2, longValue, n));
            extras = ((ul1)tl1.b.get((Object)c2)).c;
            if (((Set)extras).contains((Object)uck.v)) {
                jobInfo$Builder.setRequiredNetworkType(2);
            }
            else {
                jobInfo$Builder.setRequiredNetworkType(1);
            }
            if (((Set)extras).contains((Object)uck.x)) {
                jobInfo$Builder.setRequiresCharging(true);
            }
            if (((Set)extras).contains((Object)uck.w)) {
                jobInfo$Builder.setRequiresDeviceIdle(true);
            }
            extras = new PersistableBundle();
            ((BaseBundle)extras).putInt("attemptNumber", n);
            ((BaseBundle)extras).putString("backendName", a);
            ((BaseBundle)extras).putInt("priority", woh.a(c2));
            final byte[] b3 = yl1.b;
            if (b3 != null) {
                ((BaseBundle)extras).putString("extras", Base64.encodeToString(b3, 0));
            }
            jobInfo$Builder.setExtras((PersistableBundle)extras);
            final long a2 = tl1.a(c2, longValue, n);
            if (Log.isLoggable("TRuntime.JobInfoScheduler", 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { yl1, n2, a2, n3, n });
            }
            jobScheduler.schedule(jobInfo$Builder.build());
        }
        finally {
            ((Cursor)extras).close();
        }
    }
    
    public void F(final String v) {
        if (v != null) {
            this.v = v;
            return;
        }
        fvd.k("Null backendName");
    }
    
    public void G(final x13 c) {
        ((z13)this.x).v.c = c;
    }
    
    public void H(final xc8 a) {
        ((z13)this.x).v.a = a;
    }
    
    public void I(final qzc b) {
        ((z13)this.x).v.b = b;
    }
    
    public void J(final long d) {
        ((z13)this.x).v.d = d;
    }
    
    public void K(final List list) {
        final sad y = sad.y;
        final sad z = sad.z;
        final LinkedHashMap k = zrn.K((lta)mq4.C, list);
        final d28 d = d28.d;
        if (!d28.d.a) {
            final HashSet set = new HashSet();
            final Iterator iterator = ((Iterable)list).iterator();
            while (iterator.hasNext()) {
                set.add(((nyl)iterator.next()).a);
            }
            if (set.size() != list.size()) {
                final StringBuilder sb = new StringBuilder("Configurations must be unique: ");
                final ArrayList list2 = new ArrayList(d86.p0((Iterable)list, 10));
                final Iterator iterator2 = ((Iterable)list).iterator();
                while (iterator2.hasNext()) {
                    list2.add(((nyl)iterator2.next()).a);
                }
                sb.append((Object)list2);
                sb.append('.');
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        final LinkedHashMap i = zrn.K((lta)nq4.C, (List)((jq4)this.x).v);
        final ArrayList list3 = new ArrayList(((Map)k).size());
        for (final Map$Entry map$Entry : k.entrySet()) {
            final vmc vmc = (vmc)map$Entry.getKey();
            final nyl nyl = (nyl)map$Entry.getValue();
            final op4 op4 = (op4)i.get((Object)vmc);
            yog yog;
            if (op4 instanceof mp4) {
                yog = new yog((Object)op4, (Object)nyl.b);
            }
            else if (op4 instanceof np4) {
                final pp4 b = nyl.b;
                final int ordinal = ((Enum)b).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        en9.r();
                        return;
                    }
                    final c2l c2l = (c2l)this.v;
                    final Object a = nyl.a;
                    final np4 np4 = (np4)op4;
                    final mp4 e = r6k.E(c2l, a, np4.b, np4.c, 8);
                    mlc.y(e.d);
                    yog = new yog((Object)e, (Object)b);
                }
                else {
                    yog = new yog((Object)op4, (Object)b);
                }
            }
            else {
                if (op4 != null) {
                    en9.r();
                    return;
                }
                final pp4 b2 = nyl.b;
                final int ordinal2 = ((Enum)b2).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
                        en9.r();
                        return;
                    }
                    final mp4 e2 = r6k.E((c2l)this.v, nyl.a, c5q.K().a(), null, 12);
                    mlc.y(e2.d);
                    yog = new yog((Object)e2, (Object)b2);
                }
                else {
                    yog = new yog((Object)new np4(nyl.a, c5q.K().a(), (SerializableContainer)null), (Object)b2);
                }
            }
            list3.add((Object)yog);
        }
        final Set keySet = k.keySet();
        for (final Map$Entry map$Entry2 : i.entrySet()) {
            final vmc vmc2 = (vmc)map$Entry2.getKey();
            final op4 op5 = (op4)map$Entry2.getValue();
            mp4 mp4;
            if (op5 instanceof mp4) {
                mp4 = (mp4)op5;
            }
            else {
                mp4 = null;
            }
            if (mp4 == null) {
                continue;
            }
            if (keySet.contains((Object)vmc2)) {
                continue;
            }
            mp4.g.e();
            mlc.C(mp4.d);
            mp4.f.a();
        }
        final jq4 jq4 = (jq4)this.x;
        jq4.v.clear();
        for (final yog yog2 : list3) {
            Object o = yog2.v;
            final pp4 pp4 = (pp4)yog2.w;
            final ArrayList v = jq4.v;
            if (o instanceof mp4) {
                final mp4 mp5 = (mp4)o;
                final m38 g = mp5.g;
                final kbd d2 = mp5.d;
                final int ordinal3 = ((Enum)pp4).ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            if (ordinal3 != 3) {
                                en9.r();
                                return;
                            }
                            o = mp5;
                            if (d2.w != z) {
                                g.d();
                                mlc.i0(d2);
                                o = mp5;
                                if (d2.w == y) {
                                    d2.onResume();
                                    o = mp5;
                                }
                            }
                        }
                        else if (((Enum)d2.w).compareTo((Enum)y) < 0) {
                            g.d();
                            mlc.i0(d2);
                            o = mp5;
                        }
                        else {
                            o = mp5;
                            if (((Enum)d2.w).compareTo((Enum)y) > 0) {
                                o = mp5;
                                if (d2.w == z) {
                                    d2.onPause();
                                    o = mp5;
                                }
                            }
                        }
                    }
                    else {
                        o = mp5;
                        if (d2.w != sad.x) {
                            g.e();
                            if (d2.w == z) {
                                d2.onPause();
                            }
                            o = mp5;
                            if (d2.w == y) {
                                d2.a();
                                o = mp5;
                            }
                        }
                    }
                }
                else {
                    final SerializableContainer c = mp5.e.c();
                    mp5.g.e();
                    mlc.C(mp5.d);
                    mp5.f.a();
                    o = new np4(mp5.a, mp5.b, c);
                }
            }
            else if (!(o instanceof np4)) {
                en9.r();
                break;
            }
            v.add(o);
        }
    }
    
    public Object L(Object d) {
        final Object b = ((lta)this.v).b(d);
        final pv2 pv2 = (pv2)this.w;
        final x8m x8m = (x8m)this.x;
        d = pv2.d(x8m.get(b), d);
        ((Map)x8m).put(b, d);
        return d;
    }
    
    public Collection M(final Iterable iterable) {
        final LinkedHashMap z = this.z(iterable);
        ((x8m)this.x).putAll((Map)z);
        return z.values();
    }
    
    public void N(final String s) {
        final FileOutputStream fileOutputStream = (FileOutputStream)this.w;
        if (fileOutputStream != null) {
            final byte[] bytes = s.getBytes(ui3.a);
            bytes.getClass();
            fileOutputStream.write(bytes);
            ((OutputStream)fileOutputStream).flush();
        }
    }
    
    @Override
    public void a() {
        Thread.setDefaultUncaughtExceptionHandler((Thread$UncaughtExceptionHandler)this.x);
        ((AtomicBoolean)this.w).set(false);
    }
    
    @Override
    public nam c() {
        return (nam)this.w;
    }
    
    @Override
    public void cancel() {
        ((k9m)this.v).cancel();
    }
    
    @Override
    public boolean d(final oi9 oi9, final Object o, final int n) {
        final byte[] g = x90.G((vzk)this.v, o, ((tjc)this.x).v());
        boolean b = false;
        if (g == null) {
            return false;
        }
        qpi qpi;
        if (o instanceof jcp) {
            final jcp jcp = (jcp)o;
            final hcp j = jcp.j;
            if (j.X != null) {
                b = true;
            }
            byte[] array;
            if ((array = x90.G((vzk)this.w, new j0k(j.a, jcp.s.e, Boolean.valueOf(b)), ((tjc)this.x).v())) == null) {
                array = zn0.A;
            }
            qpi = new qpi(g, array);
        }
        else {
            qpi = new qpi(g);
        }
        synchronized (this) {
            final boolean a = oi9.a(qpi);
            if (a && o instanceof jcp) {
                ((tjc)this.x).s(g);
            }
            return a;
        }
    }
    
    @Override
    public void f(final Context context) {
        this.x = Thread.getDefaultUncaughtExceptionHandler();
        final lx7 defaultUncaughtExceptionHandler = new lx7((hx7)this.v, context);
        defaultUncaughtExceptionHandler.x = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler((Thread$UncaughtExceptionHandler)defaultUncaughtExceptionHandler);
        ((AtomicBoolean)this.w).set(true);
    }
    
    public void g(int d, final LayoutNode layoutNode) {
        final j9j j9j = (j9j)this.v;
        final j9j j9j2 = (j9j)this.w;
        final j9j j9j3 = (j9j)this.x;
        d = ge9.D(d);
        if (d == 0) {
            j9j.m(layoutNode);
            j9j3.m(layoutNode);
            return;
        }
        if (d == 1) {
            j9j2.m(layoutNode);
            j9j3.m(layoutNode);
            return;
        }
        if (d != 2) {
            if (d != 3) {
                en9.r();
                return;
            }
            if (layoutNode.D != null) {
                j9j3.m(layoutNode);
                return;
            }
            j9j2.m(layoutNode);
        }
        else {
            if (layoutNode.D != null) {
                j9j3.m(layoutNode);
                return;
            }
            j9j.m(layoutNode);
        }
    }
    
    @Override
    public String getName() {
        return "crash";
    }
    
    public void h(final n47 n47) {
        switch (o47.l(n47)) {
            default: {
                en9.r();
                return;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                ((bsl)this.w).k((Object)n47);
                return;
            }
            case 0: {
                ((stk)this.v).e((Object)((i47)n47).a());
            }
        }
    }
    
    public void i(final dj6 dj6, final ComposerNotice composerNotice) {
        final int v = ju4.v((Object)dj6);
        if (v != 0) {
            if (v == 1) {
                final yj6 g = pkq.g(composerNotice);
                final yj6 yj6 = (yj6)this.w;
                yj6 w = g;
                if (yj6 != null) {
                    w = (yj6)ncq.k((Comparable)yj6, (Comparable)g);
                }
                this.w = w;
                final up8 up8 = (up8)this.v;
                String a2 = null;
                Label_0084: {
                    if (up8 != null) {
                        final ComposerNotice a = up8.a();
                        if (a != null) {
                            a2 = a.a;
                            break Label_0084;
                        }
                    }
                    a2 = null;
                }
                if (mlc.q(a2, composerNotice.a)) {
                    this.v = null;
                }
            }
            else {
                en9.r();
            }
        }
    }
    
    @Override
    public Type j() {
        return (Type)this.v;
    }
    
    @Override
    public float k(final float n, final float n2) {
        return 0.0f;
    }
    
    @Override
    public Object l(final f7g f7g) {
        return new rj0((c03)f7g, (Type)this.v, (fu4)this.w, (zta)this.x);
    }
    
    @Override
    public vzl m() {
        return (vzl)this.x;
    }
    
    public yl1 n() {
        String s;
        if (this.v == null) {
            s = " backendName";
        }
        else {
            s = "";
        }
        String concat = s;
        if (this.x == null) {
            concat = s.concat(" priority");
        }
        if (concat.isEmpty()) {
            return new yl1((String)this.v, (byte[])this.w, (voh)this.x);
        }
        en9.q("Missing required properties:".concat(concat));
        return null;
    }
    
    public boolean o(final LayoutNode layoutNode) {
        final boolean b = layoutNode.D == null;
        final boolean b2 = ((AbstractCollection)((j9j)this.v).w).contains((Object)layoutNode) || ((AbstractCollection)((j9j)this.w).w).contains((Object)layoutNode);
        return !b && b2;
    }
    
    public void p() {
        final vee vee = (vee)this.v;
        final tqd l = uqd.l;
        final Iterator iterator = c86.s1((Iterable)((x8m)vee.e).x).iterator();
        while (iterator.hasNext()) {
            final Object c = vee.C((String)iterator.next());
            if (c != null) {
                ((avd)vee.d).b(c);
            }
        }
        ((x8m)this.w).clear();
        ((LinkedHashMap)this.x).clear();
    }
    
    @Override
    public float q(final float n) {
        final m30 m30 = (m30)this.v;
        final float f = m30.f();
        Object o = ri2.v(m30.c(), f, n, (lta)this.w, (jta)this.x);
        if (!(boolean)m30.a.b(o)) {
            o = m30.h.getValue();
        }
        return m30.c().f(o) - f;
    }
    
    public void r(final Bundle bundle) {
        final HashSet set = (HashSet)this.w;
        final String string = ((Context)this.x).getString(2131755131);
        if (bundle != null) {
            try {
                final HashSet set2 = new HashSet();
                for (final String className : ((BaseBundle)bundle).keySet()) {
                    if (string.equals((Object)((BaseBundle)bundle).getString(className, (String)null))) {
                        final Class<?> forName = Class.forName(className);
                        if (!y9c.class.isAssignableFrom(forName)) {
                            continue;
                        }
                        set.add((Object)forName);
                    }
                }
                final Iterator iterator2 = set.iterator();
                while (iterator2.hasNext()) {
                    this.s((Class)iterator2.next(), set2);
                }
            }
            catch (final ClassNotFoundException ex) {
                throw new StartupException((Throwable)ex);
            }
        }
    }
    
    public Object s(final Class clazz, final HashSet set) {
        final HashMap hashMap = (HashMap)this.v;
        Label_0044: {
            if (!omo.P()) {
                break Label_0044;
            }
            try {
                String s = clazz.getSimpleName();
                if (s.length() > 127) {
                    s = s.substring(0, 127);
                }
                Trace.beginSection(s);
                if (!set.contains((Object)clazz)) {
                    if (!hashMap.containsKey((Object)clazz)) {
                        set.add((Object)clazz);
                        try {
                            final y9c y9c = (y9c)clazz.getDeclaredConstructor((Class[])null).newInstance((Object[])null);
                            final List a = y9c.a();
                            if (!a.isEmpty()) {
                                for (final Class clazz2 : a) {
                                    if (!hashMap.containsKey((Object)clazz2)) {
                                        this.s(clazz2, set);
                                    }
                                }
                            }
                            final Object b = y9c.b((Context)this.x);
                            set.remove((Object)clazz);
                            hashMap.put((Object)clazz, b);
                            return;
                        }
                        finally {
                            final Throwable t;
                            throw new StartupException(t);
                        }
                    }
                    return hashMap.get((Object)clazz);
                }
                final String name = clazz.getName();
                final StringBuilder sb = new StringBuilder("Cannot initialize ");
                sb.append(name);
                sb.append(". Cycle detected.");
                throw new IllegalStateException(sb.toString());
            }
            finally {
                Trace.endSection();
            }
        }
    }
    
    public x13 t() {
        return ((z13)this.x).v.c;
    }
    
    public ArrayList u() {
        final ArrayList v = ((jq4)this.x).v;
        final ArrayList list = new ArrayList(d86.p0((Iterable)v, 10));
        for (final op4 op4 : v) {
            final Object a = op4.a();
            Object o;
            if (a != null) {
                o = new fp4(op4.c(), a, op4.getKey());
            }
            else {
                o = new gp4(op4.c(), op4.getKey());
            }
            list.add(o);
        }
        return list;
    }
    
    public jpd v() {
        final LocaleList default1 = LocaleList.getDefault();
        final wab wab;
        monitorenter(wab = (wab)this.x);
        Label_0143: {
            Object o;
            try {
                o = this.w;
                if (o != null && default1 == this.v) {
                    monitorexit(wab);
                    return (jpd)o;
                }
                final int size = default1.size();
                o = new ArrayList(size);
                for (int i = 0; i < size; ++i) {
                    ((ArrayList)o).add((Object)new hpd(default1.get(i)));
                }
            }
            finally {
                break Label_0143;
            }
            final jpd w = new jpd((List)o);
            final Throwable v;
            this.v = v;
            this.w = w;
            monitorexit(wab);
            return w;
        }
        monitorexit(wab);
    }
    
    public xc8 w() {
        return ((z13)this.x).v.a;
    }
    
    public qzc y() {
        return ((z13)this.x).v.b;
    }
    
    public LinkedHashMap z(final Iterable iterable) {
        final g3h c = ((x8m)this.x).g().c;
        final lta lta = (lta)this.v;
        int v;
        if ((v = z5e.V(d86.p0(iterable, 10))) < 16) {
            v = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(v);
        for (final Object next : iterable) {
            ((Map)linkedHashMap).put(lta.b(next), ((pv2)this.w).d(((Map)c).get(lta.b(next)), next));
        }
        return linkedHashMap;
    }
}
