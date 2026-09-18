import java.util.Iterator;
import android.os.Build$VERSION;
import java.util.List;
import android.view.ViewGroup;
import android.view.View;
import android.view.Window;

public final class r19 extends q19
{
    @Override
    public void b(final w7n w7n, final w7n w7n2, final Window window, final View view, final boolean b, final boolean b2) {
        boolean b3 = false;
        c5q.L(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        final int a = w7n.a(b);
        final int a2 = w7n2.a(b2);
        ViewGroup viewGroup;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup)view;
        }
        else {
            viewGroup = null;
        }
        Label_0391: {
            if (viewGroup != null) {
                for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                    final View child = viewGroup.getChildAt(i);
                    if (child == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    final Object tag = child.getTag();
                    if (tag instanceof List) {
                        final List list = (List)tag;
                        if (list.size() == 4 && list.get(0) instanceof p86) {
                            for (final Object next : (Iterable)tag) {
                                p86 p6;
                                if (next instanceof p86) {
                                    p6 = (p86)next;
                                }
                                else {
                                    p6 = null;
                                }
                                if (p6 != null) {
                                    final p86 p7 = (p86)next;
                                    final int a3 = p7.a();
                                    if (a3 != 1) {
                                        if (a3 != 2) {
                                            if (a3 != 4) {
                                                if (a3 != 8) {
                                                    continue;
                                                }
                                                p7.b(a2);
                                            }
                                            else {
                                                p7.b(a2);
                                            }
                                        }
                                        else {
                                            p7.b(a);
                                        }
                                    }
                                    else {
                                        p7.b(a2);
                                    }
                                }
                            }
                            break Label_0391;
                        }
                    }
                }
                if (a != 0 || a2 != 0) {
                    final List y = lq6.Y(new p86(2, a), new p86(1, a2), new p86(4, a2), new p86(8, a2));
                    final hdi hdi = new hdi(((View)view).getContext(), y);
                    ((View)hdi).setTag((Object)y);
                    viewGroup.addView((View)hdi);
                }
            }
        }
        if (w7n2.c == 0) {
            b3 = true;
        }
        d40.o(window, b3);
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object o;
        if (sdk_INT >= 35) {
            o = new j2q(window);
        }
        else if (sdk_INT >= 30) {
            o = new j2q(window);
        }
        else {
            o = new i2q(window);
        }
        ((ljq)o).Y(b ^ true);
        ((ljq)o).X(b2 ^ true);
    }
}
