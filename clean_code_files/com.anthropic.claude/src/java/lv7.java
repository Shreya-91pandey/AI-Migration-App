import java.io.Serializable;
import androidx.datastore.core.CorruptionException;

public final class lv7 extends m6n implements lta
{
    public byte A;
    public final boolean B;
    public final rv7 C;
    public final zta D;
    public CorruptionException w;
    public Object x;
    public Serializable y;
    public int z;
    
    public lv7(final boolean b, final rv7 c, final zta d, final f07 f07) {
        this.B = b;
        this.C = c;
        this.D = d;
        super(1, f07);
    }
    
    public final Object b(final Object o) {
        return ((lv7)this.create((f07)o)).invokeSuspend(lqo.a);
    }
    
    public final f07 create(final f07 f07) {
        return (f07)new lv7(this.B, this.C, this.D, f07);
    }
    
    public final Object invokeSuspend(Object w) {
        final byte a = this.A;
        final zta d = this.D;
        final int n = 0;
        final boolean b = this.B;
        final rv7 c = this.C;
        final pc7 v = pc7.v;
        Object x = null;
        Label_0567: {
            Object o = null;
            Object c2 = null;
            Label_0185: {
                if (a == 0) {
                    break Label_0185;
                }
                Label_0178: {
                    if (a == 1) {
                        break Label_0178;
                    }
                    Label_0160: {
                        if (a == 2) {
                            break Label_0160;
                        }
                        if (a != 3) {
                            if (a != 4) {
                                if (a == 5) {
                                    final z3j z3j = (z3j)this.y;
                                    final b4j b4j = (b4j)this.x;
                                    x = this.w;
                                    try {
                                        vt4.g0((Object)w);
                                        x = b4j;
                                        break Label_0567;
                                    }
                                    finally {
                                        break Label_0567;
                                    }
                                }
                                en9.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            o = this.y;
                            x = this.x;
                            final CorruptionException w2 = this.w;
                            vt4.g0((Object)w);
                            final CorruptionException ex = w;
                            w = w2;
                            c2 = ex;
                            break Label_0185;
                        }
                        try {
                            vt4.g0((Object)w);
                            return w;
                        }
                        catch (final CorruptionException w) {
                            x = new Object();
                            final uc7 b2 = c.b;
                            this.w = w;
                            this.x = x;
                            this.y = (Serializable)x;
                            this.A = 4;
                            c2 = b2.c(w);
                            if (c2 == v) {
                                return v;
                            }
                            o = x;
                        Label_0248:
                            while (true) {
                            Block_12_Outer:
                                while (true) {
                                    iftrue(Label_0246:)(w == null);
                                    Block_13: {
                                        break Block_13;
                                    }
                                    int z = w.hashCode();
                                    break Label_0248;
                                    final ozl c3;
                                    Label_0317: {
                                        c3 = c.c();
                                    }
                                    final jv7 jv7 = new jv7(c, d, (f07)null);
                                    this.A = 3;
                                    x = c3.c((zta)jv7, (h07)this);
                                    iftrue(Label_0365:)((w = (CorruptionException)x) != v);
                                    return v;
                                    this.w = null;
                                    this.x = w;
                                    this.z = z;
                                    this.A = 2;
                                    final Object d2 = d.d((Object)b, (Object)this);
                                    iftrue(Label_0293:)(d2 != v);
                                    return v;
                                    while (true) {
                                        this.A = 1;
                                        w = (CorruptionException)new dv7(c, null, (byte)1);
                                        x = zn2.R("DataStore.readDataFromFileOrDefault", (yci)null, (lta)w, (h07)this);
                                        iftrue(Label_0234:)((w = (CorruptionException)x) != v);
                                        return v;
                                        z = this.z;
                                        final Object x2 = this.x;
                                        vt4.g0((Object)w);
                                        return new ot7(z, ((Number)w).intValue(), x2);
                                        Label_0365:
                                        return w;
                                        vt4.g0((Object)w);
                                        iftrue(Label_0317:)(!b);
                                        continue;
                                    }
                                    Label_0293:
                                    final Object x2 = w;
                                    w = (CorruptionException)d2;
                                    return new ot7(z, ((Number)w).intValue(), x2);
                                    vt4.g0((Object)w);
                                    continue Block_12_Outer;
                                }
                                Label_0246: {
                                    final int z = 0;
                                }
                                continue Label_0248;
                            }
                        }
                    }
                }
            }
            ((b4j)o).v = c2;
            final Object y = new Object();
            while (true) {
                try {
                    final boolean b3 = this.B;
                    final kv7 kv7 = new kv7((b4j)x, c, (z3j)y, this.D, b3, (f07)null);
                    this.w = w;
                    this.x = x;
                    this.y = (Serializable)y;
                    this.A = 5;
                    if (b3) {
                        w = (CorruptionException)kv7.b((Object)this);
                    }
                    else {
                        w = (CorruptionException)c.c().b((lta)new un((byte)7, (f07)null, (Object)kv7), (h07)this);
                    }
                    if (w == v) {
                        return v;
                    }
                    w = (CorruptionException)y;
                    x = ((b4j)x).v;
                    int hashCode = n;
                    if (x != null) {
                        hashCode = x.hashCode();
                    }
                    return new ot7(hashCode, ((z3j)w).v, x);
                    x = w;
                    final CorruptionException ex2;
                    w = ex2;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        soh.j((Throwable)x, (Throwable)w);
        throw x;
    }
}
