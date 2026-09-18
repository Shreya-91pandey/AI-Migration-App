import androidx.lifecycle.DefaultLifecycleObserver;

public final class q58 implements cbd
{
    public final byte v;
    public final Object w;
    public final Object x;
    
    public q58(final DefaultLifecycleObserver w, final cbd x) {
        this.v = 0;
        this.w = w;
        this.x = x;
    }
    
    public q58(final y7g w, final d8g d8g, final vad x) {
        this.v = 1;
        this.w = w;
        this.x = x;
    }
    
    @Override
    public final void g(final gbd gbd, final rad rad) {
        final byte v = this.v;
        final Object x = this.x;
        final Object w = this.w;
        switch (v) {
            default: {
                final y7g y7g = (y7g)w;
                final int n = c8g.a[((Enum)rad).ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n == 3) {
                            y7g.e();
                            ((vad)x).d((fbd)this);
                        }
                    }
                    else {
                        y7g.g(false);
                    }
                }
                else {
                    y7g.g(true);
                }
                return;
            }
            case 0: {
                final DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver)w;
                switch (p58.a[((Enum)rad).ordinal()]) {
                    default: {
                        en9.r();
                        return;
                    }
                    case 7: {
                        en9.s("ON_ANY must not been send by anybody");
                        return;
                    }
                    case 6: {
                        defaultLifecycleObserver.onDestroy(gbd);
                        break;
                    }
                    case 5: {
                        defaultLifecycleObserver.onStop(gbd);
                        break;
                    }
                    case 4: {
                        defaultLifecycleObserver.onPause(gbd);
                        break;
                    }
                    case 3: {
                        defaultLifecycleObserver.onResume(gbd);
                        break;
                    }
                    case 2: {
                        defaultLifecycleObserver.onStart(gbd);
                        break;
                    }
                    case 1: {
                        defaultLifecycleObserver.onCreate(gbd);
                        break;
                    }
                }
                final cbd cbd = (cbd)x;
                if (cbd != null) {
                    cbd.g(gbd, rad);
                }
            }
        }
    }
}
