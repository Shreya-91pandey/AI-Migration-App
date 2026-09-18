import java.util.concurrent.atomic.AtomicBoolean;

public final class v94 extends m6n implements zta
{
    public Object A;
    public Object B;
    public final Object C;
    public final Object D;
    public final byte w;
    public byte x;
    public final boolean y;
    public final boolean z;
    
    public v94(final f07 f07, final zta d, final quj c, final boolean y, final boolean z) {
        this.w = 1;
        this.y = y;
        this.z = z;
        this.C = c;
        this.D = d;
        super(2, f07);
    }
    
    public v94(final boolean y, final boolean z, final jta a, final bnf b, final v5d c, final xom d, final f07 f07) {
        this.w = 0;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        super(2, f07);
    }
    
    public final f07 create(final Object b, final f07 f07) {
        final byte w = this.w;
        final Object d = this.D;
        final Object c = this.C;
        switch (w) {
            default: {
                final v94 v94 = new v94(f07, (zta)d, (quj)c, this.y, this.z);
                v94.B = b;
                return (f07)v94;
            }
            case 0: {
                return (f07)new v94(this.y, this.z, (jta)this.A, (bnf)this.B, (v5d)c, (xom)d, f07);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                return ((v94)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((v94)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object b) {
        final byte w = this.w;
        Object a = lqo.a;
        final boolean y = this.y;
        final Object v = pc7.v;
        final boolean z = this.z;
        final Object c = this.C;
        final Object d = this.D;
        switch (w) {
            default: {
                final zta zta = (zta)d;
                final quj quj = (quj)c;
                final byte x = this.x;
                Object b3 = null;
                Object a4 = null;
                Label_0512: {
                    deo deo = null;
                    Label_0472: {
                        Object b5 = null;
                        beo beo3 = null;
                        Label_0415: {
                            Object b2 = null;
                            beo a3 = null;
                            Label_0392: {
                                Object a2 = null;
                                Label_0306: {
                                    if (x != 0) {
                                        if (x == 1) {
                                            final beo beo = (beo)this.A;
                                            b2 = this.B;
                                            vt4.g0(b);
                                            a2 = b;
                                            a3 = beo;
                                            break Label_0306;
                                        }
                                        if (x == 2) {
                                            final beo beo2 = (beo)this.A;
                                            b2 = this.B;
                                            vt4.g0(b);
                                            a3 = beo2;
                                            break Label_0392;
                                        }
                                        if (x == 3) {
                                            deo = (deo)this.B;
                                            vt4.g0(b);
                                            b3 = b;
                                            break Label_0472;
                                        }
                                        if (x == 4) {
                                            b3 = this.B;
                                            vt4.g0(b);
                                            a4 = b;
                                            break Label_0512;
                                        }
                                        if (x == 5) {
                                            vt4.g0(b);
                                            return b;
                                        }
                                        en9.q("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    else {
                                        vt4.g0(b);
                                        final deo b4 = (deo)this.B;
                                        if (y) {
                                            beo a5;
                                            if (z) {
                                                a5 = beo.v;
                                            }
                                            else {
                                                a5 = beo.w;
                                            }
                                            b5 = b4;
                                            beo3 = a5;
                                            if (z) {
                                                break Label_0415;
                                            }
                                            this.B = b4;
                                            this.A = a5;
                                            this.x = 1;
                                            a2 = b4.a((f07)this);
                                            if (a2 == v) {
                                                return v;
                                            }
                                            a3 = a5;
                                            b2 = b4;
                                            break Label_0306;
                                        }
                                        else {
                                            b4.getClass();
                                            final spi spi = (spi)b4;
                                            final xs7 xs7 = new xs7(zta, (f07)null, (byte)0);
                                            this.x = 5;
                                            b = spi.b(xs7, (f07)this);
                                            if (b == v) {
                                                return v;
                                            }
                                            return b;
                                        }
                                    }
                                    b = null;
                                    return b;
                                }
                                if (a2) {
                                    beo3 = a3;
                                    b5 = b2;
                                    break Label_0415;
                                }
                                final emc e = quj.e();
                                this.B = b2;
                                this.A = a3;
                                this.x = 2;
                                if (((AtomicBoolean)e.a.e.z).get()) {
                                    en9.q("Database is closed");
                                    return null;
                                }
                                final Object g = e.b.g((h07)this);
                                if (g == v) {
                                    a = g;
                                }
                                if (a == v) {
                                    return v;
                                }
                            }
                            beo3 = a3;
                            b5 = b2;
                        }
                        final xs7 xs8 = new xs7((f07)null, zta);
                        this.B = b5;
                        this.A = null;
                        this.x = 3;
                        final Object d2 = ((deo)b5).d(beo3, (zta)xs8, (f07)this);
                        deo = (deo)b5;
                        if ((b3 = d2) == v) {
                            return v;
                        }
                    }
                    b = b3;
                    if (z) {
                        return b;
                    }
                    this.B = b3;
                    this.x = 4;
                    if ((a4 = deo.a((f07)this)) == v) {
                        return v;
                    }
                }
                b = b3;
                if (!(boolean)a4) {
                    quj.e().b();
                    b = b3;
                    return b;
                }
                return b;
                b = v;
                return b;
            }
            case 0: {
                final v5d v5d = (v5d)c;
                final byte x2 = this.x;
                if (x2 != 0) {
                    if (x2 != 1) {
                        if (x2 == 2) {
                            vt4.g0(b);
                            return a;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    else {
                        vt4.g0(b);
                    }
                }
                else {
                    vt4.g0(b);
                    if (!y) {
                        return a;
                    }
                    if (z) {
                        ((jta)this.A).a();
                        return a;
                    }
                    if (!(boolean)((xom)d).getValue()) {
                        ((bnf)this.B).setValue((Object)new qs8(0.0f));
                        return a;
                    }
                    this.x = 1;
                    if (th4.j(v5d, (f07)this) == v) {
                        return v;
                    }
                }
                final q52 q52 = new q52(ljq.a0((jta)new r94(v5d, (byte)0)), (byte)2);
                final s94 s94 = new s94(v5d, (byte)0);
                this.x = 2;
                Object o = a;
                if (q52.a((jja)s94, (f07)this) != v) {
                    return o;
                }
                o = v;
                return o;
            }
        }
    }
}
