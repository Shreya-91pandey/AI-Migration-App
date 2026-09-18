import android.content.Intent;
import com.anthropic.claude.tool.model.TimerCreateV0Input;
import android.content.SharedPreferences;
import android.content.Context;
import java.util.concurrent.Executor;
import java.time.Instant;

public final class def implements ne6, i1n, q8m, uqd, gv0, jv0, as2, gc7, by6, m55, vu6, rxo, hm7, t45
{
    public static final def A;
    public static final def B;
    public static volatile gfk C;
    public static final def D;
    public static final kep E;
    public static final def F;
    public static final def w;
    public static final def x;
    public static final def y;
    public static final def z;
    public final byte v;
    
    public def(final szn szn) {
        this.v = 26;
    }
    
    public byte[] a(final byte[] array, final int n, final int n2) {
        final byte[] array2 = new byte[n2];
        System.arraycopy((Object)array, n, (Object)array2, 0, n2);
        return array2;
    }
    
    public void b(final h1n h1n) {
        h1n.clear();
    }
    
    public hfc c() {
        final Instant now = Instant.now();
        now.getClass();
        return ien.L(now);
    }
    
    public float d() {
        return 0.0f;
    }
    
    public long e(long n, long n2) {
        if (Float.intBitsToFloat((int)(n >> 32)) <= Float.intBitsToFloat((int)(n2 >> 32)) && Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) <= Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL))) {
            n = Float.floatToRawIntBits(1.0f);
            n2 = Float.floatToRawIntBits(1.0f);
            final int a = bak.a;
            return n << 32 | (n2 & 0xFFFFFFFFL);
        }
        final float m = rml.m(n, n2);
        n = Float.floatToRawIntBits(m);
        n2 = Float.floatToRawIntBits(m);
        final int a2 = bak.a;
        return n << 32 | (n2 & 0xFFFFFFFFL);
    }
    
    public void f() {
    }
    
    public void g(final eu6 eu6) {
    }
    
    public void h(final xc8 xc8, final int n, final int[] array, final qzc qzc, final int[] array2) {
        if (qzc == qzc.v) {
            t08.Y(n, array, array2, false);
            return;
        }
        t08.Y(n, array, array2, true);
    }
    
    public boolean i(final Object o, final Object o2) {
        return false;
    }
    
    public void j() {
    }
    
    public Object k(final uy7 uy7) {
        switch (this.v) {
            default: {
                return new qt9(uy7.i((Class)eaf.class));
            }
            case 3: {
                final Object w = uy7.w(new bmi((Class)cpo.class, (Class)Executor.class));
                w.getClass();
                return eqi.W((Executor)w);
            }
        }
    }
    
    public void l(final fdo fdo) {
    }
    
    public fdo m() {
        return fdo.v;
    }
    
    public boolean n(final Object o, final Object o2) {
        return mlc.q(o, o2);
    }
    
    public void o() {
    }
    
    public void p(final eu6 eu6) {
    }
    
    public void q(igf v, float n, float n2, aql e, long d, final gva gva, final int n3) {
        gva.i0(-1364277227);
        final int n4 = n3 | 0x2496;
        float n6;
        if (gva.W(n4 & 0x1, (n4 & 0x2493) != 0x2492)) {
            gva.b0();
            if ((n3 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final float n5 = n;
                n = n2;
                n2 = n5;
            }
            else {
                e = (aql)((e8e)gva.j((sei)h8e.a)).c.e;
                d = s86.d(18, gva);
                v = (igf)fgf.v;
                n2 = 32.0f;
                n = 4.0f;
            }
            gva.r();
            final String d2 = twl.D(2131757444, gva);
            final int a = zul.a;
            final igf w = omo.W(v, 0.0f, 22.0f, 1);
            final boolean f = gva.f((Object)d2);
            final Object r = gva.R();
            Object o;
            if (f || (o = r) == bi6.a) {
                o = new y8(d2, (byte)22);
                gva.q0(o);
            }
            a6n.a(wsk.b((lta)o, w, false), e, d, 0L, 0.0f, 0.0f, null, (zta)uuj.t0(-1039573072, (aua)new ci2(n2, n), gva), gva, 12582912, 120);
            n6 = n2;
            n2 = n;
        }
        else {
            gva.Z();
            n6 = n;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new di2(this, v, n6, n2, e, d, n3);
        }
    }
    
    public void r(final xc8 xc8, final int n, final int[] array, final int[] array2) {
        t08.Y(n, array, array2, false);
    }
    
    public gfk s(final Context context) {
        final gfk c = def.C;
        if (c != null) {
            return c;
        }
        synchronized (this) {
            final gfk c2 = def.C;
            if (c2 != null) {
                return c2;
            }
            final Object c3 = new Object();
            final SharedPreferences sharedPreferences = context.getSharedPreferences("dd_prefs", 0);
            sharedPreferences.getClass();
            ((gfk)c3).v = sharedPreferences;
            return def.C = (gfk)c3;
        }
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 27: {
                final int hashCode = this.hashCode();
                lq6.u(16);
                final String string = Integer.toString(hashCode, 16);
                string.getClass();
                return lmf.t("CreationExtras.Key@", string, "<", v4j.a((Class)String.class).c(), ">");
            }
            case 24: {
                final int hashCode2 = this.hashCode();
                lq6.u(16);
                final String string2 = Integer.toString(hashCode2, 16);
                string2.getClass();
                return lmf.t("CreationExtras.Key@", string2, "<", v4j.a((Class)ycp.class).c(), ">");
            }
            case 13: {
                return "CompositionErrorContext";
            }
            case 11: {
                return "Arrangement#Center";
            }
            case 7: {
                return "StructuralEqualityPolicy";
            }
        }
    }
    
    public Object z(final Context context, final Object o, String b, final x4o x4o) {
        final TimerCreateV0Input timerCreateV0Input = (TimerCreateV0Input)o;
        final lz8 k = e2r.k(timerCreateV0Input);
        if (k != null) {
            final long v = k.v;
            b = timerCreateV0Input.b;
            final Intent intent = new Intent("android.intent.action.SET_TIMER");
            intent.setFlags(268435456);
            intent.putExtra("android.intent.extra.alarm.LENGTH", (int)lz8.u(v, pz8.z));
            intent.putExtra("android.intent.extra.alarm.MESSAGE", b);
            intent.putExtra("android.intent.extra.alarm.SKIP_UI", true);
            try {
                context.startActivity(intent);
                return sdr.t((Object)"Timer was set on Android device.");
            }
            finally {
                return sdr.j((Object)"Failed to set timer on device.");
            }
        }
        return sdr.j((Object)"Failed to set timer: duration_seconds must be at least 1.");
    }
}
