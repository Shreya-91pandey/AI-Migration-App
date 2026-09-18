import sun.misc.Unsafe;

public abstract class h07 extends wv1
{
    private final hc7 _context;
    private transient f07<Object> intercepted;
    
    public h07(final f07 f07) {
        hc7 context;
        if (f07 != null) {
            context = f07.getContext();
        }
        else {
            context = null;
        }
        this(f07, context);
    }
    
    public h07(final f07 f07, final hc7 context) {
        super(f07);
        this._context = context;
    }
    
    @Override
    public hc7 getContext() {
        final hc7 context = this._context;
        context.getClass();
        return context;
    }
    
    public final f07<Object> intercepted() {
        final f07<Object> intercepted = this.intercepted;
        if (intercepted == null) {
            final ic7 ic7 = (ic7)this.getContext().M0((gc7)p3.x);
            Object intercepted2;
            if (ic7 != null) {
                intercepted2 = new oo8(ic7, this);
            }
            else {
                intercepted2 = this;
            }
            return this.intercepted = (f07<Object>)intercepted2;
        }
        return intercepted;
    }
    
    @Override
    public void releaseIntercepted() {
        final f07<Object> intercepted = this.intercepted;
        if (intercepted != null && intercepted != this) {
            final fc7 m0 = this.getContext().M0((gc7)p3.x);
            m0.getClass();
            final ic7 ic7 = (ic7)m0;
            final oo8 oo8 = (oo8)intercepted;
            Unsafe a;
            long c;
            do {
                a = u51.a;
                c = oo8.C;
            } while (a.getObjectVolatile((Object)oo8, c) == po8.b);
            final Object objectVolatile = a.getObjectVolatile((Object)oo8, c);
            l13 l13;
            if (objectVolatile instanceof l13) {
                l13 = (l13)objectVolatile;
            }
            else {
                l13 = null;
            }
            if (l13 != null) {
                l13.m();
            }
        }
        this.intercepted = (f07<Object>)bd6.w;
    }
}
