import com.segment.analytics.kotlin.core.c;
import com.anthropic.claude.db.ClaudeDatabase;
import java.io.OutputStream;
import java.util.List;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonElement;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.io.InputStream;
import java.io.File;
import java.util.concurrent.CancellationException;
import java.io.FileInputStream;
import java.util.Map;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.AccountId;
import java.util.Iterator;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import com.segment.analytics.kotlin.core.b;
import com.segment.analytics.kotlin.core.Settings;
import java.io.Serializable;

public final class l10 extends m6n implements zta
{
    public Object A;
    public final Object B;
    public final byte w;
    public byte x;
    public Object y;
    public Object z;
    
    public l10(final Settings z, final s10 b, final f07 f07) {
        this.w = 11;
        this.z = z;
        this.B = b;
        super(2, f07);
    }
    
    public l10(final quj a, final f07 f07, final lta b) {
        this.w = 2;
        this.A = a;
        this.B = b;
        super(2, f07);
    }
    
    private final Object r(final Object o) {
        final s10 a = (s10)this.B;
        final tze w = a.w;
        final byte x = this.x;
        final pc7 v = pc7.v;
        Label_0240: {
            Settings settings;
            s10 s11;
            if (x != 0) {
                if (x != 1) {
                    if (x == 2) {
                        vt4.g0(o);
                        break Label_0240;
                    }
                    if (x == 3) {
                        vt4.g0(o);
                        return lqo.a;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    settings = (Settings)this.y;
                    final s10 s10 = (s10)this.A;
                    vt4.g0(o);
                    s11 = s10;
                }
            }
            else {
                vt4.g0(o);
                final Settings settings2 = (Settings)this.z;
                if (settings2 == null) {
                    break Label_0240;
                }
                final StringBuilder sb = new StringBuilder("Dispatching update settings on ");
                sb.append(Thread.currentThread().getName());
                uuj.z0(3, sb.toString());
                final xtm xtm = (xtm)w.w;
                final q7n q7n = new q7n((byte)1);
                q7n.b = settings2;
                final us4 a2 = v4j.a((Class)s7n.class);
                this.A = a;
                this.y = settings2;
                this.x = 1;
                s11 = a;
                settings = settings2;
                if (xtm.b((qa)q7n, a2, (h07)this) == v) {
                    return v;
                }
            }
            this.A = null;
            this.y = null;
            this.x = 2;
            if (b.b(s11, settings, (h07)this) == v) {
                return v;
            }
        }
        final xtm xtm2 = (xtm)w.w;
        final r7n r7n = new r7n((byte)1, true);
        final us4 a3 = v4j.a((Class)s7n.class);
        this.x = 3;
        if (xtm2.b((qa)r7n, a3, (h07)this) != v) {
            return lqo.a;
        }
        return v;
    }
    
    @Override
    public final f07 create(final Object a, final f07 f07) {
        final byte w = this.w;
        final Object b = this.B;
        switch (w) {
            default: {
                final l10 l10 = new l10((byte)12, f07, (Serializable)this.A, this.z, b);
                l10.y = a;
                return l10;
            }
            case 11: {
                return new l10((Settings)this.z, (s10)b, f07);
            }
            case 10: {
                final l10 l11 = new l10((byte)10, f07, (Serializable)this.A, this.z, b);
                l11.y = a;
                return l11;
            }
            case 9: {
                return new l10(this.A, b, f07, (byte)9);
            }
            case 8: {
                return new l10(this.A, b, f07, (byte)8);
            }
            case 7: {
                return new l10((byte)7, f07, (Serializable)this.A, this.z, b);
            }
            case 6: {
                final l10 l12 = new l10(this.A, b, f07, (byte)6);
                l12.z = a;
                return l12;
            }
            case 5: {
                return new l10(this.y, this.z, this.A, this.B, f07, (byte)5);
            }
            case 4: {
                return new l10((byte)4, f07, b);
            }
            case 3: {
                return new l10(this.y, this.z, this.A, b, f07, (byte)3);
            }
            case 2: {
                final l10 l13 = new l10((quj)this.A, f07, (lta)b);
                l13.z = a;
                return l13;
            }
            case 1: {
                final l10 l14 = new l10((byte)1, f07, b);
                l14.A = a;
                return l14;
            }
            case 0: {
                return new l10((byte)0, f07, b);
            }
        }
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final pc7 v = pc7.v;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
                return v;
            }
            case 11: {
                return ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 10: {
                return ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 9: {
                return ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 8: {
                return ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 7: {
                return ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 6: {
                ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
                return v;
            }
            case 5: {
                return ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 4: {
                return ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 3: {
                return ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 2: {
                return ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 1: {
                return ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((l10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    @Override
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final int n = 0;
        final Object o2 = null;
        final Object o3 = null;
        final Object o4 = null;
        Object a = null;
        vn6 v = null;
        final Object o5 = null;
        final Object o6 = null;
        final lqo lqo = null;
        final Object o7 = null;
        Settings settings = null;
        Object o8 = null;
        switch (w) {
            default: {
                final int[] array = (int[])this.A;
                final dho dho = (dho)this.z;
                final pc7 v2 = pc7.v;
                int x = this.x;
                Label_0221: {
                    if (x == 0) {
                        break Label_0221;
                    }
                    Label_0199: {
                        if (x == 1) {
                            break Label_0199;
                        }
                        Label_0180: {
                            if (x == 2) {
                                break Label_0180;
                            }
                            if (x != 3) {
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return o8;
                            }
                            try {
                                vt4.g0(o);
                                o = new RuntimeException();
                                throw o;
                            }
                            finally {
                                while (true) {
                                    final h5g h5g = (h5g)dho.h;
                                    final ReentrantLock a2 = h5g.a;
                                    a2.lock();
                                    Label_0653: {
                                        boolean b = false;
                                    Label_0627:
                                        while (true) {
                                            try {
                                                final int length = array.length;
                                                b = false;
                                                x = n;
                                                if (x >= length) {
                                                    break Label_0627;
                                                }
                                                if (h5g.b[array[x]]-- == 1L) {
                                                    h5g.d = true;
                                                    b = true;
                                                }
                                            }
                                            finally {
                                                break Label_0653;
                                            }
                                            ++x;
                                            continue;
                                        }
                                        if (!b && !h5g.d) {
                                            final boolean f = h5g.f;
                                        }
                                        a2.unlock();
                                        throw;
                                    }
                                    a2.unlock();
                                }
                                return null;
                                final jja jja = (jja)this.y;
                                vt4.g0(o);
                                jja y = jja;
                                final jja y2;
                                Block_107: {
                                    while (true) {
                                        while (true) {
                                            Label_0466: {
                                                break Label_0466;
                                                final boolean b3;
                                                final h5g h5g2;
                                                final boolean b2 = b3 || h5g2.d || h5g2.f;
                                                ((ReentrantLock)o).unlock();
                                                y = y2;
                                                iftrue(Label_0466:)(!b2);
                                                break Block_107;
                                            }
                                            final Object o10 = new Object();
                                            final v2b v2b = (v2b)dho.i;
                                            final l33 l33 = new l33((b4j)o10, (Object)y, (Object)this.B, (Object)array, (byte)4);
                                            this.y = null;
                                            this.x = 3;
                                            v2b.m(l33, (h07)this);
                                            return v2;
                                            vt4.g0(o);
                                            final jja jja2 = (jja)this.y;
                                            final h5g h5g2 = (h5g)dho.h;
                                            o = h5g2.a;
                                            ((ReentrantLock)o).lock();
                                            try {
                                                final int length2 = array.length;
                                                x = 0;
                                                boolean b3 = false;
                                                if (x >= length2) {
                                                    continue;
                                                }
                                                if (h5g2.b[array[x]]++ == 0L) {
                                                    h5g2.d = true;
                                                    b3 = true;
                                                }
                                            }
                                            finally {
                                                break Label_0221;
                                            }
                                            break;
                                        }
                                        Label_0321: {
                                            break Label_0321;
                                            while (true) {
                                                final Object o11;
                                                final hc7 hc7 = (hc7)o11;
                                                final khn khn = new khn((byte)5, (f07)null, (Object)dho);
                                                this.y = y;
                                                this.x = 2;
                                                iftrue(Label_0466:)(rhc.f0(hc7, (zta)khn, this) != v2);
                                                o9 = v2;
                                                return o9;
                                                final jja jja3 = (jja)this.y;
                                                vt4.g0(o);
                                                o11 = o;
                                                y = jja3;
                                                continue;
                                            }
                                        }
                                        ++x;
                                        continue;
                                    }
                                }
                                final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)dho.b;
                                this.y = y2;
                                this.x = 1;
                                final hc7 e = xp7.E((WorkDatabase)workDatabase_Impl, false, this);
                                y = y2;
                                Object o11;
                                iftrue(Label_0417:)((o11 = e) != v2);
                                return v2;
                            }
                        }
                    }
                }
                ((ReentrantLock)o).unlock();
                break;
            }
            case 11: {
                return this.r(o);
            }
            case 10: {
                final AtomicReference atomicReference = (AtomicReference)this.A;
                final pc7 v3 = pc7.v;
                final byte x2 = this.x;
                Label_0756: {
                    if (x2 == 0) {
                        break Label_0756;
                    }
                    Label_0737: {
                        if (x2 == 1) {
                            break Label_0737;
                        }
                        Label_0726: {
                            if (x2 != 2) {
                                break Label_0726;
                            }
                            Object o12 = a = this.y;
                            try {
                                vt4.g0(o);
                            Label_0723:
                                while (!atomicReference.compareAndSet(o12, (Object)null)) {
                                    if (atomicReference.get() != o12) {
                                        return o;
                                    }
                                }
                                return o;
                                a = this.y;
                                vt4.g0(o);
                                Object o13 = a;
                                Label_0845:
                                a = o13;
                                final zta zta = (zta)this.B;
                                a = o13;
                                final Object b4 = ((qcl)o13).b;
                                a = o13;
                                this.y = o13;
                                a = o13;
                                this.x = 2;
                                a = o13;
                                final Object d = zta.d(b4, this);
                                o12 = o13;
                                iftrue(Label_0723:)((o = d) != v3);
                                return v3;
                                while (true) {
                                    a = ((qcl)a).a;
                                    this.y = o13;
                                    this.x = 1;
                                    iftrue(Label_0845:)(x90.p((opc)a, this) != v3);
                                    return v3;
                                    en9.q("call to 'resume' before 'invoke' with coroutine");
                                    o = o2;
                                    return o;
                                    o = v3;
                                    return o;
                                    vt4.g0(o);
                                    final oc7 oc7 = (oc7)this.y;
                                    o13 = new qcl(x90.x(oc7.getCoroutineContext()), ((lta)this.z).b(oc7));
                                    a = atomicReference.getAndSet(o13);
                                    iftrue(Label_0845:)(a == null);
                                    continue;
                                }
                            }
                            finally {
                                while (!atomicReference.compareAndSet(a, (Object)null) && atomicReference.get() == a) {}
                            }
                        }
                    }
                }
            }
            case 9: {
                final pc7 v4 = pc7.v;
                final byte x3 = this.x;
                Throwable t2 = null;
                Label_1159: {
                    zta zta2;
                    if (x3 != 0) {
                        if (x3 != 1) {
                            if (x3 == 2) {
                                final aof aof = (aof)this.y;
                                try {
                                    vt4.g0(o);
                                }
                                finally {
                                    o = aof;
                                    break Label_1159;
                                }
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            o = o3;
                            return o;
                        }
                        zta2 = (zta)this.z;
                        final aof aof2 = (aof)this.y;
                        vt4.g0(o);
                        o = aof2;
                    }
                    else {
                        vt4.g0(o);
                        o = this.A;
                        zta2 = (zta)this.B;
                        this.y = o;
                        this.z = zta2;
                        this.x = 1;
                        if (((cof)o).c((f07)this) == v4) {
                            break Label_1159;
                        }
                    }
                    try {
                        final xs7 xs7 = new xs7(zta2, (f07)null, (byte)4);
                        this.y = o;
                        this.z = null;
                        this.x = 2;
                        if (ien.m((f07)this, (zta)xs7) == v4) {
                            o = v4;
                        }
                        else {
                            ((aof)o).g((Object)null);
                            o = lqo.a;
                        }
                        return o;
                    }
                    finally {
                        final Throwable t3;
                        t2 = t3;
                    }
                }
                ((aof)o).g((Object)null);
                throw t2;
            }
            case 8: {
                final Object v5 = pc7.v;
                final byte x4 = this.x;
                Object o14 = null;
                Label_1385: {
                    lta lta;
                    if (x4 != 0) {
                        if (x4 != 1) {
                            if (x4 == 2) {
                                Object b5 = this.y;
                                try {
                                    vt4.g0(o);
                                    b5 = o;
                                }
                                finally {
                                    o14 = b5;
                                    break Label_1385;
                                }
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            o = o4;
                            return o;
                        }
                        lta = (lta)this.z;
                        final aof aof3 = (aof)this.y;
                        vt4.g0(o);
                        o = aof3;
                    }
                    else {
                        vt4.g0(o);
                        o = this.A;
                        lta = (lta)this.B;
                        this.y = o;
                        this.z = lta;
                        this.x = 1;
                        if (((aof)o).c((f07)this) == v5) {
                            break Label_1385;
                        }
                    }
                    try {
                        this.y = o;
                        this.z = null;
                        this.x = 2;
                        final Object b5;
                        if ((b5 = lta.b(this)) == v5) {
                            o = v5;
                        }
                        else {
                            ((aof)o).g((Object)null);
                            o = b5;
                        }
                        return o;
                    }
                    finally {
                        o14 = o;
                        final Throwable t4;
                        o = t4;
                    }
                }
                ((aof)o14).g((Object)null);
                throw o;
            }
            case 7: {
                final String s = (String)this.A;
                final ili ili = (ili)this.z;
                final pc7 v6 = pc7.v;
                final byte x5 = this.x;
                Iterator iterator2;
                if (x5 != 0) {
                    if (x5 != 1) {
                        if (x5 == 2) {
                            vt4.g0(o);
                            return lqo.a;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return a;
                    }
                    else {
                        final Iterator iterator = (Iterator)this.y;
                        vt4.g0(o);
                        iterator2 = iterator;
                    }
                }
                else {
                    vt4.g0(o);
                    iterator2 = ili.b.j().iterator();
                }
                while (iterator2.hasNext()) {
                    final String a4 = ((AccountId)iterator2.next()).a;
                    if (!mlc.q(a4, s)) {
                        final SharedPreferences m = smk.m("account_prefs", a4, ili.f.getApplicationContext(), 0);
                        Object o15;
                        if ((o15 = m.getAll()) == null) {
                            o15 = s89.v;
                        }
                        final Iterable iterable = (Iterable)((Map)o15).keySet();
                        final ArrayList list = new ArrayList();
                        for (final Object next : iterable) {
                            final String s2 = (String)next;
                            if (!mlc.q(s2, "conway_saved_client_id")) {
                                s2.getClass();
                                if (!rym.E0(s2, "conway_composer_draft_", false) && !rym.E0(s2, "conway_viewing_fork_", false) && !rym.E0(s2, "conway_send_outbox_", false)) {
                                    continue;
                                }
                            }
                            list.add(next);
                        }
                        if (!list.isEmpty()) {
                            final SharedPreferences$Editor edit = m.edit();
                            edit.getClass();
                            final Iterator iterator4 = list.iterator();
                            while (iterator4.hasNext()) {
                                edit.remove((String)iterator4.next());
                            }
                            edit.apply();
                        }
                        String string = m.getString("selected_org_id", (String)null);
                        if (string == null) {
                            string = null;
                        }
                        Object o16;
                        if (string != null) {
                            o16 = new OrganizationId(string);
                        }
                        else {
                            o16 = null;
                        }
                        final ksg q = o50.Q(o16);
                        o50.Q(m.getString("display_email", (String)null));
                        final OrganizationId organizationId = (OrganizationId)q.getValue();
                        String a5;
                        if (organizationId != null) {
                            a5 = organizationId.a;
                        }
                        else {
                            a5 = null;
                        }
                        if (a5 == null) {
                            final List a6 = adn.a;
                            adn.e(6, "PushManager: no org for non-active account; skipping", (String)null, (Map)null);
                        }
                        else {
                            this.y = iterator2;
                            this.x = 1;
                            if (ili.a(a4, a5, (h07)this) == v6) {
                                return v6;
                            }
                            continue;
                        }
                    }
                }
                final String s3 = (String)this.B;
                this.y = null;
                this.x = 2;
                if (ili.a(s, s3, (h07)this) == v6) {
                    return v6;
                }
                return lqo.a;
            }
            case 6: {
                final pc7 v7 = pc7.v;
                final byte x6 = this.x;
                while (true) {
                    Object y3 = null;
                    oc7 z = null;
                    Label_2151: {
                        oc7 z2;
                        if (x6 != 0) {
                            if (x6 == 1) {
                                y3 = this.y;
                                z = (oc7)this.z;
                                vt4.g0(o);
                                break Label_2151;
                            }
                            if (x6 != 2) {
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return v;
                            }
                            final y3j y3j = (y3j)this.y;
                            z2 = (oc7)this.z;
                            vt4.g0(o);
                            o = y3j;
                        }
                        else {
                            vt4.g0(o);
                            z2 = (oc7)this.z;
                            o = new Object();
                            ((y3j)o).v = 1.0f;
                        }
                        final fd0 fd0 = new fd0((Object)this.A, (Object)this.B, o, (Object)z2, (byte)8);
                        this.z = z2;
                        this.y = o;
                        this.x = 1;
                        y3 = o;
                        z = z2;
                        if (soh.b0((lta)fd0, this) == v7) {
                            return v7;
                        }
                    }
                    o = y3;
                    oc7 z2 = z;
                    if (((y3j)y3).v != 0.0f) {
                        continue;
                    }
                    final n6k a7 = ljq.a0((jta)new h87((Object)z, (byte)20));
                    final y8c y8c = new y8c();
                    this.z = z;
                    this.y = y3;
                    this.x = 2;
                    o = y3;
                    z2 = z;
                    if (vt4.A((ija)a7, (zta)y8c, this) != v7) {
                        continue;
                    }
                    break;
                }
                return v7;
            }
            case 5: {
                final ija ija = (ija)this.z;
                final ymf ymf = (ymf)this.A;
                final pc7 v8 = pc7.v;
                final byte x7 = this.x;
                Label_2305: {
                    if (x7 != 0) {
                        if (x7 != 1) {
                            if (x7 == 2) {
                                vt4.g0(o);
                                break Label_2305;
                            }
                            if (x7 != 3) {
                                if (x7 != 4) {
                                    en9.q("call to 'resume' before 'invoke' with coroutine");
                                    return o5;
                                }
                            }
                        }
                        vt4.g0(o);
                        return lqo.a;
                    }
                    vt4.g0(o);
                    final cul cul = (cul)this.y;
                    if (cul == bul.a) {
                        this.x = 1;
                        if (ija.a((jja)ymf, (f07)this) == v8) {
                            return v8;
                        }
                        return lqo.a;
                    }
                    else if (cul == bul.b) {
                        final u1n h = ((h3)ymf).h();
                        final m6n m6n = new m6n(2, null);
                        this.x = 2;
                        if (vt4.A((ija)h, (zta)m6n, this) == v8) {
                            return v8;
                        }
                    }
                    else {
                        final ija u = soh.u(cul.d(((h3)ymf).h()));
                        final kd0 kd0 = new kd0(ija, ymf, this.B, null, (byte)2);
                        this.x = 4;
                        if (x90.r(u, kd0, this) == v8) {
                            return v8;
                        }
                        return lqo.a;
                    }
                }
                this.x = 3;
                if (ija.a((jja)ymf, (f07)this) != v8) {
                    return lqo.a;
                }
                return v8;
                a8 = lqo.a;
                return a8;
            }
            case 4: {
                final pc7 v9 = pc7.v;
                final byte x8 = this.x;
                Label_2615: {
                    if (x8 == 0) {
                        break Label_2615;
                    }
                    Label_2574: {
                        if (x8 == 1) {
                            break Label_2574;
                        }
                        Label_2563: {
                            if (x8 != 2) {
                                break Label_2563;
                            }
                            en2 a9 = (en2)this.A;
                            final xd3 xd3 = (xd3)this.z;
                            wn9 wn9 = (wn9)this.y;
                            xd3 xd4 = xd3;
                            Label_2904: {
                                try {
                                    vt4.g0(o);
                                    o = xd3;
                                    Label_2555: {
                                        break Label_2904;
                                    }
                                }
                                finally {
                                    try {}
                                    finally {
                                        final Throwable t5;
                                        vt4.s(xd4, t5);
                                    }
                                    return v9;
                                Label_2655:
                                    while (true) {
                                        File file = null;
                                        Object o18 = null;
                                        boolean a10;
                                        Object z3;
                                        Object a11;
                                        Iterator iterator5;
                                        en2 a12;
                                        Object b6;
                                        String s4 = null;
                                        zn0 w2;
                                        String s5;
                                        s10 a13;
                                        d58 w3;
                                        pn pn;
                                        nbb y4;
                                        OutputStream x9;
                                        StringBuilder sb;
                                        Label_3031:Label_3210_Outer:Label_2931_Outer:Block_136_Outer:
                                        while (true) {
                                            while (true) {
                                            Label_2931:
                                                while (true) {
                                                Block_138:
                                                    while (true) {
                                                        while (true) {
                                                            o18 = new FileInputStream(file);
                                                            break Label_3031;
                                                            iftrue(Label_2931:)(!a10);
                                                            break Block_138;
                                                            Label_3283: {
                                                                ((xd3)z3).g((CancellationException)null);
                                                            }
                                                            a11 = lqo.a;
                                                            return a11;
                                                            iftrue(Label_3276:)(!iterator5.hasNext());
                                                            Block_134: {
                                                                break Block_134;
                                                                this.y = wn9;
                                                                this.z = o;
                                                                this.A = a12;
                                                                this.x = 1;
                                                                b6 = a12.b((f07)this);
                                                                iftrue(Label_2710:)(b6 != v9);
                                                                return v9;
                                                                iterator5 = rhc.J(wn9.a.c().a(5)).iterator();
                                                                continue Label_2931;
                                                            }
                                                            s4 = (String)iterator5.next();
                                                            w2 = ((ntm)wn9.a.c()).w;
                                                            file = new File(s4);
                                                            iftrue(Label_3028:)(!file.exists());
                                                            continue Label_3210_Outer;
                                                        }
                                                        Label_2710: {
                                                            a9 = a12;
                                                        }
                                                        z3 = o;
                                                        while (true) {
                                                            break Label_2717;
                                                            en9.q("call to 'resume' before 'invoke' with coroutine");
                                                            a11 = o6;
                                                            return a11;
                                                            a11 = v9;
                                                            return a11;
                                                            iftrue(Label_3283:)(!(boolean)b6);
                                                            s5 = (String)a9.c();
                                                            a13 = wn9.a;
                                                            o = new StringBuilder();
                                                            ((StringBuilder)o).append("Segment.io");
                                                            ((StringBuilder)o).append(" performing flush");
                                                            uuj.z0(3, ((StringBuilder)o).toString());
                                                            w3 = d58.w;
                                                            pn = new pn((byte)12, null, wn9);
                                                            this.y = wn9;
                                                            this.z = z3;
                                                            this.A = a9;
                                                            this.x = 2;
                                                            o = z3;
                                                            xd4 = (xd3)z3;
                                                            iftrue(Label_2555:)(rhc.f0((hc7)w3, pn, this) != v9);
                                                            return v9;
                                                            a9 = (en2)this.A;
                                                            z3 = this.z;
                                                            wn9 = (wn9)this.y;
                                                            vt4.g0(o);
                                                            b6 = o;
                                                            continue Block_136_Outer;
                                                        }
                                                        vt4.g0(o);
                                                        wn9 = (wn9)this.B;
                                                        o = wn9.e;
                                                        o.getClass();
                                                        a12 = new en2((mn2)o);
                                                        continue Label_2655;
                                                        Label_3114: {
                                                            try {
                                                                y4 = wn9.f.Y(wn9.c);
                                                                x9 = y4.x;
                                                                if (x9 != null) {
                                                                    r6k.j((InputStream)o18, x9);
                                                                    ((InputStream)o18).close();
                                                                    y4.x.close();
                                                                    y4.close();
                                                                }
                                                                break Label_3114;
                                                            }
                                                            catch (final Exception ex) {
                                                                ifc.w(wn9.a, (Throwable)ex);
                                                                a10 = wn9.a(ex, s4);
                                                                sb = new StringBuilder();
                                                                sb.append("Segment.io");
                                                                sb.append(" uploaded ");
                                                                sb.append(s4);
                                                                uuj.z0(3, sb.toString());
                                                                a10 = true;
                                                            }
                                                        }
                                                        continue Label_2931_Outer;
                                                    }
                                                    ((ntm)wn9.a.c()).getClass();
                                                    try {
                                                        new File(s4).delete();
                                                    }
                                                    catch (final Exception ex2) {
                                                        ifc.x((Throwable)ex2);
                                                    }
                                                    continue Label_2931;
                                                }
                                                iftrue(Label_2931:)(o18 == null);
                                                continue;
                                            }
                                            Label_3028: {
                                                o18 = null;
                                            }
                                            continue Label_3031;
                                        }
                                        Label_3276: {
                                            a12 = a9;
                                        }
                                        continue Label_2655;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            case 3: {
                final ClaudeDatabase a14 = ((xw7)this.y).a;
                final lqo a15 = lqo.a;
                final pc7 v10 = pc7.v;
                final byte x10 = this.x;
                Label_3537: {
                    Label_3463: {
                        if (x10 != 0) {
                            if (x10 == 1) {
                                vt4.g0(o);
                                break Label_3463;
                            }
                            if (x10 == 2) {
                                vt4.g0(o);
                                break Label_3537;
                            }
                            if (x10 != 3) {
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return lqo;
                            }
                            vt4.g0(o);
                        }
                        else {
                            vt4.g0(o);
                            final ix2 i = a14.l();
                            final ArrayList list2 = (ArrayList)this.z;
                            this.x = 1;
                            o = ljq.R(this, new o10(i, list2, null, (byte)5), i.a, false, true);
                            if (o != v10) {
                                o = a15;
                            }
                            if (o == v10) {
                                return v10;
                            }
                            break Label_3463;
                        }
                        return a15;
                    }
                    final ozh o20 = a14.o();
                    final qzh qzh = (qzh)this.A;
                    final ArrayList list3 = (ArrayList)this.B;
                    this.x = 2;
                    o = ljq.Q(o20.a, new pw1(o20, qzh, list3, null, (byte)4), this);
                    if (o != v10) {
                        o = a15;
                    }
                    if (o == v10) {
                        return v10;
                    }
                }
                final ix2 j = a14.l();
                this.x = 3;
                o = ljq.R(this, (zta)new nw2(2, (f07)null, (byte)1), j.a, false, true);
                if (o != v10) {
                    o = a15;
                }
                if (o != v10) {
                    return a15;
                }
                return v10;
            }
            case 2: {
                final lta lta2 = (lta)this.B;
                final quj quj = (quj)this.A;
                final Object v11 = pc7.v;
                final byte x11 = this.x;
                Object z5 = null;
                Object o21 = null;
                Label_4019: {
                    deo deo2 = null;
                    Label_3979: {
                        beo beo2 = null;
                        deo z4 = null;
                        Label_3922: {
                            deo deo = null;
                            Object a16 = null;
                            beo w4 = null;
                            Label_3809: {
                                if (x11 != 0) {
                                    if (x11 == 1) {
                                        final beo beo = (beo)this.y;
                                        deo = (deo)this.z;
                                        vt4.g0(o);
                                        a16 = o;
                                        w4 = beo;
                                        break Label_3809;
                                    }
                                    if (x11 == 2) {
                                        beo2 = (beo)this.y;
                                        z4 = (deo)this.z;
                                        vt4.g0(o);
                                        break Label_3922;
                                    }
                                    if (x11 == 3) {
                                        deo2 = (deo)this.z;
                                        vt4.g0(o);
                                        break Label_3979;
                                    }
                                    if (x11 == 4) {
                                        z5 = this.z;
                                        vt4.g0(o);
                                        o21 = o;
                                        break Label_4019;
                                    }
                                    if (x11 == 5) {
                                        vt4.g0(o);
                                        return o;
                                    }
                                    en9.q("call to 'resume' before 'invoke' with coroutine");
                                }
                                else {
                                    vt4.g0(o);
                                    deo = (deo)this.z;
                                    w4 = beo.w;
                                    this.z = deo;
                                    this.y = w4;
                                    this.x = 1;
                                    a16 = deo.a((f07)this);
                                    if (a16 == v11) {
                                        return v11;
                                    }
                                    break Label_3809;
                                }
                                o = null;
                                return o;
                            }
                            beo2 = w4;
                            z4 = deo;
                            if (!(boolean)a16) {
                                final emc e2 = quj.e();
                                this.z = deo;
                                this.y = w4;
                                this.x = 2;
                                if (((AtomicBoolean)e2.a.e.z).get()) {
                                    en9.q("Database is closed");
                                    return null;
                                }
                                Object o22 = e2.b.g((h07)this);
                                if (o22 != v11) {
                                    o22 = lqo.a;
                                }
                                beo2 = w4;
                                z4 = deo;
                                if (o22 == v11) {
                                    return v11;
                                }
                            }
                        }
                        o = new p10((f07)null, lta2);
                        this.z = z4;
                        this.y = null;
                        this.x = 3;
                        final Object o23 = o = z4.d(beo2, (zta)o, (f07)this);
                        deo2 = z4;
                        if (o23 == v11) {
                            return v11;
                        }
                    }
                    this.z = o;
                    this.x = 4;
                    final Boolean a17 = deo2.a((f07)this);
                    z5 = o;
                    if ((o21 = a17) != v11) {
                        break Label_4019;
                    }
                    o = v11;
                    return o;
                }
                o = z5;
                if (!(boolean)o21) {
                    quj.e().b();
                    o = z5;
                }
                return o;
            }
            case 1: {
                final lqo a18 = lqo.a;
                dho dho2 = (dho)this.B;
                final oc7 a19 = (oc7)this.A;
                final pc7 v12 = pc7.v;
                final byte x12 = this.x;
                Label_4390: {
                    Object f2 = null;
                    Label_4317: {
                        if (x12 != 0) {
                            if (x12 != 1) {
                                if (x12 == 2) {
                                    final b98 b7 = (b98)this.y;
                                    vt4.g0(o);
                                    f2 = b7;
                                    break Label_4317;
                                }
                                if (x12 != 3 && x12 != 4) {
                                    en9.q("call to 'resume' before 'invoke' with coroutine");
                                    return o7;
                                }
                                dho2 = (dho)this.z;
                                vt4.g0(o);
                                break Label_4390;
                            }
                            else {
                                vt4.g0(o);
                            }
                        }
                        else {
                            vt4.g0(o);
                            final n6k a20 = ljq.a0((jta)new p31(dho2, (byte)0));
                            final q31 q2 = new q31(2, (f07)null, (byte)0);
                            this.A = a19;
                            this.x = 1;
                            if (vt4.A((ija)a20, (zta)q2, this) == v12) {
                                return v12;
                            }
                        }
                        if (((ca4)dho2.e).a()) {
                            f2 = rhc.f(a19, null, 0, (zta)new mn((byte)8, (f07)null, (Object)dho2), 3);
                        }
                        else {
                            f2 = null;
                        }
                        final n6k a21 = ljq.a0((jta)new p31(dho2, (byte)1));
                        final r31 r31 = new r31((byte)0);
                        this.A = null;
                        this.y = f2;
                        this.x = 2;
                        if (vt4.A((ija)a21, (zta)r31, this) == v12) {
                            return v12;
                        }
                    }
                    if (((ca4)dho2.f).a()) {
                        if (f2 != null) {
                            this.A = null;
                            this.y = null;
                            this.z = dho2;
                            this.x = 3;
                            if ((o = ((z88)f2).O0((f07)this)) == v12) {
                                return v12;
                            }
                            break Label_4390;
                        }
                        else {
                            final cb4 cb4 = (cb4)dho2.g;
                            this.A = null;
                            this.y = null;
                            this.z = dho2;
                            this.x = 4;
                            if ((o = cb4.b((Object)this)) == v12) {
                                return v12;
                            }
                            break Label_4390;
                        }
                    }
                    return a18;
                }
                Object v13;
                if ((v13 = o) == null) {
                    v13 = z89.v;
                }
                ((ksg)dho2.k).setValue(v13);
                return a18;
                return v12;
            }
            case 0: {
                final lqo a22 = lqo.a;
                final ink a23 = (ink)this.B;
                final pc7 v14 = pc7.v;
                final byte x13 = this.x;
                Label_5174: {
                    Label_4723: {
                        if (x13 != 0) {
                            if (x13 == 1) {
                                o8 = this.z;
                                a = this.A;
                                final xtm xtm = (xtm)this.y;
                                vt4.g0(o);
                                o = xtm;
                                break Label_4723;
                            }
                            if (x13 == 2) {
                                a = this.A;
                                o8 = this.y;
                                vt4.g0(o);
                                o = o8;
                                break Label_5174;
                            }
                            if (x13 == 3) {
                                a = this.A;
                                o8 = this.y;
                                vt4.g0(o);
                                o = o8;
                                break Label_5174;
                            }
                            if (x13 == 4) {
                                vt4.g0(o);
                                break Label_5174;
                            }
                            if (x13 != 5) {
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                o = settings;
                                return o;
                            }
                            vt4.g0(o);
                        }
                        else {
                            vt4.g0(o);
                            o8 = ((s10)a23).w.w;
                            o = ((s10)a23).z;
                            this.y = o8;
                            this.A = a23;
                            this.z = o8;
                            this.x = 1;
                            if (((xtm)o8).d((wom)o, (h07)this) == v14) {
                                break Label_5174;
                            }
                            o = o8;
                            a = a23;
                            break Label_4723;
                        }
                        o = a22;
                        return o;
                    }
                    final c companion = s7n.Companion;
                    v = ((s10)a).v;
                    final atm c = ((s10)a).c();
                    companion.getClass();
                    final String a24 = c.a(4);
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    final JsonElement jsonElement = (JsonElement)((Map)linkedHashMap2).put((Object)"apiKey", (Object)jrc.c(v.a));
                    final JsonElement jsonElement2 = (JsonElement)((Map)linkedHashMap2).put((Object)"apiHost", (Object)jrc.c("api.segment.io/v1"));
                    final JsonElement jsonElement3 = (JsonElement)((Map)linkedHashMap).put((Object)"Segment.io", (Object)new JsonObject((Map)linkedHashMap2));
                    final JsonObject jsonObject = new JsonObject((Map)linkedHashMap);
                    final JsonObject a25 = ts9.a;
                    Settings settings2;
                    settings = (settings2 = new Settings(48, jsonObject));
                    while (true) {
                        if (a24 == null) {
                            break Label_4937;
                        }
                        settings2 = settings;
                        if (a24.equals("")) {
                            break Label_4937;
                        }
                        if (a24.equals("{}")) {
                            settings2 = settings;
                            break Label_4937;
                        }
                        try {
                            settings2 = (Settings)((jqc)jqc.d).b(a24, (KSerializer)Settings.Companion.serializer());
                            final s7n s7n = new s7n(v, settings2, false, (Set)z89.v, true);
                            this.y = o;
                            this.A = a;
                            this.z = null;
                            this.x = 2;
                            if (((xtm)o8).d((wom)s7n, (h07)this) != v14) {
                                o8 = ((s10)a).c();
                                this.y = o;
                                this.A = a;
                                this.x = 3;
                                o8 = o8;
                                o8.getClass();
                                if (ntm.c((ntm)o8, (h07)this) != v14) {
                                    o8 = zcn.v;
                                    a = ((s10)a).w.w;
                                    this.y = o;
                                    this.A = null;
                                    this.x = 4;
                                    o = new gw4(2, o8, (Class)zcn.class, "systemUpdate", "systemUpdate(Lcom/segment/analytics/kotlin/core/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte)5);
                                    o = ((xtm)a).f((s1n)o8, v4j.a((Class)s7n.class), true, (ic7)zcn.H, (zta)o, (h07)this);
                                    if (o != v14) {
                                        o = a22;
                                    }
                                    if (o != v14) {
                                        ((s10)a23).a((deh)new lnk());
                                        this.y = null;
                                        this.x = 5;
                                        if (b.a(a23, (h07)this) != v14) {
                                            return a22;
                                        }
                                    }
                                }
                            }
                            o = v14;
                            return o;
                        }
                        catch (final Exception ex3) {
                            settings2 = settings;
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
}
