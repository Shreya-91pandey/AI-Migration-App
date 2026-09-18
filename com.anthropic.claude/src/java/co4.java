public final class co4 extends m6n implements bua
{
    public final byte w;
    public boolean x;
    public Object y;
    
    public co4(final rv7 y, final f07 f07) {
        this.w = 1;
        this.y = y;
        super(3, f07);
    }
    
    public final Object h(final Object o, final Object o2, final Object o3) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                final rca y = (rca)o;
                o2.getClass();
                final co4 co4 = new co4(3, (f07)o3, (byte)2);
                co4.y = y;
                return co4.invokeSuspend(a);
            }
            case 1: {
                final jja jja = (jja)o;
                final Throwable t = (Throwable)o2;
                return new co4((rv7)this.y, (f07)o3).invokeSuspend(a);
            }
            case 0: {
                final yog y2 = (yog)o;
                final boolean booleanValue = (boolean)o2;
                final co4 co5 = new co4(3, (f07)o3, (byte)0);
                co5.y = y2;
                co5.x = booleanValue;
                return co5.invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object n) {
        final byte w = this.w;
        final pc7 v = pc7.v;
        switch (w) {
            default: {
                final rca rca = (rca)this.y;
                final boolean x = this.x;
                if (x) {
                    if (x) {
                        vt4.g0(n);
                        return n;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    vt4.g0(n);
                    this.y = null;
                    this.x = true;
                    if (!rca.c.get()) {
                        if ((n = ncq.N(rca.a, (lta)new i80(rca, null), (h07)this)) == v) {
                            n = v;
                            return n;
                        }
                        return n;
                    }
                    else {
                        en9.q("This scope has already been closed.");
                    }
                }
                n = null;
                return n;
            }
            case 1: {
                final boolean x2 = this.x;
                if (x2) {
                    if (!x2) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vt4.g0(n);
                }
                else {
                    vt4.g0(n);
                    final rv7 rv7 = (rv7)this.y;
                    this.x = true;
                    if (rv7.b((h07)this) == v) {
                        return v;
                    }
                }
                return lqo.a;
            }
            case 0: {
                final yog yog = (yog)this.y;
                final boolean x3 = this.x;
                vt4.g0(n);
                return new yog(yog.w, (Object)x3);
            }
        }
    }
}
