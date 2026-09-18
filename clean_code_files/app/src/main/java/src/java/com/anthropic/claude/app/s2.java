package com.anthropic.claude.app;

import java.util.Set;

public final class s2 extends m6n implements zta
{
    public Object w;
    public final Set x;
    
    public s2(final Set x, final f07 f07) {
        this.x = x;
        super(2, f07);
    }
    
    public final f07 create(final Object w, final f07 f07) {
        final s2 s2 = new s2(this.x, f07);
        s2.w = w;
        return (f07)s2;
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((s2)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final b3 b3 = (b3)this.w;
        vt4.g0(o);
        return this.x.contains((Object)new yog((Object)b3.a, (Object)b3.b));
    }
}
