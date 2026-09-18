import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import android.content.Context;

public final class khn extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public final Object y;
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final Object y = this.y;
        switch (w) {
            default: {
                return (f07)new khn((byte)8, f07, y);
            }
            case 7: {
                return (f07)new khn((byte)7, f07, y);
            }
            case 6: {
                final khn khn = new khn((byte)6, f07, y);
                khn.x = (boolean)o;
                return (f07)khn;
            }
            case 5: {
                return (f07)new khn((byte)5, f07, y);
            }
            case 4: {
                return (f07)new khn((byte)4, f07, y);
            }
            case 3: {
                return (f07)new khn((byte)3, f07, y);
            }
            case 2: {
                return (f07)new khn((byte)2, f07, y);
            }
            case 1: {
                return (f07)new khn((byte)1, f07, y);
            }
            case 0: {
                return (f07)new khn((byte)0, f07, y);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                return ((khn)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 7: {
                return ((khn)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 6: {
                final Boolean b = (Boolean)o;
                b.booleanValue();
                ((khn)this.create(b, (f07)o2)).invokeSuspend(a);
                return a;
            }
            case 5: {
                return ((khn)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 4: {
                return ((khn)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 3: {
                return ((khn)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 2: {
                return ((khn)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 1: {
                return ((khn)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((khn)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        Object v = pc7.v;
        final lqo a = lqo.a;
        final Object y = this.y;
        switch (w) {
            default: {
                final f4p f4p = (f4p)y;
                final boolean x = this.x;
                if (x) {
                    if (!x) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                        return v;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final n6k a2 = ljq.a0((jta)new wfk((Object)f4p, (byte)23));
                    final wb0 wb0 = new wb0(f4p, (byte)27);
                    this.x = true;
                    if (a2.a((jja)wb0, (f07)this) == v) {
                        return v;
                    }
                }
                v = a;
                return v;
            }
            case 7: {
                final boolean x2 = this.x;
                if (x2) {
                    if (!x2) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                        return v;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final ko7 ko7 = (ko7)y;
                    this.x = true;
                    if (ko7.e((h07)this) == v) {
                        return v;
                    }
                }
                v = a;
                return v;
            }
            case 6: {
                vt4.g0(o);
                tmg.a((Context)y, (Class)RescheduleReceiver.class, this.x);
                return a;
            }
            case 5: {
                final boolean x3 = this.x;
                if (x3) {
                    if (!x3) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                        return v;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final dho dho = (dho)y;
                    this.x = true;
                    if (dho.f((h07)this) == v) {
                        return v;
                    }
                }
                v = a;
                return v;
            }
            case 4: {
                final m1o m1o = (m1o)y;
                final boolean x4 = this.x;
                if (x4) {
                    if (!x4) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                        return v;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final n6k a3 = ljq.a0((jta)new l1o(m1o, (byte)4));
                    final wb0 wb2 = new wb0(m1o, (byte)25);
                    this.x = true;
                    if (a3.a((jja)wb2, (f07)this) == v) {
                        return v;
                    }
                }
                v = a;
                return v;
            }
            case 3: {
                final boolean x5 = this.x;
                if (x5) {
                    if (!x5) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                        return v;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final vqn vqn = (vqn)y;
                    this.x = true;
                    if (vqn.c((h07)this) == v) {
                        return v;
                    }
                }
                v = a;
                return v;
            }
            case 2: {
                final boolean x6 = this.x;
                if (x6) {
                    if (x6) {
                        vt4.g0(o);
                        v = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final ted ted = (ted)y;
                    this.x = true;
                    ted.getClass();
                    ted.a.a.a((jja)new hb4(new emf(), ted, (byte)5), (f07)this);
                }
                return v;
            }
            case 1: {
                final boolean x7 = this.x;
                if (x7) {
                    if (!x7) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                        return v;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final ykn n = ((yhn)y).N;
                    this.x = true;
                    if (n.F((h07)this) == v) {
                        return v;
                    }
                }
                v = a;
                return v;
            }
            case 0: {
                final mhn mhn = (mhn)y;
                final boolean x8 = this.x;
                if (x8) {
                    if (!x8) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        v = null;
                        return v;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    o = new Object();
                    ((z3j)o).v = 1;
                    final n6k a4 = ljq.a0((jta)new kkk((Object)mhn, o, (byte)6));
                    final eme eme = new eme(mhn, (f07)null);
                    this.x = true;
                    if (x90.r((ija)a4, (zta)eme, (f07)this) == v) {
                        return v;
                    }
                }
                v = a;
                return v;
            }
        }
    }
}
