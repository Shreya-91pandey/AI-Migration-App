import android.os.Bundle;
import android.app.Activity;

public final class b80 extends m6n implements lta
{
    public final byte w;
    public final Object x;
    public final Object y;
    public final Object z;
    
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final f07 f07 = (f07)o;
        switch (w) {
            default: {
                return ((b80)this.create(f07)).invokeSuspend(a);
            }
            case 0: {
                ((b80)this.create(f07)).invokeSuspend(a);
                return a;
            }
        }
    }
    
    public final f07 create(final f07 f07) {
        final byte w = this.w;
        final Object z = this.z;
        final Object y = this.y;
        final Object x = this.x;
        switch (w) {
            default: {
                return (f07)new b80(x, y, z, f07, (byte)1);
            }
            case 0: {
                return (f07)new b80(x, y, z, f07, (byte)0);
            }
        }
    }
    
    public final Object invokeSuspend(Object d1) {
        final byte w = this.w;
        final Object x = this.x;
        switch (w) {
            default: {
                vt4.g0(d1);
                d1 = ((xug)x).b.d1((String)this.y);
                final lta lta = (lta)this.z;
                try {
                    final Object b = lta.b(d1);
                    r9n.m((AutoCloseable)d1, (Throwable)null);
                    return b;
                }
                finally {
                    try {}
                    finally {
                        final Throwable t;
                        r9n.m((AutoCloseable)d1, t);
                    }
                }
            }
            case 0: {
                vt4.g0(d1);
                ((j80)x).d().b((lta)new l0k(1, (byte)5));
                return lqo.a;
            }
        }
    }
}
