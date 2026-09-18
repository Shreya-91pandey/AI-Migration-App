import com.anthropic.claude.chat.input.draft.DraftMessage;
import java.util.List;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.AppStartEvents$PlatformCapabilities;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.io.InputStream;
import kotlinx.serialization.json.JsonObject;
import java.util.ArrayList;
import com.segment.analytics.kotlin.core.BaseEvent;

public final class p10 extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public Object y;
    public final Object z;
    
    public p10(final BaseEvent z, final s10 y, final f07 f07) {
        this.w = 1;
        this.z = z;
        this.y = y;
        super(2, f07);
    }
    
    public p10(final f07 f07, final lta z) {
        this.w = 19;
        this.z = z;
        super(2, f07);
    }
    
    public p10(final rv7 y, final yci yci, final uy7 z, final f07 f07) {
        this.w = 22;
        this.y = y;
        this.z = z;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final Object z = this.z;
        switch (w) {
            default: {
                return (f07)new p10(this.y, z, f07, (byte)29);
            }
            case 28: {
                return (f07)new p10(this.y, z, f07, (byte)28);
            }
            case 27: {
                return (f07)new p10(this.y, z, f07, (byte)27);
            }
            case 26: {
                final p10 p2 = new p10((byte)26, f07, z);
                p2.y = o;
                return (f07)p2;
            }
            case 25: {
                final p10 p3 = new p10((byte)25, f07, z);
                p3.y = o;
                return (f07)p3;
            }
            case 24: {
                return (f07)new p10(this.y, z, f07, (byte)24);
            }
            case 23: {
                final p10 p4 = new p10((byte)23, f07, z);
                p4.y = o;
                return (f07)p4;
            }
            case 22: {
                return (f07)new p10((rv7)this.y, null, (uy7)z, f07);
            }
            case 21: {
                final p10 p5 = new p10((byte)21, f07, z);
                p5.y = o;
                return (f07)p5;
            }
            case 20: {
                return (f07)new p10(this.y, z, f07, (byte)20);
            }
            case 19: {
                final p10 p6 = new p10(f07, (lta)z);
                p6.y = o;
                return (f07)p6;
            }
            case 18: {
                return (f07)new p10(this.y, z, f07, (byte)18);
            }
            case 17: {
                return (f07)new p10(this.y, z, f07, (byte)17);
            }
            case 16: {
                return (f07)new p10(this.y, z, f07, (byte)16);
            }
            case 15: {
                return (f07)new p10(this.y, z, f07, (byte)15);
            }
            case 14: {
                return (f07)new p10((byte)14, f07, z);
            }
            case 13: {
                return (f07)new p10(this.y, z, f07, (byte)13);
            }
            case 12: {
                final p10 p7 = new p10((byte)12, f07, z);
                p7.y = o;
                return (f07)p7;
            }
            case 11: {
                return (f07)new p10(this.y, z, f07, (byte)11);
            }
            case 10: {
                final p10 p8 = new p10((byte)10, f07, z);
                p8.y = o;
                return (f07)p8;
            }
            case 9: {
                final p10 p9 = new p10((byte)9, f07, z);
                p9.y = o;
                return (f07)p9;
            }
            case 8: {
                return (f07)new p10(this.y, z, f07, (byte)8);
            }
            case 7: {
                final p10 p10 = new p10((byte)7, f07, z);
                p10.y = o;
                return (f07)p10;
            }
            case 6: {
                return (f07)new p10(this.y, z, f07, (byte)6);
            }
            case 5: {
                return (f07)new p10(this.y, z, f07, (byte)5);
            }
            case 4: {
                return (f07)new p10(this.y, z, f07, (byte)4);
            }
            case 3: {
                return (f07)new p10(this.y, z, f07, (byte)3);
            }
            case 2: {
                final p10 p11 = new p10((byte)2, f07, z);
                p11.y = o;
                return (f07)p11;
            }
            case 1: {
                return (f07)new p10((BaseEvent)z, (s10)this.y, f07);
            }
            case 0: {
                return (f07)new p10(this.y, z, f07, (byte)0);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final pc7 v = pc7.v;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 28: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 27: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 26: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 25: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 24: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 23: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 22: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 21: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 20: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 19: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 18: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 17: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 16: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 15: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 14: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 13: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 12: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 11: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 10: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 9: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 8: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 7: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 6: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 5: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 4: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 3: {
                ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
                return v;
            }
            case 2: {
                ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
                return v;
            }
            case 1: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((p10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        Object a = lqo.a;
        final Object z = this.z;
        Object o2 = pc7.v;
        switch (w) {
            default: {
                final boolean x = this.x;
                if (x) {
                    if (x) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final hwj hwj = (hwj)this.y;
                    final zyc zyc = new zyc((bnf)z, (f07)null);
                    this.x = true;
                    if (ach.d0((je6)hwj, (zta)zyc, this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 28: {
                final boolean x2 = this.x;
                if (x2) {
                    if (x2) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final hwj hwj2 = (hwj)this.y;
                    final g80 g80 = new g80((lta)z, (f07)null, (byte)1);
                    this.x = true;
                    if (ach.d0((je6)hwj2, (zta)g80, this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 27: {
                final apc apc = (apc)this.y;
                final ThreadLocal b = apc.b;
                final boolean x3 = this.x;
                Label_0450: {
                    if (x3) {
                        Label_0360: {
                            if (x3) {
                                Label_0467: {
                                    try {
                                        vt4.g0(o);
                                        break Label_0450;
                                    }
                                    finally {
                                        break Label_0467;
                                    }
                                    break Label_0360;
                                }
                                b.set((Object)Boolean.FALSE);
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        vt4.g0(o);
                        final Object value = b.get();
                        final Boolean true = Boolean.TRUE;
                        if (!mlc.q(value, (Object)true)) {
                            b.set((Object)true);
                            final ou7 c = apc.c;
                            final ys7 ys7 = new ys7((lta)z, (f07)null);
                            this.x = true;
                            if ((o = tsf.z(c, (zta)ys7, (h07)this)) == o2) {
                                return o2;
                            }
                            break Label_0450;
                        }
                        else {
                            en9.q("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        }
                    }
                    o2 = null;
                    return o2;
                }
                o2 = o;
                b.set((Object)Boolean.FALSE);
                return o2;
            }
            case 26: {
                final xh9 xh9 = (xh9)this.y;
                final boolean x4 = this.x;
                if (x4) {
                    if (x4) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final x6m x6m = (x6m)z;
                    final s6m s6m = new s6m(xh9);
                    this.y = null;
                    this.x = true;
                    if (x6m.a((e7m)s6m, (f07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 25: {
                final String s = (String)this.y;
                final boolean x5 = this.x;
                if (x5) {
                    if (x5) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final z9b z9b = (z9b)z;
                    this.y = null;
                    this.x = true;
                    if (z9b.a(s, (Integer)null, (Integer)null, (h07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 24: {
                final boolean x6 = this.x;
                Label_0763: {
                    if (x6) {
                        if (x6) {
                            vt4.g0(o);
                            break Label_0763;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o2 = null;
                        return o2;
                    }
                    vt4.g0(o);
                    final alj alj = (alj)this.y;
                    final koa koa = (koa)z;
                    this.x = true;
                    final vmj b2 = clj.b((vkj)koa, alj);
                    final b09 a2 = enj.a;
                    o = r28.a(b2.b);
                    try {
                        final byte[] t = r6k.T((InputStream)o);
                        ((Closeable)o).close();
                        o = t;
                        if (t != o2) {
                            o = o;
                            o2 = ByteBuffer.allocateDirect(o.length);
                            ((ByteBuffer)o2).put((byte[])o);
                            ((ByteBuffer)o2).rewind();
                        }
                        return o2;
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t2;
                            zn2.r((Closeable)o, t2);
                        }
                    }
                }
            }
            case 23: {
                final o1f o1f = (o1f)this.y;
                final boolean x7 = this.x;
                if (x7) {
                    if (x7) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final rv7 rv7 = (rv7)z;
                    this.y = null;
                    this.x = true;
                    o1f.getClass();
                    o = zn2.R("DataStore.handleUpdate", (yci)null, (lta)new i80(rv7, o1f, (f07)null), (h07)this);
                    if (o != o2) {
                        o = a;
                    }
                    if (o == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 22: {
                final rv7 rv8 = (rv7)this.y;
                final boolean x8 = this.x;
                if (x8) {
                    if (x8) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ip6 ip6 = new ip6((Object)z, (Object)rv8, (f07)null, (byte)1);
                    this.x = true;
                    if ((o = zn2.R("DataStore.InitDataStore.doRun", (yci)null, (lta)ip6, (h07)this)) == o2) {
                        o = o2;
                    }
                }
                return o;
            }
            case 21: {
                final wu7 wu7 = (wu7)this.y;
                final boolean x9 = this.x;
                if (x9) {
                    if (x9) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final vzq b3 = x90.b;
                    final ArrayList list = (ArrayList)z;
                    this.y = null;
                    this.x = true;
                    if (b3.A(list, wu7, (h07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 20: {
                final boolean x10 = this.x;
                if (x10) {
                    if (x10) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final quj quj = (quj)this.y;
                    final l10 l10 = new l10(quj, (f07)null, (lta)z);
                    this.x = true;
                    if ((o = quj.i(false, (zta)l10, (h07)this)) == o2) {
                        o = o2;
                    }
                }
                return o;
            }
            case 19: {
                final boolean x11 = this.x;
                if (x11) {
                    if (x11) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final zdo zdo = (zdo)this.y;
                    final lta lta = (lta)z;
                    this.x = true;
                    if ((o = lta.b((Object)this)) == o2) {
                        o = o2;
                    }
                }
                return o;
            }
            case 18: {
                final boolean x12 = this.x;
                if (x12) {
                    if (x12) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ija ija = (ija)this.y;
                    final j87 j87 = new j87((n87)z, (byte)1);
                    this.x = true;
                    if (ija.a((jja)j87, (f07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 17: {
                final boolean x13 = this.x;
                if (x13) {
                    if (x13) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ija u = soh.u((ija)((vn0)this.y).x);
                    final j87 j88 = new j87((n87)z, (byte)0);
                    this.x = true;
                    if (u.a((jja)j88, (f07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 16: {
                final boolean x14 = this.x;
                if (x14) {
                    if (x14) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final gbd gbd = (gbd)this.y;
                    final h80 h80 = new h80((byte)3, (f07)null, (Object)z);
                    this.x = true;
                    if (soh.H(gbd, (zta)h80, (m6n)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 15: {
                final boolean x15 = this.x;
                if (x15) {
                    if (x15) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final zta zta = (zta)this.y;
                    final Object v = ((b4j)z).v;
                    this.x = true;
                    if ((o = zta.d(v, (Object)this)) == o2) {
                        o = o2;
                    }
                }
                return o;
            }
            case 14: {
                final boolean x16 = this.x;
                st4 st4;
                if (x16) {
                    if (!x16) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    st4 = (st4)this.y;
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final yw4 yw4 = (yw4)z;
                    final st4 i = yw4.i;
                    final uah w2 = yw4.w;
                    this.y = i;
                    this.x = true;
                    o = w2.a(this);
                    if (o == o2) {
                        a = o2;
                        return a;
                    }
                    st4 = i;
                }
                final v10 v2 = (v10)o;
                final KSerializer serializer = AppStartEvents$PlatformCapabilities.Companion.serializer();
                vt4.b0(serializer);
                st4.b(v2, (KSerializer)serializer);
                return a;
            }
            case 13: {
                final boolean x17 = this.x;
                if (x17) {
                    if (x17) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final cd0 cd0 = new cd0((ija)((vn0)this.y).x, (byte)1);
                    final yv4 yv4 = new yv4((ew4)z, (byte)0);
                    this.x = true;
                    if (cd0.a((jja)yv4, (f07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 12: {
                final jja jja = (jja)this.y;
                final boolean x18 = this.x;
                if (x18) {
                    if (x18) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final zka zka = (zka)z;
                    final bd0 bd0 = new bd0(jja, (byte)9);
                    this.y = null;
                    this.x = true;
                    if (zka.a((jja)bd0, (f07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 11: {
                final boolean x19 = this.x;
                if (x19) {
                    if (x19) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ija z2 = ((x4g)this.y).a.a.z();
                    final fb4 fb4 = new fb4((oc4)z, (byte)1);
                    this.x = true;
                    if (z2.a((jja)fb4, (f07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 10: {
                final f64 f64 = (f64)z;
                final ksg k = f64.L;
                final String s2 = (String)this.y;
                final boolean x20 = this.x;
                if (x20) {
                    if (!x20) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    if (kym.Y0((CharSequence)s2)) {
                        k.setValue((Object)null);
                        return a;
                    }
                    k.setValue((Object)null);
                    final gci c2 = f64.C;
                    final c1i b4 = f64.b0();
                    this.y = s2;
                    this.x = true;
                    if ((o = c2.s(b4, s2, (h07)this)) == o2) {
                        return o2;
                    }
                }
                final List list2 = (List)o;
                Object o3 = a;
                if (mlc.q((Object)f64.a0(), (Object)s2)) {
                    Object v3;
                    if ((v3 = list2) == null) {
                        v3 = r89.v;
                    }
                    k.setValue(v3);
                    f64.M = s2;
                    o3 = a;
                }
                return o3;
            }
            case 9: {
                final j14 j89 = (j14)z;
                final DraftMessage draftMessage = (DraftMessage)this.y;
                final boolean x21 = this.x;
                Object o4;
                if (x21) {
                    if (x21) {
                        vt4.g0(o);
                        o4 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o4 = null;
                    }
                }
                else {
                    vt4.g0(o);
                    o4 = a;
                    if (j89.Q.getValue()) {
                        o4 = a;
                        if (!(boolean)j89.S.getValue()) {
                            if (j89.O0()) {
                                o4 = a;
                                if (draftMessage == null) {
                                    return o4;
                                }
                                o4 = a;
                                if (j89.w.f()) {
                                    return o4;
                                }
                            }
                            this.y = null;
                            this.x = true;
                            o4 = a;
                            if (j89.c1(draftMessage, j89.s0().a, (f07)this) == o2) {
                                o4 = o2;
                            }
                        }
                    }
                }
                return o4;
            }
            case 8: {
                final boolean x22 = this.x;
                if (x22) {
                    if (x22) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ija ija2 = (ija)this.y;
                    final fxk fxk = (fxk)z;
                    this.x = true;
                    if (ija2.a((jja)fxk, (f07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 7: {
                final jrh jrh = (jrh)this.y;
                final boolean x23 = this.x;
                if (x23) {
                    if (x23) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final cf3 cf3 = (cf3)z;
                    this.y = null;
                    this.x = true;
                    if (cf3.e(jrh, (f07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 6: {
                final boolean x24 = this.x;
                if (x24) {
                    if (x24) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final bsl a3 = ((llf)this.y).a;
                    final wb0 wb0 = new wb0(z, (byte)2);
                    this.x = true;
                    a3.a((jja)wb0, (f07)this);
                    a = o2;
                }
                return a;
            }
            case 5: {
                final boolean x25 = this.x;
                if (x25) {
                    if (x25) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final vl2 vl2 = (vl2)this.y;
                    final qn1 qn1 = (qn1)z;
                    this.x = true;
                    if (lq6.m((t98)vl2, (jta)qn1, (h07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 4: {
                final mn2 mn2 = (mn2)z;
                final boolean x26 = this.x;
                if (x26) {
                    if (!x26) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final ija ija3 = (ija)this.y;
                    final wb0 wb2 = new wb0(mn2, (byte)1);
                    this.x = true;
                    if (ija3.a((jja)wb2, (f07)this) == o2) {
                        a = o2;
                        return a;
                    }
                }
                mn2.b((Throwable)null);
                return a;
            }
            case 3: {
                final boolean x27 = this.x;
                if (x27) {
                    if (x27) {
                        throw ge9.w(o);
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    o2 = null;
                }
                else {
                    vt4.g0(o);
                    final peo peo = (peo)this.y;
                    final vb0 vb0 = new vb0((ko1)z);
                    this.x = true;
                    peo.b(vb0, (h07)this);
                }
                return o2;
            }
            case 2: {
                final boolean x28 = this.x;
                Label_3019: {
                    if (x28) {
                        if (x28) {
                            final wcc wcc = (wcc)this.y;
                            vt4.g0(o);
                            break Label_3019;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        vt4.g0(o);
                        final wcc y = (wcc)this.y;
                        final o90 o5 = (o90)z;
                        this.y = y;
                        this.x = true;
                        final l13 l11 = new l13(1, ljq.K((f07)this));
                        l11.r();
                        final amn w3 = o5.w;
                        final tbh a4 = w3.a;
                        a4.a();
                        w3.b.set((Object)new dmn(w3, a4));
                        l11.v((lta)new n90(y, o5, (byte)0));
                        if (l11.p() == o2) {
                            return o2;
                        }
                        break Label_3019;
                    }
                    o2 = null;
                    return o2;
                }
                ebq.a();
                return null;
            }
            case 1: {
                final BaseEvent baseEvent = (BaseEvent)z;
                final s10 s3 = (s10)this.y;
                final boolean x29 = this.x;
                if (x29) {
                    if (!x29) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final xtm xtm = (xtm)s3.w.w;
                    this.x = true;
                    if (baseEvent.a(xtm, (h07)this) == o2) {
                        a = o2;
                        return a;
                    }
                }
                o = new StringBuilder("processing event on ");
                ((StringBuilder)o).append(Thread.currentThread().getName());
                uuj.z0(3, ((StringBuilder)o).toString());
                final rwn d = s3.d();
                final BaseEvent c3 = d.c(ceh.w, d.c(ceh.v, baseEvent));
                d.c(ceh.x, c3);
                d.c(ceh.y, c3);
                return a;
            }
            case 0: {
                final boolean x30 = this.x;
                if (x30) {
                    if (x30) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final xtm xtm2 = (xtm)((s10)this.y).w.w;
                    final JsonObject b5 = (JsonObject)z;
                    final q7n q7n = new q7n((byte)2);
                    q7n.b = b5;
                    final us4 a5 = v4j.a((Class)k2p.class);
                    this.x = true;
                    if (xtm2.b((qa)q7n, a5, (h07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
        }
    }
}
