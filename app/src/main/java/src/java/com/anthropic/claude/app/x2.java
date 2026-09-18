package com.anthropic.claude.app;

public final class x2 extends m6n implements zta
{
    public boolean w;
    public final krf x;
    public final frg y;
    public final v5a z;
    
    public x2(final f07 f07, final v5a z, final krf x, final frg y) {
        this.x = x;
        this.y = y;
        this.z = z;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new x2(f07, this.z, this.x, this.y);
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((x2)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object a) {
        final boolean w = this.w;
        if (w) {
            if (!w) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(a);
        }
        else {
            vt4.g0(a);
            final krf x = this.x;
            final frg y = this.y;
            final n6k a2 = ljq.a0((jta)new jd0((Object)x, (Object)y, (byte)28));
            final w2 w2 = new w2(y, this.z, x);
            this.w = true;
            a = a2.a((jja)w2, (f07)this);
            final pc7 v = pc7.v;
            if (a == v) {
                return v;
            }
        }
        return lqo.a;
    }
}
