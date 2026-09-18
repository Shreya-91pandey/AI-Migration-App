public final class sf0 extends m6n implements zta
{
    public final Object A;
    public final byte w;
    public boolean x;
    public final boolean y;
    public final Object z;
    
    public sf0(final rv7 a, final yci yci, final boolean y, final zta z, final f07 f07) {
        this.w = 3;
        this.A = a;
        this.y = y;
        this.z = z;
        super(2, f07);
    }
    
    public final f07 create(Object z, final f07 f07) {
        final byte w = this.w;
        z = this.z;
        final Object a = this.A;
        switch (w) {
            default: {
                return (f07)new sf0((rv7)a, null, this.y, (zta)z, f07);
            }
            case 2: {
                return (f07)new sf0(this.y, a, z, f07, (byte)2);
            }
            case 1: {
                return (f07)new sf0(this.y, a, z, f07, (byte)1);
            }
            case 0: {
                return (f07)new sf0(this.y, a, z, f07, (byte)0);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final oc7 oc7 = (oc7)o;
        final f07 f07 = (f07)o2;
        switch (w) {
            default: {
                return ((sf0)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 2: {
                return ((sf0)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 1: {
                return ((sf0)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((sf0)this.create(oc7, f07)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object r) {
        final byte w = this.w;
        Object a = lqo.a;
        final Object z = this.z;
        final boolean y = this.y;
        final pc7 v = pc7.v;
        final Object a2 = this.A;
        switch (w) {
            default: {
                final rv7 rv7 = (rv7)a2;
                final boolean x = this.x;
                if (x) {
                    if (x) {
                        vt4.g0(r);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        r = null;
                    }
                }
                else {
                    vt4.g0(r);
                    final lv7 lv7 = new lv7(y, rv7, (zta)z, null);
                    this.x = true;
                    if ((r = zn2.R("DataStore.readDataOrHandleCorruption", (yci)null, (lta)lv7, (h07)this)) == v) {
                        r = v;
                    }
                }
                return r;
            }
            case 2: {
                final boolean x2 = this.x;
                Object o;
                if (x2) {
                    if (x2) {
                        throw ge9.w(r);
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    o = null;
                }
                else {
                    vt4.g0(r);
                    o = a;
                    if (((xom)a2).getValue() != null) {
                        o = a;
                        if (y) {
                            final bsl e = jr6.e;
                            final ssi o2 = clq.o();
                            final x5 x3 = new x5((Object)z, (byte)19);
                            this.x = true;
                            o2.v.a((jja)x3, (f07)this);
                            o = v;
                        }
                    }
                }
                return o;
            }
            case 1: {
                final boolean x4 = this.x;
                if (x4) {
                    if (x4) {
                        vt4.g0(r);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(r);
                    if (y) {
                        final m22 m22 = new m22((Object)new wja((ija)ljq.a0((jta)new r94((v5d)a2, (byte)1)), (zta)new r31((byte)6), (byte)1), (byte)1);
                        final n52 n52 = new n52((jta)z, (byte)1);
                        this.x = true;
                        if (m22.a((jja)n52, (f07)this) == v) {
                            a = v;
                        }
                    }
                }
                return a;
            }
            case 0: {
                final boolean x5 = this.x;
                if (x5) {
                    if (!x5) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(r);
                }
                else {
                    vt4.g0(r);
                    if (!y) {
                        return a;
                    }
                    if (a2 == null) {
                        this.x = true;
                        if (ach.A(2500L, (f07)this) == v) {
                            a = v;
                            return a;
                        }
                    }
                }
                ((jta)z).a();
                return a;
            }
        }
    }
}
