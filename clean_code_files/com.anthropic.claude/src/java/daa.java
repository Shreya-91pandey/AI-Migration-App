import java.io.IOException;
import java.io.Closeable;

public final class daa
{
    public final b03 a;
    
    public daa(final b03 a) {
        final d58 w = d58.w;
        this.a = a;
    }
    
    public final Object a(long n, h07 v, final String s) {
        Object o = null;
        Label_0052: {
            if (v instanceof caa) {
                o = v;
                final int z = ((caa)o).z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    ((caa)o).z = z + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            o = new caa(this, v);
        }
        Object o2 = ((caa)o).x;
        final int z2 = ((caa)o).z;
        final pc7 v2 = pc7.v;
        Label_0133: {
            if (z2 == 0) {
                break Label_0133;
            }
            Label_0118: {
                if (z2 == 1) {
                    break Label_0118;
                }
                Label_0111: {
                    if (z2 != 2) {
                        break Label_0111;
                    }
                    Closeable v3 = (Closeable)(v = (h07)((caa)o).v);
                    Label_0350: {
                        try {
                            vt4.g0(o2);
                            break Label_0350;
                        }
                        finally {
                            Label_0369: {
                                break Label_0369;
                                n = ((caa)o).w;
                                try {
                                    vt4.g0(o2);
                                    Label_0211: {
                                        v3 = (Closeable)o2;
                                    }
                                    final snj snj = (snj)v3;
                                    if (!snj.K) {
                                        final x9a x9a = new x9a(snj.y);
                                        zn2.r(v3, (Throwable)null);
                                        return x9a;
                                    }
                                    final d58 w = d58.w;
                                    final ju1 ju1 = new ju1(snj, n, (f07)null);
                                    ((caa)o).v = v3;
                                    ((caa)o).w = (int)n;
                                    ((caa)o).z = 2;
                                    if ((o2 = rhc.f0((hc7)w, (zta)ju1, (f07)o)) != v2) {
                                        final baa baa = (baa)o2;
                                        zn2.r(v3, (Throwable)null);
                                        return baa;
                                    }
                                    return v2;
                                    try {}
                                    finally {
                                        zn2.r((Closeable)v, (Throwable)s);
                                    }
                                    vt4.g0(o2);
                                    final b03 a = this.a;
                                    final rej rej = new rej();
                                    rej.e(s);
                                    final dti a2 = a.a(new sej(rej));
                                    ((caa)o).w = (int)n;
                                    ((caa)o).z = 1;
                                    iftrue(Label_0211:)((o2 = l3r.e(a2, (h07)o)) != v2);
                                }
                                catch (final IOException ex) {
                                    return new y9a(ex);
                                }
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
            }
        }
    }
}
