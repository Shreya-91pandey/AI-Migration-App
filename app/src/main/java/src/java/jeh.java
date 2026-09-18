import java.util.Collection;
import android.view.MotionEvent;
import android.os.Build$VERSION;
import java.util.List;

public final class jeh
{
    public final List a;
    public final ms9 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;
    
    public jeh(final List a, final ms9 b) {
        this.a = a;
        this.b = b;
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n = 0;
        final int n2 = 0;
        int b2 = 0;
        Label_0051: {
            if (sdk_INT >= 29) {
                final MotionEvent a2 = this.a();
                if (a2 != null) {
                    b2 = m6b.b(a2);
                    break Label_0051;
                }
            }
            b2 = 0;
        }
        this.c = b2;
        final MotionEvent a3 = this.a();
        int buttonState;
        if (a3 != null) {
            buttonState = a3.getButtonState();
        }
        else {
            buttonState = 0;
        }
        this.d = buttonState;
        final MotionEvent a4 = this.a();
        int metaState;
        if (a4 != null) {
            metaState = a4.getMetaState();
        }
        else {
            metaState = 0;
        }
        this.e = metaState;
        final MotionEvent a5 = this.a();
        int f = 0;
        Label_0434: {
            Label_0335: {
                Label_0312: {
                    Label_0278: {
                        if (a5 != null) {
                            final boolean b3 = sdk_INT >= 34 && m6b.b(a5) == 3;
                            final boolean b4 = sdk_INT >= 34 && m6b.b(a5) == 5;
                            final int actionMasked = a5.getActionMasked();
                            Label_0298: {
                                Label_0287: {
                                    if (actionMasked != 0) {
                                        Label_0261: {
                                            Label_0250: {
                                                if (actionMasked != 1) {
                                                    while (true) {
                                                        Label_0317: {
                                                            if (actionMasked == 2) {
                                                                break Label_0317;
                                                            }
                                                            switch (actionMasked) {
                                                                default: {
                                                                    f = n;
                                                                    break Label_0434;
                                                                }
                                                                case 10: {
                                                                    f = 5;
                                                                    break Label_0434;
                                                                }
                                                                case 9: {
                                                                    f = 4;
                                                                    break Label_0434;
                                                                }
                                                                case 8: {
                                                                    f = 6;
                                                                    break Label_0434;
                                                                }
                                                                case 6: {
                                                                    if (b3) {
                                                                        break Label_0250;
                                                                    }
                                                                    if (b4) {
                                                                        break Label_0261;
                                                                    }
                                                                    if (b4) {
                                                                        break;
                                                                    }
                                                                    break Label_0278;
                                                                }
                                                                case 5: {
                                                                    if (b3) {
                                                                        break Label_0287;
                                                                    }
                                                                    if (b4) {
                                                                        break Label_0298;
                                                                    }
                                                                    if (b4) {
                                                                        break;
                                                                    }
                                                                    break Label_0312;
                                                                }
                                                                case 7: {
                                                                    break Label_0317;
                                                                }
                                                            }
                                                            f = 8;
                                                            break Label_0434;
                                                        }
                                                        if (b3) {
                                                            f = 11;
                                                            break Label_0434;
                                                        }
                                                        if (b4) {
                                                            continue;
                                                        }
                                                        break;
                                                    }
                                                    break Label_0335;
                                                }
                                                else if (!b3) {
                                                    if (b4 && !b4) {
                                                        break Label_0261;
                                                    }
                                                    break Label_0278;
                                                }
                                            }
                                            f = 12;
                                            break Label_0434;
                                        }
                                        f = 9;
                                        break Label_0434;
                                    }
                                    if (!b3) {
                                        if (b4 && !b4) {
                                            break Label_0298;
                                        }
                                        break Label_0312;
                                    }
                                }
                                f = 10;
                                break Label_0434;
                            }
                            f = 7;
                            break Label_0434;
                        }
                        for (int size = ((Collection)a).size(), i = n2; i < size; ++i) {
                            final peh peh = (peh)a.get(i);
                            if (i1r.h(peh)) {
                                break Label_0278;
                            }
                            if (i1r.f(peh)) {
                                break Label_0312;
                            }
                        }
                        break Label_0335;
                    }
                    f = 2;
                    break Label_0434;
                }
                f = 1;
                break Label_0434;
            }
            f = 3;
        }
        this.f = f;
    }
    
    public final MotionEvent a() {
        final ms9 b = this.b;
        if (b != null) {
            return ((sv9)b.c).r();
        }
        return null;
    }
}
