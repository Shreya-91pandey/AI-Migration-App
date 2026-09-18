import android.os.BaseBundle;
import java.util.Set;
import android.os.Looper;
import android.content.Context;
import android.app.Activity;
import java.io.FileDescriptor;
import android.os.Parcelable;
import java.io.Writer;
import java.io.PrintWriter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.Objects;
import java.util.Iterator;
import android.util.Log;
import java.util.HashSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.util.ArrayDeque;

public final class vra
{
    public final pra A;
    public final wab B;
    public pe C;
    public pe D;
    public pe E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public xra O;
    public final h P;
    public final ArrayList a;
    public boolean b;
    public final c2l c;
    public ArrayList d;
    public ArrayList e;
    public final mra f;
    public d8g g;
    public cp1 h;
    public boolean i;
    public final jo1 j;
    public final AtomicInteger k;
    public final Map l;
    public final Map m;
    public final ArrayList n;
    public final e3a o;
    public final CopyOnWriteArrayList p;
    public final nra q;
    public final nra r;
    public final nra s;
    public final nra t;
    public final ora u;
    public int v;
    public jra w;
    public uuj x;
    public hra y;
    public hra z;
    
    public vra() {
        this.a = new ArrayList();
        this.c = new c2l((byte)7);
        this.d = new ArrayList();
        this.f = new mra(this);
        this.h = null;
        this.i = false;
        this.j = new jo1((Object)this, (byte)1);
        this.k = new AtomicInteger();
        this.l = Collections.synchronizedMap((Map)new HashMap());
        this.m = Collections.synchronizedMap((Map)new HashMap());
        Collections.synchronizedMap((Map)new HashMap());
        this.n = new ArrayList();
        this.o = new e3a(this);
        this.p = new CopyOnWriteArrayList();
        this.q = new nra(this, (byte)0);
        this.r = new nra(this, (byte)1);
        this.s = new nra(this, (byte)2);
        this.t = new nra(this, (byte)3);
        this.u = new ora(this);
        this.v = -1;
        this.A = new pra(this);
        this.B = new wab((byte)17);
        this.F = new ArrayDeque();
        this.P = new h(this, (byte)2);
    }
    
    public static HashSet E(final cp1 cp1) {
        final HashSet set = new HashSet();
        for (int i = 0; i < cp1.a.size(); ++i) {
            final hra b = ((dsa)cp1.a.get(i)).b;
            if (b != null && cp1.g) {
                set.add((Object)b);
            }
        }
        return set;
    }
    
    public static boolean I(final int n) {
        return Log.isLoggable("FragmentManager", n);
    }
    
    public static boolean J(hra hra) {
        final Iterator iterator = hra.Q.c.z().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            hra = (hra)iterator.next();
            int j = n;
            if (hra != null) {
                j = (J(hra) ? 1 : 0);
            }
            if ((n = j) != 0) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean L(final hra hra) {
        if (hra != null) {
            if (!hra.Y || (hra.O != null && !L(hra.R))) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean M(final hra hra) {
        if (hra != null) {
            final vra o = hra.O;
            if (hra == o.z) {
                if (M(o.y)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final boolean A(boolean b) {
        this.z(b);
        if (!this.i) {
            final cp1 h = this.h;
            if (h != null) {
                h.r = false;
                h.d();
                if (I(3)) {
                    Objects.toString((Object)this.h);
                    Objects.toString((Object)this.a);
                }
                this.h.e(false, false);
                this.a.add(0, (Object)this.h);
                final Iterator iterator = this.h.a.iterator();
                while (iterator.hasNext()) {
                    final hra b2 = ((dsa)iterator.next()).b;
                    if (b2 != null) {
                        b2.H = false;
                    }
                }
                this.h = null;
            }
        }
        b = false;
    Label_0267_Outer:
        while (true) {
            final ArrayList l = this.L;
            final ArrayList m = this.M;
            final ArrayList a;
            monitorenter(a = this.a);
            boolean b3;
            int size;
            int n;
            ArrayList a2;
            final ArrayList list;
            Label_0326_Outer:Block_13_Outer:Label_0351_Outer:
            while (true) {
                Label_0184: {
                    try {
                        if (this.a.isEmpty()) {
                            monitorexit(a);
                            b3 = false;
                            break Label_0267;
                        }
                        break Label_0184;
                    }
                    finally {
                        monitorexit(a);
                        while (true) {
                        Label_0306:
                            while (true) {
                                ((HashMap)this.c.x).values().removeAll((Collection)Collections.singleton((Object)null));
                                return b;
                                iftrue(Label_0306:)(!b3);
                                b = true;
                                this.b = true;
                                try {
                                    this.U(this.L, this.M);
                                    continue Label_0267_Outer;
                                }
                                finally {
                                    this.e();
                                }
                                break Label_0306;
                                this.K = false;
                                this.c0();
                                continue Block_13_Outer;
                            }
                            this.e0();
                            iftrue(Label_0326:)(!this.K);
                            continue Label_0351_Outer;
                        }
                        while (true) {
                            this.a.clear();
                            this.w.z.removeCallbacks((Runnable)this.P);
                            try {
                                size = this.a.size();
                                n = 0;
                                b3 = false;
                                while (true) {
                                    a2 = this.a;
                                    if (n >= size) {
                                        break;
                                    }
                                    b3 |= ((sra)a2.get(n)).a(l, m);
                                    ++n;
                                }
                            }
                            finally {
                                continue;
                            }
                            break;
                        }
                        list.clear();
                        this.w.z.removeCallbacks((Runnable)this.P);
                        monitorexit(a);
                        continue Label_0326_Outer;
                    }
                }
                break;
            }
        }
    }
    
    public final void B(final ArrayList list, final ArrayList list2, int i, final int n) {
        int o = ((cp1)list.get(i)).o ? 1 : 0;
        final ArrayList n2 = this.N;
        if (n2 == null) {
            this.N = new ArrayList();
        }
        else {
            n2.clear();
        }
        final ArrayList n3 = this.N;
        final c2l c = this.c;
        n3.addAll((Collection)c.A());
        hra hra = this.z;
        int n4 = i;
        int n5 = 0;
        while (true) {
            int n6 = 1;
            if (n4 >= n) {
                break;
            }
            final cp1 cp1 = (cp1)list.get(n4);
            final boolean booleanValue = (boolean)list2.get(n4);
            final ArrayList n7 = this.N;
            int n14;
            hra hra3;
            int n15;
            if (!booleanValue) {
                final ArrayList a = cp1.a;
                final int n8 = 0;
                final int n9 = n5;
                final int n10 = n4;
                int n11 = 0;
                for (int j = n8; j < a.size(); j += n11, n6 = n11) {
                    final dsa dsa = (dsa)a.get(j);
                    final int a2 = dsa.a;
                    Label_0281: {
                        if (a2 != n6) {
                            if (a2 != 2) {
                                hra b = null;
                                Label_0268: {
                                    int n12;
                                    if (a2 != 3 && a2 != 6) {
                                        if (a2 == 7) {
                                            n11 = 1;
                                            break Label_0281;
                                        }
                                        if (a2 != 8) {
                                            b = hra;
                                            n12 = j;
                                        }
                                        else {
                                            a.add(j, (Object)new dsa(9, hra, 0));
                                            dsa.c = true;
                                            n12 = j + 1;
                                            b = dsa.b;
                                        }
                                    }
                                    else {
                                        n7.remove((Object)dsa.b);
                                        final hra b2 = dsa.b;
                                        b = hra;
                                        n12 = j;
                                        if (b2 == hra) {
                                            a.add(j, (Object)new dsa(9, b2));
                                            ++j;
                                            b = null;
                                            break Label_0268;
                                        }
                                    }
                                    j = n12;
                                }
                                n11 = 1;
                                hra = b;
                                continue;
                            }
                            final hra b3 = dsa.b;
                            final int t = b3.T;
                            int k = n7.size() - 1;
                            boolean b4 = false;
                            while (k >= 0) {
                                final hra hra2 = (hra)n7.get(k);
                                if (hra2.T == t) {
                                    if (hra2 == b3) {
                                        b4 = true;
                                    }
                                    else {
                                        if (hra2 == hra) {
                                            a.add(j, (Object)new dsa(9, hra2, 0));
                                            ++j;
                                            hra = null;
                                        }
                                        final dsa dsa2 = new dsa(3, hra2, 0);
                                        dsa2.d = dsa.d;
                                        dsa2.f = dsa.f;
                                        dsa2.e = dsa.e;
                                        dsa2.g = dsa.g;
                                        a.add(j, (Object)dsa2);
                                        n7.remove((Object)hra2);
                                        ++j;
                                    }
                                }
                                --k;
                            }
                            final int n13 = 1;
                            if (b4) {
                                a.remove(j);
                                --j;
                                n11 = n13;
                                continue;
                            }
                            dsa.a = 1;
                            dsa.c = true;
                            n7.add((Object)b3);
                            n11 = n13;
                            continue;
                        }
                        else {
                            n11 = n6;
                        }
                    }
                    n7.add((Object)dsa.b);
                }
                n14 = n9;
                hra3 = hra;
                n15 = n10;
            }
            else {
                final int n16 = o;
                final ArrayList a3 = cp1.a;
                int n17 = a3.size() - 1;
                while (true) {
                    hra3 = hra;
                    o = n16;
                    n15 = n4;
                    n14 = n5;
                    if (n17 < 0) {
                        break;
                    }
                    final dsa dsa3 = (dsa)a3.get(n17);
                    final int a4 = dsa3.a;
                    Label_0793: {
                        Label_0782: {
                            if (a4 != 1) {
                                if (a4 != 3) {
                                    switch (a4) {
                                        default: {
                                            break Label_0793;
                                        }
                                        case 10: {
                                            dsa3.i = dsa3.h;
                                            break Label_0793;
                                        }
                                        case 9: {
                                            hra = dsa3.b;
                                            break Label_0793;
                                        }
                                        case 8: {
                                            hra = null;
                                            break Label_0793;
                                        }
                                        case 6: {
                                            break;
                                        }
                                        case 7: {
                                            break Label_0782;
                                        }
                                    }
                                }
                                n7.add((Object)dsa3.b);
                                break Label_0793;
                            }
                        }
                        n7.remove((Object)dsa3.b);
                    }
                    --n17;
                }
            }
            if (n14 == 0 && !cp1.g) {
                n5 = 0;
            }
            else {
                n5 = 1;
            }
            n4 = n15 + 1;
            hra = hra3;
        }
        this.N.clear();
        if (o == 0 && this.v >= 1) {
            for (int l = i; l < n; ++l) {
                final Iterator iterator = ((cp1)list.get(l)).a.iterator();
                while (iterator.hasNext()) {
                    final hra b5 = ((dsa)iterator.next()).b;
                    if (b5 != null && b5.O != null) {
                        c.H(this.h(b5));
                    }
                }
            }
        }
        int n20;
    Label_1623:
        for (int n18 = i; n18 < n; n18 = n20 + 1) {
            final cp1 cp2 = (cp1)list.get(n18);
            if (!(boolean)list2.get(n18)) {
                cp2.c(1);
                final vra q = cp2.q;
                final ArrayList a5 = cp2.a;
                final int size = a5.size();
                int n19 = 0;
                dsa dsa4 = null;
            Label_1824:
                while (true) {
                    n20 = n18;
                    if (n19 >= size) {
                        continue Label_1623;
                    }
                    dsa4 = (dsa)a5.get(n19);
                    final hra b6 = dsa4.b;
                    if (b6 != null) {
                        if (b6.d0 != null) {
                            b6.c().a = false;
                        }
                        final int f = cp2.f;
                        if (b6.d0 != null || f != 0) {
                            b6.c();
                            b6.d0.getClass();
                        }
                        b6.c();
                        b6.d0.getClass();
                    }
                    switch (dsa4.a) {
                        default: {
                            break Label_1824;
                        }
                        case 10: {
                            dsa4.h = b6.h0;
                            q.Z(b6, dsa4.i);
                            break;
                        }
                        case 9: {
                            q.a0(null);
                            break;
                        }
                        case 8: {
                            q.a0(b6);
                            break;
                        }
                        case 7: {
                            b6.G(dsa4.d, dsa4.e, dsa4.f, dsa4.g);
                            q.Y(b6, false);
                            q.c(b6);
                            break;
                        }
                        case 6: {
                            b6.G(dsa4.d, dsa4.e, dsa4.f, dsa4.g);
                            q.i(b6);
                            break;
                        }
                        case 5: {
                            b6.G(dsa4.d, dsa4.e, dsa4.f, dsa4.g);
                            q.Y(b6, false);
                            if (I(2)) {
                                Objects.toString((Object)b6);
                            }
                            if (b6.V) {
                                b6.V = false;
                                b6.e0 ^= true;
                                break;
                            }
                            break;
                        }
                        case 4: {
                            b6.G(dsa4.d, dsa4.e, dsa4.f, dsa4.g);
                            q.getClass();
                            if (I(2)) {
                                Objects.toString((Object)b6);
                            }
                            if (!b6.V) {
                                b6.V = true;
                                b6.e0 ^= true;
                                q.b0(b6);
                                break;
                            }
                            break;
                        }
                        case 3: {
                            b6.G(dsa4.d, dsa4.e, dsa4.f, dsa4.g);
                            q.T(b6);
                            break;
                        }
                        case 1: {
                            b6.G(dsa4.d, dsa4.e, dsa4.f, dsa4.g);
                            q.Y(b6, false);
                            q.a(b6);
                            break;
                        }
                    }
                    ++n19;
                }
                yif.f(dsa4.a, "Unknown cmd: ");
                return;
            }
            cp2.c(-1);
            final vra q2 = cp2.q;
            final ArrayList a6 = cp2.a;
            int n21 = a6.size() - 1;
            while (true) {
                n20 = n18;
                if (n21 < 0) {
                    break;
                }
                final dsa dsa5 = (dsa)a6.get(n21);
                final hra b7 = dsa5.b;
                if (b7 != null) {
                    if (b7.d0 != null) {
                        b7.c().a = true;
                    }
                    final int f2 = cp2.f;
                    int n22 = 8194;
                    final int n23 = 4097;
                    if (f2 != 4097) {
                        n22 = n23;
                        if (f2 != 8194) {
                            n22 = 4100;
                            if (f2 != 8197) {
                                n22 = 4099;
                                if (f2 != 4099) {
                                    if (f2 != 4100) {
                                        n22 = 0;
                                    }
                                    else {
                                        n22 = 8197;
                                    }
                                }
                            }
                        }
                    }
                    if (b7.d0 != null || n22 != 0) {
                        b7.c();
                        b7.d0.getClass();
                    }
                    b7.c();
                    b7.d0.getClass();
                }
                switch (dsa5.a) {
                    default: {
                        yif.f(dsa5.a, "Unknown cmd: ");
                        return;
                    }
                    case 10: {
                        dsa5.i = b7.h0;
                        q2.Z(b7, dsa5.h);
                        break;
                    }
                    case 9: {
                        q2.a0(b7);
                        break;
                    }
                    case 8: {
                        q2.a0(null);
                        break;
                    }
                    case 7: {
                        b7.G(dsa5.d, dsa5.e, dsa5.f, dsa5.g);
                        q2.Y(b7, true);
                        q2.i(b7);
                        break;
                    }
                    case 6: {
                        b7.G(dsa5.d, dsa5.e, dsa5.f, dsa5.g);
                        q2.c(b7);
                        break;
                    }
                    case 5: {
                        b7.G(dsa5.d, dsa5.e, dsa5.f, dsa5.g);
                        q2.Y(b7, true);
                        if (I(2)) {
                            Objects.toString((Object)b7);
                        }
                        if (!b7.V) {
                            b7.V = true;
                            b7.e0 ^= true;
                            q2.b0(b7);
                            break;
                        }
                        break;
                    }
                    case 4: {
                        b7.G(dsa5.d, dsa5.e, dsa5.f, dsa5.g);
                        q2.getClass();
                        if (I(2)) {
                            Objects.toString((Object)b7);
                        }
                        if (b7.V) {
                            b7.V = false;
                            b7.e0 ^= true;
                            break;
                        }
                        break;
                    }
                    case 3: {
                        b7.G(dsa5.d, dsa5.e, dsa5.f, dsa5.g);
                        q2.a(b7);
                        break;
                    }
                    case 1: {
                        b7.G(dsa5.d, dsa5.e, dsa5.f, dsa5.g);
                        q2.Y(b7, true);
                        q2.T(b7);
                        break;
                    }
                }
                --n21;
            }
        }
        final boolean booleanValue2 = (boolean)list2.get(n - 1);
        final ArrayList n24 = this.n;
        if (n5 != 0 && !n24.isEmpty()) {
            final LinkedHashSet set = new LinkedHashSet();
            final Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                ((Set)set).addAll((Collection)E((cp1)iterator2.next()));
            }
            if (this.h == null) {
                final Iterator iterator3 = n24.iterator();
                while (iterator3.hasNext()) {
                    ge9.C(iterator3.next());
                    final Iterator iterator4 = ((Set)set).iterator();
                    if (!iterator4.hasNext()) {
                        continue;
                    }
                    final hra hra4 = (hra)iterator4.next();
                    throw null;
                }
                final Iterator iterator5 = n24.iterator();
                while (iterator5.hasNext()) {
                    ge9.C(iterator5.next());
                    final Iterator iterator6 = ((Set)set).iterator();
                    if (!iterator6.hasNext()) {
                        continue;
                    }
                    final hra hra5 = (hra)iterator6.next();
                    throw null;
                }
            }
        }
        for (int n25 = i; n25 < n; ++n25) {
            final cp1 cp3 = (cp1)list.get(n25);
            if (booleanValue2) {
                for (int n26 = cp3.a.size() - 1; n26 >= 0; --n26) {
                    final hra b8 = ((dsa)cp3.a.get(n26)).b;
                    if (b8 != null) {
                        this.h(b8).k();
                    }
                }
            }
            else {
                final Iterator iterator7 = cp3.a.iterator();
                while (iterator7.hasNext()) {
                    final hra b9 = ((dsa)iterator7.next()).b;
                    if (b9 != null) {
                        this.h(b9).k();
                    }
                }
            }
        }
        this.O(this.v, true);
        final Iterator iterator8 = this.g(list, i, n).iterator();
        int n27;
        while (true) {
            n27 = i;
            if (!iterator8.hasNext()) {
                break;
            }
            final v68 v68 = (v68)iterator8.next();
            v68.l(booleanValue2);
            v68.h();
            v68.c();
        }
        while (n27 < n) {
            final cp1 cp4 = (cp1)list.get(n27);
            if ((boolean)list2.get(n27) && cp4.s >= 0) {
                cp4.s = -1;
            }
            if (cp4.p != null) {
                for (i = 0; i < cp4.p.size(); ++i) {
                    ((Runnable)cp4.p.get(i)).run();
                }
                cp4.p = null;
            }
            ++n27;
        }
        if (n5 != 0 && n24.size() > 0) {
            ge9.C(n24.get(0));
            throw null;
        }
    }
    
    public final hra C(final int n) {
        final c2l c = this.c;
        final ArrayList list = (ArrayList)c.w;
        for (int i = list.size() - 1; i >= 0; --i) {
            final hra hra = (hra)list.get(i);
            if (hra != null && hra.S == n) {
                return hra;
            }
        }
        for (final asa asa : ((HashMap)c.x).values()) {
            if (asa != null) {
                final hra j = asa.j();
                if (j.S == n) {
                    return j;
                }
                continue;
            }
        }
        return null;
    }
    
    public final hra D(final String s) {
        final c2l c = this.c;
        final ArrayList list = (ArrayList)c.w;
        for (int i = list.size() - 1; i >= 0; --i) {
            final hra hra = (hra)list.get(i);
            if (hra != null && s.equals((Object)hra.U)) {
                return hra;
            }
        }
        for (final asa asa : ((HashMap)c.x).values()) {
            if (asa != null) {
                final hra j = asa.j();
                if (s.equals((Object)j.U)) {
                    return j;
                }
                continue;
            }
        }
        return null;
    }
    
    public final ViewGroup F(final hra hra) {
        final ViewGroup a0 = hra.a0;
        if (a0 != null) {
            return a0;
        }
        if (hra.T > 0) {
            if (this.x.q0()) {
                final View p = this.x.p0(hra.T);
                if (p instanceof ViewGroup) {
                    return (ViewGroup)p;
                }
            }
        }
        return null;
    }
    
    public final pra G() {
        final hra y = this.y;
        if (y != null) {
            return y.O.G();
        }
        return this.A;
    }
    
    public final wab H() {
        final hra y = this.y;
        if (y != null) {
            return y.O.H();
        }
        return this.B;
    }
    
    public final boolean K() {
        final hra y = this.y;
        return y == null || (y.n() && this.y.j().K());
    }
    
    public final boolean N() {
        return this.H || this.I;
    }
    
    public final void O(final int v, final boolean b) {
        if (this.w == null && v != -1) {
            en9.q("No activity");
            return;
        }
        if (b || v != this.v) {
            this.v = v;
            final c2l c = this.c;
            final HashMap hashMap = (HashMap)c.x;
            final Iterator iterator = ((ArrayList)c.w).iterator();
            while (iterator.hasNext()) {
                final asa asa = (asa)hashMap.get((Object)((hra)iterator.next()).z);
                if (asa != null) {
                    asa.k();
                }
            }
            for (final asa asa2 : hashMap.values()) {
                if (asa2 != null) {
                    asa2.k();
                    final hra j = asa2.j();
                    if (!j.G || j.p()) {
                        continue;
                    }
                    c.I(asa2);
                }
            }
            this.c0();
            if (this.G) {
                final jra w = this.w;
                if (w != null && this.v == 7) {
                    ((Activity)w.B).invalidateOptionsMenu();
                    this.G = false;
                }
            }
        }
    }
    
    public final void P() {
        if (this.w != null) {
            this.H = false;
            this.I = false;
            this.O.g = false;
            for (final hra hra : this.c.A()) {
                if (hra != null) {
                    hra.Q.P();
                }
            }
        }
    }
    
    public final boolean Q() {
        return this.R(-1, 0);
    }
    
    public final boolean R(final int n, final int n2) {
        this.A(false);
        this.z(true);
        final hra z = this.z;
        if (z != null && n < 0 && z.g().Q()) {
            return true;
        }
        final boolean s = this.S(this.L, this.M, n, n2);
        if (s) {
            this.b = true;
            try {
                this.U(this.L, this.M);
            }
            finally {
                this.e();
            }
        }
        this.e0();
        if (this.K) {
            this.K = false;
            this.c0();
        }
        ((HashMap)this.c.x).values().removeAll((Collection)Collections.singleton((Object)null));
        return s;
    }
    
    public final boolean S(final ArrayList list, final ArrayList list2, int i, int j) {
        final boolean b = (j & 0x1) != 0x0;
        final boolean empty = this.d.isEmpty();
        final int n = -1;
        if (empty) {
            j = n;
        }
        else if (i < 0) {
            if (b) {
                j = 0;
            }
            else {
                j = this.d.size() - 1;
            }
        }
        else {
            cp1 cp1;
            for (j = this.d.size() - 1; j >= 0; --j) {
                cp1 = (cp1)this.d.get(j);
                if (i >= 0 && i == cp1.s) {
                    break;
                }
            }
            if (j >= 0) {
                if (b) {
                    int n2 = j;
                    while (true) {
                        j = n2;
                        if (n2 <= 0) {
                            break;
                        }
                        final cp1 cp2 = (cp1)this.d.get(n2 - 1);
                        j = n2;
                        if (i < 0) {
                            break;
                        }
                        j = n2;
                        if (i != cp2.s) {
                            break;
                        }
                        --n2;
                    }
                }
                else if (j == this.d.size() - 1) {
                    j = n;
                }
                else {
                    ++j;
                }
            }
        }
        if (j < 0) {
            return false;
        }
        for (i = this.d.size() - 1; i >= j; --i) {
            list.add((Object)this.d.remove(i));
            list2.add((Object)Boolean.TRUE);
        }
        return true;
    }
    
    public final void T(final hra hra) {
        if (I(2)) {
            Objects.toString((Object)hra);
        }
        final boolean p = hra.p();
        if (hra.W && p) {
            return;
        }
        final c2l c = this.c;
        final ArrayList list = (ArrayList)c.w;
        synchronized (list) {
            ((ArrayList)c.w).remove((Object)hra);
            monitorexit(list);
            hra.F = false;
            if (J(hra)) {
                this.G = true;
            }
            hra.G = true;
            this.b0(hra);
        }
    }
    
    public final void U(final ArrayList list, final ArrayList list2) {
        if (!list.isEmpty()) {
            if (list.size() != list2.size()) {
                en9.q("Internal error with the back stack records");
                return;
            }
            final int size = list.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                int n2 = i;
                int n3 = n;
                if (!((cp1)list.get(i)).o) {
                    if (n != i) {
                        this.B(list, list2, n, i);
                    }
                    int n4 = n3 = i + 1;
                    if (list2.get(i)) {
                        while ((n3 = n4) < size) {
                            n3 = n4;
                            if (!(boolean)list2.get(n4)) {
                                break;
                            }
                            n3 = n4;
                            if (((cp1)list.get(n4)).o) {
                                break;
                            }
                            ++n4;
                        }
                    }
                    this.B(list, list2, i, n3);
                    n2 = n3 - 1;
                }
                i = n2 + 1;
                n = n3;
            }
            if (n != size) {
                this.B(list, list2, n, size);
            }
        }
    }
    
    public final void V(final Bundle bundle) {
        for (final String s : ((BaseBundle)bundle).keySet()) {
            if (s.startsWith("result_")) {
                final Bundle bundle2 = bundle.getBundle(s);
                if (bundle2 == null) {
                    continue;
                }
                bundle2.setClassLoader(this.w.y.getClassLoader());
                this.m.put((Object)s.substring(7), (Object)bundle2);
            }
        }
        final HashMap hashMap = new HashMap();
        for (final String s2 : ((BaseBundle)bundle).keySet()) {
            if (s2.startsWith("fragment_")) {
                final Bundle bundle3 = bundle.getBundle(s2);
                if (bundle3 == null) {
                    continue;
                }
                bundle3.setClassLoader(this.w.y.getClassLoader());
                hashMap.put((Object)s2.substring(9), (Object)bundle3);
            }
        }
        final c2l c = this.c;
        final HashMap hashMap2 = (HashMap)c.y;
        final HashMap hashMap3 = (HashMap)c.x;
        hashMap2.clear();
        hashMap2.putAll((Map)hashMap);
        final wra wra = (wra)bundle.getParcelable("state");
        if (wra == null) {
            return;
        }
        hashMap3.clear();
        final Iterator iterator3 = wra.v.iterator();
        e3a o;
        while (true) {
            final boolean hasNext = iterator3.hasNext();
            o = this.o;
            if (!hasNext) {
                break;
            }
            final Bundle q = c.Q((Bundle)null, (String)iterator3.next());
            if (q == null) {
                continue;
            }
            final hra hra = (hra)this.O.b.get((Object)((zra)q.getParcelable("state")).w);
            asa asa;
            if (hra != null) {
                if (I(2)) {
                    hra.toString();
                }
                asa = new asa(o, c, hra, q);
            }
            else {
                asa = new asa(this.o, this.c, this.w.y.getClassLoader(), this.G(), q);
            }
            final hra j = asa.j();
            j.w = q;
            j.O = this;
            if (I(2)) {
                j.toString();
            }
            asa.m(this.w.y.getClassLoader());
            c.H(asa);
            asa.p(this.v);
        }
        final xra o2 = this.O;
        o2.getClass();
        for (final hra hra2 : new ArrayList(o2.b.values())) {
            if (hashMap3.get((Object)hra2.z) != null) {
                continue;
            }
            if (I(2)) {
                hra2.toString();
                Objects.toString((Object)wra.v);
            }
            this.O.f(hra2);
            hra2.O = this;
            final asa asa2 = new asa(o, c, hra2);
            asa2.p(1);
            asa2.k();
            hra2.G = true;
            asa2.k();
        }
        final ArrayList w = wra.w;
        ((ArrayList)c.w).clear();
        if (w != null) {
            for (final String s3 : w) {
                final hra w2 = c.w(s3);
                if (w2 == null) {
                    en9.q(hia.k("No instantiated fragment for (", s3, ")"));
                    return;
                }
                if (I(2)) {
                    w2.toString();
                }
                c.b(w2);
            }
        }
        final dp1[] x = wra.x;
        final int n = 0;
        if (x != null) {
            this.d = new ArrayList(wra.x.length);
            int n2 = 0;
            while (true) {
                final dp1[] x2 = wra.x;
                if (n2 >= x2.length) {
                    break;
                }
                final cp1 a = x2[n2].a(this);
                if (I(2)) {
                    a.toString();
                    final PrintWriter printWriter = new PrintWriter((Writer)new sqd());
                    a.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add((Object)a);
                ++n2;
            }
        }
        else {
            this.d = new ArrayList();
        }
        this.k.set(wra.y);
        final String z = wra.z;
        if (z != null) {
            this.s(this.z = c.w(z));
        }
        final ArrayList a2 = wra.A;
        if (a2 != null) {
            for (int i = n; i < a2.size(); ++i) {
                this.l.put((Object)a2.get(i), (Object)wra.B.get(i));
            }
        }
        this.F = new ArrayDeque((Collection)wra.C);
    }
    
    public final Bundle W() {
        final Bundle bundle = new Bundle();
        final Iterator iterator = this.f().iterator();
        while (iterator.hasNext()) {
            ((v68)iterator.next()).e();
        }
        this.x();
        this.A(true);
        this.H = true;
        this.O.g = true;
        final c2l c = this.c;
        c.getClass();
        final HashMap hashMap = (HashMap)c.x;
        final ArrayList v = new ArrayList(hashMap.size());
        for (final asa asa : hashMap.values()) {
            if (asa != null) {
                final hra j = asa.j();
                c.Q(asa.o(), j.z);
                v.add((Object)j.z);
                if (!I(2)) {
                    continue;
                }
                j.toString();
                Objects.toString((Object)j.w);
            }
        }
        final HashMap hashMap2 = (HashMap)this.c.y;
        if (hashMap2.isEmpty()) {
            I(2);
            return bundle;
        }
        final c2l c2 = this.c;
        final ArrayList list;
        monitorenter(list = (ArrayList)c2.w);
        boolean empty;
        dp1[] x;
        ArrayList w;
        dp1[] array = null;
        int n = 0;
        int size = 0;
        wra wra = null;
        hra z;
        Iterator iterator3;
        Iterator iterator4 = null;
        Iterator iterator5 = null;
        String s;
        hra hra = null;
        String s2;
        Label_0394_Outer:Label_0322_Outer:Label_0444_Outer:
        while (true) {
            Label_0288: {
                try {
                    empty = ((ArrayList)c2.w).isEmpty();
                    x = null;
                    if (empty) {
                        monitorexit(list);
                        w = null;
                        break Label_0374;
                    }
                    break Label_0288;
                }
                finally {
                    monitorexit(list);
                    while (true) {
                    Block_14:
                        while (true) {
                        Label_0322:
                            while (true) {
                            Label_0591:
                                while (true) {
                                    Label_0513: {
                                        while (true) {
                                            x = array;
                                            iftrue(Label_0450:)(n >= size);
                                            Block_16: {
                                                Block_13: {
                                                    break Block_13;
                                                    size = this.d.size();
                                                    iftrue(Label_0450:)(size <= 0);
                                                    while (true) {
                                                        Block_12: {
                                                            break Block_12;
                                                            Label_0450: {
                                                                wra = new wra();
                                                            }
                                                            wra.v = v;
                                                            wra.w = w;
                                                            wra.x = x;
                                                            wra.y = this.k.get();
                                                            z = this.z;
                                                            iftrue(Label_0513:)(z == null);
                                                            Block_15: {
                                                                break Block_15;
                                                                w = new ArrayList(((ArrayList)c2.w).size());
                                                                iterator3 = ((ArrayList)c2.w).iterator();
                                                                break Label_0322;
                                                                iftrue(Label_0643:)(!iterator4.hasNext());
                                                                break Block_16;
                                                                s = (String)iterator5.next();
                                                                bundle.putBundle(smk.s("fragment_", s), (Bundle)hashMap2.get((Object)s));
                                                                break Label_0322;
                                                                hra = (hra)iterator3.next();
                                                                w.add((Object)hra.z);
                                                                iftrue(Label_0322:)(!I(2));
                                                                break Label_0591;
                                                            }
                                                            wra.z = z.z;
                                                            break Label_0513;
                                                        }
                                                        array = new dp1[size];
                                                        n = 0;
                                                        continue Label_0322_Outer;
                                                        Label_0643: {
                                                            iterator5 = hashMap2.keySet().iterator();
                                                        }
                                                        break Label_0322;
                                                        iftrue(Label_0371:)(!iterator3.hasNext());
                                                        continue Label_0444_Outer;
                                                    }
                                                }
                                                array[n] = new dp1((cp1)this.d.get(n));
                                                iftrue(Label_0444:)(!I(2));
                                                break Block_14;
                                            }
                                            s2 = (String)iterator4.next();
                                            bundle.putBundle(smk.s("result_", s2), (Bundle)this.m.get((Object)s2));
                                            continue Label_0591;
                                            Label_0703: {
                                                return bundle;
                                            }
                                            ++n;
                                            continue Label_0322_Outer;
                                        }
                                        Label_0371: {
                                            monitorexit(list);
                                        }
                                        continue Label_0394_Outer;
                                    }
                                    wra.A.addAll((Collection)this.l.keySet());
                                    wra.B.addAll(this.l.values());
                                    wra.C = new ArrayList((Collection)this.F);
                                    bundle.putParcelable("state", (Parcelable)wra);
                                    iterator4 = this.m.keySet().iterator();
                                    continue Label_0591;
                                }
                                hra.toString();
                                continue Label_0322;
                            }
                            iftrue(Label_0703:)(!iterator5.hasNext());
                            continue Label_0444_Outer;
                        }
                        Objects.toString(this.d.get(n));
                        continue;
                    }
                }
            }
            break;
        }
    }
    
    public final void X() {
        final ArrayList a;
        monitorenter(a = this.a);
        Label_0060: {
            try {
                if (this.a.size() == 1) {
                    this.w.z.removeCallbacks((Runnable)this.P);
                    this.w.z.post((Runnable)this.P);
                    this.e0();
                }
                break Label_0060;
            }
            finally {
                monitorexit(a);
                monitorexit(a);
            }
        }
    }
    
    public final void Y(final hra hra, final boolean b) {
        final ViewGroup f = this.F(hra);
        if (f != null && f instanceof lra) {
            ((lra)f).setDrawDisappearingViewsLast(b ^ true);
        }
    }
    
    public final void Z(final hra hra, final tad h0) {
        if (hra == this.c.w(hra.z) && (hra.P == null || hra.O == this)) {
            hra.h0 = h0;
            return;
        }
        oyl.j("Fragment ", (Object)hra, (Object)" is not an active fragment of FragmentManager ", (Object)this);
    }
    
    public final asa a(final hra hra) {
        final String g0 = hra.g0;
        if (g0 != null) {
            csa.c(hra, g0);
        }
        if (I(2)) {
            hra.toString();
        }
        final asa h = this.h(hra);
        hra.O = this;
        final c2l c = this.c;
        c.H(h);
        if (!hra.W) {
            c.b(hra);
            hra.G = false;
            hra.e0 = false;
            if (J(hra)) {
                this.G = true;
            }
        }
        return h;
    }
    
    public final void a0(final hra z) {
        Label_0051: {
            if (z != null) {
                if (z == this.c.w(z.z)) {
                    if (z.P == null) {
                        break Label_0051;
                    }
                    if (z.O == this) {
                        break Label_0051;
                    }
                }
                oyl.j("Fragment ", (Object)z, (Object)" is not an active fragment of FragmentManager ", (Object)this);
                return;
            }
        }
        final hra z2 = this.z;
        this.z = z;
        this.s(z2);
        this.s(this.z);
    }
    
    public final void b(jra w, final uuj x, final hra y) {
        if (this.w == null) {
            this.w = w;
            this.x = x;
            this.y = y;
            final CopyOnWriteArrayList p3 = this.p;
            if (y != null) {
                p3.add((Object)new qra(y));
            }
            else if (w != null) {
                p3.add((Object)w);
            }
            if (this.y != null) {
                this.e0();
            }
            if (w != null) {
                final d8g e = w.B.e();
                this.g = e;
                Object o;
                if (y != null) {
                    o = y;
                }
                else {
                    o = w;
                }
                e.a((gbd)o, (z7g)this.j);
            }
            xra o3;
            if (y != null) {
                final xra o2 = y.O.O;
                final HashMap c = o2.c;
                if ((o3 = (xra)c.get((Object)y.z)) == null) {
                    o3 = new xra(o2.e);
                    c.put((Object)y.z, (Object)o3);
                }
                this.O = o3;
            }
            else if (w != null) {
                final c2l c2l = new c2l(w.B.s(), (vcp)xra.h, (im7)gm7.b);
                final us4 a = v4j.a((Class)xra.class);
                final String b = a.b();
                if (b == null) {
                    en9.s("Local and anonymous classes can not be ViewModels");
                    return;
                }
                o3 = (xra)c2l.D(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                this.O = o3;
            }
            else {
                o3 = new xra(false);
                this.O = o3;
            }
            o3.g = this.N();
            this.c.z = this.O;
            w = this.w;
            if (w != null && y == null) {
                final e3a x2 = w.x();
                x2.P("android:support:fragments", (h9k)new zd6((Object)this, (byte)3));
                final Bundle e2 = x2.e("android:support:fragments");
                if (e2 != null) {
                    this.V(e2);
                }
            }
            w = this.w;
            if (w != null) {
                final ee6 d = w.B.D;
                String p4;
                if (y != null) {
                    p4 = oz1.p(new StringBuilder(), y.z, ":");
                }
                else {
                    p4 = "";
                }
                final String concat = "FragmentManager:".concat(p4);
                this.C = d.c(concat.concat("StartActivityForResult"), (rhc)new ke((byte)2), (be)new j9j((Object)this, (byte)16));
                this.D = d.c(concat.concat("StartIntentSenderForResult"), (rhc)new ke((byte)5), (be)new jy7((Object)this, (byte)18));
                this.E = d.c(concat.concat("RequestPermissions"), (rhc)new ke((byte)0), (be)new v2b((Object)this, (byte)18));
            }
            w = this.w;
            if (w != null) {
                w.A((yv6)this.q);
            }
            w = this.w;
            if (w != null) {
                w.B.F.add((Object)this.r);
            }
            w = this.w;
            if (w != null) {
                w.B.H.add((Object)this.s);
            }
            w = this.w;
            if (w != null) {
                w.B.I.add((Object)this.t);
            }
            w = this.w;
            if (w != null && y == null) {
                final tze x3 = w.B.x;
                ((CopyOnWriteArrayList)x3.x).add((Object)this.u);
                ((Runnable)x3.w).run();
            }
            return;
        }
        en9.q("Already attached");
    }
    
    public final void b0(final hra hra) {
        final ViewGroup f = this.F(hra);
        if (f != null) {
            final gra d0 = hra.d0;
            boolean a = false;
            int b;
            if (d0 == null) {
                b = 0;
            }
            else {
                b = d0.b;
            }
            int c;
            if (d0 == null) {
                c = 0;
            }
            else {
                c = d0.c;
            }
            int d2;
            if (d0 == null) {
                d2 = 0;
            }
            else {
                d2 = d0.d;
            }
            int e;
            if (d0 == null) {
                e = 0;
            }
            else {
                e = d0.e;
            }
            if (e + (d2 + (c + b)) > 0) {
                if (((View)f).getTag(2131297133) == null) {
                    ((View)f).setTag(2131297133, (Object)hra);
                }
                final hra hra2 = (hra)((View)f).getTag(2131297133);
                final gra d3 = hra.d0;
                if (d3 != null) {
                    a = d3.a;
                }
                if (hra2.d0 != null) {
                    hra2.c().a = a;
                }
            }
        }
    }
    
    public final void c(final hra hra) {
        if (I(2)) {
            Objects.toString((Object)hra);
        }
        if (hra.W) {
            hra.W = false;
            if (!hra.F) {
                this.c.b(hra);
                if (I(2)) {
                    hra.toString();
                }
                if (J(hra)) {
                    this.G = true;
                }
            }
        }
    }
    
    public final void c0() {
        for (final asa asa : this.c.y()) {
            final hra j = asa.j();
            if (j.b0) {
                if (this.b) {
                    this.K = true;
                }
                else {
                    j.b0 = false;
                    asa.k();
                }
            }
        }
    }
    
    public final void d() {
        if (I(3)) {
            Objects.toString((Object)this.h);
        }
        final cp1 h = this.h;
        if (h != null) {
            h.r = false;
            h.d();
            final cp1 h2 = this.h;
            final ld ld = new ld((Object)this, (byte)22);
            ArrayList p;
            if ((p = h2.p) == null) {
                p = new ArrayList();
                h2.p = p;
            }
            p.add((Object)ld);
            this.h.e(false, true);
            this.A(this.i = true);
            final Iterator iterator = this.f().iterator();
            while (iterator.hasNext()) {
                ((v68)iterator.next()).e();
            }
            this.i = false;
            this.h = null;
        }
    }
    
    public final void d0(final IllegalStateException ex) {
        Log.e("FragmentManager", ((Throwable)ex).getMessage());
        Log.e("FragmentManager", "Activity state:");
        final PrintWriter printWriter = new PrintWriter((Writer)new sqd());
        final jra w = this.w;
        if (w != null) {
            try {
                w.B.dump("  ", null, printWriter, new String[0]);
            }
            catch (final Exception ex2) {
                Log.e("FragmentManager", "Failed dumping state", (Throwable)ex2);
            }
        }
        else {
            try {
                this.w("  ", null, printWriter, new String[0]);
            }
            catch (final Exception ex3) {
                Log.e("FragmentManager", "Failed dumping state", (Throwable)ex3);
            }
        }
        throw ex;
    }
    
    public final void e() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }
    
    public final void e0() {
        final ArrayList a;
        monitorenter(a = this.a);
        Label_0056: {
            try {
                final boolean empty = this.a.isEmpty();
                final boolean b = true;
                if (empty) {
                    break Label_0056;
                }
                ((z7g)this.j).f(true);
                if (I(3)) {
                    this.toString();
                }
                break Label_0056;
            }
            finally {
                monitorexit(a);
                while (true) {
                    boolean b = false;
                    final int size;
                    int n;
                    Label_0106:Label_0085_Outer:Block_9_Outer:
                    while (true) {
                        while (true) {
                            while (true) {
                                while (true) {
                                    break Label_0106;
                                    iftrue(Label_0104:)(size + n <= 0 || !M(this.y));
                                    continue Label_0085_Outer;
                                }
                                this.toString();
                                break Label_0106;
                                Label_0083: {
                                    n = 0;
                                }
                                continue Block_9_Outer;
                                n = 1;
                                continue Block_9_Outer;
                            }
                            iftrue(Label_0118:)(!I(3));
                            continue;
                        }
                        monitorexit(a);
                        return;
                        Label_0104: {
                            b = false;
                        }
                        continue Label_0106;
                    }
                    ((z7g)this.j).f(b);
                    return;
                    monitorexit(a);
                    size = this.d.size();
                    iftrue(Label_0083:)(this.h == null);
                    continue;
                }
            }
        }
    }
    
    public final HashSet f() {
        final HashSet set = new HashSet();
        final Iterator iterator = this.c.y().iterator();
        while (iterator.hasNext()) {
            final ViewGroup a0 = ((asa)iterator.next()).j().a0;
            if (a0 != null) {
                this.H();
                set.add((Object)v68.f(a0));
            }
        }
        return set;
    }
    
    public final HashSet g(final ArrayList list, int i, final int n) {
        final HashSet set = new HashSet();
        while (i < n) {
            final Iterator iterator = ((cp1)list.get(i)).a.iterator();
            while (iterator.hasNext()) {
                final hra b = ((dsa)iterator.next()).b;
                if (b != null) {
                    final ViewGroup a0 = b.a0;
                    if (a0 == null) {
                        continue;
                    }
                    set.add((Object)v68.g(a0, this));
                }
            }
            ++i;
        }
        return set;
    }
    
    public final asa h(final hra hra) {
        final String z = hra.z;
        final c2l c = this.c;
        final asa asa = (asa)((HashMap)c.x).get((Object)z);
        if (asa != null) {
            return asa;
        }
        final asa asa2 = new asa(this.o, c, hra);
        asa2.m(this.w.y.getClassLoader());
        asa2.p(this.v);
        return asa2;
    }
    
    public final void i(final hra hra) {
        if (I(2)) {
            Objects.toString((Object)hra);
        }
        if (!hra.W) {
            hra.W = true;
            if (hra.F) {
                if (I(2)) {
                    hra.toString();
                }
                final c2l c = this.c;
                final ArrayList list = (ArrayList)c.w;
                synchronized (list) {
                    ((ArrayList)c.w).remove((Object)hra);
                    monitorexit(list);
                    hra.F = false;
                    if (J(hra)) {
                        this.G = true;
                    }
                    this.b0(hra);
                }
            }
        }
    }
    
    public final void j(final boolean b) {
        if (b && this.w != null) {
            this.d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (final hra hra : this.c.A()) {
            if (hra != null) {
                hra.Z = true;
                if (!b) {
                    continue;
                }
                hra.Q.j(true);
            }
        }
    }
    
    public final boolean k() {
        if (this.v >= 1) {
            for (final hra hra : this.c.A()) {
                if (hra != null && (!hra.V && hra.Q.k())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean l() {
        final int v = this.v;
        int i = 0;
        if (v < 1) {
            return false;
        }
        final Iterator iterator = this.c.A().iterator();
        ArrayList e = null;
        boolean b = false;
        while (iterator.hasNext()) {
            final hra hra = (hra)iterator.next();
            if (hra != null && L(hra) && (!hra.V && hra.Q.l())) {
                ArrayList list;
                if ((list = e) == null) {
                    list = new ArrayList();
                }
                list.add((Object)hra);
                b = true;
                e = list;
            }
        }
        if (this.e != null) {
            while (i < this.e.size()) {
                final hra hra2 = (hra)this.e.get(i);
                if (e == null || !e.contains((Object)hra2)) {
                    hra2.getClass();
                }
                ++i;
            }
        }
        this.e = e;
        return b;
    }
    
    public final void m() {
        boolean f = true;
        this.A(this.J = true);
        this.x();
        final jra w = this.w;
        final c2l c = this.c;
        if (w != null) {
            f = ((xra)c.z).f;
        }
        else {
            final Context y = w.y;
            if (y instanceof Activity) {
                f = (true ^ ((Activity)y).isChangingConfigurations());
            }
        }
        if (f) {
            final Iterator iterator = this.l.values().iterator();
            while (iterator.hasNext()) {
                for (final String s : ((ep1)iterator.next()).v) {
                    final xra xra = (xra)c.z;
                    xra.getClass();
                    I(3);
                    xra.e(s, false);
                }
            }
        }
        this.v(-1);
        final jra w2 = this.w;
        if (w2 != null) {
            w2.B.F.remove((Object)this.r);
        }
        final jra w3 = this.w;
        if (w3 != null) {
            w3.B((yv6)this.q);
        }
        final jra w4 = this.w;
        if (w4 != null) {
            w4.B.H.remove((Object)this.s);
        }
        final jra w5 = this.w;
        if (w5 != null) {
            w5.B.I.remove((Object)this.t);
        }
        final jra w6 = this.w;
        if (w6 != null && this.y == null) {
            final tze x = w6.B.x;
            final CopyOnWriteArrayList list = (CopyOnWriteArrayList)x.x;
            final ora u = this.u;
            list.remove((Object)u);
            ge9.C(((HashMap)x.y).remove((Object)u));
            ((Runnable)x.w).run();
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            ((z7g)this.j).e();
            this.g = null;
        }
        final pe c2 = this.C;
        if (c2 != null) {
            c2.r0();
            this.D.r0();
            this.E.r0();
        }
    }
    
    public final void n(final boolean b) {
        if (b && this.w != null) {
            this.d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (final hra hra : this.c.A()) {
            if (hra != null) {
                hra.Z = true;
                if (!b) {
                    continue;
                }
                hra.Q.n(true);
            }
        }
    }
    
    public final void o(final boolean b) {
        if (b && this.w != null) {
            this.d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (final hra hra : this.c.A()) {
            if (hra != null && b) {
                hra.Q.o(true);
            }
        }
    }
    
    public final void p() {
        for (final hra hra : this.c.z()) {
            if (hra != null) {
                hra.o();
                hra.Q.p();
            }
        }
    }
    
    public final boolean q() {
        if (this.v >= 1) {
            for (final hra hra : this.c.A()) {
                if (hra != null && (!hra.V && hra.Q.q())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void r() {
        if (this.v >= 1) {
            for (final hra hra : this.c.A()) {
                if (hra != null && !hra.V) {
                    hra.Q.r();
                }
            }
        }
    }
    
    public final void s(final hra hra) {
        if (hra != null) {
            if (hra == this.c.w(hra.z)) {
                hra.O.getClass();
                final boolean m = M(hra);
                final Boolean e = hra.E;
                if (e == null || e != m) {
                    hra.E = m;
                    final vra q = hra.Q;
                    q.e0();
                    q.s(q.z);
                }
            }
        }
    }
    
    public final void t(final boolean b) {
        if (b && this.w != null) {
            this.d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (final hra hra : this.c.A()) {
            if (hra != null && b) {
                hra.Q.t(true);
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)this)));
        sb.append(" in ");
        final hra y = this.y;
        if (y != null) {
            sb.append(y.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode((Object)this.y)));
            sb.append("}");
        }
        else {
            final jra w = this.w;
            if (w != null) {
                sb.append(w.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode((Object)this.w)));
                sb.append("}");
            }
            else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }
    
    public final boolean u() {
        if (this.v < 1) {
            return false;
        }
        final Iterator iterator = this.c.A().iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final hra hra = (hra)iterator.next();
            if (hra != null && L(hra) && (!hra.V && hra.Q.u())) {
                b = true;
            }
        }
        return b;
    }
    
    public final void v(final int n) {
        Label_0109: {
            try {
                this.b = true;
                for (final asa asa : ((HashMap)this.c.x).values()) {
                    if (asa != null) {
                        asa.p(n);
                    }
                }
                this.O(n, false);
                final Iterator iterator2 = this.f().iterator();
                while (iterator2.hasNext()) {
                    ((v68)iterator2.next()).d();
                }
            }
            finally {
                break Label_0109;
            }
            this.b = false;
            this.A(true);
            return;
        }
        this.b = false;
    }
    
    public final void w(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final String z = smk.z(s, "    ");
        final c2l c = this.c;
        final ArrayList list = (ArrayList)c.w;
        final String z2 = smk.z(s, "    ");
        final HashMap hashMap = (HashMap)c.x;
        final boolean empty = hashMap.isEmpty();
        final int n = 0;
        if (!empty) {
            printWriter.print(s);
            printWriter.println("Active Fragments:");
            for (final asa asa : hashMap.values()) {
                printWriter.print(s);
                if (asa != null) {
                    final hra j = asa.j();
                    printWriter.println((Object)j);
                    printWriter.print(z2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(j.S));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(j.T));
                    printWriter.print(" mTag=");
                    printWriter.println(j.U);
                    printWriter.print(z2);
                    printWriter.print("mState=");
                    printWriter.print(j.v);
                    printWriter.print(" mWho=");
                    printWriter.print(j.z);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(j.N);
                    printWriter.print(z2);
                    printWriter.print("mAdded=");
                    printWriter.print(j.F);
                    printWriter.print(" mRemoving=");
                    printWriter.print(j.G);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(j.I);
                    printWriter.print(" mInLayout=");
                    printWriter.println(j.J);
                    printWriter.print(z2);
                    printWriter.print("mHidden=");
                    printWriter.print(j.V);
                    printWriter.print(" mDetached=");
                    printWriter.print(j.W);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(j.Y);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(z2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(j.X);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(j.c0);
                    if (j.O != null) {
                        printWriter.print(z2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println((Object)j.O);
                    }
                    if (j.P != null) {
                        printWriter.print(z2);
                        printWriter.print("mHost=");
                        printWriter.println((Object)j.P);
                    }
                    if (j.R != null) {
                        printWriter.print(z2);
                        printWriter.print("mParentFragment=");
                        printWriter.println((Object)j.R);
                    }
                    if (j.A != null) {
                        printWriter.print(z2);
                        printWriter.print("mArguments=");
                        printWriter.println((Object)j.A);
                    }
                    if (j.w != null) {
                        printWriter.print(z2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println((Object)j.w);
                    }
                    if (j.x != null) {
                        printWriter.print(z2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println((Object)j.x);
                    }
                    if (j.y != null) {
                        printWriter.print(z2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println((Object)j.y);
                    }
                    hra hra = j.B;
                    Label_0683: {
                        if (hra == null) {
                            final vra o = j.O;
                            if (o != null) {
                                final String c2 = j.C;
                                if (c2 != null) {
                                    hra = o.c.w(c2);
                                    break Label_0683;
                                }
                            }
                            hra = null;
                        }
                    }
                    if (hra != null) {
                        printWriter.print(z2);
                        printWriter.print("mTarget=");
                        printWriter.print((Object)hra);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(j.D);
                    }
                    printWriter.print(z2);
                    printWriter.print("mPopDirection=");
                    final gra d0 = j.d0;
                    printWriter.println(d0 != null && d0.a);
                    final gra d2 = j.d0;
                    int b;
                    if (d2 == null) {
                        b = 0;
                    }
                    else {
                        b = d2.b;
                    }
                    if (b != 0) {
                        printWriter.print(z2);
                        printWriter.print("getEnterAnim=");
                        final gra d3 = j.d0;
                        int b2;
                        if (d3 == null) {
                            b2 = 0;
                        }
                        else {
                            b2 = d3.b;
                        }
                        printWriter.println(b2);
                    }
                    final gra d4 = j.d0;
                    int c3;
                    if (d4 == null) {
                        c3 = 0;
                    }
                    else {
                        c3 = d4.c;
                    }
                    if (c3 != 0) {
                        printWriter.print(z2);
                        printWriter.print("getExitAnim=");
                        final gra d5 = j.d0;
                        int c4;
                        if (d5 == null) {
                            c4 = 0;
                        }
                        else {
                            c4 = d5.c;
                        }
                        printWriter.println(c4);
                    }
                    final gra d6 = j.d0;
                    int d7;
                    if (d6 == null) {
                        d7 = 0;
                    }
                    else {
                        d7 = d6.d;
                    }
                    if (d7 != 0) {
                        printWriter.print(z2);
                        printWriter.print("getPopEnterAnim=");
                        final gra d8 = j.d0;
                        int d9;
                        if (d8 == null) {
                            d9 = 0;
                        }
                        else {
                            d9 = d8.d;
                        }
                        printWriter.println(d9);
                    }
                    final gra d10 = j.d0;
                    int e;
                    if (d10 == null) {
                        e = 0;
                    }
                    else {
                        e = d10.e;
                    }
                    if (e != 0) {
                        printWriter.print(z2);
                        printWriter.print("getPopExitAnim=");
                        final gra d11 = j.d0;
                        int e2;
                        if (d11 == null) {
                            e2 = 0;
                        }
                        else {
                            e2 = d11.e;
                        }
                        printWriter.println(e2);
                    }
                    if (j.a0 != null) {
                        printWriter.print(z2);
                        printWriter.print("mContainer=");
                        printWriter.println((Object)j.a0);
                    }
                    if (j.h() != null) {
                        sn9.P((gbd)j).N(z2, printWriter);
                    }
                    printWriter.print(z2);
                    final StringBuilder sb = new StringBuilder("Child ");
                    sb.append((Object)j.Q);
                    sb.append(":");
                    printWriter.println(sb.toString());
                    j.Q.w(z2.concat("  "), fileDescriptor, printWriter, array);
                }
                else {
                    printWriter.println("null");
                }
            }
        }
        final int size = list.size();
        if (size > 0) {
            printWriter.print(s);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; ++i) {
                final hra hra2 = (hra)list.get(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(hra2.toString());
            }
        }
        final ArrayList e3 = this.e;
        if (e3 != null) {
            final int size2 = e3.size();
            if (size2 > 0) {
                printWriter.print(s);
                printWriter.println("Fragments Created Menus:");
                for (int k = 0; k < size2; ++k) {
                    final hra hra3 = (hra)this.e.get(k);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(k);
                    printWriter.print(": ");
                    printWriter.println(hra3.toString());
                }
            }
        }
        final int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(s);
            printWriter.println("Back Stack:");
            for (int l = 0; l < size3; ++l) {
                final cp1 cp1 = (cp1)this.d.get(l);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(l);
                printWriter.print(": ");
                printWriter.println(cp1.toString());
                cp1.g(z, printWriter, true);
            }
        }
        printWriter.print(s);
        final StringBuilder sb2 = new StringBuilder("Back Stack Index: ");
        sb2.append(this.k.get());
        printWriter.println(sb2.toString());
        final ArrayList a;
        monitorenter(a = this.a);
        Label_1604: {
            try {
                final int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(s);
                    printWriter.println("Pending Actions:");
                    for (int n2 = n; n2 < size4; ++n2) {
                        final sra sra = (sra)this.a.get(n2);
                        printWriter.print(s);
                        printWriter.print("  #");
                        printWriter.print(n2);
                        printWriter.print(": ");
                        printWriter.println((Object)sra);
                    }
                }
                break Label_1604;
            }
            finally {
                monitorexit(a);
                while (true) {
                    printWriter.print(s);
                    printWriter.print("  mCurState=");
                    printWriter.print(this.v);
                    printWriter.print(" mStateSaved=");
                    printWriter.print(this.H);
                    printWriter.print(" mStopped=");
                    printWriter.print(this.I);
                    printWriter.print(" mDestroyed=");
                    printWriter.println(this.J);
                    iftrue(Label_1778:)(!this.G);
                    Block_42: {
                        Block_43: {
                            break Block_43;
                            Label_1778: {
                                return;
                            }
                            monitorexit(a);
                            printWriter.print(s);
                            printWriter.println("FragmentManager misc state:");
                            printWriter.print(s);
                            printWriter.print("  mHost=");
                            printWriter.println((Object)this.w);
                            printWriter.print(s);
                            printWriter.print("  mContainer=");
                            printWriter.println((Object)this.x);
                            iftrue(Label_1686:)(this.y == null);
                            break Block_42;
                        }
                        printWriter.print(s);
                        printWriter.print("  mNeedMenuInvalidate=");
                        printWriter.println(this.G);
                        return;
                    }
                    printWriter.print(s);
                    printWriter.print("  mParent=");
                    printWriter.println((Object)this.y);
                    continue;
                }
            }
        }
    }
    
    public final void x() {
        final Iterator iterator = this.f().iterator();
        while (iterator.hasNext()) {
            ((v68)iterator.next()).d();
        }
    }
    
    public final void y(final sra sra, final boolean b) {
        if (!b) {
            if (this.w == null) {
                if (this.J) {
                    en9.q("FragmentManager has been destroyed");
                    return;
                }
                en9.q("FragmentManager has not been attached to a host.");
                return;
            }
            else if (this.N()) {
                en9.q("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        final ArrayList a;
        monitorenter(a = this.a);
        Label_0091: {
            try {
                if (this.w != null) {
                    break Label_0091;
                }
                if (b) {
                    monitorexit(a);
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            finally {
                monitorexit(a);
                throw new IllegalStateException("Activity has been destroyed");
                this.a.add((Object)sra);
                this.X();
                monitorexit(a);
            }
        }
    }
    
    public final void z(final boolean b) {
        if (this.b) {
            en9.q("FragmentManager is already executing transactions");
            return;
        }
        if (this.w == null) {
            if (this.J) {
                en9.q("FragmentManager has been destroyed");
                return;
            }
            en9.q("FragmentManager has not been attached to a host.");
        }
        else {
            if (Looper.myLooper() != this.w.z.getLooper()) {
                en9.q("Must be called from main thread of fragment host");
                return;
            }
            if (!b && this.N()) {
                en9.q("Can not perform this action after onSaveInstanceState");
                return;
            }
            if (this.L == null) {
                this.L = new ArrayList();
                this.M = new ArrayList();
            }
        }
    }
}
