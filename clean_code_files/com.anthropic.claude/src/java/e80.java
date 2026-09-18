import android.app.Activity;

public final class e80 extends m6n implements lta
{
    public final byte w;
    public final Object x;
    public final Object y;
    
    @Override
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final f07 f07 = (f07)o;
        switch (w) {
            default: {
                ((e80)this.create(f07)).invokeSuspend(a);
                return a;
            }
            case 1: {
                ((e80)this.create(f07)).invokeSuspend(a);
                return a;
            }
            case 0: {
                ((e80)this.create(f07)).invokeSuspend(a);
                return a;
            }
        }
    }
    
    @Override
    public final f07 create(final f07 f07) {
        final byte w = this.w;
        final Object y = this.y;
        final Object x = this.x;
        switch (w) {
            default: {
                return new e80(x, y, f07, (byte)2);
            }
            case 1: {
                return new e80(x, y, f07, (byte)1);
            }
            case 0: {
                return new e80(x, y, f07, (byte)0);
            }
        }
    }
    
    @Override
    public final Object invokeSuspend(Object c) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final Object x = this.x;
        switch (w) {
            default: {
                vt4.g0(c);
                final id0 id0 = (id0)x;
                id0.d();
                c = id0.c(this.y);
                id0.c.w.setValue(c);
                id0.e.setValue(c);
                return a;
            }
            case 1: {
                vt4.g0(c);
                ((j80)x).d().b((lta)new l0k(1, (byte)7));
                return a;
            }
            case 0: {
                vt4.g0(c);
                ((j80)x).d().b((lta)new l0k(1, (byte)6));
                return a;
            }
        }
    }
}
