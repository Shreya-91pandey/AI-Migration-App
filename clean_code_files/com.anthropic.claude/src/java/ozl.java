import java.util.concurrent.atomic.AtomicInteger;

public final class ozl
{
    public final cof a;
    public final v2b b;
    public final n6k c;
    
    public ozl() {
        this.a = new cof();
        this.b = new v2b((byte)4);
        this.c = new n6k((zta)new sq0(2, (f07)null, (byte)3));
    }
    
    public final Integer a() {
        return new Integer(((AtomicInteger)this.b.w).get());
    }
    
    public final Object b(lta lta, final h07 h07) {
        h07 h8 = null;
        Label_0049: {
            if (h07 instanceof mzl) {
                h8 = h07;
                final int a = ((mzl)h8).A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    ((mzl)h8).A = a + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            h8 = new mzl(this, h07);
        }
        final Object y = ((mzl)h8).y;
        final int a2 = ((mzl)h8).A;
        final pc7 v = pc7.v;
        aof w = null;
        Label_0263: {
            int x;
            lta lta2;
            if (a2 != 0) {
                if (a2 != 1) {
                    Label_0104: {
                        if (a2 == 2) {
                            lta = (lta)((mzl)h8).w;
                            Label_0272: {
                                try {
                                    vt4.g0(y);
                                    lta = (lta)y;
                                    break Label_0263;
                                }
                                finally {
                                    break Label_0272;
                                }
                                break Label_0104;
                            }
                            ((aof)lta).g((Object)null);
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x = ((mzl)h8).x;
                w = ((mzl)h8).w;
                lta = (lta)((mzl)h8).v;
                vt4.g0(y);
                lta2 = lta;
            }
            else {
                vt4.g0(y);
                ((mzl)h8).v = (m6n)lta;
                final cof a3 = this.a;
                ((mzl)h8).w = (aof)a3;
                x = 0;
                ((mzl)h8).x = 0;
                ((mzl)h8).A = 1;
                w = (aof)a3;
                lta2 = lta;
                if (a3.c((f07)h8) == v) {
                    return v;
                }
            }
            ((mzl)h8).v = null;
            ((mzl)h8).w = w;
            ((mzl)h8).x = x;
            ((mzl)h8).A = 2;
            if ((lta = (lta)lta2.b((Object)h8)) != v) {
                break Label_0263;
            }
            return v;
        }
        w.g((Object)null);
        return lta;
    }
    
    public final Object c(zta zta, h07 a) {
        Object o = null;
        Label_0049: {
            if (a instanceof nzl) {
                o = a;
                final int z = ((nzl)o).z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ((nzl)o).z = z + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new nzl(this, (h07)a);
        }
        final Object x = ((nzl)o).x;
        final int z2 = ((nzl)o).z;
        boolean w = false;
        Object o2 = null;
        Label_0192: {
            if (z2 != 0) {
                if (z2 == 1) {
                    w = ((nzl)o).w;
                    zta = (zta)((nzl)o).v;
                    try {
                        vt4.g0(x);
                    }
                    finally {
                        o2 = a;
                        break Label_0192;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(x);
            a = this.a;
            w = ((cof)a).f();
            try {
                ((nzl)o).v = (cof)a;
                ((nzl)o).w = w;
                ((nzl)o).z = 1;
                zta = (zta)zta.d((Object)w, o);
                final pc7 v = pc7.v;
                if (zta == v) {
                    return v;
                }
                if (w) {
                    ((aof)a).g((Object)null);
                }
                return zta;
            }
            finally {
                zta = (zta)a;
            }
        }
        if (w) {
            ((aof)zta).g((Object)null);
        }
        throw o2;
    }
}
