package com.anthropic.claude.app;

public final class v2 extends m6n implements zta
{
    public boolean w;
    public final v5a x;
    public final frg y;
    public final krf z;
    
    public v2(final f07 f07, final v5a x, final krf z, final frg y) {
        this.x = x;
        this.y = y;
        this.z = z;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new v2(f07, this.x, this.z, this.y);
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((v2)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final boolean w = this.w;
        if (w) {
            if (!w) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(o);
        }
        else {
            vt4.g0(o);
            final v5a x = this.x;
            final n6k a0 = ljq.a0((jta)new s5a(x, (byte)0));
            final u2 u2 = new u2(this.y, x, this.z);
            this.w = true;
            final Object a2 = a0.a((jja)u2, (f07)this);
            final pc7 v = pc7.v;
            if (a2 == v) {
                return v;
            }
        }
        return lqo.a;
    }
}
