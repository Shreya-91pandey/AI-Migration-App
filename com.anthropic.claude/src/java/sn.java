import com.google.android.gms.common.api.ApiException;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsApiError;
import com.google.android.gms.common.api.Status;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsCheckStarted;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsErrorType;
import com.google.android.play.agesignals.AgeSignalsException;
import java.util.concurrent.CancellationException;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsRetry;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsCheckCompleted;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsResult;
import java.util.Set;

public final class sn
{
    public static final Set i;
    public static final Set j;
    public final st4 a;
    public final l7n b;
    public final n2b c;
    public final un d;
    public final hoi e;
    public final fz6 f;
    public volatile wmm g;
    public final apm h;
    
    static {
        i = iw0.n1((Object[])new Integer[] { -9, -100, -10 });
        j = iw0.n1((Object[])new Integer[] { -1, -2, -4 });
    }
    
    public sn(final st4 a, final l7n b, final n2b c, final un d) {
        final goi v = hoi.v;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (hoi)v;
        final o68 a2 = vo8.a;
        final d58 w = d58.w;
        this.f = ien.a((hc7)bro.w.j1(1, "AgeSignals"));
        this.h = bpm.a((Object)new jn(0, wn.v));
    }
    
    public static final void f(final boolean b, final sn sn, long i, final wn wn, final int n) {
        if (b) {
            i = lz8.i(gwn.b(i));
            final st4 a = sn.a;
            AgeSignalsEvents$AgeSignalsResult ageSignalsEvents$AgeSignalsResult = null;
            switch (wn.ordinal()) {
                default: {
                    en9.r();
                    return;
                }
                case 7: {
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.A;
                    break;
                }
                case 6: {
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.z;
                    break;
                }
                case 5: {
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.B;
                    break;
                }
                case 4: {
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.D;
                    break;
                }
                case 3: {
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.C;
                    break;
                }
                case 2: {
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.y;
                    break;
                }
                case 1: {
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.x;
                    break;
                }
                case 0:
                case 8:
                case 9: {
                    ageSignalsEvents$AgeSignalsResult = AgeSignalsEvents$AgeSignalsResult.w;
                    break;
                }
            }
            final AgeSignalsEvents$AgeSignalsCheckCompleted ageSignalsEvents$AgeSignalsCheckCompleted = new AgeSignalsEvents$AgeSignalsCheckCompleted(ageSignalsEvents$AgeSignalsResult, n, i);
            final KSerializer s = yi2.S(a0l.a, (buc)v4j.b((Class)AgeSignalsEvents$AgeSignalsCheckCompleted.class));
            vt4.b0(s);
            a.b(ageSignalsEvents$AgeSignalsCheckCompleted, s);
        }
    }
    
    public final Object a(final h07 h07) {
        Object o = null;
        Label_0047: {
            if (h07 instanceof kn) {
                final kn kn = (kn)h07;
                final int x = kn.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    kn.x = x + Integer.MIN_VALUE;
                    o = kn;
                    break Label_0047;
                }
            }
            o = new kn(this, h07);
        }
        Object o2 = ((kn)o).v;
        final pc7 v = pc7.v;
        final int x2 = ((kn)o).x;
        Label_0160: {
            if (x2 != 0) {
                if (x2 != 1) {
                    if (x2 == 2) {
                        vt4.g0(o2);
                        break Label_0160;
                    }
                    if (x2 == 3) {
                        vt4.g0(o2);
                        return o2;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    vt4.g0(o2);
                }
            }
            else {
                vt4.g0(o2);
                final n2b c = this.c;
                ((kn)o).x = 1;
                if (c.a((h07)o) == v) {
                    return v;
                }
            }
            ((kn)o).x = 2;
            if ((o2 = this.b((h07)o)) == v) {
                return v;
            }
        }
        final wn wn = (wn)o2;
        wn.getClass();
        final wn c2 = wn.C;
        if (wn != c2) {
            return wn;
        }
        ((kn)o).x = 3;
        final wn b = ((jn)this.h.getValue()).b;
        b.getClass();
        Enum enum1;
        if (b == c2) {
            final st4 a = this.a;
            final AgeSignalsEvents$AgeSignalsRetry ageSignalsEvents$AgeSignalsRetry = new AgeSignalsEvents$AgeSignalsRetry();
            final KSerializer s = yi2.S(a0l.a, (buc)v4j.b((Class)AgeSignalsEvents$AgeSignalsRetry.class));
            vt4.b0(s);
            a.b((v10)ageSignalsEvents$AgeSignalsRetry, s);
            final int a2 = ((jn)this.h.getValue()).a;
            this.g(a2, wn.v);
            this.g = rhc.G((oc7)this.f, (hc7)null, 0, (zta)new qn(this, a2, (f07)null), 3);
            enum1 = this.b((h07)o);
        }
        else {
            enum1 = ((jn)this.h.getValue()).b;
        }
        if (enum1 != v) {
            return enum1;
        }
        return v;
    }
    
    public final Enum b(final h07 h07) {
        Object o = null;
        Label_0047: {
            if (h07 instanceof ln) {
                final ln ln = (ln)h07;
                final int x = ln.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    ln.x = x + Integer.MIN_VALUE;
                    o = ln;
                    break Label_0047;
                }
            }
            o = new ln(this, h07);
        }
        final Object v = ((ln)o).v;
        final int x2 = ((ln)o).x;
        Object o2;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            o2 = v;
        }
        else {
            vt4.g0(v);
            final mn mn = new mn((byte)0, (f07)null, (Object)this);
            ((ln)o).x = 1;
            final Object j0 = r6k.j0(36000L, (zta)mn, (f07)o);
            final pc7 v2 = pc7.v;
            if ((o2 = j0) == v2) {
                return (Enum)v2;
            }
        }
        final wn wn = (wn)o2;
        if (wn == null) {
            return wn.B;
        }
        return wn;
    }
    
    public final void c() {
        final wmm g = this.g;
        if (g != null && ((bqc)g).c()) {
            return;
        }
        this.g = rhc.G((oc7)this.f, (hc7)null, 0, (zta)new nn(this, ((jn)this.h.getValue()).a, null), 3);
    }
    
    public final void d() {
        final wmm g = this.g;
        if (g != null) {
            ((bqc)g).g((CancellationException)null);
        }
        this.g = null;
        final apm h = this.h;
        Object value;
        do {
            value = h.getValue();
        } while (!h.j(value, (Object)new jn(((jn)value).a + 1, wn.v)));
    }
    
    public final Enum e(boolean v, h07 h07) {
        Object o = this;
        Label_0055: {
            if (h07 instanceof on) {
                final on on = (on)h07;
                final int d = on.D;
                if ((d & Integer.MIN_VALUE) != 0x0) {
                    on.D = d + Integer.MIN_VALUE;
                    h07 = on;
                    break Label_0055;
                }
            }
            h07 = new on((sn)o, h07);
        }
        Object o2 = ((on)h07).B;
        int n = ((on)h07).D;
        Object c = wn.C;
        Object b = wn.B;
        final pc7 v2 = pc7.v;
        Label_0262: {
            if (n == 0) {
                break Label_0262;
            }
            Label_0243: {
                if (n == 1) {
                    break Label_0243;
                }
                Label_0198: {
                    if (n == 2) {
                        break Label_0198;
                    }
                    Label_0191: {
                        if (n != 3) {
                            break Label_0191;
                        }
                    Label_0405_Outer:
                        while (true) {
                            n = ((on)h07).A;
                            int y = ((on)h07).y;
                            int z = ((on)h07).x;
                            long w = ((on)h07).w;
                            v = ((on)h07).v;
                        Label_0405:
                            while (true) {
                                Label_1175: {
                                    try {
                                    Block_16_Outer:
                                        while (true) {
                                            Label_0642: {
                                                try {
                                                    vt4.g0(o2);
                                                    final Object b2 = null;
                                                    final int x = y;
                                                    o = h07;
                                                    break Label_0642;
                                                }
                                                catch (final Exception ex) {
                                                    final h07 h8 = null;
                                                    o = ex;
                                                    final Object b2 = h8;
                                                }
                                                catch (final UnsupportedOperationException ex2) {
                                                    goto Label_1146;
                                                }
                                                catch (final AgeSignalsException o2) {
                                                    final h07 h9 = null;
                                                    final h07 h10 = h07;
                                                    h07 = (h07)b;
                                                    b = h10;
                                                    final Object b2 = h9;
                                                    break Label_1175;
                                                }
                                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                                o = this;
                                                try {
                                                    try {
                                                        try {
                                                            Object b2 = null;
                                                            final pn pn = new pn((byte)0, (f07)b2, o);
                                                            ((on)h07).v = v;
                                                            ((on)h07).w = w;
                                                            int x = 0;
                                                            ((on)h07).x = x;
                                                            ((on)h07).y = y;
                                                            ((on)h07).z = z;
                                                            ((on)h07).A = n;
                                                            try {
                                                                ((on)h07).D = 3;
                                                                o2 = b2;
                                                                try {
                                                                    final Object j0 = r6k.j0(10000L, (zta)pn, (f07)h07);
                                                                    if (j0 == v2) {
                                                                        return (Enum)v2;
                                                                    }
                                                                    o = h07;
                                                                    h07 = (h07)j0;
                                                                    b2 = o2;
                                                                    z = x;
                                                                    x = y;
                                                                    o2 = h07;
                                                                    h07 = (h07)this;
                                                                    try {
                                                                        try {
                                                                            o2 = o2;
                                                                            Label_0708: {
                                                                                if (o2 == null) {
                                                                                    try {
                                                                                        try {
                                                                                            ((sn)h07).h(0, AgeSignalsEvents$AgeSignalsErrorType.w, n);
                                                                                            h07 = (h07)o;
                                                                                            o = c;
                                                                                            n = z;
                                                                                        }
                                                                                        catch (final Exception o2) {
                                                                                            h07 = (h07)o;
                                                                                            y = x;
                                                                                            o = o2;
                                                                                        }
                                                                                        catch (final AgeSignalsException ex3) {}
                                                                                    }
                                                                                    catch (final UnsupportedOperationException ex4) {}
                                                                                }
                                                                                else {
                                                                                    final Integer c2 = ((v7r)o2).c();
                                                                                Label_0877:
                                                                                    while (true) {
                                                                                    Label_0761:
                                                                                        while (true) {
                                                                                            Label_0764: {
                                                                                                if (c2 == null) {
                                                                                                    break Label_0764;
                                                                                                }
                                                                                                y = c2;
                                                                                                if (y == 0) {
                                                                                                    o2 = wn.w;
                                                                                                    break Label_0761;
                                                                                                }
                                                                                                break Label_0764;
                                                                                                break Label_0877;
                                                                                            }
                                                                                            if (c2 != null) {
                                                                                                y = c2;
                                                                                                if (y == 1) {
                                                                                                    break Label_0877;
                                                                                                }
                                                                                            }
                                                                                            Label_0802: {
                                                                                                if (c2 == null) {
                                                                                                    break Label_0802;
                                                                                                }
                                                                                            Label_0900:
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        if (c2 != 2) {
                                                                                                            if (c2 != null) {
                                                                                                                y = c2;
                                                                                                                if (y == 3) {
                                                                                                                    break Label_0877;
                                                                                                                }
                                                                                                            }
                                                                                                            if (c2 != null) {
                                                                                                                while (true) {
                                                                                                                    Label_0903: {
                                                                                                                        try {
                                                                                                                            if (c2 != 5) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            final Integer a = ((v7r)o2).a();
                                                                                                                            o2 = ((v7r)o2).b();
                                                                                                                            if (a != null && a >= 18) {
                                                                                                                                o2 = wn.y;
                                                                                                                                continue Label_0761;
                                                                                                                            }
                                                                                                                            break Label_0903;
                                                                                                                        }
                                                                                                                        catch (final Exception ex5) {}
                                                                                                                        catch (final AgeSignalsException ex6) {}
                                                                                                                        break Label_0900;
                                                                                                                    }
                                                                                                                    if (o2 != null && (int)o2 < 18) {
                                                                                                                        o2 = wn.z;
                                                                                                                        continue Label_0877;
                                                                                                                    }
                                                                                                                    o2 = wn.A;
                                                                                                                    continue Label_0877;
                                                                                                                    break Label_0708;
                                                                                                                }
                                                                                                            }
                                                                                                            o2 = b;
                                                                                                            break Label_0877;
                                                                                                        }
                                                                                                    }
                                                                                                    catch (final Exception o2) {
                                                                                                        goto Label_0882;
                                                                                                    }
                                                                                                    catch (final AgeSignalsException o2) {
                                                                                                        continue Label_0900;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        try {
                                                                                            o2 = wn.x;
                                                                                            continue Label_0877;
                                                                                            try {
                                                                                                f(v, (sn)h07, w, (wn)o2, n);
                                                                                                return (Enum)o2;
                                                                                            }
                                                                                            catch (final Exception o2) {
                                                                                                goto Label_0882;
                                                                                            }
                                                                                            catch (final UnsupportedOperationException ex7) {}
                                                                                            catch (final AgeSignalsException ex8) {}
                                                                                            h07 = (h07)b;
                                                                                            b = o;
                                                                                            o = this;
                                                                                            y = x;
                                                                                        }
                                                                                        catch (final Exception ex9) {}
                                                                                        catch (final AgeSignalsException o2) {}
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            final sn sn = (sn)o;
                                                                            o = h07;
                                                                            h07 = (h07)b;
                                                                            b = sn;
                                                                            y = x;
                                                                        }
                                                                        catch (final UnsupportedOperationException ex10) {}
                                                                    }
                                                                    catch (final Exception o2) {}
                                                                    catch (final AgeSignalsException o2) {}
                                                                }
                                                                catch (final Exception ex11) {}
                                                                catch (final UnsupportedOperationException ex12) {}
                                                                catch (final AgeSignalsException ex13) {}
                                                                final h07 h11 = (h07)b;
                                                                b = h07;
                                                                h07 = h11;
                                                                z = x;
                                                            }
                                                            catch (final Exception o2) {}
                                                            catch (final AgeSignalsException o2) {}
                                                        }
                                                        catch (final UnsupportedOperationException ex14) {}
                                                    }
                                                    catch (final Exception o2) {}
                                                    catch (final AgeSignalsException o2) {}
                                                }
                                                catch (final Exception o2) {}
                                                catch (final UnsupportedOperationException ex15) {}
                                                catch (final AgeSignalsException o2) {}
                                            }
                                            return (Enum)h07;
                                        Label_0526:
                                            while (true) {
                                                long n2;
                                                iftrue(Label_0450:)((n2 = 500L << z - 1) <= 2000L);
                                                Block_15: {
                                                    Label_0370: {
                                                        final int a2;
                                                    Label_0450:
                                                        while (true) {
                                                            Block_12: {
                                                                Block_17: {
                                                                    break Block_17;
                                                                    iftrue(Label_1318:)(z >= n);
                                                                    break Block_15;
                                                                    vt4.g0(o2);
                                                                    w = bhf.b();
                                                                    iftrue(Label_0329:)(!v);
                                                                    break Block_12;
                                                                    w = ((on)h07).w;
                                                                    v = ((on)h07).v;
                                                                    vt4.g0(o2);
                                                                    break Label_0370;
                                                                    Label_0529: {
                                                                        y = z;
                                                                    }
                                                                    int x = n;
                                                                    n = a2;
                                                                    continue Block_16_Outer;
                                                                    ((on)h07).v = v;
                                                                    ((on)h07).w = w;
                                                                    ((on)h07).D = 1;
                                                                    final Object b2 = ((sn)o).d.b((Object)h07);
                                                                    iftrue(Label_0370:)((o2 = b2) != v2);
                                                                    return (Enum)v2;
                                                                    Label_0516:
                                                                    y = z;
                                                                    x = n;
                                                                    n = a2;
                                                                    break Label_0526;
                                                                }
                                                                n2 = 2000L;
                                                                break Label_0450;
                                                                Label_0400: {
                                                                    n = 3;
                                                                }
                                                                z = 0;
                                                                continue Label_0405;
                                                            }
                                                            final AgeSignalsEvents$AgeSignalsCheckStarted ageSignalsEvents$AgeSignalsCheckStarted = new AgeSignalsEvents$AgeSignalsCheckStarted();
                                                            final KSerializer s = yi2.S(a0l.a, (buc)v4j.b((Class)AgeSignalsEvents$AgeSignalsCheckStarted.class));
                                                            vt4.b0(s);
                                                            ((sn)o).a.b(ageSignalsEvents$AgeSignalsCheckStarted, s);
                                                            continue;
                                                        }
                                                        final long k = this.e.k(n2 + 1L);
                                                        ((on)h07).v = v;
                                                        ((on)h07).w = w;
                                                        ((on)h07).x = n;
                                                        ((on)h07).y = z;
                                                        ((on)h07).z = z;
                                                        ((on)h07).A = a2;
                                                        ((on)h07).D = 2;
                                                        iftrue(Label_0516:)(ach.A(k, (f07)h07) != v2);
                                                        return (Enum)v2;
                                                        final Object b2 = null;
                                                        n = ((on)h07).A;
                                                        z = ((on)h07).z;
                                                        y = ((on)h07).y;
                                                        int x = ((on)h07).x;
                                                        w = ((on)h07).w;
                                                        v = ((on)h07).v;
                                                        vt4.g0(o2);
                                                        break Label_0526;
                                                    }
                                                    final Object b2 = null;
                                                    iftrue(Label_0400:)(!(boolean)o2);
                                                    break Block_16_Outer;
                                                }
                                                final int a2 = z + 1;
                                                iftrue(Label_0529:)(z <= 0);
                                                continue Label_0405_Outer;
                                            }
                                            continue Block_16_Outer;
                                        }
                                        f(v, (sn)o, w, (wn)b, 0);
                                        h07 = (h07)b;
                                        return (Enum)h07;
                                    }
                                    catch (final CancellationException ex16) {}
                                }
                                final Status v3 = ((ApiException)o2).v;
                                final int v4 = v3.v;
                                final int v5 = v3.v;
                                final boolean contains = sn.i.contains((Object)v4);
                                if (!contains) {
                                    o2 = AgeSignalsEvents$AgeSignalsErrorType.w;
                                }
                                else {
                                    o2 = AgeSignalsEvents$AgeSignalsErrorType.x;
                                }
                                ((sn)o).h(v5, (AgeSignalsEvents$AgeSignalsErrorType)o2, n);
                                if (contains) {
                                    f(v, (sn)o, w, (wn)h07, n);
                                    return (Enum)h07;
                                }
                                final h07 h12 = h07;
                                if (sn.j.contains((Object)new Integer(v5))) {
                                    f(v, this, w, (wn)c, n);
                                    return (Enum)c;
                                }
                                h07 = (h07)b;
                                b = h12;
                                goto Label_1131;
                                int x = 0;
                                z = x + 1;
                                c = o;
                                continue Label_0405;
                            }
                            Label_1318: {
                                f(v, this, w, (wn)c, 3);
                            }
                            return (Enum)c;
                        }
                    }
                }
            }
        }
    }
    
    public final void g(final int n, final wn wn) {
        apm h;
        Object value;
        jn jn;
        do {
            h = this.h;
            value = h.getValue();
            jn = (jn)value;
            final int a = jn.a;
            if (a == n) {
                jn = new jn(a, wn);
            }
        } while (!h.j(value, (Object)jn));
    }
    
    public final void h(final int n, final AgeSignalsEvents$AgeSignalsErrorType ageSignalsEvents$AgeSignalsErrorType, final int n2) {
        final AgeSignalsEvents$AgeSignalsApiError ageSignalsEvents$AgeSignalsApiError = new AgeSignalsEvents$AgeSignalsApiError(n, ageSignalsEvents$AgeSignalsErrorType, n2);
        final KSerializer s = yi2.S(a0l.a, (buc)v4j.b((Class)AgeSignalsEvents$AgeSignalsApiError.class));
        vt4.b0(s);
        this.a.b(ageSignalsEvents$AgeSignalsApiError, s);
    }
}
