import io.sentry.l4;
import io.sentry.v4;

public final class sq0 extends m6n implements zta
{
    public final byte w;
    
    @Override
    public final f07 create(final Object o, final f07 f07) {
        switch (this.w) {
            default: {
                return new sq0(2, f07, (byte)3);
            }
            case 2: {
                return new sq0(2, f07, (byte)2);
            }
            case 1: {
                return new sq0(2, f07, (byte)1);
            }
            case 0: {
                return new sq0(2, f07, (byte)0);
            }
        }
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                ((sq0)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 2: {
                ((sq0)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 1: {
                ((sq0)this.create(o, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 0: {
                return ((sq0)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    @Override
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                vt4.g0(o);
                return a;
            }
            case 2: {
                vt4.g0(o);
                v4.d((l4)new qyk(1));
                return a;
            }
            case 1: {
                vt4.g0(o);
                return a;
            }
            case 0: {
                vt4.g0(o);
                return v4.j();
            }
        }
    }
}
