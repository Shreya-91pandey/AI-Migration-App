public final class c5d extends xp7
{
    public final mlf s;
    public ilf t;
    
    public c5d(final lta lta) {
        this.s = new mlf();
        lta.b((Object)this);
    }
    
    public final mlf F() {
        return this.s;
    }
    
    public final void d0(Object o, final Object o2, final bua bua) {
        Object o3;
        if (o != null) {
            o3 = new p8a(o, (byte)8);
        }
        else {
            o3 = null;
        }
        o = new a5d((lta)o3, (lta)new p8a(o2, (byte)8), new ye6(-857469575, true, (Object)new d90((Object)bua, (byte)2)));
        this.s.a(1, (s3d)o);
    }
    
    public final void f0(final int n, final lta lta, final lta lta2, final ye6 ye6) {
        this.s.a(n, new a5d(lta, lta2, ye6));
    }
    
    public final void h0(final String s, final String s2, final ye6 ye6) {
        ilf t;
        if ((t = this.t) == null) {
            t = new ilf();
            this.t = t;
        }
        final mlf s3 = this.s;
        t.a(s3.b);
        this.d0(s, s2, (bua)new ye6(-1588696110, true, (Object)new b5d(ye6, s3.b, (byte)0)));
    }
}
