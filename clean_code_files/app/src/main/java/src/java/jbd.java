import java.lang.ref.Reference;
import android.os.Looper;
import java.util.HashMap;
import java.lang.reflect.Constructor;
import java.util.List;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class jbd extends vad
{
    public final boolean b;
    public zn0 c;
    public final xzj d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public tad i;
    public final apm j;
    
    public jbd(final gbd gbd, final boolean b) {
        this.b = b;
        this.c = new zn0((byte)22);
        final Object d = new Object();
        ((xzj)d).v = new WeakReference((Object)gbd);
        this.d = (xzj)d;
        this.h = new ArrayList();
        final tad w = tad.w;
        this.i = w;
        this.j = bpm.a((Object)w);
    }
    
    @Override
    public final void a(final fbd fbd) {
        this.f("addObserver");
        final tad i = this.i;
        tad a = tad.v;
        if (i != a) {
            a = tad.w;
        }
        final Object o = new Object();
        ((ibd)o).a = a;
        final HashMap a2 = ubd.a;
        final boolean b = fbd instanceof cbd;
        final boolean b2 = fbd instanceof DefaultLifecycleObserver;
        final ibd ibd = null;
        boolean b3 = false;
        Object b4;
        if (b && b2) {
            b4 = new q58((DefaultLifecycleObserver)fbd, (cbd)fbd);
        }
        else if (b2) {
            b4 = new q58((DefaultLifecycleObserver)fbd, (cbd)null);
        }
        else if (b) {
            b4 = fbd;
        }
        else {
            final Class<? extends fbd> class1 = fbd.getClass();
            if (ubd.b(class1) == 2) {
                final Object value = ubd.b.get((Object)class1);
                value.getClass();
                final List list = (List)value;
                if (list.size() == 1) {
                    ubd.a((Constructor)list.get(0), fbd);
                    throw null;
                }
                final int size = list.size();
                final hwa[] array = new hwa[size];
                if (size > 0) {
                    ubd.a((Constructor)list.get(0), fbd);
                    throw null;
                }
                b4 = new ll6(array);
            }
            else {
                b4 = new g7d(fbd);
            }
        }
        ((ibd)o).b = (cbd)b4;
        final zn0 c = this.c;
        final tmf tmf = (tmf)c.v;
        final x4a x4a = (x4a)tmf.g((Object)fbd);
        ibd w;
        if (x4a != null) {
            w = x4a.w;
        }
        else {
            final x4a x4a2 = new x4a(fbd, (ibd)o);
            tmf.m((Object)fbd, (Object)x4a2);
            final x4a y = (x4a)c.x;
            if (y == null) {
                c.w = x4a2;
                c.x = x4a2;
                w = ibd;
            }
            else {
                y.x = x4a2;
                x4a2.y = y;
                c.x = x4a2;
                w = ibd;
            }
        }
        if (w == null) {
            final gbd gbd = (gbd)((Reference)this.d.v).get();
            if (gbd != null) {
                if (this.e != 0 || this.f) {
                    b3 = true;
                }
                tad tad = this.e(fbd);
                ++this.e;
                while (((ibd)o).a.compareTo((Enum)tad) < 0 && ((tmf)this.c.v).c((Object)fbd)) {
                    final tad a3 = ((ibd)o).a;
                    final ArrayList h = this.h;
                    h.add((Object)a3);
                    final pad companion = rad.Companion;
                    final tad a4 = ((ibd)o).a;
                    companion.getClass();
                    final rad b5 = pad.b(a4);
                    if (b5 == null) {
                        uy8.o((Object)((ibd)o).a, "no event up from ");
                        return;
                    }
                    ((ibd)o).a(gbd, b5);
                    h86.y0((List)h);
                    tad = this.e(fbd);
                }
                if (!b3) {
                    this.j();
                }
                --this.e;
            }
        }
    }
    
    @Override
    public final tad b() {
        return this.i;
    }
    
    @Override
    public final usi c() {
        return lq6.i(this.j);
    }
    
    @Override
    public final void d(final fbd fbd) {
        this.f("removeObserver");
        final zn0 c = this.c;
        final x4a x4a = (x4a)((tmf)c.v).k((Object)fbd);
        if (x4a == null) {
            return;
        }
        final x4a y = x4a.y;
        final x4a x = x4a.x;
        if (y == null) {
            c.w = x;
        }
        else {
            y.x = x;
        }
        final x4a x2 = x4a.x;
        if (x2 == null) {
            c.x = y;
        }
        else {
            x2.y = y;
        }
        x4a.z = true;
    }
    
    public final tad e(final fbd fbd) {
        final x4a x4a = (x4a)((tmf)this.c.v).g((Object)fbd);
        Enum enum1 = null;
        x4a y;
        if (x4a != null) {
            y = x4a.y;
        }
        else {
            y = null;
        }
        tad a;
        if (y != null) {
            a = y.w.a;
        }
        else {
            a = null;
        }
        final ArrayList h = this.h;
        if (!h.isEmpty()) {
            enum1 = (tad)oz1.h(1, h);
        }
        final tad i = this.i;
        if (a == null || a.compareTo((Enum)i) >= 0) {
            a = i;
        }
        if (enum1 != null && enum1.compareTo((Enum)a) < 0) {
            return (tad)enum1;
        }
        return a;
    }
    
    public final void f(final String s) {
        if (this.b) {
            pu0.O().getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            fvd.h((Object)hia.k("Method ", s, " must be called on the main thread"));
        }
    }
    
    public final void g(final rad rad) {
        this.f("handleLifecycleEvent");
        this.h(rad.a());
    }
    
    public final void h(final tad i) {
        if (this.i != i) {
            final gbd gbd = (gbd)((Reference)this.d.v).get();
            final tad j = this.i;
            final tad w = tad.w;
            final tad v = tad.v;
            if (j == w && i == v) {
                final StringBuilder sb = new StringBuilder("State must be at least '");
                sb.append((Object)tad.x);
                sb.append("' to be moved to '");
                sb.append((Object)i);
                sb.append("' in component ");
                sb.append((Object)gbd);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (j == v && j != i) {
                final StringBuilder sb2 = new StringBuilder("State is '");
                sb2.append((Object)v);
                sb2.append("' and cannot be moved to `");
                sb2.append((Object)i);
                sb2.append("` in component ");
                sb2.append((Object)gbd);
                throw new IllegalStateException(sb2.toString().toString());
            }
            this.i = i;
            if (this.f || this.e != 0) {
                this.g = true;
                return;
            }
            this.f = true;
            this.j();
            this.f = false;
            if (this.i == v) {
                this.c = new zn0((byte)22);
            }
        }
    }
    
    public final void i(final tad tad) {
        this.f("setCurrentState");
        this.h(tad);
    }
    
    public final void j() {
        final Object value = ((Reference)this.d.v).get();
        if (value != null) {
            final gbd gbd = (gbd)value;
            Label_0301: {
                Label_0294: {
                    Label_0287: {
                        while (true) {
                            final zn0 c = this.c;
                            if (((tmf)c.v).e == 0) {
                                break;
                            }
                            final x4a x4a = (x4a)c.w;
                            if (x4a == null) {
                                break Label_0301;
                            }
                            final tad a = x4a.w.a;
                            final x4a x4a2 = (x4a)c.x;
                            if (x4a2 == null) {
                                break Label_0294;
                            }
                            final tad a2 = x4a2.w.a;
                            if (a == a2 && this.i == a2) {
                                break;
                            }
                            this.g = false;
                            final tad i = this.i;
                            if (x4a == null) {
                                break Label_0287;
                            }
                            if (i.compareTo((Enum)a) < 0) {
                                final zn0 c2 = this.c;
                                final c8b c8b = new c8b((Object)this, (Object)gbd, (byte)26);
                                for (x4a y = (x4a)c2.x; y != null; y = y.y) {
                                    if (!y.z) {
                                        c8b.b((Object)y);
                                    }
                                }
                            }
                            final x4a x4a3 = (x4a)this.c.x;
                            if (this.g || x4a3 == null || this.i.compareTo((Enum)x4a3.w.a) <= 0) {
                                continue;
                            }
                            final zn0 c3 = this.c;
                            final tt8 tt8 = new tt8((Object)this, (Object)gbd, (byte)10);
                            for (x4a x = (x4a)c3.w; x != null; x = x.x) {
                                if (!x.z) {
                                    tt8.b((Object)x);
                                }
                            }
                        }
                        this.g = false;
                        this.j.m((Object)this.i);
                        return;
                    }
                    oyl.i("Collection is empty.");
                    return;
                }
                oyl.i("Collection is empty.");
                return;
            }
            oyl.i("Collection is empty.");
            return;
        }
        en9.q("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
