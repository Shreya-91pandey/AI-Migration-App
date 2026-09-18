public final class nv8 extends m6n implements bua
{
    public final byte w;
    
    public final Object h(final Object o, final Object o2, final Object o3) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final oc7 oc7 = (oc7)o;
        switch (w) {
            default: {
                ((Number)o2).floatValue();
                new nv8(3, (f07)o3, (byte)1).invokeSuspend(a);
                return a;
            }
            case 0: {
                final long a2 = ((l6g)o2).a;
                new nv8(3, (f07)o3, (byte)0).invokeSuspend(a);
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
                return a;
            }
            case 0: {
                vt4.g0(o);
                return a;
            }
        }
    }
}
