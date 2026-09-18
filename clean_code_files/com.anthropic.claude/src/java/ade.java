public final class ade extends m6n implements lta
{
    public final byte w;
    public byte x;
    public final Object y;
    
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final f07 f07 = (f07)o;
        switch (w) {
            default: {
                return ((ade)this.create(f07)).invokeSuspend(a);
            }
            case 0: {
                return ((ade)this.create(f07)).invokeSuspend(a);
            }
        }
    }
    
    public final f07 create(final f07 f07) {
        final byte w = this.w;
        final Object y = this.y;
        switch (w) {
            default: {
                return (f07)new ade((byte)1, f07, y);
            }
            case 0: {
                return (f07)new ade((byte)0, f07, y);
            }
        }
    }
    
    public final Object invokeSuspend(Object d) {
        final byte w = this.w;
        final Object o = null;
        final Object o2 = null;
        final pc7 v = pc7.v;
        final Object y = this.y;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                final mhn mhn = (mhn)y;
                final byte x = this.x;
                Label_0209: {
                    if (x != 0) {
                        if (x != 1) {
                            if (x == 2) {
                                vt4.g0(d);
                                break Label_0209;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return o2;
                        }
                        else {
                            vt4.g0(d);
                        }
                    }
                    else {
                        vt4.g0(d);
                        final ykn p = mhn.P;
                        this.x = 1;
                        p.G();
                        if (a == v) {
                            return v;
                        }
                    }
                    final lbh v2 = mhn.V;
                    if (v2 == null) {
                        break Label_0209;
                    }
                    final CharSequence x2 = mhn.P.a.f().x;
                    final long y2 = mhn.P.a.f().y;
                    this.x = 2;
                    d = v2.d(x2, y2, this);
                    if (d != v) {
                        d = a;
                    }
                    if (d != v) {
                        break Label_0209;
                    }
                    return v;
                }
                mhn.P.v.setValue((Object)Boolean.TRUE);
                return a;
            }
            case 0: {
                final ede ede = (ede)y;
                final byte x3 = this.x;
                if (x3 != 0) {
                    if (x3 != 1) {
                        if (x3 == 2) {
                            vt4.g0(d);
                            return a;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return o;
                    }
                    else {
                        vt4.g0(d);
                    }
                }
                else {
                    vt4.g0(d);
                    final zka zka = new zka((Object)ede.d.c, ede.c, (bua)new zce(), (byte)1);
                    final q16 q16 = new q16((byte)7);
                    this.x = 1;
                    if (vt4.A((ija)zka, (zta)q16, (f07)this) == v) {
                        return v;
                    }
                }
                final rnh e = ede.e;
                this.x = 2;
                if (e.a((m6n)this) != v) {
                    return a;
                }
                return v;
                o4 = a;
                return o4;
            }
        }
    }
}
