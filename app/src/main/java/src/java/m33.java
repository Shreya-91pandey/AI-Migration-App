import androidx.work.WorkerParameters;
import com.anthropic.claude.observability.EventFlushWorker;
import com.anthropic.claude.core.events.b;
import java.util.Iterator;
import com.anthropic.claude.api.account.GrowthBookSchema;
import com.anthropic.claude.api.common.RateLimit;
import java.util.HashSet;
import com.anthropic.claude.types.strings.ConversationId;
import java.util.Set;
import java.util.concurrent.CancellationException;
import com.anthropic.claude.api.account.BootstrapResponse;
import java.util.Map;
import com.anthropic.claude.core.telemetry.SilentException;
import io.sentry.v4;
import java.util.List;
import com.anthropic.claude.api.account.AccountProfile;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.common.RateLimit$ExceedsLimit;
import com.anthropic.claude.api.usage.UsageResponse;

public final class m33 extends m6n implements zta
{
    public final byte w;
    public byte x;
    public final Object y;
    
    @Override
    public final f07 create(Object y, final f07 f07) {
        final byte w = this.w;
        y = this.y;
        switch (w) {
            default: {
                return new m33((byte)10, f07, y);
            }
            case 9: {
                return new m33((byte)9, f07, y);
            }
            case 8: {
                return new m33((byte)8, f07, y);
            }
            case 7: {
                return new m33((byte)7, f07, y);
            }
            case 6: {
                return new m33((byte)6, f07, y);
            }
            case 5: {
                return new m33((byte)5, f07, y);
            }
            case 4: {
                return new m33((byte)4, f07, y);
            }
            case 3: {
                return new m33((byte)3, f07, y);
            }
            case 2: {
                return new m33((byte)2, f07, y);
            }
            case 1: {
                return new m33((byte)1, f07, y);
            }
            case 0: {
                return new m33((byte)0, f07, y);
            }
        }
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final oc7 oc7 = (oc7)o;
        final f07 f07 = (f07)o2;
        switch (w) {
            default: {
                return ((m33)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 9: {
                return ((m33)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 8: {
                return ((m33)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 7: {
                ((m33)this.create(oc7, f07)).invokeSuspend(a);
                return pc7.v;
            }
            case 6: {
                return ((m33)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 5: {
                return ((m33)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 4: {
                return ((m33)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 3: {
                return ((m33)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 2: {
                return ((m33)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 1: {
                return ((m33)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((m33)this.create(oc7, f07)).invokeSuspend(a);
            }
        }
    }
    
    @Override
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        int n = -2;
        final int n2 = -1;
        final Object o2 = null;
        final Object o3 = null;
        final Object o4 = null;
        final Object o5 = null;
        Object o6 = null;
        final lqo lqo = null;
        final Object o7 = null;
        final lqo lqo2 = null;
        Object o8 = null;
        Object o9 = null;
        Label_2271: {
            switch (w) {
                default: {
                    final qb2 w2 = ((aui)this.y).w;
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
                        final int c = w2.c();
                        if (c != 1) {
                            if (c == 2) {
                                o = new Integer(0);
                                return o;
                            }
                            this.x = 2;
                            final l13 l13 = new l13(1, ljq.K(this));
                            l13.r();
                            w2.f((rb2)new v2b((Object)l13, (byte)29));
                            if ((o = l13.p()) == v) {
                                return v;
                            }
                            return o;
                        }
                    }
                    while (w2.c() == 1) {
                        final long a = aui.A;
                        this.x = 1;
                        if (ach.B(a, (f07)this) == v) {
                            return v;
                        }
                    }
                    int n3 = n2;
                    if (w2.c() == 2) {
                        n3 = 0;
                    }
                    o = new Integer(n3);
                    return o;
                    o = v;
                    return o;
                }
                case 9: {
                    final pc7 v2 = pc7.v;
                    final byte x2 = this.x;
                    Label_0362: {
                        if (x2 == 0) {
                            break Label_0362;
                        }
                        Label_0355: {
                            if (x2 == 1) {
                                break Label_0355;
                            }
                            Label_0344: {
                                if (x2 != 2) {
                                    break Label_0344;
                                }
                                Label_0557: {
                                    try {
                                        vt4.g0(o);
                                        break Label_0557;
                                    }
                                    finally {
                                        final ipi ipi = (ipi)this.y;
                                        ipi ipi2;
                                        monitorenter(ipi2 = ipi);
                                        try {
                                            ipi.o = false;
                                            monitorexit(ipi2);
                                        }
                                        finally {
                                            monitorexit(ipi2);
                                            try {}
                                            finally {
                                                monitorexit(ipi2);
                                            }
                                        }
                                        return v2;
                                        Object o11 = null;
                                    Label_0428:
                                        while (true) {
                                        Label_0604_Outer:
                                            while (true) {
                                                final ipi ipi3 = (ipi)this.y;
                                                synchronized (ipi3) {
                                                    ipi3.o = false;
                                                    monitorexit(ipi3);
                                                    o10 = lqo.a;
                                                    return o10;
                                                }
                                                Block_63: {
                                                    while (true) {
                                                        iftrue(Label_0626:)(n == 0);
                                                        Block_59: {
                                                            Block_62: {
                                                                break Block_62;
                                                                Label_0626: {
                                                                    final ipi ipi4;
                                                                    final ApiResult apiResult;
                                                                    ipi4.c((UsageResponse)((qj0)apiResult).b);
                                                                }
                                                                continue Label_0604_Outer;
                                                                final RateLimit a2;
                                                                o11 = a2;
                                                                break Label_0428;
                                                                final ApiResult apiResult;
                                                                Label_0594:
                                                                iftrue(Label_0604:)(!(apiResult instanceof pj0));
                                                                Block_60: {
                                                                    Block_61: {
                                                                        break Block_61;
                                                                        Label_0581:
                                                                        iftrue(Label_0594:)(!(apiResult instanceof qj0));
                                                                        break Block_60;
                                                                    }
                                                                    n = 1;
                                                                    continue;
                                                                    Label_0461:
                                                                    final ipi ipi5 = (ipi)this.y;
                                                                    monitorenter(ipi2 = ipi5);
                                                                    iftrue(Label_0495:)(!ipi5.o);
                                                                    Block_58: {
                                                                        break Block_58;
                                                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                                                        o10 = o2;
                                                                        return o10;
                                                                        vt4.g0(o);
                                                                        final ipi ipi6 = (ipi)this.y;
                                                                        this.x = 1;
                                                                        iftrue(Label_0392:)(ipi6.b((h07)this) != v2);
                                                                        return v2;
                                                                        o10 = lqo.a;
                                                                        return o10;
                                                                        vt4.g0(o);
                                                                        break Label_0604_Outer;
                                                                    }
                                                                    monitorexit(ipi2);
                                                                    o10 = lqo.a;
                                                                    return o10;
                                                                    apiResult = (ApiResult)o;
                                                                    final ipi ipi4 = (ipi)this.y;
                                                                    iftrue(Label_0581:)(apiResult != null);
                                                                    break Block_59;
                                                                }
                                                                n = 0;
                                                                continue;
                                                            }
                                                            iftrue(Label_0616:)(n != 1);
                                                            break Block_63;
                                                        }
                                                        n = -1;
                                                        continue;
                                                    }
                                                    Label_0616: {
                                                        o = new RuntimeException();
                                                    }
                                                    throw o;
                                                }
                                                continue Label_0604_Outer;
                                            }
                                            final ipi ipi7 = (ipi)this.y;
                                            ipi7.d();
                                            final RateLimit a2 = ipi7.a((String)null);
                                            o11 = o9;
                                            iftrue(Label_0428:)(!(a2 instanceof RateLimit$ExceedsLimit));
                                            continue;
                                        }
                                        iftrue(Label_0461:)(o11 != null && (mlc.q(((RateLimit$ExceedsLimit)o11).b, Boolean.TRUE) ^ true));
                                        return lqo.a;
                                        Label_0495: {
                                            final ipi ipi5;
                                            ipi5.o = true;
                                        }
                                        monitorexit(ipi2);
                                        final ipi ipi8 = (ipi)this.y;
                                        final gzo e = ipi8.e;
                                        final String a3 = ipi8.a;
                                        this.x = 2;
                                        iftrue(Label_0557:)((o = e.a(a3, (m6n)this)) != v2);
                                        return v2;
                                    }
                                }
                            }
                        }
                    }
                }
                case 8: {
                    final pc7 v3 = pc7.v;
                    final byte x3 = this.x;
                    if (x3 == 0) {
                        vt4.g0(o);
                        final cji cji = (cji)this.y;
                        if (!cji.L) {
                            this.x = 1;
                            if (cji.r1((h07)this) != v3) {
                                return lqo.a;
                            }
                        }
                        else {
                            this.x = 2;
                            if (cji.s1((h07)this) != v3) {
                                return lqo.a;
                            }
                        }
                        return v3;
                    }
                    if (x3 != 1 && x3 != 2) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o3;
                    }
                    vt4.g0(o);
                    return lqo.a;
                }
                case 7: {
                    final c0e c0e = (c0e)this.y;
                    final pc7 v4 = pc7.v;
                    final byte x4 = this.x;
                    while (true) {
                        Label_0953: {
                            Label_0915: {
                                if (x4 != 0) {
                                    if (x4 == 1) {
                                        vt4.g0(o);
                                        break Label_0915;
                                    }
                                    if (x4 == 2) {
                                        vt4.g0(o);
                                        break Label_0953;
                                    }
                                    en9.q("call to 'resume' before 'invoke' with coroutine");
                                    return o4;
                                }
                                else {
                                    vt4.g0(o);
                                }
                                final mn2 z = c0e.Z;
                                if (z != null) {
                                    this.x = 1;
                                    if (z.l((f07)this) == v4) {
                                        return v4;
                                    }
                                }
                            }
                            if (c0e.U == null) {
                                continue;
                            }
                            o = new avd((byte)7);
                            this.x = 2;
                            if (ien.O((lta)o, (h07)this) != v4) {
                                break Label_0953;
                            }
                            return v4;
                        }
                        final abh u = c0e.U;
                        if (u != null) {
                            ((cbh)u).d();
                        }
                        continue;
                    }
                }
                case 6: {
                    final dlb dlb = (dlb)this.y;
                    final j6 w3 = dlb.w;
                    final pc7 v5 = pc7.v;
                    final byte x5 = this.x;
                    Label_1149: {
                        if (x5 != 0) {
                            if (x5 != 1) {
                                Label_1024: {
                                    if (x5 == 2) {
                                        Label_1241: {
                                            try {
                                                vt4.g0(o);
                                                break Label_1149;
                                            }
                                            finally {
                                                break Label_1241;
                                            }
                                            break Label_1024;
                                        }
                                        dlb.Y.set(false);
                                    }
                                }
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return o5;
                            }
                            vt4.g0(o);
                        }
                        else {
                            vt4.g0(o);
                            final n6k a6 = ljq.a0((jta)new blb(dlb, (byte)7));
                            final q31 q31 = new q31(2, (f07)null, (byte)7);
                            this.x = 1;
                            if (vt4.A((ija)a6, (zta)q31, this) == v5) {
                                return v5;
                            }
                        }
                        if (w3.b() != null || !dlb.Y.compareAndSet(false, true)) {
                            return lqo.a;
                        }
                        final i8 f = dlb.F;
                        this.x = 2;
                        if ((o = f.b((f07)this)) != v5) {
                            break Label_1149;
                        }
                        return v5;
                    }
                    final ApiResult apiResult2 = (ApiResult)o;
                    if (apiResult2 == null) {
                        n = -1;
                    }
                    else if (apiResult2 instanceof qj0) {
                        n = 0;
                    }
                    else if (apiResult2 instanceof pj0) {
                        n = 1;
                    }
                    if (n != 0) {
                        if (n != 1) {
                            o = new RuntimeException();
                            throw o;
                        }
                    }
                    else {
                        final AccountProfile accountProfile = (AccountProfile)((qj0)apiResult2).b;
                        if (w3.b() == null) {
                            w3.e(accountProfile);
                        }
                    }
                    dlb.Y.set(false);
                    return lqo.a;
                }
                case 5: {
                    final j2b j2b = (j2b)this.y;
                    final t2b a7 = j2b.a;
                    final pc7 v6 = pc7.v;
                    final byte x6 = this.x;
                    BootstrapResponse bootstrapResponse = null;
                    Label_1475: {
                        Label_1428: {
                            if (x6 != 0) {
                                if (x6 != 1) {
                                    if (x6 != 2) {
                                        Label_1312: {
                                            if (x6 == 3) {
                                                Label_1532: {
                                                    try {
                                                        vt4.g0(o);
                                                        return lqo.a;
                                                    }
                                                    catch (final Exception ex) {
                                                        break Label_1532;
                                                    }
                                                    break Label_1312;
                                                }
                                                final Exception ex;
                                                hia.v("Failed to initialize global GrowthBook from cache", ex, (lpl)null, (List)null, 7);
                                                return lqo.a;
                                            }
                                        }
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                        return o6;
                                    }
                                    vt4.g0(o);
                                    break Label_1428;
                                }
                                else {
                                    vt4.g0(o);
                                }
                            }
                            else {
                                vt4.g0(o);
                                this.x = 1;
                                if (((u2b)a7).a.o((f07)this) == v6) {
                                    return v6;
                                }
                            }
                            final Boolean j = v4.j();
                            if (!mlc.q(j, Boolean.TRUE)) {
                                if (mlc.q(j, Boolean.FALSE)) {
                                    final i2b b = j2b.b;
                                    this.x = 2;
                                    if ((o = b.b.c(false, (h07)this)) == v6) {
                                        return v6;
                                    }
                                    break Label_1428;
                                }
                                else {
                                    if (j != null) {
                                        o = new RuntimeException();
                                        throw o;
                                    }
                                    o = new SilentException("Sentry returned null for isCrashedLastRun");
                                    SilentException.a((SilentException)o, (lpl)null, (List)null, 7);
                                }
                            }
                            final List a9 = adn.a;
                            adn.e(6, "Skipping global bootstrap cache due to previous crash", (String)null, (Map)null);
                            bootstrapResponse = null;
                            break Label_1475;
                        }
                        bootstrapResponse = (BootstrapResponse)o;
                    }
                    GrowthBookSchema b2;
                    if (bootstrapResponse != null) {
                        b2 = bootstrapResponse.b;
                    }
                    else {
                        b2 = null;
                    }
                    if (b2 == null) {
                        return lqo.a;
                    }
                    this.x = 3;
                    if (((u2b)a7).a.c(b2, (h07)this) != v6) {
                        return lqo.a;
                    }
                    return v6;
                    a8 = lqo.a;
                    return a8;
                }
                case 3: {
                    break Label_2271;
                }
                case 2: {
                    break Label_2271;
                }
                case 1: {
                    break Label_2271;
                }
                case 4: {
                    o6 = this.y;
                    o8 = ((nld)o6).b;
                    o9 = pc7.v;
                    final byte x7 = this.x;
                    if (x7 != 0 && (x7 != 1 && (x7 != 2 && x7 == 3)))
                    goto Label_1630;
                }
                case 0: {
                    Label_2521: {
                        break Label_2521;
                        Label_1803: {
                            try {
                                vt4.g0(o);
                                break Label_1803;
                            }
                            catch (final Exception ex2) {
                                break Label_1803;
                            }
                            catch (final CancellationException ex3) {
                                throw ex3;
                            }
                            fvg b3;
                            Iterator iterator;
                            b k;
                            ps9 ps9;
                            boolean b4;
                            Object o13;
                            q31 q32;
                            Set set = null;
                            String f2;
                            ConversationId conversationId;
                            byte x8;
                            Object o14;
                            Iterator iterator2;
                            Object o15;
                            n33 n4;
                            q31 q33;
                            byte x9 = 0;
                            ija p;
                            Object a10 = null;
                            byte x10;
                            qo4 qo4 = null;
                            x27 h;
                            byte x11;
                            HashSet set2;
                            String c2;
                            Object o16;
                            Object o17;
                            usi a11;
                            final Exception ex2;
                            uy7 i;
                            s74 m;
                            Iterable iterable;
                            Label_2510_Outer:Label_2729_Outer:Label_2431_Outer:
                            while (true) {
                                try {
                                    b3 = ((e60)((EventFlushWorker)o6).l).b();
                                    iterator = lq6.Y("exposures", "health_metrics").iterator();
                                    while (iterator.hasNext()) {
                                        bea.e0(b3.h((String)iterator.next()).toFile());
                                    }
                                    k = ((EventFlushWorker)o6).k;
                                    this.x = 3;
                                    o6 = k.a((h07)this);
                                    Label_2431:Block_88_Outer:
                                    while (true) {
                                        Block_98: {
                                        Block_105_Outer:
                                            while (true) {
                                                while (true) {
                                                    Block_104: {
                                                    Label_2729:
                                                        while (true) {
                                                        Label_2510:
                                                            while (true) {
                                                                Label_2374_Outer:Label_2075_Outer:Block_107_Outer:
                                                                while (true) {
                                                                    if ((o = o6) == o9) {
                                                                        o = o9;
                                                                    }
                                                                    else {
                                                                        ps9 = (ps9)o;
                                                                        b4 = ps9.b;
                                                                        o9 = adn.a;
                                                                        adn.e(2, "event_flush_worker", (String)null, y5e.Z(new yog[] { new yog((Object)"pending", (Object)ps9.a), new yog((Object)"retryable", (Object)b4), new yog((Object)"attempt", (Object)new Integer(((WorkerParameters)o8).d)) }));
                                                                        if (!b4) {
                                                                            o = mld.a();
                                                                        }
                                                                        else if (((WorkerParameters)o8).d < 2) {
                                                                            o = new kld();
                                                                        }
                                                                        else {
                                                                            o = new jld();
                                                                        }
                                                                    }
                                                                    return o;
                                                                    o13 = o6;
                                                                    return o13;
                                                                    Label_2192: {
                                                                        vt4.g0(o);
                                                                    }
                                                                    o8 = ljq.a0((jta)new p1(o6, (byte)29));
                                                                    q32 = new q31(2, (f07)null, (byte)5);
                                                                    this.x = 1;
                                                                    iftrue(Label_2243:)(vt4.A((ija)o8, (zta)q32, this) != o9);
                                                                    return o9;
                                                                    Label_2569:
                                                                    en9.q("call to 'resume' before 'invoke' with coroutine");
                                                                    o13 = o8;
                                                                    return o13;
                                                                    while (true) {
                                                                    Label_2632:
                                                                        while (true) {
                                                                            while (true) {
                                                                                Block_101: {
                                                                                    while (true) {
                                                                                        Block_91: {
                                                                                            while (true) {
                                                                                            Block_95:
                                                                                                while (true) {
                                                                                                    Block_86: {
                                                                                                        Block_94: {
                                                                                                        Label_2075:
                                                                                                            while (true) {
                                                                                                                Label_2084: {
                                                                                                                    while (true) {
                                                                                                                        while (true) {
                                                                                                                            Label_2243: {
                                                                                                                            Label_2473:
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                        set = (Set)o;
                                                                                                                                        iftrue(Label_2313:)(set == null);
                                                                                                                                        break Block_98;
                                                                                                                                        Label_2072:
                                                                                                                                        o = o9;
                                                                                                                                        break Label_2075;
                                                                                                                                        Label_2185:
                                                                                                                                        vt4.g0(o);
                                                                                                                                        break Label_2243;
                                                                                                                                        break Label_2510;
                                                                                                                                        vt4.g0(o);
                                                                                                                                        return o9;
                                                                                                                                        conversationId = new ConversationId(f2);
                                                                                                                                        break Label_2473;
                                                                                                                                        while (true) {
                                                                                                                                            iftrue(Label_2029:)(x8 == 1);
                                                                                                                                            break Block_86;
                                                                                                                                            Label_2018:
                                                                                                                                            en9.q("call to 'resume' before 'invoke' with coroutine");
                                                                                                                                            o14 = lqo;
                                                                                                                                            return o14;
                                                                                                                                            o9 = lqo.a;
                                                                                                                                            o8 = this.y;
                                                                                                                                            o6 = pc7.v;
                                                                                                                                            x8 = this.x;
                                                                                                                                            iftrue(Label_2036:)(x8 == 0);
                                                                                                                                            continue Block_107_Outer;
                                                                                                                                        }
                                                                                                                                        break Label_2729;
                                                                                                                                        iftrue(Label_2431:)(conversationId == null);
                                                                                                                                        break Block_101;
                                                                                                                                        Label_2029:
                                                                                                                                        vt4.g0(o);
                                                                                                                                        break Label_2084;
                                                                                                                                        vt4.g0(o);
                                                                                                                                        return lqo.a;
                                                                                                                                        Label_2330:
                                                                                                                                        vt4.g0(o);
                                                                                                                                        continue Label_2075_Outer;
                                                                                                                                    }
                                                                                                                                    Label_2471:
                                                                                                                                    conversationId = null;
                                                                                                                                    continue Label_2473;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            this.x = 2;
                                                                                                                            iftrue(Label_2265:)(((s57)o6).c((h07)this) != o9);
                                                                                                                            return o9;
                                                                                                                            f2 = g9r.f((yhd)iterator2.next());
                                                                                                                            iftrue(Label_2471:)(f2 == null);
                                                                                                                            continue Block_107_Outer;
                                                                                                                        }
                                                                                                                        iftrue(Label_2487:)(!iterator2.hasNext());
                                                                                                                        continue Label_2431_Outer;
                                                                                                                    }
                                                                                                                    iftrue(Label_2084:)(o != o6);
                                                                                                                    return o6;
                                                                                                                    o15 = o6;
                                                                                                                    return o15;
                                                                                                                    Label_2587:
                                                                                                                    vt4.g0(o);
                                                                                                                    o8 = n4.c.x;
                                                                                                                    q33 = new q31(2, (f07)null, (byte)1);
                                                                                                                    this.x = 1;
                                                                                                                    iftrue(Label_2632:)(vt4.A((ija)o8, (zta)q33, this) != o6);
                                                                                                                    return o6;
                                                                                                                    iftrue(Label_2580:)(x9 == 1);
                                                                                                                    break Block_104;
                                                                                                                }
                                                                                                                p = ri2.p((ija)((rv7)o8).c().c, -1);
                                                                                                                o8 = new wb0(o8, (byte)7);
                                                                                                                this.x = 2;
                                                                                                                iftrue(Label_2012:)(p.a((jja)o8, (f07)this) != o6);
                                                                                                                return o6;
                                                                                                                a10 = o9;
                                                                                                                return a10;
                                                                                                                o6 = this.y;
                                                                                                                o9 = pc7.v;
                                                                                                                x10 = this.x;
                                                                                                                iftrue(Label_2192:)(x10 == 0);
                                                                                                                Block_90: {
                                                                                                                    break Block_90;
                                                                                                                    Label_2580:
                                                                                                                    vt4.g0(o);
                                                                                                                    break Label_2632;
                                                                                                                    vt4.g0(o);
                                                                                                                    return o9;
                                                                                                                    Label_2337:
                                                                                                                    vt4.g0(o);
                                                                                                                    h = qo4.h;
                                                                                                                    this.x = 1;
                                                                                                                    o8 = h.i(this);
                                                                                                                    iftrue(Label_2374:)((o = o8) != o6);
                                                                                                                    return o6;
                                                                                                                }
                                                                                                                iftrue(Label_2185:)(x10 == 1);
                                                                                                                break Block_91;
                                                                                                                o9 = lqo.a;
                                                                                                                qo4 = (qo4)this.y;
                                                                                                                o6 = pc7.v;
                                                                                                                x11 = this.x;
                                                                                                                iftrue(Label_2337:)(x11 == 0);
                                                                                                                break Block_94;
                                                                                                                iftrue(Label_2563:)(o != o6);
                                                                                                                return o6;
                                                                                                                continue Label_2075;
                                                                                                            }
                                                                                                            Label_2313:
                                                                                                            o15 = o9;
                                                                                                            return o15;
                                                                                                        }
                                                                                                        iftrue(Label_2330:)(x11 == 1);
                                                                                                        break Block_95;
                                                                                                    }
                                                                                                    iftrue(Label_2018:)(x8 != 2);
                                                                                                    continue Block_88_Outer;
                                                                                                }
                                                                                                iftrue(Label_2319:)(x11 != 2);
                                                                                                continue Block_107_Outer;
                                                                                            }
                                                                                            o14 = o6;
                                                                                            return o14;
                                                                                        }
                                                                                        iftrue(Label_2174:)(x10 != 2);
                                                                                        continue Label_2431_Outer;
                                                                                    }
                                                                                }
                                                                                set2.add((Object)conversationId);
                                                                                continue Label_2431;
                                                                                o9 = lqo.a;
                                                                                n4 = (n33)this.y;
                                                                                o6 = pc7.v;
                                                                                x9 = this.x;
                                                                                iftrue(Label_2587:)(x9 == 0);
                                                                                continue Block_88_Outer;
                                                                            }
                                                                            iftrue(Label_2313:)(o != o6);
                                                                            return o6;
                                                                            Label_2012:
                                                                            o14 = o9;
                                                                            return o14;
                                                                            vt4.g0(o);
                                                                            return o9;
                                                                            Label_2487:
                                                                            o = ((o77)o8).o(c2, set2, (h07)this);
                                                                            iftrue(Label_2507:)(o != o6);
                                                                            continue Label_2510_Outer;
                                                                        }
                                                                        o8 = new Object();
                                                                        o16 = new Object();
                                                                        o17 = new Object();
                                                                        a11 = n4.a.a;
                                                                        o8 = new l33((Object)n4, o17, o8, o16, (byte)0);
                                                                        this.x = 2;
                                                                        o8 = new bd0((jja)o8, (byte)16);
                                                                        o = ((ija)a11.v).a((jja)o8, (f07)this);
                                                                        iftrue(Label_2726:)(o != o6);
                                                                        continue Label_2729_Outer;
                                                                    }
                                                                    SilentException.a(new SilentException("event_flush_worker: drain pass escaped", (Throwable)ex2), lpl.w, (List)null, 6);
                                                                    ps9 = new ps9(true, true);
                                                                    continue Label_2374_Outer;
                                                                }
                                                                Label_2174: {
                                                                    en9.q("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                a10 = o7;
                                                                return a10;
                                                                Label_2507:
                                                                o = o9;
                                                                continue Label_2510;
                                                            }
                                                            Label_2726: {
                                                                o = o9;
                                                            }
                                                            continue Label_2729;
                                                        }
                                                        Label_2265: {
                                                            a10 = lqo.a;
                                                        }
                                                        return a10;
                                                        Label_2563:
                                                        o13 = o9;
                                                        return o13;
                                                    }
                                                    iftrue(Label_2569:)(x9 != 2);
                                                    continue;
                                                }
                                                Label_2036: {
                                                    vt4.g0(o);
                                                }
                                                i = ((rv7)o8).i;
                                                this.x = 1;
                                                o = ((bqc)i.w).r((f07)this);
                                                iftrue(Label_2072:)(o != o6);
                                                continue Block_105_Outer;
                                            }
                                            Label_2319: {
                                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            o15 = lqo2;
                                            return o15;
                                        }
                                        m = qo4.i;
                                        this.x = 2;
                                        o8 = m.b;
                                        c2 = m.c;
                                        iterable = (Iterable)set;
                                        set2 = new HashSet();
                                        iterator2 = iterable.iterator();
                                        continue Label_2431;
                                    }
                                }
                                finally {
                                    continue;
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
}
