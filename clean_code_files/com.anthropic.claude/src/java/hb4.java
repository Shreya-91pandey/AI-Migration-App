import io.sentry.v4;
import io.sentry.g;
import com.anthropic.claude.core.logging.EmptyDestination;

public final class hb4 implements jja
{
    public final byte v;
    public final Object w;
    public final Object x;
    
    public hb4(final hjn x, final oc7 w) {
        this.v = 8;
        this.x = x;
        this.w = w;
    }
    
    public hb4(final kd w, final Object x, final oyk oyk) {
        this.v = 6;
        this.w = w;
        this.x = x;
    }
    
    public final Object l(Object o, final f07 f07) {
        final byte v = this.v;
        Object v2 = pc7.v;
        int i = 0;
        int j = 0;
        Object a = lqo.a;
        final Object x = this.x;
        final Object w = this.w;
        switch (v) {
            default: {
                ((j8g)w).a((v5q)x, (mv6)o);
                return a;
            }
            case 10: {
                o.getClass();
                rhc.G((oc7)((tvj)w).v, (hc7)null, 0, (zta)new v8n((byte)12, (f07)null, (Object)x), 3);
                return a;
            }
            case 9: {
                final Boolean b = (Boolean)o;
                ((x3j)w).v = b;
                ((fd0)((gfk)x).v).b((Object)b);
                return a;
            }
            case 8: {
                final l6g l6g = (l6g)o;
                final long a2 = l6g.a;
                final hjn hjn = (hjn)x;
                final id0 q = hjn.Q;
                if ((((l6g)q.e()).a & 0x7FFFFFFF7FFFFFFFL) != 0x7FC000007FC00000L && (a2 & 0x7FFFFFFF7FFFFFFFL) != 0x7FC000007FC00000L && Float.intBitsToFloat((int)(((l6g)q.e()).a & 0xFFFFFFFFL)) != Float.intBitsToFloat((int)(0xFFFFFFFFL & a2))) {
                    rhc.G((oc7)w, (hc7)null, 0, (zta)new tc0((Object)hjn, a2, (f07)null, (byte)2), 3);
                }
                else {
                    o = q.g(f07, (Object)l6g);
                    if (o == v2) {
                        a = o;
                    }
                }
                return a;
            }
            case 7: {
                Object o2 = null;
                Label_0392: {
                    if (f07 instanceof jum) {
                        final jum jum = (jum)f07;
                        final int w2 = jum.w;
                        if ((w2 & Integer.MIN_VALUE) != 0x0) {
                            jum.w = w2 + Integer.MIN_VALUE;
                            o2 = jum;
                            break Label_0392;
                        }
                    }
                    o2 = new jum(this, f07);
                }
                final Object v3 = ((jum)o2).v;
                final int w3 = ((jum)o2).w;
                if (w3 != 0) {
                    if (w3 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v2 = null;
                        return v2;
                    }
                    vt4.g0(v3);
                }
                else {
                    vt4.g0(v3);
                    final jja jja = (jja)w;
                    if (((lum)x).a((wqh)o) != null) {
                        ((jum)o2).w = 1;
                        if (jja.l(o, (f07)o2) == v2) {
                            return v2;
                        }
                    }
                }
                v2 = a;
                return v2;
            }
            case 6: {
                final vqd vqd = (vqd)o;
                final kd kd = (kd)w;
                if (vqd instanceof EmptyDestination) {
                    kd.d(x, (jd)null);
                }
                else {
                    final String concat = "\ud83d\udccd To ".concat(uoo.S(vqd));
                    final g g = new g();
                    g.z = "navigation";
                    g.B = "navigation";
                    g.y = concat;
                    v4.f().r(g);
                    final tqd l = uqd.l;
                    kd.d(x, x90.H(vqd));
                }
                return a;
            }
            case 5: {
                final eic eic = (eic)o;
                final ted ted = (ted)x;
                final emf emf = (emf)w;
                if (!(eic instanceof wmb) && !(eic instanceof gma) && !(eic instanceof vlh)) {
                    if (eic instanceof xmb) {
                        emf.k((Object)((xmb)eic).a());
                    }
                    else if (eic instanceof hma) {
                        emf.k((Object)((hma)eic).a());
                    }
                    else if (eic instanceof wlh) {
                        emf.k((Object)((wlh)eic).a());
                    }
                    else if (eic instanceof ulh) {
                        emf.k((Object)((ulh)eic).a());
                    }
                }
                else {
                    emf.b((Object)eic);
                }
                final Object[] a3 = emf.a;
                final int b2 = emf.b;
                int n = 0;
                while (j < b2) {
                    final eic eic2 = (eic)a3[j];
                    int n2;
                    if (eic2 instanceof wmb) {
                        ted.getClass();
                        n2 = (n | 0x2);
                    }
                    else if (eic2 instanceof gma) {
                        ted.getClass();
                        n2 = (n | 0x1);
                    }
                    else {
                        n2 = n;
                        if (eic2 instanceof vlh) {
                            ted.getClass();
                            n2 = (n | 0x4);
                        }
                    }
                    ++j;
                    n = n2;
                }
                ted.b.i(n);
                return a;
            }
            case 4: {
                Object o3 = null;
                Label_0895: {
                    if (f07 instanceof bka) {
                        final bka bka = (bka)f07;
                        final int x2 = bka.x;
                        if ((x2 & Integer.MIN_VALUE) != 0x0) {
                            bka.x = x2 + Integer.MIN_VALUE;
                            o3 = bka;
                            break Label_0895;
                        }
                    }
                    o3 = new bka(this, f07);
                }
                final Object v4 = ((bka)o3).v;
                final int x3 = ((bka)o3).x;
                if (x3 != 0) {
                    if (x3 != 1) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v2 = null;
                        return v2;
                    }
                    vt4.g0(v4);
                }
                else {
                    vt4.g0(v4);
                    final z3j z3j = (z3j)w;
                    final int v5 = z3j.v;
                    if (v5 >= 1) {
                        final jja jja2 = (jja)x;
                        ((bka)o3).x = 1;
                        if (jja2.l(o, (f07)o3) == v2) {
                            return v2;
                        }
                    }
                    else {
                        z3j.v = v5 + 1;
                    }
                }
                v2 = a;
                return v2;
            }
            case 3: {
                Object o4 = null;
                Label_1055: {
                    if (f07 instanceof zja) {
                        final zja zja = (zja)f07;
                        final int x4 = zja.x;
                        if ((x4 & Integer.MIN_VALUE) != 0x0) {
                            zja.x = x4 + Integer.MIN_VALUE;
                            o4 = zja;
                            break Label_1055;
                        }
                    }
                    o4 = new zja(this, f07);
                }
                final Object v6 = ((zja)o4).v;
                final int x5 = ((zja)o4).x;
                if (x5 != 0) {
                    Label_1087: {
                        if (x5 == 1) {
                            Label_1141: {
                                try {
                                    vt4.g0(v6);
                                    return a;
                                }
                                finally {
                                    break Label_1141;
                                }
                                break Label_1087;
                            }
                            final Throwable v7;
                            ((b4j)x).v = v7;
                        }
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    v2 = null;
                    return v2;
                }
                vt4.g0(v6);
                final jja jja3 = (jja)w;
                ((zja)o4).x = 1;
                o = jja3.l(o, (f07)o4);
                if (o == v2) {
                    return v2;
                }
                v2 = a;
                return v2;
            }
            case 2: {
                Object o5 = null;
                Label_1203: {
                    if (f07 instanceof e67) {
                        final e67 e67 = (e67)f07;
                        final int w4 = e67.w;
                        if ((w4 & Integer.MIN_VALUE) != 0x0) {
                            e67.w = w4 + Integer.MIN_VALUE;
                            o5 = e67;
                            break Label_1203;
                        }
                    }
                    o5 = new e67(this, f07);
                }
                final Object v8 = ((e67)o5).v;
                final int w5 = ((e67)o5).w;
                jja x7;
                if (w5 != 0) {
                    if (w5 != 1) {
                        if (w5 == 2) {
                            vt4.g0(v8);
                            return a;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v2 = null;
                        return v2;
                    }
                    else {
                        final jja x6 = ((e67)o5).x;
                        vt4.g0(v8);
                        o = v8;
                        x7 = x6;
                    }
                }
                else {
                    vt4.g0(v8);
                    x7 = (jja)w;
                    final m6m m6m = (m6m)o;
                    final g67 g2 = (g67)x;
                    ((e67)o5).x = x7;
                    ((e67)o5).w = 1;
                    o = g2.e(m6m, (h07)o5);
                    if (o == v2) {
                        return v2;
                    }
                }
                ((e67)o5).x = null;
                ((e67)o5).w = 2;
                if (x7.l(o, (f07)o5) == v2) {
                    return v2;
                }
                v2 = a;
                return v2;
            }
            case 1: {
                final yog yog = (yog)o;
                final int intValue = ((Number)yog.v).intValue();
                final k57 k57 = (k57)yog.w;
                final z3j z3j2 = (z3j)w;
                final int v9 = z3j2.v;
                final r27 r27 = (r27)x;
                while (i < intValue - v9) {
                    r27.k(new cdo[] { fkq.G(r27.g, (l7f)null, k57) });
                    ++i;
                }
                z3j2.v = intValue;
                return a;
            }
            case 0: {
                o.getClass();
                rhc.G((oc7)w, (hc7)null, 0, (zta)new na4((oc4)x, (f07)null, (byte)2), 3);
                return a;
            }
        }
    }
}
