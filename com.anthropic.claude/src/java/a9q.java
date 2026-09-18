import androidx.compose.ui.platform.AndroidComposeView;

public final class a9q extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public final b9q y;
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final b9q y = this.y;
        switch (w) {
            default: {
                return (f07)new a9q(y, f07, (byte)1);
            }
            case 0: {
                return (f07)new a9q(y, f07, (byte)0);
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
                return ((a9q)this.create(oc7, f07)).invokeSuspend(a);
            }
            case 0: {
                return ((a9q)this.create(oc7, f07)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final b9q y = this.y;
        final lqo lqo = null;
        final lqo lqo2 = null;
        final pc7 v = pc7.v;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                final boolean x = this.x;
                if (x) {
                    if (!x) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return lqo2;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final AndroidComposeView v2 = y.v;
                    this.x = true;
                    o = v2.S.a((h07)this);
                    if (o != v) {
                        o = a;
                    }
                    if (o == v) {
                        return v;
                    }
                }
                return a;
            }
            case 0: {
                final boolean x2 = this.x;
                if (x2) {
                    if (!x2) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return lqo;
                    }
                    vt4.g0(o);
                }
                else {
                    vt4.g0(o);
                    final AndroidComposeView v3 = y.v;
                    this.x = true;
                    o = v3.R.l((h07)this);
                    if (o != v) {
                        o = a;
                    }
                    if (o == v) {
                        return v;
                    }
                }
                return a;
            }
        }
    }
}
