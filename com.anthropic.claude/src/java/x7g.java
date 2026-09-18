import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

public final class x7g implements OnBackAnimationCallback
{
    public final v7g a;
    
    public x7g(final v7g a) {
        this.a = a;
    }
    
    public final void onBackCancelled() {
        final v7g a = this.a;
        final c2l a2 = a.a;
        if (a2 != null) {
            if (!a.b) {
                a2.v((frf)a, (brf)null);
            }
            final grf grf = (grf)a2.x;
            if (a.equals(grf.h)) {
                if (-1 == grf.g) {
                    drf drf;
                    if ((drf = grf.f) == null) {
                        drf = grf.c(-1);
                    }
                    grf.f = null;
                    grf.g = 0;
                    grf.h = null;
                    if (drf != null) {
                        drf.a();
                    }
                    grf.a.n((Object)null, (Object)hrf.d);
                }
            }
            a.b = false;
            return;
        }
        en9.q("This input is not added to any dispatcher.");
    }
    
    public final void onBackInvoked() {
        this.a.a();
    }
    
    public final void onBackProgressed(final BackEvent backEvent) {
        final brf c = z9r.c(backEvent);
        final v7g a = this.a;
        final c2l a2 = a.a;
        if (a2 != null) {
            if (a.b) {
                final grf grf = (grf)a2.x;
                if (a.equals(grf.h)) {
                    if (-1 == grf.g) {
                        drf drf;
                        if ((drf = grf.f) == null) {
                            drf = grf.c(-1);
                        }
                        if (drf != null) {
                            drf.c(c);
                        }
                        grf.a.n((Object)null, (Object)new irf(c));
                    }
                }
            }
            return;
        }
        en9.q("This input is not added to any dispatcher.");
    }
    
    public final void onBackStarted(final BackEvent backEvent) {
        final brf c = z9r.c(backEvent);
        final v7g a = this.a;
        final c2l a2 = a.a;
        if (a2 != null) {
            if (!a.b) {
                a2.v((frf)a, c);
                a.b = true;
            }
            return;
        }
        en9.q("This input is not added to any dispatcher.");
    }
}
