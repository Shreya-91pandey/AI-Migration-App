public abstract class dgk
{
    public static final agk a;
    public static final zfk b;
    public static final bgk c;
    
    static {
        a = (agk)new Object();
        b = (zfk)new Object();
        c = (bgk)new Object();
    }
    
    public static igf a(final igf igf, final mgk mgk, final zhg zhg, final boolean b, final boolean b2, gia gia, final llf llf, final int n) {
        if ((n & 0x20) != 0x0) {
            gia = null;
        }
        return igf.E((igf)new yfk(mgk, zhg, b, b2, gia, llf));
    }
    
    public static igf b(final igf igf, final mgk mgk, boolean b, gia gia, final int n) {
        if ((n & 0x4) != 0x0) {
            b = true;
        }
        if ((n & 0x10) != 0x0) {
            gia = null;
        }
        return a(igf, mgk, zhg.w, b, true, gia, null, 128);
    }
    
    public static final Object c(chk v, final long n, final h07 h07) {
        Object o = null;
        Label_0053: {
            if (h07 instanceof cgk) {
                final cgk cgk = (cgk)h07;
                final int y = cgk.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    cgk.y = y + Integer.MIN_VALUE;
                    o = cgk;
                    break Label_0053;
                }
            }
            o = new cgk(h07);
        }
        final Object x = ((cgk)o).x;
        final int y2 = ((cgk)o).y;
        y3j y3j;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            final y3j w = ((cgk)o).w;
            v = ((cgk)o).v;
            vt4.g0(x);
            y3j = w;
        }
        else {
            vt4.g0(x);
            final Object w2 = new Object();
            final jbh jbh = new jbh(v, n, (y3j)w2, (f07)null);
            ((cgk)o).v = v;
            ((cgk)o).w = (y3j)w2;
            ((cgk)o).y = 1;
            final Object g = v.g(lnf.v, (zta)jbh, (h07)o);
            final pc7 v2 = pc7.v;
            if (g == v2) {
                return v2;
            }
            y3j = (y3j)w2;
        }
        return new l6g(v.i(y3j.v));
    }
}
