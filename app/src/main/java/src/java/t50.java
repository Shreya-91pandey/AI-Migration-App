import android.os.BaseBundle;
import java.util.Collection;
import android.os.Bundle;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.View;
import android.os.Build$VERSION;
import java.util.List;
import android.os.Looper;
import android.os.Handler;
import java.util.ArrayList;
import androidx.compose.ui.platform.AndroidComposeView;
import android.view.View$OnAttachStateChangeListener;
import androidx.lifecycle.DefaultLifecycleObserver;

public final class t50 implements DefaultLifecycleObserver, View$OnAttachStateChangeListener
{
    public boolean A;
    public final mn2 B;
    public jlf C;
    public long D;
    public final jlf E;
    public atk F;
    public boolean G;
    public final m0 H;
    public final AndroidComposeView v;
    public final kr w;
    public vcc x;
    public final ArrayList y;
    public int z;
    
    public t50(final AndroidComposeView v, final kr w) {
        this.v = v;
        this.w = w;
        this.y = new ArrayList();
        this.z = 1;
        this.A = true;
        this.B = ao2.c(1, 0, 6);
        new Handler(Looper.getMainLooper());
        final jlf a = tgc.a;
        a.getClass();
        this.C = a;
        this.E = new jlf();
        this.F = new atk(v.getSemanticsOwner().a(), (sgc)a);
        this.H = new m0((Object)this, (byte)2);
    }
    
    public final Object a(final h07 h07) {
        Object o = null;
        Label_0047: {
            if (h07 instanceof s50) {
                final s50 s50 = (s50)h07;
                final int y = s50.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    s50.y = y + Integer.MIN_VALUE;
                    o = s50;
                    break Label_0047;
                }
            }
            o = new s50(this, h07);
        }
        Object o2 = ((s50)o).w;
        final int y2 = ((s50)o).y;
        final pc7 v = pc7.v;
        while (true) {
            en2 en2 = null;
            Label_0160: {
                Label_0133: {
                    if (y2 == 0) {
                        vt4.g0(o2);
                        en2 = new en2(this.B);
                        break Label_0133;
                    }
                    if (y2 == 1) {
                        en2 = ((s50)o).v;
                        vt4.g0(o2);
                        break Label_0160;
                    }
                    if (y2 != 2) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    en2 = ((s50)o).v;
                    vt4.g0(o2);
                    final s50 s51 = (s50)o;
                    o = s51;
                }
                ((s50)o).v = en2;
                ((s50)o).y = 1;
                o2 = en2.b((f07)o);
                if (o2 == v) {
                    return v;
                }
            }
            if (!(boolean)o2) {
                return lqo.a;
            }
            en2.c();
            if (this.d()) {
                this.e();
            }
            final Handler handler = ((View)this.v).getHandler();
            if (!this.G && handler != null) {
                this.G = true;
                handler.post((Runnable)this.H);
            }
            ((s50)o).v = en2;
            ((s50)o).y = 2;
            final s50 s51 = (s50)o;
            if (ach.A(100L, (f07)o) != v) {
                continue;
            }
            break;
        }
        return v;
    }
    
    public final void b(final sgc sgc) {
        final int[] b = sgc.b;
        final long[] a = sgc.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                final int n4 = 7;
                final long n5 = -9187201950435737472L;
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int n6 = 8;
                    final int n7 = 8 - (~(n2 - n) >>> 31);
                    int n23;
                    for (int i = 0; i < n7; i = n23) {
                        int n20;
                        int n21;
                        if ((n3 & 0xFFL) < 128L) {
                            final int n8 = b[(n2 << 3) + i];
                            final atk atk = (atk)((sgc)this.E).b(n8);
                            final btk btk = (btk)sgc.b(n8);
                            zsk a2;
                            if (btk != null) {
                                a2 = btk.a;
                            }
                            else {
                                a2 = null;
                            }
                            if (a2 == null) {
                                throw ge9.x("no value for specified key");
                            }
                            final int f = a2.f;
                            final tmf v = a2.d.v;
                            Label_0739: {
                                if (atk == null) {
                                    final Object[] b2 = v.b;
                                    final long[] a3 = v.a;
                                    final int n9 = a3.length - 2;
                                    if (n9 >= 0) {
                                        int n10 = 0;
                                        while (true) {
                                            final long n11 = a3[n10];
                                            final long n12 = n3;
                                            if ((~n11 << n4 & n11 & n5) != n5) {
                                                final int n13 = 8 - (~(n10 - n9) >>> 31);
                                                int j = 0;
                                                long n14 = n11;
                                                while (j < n13) {
                                                    if ((n14 & 0xFFL) < 128L) {
                                                        final htk htk = (htk)b2[(n10 << 3) + j];
                                                        final htk c = etk.C;
                                                        if (mlc.q((Object)htk, (Object)c)) {
                                                            Object g;
                                                            if ((g = v.g((Object)c)) == null) {
                                                                g = null;
                                                            }
                                                            final List list = (List)g;
                                                            og0 og0;
                                                            if (list != null) {
                                                                og0 = (og0)c86.I0(list);
                                                            }
                                                            else {
                                                                og0 = null;
                                                            }
                                                            this.h(f, String.valueOf((Object)og0));
                                                        }
                                                    }
                                                    n14 >>= n6;
                                                    ++j;
                                                }
                                                n3 = n12;
                                                if (n13 != n6) {
                                                    break;
                                                }
                                            }
                                            n3 = n12;
                                            if (n10 == n9) {
                                                break;
                                            }
                                            ++n10;
                                            n3 = n12;
                                            n6 = 8;
                                        }
                                    }
                                }
                                else {
                                    final long n15 = n3;
                                    final Object[] b3 = v.b;
                                    final long[] a4 = v.a;
                                    final int n16 = a4.length - 2;
                                    n3 = n15;
                                    if (n16 >= 0) {
                                        int n17 = 0;
                                        while (true) {
                                            long n18 = a4[n17];
                                            if ((~n18 << n4 & n18 & n5) != n5) {
                                                final int n19 = 8 - (~(n17 - n16) >>> 31);
                                                for (int k = 0; k < n19; ++k, n18 >>= 8) {
                                                    if ((n18 & 0xFFL) < 128L) {
                                                        final htk htk2 = (htk)b3[(n17 << 3) + k];
                                                        final htk c2 = etk.C;
                                                        if (mlc.q((Object)htk2, (Object)c2)) {
                                                            Object g2;
                                                            if ((g2 = atk.a.v.g((Object)c2)) == null) {
                                                                g2 = null;
                                                            }
                                                            final List list2 = (List)g2;
                                                            og0 og2;
                                                            if (list2 != null) {
                                                                og2 = (og0)c86.I0(list2);
                                                            }
                                                            else {
                                                                og2 = null;
                                                            }
                                                            Object g3;
                                                            if ((g3 = v.g((Object)c2)) == null) {
                                                                g3 = null;
                                                            }
                                                            final List list3 = (List)g3;
                                                            og0 og3;
                                                            if (list3 != null) {
                                                                og3 = (og0)c86.I0(list3);
                                                            }
                                                            else {
                                                                og3 = null;
                                                            }
                                                            if (!mlc.q((Object)og2, (Object)og3)) {
                                                                this.h(f, String.valueOf((Object)og3));
                                                            }
                                                        }
                                                    }
                                                }
                                                n20 = i;
                                                n3 = n15;
                                                if (n19 != 8) {
                                                    break Label_0739;
                                                }
                                            }
                                            n20 = i;
                                            n3 = n15;
                                            if (n17 == n16) {
                                                break Label_0739;
                                            }
                                            ++n17;
                                        }
                                    }
                                }
                                n20 = i;
                            }
                            n21 = 8;
                        }
                        else {
                            final int n22 = n6;
                            n20 = i;
                            n21 = n22;
                        }
                        n3 >>= n21;
                        n23 = n20 + 1;
                        n6 = n21;
                    }
                    if (n7 != n6) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
    }
    
    public final sgc c() {
        if (this.A) {
            this.A = false;
            this.C = ach.G(this.v.getSemanticsOwner(), (lta)new uz((byte)3));
            this.D = System.currentTimeMillis();
        }
        return (sgc)this.C;
    }
    
    public final boolean d() {
        return this.x != null;
    }
    
    public final void e() {
        final vcc x = this.x;
        if (x != null) {
            if (Build$VERSION.SDK_INT >= 29) {
                final ArrayList y = this.y;
                if (!y.isEmpty()) {
                    for (int size = y.size(), i = 0; i < size; ++i) {
                        final cx6 cx6 = (cx6)y.get(i);
                        final int d = ge9.D(cx6.c());
                        if (d != 0) {
                            if (d != 1) {
                                en9.r();
                                return;
                            }
                            final AutofillId v = x.v(cx6.a());
                            if (v != null && Build$VERSION.SDK_INT >= 29) {
                                bi0.l(zp6.g(x.x), v);
                            }
                        }
                        else {
                            final k3p b = cx6.b();
                            if (b != null) {
                                final ViewStructure l = b.l();
                                if (Build$VERSION.SDK_INT >= 29) {
                                    bi0.k(zp6.g(x.x), l);
                                }
                            }
                        }
                    }
                    if (Build$VERSION.SDK_INT >= 29) {
                        bi0.n(zp6.g(x.x), ((View)x.w).getAutofillId(), new long[] { Long.MIN_VALUE });
                    }
                    y.clear();
                }
            }
        }
    }
    
    public final void f(zsk zsk, final atk atk) {
        final t7 t7 = new t7((Object)atk, (Object)this, (byte)4);
        zsk.getClass();
        final List j = zsk.j(4, zsk);
        final int size = ((Collection)j).size();
        final int n = 0;
        int i = 0;
        int n2 = 0;
        while (i < size) {
            final Object value = j.get(i);
            final zsk zsk2 = (zsk)value;
            int n3 = n2;
            if (this.c().a(zsk2.f)) {
                ((zta)t7).d((Object)n2, value);
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        final List k = zsk.j(4, zsk);
        for (int size2 = ((Collection)k).size(), l = n; l < size2; ++l) {
            zsk = (zsk)k.get(l);
            final sgc c = this.c();
            final int f = zsk.f;
            if (c.a(f)) {
                final jlf e = this.E;
                if (((sgc)e).a(f)) {
                    final Object b = ((sgc)e).b(f);
                    if (b == null) {
                        throw ge9.x("node not present in pruned tree before this change");
                    }
                    this.f(zsk, (atk)b);
                }
            }
        }
    }
    
    public final void h(final int n, final String s) {
        if (Build$VERSION.SDK_INT >= 29) {
            final vcc x = this.x;
            if (x != null) {
                final AutofillId v = x.v(n);
                if (v != null) {
                    if (Build$VERSION.SDK_INT >= 29) {
                        bi0.m(zp6.g(x.x), v, s);
                    }
                    return;
                }
                throw ge9.x("Invalid content capture ID");
            }
        }
    }
    
    public final void i(int n, zsk zsk) {
        if (!this.d()) {
            return;
        }
        final tmf v = zsk.d.v;
        final Object g = v.g((Object)etk.E);
        final yxf yxf = null;
        Boolean b;
        if ((b = (Boolean)g) == null) {
            b = null;
        }
        final Boolean b2 = b;
        if (this.z == 1 && mlc.q((Object)b2, (Object)Boolean.TRUE)) {
            Object g2;
            if ((g2 = v.g((Object)rsk.m)) == null) {
                g2 = null;
            }
            final t3 t3 = (t3)g2;
            if (t3 != null) {
                final lta lta = (lta)t3.b;
                if (lta != null) {
                    final Boolean b3 = (Boolean)lta.b((Object)Boolean.FALSE);
                }
            }
        }
        else if (this.z == 2 && mlc.q((Object)b2, (Object)Boolean.FALSE)) {
            Object g3;
            if ((g3 = v.g((Object)rsk.m)) == null) {
                g3 = null;
            }
            final t3 t4 = (t3)g3;
            if (t4 != null) {
                final lta lta2 = (lta)t4.b;
                if (lta2 != null) {
                    final Boolean b4 = (Boolean)lta2.b((Object)Boolean.TRUE);
                }
            }
        }
        final int f = zsk.f;
        final vcc x = this.x;
        k3p k3p = null;
        Label_0877: {
            if (x != null) {
                if (Build$VERSION.SDK_INT >= 29) {
                    AutofillId autofillId = ((View)this.v).getAutofillId();
                    final zsk l = zsk.l();
                    final int f2 = zsk.f;
                    if (l == null || (autofillId = x.v(l.f)) != null) {
                        final long n2 = f2;
                        if (Build$VERSION.SDK_INT >= 29) {
                            k3p = new k3p((Object)bi0.j(zp6.g(x.x), autofillId, n2), (byte)1);
                        }
                        else {
                            k3p = null;
                        }
                        if (k3p != null) {
                            final tsk d = zsk.d;
                            final htk n3 = etk.N;
                            final tmf v2 = d.v;
                            if (!v2.c((Object)n3)) {
                                final Bundle a = k3p.a();
                                if (a != null) {
                                    ((BaseBundle)a).putLong("android.view.contentcapture.EventTimestamp", this.D);
                                    ((BaseBundle)a).putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", n);
                                }
                                Object g4;
                                if ((g4 = v2.g((Object)etk.A)) == null) {
                                    g4 = null;
                                }
                                final String s = (String)g4;
                                if (s != null) {
                                    k3p.i(f2, s);
                                }
                                Object g5;
                                if ((g5 = v2.g((Object)etk.n)) == null) {
                                    g5 = null;
                                }
                                if (g5 != null) {
                                    k3p.d("android.widget.ViewGroup");
                                }
                                Object g6;
                                if ((g6 = v2.g((Object)etk.C)) == null) {
                                    g6 = null;
                                }
                                final List list = (List)g6;
                                if (list != null) {
                                    k3p.d("android.widget.TextView");
                                    k3p.j((CharSequence)ald.a(list, "\n", (lta)null, 62));
                                }
                                Object g7;
                                if ((g7 = v2.g((Object)etk.G)) == null) {
                                    g7 = null;
                                }
                                final og0 og0 = (og0)g7;
                                if (og0 != null) {
                                    k3p.d("android.widget.EditText");
                                    k3p.j((CharSequence)og0);
                                }
                                Object g8;
                                if ((g8 = v2.g((Object)etk.a)) == null) {
                                    g8 = null;
                                }
                                final List list2 = (List)g8;
                                if (list2 != null) {
                                    k3p.e(ald.a(list2, "\n", (lta)null, 62));
                                }
                                Object g9;
                                if ((g9 = v2.g((Object)etk.z)) == null) {
                                    g9 = null;
                                }
                                final iuj iuj = (iuj)g9;
                                if (iuj != null) {
                                    final String f3 = omo.f0((int)iuj.a);
                                    if (f3 != null) {
                                        k3p.d(f3);
                                    }
                                }
                                final omn k = omo.K(d);
                                if (k != null) {
                                    final nmn a2 = k.a;
                                    final mnn b5 = a2.b;
                                    final xc8 g10 = a2.g;
                                    k3p.k(g10.o0() * (g10.getDensity() * vnn.c(b5.a.b)));
                                }
                                final yxf d2 = zsk.d();
                                k2j k2j = null;
                                Label_0835: {
                                    if (d2 != null) {
                                        yxf yxf2 = yxf;
                                        if (d2.h1().I) {
                                            yxf2 = d2;
                                        }
                                        if (yxf2 != null) {
                                            k2j = zsk.a(yxf2);
                                            break Label_0835;
                                        }
                                    }
                                    k2j = k2j.e;
                                }
                                final float a3 = k2j.a;
                                n = (int)a3;
                                final float b6 = k2j.b;
                                k3p.h(n, (int)b6, (int)(k2j.c - a3), (int)(k2j.d - b6));
                                break Label_0877;
                            }
                        }
                    }
                }
            }
            k3p = null;
        }
        if (k3p != null) {
            this.y.add((Object)new cx6(f, this.D, 1, k3p));
        }
        final List j = zsk.j(4, zsk);
        final int size = ((Collection)j).size();
        int i = 0;
        n = 0;
        while (i < size) {
            final Object value = j.get(i);
            zsk = (zsk)value;
            int n4 = n;
            if (this.c().a(zsk.f)) {
                this.i(n, (zsk)value);
                n4 = n + 1;
            }
            ++i;
            n = n4;
        }
    }
    
    public final void j(final zsk zsk) {
        if (this.d()) {
            this.y.add((Object)new cx6(zsk.f, this.D, 2, (k3p)null));
            final List j = zsk.j(4, zsk);
            for (int size = ((Collection)j).size(), i = 0; i < size; ++i) {
                this.j((zsk)j.get(i));
            }
        }
    }
    
    public final void k() {
        final jlf e = this.E;
        e.c();
        final sgc c = this.c();
        final int[] b = c.b;
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
                            final int n5 = (n2 << 3) + i;
                            e.i(b[n5], (Object)new atk(((btk)c2[n5]).a, this.c()));
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
        this.F = new atk(this.v.getSemanticsOwner().a(), this.c());
    }
    
    public final void onStart(final gbd gbd) {
        this.x = (vcc)this.w.a();
        this.i(-1, this.v.getSemanticsOwner().a());
        this.e();
    }
    
    public final void onStop(final gbd gbd) {
        this.j(this.v.getSemanticsOwner().a());
        this.e();
        this.x = null;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        final Handler handler = ((View)this.v).getHandler();
        handler.getClass();
        handler.removeCallbacks((Runnable)this.H);
        this.x = null;
    }
}
