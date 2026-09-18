import java.util.concurrent.CancellationException;
import com.anthropic.claude.analytics.events.CodeEvents$EnrollmentSource;
import com.anthropic.claude.analytics.events.CodeEvents$ReattestTrigger;

public final class e39
{
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    
    public e39(final int a, final rjc c, mdp mdp, final int n) {
        if ((n & 0x4) != 0x0) {
            mdp = null;
        }
        this.a = a;
        this.c = c;
        Object w;
        if ((w = mdp) == null) {
            w = ldp.w;
        }
        this.d = w;
    }
    
    public e39(final cjo c, final fz6 d, final oc7 e) {
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public boolean a(final int n, final int n2) {
        final ggf ggf = (ggf)((emf)this.d).g(this.a + n);
        final ggf ggf2 = (ggf)((emf)this.e).g(this.a + n2);
        if (!mlc.q((Object)ggf, (Object)ggf2)) {
            if (ggf.getClass() != ggf2.getClass()) {
                return false;
            }
        }
        return true;
    }
    
    public boolean b() {
        return ((cjo)this.c).f() != null;
    }
    
    public void c(final z29 z29, final jta jta, final jta jta2, final lta lta) {
        final boolean y = ien.y((oc7)this.d);
        final a39 x = a39.x;
        if (!y) {
            lta.b((Object)x);
            return;
        }
        final wmm wmm = (wmm)this.f;
        if (z29 == z29.x) {
            if (wmm != null && ((bqc)wmm).c()) {
                lta.b((Object)a39.w);
                return;
            }
            this.f = this.d(lta, (zta)new nh6((Object)this, (Object)jta, (Object)jta2, (f07)null, (byte)11));
        }
        else {
            if (wmm != null && ((bqc)wmm).c()) {
                lta.b((Object)x);
                return;
            }
            this.f = this.d(lta, (zta)new v92(this, jta, jta2, (f07)null));
        }
    }
    
    public wmm d(final lta lta, final zta zta) {
        final Object o = new Object();
        final wmm g = rhc.G((oc7)this.d, (hc7)null, 0, (zta)new bg7((Object)zta, (Object)new c26(o, (Object)lta, (byte)22), (f07)null, (byte)5), 3);
        ((bqc)g).U0((lta)new z36((byte)19, lta, (Object)this, o));
        return g;
    }
    
    public Object e(final CodeEvents$ReattestTrigger codeEvents$ReattestTrigger, final c39 c39) {
        x90.u(((f07)c39).getContext());
        if (ien.y((oc7)this.d)) {
            return gar.k((cjo)this.c, false, codeEvents$ReattestTrigger, (h07)c39, 1);
        }
        return Boolean.FALSE;
    }
    
    public Object f(Object a, zta zta, CodeEvents$ReattestTrigger x, lta y, final h07 h07) {
        Object o = a;
        final cjo cjo = (cjo)this.c;
        Object o2 = null;
        Label_0067: {
            if (h07 instanceof c39) {
                final c39 c39 = (c39)h07;
                final int e = c39.E;
                if ((e & Integer.MIN_VALUE) != 0x0) {
                    c39.E = e + Integer.MIN_VALUE;
                    o2 = c39;
                    break Label_0067;
                }
            }
            o2 = new c39(this, h07);
        }
        a = ((c39)o2).C;
        final int e2 = ((c39)o2).E;
        final pc7 v = pc7.v;
        boolean b = false;
        Object a2 = null;
        zta w = null;
        Object o4 = null;
        Label_1212: {
            lta y2 = null;
            CodeEvents$ReattestTrigger x2 = null;
            Label_1088: {
                Object z2 = null;
                CodeEvents$ReattestTrigger x3 = null;
                Object c40 = null;
                zta w3 = null;
                Label_1001: {
                    Object z = null;
                    Object o3 = null;
                    Label_0832: {
                        Label_0713: {
                            Object o5 = null;
                            lta y4 = null;
                            Label_0634: {
                                switch (e2) {
                                    default: {
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    case 10: {
                                        vt4.g0(a);
                                        return a;
                                    }
                                    case 9: {
                                        b = ((c39)o2).B;
                                        z = ((c39)o2).z;
                                        zta = ((c39)o2).w;
                                        vt4.g0(a);
                                        o3 = a;
                                        break Label_0832;
                                    }
                                    case 8: {
                                        vt4.g0(a);
                                        return a;
                                    }
                                    case 7: {
                                        b = ((c39)o2).B;
                                        a2 = ((c39)o2).A;
                                        w = ((c39)o2).w;
                                        vt4.g0(a);
                                        o4 = a;
                                        break Label_1212;
                                    }
                                    case 6: {
                                        b = ((c39)o2).B;
                                        y2 = ((c39)o2).y;
                                        x2 = ((c39)o2).x;
                                        zta = ((c39)o2).w;
                                        vt4.g0(a);
                                        break Label_1088;
                                    }
                                    case 5: {
                                        b = ((c39)o2).B;
                                        z2 = ((c39)o2).z;
                                        y2 = ((c39)o2).y;
                                        x3 = ((c39)o2).x;
                                        final zta w2 = ((c39)o2).w;
                                        vt4.g0(a);
                                        c40 = a;
                                        w3 = w2;
                                        break Label_1001;
                                    }
                                    case 4: {
                                        b = ((c39)o2).B;
                                        y = ((c39)o2).y;
                                        x = ((c39)o2).x;
                                        zta = ((c39)o2).w;
                                        vt4.g0(a);
                                        break Label_0713;
                                    }
                                    case 3: {
                                        b = ((c39)o2).B;
                                        final lta y3 = ((c39)o2).y;
                                        x = ((c39)o2).x;
                                        zta = ((c39)o2).w;
                                        o = ((c39)o2).v;
                                        vt4.g0(a);
                                        o5 = a;
                                        y4 = y3;
                                        break Label_0634;
                                    }
                                    case 2: {
                                        vt4.g0(a);
                                        return a;
                                    }
                                    case 1: {
                                        zta = ((c39)o2).w;
                                        o = ((c39)o2).v;
                                        vt4.g0(a);
                                        break;
                                    }
                                    case 0: {
                                        vt4.g0(a);
                                        final z29 z3 = (z29)y.b(o);
                                        if (z3 == null) {
                                            return o;
                                        }
                                        if (z3 == z29.x) {
                                            ((c39)o2).v = o;
                                            ((c39)o2).w = zta;
                                            ((c39)o2).x = null;
                                            ((c39)o2).y = null;
                                            ((c39)o2).E = 1;
                                            a = this.e(x, (c39)o2);
                                            if (a == v) {
                                                return v;
                                            }
                                            break;
                                        }
                                        else {
                                            b = (cjo.c.i() != null);
                                            ((c39)o2).v = o;
                                            ((c39)o2).w = zta;
                                            ((c39)o2).x = x;
                                            ((c39)o2).y = y;
                                            ((c39)o2).B = b;
                                            ((c39)o2).E = 3;
                                            final Object m = gar.m(cjo, (h07)o2);
                                            y4 = y;
                                            if ((o5 = m) == v) {
                                                return v;
                                            }
                                            break Label_0634;
                                        }
                                        break;
                                    }
                                }
                                if (!(boolean)a) {
                                    return o;
                                }
                                ((c39)o2).v = null;
                                ((c39)o2).w = null;
                                ((c39)o2).x = null;
                                ((c39)o2).y = null;
                                ((c39)o2).E = 2;
                                a = zta.d(o, o2);
                                if (a == v) {
                                    return v;
                                }
                                return a;
                            }
                            if (!(boolean)o5) {
                                return o;
                            }
                            ((c39)o2).v = null;
                            ((c39)o2).w = zta;
                            ((c39)o2).x = x;
                            ((c39)o2).y = y4;
                            ((c39)o2).B = b;
                            ((c39)o2).E = 4;
                            final Object d = zta.d(o, o2);
                            if (d == v) {
                                return v;
                            }
                            y = y4;
                            a = d;
                        }
                        final z29 z4 = (z29)y.b(a);
                        int n;
                        if (z4 == null) {
                            n = -1;
                        }
                        else {
                            n = b39.a[((Enum)z4).ordinal()];
                        }
                        if (n != -1) {
                            if (n != 1) {
                                if (n != 2) {
                                    en9.r();
                                    return null;
                                }
                                ((c39)o2).v = null;
                                ((c39)o2).w = zta;
                                ((c39)o2).x = null;
                                ((c39)o2).y = null;
                                ((c39)o2).z = a;
                                ((c39)o2).B = b;
                                ((c39)o2).E = 9;
                                final Object e3 = this.e(x, (c39)o2);
                                if (e3 == v) {
                                    return v;
                                }
                                o3 = e3;
                                z = a;
                                break Label_0832;
                            }
                            else if (b) {
                                cjo.m();
                                ((c39)o2).v = null;
                                ((c39)o2).w = zta;
                                ((c39)o2).x = x;
                                ((c39)o2).y = y;
                                ((c39)o2).z = a;
                                ((c39)o2).B = b;
                                ((c39)o2).E = 5;
                                c40 = cjo.c(cjo, (CodeEvents$EnrollmentSource)null, (h07)o2, 7);
                                if (c40 == v) {
                                    return v;
                                }
                                z2 = a;
                                w3 = zta;
                                x3 = x;
                                y2 = y;
                                break Label_1001;
                            }
                        }
                        return a;
                    }
                    if (!(boolean)o3) {
                        return z;
                    }
                    ((c39)o2).v = null;
                    ((c39)o2).w = null;
                    ((c39)o2).x = null;
                    ((c39)o2).y = null;
                    ((c39)o2).z = null;
                    ((c39)o2).B = b;
                    ((c39)o2).E = 10;
                    a = zta.d(z, o2);
                    if (a == v) {
                        return v;
                    }
                    return a;
                }
                if (!((nio)c40).a()) {
                    return z2;
                }
                ((c39)o2).v = null;
                ((c39)o2).w = w3;
                ((c39)o2).x = x3;
                ((c39)o2).y = y2;
                ((c39)o2).z = null;
                ((c39)o2).B = b;
                ((c39)o2).E = 6;
                final Object d2 = w3.d(z2, o2);
                if (d2 == v) {
                    return v;
                }
                x2 = x3;
                zta = w3;
                a = d2;
            }
            final z29 z5 = (z29)y2.b(a);
            int n2;
            if (z5 == null) {
                n2 = -1;
            }
            else {
                n2 = b39.a[((Enum)z5).ordinal()];
            }
            if (n2 != -1) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        en9.r();
                        return null;
                    }
                    ((c39)o2).v = null;
                    ((c39)o2).w = zta;
                    ((c39)o2).x = null;
                    ((c39)o2).y = null;
                    ((c39)o2).z = null;
                    ((c39)o2).A = a;
                    ((c39)o2).B = b;
                    ((c39)o2).E = 7;
                    final Object e4 = this.e(x2, (c39)o2);
                    if (e4 == v) {
                        return v;
                    }
                    w = zta;
                    o4 = e4;
                    a2 = a;
                    break Label_1212;
                }
                else {
                    cjo.m();
                }
            }
            return a;
        }
        if (!(boolean)o4) {
            return a2;
        }
        ((c39)o2).v = null;
        ((c39)o2).w = null;
        ((c39)o2).x = null;
        ((c39)o2).y = null;
        ((c39)o2).z = null;
        ((c39)o2).A = null;
        ((c39)o2).B = b;
        ((c39)o2).E = 8;
        a = w.d(a2, o2);
        if (a != v) {
            return a;
        }
        return v;
    }
    
    public boolean g(final pj0 pj0) {
        z29 l;
        if (pj0 != null) {
            l = e6r.l(pj0);
        }
        else {
            l = null;
        }
        return l != null && this.b();
    }
    
    public Object h(final lta lta, final h07 h07) {
        return this.i((zta)new wj0(lta, (f07)null, (byte)7), null, (lta)new q29((byte)1), h07);
    }
    
    public Object i(zta y, CodeEvents$ReattestTrigger w, lta x, h07 o) {
        while (true) {
            Label_0047: {
                if (!(o instanceof d39)) {
                    break Label_0047;
                }
                final d39 d39 = (d39)o;
                final int b = d39.B;
                if ((b & Integer.MIN_VALUE) == 0x0) {
                    break Label_0047;
                }
                d39.B = b + Integer.MIN_VALUE;
                o = d39;
                final Object z = ((d39)o).z;
                final int b2 = ((d39)o).B;
                final pc7 v = pc7.v;
                Label_0156: {
                    if (b2 == 0) {
                        break Label_0156;
                    }
                    Label_0119: {
                        if (b2 == 1) {
                            break Label_0119;
                        }
                        Label_0112: {
                            if (b2 != 2) {
                                break Label_0112;
                            }
                            y = (zta)((d39)o).y;
                            while (true) {
                                try {
                                    vt4.g0(z);
                                    return z;
                                    Label_0215: {
                                        break Label_0215;
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                        vt4.g0(z);
                                        ((d39)o).v = (m6n)y;
                                        ((d39)o).w = w;
                                        ((d39)o).x = x;
                                        ((d39)o).B = 1;
                                        final Object d40 = y.d((Object)null, o);
                                        zta zta = y;
                                        iftrue(Label_0153:)((y = (zta)d40) != v);
                                        return v;
                                        x90.u(((f07)o).getContext());
                                        return y;
                                        x = ((d39)o).x;
                                        w = ((d39)o).w;
                                        final zta zta2 = (zta)((d39)o).v;
                                        vt4.g0(z);
                                        y = (zta)z;
                                        zta = zta2;
                                        try {
                                            ((d39)o).v = null;
                                            ((d39)o).w = null;
                                            ((d39)o).x = null;
                                            ((d39)o).y = y;
                                            ((d39)o).B = 2;
                                            final Object f = this.f(y, zta, w, x, (h07)o);
                                            if (f == v) {
                                                return v;
                                            }
                                            return f;
                                        }
                                        catch (final CancellationException ex) {}
                                    }
                                    continue;
                                }
                                catch (final CancellationException ex2) {
                                    continue;
                                }
                                break;
                            }
                        }
                    }
                }
            }
            o = new d39(this, (h07)o);
            continue;
        }
    }
    
    public Object j(final CodeEvents$ReattestTrigger codeEvents$ReattestTrigger, final zta zta, final m6n m6n) {
        return this.i((zta)new sz3(zta, (f07)null, (byte)2), codeEvents$ReattestTrigger, (lta)new q29((byte)2), (h07)m6n);
    }
}
