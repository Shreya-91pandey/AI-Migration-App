import android.net.Uri;
import android.os.Bundle;
import java.util.UUID;
import java.util.Set;
import java.lang.ref.ReferenceQueue;
import android.util.Log;
import java.io.File;
import android.content.Context;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eup implements m55, vn2, ne6, lrd, gv0, jv0, gc7, ru7, b9f, v1p, hm7, mdo, l55, wcq
{
    public static final eup A;
    public static final eup B;
    public static final eup C;
    public static final eup D;
    public static final eup E;
    public static final eup F;
    public static final eup w;
    public static final eup x;
    public static final ad8 y;
    public static final k2j z;
    public final byte v;
    
    public eup(final gfk gfk) {
        this.v = 28;
    }
    
    public static final void A(final AtomicBoolean atomicBoolean, final l13 l13) {
        if (atomicBoolean.compareAndSet(false, true)) {
            l13.resumeWith((Object)lqo.a);
            return;
        }
        SilentException.a(new SilentException("startUpWebView resumed more than once"), lpl.w, (List)null, 6);
    }
    
    public static ArrayList t(final List list) {
        final ArrayList list2 = new ArrayList();
        for (final Object next : list) {
            if (next != mei.w) {
                list2.add(next);
            }
        }
        final ArrayList list3 = new ArrayList(d86.p0((Iterable)list2, 10));
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list3.add((Object)((mei)iterator2.next()).v);
        }
        return list3;
    }
    
    public static ihn u(final int n, final gva gva) {
        return x(((e8e)gva.j((sei)h8e.a)).a, gva);
    }
    
    public static ihn v(long h, long h2, long n, long n2, long n3, long n4, long n5, long n6, long n7, long n8, long n9, long n10, long n11, long n12, long n13, long n14, long n15, long n16, long n17, long n18, final gva gva, final int n19) {
        long h3;
        if ((n19 & 0x1) != 0x0) {
            h3 = j86.h;
        }
        else {
            h3 = h;
        }
        if ((n19 & 0x2) != 0x0) {
            h2 = j86.h;
        }
        h = j86.h;
        if ((n19 & 0x10) != 0x0) {
            n = h;
        }
        if ((n19 & 0x20) != 0x0) {
            n2 = h;
        }
        if ((n19 & 0x40) != 0x0) {
            n3 = h;
        }
        if ((n19 & 0x80) != 0x0) {
            n4 = h;
        }
        if ((n19 & 0x100) != 0x0) {
            n5 = h;
        }
        if ((n19 & 0x200) != 0x0) {
            n6 = h;
        }
        if ((n19 & 0x800) != 0x0) {
            n7 = h;
        }
        if ((n19 & 0x1000) != 0x0) {
            n8 = h;
        }
        if ((n19 & 0x2000) != 0x0) {
            n9 = h;
        }
        if ((n19 & 0x4000) != 0x0) {
            n10 = h;
        }
        if ((0x8000 & n19) != 0x0) {
            n11 = h;
        }
        if ((0x10000 & n19) != 0x0) {
            n12 = h;
        }
        if ((0x20000 & n19) != 0x0) {
            n13 = h;
        }
        if ((0x40000 & n19) != 0x0) {
            n14 = h;
        }
        if ((0x8000000 & n19) != 0x0) {
            n15 = h;
        }
        if ((0x10000000 & n19) != 0x0) {
            n16 = h;
        }
        if ((0x20000000 & n19) != 0x0) {
            n17 = h;
        }
        if ((n19 & 0x40000000) != 0x0) {
            n18 = h;
        }
        return x(((e8e)gva.j((sei)h8e.a)).a, gva).a(h3, h2, h, h, n, n2, n3, n4, n5, n6, null, n7, n8, n9, n10, n11, n12, n13, n14, h, h, h, h, h, h, h, h, n15, n16, n17, n18, h, h, h, h, h, h, h, h, h, h, h, h);
    }
    
    public static byte[] w(final List list) {
        final Object o = new Object();
        for (final String s : t(list)) {
            ((an2)o).g1(s.length());
            ((an2)o).n1(s);
        }
        return ((an2)o).Z(((an2)o).w);
    }
    
    public static ihn x(final r86 r86, final gva gva) {
        ihn k0 = r86.k0;
        if (k0 == null) {
            gva.g0(390452338);
            gva.q(false);
            k0 = null;
        }
        else {
            gva.g0(390452339);
            final gnn gnn = (gnn)gva.j((sei)hnn.a);
            if (!mlc.q((Object)k0.k, (Object)gnn)) {
                k0 = ihn.b(k0, gnn);
                r86.k0 = k0;
            }
            gva.q(false);
        }
        if (k0 == null) {
            gva.g0(-1788321191);
            final long c = s86.c(r86, 17);
            final long c2 = s86.c(r86, 17);
            final long b = j86.b(0.38f, s86.c(r86, 17));
            final long c3 = s86.c(r86, 17);
            final long g = j86.g;
            final ihn k2 = new ihn(c, c2, b, c3, g, g, g, g, s86.c(r86, 25), s86.c(r86, 1), (gnn)gva.j((sei)hnn.a), s86.c(r86, 25), s86.c(r86, 23), j86.b(0.12f, s86.c(r86, 17)), s86.c(r86, 1), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 18), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 1), s86.c(r86, 25), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 1), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 18), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 17)), s86.c(r86, 1), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 18)), s86.c(r86, 18), s86.c(r86, 18), s86.c(r86, 18), j86.b(0.38f, s86.c(r86, 18)), s86.c(r86, 18));
            r86.k0 = k2;
            gva.q(false);
            return k2;
        }
        gva.g0(-1788515437);
        gva.q(false);
        return k0;
    }
    
    public static boolean y(final cx7 cx7, final String s) {
        final Map map = (Map)cx7.q.get((Object)"session-replay");
        if (map != null) {
            final Object value = map.get((Object)s);
            final boolean b = value instanceof Map;
            Boolean b2 = null;
            Map map2;
            if (b) {
                map2 = (Map)value;
            }
            else {
                map2 = null;
            }
            Object value2;
            if (map2 != null) {
                value2 = map2.get((Object)"has_replay");
            }
            else {
                value2 = null;
            }
            if (value2 instanceof Boolean) {
                b2 = (Boolean)value2;
            }
            if (b2 != null) {
                return b2;
            }
        }
        return false;
    }
    
    public long a() {
        return System.currentTimeMillis();
    }
    
    public void b(final Context context) {
    }
    
    @Override
    public hfc c() {
        return kfc.a.c();
    }
    
    public float d() {
        return 0.0f;
    }
    
    public void e(final File file, final bz1 bz1) {
    }
    
    public Object f() {
        return new def((byte)28);
    }
    
    public void g(final boolean b, final boolean b2, final llf llf, igf v, final ihn ihn, final aql aql, float n, float n2, final gva gva, final int n3, final int n4) {
        gva.i0(1035477640);
        int n5;
        if (gva.g(b)) {
            n5 = 4;
        }
        else {
            n5 = 2;
        }
        int n6;
        if (gva.g(b2)) {
            n6 = 32;
        }
        else {
            n6 = 16;
        }
        int n7;
        if (gva.f((Object)llf)) {
            n7 = 256;
        }
        else {
            n7 = 128;
        }
        final int n8 = n5 | n3 | n6 | n7;
        final int n9 = n4 & 0x8;
        int n10;
        if (n9 != 0) {
            n10 = (n8 | 0xC00);
        }
        else {
            n10 = n8;
            if ((n3 & 0xC00) == 0x0) {
                int n11;
                if (gva.f((Object)v)) {
                    n11 = 2048;
                }
                else {
                    n11 = 1024;
                }
                n10 = (n8 | n11);
            }
        }
        int n12;
        if (gva.f((Object)ihn)) {
            n12 = 16384;
        }
        else {
            n12 = 8192;
        }
        int n13;
        if (gva.f((Object)aql)) {
            n13 = 131072;
        }
        else {
            n13 = 65536;
        }
        final int n14 = n10 | n12 | n13;
        int n16;
        if ((0x180000 & n3) == 0x0) {
            int n15;
            if ((n4 & 0x40) == 0x0 && gva.c(n)) {
                n15 = 1048576;
            }
            else {
                n15 = 524288;
            }
            n16 = (n14 | n15);
        }
        else {
            n16 = n14;
        }
        if ((0xC00000 & n3) == 0x0) {
            int n17;
            if ((n4 & 0x80) == 0x0 && gva.c(n2)) {
                n17 = 8388608;
            }
            else {
                n17 = 4194304;
            }
            n16 |= n17;
        }
        float n23;
        if (gva.W(n16 & 0x1, (0x2492493 & n16) != 0x2492492)) {
            gva.b0();
            if ((n3 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n18 = n16;
                if ((n4 & 0x40) != 0x0) {
                    n18 = (n16 & 0xFFC7FFFF);
                }
                n16 = n18;
                if ((n4 & 0x80) != 0x0) {
                    n16 = (n18 & 0xFE3FFFFF);
                }
                final float n19 = n;
                n = n2;
                n2 = n19;
            }
            else {
                if (n9 != 0) {
                    v = (igf)fgf.v;
                }
                if ((n4 & 0x40) != 0x0) {
                    n16 &= 0xFFC7FFFF;
                    n = 2.0f;
                }
                if ((n4 & 0x80) != 0x0) {
                    n2 = 1.0f;
                    n16 &= 0xFE3FFFFF;
                }
                final float n20 = n;
                n = n2;
                n2 = n20;
            }
            gva.r();
            final boolean booleanValue = (boolean)((xom)t08.t(llf, gva, n16 >> 6 & 0xE)).getValue();
            final long c = ihn.c(b, b2, booleanValue);
            final ygm x = zrn.X(4, gva);
            Object o;
            if (b) {
                gva.g0(-1674528831);
                o = tzl.a(c, (bfa)x, (String)null, gva, 0, 12);
                gva.q(false);
            }
            else {
                gva.g0(-1674448076);
                o = o50.W((Object)new j86(c), gva);
                gva.q(false);
            }
            final ygm x2 = zrn.X(1, gva);
            Object o2;
            if (b) {
                gva.g0(-1674266664);
                float n21;
                if (booleanValue) {
                    n21 = n2;
                }
                else {
                    n21 = n;
                }
                o2 = md0.a(n21, (bfa)x2, (String)null, gva, 0, 12);
                gva.q(false);
            }
            else {
                gva.g0(-1674084601);
                o2 = o50.W((Object)new qs8(n), gva);
                gva.q(false);
            }
            final bnf w = o50.W((Object)ao2.a(((qs8)((xom)o2).getValue()).v, ((j86)((xom)o).getValue()).a), gva);
            long n22;
            if (!b) {
                n22 = ihn.g;
            }
            else if (b2) {
                n22 = ihn.h;
            }
            else if (booleanValue) {
                n22 = ihn.e;
            }
            else {
                n22 = ihn.f;
            }
            final xom a = tzl.a(n22, (bfa)zrn.X(4, gva), (String)null, gva, 0, 12);
            final bi2 bi2 = (bi2)((xom)w).getValue();
            rj2.a(t08.F(zn2.m(v, bi2.a, bi2.b, aql), (lta)new tyl((Object)aql, (Object)new ain(new bkc(a, xom.class, "value", "getValue()Ljava/lang/Object;", 0, (byte)2)), (byte)6)), gva, 0);
            n23 = n;
        }
        else {
            gva.Z();
            n23 = n2;
            n2 = n;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new uig(this, b, b2, llf, v, ihn, aql, n2, n23, n3, n4);
        }
    }
    
    public fdb get() {
        return fdb.w;
    }
    
    @Override
    public xc8 getDensity() {
        return (xc8)eup.y;
    }
    
    @Override
    public qzc getLayoutDirection() {
        return qzc.v;
    }
    
    public void h(final xc8 xc8, final int n, final int[] array, final qzc qzc, final int[] array2) {
        if (qzc == qzc.v) {
            t08.Z(n, array, array2, false);
            return;
        }
        t08.Z(n, array, array2, true);
    }
    
    @Override
    public long i() {
        return 9205357640488583168L;
    }
    
    public void j(final lqd lqd) {
        final String b = lqd.b;
        final int d = ge9.D(lqd.a);
        if (d == 0) {
            Log.e("AndroidLog", "message=".concat(b));
            return;
        }
        if (d != 1) {
            return;
        }
        Log.w("AndroidLog", "message=".concat(b));
    }
    
    public Object k(final uy7 uy7) {
        final u25 u25 = new u25();
        final ReferenceQueue a = u25.a;
        final Set b = u25.b;
        b.add((Object)new vqq(u25, a, b));
        final Thread thread = new Thread((Runnable)new qrq((Object)a, (Object)b, (byte)10), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return u25;
    }
    
    public void l(final jy7 jy7, final y7j y7j) {
    }
    
    public void m(final tjc tjc, final Context context) {
    }
    
    public void n(final File file, final m9r m9r, final int n) {
    }
    
    public void o(final String s, final zta zta, final boolean b, final boolean b2, final lep lep, final llf llf, final boolean b3, final zta zta2, final zta zta3, final zta zta4, final zta zta5, final zta zta6, final zta zta7, final ihn ihn, dng dng, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-1732281618);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)s)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.h((Object)zta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n & 0x180) == 0x0) {
            int n6;
            if (gva.g(b)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n4 |= n6;
        }
        int n7 = 2048;
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.g(b2)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n4 |= n8;
        }
        int n9 = 8192;
        int n10 = n4;
        if ((n & 0x6000) == 0x0) {
            int n11;
            if (gva.f((Object)lep)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n4 | n11);
        }
        int n13;
        if ((0x30000 & n) == 0x0) {
            int n12;
            if (gva.f((Object)llf)) {
                n12 = 131072;
            }
            else {
                n12 = 65536;
            }
            n13 = (n10 | n12);
        }
        else {
            n13 = n10;
        }
        int n14 = n13;
        if ((n & 0x180000) == 0x0) {
            int n15;
            if (gva.g(b3)) {
                n15 = 1048576;
            }
            else {
                n15 = 524288;
            }
            n14 = (n13 | n15);
        }
        int n16 = n14;
        if ((n & 0xC00000) == 0x0) {
            int n17;
            if (gva.h((Object)zta2)) {
                n17 = 8388608;
            }
            else {
                n17 = 4194304;
            }
            n16 = (n14 | n17);
        }
        int n18 = n16;
        if ((n & 0x6000000) == 0x0) {
            int n19;
            if (gva.h((Object)zta3)) {
                n19 = 67108864;
            }
            else {
                n19 = 33554432;
            }
            n18 = (n16 | n19);
        }
        int n20 = n18;
        if ((n & 0x30000000) == 0x0) {
            int n21;
            if (gva.h((Object)zta4)) {
                n21 = 536870912;
            }
            else {
                n21 = 268435456;
            }
            n20 = (n18 | n21);
        }
        int n22;
        if (gva.h((Object)zta5)) {
            n22 = 4;
        }
        else {
            n22 = 2;
        }
        int n23;
        if (gva.h((Object)zta6)) {
            n23 = 32;
        }
        else {
            n23 = 16;
        }
        int n24;
        if (gva.h((Object)null)) {
            n24 = 256;
        }
        else {
            n24 = 128;
        }
        if (!gva.h((Object)zta7)) {
            n7 = 1024;
        }
        if (gva.f((Object)ihn)) {
            n9 = 16384;
        }
        final int n25 = 0xD80000 | n22 | n23 | n24 | n7 | n9 | 0x10000;
        if (gva.W(n20 & 0x1, (n20 & 0x12492493) != 0x12492492 || (n25 & 0x492493) != 0x492492)) {
            gva.b0();
            int n26;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n26 = (n25 & 0xFFF8FFFF);
            }
            else {
                dng = new hng(16.0f, 16.0f, 16.0f, 16.0f);
                n26 = (n25 & 0xFFF8FFFF);
            }
            gva.r();
            final boolean b4 = (n20 & 0xE) == 0x4;
            final boolean b5 = (n20 & 0xE000) == 0x4000;
            final Object r = gva.R();
            leo a;
            if ((b5 | b4) || (a = (leo)r) == bi6.a) {
                a = lep.a(new og0(s));
                gva.q0((Object)a);
            }
            final String w = a.a.w;
            final vin vin = new vin(0);
            Object t0;
            if (zta2 == null) {
                gva.g0(1927010204);
                gva.q(false);
                t0 = null;
            }
            else {
                gva.g0(1927010205);
                t0 = uuj.t0(-1819131923, (aua)new rz3(zta2, (byte)1), gva);
                gva.q(false);
            }
            final int n27 = n20 >> 12;
            final int n28 = n26 << 18;
            ao2.h((CharSequence)w, zta, (riq)vin, (bua)t0, zta3, zta4, zta5, zta6, zta7, b2, b, b3, llf, dng, ihn, (zta)ye6, gva, (n20 & 0x70) | (n27 & 0xE000) | (n27 & 0x70000) | (n28 & 0x380000) | (n28 & 0x1C00000) | (n28 & 0xE000000) | (n28 & 0x70000000), (n27 & 0x380) | ((n20 >> 9 & 0xE) | (n20 >> 3 & 0x70)) | (n20 >> 6 & 0x1C00) | (n26 << 3 & 0x70000) | 0x180000);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new vig(this, s, zta, b, b2, lep, llf, b3, zta2, zta3, zta4, zta5, zta6, zta7, ihn, dng, ye6, n);
        }
    }
    
    public void r(final xc8 xc8, final int n, final int[] array, final int[] array2) {
        t08.Z(n, array, array2, false);
    }
    
    public void s(final UUID uuid, final ier ier) {
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 25: {
                return "ReusedSlotId";
            }
            case 24: {
                final int hashCode = this.hashCode();
                lq6.u(16);
                final String string = Integer.toString(hashCode, 16);
                string.getClass();
                return lmf.t("CreationExtras.Key@", string, "<", v4j.a((Class)Bundle.class).c(), ">");
            }
            case 11: {
                return "Arrangement#SpaceBetween";
            }
        }
    }
    
    public Object z(final Context context, final ic7 ic7, h07 h07) {
        ltp ltp2 = null;
        Label_0056: {
            if (h07 instanceof ltp) {
                final ltp ltp = (ltp)h07;
                final int x = ltp.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    ltp.x = x + Integer.MIN_VALUE;
                    ltp2 = ltp;
                    break Label_0056;
                }
            }
            ltp2 = new ltp(this, h07);
        }
        final Object v = ltp2.v;
        final int x2 = ltp2.x;
        if (x2 != 0) {
            if (x2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
        }
        else {
            vt4.g0(v);
            ltp2.x = 1;
            h07 = (h07)new l13(1, ljq.K((f07)ltp2));
            ((l13)h07).r();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final mtp mtp = new mtp(eqi.O(ic7), atomicBoolean, (l13)h07);
            final jtp jtp = new jtp(mtp);
            final vhk vhk = new vhk(atomicBoolean, h07, (byte)21);
            try {
                final Uri a = nsp.a;
                mtp.execute((Runnable)new n68((Object)jtp, (Object)vhk, (Object)context, (byte)4));
            }
            catch (final Exception ex) {
                SilentException.a(new SilentException("startUpWebView threw", (Throwable)ex), lpl.w, (List)null, 6);
                A(atomicBoolean, (l13)h07);
            }
            final Object p2 = ((l13)h07).p();
            final pc7 v2 = pc7.v;
            if (p2 == v2) {
                return v2;
            }
        }
        return lqo.a;
    }
}
