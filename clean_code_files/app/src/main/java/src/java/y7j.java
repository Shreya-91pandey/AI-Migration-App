import io.sentry.o7;
import java.util.Map;
import com.anthropic.claude.tool.model.EventCreateV0Input;
import android.graphics.Typeface;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.io.File;
import io.sentry.s1;
import io.sentry.i1;
import io.sentry.t7;
import io.sentry.k4;
import io.sentry.u7;
import io.sentry.util.l;
import io.sentry.v4;
import io.sentry.q1;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Intent;
import android.os.Build$VERSION;
import android.content.Context;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class y7j implements e70, fa9, gc7, hwn, ne6, vd8, by6, t45, h5n, p70, eca, ctf, o6g, psh
{
    public static final y7j A;
    public static final y7j B;
    public static final y7j C;
    public static final y7j D;
    public static final y7j E;
    public static final y7j w;
    public static final y7j x;
    public static final y7j y;
    public static final y7j z;
    public final byte v;
    
    public static void J(final List list, final List list2) {
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            final int intValue = ((Number)iterator.next()).intValue();
            final ArrayList list4 = new ArrayList(d86.p0((Iterable)list2, 10));
            final Iterator iterator2 = ((Iterable)list2).iterator();
            while (iterator2.hasNext()) {
                list4.add((Object)new c3q(intValue, ((Number)iterator2.next()).intValue()));
            }
            h86.t0((Collection)list3, (Iterable)list4);
        }
        c86.w1((Iterable)list3);
    }
    
    public static jdb L(final Context context) {
        final int m = M(context, "com.google.android.apps.healthdata");
        if (m == 1) {
            oyl.s("SDK version too low or running in a profile");
            return null;
        }
        if (m == 2) {
            en9.q("Service not available");
            return null;
        }
        if (Build$VERSION.SDK_INT >= 34) {
            return (jdb)new aeb(context);
        }
        return (jdb)new udb(context, "com.google.android.apps.healthdata");
    }
    
    public static int M(final Context context, final String package1) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (34 <= sdk_INT) {
            return mo2.d(context);
        }
        if (28 > sdk_INT || sdk_INT >= 34) {
            return 1;
        }
        final PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        try {
            final PackageInfo packageInfo = packageManager.getPackageInfo(package1, 0);
            packageInfo.getClass();
            final ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && (!package1.equals("com.google.android.apps.healthdata") || miq.j(packageInfo) >= 68623L)) {
                final Intent intent = new Intent();
                intent.setPackage(package1);
                intent.setAction("androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE");
                final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
                queryIntentServices.getClass();
                if (!((Collection)queryIntentServices).isEmpty()) {
                    return 3;
                }
            }
            return 2;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return 2;
        }
    }
    
    public static ir4 N(final String s) {
        final ir4 ir4 = new ir4(s);
        ((Map)ir4.d).put((Object)s, (Object)ir4);
        return ir4;
    }
    
    public static q1 P(final String s, final String s2, final q1 q1) {
        Object o = q1;
        if (q1 == null) {
            if (v4.d && l.a) {
                o = v4.f().q();
            }
            else {
                o = v4.f().d();
            }
        }
        if (o != null) {
            return ((q1)o).B(s, s2);
        }
        final u7 u7 = new u7();
        ((o7)u7).b = k4.ON;
        final i1 f = v4.f();
        f.getClass();
        final s1 u8 = f.u(new t7(s2, s), u7);
        u8.getClass();
        return (q1)u8;
    }
    
    @Override
    public String A() {
        return "";
    }
    
    @Override
    public Integer B() {
        return null;
    }
    
    @Override
    public i5n C(final xs9 xs9) {
        return (i5n)new xsa((Context)xs9.c, (String)xs9.d, (qd6)xs9.e, xs9.a, xs9.b);
    }
    
    @Override
    public File D() {
        return null;
    }
    
    @Override
    public Object E(final Object o) {
        final String s = (String)o;
        try {
            return UUID.fromString(s);
        }
        catch (final IllegalArgumentException ex) {
            return null;
        }
    }
    
    @Override
    public jh8 F() {
        return jh8.v;
    }
    
    public int G(final int n) {
        return n;
    }
    
    @Override
    public fc6 H() {
        return (fc6)new gwn(bhf.b());
    }
    
    @Override
    public btf I() {
        return new btf(0, (String)null, (Long)null, (Long)null, (Long)null, (Long)null, (String)null, 127);
    }
    
    public ir4 K(final String s) {
        monitorenter(this);
        while (true) {
            Label_0112: {
                try {
                    final LinkedHashMap d = ir4.d;
                    ir4 ir4;
                    if ((ir4 = (ir4)d.get((Object)s)) != null) {
                        break Label_0122;
                    }
                    String s2;
                    if (rym.E0(s, "TLS_", false)) {
                        s2 = "SSL_".concat(s.substring(4));
                    }
                    else if (rym.E0(s, "SSL_", false)) {
                        s2 = "TLS_".concat(s.substring(4));
                    }
                    else {
                        s2 = s;
                    }
                    if ((ir4 = (ir4)d.get((Object)s2)) == null) {
                        ir4 = new ir4(s);
                    }
                    break Label_0112;
                }
                finally {
                    monitorexit(this);
                    monitorexit(this);
                    return;
                    final LinkedHashMap d;
                    ((Map)d).put((Object)s, (Object)ir4);
                    continue;
                }
            }
            break;
        }
    }
    
    public void O(final String s) {
        Collections.singletonMap((Object)"track", (Object)s).getClass();
    }
    
    @Override
    public fc6 a() {
        return (fc6)new gwn(bhf.b());
    }
    
    @Override
    public void b(final Context context) {
    }
    
    @Override
    public File c() {
        return null;
    }
    
    @Override
    public Integer d() {
        return null;
    }
    
    @Override
    public long e(long n, long n2) {
        final float n3 = Float.intBitsToFloat((int)(n2 >> 32)) / Float.intBitsToFloat((int)(n >> 32));
        final float n4 = Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)) / Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        n = Float.floatToRawIntBits(n3);
        n2 = Float.floatToRawIntBits(n4);
        final int a = bak.a;
        return n << 32 | (n2 & 0xFFFFFFFFL);
    }
    
    @Override
    public int f() {
        return 0;
    }
    
    @Override
    public String g() {
        return "";
    }
    
    public void h(final int n, final Object o) {
        String s = null;
        switch (n) {
            default: {
                s = "";
                break;
            }
            case 11: {
                s = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            }
            case 10: {
                s = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            }
            case 8: {
                s = "RESULT_PARSE_EXCEPTION";
                break;
            }
            case 7: {
                s = "RESULT_IO_EXCEPTION";
                break;
            }
            case 6: {
                s = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            }
            case 5: {
                s = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            }
            case 4: {
                s = "RESULT_NOT_WRITABLE";
                break;
            }
            case 3: {
                s = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            }
            case 2: {
                s = "RESULT_ALREADY_INSTALLED";
                break;
            }
            case 1: {
                s = "RESULT_INSTALL_SUCCESS";
                break;
            }
        }
        if (n != 6 && n != 7 && n != 8) {
            return;
        }
        Log.e("ProfileInstaller", s, (Throwable)o);
    }
    
    @Override
    public List i() {
        return (List)r89.v;
    }
    
    @Override
    public Typeface j(final Context context, final f70 f70) {
        a40 a40;
        if (f70 instanceof a40) {
            a40 = (a40)f70;
        }
        else {
            a40 = null;
        }
        if (a40 != null) {
            if (!a40.e && a40.f == null) {
                a40.f = a40.c(context);
            }
            a40.e = true;
            return a40.f;
        }
        return null;
    }
    
    @Override
    public Object k(final uy7 uy7) {
        switch (this.v) {
            default: {
                return new jsl((Context)uy7.d((Class)Context.class));
            }
            case 9: {
                return new mon();
            }
        }
    }
    
    @Override
    public String l() {
        return "";
    }
    
    @Override
    public String m() {
        return "";
    }
    
    public int n(final int n) {
        return n;
    }
    
    @Override
    public String o() {
        return "";
    }
    
    @Override
    public String p() {
        return "";
    }
    
    @Override
    public void q(final ft7 ft7) {
    }
    
    @Override
    public File r(final File file) {
        return null;
    }
    
    @Override
    public String s() {
        return "";
    }
    
    @Override
    public String t() {
        return "";
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 8: {
                final int w = bhf.w;
                return "TimeSource(System.nanoTime())";
            }
        }
    }
    
    @Override
    public void u(final ft7 ft7) {
    }
    
    @Override
    public String v() {
        return "";
    }
    
    @Override
    public Boolean w() {
        return null;
    }
    
    @Override
    public String x() {
        return "";
    }
    
    @Override
    public void y(final Context context) {
    }
    
    @Override
    public Object z(final Context context, final Object o, final String s, final x4o x4o) {
        final EventCreateV0Input eventCreateV0Input = (EventCreateV0Input)o;
        return sdr.t((Object)"Event creation template has been created.");
    }
}
