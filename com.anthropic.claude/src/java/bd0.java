import java.util.Iterator;
import com.anthropic.claude.app.ClaudeAppDestination$Detail;
import com.anthropic.claude.app.ClaudeAppDestination$List;
import java.util.Map;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.app.ClaudeAppDestination$Detail$Chat;
import com.anthropic.claude.app.b3;
import java.util.List;
import java.util.ArrayList;

public final class bd0 implements jja
{
    public final byte v;
    public final jja w;
    
    public bd0(final jja w, final nvp nvp) {
        this.v = 24;
        this.w = w;
    }
    
    public final Object l(Object o, final f07 f07) {
        final byte v = this.v;
        boolean b = false;
        lqo a = lqo.a;
        final jja w = this.w;
        final pc7 v2 = pc7.v;
        final Object o2 = null;
        final Object o3 = null;
        Object o4 = null;
        switch (v) {
            default: {
                Object o5 = null;
                Label_0195: {
                    if (f07 instanceof mvp) {
                        final mvp mvp = (mvp)f07;
                        final int w2 = mvp.w;
                        if ((w2 & Integer.MIN_VALUE) != 0x0) {
                            mvp.w = w2 + Integer.MIN_VALUE;
                            o5 = mvp;
                            break Label_0195;
                        }
                    }
                    o5 = new mvp(this, f07);
                }
                final Object v3 = ((mvp)o5).v;
                final int w3 = ((mvp)o5).w;
                if (w3 != 0) {
                    if (w3 == 1) {
                        vt4.g0(v3);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v3);
                    final mmf mmf = (mmf)o;
                    final td9 o6 = cwp.O;
                    final ArrayList list = new ArrayList();
                    o6.getClass();
                    final k1 k1 = new k1((Object)o6, (byte)0);
                    while (k1.hasNext()) {
                        final cwp cwp = (cwp)k1.next();
                        final Integer n = (Integer)mmf.c(new kjh(((Enum)cwp).name()));
                        if (n != null) {
                            o = new yog((Object)cwp, (Object)new Integer(((Number)n).intValue()));
                        }
                        else {
                            o = null;
                        }
                        if (o != null) {
                            list.add(o);
                        }
                    }
                    final Map k2 = y5e.k0((List)list);
                    ((mvp)o5).w = 1;
                    if (w.l((Object)k2, (f07)o5) == v2) {
                        a = (lqo)v2;
                    }
                }
                return a;
            }
            case 23: {
                q3p q3p = null;
                Label_0438: {
                    if (f07 instanceof q3p) {
                        q3p = (q3p)f07;
                        final int w4 = q3p.w;
                        if ((w4 & Integer.MIN_VALUE) != 0x0) {
                            q3p.w = w4 + Integer.MIN_VALUE;
                            break Label_0438;
                        }
                    }
                    q3p = new q3p(this, f07);
                }
                final Object v4 = q3p.v;
                final int w5 = q3p.w;
                Object o7;
                if (w5 != 0) {
                    if (w5 == 1) {
                        vt4.g0(v4);
                        o7 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o7 = null;
                    }
                }
                else {
                    vt4.g0(v4);
                    o7 = a;
                    if (o) {
                        q3p.w = 1;
                        o7 = a;
                        if (w.l(o, (f07)q3p) == v2) {
                            o7 = v2;
                        }
                    }
                }
                return o7;
            }
            case 22: {
                Object o8 = null;
                Label_0576: {
                    if (f07 instanceof nno) {
                        final nno nno = (nno)f07;
                        final int w6 = nno.w;
                        if ((w6 & Integer.MIN_VALUE) != 0x0) {
                            nno.w = w6 + Integer.MIN_VALUE;
                            o8 = nno;
                            break Label_0576;
                        }
                    }
                    o8 = new nno(this, f07);
                }
                final Object v5 = ((nno)o8).v;
                final int w7 = ((nno)o8).w;
                if (w7 != 0) {
                    if (w7 == 1) {
                        vt4.g0(v5);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v5);
                    if (o != null) {
                        b = true;
                    }
                    ((nno)o8).w = 1;
                    if (w.l((Object)b, (f07)o8) == v2) {
                        a = (lqo)v2;
                    }
                }
                return a;
            }
            case 21: {
                Object o9 = null;
                Label_0711: {
                    if (f07 instanceof dyk) {
                        final dyk dyk = (dyk)f07;
                        final int w8 = dyk.w;
                        if ((w8 & Integer.MIN_VALUE) != 0x0) {
                            dyk.w = w8 + Integer.MIN_VALUE;
                            o9 = dyk;
                            break Label_0711;
                        }
                    }
                    o9 = new dyk(this, f07);
                }
                final Object v6 = ((dyk)o9).v;
                final int w9 = ((dyk)o9).w;
                Object o10;
                if (w9 != 0) {
                    if (w9 == 1) {
                        vt4.g0(v6);
                        o10 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o10 = null;
                    }
                }
                else {
                    vt4.g0(v6);
                    final jd jd = (jd)o;
                    if (jd != null) {
                        final int c = jd.c;
                        String s;
                        if (c != 1) {
                            if (c != 2) {
                                if (c != 3) {
                                    if (c != 4) {
                                        throw null;
                                    }
                                    s = "other";
                                }
                                else {
                                    s = "dispatch";
                                }
                            }
                            else {
                                s = "code";
                            }
                        }
                        else {
                            s = "chat";
                        }
                        o4 = new yog((Object)s, (Object)jd.b);
                    }
                    o10 = a;
                    if (o4 != null) {
                        ((dyk)o9).w = 1;
                        o10 = a;
                        if (w.l(o4, (f07)o9) == v2) {
                            o10 = v2;
                        }
                    }
                }
                return o10;
            }
            case 20: {
                hli hli = null;
                Label_0917: {
                    if (f07 instanceof hli) {
                        hli = (hli)f07;
                        final int w10 = hli.w;
                        if ((w10 & Integer.MIN_VALUE) != 0x0) {
                            hli.w = w10 + Integer.MIN_VALUE;
                            break Label_0917;
                        }
                    }
                    hli = new hli(this, f07);
                }
                final Object v7 = hli.v;
                final int w11 = hli.w;
                Object o11;
                if (w11 != 0) {
                    if (w11 == 1) {
                        vt4.g0(v7);
                        o11 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o11 = null;
                    }
                }
                else {
                    vt4.g0(v7);
                    o11 = a;
                    if (o) {
                        hli.w = 1;
                        o11 = a;
                        if (w.l(o, (f07)hli) == v2) {
                            o11 = v2;
                        }
                    }
                }
                return o11;
            }
            case 19: {
                dde dde = null;
                Label_1053: {
                    if (f07 instanceof dde) {
                        dde = (dde)f07;
                        final int w12 = dde.w;
                        if ((w12 & Integer.MIN_VALUE) != 0x0) {
                            dde.w = w12 + Integer.MIN_VALUE;
                            break Label_1053;
                        }
                    }
                    dde = new dde(this, f07);
                }
                final Object v8 = dde.v;
                final int w13 = dde.w;
                Object o12;
                if (w13 != 0) {
                    if (w13 == 1) {
                        vt4.g0(v8);
                        o12 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o12 = null;
                    }
                }
                else {
                    vt4.g0(v8);
                    o12 = a;
                    if (o) {
                        dde.w = 1;
                        o12 = a;
                        if (w.l(o, (f07)dde) == v2) {
                            o12 = v2;
                        }
                    }
                }
                return o12;
            }
            case 18: {
                o0e o0e = null;
                Label_1189: {
                    if (f07 instanceof o0e) {
                        o0e = (o0e)f07;
                        final int w14 = o0e.w;
                        if ((w14 & Integer.MIN_VALUE) != 0x0) {
                            o0e.w = w14 + Integer.MIN_VALUE;
                            break Label_1189;
                        }
                    }
                    o0e = new o0e(this, f07);
                }
                final Object v9 = o0e.v;
                final int w15 = o0e.w;
                Object o13;
                if (w15 != 0) {
                    if (w15 == 1) {
                        vt4.g0(v9);
                        o13 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o13 = null;
                    }
                }
                else {
                    vt4.g0(v9);
                    o13 = a;
                    if (o) {
                        o0e.w = 1;
                        o13 = a;
                        if (w.l(o, (f07)o0e) == v2) {
                            o13 = v2;
                        }
                    }
                }
                return o13;
            }
            case 17: {
                Object o14 = null;
                Label_1327: {
                    if (f07 instanceof x9b) {
                        final x9b x9b = (x9b)f07;
                        final int w16 = x9b.w;
                        if ((w16 & Integer.MIN_VALUE) != 0x0) {
                            x9b.w = w16 + Integer.MIN_VALUE;
                            o14 = x9b;
                            break Label_1327;
                        }
                    }
                    o14 = new x9b(this, f07);
                }
                final Object v10 = ((x9b)o14).v;
                final int w17 = ((x9b)o14).w;
                if (w17 != 0) {
                    if (w17 == 1) {
                        vt4.g0(v10);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v10);
                    o = ((mmf)o).c(omo.e);
                    ((x9b)o14).w = 1;
                    if (w.l(o, (f07)o14) == v2) {
                        a = (lqo)v2;
                    }
                }
                return a;
            }
            case 16: {
                wka wka = null;
                Label_1457: {
                    if (f07 instanceof wka) {
                        wka = (wka)f07;
                        final int w18 = wka.w;
                        if ((w18 & Integer.MIN_VALUE) != 0x0) {
                            wka.w = w18 + Integer.MIN_VALUE;
                            break Label_1457;
                        }
                    }
                    wka = new wka(this, f07);
                }
                final Object v11 = wka.v;
                final int w19 = wka.w;
                Object o15;
                if (w19 != 0) {
                    if (w19 == 1) {
                        vt4.g0(v11);
                        o15 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o15 = null;
                    }
                }
                else {
                    vt4.g0(v11);
                    o15 = a;
                    if (o != null) {
                        wka.w = 1;
                        o15 = a;
                        if (w.l(o, (f07)wka) == v2) {
                            o15 = v2;
                        }
                    }
                }
                return o15;
            }
            case 15: {
                sx8 sx8 = null;
                Label_1587: {
                    if (f07 instanceof sx8) {
                        sx8 = (sx8)f07;
                        final int w20 = sx8.w;
                        if ((w20 & Integer.MIN_VALUE) != 0x0) {
                            sx8.w = w20 + Integer.MIN_VALUE;
                            break Label_1587;
                        }
                    }
                    sx8 = new sx8(this, f07);
                }
                final Object v12 = sx8.v;
                final int w21 = sx8.w;
                if (w21 != 0) {
                    if (w21 == 1) {
                        vt4.g0(v12);
                        return a;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    vt4.g0(v12);
                    final b3 b2 = (b3)o;
                    final ClaudeAppDestination$List a2 = b2.a;
                    final ClaudeAppDestination$Detail b3 = b2.b;
                    final zp4 c2 = b2.c;
                    final zp4 v13 = zp4.v;
                    final px8 w22 = px8.w;
                    final px8 y = px8.y;
                    Object o17 = null;
                    Label_1803: {
                        if (c2 == v13 && b3 != null) {
                            switch (o47.p(b3)) {
                                default: {
                                    en9.r();
                                    return null;
                                }
                                case 1:
                                case 2:
                                case 3:
                                case 4: {
                                    o17 = y;
                                    break Label_1803;
                                }
                                case 0: {
                                    final int y2 = o47.y((Object)((ClaudeAppDestination$Detail$Chat)b3).a.a);
                                    if (y2 == 0) {
                                        o17 = w22;
                                        break Label_1803;
                                    }
                                    if (y2 == 1) {
                                        break;
                                    }
                                    en9.r();
                                    return null;
                                }
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13: {
                                    break;
                                }
                            }
                        }
                        o17 = null;
                    }
                    if (o17 == null) {
                        o17 = o2;
                        if (a2 != null) {
                            o17 = o2;
                            switch (o47.q(a2)) {
                                default: {
                                    en9.r();
                                    return null;
                                }
                                case 10:
                                case 11: {
                                    break;
                                }
                                case 9: {
                                    o17 = px8.x;
                                    break;
                                }
                                case 8: {
                                    o17 = px8.B;
                                    break;
                                }
                                case 7: {
                                    o17 = px8.C;
                                    break;
                                }
                                case 4:
                                case 5:
                                case 6: {
                                    o17 = px8.A;
                                    break;
                                }
                                case 3: {
                                    o17 = px8.z;
                                    break;
                                }
                                case 1:
                                case 2: {
                                    o17 = y;
                                    break;
                                }
                                case 0: {
                                    o17 = w22;
                                    break;
                                }
                            }
                        }
                    }
                    Object o16 = a;
                    if (o17 == null) {
                        return o16;
                    }
                    sx8.w = 1;
                    o16 = a;
                    if (w.l(o17, (f07)sx8) == v2) {
                        o16 = v2;
                        return o16;
                    }
                    return o16;
                }
                return null;
            }
            case 14: {
                Object o18 = null;
                Label_2023: {
                    if (f07 instanceof yu7) {
                        final yu7 yu7 = (yu7)f07;
                        final int w23 = yu7.w;
                        if ((w23 & Integer.MIN_VALUE) != 0x0) {
                            yu7.w = w23 + Integer.MIN_VALUE;
                            o18 = yu7;
                            break Label_2023;
                        }
                    }
                    o18 = new yu7(this, f07);
                }
                final Object v14 = ((yu7)o18).v;
                final int w24 = ((yu7)o18).w;
                if (w24 != 0) {
                    if (w24 == 1) {
                        vt4.g0(v14);
                        return a;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    vt4.g0(v14);
                    final vom vom = (vom)o;
                    if (vom instanceof dsi) {
                        throw ((dsi)vom).b;
                    }
                    if (vom instanceof ot7) {
                        o = ((ot7)vom).b;
                        ((yu7)o18).w = 1;
                        if (w.l(o, (f07)o18) == v2) {
                            a = (lqo)v2;
                            return a;
                        }
                        return a;
                    }
                    else if (!(vom instanceof nea) && !(vom instanceof spo) && !(vom instanceof jxf)) {
                        en9.r();
                    }
                    else {
                        en9.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                }
                a = null;
                return a;
            }
            case 13: {
                Object o19 = null;
                Label_2221: {
                    if (f07 instanceof q47) {
                        final q47 q47 = (q47)f07;
                        final int w25 = q47.w;
                        if ((w25 & Integer.MIN_VALUE) != 0x0) {
                            q47.w = w25 + Integer.MIN_VALUE;
                            o19 = q47;
                            break Label_2221;
                        }
                    }
                    o19 = new q47(this, f07);
                }
                final Object v15 = ((q47)o19).v;
                final int w26 = ((q47)o19).w;
                if (w26 != 0) {
                    if (w26 == 1) {
                        vt4.g0(v15);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v15);
                    o = new i47((pj0)o);
                    ((q47)o19).w = 1;
                    if (w.l(o, (f07)o19) == v2) {
                        a = (lqo)v2;
                    }
                }
                return a;
            }
            case 12: {
                b05 b4 = null;
                Label_2352: {
                    if (f07 instanceof b05) {
                        b4 = (b05)f07;
                        final int w27 = b4.w;
                        if ((w27 & Integer.MIN_VALUE) != 0x0) {
                            b4.w = w27 + Integer.MIN_VALUE;
                            break Label_2352;
                        }
                    }
                    b4 = new b05(this, f07);
                }
                final Object v16 = b4.v;
                final int w28 = b4.w;
                Object o20;
                if (w28 != 0) {
                    if (w28 == 1) {
                        vt4.g0(v16);
                        o20 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o20 = null;
                    }
                }
                else {
                    vt4.g0(v16);
                    o20 = a;
                    if (!(boolean)o) {
                        b4.w = 1;
                        o20 = a;
                        if (w.l(o, (f07)b4) == v2) {
                            o20 = v2;
                        }
                    }
                }
                return o20;
            }
            case 11: {
                cw4 cw4 = null;
                Label_2488: {
                    if (f07 instanceof cw4) {
                        cw4 = (cw4)f07;
                        final int w29 = cw4.w;
                        if ((w29 & Integer.MIN_VALUE) != 0x0) {
                            cw4.w = w29 + Integer.MIN_VALUE;
                            break Label_2488;
                        }
                    }
                    cw4 = new cw4(this, f07);
                }
                final Object v17 = cw4.v;
                final int w30 = cw4.w;
                Object o21;
                if (w30 != 0) {
                    if (w30 == 1) {
                        vt4.g0(v17);
                        o21 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o21 = null;
                    }
                }
                else {
                    vt4.g0(v17);
                    o21 = a;
                    if (o) {
                        cw4.w = 1;
                        o21 = a;
                        if (w.l(o, (f07)cw4) == v2) {
                            o21 = v2;
                        }
                    }
                }
                return o21;
            }
            case 10: {
                aw4 aw4 = null;
                Label_2624: {
                    if (f07 instanceof aw4) {
                        aw4 = (aw4)f07;
                        final int w31 = aw4.w;
                        if ((w31 & Integer.MIN_VALUE) != 0x0) {
                            aw4.w = w31 + Integer.MIN_VALUE;
                            break Label_2624;
                        }
                    }
                    aw4 = new aw4(this, f07);
                }
                final Object v18 = aw4.v;
                final int w32 = aw4.w;
                Object o22;
                if (w32 != 0) {
                    if (w32 == 1) {
                        vt4.g0(v18);
                        o22 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o22 = null;
                    }
                }
                else {
                    vt4.g0(v18);
                    o22 = a;
                    if (o) {
                        aw4.w = 1;
                        o22 = a;
                        if (w.l(o, (f07)aw4) == v2) {
                            o22 = v2;
                        }
                    }
                }
                return o22;
            }
            case 9: {
                final yog yog = (yog)o;
                final Boolean b5 = (Boolean)yog.v;
                final Boolean b6 = (Boolean)yog.w;
                o = a;
                if (mlc.q((Object)b5, (Object)Boolean.TRUE)) {
                    o = a;
                    if (mlc.q((Object)b6, (Object)Boolean.FALSE)) {
                        final Object l = w.l((Object)a, f07);
                        o = a;
                        if (l == v2) {
                            o = l;
                        }
                    }
                }
                return o;
            }
            case 8: {
                jb4 jb4 = null;
                Label_2835: {
                    if (f07 instanceof jb4) {
                        jb4 = (jb4)f07;
                        final int w33 = jb4.w;
                        if ((w33 & Integer.MIN_VALUE) != 0x0) {
                            jb4.w = w33 + Integer.MIN_VALUE;
                            break Label_2835;
                        }
                    }
                    jb4 = new jb4(this, f07);
                }
                final Object v19 = jb4.v;
                final int w34 = jb4.w;
                Object o23;
                if (w34 != 0) {
                    if (w34 == 1) {
                        vt4.g0(v19);
                        o23 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o23 = null;
                    }
                }
                else {
                    vt4.g0(v19);
                    o23 = a;
                    if (o) {
                        jb4.w = 1;
                        o23 = a;
                        if (w.l(o, (f07)jb4) == v2) {
                            o23 = v2;
                        }
                    }
                }
                return o23;
            }
            case 7: {
                i14 i14 = null;
                Label_2971: {
                    if (f07 instanceof i14) {
                        i14 = (i14)f07;
                        final int w35 = i14.w;
                        if ((w35 & Integer.MIN_VALUE) != 0x0) {
                            i14.w = w35 + Integer.MIN_VALUE;
                            break Label_2971;
                        }
                    }
                    i14 = new i14(this, f07);
                }
                final Object v20 = i14.v;
                final int w36 = i14.w;
                Object o24;
                if (w36 != 0) {
                    if (w36 == 1) {
                        vt4.g0(v20);
                        o24 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o24 = null;
                    }
                }
                else {
                    vt4.g0(v20);
                    o24 = a;
                    if (o) {
                        i14.w = 1;
                        o24 = a;
                        if (w.l(o, (f07)i14) == v2) {
                            o24 = v2;
                        }
                    }
                }
                return o24;
            }
            case 6: {
                g14 g14 = null;
                Label_3107: {
                    if (f07 instanceof g14) {
                        g14 = (g14)f07;
                        final int w37 = g14.w;
                        if ((w37 & Integer.MIN_VALUE) != 0x0) {
                            g14.w = w37 + Integer.MIN_VALUE;
                            break Label_3107;
                        }
                    }
                    g14 = new g14(this, f07);
                }
                final Object v21 = g14.v;
                final int w38 = g14.w;
                Object o25;
                if (w38 != 0) {
                    if (w38 == 1) {
                        vt4.g0(v21);
                        o25 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o25 = null;
                    }
                }
                else {
                    vt4.g0(v21);
                    o25 = a;
                    if (o) {
                        g14.w = 1;
                        o25 = a;
                        if (w.l(o, (f07)g14) == v2) {
                            o25 = v2;
                        }
                    }
                }
                return o25;
            }
            case 5: {
                e14 e14 = null;
                Label_3243: {
                    if (f07 instanceof e14) {
                        e14 = (e14)f07;
                        final int w39 = e14.w;
                        if ((w39 & Integer.MIN_VALUE) != 0x0) {
                            e14.w = w39 + Integer.MIN_VALUE;
                            break Label_3243;
                        }
                    }
                    e14 = new e14(this, f07);
                }
                final Object v22 = e14.v;
                final int w40 = e14.w;
                Object o26;
                if (w40 != 0) {
                    if (w40 == 1) {
                        vt4.g0(v22);
                        o26 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o26 = null;
                    }
                }
                else {
                    vt4.g0(v22);
                    o26 = a;
                    if (o) {
                        e14.w = 1;
                        o26 = a;
                        if (w.l(o, (f07)e14) == v2) {
                            o26 = v2;
                        }
                    }
                }
                return o26;
            }
            case 4: {
                c14 c3 = null;
                Label_3379: {
                    if (f07 instanceof c14) {
                        c3 = (c14)f07;
                        final int w41 = c3.w;
                        if ((w41 & Integer.MIN_VALUE) != 0x0) {
                            c3.w = w41 + Integer.MIN_VALUE;
                            break Label_3379;
                        }
                    }
                    c3 = new c14(this, f07);
                }
                final Object v23 = c3.v;
                final int w42 = c3.w;
                Object o27;
                if (w42 != 0) {
                    if (w42 == 1) {
                        vt4.g0(v23);
                        o27 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o27 = null;
                    }
                }
                else {
                    vt4.g0(v23);
                    o27 = a;
                    if (o) {
                        c3.w = 1;
                        o27 = a;
                        if (w.l(o, (f07)c3) == v2) {
                            o27 = v2;
                        }
                    }
                }
                return o27;
            }
            case 3: {
                z04 z04 = null;
                Label_3515: {
                    if (f07 instanceof z04) {
                        z04 = (z04)f07;
                        final int w43 = z04.w;
                        if ((w43 & Integer.MIN_VALUE) != 0x0) {
                            z04.w = w43 + Integer.MIN_VALUE;
                            break Label_3515;
                        }
                    }
                    z04 = new z04(this, f07);
                }
                final Object v24 = z04.v;
                final int w44 = z04.w;
                Object o28;
                if (w44 != 0) {
                    if (w44 == 1) {
                        vt4.g0(v24);
                        o28 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o28 = null;
                    }
                }
                else {
                    vt4.g0(v24);
                    o28 = a;
                    if (o == InputMode.x) {
                        z04.w = 1;
                        o28 = a;
                        if (w.l(o, (f07)z04) == v2) {
                            o28 = v2;
                        }
                    }
                }
                return o28;
            }
            case 2: {
                in3 in3 = null;
                Label_3651: {
                    if (f07 instanceof in3) {
                        in3 = (in3)f07;
                        final int w45 = in3.w;
                        if ((w45 & Integer.MIN_VALUE) != 0x0) {
                            in3.w = w45 + Integer.MIN_VALUE;
                            break Label_3651;
                        }
                    }
                    in3 = new in3(this, f07);
                }
                final Object v25 = in3.v;
                final int w46 = in3.w;
                if (w46 != 0) {
                    if (w46 == 1) {
                        vt4.g0(v25);
                        return a;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    vt4.g0(v25);
                    final n04 n2 = (n04)o;
                    int n3;
                    if (n2 == null) {
                        n3 = -1;
                    }
                    else {
                        n3 = gn3.a[((Enum)n2).ordinal()];
                    }
                    Object o30 = o3;
                    if (n3 != -1) {
                        o30 = o3;
                        if (n3 != 1) {
                            if (n3 != 2) {
                                if (n3 != 3) {
                                    en9.r();
                                    return null;
                                }
                                o30 = Boolean.FALSE;
                            }
                            else {
                                o30 = Boolean.TRUE;
                            }
                        }
                    }
                    Object o29 = a;
                    if (o30 == null) {
                        return o29;
                    }
                    in3.w = 1;
                    o29 = a;
                    if (w.l(o30, (f07)in3) == v2) {
                        o29 = v2;
                        return o29;
                    }
                    return o29;
                }
                return null;
            }
            case 1: {
                Object o31 = null;
                Label_3849: {
                    if (f07 instanceof tn0) {
                        final tn0 tn0 = (tn0)f07;
                        final int w47 = tn0.w;
                        if ((w47 & Integer.MIN_VALUE) != 0x0) {
                            tn0.w = w47 + Integer.MIN_VALUE;
                            o31 = tn0;
                            break Label_3849;
                        }
                    }
                    o31 = new tn0(this, f07);
                }
                final Object v26 = ((tn0)o31).v;
                final int w48 = ((tn0)o31).w;
                if (w48 != 0) {
                    if (w48 == 1) {
                        vt4.g0(v26);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v26);
                    final boolean a3 = ((pn0)o).a;
                    ((tn0)o31).w = 1;
                    if (w.l((Object)a3, (f07)o31) == v2) {
                        a = (lqo)v2;
                    }
                }
                return a;
            }
            case 0: {
                Object o32 = null;
                Label_3983: {
                    if (f07 instanceof ad0) {
                        final ad0 ad0 = (ad0)f07;
                        final int w49 = ad0.w;
                        if ((w49 & Integer.MIN_VALUE) != 0x0) {
                            ad0.w = w49 + Integer.MIN_VALUE;
                            o32 = ad0;
                            break Label_3983;
                        }
                    }
                    o32 = new ad0(this, f07);
                }
                final Object v27 = ((ad0)o32).v;
                final int w50 = ((ad0)o32).w;
                if (w50 != 0) {
                    if (w50 == 1) {
                        vt4.g0(v27);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(v27);
                    final List a4 = ((q2q)o).a;
                    o = new ArrayList();
                    for (final Object next : a4) {
                        if (next instanceof kcb) {
                            ((ArrayList)o).add(next);
                        }
                    }
                    ((ad0)o32).w = 1;
                    if (w.l(o, (f07)o32) == v2) {
                        a = (lqo)v2;
                    }
                }
                return a;
            }
        }
    }
}
