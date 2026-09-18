import java.util.Map;

public final class q3d extends hgf implements a0d
{
    public static final o3d N;
    public r3d J;
    public v2b K;
    public boolean L;
    public zhg M;
    
    static {
        N = (o3d)new Object();
    }
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final o8h u = goe.u(n);
        return ooe.Y(u.v, u.w, (Map)s89.v, (lta)new t40(u, (byte)4));
    }
    
    public final boolean o1(final m3d m3d, final int n) {
        if (!okq.d(n, 5) && !okq.d(n, 6)) {
            if (!okq.d(n, 3) && !okq.d(n, 4)) {
                if (!okq.d(n, 1)) {
                    if (!okq.d(n, 2)) {
                        en9.q("Lazy list does not support beyond bounds layout for the specified direction");
                        return false;
                    }
                }
            }
            else if (this.M == zhg.v) {
                return false;
            }
        }
        else if (this.M == zhg.w) {
            return false;
        }
        if (this.p1(n)) {
            if (m3d.b >= this.J.a() - 1) {
                return false;
            }
        }
        else if (m3d.a <= 0) {
            return false;
        }
        return true;
    }
    
    public final boolean p1(int n) {
        if (!okq.d(n, 1)) {
            if (!okq.d(n, 2)) {
                if (okq.d(n, 5)) {
                    return this.L;
                }
                if (!okq.d(n, 6)) {
                    if (okq.d(n, 3)) {
                        n = ((Enum)soh.L((t98)this).V).ordinal();
                        if (n == 0) {
                            return this.L;
                        }
                        if (n == 1) {
                            if (!this.L) {
                                return true;
                            }
                            return false;
                        }
                        else {
                            en9.r();
                        }
                    }
                    else if (okq.d(n, 4)) {
                        n = ((Enum)soh.L((t98)this).V).ordinal();
                        if (n != 0) {
                            if (n == 1) {
                                return this.L;
                            }
                            en9.r();
                        }
                        else {
                            if (!this.L) {
                                return true;
                            }
                            return false;
                        }
                    }
                    else {
                        en9.q("Lazy list does not support beyond bounds layout for the specified direction");
                    }
                    return false;
                }
                if (this.L) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
