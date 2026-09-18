import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager$LayoutParams;
import androidx.compose.ui.node.LayoutNode;
import java.util.UUID;
import android.view.View;

public abstract class w90
{
    public static final b09 a;
    public static final b09 b;
    
    static {
        a = new b09((jta)new y5((byte)16), (byte)0);
        b = new b09((jta)new lih((byte)0), (byte)0);
    }
    
    public static final void a(final sgh sgh, jta jta, tgh tgh, final ye6 ye6, final gva gva, final int n, final int n2) {
        gva.i0(-1772091631);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)sgh)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0112: {
            int n6;
            if (n5 != 0) {
                n6 = (n4 | 0x30);
            }
            else {
                n6 = n4;
                if ((n & 0x30) == 0x0) {
                    int n7;
                    if (gva.h((Object)jta)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n4 | n7);
                    break Label_0112;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0180: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x180) == 0x0) {
                    int n11;
                    if (gva.f((Object)tgh)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0180;
                }
            }
            n12 = n10;
        }
        int n13 = n12;
        if ((n & 0xC00) == 0x0) {
            int n14;
            if (gva.h((Object)ye6)) {
                n14 = 2048;
            }
            else {
                n14 = 1024;
            }
            n13 = (n12 | n14);
        }
        if (gva.W(n13 & 0x1, (n13 & 0x493) != 0x492)) {
            if (n5 != 0) {
                jta = null;
            }
            if (n9 != 0) {
                tgh = new tgh(false, false, 31);
            }
            final View view = (View)gva.j((sei)q50.f);
            final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
            final String s = (String)gva.j((sei)w90.a);
            final qzc qzc = (qzc)gva.j((sei)hm6.n);
            final eva v = r6k.V(gva);
            final bnf w = o50.W((Object)ye6, gva);
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o;
            if ((o = r) == a) {
                o = new qx((byte)13);
                gva.q0(o);
            }
            final UUID uuid = (UUID)mlc.a0(new Object[0], (jta)o, gva, 48);
            final boolean booleanValue = (boolean)gva.j((sei)w90.b);
            Object r2 = gva.R();
            if (r2 == a) {
                r2 = new pgh(jta, tgh, s, view, xc8, sgh, uuid, booleanValue);
                ((pgh)r2).n((tl6)v, (zta)new ye6(-297523940, true, (Object)new r90((pgh)r2, w, (byte)0)));
                gva.q0(r2);
            }
            final pgh pgh = (pgh)r2;
            final boolean h = gva.h((Object)pgh);
            final int n15 = n13 & 0x70;
            final boolean b = n15 == 32;
            final int n16 = n13 & 0x380;
            final boolean b2 = n16 == 256;
            final boolean f = gva.f((Object)s);
            final boolean d = gva.d(qzc.ordinal());
            final Object r3 = gva.R();
            Object o2;
            if ((h | b | b2 | f | d) || (o2 = r3) == a) {
                o2 = new u70((Object)pgh, (Object)jta, (Object)tgh, (Object)s, (Object)qzc, (byte)1);
                gva.q0(o2);
            }
            mlc.a((Object)pgh, (lta)o2, gva);
            final boolean h2 = gva.h((Object)pgh);
            final boolean b3 = n15 == 32;
            final boolean b4 = n16 == 256;
            final boolean f2 = gva.f((Object)s);
            final boolean d2 = gva.d(qzc.ordinal());
            Object r4 = gva.R();
            if ((h2 | b3 | b4 | f2 | d2) || r4 == a) {
                r4 = new er((byte)3, (Object)pgh, (Object)jta, (Object)tgh, (Object)qzc, s);
                gva.q0(r4);
            }
            mlc.l((jta)r4, gva);
            final boolean h3 = gva.h((Object)pgh);
            final boolean b5 = (n13 & 0xE) == 0x4;
            final Object r5 = gva.R();
            Object o3;
            if ((h3 | b5) || (o3 = r5) == a) {
                o3 = new y((Object)pgh, (Object)sgh, (byte)7);
                gva.q0(o3);
            }
            mlc.a((Object)sgh, (lta)o3, gva);
            final boolean h4 = gva.h((Object)pgh);
            final Object r6 = gva.R();
            Object o4;
            if (h4 || (o4 = r6) == a) {
                o4 = new z((byte)18, (f07)null, (Object)pgh);
                gva.q0(o4);
            }
            mlc.f((zta)o4, gva, (Object)pgh);
            final boolean h5 = gva.h((Object)pgh);
            final Object r7 = gva.R();
            Object o5;
            if (h5 || (o5 = r7) == a) {
                o5 = new s90(pgh, (byte)0);
                gva.q0(o5);
            }
            final igf d3 = ien.D((igf)fgf.v, (lta)o5);
            final boolean h6 = gva.h((Object)pgh);
            final boolean d4 = gva.d(qzc.ordinal());
            final Object r8 = gva.R();
            Object o6;
            if ((h6 | d4) || (o6 = r8) == a) {
                o6 = new t90((Object)pgh, (Object)qzc, (byte)0);
                gva.q0(o6);
            }
            final moe moe = (moe)o6;
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b6 = ien.B(gva, d3);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)moe);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b6);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new yw((Object)sgh, (Object)jta, (Object)tgh, ye6, n, n2, (byte)1);
        }
    }
    
    public static final void b(final mb2 mb2, final long n, tgh tgh, final ye6 ye6, final gva gva, final int n2) {
        gva.i0(71005054);
        int n3;
        if (gva.e(n)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n3 | 0xD80;
        boolean b = false;
        if (gva.W(n4 & 0x1, (n4 & 0x2493) != 0x2492)) {
            final tgh tgh2 = new tgh(false, false, 31);
            if ((n4 & 0x70) == 0x20) {
                b = true;
            }
            final boolean d = gva.d(1002);
            final boolean f = gva.f((Object)null);
            final Object r = gva.R();
            px px;
            if ((d | b | f) || (px = (px)r) == bi6.a) {
                px = new px(mb2, n);
                gva.q0((Object)px);
            }
            a((sgh)px, null, tgh2, ye6, gva, 3504, 0);
            tgh = tgh2;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new q90((byte)0, n2, n, (Object)mb2, (Object)tgh, (Object)ye6);
        }
    }
    
    public static final boolean c(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager$LayoutParams windowManager$LayoutParams;
        if (layoutParams instanceof WindowManager$LayoutParams) {
            windowManager$LayoutParams = (WindowManager$LayoutParams)layoutParams;
        }
        else {
            windowManager$LayoutParams = null;
        }
        return windowManager$LayoutParams != null && (windowManager$LayoutParams.flags & 0x2000) != 0x0;
    }
}
