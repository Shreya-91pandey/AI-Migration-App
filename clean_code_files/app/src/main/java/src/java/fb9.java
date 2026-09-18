import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import coil3.request.NullRequestDataException;
import java.util.concurrent.CancellationException;

public final class fb9 implements pic
{
    public final oti a;
    public final gb0 b;
    public final jmq c;
    public final j9j d;
    
    public fb9(final oti a, final gb0 b, final jmq c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new j9j(a, c);
    }
    
    @Override
    public final Object a(rti v, final f07 f07) {
        final j9j d = this.d;
        while (true) {
            Label_0047: {
                if (!(f07 instanceof eb9)) {
                    break Label_0047;
                }
                final eb9 eb9 = (eb9)f07;
                final int y = eb9.y;
                if ((y & Integer.MIN_VALUE) == 0x0) {
                    break Label_0047;
                }
                eb9.y = y + Integer.MIN_VALUE;
                final eb9 eb10 = eb9;
                Object o = eb10.w;
                final int y2 = eb10.y;
                final Boolean b = null;
                final Throwable t;
                Label_0403: {
                    if (y2 != 0) {
                        if (y2 == 1) {
                            v = eb10.v;
                            try {
                                vt4.g0(o);
                                return o;
                            }
                            finally {
                                break Label_0403;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(o);
                    i3c d2 = null;
                    Object o2 = null;
                    zyo c = null;
                    pfg b2 = null;
                    Object a = null;
                    Label_0221: {
                        try {
                            d2 = v.d();
                            o2 = d2.d();
                            final xzl e = v.e();
                            c = v.c();
                            b2 = this.c.B(d2, e);
                            o = b2.e();
                            a = this.a.d.a(o2, b2);
                            o2 = d.x(d2, a, b2, c);
                            if (o2 != null) {
                                o = d.u(d2, (vse)o2, e, (z9k)o);
                                break Label_0221;
                            }
                        }
                        finally {
                            break Label_0403;
                        }
                        o = null;
                    }
                    if (o != null) {
                        final a1c b3 = ((wse)o).b();
                        final Object value = ((wse)o).a().get((Object)"coil#disk_cache_key");
                        String s;
                        if (value instanceof String) {
                            s = (String)value;
                        }
                        else {
                            s = null;
                        }
                        final Object value2 = ((wse)o).a().get((Object)"coil#is_sampled");
                        Boolean b4 = b;
                        if (value2 instanceof Boolean) {
                            b4 = (Boolean)value2;
                        }
                        return new j3n(b3, d2, 1, (vse)o2, s, b4 != null && b4, v.f());
                    }
                    final hc7 j = d2.j();
                    final rh rh = new rh((Object)this, (Object)d2, a, (Object)b2, (Object)c, o2, (Object)v, (f07)null, (byte)13);
                    ((eb9)t).v = v;
                    ((eb9)t).y = 1;
                    final Object f8 = rhc.f0(j, (zta)rh, (f07)t);
                    final pc7 v2 = pc7.v;
                    if (f8 == v2) {
                        return v2;
                    }
                    return f8;
                }
                if (!(t instanceof CancellationException)) {
                    final i3c d3 = v.d();
                    a1c a1c;
                    if (t instanceof NullRequestDataException) {
                        if ((a1c = d3.b()) == null) {
                            a1c = d3.a();
                        }
                    }
                    else {
                        a1c = d3.a();
                    }
                    return new fi9(a1c, d3, t);
                }
            }
            final eb9 eb10 = new eb9(this, (h07)f07);
            continue;
        }
    }
    
    public final Object b(qam v, se6 w, i3c x, Object y, pfg z, zyo a, final h07 h07) {
        Object o = null;
        Label_0059: {
            if (h07 instanceof bb9) {
                final bb9 bb9 = (bb9)h07;
                final int e = bb9.E;
                if ((e & Integer.MIN_VALUE) != 0x0) {
                    bb9.E = e + Integer.MIN_VALUE;
                    o = bb9;
                    break Label_0059;
                }
            }
            o = new bb9(this, h07);
        }
        Object o2 = ((bb9)o).C;
        final int e2 = ((bb9)o).E;
        final String s = null;
        while (true) {
            Label_0357: {
                int i;
                if (e2 != 0) {
                    if (e2 == 1) {
                        i = ((bb9)o).B;
                        a = ((bb9)o).A;
                        z = ((bb9)o).z;
                        y = ((bb9)o).y;
                        x = ((bb9)o).x;
                        w = ((bb9)o).w;
                        v = ((bb9)o).v;
                        vt4.g0(o2);
                        break Label_0357;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    vt4.g0(o2);
                    i = 0;
                }
                while (true) {
                    while (i < ((List)w.g.getValue()).size()) {
                        final v18 a2 = ((u18)((List)w.g.getValue()).get(i)).a(v, z);
                        if (a2 != null) {
                            final yog yog = new yog((Object)a2, (Object)i);
                            if (yog == null) {
                                fvd.h((Object)smk.r(y, "Unable to create a decoder that supports: "));
                                return null;
                            }
                            final v18 v2 = (v18)yog.v;
                            i = ((Number)yog.w).intValue() + 1;
                            a.getClass();
                            ((bb9)o).v = v;
                            ((bb9)o).w = w;
                            ((bb9)o).x = x;
                            ((bb9)o).y = y;
                            ((bb9)o).z = z;
                            ((bb9)o).A = a;
                            ((bb9)o).B = i;
                            ((bb9)o).E = 1;
                            o2 = v2.a((f07)o);
                            final pc7 v3 = pc7.v;
                            if (o2 == v3) {
                                return v3;
                            }
                            break Label_0357;
                        }
                        else {
                            ++i;
                        }
                    }
                    final yog yog = null;
                    continue;
                }
            }
            final a18 a3 = (a18)o2;
            a.getClass();
            if (a3 != null) {
                final a1c a4 = a3.a();
                final boolean b = a3.b();
                final int a5 = v.a();
                final e4c c = v.c();
                oba oba;
                if (c instanceof oba) {
                    oba = (oba)c;
                }
                else {
                    oba = null;
                }
                String c2 = s;
                if (oba != null) {
                    c2 = oba.c();
                }
                return new ab9(a4, b, a5, c2);
            }
            continue;
        }
    }
    
    public final Object c(i3c a, Object ex, pfg pfg, zyo o, h07 c) {
        while (true) {
            Label_0043: {
                if (!(c instanceof cb9)) {
                    break Label_0043;
                }
                final Object o2 = c;
                final int e = ((cb9)o2).E;
                if ((e & Integer.MIN_VALUE) == 0x0) {
                    break Label_0043;
                }
                ((cb9)o2).E = e + Integer.MIN_VALUE;
                c = (h07)((cb9)o2).C;
                final int e2 = ((cb9)o2).E;
                final pc7 v = pc7.v;
                Label_0925: {
                    Label_0232: {
                        if (e2 != 0) {
                            Label_0159: {
                                if (e2 == 1) {
                                    final Object y = ((cb9)o2).B;
                                    a = (i3c)((cb9)o2).A;
                                    final Object z = ((cb9)o2).z;
                                    o = ((cb9)o2).y;
                                    final zyo x = ((cb9)o2).x;
                                    final Object o3 = ((cb9)o2).w;
                                    final i3c v2 = ((cb9)o2).v;
                                    try {
                                        vt4.g0((Object)c);
                                    }
                                    finally {
                                        ex = (Exception)a;
                                        a = (i3c)pfg;
                                        break Label_0159;
                                    }
                                    break Label_0232;
                                }
                                if (e2 == 2) {
                                    ex = (Exception)((cb9)o2).A;
                                    final Object z = ((cb9)o2).y;
                                    o = ((cb9)o2).x;
                                    final i3c v3 = ((cb9)o2).v;
                                    try {
                                        vt4.g0((Object)c);
                                        break Label_0925;
                                    }
                                    finally {}
                                    break Label_0159;
                                }
                                if (e2 == 3) {
                                    final ab9 ab9 = (ab9)((cb9)o2).B;
                                    vt4.g0((Object)c);
                                    goto Label_1173;
                                }
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            goto Label_1219;
                        }
                    }
                    Object y = hia.e((Object)c);
                    ((b4j)y).v = pfg;
                    Object z = new Object();
                    ((b4j)z).v = this.a.d;
                    pfg = (pfg)new Object();
                    try {
                        ((b4j)y).v = this.c.G((pfg)((b4j)y).v);
                        Label_0626: {
                            if (a.k() == null) {
                                break Label_0626;
                            }
                            Object o4 = ((b4j)z).v;
                            ((se6)o4).getClass();
                            Object o3 = ((se6)o4).a;
                            c = (h07)new ArrayList((Collection)o3);
                            Object v4 = ((se6)o4).b;
                            o3 = new ArrayList((Collection)v4);
                            Object o5 = ((se6)o4).c;
                            v4 = new ArrayList((Collection)o5);
                            Object iterator = ((se6)o4).f.getValue();
                            o5 = new ArrayList();
                            iterator = ((Iterable)iterator).iterator();
                        Block_18_Outer:
                            while (true) {
                                Label_0460: {
                                    if (!((Iterator)iterator).hasNext()) {
                                        break Label_0460;
                                    }
                                    try {
                                        ((ArrayList)o5).add((Object)new p1((Object)((Iterator)iterator).next(), (byte)25));
                                        continue Block_18_Outer;
                                        while (true) {
                                            final Iterator iterator2;
                                            iterator = iterator2.next();
                                            ((ArrayList)o4).add((Object)new re6((u18)iterator, (byte)1));
                                            iftrue(Label_0538:)(!iterator2.hasNext());
                                            continue;
                                        }
                                        try {
                                            final yog k;
                                            Label_0538: {
                                                k = a.k();
                                            }
                                            while (true) {
                                                Label_0584: {
                                                    if (k != null) {
                                                        try {
                                                            iterator = new q9m((Object)k, (byte)25);
                                                            ((ArrayList)o5).add(0, iterator);
                                                            break Label_0584;
                                                        }
                                                        finally {
                                                            ex = (Exception)pfg;
                                                            pfg = (pfg)a;
                                                        }
                                                        break Label_0579;
                                                    }
                                                    break Label_0584;
                                                    goto Label_1219;
                                                }
                                                iterator = new se6(qt7.R((List)c), qt7.R((List)o3), qt7.R((List)v4), qt7.R((List)o5), qt7.R((List)o4));
                                                ((b4j)z).v = iterator;
                                                c = (h07)((b4j)z).v;
                                                o3 = ((b4j)y).v;
                                                ((cb9)o2).v = a;
                                                ((cb9)o2).w = ex;
                                                ((cb9)o2).x = (zyo)o;
                                                ((cb9)o2).y = (b4j)y;
                                                ((cb9)o2).z = (b4j)z;
                                                ((cb9)o2).A = (b4j)pfg;
                                                ((cb9)o2).B = (b4j)pfg;
                                                ((cb9)o2).E = 1;
                                                o5 = this.d((se6)c, a, ex, (pfg)o3, (zyo)o, (h07)o2);
                                                if (o5 == v) {
                                                    goto Label_1170;
                                                }
                                                o3 = ex;
                                                c = (h07)(v4 = pfg);
                                                ex = (Exception)o;
                                                o = y;
                                                pfg = (pfg)a;
                                                a = (i3c)v4;
                                                v4 = o5;
                                                try {
                                                    ((b4j)c).v = v4;
                                                    v4 = ((b4j)a).v;
                                                    y = v4;
                                                    if (y instanceof qam) {
                                                        v4 = ((i3c)pfg).e();
                                                        y = new(rh.class)();
                                                        c = (h07)(a = a);
                                                        try {
                                                            new rh((Object)this, (Object)c, z, (Object)pfg, o3, o, (Object)ex, (f07)null, (byte)12);
                                                            a = (i3c)c;
                                                            ((cb9)o2).v = (i3c)pfg;
                                                            a = (i3c)c;
                                                            ((cb9)o2).w = null;
                                                            a = (i3c)c;
                                                            ((cb9)o2).x = (zyo)ex;
                                                            a = (i3c)c;
                                                            ((cb9)o2).y = (b4j)o;
                                                            a = (i3c)c;
                                                            ((cb9)o2).z = null;
                                                            a = (i3c)c;
                                                            ((cb9)o2).A = (b4j)c;
                                                            a = (i3c)c;
                                                            ((cb9)o2).B = null;
                                                            a = (i3c)c;
                                                            ((cb9)o2).E = 2;
                                                            a = (i3c)c;
                                                            o3 = rhc.f0((hc7)v4, (zta)y, (f07)o2);
                                                            if (o3 == v) {
                                                                goto Label_1170;
                                                            }
                                                            z = o;
                                                            o = ex;
                                                            ex = (Exception)c;
                                                            c = (h07)o3;
                                                            a = (i3c)ex;
                                                            o3 = c;
                                                            c = (h07)z;
                                                        }
                                                        finally {
                                                            ex = (Exception)a;
                                                        }
                                                    }
                                                }
                                                finally {
                                                    ex = (Exception)a;
                                                    continue;
                                                }
                                                break;
                                            }
                                            c = (h07)a;
                                            if (!(y instanceof s1c)) {
                                                goto Label_1195;
                                            }
                                            z = ((s1c)v4).b();
                                            final boolean c2 = ((s1c)((b4j)c).v).c();
                                            final int a2 = ((s1c)((b4j)c).v).a();
                                            try {
                                                final ab9 ab10 = new ab9((a1c)z, c2, a2, (String)null);
                                                z = c;
                                                c = (h07)o;
                                                ex = (Exception)((b4j)z).v;
                                                if (ex instanceof qam) {
                                                    ex = ex;
                                                }
                                                else {
                                                    ex = null;
                                                }
                                                if (ex == null) {
                                                    goto Label_1093;
                                                }
                                                ex = (Exception)((qam)ex).c();
                                                if (ex == null) {
                                                    goto Label_1093;
                                                }
                                                try {
                                                    p3g.g((AutoCloseable)ex);
                                                }
                                                catch (final RuntimeException ex2) {
                                                    throw ex2;
                                                }
                                                catch (final Exception ex) {}
                                            }
                                            finally {}
                                        }
                                        finally {}
                                        iterator = ((se6)o4).g.getValue();
                                        o4 = new ArrayList();
                                        final Iterator iterator2 = ((Iterable)iterator).iterator();
                                    }
                                    finally {}
                                }
                                break;
                            }
                        }
                    }
                    finally {}
                }
                try {
                    final AutoCloseable autoCloseable;
                    p3g.g(autoCloseable);
                    goto Label_1264;
                }
                catch (final RuntimeException ex3) {}
                catch (final Exception ex4) {
                    goto Label_1264;
                }
            }
            final Object o2 = new cb9(this, c);
            continue;
        }
    }
    
    public final Object d(se6 c, i3c w, Object x, pfg y, zyo z, h07 h07) {
        Label_0059: {
            if (h07 instanceof db9) {
                final db9 db9 = (db9)h07;
                final int d = db9.D;
                if ((d & Integer.MIN_VALUE) != 0x0) {
                    db9.D = d + Integer.MIN_VALUE;
                    h07 = (h07)db9;
                    break Label_0059;
                }
            }
            h07 = (h07)new db9(this, h07);
        }
        Object o = ((db9)h07).B;
        final int d2 = ((db9)h07).D;
        final Exception ex = null;
        while (true) {
            h07 h8 = null;
            Label_0281: {
                int a;
                if (d2 != 0) {
                    if (d2 == 1) {
                        a = ((db9)h07).A;
                        z = ((db9)h07).z;
                        y = ((db9)h07).y;
                        x = ((db9)h07).x;
                        w = ((db9)h07).w;
                        final se6 v = ((db9)h07).v;
                        vt4.g0(o);
                        h8 = h07;
                        break Label_0281;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    vt4.g0(o);
                    a = 0;
                }
                final yog b = ((se6)c).b(x, y, this.a, a);
                if (b == null) {
                    goto Label_0354;
                }
                final m8a m8a = (m8a)b.v;
                a = ((Number)b.w).intValue() + 1;
                z.getClass();
                ((db9)h07).v = (se6)c;
                ((db9)h07).w = (i3c)w;
                ((db9)h07).x = x;
                ((db9)h07).y = y;
                ((db9)h07).z = z;
                ((db9)h07).A = a;
                ((db9)h07).D = 1;
                o = m8a.a(h07);
                final pc7 v2 = pc7.v;
                if (o == v2) {
                    return v2;
                }
                h8 = h07;
            }
            h07 = (h07)o;
            try {
                z.getClass();
                if (h07 != null) {
                    return h07;
                }
                h07 = h8;
                continue;
            }
            finally {
                c = ex;
                if (h07 instanceof qam) {
                    c = (Exception)h07;
                }
                if (c == null) {
                    goto Label_0352;
                }
                c = (Exception)((qam)c).c();
                if (c == null) {
                    goto Label_0352;
                }
                try {
                    p3g.g((AutoCloseable)c);
                }
                catch (final RuntimeException ex2) {
                    throw ex2;
                }
                catch (final Exception c) {}
            }
            break;
        }
    }
}
