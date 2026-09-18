import androidx.compose.ui.platform.AndroidComposeView;
import android.view.View;
import android.view.translation.ViewTranslationCallback;

public final class i50 implements ViewTranslationCallback
{
    public static final i50 a;
    
    static {
        a = (i50)new Object();
    }
    
    public final boolean onClearTranslation(final View view) {
        view.getClass();
        final t50 contentCaptureManager$ui = ((AndroidComposeView)view).getContentCaptureManager$ui();
        contentCaptureManager$ui.z = 1;
        final sgc c = contentCaptureManager$ui.c();
        final Object[] c2 = c.c;
        final long[] a = c.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final tmf v = ((btk)c2[(n2 << 3) + i]).a.d.v;
                            final Object g = v.g((Object)etk.E);
                            final t3 t3 = null;
                            Object o;
                            if ((o = g) == null) {
                                o = null;
                            }
                            if (o != null) {
                                Object g2 = v.g((Object)rsk.n);
                                if (g2 == null) {
                                    g2 = t3;
                                }
                                final t3 t4 = (t3)g2;
                                if (t4 != null) {
                                    final jta jta = (jta)t4.b;
                                    if (jta != null) {
                                        final Boolean b = (Boolean)jta.a();
                                    }
                                }
                            }
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        return true;
    }
    
    public final boolean onHideTranslation(final View view) {
        view.getClass();
        final t50 contentCaptureManager$ui = ((AndroidComposeView)view).getContentCaptureManager$ui();
        contentCaptureManager$ui.z = 1;
        final sgc c = contentCaptureManager$ui.c();
        final Object[] c2 = c.c;
        final long[] a = c.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final tmf v = ((btk)c2[(n2 << 3) + i]).a.d.v;
                            final Object g = v.g((Object)etk.E);
                            final t3 t3 = null;
                            Object o;
                            if ((o = g) == null) {
                                o = null;
                            }
                            if (mlc.q(o, (Object)Boolean.TRUE)) {
                                Object g2 = v.g((Object)rsk.m);
                                if (g2 == null) {
                                    g2 = t3;
                                }
                                final t3 t4 = (t3)g2;
                                if (t4 != null) {
                                    final lta lta = (lta)t4.b;
                                    if (lta != null) {
                                        final Boolean b = (Boolean)lta.b((Object)Boolean.FALSE);
                                    }
                                }
                            }
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        return true;
    }
    
    public final boolean onShowTranslation(final View view) {
        view.getClass();
        final t50 contentCaptureManager$ui = ((AndroidComposeView)view).getContentCaptureManager$ui();
        contentCaptureManager$ui.z = 2;
        final sgc c = contentCaptureManager$ui.c();
        final Object[] c2 = c.c;
        final long[] a = c.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final tmf v = ((btk)c2[(n2 << 3) + i]).a.d.v;
                            final Object g = v.g((Object)etk.E);
                            final t3 t3 = null;
                            Object o;
                            if ((o = g) == null) {
                                o = null;
                            }
                            if (mlc.q(o, (Object)Boolean.FALSE)) {
                                Object g2 = v.g((Object)rsk.m);
                                if (g2 == null) {
                                    g2 = t3;
                                }
                                final t3 t4 = (t3)g2;
                                if (t4 != null) {
                                    final lta lta = (lta)t4.b;
                                    if (lta != null) {
                                        final Boolean b = (Boolean)lta.b((Object)Boolean.TRUE);
                                    }
                                }
                            }
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        return true;
    }
}
