public final class qpg extends m6n implements bua
{
    public boolean w;
    public float x;
    public final ypg y;
    
    public qpg(final ypg y, final f07 f07) {
        this.y = y;
        super(3, f07);
    }
    
    public final Object h(final Object o, final Object o2, final Object o3) {
        final oc7 oc7 = (oc7)o;
        final float floatValue = ((Number)o2).floatValue();
        final qpg qpg = new qpg(this.y, (f07)o3);
        qpg.x = floatValue;
        return qpg.invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object a) {
        final boolean w = this.w;
        final lqo a2 = lqo.a;
        if (w) {
            if (w) {
                vt4.g0(a);
                return a2;
            }
            en9.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        else {
            vt4.g0(a);
            final float x = this.x;
            this.w = true;
            final ypg y = this.y;
            final int b = y.h.b;
            final pc7 v = pc7.v;
            Label_0116: {
                if (b != 0) {
                    a = y.n.a(lnf.x, (lta)new xpg(y, x, (f07)null), (f07)this);
                    if (a == v) {
                        break Label_0116;
                    }
                }
                a = a2;
            }
            if (a == v) {
                return v;
            }
            return a2;
        }
    }
}
