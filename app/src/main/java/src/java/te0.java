import com.anthropic.claude.app.ClaudeAppOverlay$BreakSuggestionSheet;
import com.anthropic.claude.app.ClaudeAppOverlay$QuietHoursNotice;
import com.anthropic.claude.app.ClaudeAppOverlay$None;
import com.anthropic.claude.app.ClaudeAppOverlay;

public final class te0 implements jja
{
    public final byte v;
    public final Object w;
    public final Object x;
    public final Object y;
    
    public Object a(final f07 f07) {
        final b4j v = (b4j)this.w;
        p33 p2 = null;
        Label_0056: {
            if (f07 instanceof p33) {
                final p33 p = (p33)f07;
                final int y = p.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    p.y = y + Integer.MIN_VALUE;
                    p2 = p;
                    break Label_0056;
                }
            }
            p2 = new p33(this, f07);
        }
        Object o = p2.w;
        final int y2 = p2.y;
        final pc7 v2 = pc7.v;
        b4j v3;
        if (y2 != 0) {
            if (y2 != 1) {
                if (y2 == 2) {
                    vt4.g0(o);
                    return lqo.a;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                v3 = p2.v;
                vt4.g0(o);
            }
        }
        else {
            vt4.g0(o);
            final r33 r33 = (r33)this.x;
            p2.v = v;
            p2.y = 1;
            final o68 a = vo8.a;
            o = rhc.f0((hc7)d58.w, (zta)new rf0((byte)2, (f07)null, (Object)r33), (f07)p2);
            if (o == v2) {
                return v2;
            }
            v3 = v;
        }
        Boolean v4;
        if ((v4 = (Boolean)o) == null) {
            v4 = (Boolean)v.v;
        }
        v3.v = v4;
        final jja jja = (jja)this.y;
        final Object v5 = v.v;
        p2.v = null;
        p2.y = 2;
        if (jja.l(v5, (f07)p2) != v2) {
            return lqo.a;
        }
        return v2;
    }
    
    public Object b(haj v, final f07 f07) {
        final b4j b4j = (b4j)this.w;
        f05 f9 = null;
        Label_0060: {
            if (f07 instanceof f05) {
                final f05 f8 = (f05)f07;
                final int y = f8.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    f8.y = y + Integer.MIN_VALUE;
                    f9 = f8;
                    break Label_0060;
                }
            }
            f9 = new f05(this, f07);
        }
        Object o = f9.w;
        final int y2 = f9.y;
        final lqo a = lqo.a;
        final pc7 v2 = pc7.v;
        Label_0200: {
            if (y2 != 0) {
                if (y2 != 1) {
                    if (y2 == 2) {
                        vt4.g0(o);
                        return a;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    v = f9.v;
                    vt4.g0(o);
                }
            }
            else {
                vt4.g0(o);
                if (mlc.q(v, b4j.v)) {
                    break Label_0200;
                }
                final lta lta = (lta)this.x;
                f9.v = v;
                f9.y = 1;
                if ((o = lta.b(f9)) == v2) {
                    return v2;
                }
            }
            if (o) {
                b4j.v = v;
            }
        }
        final czp czp = (czp)this.y;
        if (czp != null) {
            f9.v = null;
            f9.y = 2;
            if (czp.b((h07)f9) == v2) {
                return v2;
            }
        }
        return a;
    }
    
    @Override
    public final Object l(Object v, final f07 f07) {
        final byte v2 = this.v;
        boolean booleanValue = false;
        final int n = 1;
        final Object o = null;
        final lqo lqo = null;
        final lqo lqo2 = null;
        final lqo lqo3 = null;
        switch (v2) {
            default: {
                final zvn zvn = (zvn)v;
                final gwj gwj = (gwj)this.y;
                final xvn a = xvn.a;
                final b4j b4j = (b4j)this.w;
                final b4j b4j2 = (b4j)this.x;
                final ClaudeAppOverlay claudeAppOverlay = (ClaudeAppOverlay)b4j2.v;
                final ClaudeAppOverlay claudeAppOverlay2 = (ClaudeAppOverlay)b4j.v;
                final boolean e = zvn.e;
                final boolean d = zvn.d;
                final ClaudeAppOverlay a2 = zvn.a;
                final ClaudeAppOverlay$None instance = ClaudeAppOverlay$None.INSTANCE;
                Object v3 = null;
                Label_0203: {
                    if (mlc.q(a2, instance)) {
                        v3 = claudeAppOverlay;
                        if (mlc.q(claudeAppOverlay, ClaudeAppOverlay$QuietHoursNotice.INSTANCE)) {
                            break Label_0203;
                        }
                        if (mlc.q(claudeAppOverlay, ClaudeAppOverlay$BreakSuggestionSheet.INSTANCE)) {
                            v3 = claudeAppOverlay;
                            break Label_0203;
                        }
                    }
                    v3 = claudeAppOverlay2;
                }
                Label_0260: {
                    if (v3 != null) {
                        boolean d2;
                        if (v3.equals(ClaudeAppOverlay$QuietHoursNotice.INSTANCE)) {
                            d2 = zvn.d;
                        }
                        else {
                            d2 = (!v3.equals(ClaudeAppOverlay$BreakSuggestionSheet.INSTANCE) || zvn.e);
                        }
                        if (d2) {
                            break Label_0260;
                        }
                    }
                    v3 = null;
                }
                b4j.v = v3;
                final wvn a3 = wvn.a;
                Label_0433: {
                    Label_0279: {
                        if (zvn.b) {
                            final ClaudeAppOverlay$QuietHoursNotice instance2 = ClaudeAppOverlay$QuietHoursNotice.INSTANCE;
                            if (!mlc.q(a2, instance2)) {
                                final ClaudeAppOverlay$BreakSuggestionSheet instance3 = ClaudeAppOverlay$BreakSuggestionSheet.INSTANCE;
                                if (!mlc.q(a2, instance3)) {
                                    if (!mlc.q(a2, instance)) {
                                        break Label_0279;
                                    }
                                    if (d && !mlc.q(v3, instance2)) {
                                        v = new yvn((ClaudeAppOverlay)instance2);
                                        break Label_0433;
                                    }
                                    if (e && !mlc.q(v3, instance3)) {
                                        v = new yvn((ClaudeAppOverlay)instance3);
                                        break Label_0433;
                                    }
                                    break Label_0279;
                                }
                            }
                            if (zvn.c) {
                                int n2;
                                if (a2.equals(instance2)) {
                                    n2 = (d ? 1 : 0);
                                }
                                else {
                                    n2 = n;
                                    if (a2.equals(ClaudeAppOverlay$BreakSuggestionSheet.INSTANCE)) {
                                        n2 = (e ? 1 : 0);
                                    }
                                }
                                if (n2 == 0) {
                                    v = a;
                                    break Label_0433;
                                }
                            }
                        }
                    }
                    v = a3;
                }
                if (v.equals(a)) {
                    gwj.b((lta)ndl.G, (zta)new hyh((byte)29));
                }
                else if (v instanceof yvn) {
                    gwj.b((lta)new u52((Object)((yvn)v).a(), (byte)27), (zta)new vvn((byte)0));
                }
                else if (!v.equals(a3)) {
                    en9.r();
                    return lqo3;
                }
                b4j2.v = a2;
                return lqo.a;
            }
            case 8: {
                final float floatValue = ((Number)v).floatValue();
                final pc7 v4 = pc7.v;
                v = lqo.a;
                final d4j d4j = (d4j)this.y;
                if (floatValue != ((Number)d4j.a).floatValue()) {
                    d4j.a = floatValue;
                    final boolean booleanValue2 = (boolean)((ksg)((tze)this.w).x).getValue();
                    final v4a v4a = (v4a)this.x;
                    if (booleanValue2) {
                        final Object g = ((id0)v4a.y).g(f07, new Float(0.0012500006f / (floatValue + 0.025000006f) + 0.95f));
                        if (g == v4) {
                            v = g;
                        }
                    }
                    else {
                        final Object b = id0.b((id0)v4a.y, new Float(1.0f), null, null, f07, 14);
                        if (b == v4) {
                            v = b;
                        }
                    }
                }
                return v;
            }
            case 7: {
                final dge dge = (dge)v;
                Label_0776: {
                    if (dge instanceof cge) {
                        final jge jge = (jge)this.w;
                        final Object y = this.y;
                        final jge jge2;
                        monitorenter(jge2 = jge);
                        Label_0771: {
                            try {
                                if (jge.b == y) {
                                    jge.a = ((cge)dge).b;
                                }
                            }
                            finally {
                                break Label_0771;
                            }
                            monitorexit(jge2);
                            break Label_0776;
                        }
                        monitorexit(jge2);
                    }
                }
                v = ((jja)this.x).l(dge, f07);
                if (v != pc7.v) {
                    v = lqo.a;
                }
                return v;
            }
            case 6: {
                final b4j v5 = (b4j)this.w;
                ala ala2 = null;
                Label_0871: {
                    if (f07 instanceof ala) {
                        final ala ala = (ala)f07;
                        final int y2 = ala.y;
                        if ((y2 & Integer.MIN_VALUE) != 0x0) {
                            ala.y = y2 + Integer.MIN_VALUE;
                            ala2 = ala;
                            break Label_0871;
                        }
                    }
                    ala2 = new ala(this, f07);
                }
                Object v6 = ala2.w;
                final pc7 v7 = pc7.v;
                final int y3 = ala2.y;
                b4j v8;
                if (y3 != 0) {
                    if (y3 != 1) {
                        if (y3 == 2) {
                            vt4.g0(v6);
                            return lqo.a;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o;
                    }
                    else {
                        v8 = ala2.v;
                        vt4.g0(v6);
                    }
                }
                else {
                    vt4.g0(v6);
                    final bua bua = (bua)this.x;
                    final Object v9 = v5.v;
                    ala2.v = v5;
                    ala2.y = 1;
                    v6 = bua.h(v9, v, ala2);
                    if (v6 == v7) {
                        return v7;
                    }
                    v8 = v5;
                }
                v8.v = v6;
                final jja jja = (jja)this.y;
                final Object v10 = v5.v;
                ala2.v = null;
                ala2.y = 2;
                if (jja.l(v10, (f07)ala2) != v7) {
                    return lqo.a;
                }
                return v7;
                a5 = lqo.a;
                return a5;
            }
            case 5: {
                final jja jja2 = (jja)this.x;
                final x3j x3j = (x3j)this.w;
                final lqo a6 = lqo.a;
                Object o2 = null;
                Label_1129: {
                    if (f07 instanceof cka) {
                        final cka cka = (cka)f07;
                        final int y4 = cka.y;
                        if ((y4 & Integer.MIN_VALUE) != 0x0) {
                            cka.y = y4 + Integer.MIN_VALUE;
                            o2 = cka;
                            break Label_1129;
                        }
                    }
                    o2 = new cka(this, f07);
                }
                Object o3 = ((cka)o2).w;
                final pc7 v11 = pc7.v;
                final int y5 = ((cka)o2).y;
                Label_1288: {
                    if (y5 != 0) {
                        if (y5 != 1) {
                            if (y5 == 2) {
                                v = ((cka)o2).v;
                                vt4.g0(o3);
                                break Label_1288;
                            }
                            if (y5 != 3) {
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return lqo;
                            }
                        }
                        vt4.g0(o3);
                    }
                    else {
                        vt4.g0(o3);
                        if (x3j.v) {
                            ((cka)o2).v = null;
                            ((cka)o2).y = 1;
                            if (jja2.l(v, (f07)o2) == v11) {
                                return v11;
                            }
                        }
                        else {
                            final zta zta = (zta)this.y;
                            ((cka)o2).v = v;
                            ((cka)o2).y = 2;
                            if ((o3 = zta.d(v, o2)) == v11) {
                                return v11;
                            }
                            break Label_1288;
                        }
                    }
                    return a6;
                }
                if (o3) {
                    return a6;
                }
                x3j.v = true;
                ((cka)o2).v = null;
                ((cka)o2).y = 3;
                if (jja2.l(v, (f07)o2) != v11) {
                    return a6;
                }
                return v11;
            }
            case 4: {
                final lqo a7 = lqo.a;
                final b4j b4j3 = (b4j)this.x;
                final jq8 jq8 = (jq8)this.w;
                Object o5 = null;
                Label_1411: {
                    if (f07 instanceof iq8) {
                        final iq8 iq8 = (iq8)f07;
                        final int x = iq8.x;
                        if ((x & Integer.MIN_VALUE) != 0x0) {
                            iq8.x = x + Integer.MIN_VALUE;
                            o5 = iq8;
                            break Label_1411;
                        }
                    }
                    o5 = new iq8(this, f07);
                }
                final Object v12 = ((iq8)o5).v;
                final pc7 v13 = pc7.v;
                final int x2 = ((iq8)o5).x;
                if (x2 != 0) {
                    if (x2 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return lqo2;
                    }
                    vt4.g0(v12);
                }
                else {
                    vt4.g0(v12);
                    final Object b2 = jq8.w.b(v);
                    final Object v14 = b4j3.v;
                    if (v14 == j3g.a || !(boolean)jq8.x.d(v14, b2)) {
                        b4j3.v = b2;
                        final jja jja3 = (jja)this.y;
                        ((iq8)o5).x = 1;
                        if (jja3.l(v, (f07)o5) == v13) {
                            return v13;
                        }
                    }
                }
                return a7;
            }
            case 3: {
                return this.b((haj)v, f07);
            }
            case 2: {
                final yog yog = (yog)v;
                final oc4 oc4 = (oc4)this.y;
                final e8q e8q = (e8q)yog.v;
                final boolean booleanValue3 = (boolean)yog.w;
                final b4j b4j4 = (b4j)this.w;
                final String s = (String)b4j4.v;
                if (e8q != null) {
                    if (e8q.a()) {
                        b4j4.v = e8q.b();
                    }
                    else if (booleanValue3 && s != null) {
                        b4j4.v = null;
                        final oc7 oc5 = (oc7)this.x;
                        ((y38)oc4.D0).getClass();
                        final o68 a8 = vo8.a;
                        rhc.G(oc5, (hc7)d58.w, 0, (zta)new lb4(oc4, s, (f07)null, (byte)0), 2);
                    }
                }
                return lqo.a;
            }
            case 1: {
                final lqo lqo4 = (lqo)v;
                return this.a(f07);
            }
            case 0: {
                final boolean booleanValue4 = (boolean)v;
                final efo efo = (efo)this.x;
                final irh irh = (irh)this.w;
                if (booleanValue4) {
                    booleanValue = (boolean)((zta)((xom)this.y).getValue()).d(efo.a.i(), efo.d.getValue());
                }
                irh.setValue((Object)booleanValue);
                return lqo.a;
            }
        }
    }
}
