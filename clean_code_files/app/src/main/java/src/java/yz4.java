import android.content.Context;

public final class yz4 extends m6n implements lta
{
    public final byte w;
    public boolean x;
    public final Object y;
    
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final f07 f07 = (f07)o;
        switch (w) {
            default: {
                return ((yz4)this.create(f07)).invokeSuspend(a);
            }
            case 3: {
                return ((yz4)this.create(f07)).invokeSuspend(a);
            }
            case 2: {
                return ((yz4)this.create(f07)).invokeSuspend(a);
            }
            case 1: {
                return ((yz4)this.create(f07)).invokeSuspend(a);
            }
            case 0: {
                return ((yz4)this.create(f07)).invokeSuspend(a);
            }
        }
    }
    
    public final f07 create(final f07 f07) {
        final byte w = this.w;
        final Object y = this.y;
        switch (w) {
            default: {
                return (f07)new yz4((byte)4, f07, y);
            }
            case 3: {
                return (f07)new yz4((byte)3, f07, y);
            }
            case 2: {
                return (f07)new yz4((byte)2, f07, y);
            }
            case 1: {
                return (f07)new yz4((byte)1, f07, y);
            }
            case 0: {
                return (f07)new yz4((byte)0, f07, y);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final Object y = this.y;
        final Object o2 = null;
        final pc7 v = pc7.v;
        switch (w) {
            default: {
                final boolean x = this.x;
                if (x) {
                    if (x) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final Context context = (Context)y;
                    this.x = true;
                    if ((o = czp.f.B(context, (h07)this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
            case 3: {
                final sfh sfh = (sfh)y;
                final boolean x2 = this.x;
                if (x2) {
                    if (!x2) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = o2;
                        return o;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final lta b = sfh.b;
                    this.x = true;
                    if ((o = b.b((Object)this)) == v) {
                        o = v;
                        return o;
                    }
                }
                o = new dq6((t2k)o);
                return o;
            }
            case 2: {
                final boolean x3 = this.x;
                if (x3) {
                    if (x3) {
                        vt4.g0(o);
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final n2b n2b = (n2b)y;
                    this.x = true;
                    if ((o = n2b.c((h07)this)) == v) {
                        o = v;
                    }
                }
                return o;
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
                    final h2b h2b = (h2b)((i2b)y).a.getValue();
                    this.x = true;
                    if ((o = h2b.a("sdk", false, (f07)this)) == v) {
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
                    final d05 d05 = (d05)y;
                    this.x = true;
                    if ((o = d05.f("flags", (h07)this)) == v) {
                        o = v;
                    }
                }
                return o;
            }
        }
    }
}
