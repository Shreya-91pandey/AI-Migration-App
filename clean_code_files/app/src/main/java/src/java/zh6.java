import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.ref.WeakReference;
import android.view.ViewTreeObserver$OnWindowFocusChangeListener;
import android.content.ComponentCallbacks;
import android.util.Log;
import android.view.ViewParent;
import java.util.Set;
import androidx.compose.ui.platform.AndroidComposeView;
import android.content.Context;
import android.view.ViewConfiguration;
import android.content.res.Configuration;
import android.view.View;

public final class zh6
{
    public final View a;
    public boolean b;
    public tl6 c;
    public gbd d;
    public j9k e;
    public ycp f;
    public final r4c g;
    public final umj h;
    public final Configuration i;
    public final bnf j;
    public final x30 k;
    public final jc0 l;
    public final jmq m;
    public final y45 n;
    public final qna o;
    public final bnf p;
    public final ccb q;
    public final mc0 r;
    public final k0d s;
    public final n6d t;
    public final a23 u;
    public int v;
    public final p1 w;
    public xa0 x;
    public final yh6 y;
    
    public zh6(final zh6 zh6, final View a, final tl6 c, final gbd d, final j9k e, final ycp f) {
        final View view = null;
        Context context;
        if (zh6 != null) {
            context = zh6.a.getContext();
        }
        else {
            context = null;
        }
        final boolean q = mlc.q((Object)context, (Object)a.getContext());
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        r4c g;
        if (q) {
            zh6.getClass();
            g = zh6.g;
        }
        else {
            g = new r4c();
        }
        this.g = g;
        umj h;
        if (zh6 != null) {
            h = zh6.h;
        }
        else {
            h = new umj();
        }
        this.h = h;
        Configuration i;
        if (q) {
            zh6.getClass();
            i = zh6.i;
        }
        else {
            i = new Configuration(a.getContext().getResources().getConfiguration());
        }
        this.i = i;
        Object j;
        if (q) {
            zh6.getClass();
            j = zh6.j;
        }
        else {
            j = o50.Q((Object)new Configuration(i));
        }
        this.j = (bnf)j;
        x30 k;
        if (q) {
            zh6.getClass();
            k = zh6.k;
        }
        else {
            k = new x30(a.getContext());
        }
        this.k = k;
        jc0 l;
        if (q) {
            zh6.getClass();
            l = zh6.l;
        }
        else {
            l = new jc0(a.getContext());
        }
        this.l = l;
        jmq m;
        if (q) {
            zh6.getClass();
            m = zh6.m;
        }
        else {
            m = new jmq(a.getContext(), (byte)2);
        }
        this.m = m;
        y45 n;
        if (q) {
            zh6.getClass();
            n = zh6.n;
        }
        else {
            n = new j40(m);
        }
        this.n = n;
        Object o;
        if (q) {
            zh6.getClass();
            o = zh6.o;
        }
        else {
            a.getContext();
            o = new cib((byte)10);
        }
        this.o = (qna)o;
        Object p6;
        if (q) {
            zh6.getClass();
            p6 = zh6.p;
        }
        else {
            p6 = new ksg((Object)k8e.p(a.getContext()), (q8m)awp.H);
        }
        this.p = (bnf)p6;
        View a2 = view;
        if (zh6 != null) {
            a2 = zh6.a;
        }
        Object q2;
        if (a == a2) {
            q2 = zh6.q;
        }
        else {
            q2 = new wah(a);
        }
        this.q = (ccb)q2;
        mc0 r;
        if (q) {
            zh6.getClass();
            r = zh6.r;
        }
        else {
            r = new mc0(ViewConfiguration.get(a.getContext()));
        }
        this.r = r;
        k0d s;
        if (zh6 != null) {
            s = zh6.s;
        }
        else {
            s = new k0d();
        }
        this.s = s;
        this.t = new n6d();
        a23 u;
        if (zh6 != null) {
            u = zh6.u;
        }
        else {
            u = new a23();
        }
        this.u = u;
        this.w = new p1((Object)this, (byte)26);
        this.y = new yh6(this);
    }
    
    public final void a(final AndroidComposeView androidComposeView, final ye6 ye6, final gva gva, final int n) {
        gva.i0(123858079);
        int n2;
        if (gva.h((Object)androidComposeView)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)ye6)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)this)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        final int n5 = n2 | n | n3 | n4;
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            final Object tag = ((View)androidComposeView).getTag(2131296992);
            final boolean b = tag instanceof Set;
            final Set set = null;
            Set set2;
            if (b && (!(tag instanceof stc) || tag instanceof xtc)) {
                set2 = (Set)tag;
            }
            else {
                set2 = null;
            }
            Label_0257: {
                if (set2 == null) {
                    final ViewParent parent = ((View)androidComposeView).getParent();
                    View view;
                    if (parent instanceof View) {
                        view = (View)parent;
                    }
                    else {
                        view = null;
                    }
                    Object tag2;
                    if (view != null) {
                        tag2 = view.getTag(2131296992);
                    }
                    else {
                        tag2 = null;
                    }
                    set2 = set;
                    if (tag2 instanceof Set) {
                        if (tag2 instanceof stc) {
                            set2 = set;
                            if (!(tag2 instanceof xtc)) {
                                break Label_0257;
                            }
                        }
                        set2 = (Set)tag2;
                    }
                }
            }
            if (set2 != null) {
                set2.add((Object)gva.z());
                gva.q = true;
                gva.C = true;
                gva.c.d();
                gva.H.d();
                final y5m i = gva.I;
                final v5m a = i.a;
                i.e = a.E;
                i.f = a.F;
            }
            final boolean f = gva.f((Object)androidComposeView.getView());
            final Object r = gva.R();
            final cib a2 = bi6.a;
            Object o;
            if (f || (o = r) == a2) {
                androidComposeView.getView();
                o = new Object();
                gva.q0(o);
            }
            final tdp tdp = (tdp)o;
            final ffi a3 = uod.a.a((Object)this.d());
            final sei a4 = cpd.a;
            this.g();
            final j9k e = this.e;
            e.getClass();
            final ffi a5 = a4.a((Object)e);
            final ffi a6 = q50.d.a((Object)this.g);
            final ffi a7 = q50.e.a((Object)this.h);
            final b09 w = hm6.w;
            final boolean h = gva.h((Object)this);
            final Object r2 = gva.R();
            Object o2;
            if (h || (o2 = r2) == a2) {
                o2 = new i1((Object)this, (byte)20);
                gva.q0(o2);
            }
            final ffi c = ((sei)w).c((lta)o2);
            final ffi a8 = q50.b.a((Object)((View)androidComposeView).getContext());
            final ffi a9 = oec.a.a((Object)set2);
            final ffi a10 = q50.a.a((Object)androidComposeView.getConfiguration());
            final b09 a11 = w8k.a;
            final boolean h2 = gva.h((Object)androidComposeView);
            final Object r3 = gva.R();
            Object o3;
            if (h2 || (o3 = r3) == a2) {
                o3 = new k40(androidComposeView, (byte)3);
                gva.q0(o3);
            }
            final ffi c2 = ((sei)a11).c((lta)o3);
            final ffi a12 = q50.f.a((Object)androidComposeView.getView());
            final b09 y = hm6.y;
            final boolean h3 = gva.h((Object)androidComposeView);
            final Object r4 = gva.R();
            Object o4;
            if (h3 || (o4 = r4) == a2) {
                o4 = new k40(androidComposeView, (byte)4);
                gva.q0(o4);
            }
            c5q.d(new ffi[] { a3, a5, a6, a7, c, a8, a9, a10, c2, a12, ((sei)y).c((lta)o4), hm6.u.a((Object)androidComposeView.getViewConfiguration()), emb.a.a((Object)tdp) }, (zta)uuj.t0(1317454175, (aua)new xh6(androidComposeView, this, ye6), gva), gva, 56);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new xh6(this, androidComposeView, ye6, n);
        }
    }
    
    public final void b() {
        final int v = this.v - 1;
        this.v = v;
        int n = v;
        if (v < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            n = 0;
            this.v = 0;
        }
        if (n == 0) {
            final View a = this.a;
            final Context context = a.getContext();
            final yh6 y = this.y;
            context.unregisterComponentCallbacks((ComponentCallbacks)y);
            final n6d t = this.t;
            if (t.b == null) {
                t.a = null;
            }
            a.getViewTreeObserver().removeOnWindowFocusChangeListener((ViewTreeObserver$OnWindowFocusChangeListener)y);
        }
    }
    
    public final tl6 c() {
        this.g();
        final tl6 c = this.c;
        c.getClass();
        return c;
    }
    
    public final gbd d() {
        this.g();
        final gbd d = this.d;
        d.getClass();
        return d;
    }
    
    public final void e() {
        final int v = this.v + 1;
        this.v = v;
        if (v == 1) {
            final View a = this.a;
            final Context context = a.getContext();
            final yh6 y = this.y;
            context.registerComponentCallbacks((ComponentCallbacks)y);
            this.f(a.getResources().getConfiguration());
            final boolean hasWindowFocus = a.hasWindowFocus();
            final n6d t = this.t;
            t.c.setValue((Object)hasWindowFocus);
            final ksg b = t.b;
            final p1 w = this.w;
            if (b == null) {
                t.a = (jta)w;
            }
            if (b != null) {
                b.setValue(w.a());
            }
            a.getViewTreeObserver().addOnWindowFocusChangeListener((ViewTreeObserver$OnWindowFocusChangeListener)y);
        }
    }
    
    public final void f(final Configuration configuration) {
        final int update = this.i.updateFrom(configuration);
        if (update != 0) {
            final Iterator iterator = this.g.a.entrySet().iterator();
            while (iterator.hasNext()) {
                final p4c p4c = (p4c)((Reference)((Map$Entry)iterator.next()).getValue()).get();
                if (p4c == null || Configuration.needNewResources(update, p4c.b)) {
                    iterator.remove();
                }
            }
            this.j.setValue((Object)new Configuration(configuration));
            final umj h = this.h;
            synchronized (h) {
                h.a.c();
                monitorexit(h);
                if ((0x10000000 & update) != 0x0) {
                    this.p.setValue((Object)k8e.p(this.a.getContext()));
                }
                if ((0x2FFF1D80 & update) != 0x0) {
                    final n6d t = this.t;
                    final p1 w = this.w;
                    final ksg b = t.b;
                    if (b != null) {
                        b.setValue(w.a());
                    }
                }
            }
        }
    }
    
    public final void g() {
        if (!this.b) {
            this.b = true;
            final tl6 c = this.c;
            final View a = this.a;
            if (c == null) {
                tl6 tl6 = b3q.a(a);
                tl6 tl7;
                if (tl6 != null) {
                    tl7 = tl6;
                }
                else {
                    ViewParent viewParent = a.getParent();
                    while (true) {
                        tl7 = tl6;
                        if (tl6 != null) {
                            break;
                        }
                        tl7 = tl6;
                        if (!(viewParent instanceof View)) {
                            break;
                        }
                        final View view = (View)viewParent;
                        tl6 = b3q.a(view);
                        viewParent = soh.z(view);
                    }
                }
                Object b;
                if ((b = tl7) == null) {
                    b = b3q.b(a);
                }
                this.c = (tl6)b;
            }
            if (this.d == null) {
                final gbd y = eqi.Y(a);
                if (y == null) {
                    en9.q("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                    return;
                }
                this.d = y;
            }
            if (this.e == null) {
                final j9k h0 = uuj.h0(a);
                if (h0 == null) {
                    en9.q("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                    return;
                }
                this.e = h0;
            }
            if (this.f == null) {
                this.f = r6k.t(a);
            }
        }
    }
}
