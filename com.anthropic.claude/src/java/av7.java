import java.util.Collection;
import android.content.Context;
import java.util.List;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Executor;
import android.os.Build$VERSION;

public final class av7 extends m6n implements zta
{
    public Object A;
    public final byte w;
    public byte x;
    public Object y;
    public Object z;
    
    public av7(final xd3 y, final zta a, final f07 f07) {
        this.w = 3;
        this.y = y;
        this.A = a;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        switch (this.w) {
            default: {
                return (f07)new av7(this.z, this.y, this.A, f07, (byte)9);
            }
            case 8: {
                final av7 av7 = new av7((byte)8, f07, this.A);
                av7.y = o;
                return (f07)av7;
            }
            case 7: {
                final av7 av8 = new av7(this.z, this.A, f07, (byte)7);
                av8.y = o;
                return (f07)av8;
            }
            case 6: {
                final av7 av9 = new av7(this.z, this.A, f07, (byte)6);
                av9.y = o;
                return (f07)av9;
            }
            case 5: {
                return (f07)new av7((byte)5, f07, this.A);
            }
            case 4: {
                return (f07)new av7(this.z, this.y, this.A, f07, (byte)4);
            }
            case 3: {
                return (f07)new av7((xd3)this.y, (zta)this.A, f07);
            }
            case 2: {
                final av7 av10 = new av7(2, f07);
                av10.y = o;
                return (f07)av10;
            }
            case 1: {
                final av7 av11 = new av7(this.z, this.A, f07, (byte)1);
                av11.y = o;
                return (f07)av11;
            }
            case 0: {
                final av7 av12 = new av7((byte)0, f07, this.A);
                av12.y = o;
                return (f07)av12;
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                return ((av7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 8: {
                return ((av7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 7: {
                return ((av7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 6: {
                return ((av7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 5: {
                return ((av7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 4: {
                return ((av7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 3: {
                return ((av7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 2: {
                return ((av7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 1: {
                return ((av7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((av7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final Object o2 = null;
        h5g h5g = null;
        final Object o3 = null;
        Object o4 = null;
        final Object o5 = null;
        final Object o6 = null;
        Object o7 = null;
        final Object o8 = null;
        final lqo lqo = null;
        final Object o9 = null;
        switch (w) {
            default: {
                final nld nld = (nld)this.y;
                final r6q r6q = (r6q)this.z;
                final pc7 v = pc7.v;
                final byte x = this.x;
                if (x != 0) {
                    if (x != 1) {
                        if (x == 2) {
                            vt4.g0(o);
                            return o;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                        return o;
                    }
                    else {
                        vt4.g0(o);
                    }
                }
                else {
                    vt4.g0(o);
                    final Context b = r6q.b;
                    final v5q a = r6q.a;
                    final u4q u4q = (u4q)this.A;
                    final f5q d = r6q.d;
                    this.x = 1;
                    final int a2 = t4q.a;
                    final Object o10 = o = lqo.a;
                    if (a.q) {
                        if (Build$VERSION.SDK_INT >= 31) {
                            o = o10;
                        }
                        else {
                            final y6k d2 = d.d;
                            d2.getClass();
                            final Object f0 = rhc.f0((hc7)eqi.W((Executor)d2), (zta)new ovp(nld, a, u4q, b, (f07)null), (f07)this);
                            o = o10;
                            if (f0 == v) {
                                o = f0;
                            }
                        }
                    }
                    if (o == v) {
                        return v;
                    }
                }
                final String a3 = s6q.a;
                krd.c().getClass();
                final t03 c = nld.c();
                this.x = 2;
                if ((o = s6q.a((fld)c, nld, (m6n)this)) != v) {
                    return o;
                }
                o = v;
                return o;
            }
            case 8: {
                final lqo a4 = lqo.a;
                final pc7 v2 = pc7.v;
                final byte x2 = this.x;
                Label_0811: {
                    if (x2 != 0) {
                        if (x2 != 1) {
                            if (x2 == 2) {
                                final ReentrantLock reentrantLock = (ReentrantLock)this.z;
                                o4 = this.y;
                                try {
                                    vt4.g0(o);
                                    break Label_0811;
                                }
                                finally {
                                    o = reentrantLock;
                                    final Object a5 = o4;
                                    break Label_0811;
                                }
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            o = o9;
                            return o;
                        }
                        final eeo y = (eeo)this.y;
                        vt4.g0(o);
                    }
                    else {
                        vt4.g0(o);
                        final eeo y = (eeo)this.y;
                        this.y = y;
                        this.x = 1;
                        final Object a5 = y.a((f07)this);
                        if ((o = a5) == v2) {
                            return o;
                        }
                    }
                    Label_0491: {
                        if (!(boolean)o) {
                            break Label_0491;
                        }
                        o = a4;
                        return o;
                    }
                    final dho dho = (dho)this.A;
                    Object a5 = dho.h;
                    o = ((h5g)a5).e;
                    ((ReentrantLock)o).lock();
                    o4 = o;
                    try {
                        ((h5g)a5).f = true;
                        o4 = o;
                        final ReentrantLock a6 = ((h5g)a5).a;
                        o4 = o;
                        a6.lock();
                    Label_0645_Outer:
                        while (true) {
                            Label_0663: {
                                while (true) {
                                    Label_0655: {
                                        try {
                                            if (!((h5g)a5).d) {
                                                Label_0555: {
                                                    final f5g[] array = null;
                                                }
                                                break Label_0645_Outer;
                                            }
                                            ((h5g)a5).d = false;
                                            final int length = ((h5g)a5).b.length;
                                            final f5g[] array = new f5g[length];
                                            final int n = 0;
                                            boolean b2 = false;
                                            if (n >= length) {
                                                break Label_0663;
                                            }
                                            int n2;
                                            if (((h5g)a5).b[n] > 0L) {
                                                n2 = 1;
                                            }
                                            else {
                                                n2 = 0;
                                            }
                                            o4 = ((h5g)a5).c;
                                            if (n2 == o4[n]) {
                                                break Label_0663;
                                            }
                                            if (o4[n] = n2) {
                                                o4 = f5g.w;
                                                b2 = true;
                                                break Label_0655;
                                            }
                                            break Label_0655;
                                        }
                                        finally {
                                            a6.unlock();
                                            o4 = f5g.v;
                                            break Label_0655;
                                            o4 = f5g.x;
                                            continue;
                                            final boolean b2;
                                            iftrue(Label_0555:)(!b2);
                                            o4 = o;
                                            a6.unlock();
                                            h5g = (h5g)a5;
                                            final f5g[] array;
                                            iftrue(Label_0802:)(array == null);
                                            Object o12 = null;
                                            Block_77: {
                                                Label_0831: {
                                                    try {
                                                        if (array.length == 0) {
                                                            h5g = (h5g)a5;
                                                        }
                                                        else {
                                                            final ceo w2 = ceo.w;
                                                            final eeo y;
                                                            final bho bho = new bho(array, dho, y, (f07)null);
                                                            this.y = a5;
                                                            this.z = o;
                                                            this.x = 2;
                                                            if (y.d(w2, (zta)bho, (m6n)this) == v2) {
                                                                return o;
                                                            }
                                                            final Object o11 = o;
                                                            o = a5;
                                                            a5 = o11;
                                                        }
                                                        Label_0802: {
                                                            break Label_0831;
                                                        }
                                                    }
                                                    finally {
                                                        o12 = o4;
                                                    }
                                                    break Block_77;
                                                }
                                                o4 = o12;
                                                h5g.f = false;
                                                ((ReentrantLock)o12).unlock();
                                                return a4;
                                                int n = 0;
                                                array[n] = (f5g)o4;
                                                ++n;
                                                continue Label_0645_Outer;
                                            }
                                            try {
                                                ((h5g)a5).f = false;
                                                throw o12;
                                            }
                                            finally {
                                                o4 = o;
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    finally {}
                }
                ((ReentrantLock)o4).unlock();
                break;
            }
            case 7: {
                final ija ija = (ija)this.A;
                final hc7 hc7 = (hc7)this.z;
                final pc7 v3 = pc7.v;
                final byte x3 = this.x;
                if (x3 == 0) {
                    vt4.g0(o);
                    final irh irh = (irh)this.y;
                    if (mlc.q((Object)hc7, (Object)o89.v)) {
                        final wb0 wb0 = new wb0((Object)irh, (byte)21);
                        this.x = 1;
                        if (ija.a((jja)wb0, (f07)this) != v3) {
                            return lqo.a;
                        }
                    }
                    else {
                        final mdl mdl = new mdl((Object)ija, (Object)irh, (f07)null, (byte)17);
                        this.x = 2;
                        if (rhc.f0(hc7, (zta)mdl, (f07)this) != v3) {
                            return lqo.a;
                        }
                    }
                    return v3;
                }
                if (x3 != 1 && x3 != 2) {
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return o2;
                }
                vt4.g0(o);
                return lqo.a;
            }
            case 6: {
                final shd shd = (shd)this.z;
                final ija ija2 = (ija)this.y;
                final pc7 v4 = pc7.v;
                final byte x4 = this.x;
                Label_1105: {
                    if (x4 == 0) {
                        break Label_1105;
                    }
                    if (x4 != 1) {
                        if (x4 == 2) {
                            vt4.g0(o);
                            return lqo.a;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return h5g;
                    }
                    try {
                        vt4.g0(o);
                        final bnf bnf;
                        Label_1262: {
                            bnf = (bnf)this.A;
                        }
                        final wq7 a9 = bjh.a;
                        ((jta)((xom)bnf).getValue()).a();
                        return lqo.a;
                        Label_1164:
                        iftrue(Label_1205:)(!yiq.l(shd.b()));
                        shd.b().getClass();
                        dpg g = null;
                        tun tun = new tun(g, shd.b().b);
                        while (true) {
                            final tun b3;
                            final j00 j00 = new j00((Object)b3, (Object)shd, (Object)tun, (byte)10);
                            this.y = null;
                            this.x = 1;
                            iftrue(Label_1262:)(ija2.a((jja)j00, (f07)this) != v4);
                            return v4;
                            vt4.g0(o);
                            b3 = shd.b();
                            g = awp.G;
                            iftrue(Label_1164:)(!yiq.m(shd.b()));
                            final dpg a10 = shd.b().a;
                            shd.b().getClass();
                            tun = new tun(a10, g);
                            continue;
                            Label_1205:
                            tun = new tun(g, g);
                            continue;
                        }
                    }
                    catch (final CancellationException ex) {
                        final gyf w3 = gyf.w;
                        final drd drd = new drd((byte)19, (f07)null, (Object)shd);
                        this.y = null;
                        this.x = 2;
                        if (rhc.f0((hc7)w3, (zta)drd, (f07)this) != v4) {
                            return lqo.a;
                        }
                    }
                }
                return v4;
                a8 = lqo.a;
                return a8;
            }
            case 5: {
                Object v5 = pc7.v;
                final byte x5 = this.x;
                Object o13 = null;
                Label_1620: {
                    final Throwable t;
                    Label_1553: {
                        Object o14 = null;
                        f4b f4b;
                        if (x5 != 0) {
                            if (x5 != 1) {
                                if (x5 == 2) {
                                    o7 = this.y;
                                    o13 = this.z;
                                    try {
                                        vt4.g0(o);
                                        v5 = o;
                                        break Label_1553;
                                    }
                                    finally {
                                        break Label_1620;
                                    }
                                }
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                o14 = o3;
                                return o14;
                            }
                            f4b = (f4b)this.y;
                            final aof aof = (aof)this.z;
                            vt4.g0(o);
                            o = aof;
                        }
                        else {
                            vt4.g0(o);
                            f4b = (f4b)this.A;
                            final cof d3 = f4b.d;
                            this.z = d3;
                            this.y = f4b;
                            this.x = 1;
                            o = d3;
                            if (d3.c((f07)this) == v5) {
                                break Label_1553;
                            }
                        }
                        try {
                            final String c2 = f4b.c;
                            o7 = o;
                            final String s;
                            if ((s = c2) == null) {
                                this.z = o;
                                this.y = f4b;
                                this.x = 2;
                                final Object a11 = f4b.a((h07)this);
                                if (a11 == v5) {
                                    o = v5;
                                    return o14;
                                }
                                o7 = f4b;
                                v5 = a11;
                                ((f4b)o7).c = (String)v5;
                                final String s2 = (String)v5;
                                o7 = o;
                            }
                        }
                        finally {
                            o13 = o;
                            o14 = t;
                            break Label_1620;
                        }
                    }
                    ((aof)o7).g((Object)null);
                    return t;
                }
                ((aof)o13).g((Object)null);
                break;
            }
            case 4: {
                final qb2 qb2 = (qb2)this.y;
                final pc7 v6 = pc7.v;
                final byte x6 = this.x;
                Object o15 = null;
                Label_1916: {
                    Label_1891: {
                        if (x6 != 0) {
                            if (x6 != 1) {
                                if (x6 == 2) {
                                    vt4.g0(o);
                                    break Label_1891;
                                }
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                o15 = o5;
                                return o15;
                            }
                            else {
                                vt4.g0(o);
                            }
                        }
                        else {
                            vt4.g0(o);
                            this.x = 1;
                            final l13 l13 = new l13(1, ljq.K((f07)this));
                            l13.r();
                            qb2.f((rb2)new j9j((Object)l13, (byte)17));
                            if ((o = l13.p()) == v6) {
                                return v6;
                            }
                        }
                        if (!(boolean)o) {
                            final List a12 = adn.a;
                            adn.e(6, "play billing config: connect failed", (String)null, (Map)null);
                            o15 = o4;
                            break Label_1916;
                        }
                        this.x = 2;
                        final int b4 = h4b.b;
                        final l13 l14 = new l13(1, ljq.K((f07)this));
                        l14.r();
                        o = new zs2(l14, (byte)3);
                        qb2.getClass();
                        if (qb2.h((Callable)new kiq(qb2, (zs2)o), 30000L, (Runnable)new qua((Object)qb2, o, (byte)14), qb2.i(), qb2.g()) == null) {
                            final gc2 i = qb2.l();
                            qb2.t(25, 13, i);
                            ((zs2)o).b(i);
                        }
                        if ((o = l14.p()) != v6) {
                            break Label_1891;
                        }
                        o15 = v6;
                        return o15;
                    }
                    o15 = o;
                }
                ((x3j)this.A).v = false;
                return o15;
            }
            case 3: {
                final pc7 v7 = pc7.v;
                final byte x7 = this.x;
                while (true) {
                    Object b5 = null;
                    en2 iterator = null;
                    Label_2053: {
                        if (x7 != 0) {
                            if (x7 == 1) {
                                final en2 en2 = (en2)this.z;
                                vt4.g0(o);
                                b5 = o;
                                iterator = en2;
                                break Label_2053;
                            }
                            if (x7 != 2) {
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return o6;
                            }
                            final en2 en3 = (en2)this.z;
                            vt4.g0(o);
                            iterator = en3;
                        }
                        else {
                            vt4.g0(o);
                            iterator = ((xd3)this.y).iterator();
                        }
                        this.z = iterator;
                        this.x = 1;
                        if ((b5 = iterator.b((f07)this)) == v7) {
                            return v7;
                        }
                    }
                    if (!(boolean)b5) {
                        return lqo.a;
                    }
                    final Object c3 = iterator.c();
                    final zta zta = (zta)this.A;
                    this.z = iterator;
                    this.x = 2;
                    if (zta.d(c3, (Object)this) != v7) {
                        continue;
                    }
                    break;
                }
                return v7;
            }
            case 2: {
                final b37 b6 = (b37)this.y;
                final pc7 v8 = pc7.v;
                final byte x8 = this.x;
                if (x8 != 0 && (x8 != 1 && (x8 != 2 && x8 == 3))) {
                    final HashSet set = (HashSet)this.A;
                    final List list = (List)this.z;
                    try {
                        vt4.g0(o);
                        o = set;
                        goto Label_2527;
                    }
                    catch (final Exception ex2) {
                        goto Label_2505;
                    }
                    catch (final CancellationException ex3) {
                        throw ex3;
                    }
                }
                goto Label_2229;
            }
            case 1: {
                final List list2 = (List)this.z;
                final b37 b7 = (b37)this.A;
                final zdo zdo = (zdo)this.y;
                final pc7 v9 = pc7.v;
                final byte x9 = this.x;
                Label_2753: {
                    Label_2721: {
                        if (x9 != 0) {
                            if (x9 != 1) {
                                if (x9 == 2) {
                                    vt4.g0(o);
                                    break Label_2721;
                                }
                                if (x9 == 3) {
                                    vt4.g0(o);
                                    break Label_2753;
                                }
                                if (x9 == 4) {
                                    vt4.g0(o);
                                    return lqo.a;
                                }
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return o8;
                            }
                            else {
                                vt4.g0(o);
                            }
                        }
                        else {
                            vt4.g0(o);
                            final nw2 nw2 = new nw2(2, null, (byte)3);
                            this.y = null;
                            this.x = 1;
                            if (((ufh)zdo).c("DELETE FROM cachedMessages", (zta)nw2, (h07)this) == v9) {
                                return v9;
                            }
                        }
                        if (!((Collection)list2).isEmpty()) {
                            final ow2 k = b7.a.k();
                            this.y = null;
                            this.x = 2;
                            if (k.a(list2, (m6n)this) == v9) {
                                return v9;
                            }
                        }
                    }
                    final kx2 m = b7.a.m();
                    this.y = null;
                    this.x = 3;
                    if (m.a((m6n)this) == v9) {
                        return v9;
                    }
                }
                final gw2 j2 = b7.a.j();
                this.y = null;
                this.x = 4;
                if (j2.a((m6n)this) != v9) {
                    return lqo.a;
                }
                return v9;
                a14 = lqo.a;
                return a14;
            }
            case 0: {
                final lqo a15 = lqo.a;
                final rv7 rv7 = (rv7)this.A;
                final jja y2 = (jja)this.y;
                final pc7 v10 = pc7.v;
                final byte x10 = this.x;
                Object o16 = null;
                Label_3031: {
                    Label_2971: {
                        Label_2933: {
                            if (x10 == 0) {
                                vt4.g0(o);
                                x90.u(rv7.c.v);
                                this.y = y2;
                                this.x = 1;
                                o = null;
                                break Label_2933;
                            }
                            if (x10 == 1) {
                                vt4.g0(o);
                                break Label_2933;
                            }
                            if (x10 == 2) {
                                vt4.g0(o);
                                break Label_2971;
                            }
                            if (x10 == 3) {
                                final ot7 ot7 = (ot7)this.z;
                                vt4.g0(o);
                                o16 = ot7;
                                break Label_3031;
                            }
                            if (x10 != 4) {
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return lqo;
                            }
                            vt4.g0(o);
                            return a15;
                        }
                        final yci yci = (yci)o;
                        this.y = y2;
                        this.x = 2;
                        if ((o = rv7.g(yci, (h07)this)) == v10) {
                            return v10;
                        }
                    }
                    o16 = o;
                    if (o16 instanceof ot7) {
                        final ot7 z = (ot7)o16;
                        final Object b8 = z.b;
                        this.y = y2;
                        this.z = z;
                        this.x = 3;
                        if (y2.l(b8, (f07)this) == v10) {
                            return v10;
                        }
                    }
                    else {
                        if (o16 instanceof spo) {
                            en9.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return lqo;
                        }
                        if (o16 instanceof dsi) {
                            throw ((dsi)o16).b;
                        }
                        if (o16 instanceof nea) {
                            return a15;
                        }
                        if (o16 instanceof jxf) {
                            en9.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return lqo;
                        }
                        en9.r();
                        return lqo;
                    }
                }
                o = new uja((ija)new zu7(new wja((ija)new wja((ija)new wja((zta)new uu7(rv7, (f07)null, (byte)1), (ija)rv7.h.w), (zta)new nw2(2, null, (byte)2), (byte)2), (zta)new rf0((byte)10, (f07)null, o16), (byte)1), (byte)0), (bua)new co4(rv7, (f07)null), (byte)0);
                this.y = null;
                this.z = null;
                this.x = 4;
                if (x90.t(y2, (ija)o, (f07)this) != v10) {
                    return a15;
                }
                return v10;
            }
        }
    }
}
