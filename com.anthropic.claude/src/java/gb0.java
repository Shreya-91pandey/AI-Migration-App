import java.lang.ref.Reference;
import java.util.Set;
import java.lang.ref.WeakReference;
import android.content.ComponentCallbacks;
import android.content.Context;
import java.util.List;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.Iterator;

public final class gb0 implements nhn
{
    public boolean v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;
    
    public gb0() {
        this.w = new vzq((byte)17);
        this.x = new pv0();
        this.y = z89.v;
    }
    
    public void a(Object o) {
        final vzq vzq;
        monitorenter(vzq = (vzq)this.w);
        Label_0225: {
            Object o2;
            try {
                o2 = this.z;
                if (o2 == null) {
                    ((pv0)this.x).addLast(o);
                    if (this.v) {
                        monitorexit(vzq);
                        return;
                    }
                    this.v = true;
                    monitorexit(vzq);
                    vzq vzq2;
                    while (true) {
                        monitorenter(vzq2 = (vzq)this.w);
                        try {
                            if (((pv0)this.x).isEmpty()) {
                                this.v = false;
                                monitorexit(vzq2);
                                return;
                            }
                        }
                        finally {
                            break;
                        }
                        final Object removeFirst = ((pv0)this.x).removeFirst();
                        o2 = this.y;
                        monitorexit(vzq2);
                        try {
                            final Iterator iterator = ((Iterable)o2).iterator();
                            while (iterator.hasNext()) {
                                ((lta)iterator.next()).b(removeFirst);
                            }
                            continue;
                        }
                        finally {
                            final vzq vzq3 = (vzq)this.w;
                            synchronized (vzq3) {
                                ((pv0)this.x).clear();
                                this.v = false;
                                final Throwable z;
                                this.z = z;
                            }
                        }
                        break;
                    }
                    monitorexit(vzq2);
                }
            }
            finally {
                break Label_0225;
            }
            o = new IllegalStateException("Can't process the event due to a previous failure", (Throwable)o2);
            throw o;
        }
        monitorexit(vzq);
    }
    
    public wc2 b(final tdk tdk, final int n, final Class clazz, final emi emi, final lta lta) {
        final wc2 wc2 = new wc2(tdk, n, clazz, emi, lta, (String)null, this.v);
        ((ArrayList)this.x).add((Object)wc2);
        return wc2;
    }
    
    public void c(final Class k, final tdk tdk, final int n, final Class clazz, final lta lta) {
        this.b(tdk, n, clazz, null, lta).k = k;
    }
    
    public int d(final sv9 sv9, AndroidComposeView s, final boolean b) {
        final akb akb = (akb)this.x;
        final dkb dkb = (dkb)this.z;
        if (this.v) {
            return k1r.a(false, false, false);
        }
        boolean b2 = true;
        Label_0361: {
            boolean b3 = false;
            Label_0126: {
                Label_0123: {
                    Label_0117: {
                        try {
                            this.v = true;
                            s = (AndroidComposeView)((v2b)this.y).s(sv9, s);
                            final rwd rwd = (rwd)((ms9)s).b;
                            Block_14: {
                                for (int f = rwd.f(), i = 0; i < f; ++i) {
                                    final peh peh = (peh)rwd.g(i);
                                    if (peh.f()) {
                                        break Label_0117;
                                    }
                                    if (peh.i()) {
                                        break Block_14;
                                    }
                                }
                                break Label_0123;
                            }
                        }
                        finally {
                            break Label_0361;
                        }
                    }
                    b3 = false;
                    break Label_0126;
                }
                b3 = true;
            }
            final rwd rwd2;
            for (int f2 = rwd2.f(), j = 0; j < f2; ++j) {
                final peh peh2 = (peh)rwd2.g(j);
                if (b3 || i1r.f(peh2)) {
                    ((LayoutNode)this.w).N(peh2.e(), dkb, peh2.j(), true);
                    if (!dkb.v.i()) {
                        akb.a(peh2.d(), (List)dkb, i1r.f(peh2));
                        dkb.clear();
                    }
                }
            }
            final boolean b4 = akb.b((ms9)s, b);
            boolean b5 = false;
            Label_0300: {
                if (!((ms9)s).a) {
                    for (int f3 = rwd2.f(), k = 0; k < f3; ++k) {
                        final peh peh3 = (peh)rwd2.g(k);
                        if (i1r.s(peh3) && peh3.l()) {
                            b5 = true;
                            break Label_0300;
                        }
                    }
                }
                b5 = false;
            }
            while (true) {
                for (int f4 = rwd2.f(), l = 0; l < f4; ++l) {
                    if (((peh)rwd2.g(l)).l()) {
                        final int a = k1r.a(b4, b5, b2);
                        this.v = false;
                        return a;
                    }
                }
                b2 = false;
                continue;
            }
        }
        this.v = false;
    }
    
    public void e() {
        monitorenter(this);
        Label_0062: {
            try {
                if (this.v) {
                    monitorexit(this);
                    return;
                }
                this.v = true;
                final Context context = (Context)this.z;
                if (context != null) {
                    ((fb0)this.x).b(context);
                    context.unregisterComponentCallbacks((ComponentCallbacks)this.y);
                }
                break Label_0062;
            }
            finally {
                monitorexit(this);
                ((Reference)this.w).clear();
                monitorexit(this);
            }
        }
    }
    
    public gnf f(final lta lta) {
        final vzq vzq = (vzq)this.w;
        synchronized (vzq) {
            this.y = rml.I((Set)this.y, (Object)lta);
            monitorexit(vzq);
            return new gnf((byte)1, lta, (Object)this);
        }
    }
    
    public void g(final ye6 ye6, final gva gva, final int n) {
        gva.i0(-134039272);
        int n2;
        if (gva.f((Object)this)) {
            n2 = 32;
        }
        else {
            n2 = 16;
        }
        final int n3 = n | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x13) != 0x12)) {
            if (((iln)this.w).d().x.length() == 0) {
                gva.g0(1155745071);
                lmn.b(qt7.W((int)(this.v ? 1 : 0), (String)this.x), null, ((ihn)this.y).B, 0L, null, null, 0L, null, null, 0L, 2, false, this.v ? 1 : 0, 0, null, null, gva, 0, 384, 241658);
                gva.q(false);
            }
            else {
                gva.g0(1156069610);
                gva.q(false);
            }
            final igf igf = (igf)this.z;
            final moe c = rj2.c((gx)wab.x, true);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, igf);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)c);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b);
            hia.t(6, ye6, gva, true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)this, (Object)ye6, n, (byte)2);
        }
    }
    
    public void h(final int n, final int n2) {
        if (n < 0.0f) {
            final StringBuilder sb = new StringBuilder("Index should be non-negative (");
            sb.append(n);
            sb.append(")");
            jac.a(sb.toString());
        }
        ((hsg)this.w).i(n);
        ((h4d)this.z).a(n);
        ((hsg)this.x).i(n2);
    }
}
