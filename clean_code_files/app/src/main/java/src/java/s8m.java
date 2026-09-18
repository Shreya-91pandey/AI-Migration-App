public final class s8m extends m6n implements zta
{
    public final bnf A;
    public final byte w;
    public boolean x;
    public Object y;
    public final zta z;
    
    public final f07 create(final Object o, final f07 f07) {
        switch (this.w) {
            default: {
                final s8m s8m = new s8m(this.z, this.A, f07, (byte)1);
                s8m.y = o;
                return (f07)s8m;
            }
            case 0: {
                final s8m s8m2 = new s8m(this.z, this.A, f07, (byte)0);
                s8m2.y = o;
                return (f07)s8m2;
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
                return ((s8m)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((s8m)this.create(oc7, f07)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final bnf a2 = this.A;
        final zta z = this.z;
        final pc7 v = pc7.v;
        switch (w) {
            default: {
                final boolean x = this.x;
                lqo lqo;
                if (x) {
                    if (x) {
                        vt4.g0(o);
                        lqo = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        lqo = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final irh irh = new irh(a2, ((oc7)this.y).getCoroutineContext());
                    this.x = true;
                    lqo = a;
                    if (z.d((Object)irh, (Object)this) == v) {
                        lqo = (lqo)v;
                    }
                }
                return lqo;
            }
            case 0: {
                final boolean x2 = this.x;
                Object o2;
                if (x2) {
                    if (x2) {
                        vt4.g0(o);
                        o2 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o2 = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final irh irh2 = new irh(a2, ((oc7)this.y).getCoroutineContext());
                    this.x = true;
                    o2 = a;
                    if (z.d((Object)irh2, (Object)this) == v) {
                        o2 = v;
                    }
                }
                return o2;
            }
        }
    }
}
