import java.util.Set;
import java.util.List;

public final class hw7 extends m6n implements zta
{
    public Object A;
    public Object B;
    public final Object C;
    public final byte w;
    public byte x;
    public Object y;
    public Object z;
    
    public hw7(final cof b, final zta c, final f07 f07) {
        this.w = 1;
        this.B = b;
        this.C = c;
        super(2, f07);
    }
    
    public hw7(final jta c, final f07 f07) {
        this.w = 3;
        this.C = c;
        super(2, f07);
    }
    
    public hw7(final qx3 z, final List a, final Set b, final mw7 c, final f07 f07) {
        this.w = 0;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        super(2, f07);
    }
    
    public hw7(final zmk b, final Object y, final efo c, final f07 f07) {
        this.w = 2;
        this.B = b;
        this.y = y;
        this.C = c;
        super(2, f07);
    }
    
    public final f07 create(final Object y, final f07 f07) {
        final byte w = this.w;
        final Object c = this.C;
        switch (w) {
            default: {
                final hw7 hw7 = new hw7((jta)c, f07);
                hw7.B = y;
                return (f07)hw7;
            }
            case 2: {
                return (f07)new hw7((zmk)this.B, this.y, (efo)c, f07);
            }
            case 1: {
                final hw7 hw8 = new hw7((cof)this.B, (zta)c, f07);
                hw8.y = y;
                return (f07)hw8;
            }
            case 0: {
                final hw7 hw9 = new hw7((qx3)this.z, (List)this.A, (Set)this.B, (mw7)c, f07);
                hw9.y = y;
                return (f07)hw9;
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                ((hw7)this.create(o, (f07)o2)).invokeSuspend(a);
                return pc7.v;
            }
            case 2: {
                return ((hw7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 1: {
                return ((hw7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((hw7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        Object a = lqo.a;
        pc7 v = pc7.v;
        final Object c = this.C;
        switch (w) {
            default: {
                final jta jta = (jta)c;
                final byte x = this.x;
                Label_0202: {
                    if (x == 0) {
                        break Label_0202;
                    }
                    Label_0143: {
                        if (x != 1) {
                            if (x == 2) {
                                break Label_0143;
                            }
                            if (x != 3) {
                                break Label_0143;
                            }
                        }
                        final Object y = this.y;
                        Object c2 = this.A;
                        Object o2 = this.z;
                        jja b = (jja)this.B;
                        final Object o3 = c2;
                        final Object o4 = o2;
                    Label_0473_Outer:
                        while (true) {
                            try {
                                vt4.g0(o);
                                o = y;
                                break Label_0366;
                            }
                            finally {
                                final r1 r1 = (r1)((gfk)o4).v;
                                if (r1 != null) {
                                    r1.n((xd3)o3);
                                }
                                final r1 r2 = (r1)((gfk)o4).v;
                                if (r2 == null) {
                                    pih.b("Called dispose on a manager that has been disposed of");
                                }
                                r2.g();
                                ((gfk)o4).v = null;
                                gfk z = null;
                                xd3 a2 = null;
                                Object j = null;
                                jja b2 = null;
                                Block_28: {
                                    while (true) {
                                        j = z.j(a2, jta);
                                        final Object y2;
                                        o = y2;
                                        c2 = a2;
                                        o2 = z;
                                        b = b2;
                                        iftrue(Label_0366:)(mlc.q(j, y2));
                                        break Block_28;
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                        v = null;
                                        return v;
                                        y2 = this.y;
                                        a2 = (xd3)this.A;
                                        z = (gfk)this.z;
                                        b2 = (jja)this.B;
                                        vt4.g0(o);
                                        continue;
                                    }
                                    vt4.g0(o);
                                    final jja b3 = (jja)this.B;
                                    o2 = new Object();
                                    ((gfk)o2).v = new szl();
                                    c2 = ao2.c(1, 0, 6);
                                    final Object i = ((gfk)o2).j((xd3)c2, jta);
                                    this.B = b3;
                                    this.z = o2;
                                    this.A = c2;
                                    this.y = i;
                                    this.x = 1;
                                    o = i;
                                    b = b3;
                                    iftrue(Label_0366:)(b3.l(i, (f07)this) != v);
                                    return v;
                                    this.B = b;
                                    this.z = o2;
                                    this.A = c2;
                                    this.y = o;
                                    this.x = 2;
                                    Object y2 = o;
                                    a2 = (xd3)c2;
                                    z = (gfk)o2;
                                    b2 = b;
                                    iftrue(Label_0473:)(((xd3)c2).l((f07)this) != v);
                                    return v;
                                }
                                this.B = b2;
                                this.z = z;
                                this.A = a2;
                                this.y = j;
                                this.x = 3;
                                o = b2.l(j, (f07)this);
                                iftrue(Label_0622:)(o != v);
                                return v;
                                Label_0622: {
                                    o = j;
                                }
                                c2 = a2;
                                o2 = z;
                                b = b2;
                                continue Label_0473_Outer;
                            }
                            break;
                        }
                    }
                }
            }
            case 2: {
                final efo efo = (efo)c;
                final Object y3 = this.y;
                final zmk a3 = (zmk)this.B;
                final ksg x2 = a3.x;
                final gsg e = a3.E;
                final byte x3 = this.x;
                Label_1473: {
                    zmk zmk;
                    if (x3 != 0) {
                        if (x3 != 1) {
                            if (x3 == 2) {
                                vt4.g0(o);
                                break Label_1473;
                            }
                            if (x3 == 3) {
                                vt4.g0(o);
                                break Label_1473;
                            }
                            if (x3 == 4) {
                                vt4.g0(o);
                                break Label_1473;
                            }
                            if (x3 == 5) {
                                vt4.g0(o);
                                o = a;
                                return o;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            o = null;
                            return o;
                        }
                        else {
                            zmk = (zmk)this.A;
                            final cof cof = (cof)this.z;
                            vt4.g0(o);
                            o = cof;
                        }
                    }
                    else {
                        vt4.g0(o);
                        o = x2.getValue();
                        if (!mlc.q(y3, o)) {
                            a3.t();
                            a3.y(0.0f);
                            efo.s(y3);
                            efo.o(0L);
                            a3.o(o);
                            x2.setValue(y3);
                        }
                        o = a3.G;
                        this.z = o;
                        this.A = a3;
                        this.x = 1;
                        if (((cof)o).c((f07)this) == v) {
                            break Label_1473;
                        }
                        zmk = a3;
                    }
                    try {
                        final Object z2 = zmk.z;
                        ((aof)o).g((Object)null);
                        if (!mlc.q(y3, z2)) {
                            this.z = null;
                            this.A = null;
                            this.x = 2;
                            Label_1044: {
                                if (a3.I == Long.MIN_VALUE) {
                                    o = a3.L;
                                    o = ien.v(((f07)this).getContext()).p0((f07)this, (lta)o);
                                    if (o == v) {
                                        break Label_1044;
                                    }
                                }
                                else {
                                    o = a3.r((h07)this);
                                    if (o == v) {
                                        break Label_1044;
                                    }
                                }
                                o = a;
                            }
                            if (o == v) {
                                return v;
                            }
                            this.x = 3;
                            if (a3.C((h07)this) == v) {
                                return v;
                            }
                        }
                        o = a;
                        if (mlc.q(a3.y.getValue(), y3)) {
                            return o;
                        }
                        if (e.h() < 1.0f) {
                            final tmk k = a3.K;
                            if (k == null || !mlc.q((Object)null, (Object)k.a())) {
                                if (k != null) {
                                    o = k.a();
                                }
                                else {
                                    o = null;
                                }
                                Object o5 = zmk.O;
                                if (o != null) {
                                    final long e2 = k.e();
                                    final eg0 f = k.f();
                                    final eg0 d = k.d();
                                    if (d != null) {
                                        o5 = d;
                                    }
                                    o = ((o6p)o).e(e2, (ig0)f, (ig0)zmk.P, (ig0)o5);
                                }
                                else {
                                    o = o5;
                                    if (k != null) {
                                        if (k.e() == 0L) {
                                            o = o5;
                                        }
                                        else {
                                            long n;
                                            if ((n = k.c()) == Long.MIN_VALUE) {
                                                n = a3.B;
                                            }
                                            final float n2 = n / 1.0E9f;
                                            if (n2 <= 0.0f) {
                                                o = o5;
                                            }
                                            else {
                                                o = new eg0(1.0f / n2);
                                            }
                                        }
                                    }
                                }
                                tmk l;
                                if ((l = k) == null) {
                                    l = new tmk();
                                }
                                l.i((r6p)null);
                                l.k(false);
                                l.o(e.h());
                                l.f().e(0, e.h());
                                l.l(a3.B);
                                l.n(0L);
                                l.m((eg0)o);
                                l.j(k8e.I((1.0 - e.h()) * a3.B));
                                a3.K = l;
                            }
                        }
                        this.z = null;
                        this.A = null;
                        this.x = 4;
                        if (a3.v((h07)this) != v) {
                            a3.o(y3);
                            a3.y(0.0f);
                            efo.j();
                            this.x = 5;
                            o = a;
                            if (a3.B((h07)this) != v) {
                                return o;
                            }
                        }
                        o = v;
                        return o;
                    }
                    finally {
                        ((aof)o).g((Object)null);
                    }
                }
            }
            case 1: {
                final byte x4 = this.x;
                Object o6 = null;
                Label_1695: {
                    if (x4 != 0) {
                        if (x4 == 1) {
                            final zta zta = (zta)this.A;
                            final cof cof2 = (cof)this.z;
                            final oc7 y4 = (oc7)this.y;
                            vt4.g0(o);
                            o = cof2;
                            break Label_1695;
                        }
                        if (x4 != 2) {
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            a = null;
                            return a;
                        }
                        o6 = this.y;
                        try {
                            vt4.g0(o);
                            break Label_1695;
                        }
                        finally {
                            a = o;
                        }
                    }
                    else {
                        vt4.g0(o);
                        final oc7 y4 = (oc7)this.y;
                        o = this.B;
                        final zta zta = (zta)c;
                        this.y = y4;
                        this.z = o;
                        this.A = zta;
                        this.x = 1;
                        if (((cof)o).c((f07)this) == v) {
                            break Label_1695;
                        }
                        break Label_1695;
                    }
                    break Label_1695;
                    try {
                        this.y = o;
                        this.z = null;
                        this.A = null;
                        this.x = 2;
                        final zta zta;
                        final oc7 y4;
                        if (zta.d((Object)y4, (Object)this) == v) {
                            a = v;
                        }
                        else {
                            ((aof)o).g((Object)null);
                        }
                        return a;
                    }
                    finally {
                        o6 = o;
                    }
                }
                ((aof)o6).g((Object)null);
                throw a;
            }
            case 0: {
                final List list = (List)this.A;
                final qx3 qx3 = (qx3)this.z;
                final b37 y5 = (b37)this.y;
                final byte x5 = this.x;
                if (x5 != 0) {
                    if (x5 != 1) {
                        if (x5 == 2) {
                            vt4.g0(o);
                            return a;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    else {
                        vt4.g0(o);
                    }
                }
                else {
                    vt4.g0(o);
                    final e6c b4 = y5.b;
                    final Set set = (Set)this.B;
                    this.y = y5;
                    this.x = 1;
                    b4.t(qx3, list, set, (h07)this);
                    if (a == v) {
                        return v;
                    }
                }
                final mw7 mw7 = (mw7)c;
                this.y = null;
                this.x = 2;
                if (mw7.z(y5, qx3, list, (h07)this) != v) {
                    return a;
                }
                a = v;
                return a;
            }
        }
    }
}
