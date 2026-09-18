import androidx.compose.runtime.ComposeRuntimeError;
import java.util.Map$Entry;
import java.util.HashMap;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class j0j extends tl6
{
    public static final apm B;
    public static final AtomicReference C;
    public final eup A;
    public long a;
    public final ic0 b;
    public final tze c;
    public final Object d;
    public opc e;
    public Throwable f;
    public final ArrayList g;
    public List h;
    public umf i;
    public final inf j;
    public final ArrayList k;
    public final ArrayList l;
    public final tmf m;
    public final e3a n;
    public final tmf o;
    public final tmf p;
    public ArrayList q;
    public umf r;
    public l13 s;
    public boolean t;
    public final apm u;
    public boolean v;
    public final apm w;
    public final tze x;
    public final ppc y;
    public final hc7 z;
    
    static {
        B = bpm.a((Object)n4h.y);
        C = new AtomicReference((Object)Boolean.FALSE);
    }
    
    public j0j(final hc7 hc7) {
        final ic0 b = new ic0((jta)new d0j(this, (byte)0));
        this.b = b;
        this.c = new tze(new d0j(this, (byte)1));
        this.d = new Object();
        this.g = new ArrayList();
        this.i = new umf();
        this.j = new inf(0, new yl6[16]);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new tmf();
        this.n = new e3a((byte)13);
        this.o = new tmf();
        this.p = new tmf();
        this.u = bpm.a((Object)null);
        this.w = bpm.a((Object)g0j.x);
        this.x = new tze((byte)12);
        final ppc y = new ppc((opc)hc7.M0((gc7)o55.z));
        ((bqc)y).U0((lta)new e0j((Object)this, (byte)0));
        this.y = y;
        this.z = hc7.F0((hc7)b).F0((hc7)y);
        this.A = new eup((byte)23);
    }
    
    public static final void B(final j0j j0j, final iif iif, final iif iif2) {
        final List e = iif2.e();
        if (e != null) {
            for (int size = ((Collection)e).size(), i = 0; i < size; ++i) {
                final iif iif3 = (iif)e.get(i);
                final e3a n = j0j.n;
                final gif c = iif3.c();
                final urf urf = new urf(iif3, iif);
                gkf.a((tmf)n.w, c, urf);
                gkf.a((tmf)n.x, urf.a(), c);
                B(j0j, iif, iif3);
            }
        }
    }
    
    public static final void K(final ArrayList list, final j0j j0j, final yl6 obj) {
        list.clear();
        final Object d;
        monitorenter(d = j0j.d);
        Label_0078: {
            try {
                final Iterator iterator = j0j.l.iterator();
                while (iterator.hasNext()) {
                    final iif iif = (iif)iterator.next();
                    if (iif.b().equals(obj)) {
                        list.add((Object)iif);
                        iterator.remove();
                    }
                }
            }
            finally {
                break Label_0078;
            }
            monitorexit(d);
            return;
        }
        monitorexit(d);
    }
    
    public static void z(final zmf zmf) {
        try {
            if (!(zmf.w() instanceof s7m)) {
                return;
            }
            throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
        }
        finally {
            zmf.c();
        }
    }
    
    public final void A() {
        final Object d;
        monitorenter(d = this.d);
        Label_0069: {
            try {
                if (((g0j)this.w.getValue()).compareTo((Enum)g0j.z) >= 0) {
                    final apm w = this.w;
                    final g0j w2 = g0j.w;
                    w.getClass();
                    w.n((Object)null, (Object)w2);
                }
            }
            finally {
                break Label_0069;
            }
            monitorexit(d);
            ((bqc)this.y).g((CancellationException)null);
            return;
        }
        monitorexit(d);
    }
    
    public final k13 C() {
        final apm w = this.w;
        final int compareTo = ((g0j)w.getValue()).compareTo((Enum)g0j.w);
        final apm u = this.u;
        final ArrayList l = this.l;
        final ArrayList k = this.k;
        final inf j = this.j;
        if (compareTo <= 0) {
            final List h = this.H();
            for (int size = ((Collection)h).size(), i = 0; i < size; ++i) {
                final yl6 yl6 = (yl6)h.get(i);
            }
            this.g.clear();
            this.h = (List)r89.v;
            this.i = new umf();
            j.h();
            k.clear();
            l.clear();
            this.q = null;
            final l13 s = this.s;
            if (s != null) {
                o3r.e(s);
            }
            this.s = null;
            u.m((Object)null);
            return null;
        }
        final Object value = u.getValue();
        final g0j a = g0j.A;
        g0j g0j = g0j.x;
        Label_0302: {
            if (value == null) {
                if (this.e == null) {
                    this.i = new umf();
                    j.h();
                    if (this.D() || this.F()) {
                        g0j = g0j.y;
                    }
                }
                else {
                    if (j.x == 0) {
                        if (!this.i.h() && k.isEmpty() && l.isEmpty() && !this.D() && !this.F()) {
                            if (!this.m.j()) {
                                g0j = g0j.z;
                                break Label_0302;
                            }
                        }
                    }
                    g0j = a;
                }
            }
        }
        w.n((Object)null, (Object)g0j);
        if (g0j == a) {
            final l13 s2 = this.s;
            this.s = null;
            return (k13)s2;
        }
        return null;
    }
    
    public final boolean D() {
        return !this.v && (((cc1)((uy7)this.b.x).x).get() & 0x7FFFFFF) > 0;
    }
    
    public final boolean E() {
        if (this.j.x == 0) {
            if (!this.D() && !this.F()) {
                if (!this.m.j()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final boolean F() {
        return !this.v && (((cc1)((uy7)this.c.x).x).get() & 0x7FFFFFF) > 0;
    }
    
    public final boolean G() {
        final Object d;
        monitorenter(d = this.d);
        Label_0068: {
            boolean f = false;
            Label_0063: {
                try {
                    if (!this.i.h()) {
                        if (this.j.x == 0) {
                            if (!this.D()) {
                                f = this.F();
                                if (!f) {
                                    f = false;
                                    break Label_0063;
                                }
                            }
                        }
                    }
                }
                finally {
                    break Label_0068;
                }
                f = true;
            }
            monitorexit(d);
            return f;
        }
        monitorexit(d);
    }
    
    public final List H() {
        final List h = this.h;
        if (h != null) {
            return h;
        }
        final ArrayList g = this.g;
        Object v;
        if (g.isEmpty()) {
            v = r89.v;
        }
        else {
            v = new ArrayList((Collection)g);
        }
        return this.h = (List)v;
    }
    
    public final void I() {
        final Object d = this.d;
        synchronized (d) {
            final k13 c = this.C();
            if (((g0j)this.w.getValue()).compareTo((Enum)g0j.w) > 0) {
                monitorexit(d);
                if (c != null) {
                    ((l13)c).resumeWith((Object)lqo.a);
                }
                return;
            }
            throw w5e.b("Recomposer shutdown; frame clock awaiter will never resume", this.f);
        }
    }
    
    public final void J(final yl6 obj) {
        final Object d;
        monitorenter(d = this.d);
        Label_0114: {
            Label_0110: {
                try {
                    final ArrayList l = this.l;
                    Block_4: {
                        for (int size = l.size(), i = 0; i < size; ++i) {
                            if (((iif)l.get(i)).b().equals(obj)) {
                                break Block_4;
                            }
                        }
                        break Label_0110;
                    }
                    monitorexit(d);
                    final ArrayList list = new ArrayList();
                    K(list, this, obj);
                    while (!list.isEmpty()) {
                        this.L((List)list, null);
                        K(list, this, obj);
                    }
                    return;
                }
                finally {
                    break Label_0114;
                }
            }
            monitorexit(d);
            return;
        }
        monitorexit(d);
    }
    
    public final List L(final List list, final umf umf) {
        final HashMap hashMap = new HashMap(list.size());
        for (int n = ((Collection)list).size(), i = 0; i < n; ++i) {
            final Object value = list.get(i);
            final yl6 b = ((iif)value).b();
            Object value2;
            if ((value2 = hashMap.get((Object)b)) == null) {
                value2 = new ArrayList();
                hashMap.put((Object)b, value2);
            }
            ((ArrayList)value2).add(value);
        }
        for (Map$Entry map$Entry : hashMap.entrySet()) {
            final yl6 yl6 = (yl6)map$Entry.getKey();
            Object c = map$Entry.getValue();
            if (yl6.Q.F) {
                ti6.a("Check failed");
            }
            Object o = new p8a((Object)yl6, (byte)29);
            Object d = new tt8((Object)yl6, (Object)umf, (byte)24);
            final r7m h = g8m.h();
            zmf zmf;
            if (h instanceof zmf) {
                zmf = (zmf)h;
            }
            else {
                zmf = null;
            }
            if (zmf != null) {
                final zmf c2 = zmf.C((lta)o, (lta)d);
                if (c2 != null) {
                    Label_0937: {
                        r7m j = null;
                        final Throwable t2;
                        Label_0930: {
                            Object d2 = null;
                            Label_0925: {
                                try {
                                    int n;
                                    int i = 0;
                                    iif iif;
                                    final Throwable t;
                                    ArrayList list2 = null;
                                    e3a n2;
                                    yog yog2;
                                    yog yog;
                                    e3a n3;
                                    gif c3;
                                    tmf tmf;
                                    urf urf;
                                    iif b2;
                                    Object value3;
                                    Label_0901:Label_0737_Outer:
                                    while (true) {
                                        j = c2.j();
                                    Label_0802:
                                        while (true) {
                                            Label_0783: {
                                                try {
                                                    while (true) {
                                                        monitorenter(d2 = this.d);
                                                        while (true) {
                                                            try {
                                                                d = new ArrayList(((List)c).size());
                                                                n = ((Collection)c).size();
                                                                i = 0;
                                                                if (i >= n) {
                                                                    break;
                                                                }
                                                                o = ((List)c).get(i);
                                                                iif = (iif)gkf.b(this.m, ((iif)o).c());
                                                                if (iif != null) {
                                                                    this.n.Z(iif);
                                                                }
                                                            }
                                                            finally {
                                                                break Label_0925;
                                                            }
                                                            ((ArrayList)d).add((Object)new yog(o, (Object)t));
                                                            ++i;
                                                            continue Label_0737_Outer;
                                                        }
                                                    }
                                                    n = ((ArrayList)d).size();
                                                    i = 0;
                                                    while (true) {
                                                        list2 = (ArrayList)d;
                                                        if (i >= n) {
                                                            break;
                                                        }
                                                        c = ((ArrayList)d).get(i);
                                                        if (((yog)c).w == null) {
                                                            n2 = this.n;
                                                            c = ((iif)((yog)c).v).c();
                                                            if (((tmf)n2.w).b(c)) {
                                                                c = new ArrayList(((ArrayList)d).size());
                                                                for (n = ((ArrayList)d).size(), i = 0; i < n; ++i) {
                                                                    yog = (yog2 = (yog)((ArrayList)d).get(i));
                                                                    if (yog.w == null) {
                                                                        n3 = this.n;
                                                                        c3 = ((iif)yog.v).c();
                                                                        tmf = (tmf)n3.w;
                                                                        urf = (urf)gkf.b(tmf, c3);
                                                                        if (tmf.i()) {
                                                                            ((tmf)n3.x).a();
                                                                        }
                                                                        if (urf == null) {
                                                                            yog2 = yog;
                                                                        }
                                                                        else {
                                                                            b2 = urf.b();
                                                                            gkf.a(this.p, urf.a(), b2);
                                                                            yog2 = new yog(yog.v, (Object)b2);
                                                                        }
                                                                    }
                                                                    ((ArrayList)c).add((Object)yog2);
                                                                }
                                                                list2 = (ArrayList)c;
                                                                break;
                                                            }
                                                        }
                                                        ++i;
                                                    }
                                                    monitorexit(d2);
                                                    n = ((Collection)list2).size();
                                                    i = 0;
                                                    while (true) {
                                                        d = list2;
                                                        if (i >= n) {
                                                            break Label_0901;
                                                        }
                                                        if (((yog)((List)list2).get(i)).w != null) {
                                                            break;
                                                        }
                                                        ++i;
                                                    }
                                                    n = ((Collection)list2).size();
                                                    i = 0;
                                                    while (true) {
                                                        d = list2;
                                                        if (i >= n) {
                                                            break Label_0901;
                                                        }
                                                        if (((yog)((List)list2).get(i)).w == null) {
                                                            break;
                                                        }
                                                        ++i;
                                                    }
                                                    c = new ArrayList(((List)list2).size());
                                                    n = ((Collection)list2).size();
                                                    i = 0;
                                                    if (i >= n) {
                                                        break Label_0802;
                                                    }
                                                    d = ((List)list2).get(i);
                                                    if (((yog)d).w == null) {
                                                        d = ((yog)d).v;
                                                        break Label_0783;
                                                    }
                                                }
                                                finally {
                                                    break Label_0930;
                                                }
                                                d = null;
                                            }
                                            if (d != null) {
                                                ((ArrayList)c).add(d);
                                            }
                                            ++i;
                                            continue;
                                        }
                                        d = this.d;
                                        synchronized (d) {
                                            h86.t0((Collection)this.l, (Iterable)c);
                                            monitorexit(d);
                                            d = new ArrayList(((List)list2).size());
                                            for (n = ((Collection)list2).size(), i = 0; i < n; ++i) {
                                                value3 = ((List)list2).get(i);
                                                if (((yog)value3).w != null) {
                                                    ((ArrayList)d).add(value3);
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    yl6.u((ArrayList)d);
                                    r7m.q(j);
                                    z(c2);
                                    continue;
                                }
                                finally {
                                    break Label_0937;
                                }
                            }
                            monitorexit(d2);
                            throw t2;
                        }
                        r7m.q(j);
                        throw t2;
                    }
                    z(c2);
                }
            }
            en9.q("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
        return c86.s1((Iterable)hashMap.keySet());
    }
    
    public final yl6 M(final yl6 yl6, umf q) {
        if (!yl6.Q.F) {
            if (yl6.R == 3) {
                return null;
            }
            final umf r = this.r;
            if (r == null || !r.c((Object)yl6)) {
                final p8a p8a = new p8a((Object)yl6, (byte)29);
                Object j = new tt8((Object)yl6, (Object)q, (byte)24);
                final r7m h = g8m.h();
                zmf zmf;
                if (h instanceof zmf) {
                    zmf = (zmf)h;
                }
                else {
                    zmf = null;
                }
                if (zmf != null) {
                    final zmf c = zmf.C((lta)p8a, (lta)j);
                    if (c != null) {
                        Label_0230: {
                            Label_0223: {
                                try {
                                    j = c.j();
                                    if (q != null) {
                                        try {
                                            if (q.h()) {
                                                final nob nob = new nob((Object)q, (Object)yl6, (byte)25);
                                                q = (umf)yl6.Q;
                                                if (((gva)q).F) {
                                                    ti6.a("Preparing a composition while composing is not supported");
                                                }
                                                ((gva)q).F = true;
                                                try {
                                                    nob.a();
                                                }
                                                finally {
                                                    ((gva)q).F = false;
                                                }
                                            }
                                        }
                                        finally {
                                            break Label_0223;
                                        }
                                    }
                                    final boolean y = yl6.y();
                                    r7m.q((r7m)j);
                                    z(c);
                                    if (y) {
                                        return yl6;
                                    }
                                    return null;
                                }
                                finally {
                                    break Label_0230;
                                }
                            }
                            r7m.q((r7m)j);
                            throw;
                        }
                        z(c);
                    }
                }
                en9.q("Cannot create a mutable snapshot of an read-only snapshot");
            }
        }
        return null;
    }
    
    public final void N(final Throwable t, final yl6 yl6) {
        if ((boolean)j0j.C.get() && !(t instanceof ComposeRuntimeError)) {
            final Object d;
            monitorenter(d = this.d);
            Label_0155: {
                try {
                    z9r.g("Error was captured in composition while live edit was enabled.", t);
                    this.k.clear();
                    this.j.h();
                    this.i = new umf();
                    this.l.clear();
                    this.m.a();
                    this.o.a();
                    final apm u = this.u;
                    final f0j f0j = new f0j(t);
                    u.getClass();
                    u.n((Object)null, (Object)f0j);
                    if (yl6 != null) {
                        this.P(yl6);
                    }
                }
                finally {
                    break Label_0155;
                }
                if (this.C() != null) {
                    ti6.a("expected to go to inactive state due to composition error");
                }
                monitorexit(d);
                return;
            }
            monitorexit(d);
        }
        else {
            final Object d2;
            monitorenter(d2 = this.d);
            Label_0235: {
                Object u2;
                try {
                    z9r.g("Error was captured in composition.", t);
                    u2 = this.u.getValue();
                    if (u2 == null) {
                        u2 = this.u;
                        final f0j f0j2 = new f0j(t);
                        ((f0j)u2).getClass();
                        ((apm)u2).n((Object)null, (Object)f0j2);
                        monitorexit(d2);
                        throw t;
                    }
                }
                finally {
                    break Label_0235;
                }
                throw ((f0j)u2).a();
            }
            monitorexit(d2);
        }
    }
    
    public final boolean O() {
        final Object d;
        monitorenter(d = this.d);
        Label_0275: {
            try {
                if (this.i.g()) {
                    final boolean e = this.E();
                    monitorexit(d);
                    return e;
                }
            }
            finally {
                break Label_0275;
            }
            final List h = this.H();
            final lak lak = new lak(this.i);
            this.i = new umf();
            monitorexit(d);
            Label_0145: {
                try {
                    for (int size = ((Collection)h).size(), i = 0; i < size; ++i) {
                        ((yl6)h.get(i)).z(lak);
                        if (((g0j)this.w.getValue()).compareTo((Enum)g0j.w) <= 0) {
                            break;
                        }
                    }
                    break Label_0145;
                }
                finally {
                    final Object d2 = this.d;
                    synchronized (d2) {
                        final umf j = this.i;
                        final int d3 = j.d;
                        final Iterator iterator = ((Iterable)lak).iterator();
                        while (iterator.hasNext()) {
                            j.k(iterator.next());
                        }
                        monitorexit(d2);
                    }
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    final Object d4;
                    monitorenter(d4 = this.d);
                    Label_0197: {
                        try {
                            if (this.C() == null) {
                                final boolean e2 = this.E();
                                monitorexit(d4);
                                return e2;
                            }
                        }
                        finally {
                            break Label_0197;
                        }
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    monitorexit(d4);
                }
            }
        }
        monitorexit(d);
    }
    
    public final void P(final yl6 yl6) {
        ArrayList q;
        if ((q = this.q) == null) {
            q = new ArrayList();
            this.q = q;
        }
        if (!((List)q).contains((Object)yl6)) {
            ((Collection)q).add((Object)yl6);
        }
        if (this.g.remove((Object)yl6)) {
            this.h = null;
        }
    }
    
    public final Object Q(final m6n m6n) {
        Object f0 = rhc.f0((hc7)this.b, (zta)new eh0((Object)this, (Object)new i0j(this, null), (Object)ien.v(((h07)m6n).getContext()), (f07)null, (byte)6), (f07)m6n);
        final lqo a = lqo.a;
        final pc7 v = pc7.v;
        if (f0 != v) {
            f0 = a;
        }
        if (f0 == v) {
            return f0;
        }
        return a;
    }
    
    @Override
    public final void a(final yl6 p0, final zta p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        yl6.Q:Lgva;
        //     4: getfield        gva.F:Z
        //     7: istore          6
        //     9: aload_0        
        //    10: getfield        j0j.d:Ljava/lang/Object;
        //    13: astore          7
        //    15: aload           7
        //    17: dup            
        //    18: astore          11
        //    20: monitorenter   
        //    21: aload_0        
        //    22: getfield        j0j.w:Lapm;
        //    25: invokevirtual   apm.getValue:()Ljava/lang/Object;
        //    28: checkcast       Lg0j;
        //    31: astore          9
        //    33: getstatic       g0j.w:Lg0j;
        //    36: astore          8
        //    38: aload           9
        //    40: aload           8
        //    42: invokevirtual   java/lang/Enum.compareTo:(Ljava/lang/Enum;)I
        //    45: istore          4
        //    47: iconst_1       
        //    48: istore_3       
        //    49: iload           4
        //    51: ifle            78
        //    54: aload_0        
        //    55: invokevirtual   j0j.H:()Ljava/util/List;
        //    58: aload_1        
        //    59: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //    64: istore          5
        //    66: iconst_1       
        //    67: iload           5
        //    69: ixor           
        //    70: istore_3       
        //    71: goto            78
        //    74: astore_1       
        //    75: goto            361
        //    78: aload           11
        //    80: monitorexit    
        //    81: new             Lp8a;
        //    84: astore          9
        //    86: aload           9
        //    88: aload_1        
        //    89: bipush          29
        //    91: invokespecial   p8a.<init>:(Ljava/lang/Object;B)V
        //    94: new             Ltt8;
        //    97: astore          10
        //    99: aload           10
        //   101: aload_1        
        //   102: aconst_null    
        //   103: bipush          24
        //   105: invokespecial   tt8.<init>:(Ljava/lang/Object;Ljava/lang/Object;B)V
        //   108: invokestatic    g8m.h:()Lr7m;
        //   111: astore          7
        //   113: aload           7
        //   115: instanceof      Lzmf;
        //   118: ifeq            131
        //   121: aload           7
        //   123: checkcast       Lzmf;
        //   126: astore          7
        //   128: goto            134
        //   131: aconst_null    
        //   132: astore          7
        //   134: aload           7
        //   136: ifnull          322
        //   139: aload           7
        //   141: aload           9
        //   143: aload           10
        //   145: invokevirtual   zmf.C:(Llta;Llta;)Lzmf;
        //   148: astore          7
        //   150: aload           7
        //   152: ifnull          322
        //   155: aload           7
        //   157: invokevirtual   r7m.j:()Lr7m;
        //   160: astore          9
        //   162: aload_1        
        //   163: aload_2        
        //   164: invokevirtual   yl6.n:(Lzta;)V
        //   167: aload           9
        //   169: invokestatic    r7m.q:(Lr7m;)V
        //   172: aload           7
        //   174: invokestatic    j0j.z:(Lzmf;)V
        //   177: aload_0        
        //   178: getfield        j0j.d:Ljava/lang/Object;
        //   181: astore_2       
        //   182: aload_2        
        //   183: dup            
        //   184: astore          12
        //   186: monitorenter   
        //   187: aload_0        
        //   188: getfield        j0j.w:Lapm;
        //   191: invokevirtual   apm.getValue:()Ljava/lang/Object;
        //   194: checkcast       Lg0j;
        //   197: aload           8
        //   199: invokevirtual   java/lang/Enum.compareTo:(Ljava/lang/Enum;)I
        //   202: ifle            239
        //   205: aload_0        
        //   206: invokevirtual   j0j.H:()Ljava/util/List;
        //   209: aload_1        
        //   210: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   215: ifne            239
        //   218: aload_0        
        //   219: getfield        j0j.g:Ljava/util/ArrayList;
        //   222: aload_1        
        //   223: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   226: pop            
        //   227: aload_0        
        //   228: aconst_null    
        //   229: putfield        j0j.h:Ljava/util/List;
        //   232: goto            239
        //   235: astore_1       
        //   236: goto            294
        //   239: aload           12
        //   241: monitorexit    
        //   242: iload           6
        //   244: ifne            253
        //   247: invokestatic    g8m.h:()Lr7m;
        //   250: invokevirtual   r7m.m:()V
        //   253: aload_0        
        //   254: aload_1        
        //   255: invokevirtual   j0j.J:(Lyl6;)V
        //   258: aload_1        
        //   259: invokevirtual   yl6.h:()V
        //   262: aload_1        
        //   263: invokevirtual   yl6.j:()V
        //   266: iload           6
        //   268: ifne            277
        //   271: invokestatic    g8m.h:()Lr7m;
        //   274: invokevirtual   r7m.m:()V
        //   277: return         
        //   278: astore_1       
        //   279: aload_0        
        //   280: aload_1        
        //   281: aconst_null    
        //   282: invokevirtual   j0j.N:(Ljava/lang/Throwable;Lyl6;)V
        //   285: return         
        //   286: astore_2       
        //   287: aload_0        
        //   288: aload_2        
        //   289: aload_1        
        //   290: invokevirtual   j0j.N:(Ljava/lang/Throwable;Lyl6;)V
        //   293: return         
        //   294: aload           12
        //   296: monitorexit    
        //   297: aload_1        
        //   298: athrow         
        //   299: astore_2       
        //   300: goto            335
        //   303: astore_2       
        //   304: goto            315
        //   307: astore_2       
        //   308: aload           9
        //   310: invokestatic    r7m.q:(Lr7m;)V
        //   313: aload_2        
        //   314: athrow         
        //   315: aload           7
        //   317: invokestatic    j0j.z:(Lzmf;)V
        //   320: aload_2        
        //   321: athrow         
        //   322: new             Ljava/lang/IllegalStateException;
        //   325: astore_2       
        //   326: aload_2        
        //   327: ldc_w           "Cannot create a mutable snapshot of an read-only snapshot"
        //   330: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   333: aload_2        
        //   334: athrow         
        //   335: iload_3        
        //   336: ifeq            354
        //   339: aload_0        
        //   340: getfield        j0j.d:Ljava/lang/Object;
        //   343: astore          7
        //   345: aload           7
        //   347: dup            
        //   348: astore          11
        //   350: monitorenter   
        //   351: aload           11
        //   353: monitorexit    
        //   354: aload_0        
        //   355: aload_2        
        //   356: aload_1        
        //   357: invokevirtual   j0j.N:(Ljava/lang/Throwable;Lyl6;)V
        //   360: return         
        //   361: aload           11
        //   363: monitorexit    
        //   364: aload_1        
        //   365: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  21     47     74     78     Any
        //  54     66     74     78     Any
        //  81     128    299    361    Any
        //  139    150    299    361    Any
        //  155    162    303    307    Any
        //  162    167    307    315    Any
        //  167    172    303    307    Any
        //  172    177    299    361    Any
        //  187    232    235    239    Any
        //  253    258    286    294    Any
        //  258    266    278    286    Any
        //  308    315    303    307    Any
        //  315    322    299    361    Any
        //  322    335    299    361    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 187 out of bounds for length 187
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //     at java.util.Objects.checkIndex(Objects.java:371)
        //     at java.util.ArrayList.get(ArrayList.java:435)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2125)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1100)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        //     at java.lang.Thread.run(Thread.java:1572)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public final umf b(final yl6 p0, final vwl p1, final zta p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        j0j.x:Ltze;
        //     4: astore          4
        //     6: aload_1        
        //     7: getfield        yl6.K:Lvwl;
        //    10: astore          5
        //    12: aload_1        
        //    13: aload_2        
        //    14: putfield        yl6.K:Lvwl;
        //    17: aload_0        
        //    18: aload_1        
        //    19: aload_3        
        //    20: invokevirtual   j0j.a:(Lyl6;Lzta;)V
        //    23: aload           4
        //    25: invokevirtual   tze.get:()Ljava/lang/Object;
        //    28: checkcast       Lumf;
        //    31: astore_2       
        //    32: aload_2        
        //    33: ifnull          39
        //    36: goto            48
        //    39: getstatic       kak.a:Lumf;
        //    42: astore_2       
        //    43: aload_2        
        //    44: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    47: pop            
        //    48: aload_1        
        //    49: aload           5
        //    51: putfield        yl6.K:Lvwl;
        //    54: aload           4
        //    56: aconst_null    
        //    57: invokevirtual   tze.l:(Ljava/lang/Object;)V
        //    60: aload_2        
        //    61: areturn        
        //    62: astore_1       
        //    63: goto            75
        //    66: astore_2       
        //    67: aload_1        
        //    68: aload           5
        //    70: putfield        yl6.K:Lvwl;
        //    73: aload_2        
        //    74: athrow         
        //    75: aload           4
        //    77: aconst_null    
        //    78: invokevirtual   tze.l:(Ljava/lang/Object;)V
        //    81: aload_1        
        //    82: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  6      17     62     66     Any
        //  17     32     66     75     Any
        //  39     48     66     75     Any
        //  48     54     62     66     Any
        //  67     75     62     66     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1100)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        //     at java.lang.Thread.run(Thread.java:1572)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public final void c(final iif iif) {
        final Object d;
        monitorenter(d = this.d);
        Label_0065: {
            try {
                gkf.a(this.m, iif.c(), iif);
                if (iif.e() != null) {
                    B(this, iif, iif);
                }
            }
            finally {
                break Label_0065;
            }
            final k13 c = this.C();
            monitorexit(d);
            if (c != null) {
                ((l13)c).resumeWith((Object)lqo.a);
            }
            return;
        }
        monitorexit(d);
    }
    
    @Override
    public final hc7 k() {
        return this.z;
    }
    
    @Override
    public final void m(final iif iif) {
        final Object d = this.d;
        synchronized (d) {
            this.l.add((Object)iif);
            final k13 c = this.C();
            monitorexit(d);
            if (c != null) {
                ((l13)c).resumeWith((Object)lqo.a);
            }
        }
    }
    
    @Override
    public final void n(final yl6 yl6) {
        final Object d;
        monitorenter(d = this.d);
        Label_0061: {
            final l13 l13;
            Label_0042: {
                try {
                    if (!this.j.i(yl6)) {
                        this.j.b(yl6);
                        this.C();
                        break Label_0042;
                    }
                }
                finally {
                    break Label_0061;
                }
                l13 = null;
            }
            monitorexit(d);
            if (l13 != null) {
                l13.resumeWith((Object)lqo.a);
            }
            return;
        }
        monitorexit(d);
    }
    
    @Override
    public final void o(final iif p0, final hif p1, final it0 p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        j0j.d:Ljava/lang/Object;
        //     4: astore          11
        //     6: aload           11
        //     8: dup            
        //     9: astore          14
        //    11: monitorenter   
        //    12: aload_0        
        //    13: getfield        j0j.o:Ltmf;
        //    16: aload_1        
        //    17: aload_2        
        //    18: invokevirtual   tmf.m:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    21: aload_0        
        //    22: getfield        j0j.p:Ltmf;
        //    25: aload_1        
        //    26: invokevirtual   tmf.g:(Ljava/lang/Object;)Ljava/lang/Object;
        //    29: astore          12
        //    31: aload           12
        //    33: ifnonnull       48
        //    36: getstatic       j4g.b:Lemf;
        //    39: astore_1       
        //    40: aload_1        
        //    41: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    44: pop            
        //    45: goto            84
        //    48: aload           12
        //    50: instanceof      Lemf;
        //    53: ifeq            65
        //    56: aload           12
        //    58: checkcast       Lemf;
        //    61: astore_1       
        //    62: goto            84
        //    65: getstatic       j4g.a:[Ljava/lang/Object;
        //    68: astore_1       
        //    69: new             Lemf;
        //    72: astore_1       
        //    73: aload_1        
        //    74: iconst_1       
        //    75: invokespecial   emf.<init>:(I)V
        //    78: aload_1        
        //    79: aload           12
        //    81: invokevirtual   emf.b:(Ljava/lang/Object;)V
        //    84: aload_1        
        //    85: invokevirtual   emf.j:()Z
        //    88: ifeq            280
        //    91: aload_2        
        //    92: invokevirtual   hif.a:()Lv5m;
        //    95: aload_3        
        //    96: aload_1        
        //    97: invokevirtual   v5m.f:(Lit0;Lemf;)Ltmf;
        //   100: astore_3       
        //   101: aload_3        
        //   102: getfield        tmf.b:[Ljava/lang/Object;
        //   105: astore_2       
        //   106: aload_3        
        //   107: getfield        tmf.c:[Ljava/lang/Object;
        //   110: astore_1       
        //   111: aload_3        
        //   112: getfield        tmf.a:[J
        //   115: astore          12
        //   117: aload           12
        //   119: arraylength    
        //   120: iconst_2       
        //   121: isub           
        //   122: istore          6
        //   124: iload           6
        //   126: iflt            280
        //   129: iconst_0       
        //   130: istore          4
        //   132: aload           12
        //   134: iload           4
        //   136: laload         
        //   137: lstore          9
        //   139: lload           9
        //   141: ldc2_w          -1
        //   144: lxor           
        //   145: bipush          7
        //   147: lshl           
        //   148: lload           9
        //   150: land           
        //   151: ldc2_w          -9187201950435737472
        //   154: land           
        //   155: ldc2_w          -9187201950435737472
        //   158: lcmp           
        //   159: ifeq            267
        //   162: bipush          8
        //   164: iload           4
        //   166: iload           6
        //   168: isub           
        //   169: iconst_m1      
        //   170: ixor           
        //   171: bipush          31
        //   173: iushr          
        //   174: isub           
        //   175: istore          7
        //   177: iconst_0       
        //   178: istore          5
        //   180: iload           5
        //   182: iload           7
        //   184: if_icmpge       260
        //   187: ldc2_w          255
        //   190: lload           9
        //   192: land           
        //   193: ldc2_w          128
        //   196: lcmp           
        //   197: ifge            247
        //   200: iload           4
        //   202: iconst_3       
        //   203: ishl           
        //   204: iload           5
        //   206: iadd           
        //   207: istore          8
        //   209: aload_2        
        //   210: iload           8
        //   212: aaload         
        //   213: astore          13
        //   215: aload_1        
        //   216: iload           8
        //   218: aaload         
        //   219: checkcast       Lhif;
        //   222: astore_3       
        //   223: aload           13
        //   225: checkcast       Liif;
        //   228: astore          13
        //   230: aload_0        
        //   231: getfield        j0j.o:Ltmf;
        //   234: aload           13
        //   236: aload_3        
        //   237: invokevirtual   tmf.m:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   240: goto            247
        //   243: astore_1       
        //   244: goto            284
        //   247: lload           9
        //   249: bipush          8
        //   251: lshr           
        //   252: lstore          9
        //   254: iinc            5, 1
        //   257: goto            180
        //   260: iload           7
        //   262: bipush          8
        //   264: if_icmpne       280
        //   267: iload           4
        //   269: iload           6
        //   271: if_icmpeq       280
        //   274: iinc            4, 1
        //   277: goto            132
        //   280: aload           14
        //   282: monitorexit    
        //   283: return         
        //   284: aload           14
        //   286: monitorexit    
        //   287: aload_1        
        //   288: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  12     31     243    247    Any
        //  36     45     243    247    Any
        //  48     62     243    247    Any
        //  65     84     243    247    Any
        //  84     124    243    247    Any
        //  215    240    243    247    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Attempt to invoke virtual method 'g5.m0 g5.d2.L()' on a null object reference
        //     at e5.d0.e(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:26)
        //     at e5.c0.s(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:1643)
        //     at q5.g.o(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2651)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2099)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1100)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        //     at java.lang.Thread.run(Thread.java:1572)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public final hif p(final iif iif) {
        final Object d = this.d;
        synchronized (d) {
            return (hif)this.o.k((Object)iif);
        }
    }
    
    @Override
    public final umf q(final yl6 yl6, vwl a, umf k) {
        final tze x = this.x;
        Label_0118: {
            Label_0111: {
                try {
                    this.O();
                    yl6.z(new lak(k));
                    k = (umf)yl6.K;
                    yl6.K = a;
                    try {
                        final yl6 m = this.M(yl6, null);
                        if (m != null) {
                            this.J(yl6);
                            m.h();
                            m.j();
                        }
                    }
                    finally {
                        break Label_0111;
                    }
                    a = (vwl)x.get();
                    if (a == null) {
                        a = (vwl)kak.a;
                        a.getClass();
                    }
                    yl6.K = (vwl)k;
                    x.l((Object)null);
                    return (umf)a;
                }
                finally {
                    break Label_0118;
                }
            }
            final yl6 yl7;
            yl7.K = (vwl)k;
            throw a;
        }
        x.l((Object)null);
    }
    
    @Override
    public final void t(final b0j b0j) {
        final tze x = this.x;
        umf umf;
        if ((umf = (umf)x.get()) == null) {
            final umf a = kak.a;
            umf = new umf();
            x.l((Object)umf);
        }
        umf.a((Object)b0j);
    }
    
    @Override
    public final void u(final yl6 yl6) {
        final Object d;
        monitorenter(d = this.d);
        Label_0057: {
            umf r;
            try {
                if ((r = this.r) == null) {
                    r = kak.a;
                    r = new umf();
                    this.r = r;
                }
            }
            finally {
                break Label_0057;
            }
            final Throwable t;
            r.a((Object)t);
            monitorexit(d);
            return;
        }
        monitorexit(d);
    }
    
    @Override
    public final q13 v(final h87 h87) {
        final tze c = this.c;
        return ((uy7)c.x).B((rn1)new bwf(h87), (jta)c.y);
    }
    
    @Override
    public final void y(final yl6 yl6) {
        final Object d = this.d;
        synchronized (d) {
            if (this.g.remove((Object)yl6)) {
                this.h = null;
            }
            this.j.k(yl6);
            this.k.remove((Object)yl6);
        }
    }
}
