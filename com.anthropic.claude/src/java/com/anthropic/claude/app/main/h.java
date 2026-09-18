package com.anthropic.claude.app.main;

import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.AccountId;

public final class h implements bua
{
    public final xk0 v;
    public final gwj w;
    
    public h(final xk0 v, final gwj w) {
        this.v = v;
        this.w = w;
    }
    
    public final Object h(final Object o, final Object o2, final Object o3) {
        final String a = ((AccountId)o).a;
        final String a2 = ((OrganizationId)o2).a;
        final wn wn = (wn)o3;
        this.v.b.set(true);
        this.w.b((lta)new crd((Object[])new MainAppScreens[] { new MainAppScreens.LoggedIn(a, a2, wn) }, (byte)10), (zta)new xf8((byte)29));
        return lqo.a;
    }
}
