package com.anthropic.claude.app;

import com.anthropic.claude.types.OriginRelativePath;

public final class q2 extends m6n implements bua
{
    public final oc7 A;
    public boolean w;
    public String x;
    public String y;
    public final gwj z;
    
    public q2(final gwj z, final oc7 a, final f07 f07) {
        this.z = z;
        this.A = a;
        super(3, f07);
    }
    
    public final Object h(final Object o, final Object o2, final Object o3) {
        final String f = ((OriginRelativePath)o).f();
        final String y = (String)o2;
        final q2 q2 = new q2(this.z, this.A, (f07)o3);
        q2.x = f;
        q2.y = y;
        return q2.invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object r) {
        final String x = this.x;
        final String y = this.y;
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
            final ClaudeAppOverlay.AuthenticatedWeb authenticatedWeb = new ClaudeAppOverlay.AuthenticatedWeb(x, y);
            final gwj z = this.z;
            lub.s(z, (vqd)authenticatedWeb);
            final b98 f = rhc.f(this.A, (hc7)null, 0, (zta)new p2(z, authenticatedWeb, (f07)null), 3);
            this.x = null;
            this.y = null;
            this.w = true;
            r = ((bqc)f).r((f07)this);
            final pc7 v = pc7.v;
            if (r == v) {
                return v;
            }
        }
        return Boolean.TRUE;
    }
}
