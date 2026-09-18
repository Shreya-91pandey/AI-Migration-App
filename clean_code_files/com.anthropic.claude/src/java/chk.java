import java.lang.reflect.AccessibleObject;
import android.view.View;
import java.lang.reflect.Method;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

public final class chk
{
    public mgk a;
    public w60 b;
    public gia c;
    public zhg d;
    public boolean e;
    public asf f;
    public final lgk g;
    public final jgk h;
    public boolean i;
    public byte j;
    public tfk k;
    public final ahk l;
    public final e0j m;
    
    public chk(final mgk a, final w60 b, final gia c, final zhg d, final boolean e, final asf f, final lgk g, final jgk h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = 1;
        this.k = dgk.a;
        this.l = new ahk(this);
        this.m = new e0j((Object)this, (byte)5);
    }
    
    public final Object a(final long v, final h07 h07) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof ygk) {
                final ygk ygk = (ygk)h07;
                final int y = ygk.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ygk.y = y + Integer.MIN_VALUE;
                    o = ygk;
                    break Label_0054;
                }
            }
            o = new ygk(this, h07);
        }
        final Object w = ((ygk)o).w;
        final int y2 = ((ygk)o).y;
        Label_0183: {
            if (y2 != 0) {
                if (y2 == 1) {
                    final a4j v2 = ((ygk)o).v;
                    try {
                        vt4.g0(w);
                        break Label_0183;
                    }
                    finally {
                        break Label_0183;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(w);
            final Object v3 = new Object();
            ((a4j)v3).v = v;
            this.i = true;
            try {
                final lnf v4 = lnf.v;
                try {
                    final zgk zgk = new zgk(this, (a4j)v3, v, (f07)null);
                    ((ygk)o).v = (a4j)v3;
                    ((ygk)o).y = 1;
                    final Object g = this.g(v4, (zta)zgk, (h07)o);
                    final pc7 v5 = pc7.v;
                    if (g == v5) {
                        return v5;
                    }
                    final a4j a4j = (a4j)v3;
                    this.i = false;
                    return f7p.a(a4j.v);
                }
                finally {}
            }
            finally {}
        }
        this.i = false;
    }
    
    public final boolean b() {
        if (!this.a.d() && !this.a.c()) {
            final w60 b = this.b;
            if (b == null || !b.e()) {
                return false;
            }
        }
        return true;
    }
    
    public final Object c(long b, final boolean b2, final m6n m6n) {
        if (b2) {
            final gia c = this.c;
            final agk a = dgk.a;
            if (c instanceof p48) {
                return lqo.a;
            }
        }
        int n;
        if (this.d == zhg.w) {
            n = 1;
        }
        else {
            n = 2;
        }
        b = f7p.b(b, 0.0f, 0.0f, n);
        final bhk bhk = new bhk(this, (f07)null);
        final w60 b3 = this.b;
        final pc7 v = pc7.v;
        if (b3 != null && this.b()) {
            final Object b4 = b3.b(b, (zta)bhk, (h07)m6n);
            if (b4 == v) {
                return b4;
            }
        }
        else {
            final Object d = bhk.d((Object)f7p.a(b), (Object)m6n);
            if (d == v) {
                return d;
            }
        }
        return lqo.a;
    }
    
    public final long d(final tfk tfk, long n, final int n2) {
        final fsf a = this.f.a;
        final fsf fsf = null;
        fsf p3;
        if (a != null) {
            p3 = a.p1();
        }
        else {
            p3 = null;
        }
        final long n3 = 0L;
        long a2;
        if (p3 != null) {
            a2 = p3.a0(n2, n);
        }
        else {
            a2 = 0L;
        }
        long n4 = l6g.h(n, a2);
        if (this.d == zhg.w) {
            n = l6g.a(0.0f, 1, n4);
        }
        else {
            n = l6g.a(0.0f, 2, n4);
        }
        final long f = this.f(this.i(tfk.b(this.h(this.f(n)))));
        final lgk g = this.g;
        while (true) {
            if (!((hgf)g).I) {
                break Label_0185;
            }
            final ViewTreeObserver viewTreeObserver = ((View)soh.M((t98)g)).getViewTreeObserver();
            try {
                Method i1;
                if ((i1 = AndroidComposeView.i1) == null) {
                    i1 = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", (Class<?>[])null);
                    ((AccessibleObject)i1).setAccessible(true);
                    AndroidComposeView.i1 = i1;
                }
                i1.invoke((Object)viewTreeObserver, (Object[])null);
                n4 = l6g.h(n4, f);
                final fsf a3 = this.f.a;
                fsf p4 = fsf;
                if (a3 != null) {
                    p4 = a3.p1();
                }
                n = n3;
                if (p4 != null) {
                    n = p4.K(f, n2, n4);
                }
                return l6g.i(l6g.i(a2, f), n);
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public final float e(final float n) {
        float n2 = n;
        if (this.e) {
            n2 = n * -1.0f;
        }
        return n2;
    }
    
    public final long f(final long n) {
        if (this.e) {
            return l6g.j(-1.0f, n);
        }
        return n;
    }
    
    public final Object g(final lnf lnf, final zta zta, final h07 h07) {
        final Object b = this.a.b(lnf, (zta)new jzg((Object)this, (Object)zta, (f07)null, (byte)21), (f07)h07);
        if (b == pc7.v) {
            return b;
        }
        return lqo.a;
    }
    
    public final float h(long n) {
        if (this.d == zhg.w) {
            n >>= 32;
        }
        else {
            n &= 0xFFFFFFFFL;
        }
        return Float.intBitsToFloat((int)n);
    }
    
    public final long i(final float n) {
        if (n == 0.0f) {
            return 0L;
        }
        if (this.d == zhg.w) {
            return (long)Float.floatToRawIntBits(n) << 32 | ((long)Float.floatToRawIntBits(0.0f) & 0xFFFFFFFFL);
        }
        return ((long)Float.floatToRawIntBits(n) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(0.0f) << 32;
    }
    
    public final float j(final long n) {
        final int n2 = (int)(0xFFFFFFFFL & n);
        final float abs = Math.abs(Float.intBitsToFloat(n2));
        final int n3 = (int)(n >> 32);
        final double n4 = (float)Math.atan2((double)abs, (double)Math.abs(Float.intBitsToFloat(n3)));
        final zhg d = this.d;
        if (n4 >= 0.7853981633974483) {
            if (d == zhg.v) {
                return Float.intBitsToFloat(n2);
            }
            return 0.0f;
        }
        else {
            if (d == zhg.w) {
                return Float.intBitsToFloat(n3);
            }
            return 0.0f;
        }
    }
}
