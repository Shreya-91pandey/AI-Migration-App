import java.util.Iterator;

public final class h4p extends m6n implements zta
{
    public final byte w;
    public Object x;
    public final Object y;
    
    public h4p(final i4p y, final f07 f07) {
        this.w = 0;
        this.y = y;
        super(2, f07);
    }
    
    public h4p(final qun x, final tun y, final f07 f07) {
        this.w = 1;
        this.x = x;
        this.y = y;
        super(2, f07);
    }
    
    public final f07 create(final Object x, final f07 f07) {
        final byte w = this.w;
        final Object y = this.y;
        switch (w) {
            default: {
                return (f07)new h4p((qun)this.x, (tun)y, f07);
            }
            case 0: {
                final h4p h4p = new h4p((i4p)y, f07);
                h4p.x = x;
                return (f07)h4p;
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
                ((h4p)this.create(oc7, f07)).invokeSuspend(a);
                return a;
            }
            case 0: {
                ((h4p)this.create(oc7, f07)).invokeSuspend(a);
                return a;
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                vt4.g0(o);
                final xma xma = (xma)((qun)this.x).y.get((Object)null);
                if (xma != null) {
                    xma.a(xma);
                }
                return a;
            }
            case 0: {
                final oc7 oc7 = (oc7)this.x;
                vt4.g0(o);
                final Iterator iterator = ((i4p)this.y).a.iterator();
                while (iterator.hasNext()) {
                    rhc.G(oc7, (hc7)null, 4, (zta)new khn((byte)8, null, iterator.next()), 1);
                }
                return a;
            }
        }
    }
}
