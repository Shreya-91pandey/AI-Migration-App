package com.anthropic.claude.app;

import java.util.Set;

public final class r2 extends m6n implements zta
{
    public boolean w;
    public final b3 x;
    public final f8 y;
    public final frg z;
    
    public r2(final b3 x, final f8 y, final frg z, final f07 f07) {
        this.x = x;
        this.y = y;
        this.z = z;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new r2(this.x, this.y, this.z, f07);
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((r2)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
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
            final n6k a3 = ljq.a0((jta)new pv4(this.z, (byte)1));
            this.w = true;
            final xll xll = new xll();
            final b3 x = this.x;
            final ClaudeAppDestination.List a4 = x.a;
            final ClaudeAppDestination.Detail b = x.b;
            xll.add((Object)new yog((Object)a4, (Object)b));
            if (x.a == null) {
                xll.add((Object)new yog((Object)ClaudeAppDestination.List.AllChatsList.INSTANCE, (Object)b));
            }
            a = new zu7(new wja((ija)soh.v((ija)a3, (lta)new yp7((byte)24), (zta)soh.i), (zta)new s2((Set)rml.j((Set)xll), null), (byte)1), (byte)1).a((jja)new wb0((Object)this.y, (byte)8), (f07)this);
            final pc7 v = pc7.v;
            if (a != v) {
                a = a2;
            }
            if (a == v) {
                return v;
            }
            return a2;
        }
    }
}
