public final class r68 implements mgk
{
    public final lta a;
    public final q68 b;
    public final ynf c;
    public final ksg d;
    public final ksg e;
    public final ksg f;
    
    public r68(final lta a) {
        this.a = a;
        this.b = new q68(this);
        this.c = new ynf();
        final Boolean booleanFalse = Boolean.FALSE;
        this.d = o50.Q((Object)false);
        this.e = o50.Q((Object)false);
        this.f = o50.Q((Object)false);
    }
    
    public final boolean a() {
        return (boolean)this.d.getValue();
    }
    
    public final Object b(final lnf lnf, final zta zta, final f07 f07) {
        final Object m = ien.m(f07, (zta)new o10((Object)this, (Object)lnf, (Object)zta, (f07)null, (byte)17));
        if (m == pc7.v) {
            return m;
        }
        return lqo.a;
    }
    
    public final float e(final float n) {
        return ((Number)this.a.b((Object)n)).floatValue();
    }
    
    public final boolean f() {
        return (boolean)this.f.getValue();
    }
}
