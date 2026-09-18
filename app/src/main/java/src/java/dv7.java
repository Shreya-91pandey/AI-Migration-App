public final class dv7 extends m6n implements lta
{
    public final byte w;
    public boolean x;
    public final rv7 y;
    
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final f07 f07 = (f07)o;
        switch (w) {
            default: {
                return ((dv7)this.create(f07)).invokeSuspend(a);
            }
            case 0: {
                return ((dv7)this.create(f07)).invokeSuspend(a);
            }
        }
    }
    
    public final f07 create(final f07 f07) {
        final byte w = this.w;
        final rv7 y = this.y;
        switch (w) {
            default: {
                return (f07)new dv7(y, f07, (byte)1);
            }
            case 0: {
                return (f07)new dv7(y, f07, (byte)0);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final rv7 y = this.y;
        final Object v = pc7.v;
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
                    final vca vca = (vca)y.j.getValue();
                    this.x = true;
                    if ((o = vca.a(new co4(3, null, (byte)2), (h07)this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
            case 0: {
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
                    final ozl c = y.c();
                    this.x = true;
                    if ((o = c.a()) == v) {
                        o = v;
                    }
                }
                return o;
            }
        }
    }
}
