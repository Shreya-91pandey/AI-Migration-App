import java.lang.reflect.AccessibleObject;
import java.util.Objects;
import android.util.Log;
import android.os.Build$VERSION;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import android.view.Display;
import android.graphics.Point;
import android.view.View;
import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class v1q extends e2q
{
    public static boolean n;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public dec[] d;
    public dec e;
    public h2q f;
    public dec g;
    public int h;
    public pp8 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;
    
    public v1q(final h2q h2q, final WindowInsets c) {
        super(h2q);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = c;
    }
    
    public v1q(final h2q h2q, final v1q v1q) {
        this(h2q, new WindowInsets(v1q.c));
    }
    
    private pp8 D(final View view) {
        if (view == null) {
            return null;
        }
        final Display display = view.getDisplay();
        if (display == null) {
            return null;
        }
        final Point point = new Point();
        display.getRealSize(point);
        if (super.a.a.t()) {
            return pp8.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        int a = 0;
        final mvj m = q8r.m(display, 0);
        final mvj i = q8r.m(display, 1);
        final mvj j = q8r.m(display, 2);
        final mvj k = q8r.m(display, 3);
        final int x = point.x;
        final int y = point.y;
        int a2;
        if (m != null) {
            a2 = m.a();
        }
        else {
            a2 = 0;
        }
        int a3;
        if (i != null) {
            a3 = i.a();
        }
        else {
            a3 = 0;
        }
        int a4;
        if (j != null) {
            a4 = j.a();
        }
        else {
            a4 = 0;
        }
        if (k != null) {
            a = k.a();
        }
        return pp8.a(x, y, false, a2, a3, a4, a);
    }
    
    private static List<Rect> E(final Rect[][] array, final int n) {
        Object[] array2 = null;
        for (int i = 1; i <= 512; i <<= 1) {
            if ((n & i) != 0x0) {
                final Rect[] array3 = array[ncq.D(i)];
                if (array3 != null) {
                    if (array2 == null) {
                        array2 = array3;
                    }
                    else {
                        final Rect[] array4 = new Rect[array2.length + array3.length];
                        System.arraycopy((Object)array2, 0, (Object)array4, 0, array2.length);
                        System.arraycopy((Object)array3, 0, (Object)array4, array2.length, array3.length);
                        array2 = array4;
                    }
                }
            }
        }
        if (array2 == null) {
            return (List<Rect>)Collections.EMPTY_LIST;
        }
        return (List<Rect>)Arrays.asList(array2);
    }
    
    private Rect[] F(final dec dec) {
        final ArrayList list = new ArrayList();
        final int a = dec.a;
        final int d = dec.d;
        final int c = dec.c;
        final int b = dec.b;
        if (a != 0) {
            list.add((Object)new Rect(0, 0, dec.a, this.j));
        }
        if (b != 0) {
            list.add((Object)new Rect(0, 0, this.k, b));
        }
        if (c != 0) {
            final int k = this.k;
            list.add((Object)new Rect(k - c, 0, k, this.j));
        }
        if (d != 0) {
            final int j = this.j;
            list.add((Object)new Rect(0, j - d, this.k, j));
        }
        return (Rect[])list.toArray((Object[])new Rect[list.size()]);
    }
    
    private dec G(final int n, final boolean b) {
        dec dec = dec.e;
        for (int i = 1; i <= 512; i <<= 1) {
            if ((n & i) != 0x0) {
                dec = dec.a(dec, this.H(i, b));
            }
        }
        return dec;
    }
    
    private dec I() {
        final h2q f = this.f;
        if (f != null) {
            return f.a.l();
        }
        return dec.e;
    }
    
    private dec J(final View view) {
        if (Build$VERSION.SDK_INT < 30) {
            if (!v1q.n) {
                L();
            }
            final Method o = v1q.o;
            if (o != null && v1q.p != null) {
                if (v1q.q != null) {
                    Label_0121: {
                        Object invoke;
                        try {
                            invoke = o.invoke((Object)view, (Object[])null);
                            if (invoke == null) {
                                Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", (Throwable)new NullPointerException());
                                return null;
                            }
                        }
                        catch (final ReflectiveOperationException ex) {
                            break Label_0121;
                        }
                        final Rect rect = (Rect)v1q.q.get(v1q.r.get(invoke));
                        if (rect != null) {
                            return dec.c(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    }
                    final StringBuilder sb = new StringBuilder("Failed to get visible insets. (Reflection error). ");
                    final ReflectiveOperationException ex;
                    sb.append(((Throwable)ex).getMessage());
                    Log.e("WindowInsetsCompat", sb.toString(), (Throwable)ex);
                }
            }
            return null;
        }
        oyl.s("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        return null;
    }
    
    private static void L() {
        try {
            v1q.o = View.class.getDeclaredMethod("getViewRootImpl", (Class<?>[])null);
            v1q.q = (v1q.p = Class.forName("android.view.View$AttachInfo")).getDeclaredField("mVisibleInsets");
            v1q.r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            ((AccessibleObject)v1q.q).setAccessible(true);
            ((AccessibleObject)v1q.r).setAccessible(true);
        }
        catch (final ReflectiveOperationException ex) {
            final StringBuilder sb = new StringBuilder("Failed to get visible insets. (Reflection error). ");
            sb.append(((Throwable)ex).getMessage());
            Log.e("WindowInsetsCompat", sb.toString(), (Throwable)ex);
        }
        v1q.n = true;
    }
    
    public static boolean M(final int n, final int n2) {
        return (n & 0x6) == (n2 & 0x6);
    }
    
    @Override
    public void A(final int h) {
        this.h = h;
    }
    
    @Override
    public void B(final Rect[][] array) {
        Objects.requireNonNull((Object)array);
        this.l = array.clone();
    }
    
    @Override
    public void C(final Rect[][] array) {
        Objects.requireNonNull((Object)array);
        this.m = array.clone();
    }
    
    public dec H(int n, final boolean b) {
        final dec e = dec.e;
        int f = 0;
        if (n != 1) {
            dec l = null;
            final dec dec = null;
            if (n != 2) {
                if (n != 8) {
                    if (n == 16) {
                        return this.m();
                    }
                    if (n == 32) {
                        return this.k();
                    }
                    if (n == 64) {
                        return this.o();
                    }
                    if (n == 128) {
                        final h2q f2 = this.f;
                        yo8 yo8;
                        if (f2 != null) {
                            yo8 = f2.a.h();
                        }
                        else {
                            yo8 = this.h();
                        }
                        if (yo8 != null) {
                            final int sdk_INT = Build$VERSION.SDK_INT;
                            if (sdk_INT >= 28) {
                                n = zh0.g(yo8.a);
                            }
                            else {
                                n = 0;
                            }
                            int i;
                            if (sdk_INT >= 28) {
                                i = zh0.i(yo8.a);
                            }
                            else {
                                i = 0;
                            }
                            int h;
                            if (sdk_INT >= 28) {
                                h = zh0.h(yo8.a);
                            }
                            else {
                                h = 0;
                            }
                            if (sdk_INT >= 28) {
                                f = zh0.f(yo8.a);
                            }
                            return dec.c(n, i, h, f);
                        }
                    }
                }
                else {
                    final dec[] d = this.d;
                    dec dec2 = dec;
                    if (d != null) {
                        dec2 = d[ncq.D(8)];
                    }
                    if (dec2 != null) {
                        return dec2;
                    }
                    final dec n2 = this.n();
                    final dec j = this.I();
                    n = n2.d;
                    if (n > j.d) {
                        return dec.c(0, 0, 0, n);
                    }
                    final dec g = this.g;
                    if (g != null && !g.equals(e)) {
                        n = this.g.d;
                        if (n > j.d) {
                            return dec.c(0, 0, 0, n);
                        }
                    }
                }
            }
            else {
                if (b) {
                    final dec k = this.I();
                    final dec m = this.l();
                    return dec.c(Math.max(k.a, m.a), 0, Math.max(k.c, m.c), Math.max(k.d, m.d));
                }
                if ((this.h & 0x2) == 0x0) {
                    final dec n3 = this.n();
                    final h2q f3 = this.f;
                    if (f3 != null) {
                        l = f3.a.l();
                    }
                    final int n4 = n = n3.d;
                    if (l != null) {
                        n = Math.min(n4, l.d);
                    }
                    return dec.c(n3.a, 0, n3.c, n);
                }
            }
        }
        else {
            if (b) {
                return dec.c(0, Math.max(this.I().b, this.n().b), 0, 0);
            }
            if ((this.h & 0x4) == 0x0) {
                return dec.c(0, this.n().b, 0, 0);
            }
        }
        return e;
    }
    
    public boolean K(final int n) {
        if (n != 1 && n != 2) {
            if (n == 4) {
                return false;
            }
            if (n != 8 && n != 128) {
                return true;
            }
        }
        return this.H(n, false).equals(dec.e) ^ true;
    }
    
    @Override
    public void d(final View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        dec dec;
        if ((dec = this.J(view)) == null) {
            dec = dec.e;
        }
        this.x(dec);
    }
    
    @Override
    public void e(final h2q h2q) {
        h2q.a.y(this.f);
        final dec g = this.g;
        final e2q a = h2q.a;
        a.x(g);
        a.A(this.h);
        a.v(this.i);
        a.B(this.l);
        a.C(this.m);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!super.equals(o)) {
            return false;
        }
        final v1q v1q = (v1q)o;
        return Objects.equals((Object)this.g, (Object)v1q.g) && M(this.h, v1q.h);
    }
    
    @Override
    public List<Rect> f(final int n) {
        return E(this.l, n);
    }
    
    @Override
    public List<Rect> g(final int n) {
        return E(this.m, n);
    }
    
    @Override
    public dec i(final int n) {
        return this.G(n, false);
    }
    
    @Override
    public dec j(final int n) {
        return this.G(n, true);
    }
    
    @Override
    public final dec n() {
        dec e;
        if ((e = this.e) == null) {
            final WindowInsets c = this.c;
            e = dec.c(c.getSystemWindowInsetLeft(), c.getSystemWindowInsetTop(), c.getSystemWindowInsetRight(), c.getSystemWindowInsetBottom());
            this.e = e;
        }
        return e;
    }
    
    @Override
    public void p(final View view) {
        this.i = this.D(view);
    }
    
    @Override
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            final int d = ncq.D(i);
            this.l[d] = this.F(this.i(i));
            if (i != 8) {
                this.m[d] = this.F(this.j(i));
            }
        }
    }
    
    @Override
    public h2q r(final int n, final int n2, final int n3, final int n4) {
        final h2q c = h2q.c(this.c, null);
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object o;
        if (sdk_INT >= 36) {
            o = new t1q(c);
        }
        else if (sdk_INT >= 35) {
            o = new s1q(c);
        }
        else if (sdk_INT >= 34) {
            o = new r1q(c);
        }
        else if (sdk_INT >= 31) {
            o = new q1q(c);
        }
        else if (sdk_INT >= 30) {
            o = new p1q(c);
        }
        else if (sdk_INT >= 29) {
            o = new o1q(c);
        }
        else {
            o = new m1q(c);
        }
        ((u1q)o).h(h2q.a(this.n(), n, n2, n3, n4));
        ((u1q)o).f(h2q.a(this.l(), n, n2, n3, n4));
        return ((u1q)o).b();
    }
    
    @Override
    public boolean t() {
        return this.c.isRound();
    }
    
    @Override
    public boolean u(final int n) {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((n & i) != 0x0) {
                if (!this.K(i)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public void v(final pp8 i) {
        this.i = i;
    }
    
    @Override
    public void w(final dec[] d) {
        this.d = d;
    }
    
    @Override
    public void x(final dec g) {
        this.g = g;
    }
    
    @Override
    public void y(final h2q f) {
        this.f = f;
    }
}
