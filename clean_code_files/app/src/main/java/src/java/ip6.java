import java.util.List;

public final class ip6 extends m6n implements lta
{
    public final byte w;
    public byte x;
    public Object y;
    public final Object z;
    
    public ip6(final pw1 z, final f07 f07) {
        this.w = 0;
        this.z = z;
        super(1, f07);
    }
    
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final f07 f07 = (f07)o;
        switch (w) {
            default: {
                return ((ip6)this.create(f07)).invokeSuspend(a);
            }
            case 1: {
                return ((ip6)this.create(f07)).invokeSuspend(a);
            }
            case 0: {
                return ((ip6)this.create(f07)).invokeSuspend(a);
            }
        }
    }
    
    public final f07 create(final f07 f07) {
        final byte w = this.w;
        final Object z = this.z;
        switch (w) {
            default: {
                return (f07)new ip6(this.y, z, f07, (byte)2);
            }
            case 1: {
                return (f07)new ip6(this.y, z, f07, (byte)1);
            }
            case 0: {
                return (f07)new ip6((pw1)z, f07);
            }
        }
    }
    
    public final Object invokeSuspend(Object y) {
        final byte w = this.w;
        final Object z = this.z;
        Object o = pc7.v;
        switch (w) {
            default: {
                final rv7 rv7 = (rv7)this.y;
                final byte x = this.x;
                if (x != 0) {
                    if (x != 1) {
                        if (x == 2) {
                            vt4.g0(y);
                            return y;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        y = null;
                        return y;
                    }
                    else {
                        vt4.g0(y);
                    }
                }
                else {
                    vt4.g0(y);
                    this.x = 1;
                    y = null;
                }
                final yci yci = (yci)y;
                final uvo uvo = (uvo)((f07)this).getContext().M0((gc7)cib.D);
                if (uvo != null) {
                    uvo.a(rv7);
                }
                final uvo uvo2 = new uvo(uvo, rv7);
                final o10 o2 = new o10(rv7, (zta)z, yci, (f07)null);
                this.x = 2;
                if ((y = rhc.f0((hc7)uvo2, (zta)o2, (f07)this)) == o) {
                    y = o;
                }
                return y;
            }
            case 1: {
                final uy7 uy7 = (uy7)this.y;
                final rv7 rv8 = (rv7)z;
                final byte x2 = this.x;
                Label_0381: {
                    if (x2 != 0) {
                        if (x2 == 1) {
                            vt4.g0(y);
                            break Label_0381;
                        }
                        if (x2 != 2) {
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            o = null;
                            return o;
                        }
                        vt4.g0(y);
                    }
                    else {
                        vt4.g0(y);
                        final uu7 uu7 = new uu7(rv8, null, (byte)0);
                        final List list = (List)uy7.y;
                        if (list != null && !list.isEmpty()) {
                            final ozl c = rv8.c();
                            final xu7 xu7 = new xu7(rv8, uu7, uy7, null);
                            this.x = 2;
                            if ((y = c.b((lta)xu7, (h07)this)) == o) {
                                return o;
                            }
                        }
                        else {
                            this.x = 1;
                            if ((y = rv8.f(false, (zta)uu7, (h07)this)) == o) {
                                return o;
                            }
                            break Label_0381;
                        }
                    }
                    final ot7 ot7 = (ot7)y;
                    return rv8.h.E((vom)ot7);
                }
                final ot7 ot7 = (ot7)y;
                o = rv8.h.E((vom)ot7);
                return o;
            }
            case 0: {
                final byte x3 = this.x;
                if (x3 != 0) {
                    if (x3 != 1) {
                        if (x3 == 2) {
                            final Object y2 = this.y;
                            vt4.g0(y);
                            y = y2;
                            return y;
                        }
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        y = null;
                        return y;
                    }
                    else {
                        vt4.g0(y);
                    }
                }
                else {
                    vt4.g0(y);
                    final pw1 pw1 = (pw1)z;
                    this.x = 1;
                    if ((y = pw1.b((Object)this)) == o) {
                        y = o;
                        return y;
                    }
                }
                final t2k t2k = (t2k)y;
                this.y = y;
                this.x = 2;
                ncq.x(t2k, "PRAGMA query_only = 1");
                if (lqo.a == o) {
                    y = o;
                }
                return y;
            }
        }
    }
}
