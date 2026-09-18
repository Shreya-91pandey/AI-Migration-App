import java.util.concurrent.atomic.AtomicBoolean;

public final class xs7 extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public Object y;
    public final zta z;
    
    public xs7(final f07 f07, final zta z) {
        this.w = 1;
        this.z = z;
        super(2, f07);
    }
    
    public final f07 create(final Object y, final f07 f07) {
        switch (this.w) {
            default: {
                final xs7 xs7 = new xs7(this.z, f07, (byte)4);
                xs7.y = y;
                return (f07)xs7;
            }
            case 3: {
                final xs7 xs8 = new xs7(this.z, f07, (byte)3);
                xs8.y = y;
                return (f07)xs8;
            }
            case 2: {
                final xs7 xs9 = new xs7(this.z, f07, (byte)2);
                xs9.y = y;
                return (f07)xs9;
            }
            case 1: {
                final xs7 xs10 = new xs7(f07, this.z);
                xs10.y = y;
                return (f07)xs10;
            }
            case 0: {
                final xs7 xs11 = new xs7(this.z, f07, (byte)0);
                xs11.y = y;
                return (f07)xs11;
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                return ((xs7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 3: {
                return ((xs7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 2: {
                return ((xs7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 1: {
                return ((xs7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((xs7)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final zta z = this.z;
        Object v = pc7.v;
        switch (w) {
            default: {
                final boolean x = this.x;
                Object o2;
                if (x) {
                    if (x) {
                        vt4.g0(o);
                        o2 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o2 = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final oc7 oc7 = (oc7)this.y;
                    this.x = true;
                    o2 = a;
                    if (z.d((Object)oc7, (Object)this) == v) {
                        o2 = v;
                    }
                }
                return o2;
            }
            case 3: {
                final mmf mmf = (mmf)this.y;
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
                    this.y = null;
                    this.x = true;
                    if ((o = z.d((Object)mmf, (Object)this)) == v) {
                        return v;
                    }
                }
                v = o;
                ((pc7)v).getClass();
                ((AtomicBoolean)((mmf)v).b.w).set(true);
                return v;
            }
            case 2: {
                final d7c d7c = (d7c)this.y;
                final boolean x3 = this.x;
                if (x3) {
                    if (x3) {
                        vt4.g0(o);
                        return a;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    vt4.g0(o);
                    if (!mlc.q((Object)d7c, (Object)c7c.a) && !mlc.q((Object)d7c, (Object)b7c.a)) {
                        en9.r();
                    }
                    else {
                        final ph9 ph9 = new ph9(2131757323, 0, (fa4)null, (ai9)null, 14);
                        this.y = null;
                        this.x = true;
                        Object o3 = a;
                        if (z.d((Object)ph9, (Object)this) == v) {
                            o3 = v;
                            return o3;
                        }
                        return o3;
                    }
                }
                return null;
            }
            case 1: {
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
                    final zdo zdo = (zdo)this.y;
                    zdo.getClass();
                    final spi spi = (spi)zdo;
                    final xs7 xs7 = new xs7(z, null, (byte)0);
                    this.x = true;
                    if ((o = spi.b(xs7, (f07)this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
            case 0: {
                final boolean x5 = this.x;
                if (x5) {
                    if (x5) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final t2k t2k = (t2k)this.y;
                    this.x = true;
                    if ((o = z.d((Object)t2k, (Object)this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
        }
    }
}
