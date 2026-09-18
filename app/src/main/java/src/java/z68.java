public final class z68 extends m6n implements zta
{
    public final byte w;
    public final jta x;
    
    public final f07 create(final Object o, final f07 f07) {
        switch (this.w) {
            default: {
                return (f07)new z68(this.x, f07, (byte)1);
            }
            case 0: {
                return (f07)new z68(this.x, f07, (byte)0);
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
                ((z68)this.create(oc7, f07)).invokeSuspend(a);
                return a;
            }
            case 0: {
                ((z68)this.create(oc7, f07)).invokeSuspend(a);
                return a;
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final jta x = this.x;
        switch (w) {
            default: {
                vt4.g0(o);
                x.a();
                return a;
            }
            case 0: {
                vt4.g0(o);
                x.a();
                return a;
            }
        }
    }
}
