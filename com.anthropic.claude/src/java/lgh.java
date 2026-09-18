import android.database.SQLException;
import java.util.List;

public final class lgh implements deo, spi
{
    public final awp a;
    public final dq6 b;
    public final boolean c;
    public final pv0 d;
    public volatile boolean e;
    
    public lgh(final awp a, final dq6 b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new pv0();
    }
    
    @Override
    public final Boolean a(final f07 f07) {
        if (this.e) {
            tiq.l(21, "Connection is recycled");
            throw null;
        }
        final yo6 yo6 = (yo6)((h07)f07).getContext().M0((gc7)this.a);
        if (yo6 != null && yo6.w == this) {
            return !this.d.isEmpty() || this.b.v.H0();
        }
        tiq.l(21, "Attempted to use connection on a different coroutine");
        throw null;
    }
    
    @Override
    public final Object b(xs7 w, final f07 f07) {
        kgh kgh2 = null;
        Label_0054: {
            if (f07 instanceof kgh) {
                final kgh kgh = (kgh)f07;
                final int z = kgh.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    kgh.z = z + Integer.MIN_VALUE;
                    kgh2 = kgh;
                    break Label_0054;
                }
            }
            kgh2 = new kgh(this, (h07)f07);
        }
        final Object x = kgh2.x;
        final int z2 = kgh2.z;
        final dq6 b = this.b;
        final pc7 v = pc7.v;
        Object d = null;
        Label_0225: {
            Object o;
            if (z2 != 0) {
                if (z2 != 1) {
                    if (z2 == 2) {
                        w = (xs7)kgh2.v;
                        try {
                            vt4.g0(x);
                            break Label_0225;
                        }
                        finally {
                            break Label_0225;
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w = (xs7)kgh2.w;
                final zta zta = (zta)kgh2.v;
                vt4.g0(x);
                o = zta;
            }
            else {
                vt4.g0(x);
                kgh2.v = w;
                kgh2.w = b;
                kgh2.z = 1;
                if (b.w.c((f07)kgh2) == v) {
                    return v;
                }
                o = w;
                w = (xs7)b;
            }
            try {
                kgh2.v = w;
                kgh2.w = null;
                kgh2.z = 2;
                d = ((zta)o).d((Object)b, (Object)kgh2);
                if (d == v) {
                    return v;
                }
                ((aof)w).g(null);
                return d;
            }
            finally {}
        }
        ((aof)w).g(null);
        throw d;
    }
    
    @Override
    public final Object c(String x, zta w, h07 d) {
        while (true) {
            Label_0044: {
                if (!(d instanceof hgh)) {
                    break Label_0044;
                }
                final hgh hgh = (hgh)d;
                final int a = hgh.A;
                if ((a & Integer.MIN_VALUE) == 0x0) {
                    break Label_0044;
                }
                hgh.A = a + Integer.MIN_VALUE;
                final hgh hgh2 = hgh;
                final Object y = hgh2.y;
                final pc7 v = pc7.v;
                final int a2 = hgh2.A;
                Label_0359: {
                    while (true) {
                        Label_0381: {
                            Object o = null;
                            Object d2 = null;
                            Label_0264: {
                                if (a2 != 0) {
                                    if (a2 == 1) {
                                        x = (String)hgh2.x;
                                        o = hgh2.w;
                                        final String s = (String)hgh2.v;
                                        vt4.g0(y);
                                        d2 = s;
                                        break Label_0264;
                                    }
                                    if (a2 == 2) {
                                        w = (zta)hgh2.w;
                                        x = (String)hgh2.v;
                                        try {
                                            vt4.g0(y);
                                            break Label_0359;
                                        }
                                        finally {
                                            d2 = w;
                                        }
                                        break Label_0122;
                                    }
                                    en9.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                else {
                                    vt4.g0(y);
                                    if (this.e) {
                                        tiq.l(21, "Connection is recycled");
                                        throw null;
                                    }
                                    d2 = ((f07)hgh2).getContext().M0((gc7)this.a);
                                    if (d2 == null || ((yo6)d2).w != this) {
                                        tiq.l(21, "Attempted to use connection on a different coroutine");
                                        throw null;
                                    }
                                    final dq6 b = this.b;
                                    hgh2.v = x;
                                    hgh2.w = w;
                                    hgh2.x = b;
                                    hgh2.A = 1;
                                    if (b.w.c((f07)hgh2) == v) {
                                        return v;
                                    }
                                    d2 = x;
                                    x = (String)b;
                                    o = w;
                                    break Label_0264;
                                }
                                break Label_0381;
                            }
                            w = (zta)x;
                            try {
                                d2 = this.b.d1((String)d2);
                                w = (zta)x;
                                w = (zta)x;
                                final jgh jgh = new jgh((Object)this, (Class)lgh.class, "isRecycled", "isRecycled()Z", 0, (byte)0);
                                w = (zta)x;
                                d2 = new tpm((b3k)d2, jgh);
                                try {
                                    hgh2.v = x;
                                    hgh2.w = d2;
                                    hgh2.x = null;
                                    hgh2.A = 2;
                                    d = ((zta)o).d(d2, (Object)hgh2);
                                    if (d == v) {
                                        return v;
                                    }
                                    w = (zta)d2;
                                    try {
                                        r9n.m((AutoCloseable)w, (Throwable)null);
                                        ((aof)x).g(null);
                                        return d;
                                    }
                                    finally {}
                                }
                                finally {
                                    continue;
                                }
                                try {
                                    throw d;
                                }
                                finally {
                                    w = (zta)x;
                                    r9n.m((AutoCloseable)d2, (Throwable)d);
                                    w = (zta)x;
                                }
                            }
                            finally {
                                x = (String)w;
                                w = (zta)d;
                            }
                        }
                        break;
                    }
                }
                ((aof)x).g(null);
                throw w;
            }
            final hgh hgh2 = new hgh(this, (h07)d);
            continue;
        }
    }
    
    @Override
    public final Object d(final beo beo, final zta zta, final f07 f07) {
        if (this.e) {
            tiq.l(21, "Connection is recycled");
            throw null;
        }
        final yo6 yo6 = (yo6)f07.getContext().M0((gc7)this.a);
        if (yo6 != null && yo6.w == this) {
            return this.h(beo, zta, f07);
        }
        tiq.l(21, "Attempted to use connection on a different coroutine");
        throw null;
    }
    
    public final Object e(beo v, h07 w) {
        Object o = null;
        Label_0049: {
            if (w instanceof bgh) {
                o = w;
                final int a = ((bgh)o).A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    ((bgh)o).A = a + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new bgh(this, w);
        }
        final Object y = ((bgh)o).y;
        int n = ((bgh)o).A;
        final pv0 d = this.d;
        final lqo a2 = lqo.a;
        final dq6 b = this.b;
        final pc7 v2 = pc7.v;
        Label_0504: {
            Label_0470: {
                if (n != 0) {
                    if (n != 1) {
                        if (n == 2 || n == 3 || n == 4 || n == 5) {
                            n = ((bgh)o).x;
                            v = (beo)((bgh)o).v;
                            try {
                                vt4.g0(y);
                                break Label_0470;
                            }
                            finally {
                                break Label_0504;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w = (h07)((bgh)o).w;
                    v = (beo)((bgh)o).v;
                    vt4.g0(y);
                }
                else {
                    vt4.g0(y);
                    ((bgh)o).v = v;
                    ((bgh)o).w = b;
                    ((bgh)o).A = 1;
                    if (b.w.c((f07)o) == v2) {
                        return v2;
                    }
                    w = (h07)b;
                }
                while (true) {
                    while (true) {
                        Object o2 = null;
                        Label_0402: {
                            Label_0361: {
                                Label_0320: {
                                    try {
                                        n = d.x;
                                        if (!d.isEmpty()) {
                                            break Label_0402;
                                        }
                                        final int ordinal = v.ordinal();
                                        if (ordinal == 0) {
                                            break Label_0361;
                                        }
                                        if (ordinal == 1) {
                                            break Label_0320;
                                        }
                                        if (ordinal == 2) {
                                            ((bgh)o).v = w;
                                            ((bgh)o).w = null;
                                            ((bgh)o).x = n;
                                            ((bgh)o).A = 4;
                                            ncq.x((t2k)b, "BEGIN EXCLUSIVE TRANSACTION");
                                            if (a2 == v2) {
                                                break;
                                            }
                                            break Label_0470;
                                        }
                                    }
                                    finally {
                                        o2 = w;
                                        final h07 h07;
                                        w = h07;
                                        v = (beo)o2;
                                        break Label_0504;
                                    }
                                    throw new RuntimeException();
                                }
                                ((bgh)o2).v = w;
                                ((bgh)o2).w = null;
                                ((bgh)o2).x = n;
                                ((bgh)o2).A = 3;
                                ncq.x((t2k)b, "BEGIN IMMEDIATE TRANSACTION");
                                if (a2 == v2) {
                                    break;
                                }
                                continue;
                            }
                            ((bgh)o2).v = w;
                            ((bgh)o2).w = null;
                            ((bgh)o2).x = n;
                            ((bgh)o2).A = 2;
                            ncq.x((t2k)b, "BEGIN DEFERRED TRANSACTION");
                            if (a2 == v2) {
                                break;
                            }
                            continue;
                        }
                        final StringBuilder sb = new StringBuilder("SAVEPOINT '");
                        sb.append(n);
                        sb.append("'");
                        final String string = sb.toString();
                        ((bgh)o2).v = w;
                        ((bgh)o2).w = null;
                        ((bgh)o2).x = n;
                        ((bgh)o2).A = 5;
                        ncq.x((t2k)b, string);
                        if (a2 == v2) {
                            break;
                        }
                        continue;
                    }
                }
                return v2;
            }
            d.addLast((Object)new zfh(n));
            ((aof)w).g(null);
            return a2;
        }
        ((aof)v).g(null);
    }
    
    public final Object f(boolean v, h07 h07) {
        Object o = this.d;
        Object o2 = null;
        Label_0055: {
            if (h07 instanceof dgh) {
                o2 = h07;
                final int z = ((dgh)o2).z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ((dgh)o2).z = z + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            o2 = new dgh(this, h07);
        }
        Object x = ((dgh)o2).x;
        final int z2 = ((dgh)o2).z;
        final Object b = this.b;
        final lqo a = lqo.a;
        final pc7 v2 = pc7.v;
        Label_0482: {
            Label_0456: {
                if (z2 != 0) {
                    if (z2 != 1) {
                        if (z2 == 2 || z2 == 3 || z2 == 4 || z2 == 5) {
                            h07 = (h07)((dgh)o2).w;
                            try {
                                vt4.g0(x);
                                break Label_0456;
                            }
                            finally {
                                break Label_0482;
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v = ((dgh)o2).v;
                    h07 = (h07)((dgh)o2).w;
                    vt4.g0(x);
                }
                else {
                    vt4.g0(x);
                    ((dgh)o2).w = (aof)b;
                    ((dgh)o2).v = v;
                    ((dgh)o2).z = 1;
                    if (((dq6)b).w.c((f07)o2) == v2) {
                        return v2;
                    }
                    h07 = (h07)b;
                }
                while (true) {
                    Label_0466: {
                        while (true) {
                            final dgh dgh;
                            Label_0348: {
                                try {
                                    if (((pv0)o).isEmpty()) {
                                        break Label_0466;
                                    }
                                    x = h86.x0((List)o);
                                    if (!v) {
                                        break Label_0348;
                                    }
                                    x.getClass();
                                    if (((pv0)o).isEmpty()) {
                                        ((dgh)o2).w = (aof)h07;
                                        ((dgh)o2).z = 2;
                                        ncq.x((t2k)b, "END TRANSACTION");
                                        if (a == v2) {
                                            break;
                                        }
                                        break Label_0456;
                                    }
                                }
                                finally {
                                    break Label_0482;
                                }
                                final int a2 = ((zfh)x).a;
                                final StringBuilder sb = new StringBuilder("RELEASE SAVEPOINT '");
                                sb.append(a2);
                                sb.append("'");
                                o = sb.toString();
                                dgh.w = (aof)h07;
                                dgh.z = 3;
                                ncq.x((t2k)b, (String)o);
                                if (a == v2) {
                                    break;
                                }
                                continue;
                            }
                            if (((pv0)o).isEmpty()) {
                                dgh.w = (aof)h07;
                                dgh.z = 4;
                                ncq.x((t2k)b, "ROLLBACK TRANSACTION");
                                if (a == v2) {
                                    break;
                                }
                                continue;
                            }
                            else {
                                final int a3 = ((zfh)x).a;
                                final StringBuilder sb2 = new StringBuilder("ROLLBACK TRANSACTION TO SAVEPOINT '");
                                sb2.append(a3);
                                sb2.append("'");
                                o = sb2.toString();
                                dgh.w = (aof)h07;
                                dgh.z = 5;
                                ncq.x((t2k)b, (String)o);
                                if (a == v2) {
                                    break;
                                }
                                continue;
                            }
                            break;
                        }
                    }
                    final IllegalStateException ex = new IllegalStateException("Not in a transaction");
                }
                return v2;
            }
            ((aof)h07).g(null);
            return a;
        }
        ((aof)h07).g(null);
    }
    
    public final lqo g() {
        final lqo a = lqo.a;
        if (!this.e) {
            this.e = true;
            if (this.b.v.H0()) {
                ncq.x((t2k)this.b, "ROLLBACK TRANSACTION");
            }
        }
        return a;
    }
    
    public final Object h(beo w, zta d, f07 f07) {
        Label_0054: {
            if (f07 instanceof fgh) {
                final fgh fgh = (fgh)f07;
                final int a = fgh.A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    fgh.A = a + Integer.MIN_VALUE;
                    f07 = (f07)fgh;
                    break Label_0054;
                }
            }
            f07 = (f07)new fgh(this, f07);
        }
        final Object y = ((fgh)f07).y;
        final int a2 = ((fgh)f07).A;
        boolean x = true;
        final pc7 v = pc7.v;
        Object o = null;
        Throwable t = null;
        Label_0193: {
            if (a2 == 0) {
                break Label_0193;
            }
            Label_0177: {
                if (a2 == 1) {
                    break Label_0177;
                }
                if (a2 != 2) {
                    if (a2 != 3 && a2 != 4) {
                        if (a2 != 5) {
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w = (beo)((fgh)f07).w;
                        f07 = (f07)((fgh)f07).v;
                        try {
                            vt4.g0(y);
                            throw w;
                        }
                        catch (final SQLException t) {
                            o = f07;
                            break Label_0193;
                        }
                    }
                    final Object v2 = ((fgh)f07).v;
                    vt4.g0(y);
                    return v2;
                }
                x = ((fgh)f07).x;
                Label_0279: {
                    try {
                        vt4.g0(y);
                        w = (beo)y;
                        break Label_0279;
                    }
                    finally {
                        try {}
                        finally {
                            try {
                                ((fgh)f07).v = w;
                                ((fgh)f07).w = (Throwable)d;
                                ((fgh)f07).A = 5;
                                if (this.f(false, (h07)f07) == v) {
                                    return v;
                                }
                                w = (beo)d;
                                throw w;
                            }
                            catch (final SQLException ex) {
                                final Object o2 = d;
                                t = (Throwable)ex;
                                o = w;
                                w = (beo)o2;
                            }
                        }
                        return v;
                        vt4.g0(y);
                        beo v3;
                        iftrue(Label_0210:)((v3 = w) != null);
                        Label_0235: {
                            Block_16: {
                                break Block_16;
                                ((fgh)f07).v = w;
                                ((fgh)f07).A = 3;
                                iftrue(Label_0304:)(this.f(x, (h07)f07) != v);
                                return v;
                                Label_0304: {
                                    return w;
                                }
                                d = (zta)((fgh)f07).v;
                                vt4.g0(y);
                                break Label_0235;
                            }
                            v3 = beo.v;
                            Label_0210: {
                                ((fgh)f07).v = d;
                            }
                            ((fgh)f07).A = 1;
                            iftrue(Label_0235:)(this.e(v3, (h07)f07) != v);
                            return v;
                        }
                        final xfh xfh = new xfh(this);
                        ((fgh)f07).v = null;
                        ((fgh)f07).x = true;
                        ((fgh)f07).A = 2;
                        d = (zta)d.d((Object)xfh, (Object)f07);
                        iftrue(Label_0279:)((w = (beo)d) != v);
                        return v;
                    }
                }
            }
        }
        if (o == null) {
            throw t;
        }
        soh.j((Throwable)o, t);
        throw w;
    }
}
