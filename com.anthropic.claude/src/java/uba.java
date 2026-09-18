import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import java.util.Iterator;
import android.os.Trace;
import java.util.Map;
import java.util.List;
import kotlin.NotImplementedError;
import java.util.Collection;
import androidx.compose.ui.node.LayoutNode;

public final class uba
{
    public final byte a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    
    public uba(final LayoutNode d) {
        this.a = 1;
        this.d = d;
        this.e = new zn0((byte)21);
        this.f = new e3a((byte)17);
        this.g = new inf(0, (Object[])new LayoutNode[16]);
        this.h = new inf(0, (Object[])new hoe[16]);
    }
    
    public uba(final aw7 d, final drj drj, final rr rr) {
        this.a = 2;
        this.d = d;
        this.e = new juj();
        final List e = d.e;
        final r89 v = r89.v;
        Object f;
        if (e == null) {
            f = v;
        }
        else {
            f = e;
        }
        this.f = f;
        final trf trf = new trf((Object)this, (byte)29);
        Object o = e;
        if (e == null) {
            o = v;
        }
        c86.a1((Collection)o, (Object)new kuj(trf));
        throw new NotImplementedError();
    }
    
    public uba(final aw7 d, final xuj e, final gw4 gw4) {
        this.a = 2;
        final int g = d.g;
        final h5n c = d.c;
        final String b = d.b;
        final v2k p3 = d.p;
        this.d = d;
        this.e = e;
        Object f;
        if ((f = d.e) == null) {
            f = r89.v;
        }
        this.f = f;
        final i5n i5n = null;
        boolean writeAheadLoggingEnabled = false;
        i5n i5n2;
        if (p3 == null) {
            if (c == null) {
                en9.s("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            final i5n c2 = c.C(new xs9(d.a, b, new qd6(this, e.a), false, false));
            this.h = c2;
            final xzj xzj = new xzj((Object)c2);
            String s;
            if ((s = b) == null) {
                s = ":memory:";
            }
            this.g = new dvg((v2k)xzj, s, (zta)gw4);
            i5n2 = c2;
        }
        else {
            this.h = null;
            Object g2;
            if (p3.n()) {
                final vcc vcc = new vcc((Object)this, (Object)p3, false, (byte)10);
                String s2;
                if ((s2 = b) == null) {
                    s2 = ":memory:";
                }
                g2 = new dvg((v2k)vcc, s2, (zta)gw4);
            }
            else if (b == null) {
                g2 = alq.k(new vcc((Object)this, (Object)p3, false, (byte)10));
            }
            else {
                final vcc vcc2 = new vcc((Object)this, (Object)p3, false, (byte)10);
                final int d2 = ge9.D(g);
                int n;
                if (d2 != 1) {
                    if (d2 != 2) {
                        final String b2 = lmf.B(g);
                        final StringBuilder sb = new StringBuilder("Can't get max number of reader for journal mode '");
                        sb.append(b2);
                        sb.append('\'');
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    n = 4;
                }
                else {
                    n = 1;
                }
                final int d3 = ge9.D(g);
                if (d3 != 1 && d3 != 2) {
                    final String b3 = lmf.B(g);
                    final StringBuilder sb2 = new StringBuilder("Can't get max number of writers for journal mode '");
                    sb2.append(b3);
                    sb2.append('\'');
                    throw new IllegalStateException(sb2.toString().toString());
                }
                g2 = alq.j(vcc2, b, n);
            }
            this.g = g2;
            i5n2 = i5n;
        }
        if (g == 3) {
            writeAheadLoggingEnabled = true;
        }
        if (i5n2 != null) {
            i5n2.setWriteAheadLoggingEnabled(writeAheadLoggingEnabled);
        }
    }
    
    public uba(final boolean b, final boolean c, final fvg d, final Long e, final Long f, final Long g, final Long h, final Map map) {
        this.a = 0;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = y5e.l0(map);
    }
    
    public static void b(final t2k t2k) {
        final b3k d1 = t2k.d1("PRAGMA busy_timeout");
        try {
            d1.Z0();
            final long long1 = d1.getLong(0);
            r9n.m((AutoCloseable)d1, (Throwable)null);
            if (long1 < 3000L) {
                yi2.t(t2k, "PRAGMA busy_timeout = 3000");
            }
        }
        finally {
            try {}
            finally {
                r9n.m((AutoCloseable)d1, (Throwable)t2k);
            }
        }
    }
    
    public static boolean e(final LayoutNode layoutNode, final gv6 gv6) {
        if (layoutNode.D == null) {
            return false;
        }
        boolean b;
        if (gv6 != null) {
            b = layoutNode.Z(gv6);
        }
        else {
            b = LayoutNode.a0(layoutNode);
        }
        final LayoutNode g = layoutNode.G();
        if (b && g != null) {
            if (g.D == null) {
                LayoutNode.t0(g, false, 3);
                return b;
            }
            if (layoutNode.D() == 1) {
                LayoutNode.r0(g, false, 3);
                return b;
            }
            if (layoutNode.D() == 2) {
                g.q0(false);
            }
        }
        return b;
    }
    
    public static boolean f(final LayoutNode layoutNode, final gv6 gv6) {
        boolean b;
        if (gv6 != null) {
            b = layoutNode.l0(gv6);
        }
        else {
            b = LayoutNode.m0(layoutNode);
        }
        final LayoutNode g = layoutNode.G();
        if (b && g != null) {
            if (layoutNode.C() == 1) {
                LayoutNode.t0(g, false, 3);
                return b;
            }
            if (layoutNode.C() == 2) {
                g.s0(false);
            }
        }
        return b;
    }
    
    public static boolean k(final LayoutNode layoutNode) {
        if (layoutNode.x()) {
            if (layoutNode.D() == 3) {
                final byd q = layoutNode.t().q;
                if (q == null) {
                    return false;
                }
                final j0d n = q.N;
                if (n == null || !n.e()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean l(LayoutNode layoutNode) {
        if (layoutNode.B()) {
            LayoutNode g;
            do {
                if (layoutNode.C() == 3 && !layoutNode.t().p.S.e()) {
                    final LayoutNode g2 = layoutNode.G();
                    int v;
                    if (g2 != null) {
                        v = g2.v();
                    }
                    else {
                        v = 0;
                    }
                    if (v != 1) {
                        return false;
                    }
                }
                g = layoutNode.G();
                if (g == null) {
                    return false;
                }
                layoutNode = g;
            } while (!g.W());
            return true;
        }
        return false;
    }
    
    public static boolean m(final LayoutNode layoutNode) {
        return layoutNode.W() || layoutNode.X() || l(layoutNode) || mlc.q((Object)layoutNode.Y(), (Object)Boolean.TRUE) || k(layoutNode) || layoutNode.o();
    }
    
    public void a() {
        final inf inf = (inf)this.g;
        final Object[] v = inf.v;
        for (int x = inf.x, i = 0; i < x; ++i) {
            final rxf z = ((LayoutNode)v[i]).Z;
            final lcc lcc = (lcc)z.y;
            final boolean g = zxf.g(4194304);
            hgf hgf = lcc.z0;
            if (!g) {
                if ((hgf = hgf.z) == null) {
                    continue;
                }
            }
            final xtf s0 = yxf.s0;
            for (hgf hgf2 = ((yxf)lcc).k1(g); hgf2 != null && (hgf2.y & 0x400000) != 0x0; hgf2 = hgf2.A) {
                if ((hgf2.x & 0x400000) != 0x0) {
                    Object g2 = hgf2;
                    inf inf2 = null;
                    while (g2 != null) {
                        inf inf3;
                        if (g2 instanceof jzc) {
                            ((jzc)g2).t((nzc)z.y);
                            inf3 = inf2;
                        }
                        else {
                            inf3 = inf2;
                            if ((((hgf)g2).x & 0x400000) != 0x0) {
                                inf3 = inf2;
                                if (g2 instanceof v98) {
                                    hgf hgf3 = ((v98)g2).K;
                                    int n = 0;
                                    while (hgf3 != null) {
                                        Object o = g2;
                                        inf inf4 = inf2;
                                        int n2 = n;
                                        if ((hgf3.x & 0x400000) != 0x0) {
                                            n2 = n + 1;
                                            if (n2 == 1) {
                                                o = hgf3;
                                                inf4 = inf2;
                                            }
                                            else {
                                                inf inf5;
                                                if ((inf5 = inf2) == null) {
                                                    inf5 = new inf(0, (Object[])new hgf[16]);
                                                }
                                                v98 v2;
                                                if ((v2 = (v98)g2) != null) {
                                                    inf5.b(g2);
                                                    v2 = null;
                                                }
                                                inf5.b((Object)hgf3);
                                                inf4 = inf5;
                                                o = v2;
                                            }
                                        }
                                        hgf3 = hgf3.A;
                                        g2 = o;
                                        inf2 = inf4;
                                        n = n2;
                                    }
                                    inf3 = inf2;
                                    if (n == 1) {
                                        continue;
                                    }
                                }
                            }
                        }
                        g2 = soh.G(inf3);
                        inf2 = inf3;
                    }
                }
                if (hgf2 == hgf) {
                    break;
                }
            }
        }
        inf.h();
    }
    
    public void c(final t2k t2k) {
        final int a = ((xuj)this.e).a;
        b(t2k);
        final aw7 aw7 = (aw7)this.d;
        if (aw7.g == 3) {
            yi2.t(t2k, "PRAGMA journal_mode = WAL");
        }
        else {
            yi2.t(t2k, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aw7.g == 3) {
            yi2.t(t2k, "PRAGMA synchronous = NORMAL");
        }
        else {
            yi2.t(t2k, "PRAGMA synchronous = FULL");
        }
        Object o = t2k.d1("PRAGMA user_version");
        try {
            ((b3k)o).Z0();
            final int n = (int)((b3k)o).getLong(0);
            r9n.m((AutoCloseable)o, (Throwable)null);
            if (n != a) {
                yi2.t(t2k, "BEGIN EXCLUSIVE TRANSACTION");
                Label_0199: {
                    Label_0151: {
                        Label_0144: {
                            if (n == 0) {
                                Label_0188: {
                                    try {
                                        this.q(t2k);
                                        break Label_0151;
                                    }
                                    finally {
                                        break Label_0188;
                                    }
                                    break Label_0144;
                                }
                                o = new jpj((Throwable)o);
                                break Label_0199;
                            }
                        }
                        this.r(t2k, n, a);
                    }
                    o = new StringBuilder("PRAGMA user_version = ");
                    ((StringBuilder)o).append(a);
                    yi2.t(t2k, ((StringBuilder)o).toString());
                    o = lqo.a;
                }
                if (!(o instanceof jpj)) {
                    final lqo lqo = (lqo)o;
                    yi2.t(t2k, "END TRANSACTION");
                }
                o = kpj.a(o);
                if (o != null) {
                    yi2.t(t2k, "ROLLBACK TRANSACTION");
                    throw o;
                }
            }
            this.s(t2k);
        }
        finally {
            try {}
            finally {
                r9n.m((AutoCloseable)o, (Throwable)t2k);
            }
        }
    }
    
    public void d(final boolean b) {
        final e3a e3a = (e3a)this.f;
        final inf inf = (inf)e3a.w;
        if (b) {
            final LayoutNode layoutNode = (LayoutNode)this.d;
            if (layoutNode.i0 > 0) {
                inf.h();
                inf.b((Object)layoutNode);
                layoutNode.h0 = true;
            }
        }
        if (inf.x != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                e3a.g();
            }
            finally {
                Trace.endSection();
            }
        }
    }
    
    public void g() {
        final inf inf = (inf)this.h;
        final int x = inf.x;
        if (x != 0) {
            final Object[] v = inf.v;
            for (int i = 0; i < x; ++i) {
                final hoe hoe = (hoe)v[i];
                if (hoe.a.V()) {
                    final boolean b = hoe.b;
                    final LayoutNode a = hoe.a;
                    final boolean c = hoe.c;
                    if (!b) {
                        LayoutNode.t0(a, c, 2);
                    }
                    else {
                        LayoutNode.r0(a, c, 2);
                    }
                }
            }
            inf.h();
        }
    }
    
    public void h(final LayoutNode layoutNode) {
        final inf m = layoutNode.M();
        final Object[] v = m.v;
        for (int x = m.x, i = 0; i < x; ++i) {
            final LayoutNode layoutNode2 = (LayoutNode)v[i];
            if (mlc.q((Object)layoutNode2.Y(), (Object)Boolean.TRUE) && !layoutNode2.j0) {
                if (((zn0)this.e).o(layoutNode2)) {
                    layoutNode2.b0();
                }
                this.h(layoutNode2);
            }
        }
    }
    
    public void i(final LayoutNode layoutNode, final boolean b) {
        if (!this.b) {
            gac.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        boolean b2;
        if (b) {
            b2 = layoutNode.x();
        }
        else {
            b2 = layoutNode.B();
        }
        if (b2) {
            gac.a("node not yet measured");
        }
        this.j(layoutNode, b);
    }
    
    public void j(final LayoutNode layoutNode, final boolean b) {
        final inf m = layoutNode.M();
        final Object[] v = m.v;
        for (int x = m.x, i = 0; i < x; ++i) {
            final LayoutNode layoutNode2 = (LayoutNode)v[i];
            Label_0119: {
                if (!b) {
                    if (layoutNode2.C() == 1) {
                        break Label_0119;
                    }
                    if (layoutNode2.t().p.S.e()) {
                        break Label_0119;
                    }
                }
                if (!b) {
                    continue;
                }
                if (layoutNode2.D() != 1) {
                    final byd q = layoutNode2.t().q;
                    if (q == null) {
                        continue;
                    }
                    final j0d n = q.N;
                    if (n == null || !n.e()) {
                        continue;
                    }
                }
            }
            if (omo.R(layoutNode2) && !b) {
                if (layoutNode2.x() && ((zn0)this.e).o(layoutNode2)) {
                    this.u(layoutNode2, true);
                }
                else {
                    this.i(layoutNode2, true);
                }
            }
            boolean b2;
            if (b) {
                b2 = layoutNode2.x();
            }
            else {
                b2 = layoutNode2.B();
            }
            if (b2) {
                this.u(layoutNode2, b);
            }
            boolean b3;
            if (b) {
                b3 = layoutNode2.x();
            }
            else {
                b3 = layoutNode2.B();
            }
            if (!b3) {
                this.j(layoutNode2, b);
            }
        }
        boolean b4;
        if (b) {
            b4 = layoutNode.x();
        }
        else {
            b4 = layoutNode.B();
        }
        if (b4) {
            this.u(layoutNode, b);
        }
    }
    
    public boolean n(final jta jta) {
        final zn0 zn0 = (zn0)this.e;
        final j9j j9j = (j9j)zn0.v;
        final LayoutNode layoutNode = (LayoutNode)this.d;
        if (!layoutNode.V()) {
            gac.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode.W()) {
            gac.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            gac.a("performMeasureAndLayout called during measure layout");
        }
        final gv6 gv6 = (gv6)this.i;
        boolean b = false;
        Label_0426: {
            if (gv6 != null) {
                this.b = true;
                this.c = true;
                boolean b2 = false;
                j9j j9j2;
                iam iam;
                j9j j9j3;
                iam iam2;
                LayoutNode layoutNode2;
                boolean b3;
                boolean b4;
                boolean b5 = false;
                boolean t;
                boolean u;
                Label_0355_Outer:Block_16_Outer:Label_0331_Outer:Block_15_Outer:
                while (true) {
                    Label_0209: {
                        try {
                            if (!zn0.B()) {
                                break Label_0355_Outer;
                            }
                            b2 = false;
                            j9j2 = (j9j)zn0.x;
                            iam = (iam)j9j2.w;
                            j9j3 = (j9j)zn0.w;
                            iam2 = (iam)j9j3.w;
                            if (!((AbstractCollection)j9j.w).isEmpty()) {
                                layoutNode2 = (LayoutNode)((iam)j9j.w).first();
                                j9j.A(layoutNode2);
                                b3 = (layoutNode2.D != null);
                                b4 = false;
                                break Label_0209;
                            }
                            break Label_0209;
                        }
                        finally {
                            try {}
                            finally {
                                this.b = false;
                                this.c = false;
                            }
                            Label_0372: {
                                b5 = b2;
                            }
                            iftrue(Label_0395:)(jta == null);
                            while (true) {
                                while (true) {
                                    while (true) {
                                        Label_0395: {
                                            Block_19: {
                                                break Block_19;
                                                Label_0257:
                                                iftrue(Label_0372:)(((AbstractCollection)iam).isEmpty());
                                            Block_14_Outer:
                                                while (true) {
                                                    Block_18: {
                                                        Block_13: {
                                                            break Block_13;
                                                            iftrue(Label_0105:)(layoutNode2 != layoutNode || !t);
                                                            break Block_18;
                                                        }
                                                        layoutNode2 = (LayoutNode)iam.first();
                                                        j9j2.A(layoutNode2);
                                                        b4 = true;
                                                        b3 = false;
                                                        break Label_0209;
                                                    Block_11_Outer:
                                                        while (true) {
                                                            t = this.t(layoutNode2, b3);
                                                            continue Block_14_Outer;
                                                            while (true) {
                                                                layoutNode2 = (LayoutNode)iam2.first();
                                                                j9j3.A(layoutNode2);
                                                                b3 = (layoutNode2.D != null);
                                                                b4 = true;
                                                                break Label_0209;
                                                                iftrue(Label_0257:)(((AbstractCollection)iam2).isEmpty());
                                                                continue Block_16_Outer;
                                                            }
                                                            iftrue(Label_0305:)(!b4);
                                                            continue Block_11_Outer;
                                                        }
                                                    }
                                                    b2 = true;
                                                    continue Label_0355_Outer;
                                                    b5 = false;
                                                    break Label_0395;
                                                    zn0.g(4, layoutNode2);
                                                    t = u;
                                                    continue Block_16_Outer;
                                                }
                                            }
                                            jta.a();
                                            b5 = b2;
                                        }
                                        this.b = false;
                                        this.c = false;
                                        b = b5;
                                        break Label_0426;
                                        t = u;
                                        iftrue(Label_0355:)(!layoutNode2.u());
                                        continue Label_0331_Outer;
                                    }
                                    zn0.g(2, layoutNode2);
                                    continue Block_15_Outer;
                                }
                                Label_0305:
                                u = this.u(layoutNode2, b3);
                                iftrue(Label_0331:)(!layoutNode2.w());
                                continue;
                            }
                        }
                    }
                    break;
                }
            }
        }
        this.a();
        return b;
    }
    
    public void o(final LayoutNode p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        uba.d:Ljava/lang/Object;
        //     4: checkcast       Landroidx/compose/ui/node/LayoutNode;
        //     7: astore          4
        //     9: aload_1        
        //    10: getfield        androidx/compose/ui/node/LayoutNode.j0:Z
        //    13: ifeq            17
        //    16: return         
        //    17: aload_1        
        //    18: aload           4
        //    20: if_acmpeq       26
        //    23: goto            32
        //    26: ldc_w           "measureAndLayout called on root"
        //    29: invokestatic    gac.a:(Ljava/lang/String;)V
        //    32: aload           4
        //    34: invokevirtual   androidx/compose/ui/node/LayoutNode.V:()Z
        //    37: ifne            46
        //    40: ldc_w           "performMeasureAndLayout called with unattached root"
        //    43: invokestatic    gac.a:(Ljava/lang/String;)V
        //    46: aload           4
        //    48: invokevirtual   androidx/compose/ui/node/LayoutNode.W:()Z
        //    51: ifne            60
        //    54: ldc_w           "performMeasureAndLayout called with unplaced root"
        //    57: invokestatic    gac.a:(Ljava/lang/String;)V
        //    60: aload_0        
        //    61: getfield        uba.b:Z
        //    64: ifeq            73
        //    67: ldc_w           "performMeasureAndLayout called during measure layout"
        //    70: invokestatic    gac.a:(Ljava/lang/String;)V
        //    73: aload_0        
        //    74: getfield        uba.i:Ljava/lang/Object;
        //    77: checkcast       Lgv6;
        //    80: ifnull          298
        //    83: aload_0        
        //    84: iconst_1       
        //    85: putfield        uba.b:Z
        //    88: aload_0        
        //    89: iconst_0       
        //    90: putfield        uba.c:Z
        //    93: aload_0        
        //    94: getfield        uba.e:Ljava/lang/Object;
        //    97: checkcast       Lzn0;
        //   100: astore          4
        //   102: aload           4
        //   104: getfield        zn0.v:Ljava/lang/Object;
        //   107: checkcast       Lj9j;
        //   110: aload_1        
        //   111: invokevirtual   j9j.A:(Landroidx/compose/ui/node/LayoutNode;)Z
        //   114: pop            
        //   115: aload           4
        //   117: getfield        zn0.w:Ljava/lang/Object;
        //   120: checkcast       Lj9j;
        //   123: aload_1        
        //   124: invokevirtual   j9j.A:(Landroidx/compose/ui/node/LayoutNode;)Z
        //   127: pop            
        //   128: aload           4
        //   130: getfield        zn0.x:Ljava/lang/Object;
        //   133: checkcast       Lj9j;
        //   136: aload_1        
        //   137: invokevirtual   j9j.A:(Landroidx/compose/ui/node/LayoutNode;)Z
        //   140: pop            
        //   141: new             Lgv6;
        //   144: astore          4
        //   146: aload           4
        //   148: lload_2        
        //   149: invokespecial   gv6.<init>:(J)V
        //   152: aload_1        
        //   153: aload           4
        //   155: invokestatic    uba.e:(Landroidx/compose/ui/node/LayoutNode;Lgv6;)Z
        //   158: ifne            175
        //   161: aload_1        
        //   162: invokevirtual   androidx/compose/ui/node/LayoutNode.w:()Z
        //   165: ifeq            192
        //   168: goto            175
        //   171: astore_1       
        //   172: goto            283
        //   175: aload_1        
        //   176: invokevirtual   androidx/compose/ui/node/LayoutNode.Y:()Ljava/lang/Boolean;
        //   179: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   182: invokestatic    mlc.q:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   185: ifeq            192
        //   188: aload_1        
        //   189: invokevirtual   androidx/compose/ui/node/LayoutNode.b0:()V
        //   192: aload_0        
        //   193: aload_1        
        //   194: invokevirtual   uba.h:(Landroidx/compose/ui/node/LayoutNode;)V
        //   197: new             Lgv6;
        //   200: astore          4
        //   202: aload           4
        //   204: lload_2        
        //   205: invokespecial   gv6.<init>:(J)V
        //   208: aload_1        
        //   209: aload           4
        //   211: invokestatic    uba.f:(Landroidx/compose/ui/node/LayoutNode;Lgv6;)Z
        //   214: pop            
        //   215: aload_1        
        //   216: invokevirtual   androidx/compose/ui/node/LayoutNode.u:()Z
        //   219: ifeq            266
        //   222: aload_1        
        //   223: invokevirtual   androidx/compose/ui/node/LayoutNode.W:()Z
        //   226: ifeq            266
        //   229: aload_1        
        //   230: invokevirtual   androidx/compose/ui/node/LayoutNode.p0:()V
        //   233: aload_0        
        //   234: getfield        uba.f:Ljava/lang/Object;
        //   237: checkcast       Le3a;
        //   240: astore          4
        //   242: aload_1        
        //   243: getfield        androidx/compose/ui/node/LayoutNode.i0:I
        //   246: ifle            266
        //   249: aload           4
        //   251: getfield        e3a.w:Ljava/lang/Object;
        //   254: checkcast       Linf;
        //   257: aload_1        
        //   258: invokevirtual   inf.b:(Ljava/lang/Object;)V
        //   261: aload_1        
        //   262: iconst_1       
        //   263: putfield        androidx/compose/ui/node/LayoutNode.h0:Z
        //   266: aload_0        
        //   267: invokevirtual   uba.g:()V
        //   270: aload_0        
        //   271: iconst_0       
        //   272: putfield        uba.b:Z
        //   275: aload_0        
        //   276: iconst_0       
        //   277: putfield        uba.c:Z
        //   280: goto            298
        //   283: aload_1        
        //   284: athrow         
        //   285: astore_1       
        //   286: aload_0        
        //   287: iconst_0       
        //   288: putfield        uba.b:Z
        //   291: aload_0        
        //   292: iconst_0       
        //   293: putfield        uba.c:Z
        //   296: aload_1        
        //   297: athrow         
        //   298: aload_0        
        //   299: invokevirtual   uba.a:()V
        //   302: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  93     168    171    298    Any
        //  175    192    171    298    Any
        //  192    266    171    298    Any
        //  266    270    171    298    Any
        //  283    285    285    298    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: invokestatic:boolean(mlc::q, invokevirtual:Boolean[expected:Object](LayoutNode::Y, p0:LayoutNode), getstatic:Boolean[expected:Object](Boolean::TRUE))
        //     at q5.z.n(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:121)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:521)
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
    
    public void p() {
        final LayoutNode layoutNode = (LayoutNode)this.d;
        final zn0 zn0 = (zn0)this.e;
        if (zn0.B()) {
            if (!layoutNode.V()) {
                gac.a("performMeasureAndLayout called with unattached root");
            }
            if (!layoutNode.W()) {
                gac.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.b) {
                gac.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.b = true;
                this.c = false;
                Label_0151: {
                    try {
                        if (((AbstractCollection)((j9j)zn0.x).w).isEmpty() || ((AbstractCollection)((j9j)zn0.v).w).isEmpty()) {
                            break Label_0151;
                        }
                        if (layoutNode.D != null) {
                            this.w(layoutNode, true);
                            break Label_0151;
                        }
                        break Label_0151;
                    }
                    finally {
                        try {}
                        finally {
                            this.b = false;
                            this.c = false;
                        }
                        this.v(layoutNode);
                        this.w(layoutNode, false);
                        this.b = false;
                        this.c = false;
                    }
                }
            }
        }
    }
    
    public void q(final t2k t2k) {
        final xuj xuj = (xuj)this.e;
        final b3k d1 = t2k.d1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        Label_0067: {
            try {
                final boolean z0 = d1.Z0();
                int n = 0;
                if (!z0) {
                    break Label_0067;
                }
                final long long1 = d1.getLong(0);
                n = n;
                if (long1 == 0L) {
                    n = 1;
                }
                break Label_0067;
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    r9n.m((AutoCloseable)d1, t);
                }
            Label_0114_Outer:
                while (true) {
                    Iterator iterator = null;
                    iftrue(Label_0176:)(!iterator.hasNext());
                    Block_8: {
                        break Block_8;
                        Label_0176: {
                            return;
                        }
                    Block_6_Outer:
                        while (true) {
                            yi2.t(t2k, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                            yi2.t(t2k, lp1.f(xuj.b));
                            xuj.c();
                            iterator = ((Iterable)this.f).iterator();
                            continue Label_0114_Outer;
                            Block_7: {
                                wuj g;
                                while (true) {
                                    g = xuj.g(t2k);
                                    iftrue(Label_0102:)(!g.b);
                                    break Block_7;
                                    r9n.m((AutoCloseable)d1, (Throwable)null);
                                    xuj.a(t2k);
                                    final int n;
                                    iftrue(Label_0114:)(n != 0);
                                    continue;
                                }
                                Label_0102:
                                fvd.y((Object)g.a, "Pre-packaged database has an invalid schema: ");
                                return;
                            }
                            continue Block_6_Outer;
                        }
                    }
                    iterator.next().getClass();
                    continue;
                }
            }
        }
    }
    
    public void r(final t2k t2k, final int n, final int n2) {
        final xuj xuj = (xuj)this.e;
        final aw7 aw7 = (aw7)this.d;
        final List x = soh.x(aw7.d, n, n2);
        if (x != null) {
            xuj.f(t2k);
            final Iterator iterator = ((Iterable)x).iterator();
            while (iterator.hasNext()) {
                ((m9f)iterator.next()).b(t2k);
            }
            final wuj g = xuj.g(t2k);
            if (g.b) {
                xuj.e();
                yi2.t(t2k, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                yi2.t(t2k, lp1.f(xuj.b));
                return;
            }
            fvd.y((Object)g.a, "Migration didn't properly handle: ");
        }
        else {
            boolean b = false;
            Label_0186: {
                if (n <= n2 || !aw7.k) {
                    final Set l = aw7.l;
                    if (aw7.j && (l == null || !l.contains((Object)n))) {
                        b = true;
                        break Label_0186;
                    }
                }
                b = false;
            }
            if (!b) {
                if (aw7.o) {
                    final b3k d1 = t2k.d1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                    Label_0310: {
                        try {
                            final ygd a = lq6.A();
                            while (d1.Z0()) {
                                final String t0 = d1.t0(0);
                                if (!rym.E0(t0, "sqlite_", false)) {
                                    if (t0.equals("android_metadata")) {
                                        continue;
                                    }
                                    a.add((Object)new yog((Object)t0, (Object)mlc.q((Object)d1.t0(1), (Object)"view")));
                                }
                            }
                            break Label_0310;
                        }
                        finally {
                            try {}
                            finally {
                                final Throwable t2;
                                r9n.m((AutoCloseable)d1, t2);
                            }
                            while (true) {
                                String s;
                                while (true) {
                                    final xgd xgd;
                                    final yog yog = (yog)xgd.next();
                                    s = (String)yog.v;
                                    iftrue(Label_0420:)(!(boolean)yog.w);
                                    final StringBuilder sb = new StringBuilder("DROP VIEW IF EXISTS `");
                                    sb.append(s);
                                    sb.append('`');
                                    yi2.t(t2k, sb.toString());
                                    final ListIterator listIterator;
                                    xgd = (xgd)listIterator;
                                    iftrue(Label_0479:)(!xgd.hasNext());
                                    continue;
                                }
                                final StringBuilder sb2;
                                Label_0420: {
                                    sb2 = new StringBuilder("DROP TABLE IF EXISTS `");
                                }
                                sb2.append(s);
                                sb2.append('`');
                                yi2.t(t2k, sb2.toString());
                                continue;
                                final ygd a;
                                final ygd n3 = lq6.n(a);
                                r9n.m((AutoCloseable)d1, (Throwable)null);
                                final ListIterator listIterator = n3.listIterator(0);
                                continue;
                            }
                        }
                    }
                }
                xuj.b(t2k);
                final Iterator iterator2;
                Label_0479: {
                    iterator2 = ((Iterable)this.f).iterator();
                }
                while (iterator2.hasNext()) {
                    iterator2.next().getClass();
                }
                xuj.a(t2k);
                return;
            }
            final StringBuilder sb3 = new StringBuilder("A migration from ");
            sb3.append(n);
            sb3.append(" to ");
            sb3.append(n2);
            sb3.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.");
            throw new IllegalStateException(sb3.toString().toString());
        }
    }
    
    public void s(final t2k t2k) {
        final xuj xuj = (xuj)this.e;
        final String b = xuj.b;
        final b3k d1 = t2k.d1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        Label_0061: {
            try {
                if (d1.Z0() && d1.getLong(0) != 0L) {
                    final boolean b2 = true;
                    break Label_0061;
                }
                break Label_0061;
            }
            finally {
                try {}
                finally {
                    r9n.m((AutoCloseable)d1, (Throwable)t2k);
                }
                Label_0434: {
                    yi2.t(t2k, "ROLLBACK TRANSACTION");
                }
                final boolean b2 = false;
                break Label_0061;
            Label_0268_Outer:
                while (true) {
                    Iterator iterator = null;
                    Block_10: {
                        while (true) {
                            jpj jpj = null;
                            lqo lqo;
                            final puj puj;
                            StringBuilder sb;
                            b3k d2;
                            String t0;
                            final Throwable t2;
                            StringBuilder sb2;
                            lqo a;
                            Label_0358_Outer:Label_0313_Outer:
                            while (true) {
                                iftrue(Label_0346:)(jpj instanceof jpj);
                                lqo = (lqo)jpj;
                                yi2.t(t2k, "END TRANSACTION");
                                while (true) {
                                    Label_0208: {
                                        while (true) {
                                            Label_0346: {
                                                break Label_0346;
                                                puj.a(((g5n)t2k).v);
                                                while (true) {
                                                    iftrue(Label_0428:)(!iterator.hasNext());
                                                    break Block_10;
                                                    Label_0428:
                                                    this.b = true;
                                                    return;
                                                    xuj.d(t2k);
                                                    iterator = ((Iterable)this.f).iterator();
                                                    continue Label_0358_Outer;
                                                }
                                                sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                                                sb.append(((wuj)jpj).a);
                                                throw new IllegalStateException(sb.toString().toString());
                                                while (true) {
                                                    d2 = t2k.d1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                                                Block_16_Outer:
                                                    while (true) {
                                                        Label_0112: {
                                                            try {
                                                                if (d2.Z0()) {
                                                                    t0 = d2.t0(0);
                                                                    break Label_0115;
                                                                }
                                                                break Label_0112;
                                                            }
                                                            finally {
                                                                try {}
                                                                finally {
                                                                    r9n.m((AutoCloseable)d2, t2);
                                                                }
                                                                while (true) {
                                                                    iftrue(Label_0147:)(!xuj.c.equals(t0));
                                                                    continue Label_0268_Outer;
                                                                    Label_0147:
                                                                    sb2 = new StringBuilder("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ");
                                                                    sb2.append(b);
                                                                    sb2.append(", found: ");
                                                                    sb2.append(t0);
                                                                    throw new IllegalStateException(sb2.toString().toString());
                                                                    r9n.m((AutoCloseable)d2, (Throwable)null);
                                                                    iftrue(Label_0358:)(b.equals(t0));
                                                                    continue Label_0313_Outer;
                                                                }
                                                                t0 = null;
                                                                continue Block_16_Outer;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break Label_0208;
                                                    r9n.m((AutoCloseable)d1, (Throwable)null);
                                                    iftrue(Label_0208:)(!b2);
                                                    continue Label_0313_Outer;
                                                }
                                            }
                                            iftrue(Label_0434:)(kpj.a((Object)jpj) != null);
                                            continue Label_0268_Outer;
                                        }
                                        jpj = new jpj((Throwable)jpj);
                                        continue Label_0358_Outer;
                                    }
                                    yi2.t(t2k, "BEGIN EXCLUSIVE TRANSACTION");
                                    try {
                                        if (xuj.g(t2k).b) {
                                            xuj.e();
                                            yi2.t(t2k, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                                            yi2.t(t2k, lp1.f(xuj.b));
                                            a = lqo.a;
                                            continue Label_0358_Outer;
                                        }
                                    }
                                    finally {
                                        continue;
                                    }
                                    break;
                                }
                                break;
                            }
                            continue;
                        }
                    }
                    final puj puj = (puj)iterator.next();
                    puj.getClass();
                    iftrue(Label_0378:)(!(t2k instanceof g5n));
                    continue;
                }
            }
        }
    }
    
    public boolean t(final LayoutNode layoutNode, final boolean b) {
        final LayoutNode layoutNode2 = (LayoutNode)this.d;
        final boolean j0 = layoutNode.j0;
        final boolean b2 = false;
        boolean b3 = false;
        final int n = 0;
        if (!j0) {
            if (m(layoutNode)) {
                gv6 gv6;
                if (layoutNode == layoutNode2) {
                    gv6 = (gv6)this.i;
                    gv6.getClass();
                }
                else {
                    gv6 = null;
                }
                boolean b4 = false;
                Label_0242: {
                    if (b) {
                        int e = n;
                        if (layoutNode.x()) {
                            e = (e(layoutNode, gv6) ? 1 : 0);
                        }
                        if (e == 0) {
                            b4 = (e != 0);
                            if (!layoutNode.w()) {
                                break Label_0242;
                            }
                        }
                        b4 = (e != 0);
                        if (mlc.q((Object)layoutNode.Y(), (Object)Boolean.TRUE)) {
                            layoutNode.b0();
                            b4 = (e != 0);
                        }
                    }
                    else {
                        boolean f = b2;
                        if (layoutNode.B()) {
                            f = f(layoutNode, gv6);
                        }
                        b4 = f;
                        if (layoutNode.u()) {
                            if (layoutNode != layoutNode2) {
                                final LayoutNode g = layoutNode.G();
                                b4 = f;
                                if (g == null) {
                                    break Label_0242;
                                }
                                b4 = f;
                                if (!g.W()) {
                                    break Label_0242;
                                }
                                b4 = f;
                                if (!layoutNode.X()) {
                                    break Label_0242;
                                }
                            }
                            if (layoutNode == layoutNode2) {
                                layoutNode.k0();
                            }
                            else {
                                layoutNode.p0();
                            }
                            final e3a e3a = (e3a)this.f;
                            b4 = f;
                            if (layoutNode.i0 > 0) {
                                ((inf)e3a.w).b((Object)layoutNode);
                                layoutNode.h0 = true;
                                b4 = f;
                            }
                        }
                    }
                }
                this.g();
                b3 = b4;
            }
        }
        return b3;
    }
    
    @Override
    public String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 0: {
                final Map map = (Map)this.i;
                final Long n = (Long)this.h;
                final Long n2 = (Long)this.g;
                final Long n3 = (Long)this.f;
                final Long n4 = (Long)this.e;
                final ArrayList list = new ArrayList();
                if (this.b) {
                    list.add((Object)"isRegularFile");
                }
                if (this.c) {
                    list.add((Object)"isDirectory");
                }
                if (n4 != null) {
                    final StringBuilder sb = new StringBuilder("byteCount=");
                    sb.append((long)n4);
                    list.add((Object)sb.toString());
                }
                if (n3 != null) {
                    final StringBuilder sb2 = new StringBuilder("createdAt=");
                    sb2.append((long)n3);
                    list.add((Object)sb2.toString());
                }
                if (n2 != null) {
                    final StringBuilder sb3 = new StringBuilder("lastModifiedAt=");
                    sb3.append((long)n2);
                    list.add((Object)sb3.toString());
                }
                if (n != null) {
                    final StringBuilder sb4 = new StringBuilder("lastAccessedAt=");
                    sb4.append((long)n);
                    list.add((Object)sb4.toString());
                }
                if (!map.isEmpty()) {
                    final StringBuilder sb5 = new StringBuilder("extras=");
                    sb5.append((Object)map);
                    list.add((Object)sb5.toString());
                }
                return c86.N0((Iterable)list, (CharSequence)", ", "FileMetadata(", ")", (lta)null, 56);
            }
        }
    }
    
    public boolean u(final LayoutNode layoutNode, final boolean b) {
        final boolean j0 = layoutNode.j0;
        boolean b2 = false;
        final boolean b3 = false;
        if (!j0) {
            if (m(layoutNode)) {
                gv6 gv6;
                if (layoutNode == this.d) {
                    gv6 = (gv6)this.i;
                    gv6.getClass();
                }
                else {
                    gv6 = null;
                }
                boolean b4;
                if (b) {
                    b4 = b3;
                    if (layoutNode.x()) {
                        b4 = e(layoutNode, gv6);
                    }
                }
                else {
                    b4 = b3;
                    if (layoutNode.B()) {
                        b4 = f(layoutNode, gv6);
                    }
                }
                this.g();
                b2 = b4;
            }
        }
        return b2;
    }
    
    public void v(final LayoutNode layoutNode) {
        final inf m = layoutNode.M();
        final Object[] v = m.v;
        for (int x = m.x, i = 0; i < x; ++i) {
            final LayoutNode layoutNode2 = (LayoutNode)v[i];
            if (layoutNode2.C() == 1 || layoutNode2.t().p.S.e()) {
                if (omo.R(layoutNode2)) {
                    this.w(layoutNode2, true);
                }
                else {
                    this.v(layoutNode2);
                }
            }
        }
    }
    
    public void w(final LayoutNode layoutNode, final boolean b) {
        if (layoutNode.j0) {
            return;
        }
        gv6 gv6;
        if (layoutNode == this.d) {
            gv6 = (gv6)this.i;
            gv6.getClass();
        }
        else {
            gv6 = null;
        }
        if (b) {
            e(layoutNode, gv6);
            return;
        }
        f(layoutNode, gv6);
    }
    
    public boolean x(final LayoutNode layoutNode, final boolean b) {
        final int d = ge9.D(layoutNode.v());
        if (d != 0 && d != 1) {
            if (d != 2 && d != 3) {
                if (d != 4) {
                    en9.r();
                    return false;
                }
                if (!layoutNode.B() || b) {
                    layoutNode.f0();
                    if (!layoutNode.j0) {
                        if (layoutNode.W() || l(layoutNode)) {
                            final LayoutNode g = layoutNode.G();
                            if (g == null || !g.B()) {
                                ((zn0)this.e).g(3, layoutNode);
                            }
                            if (!this.c) {
                                return true;
                            }
                        }
                    }
                }
            }
            else {
                ((inf)this.h).b((Object)new hoe(layoutNode, false, b));
            }
        }
        return false;
    }
    
    public void y(final long n) {
        final LayoutNode layoutNode = (LayoutNode)this.d;
        final gv6 gv6 = (gv6)this.i;
        if (gv6 == null || !gv6.c(gv6.a, n)) {
            if (this.b) {
                gac.a("updateRootConstraints called while measuring");
            }
            this.i = new gv6(n);
            if (layoutNode.V()) {
                if (layoutNode.D != null) {
                    layoutNode.e0();
                }
                layoutNode.f0();
                final zn0 zn0 = (zn0)this.e;
                int n2;
                if (layoutNode.D != null) {
                    n2 = 1;
                }
                else {
                    n2 = 3;
                }
                zn0.g(n2, layoutNode);
            }
        }
    }
}
