import android.view.LayoutInflater$Factory2;
import android.app.Activity;
import java.util.HashMap;
import android.content.Intent;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ContextMenu;
import android.content.res.Configuration;
import java.util.Objects;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Context;
import android.view.LayoutInflater;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.UUID;
import android.util.SparseArray;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;

public abstract class hra implements ComponentCallbacks, View$OnCreateContextMenuListener, gbd, ycp, pcb, j9k
{
    public static final Object r0;
    public Bundle A;
    public hra B;
    public String C;
    public int D;
    public Boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public vra O;
    public jra P;
    public vra Q;
    public hra R;
    public int S;
    public int T;
    public String U;
    public boolean V;
    public boolean W;
    public boolean X;
    public final boolean Y;
    public boolean Z;
    public ViewGroup a0;
    public boolean b0;
    public boolean c0;
    public gra d0;
    public boolean e0;
    public boolean f0;
    public String g0;
    public tad h0;
    public jbd i0;
    public final a09 j0;
    public esa k0;
    public final olf l0;
    public e3a m0;
    public final o78 n0;
    public final ArrayList o0;
    public final era p0;
    public final era q0;
    public int v;
    public Bundle w;
    public SparseArray x;
    public Bundle y;
    public String z;
    
    static {
        r0 = new Object();
    }
    
    public hra() {
        this.v = -1;
        this.z = UUID.randomUUID().toString();
        this.C = null;
        this.E = null;
        this.Q = new vra();
        this.Y = true;
        this.c0 = true;
        new zxl((Object)this, (byte)8);
        this.h0 = tad.z;
        this.j0 = new a09((byte)1);
        this.l0 = new olf();
        this.n0 = new o78((Object)this);
        new AtomicInteger();
        this.o0 = new ArrayList();
        this.p0 = new era(this, (byte)0);
        this.q0 = new era(this, (byte)1);
        this.l();
    }
    
    public void A() {
        this.Z = true;
    }
    
    public void B(final Bundle bundle) {
    }
    
    public abstract void C();
    
    public abstract void D();
    
    public void E(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.Q.P();
        this.M = true;
        this.k0 = new esa(this, this.s(), new cra(this, (byte)7));
        this.n0.l((Runnable)new jw(this, layoutInflater, viewGroup, bundle), "Fragment#onCreateView");
        if (!this.k0.c()) {
            this.k0 = null;
            return;
        }
        en9.q("Called getViewLifecycleOwner() but onCreateView() returned null");
    }
    
    public final Context F() {
        final Context h = this.h();
        if (h != null) {
            return h;
        }
        uy8.e((Object)this, (Object)" not attached to a context.", "Fragment ");
        return null;
    }
    
    public final void G(final int b, final int c, final int d, final int e) {
        if (this.d0 == null && b == 0 && c == 0 && d == 0 && e == 0) {
            return;
        }
        this.c().b = b;
        this.c().c = c;
        this.c().d = d;
        this.c().e = e;
    }
    
    public uuj a() {
        return (uuj)new mi8(this);
    }
    
    public final elf b() {
        while (true) {
            for (Context context = this.F().getApplicationContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
                if (context instanceof Application) {
                    final Application application = (Application)context;
                    if (application == null && vra.I(3)) {
                        Objects.toString((Object)this.F().getApplicationContext());
                    }
                    final elf elf = new elf(0);
                    if (application != null) {
                        elf.a((hm7)ucp.d, (Object)application);
                    }
                    elf.a((hm7)qt7.b, (Object)this);
                    elf.a((hm7)qt7.c, (Object)this);
                    final Bundle a = this.A;
                    if (a != null) {
                        elf.a((hm7)qt7.d, (Object)a);
                    }
                    return elf;
                }
            }
            final Application application = null;
            continue;
        }
    }
    
    public final gra c() {
        gra d0;
        if ((d0 = this.d0) == null) {
            d0 = new gra();
            this.d0 = d0;
        }
        return d0;
    }
    
    public final vad d() {
        return this.i0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o;
    }
    
    public final kra f() {
        final jra p = this.P;
        if (p == null) {
            return null;
        }
        return (kra)p.x;
    }
    
    public final vra g() {
        if (this.P != null) {
            return this.Q;
        }
        uy8.e((Object)this, (Object)" has not been attached yet.", "Fragment ");
        return null;
    }
    
    public final Context h() {
        final jra p = this.P;
        if (p == null) {
            return null;
        }
        return p.y;
    }
    
    public final int i() {
        final tad h0 = this.h0;
        if (h0 != tad.w && this.R != null) {
            return Math.min(h0.ordinal(), this.R.i());
        }
        return h0.ordinal();
    }
    
    public final vra j() {
        final vra o = this.O;
        if (o != null) {
            return o;
        }
        uy8.e((Object)this, (Object)" not associated with a fragment manager.", "Fragment ");
        return null;
    }
    
    public final String k(final int n) {
        return this.F().getResources().getString(n);
    }
    
    public final void l() {
        this.i0 = new jbd((gbd)this, true);
        this.m0 = new e3a(new i9k((j9k)this, new lce((Object)this, (byte)28)));
        final ArrayList o0 = this.o0;
        final era p0 = this.p0;
        if (!o0.contains((Object)p0)) {
            if (this.v >= 0) {
                p0.a();
            }
            else {
                o0.add((Object)p0);
            }
        }
        final era q0 = this.q0;
        if (!o0.contains((Object)q0)) {
            if (this.v >= 0) {
                q0.a();
                return;
            }
            o0.add((Object)q0);
        }
    }
    
    public final void m() {
        this.l();
        this.g0 = this.z;
        this.z = UUID.randomUUID().toString();
        this.F = false;
        this.G = false;
        this.I = false;
        this.J = false;
        this.L = false;
        this.N = 0;
        this.O = null;
        this.Q = new vra();
        this.P = null;
        this.S = 0;
        this.T = 0;
        this.U = null;
        this.V = false;
        this.W = false;
    }
    
    public final boolean n() {
        return this.P != null && this.F;
    }
    
    public final boolean o() {
        if (!this.V) {
            final vra o = this.O;
            if (o != null) {
                final hra r = this.R;
                o.getClass();
                if (r != null && r.o()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        this.Z = true;
    }
    
    public final void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        final kra f = this.f();
        if (f != null) {
            ((Activity)f).onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
            return;
        }
        uy8.e((Object)this, (Object)" not attached to an activity.", "Fragment ");
    }
    
    public final void onLowMemory() {
        this.Z = true;
    }
    
    public final boolean p() {
        return this.N > 0;
    }
    
    public void q() {
        this.Z = true;
    }
    
    public void r(final int n, final int n2, final Intent intent) {
        if (vra.I(2)) {
            this.toString();
            Objects.toString((Object)intent);
        }
    }
    
    public final xcp s() {
        if (this.O == null) {
            en9.q("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.i() != 1) {
            final HashMap d = this.O.O.d;
            xcp xcp;
            if ((xcp = (xcp)d.get((Object)this.z)) == null) {
                xcp = new xcp();
                d.put((Object)this.z, (Object)xcp);
            }
            return xcp;
        }
        en9.q("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        return null;
    }
    
    public void t(final Context context) {
        this.Z = true;
        final jra p = this.P;
        Activity x;
        if (p == null) {
            x = null;
        }
        else {
            x = p.x;
        }
        if (x != null) {
            this.Z = true;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)this)));
        sb.append("} (");
        sb.append(this.z);
        if (this.S != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.S));
        }
        if (this.U != null) {
            sb.append(" tag=");
            sb.append(this.U);
        }
        sb.append(")");
        return sb.toString();
    }
    
    public void u(Bundle bundle) {
        this.Z = true;
        bundle = this.w;
        if (bundle != null) {
            bundle = bundle.getBundle("childFragmentManager");
            if (bundle != null) {
                this.Q.V(bundle);
                final vra q = this.Q;
                q.H = false;
                q.I = false;
                q.O.g = false;
                q.v(1);
            }
        }
        final vra q2 = this.Q;
        if (q2.v >= 1) {
            return;
        }
        q2.H = false;
        q2.I = false;
        q2.O.g = false;
        q2.v(1);
    }
    
    public void v() {
        this.Z = true;
    }
    
    public void w() {
        this.Z = true;
    }
    
    public final e3a x() {
        return (e3a)this.m0.x;
    }
    
    public LayoutInflater y(final Bundle bundle) {
        final jra p = this.P;
        if (p != null) {
            final kra b = p.B;
            final LayoutInflater cloneInContext = ((Activity)b).getLayoutInflater().cloneInContext((Context)b);
            pdr.l(cloneInContext, (LayoutInflater$Factory2)this.Q.f);
            return cloneInContext;
        }
        en9.q("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        return null;
    }
    
    public void z() {
        this.Z = true;
    }
}
