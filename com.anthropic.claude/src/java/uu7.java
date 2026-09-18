public final class uu7 extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public final rv7 y;
    
    public uu7(final rv7 y, final yci yci, final f07 f07) {
        this.w = 2;
        this.y = y;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final rv7 y = this.y;
        switch (w) {
            default: {
                return (f07)new uu7(y, f07, (byte)3);
            }
            case 2: {
                return (f07)new uu7(y, null, f07);
            }
            case 1: {
                return (f07)new uu7(y, f07, (byte)1);
            }
            case 0: {
                return (f07)new uu7(y, f07, (byte)0);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                final Boolean b = (Boolean)o;
                b.booleanValue();
                return ((uu7)this.create(b, (f07)o2)).invokeSuspend(a);
            }
            case 2: {
                return ((uu7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 1: {
                return ((uu7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                final Boolean b2 = (Boolean)o;
                b2.booleanValue();
                return ((uu7)this.create(b2, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final rv7 y = this.y;
        Object o2 = pc7.v;
        switch (w) {
            default: {
                final boolean x = this.x;
                if (x) {
                    if (x) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ozl c = y.c();
                    this.x = true;
                    if ((o = c.a()) == o2) {
                        o = o2;
                    }
                }
                return o;
            }
            case 2: {
                final boolean x2 = this.x;
                if (x2) {
                    if (x2) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final dv7 dv7 = new dv7(y, null, (byte)0);
                    this.x = true;
                    if ((o = zn2.R("DataStore.getCoordinatorVersion", (yci)null, (lta)dv7, (h07)this)) == o2) {
                        o = o2;
                    }
                }
                return o;
            }
            case 1: {
                final boolean x3 = this.x;
                if (x3) {
                    if (!x3) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o2 = null;
                        return o2;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    this.x = true;
                    if (y.d((h07)this) == o2) {
                        return o2;
                    }
                }
                o2 = lqo.a;
                return o2;
            }
            case 0: {
                final boolean x4 = this.x;
                if (x4) {
                    if (x4) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ozl c2 = y.c();
                    this.x = true;
                    if ((o = c2.a()) == o2) {
                        o = o2;
                    }
                }
                return o;
            }
        }
    }
}
