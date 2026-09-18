package com.anthropic.claude.app.main;

import com.anthropic.claude.login.WelcomeNotice;
import android.content.Context;

public final class j extends m6n implements zta
{
    public final ep0 A;
    public final MainAppScreens B;
    public final Context C;
    public final gwj D;
    public final p9 E;
    public final d7 w;
    public final xk0 x;
    public final t9 y;
    public final jta z;
    
    public j(final d7 w, final xk0 x, final t9 y, final jta z, final ep0 a, final MainAppScreens b, final Context c, final gwj d, final p9 e, final f07 f07) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new j(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, f07);
    }
    
    public final Object d(final Object o, final Object o2) {
        final j j = (j)this.create(o, (f07)o2);
        final lqo a = lqo.a;
        j.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        vt4.g0(o);
        final evd evd = (evd)this.w.u.getValue();
        int n;
        if (evd == null) {
            n = -1;
        }
        else {
            n = q0e.a[((Enum)evd).ordinal()];
        }
        if (n != -1) {
            final gwj d = this.D;
            final MainAppScreens b = this.B;
            final jta z = this.z;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3 && n != 4 && n != 5) {
                        en9.r();
                        return null;
                    }
                    l.d(this.x, this.y, z, this.A, b, this.C, d, this.E, null);
                }
                else {
                    l.d(this.x, this.y, z, this.A, b, this.C, d, this.E, WelcomeNotice.x);
                }
            }
            else {
                l.d(this.x, this.y, z, this.A, b, this.C, d, this.E, WelcomeNotice.w);
            }
        }
        return lqo.a;
    }
}
