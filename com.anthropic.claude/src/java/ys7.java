public final class ys7 extends m6n implements zta
{
    public final byte w;
    public Object x;
    public final lta y;
    
    public ys7(final f07 f07, final lta y) {
        this.w = 0;
        this.y = y;
        super(2, f07);
    }
    
    public ys7(final lta y, final f07 f07) {
        this.w = 1;
        this.y = y;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final lta y = this.y;
        switch (w) {
            default: {
                final ys7 ys7 = new ys7(y, f07);
                ys7.x = o;
                return (f07)ys7;
            }
            case 0: {
                final ys7 ys8 = new ys7(f07, y);
                ys8.x = o;
                return (f07)ys8;
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                ((ys7)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 0: {
                return ((ys7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final lta y = this.y;
        switch (w) {
            default: {
                vt4.g0(o);
                y.b((Object)this.x);
                return lqo.a;
            }
            case 0: {
                vt4.g0(o);
                final aeo aeo = (aeo)this.x;
                aeo.getClass();
                return y.b((Object)((tpi)aeo).c());
            }
        }
    }
}
