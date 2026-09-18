import android.os.SystemClock;
import com.anthropic.claude.api.result.ApiResult;

public final class lbg
{
    public final vn0 a;
    public final cof b;
    public hbg c;
    
    public lbg(final vn0 a, final f60 f60) {
        this.a = a;
        this.b = new cof();
    }
    
    public final Object a(final lta lta, lta w, h07 h07) {
        Object o = null;
        Label_0052: {
            if (h07 instanceof ibg) {
                o = h07;
                final int a = ((ibg)o).A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    ((ibg)o).A = a + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            o = new ibg(this, h07);
        }
        h07 = (h07)((ibg)o).y;
        final int a2 = ((ibg)o).A;
        final pc7 v = pc7.v;
        aof aof = null;
        ApiResult apiResult2 = null;
        Label_0375: {
            Object x2 = null;
            Label_0364: {
                lta w2 = null;
                Label_0294: {
                    lta lta2;
                    lta w3;
                    if (a2 != 0) {
                        Label_0145: {
                            if (a2 != 1) {
                                Label_0384: {
                                    if (a2 != 2) {
                                        if (a2 == 3) {
                                            w = (lta)((ibg)o).x;
                                            try {
                                                vt4.g0((Object)h07);
                                                break Label_0364;
                                            }
                                            finally {
                                                break Label_0384;
                                            }
                                        }
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    final Object x = ((ibg)o).x;
                                    w2 = ((ibg)o).w;
                                    w = (lta)x;
                                    try {
                                        vt4.g0((Object)h07);
                                        break Label_0294;
                                    }
                                    finally {
                                        break Label_0384;
                                    }
                                    break Label_0145;
                                }
                                ((aof)w).g((Object)null);
                            }
                        }
                        x2 = ((ibg)o).x;
                        w = ((ibg)o).w;
                        lta2 = (lta)((ibg)o).v;
                        vt4.g0((Object)h07);
                        w3 = w;
                    }
                    else {
                        vt4.g0((Object)h07);
                        ((ibg)o).v = (m6n)lta;
                        ((ibg)o).w = w;
                        final cof b = this.b;
                        ((ibg)o).x = (aof)b;
                        ((ibg)o).A = 1;
                        if (b.c((f07)o) == v) {
                            return v;
                        }
                        lta2 = lta;
                        x2 = b;
                        w3 = w;
                    }
                    ((ibg)o).v = null;
                    ((ibg)o).w = w3;
                    ((ibg)o).x = (aof)x2;
                    ((ibg)o).A = 2;
                    final Object b2 = lta2.b(o);
                    w2 = w3;
                    h07 = (h07)b2;
                    if (b2 == v) {
                        return v;
                    }
                }
                final ApiResult apiResult = (ApiResult)h07;
                aof = (aof)x2;
                if ((apiResult2 = apiResult) != null) {
                    break Label_0375;
                }
                ((ibg)o).v = null;
                ((ibg)o).w = null;
                ((ibg)o).x = (aof)x2;
                ((ibg)o).A = 3;
                h07 = (h07)this.c(w2, (h07)o);
                if (h07 != v) {
                    break Label_0364;
                }
                return v;
            }
            apiResult2 = (ApiResult)h07;
            aof = (aof)x2;
        }
        aof.g((Object)null);
        return apiResult2;
    }
    
    public final Object b(long v, lta x, h07 x2) {
        jbg jbg2 = null;
        Label_0059: {
            if (x2 instanceof jbg) {
                final jbg jbg = (jbg)x2;
                final int a = jbg.A;
                if ((a & Integer.MIN_VALUE) != 0x0) {
                    jbg.A = a + Integer.MIN_VALUE;
                    jbg2 = jbg;
                    break Label_0059;
                }
            }
            jbg2 = new jbg(this, x2);
        }
        final Object y = jbg2.y;
        final int a2 = jbg2.A;
        final pc7 v2 = pc7.v;
        Throwable t = null;
        Label_0336: {
            Object o;
            if (a2 != 0) {
                if (a2 != 1) {
                    if (a2 == 2) {
                        x2 = (h07)jbg2.x;
                        try {
                            vt4.g0(y);
                            break Label_0336;
                        }
                        finally {
                            x = x2;
                            final Object c;
                            t = (Throwable)c;
                            break Label_0336;
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v = jbg2.v;
                x = jbg2.x;
                final lta lta = (lta)jbg2.w;
                vt4.g0(y);
                o = lta;
            }
            else {
                vt4.g0(y);
                jbg2.w = (m6n)x;
                final cof b = this.b;
                jbg2.x = (aof)b;
                jbg2.v = v;
                jbg2.A = 1;
                if (b.c((f07)jbg2) == v2) {
                    return v2;
                }
                o = x;
                x = b;
            }
            try {
                final hbg c2 = this.c;
                Throwable t2 = null;
                Label_0361: {
                    if (c2 != null) {
                        if (c2.b == ((pn0)this.a.w.getValue()).h || SystemClock.elapsedRealtime() - c2.a < lz8.i(v)) {
                            t2 = null;
                            break Label_0361;
                        }
                    }
                    try {
                        jbg2.w = null;
                        jbg2.x = (aof)x;
                        jbg2.v = v;
                        jbg2.A = 2;
                        final Object c = this.c((lta)o, jbg2);
                        if (c == v2) {
                            return v2;
                        }
                        final ApiResult apiResult = (ApiResult)c;
                        break Label_0361;
                    }
                    finally {}
                }
                ((aof)x).g((Object)null);
                return t2;
            }
            finally {}
        }
        ((aof)x).g((Object)null);
        throw t;
    }
    
    public final Object c(final lta lta, final h07 h07) {
        kbg kbg2 = null;
        Label_0051: {
            if (h07 instanceof kbg) {
                final kbg kbg = (kbg)h07;
                final int y = kbg.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    kbg.y = y + Integer.MIN_VALUE;
                    kbg2 = kbg;
                    break Label_0051;
                }
            }
            kbg2 = new kbg(this, h07);
        }
        final Object w = kbg2.w;
        final int y2 = kbg2.y;
        int n;
        Object b;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n = kbg2.v;
            vt4.g0(w);
            b = w;
        }
        else {
            vt4.g0(w);
            n = ((pn0)this.a.w.getValue()).h;
            kbg2.v = n;
            kbg2.y = 1;
            b = lta.b((Object)kbg2);
            final pc7 v = pc7.v;
            if (b == v) {
                return v;
            }
        }
        final ApiResult apiResult = (ApiResult)b;
        if (apiResult != null) {
            if (apiResult instanceof qj0) {
                final qj0 qj0 = (qj0)apiResult;
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final Object c = new Object();
                ((hbg)c).b = n;
                ((hbg)c).a = elapsedRealtime;
                this.c = (hbg)c;
                return apiResult;
            }
            if (apiResult instanceof pj0) {
                return apiResult;
            }
        }
        en9.r();
        return null;
    }
}
