import java.util.WeakHashMap;
import android.view.View;

public final class wah implements ccb
{
    public final View a;
    
    public wah(final View a) {
        this.a = a;
    }
    
    @Override
    public final void a(int f) {
        final int n = 16;
        if (dcb.b(f, 16)) {
            f = n;
        }
        else {
            final int n2 = 6;
            if (dcb.b(f, 6)) {
                f = n2;
            }
            else {
                final int n3 = 13;
                if (dcb.b(f, 13)) {
                    f = n3;
                }
                else {
                    final int n4 = 23;
                    if (dcb.b(f, 23)) {
                        f = n4;
                    }
                    else {
                        final int n5 = 3;
                        if (dcb.b(f, 3)) {
                            f = n5;
                        }
                        else {
                            final int n6 = 0;
                            if (dcb.b(f, 0)) {
                                f = n6;
                            }
                            else {
                                final int n7 = 17;
                                if (dcb.b(f, 17)) {
                                    f = n7;
                                }
                                else {
                                    final int n8 = 27;
                                    if (dcb.b(f, 27)) {
                                        f = n8;
                                    }
                                    else {
                                        final int n9 = 26;
                                        if (dcb.b(f, 26)) {
                                            f = n9;
                                        }
                                        else {
                                            final int n10 = 9;
                                            if (dcb.b(f, 9)) {
                                                f = n10;
                                            }
                                            else {
                                                final int n11 = 22;
                                                if (dcb.b(f, 22)) {
                                                    f = n11;
                                                }
                                                else {
                                                    final int n12 = 21;
                                                    if (dcb.b(f, 21)) {
                                                        f = n12;
                                                    }
                                                    else {
                                                        final int n13 = 1;
                                                        if (dcb.b(f, 1)) {
                                                            f = n13;
                                                        }
                                                        else {
                                                            f = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        final WeakHashMap a = gap.a;
        f = t3r.f(f);
        if (f == -1) {
            return;
        }
        this.a.performHapticFeedback(f);
    }
}
