public final class nv7 extends m6n implements lta
{
    public final hc7 A;
    public final zta B;
    public ot7 w;
    public Object x;
    public byte y;
    public final rv7 z;
    
    public nv7(final rv7 z, final hc7 a, final zta b, final f07 f07) {
        this.z = z;
        this.A = a;
        this.B = b;
        super(1, f07);
    }
    
    public final Object b(final Object o) {
        return ((nv7)this.create((f07)o)).invokeSuspend(lqo.a);
    }
    
    public final f07 create(final f07 f07) {
        return (f07)new nv7(this.z, this.A, this.B, f07);
    }
    
    public final Object invokeSuspend(Object f) {
        final byte y = this.y;
        final rv7 z = this.z;
        final pc7 v = pc7.v;
        ot7 w = null;
        Label_0226: {
            while (true) {
                Label_0136: {
                    Object o;
                    ot7 ot7;
                    if (y != 0) {
                        if (y == 1) {
                            vt4.g0(f);
                            break Label_0136;
                        }
                        if (y != 2) {
                            if (y == 3) {
                                w = this.w;
                                vt4.g0(f);
                                break Label_0226;
                            }
                            if (y == 4) {
                                final Object x = this.x;
                                vt4.g0(f);
                                return x;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        else {
                            final ot7 w2 = this.w;
                            vt4.g0(f);
                            o = f;
                            ot7 = w2;
                        }
                    }
                    else {
                        vt4.g0(f);
                        final uu7 uu7 = new uu7(z, null, (byte)3);
                        this.y = 1;
                        if ((f = z.f(true, (zta)uu7, (h07)this)) == v) {
                            return v;
                        }
                        break Label_0136;
                    }
                    final o10 o2 = new o10(this.z, (yci)o, this.B, ot7, (f07)null);
                    this.w = ot7;
                    this.y = 3;
                    final Object f2 = rhc.f0(this.A, (zta)o2, (f07)this);
                    if (f2 == v) {
                        return v;
                    }
                    w = ot7;
                    f = f2;
                    break Label_0226;
                }
                ot7 ot7 = (ot7)f;
                z.getClass();
                this.w = ot7;
                this.y = 2;
                Object o = null;
                continue;
            }
        }
        final Object b = w.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        if (hashCode == w.c) {
            if (!mlc.q(w.b, f)) {
                this.w = null;
                this.x = f;
                this.y = 4;
                if (z.h(f, true, (h07)this) == v) {
                    return v;
                }
            }
            return f;
        }
        en9.q("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        return null;
    }
}
