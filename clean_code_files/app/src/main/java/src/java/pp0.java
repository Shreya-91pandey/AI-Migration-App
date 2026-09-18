import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.AppStartEvents$MaybeRefreshRefreshed;
import com.anthropic.claude.configs.FlexibleUpdateConfig;
import java.io.File;

public final class pp0 extends m6n implements lta
{
    public final byte w;
    public boolean x;
    public final Object y;
    public final Object z;
    
    public pp0(final l7n z, final File y, final f07 f07) {
        this.w = 3;
        final d58 w = d58.w;
        this.z = z;
        this.y = y;
        super(1, f07);
    }
    
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final f07 f07 = (f07)o;
        switch (w) {
            default: {
                return ((pp0)this.create(f07)).invokeSuspend(a);
            }
            case 6: {
                return ((pp0)this.create(f07)).invokeSuspend(a);
            }
            case 5: {
                return ((pp0)this.create(f07)).invokeSuspend(a);
            }
            case 4: {
                return ((pp0)this.create(f07)).invokeSuspend(a);
            }
            case 3: {
                return ((pp0)this.create(f07)).invokeSuspend(a);
            }
            case 2: {
                return ((pp0)this.create(f07)).invokeSuspend(a);
            }
            case 1: {
                return ((pp0)this.create(f07)).invokeSuspend(a);
            }
            case 0: {
                return ((pp0)this.create(f07)).invokeSuspend(a);
            }
        }
    }
    
    public final f07 create(final f07 f07) {
        final byte w = this.w;
        final Object y = this.y;
        final Object z = this.z;
        switch (w) {
            default: {
                return (f07)new pp0(z, y, f07, (byte)7);
            }
            case 6: {
                return (f07)new pp0(z, y, f07, (byte)6);
            }
            case 5: {
                return (f07)new pp0(z, y, f07, (byte)5);
            }
            case 4: {
                return (f07)new pp0(z, y, f07, (byte)4);
            }
            case 3: {
                final l7n l7n = (l7n)z;
                final d58 w2 = d58.w;
                return (f07)new pp0(l7n, (File)y, f07);
            }
            case 2: {
                return (f07)new pp0(z, y, f07, (byte)2);
            }
            case 1: {
                return (f07)new pp0(z, y, f07, (byte)1);
            }
            case 0: {
                return (f07)new pp0(z, y, f07, (byte)0);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        boolean b = false;
        final boolean b2 = false;
        Object a = lqo.a;
        final Object y = this.y;
        Object o2 = pc7.v;
        final Object z = this.z;
        switch (w) {
            default: {
                final tze tze = (tze)z;
                final boolean x = this.x;
                Label_0232: {
                    if (x) {
                        Label_0111: {
                            if (x) {
                                Label_0249: {
                                    try {
                                        vt4.g0(o);
                                        break Label_0232;
                                    }
                                    finally {
                                        break Label_0249;
                                    }
                                    break Label_0111;
                                }
                                ((ksg)tze.x).setValue((Object)Boolean.FALSE);
                            }
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(o);
                    ((ksg)tze.x).setValue((Object)Boolean.FALSE);
                    final zmk zmk = (zmk)tze.w;
                    final tun tun = (tun)y;
                    this.x = true;
                    final efo a2 = zmk.A;
                    Label_0219: {
                        if (a2 != null) {
                            o = znf.a(zmk.H, (lta)new pw1((Object)zmk, (Object)tun, (Object)a2, (f07)null, (byte)5), (f07)this);
                            if (o == o2) {
                                break Label_0219;
                            }
                        }
                        o = a;
                    }
                    if (o == o2) {
                        a = o2;
                        return a;
                    }
                }
                ((ksg)tze.x).setValue((Object)Boolean.FALSE);
                return a;
            }
            case 6: {
                final boolean x2 = this.x;
                if (x2) {
                    if (x2) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    FlexibleUpdateConfig flexibleUpdateConfig;
                    if ((flexibleUpdateConfig = (FlexibleUpdateConfig)((z8b)z).f("mobile_flexible_update_config", yi2.S(a0l.a, (buc)v4j.b((Class)FlexibleUpdateConfig.class)))) == null) {
                        flexibleUpdateConfig = new FlexibleUpdateConfig();
                    }
                    final vfj vfj = (vfj)y;
                    final boolean a3 = flexibleUpdateConfig.a;
                    final int b3 = flexibleUpdateConfig.b;
                    final int c = flexibleUpdateConfig.c;
                    this.x = true;
                    if (vfj.a(a3, b3, c, (h07)this) == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 5: {
                final b4j b4j = (b4j)y;
                final boolean x3 = this.x;
                if (x3) {
                    if (!x3) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                        return a;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final jja jja = (jja)z;
                    if ((o = b4j.v) == j3g.a) {
                        o = null;
                    }
                    this.x = true;
                    if (jja.l(o, (f07)this) == o2) {
                        a = o2;
                        return a;
                    }
                }
                b4j.v = null;
                return a;
            }
            case 4: {
                final boolean x4 = this.x;
                if (x4) {
                    if (x4) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final zta zta = (zta)z;
                    final Object b4 = ((ot7)y).b;
                    this.x = true;
                    if ((o = zta.d(b4, (Object)this)) == o2) {
                        o = o2;
                    }
                }
                return o;
            }
            case 3: {
                final boolean x5 = this.x;
                Label_0708: {
                    if (x5) {
                        if (!x5) {
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            o2 = null;
                            return o2;
                        }
                        vt4.g0(o);
                    }
                    else {
                        vt4.g0(o);
                        if (((l7n)z).b()) {
                            break Label_0708;
                        }
                        final d58 w2 = d58.w;
                        final h80 h80 = new h80((byte)4, (f07)null, (Object)y);
                        this.x = true;
                        if ((o = rhc.f0((hc7)w2, (zta)h80, (f07)this)) == o2) {
                            return o2;
                        }
                    }
                    final boolean b5 = b2;
                    if (!(boolean)o) {
                        return b5;
                    }
                }
                final boolean b5 = true;
                o2 = b5;
                return o2;
            }
            case 2: {
                final boolean x6 = this.x;
                if (x6) {
                    if (x6) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        a = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final oc4 oc4 = (oc4)z;
                    if (y != null) {
                        b = true;
                    }
                    this.x = true;
                    o = ien.m((f07)this, (zta)new kb4(oc4, (f07)null, b));
                    if (o != o2) {
                        o = a;
                    }
                    if (o == o2) {
                        a = o2;
                    }
                }
                return a;
            }
            case 1: {
                final String s = (String)y;
                final er0 er0 = (er0)z;
                final boolean x7 = this.x;
                if (x7) {
                    if (x7) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final st4 d = er0.d;
                    final AppStartEvents$MaybeRefreshRefreshed appStartEvents$MaybeRefreshRefreshed = new AppStartEvents$MaybeRefreshRefreshed(s);
                    final KSerializer serializer = AppStartEvents$MaybeRefreshRefreshed.Companion.serializer();
                    vt4.b0(serializer);
                    d.b((v10)appStartEvents$MaybeRefreshRefreshed, (KSerializer)serializer);
                    this.x = true;
                    if ((o = er0.b(s, (h07)this)) == o2) {
                        o = o2;
                    }
                }
                return o;
            }
            case 0: {
                final boolean x8 = this.x;
                if (x8) {
                    if (x8) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final wfg g = ((rp0)z).g;
                    final String s2 = (String)y;
                    this.x = true;
                    if ((o = g.a(s2, "sdk", false, (f07)this)) == o2) {
                        o = o2;
                    }
                }
                return o;
            }
        }
    }
}
