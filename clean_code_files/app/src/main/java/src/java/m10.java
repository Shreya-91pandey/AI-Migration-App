import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.Map;
import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;
import java.io.InputStream;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.app.appstart.CachedData;

public final class m10 extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public boolean y;
    public final Object z;
    
    public m10(final boolean y, final cwl z, final f07 f07) {
        this.w = 1;
        this.y = y;
        this.z = z;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final Object z = this.z;
        switch (w) {
            default: {
                final m10 m10 = new m10((byte)5, f07, z);
                m10.y = (boolean)o;
                return (f07)m10;
            }
            case 4: {
                return (f07)new m10(z, this.y, f07, (byte)4);
            }
            case 3: {
                final m10 m11 = new m10((byte)3, f07, z);
                m11.y = (boolean)o;
                return (f07)m11;
            }
            case 2: {
                final m10 m12 = new m10((byte)2, f07, z);
                m12.y = (boolean)o;
                return (f07)m12;
            }
            case 1: {
                return (f07)new m10(this.y, (cwl)z, f07);
            }
            case 0: {
                return (f07)new m10(z, this.y, f07, (byte)0);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                final Boolean b = (Boolean)o;
                b.booleanValue();
                return ((m10)this.create(b, (f07)o2)).invokeSuspend(a);
            }
            case 4: {
                return ((m10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 3: {
                final Boolean b2 = (Boolean)o;
                b2.booleanValue();
                return ((m10)this.create(b2, (f07)o2)).invokeSuspend(a);
            }
            case 2: {
                final Boolean b3 = (Boolean)o;
                b3.booleanValue();
                return ((m10)this.create(b3, (f07)o2)).invokeSuspend(a);
            }
            case 1: {
                return ((m10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((m10)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final boolean b = false;
        Object a = lqo.a;
        Object o2 = pc7.v;
        final Object z = this.z;
        switch (w) {
            default: {
                final qno qno = (qno)z;
                final boolean y = this.y;
                final boolean x = this.x;
                lqo lqo;
                if (x) {
                    if (x) {
                        vt4.g0(o);
                        lqo = (lqo)a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        lqo = null;
                    }
                }
                else {
                    vt4.g0(o);
                    lqo = (lqo)a;
                    if (y) {
                        final n6k a2 = ljq.a0((jta)qno.c);
                        final gi gi = new gi((Object)qno, (byte)6);
                        this.y = y;
                        this.x = true;
                        lqo = (lqo)a;
                        if (a2.a((jja)gi, (f07)this) == o2) {
                            lqo = (lqo)o2;
                        }
                    }
                }
                return lqo;
            }
            case 4: {
                final nq nq = (nq)z;
                final Long n = (Long)nq.h;
                final xca xca = (xca)nq.e;
                final fvg fvg = (fvg)nq.a;
                final boolean x2 = this.x;
                if (!x2) {
                    vt4.g0(o);
                    Label_0517: {
                        try {
                            final fvg h = fvg.h("cache.json");
                            if (!xca.L(h)) {
                                return null;
                            }
                            final zsi zsi = new zsi(xca.c0(h));
                            CachedData cachedData2;
                            try {
                                final CachedData cachedData = (CachedData)t08.C((jqc)nq.f, (KSerializer)CachedData.Companion.serializer((KSerializer)nq.c), (InputStream)new ysi(zsi));
                                try {
                                    zsi.close();
                                }
                                finally {}
                            }
                            finally {
                                try {
                                    zsi.close();
                                }
                                finally {
                                    final Throwable t;
                                    soh.j((Throwable)o, t);
                                }
                                cachedData2 = null;
                            }
                            if (o != null) {
                                break Label_0517;
                            }
                            if (n == null) {
                                break Label_0517;
                            }
                            nq.d.getClass();
                            if (System.currentTimeMillis() - cachedData2.b > n) {
                                return null;
                            }
                            break Label_0517;
                        }
                        catch (final Exception ex) {
                            final StringBuilder sb = new StringBuilder("Failed to read cached data from ");
                            sb.append((Object)fvg);
                            SilentException.a(new SilentException(sb.toString(), (Throwable)ex), (lpl)null, (List)null, 7);
                            this.x = true;
                            ((y38)nq.g).getClass();
                            final o68 a3 = vo8.a;
                            o = rhc.f0((hc7)d58.w, (zta)new nee((byte)11, (f07)null, (Object)nq), (f07)this);
                            if (o == o2) {
                                a = o;
                            }
                            if (a != o2) {
                                return null;
                            }
                            Label_0505: {
                                final CachedData cachedData2;
                                o = (o2 = cachedData2.a);
                            }
                            return o2;
                            while (true) {
                                final List a4 = adn.a;
                                final String s = (String)nq.b;
                                o = new StringBuilder();
                                ((StringBuilder)o).append(s);
                                ((StringBuilder)o).append(": cached entry is for another variant; treating as a miss");
                                adn.e(6, ((StringBuilder)o).toString(), (String)null, (Map)null);
                                return null;
                                final CachedData cachedData2;
                                final String c = cachedData2.c;
                                iftrue(Label_0505:)(this.y || c == null || c.equals(((jta)nq.i).a()));
                                continue;
                            }
                        }
                        catch (final CancellationException ex2) {}
                    }
                    return o2;
                }
                if (x2) {
                    vt4.g0(o);
                }
                else {
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                }
                o2 = null;
                return o2;
            }
            case 3: {
                final boolean y2 = this.y;
                final boolean x3 = this.x;
                if (x3) {
                    if (!x3) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o2 = null;
                        return o2;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final boolean b2 = b;
                    if (!y2) {
                        return b2;
                    }
                    final eni eni = (eni)z;
                    this.y = y2;
                    this.x = true;
                    final ArrayList e = eni.e;
                    if ((o = eni.c((h07)this)) == o2) {
                        return o2;
                    }
                }
                boolean b2 = b;
                if (o) {
                    b2 = true;
                }
                o2 = b2;
                return o2;
            }
            case 2: {
                final boolean y3 = this.y;
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
                    final ede ede = (ede)z;
                    if (y3) {
                        final cd0 cd0 = new cd0(ede.c, (byte)6);
                        final wb0 wb0 = new wb0((Object)ede, (byte)13);
                        this.y = y3;
                        this.x = true;
                        if (cd0.a((jja)wb0, (f07)this) == o2) {
                            a = o2;
                        }
                    }
                    else {
                        ede.b(tce.y);
                    }
                }
                return a;
            }
            case 1: {
                final boolean x5 = this.x;
                lqo lqo2;
                if (x5) {
                    if (x5) {
                        vt4.g0(o);
                        lqo2 = (lqo)a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        lqo2 = null;
                    }
                }
                else {
                    vt4.g0(o);
                    lqo2 = (lqo)a;
                    if (this.y) {
                        final cwl cwl = (cwl)z;
                        this.x = true;
                        o = cwl.a.a((Object)bwl.v, lnf.v, (cua)new b30(), (h07)this);
                        if (o != o2) {
                            o = a;
                        }
                        Object o3;
                        if (o == o2) {
                            o3 = o;
                        }
                        else {
                            o3 = a;
                        }
                        lqo2 = (lqo)a;
                        if (o3 == o2) {
                            lqo2 = (lqo)o2;
                        }
                    }
                }
                return lqo2;
            }
            case 0: {
                final boolean x6 = this.x;
                if (x6) {
                    if (x6) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final xtm xtm = (xtm)((s10)z).w.w;
                    final r7n r7n = new r7n((byte)0, this.y);
                    final us4 a5 = v4j.a((Class)s7n.class);
                    this.x = true;
                    if (xtm.b((qa)r7n, a5, (h07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
        }
        throw;
    }
}
