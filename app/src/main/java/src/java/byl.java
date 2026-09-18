import com.google.gson.JsonSyntaxException;
import java.util.concurrent.CancellationException;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import java.util.Iterator;
import java.util.Map$Entry;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.concurrent.Executor;
import com.anthropic.claude.types.strings.ChatId;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.HashMap;
import android.content.Context;

public final class byl implements nrf, k8o
{
    public static final umi D;
    public static final umi E;
    public final Object A;
    public Object B;
    public Object C;
    public Object v;
    public final Object w;
    public Object x;
    public Object y;
    public Object z;
    
    static {
        D = new umi(3600000L, 0);
        E = new umi(0L, 8);
    }
    
    public byl() {
        final Boolean false = Boolean.FALSE;
        this.w = o50.Q(false);
        this.x = new gsg(1.0f);
        this.y = o50.Q(false);
        this.v = new gsg(1.0f);
        this.z = o50.Q(false);
        this.A = o50.Q(new jeo(jeo.b));
        this.B = o50.Q(false);
        this.C = o50.Q(new j86(j86.g));
    }
    
    public byl(final Context context) {
        this.w = context.getApplicationContext();
        this.x = f3c.o;
        this.y = null;
        this.v = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = new n3a();
    }
    
    public byl(final Context context, final rxl y, final String v, final boolean b) {
        final xzj x = new xzj((byte)10);
        this.B = new hdk(this);
        this.C = new gfk(this);
        final xzj xzj = new xzj(this);
        this.w = context.getSharedPreferences("siftscience", 0);
        this.x = x;
        this.y = y;
        if (b) {
            this.v = v;
        }
        this.z = new HashMap();
        this.A = new kyo(x, xzj);
        x.g((Runnable)new ayl(this, b));
    }
    
    public byl(final fz6 w, final ife x, final frd y, final l0 v, final bx7 z) {
        final goi v2 = hoi.v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.v = v;
        this.z = z;
        this.A = v2;
        this.B = new LinkedHashMap();
        this.C = new x8m();
    }
    
    public byl(final File file, final wo1 w, final vba x, final rjc y, final xa7 z, final String v) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.v = v;
        this.A = new File(file, "ndk_crash_reports_v2");
    }
    
    public byl(final jqc w, final a0 x, final fg4 y, final a0 v, final mlm z, final mlm a, final y4g b, final olm c) {
        final nlm c2 = nlm.C;
        this.w = w;
        this.x = x;
        this.y = y;
        this.v = v;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
    }
    
    public byl(final lti lti) {
        this.w = lti.a;
        final f3c b = lti.b;
        this.x = b;
        this.y = lti.c;
        this.v = lti.d;
        this.z = lti.e;
        this.A = lti.f;
        this.B = lti.g;
        final p3a n = b.n;
        n.getClass();
        this.C = new n3a(n);
    }
    
    public byl(final qnl qnl, final jta y, final jta v, final zta z, final lta a, final jta b, final lta c) {
        this.x = qnl;
        this.y = y;
        this.v = v;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.w = qnl;
    }
    
    public byl(final zn0 w, final zta x, final zta y, final zy3 v, final bua z, final lta a) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.v = v;
        this.z = z;
        this.A = a;
        this.B = new rfa(x.d(w.w, w.u()));
        final jta c = (jta)a.b(w.w);
        this.C = c;
        v.h((Object)w.w, (Object)null, (Object)(c != null));
    }
    
    public oti b() {
        final Context context = (Context)this.w;
        final f3c a = f3c.a((f3c)this.x, (hc7)null, new p3a(qt7.S((Map)((n3a)this.C).a)), 8191);
        Object o;
        if ((o = this.y) == null) {
            o = new l7n((jta)new geb((byte)15));
        }
        Object o2;
        if ((o2 = this.v) == null) {
            o2 = new l7n((jta)new h87((Object)this, (byte)18));
        }
        Object o3;
        if ((o3 = this.z) == null) {
            o3 = new l7n((jta)new geb((byte)16));
        }
        en9 w;
        if ((w = (en9)this.A) == null) {
            w = en9.w;
        }
        Object o4 = this.B;
        if (o4 == null) {
            final r89 v = r89.v;
            o4 = new se6((List)v, (List)v, (List)v, (List)v, (List)v);
        }
        return new oti(new lti(context, a, (d2d)o, (d2d)o2, (d2d)o3, w, (se6)o4));
    }
    
    @Override
    public boolean c(final String s, final lef lef) {
        Object o;
        if (s != null) {
            o = ((lta)this.A).b(new ChatId(s));
        }
        else {
            o = ((jta)this.B).a();
        }
        return (boolean)o;
    }
    
    public void d() {
        final File file = (File)this.A;
        final rjc rjc = (rjc)this.y;
        if (uoo.E(file, rjc)) {
            try {
                final File[] r = uoo.R(file, rjc);
                if (r != null) {
                    for (int length = r.length, i = 0; i < length; ++i) {
                        bea.e0(r[i]);
                    }
                }
            }
            finally {
                final Throwable t;
                c5q.F((rjc)this.y, 5, lq6.Y(qjc.w, qjc.x), (jta)new ap1((Object)this, (byte)4), t, 48);
            }
        }
    }
    
    @Override
    public int e(final String s, final lef lef) {
        int n;
        if (s != null) {
            n = 2131758505;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            return n;
        }
        final zta zta = (zta)this.z;
        Object o;
        if (s != null) {
            o = new ChatId(s);
        }
        else {
            o = null;
        }
        return ((Number)zta.d(o, lef)).intValue();
    }
    
    @Override
    public void f(final hx7 hx7) {
        ljq.D((Executor)this.w, "NDK crash report ", (rjc)this.y, (Runnable)new ab1((Object)this, (Object)hx7, (byte)11));
    }
    
    @Override
    public boolean g() {
        return (boolean)((jta)this.v).a();
    }
    
    public void i(final String s, final umi umi) {
        final HashMap hashMap = (HashMap)this.z;
        if (hashMap.get((Object)s) == null) {
            hashMap.put((Object)s, (Object)new wmi((String)null, (hdk)this.B, (gfk)this.C, umi));
            final StringBuilder sb = new StringBuilder("Created new ");
            sb.append(s);
            sb.append(" queue");
            Log.i("byl", sb.toString());
            return;
        }
        en9.q("Queue exists: ".concat(s));
    }
    
    @Override
    public boolean isVisible() {
        return (boolean)((jta)this.y).a();
    }
    
    public rxl j() {
        synchronized (this) {
            final rxl rxl = (rxl)this.y;
            if (rxl != null) {
                return rxl;
            }
            return this.n(((SharedPreferences)this.w).getString("config", (String)null));
        }
    }
    
    public void k(final kqf kqf, final kqf kqf2) {
        this.C = ((lta)this.A).b(kqf);
        Object o = this.B;
        final Object d = ((zta)this.x).d(kqf, ((zn0)this.w).u());
        final vzq vzq = (vzq)((rfa)o).b;
        synchronized (vzq) {
            ((rfa)o).c = d;
            final boolean a = ((rfa)o).a;
            boolean b = false;
            Label_0254: {
                if (a) {
                    monitorexit(vzq);
                    break Label_0254;
                }
                ((rfa)o).a = true;
                monitorexit(vzq);
                while (true) {
                    final vzq vzq2 = (vzq)((rfa)o).b;
                    synchronized (vzq2) {
                        final Object c = ((rfa)o).c;
                        final Map map = (Map)((rfa)o).d;
                        monitorexit(vzq2);
                        for (final Map$Entry map$Entry : map.entrySet()) {
                            final lta lta = (lta)map$Entry.getKey();
                            if (map$Entry.getValue()) {
                                lta.b(c);
                            }
                        }
                        monitorenter((vzq)((rfa)o).b);
                        Label_0298: {
                            try {
                                if (c == ((rfa)o).c) {
                                    ((rfa)o).a = false;
                                    monitorexit(vzq2);
                                    o = this.v;
                                    if (this.C != null) {
                                        b = true;
                                    }
                                    ((zy3)o).h((Object)kqf, (Object)kqf2, (Object)b);
                                    return;
                                }
                                continue;
                            }
                            finally {
                                break Label_0298;
                            }
                            continue;
                        }
                        monitorexit(vzq2);
                    }
                }
            }
        }
    }
    
    public void l(final bce bce, final int n) {
        if (bce.b()) {
            return;
        }
        bce.e(true);
        final bx7 bx7 = (bx7)this.z;
        final Map z = y5e.Z(new yog[] { new yog((Object)"attempts", (Object)bce.a()), new yog((Object)"retry_outcome", (Object)wbe.e(n)), new yog((Object)"variant", (Object)wbe.f(bce.d())) });
        final uhb uhb = (uhb)bx7;
        try {
            uhb.b.b("mcp_app.load_retry_result", z);
        }
        catch (final Exception ex) {
            uhb.a(ex, "rum");
        }
    }
    
    public void m(final int n, final ParsedContentBlockId parsedContentBlockId) {
        final ace ace = (ace)((x8m)this.C).remove((Object)parsedContentBlockId);
        if (ace != null) {
            ((bqc)ace.a()).g((CancellationException)null);
        }
        final bce bce = (bce)((Map)this.B).remove((Object)parsedContentBlockId);
        if (bce != null) {
            this.l(bce, n);
        }
    }
    
    public rxl n(final String s) {
        if (s == null) {
            rxl rxl;
            if ((rxl = (rxl)this.y) == null) {
                rxl = new rxl();
            }
            return rxl;
        }
        try {
            return (rxl)sxl.a.b((Class)rxl.class, s);
        }
        catch (final JsonSyntaxException ex) {
            rxl rxl2;
            if ((rxl2 = (rxl)this.y) == null) {
                rxl2 = new rxl();
            }
            return rxl2;
        }
    }
    
    public Object o(final boolean b, final m6n m6n) {
        ((lta)this.C).b(b);
        final Object a = qnl.a((qnl)this.x, Boolean.valueOf(b), m6n, 6);
        if (a == pc7.v) {
            return a;
        }
        return lqo.a;
    }
}
