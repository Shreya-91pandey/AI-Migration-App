package com.anthropic.claude.app.main;

import java.util.List;
import java.util.Map;
import android.os.SystemClock;
import android.content.Context;

public final class i extends m6n implements zta
{
    public final f60 A;
    public final tm9 B;
    public final t9 C;
    public final r9 D;
    public final jta E;
    public final gwj F;
    public final p9 G;
    public final xk0 H;
    public final Context I;
    public long w;
    public boolean x;
    public Object y;
    public final MainAppScreens z;
    
    public i(final MainAppScreens z, final f60 a, final tm9 b, final t9 c, final r9 d, final jta e, final gwj f, final p9 g, final xk0 h, final Context i, final f07 f2) {
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
        this.I = i;
        super(2, f2);
    }
    
    public final f07 create(final Object y, final f07 f07) {
        final i i = new i(this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, f07);
        i.y = y;
        return (f07)i;
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((i)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object f0) {
        final n6 y = (n6)this.y;
        final boolean x = this.x;
        final gwj f2 = this.F;
        final lqo a = lqo.a;
        final MainAppScreens z = this.z;
        long w;
        if (x) {
            if (!x) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w = this.w;
            vt4.g0(f0);
        }
        else {
            vt4.g0(f0);
            if (y instanceof m6) {
                final m6 m6 = (m6)y;
                final String a2 = m6.a();
                final String a3 = ((MainAppScreens.LoggedIn)z).a;
                if (mlc.q((Object)a2, (Object)a3)) {
                    return a;
                }
                this.A.getClass();
                w = SystemClock.elapsedRealtime();
                final List a4 = adn.a;
                final String a5 = m6.a();
                final StringBuilder sb = new StringBuilder("Switching account to ");
                sb.append(a5);
                adn.e(6, sb.toString(), (String)null, (Map)null);
                this.y = y;
                this.w = w;
                this.x = true;
                final tm9 b = this.B;
                final wo8 c = b.c;
                final o68 a6 = vo8.a;
                f0 = rhc.f0((hc7)d58.w, (zta)new bg7((Object)b, (Object)a3, (f07)null, (byte)9), (f07)this);
                final pc7 v = pc7.v;
                if (f0 != v) {
                    f0 = a;
                }
                if (f0 == v) {
                    return v;
                }
            }
            else {
                if (mlc.q((Object)y, (Object)k6.a)) {
                    f2.b((lta)new u52((Object)MainAppScreens.AddAccount.INSTANCE, (byte)13), (zta)new p0e((byte)0));
                    return a;
                }
                if (mlc.q((Object)y, (Object)l6.a)) {
                    f2.b((lta)new gwb((Object)new MainAppScreens.StepUpReauth(((MainAppScreens.LoggedIn)z).a), (byte)8), (zta)new p0e((byte)1));
                    return a;
                }
                en9.r();
                return null;
            }
        }
        this.C.a();
        final m6 m7 = (m6)y;
        this.D.a(w, m7.b(), m7.a());
        this.E.a();
        l.e(this.G, z, this.H, this.I, f2, m7.a(), m7.b());
        return a;
    }
}
