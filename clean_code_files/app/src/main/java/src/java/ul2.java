public final class ul2 extends m6n implements zta
{
    public final qn1 A;
    public Object w;
    public final vl2 x;
    public final yxf y;
    public final jd0 z;
    
    public ul2(final vl2 x, final yxf y, final jd0 z, final qn1 a, final f07 f07) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        super(2, f07);
    }
    
    public final f07 create(final Object w, final f07 f07) {
        final ul2 ul2 = new ul2(this.x, this.y, this.z, this.A, f07);
        ul2.w = w;
        return (f07)ul2;
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((ul2)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        vt4.g0(o);
        final oc7 oc7 = (oc7)this.w;
        final jd0 z = this.z;
        final vl2 x = this.x;
        rhc.G(oc7, (hc7)null, 0, (zta)new o10((Object)x, (Object)this.y, (Object)z, (f07)null, (byte)3), 3);
        return rhc.G(oc7, (hc7)null, 0, (zta)new p10(x, this.A, null, (byte)5), 3);
    }
}
