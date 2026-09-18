public final class qv7 extends m6n implements zta
{
    public final Object A;
    public final boolean B;
    public boolean w;
    public Object x;
    public final rv7 y;
    public final z3j z;
    
    public qv7(final rv7 y, final z3j z, final Object a, final boolean b, final f07 f07) {
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        super(2, f07);
    }
    
    public final f07 create(final Object x, final f07 f07) {
        final qv7 qv7 = new qv7(this.y, this.z, this.A, this.B, f07);
        qv7.x = x;
        return (f07)qv7;
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((qv7)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object r) {
        final xda xda = (xda)this.x;
        final boolean w = this.w;
        if (w) {
            if (!w) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(r);
        }
        else {
            vt4.g0(r);
            this.y.getClass();
            final pv7 pv7 = new pv7(this.z, this.y, xda, this.A, this.B, null);
            this.x = null;
            this.w = true;
            r = zn2.R("DataStore.writeData", (yci)null, (lta)pv7, (h07)this);
            final pc7 v = pc7.v;
            if (r == v) {
                return v;
            }
        }
        return lqo.a;
    }
}
