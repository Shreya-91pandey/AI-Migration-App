import io.sentry.v4;

public final class ww4 extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public final yw4 y;
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final yw4 y = this.y;
        switch (w) {
            default: {
                return (f07)new ww4(y, f07, (byte)4);
            }
            case 3: {
                return (f07)new ww4(y, f07, (byte)3);
            }
            case 2: {
                return (f07)new ww4(y, f07, (byte)2);
            }
            case 1: {
                return (f07)new ww4(y, f07, (byte)1);
            }
            case 0: {
                return (f07)new ww4(y, f07, (byte)0);
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
                return ((ww4)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 3: {
                return ((ww4)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 2: {
                return ((ww4)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 1: {
                return ((ww4)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((ww4)this.create(oc7, f07)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        Object a = lqo.a;
        final yw4 y = this.y;
        final pc7 v = pc7.v;
        switch (w) {
            default: {
                final boolean x = this.x;
                if (x) {
                    if (!x) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final f4b j = y.j;
                    this.x = true;
                    if ((o = j.b((h07)this)) == v) {
                        return v;
                    }
                }
                final String s = (String)o;
                Object o2 = a;
                if (s != null) {
                    v4.n("store_country_code", s);
                    o2 = a;
                }
                return o2;
            }
            case 3: {
                final boolean x2 = this.x;
                if (x2) {
                    if (x2) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final dga d = y.d;
                    this.x = true;
                    if (d.d((h07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 2: {
                final boolean x3 = this.x;
                if (x3) {
                    if (x3) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final lp7 c = y.c;
                    this.x = true;
                    o = rhc.f0((hc7)vo8.a, (zta)new jp7(c, (f07)null), (f07)this);
                    if (o != v) {
                        o = a;
                    }
                    if (o == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 1: {
                final boolean x4 = this.x;
                if (x4) {
                    if (x4) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final usi b = y.s.b;
                    final wb0 wb0 = new wb0((Object)y, (byte)3);
                    this.x = true;
                    o = ((ija)b).a((jja)new hb4(new Object(), (Object)wb0, (byte)4), (f07)this);
                    if (o != v) {
                        o = a;
                    }
                    if (o == v) {
                        a = v;
                    }
                }
                return a;
            }
            case 0: {
                final boolean x5 = this.x;
                if (x5) {
                    if (x5) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final d05 t = y.t;
                    this.x = true;
                    if (t.d((h07)this) == v) {
                        a = v;
                    }
                }
                return a;
            }
        }
    }
}
