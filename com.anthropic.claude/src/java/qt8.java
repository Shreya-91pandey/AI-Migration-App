import java.util.ArrayList;

public final class qt8 extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public final llf y;
    public final bnf z;
    
    public final f07 create(final Object o, final f07 f07) {
        switch (this.w) {
            default: {
                return (f07)new qt8(this.y, this.z, f07, (byte)2);
            }
            case 1: {
                return (f07)new qt8(this.y, this.z, f07, (byte)1);
            }
            case 0: {
                return (f07)new qt8(this.y, this.z, f07, (byte)0);
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final oc7 oc7 = (oc7)o;
        final f07 f07 = (f07)o2;
        switch (w) {
            default: {
                return ((qt8)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 1: {
                return ((qt8)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((qt8)this.create(oc7, f07)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final bnf z = this.z;
        final llf y = this.y;
        final lqo lqo = null;
        final lqo lqo2 = null;
        final lqo lqo3 = null;
        final lqo a = lqo.a;
        final pc7 v = pc7.v;
        switch (w) {
            default: {
                final boolean x = this.x;
                lqo lqo4;
                if (x) {
                    if (x) {
                        vt4.g0(o);
                        lqo4 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        lqo4 = lqo3;
                    }
                }
                else {
                    vt4.g0(o);
                    final ArrayList list = new ArrayList();
                    final bsl a2 = y.a;
                    final pt8 pt8 = new pt8(list, z, (byte)2);
                    this.x = true;
                    a2.a((jja)pt8, (f07)this);
                    lqo4 = (lqo)v;
                }
                return lqo4;
            }
            case 1: {
                final boolean x2 = this.x;
                lqo lqo5;
                if (x2) {
                    if (x2) {
                        vt4.g0(o);
                        lqo5 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        lqo5 = lqo;
                    }
                }
                else {
                    vt4.g0(o);
                    final ArrayList list2 = new ArrayList();
                    final bsl a3 = y.a;
                    final pt8 pt9 = new pt8(list2, z, (byte)1);
                    this.x = true;
                    a3.a((jja)pt9, (f07)this);
                    lqo5 = (lqo)v;
                }
                return lqo5;
            }
            case 0: {
                final boolean x3 = this.x;
                Object o2;
                if (x3) {
                    if (x3) {
                        vt4.g0(o);
                        o2 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o2 = lqo2;
                    }
                }
                else {
                    vt4.g0(o);
                    final ArrayList list3 = new ArrayList();
                    final bsl a4 = y.a;
                    final pt8 pt10 = new pt8(list3, z, (byte)0);
                    this.x = true;
                    a4.a((jja)pt10, (f07)this);
                    o2 = v;
                }
                return o2;
            }
        }
    }
}
