import java.util.Map;
import com.anthropic.claude.chat.ChatScreenParams;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import com.anthropic.claude.types.strings.ElicitationId;
import androidx.concurrent.futures.b;
import android.net.NetworkCapabilities;
import java.util.LinkedHashMap;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.ConnectivityManager$NetworkCallback;
import android.os.Build$VERSION;
import android.net.NetworkRequest$Builder;

public final class o10 extends m6n implements zta
{
    public final Object A;
    public final byte w;
    public boolean x;
    public Object y;
    public Object z;
    
    public o10(final ata a, final s10 y, final f07 f07) {
        this.w = 23;
        this.A = a;
        this.y = y;
        super(2, f07);
    }
    
    public o10(final rv7 y, final yci yci, final zta z, final ot7 a, final f07 f07) {
        this.w = 13;
        this.y = y;
        this.z = z;
        this.A = a;
        super(2, f07);
    }
    
    public o10(final rv7 z, final zta a, final yci yci, final f07 f07) {
        this.w = 14;
        this.z = z;
        this.A = a;
        super(2, f07);
    }
    
    private final Object r(Object o) {
        final pc7 v = pc7.v;
        final boolean x = this.x;
        if (x) {
            if (!x) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(o);
        }
        else {
            vt4.g0(o);
            final jrh jrh = (jrh)this.y;
            final NetworkRequest a = ((fv6)this.z).a();
            final boolean b = false;
            NetworkRequest networkRequest;
            if ((networkRequest = a) == null) {
                final int a2 = ((fv6)this.z).a;
                if (a2 == 1) {
                    networkRequest = null;
                }
                else {
                    NetworkRequest$Builder networkRequest$Builder = new NetworkRequest$Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                    if (Build$VERSION.SDK_INT >= 30 && a2 == 6) {
                        networkRequest = networkRequest$Builder.addCapability(25).build();
                    }
                    else {
                        final int d = ge9.D(a2);
                        if (d != 2) {
                            if (d != 3) {
                                if (d == 4) {
                                    networkRequest$Builder = networkRequest$Builder.addTransportType(0);
                                }
                            }
                            else {
                                networkRequest$Builder = networkRequest$Builder.addCapability(18);
                            }
                        }
                        else {
                            networkRequest$Builder = networkRequest$Builder.addCapability(11);
                        }
                        networkRequest = networkRequest$Builder.build();
                    }
                }
            }
            if (networkRequest == null) {
                jrh.getClass();
                o1r.b((stk)jrh);
                return lqo.a;
            }
            final tt8 tt8 = new tt8((Object)rhc.G((oc7)jrh, null, 0, (zta)new frd((Object)this.A, (Object)jrh, (f07)null, (byte)5), 3), (Object)jrh, (byte)15);
            Label_0497: {
                if (Build$VERSION.SDK_INT >= 30) {
                    final isl a3 = isl.a;
                    final ConnectivityManager a4 = ((ltf)this.A).a;
                    a3.getClass();
                    final Object b2;
                    monitorenter(b2 = isl.b);
                    Label_0471: {
                        Label_0452: {
                            try {
                                final LinkedHashMap c = isl.c;
                                final boolean empty = ((Map)c).isEmpty();
                                ((Map)c).put((Object)tt8, (Object)networkRequest);
                                if (empty) {
                                    final krd c2 = krd.c();
                                    final int a5 = n4q.a;
                                    c2.getClass();
                                    a4.registerDefaultNetworkCallback((ConnectivityManager$NetworkCallback)a3);
                                    break Label_0452;
                                }
                            }
                            finally {
                                break Label_0471;
                            }
                            if (isl.e && isl.f != null) {
                                final krd c3 = krd.c();
                                final int a6 = n4q.a;
                                c3.getClass();
                                final NetworkCapabilities d2 = isl.d;
                                final Boolean f = isl.f;
                                f.getClass();
                                int n = b ? 1 : 0;
                                if (!f) {
                                    n = (b ? 1 : 0);
                                    final NetworkRequest networkRequest2;
                                    if (p4.x(networkRequest2, d2)) {
                                        n = 1;
                                    }
                                }
                                if (n != 0) {
                                    o = kv6.a;
                                }
                                else {
                                    o = new lv6(7);
                                }
                                tt8.b(o);
                            }
                        }
                        monitorexit(b2);
                        o = new kkk((Object)tt8, (Object)a4, (byte)2);
                        break Label_0497;
                    }
                    monitorexit(b2);
                }
                else {
                    final int c4 = q8c.c;
                    o = c9r.b(((ltf)this.A).a, networkRequest, tt8);
                }
            }
            o = new v24((jta)o, (byte)7);
            this.x = true;
            if (uuj.U(jrh, (jta)o, this) == v) {
                return v;
            }
        }
        return lqo.a;
    }
    
    @Override
    public final f07 create(final Object y, final f07 f07) {
        final byte w = this.w;
        final Object o = null;
        final Object a = this.A;
        switch (w) {
            default: {
                return new o10(this.z, a, f07, (byte)29);
            }
            case 28: {
                final o10 o2 = new o10(this.z, a, f07, (byte)28);
                o2.y = y;
                return o2;
            }
            case 27: {
                final o10 o3 = new o10(this.z, a, f07, (byte)27);
                o3.y = y;
                return o3;
            }
            case 26: {
                return new o10(this.y, this.z, a, f07, (byte)26);
            }
            case 25: {
                final o10 o4 = new o10(this.z, a, f07, (byte)25);
                o4.y = y;
                return o4;
            }
            case 24: {
                return new o10((byte)24, f07, a);
            }
            case 23: {
                final o10 o5 = new o10((ata)a, (s10)this.y, f07);
                o5.z = y;
                return o5;
            }
            case 22: {
                return new o10(this.y, this.z, a, f07, (byte)22);
            }
            case 21: {
                final o10 o6 = new o10((byte)21, f07, a);
                o6.z = ((pg3)y).a;
                return o6;
            }
            case 20: {
                final o10 o7 = new o10(this.z, a, f07, (byte)20);
                o7.y = y;
                return o7;
            }
            case 19: {
                return new o10(this.y, this.z, a, f07, (byte)19);
            }
            case 18: {
                final o10 o8 = new o10((byte)18, f07, a);
                final ElicitationId elicitationId = (ElicitationId)y;
                Object a2 = o;
                if (elicitationId != null) {
                    a2 = elicitationId.a;
                }
                o8.z = a2;
                return o8;
            }
            case 17: {
                return new o10(this.y, this.z, a, f07, (byte)17);
            }
            case 16: {
                final o10 o9 = new o10(this.z, a, f07, (byte)16);
                o9.y = y;
                return o9;
            }
            case 15: {
                final o10 o10 = new o10(this.z, a, f07, (byte)15);
                o10.y = y;
                return o10;
            }
            case 14: {
                final o10 o11 = new o10((rv7)this.z, (zta)a, null, f07);
                o11.y = y;
                return o11;
            }
            case 13: {
                return new o10((rv7)this.y, null, (zta)this.z, (ot7)a, f07);
            }
            case 12: {
                return new o10(this.y, this.z, a, f07, (byte)12);
            }
            case 11: {
                final o10 o12 = new o10(this.z, a, f07, (byte)11);
                o12.y = y;
                return o12;
            }
            case 10: {
                final o10 o13 = new o10(this.z, a, f07, (byte)10);
                o13.y = y;
                return o13;
            }
            case 9: {
                final o10 o14 = new o10(this.z, a, f07, (byte)9);
                o14.y = y;
                return o14;
            }
            case 8: {
                final o10 o15 = new o10(this.z, a, f07, (byte)8);
                o15.y = y;
                return o15;
            }
            case 7: {
                return new o10(this.y, this.z, a, f07, (byte)7);
            }
            case 6: {
                final o10 o16 = new o10(this.z, a, f07, (byte)6);
                o16.y = y;
                return o16;
            }
            case 5: {
                final o10 o17 = new o10(this.z, a, f07, (byte)5);
                o17.y = y;
                return o17;
            }
            case 4: {
                final o10 o18 = new o10(this.z, a, f07, (byte)4);
                o18.y = y;
                return o18;
            }
            case 3: {
                return new o10(this.y, this.z, a, f07, (byte)3);
            }
            case 2: {
                final o10 o19 = new o10(this.z, a, f07, (byte)2);
                o19.y = y;
                return o19;
            }
            case 1: {
                final o10 o20 = new o10(this.z, a, f07, (byte)1);
                o20.y = y;
                return o20;
            }
            case 0: {
                return new o10(this.y, this.z, a, f07, (byte)0);
            }
        }
    }
    
    @Override
    public final Object d(Object a, Object o) {
        final byte w = this.w;
        final pc7 v = pc7.v;
        final lqo a2 = lqo.a;
        switch (w) {
            default: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 28: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 27: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 26: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 25: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 24: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 23: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 22: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 21: {
                a = ((pg3)a).a;
                final o10 o2 = new o10((byte)21, (f07)o, this.A);
                o2.z = a;
                return o2.invokeSuspend(a2);
            }
            case 20: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 19: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 18: {
                final ElicitationId elicitationId = (ElicitationId)a;
                final Object o3 = null;
                String a3;
                if (elicitationId != null) {
                    a3 = elicitationId.a;
                }
                else {
                    a3 = null;
                }
                final f07 f07 = (f07)o;
                o = o3;
                if (a3 != null) {
                    o = new ElicitationId(a3);
                }
                return ((o10)this.create(o, f07)).invokeSuspend(a2);
            }
            case 17: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 16: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 15: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 14: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 13: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 12: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 11: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 10: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 9: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 8: {
                ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
                return v;
            }
            case 7: {
                ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
                return v;
            }
            case 6: {
                ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
                return v;
            }
            case 5: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 4: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 3: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 2: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 1: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 0: {
                return ((o10)this.create(a, (f07)o)).invokeSuspend(a2);
            }
        }
    }
    
    @Override
    public final Object invokeSuspend(Object v) {
        final byte w = this.w;
        final Object o = null;
        final Object o2 = null;
        final Object o3 = null;
        final Object o4 = null;
        final Object o5 = null;
        final Object o6 = null;
        final Object o7 = null;
        final Object o8 = null;
        final Object o9 = null;
        final Object o10 = null;
        final Object o11 = null;
        final Object o12 = null;
        final Object o13 = null;
        final Object o14 = null;
        final Object o15 = null;
        final Object o16 = null;
        final lqo lqo = null;
        en2 z = null;
        final Object o17 = null;
        final Object o18 = null;
        final Object o19 = null;
        final Object o20 = null;
        final lqo lqo2 = null;
        final Object o21 = null;
        final Object o22 = null;
        final Object o23 = null;
        switch (w) {
            default: {
                final pc7 v2 = pc7.v;
                final boolean x = this.x;
                b4j y;
                if (x) {
                    if (!x) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o23;
                    }
                    y = (b4j)this.y;
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    y = (b4j)this.z;
                    final sfh sfh = (sfh)this.A;
                    this.y = y;
                    this.x = true;
                    if ((v = sfh.a((h07)this)) == v2) {
                        return v2;
                    }
                }
                y.v = v;
                return lqo.a;
            }
            case 28: {
                return this.r(v);
            }
            case 27: {
                final jja jja = (jja)this.y;
                final pc7 v3 = pc7.v;
                final boolean x2 = this.x;
                Label_0485: {
                    if (x2) {
                        if (x2) {
                            vt4.g0(v);
                            break Label_0485;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o;
                    }
                    vt4.g0(v);
                    final Object b = new Object();
                    final jge jge = (jge)this.z;
                    synchronized (jge) {
                        jge.b = b;
                        jge.a = null;
                        monitorexit(jge);
                        final n6k n6k = (n6k)this.A;
                        final te0 te0 = new te0(this.z, jja, b, (byte)7);
                        this.y = null;
                        this.x = true;
                        Object a2;
                        if (n6k.a((jja)te0, (f07)this) == v3) {
                            a2 = v3;
                        }
                        else {
                            a2 = lqo.a;
                        }
                        return a2;
                    }
                }
            }
            case 26: {
                final pc7 v4 = pc7.v;
                final boolean x3 = this.x;
                if (x3) {
                    if (!x3) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o2;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final m9e m9e = new m9e(((Number)((erd)this.y).a()).longValue(), (jta)new kr(0, this.z, f60.class, "getUptimeMillis", "getUptimeMillis()J", 0, (byte)24));
                    final ija c = ((ede)this.A).c;
                    this.x = true;
                    if (qt7.k(m9e, c, this) == v4) {
                        return v4;
                    }
                }
                return lqo.a;
            }
            case 25: {
                final b b2 = (b)this.A;
                final pc7 v5 = pc7.v;
                final boolean x4 = this.x;
                if (x4 && x4) {
                    try {
                        vt4.g0(v);
                        goto Label_0740;
                    }
                    catch (final CancellationException ex) {
                        b2.d = true;
                        final t03 b3 = b2.b;
                        if (b3 != null && ((b3)b3.w).cancel(true)) {
                            b2.a = null;
                            b2.b = null;
                            b2.c = null;
                        }
                    }
                    finally {
                        goto Label_0749;
                    }
                    return lqo.a;
                }
                goto Label_0687;
            }
            case 24: {
                final pc7 v6 = pc7.v;
                final boolean x5 = this.x;
                Label_0886: {
                    if (!x5) {
                        break Label_0886;
                    }
                    Label_0875: {
                        if (!x5) {
                            break Label_0875;
                        }
                        en2 en2 = (en2)this.z;
                        Object o25;
                        final Object o24 = o25 = this.y;
                        Label_0979: {
                            try {
                                vt4.g0(v);
                                o25 = v;
                                v = o24;
                                final Object o26 = o25;
                                break Label_0979;
                            }
                            finally {
                                try {}
                                finally {
                                    vt4.s((xd3)o25, (Throwable)v);
                                }
                            Block_138_Outer:
                                while (true) {
                                    Object c2 = null;
                                    this.y = c2;
                                    this.z = z;
                                    this.x = true;
                                    final Object b4 = z.b((f07)this);
                                    en2 = z;
                                    v = c2;
                                    final Object o26;
                                    iftrue(Label_0979:)((o26 = b4) != v6);
                                    return v6;
                                Label_1113:
                                    while (true) {
                                        final lqo lqo3 = (lqo)en2.c();
                                        d3b.b.set(false);
                                        c2 = g8m.c;
                                        final Object o27;
                                        synchronized (o27 = c2) {
                                            final umf h = ((zmf)g8m.j).h;
                                            final boolean b5 = h != null && h.h();
                                            monitorexit(o27);
                                            z = en2;
                                            c2 = v;
                                            if (b5) {
                                                g8m.c();
                                                z = en2;
                                                c2 = v;
                                            }
                                            continue Block_138_Outer;
                                        }
                                        break Label_1113;
                                        iftrue(Label_1113:)(!(boolean)o26);
                                        continue;
                                    }
                                    ((xd3)v).g((CancellationException)null);
                                    return lqo.a;
                                    a4 = v6;
                                    return a4;
                                    en9.q("call to 'resume' before 'invoke' with coroutine");
                                    a4 = o3;
                                    return a4;
                                    vt4.g0(v);
                                    c2 = this.A;
                                    z = new en2((mn2)c2);
                                    continue Block_138_Outer;
                                }
                            }
                        }
                    }
                }
            }
            case 23: {
                final long a5 = ((ata)this.A).a;
                final pc7 v7 = pc7.v;
                final boolean x6 = this.x;
                oc7 z2;
                if (x6) {
                    if (!x6) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o4;
                    }
                    final oc7 oc7 = (oc7)this.z;
                    vt4.g0(v);
                    z2 = oc7;
                }
                else {
                    vt4.g0(v);
                    z2 = (oc7)this.z;
                    if (a5 <= 0L) {
                        return lqo.a;
                    }
                }
                while (ien.y(z2)) {
                    ((s10)this.y).d().b((lta)n10.x);
                    this.z = z2;
                    this.x = true;
                    if (ach.A(a5, (f07)this) == v7) {
                        return v7;
                    }
                }
                return lqo.a;
            }
            case 22: {
                final pc7 v8 = pc7.v;
                final boolean x7 = this.x;
                if (x7) {
                    if (!x7) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o5;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final llf llf = (llf)this.y;
                    final ima ima = (ima)this.z;
                    this.x = true;
                    if (llf.a((eic)ima, (f07)this) == v8) {
                        return v8;
                    }
                }
                final dq8 dq8 = (dq8)this.A;
                if (dq8 != null) {
                    dq8.a();
                }
                return lqo.a;
            }
            case 21: {
                final Object z3 = this.z;
                final pc7 v9 = pc7.v;
                final boolean x8 = this.x;
                if (x8) {
                    if (!x8) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o6;
                    }
                    final Object y2 = this.y;
                    vt4.g0(v);
                    v = y2;
                }
                else {
                    vt4.g0(v);
                    final jja jja2 = (jja)this.A;
                    v = z3;
                    if (!(z3 instanceof og3)) {
                        this.z = null;
                        this.y = z3;
                        this.x = true;
                        v = z3;
                        if (jja2.l(z3, this) == v9) {
                            return v9;
                        }
                    }
                }
                Object o28;
                if (v instanceof ng3) {
                    final Throwable a8 = pg3.a(v);
                    if (a8 != null) {
                        throw a8;
                    }
                    o28 = Boolean.FALSE;
                }
                else {
                    o28 = Boolean.TRUE;
                }
                return o28;
            }
            case 20: {
                final oc7 oc8 = (oc7)this.y;
                final pc7 v10 = pc7.v;
                final boolean x9 = this.x;
                if (x9) {
                    if (!x9) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o7;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final bua bua = (bua)this.z;
                    final jja jja3 = (jja)this.A;
                    this.y = null;
                    this.x = true;
                    if (bua.h(oc8, jja3, this) == v10) {
                        return v10;
                    }
                }
                return lqo.a;
            }
            case 19: {
                final lqo a10 = lqo.a;
                final fao fao = (fao)this.y;
                final pc7 v11 = pc7.v;
                final boolean x10 = this.x;
                Label_1736: {
                    if (x10) {
                        if (x10) {
                            vt4.g0(v);
                            break Label_1736;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o8;
                    }
                    else {
                        vt4.g0(v);
                        if (fao != null) {
                            this.x = true;
                            if (ach.A(350L, (f07)this) == v11) {
                                return v11;
                            }
                            break Label_1736;
                        }
                    }
                    return a10;
                }
                final bnf bnf = (bnf)this.A;
                final boolean e = fao.e();
                final hng a11 = rz9.a;
                bnf.setValue((Object)(e ^ true));
                ((lta)this.z).b(fao);
                return a10;
            }
            case 18: {
                final String s = (String)this.z;
                final pc7 v12 = pc7.v;
                final boolean x11 = this.x;
                ah8 y3;
                if (x11) {
                    if (!x11) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o9;
                    }
                    y3 = (ah8)this.y;
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    if (s == null) {
                        return lqo.a;
                    }
                    y3 = (ah8)this.A;
                    this.z = null;
                    this.y = y3;
                    this.x = true;
                    y3.getClass();
                    if ((v = niq.r("session step-up biometric check", (Object)Boolean.FALSE, lpl.w, (lta)new vg8(y3, (f07)null, (byte)3), (h07)this)) == v12) {
                        return v12;
                    }
                }
                final Boolean value = (Boolean)v;
                value.getClass();
                y3.k.setValue((Object)value);
                return lqo.a;
            }
            case 17: {
                final pc7 v13 = pc7.v;
                final boolean x12 = this.x;
                if (x12) {
                    if (!x12) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o10;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final r68 r68 = (r68)this.y;
                    final ynf c3 = r68.c;
                    final q68 b6 = r68.b;
                    final lnf lnf = (lnf)this.z;
                    final o10 o30 = new o10(r68, this.A, null, (byte)16);
                    this.x = true;
                    c3.getClass();
                    if (ien.m((f07)this, (zta)new cw7(lnf, c3, (zta)o30, (Object)b6, (f07)null)) == v13) {
                        return v13;
                    }
                }
                return lqo.a;
            }
            case 16: {
                final ksg d = ((r68)this.z).d;
                final pc7 v14 = pc7.v;
                final boolean x13 = this.x;
                Label_2209: {
                    if (x13) {
                        Label_2142: {
                            if (x13) {
                                Label_2223: {
                                    try {
                                        vt4.g0(v);
                                        break Label_2209;
                                    }
                                    finally {
                                        break Label_2223;
                                    }
                                    break Label_2142;
                                }
                                d.setValue((Object)Boolean.FALSE);
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o11;
                    }
                    vt4.g0(v);
                    final tfk tfk = (tfk)this.y;
                    d.setValue((Object)Boolean.TRUE);
                    final zta zta = (zta)this.A;
                    this.x = true;
                    v = zta.d(tfk, this);
                    if (v == v14) {
                        return v14;
                    }
                }
                d.setValue((Object)Boolean.FALSE);
                return lqo.a;
            }
            case 15: {
                final deo deo = (deo)this.y;
                final pc7 v15 = pc7.v;
                final boolean x14 = this.x;
                if (x14) {
                    if (!x14) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o12;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final beo w2 = beo.w;
                    final av7 av7 = new av7((Object)this.z, (Object)this.A, (f07)null, (byte)1);
                    this.y = null;
                    this.x = true;
                    if (deo.d(w2, (zta)av7, (f07)this) == v15) {
                        return v15;
                    }
                }
                return lqo.a;
            }
            case 14: {
                final rv7 rv7 = (rv7)this.z;
                final oc7 oc9 = (oc7)this.y;
                final pc7 v16 = pc7.v;
                final boolean x15 = this.x;
                if (x15) {
                    if (x15) {
                        vt4.g0(v);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = o13;
                    }
                }
                else {
                    vt4.g0(v);
                    final vc6 c4 = soh.c();
                    final zta zta2 = (zta)this.A;
                    vom v17 = rv7.h.v();
                    if (v17 instanceof ot7) {
                        v17 = new vom(((vom)v17).a);
                    }
                    final o1f o1f = new o1f(zta2, c4, v17, oc9.getCoroutineContext(), (yci)null);
                    final c2l l = rv7.l;
                    final Object e2 = ((stk)l.y).e((Object)o1f);
                    if (e2 instanceof ng3) {
                        if ((v = pg3.a(e2)) == null) {
                            v = new ClosedSendChannelException("Channel was closed normally");
                        }
                        throw v;
                    }
                    if (!(e2 instanceof og3)) {
                        if (((AtomicInteger)((v2b)l.z).w).getAndIncrement() == 0) {
                            rhc.G((oc7)l.w, null, 0, (zta)new xb0((byte)5, (f07)null, (Object)l), 3);
                        }
                        this.y = null;
                        this.x = true;
                        v = ((bqc)c4).r((f07)this);
                        if (v == v16) {
                            v = v16;
                        }
                    }
                    else {
                        en9.q("Check failed.");
                        v = o13;
                    }
                }
                return v;
            }
            case 13: {
                final pc7 v18 = pc7.v;
                final boolean x16 = this.x;
                if (x16) {
                    if (x16) {
                        vt4.g0(v);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                    }
                }
                else {
                    vt4.g0(v);
                    this.y.getClass();
                    final pp0 pp0 = new pp0((Object)this.z, (Object)this.A, (f07)null, (byte)4);
                    this.x = true;
                    if ((v = zn2.R("DataStore.transform", null, (lta)pp0, this)) == v18) {
                        v = v18;
                    }
                }
                return v;
            }
            case 12: {
                final yw4 yw4 = (yw4)this.y;
                final pc7 v19 = pc7.v;
                final boolean x17 = this.x;
                if (x17) {
                    if (!x17) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o14;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final xw4 xw4 = new xw4((Object)yw4, (Object)this.z, (Object)this.A, (f07)null, (byte)0);
                    this.x = true;
                    if (omo.d0((zta)xw4, this) == v19) {
                        return v19;
                    }
                }
                ((u2b)yw4.g).i("mobile_global_aa", JsonObject.Companion.serializer(), lpl.x);
                return lqo.a;
            }
            case 11: {
                final t2k t2k = (t2k)this.y;
                final pc7 v20 = pc7.v;
                final boolean x18 = this.x;
                if (x18) {
                    if (!x18) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o15;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final jmq b7 = ((kx3)this.z).b;
                    final List list = (List)this.A;
                    this.y = null;
                    this.x = true;
                    if (b7.H(t2k, (Iterable)list, (h07)this) == v20) {
                        return v20;
                    }
                }
                return lqo.a;
            }
            case 10: {
                final nmd a18 = nmd.a;
                final oc4 oc10 = (oc4)this.z;
                final ChatScreenParams w3 = oc10.w;
                final l7n t3 = oc10.t3;
                final fz6 v21 = ((tvj)oc10).v;
                final oc7 oc11 = (oc7)this.y;
                final pc7 v22 = pc7.v;
                final boolean x19 = this.x;
                if (x19) {
                    if (!x19) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o16;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    x90.E(new wja((ija)ljq.a0((jta)new kn3(oc10, (byte)0)), (zta)new rf0((byte)3, (f07)null, (Object)oc10), (byte)3), oc11);
                    x90.E(new wja((ija)new cd0((ija)ljq.a0((jta)new kn3(oc10, (byte)1)), (byte)3), (zta)new ln3(oc10, (f07)null, (byte)0), (byte)3), oc11);
                    x90.E(new wja((ija)new jn3(ljq.a0((jta)new fn3(oc10, (byte)0)), (byte)0), (zta)new mn3(oc10, (f07)null, (byte)0), (byte)3), oc11);
                    x90.E(new wja((ija)ljq.a0((jta)new fn3(oc10, (byte)1)), (zta)new mn3(oc10, (f07)null, (byte)1), (byte)3), oc11);
                    if (!oc10.O3) {
                        oc10.O3 = true;
                        final g67 o31 = oc10.O0();
                        if (o31.l == null) {
                            o31.l = rhc.G((oc7)o31.f, null, 0, new pn((byte)7, null, o31), 3);
                        }
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)23), 3);
                        final r27 c5 = oc10.v0().c;
                        final gfk i = ((lum)t3.getValue()).l;
                        c5.n = i;
                        if (c5.o) {
                            final lum lum = (lum)i.v;
                            rhc.G((oc7)lum.k, null, 0, (zta)new kum(lum, (f07)null, (byte)1), 3);
                        }
                        rhc.G((oc7)v21, null, 0, (zta)new xb0((byte)1, (f07)null, (Object)oc10), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)9), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)10), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)11), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new na4(oc10, (f07)null, (byte)1), 3);
                        if (oc10.E0()) {
                            rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)28), 3);
                        }
                        if (oc10.E0()) {
                            rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)26), 3);
                        }
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)12), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)13), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new zb4(oc10, (f07)null, (byte)1), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new na4(oc10, (f07)null, (byte)8), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new na4(oc10, (f07)null, (byte)4), 3);
                        final lum lum2 = (lum)t3.getValue();
                        final fz6 k = lum2.k;
                        final fz6 j = lum2.k;
                        rhc.G((oc7)k, null, 0, (zta)new gum(lum2, (f07)null, (byte)2), 3);
                        rhc.G((oc7)j, null, 0, (zta)new gum(lum2, (f07)null, (byte)0), 3);
                        rhc.G((oc7)j, null, 0, (zta)new gum(lum2, (f07)null, (byte)1), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)21), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)22), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)14), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)24), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new kb4(oc10, (f07)null, (byte)1), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)25), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new kb4(oc10, (f07)null, (byte)0), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)20), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)15), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)16), 3);
                        rhc.G((oc7)v21, (hc7)((y38)oc10.D0).a(), 0, (zta)new mn3(oc10, (f07)null, (byte)19), 2);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)17), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new mn3(oc10, (f07)null, (byte)18), 3);
                        rhc.G((oc7)v21, null, 0, (zta)new eb4(oc10, (f07)null), 3);
                    }
                    if (oc10.x4) {
                        if (!oc10.y4) {
                            oc10.y4 = true;
                            rhc.G((oc7)v21, null, 0, (zta)new na4(oc10, (f07)null, (byte)5), 3);
                        }
                    }
                    final dho s2 = oc10.s4;
                    if (!s2.a) {
                        s2.a = true;
                        rhc.G((oc7)s2.b, null, 0, new l10((byte)1, null, s2), 3);
                    }
                    final ah8 u3 = oc10.U3;
                    final wmm m = u3.j;
                    final fz6 f = u3.f;
                    if (m == null) {
                        u3.j = x90.E(new wja((ija)new cd0((ija)ljq.a0((jta)new og8(u3, (byte)0)), (byte)3), (zta)new zg8(2, (Object)u3, (Class)ah8.class, "onAskShown", "onAskShown(Lcom/anthropic/claude/conversation/model/Elicitation$DeviceStepUp;)V", 4, (byte)0), (byte)3), (oc7)f);
                    }
                    if (u3.l == null) {
                        u3.l = rhc.G((oc7)f, null, 0, new pn((byte)11, null, u3), 3);
                    }
                    if (!oc10.x0()) {
                        rhc.G((oc7)v21, null, 0, (zta)new g24((Object)new fn3(oc10, (byte)19), (Object)oc10, (f07)null, (byte)4), 3);
                    }
                    if (oc10.T0 && !oc10.Y3) {
                        oc10.Y3 = true;
                        oc10.v0().o((pmd)a18);
                    }
                    else if (!w3.c && !oc10.L.h.m(oc10.q1)) {
                        oc10.Y3 = true;
                        oc10.v0().o((pmd)a18);
                    }
                    else if ((oc10.p1() || w3.k != null) && !oc10.Y3) {
                        oc10.c0();
                    }
                    else if (!oc10.n1()) {
                        if (!oc10.A0()) {
                            if (oc10.p1()) {
                                oc10.c0();
                            }
                            else {
                                oc10.v0().o((pmd)a18);
                            }
                        }
                    }
                    final kt8 kt8 = (kt8)this.A;
                    this.y = null;
                    this.x = true;
                    if (qt7.O(oc10, kt8, this) == v22) {
                        return v22;
                    }
                }
                return lqo.a;
            }
            case 9: {
                final lqo a20 = lqo.a;
                final oc7 oc12 = (oc7)this.y;
                final pc7 v23 = pc7.v;
                final boolean x20 = this.x;
                if (x20) {
                    if (!x20) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return lqo;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final jja jja4 = (jja)this.z;
                    final xd3 h2 = ((cf3)this.A).h(oc12);
                    this.y = null;
                    this.x = true;
                    v = xp7.y(jja4, h2, true, this);
                    if (v != v23) {
                        v = a20;
                    }
                    if (v == v23) {
                        return v23;
                    }
                }
                return a20;
            }
            case 8: {
                final pc7 v24 = pc7.v;
                final boolean x21 = this.x;
                if (x21) {
                    if (!x21) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return z;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final bd3 bd3 = new bd3((ubh)this.y, new AtomicReference((Object)null), (cd3)this.A);
                    final zta zta3 = (zta)this.z;
                    this.x = true;
                    if (zta3.d(bd3, this) == v24) {
                        return v24;
                    }
                }
                ebq.a();
                return z;
            }
            case 7: {
                final pc7 v25 = pc7.v;
                final boolean x22 = this.x;
                if (x22) {
                    if (!x22) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o17;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final n6k a21 = ljq.a0((jta)new p1((Object)this.y, (byte)9));
                    final o10 o35 = new o10(this.z, this.A, null, (byte)6);
                    this.x = true;
                    if (x90.r((ija)a21, o35, this) == v25) {
                        return v25;
                    }
                }
                en9.q("Interceptors flow should never terminate.");
                return o17;
            }
            case 6: {
                final pc7 v26 = pc7.v;
                final boolean x23 = this.x;
                Object o36;
                if (x23) {
                    if (x23) {
                        throw ge9.w(v);
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    o36 = o18;
                }
                else {
                    vt4.g0(v);
                    final zz3 zz3 = (zz3)this.y;
                    final obh obh = (obh)this.z;
                    final ubh ubh = (ubh)this.A;
                    this.x = true;
                    zz3.a(obh, ubh, (h07)this);
                    o36 = v26;
                }
                return o36;
            }
            case 5: {
                final t2k t2k2 = (t2k)this.y;
                final pc7 v27 = pc7.v;
                final boolean x24 = this.x;
                if (x24) {
                    if (!x24) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o19;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final jmq b8 = ((ix2)this.z).b;
                    final ArrayList list2 = (ArrayList)this.A;
                    this.y = null;
                    this.x = true;
                    if (b8.H(t2k2, (Iterable)list2, (h07)this) == v27) {
                        return v27;
                    }
                }
                return lqo.a;
            }
            case 4: {
                final t2k t2k3 = (t2k)this.y;
                final pc7 v28 = pc7.v;
                final boolean x25 = this.x;
                if (x25) {
                    if (!x25) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o20;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final jmq b9 = ((ow2)this.z).b;
                    final ArrayList list3 = (ArrayList)this.A;
                    this.y = null;
                    this.x = true;
                    if (b9.H(t2k3, (Iterable)list3, (h07)this) == v28) {
                        return v28;
                    }
                }
                return lqo.a;
            }
            case 3: {
                final lqo a24 = lqo.a;
                final vl2 vl2 = (vl2)this.y;
                final pc7 v29 = pc7.v;
                final boolean x26 = this.x;
                if (x26) {
                    if (!x26) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return lqo2;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final px6 j2 = vl2.J;
                    final tl2 tl2 = new tl2(vl2, (yxf)this.z, (jd0)this.A);
                    this.x = true;
                    j2.getClass();
                    final k2j k2j = (k2j)tl2.a();
                    Label_5596: {
                        if (k2j != null && !px6.q1(j2, k2j, 0L, 0L, 3)) {
                            final l13 l2 = new l13(1, ljq.K(this));
                            l2.r();
                            final mx6 mx6 = new mx6(tl2, l2);
                            final j9j o38 = j2.O;
                            final inf inf = (inf)o38.w;
                            final k2j k2j2 = (k2j)tl2.a();
                            if (k2j2 == null) {
                                l2.resumeWith((Object)a24);
                            }
                            else {
                                l2.v((lta)new y((Object)o38, (Object)mx6, (byte)24));
                                final xgc t4 = ncq.T(0, inf.x);
                                final int v30 = ((vgc)t4).v;
                                int w4 = ((vgc)t4).w;
                                Label_5566: {
                                    if (v30 <= w4) {
                                        while (true) {
                                            final k2j k2j3 = (k2j)((mx6)inf.v[w4]).a.a();
                                            if (k2j3 != null) {
                                                final k2j i2 = k2j2.i(k2j3);
                                                if (i2.equals((Object)k2j2)) {
                                                    inf.a(w4 + 1, (Object)mx6);
                                                    break Label_5566;
                                                }
                                                if (!i2.equals((Object)k2j3)) {
                                                    final CancellationException ex2 = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                                    int n = inf.x - 1;
                                                    if (n <= w4) {
                                                        while (true) {
                                                            ((mx6)inf.v[w4]).b.u((Throwable)ex2);
                                                            if (n == w4) {
                                                                break;
                                                            }
                                                            ++n;
                                                        }
                                                    }
                                                }
                                            }
                                            if (w4 == v30) {
                                                break;
                                            }
                                            --w4;
                                        }
                                    }
                                    inf.a(0, (Object)mx6);
                                }
                                if (!j2.R) {
                                    j2.r1(0L);
                                }
                            }
                            v = l2.p();
                            if (v == v29) {
                                break Label_5596;
                            }
                        }
                        v = a24;
                    }
                    if (v == v29) {
                        return v29;
                    }
                }
                return a24;
            }
            case 2: {
                final List list4 = (List)this.y;
                final pc7 v31 = pc7.v;
                final boolean x27 = this.x;
                if (x27) {
                    if (x27) {
                        vt4.g0(v);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                    }
                }
                else {
                    vt4.g0(v);
                    final u4g i3 = ((com.anthropic.claude.core.events.b)this.z).i;
                    final ao9 ao9 = (ao9)this.A;
                    this.y = null;
                    this.x = true;
                    if ((v = i3.h((Object)ao9, (Object)list4, (Object)this)) == v31) {
                        v = v31;
                    }
                }
                return v;
            }
            case 1: {
                final efo efo = (efo)this.z;
                final pc7 v32 = pc7.v;
                final boolean x28 = this.x;
                if (x28) {
                    if (!x28) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o21;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final irh irh = (irh)this.y;
                    final n6k a26 = ljq.a0(new ve(efo, (byte)3));
                    final te0 te2 = new te0(irh, efo, this.A, (byte)0);
                    this.x = true;
                    if (a26.a((jja)te2, (f07)this) == v32) {
                        return v32;
                    }
                }
                return lqo.a;
            }
            case 0: {
                final pc7 v33 = pc7.v;
                final boolean x29 = this.x;
                if (x29) {
                    if (!x29) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o22;
                    }
                    vt4.g0(v);
                }
                else {
                    vt4.g0(v);
                    final xtm xtm = (xtm)((s10)this.y).w.w;
                    final String a28 = (String)this.z;
                    final JsonObject b10 = (JsonObject)this.A;
                    v = new Object();
                    ((j2p)v).a = a28;
                    ((j2p)v).b = b10;
                    final us4 a29 = v4j.a((Class)k2p.class);
                    this.x = true;
                    if (xtm.b((qa)v, a29, (h07)this) == v33) {
                        return v33;
                    }
                }
                return lqo.a;
            }
        }
    }
}
