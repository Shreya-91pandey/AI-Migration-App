import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

public final class xug implements eeo, tpi
{
    public final zta a;
    public final t2k b;
    public final AtomicInteger c;
    public ceo d;
    
    public xug(final zta a, final t2k b) {
        this.a = a;
        this.b = b;
        this.c = new AtomicInteger(0);
    }
    
    @Override
    public final Boolean a(final f07 f07) {
        return this.d != null || this.b.H0();
    }
    
    @Override
    public final Object b(String d1, lta w, final h07 h07) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof vug) {
                final vug vug = (vug)h07;
                final int z = vug.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    vug.z = z + Integer.MIN_VALUE;
                    o = vug;
                    break Label_0054;
                }
            }
            o = new vug(this, h07);
        }
        final Object x = ((vug)o).x;
        final int z2 = ((vug)o).z;
        final pc7 v = pc7.v;
        String v2;
        Boolean b;
        if (z2 != 0) {
            if (z2 != 1) {
                if (z2 == 2) {
                    vt4.g0(x);
                    return x;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                w = ((vug)o).w;
                v2 = ((vug)o).v;
                vt4.g0(x);
                b = (Boolean)x;
            }
        }
        else {
            vt4.g0(x);
            ((vug)o).v = d1;
            ((vug)o).w = w;
            ((vug)o).z = 1;
            final Boolean a = this.a((f07)o);
            v2 = d1;
            if ((b = a) == v) {
                return v;
            }
        }
        if (b) {
            final b80 b2 = new b80(this, v2, w, null, (byte)1);
            ((vug)o).v = null;
            ((vug)o).w = null;
            ((vug)o).z = 2;
            final Object d2 = this.a.d((Object)b2, o);
            if (d2 != v) {
                return d2;
            }
        }
        else {
            d1 = (String)this.b.d1(v2);
            try {
                final Object b3 = w.b((Object)d1);
                r9n.m((AutoCloseable)d1, (Throwable)null);
                return b3;
            }
            finally {
                try {}
                finally {
                    r9n.m((AutoCloseable)d1, (Throwable)w);
                }
            }
        }
        return v;
    }
    
    @Override
    public final t2k c() {
        return this.b;
    }
    
    @Override
    public final Object d(final ceo ceo, final zta zta, final m6n m6n) {
        return this.a.d((Object)new pw1((Object)this, (Object)ceo, (Object)zta, (f07)null, (byte)3), (Object)m6n);
    }
    
    public final Object e(final ceo d, final zta zta, final h07 h07) {
        tug tug2 = null;
        Label_0054: {
            if (h07 instanceof tug) {
                final tug tug = (tug)h07;
                final int y = tug.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    tug.y = y + Integer.MIN_VALUE;
                    tug2 = tug;
                    break Label_0054;
                }
            }
            tug2 = new tug(this, h07);
        }
        final Object w = tug2.w;
        final int y2 = tug2.y;
        final AtomicInteger c = this.c;
        boolean v = true;
        final t2k b = this.b;
        Label_0120: {
            if (y2 == 0) {
                break Label_0120;
            }
            Label_0113: {
                if (y2 != 1) {
                    break Label_0113;
                }
                v = tug2.v;
                Label_0234: {
                    try {
                        vt4.g0(w);
                        final Object o = w;
                        break Label_0234;
                    }
                    finally {
                        try {}
                        finally {
                            Label_0308: {
                                Label_0303: {
                                    try {
                                        if (c.decrementAndGet() == 0) {
                                            this.d = null;
                                        }
                                    }
                                    catch (final SQLException ex) {
                                        break Label_0303;
                                    }
                                    yi2.t(b, "ROLLBACK TRANSACTION");
                                    break Label_0308;
                                }
                                final SQLException ex;
                                soh.j((Throwable)zta, (Throwable)ex);
                            }
                        }
                        Label_0173: {
                            yi2.t(b, "BEGIN DEFERRED TRANSACTION");
                        }
                    Block_10_Outer:
                        while (true) {
                            while (true) {
                                final int ordinal;
                                Block_9: {
                                Label_0193:
                                    while (true) {
                                        Label_0247: {
                                        Block_13_Outer:
                                            while (true) {
                                                break Label_0180;
                                            Block_11_Outer:
                                                while (true) {
                                                    this.d = null;
                                                    break Label_0247;
                                                    yi2.t(b, "END TRANSACTION");
                                                    return;
                                                    iftrue(Label_0163:)(ordinal == 1);
                                                    break Block_9;
                                                    while (true) {
                                                        this.d = d;
                                                        break Label_0193;
                                                        Label_0158:
                                                        en9.r();
                                                        return null;
                                                        iftrue(Label_0193:)(c.incrementAndGet() <= 0);
                                                        continue Block_10_Outer;
                                                    }
                                                    iftrue(Label_0247:)(c.decrementAndGet() != 0);
                                                    continue Block_11_Outer;
                                                }
                                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                                Label_0163:
                                                yi2.t(b, "BEGIN IMMEDIATE TRANSACTION");
                                                continue Block_13_Outer;
                                                Label_0261:
                                                yi2.t(b, "ROLLBACK TRANSACTION");
                                                return;
                                                yi2.t(b, "BEGIN EXCLUSIVE TRANSACTION");
                                                continue Block_13_Outer;
                                            }
                                        }
                                        iftrue(Label_0261:)(!v);
                                        continue Block_10_Outer;
                                    }
                                    final rug rug = new rug(this);
                                    tug2.v = true;
                                    tug2.y = 1;
                                    final Object d2 = zta.d((Object)rug, (Object)tug2);
                                    final pc7 v2 = pc7.v;
                                    final Object o;
                                    iftrue(Label_0234:)((o = d2) != v2);
                                    return v2;
                                }
                                iftrue(Label_0158:)(ordinal != 2);
                                continue;
                            }
                            vt4.g0(w);
                            final int ordinal = d.ordinal();
                            iftrue(Label_0173:)(ordinal == 0);
                            continue Block_10_Outer;
                        }
                    }
                }
            }
        }
    }
}
