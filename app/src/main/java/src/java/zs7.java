import androidx.work.impl.WorkDatabase;

public final class zs7 extends m6n implements zta
{
    public final boolean A;
    public final boolean B;
    public final WorkDatabase C;
    public final lta D;
    public final byte w;
    public ceo x;
    public byte y;
    public Object z;
    
    public final f07 create(final Object o, final f07 f07) {
        switch (this.w) {
            default: {
                final zs7 zs7 = new zs7(this.A, this.B, this.C, f07, this.D, (byte)1);
                zs7.z = o;
                return (f07)zs7;
            }
            case 0: {
                final zs7 zs8 = new zs7(this.A, this.B, this.C, f07, this.D, (byte)0);
                zs8.z = o;
                return (f07)zs8;
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final eeo eeo = (eeo)o;
        final f07 f07 = (f07)o2;
        switch (w) {
            default: {
                return ((zs7)this.create(eeo, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((zs7)this.create(eeo, f07)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        Object a = lqo.a;
        ceo w2 = ceo.w;
        final ceo v = ceo.v;
        final boolean a2 = this.A;
        final Object v2 = pc7.v;
        final boolean b = this.B;
        final WorkDatabase c = this.C;
        final lta d = this.D;
        switch (w) {
            default: {
                final byte y = this.y;
                Object z2 = null;
                Object a3 = null;
                Label_0461: {
                    eeo eeo = null;
                    Label_0420: {
                        Object z4 = null;
                        ceo ceo = null;
                        Label_0361: {
                            Object z = null;
                            ceo x2 = null;
                            Label_0346: {
                                Object a4;
                                if (y != 0) {
                                    if (y != 1) {
                                        if (y == 2) {
                                            final ceo x = this.x;
                                            z = this.z;
                                            vt4.g0(o);
                                            x2 = x;
                                            break Label_0346;
                                        }
                                        if (y == 3) {
                                            eeo = (eeo)this.z;
                                            vt4.g0(o);
                                            break Label_0420;
                                        }
                                        if (y == 4) {
                                            z2 = this.z;
                                            vt4.g0(o);
                                            a3 = o;
                                            break Label_0461;
                                        }
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                        o = null;
                                        return o;
                                    }
                                    else {
                                        final ceo x3 = this.x;
                                        z = this.z;
                                        vt4.g0(o);
                                        a4 = o;
                                        x2 = x3;
                                    }
                                }
                                else {
                                    vt4.g0(o);
                                    final eeo z3 = (eeo)this.z;
                                    if (!a2) {
                                        z3.getClass();
                                        o = d.b((Object)((tpi)z3).c());
                                        return o;
                                    }
                                    if (b) {
                                        w2 = v;
                                    }
                                    z4 = z3;
                                    ceo = w2;
                                    if (b) {
                                        break Label_0361;
                                    }
                                    this.z = z3;
                                    this.x = w2;
                                    this.y = 1;
                                    a4 = z3.a((f07)this);
                                    if (a4 == v2) {
                                        o = v2;
                                        return o;
                                    }
                                    x2 = w2;
                                    z = z3;
                                }
                                if (a4) {
                                    ceo = x2;
                                    z4 = z;
                                    break Label_0361;
                                }
                                final fmc g = c.g();
                                this.z = z;
                                this.x = x2;
                                this.y = 2;
                                final Object f = g.b.f((h07)this);
                                if (f == v2) {
                                    a = f;
                                }
                                if (a == v2) {
                                    o = v2;
                                    return o;
                                }
                            }
                            ceo = x2;
                            z4 = z;
                        }
                        final od3 od3 = new od3((f07)null, d);
                        this.z = z4;
                        this.x = null;
                        this.y = 3;
                        final Object d2 = ((eeo)z4).d(ceo, od3, (m6n)this);
                        eeo = (eeo)z4;
                        if ((o = d2) == v2) {
                            o = v2;
                            return o;
                        }
                    }
                    if (b) {
                        return o;
                    }
                    this.z = o;
                    this.y = 4;
                    a3 = eeo.a((f07)this);
                    if (a3 == v2) {
                        o = v2;
                        return o;
                    }
                    z2 = o;
                }
                o = z2;
                if (!(boolean)a3) {
                    final fmc g2 = c.g();
                    g2.b.c((jta)g2.e, (jta)g2.f);
                    o = z2;
                }
                return o;
            }
            case 0: {
                final byte y2 = this.y;
                Object z6 = null;
                Object a5 = null;
                Label_0924: {
                    eeo eeo2 = null;
                    Label_0883: {
                        Object z8 = null;
                        ceo ceo2 = null;
                        Label_0824: {
                            Object z5 = null;
                            ceo x5 = null;
                            Label_0809: {
                                Object a6;
                                if (y2 != 0) {
                                    if (y2 != 1) {
                                        if (y2 == 2) {
                                            final ceo x4 = this.x;
                                            z5 = this.z;
                                            vt4.g0(o);
                                            x5 = x4;
                                            break Label_0809;
                                        }
                                        if (y2 == 3) {
                                            eeo2 = (eeo)this.z;
                                            vt4.g0(o);
                                            break Label_0883;
                                        }
                                        if (y2 == 4) {
                                            z6 = this.z;
                                            vt4.g0(o);
                                            a5 = o;
                                            break Label_0924;
                                        }
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                        o = null;
                                        return o;
                                    }
                                    else {
                                        final ceo x6 = this.x;
                                        z5 = this.z;
                                        vt4.g0(o);
                                        a6 = o;
                                        x5 = x6;
                                    }
                                }
                                else {
                                    vt4.g0(o);
                                    final eeo z7 = (eeo)this.z;
                                    if (!a2) {
                                        z7.getClass();
                                        o = d.b((Object)((tpi)z7).c());
                                        return o;
                                    }
                                    if (b) {
                                        w2 = v;
                                    }
                                    z8 = z7;
                                    ceo2 = w2;
                                    if (b) {
                                        break Label_0824;
                                    }
                                    this.z = z7;
                                    this.x = w2;
                                    this.y = 1;
                                    a6 = z7.a((f07)this);
                                    if (a6 == v2) {
                                        o = v2;
                                        return o;
                                    }
                                    x5 = w2;
                                    z5 = z7;
                                }
                                if (a6) {
                                    ceo2 = x5;
                                    z8 = z5;
                                    break Label_0824;
                                }
                                final fmc g3 = c.g();
                                this.z = z5;
                                this.x = x5;
                                this.y = 2;
                                final Object f2 = g3.b.f((h07)this);
                                if (f2 == v2) {
                                    a = f2;
                                }
                                if (a == v2) {
                                    o = v2;
                                    return o;
                                }
                            }
                            ceo2 = x5;
                            z8 = z5;
                        }
                        final ys7 ys7 = new ys7(null, d);
                        this.z = z8;
                        this.x = null;
                        this.y = 3;
                        final Object d3 = ((eeo)z8).d(ceo2, ys7, (m6n)this);
                        eeo2 = (eeo)z8;
                        if ((o = d3) == v2) {
                            o = v2;
                            return o;
                        }
                    }
                    if (b) {
                        return o;
                    }
                    this.z = o;
                    this.y = 4;
                    a5 = eeo2.a((f07)this);
                    if (a5 == v2) {
                        o = v2;
                        return o;
                    }
                    z6 = o;
                }
                o = z6;
                if (!(boolean)a5) {
                    final fmc g4 = c.g();
                    g4.b.c((jta)g4.e, (jta)g4.f);
                    o = z6;
                }
                return o;
            }
        }
    }
}
