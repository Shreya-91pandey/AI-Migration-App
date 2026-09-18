public final class xkn extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public final ykn y;
    
    public final f07 create(final Object o, final f07 f07) {
        switch (this.w) {
            default: {
                return (f07)new xkn(this.y, f07, (byte)1);
            }
            case 0: {
                return (f07)new xkn(this.y, f07, (byte)0);
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
                return ((xkn)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((xkn)this.create(oc7, f07)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final ykn y = this.y;
        final lqo lqo = null;
        final lqo lqo2 = null;
        final pc7 v = pc7.v;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                final boolean x = this.x;
                if (x) {
                    if (!x) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return lqo2;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    this.x = true;
                    y.getClass();
                    Object o3;
                    final n6k n6k = (n6k)(o3 = ljq.a0((jta)new px1(y, (byte)4)));
                    if (twl.C) {
                        o3 = soh.v((ija)n6k, (lta)new jkn((byte)0), (zta)soh.i);
                    }
                    o = ((ija)o3).a((jja)new rkn(y, (byte)1), (f07)this);
                    if (o != v) {
                        o = a;
                    }
                    if (o == v) {
                        return v;
                    }
                }
                return a;
            }
            case 0: {
                final boolean x2 = this.x;
                if (x2) {
                    if (!x2) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return lqo;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    this.x = true;
                    y.getClass();
                    final n6k a2 = ljq.a0((jta)new px1(y, (byte)5));
                    final qkn c = qkn.C;
                    final sfa h = soh.h;
                    omo.v(2, (Object)c);
                    o = ((ija)soh.v((ija)a2, (lta)h, (zta)c)).a((jja)new hb4(new Object(), new rkn(y, (byte)0), (byte)4), (f07)this);
                    if (o != v) {
                        o = a;
                    }
                    if (o != v) {
                        o = a;
                    }
                    if (o == v) {
                        return v;
                    }
                }
                return a;
            }
        }
    }
}
