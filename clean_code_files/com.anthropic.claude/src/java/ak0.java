import com.anthropic.claude.api.result.RetryBudgetExceededException;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.result.RetryAttemptTimeoutException;

public abstract class ak0
{
    public static final sr1 a;
    
    static {
        a = new sr1(500L, 6);
    }
    
    public static final String a(final pj0 pj0) {
        final int y = tj0.y(pj0);
        if (y == 0) {
            return smk.p(((nj0)pj0).a(), "http_");
        }
        if (y == 1) {
            String c;
            if ((c = v4j.a((Class)((oj0)pj0).a().getClass()).c()) == null) {
                c = "exception";
            }
            return c;
        }
        en9.r();
        return null;
    }
    
    public static final boolean b(final pj0 pj0) {
        return pj0 instanceof oj0 && ssf.e(((oj0)pj0).a());
    }
    
    public static final boolean c(final pj0 pj0) {
        return pj0 instanceof nj0 && ((nj0)pj0).a() == 404;
    }
    
    public static final boolean d(final pj0 pj0, final lta lta) {
        final int z = tj0.z((Object)pj0);
        if (z == 0) {
            final nj0 nj0 = (nj0)pj0;
            return nj0.a() == 408 || nj0.a() >= 500;
        }
        if (z == 1) {
            return (boolean)lta.b((Object)((oj0)pj0).a());
        }
        en9.r();
        return false;
    }
    
    public static final Object e(int n, ur1 ur1, final lta a, final Long b, final hoi hoi, zta d, final lta lta, final h07 h07) {
        lta e = lta;
        uj0 uj0 = null;
        Label_0057: {
            if (h07 instanceof uj0) {
                uj0 = (uj0)h07;
                final int k = uj0.K;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    uj0.K = k + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            uj0 = new uj0(h07);
        }
        final Object j = uj0.J;
        final int i = uj0.K;
        final pc7 v = pc7.v;
        while (true) {
            hoi c = null;
            Long b2 = null;
            lta a3 = null;
            b4j h8 = null;
            b4j f2 = null;
            lta e3 = null;
            ur1 z2 = null;
            Object f3 = null;
            Label_0919: {
                long n2 = 0L;
                int n3 = 0;
                Object g = null;
                b4j f = null;
                lta e2 = null;
                ur1 z = null;
                int n4 = 0;
                int x2 = 0;
                Label_0777: {
                    b4j e4;
                    hoi c2;
                    Long b3;
                    lta a5;
                    Object f5;
                    b4j f6;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                n2 = uj0.I;
                                final int y = uj0.y;
                                final int x = uj0.x;
                                n = uj0.w;
                                n3 = uj0.v;
                                g = uj0.G;
                                f = uj0.F;
                                e2 = uj0.E;
                                d = uj0.D;
                                c = uj0.C;
                                b2 = uj0.B;
                                final lta a2 = uj0.A;
                                z = uj0.z;
                                vt4.g0(j);
                                a3 = a2;
                                n4 = y;
                                x2 = x;
                                break Label_0777;
                            }
                            if (i == 3) {
                                n = uj0.w;
                                n3 = uj0.v;
                                h8 = uj0.H;
                                final pj0 pj0 = (pj0)uj0.G;
                                f2 = uj0.F;
                                e3 = uj0.E;
                                d = uj0.D;
                                c = uj0.C;
                                b2 = uj0.B;
                                final lta a4 = uj0.A;
                                z2 = uj0.z;
                                vt4.g0(j);
                                f3 = j;
                                a3 = a4;
                                break Label_0919;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        else {
                            n3 = uj0.v;
                            e4 = (b4j)uj0.G;
                            final b4j f4 = uj0.F;
                            e = uj0.E;
                            d = uj0.D;
                            c2 = uj0.C;
                            b3 = uj0.B;
                            a5 = uj0.A;
                            final ur1 z3 = uj0.z;
                            vt4.g0(j);
                            f5 = j;
                            f6 = f4;
                            ur1 = z3;
                        }
                    }
                    else {
                        e4 = hia.e(j);
                        uj0.z = ur1;
                        uj0.A = a;
                        uj0.B = b;
                        c2 = hoi;
                        uj0.C = c2;
                        uj0.D = d;
                        uj0.E = e;
                        uj0.F = e4;
                        uj0.G = e4;
                        uj0.v = n;
                        uj0.K = 1;
                        f5 = f(b, e, (h07)uj0);
                        if (f5 == v) {
                            return v;
                        }
                        f6 = e4;
                        a5 = a;
                        n3 = n;
                        b3 = b;
                    }
                    e4.v = f5;
                    n = 0;
                    if (n >= n3) {
                        return f6.v;
                    }
                    final Object v2 = f6.v;
                    if (v2 instanceof pj0) {
                        g = v2;
                    }
                    else {
                        g = null;
                    }
                    if (g == null) {
                        return v2;
                    }
                    oj0 oj0;
                    if (g instanceof oj0) {
                        oj0 = (oj0)g;
                    }
                    else {
                        oj0 = null;
                    }
                    Throwable a6;
                    if (oj0 != null) {
                        a6 = oj0.a();
                    }
                    else {
                        a6 = null;
                    }
                    n4 = ((a6 instanceof RetryAttemptTimeoutException) ? 1 : 0);
                    if (n4 == 0 && !(boolean)a5.b(g)) {
                        return f6.v;
                    }
                    final long n5 = n2 = ur1.a(n);
                    if (c2 != null) {
                        n2 = n5;
                        if (n5 > 0L) {
                            final long n6 = n5 / 2L;
                            n2 = c2.k(n6 + 1L) + n6;
                        }
                    }
                    x90.u(((f07)uj0).getContext());
                    uj0.z = ur1;
                    uj0.A = a5;
                    uj0.B = b3;
                    uj0.C = c2;
                    uj0.D = d;
                    uj0.E = e;
                    uj0.F = f6;
                    uj0.G = g;
                    uj0.H = null;
                    uj0.v = n3;
                    uj0.w = n;
                    uj0.x = n;
                    uj0.y = n4;
                    uj0.I = n2;
                    uj0.K = 2;
                    if (ach.A(n2, (f07)uj0) == v) {
                        return v;
                    }
                    final lta lta2 = e;
                    final b4j b4j = f6;
                    final int n7 = n;
                    a3 = a5;
                    z = ur1;
                    b2 = b3;
                    c = c2;
                    e2 = lta2;
                    x2 = n;
                    f = b4j;
                    n = n7;
                }
                d.d((Object)new Integer(x2 + 1), g);
                uj0.z = z;
                uj0.A = a3;
                uj0.B = b2;
                uj0.C = c;
                uj0.D = d;
                uj0.E = e2;
                uj0.F = f;
                uj0.G = null;
                uj0.H = f;
                uj0.v = n3;
                uj0.w = n;
                uj0.x = x2;
                uj0.y = n4;
                uj0.I = n2;
                uj0.K = 3;
                f3 = f(b2, e2, (h07)uj0);
                if (f3 != v) {
                    final lta lta3 = e2;
                    h8 = f;
                    z2 = z;
                    f2 = f;
                    e3 = lta3;
                    break Label_0919;
                }
                return v;
            }
            h8.v = f3;
            ++n;
            final b4j b4j2 = f2;
            final hoi hoi2 = c;
            Long b3 = b2;
            final ur1 ur2 = z2;
            lta a5 = a3;
            e = e3;
            b4j f6 = b4j2;
            hoi c2 = hoi2;
            ur1 = ur2;
            continue;
        }
    }
    
    public static final Object f(Long v, final lta lta, final h07 h07) {
        vj0 vj2 = null;
        Label_0050: {
            if (h07 instanceof vj0) {
                final vj0 vj0 = (vj0)h07;
                final int x = vj0.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    vj0.x = x + Integer.MIN_VALUE;
                    vj2 = vj0;
                    break Label_0050;
                }
            }
            vj2 = new vj0(h07);
        }
        Object o = vj2.w;
        final int x2 = vj2.x;
        Label_0198: {
            if (x2 == 0) {
                vt4.g0(o);
                final pc7 v2 = pc7.v;
                if (v == null) {
                    vj2.v = null;
                    vj2.x = 1;
                    final Object b = lta.b((Object)vj2);
                    if (b != v2) {
                        return b;
                    }
                }
                else {
                    final long longValue = v;
                    final wj0 wj0 = new wj0(lta, (f07)null, (byte)0);
                    vj2.v = v;
                    vj2.x = 2;
                    o = r6k.j0(longValue, (zta)wj0, (f07)vj2);
                    if (o != v2) {
                        break Label_0198;
                    }
                }
                return v2;
            }
            Object b;
            if (x2 != 1) {
                if (x2 == 2) {
                    v = vj2.v;
                    vt4.g0(o);
                    break Label_0198;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                vt4.g0(o);
                b = o;
            }
            return b;
        }
        final ApiResult<?> apiResult = (ApiResult<?>)o;
        if (apiResult == null) {
            return new oj0((Throwable)new RetryAttemptTimeoutException((long)v));
        }
        return apiResult;
    }
    
    public static final Object g(final ApiResult apiResult) {
        if (apiResult instanceof qj0) {
            return ((qj0)apiResult).b;
        }
        if (apiResult instanceof pj0) {
            return null;
        }
        en9.r();
        return null;
    }
    
    public static final Throwable h(final pj0 pj0) {
        oj0 oj0;
        if (pj0 instanceof oj0) {
            oj0 = (oj0)pj0;
        }
        else {
            oj0 = null;
        }
        if (oj0 != null) {
            return oj0.a();
        }
        return null;
    }
    
    public static final Object i(final int n, final ur1 ur1, final lta lta, final Long n2, final Long v, final hoi hoi, final zta zta, final lta lta2, final h07 h07) {
        while (true) {
            Label_0047: {
                if (!(h07 instanceof xj0)) {
                    break Label_0047;
                }
                final xj0 xj0 = (xj0)h07;
                final int x = xj0.x;
                if ((x & Integer.MIN_VALUE) == 0x0) {
                    break Label_0047;
                }
                xj0.x = x + Integer.MIN_VALUE;
                final xj0 xj2 = xj0;
                final Object w = xj2.w;
                final int x2 = xj2.x;
                Object j0 = null;
                Long v3 = null;
                Label_0238: {
                    if (x2 == 0) {
                        vt4.g0(w);
                        final pc7 v2 = pc7.v;
                        if (v == null) {
                            xj2.v = null;
                            xj2.x = 1;
                            final Object e = e(n, ur1, lta, n2, hoi, zta, lta2, (h07)xj2);
                            if (e != v2) {
                                return e;
                            }
                        }
                        else {
                            final long longValue = v;
                            final yj0 yj0 = new yj0(n, ur1, lta, n2, hoi, zta, lta2, (f07)null);
                            xj2.v = v;
                            xj2.x = 2;
                            j0 = r6k.j0(longValue, (zta)yj0, (f07)xj2);
                            if (j0 != v2) {
                                v3 = v;
                                break Label_0238;
                            }
                        }
                        return v2;
                    }
                    if (x2 == 1) {
                        vt4.g0(w);
                        return w;
                    }
                    if (x2 != 2) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v3 = xj2.v;
                    vt4.g0(w);
                    j0 = w;
                }
                final ApiResult apiResult = (ApiResult)j0;
                if (apiResult == null) {
                    return new oj0((Throwable)new RetryBudgetExceededException((long)v3));
                }
                return apiResult;
            }
            final xj0 xj2 = new xj0(h07);
            continue;
        }
    }
}
