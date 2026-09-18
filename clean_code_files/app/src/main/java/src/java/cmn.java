import java.lang.ref.Reference;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import android.os.Build$VERSION;
import androidx.compose.ui.platform.AndroidComposeView;
import android.graphics.Rect;
import java.util.ArrayList;
import android.view.View;

public final class cmn implements tbh
{
    public final View a;
    public final zn0 b;
    public final n40 c;
    public boolean d;
    public lta e;
    public lta f;
    public mln g;
    public y4c h;
    public final ArrayList i;
    public final d2d j;
    public Rect k;
    public final mr7 l;
    public final inf m;
    public m0 n;
    
    public cmn(final View a, final AndroidComposeView androidComposeView, final n40 c) {
        final Object b = new Object();
        ((zn0)b).v = a;
        ((zn0)b).w = ncq.F(3, (jta)new h87(b, (byte)21));
        final Object x = new Object();
        if (Build$VERSION.SDK_INT >= 30) {
            final hdk v = new hdk((Object)a);
            ((bam)v).w = a;
            ((gfk)x).v = v;
        }
        else {
            ((gfk)x).v = new hdk((Object)a);
        }
        ((zn0)b).x = x;
        this.a = a;
        this.b = (zn0)b;
        this.c = c;
        this.e = (lta)new jkn((byte)2);
        this.f = (lta)new jkn((byte)3);
        this.g = new mln("", dnn.b, 4);
        this.h = y4c.g;
        this.i = new ArrayList();
        this.j = ncq.F(3, (jta)new wfk((Object)this, (byte)17));
        this.l = new mr7(androidComposeView, (zn0)b);
        this.m = new inf(0, (Object[])new bmn[16]);
    }
    
    @Override
    public final void a() {
        this.i(bmn.v);
    }
    
    @Override
    public final void b() {
        this.i(bmn.x);
    }
    
    @Override
    public final void c() {
        this.d = false;
        this.e = (lta)new pin((byte)1);
        this.f = (lta)new pin((byte)2);
        this.k = null;
        this.i(bmn.w);
    }
    
    @Override
    public final void d(final mln g, final y4c h, final z6n e, final gb7 f) {
        this.d = true;
        this.g = g;
        this.h = h;
        this.e = (lta)e;
        this.f = (lta)f;
        this.i(bmn.v);
    }
    
    @Override
    public final void e(final mln j, final o6g l, final omn k, final gwb m, final k2j n, final k2j o) {
        final mr7 i = this.l;
        final Object c;
        monitorenter(c = i.c);
        Label_0090: {
            Label_0086: {
                try {
                    i.j = j;
                    i.l = l;
                    i.k = k;
                    i.m = (lta)m;
                    i.n = n;
                    i.o = o;
                    if (!i.e) {
                        if (!i.d) {
                            break Label_0086;
                        }
                    }
                }
                finally {
                    break Label_0090;
                }
                i.a();
            }
            monitorexit(c);
            return;
        }
        monitorexit(c);
    }
    
    @Override
    public final void f(final mln mln, final mln g) {
        final boolean c = dnn.c(this.g.b, g.b);
        final int n = 0;
        final boolean b = !c || !mlc.q((Object)this.g.c, (Object)g.c);
        this.g = g;
        for (int size = this.i.size(), i = 0; i < size; ++i) {
            final w1j w1j = (w1j)((Reference)this.i.get(i)).get();
            if (w1j != null) {
                w1j.d(g);
            }
        }
        final mr7 l = this.l;
        final Object c2 = l.c;
        synchronized (c2) {
            l.j = null;
            l.l = null;
            l.k = null;
            l.m = (lta)ng6.x;
            l.n = null;
            l.o = null;
            monitorexit(c2);
            if (mlc.q((Object)mln, (Object)g)) {
                if (b) {
                    final zn0 b2 = this.b;
                    final int g2 = dnn.g(g.b);
                    final int f = dnn.f(g.b);
                    final dnn c3 = this.g.c;
                    int f2 = -1;
                    int g3;
                    if (c3 != null) {
                        g3 = dnn.g(c3.a);
                    }
                    else {
                        g3 = -1;
                    }
                    final dnn c4 = this.g.c;
                    if (c4 != null) {
                        f2 = dnn.f(c4.a);
                    }
                    ((InputMethodManager)((d2d)b2.w).getValue()).updateSelection((View)b2.v, g2, f, g3, f2);
                }
            }
            else {
                if (mln != null && (!mlc.q((Object)mln.a.w, (Object)g.a.w) || (dnn.c(mln.b, g.b) && !mlc.q((Object)mln.c, (Object)g.c)))) {
                    final zn0 b3 = this.b;
                    ((InputMethodManager)((d2d)b3.w).getValue()).restartInput((View)b3.v);
                    return;
                }
                for (int size2 = this.i.size(), j = n; j < size2; ++j) {
                    final w1j w1j2 = (w1j)((Reference)this.i.get(j)).get();
                    if (w1j2 != null) {
                        w1j2.e(this.g, this.b);
                    }
                }
            }
        }
    }
    
    @Override
    public final void g() {
        this.i(bmn.y);
    }
    
    @Override
    public final void h(final k2j k2j) {
        this.k = new Rect(k8e.H(k2j.a), k8e.H(k2j.b), k8e.H(k2j.c), k8e.H(k2j.d));
        if (this.i.isEmpty()) {
            final Rect k = this.k;
            if (k != null) {
                this.a.requestRectangleOnScreen(new Rect(k));
            }
        }
    }
    
    public final void i(final bmn bmn) {
        this.m.b((Object)bmn);
        if (this.n == null) {
            final m0 n = new m0((Object)this, (byte)11);
            this.c.execute((Runnable)n);
            this.n = n;
        }
    }
}
