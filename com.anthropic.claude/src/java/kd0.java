import java.util.List;
import java.util.Map;
import com.anthropic.claude.api.result.ApiResult;
import android.content.Context;

public final class kd0 extends m6n implements zta
{
    public final Object A;
    public final Object B;
    public final byte w;
    public boolean x;
    public Object y;
    public Object z;
    
    public kd0(final aj1 z, final d7 b, final bnf a, final f07 f07) {
        this.w = 4;
        this.z = z;
        this.B = b;
        this.A = a;
        super(2, f07);
    }
    
    public kd0(final crm y, final bnf a, final bnf b, final id0 z, final f07 f07) {
        this.w = 9;
        this.y = y;
        this.A = a;
        this.B = b;
        this.z = z;
        super(2, f07);
    }
    
    @Override
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final Object b = this.B;
        final Object a = this.A;
        switch (w) {
            default: {
                return new kd0(this.y, this.z, a, b, f07, (byte)10);
            }
            case 9: {
                return new kd0((crm)this.y, (bnf)a, (bnf)b, (id0)this.z, f07);
            }
            case 8: {
                final kd0 kd0 = new kd0(this.z, a, b, f07, (byte)8);
                kd0.y = o;
                return kd0;
            }
            case 7: {
                return new kd0((mrf)this.z, (kd)a, this.y, b, f07, (byte)7);
            }
            case 6: {
                return new kd0((mrf)this.z, (kd)a, this.y, this.B, f07, (byte)6);
            }
            case 5: {
                final kd0 kd2 = new kd0(a, b, f07, (byte)5);
                kd2.y = o;
                return kd2;
            }
            case 4: {
                return new kd0((aj1)this.z, (d7)b, (bnf)a, f07);
            }
            case 3: {
                final kd0 kd3 = new kd0(a, b, f07, (byte)3);
                kd3.y = o;
                return kd3;
            }
            case 2: {
                final kd0 kd4 = new kd0(this.z, a, this.B, f07, (byte)2);
                kd4.y = o;
                return kd4;
            }
            case 1: {
                final kd0 kd5 = new kd0(a, b, f07, (byte)1);
                kd5.y = ((pg3)o).a;
                return kd5;
            }
            case 0: {
                return new kd0(this.y, this.z, a, b, f07, (byte)0);
            }
        }
    }
    
    @Override
    public final Object d(Object a, final Object o) {
        final byte w = this.w;
        final lqo a2 = lqo.a;
        switch (w) {
            default: {
                return ((kd0)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 9: {
                return ((kd0)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 8: {
                return ((kd0)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 7: {
                return ((kd0)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 6: {
                return ((kd0)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 5: {
                return ((kd0)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 4: {
                return ((kd0)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 3: {
                return ((kd0)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 2: {
                return ((kd0)this.create(a, (f07)o)).invokeSuspend(a2);
            }
            case 1: {
                a = ((pg3)a).a;
                final kd0 kd0 = new kd0(this.A, this.B, (f07)o, (byte)1);
                kd0.y = a;
                return kd0.invokeSuspend(a2);
            }
            case 0: {
                return ((kd0)this.create(a, (f07)o)).invokeSuspend(a2);
            }
        }
    }
    
    @Override
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        Object a = lqo.a;
        final Object b = this.B;
        Object o2 = pc7.v;
        final Object a2 = this.A;
        switch (w) {
            default: {
                final a3q a3q = (a3q)b;
                final gbd gbd = (gbd)a2;
                final j0j j0j = (j0j)this.z;
                final boolean x = this.x;
                Label_0202: {
                    if (x) {
                        Label_0132: {
                            if (x) {
                                Label_0217: {
                                    try {
                                        vt4.g0(o);
                                        break Label_0202;
                                    }
                                    finally {
                                        break Label_0217;
                                    }
                                    break Label_0132;
                                }
                                gbd.d().d((fbd)a3q);
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(o);
                    final qhf qhf = (qhf)((b4j)this.y).v;
                    if (qhf != null) {
                        qhf.w = ien.a(j0j.z);
                    }
                    this.x = true;
                    o = j0j.Q((m6n)this);
                    if (o == o2) {
                        a = o2;
                        return a;
                    }
                }
                gbd.d().d((fbd)a3q);
                return a;
            }
            case 9: {
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
                    final x3j o3 = ge9.o(o);
                    final n6k a3 = ljq.a0((jta)new qn1((Object)this.y, (Object)a2, (Object)b, (byte)19));
                    final erm erm = new erm(o3, (id0)this.z, (f07)null);
                    this.x = true;
                    if (x90.r((ija)a3, (zta)erm, this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 8: {
                final String s = (String)this.y;
                final boolean x3 = this.x;
                Label_0446: {
                    if (x3) {
                        if (x3) {
                            vt4.g0(o);
                            break Label_0446;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        vt4.g0(o);
                        final qo4 h = ((plm)this.z).h;
                        final String s2 = (String)a2;
                        final fz6 fz6 = (fz6)b;
                        this.y = null;
                        this.x = true;
                        if ((o = h.C(s2, s, fz6, (h07)this)) == o2) {
                            return o2;
                        }
                        break Label_0446;
                    }
                    o2 = null;
                    return o2;
                }
                final ApiResult apiResult = (ApiResult)o;
                final int z = t.z(apiResult);
                if (z != 0) {
                    if (z != 1) {
                        en9.r();
                        return null;
                    }
                    o2 = new i97((pj0)apiResult);
                }
                else {
                    o2 = h97.a;
                }
                return o2;
            }
            case 7: {
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
                    final ija u = soh.u((ija)ljq.a0((jta)new uc4((gwj)this.z, (byte)28)));
                    final hb4 hb4 = new hb4((kd)a2, this.y, (oyk)b);
                    this.x = true;
                    if (u.a((jja)hb4, (f07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 6: {
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
                    final b4j e = hia.e(o);
                    final Object o4 = new Object();
                    final ija u2 = soh.u((ija)ljq.a0((jta)new pv4((frg)this.z, (byte)3)));
                    final w4g w4g = new w4g(e, (kd)a2, this.y, (b4j)o4, this.B);
                    this.x = true;
                    if (u2.a((jja)w4g, (f07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 5: {
                irh z2 = (irh)this.y;
                final boolean x6 = this.x;
                if (x6) {
                    if (!x6) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = (irh)this.z;
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    Object o5 = a;
                    if (((xom)z2.v).getValue() != null) {
                        return o5;
                    }
                    ((y38)a2).getClass();
                    final o68 a4 = vo8.a;
                    final d58 w2 = d58.w;
                    final h80 h2 = new h80((byte)13, (f07)null, (Object)b);
                    this.y = null;
                    this.z = z2;
                    this.x = true;
                    if ((o = rhc.f0((hc7)w2, (zta)h2, this)) == o2) {
                        o5 = o2;
                        return o5;
                    }
                }
                z2.setValue(o);
                return a;
            }
            case 4: {
                final boolean x7 = this.x;
                Object o6;
                while (true) {
                    en2 y = null;
                    Object b2 = null;
                    Label_0981: {
                        if (x7) {
                            if (x7) {
                                y = (en2)this.y;
                                vt4.g0(o);
                                b2 = o;
                                break Label_0981;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            o6 = null;
                            return o6;
                        }
                        else {
                            vt4.g0(o);
                            y = new en2(((aj1)this.z).c);
                        }
                        this.y = y;
                        this.x = true;
                        o = (b2 = y.b((f07)this));
                        if (o == o2) {
                            o6 = o2;
                            return o6;
                        }
                    }
                    o6 = a;
                    if (b2) {
                        final yt4 yt4 = (yt4)y.c();
                        if (yt4 == yt4.y && !(boolean)((jta)((xom)a2).getValue()).a()) {
                            final List a5 = adn.a;
                            adn.e(6, "Account on hold before bootstrap; keeping the session for the hold notice", (String)null, (Map)null);
                            continue;
                        }
                        final List a6 = adn.a;
                        final StringBuilder sb = new StringBuilder("Handling auth error in LoggedInApp: ");
                        sb.append((Object)yt4);
                        adn.e(6, sb.toString(), (String)null, (Map)null);
                        final d7 d7 = (d7)b;
                        evd evd;
                        if (grd.a[((Enum)yt4).ordinal()] == 1) {
                            evd = evd.y;
                        }
                        else {
                            evd = evd.x;
                        }
                        d7.b(evd, false);
                        continue;
                    }
                    break;
                }
                return o6;
            }
            case 3: {
                irh z3 = (irh)this.y;
                final boolean x8 = this.x;
                if (x8) {
                    if (!x8) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    z3 = (irh)this.z;
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final o68 a7 = vo8.a;
                    final d58 w3 = d58.w;
                    final p10 p10 = new p10((Object)a2, (Object)b, (f07)null, (byte)24);
                    this.y = null;
                    this.z = z3;
                    this.x = true;
                    if ((o = rhc.f0((hc7)w3, (zta)p10, this)) == o2) {
                        a = o2;
                        return a;
                    }
                }
                z3.setValue(o);
                return a;
            }
            case 2: {
                final ymf ymf = (ymf)a2;
                final ttl ttl = (ttl)this.y;
                final boolean x9 = this.x;
                if (x9) {
                    if (x9) {
                        vt4.g0(o);
                        return a;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    vt4.g0(o);
                    final int ordinal = ((Enum)ttl).ordinal();
                    if (ordinal != 0) {
                        Object o7 = a;
                        if (ordinal == 1) {
                            return o7;
                        }
                        if (ordinal == 2) {
                            if (b == csl.a) {
                                ymf.i();
                                o7 = a;
                                return o7;
                            }
                            ymf.k(b);
                            o7 = a;
                            return o7;
                        }
                        else {
                            en9.r();
                        }
                    }
                    else {
                        final ija ija = (ija)this.z;
                        this.y = null;
                        this.x = true;
                        Object o7 = a;
                        if (ija.a((jja)ymf, (f07)this) == o2) {
                            o7 = o2;
                            return o7;
                        }
                        return o7;
                    }
                }
                return null;
            }
            case 1: {
                final Object y2 = this.y;
                final boolean x10 = this.x;
                b4j b4j2;
                if (x10) {
                    if (!x10) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    final b4j b4j = (b4j)this.z;
                    vt4.g0(o);
                    b4j2 = b4j;
                }
                else {
                    vt4.g0(o);
                    final b4j z4 = (b4j)a2;
                    final boolean b3 = y2 instanceof og3;
                    if (!b3) {
                        z4.v = y2;
                    }
                    final jja jja = (jja)b;
                    Object o8 = a;
                    if (!b3) {
                        return o8;
                    }
                    final Throwable a8 = pg3.a(y2);
                    if (a8 != null) {
                        throw a8;
                    }
                    final Object v = z4.v;
                    b4j2 = z4;
                    if (v != null) {
                        if ((o = v) == j3g.a) {
                            o = null;
                        }
                        this.y = null;
                        this.z = z4;
                        this.x = true;
                        if (jja.l(o, this) == o2) {
                            o8 = o2;
                            return o8;
                        }
                        b4j2 = z4;
                    }
                }
                b4j2.v = j3g.c;
                return a;
            }
            case 0: {
                final id0 id0 = (id0)this.z;
                final boolean x11 = this.x;
                if (x11) {
                    if (!x11) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    Object o9 = a;
                    if (mlc.q(this.y, id0.e.getValue())) {
                        return o9;
                    }
                    final id0 id2 = (id0)this.z;
                    final Object y3 = this.y;
                    final bnf bnf = (bnf)a2;
                    final ygm a9 = md0.a;
                    final cg0 cg0 = (cg0)((xom)bnf).getValue();
                    this.x = true;
                    if (id0.b(id2, y3, cg0, null, this, 12) == o2) {
                        o9 = o2;
                        return o9;
                    }
                }
                final bnf bnf2 = (bnf)b;
                final ygm a10 = md0.a;
                final lta lta = (lta)((xom)bnf2).getValue();
                Object o9 = a;
                if (lta != null) {
                    lta.b(id0.e());
                    o9 = a;
                }
                return o9;
            }
        }
    }
}
