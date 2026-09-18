import com.anthropic.claude.sessions.api.a;
import com.anthropic.claude.sessions.types.SessionFileAttachment;
import java.util.Map;
import com.anthropic.claude.sessions.types.ConnectionStatus;
import com.anthropic.claude.sessions.types.SessionStatus;
import com.anthropic.claude.sessions.types.SessionResourceV2;
import com.anthropic.claude.api.result.ApiResult;
import java.util.Collection;
import android.content.SharedPreferences$Editor;
import com.anthropic.claude.analytics.events.CodeEvents$CodeMessageSendSucceeded;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.CodeEvents$CodeProjectComposerHost;
import com.anthropic.claude.analytics.events.CodeEvents$CodeSessionKind;
import com.anthropic.claude.analytics.events.CodeEvents$CodeSurface;
import com.anthropic.claude.analytics.events.CodeEvents$CodeMessageSent;
import java.util.concurrent.CancellationException;
import com.anthropic.claude.types.strings.SessionId;
import java.util.Set;
import com.anthropic.claude.sessions.types.SessionResource;
import java.util.ListIterator;
import java.util.ArrayList;
import java.time.Instant;
import java.util.List;
import java.util.Iterator;
import java.util.Map$Entry;
import android.content.Context;
import java.util.LinkedHashMap;

public final class vr implements vq
{
    public final hsg A;
    public final ksg B;
    public final ksg C;
    public final ksg D;
    public final bsl E;
    public final ssi F;
    public final v8m G;
    public final ksg H;
    public wmm I;
    public wmm J;
    public wmm K;
    public wmm L;
    public String M;
    public final LinkedHashMap N;
    public String O;
    public String P;
    public String Q;
    public final v8m R;
    public final LinkedHashMap S;
    public final lp T;
    public final oll a;
    public final bp b;
    public final krf c;
    public final uq d;
    public final s3p e;
    public final lu f;
    public final qod g;
    public final st4 h;
    public final u88 i;
    public final z8b j;
    public final fz6 k;
    public final e39 l;
    public final ksg m;
    public final v8m n;
    public final x8m o;
    public final ksg p;
    public String q;
    public final v8m r;
    public final ksg s;
    public final nq t;
    public final l45 u;
    public final c2l v;
    public final wp w;
    public final ksg x;
    public final ksg y;
    public final ksg z;
    
    public vr(final oll a, final bp b, final krf c, final uq d, final Context context, final oi0 oi0, final s3p e, final gba gba, final h7g h7g, final lu f, final qod g, final wo8 wo8, final st4 h, final u88 i, final z2g z2g, final cjo cjo, final z8b j, final u3p u3p) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        final fz6 a2 = k8e.A(wo8);
        this.k = a2;
        this.l = new e39(cjo, a2, (oc7)u3p);
        final Boolean false = Boolean.FALSE;
        this.m = o50.Q((Object)false);
        this.n = new v8m();
        this.o = new x8m();
        this.p = o50.Q((Object)null);
        this.r = new v8m();
        this.s = o50.Q((Object)false);
        this.t = new nq(a2, d, e, z2g, new wq(this, (byte)0));
        this.u = new l45((oc7)a2, (jta)new nr((Object)this, (byte)0), (cua)new lua(4, (Object)a, (Class)oll.class, "reportClientPresence", "reportClientPresence-TAYA1pY(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), i.a().a());
        this.v = new c2l(a2, a);
        this.w = new wp(a, c, d, new wq(this, (byte)1), new kr(0, (Object)this, (Class)vr.class, "onAgentSessionsFound", "onAgentSessionsFound()V", 0, (byte)0), new br(this, (byte)0));
        this.x = o50.Q((Object)false);
        this.y = o50.Q((Object)false);
        this.z = o50.Q((Object)null);
        this.A = new hsg(0);
        this.B = o50.Q((Object)rp.v);
        this.C = o50.Q((Object)null);
        this.D = o50.Q((Object)zn.v);
        final bsl b2 = csl.b(1, 0, 5);
        this.E = b2;
        this.F = lq6.h(b2);
        this.G = new v8m();
        this.H = o50.Q((Object)null);
        this.N = new LinkedHashMap();
        this.R = new v8m();
        this.S = new LinkedHashMap();
        this.T = new lp(a2, context, oi0, e, gba, h7g, new br(this, (byte)1), new wq(this, (byte)2));
    }
    
    public final void a() {
        final Iterator iterator = this.o.w.iterator();
        while (true) {
            final g1 g1 = (g1)iterator;
            if (!g1.hasNext()) {
                break;
            }
            if (!(((Map$Entry)((hpm)iterator).next()).getValue() instanceof fr)) {
                continue;
            }
            g1.remove();
        }
    }
    
    public final void b(final gt gt) {
        final int w = t.w(gt);
        final int n = -1;
        final v8m n2 = this.n;
        int n3 = 0;
        if (w != 0) {
            if (w == 1) {
                final lt lt = (lt)gt;
                final ListIterator listIterator = n2.listIterator();
                int n4 = 0;
                int n5;
                while (true) {
                    final xgd xgd = (xgd)listIterator;
                    n5 = n;
                    if (!xgd.hasNext()) {
                        break;
                    }
                    if (mlc.q((Object)((yp)xgd.next()).d(), (Object)lt.b())) {
                        n5 = n4;
                        break;
                    }
                    ++n4;
                }
                if (n5 >= 0) {
                    final yp yp = (yp)n2.get(n5);
                    final pt f = yp.f();
                    if (f != null) {
                        String s;
                        if ((s = lt.a()) == null) {
                            s = f.b();
                        }
                        n2.set(n5, (Object)yp.a(yp, (List)null, (Instant)null, pt.a(f, s, lt.c()), 63));
                    }
                }
                else {
                    final tqd l = uqd.l;
                }
                final String a = lt.a();
                if (a != null) {
                    final c2l v = this.v;
                    rhc.G((oc7)v.w, (hc7)null, 0, (zta)new z((Object)v, (Object)a, (f07)null, (byte)8), 3);
                }
                return;
            }
            en9.r();
        }
        else {
            final zs zs = (zs)gt;
            final ListIterator listIterator2 = n2.listIterator();
            int n6;
            while (true) {
                final xgd xgd2 = (xgd)listIterator2;
                n6 = n;
                if (!xgd2.hasNext()) {
                    break;
                }
                if (mlc.q((Object)((yp)xgd2.next()).d(), (Object)zs.b())) {
                    n6 = n3;
                    break;
                }
                ++n3;
            }
            if (n6 < 0) {
                final tqd i = uqd.l;
                return;
            }
            final yp yp2 = (yp)n2.get(n6);
            Object a2;
            if (((Collection)(a2 = zs.a())).isEmpty()) {
                final tqd j = uqd.l;
                final List b = yp2.b();
                a2 = new ArrayList(d86.p0((Iterable)b, 10));
                final Iterator iterator = ((Iterable)b).iterator();
                while (iterator.hasNext()) {
                    ((ArrayList)a2).add((Object)gp.a((gp)iterator.next()));
                }
            }
            n2.set(n6, (Object)yp.a(yp2, (List)a2, (Instant)null, (pt)null, 119));
        }
    }
    
    public final Object c(SessionResource e, String s, String w, String y, ArrayList w2, Set set, h07 a) {
        final s3p e2 = this.e;
        final st4 h = this.h;
        Object o = null;
        Label_0069: {
            if (a instanceof jr) {
                o = a;
                final int d = ((jr)o).D;
                if ((d & Integer.MIN_VALUE) != 0x0) {
                    ((jr)o).D = d + Integer.MIN_VALUE;
                    break Label_0069;
                }
            }
            o = new jr(this, a);
        }
        Object o2 = ((jr)o).B;
        final int d2 = ((jr)o).D;
        boolean b = true;
        final x8m o3 = this.o;
        final z29 z29 = null;
    Label_0531_Outer:
        while (true) {
            Label_0198: {
                if (d2 == 0) {
                    break Label_0198;
                }
                if (d2 != 1) {
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y = ((jr)o).A;
                a = (h07)((jr)o).z;
                set = (Set)((jr)o).y;
                w2 = (ArrayList)((jr)o).x;
                w = ((jr)o).w;
                o = ((jr)o).v;
                e = (SessionResource)y;
                s = (String)w;
                try {
                    vt4.g0(o2);
                    e = (SessionResource)o;
                    s = y;
                    break Label_0531_Outer;
                }
                finally {
                    w = s;
                    s = y;
                }
                y = (String)w;
                break Label_0531_Outer;
            }
            vt4.g0(o2);
            a = (h07)e.d();
            try {
                final bp b2 = this.b;
                if (!w2.isEmpty()) {
                    o2 = w2;
                }
                else {
                    o2 = null;
                }
                ((jr)o).v = e;
                w2 = (ArrayList)(s = s);
                ((jr)o).w = (String)w2;
                s = (String)w2;
                ((jr)o).x = (String)w;
                s = (String)w2;
                ((jr)o).y = y;
                s = (String)w2;
                ((jr)o).z = set;
                s = (String)w2;
                ((jr)o).A = (String)a;
                s = (String)w2;
                ((jr)o).D = 1;
                s = (String)w2;
                o2 = b2.k((h07)o, (String)a, y, (List)o2);
                final pc7 v = pc7.v;
                if (o2 == v) {
                    return v;
                }
                final Object o4 = y;
                o = set;
                y = (String)w;
                set = (Set)o4;
                while (true) {
                    Label_1107: {
                        String s2 = null;
                        while (true) {
                            Label_0720: {
                                Label_0467: {
                                    Label_0465: {
                                        try {
                                            a = (h07)o2;
                                            final int y2 = t.y((puk)a);
                                            w2 = (ArrayList)lqo.a;
                                            if (y2 == 0) {
                                                break Label_0720;
                                            }
                                            if (y2 != 1) {
                                                throw new RuntimeException();
                                            }
                                            final tqd l = uqd.l;
                                            o = new mg((Object)this, (Object)s, (Object)a, (byte)1);
                                            e = this.e();
                                            if (e != null) {
                                                e.d();
                                                break Label_0467;
                                            }
                                            break Label_0465;
                                        }
                                        finally {}
                                        y = (String)w;
                                        s = s2;
                                        break Label_0531_Outer;
                                    }
                                    s2 = null;
                                }
                                if (s2 != null && s2.equals(s)) {
                                    try {
                                        final er er = new er((Object)this, (String)w, (String)set, o, s, (byte)0);
                                        a = (h07)((nuk)a).a();
                                        z29 i = z29;
                                        if (a != null) {
                                            i = e6r.l((pj0)a);
                                        }
                                        if (i != null) {
                                            o2 = new SessionId(s);
                                            a = (h07)new fr((String)w);
                                            o3.put(o2, (Object)a);
                                            o2 = this.l;
                                            a = (h07)new xq(this, s, (byte)0);
                                            try {
                                                set = (Set)new yq((Object)this, w, (Object)s, (Object)y, (Object)set, o, (byte)0);
                                                y = (String)new y((Object)er, (Object)this, (byte)3);
                                                ((e39)o2).c(i, (jta)a, (jta)set, (lta)y);
                                                break Label_1107;
                                            }
                                            finally {}
                                        }
                                        er.a();
                                        this.q(xp.w);
                                        break Label_1107;
                                    }
                                    finally {
                                        continue Label_0531_Outer;
                                    }
                                    throw new RuntimeException();
                                }
                                ((mg)o).a();
                                if (!mlc.q(o3.get((Object)new SessionId(s)), (Object)new gr((String)w))) {
                                    return w2;
                                }
                                final SessionId sessionId = new SessionId(s);
                                o3.remove((Object)sessionId);
                                return w2;
                            }
                            y = (String)this.e();
                            if (y != null) {
                                y = ((SessionResource)y).d();
                            }
                            else {
                                y = null;
                            }
                            if (y == null || !y.equals(s) || !mlc.q((Object)this.M, w)) {
                                b = false;
                            }
                            y = (String)uqd.l;
                            y = (String)((Iterable)o).iterator();
                            while (((Iterator)y).hasNext()) {
                                set = (Set)((Iterator)y).next();
                                set = (Set)((Map)this.S).remove((Object)set);
                                if (set != null) {
                                    ((opc)set).g((CancellationException)null);
                                }
                            }
                            set = (Set)this.R;
                            y = (String)new dr((Set)o, (byte)0);
                            h86.w0((lta)y, (List)set);
                            ((Map)this.N).put((Object)((ouk)a).a(), w);
                            if (b) {
                                set = (Set)((ouk)a).a();
                                y = (String)this.L;
                                if (y != null) {
                                    ((bqc)y).g((CancellationException)null);
                                }
                                o = this.O;
                                y = (String)this.k;
                                try {
                                    set = (Set)new sr(s, (String)set, (String)o, this, (String)w, (f07)null);
                                    this.L = rhc.G((oc7)y, (hc7)null, 0, (zta)set, 3);
                                }
                                finally {
                                    continue Label_0531_Outer;
                                }
                            }
                            break;
                        }
                        y = new(com.anthropic.claude.analytics.events.CodeEvents$CodeMessageSent.class)();
                        set = (Set)e2.d;
                        o = ((SessionResource)s2).c();
                        final CodeEvents$CodeSurface z30 = CodeEvents$CodeSurface.z;
                        new CodeEvents$CodeMessageSent((String)set, s, (String)o, z30, (CodeEvents$CodeSessionKind)null, (String)null, (CodeEvents$CodeProjectComposerHost)null, 496);
                        set = (Set)CodeEvents$CodeMessageSent.Companion.serializer();
                        vt4.b0((KSerializer)set);
                        h.b((v10)y, (KSerializer)set);
                        y = (String)new CodeEvents$CodeMessageSendSucceeded(e2.d, s, ((ouk)a).a(), "dispatch", z30, (CodeEvents$CodeSessionKind)null, (String)null, 480);
                        final KSerializer serializer = CodeEvents$CodeMessageSendSucceeded.Companion.serializer();
                        vt4.b0(serializer);
                        h.b((v10)y, serializer);
                    }
                    if (mlc.q(o3.get((Object)new SessionId(s)), (Object)new gr((String)w))) {
                        final SessionId sessionId = new SessionId(s);
                        continue;
                    }
                    break;
                }
                return w2;
            }
            finally {
                w = s;
                final String s3;
                s = s3;
                e = (SessionResource)a;
                continue;
            }
            break;
        }
        if (mlc.q(o3.get((Object)new SessionId((String)e)), (Object)new gr(y))) {
            o3.remove((Object)new SessionId((String)e));
        }
        throw s;
    }
    
    public final void d(final ho8 ho8) {
        final nq t = this.t;
        t.getClass();
        final String string = ho8.a().toString();
        string.getClass();
        final SharedPreferences$Editor edit = ((uq)t.b).a.edit();
        edit.putString("dispatch_notice_closed_end_date", string);
        edit.apply();
        ((ksg)t.h).setValue((Object)string);
    }
    
    public final SessionResource e() {
        return (SessionResource)this.p.getValue();
    }
    
    public final ho8 f() {
        final ho8 ho8 = (ho8)this.c.G.getValue();
        final nq t = this.t;
        t.getClass();
        if (ho8 != null && !mlc.q((Object)ho8.a().toString(), (Object)((ksg)t.h).getValue())) {
            return ho8;
        }
        return null;
    }
    
    public final boolean g() {
        return (boolean)this.s.getValue();
    }
    
    public final void h(final yp yp) {
        final v8m n = this.n;
        Label_0065: {
            if (n == null || !n.isEmpty()) {
                final ListIterator listIterator = n.listIterator();
                xgd xgd;
                do {
                    xgd = (xgd)listIterator;
                    if (xgd.hasNext()) {
                        continue;
                    }
                    break Label_0065;
                } while (!mlc.q((Object)((yp)xgd.next()).d(), (Object)yp.d()));
                final tqd l = uqd.l;
                return;
            }
        }
        final String d = yp.d();
        final LinkedHashMap n2 = this.N;
        String m;
        if ((m = (String)n2.get((Object)d)) == null) {
            m = this.M;
        }
        v8m v8m;
        if (yp.f() == null) {
            v8m = n;
        }
        else {
            v8m = null;
        }
        Label_0203: {
            if (v8m != null) {
                final ListIterator listIterator2 = v8m.listIterator();
                while (true) {
                    yp yp2;
                    Object next;
                    do {
                        final xgd xgd2 = (xgd)listIterator2;
                        if (xgd2.hasNext()) {
                            next = xgd2.next();
                            yp2 = (yp)next;
                        }
                        else {
                            final yp yp3 = null;
                            if (yp3 != null) {
                                final tqd i = uqd.l;
                            }
                            break Label_0203;
                        }
                    } while (mlc.q((Object)yp2.d(), (Object)m) || !mlc.q((Object)yp2.c(), (Object)yp.c()) || yp2.e() != yp.e());
                    final yp yp3 = (yp)next;
                    continue;
                }
            }
        }
        final String s = (String)n2.get((Object)yp.d());
        final String j = this.M;
        if (s != null) {
            final tqd k = uqd.l;
            this.m(s, yp);
            if (mlc.q((Object)j, (Object)s)) {
                this.M = null;
            }
            return;
        }
        if (j != null && yp.e() == 1) {
            final tqd l2 = uqd.l;
            ((Map)n2).put((Object)yp.d(), (Object)j);
            this.m(j, yp);
            this.M = null;
            return;
        }
        final tqd l3 = uqd.l;
        n.add((Object)yp);
    }
    
    public final boolean i() {
        return (boolean)this.c.E.getValue();
    }
    
    public final Object j(final h07 h07) {
        lr lr = null;
        Label_0051: {
            if (h07 instanceof lr) {
                lr = (lr)h07;
                final int x = lr.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    lr.x = x + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            lr = new lr(this, h07);
        }
        Object o = lr.v;
        final int x2 = lr.x;
        final e39 l = this.l;
        final wp w = this.w;
        final lqo a = lqo.a;
        final SessionResource sessionResource = null;
        final SessionResource sessionResource2 = null;
        final pc7 v = pc7.v;
        Object v2 = null;
        Label_0440: {
            Label_0430: {
                if (x2 != 0) {
                    if (x2 != 1) {
                        if (x2 == 2) {
                            vt4.g0(o);
                            break Label_0430;
                        }
                        if (x2 == 3) {
                            vt4.g0(o);
                            return a;
                        }
                        if (x2 == 4) {
                            vt4.g0(o);
                            return a;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        vt4.g0(o);
                    }
                }
                else {
                    vt4.g0(o);
                    final tqd i = uqd.l;
                    final SessionResource e = this.e();
                    String d;
                    if (e != null) {
                        d = e.d();
                    }
                    else {
                        d = null;
                    }
                    final String q = this.q;
                    if (this.i() && d != null) {
                        final String q2 = this.Q;
                        if (q2 != null && d.equals(q2) && (q == null || q.equals(d))) {
                            if (q != null) {
                                this.q = null;
                            }
                            this.q(null);
                            final wmm wmm = (wmm)l.f;
                            if (wmm != null) {
                                ((bqc)wmm).g((CancellationException)null);
                            }
                            l.f = null;
                            l.a = 0;
                            l.b = false;
                            this.a();
                            this.s(d, false);
                            final wmm k = this.K;
                            if (k != null) {
                                ((bqc)k).g((CancellationException)null);
                            }
                            this.K = rhc.G((oc7)this.k, (hc7)null, 0, (zta)new mr((Object)this, (Object)d, (f07)null, (byte)0), 3);
                            return a;
                        }
                    }
                    this.r(true);
                    this.q(null);
                    lr.x = 1;
                    if (w.b((h07)lr) == v) {
                        return v;
                    }
                }
                if (w.h.isEmpty()) {
                    final tqd j = uqd.l;
                    v2 = r89.v;
                    break Label_0440;
                }
                lr.x = 2;
                if ((o = w.a(false, (h07)lr)) == v) {
                    return v;
                }
            }
            v2 = o;
            final tqd m = uqd.l;
        }
        final v8m r = this.r;
        r.clear();
        r.addAll((Collection)v2);
        if (!((Collection)v2).isEmpty()) {
            this.s.setValue((Object)Boolean.TRUE);
            this.t.f();
        }
        if (((List)v2).isEmpty()) {
            this.r(false);
            return a;
        }
        final String q3 = this.q;
        SessionId sessionId;
        if (q3 != null) {
            sessionId = new SessionId(q3);
        }
        else {
            sessionId = null;
        }
        this.q = null;
        String a2;
        if (sessionId != null) {
            a2 = sessionId.a;
        }
        else {
            a2 = null;
        }
        SessionResource sessionResource3 = null;
        Label_0609: {
            if (a2 != null) {
                while (true) {
                    for (final Object next : v2) {
                        if (mlc.q((Object)((SessionResource)next).d(), (Object)a2)) {
                            sessionResource3 = (SessionResource)next;
                            break Label_0609;
                        }
                    }
                    Object next = null;
                    continue;
                }
            }
            sessionResource3 = null;
        }
        if (sessionResource3 != null) {
            lr.x = 3;
            this.o(sessionResource3);
            if (a == v) {
                return v;
            }
        }
        else {
            if (a2 != null) {
                final tqd l2 = uqd.l;
            }
            final SessionResource e2 = this.e();
            String d2;
            if (e2 != null) {
                d2 = e2.d();
            }
            else {
                d2 = null;
            }
            SessionResource value = null;
            Label_0728: {
                if (d2 != null) {
                    while (true) {
                        for (final Object next2 : v2) {
                            if (mlc.q((Object)((SessionResource)next2).d(), (Object)d2)) {
                                final SessionResource sessionResource4 = (SessionResource)next2;
                                value = sessionResource4;
                                break Label_0728;
                            }
                        }
                        final SessionResource sessionResource4 = null;
                        continue;
                    }
                }
                value = null;
            }
            if (value != null) {
                this.p.setValue((Object)value);
                this.r(false);
                this.D.setValue((Object)zn.v);
                final wmm wmm2 = (wmm)l.f;
                if (wmm2 != null) {
                    ((bqc)wmm2).g((CancellationException)null);
                }
                l.f = null;
                l.a = 0;
                l.b = false;
                this.a();
                this.s(value.d(), false);
                return a;
            }
            String string = null;
            Label_0850: {
                if (this.i()) {
                    string = this.d.a.getString("last_selected_session_id", (String)null);
                    if (string != null) {
                        break Label_0850;
                    }
                }
                string = null;
            }
            SessionResource sessionResource5 = sessionResource;
            if (string != null) {
                final Iterator iterator3 = ((Iterable)v2).iterator();
                Object next3;
                do {
                    next3 = sessionResource2;
                    if (!iterator3.hasNext()) {
                        break;
                    }
                    next3 = iterator3.next();
                } while (!mlc.q((Object)((SessionResource)next3).d(), (Object)string));
                sessionResource5 = (SessionResource)next3;
            }
            SessionResource sessionResource6;
            if ((sessionResource6 = sessionResource5) == null) {
                sessionResource6 = (SessionResource)c86.G0((List)v2);
            }
            lr.x = 4;
            this.o(sessionResource6);
            if (a == v) {
                return v;
            }
        }
        return a;
    }
    
    public final Object k(String s, final f07 f07) {
        pr pr = null;
        Label_0051: {
            if (f07 instanceof pr) {
                pr = (pr)f07;
                final int y = pr.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    pr.y = y + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            pr = new pr(this, f07);
        }
        Object o = pr.w;
        final int y2 = pr.y;
        final oll a = this.a;
        final int n = 0;
        final lqo a2 = lqo.a;
        final pc7 v = pc7.v;
        Label_0493: {
            if (y2 != 0) {
                if (y2 != 1) {
                    if (y2 == 2) {
                        s = pr.v;
                        vt4.g0(o);
                        break Label_0493;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    s = pr.v;
                    vt4.g0(o);
                }
            }
            else {
                vt4.g0(o);
                pr.v = s;
                pr.y = 1;
                if ((o = a.r(s, (h07)pr)) == v) {
                    return v;
                }
            }
            final ApiResult apiResult = (ApiResult)o;
            if (!(apiResult instanceof qj0)) {
                final tqd l = uqd.l;
                return a2;
            }
            final SessionResource e = this.e();
            String d;
            if (e != null) {
                d = e.d();
            }
            else {
                d = null;
            }
            if (d == null || !d.equals(s)) {
                return a2;
            }
            final SessionResource value = (SessionResource)((qj0)apiResult).b;
            final SessionResource e2 = this.e();
            SessionStatus g;
            if (e2 != null) {
                g = e2.g();
            }
            else {
                g = null;
            }
            if (value.g() != g) {
                final tqd i = uqd.l;
            }
            else {
                final tqd j = uqd.l;
            }
            this.p.setValue((Object)value);
            final v8m r = this.r;
            final ListIterator listIterator = r.listIterator();
            int n2 = 0;
            int n3;
            while (true) {
                final xgd xgd = (xgd)listIterator;
                final boolean hasNext = xgd.hasNext();
                n3 = -1;
                if (!hasNext) {
                    n2 = -1;
                    break;
                }
                if (mlc.q((Object)((SessionResource)xgd.next()).d(), (Object)s)) {
                    break;
                }
                ++n2;
            }
            if (n2 >= 0) {
                r.set(n2, (Object)value);
            }
            final ConnectionStatus b = value.b();
            int n4;
            if (b == null) {
                n4 = n3;
            }
            else {
                n4 = ir.a[((Enum)b).ordinal()];
            }
            Object value2;
            if (n4 != 1) {
                if (n4 != 2) {
                    value2 = null;
                }
                else {
                    value2 = Boolean.FALSE;
                }
            }
            else {
                value2 = Boolean.TRUE;
            }
            final ksg c = this.C;
            if (!mlc.q(value2, (Object)c.getValue())) {
                final tqd k = uqd.l;
            }
            c.setValue(value2);
            pr.v = s;
            pr.y = 2;
            if ((o = a.u(s, (h07)pr)) != v) {
                break Label_0493;
            }
            return v;
        }
        final ApiResult apiResult2 = (ApiResult)o;
        final SessionResource e3 = this.e();
        String d2;
        if (e3 != null) {
            d2 = e3.d();
        }
        else {
            d2 = null;
        }
        int equals;
        if (d2 == null) {
            equals = n;
        }
        else {
            equals = (d2.equals(s) ? 1 : 0);
        }
        if (equals != 0) {
            final int z = t.z(apiResult2);
            if (z == 0) {
                this.w.d(((SessionResourceV2)((qj0)apiResult2).b).a());
                return a2;
            }
            if (z == 1) {
                final tqd m = uqd.l;
                return a2;
            }
            en9.r();
            return null;
        }
        return a2;
    }
    
    public final void l(final String s, final String s2) {
        final SessionId sessionId = new SessionId(s);
        final x8m o = this.o;
        final hr hr = (hr)o.get((Object)sessionId);
        String a;
        if (hr != null) {
            a = hr.a();
        }
        else {
            a = null;
        }
        if (mlc.q((Object)a, (Object)s2)) {
            o.remove((Object)new SessionId(s));
        }
    }
    
    public final void m(final String s, final yp yp) {
        final v8m n = this.n;
        final ListIterator listIterator = n.listIterator();
        while (true) {
            Object next;
            do {
                final xgd xgd = (xgd)listIterator;
                if (!xgd.hasNext()) {
                    next = null;
                    final yp yp2 = (yp)next;
                    yp a = yp;
                    if (yp.g() == null) {
                        Instant g;
                        if (yp2 != null) {
                            g = yp2.g();
                        }
                        else {
                            g = null;
                        }
                        a = yp;
                        if (g != null) {
                            a = yp.a(yp, (List)null, yp2.g(), (pt)null, 95);
                        }
                    }
                    h86.w0((lta)new y8(s, (byte)10), (List)n);
                    final tqd l = uqd.l;
                    n.add((Object)a);
                    return;
                }
                next = xgd.next();
            } while (!mlc.q((Object)((yp)next).d(), (Object)s));
            continue;
        }
    }
    
    public final Object n(String v, boolean y, boolean z, final h07 h07) {
        while (true) {
            Label_0049: {
                if (!(h07 instanceof qr)) {
                    break Label_0049;
                }
                final qr qr = (qr)h07;
                final int d = qr.D;
                if ((d & Integer.MIN_VALUE) == 0x0) {
                    break Label_0049;
                }
                qr.D = d + Integer.MIN_VALUE;
                final qr qr2 = qr;
                Object o = qr2.B;
                final int d2 = qr2.D;
                final lqo a = lqo.a;
                int a2;
                qzg x;
                String s;
                if (d2 != 0) {
                    if (d2 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a2 = qr2.A;
                    z = qr2.z;
                    y = qr2.y;
                    x = qr2.x;
                    final String w = qr2.w;
                    v = qr2.v;
                    vt4.g0(o);
                    s = w;
                }
                else {
                    vt4.g0(o);
                    final SessionResource e = this.e();
                    if (e == null) {
                        return a;
                    }
                    final String d3 = e.d();
                    final v8m g = this.G;
                    final ListIterator listIterator = g.listIterator();
                    a2 = 0;
                    while (true) {
                        final xgd xgd = (xgd)listIterator;
                        if (!xgd.hasNext()) {
                            a2 = -1;
                            break;
                        }
                        if (mlc.q((Object)((qzg)xgd.next()).g(), (Object)v)) {
                            break;
                        }
                        ++a2;
                    }
                    if (a2 < 0) {
                        return a;
                    }
                    x = (qzg)g.remove(a2);
                    final String e2 = x.e();
                    final String g2 = x.g();
                    final String d4 = x.d();
                    final Map c = x.c();
                    final boolean i = x.i();
                    qr2.v = v;
                    qr2.w = d3;
                    qr2.x = x;
                    qr2.y = y;
                    qr2.z = z;
                    qr2.A = a2;
                    qr2.D = 1;
                    o = this.b.j(d3, e2, g2, d4, y, c, z, i, (h07)qr2);
                    final pc7 v2 = pc7.v;
                    if (o == v2) {
                        return v2;
                    }
                    s = d3;
                }
                final zwk zwk = (zwk)o;
                if (zwk instanceof xwk) {
                    final tqd l = uqd.l;
                    final zq zq = new zq((Object)this, a2, (Object)x, (byte)0);
                    final pj0 a3 = ((xwk)zwk).a();
                    z29 j;
                    if (a3 != null) {
                        j = e6r.l(a3);
                    }
                    else {
                        j = null;
                    }
                    if (j != null) {
                        this.l.c(j, (jta)new xq(this, s, (byte)1), (jta)new ar(zq, this, v, y, z), (lta)new y((Object)zq, (Object)this, (byte)4));
                        return a;
                    }
                    zq.a();
                    this.q(xp.y);
                }
                return a;
            }
            final qr qr2 = new qr(this, h07);
            continue;
        }
    }
    
    public final void o(final SessionResource value) {
        final tqd l = uqd.l;
        final e39 i = this.l;
        final wmm wmm = (wmm)i.f;
        if (wmm != null) {
            ((bqc)wmm).g((CancellationException)null);
        }
        i.f = null;
        i.a = 0;
        i.b = false;
        this.a();
        this.r(true);
        this.q(null);
        final lp t = this.T;
        final wmm j = t.j;
        if (j != null) {
            ((bqc)j).g((CancellationException)null);
        }
        t.j = null;
        t.i.setValue((Object)null);
        final LinkedHashMap s = this.S;
        final Iterator iterator = ((Iterable)s.values()).iterator();
        while (iterator.hasNext()) {
            ((opc)iterator.next()).g((CancellationException)null);
        }
        s.clear();
        this.R.clear();
        this.n.clear();
        ((x8m)this.v.y).clear();
        this.G.clear();
        this.N.clear();
        this.M = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.H.setValue((Object)null);
        final Boolean false = Boolean.FALSE;
        this.x.setValue((Object)false);
        this.y.setValue((Object)false);
        this.B.setValue((Object)rp.v);
        this.C.setValue((Object)null);
        this.D.setValue((Object)zn.v);
        final wmm k = this.L;
        if (k != null) {
            ((bqc)k).g((CancellationException)null);
        }
        this.L = null;
        this.p.setValue((Object)value);
        if (this.i()) {
            final String d = value.d();
            final SharedPreferences$Editor edit = this.d.a.edit();
            if (d == null) {
                edit.remove("last_selected_session_id");
            }
            else {
                edit.putString("last_selected_session_id", d);
            }
            edit.apply();
        }
        this.s(value.d(), false);
    }
    
    public final boolean p(final String s) {
        final String string = kym.B1((CharSequence)s).toString();
        final v8m r = this.R;
        final ArrayList list = new ArrayList(d86.p0((Iterable)r, 10));
        final ListIterator listIterator = r.listIterator();
        while (true) {
            final xgd xgd = (xgd)listIterator;
            if (!xgd.hasNext()) {
                break;
            }
            list.add((Object)((tq)xgd.next()).a());
        }
        final Set w1 = c86.w1((Iterable)list);
        final ArrayList list2 = new ArrayList();
        final ListIterator listIterator2 = r.listIterator();
        while (true) {
            final xgd xgd2 = (xgd)listIterator2;
            final boolean hasNext = xgd2.hasNext();
            Object a = null;
            if (!hasNext) {
                break;
            }
            final sq b = ((tq)xgd2.next()).b();
            oq oq;
            if (b instanceof oq) {
                oq = (oq)b;
            }
            else {
                oq = null;
            }
            if (oq != null) {
                a = oq.a();
            }
            if (a == null) {
                continue;
            }
            list2.add(a);
        }
        if (string.length() == 0 && list2.isEmpty()) {
            final tqd l = uqd.l;
            return false;
        }
        final SessionResource e = this.e();
        if (e == null) {
            final tqd i = uqd.l;
            return false;
        }
        final String d = e.d();
        final SessionId sessionId = new SessionId(d);
        final x8m o = this.o;
        if (o.containsKey((Object)sessionId)) {
            final tqd j = uqd.l;
            return false;
        }
        final tqd k = uqd.l;
        this.q(null);
        final String a2 = this.i.a().a();
        final ArrayList list3 = new ArrayList(d86.p0((Iterable)list2, 10));
        final Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            list3.add((Object)com.anthropic.claude.sessions.api.a.b((SessionFileAttachment)iterator.next()));
        }
        this.n.add((Object)new yp(a2, 1, string, (List)list3, false, Instant.now(), (pt)null, 80));
        this.M = a2;
        o.put((Object)new SessionId(d), (Object)new gr(a2));
        rhc.G((oc7)this.k, (hc7)null, 0, (zta)new rh((Object)this, (Object)e, (Object)a2, (Object)s, (Object)string, (Object)list2, (Object)w1, (f07)null, (byte)1), 3);
        return true;
    }
    
    public final void q(final xp value) {
        this.z.setValue((Object)value);
    }
    
    public final void r(final boolean b) {
        this.m.setValue((Object)b);
    }
    
    public final void s(final String q, final boolean b) {
        if (!b) {
            final wmm i = this.I;
            if (i != null && ((bqc)i).c()) {
                final String q2 = this.Q;
                if (q2 != null && q2.equals(q)) {
                    final tqd l = uqd.l;
                    return;
                }
            }
        }
        this.t();
        final String o = this.O;
        wr k = null;
        Label_0175: {
            if (this.i()) {
                final String q3 = this.Q;
                if (q3 != null && q3.equals(q) && o != null) {
                    final tqd j = uqd.l;
                    k = c7r.j((List)this.n, o, this.P, (boolean)this.x.getValue(), (zn)this.D.getValue(), (String)this.H.getValue(), this.M);
                    break Label_0175;
                }
            }
            k = null;
        }
        this.Q = q;
        final b0 b2 = new b0((Object)this, (Object)q, (Object)k, (f07)null, (byte)5);
        final fz6 m = this.k;
        this.I = rhc.G((oc7)m, (hc7)null, 0, (zta)b2, 3);
        this.J = rhc.G((oc7)m, (hc7)null, 0, (zta)new ur((Object)this, (Object)q, (f07)null, (byte)0), 3);
    }
    
    public final void t() {
        final wmm i = this.I;
        if (i != null) {
            ((bqc)i).g((CancellationException)null);
        }
        this.I = null;
        final wmm j = this.J;
        if (j != null) {
            ((bqc)j).g((CancellationException)null);
        }
        this.J = null;
        final wmm l = this.L;
        if (l != null) {
            ((bqc)l).g((CancellationException)null);
        }
        this.L = null;
        final wmm k = this.K;
        if (k != null) {
            ((bqc)k).g((CancellationException)null);
        }
        this.K = null;
        final e39 m = this.l;
        final wmm wmm = (wmm)m.f;
        if (wmm != null) {
            ((bqc)wmm).g((CancellationException)null);
        }
        m.f = null;
        this.a();
    }
}
