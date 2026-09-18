public final class brm extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public final crm y;
    
    public final f07 create(final Object o, final f07 f07) {
        switch (this.w) {
            default: {
                return (f07)new brm(this.y, f07, (byte)2);
            }
            case 1: {
                return (f07)new brm(this.y, f07, (byte)1);
            }
            case 0: {
                return (f07)new brm(this.y, f07, (byte)0);
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
                return ((brm)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 1: {
                return ((brm)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((brm)this.create(oc7, f07)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object m) {
        final byte w = this.w;
        final crm y = this.y;
        Object v = pc7.v;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                final boolean x = this.x;
                if (x) {
                    if (!x) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                        return v;
                    }
                    vt4.g0(m);
                }
                else {
                    vt4.g0(m);
                    this.x = true;
                    y.getClass();
                    m = ien.m((f07)this, (zta)new rf0((byte)25, (f07)null, (Object)y));
                    if (m != v) {
                        m = a;
                    }
                    if (m == v) {
                        return v;
                    }
                }
                v = a;
                return v;
            }
            case 1: {
                final boolean x2 = this.x;
                if (x2) {
                    if (!x2) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                        return v;
                    }
                    vt4.g0(m);
                }
                else {
                    vt4.g0(m);
                    final n6k a2 = ljq.a0((jta)new arm(y, (byte)1));
                    final wb0 wb0 = new wb0((Object)y, (byte)23);
                    this.x = true;
                    if (a2.a((jja)wb0, (f07)this) == v) {
                        return v;
                    }
                }
                v = a;
                return v;
            }
            case 0: {
                final boolean x3 = this.x;
                if (x3) {
                    if (!x3) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                        return v;
                    }
                    vt4.g0(m);
                }
                else {
                    vt4.g0(m);
                    final Object o = new Object();
                    ((y3j)o).v = 0.0f;
                    final n6k a3 = ljq.a0((jta)new arm(y, (byte)0));
                    final frd frd = new frd((Object)y, o, (f07)null, (byte)16);
                    this.x = true;
                    if (x90.r((ija)a3, (zta)frd, (f07)this) == v) {
                        return v;
                    }
                }
                v = a;
                return v;
            }
        }
    }
}
