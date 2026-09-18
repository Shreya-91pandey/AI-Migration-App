import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;

public final class muj
{
    public boolean a;
    public boolean b;
    public final zv7 c;
    public final ox4 d;
    public final List e;
    public final cp6 f;
    
    public muj(final zv7 c, final ox4 d, final gw4 gw4) {
        final String b = c.b;
        this.c = c;
        this.d = d;
        this.e = c.d;
        final v2k l = c.l;
        Object f;
        if (l.n()) {
            f = new cvg(new pw1((Object)this, (Object)l, (Object)b, (f07)null, (byte)0), gw4);
        }
        else {
            final fp6 m = c.m;
            if (m instanceof gzl) {
                f = new lp6(new pw1((Object)this, (Object)l, (Object)b, (f07)null, (byte)0));
            }
            else {
                if (!(m instanceof qkf)) {
                    en9.r();
                    throw null;
                }
                f = new lp6(new pw1((Object)this, (Object)l, (Object)b, (f07)null, (byte)0), 0);
            }
        }
        this.f = (cp6)f;
    }
    
    public static lqo c(final t2k t2k) {
        Object o = t2k.d1("PRAGMA busy_timeout");
        try {
            ((b3k)o).Z0();
            final long long1 = ((b3k)o).getLong(0);
            r9n.m((AutoCloseable)o, (Throwable)null);
            o = lqo.a;
            if (long1 < 3000L) {
                ncq.x(t2k, "PRAGMA busy_timeout = 3000");
            }
            return (lqo)o;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                r9n.m((AutoCloseable)o, t);
            }
        }
    }
    
    public static Object k(muj muj, t2k w, int y, int z, final h07 h07) {
        vw1 vw1 = null;
        Label_0055: {
            if (h07 instanceof vw1) {
                vw1 = (vw1)h07;
                final int c = vw1.C;
                if ((c & Integer.MIN_VALUE) != 0x0) {
                    vw1.C = c + Integer.MIN_VALUE;
                    break Label_0055;
                }
            }
            vw1 = new vw1(muj, h07);
        }
        Object o = vw1.A;
        final int c2 = vw1.C;
        final pc7 v = pc7.v;
        boolean b = true;
        final lqo a = lqo.a;
        Label_0890: {
            Label_0854: {
                int z2 = 0;
                Label_0802: {
                    while (true) {
                        muj v3 = null;
                        Label_0679: {
                            Label_0615: {
                                Iterator iterator2 = null;
                                Label_0543: {
                                    List list2 = null;
                                    Label_0534: {
                                        final t2k w2;
                                        final muj muj2;
                                        switch (c2) {
                                            default: {
                                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                            case 8: {
                                                vt4.g0(o);
                                                return a;
                                            }
                                            case 7: {
                                                w = vw1.w;
                                                muj = vw1.v;
                                                vt4.g0(o);
                                                break Label_0890;
                                            }
                                            case 6: {
                                                w = vw1.w;
                                                muj = vw1.v;
                                                vt4.g0(o);
                                                break Label_0854;
                                            }
                                            case 5: {
                                                z2 = vw1.z;
                                                y = vw1.y;
                                                w2 = vw1.w;
                                                final muj v2 = vw1.v;
                                                vt4.g0(o);
                                                muj2 = v2;
                                                break;
                                            }
                                            case 4: {
                                                z = vw1.z;
                                                y = vw1.y;
                                                w = vw1.w;
                                                v3 = vw1.v;
                                                vt4.g0(o);
                                                break Label_0679;
                                            }
                                            case 3: {
                                                z = vw1.z;
                                                y = vw1.y;
                                                w = vw1.w;
                                                muj = vw1.v;
                                                vt4.g0(o);
                                                break Label_0615;
                                            }
                                            case 2: {
                                                z = vw1.z;
                                                y = vw1.y;
                                                final Iterator iterator = (Iterator)vw1.x;
                                                w = vw1.w;
                                                muj = vw1.v;
                                                vt4.g0(o);
                                                iterator2 = iterator;
                                                break Label_0543;
                                            }
                                            case 1: {
                                                z = vw1.z;
                                                y = vw1.y;
                                                final List list = (List)vw1.x;
                                                w = vw1.w;
                                                muj = vw1.v;
                                                vt4.g0(o);
                                                list2 = list;
                                                break Label_0534;
                                            }
                                            case 0: {
                                                vt4.g0(o);
                                                final List g = g8r.g(muj.c.c, y, z);
                                                if (g == null) {
                                                    b = false;
                                                    z2 = z;
                                                    break Label_0802;
                                                }
                                                final ox4 d = muj.d;
                                                vw1.v = muj;
                                                vw1.w = w;
                                                vw1.x = g;
                                                vw1.y = y;
                                                vw1.z = (byte)z;
                                                vw1.C = 1;
                                                Object o2 = null;
                                                Label_0520: {
                                                    switch (d.d) {
                                                        default: {
                                                            o2 = ljq.C(w, (h07)vw1);
                                                            if (o2 == v) {
                                                                break Label_0520;
                                                            }
                                                            break;
                                                        }
                                                        case 0: {
                                                            o2 = ljq.C(w, (h07)vw1);
                                                            if (o2 == v) {
                                                                break Label_0520;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    o2 = a;
                                                }
                                                if (o2 == v) {
                                                    return v;
                                                }
                                                list2 = g;
                                                break Label_0534;
                                            }
                                        }
                                        w = w2;
                                        muj = muj2;
                                        break Label_0802;
                                    }
                                    iterator2 = ((Iterable)list2).iterator();
                                }
                                if (iterator2.hasNext()) {
                                    ge9.C(iterator2.next());
                                    vw1.v = muj;
                                    vw1.w = w;
                                    vw1.x = iterator2;
                                    vw1.y = y;
                                    vw1.z = (byte)z;
                                    vw1.C = 2;
                                    throw null;
                                }
                                final ox4 d2 = muj.d;
                                vw1.v = muj;
                                vw1.w = w;
                                vw1.x = null;
                                vw1.y = y;
                                vw1.z = (byte)z;
                                vw1.C = 3;
                                o = d2.c(w, (h07)vw1);
                                if (o == v) {
                                    return v;
                                }
                            }
                            final vuj vuj = (vuj)o;
                            if (!vuj.a) {
                                fvd.y((Object)vuj.b, "Migration didn't properly handle: ");
                                return null;
                            }
                            final ox4 d3 = muj.d;
                            vw1.v = muj;
                            vw1.w = w;
                            vw1.y = y;
                            vw1.z = (byte)z;
                            vw1.C = 4;
                            v3 = muj;
                            if (a == v) {
                                return v;
                            }
                        }
                        vw1.v = v3;
                        vw1.w = w;
                        vw1.y = y;
                        vw1.z = (byte)z;
                        vw1.C = 5;
                        z2 = z;
                        t2k w2 = w;
                        muj muj2 = v3;
                        if (v3.m(w, (h07)vw1) == v) {
                            return v;
                        }
                        continue;
                    }
                }
                if (b) {
                    return a;
                }
                if (g8r.i(muj.c, y, z2)) {
                    final StringBuilder sb = new StringBuilder("A migration from ");
                    sb.append(y);
                    sb.append(" to ");
                    sb.append(z2);
                    sb.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.");
                    throw new IllegalStateException(sb.toString().toString());
                }
                vw1.v = muj;
                vw1.w = w;
                vw1.C = 6;
                if (muj.f(w, (h07)vw1) == v) {
                    return v;
                }
            }
            vw1.v = muj;
            vw1.w = w;
            vw1.C = 7;
            muj.h(w, (h07)vw1);
            if (a == v) {
                return v;
            }
        }
        final ox4 d4 = muj.d;
        vw1.v = null;
        vw1.w = null;
        vw1.C = 8;
        d4.a(w);
        if (a != v) {
            return a;
        }
        return v;
    }
    
    public final Object a(t2k v, h07 h07) {
        muj muj = this;
        final ox4 d = muj.d;
        final String b = d.b;
        Object o = null;
        Label_0067: {
            if (h07 instanceof mw1) {
                o = h07;
                final int z = ((mw1)o).z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ((mw1)o).z = z + Integer.MIN_VALUE;
                    break Label_0067;
                }
            }
            o = new mw1(muj, h07);
        }
        Object o2 = ((mw1)o).x;
        final int z2 = ((mw1)o).z;
        final lqo a = lqo.a;
        final pc7 v2 = pc7.v;
        Label_0398: {
            switch (z2) {
                default: {
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                case 7: {
                    final Throwable a2 = (Throwable)((mw1)o).v;
                    vt4.g0(o2);
                    break Label_0398;
                }
                case 6: {
                    final Object w = ((mw1)o).w;
                    final t2k t2k = (t2k)((mw1)o).v;
                    vt4.g0(o2);
                    final Object o3 = w;
                    break Label_0398;
                }
                case 5: {
                    final Object o4 = v = ((mw1)o).v;
                    try {
                        vt4.g0(o2);
                        break Label_0398;
                    }
                    finally {
                        break Label_0398;
                    }
                }
                case 4: {
                    final muj muj2 = (muj)((mw1)o).w;
                    final Object o5 = v = ((mw1)o).v;
                    vt4.g0(o2);
                    final muj muj3 = muj2;
                    break Label_0398;
                }
                case 3: {
                    muj = (muj)((mw1)o).w;
                    final Object o5 = v = ((mw1)o).v;
                    vt4.g0(o2);
                    break Label_0398;
                }
                case 2: {
                    final Object o5 = ((mw1)o).v;
                    vt4.g0(o2);
                    break Label_0398;
                }
                case 1: {
                    final Object o5 = ((mw1)o).v;
                    vt4.g0(o2);
                    break Label_0398;
                }
                case 0: {
                    vt4.g0(o2);
                    ((mw1)o).v = v;
                    boolean b2 = true;
                    ((mw1)o).z = 1;
                    h07 = (h07)((t2k)v).d1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
                    Label_0367: {
                        try {
                            if (((b3k)h07).Z0() && ((b3k)h07).getLong(0) != 0L) {
                                break Label_0367;
                            }
                            break Label_0367;
                        }
                        finally {
                            try {}
                            finally {
                                final Throwable t;
                                r9n.m((AutoCloseable)h07, t);
                            }
                            iftrue(Label_0533:)(!(boolean)o2);
                            Throwable a2;
                            t2k t2k;
                            Object o3;
                            final Object o4;
                            Object o5 = null;
                            muj muj3 = null;
                            vuj vuj;
                            String b3;
                            StringBuilder sb;
                            IllegalStateException ex;
                            lqo w2;
                            Object v3;
                            final Throwable t2;
                            jpj jpj;
                            lqo lqo;
                            Boolean value;
                            ox4 d2;
                            String t3 = null;
                            StringBuilder sb2;
                            Block_20_Outer:Block_15_Outer:
                            while (true) {
                                Block_11: {
                                    break Block_11;
                                    v = o5;
                                    ((mw1)o).v = o5;
                                    v = o5;
                                    ((mw1)o).w = muj;
                                    v = o5;
                                    ((mw1)o).z = 3;
                                    v = o5;
                                    iftrue(Label_0613:)((o2 = d.c((t2k)o5, (h07)o)) != v2);
                                    return v2;
                                    Label_0734: {
                                        v = o5;
                                    }
                                    v = o5;
                                    b3 = vuj.b;
                                    v = o5;
                                    v = o5;
                                    sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                                    v = o5;
                                    sb.append(b3);
                                    v = o5;
                                    ex = new IllegalStateException(sb.toString().toString());
                                    v = o5;
                                    throw ex;
                                    b2 = false;
                                    break Label_0367;
                                    ((mw1)o).v = o5;
                                    ((mw1)o).z = 2;
                                    ncq.x((t2k)o5, "BEGIN EXCLUSIVE TRANSACTION");
                                    iftrue(Label_0562:)(a != v2);
                                    return v2;
                                Block_18:
                                    while (true) {
                                        o3 = w2;
                                        t2k = (t2k)v3;
                                        iftrue(Label_0873:)(w2 instanceof jpj);
                                        break Block_18;
                                        w2 = a;
                                        v3 = o4;
                                        continue Block_20_Outer;
                                        throw a2;
                                        jpj = new jpj(t2);
                                        v3 = v;
                                        w2 = (lqo)jpj;
                                        continue Block_20_Outer;
                                    }
                                    lqo = w2;
                                    ((mw1)o).v = v3;
                                    ((mw1)o).w = w2;
                                    ((mw1)o).z = 6;
                                    ncq.x((t2k)v3, "END TRANSACTION");
                                    o3 = w2;
                                    t2k = (t2k)v3;
                                    iftrue(Label_0873:)(a != v2);
                                    return v2;
                                    while (true) {
                                        ((mw1)o).v = a2;
                                        ((mw1)o).w = null;
                                        ((mw1)o).z = 7;
                                        ncq.x(t2k, "ROLLBACK TRANSACTION");
                                        iftrue(Label_0920:)(a != v2);
                                        return v2;
                                        value = b2;
                                        r9n.m((AutoCloseable)h07, (Throwable)null);
                                        o5 = v;
                                        o2 = value;
                                        iftrue(Label_0398:)(value != v2);
                                        return v2;
                                        a2 = kpj.a(o3);
                                        iftrue(Label_0922:)(a2 == null);
                                        continue Block_15_Outer;
                                    }
                                    while (true) {
                                        v = o5;
                                        d2 = muj.d;
                                        v = o5;
                                        ((mw1)o).v = o5;
                                        v = o5;
                                        ((mw1)o).w = muj;
                                        v = o5;
                                        ((mw1)o).z = 4;
                                        muj3 = muj;
                                        iftrue(Label_0680:)(a != v2);
                                        return v2;
                                        v = o5;
                                        vuj = (vuj)o2;
                                        v = o5;
                                        iftrue(Label_0734:)(!vuj.a);
                                        continue;
                                    }
                                }
                                h07 = (h07)((t2k)o5).d1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                                while (true) {
                                    Label_0443: {
                                        try {
                                            if (((b3k)h07).Z0()) {
                                                t3 = ((b3k)h07).t0(0);
                                                break Label_0445;
                                            }
                                            break Label_0443;
                                        }
                                        finally {
                                            try {}
                                            finally {
                                                r9n.m((AutoCloseable)h07, (Throwable)v);
                                            }
                                            r9n.m((AutoCloseable)h07, (Throwable)null);
                                            iftrue(Label_0922:)(b.equals(t3));
                                            Block_25: {
                                                break Block_25;
                                                Label_0474: {
                                                    sb2 = new StringBuilder("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ");
                                                }
                                                sb2.append(b);
                                                sb2.append(", found: ");
                                                sb2.append(t3);
                                                throw new IllegalStateException(sb2.toString().toString());
                                                t3 = null;
                                                continue;
                                            }
                                            iftrue(Label_0474:)(!d.c.equals(t3));
                                            return a;
                                        }
                                    }
                                    break;
                                }
                                continue;
                            }
                            v = o5;
                            ((mw1)o).v = o5;
                            v = o5;
                            ((mw1)o).w = null;
                            v = o5;
                            ((mw1)o).z = 5;
                            v = o5;
                            o4 = o5;
                            iftrue(Label_0725:)(muj3.m((t2k)o5, (h07)o) != v2);
                            return v2;
                            Label_0922: {
                                return a;
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
    
    public final Object b(t2k t2k, final h07 h07) {
        nw1 nw2 = null;
        Label_0051: {
            if (h07 instanceof nw1) {
                final nw1 nw1 = (nw1)h07;
                final int y = nw1.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    nw1.y = y + Integer.MIN_VALUE;
                    nw2 = nw1;
                    break Label_0051;
                }
            }
            nw2 = new nw1(this, h07);
        }
        final Object w = nw2.w;
        final int y2 = nw2.y;
        final lqo a = lqo.a;
        final pc7 v = pc7.v;
        Label_0188: {
            if (y2 != 0) {
                if (y2 != 1) {
                    if (y2 == 2) {
                        t2k = nw2.v;
                        vt4.g0(w);
                        break Label_0188;
                    }
                    if (y2 == 3) {
                        vt4.g0(w);
                        return a;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    t2k = nw2.v;
                    vt4.g0(w);
                }
            }
            else {
                vt4.g0(w);
                nw2.v = t2k;
                nw2.y = 1;
                c(t2k);
                if (a == v) {
                    return v;
                }
            }
            nw2.v = t2k;
            nw2.y = 2;
            this.e(t2k);
            if (a == v) {
                return v;
            }
        }
        nw2.v = null;
        nw2.y = 3;
        if (this.d.b(t2k, nw2) != v) {
            return a;
        }
        return v;
    }
    
    public final Object d(t2k v, h07 v2) {
        final byte a = this.d.a;
        Object o = null;
        Label_0058: {
            if (v2 instanceof ow1) {
                o = v2;
                final int a2 = ((ow1)o).A;
                if ((a2 & Integer.MIN_VALUE) != 0x0) {
                    ((ow1)o).A = a2 + Integer.MIN_VALUE;
                    break Label_0058;
                }
            }
            o = new ow1(this, v2);
        }
        Object y = ((ow1)o).y;
        final int a3 = ((ow1)o).A;
        final lqo a4 = lqo.a;
        final pc7 v3 = pc7.v;
        Label_0575: {
            Label_0457: {
                Label_0429: {
                Label_0379:
                    while (true) {
                        muj muj = null;
                        switch (a3) {
                            default: {
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            case 10: {
                                vt4.g0(y);
                                return a4;
                            }
                            case 9: {
                                final Throwable a5 = (Throwable)((ow1)o).v;
                                vt4.g0(y);
                                break Label_0575;
                            }
                            case 8: {
                                final Object w = ((ow1)o).w;
                                v2 = (h07)((ow1)o).v;
                                vt4.g0(y);
                                break Label_0575;
                            }
                            case 7: {
                                v = (t2k)((ow1)o).v;
                                try {
                                    vt4.g0(y);
                                    break Label_0575;
                                }
                                finally {
                                    break Label_0575;
                                }
                            }
                            case 6: {
                                muj = (muj)((ow1)o).w;
                                v = (t2k)((ow1)o).v;
                                break;
                            }
                            case 5: {
                                muj = (muj)((ow1)o).w;
                                v = (t2k)((ow1)o).v;
                                break;
                            }
                            case 4: {
                                final int x = ((ow1)o).x;
                                v = (t2k)((ow1)o).v;
                                vt4.g0(y);
                                break Label_0575;
                            }
                            case 3: {
                                v = (t2k)((ow1)o).v;
                                vt4.g0(y);
                                break Label_0457;
                            }
                            case 2: {
                                v = (t2k)((ow1)o).v;
                                vt4.g0(y);
                                break Label_0429;
                            }
                            case 1: {
                                v = (t2k)((ow1)o).v;
                                vt4.g0(y);
                                break Label_0379;
                            }
                            case 0: {
                                vt4.g0(y);
                                ((ow1)o).v = v;
                                ((ow1)o).A = 1;
                                c(v);
                                if (a4 == v3) {
                                    return v3;
                                }
                                break Label_0379;
                            }
                        }
                        try {
                            vt4.g0(y);
                            y = muj;
                            break Label_0575;
                        }
                        finally {
                            break Label_0575;
                        }
                        continue;
                    }
                    ((ow1)o).v = v;
                    ((ow1)o).A = 2;
                    if (this.c.e == 3) {
                        ncq.x(v, "PRAGMA journal_mode = WAL");
                    }
                    else {
                        ncq.x(v, "PRAGMA journal_mode = TRUNCATE");
                    }
                    if (a4 == v3) {
                        return v3;
                    }
                }
                ((ow1)o).v = v;
                ((ow1)o).A = 3;
                this.e(v);
                if (a4 == v3) {
                    return v3;
                }
            }
            v2 = (h07)v.d1("PRAGMA user_version");
            try {
                ((b3k)v2).Z0();
                final int x = (int)((b3k)v2).getLong(0);
                r9n.m((AutoCloseable)v2, (Throwable)null);
                v2 = (h07)v;
                Label_0842: {
                    if (x != a) {
                        ((ow1)o).v = v;
                        ((ow1)o).x = x;
                        ((ow1)o).A = 4;
                        ncq.x(v, "BEGIN EXCLUSIVE TRANSACTION");
                        if (a4 == v3) {
                            return v3;
                        }
                        while (true) {
                            Label_0584: {
                                if (x != 0) {
                                    break Label_0584;
                                }
                                Label_0623: {
                                    try {
                                        ((ow1)o).v = v;
                                        ((ow1)o).w = this;
                                        ((ow1)o).A = 5;
                                        if (this.j(v, (h07)o) == v3) {
                                            return v3;
                                        }
                                        y = this;
                                        break Label_0623;
                                    }
                                    finally {
                                        break Label_0575;
                                    }
                                    break Label_0584;
                                }
                                final byte a6 = ((muj)y).d.a;
                                final StringBuilder sb = new StringBuilder("PRAGMA user_version = ");
                                sb.append((int)a6);
                                final String string = sb.toString();
                                ((ow1)o).v = v2;
                                ((ow1)o).w = null;
                                ((ow1)o).A = 7;
                                ncq.x((t2k)v2, string);
                                if (a4 == v3) {
                                    return v3;
                                }
                                v = (t2k)v2;
                                Object w2 = a4;
                                Label_0731: {
                                    break Label_0731;
                                    w2 = new jpj((Throwable)v2);
                                }
                                v2 = (h07)v;
                                Object w = w2;
                                if (!(w2 instanceof jpj)) {
                                    v2 = (h07)w2;
                                    ((ow1)o).v = v;
                                    ((ow1)o).w = w2;
                                    ((ow1)o).A = 8;
                                    ncq.x(v, "END TRANSACTION");
                                    v2 = (h07)v;
                                    w = w2;
                                    if (a4 == v3) {
                                        return v3;
                                    }
                                }
                                final Throwable a5 = kpj.a(w);
                                if (a5 == null) {
                                    break Label_0842;
                                }
                                ((ow1)o).v = a5;
                                ((ow1)o).w = null;
                                ((ow1)o).A = 9;
                                ncq.x((t2k)v2, "ROLLBACK TRANSACTION");
                                if (a4 == v3) {
                                    return v3;
                                }
                                throw a5;
                            }
                            ((ow1)o).v = v;
                            ((ow1)o).w = this;
                            ((ow1)o).A = 6;
                            v2 = (h07)k(this, v, x, a, (h07)o);
                            if (v2 == v3) {
                                return v3;
                            }
                            continue;
                        }
                    }
                }
                ((ow1)o).v = null;
                ((ow1)o).w = null;
                ((ow1)o).A = 10;
                if (this.l((t2k)v2, (h07)o) != v3) {
                    return a4;
                }
                return v3;
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    r9n.m((AutoCloseable)v2, t);
                }
            }
        }
    }
    
    public final lqo e(final t2k t2k) {
        final int e = this.c.e;
        final lqo a = lqo.a;
        if (e == 3) {
            ncq.x(t2k, "PRAGMA synchronous = NORMAL");
            return a;
        }
        ncq.x(t2k, "PRAGMA synchronous = FULL");
        return a;
    }
    
    public final Object f(final t2k t2k, final h07 h07) {
        qw1 qw2 = null;
        Label_0051: {
            if (h07 instanceof qw1) {
                final qw1 qw1 = (qw1)h07;
                final int z = qw1.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    qw1.z = z + Integer.MIN_VALUE;
                    qw2 = qw1;
                    break Label_0051;
                }
            }
            qw2 = new qw1(this, h07);
        }
        final Object x = qw2.x;
        final int z2 = qw2.z;
        final lqo a = lqo.a;
        final pc7 v = pc7.v;
        Label_0277: {
            Iterator w = null;
            t2k v2 = null;
            if (z2 != 0) {
                if (z2 == 1 || z2 == 2) {
                    w = qw2.w;
                    v2 = qw2.v;
                    vt4.g0(x);
                    break Label_0277;
                }
                if (z2 == 3) {
                    vt4.g0(x);
                    return a;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                vt4.g0(x);
                if (!this.c.k) {
                    break Label_0277;
                }
            }
            final b3k d1 = t2k.d1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            Label_0250: {
                try {
                    final ygd a2 = lq6.A();
                    while (d1.Z0()) {
                        final String t0 = d1.t0(0);
                        if (!rym.E0(t0, "sqlite_", false)) {
                            if (t0.equals("android_metadata")) {
                                continue;
                            }
                            a2.add((Object)new yog((Object)t0, (Object)mlc.q((Object)d1.t0(1), (Object)"view")));
                        }
                    }
                    break Label_0250;
                }
                finally {
                    try {}
                    finally {
                        r9n.m((AutoCloseable)d1, (Throwable)h07);
                    }
                    final String k;
                    Label_0367: {
                        final String s;
                        k = hia.k("DROP TABLE IF EXISTS `", s, "`");
                    }
                    qw2.v = v2;
                    qw2.w = w;
                    qw2.z = 2;
                    ncq.x(v2, k);
                    iftrue(Label_0277:)(a != v);
                    return v;
                    while (true) {
                        while (true) {
                            final String s;
                            final String i = hia.k("DROP VIEW IF EXISTS `", s, "`");
                            qw2.v = v2;
                            qw2.w = w;
                            qw2.z = 1;
                            ncq.x(v2, i);
                            iftrue(Label_0277:)(a != v);
                            return v;
                            final yog yog = (yog)w.next();
                            s = (String)yog.v;
                            iftrue(Label_0367:)(!(boolean)yog.w);
                            continue;
                        }
                        final ygd a2;
                        final ygd n = lq6.n(a2);
                        r9n.m((AutoCloseable)d1, (Throwable)null);
                        final ListIterator listIterator = n.listIterator(0);
                        v2 = t2k;
                        w = (Iterator)listIterator;
                        iftrue(Label_0539:)(!w.hasNext());
                        continue;
                    }
                }
            }
        }
        qw2.z = 3;
        switch (this.d.d) {
            default: {
                yi2.t(t2k, "DROP TABLE IF EXISTS `executed_client_tools`");
                yi2.t(t2k, "DROP TABLE IF EXISTS `snapshot_headers`");
                yi2.t(t2k, "DROP TABLE IF EXISTS `snapshot_messages`");
                break;
            }
            case 0: {
                yi2.t(t2k, "DROP TABLE IF EXISTS `cachedMessages`");
                yi2.t(t2k, "DROP TABLE IF EXISTS `cachedConversations`");
                yi2.t(t2k, "DROP TABLE IF EXISTS `chatIdListEntries`");
                yi2.t(t2k, "DROP TABLE IF EXISTS `cachedCoworkSessions`");
                yi2.t(t2k, "DROP TABLE IF EXISTS `cachedArtifacts`");
                yi2.t(t2k, "DROP TABLE IF EXISTS `cachedProjects`");
                yi2.t(t2k, "DROP TABLE IF EXISTS `projectIdListEntries`");
                break;
            }
        }
        if (a != v) {
            return a;
        }
        return v;
        Label_0539: {
            return a;
        }
    }
    
    public final void g(t2k v, final h07 h07) {
        rw1 rw2 = null;
        Label_0051: {
            if (h07 instanceof rw1) {
                final rw1 rw1 = (rw1)h07;
                final int z = rw1.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    rw1.z = z + Integer.MIN_VALUE;
                    rw2 = rw1;
                    break Label_0051;
                }
            }
            rw2 = new rw1(this, h07);
        }
        final Object x = rw2.x;
        final int z2 = rw2.z;
        Iterator w;
        if (z2 != 0) {
            if (z2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w = rw2.w;
            v = rw2.v;
            vt4.g0(x);
        }
        else {
            vt4.g0(x);
            w = ((Iterable)this.e).iterator();
        }
        if (!w.hasNext()) {
            return;
        }
        ge9.C(w.next());
        rw2.v = v;
        rw2.w = w;
        rw2.z = 1;
        throw null;
    }
    
    public final void h(t2k v, final h07 h07) {
        sw1 sw2 = null;
        Label_0051: {
            if (h07 instanceof sw1) {
                final sw1 sw1 = (sw1)h07;
                final int z = sw1.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    sw1.z = z + Integer.MIN_VALUE;
                    sw2 = sw1;
                    break Label_0051;
                }
            }
            sw2 = new sw1(this, h07);
        }
        final Object x = sw2.x;
        final int z2 = sw2.z;
        Iterator w;
        if (z2 != 0) {
            if (z2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w = sw2.w;
            v = sw2.v;
            vt4.g0(x);
        }
        else {
            vt4.g0(x);
            w = ((Iterable)this.e).iterator();
        }
        if (!w.hasNext()) {
            return;
        }
        ge9.C(w.next());
        sw2.v = v;
        sw2.w = w;
        sw2.z = 1;
        throw null;
    }
    
    public final void i(t2k v, final h07 h07) {
        tw1 tw2 = null;
        Label_0051: {
            if (h07 instanceof tw1) {
                final tw1 tw1 = (tw1)h07;
                final int z = tw1.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    tw1.z = z + Integer.MIN_VALUE;
                    tw2 = tw1;
                    break Label_0051;
                }
            }
            tw2 = new tw1(this, h07);
        }
        final Object x = tw2.x;
        final int z2 = tw2.z;
        Iterator w;
        if (z2 != 0) {
            if (z2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w = tw2.w;
            v = tw2.v;
            vt4.g0(x);
        }
        else {
            vt4.g0(x);
            w = ((Iterable)this.e).iterator();
        }
        if (!w.hasNext()) {
            return;
        }
        if (w.next() != null) {
            fvd.c();
            return;
        }
        tw2.v = v;
        tw2.w = w;
        tw2.z = 1;
        throw null;
    }
    
    public final Object j(t2k t2k, h07 d1) {
        Object o = null;
        Label_0049: {
            if (d1 instanceof uw1) {
                o = d1;
                final int z = ((uw1)o).z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ((uw1)o).z = z + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new uw1(this, d1);
        }
        Object o2 = ((uw1)o).x;
        final int z2 = ((uw1)o).z;
        final lqo a = lqo.a;
        final ox4 d2 = this.d;
        final pc7 v = pc7.v;
        Label_0291: {
            switch (z2) {
                default: {
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                case 6: {
                    vt4.g0(o2);
                    return a;
                }
                case 5: {
                    t2k = ((uw1)o).v;
                    vt4.g0(o2);
                    break Label_0291;
                }
                case 4: {
                    t2k = ((uw1)o).v;
                    vt4.g0(o2);
                    break Label_0291;
                }
                case 3: {
                    t2k = ((uw1)o).v;
                    vt4.g0(o2);
                    break Label_0291;
                }
                case 2: {
                    final boolean w = ((uw1)o).w;
                    t2k = ((uw1)o).v;
                    vt4.g0(o2);
                    break Label_0291;
                }
                case 1: {
                    t2k = ((uw1)o).v;
                    vt4.g0(o2);
                    break Label_0291;
                }
                case 0: {
                    vt4.g0(o2);
                    ((uw1)o).v = t2k;
                    boolean b = true;
                    ((uw1)o).z = 1;
                    d1 = (h07)t2k.d1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
                Block_10_Outer:
                    while (true) {
                        Label_0263: {
                            try {
                                if (((b3k)d1).Z0() && ((b3k)d1).getLong(0) == 0L) {
                                    break Label_0266;
                                }
                                break Label_0263;
                            }
                            finally {
                                try {}
                                finally {
                                    r9n.m((AutoCloseable)d1, (Throwable)t2k);
                                }
                                final boolean w = (boolean)o2;
                                ((uw1)o).v = t2k;
                                ((uw1)o).w = w;
                                ((uw1)o).z = 2;
                                d2.a(t2k);
                                iftrue(Label_0335:)(a != v);
                                return v;
                                final vuj vuj = (vuj)o2;
                                iftrue(Label_0389:)(!vuj.a);
                                t2k v2 = t2k;
                                while (true) {
                                    Label_0401: {
                                        break Label_0401;
                                        final Boolean value = b;
                                        r9n.m((AutoCloseable)d1, (Throwable)null);
                                        o2 = value;
                                        iftrue(Label_0291:)(value != v);
                                        return v;
                                        Label_0428: {
                                            t2k = v2;
                                        }
                                        break Label_0291;
                                        ((uw1)o).v = null;
                                        ((uw1)o).z = 6;
                                        this.g(t2k, (h07)o);
                                        iftrue(Label_0482:)(a != v);
                                        return v;
                                        ((uw1)o).v = t2k;
                                        ((uw1)o).z = 3;
                                        o2 = d2.c(t2k, (h07)o);
                                        iftrue(Label_0372:)(o2 != v);
                                        return v;
                                        b = false;
                                        continue Block_10_Outer;
                                        Label_0389:
                                        fvd.y((Object)vuj.b, "Pre-packaged database has an invalid schema: ");
                                        return null;
                                    }
                                    ((uw1)o).v = v2;
                                    ((uw1)o).z = 4;
                                    iftrue(Label_0428:)(this.m(v2, (h07)o) != v);
                                    return v;
                                    v2 = t2k;
                                    iftrue(Label_0401:)(w);
                                    continue;
                                }
                                ((uw1)o).v = t2k;
                                ((uw1)o).z = 5;
                                iftrue(Label_0452:)(a != v);
                                return v;
                                Label_0482: {
                                    return a;
                                }
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public final Object l(t2k v, final h07 h07) {
        h07 h8 = null;
        Label_0049: {
            if (h07 instanceof ww1) {
                h8 = h07;
                final int y = ((ww1)h8).y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ((ww1)h8).y = y + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            h8 = new ww1(this, h07);
        }
        final Object w = ((ww1)h8).w;
        final int y2 = ((ww1)h8).y;
        final lqo a = lqo.a;
        final pc7 v2 = pc7.v;
        Label_0229: {
            Label_0200: {
                t2k v3;
                if (y2 != 0) {
                    if (y2 != 1) {
                        if (y2 == 2) {
                            v = ((ww1)h8).v;
                            vt4.g0(w);
                            break Label_0200;
                        }
                        if (y2 == 3) {
                            vt4.g0(w);
                            break Label_0229;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        v3 = ((ww1)h8).v;
                        vt4.g0(w);
                    }
                }
                else {
                    vt4.g0(w);
                    ((ww1)h8).v = v;
                    ((ww1)h8).y = 1;
                    v3 = v;
                    if (this.a(v, h8) == v2) {
                        return v2;
                    }
                }
                ((ww1)h8).v = v3;
                ((ww1)h8).y = 2;
                v = v3;
                if (this.d.b(v3, h8) == v2) {
                    return v2;
                }
            }
            ((ww1)h8).v = null;
            ((ww1)h8).y = 3;
            this.i(v, h8);
            if (a != v2) {
                break Label_0229;
            }
            return v2;
        }
        this.a = true;
        return a;
    }
    
    public final Object m(t2k v, final h07 h07) {
        yw1 yw2 = null;
        Label_0051: {
            if (h07 instanceof yw1) {
                final yw1 yw1 = (yw1)h07;
                final int y = yw1.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    yw1.y = y + Integer.MIN_VALUE;
                    yw2 = yw1;
                    break Label_0051;
                }
            }
            yw2 = new yw1(this, h07);
        }
        final Object w = yw2.w;
        final int y2 = yw2.y;
        final lqo a = lqo.a;
        final pc7 v2 = pc7.v;
        if (y2 != 0) {
            if (y2 != 1) {
                if (y2 == 2) {
                    vt4.g0(w);
                    return a;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                v = yw2.v;
                vt4.g0(w);
            }
        }
        else {
            vt4.g0(w);
            yw2.v = v;
            yw2.y = 1;
            ncq.x(v, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            if (a == v2) {
                return v2;
            }
        }
        final String e = xg1.e(this.d.b);
        yw2.v = null;
        yw2.y = 2;
        ncq.x(v, e);
        if (a != v2) {
            return a;
        }
        return v2;
    }
    
    public final Object n(final boolean b, final zta zta, final h07 h07) {
        luj luj2 = null;
        Label_0054: {
            if (h07 instanceof luj) {
                final luj luj = (luj)h07;
                final int x = luj.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    luj.x = x + Integer.MIN_VALUE;
                    luj2 = luj;
                    break Label_0054;
                }
            }
            luj2 = new luj(this, h07);
        }
        final Object v = luj2.v;
        final int x2 = luj2.x;
        Label_0095: {
            if (x2 == 0) {
                break Label_0095;
            }
            Label_0088: {
                if (x2 != 1) {
                    break Label_0088;
                }
                try {
                    vt4.g0(v);
                    Object o = v;
                    Label_0138: {
                        return o;
                    }
                    vt4.g0(v);
                    final cp6 f = this.f;
                    luj2.x = 1;
                    final Object h8 = f.h(b, zta, luj2);
                    final pc7 v2 = pc7.v;
                    iftrue(Label_0138:)((o = h8) != v2);
                    return v2;
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                finally {}
            }
        }
    }
}
