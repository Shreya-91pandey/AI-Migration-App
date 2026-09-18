public final class rjn implements mgk
{
    public final mgk a;
    public final sd8 b;
    public final sd8 c;
    
    public rjn(final mgk a, final sjn sjn) {
        this.a = a;
        this.b = r8m.b((jta)new qjn(sjn, (byte)0));
        this.c = r8m.b((jta)new qjn(sjn, (byte)1));
    }
    
    public final boolean a() {
        return this.a.a();
    }
    
    public final Object b(final lnf lnf, final zta zta, final f07 f07) {
        return this.a.b(lnf, zta, f07);
    }
    
    public final boolean c() {
        return (boolean)this.c.getValue();
    }
    
    public final boolean d() {
        return (boolean)this.b.getValue();
    }
    
    public final float e(final float n) {
        return this.a.e(n);
    }
    
    public final boolean f() {
        return this.a.f();
    }
}
