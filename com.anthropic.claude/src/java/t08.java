import java.util.Collection;
import java.util.ArrayList;
import android.os.Process;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import io.sentry.c2;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.DispatchException;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.app.NotificationManager;
import android.text.TextUtils;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.Handler;
import android.os.Build$VERSION;
import java.util.concurrent.Executor;
import android.content.res.ColorStateList;
import android.content.Context;
import java.util.regex.Matcher;
import java.io.OutputStream;
import java.io.InputStream;
import kotlinx.serialization.KSerializer;
import android.graphics.PorterDuff$Mode;
import android.net.Uri;
import android.content.res.Resources;
import androidx.core.graphics.drawable.IconCompat;
import android.graphics.drawable.Icon;

public abstract class t08
{
    public static final fv0 a;
    public static final fv0 b;
    public static final ev0 c;
    public static final ev0 d;
    public static final def e;
    public static final awp f;
    public static final eup g;
    public static final v3d[] h;
    public static final n9k i;
    public static final byte[] j;
    
    public static IconCompat A(final Icon b) {
        b.getClass();
        final int p = P(b);
        if (p == 2) {
            return IconCompat.d((Resources)null, O(b), N(b));
        }
        if (p == 4) {
            final Uri q = Q(b);
            final PorterDuff$Mode k = IconCompat.k;
            q.getClass();
            final String string = q.toString();
            string.getClass();
            final IconCompat iconCompat = new IconCompat(4);
            iconCompat.b = string;
            return iconCompat;
        }
        if (p != 6) {
            final IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.b = b;
            return iconCompat2;
        }
        final Uri q2 = Q(b);
        final PorterDuff$Mode i = IconCompat.k;
        q2.getClass();
        final String string2 = q2.toString();
        string2.getClass();
        final IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.b = string2;
        return iconCompat3;
    }
    
    public static final Object C(final jqc jqc, final KSerializer kSerializer, InputStream inputStream) {
        final jy7 jy7 = new jy7(inputStream);
        inputStream = (InputStream)jy7.w;
        try {
            return lq6.E(jqc, kSerializer, (mjc)jy7);
        }
        finally {
            final hr2 c = hr2.c;
            final byte[] array = ((ti3)inputStream).c.array();
            array.getClass();
            ((jr2)c).a(array);
        }
    }
    
    public static final void D(final tze tze, final String s, final lta lta) {
        tze.i((lta)new e4((Object)lta, (Object)s, (byte)29));
    }
    
    public static final igf E(final igf igf, final lta lta) {
        return igf.E((igf)new xv8(lta));
    }
    
    public static final igf F(final igf igf, final lta lta) {
        return igf.E((igf)new fw8(lta));
    }
    
    public static final igf G(final igf igf, final lta lta) {
        return igf.E((igf)new gw8(lta));
    }
    
    public static final void H(final jqc jqc, final KSerializer kSerializer, final Object o, OutputStream outputStream) {
        outputStream = (OutputStream)new z48(outputStream);
        final byte[] array = (byte[])((z48)outputStream).y;
        try {
            lq6.G(jqc, (ojc)outputStream, kSerializer, o);
        }
        finally {
            ((z48)outputStream).g();
            ((jr2)yh3.c).b((char[])((z48)outputStream).z);
            ((jr2)ir2.c).a(array);
        }
    }
    
    public static final c8e I(final Matcher matcher, final int n, final CharSequence charSequence) {
        if (!matcher.find(n)) {
            return null;
        }
        return new c8e(matcher, charSequence);
    }
    
    public static qbp J(final zrc zrc) {
        Label_0112: {
            Label_0103: {
                Label_0094: {
                    String i = null;
                    String j = null;
                    String k = null;
                    Label_0054: {
                        try {
                            i = zrc.o("name").i();
                            j = zrc.o("version").i();
                            final irc o = zrc.o("build");
                            if (o != null) {
                                k = o.i();
                                break Label_0054;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0094;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0103;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0112;
                        }
                        k = null;
                    }
                    final String l = zrc.o("version_major").i();
                    i.getClass();
                    j.getClass();
                    l.getClass();
                    return new qbp(i, j, k, l);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Os", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Os", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Os", (Throwable)ex3);
        return null;
    }
    
    public static ColorStateList K(final Context context, final int n) {
        return jnj.a(context.getResources(), n, context.getTheme());
    }
    
    public static final String L(final Object o) {
        return Integer.toHexString(System.identityHashCode(o));
    }
    
    public static Executor M(final Context context) {
        if (Build$VERSION.SDK_INT >= 28) {
            return ai0.j(context);
        }
        return (Executor)new n80(new Handler(context.getMainLooper()));
    }
    
    public static int N(final Object o) {
        if (Build$VERSION.SDK_INT >= 28) {
            return ai0.k(o);
        }
        Label_0076: {
            Label_0063: {
                try {
                    return (int)o.getClass().getMethod("getResId", (Class<?>[])null).invoke(o, (Object[])null);
                }
                catch (final NoSuchMethodException ex) {}
                catch (final InvocationTargetException ex2) {
                    break Label_0063;
                }
                catch (final IllegalAccessException ex3) {
                    break Label_0076;
                }
                final NoSuchMethodException ex;
                Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex);
                return 0;
            }
            final InvocationTargetException ex2;
            Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex2);
            return 0;
        }
        final IllegalAccessException ex3;
        Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex3);
        return 0;
    }
    
    public static String O(final Object o) {
        if (Build$VERSION.SDK_INT >= 28) {
            return ai0.l(o);
        }
        Label_0073: {
            Label_0060: {
                try {
                    return (String)o.getClass().getMethod("getResPackage", (Class<?>[])null).invoke(o, (Object[])null);
                }
                catch (final NoSuchMethodException ex) {}
                catch (final InvocationTargetException ex2) {
                    break Label_0060;
                }
                catch (final IllegalAccessException ex3) {
                    break Label_0073;
                }
                final NoSuchMethodException ex;
                Log.e("IconCompat", "Unable to get icon package", (Throwable)ex);
                return null;
            }
            final InvocationTargetException ex2;
            Log.e("IconCompat", "Unable to get icon package", (Throwable)ex2);
            return null;
        }
        final IllegalAccessException ex3;
        Log.e("IconCompat", "Unable to get icon package", (Throwable)ex3);
        return null;
    }
    
    public static int P(final Object o) {
        if (Build$VERSION.SDK_INT >= 28) {
            return ai0.p(o);
        }
        Label_0112: {
            Label_0081: {
                try {
                    return (int)o.getClass().getMethod("getType", (Class<?>[])null).invoke(o, (Object[])null);
                }
                catch (final NoSuchMethodException ex) {}
                catch (final InvocationTargetException ex2) {
                    break Label_0081;
                }
                catch (final IllegalAccessException ex3) {
                    break Label_0112;
                }
                final StringBuilder sb = new StringBuilder("Unable to get icon type ");
                sb.append(o);
                final NoSuchMethodException ex;
                Log.e("IconCompat", sb.toString(), (Throwable)ex);
                return -1;
            }
            final StringBuilder sb2 = new StringBuilder("Unable to get icon type ");
            sb2.append(o);
            final InvocationTargetException ex2;
            Log.e("IconCompat", sb2.toString(), (Throwable)ex2);
            return -1;
        }
        final StringBuilder sb3 = new StringBuilder("Unable to get icon type ");
        sb3.append(o);
        final IllegalAccessException ex3;
        Log.e("IconCompat", sb3.toString(), (Throwable)ex3);
        return -1;
    }
    
    public static Uri Q(final Object o) {
        if (Build$VERSION.SDK_INT >= 28) {
            return ai0.q(o);
        }
        Label_0073: {
            Label_0060: {
                try {
                    return (Uri)o.getClass().getMethod("getUri", (Class<?>[])null).invoke(o, (Object[])null);
                }
                catch (final NoSuchMethodException ex) {}
                catch (final InvocationTargetException ex2) {
                    break Label_0060;
                }
                catch (final IllegalAccessException ex3) {
                    break Label_0073;
                }
                final NoSuchMethodException ex;
                Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex);
                return null;
            }
            final InvocationTargetException ex2;
            Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex2);
            return null;
        }
        final IllegalAccessException ex3;
        Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex3);
        return null;
    }
    
    public static final void R(final String s) {
        if (s.length() > 0) {
            for (int length = s.length(), i = 0; i < length; ++i) {
                final char char1 = s.charAt(i);
                if ('!' > char1 || char1 >= '\u007f') {
                    final StringBuilder sb = new StringBuilder("Unexpected char 0x");
                    lq6.u(16);
                    final String string = Integer.toString((int)char1, 16);
                    string.getClass();
                    String concat = string;
                    if (string.length() < 2) {
                        concat = "0".concat(string);
                    }
                    gcp.f(sb, concat, " at ", i, " in header name: ");
                    sb.append(s);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            return;
        }
        en9.s("name is empty");
    }
    
    public static final void S(String concat, final String s) {
        for (int length = concat.length(), i = 0; i < length; ++i) {
            final char char1 = concat.charAt(i);
            if (char1 != '\t' && (' ' > char1 || char1 >= '\u007f')) {
                final StringBuilder sb = new StringBuilder("Unexpected char 0x");
                lq6.u(16);
                final String string = Integer.toString((int)char1, 16);
                string.getClass();
                String concat2 = string;
                if (string.length() < 2) {
                    concat2 = "0".concat(string);
                }
                gcp.f(sb, concat2, " at ", i, " in ");
                sb.append(s);
                sb.append(" value");
                if (gcq.k(s)) {
                    concat = "";
                }
                else {
                    concat = ": ".concat(concat);
                }
                sb.append(concat);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
    
    public static final boolean U(final lvj lvj) {
        final long e = lvj.e;
        return e >>> 32 == (0xFFFFFFFFL & e) && e == lvj.f && e == lvj.g && e == lvj.h;
    }
    
    public static final long V(float n, long a, final long n2) {
        final s7g x = x86.x;
        final long a2 = j86.a(a, (u86)x);
        a = j86.a(n2, (u86)x);
        final float c = j86.c(a2);
        final float g = j86.g(a2);
        final float f = j86.f(a2);
        final float d = j86.d(a2);
        final float c2 = j86.c(a);
        final float g2 = j86.g(a);
        final float f2 = j86.f(a);
        final float d2 = j86.d(a);
        float n3 = n;
        if (n < 0.0f) {
            n3 = 0.0f;
        }
        n = n3;
        if (n3 > 1.0f) {
            n = 1.0f;
        }
        return j86.a(q(vt4.T(g, g2, n), vt4.T(f, f2, n), vt4.T(d, d2, n), vt4.T(c, c2, n), (u86)x), j86.e(n2));
    }
    
    public static final float W(final long n) {
        final u86 e = j86.e(n);
        if (!rhc.p(e.b, 12884901888L)) {
            fac.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(rhc.d0(e.b)));
        }
        final urj p = ((yrj)e).p;
        float n2;
        if ((n2 = (float)(p.b((double)j86.d(n)) * 0.0722 + (p.b((double)j86.f(n)) * 0.7152 + p.b((double)j86.g(n)) * 0.2126))) < 0.0f) {
            n2 = 0.0f;
        }
        if (n2 > 1.0f) {
            return 1.0f;
        }
        return n2;
    }
    
    public static void X(final x13 x13, final omn omn) {
        final vjf b = omn.b;
        final boolean e = omn.e();
        final nmn a = omn.a;
        final boolean b2 = e && a.f != 3;
        if (b2) {
            final long c = omn.c;
            final float a2 = (float)(int)(c >> 32);
            final k2j f = rml.f(0L, ((long)Float.floatToRawIntBits((float)(int)(c & 0xFFFFFFFFL)) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(a2) << 32);
            x13.g();
            x13.q(x13, f);
        }
        final hcm a3 = a.b.a;
        final wgn m = a3.m;
        final oln a4 = a3.a;
        wgn b3;
        if ((b3 = m) == null) {
            b3 = wgn.b;
        }
        rpl rpl;
        if ((rpl = a3.n) == null) {
            rpl = rpl.d;
        }
        Object o;
        if ((o = a3.p) == null) {
            o = gea.a;
        }
        try {
            final qm2 c2 = a4.c();
            final nln a5 = nln.a;
            Label_0300: {
                if (c2 != null) {
                    while (true) {
                        Label_0232: {
                            if (a4 == a5) {
                                break Label_0232;
                            }
                            Label_0237: {
                                try {
                                    final float a2 = a4.a();
                                    break Label_0237;
                                }
                                finally {}
                                break Label_0232;
                                try {
                                    final float a2;
                                    final wgn wgn;
                                    z8r.g(b, x13, c2, a2, rpl, wgn, (dw8)o);
                                    break Label_0300;
                                }
                                finally {}
                            }
                        }
                        final float a2 = 1.0f;
                        continue;
                    }
                }
                if (a4 != a5) {
                    final long n = a4.b();
                }
                else {
                    final long n = j86.b;
                }
                Label_0285: {
                    break Label_0285;
                    try {
                        final long n;
                        vjf.i(b, x13, n, rpl, b3, (dw8)o, 32);
                        if (b2) {
                            x13.p();
                        }
                        return;
                    }
                    finally {}
                }
            }
        }
        finally {}
        if (b2) {
            x13.p();
        }
    }
    
    public static void Y(int i, final int[] array, final int[] array2, final boolean b) {
        final int length = array.length;
        final int n = 0;
        int j = 0;
        int n2 = 0;
        while (j < length) {
            n2 += array[j];
            ++j;
        }
        float n3 = (i - n2) / 2.0f;
        if (!b) {
            int length2;
            int n4;
            int n5;
            for (length2 = array.length, n4 = 0, i = n; i < length2; ++i, ++n4) {
                n5 = array[i];
                array2[n4] = Math.round(n3);
                n3 += n5;
            }
        }
        else {
            int n6;
            for (i = array.length - 1; -1 < i; --i) {
                n6 = array[i];
                array2[i] = Math.round(n3);
                n3 += n6;
            }
        }
    }
    
    public static void Z(int n, final int[] array, final int[] array2, final boolean b) {
        if (array.length != 0) {
            final int length = array.length;
            final int n2 = 0;
            int i = 0;
            int n3 = 0;
            while (i < length) {
                n3 += array[i];
                ++i;
            }
            final float n4 = (n - n3) / (float)Math.max(array.length - 1, 1);
            float n5;
            if (b && array.length == 1) {
                n5 = n4;
            }
            else {
                n5 = 0.0f;
            }
            if (!b) {
                final int length2 = array.length;
                n = 0;
                for (int j = n2; j < length2; ++j, ++n) {
                    final int n6 = array[j];
                    array2[n] = Math.round(n5);
                    n5 += n6 + n4;
                }
            }
            else {
                int n7;
                for (n = array.length - 1; -1 < n; --n) {
                    n7 = array[n];
                    array2[n] = Math.round(n5);
                    n5 += n7 + n4;
                }
            }
        }
    }
    
    public static final void a(final tze tze, final v4a v4a, final gva gva, final int n) {
        gva.i0(1196134678);
        int n2;
        if (gva.f((Object)tze)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)v4a)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        boolean b = false;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final d4j e = k8e.E((Object)0.0f, gva);
            if ((n4 & 0xE) == 0x4) {
                b = true;
            }
            final boolean h = gva.h((Object)e);
            final boolean h2 = gva.h((Object)v4a);
            Object r = gva.R();
            if ((h | b | h2) || r == bi6.a) {
                r = new djh((Object)tze, (Object)v4a, (Object)e, (f07)null, (byte)0);
                gva.q0(r);
            }
            mlc.f((zta)r, gva, (Object)tze);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new txf((Object)tze, (Object)v4a, n, (byte)4);
        }
    }
    
    public static void a0(int n, final int[] array, final int[] array2, final boolean b) {
        final int length = array.length;
        final int n2 = 0;
        int i = 0;
        int n3 = 0;
        while (i < length) {
            n3 += array[i];
            ++i;
        }
        final float n4 = (n - n3) / (float)(array.length + 1);
        if (!b) {
            final int length2 = array.length;
            float n5 = n4;
            n = 0;
            for (int j = n2; j < length2; ++j, ++n) {
                final int n6 = array[j];
                array2[n] = Math.round(n5);
                n5 += n6 + n4;
            }
        }
        else {
            n = array.length - 1;
            float n7 = n4;
            while (-1 < n) {
                final int n8 = array[n];
                array2[n] = Math.round(n7);
                n7 += n8 + n4;
                --n;
            }
        }
    }
    
    public static final long b(float n, float a, final float n2, float n3, final u86 u86) {
        final boolean c = u86.c();
        float n4 = 1.0f;
        final float n5 = 0.0f;
        final float n6 = 0.0f;
        if (c) {
            if (n3 < 0.0f) {
                n3 = 0.0f;
            }
            float n7 = n3;
            if (n3 > 1.0f) {
                n7 = 1.0f;
            }
            final int n8 = (int)(n7 * 255.0f + 0.5f);
            if (n < 0.0f) {
                n = 0.0f;
            }
            n3 = n;
            if (n > 1.0f) {
                n3 = 1.0f;
            }
            final int n9 = (int)(n3 * 255.0f + 0.5f);
            if (a < 0.0f) {
                n = 0.0f;
            }
            else {
                n = a;
            }
            a = n;
            if (n > 1.0f) {
                a = 1.0f;
            }
            final int n10 = (int)(a * 255.0f + 0.5f);
            if (n2 < 0.0f) {
                n = n6;
            }
            else {
                n = n2;
            }
            if (n > 1.0f) {
                n = n4;
            }
            final long n11 = n8 << 24 | n9 << 16 | n10 << 8 | (int)(n * 255.0f + 0.5f);
            final int i = j86.i;
            return n11 << 32;
        }
        final int c2 = u86.c;
        if (c2 == -1) {
            fac.a("Unknown color space, please use a color space in ColorSpaces");
        }
        final int n12 = 0;
        final int n13 = 0;
        final float b = u86.b(0);
        final float a2 = u86.a(0);
        if (n < b) {
            n = b;
        }
        if (n > a2) {
            n = a2;
        }
        final int floatToRawIntBits = Float.floatToRawIntBits(n);
        final int n14 = floatToRawIntBits >>> 31;
        int n15 = floatToRawIntBits >>> 23 & 0xFF;
        final int n16 = floatToRawIntBits & 0x7FFFFF;
        while (true) {
            int n17 = 0;
            Label_0456: {
                if (n15 == 255) {
                    if (n16 != 0) {
                        n17 = 512;
                    }
                    else {
                        n17 = 0;
                    }
                    n15 = 31;
                    break Label_0456;
                }
                n15 -= 112;
                if (n15 >= 31) {
                    n17 = 0;
                    n15 = 49;
                    break Label_0456;
                }
                int n20;
                if (n15 <= 0) {
                    if (n15 >= -10) {
                        int n19;
                        final int n18 = n19 = (n16 | 0x800000) >> 1 - n15;
                        if ((n18 & 0x1000) != 0x0) {
                            n19 = n18 + 8192;
                        }
                        n17 = n19 >> 13;
                        n15 = 0;
                        break Label_0456;
                    }
                    n17 = 0;
                    n15 = 0;
                    break Label_0456;
                }
                else {
                    n17 = n16 >> 13;
                    if ((floatToRawIntBits & 0x1000) == 0x0) {
                        break Label_0456;
                    }
                    n20 = ((n15 << 10 | n17) + 1 | n14 << 15);
                }
                final short n21 = (short)n20;
                n = u86.b(1);
                final float a3 = u86.a(1);
                if (a >= n) {
                    n = a;
                }
                if (n > a3) {
                    n = a3;
                }
                final int floatToRawIntBits2 = Float.floatToRawIntBits(n);
                final int n22 = floatToRawIntBits2 >>> 31;
                int n23 = floatToRawIntBits2 >>> 23 & 0xFF;
                final int n24 = floatToRawIntBits2 & 0x7FFFFF;
                while (true) {
                    int n25 = 0;
                    Label_0707: {
                        if (n23 == 255) {
                            if (n24 != 0) {
                                n25 = 512;
                            }
                            else {
                                n25 = 0;
                            }
                            n23 = 31;
                            break Label_0707;
                        }
                        n23 -= 112;
                        if (n23 >= 31) {
                            n25 = 0;
                            n23 = 49;
                            break Label_0707;
                        }
                        int n28;
                        if (n23 <= 0) {
                            if (n23 >= -10) {
                                int n27;
                                final int n26 = n27 = (n24 | 0x800000) >> 1 - n23;
                                if ((n26 & 0x1000) != 0x0) {
                                    n27 = n26 + 8192;
                                }
                                n25 = n27 >> 13;
                                n23 = 0;
                                break Label_0707;
                            }
                            n25 = 0;
                            n23 = 0;
                            break Label_0707;
                        }
                        else {
                            n25 = n24 >> 13;
                            if ((floatToRawIntBits2 & 0x1000) == 0x0) {
                                break Label_0707;
                            }
                            n28 = ((n23 << 10 | n25) + 1 | n22 << 15);
                        }
                        final short n29 = (short)n28;
                        n = u86.b(2);
                        a = u86.a(2);
                        if (n2 >= n) {
                            n = n2;
                        }
                        if (n > a) {
                            n = a;
                        }
                        final int floatToRawIntBits3 = Float.floatToRawIntBits(n);
                        final int n30 = floatToRawIntBits3 >>> 31;
                        final int n31 = floatToRawIntBits3 >>> 23 & 0xFF;
                        final int n32 = 0x7FFFFF & floatToRawIntBits3;
                        while (true) {
                            int n33 = 0;
                            int n34 = 0;
                            Label_0959: {
                                if (n31 == 255) {
                                    n33 = n13;
                                    if (n32 != 0) {
                                        n33 = 512;
                                    }
                                    n34 = 31;
                                    break Label_0959;
                                }
                                n34 = n31 - 112;
                                if (n34 >= 31) {
                                    n33 = 0;
                                    n34 = 49;
                                    break Label_0959;
                                }
                                int n37;
                                if (n34 <= 0) {
                                    if (n34 >= -10) {
                                        int n36;
                                        final int n35 = n36 = (n32 | 0x800000) >> 1 - n34;
                                        if ((n35 & 0x1000) != 0x0) {
                                            n36 = n35 + 8192;
                                        }
                                        n33 = n36 >> 13;
                                        n34 = n12;
                                        break Label_0959;
                                    }
                                    n33 = 0;
                                    n34 = n12;
                                    break Label_0959;
                                }
                                else {
                                    n33 = n32 >> 13;
                                    if ((floatToRawIntBits3 & 0x1000) == 0x0) {
                                        break Label_0959;
                                    }
                                    n37 = ((n34 << 10 | n33) + 1 | n30 << 15);
                                }
                                final short n38 = (short)n37;
                                if (n3 < 0.0f) {
                                    n = n5;
                                }
                                else {
                                    n = n3;
                                }
                                if (n <= 1.0f) {
                                    n4 = n;
                                }
                                final int n39 = (int)(n4 * 1023.0f + 0.5f);
                                final long n40 = n21;
                                final long n41 = n29;
                                final long n42 = n38;
                                final long n43 = n39;
                                final long n44 = c2;
                                final int j = j86.i;
                                return (n44 & 0x3FL) | ((n40 & 0xFFFFL) << 48 | (n41 & 0xFFFFL) << 32 | (0xFFFFL & n42) << 16 | (n43 & 0x3FFL) << 6);
                            }
                            int n37 = n33 | (n30 << 15 | n34 << 10);
                            continue;
                        }
                    }
                    int n28 = n25 | (n22 << 15 | n23 << 10);
                    continue;
                }
            }
            int n20 = n17 | (n14 << 15 | n15 << 10);
            continue;
        }
    }
    
    public static final mj0 b0(final mj0 mj0, final jqc jqc) {
        mj0.b();
        final oig h = mj0.h;
        if (h != null) {
            if (h instanceof mig) {
                final mig mig = (mig)h;
                try {
                    final Object o = new Object();
                    lq6.G(jqc, (ojc)new r70(o, (byte)28), mig.b, mig.a);
                    return new mj0(mj0.a, mj0.b, mj0.c, mj0.d, mj0.e, mj0.f, mj0.g, (oig)new lig(((an2)o).u(((an2)o).w)));
                }
                catch (final Exception ex) {
                    final String e = t4r.e((Throwable)ex);
                    final StringBuilder sb = new StringBuilder("Body of ");
                    sb.append((Object)mj0);
                    sb.append(" failed to encode (");
                    sb.append(e);
                    sb.append(")");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (!(h instanceof lig)) {
                if (!(h instanceof nig)) {
                    en9.r();
                    return null;
                }
            }
        }
        return mj0;
    }
    
    public static final long c(int i) {
        final long n = i;
        i = j86.i;
        return n << 32;
    }
    
    public static Intent c0(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final String s, final int n) {
        final int n2 = n & 0x2;
        if (n2 == 0 && (n & 0x4) == 0x0) {
            en9.s("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (n2 != 0 && (n & 0x4) != 0x0) {
            en9.s("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (Build$VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, s, (Handler)null, n);
        }
        return p1r.o(context, broadcastReceiver, intentFilter, s, n);
    }
    
    public static final long d(final int n, final int n2, final int n3, final int n4) {
        return c((n & 0xFF) << 16 | (n4 & 0xFF) << 24 | (n2 & 0xFF) << 8 | (n3 & 0xFF));
    }
    
    public static final x37 d0(final jta jta, final lta lta, final jta jta2, final gva gva) {
        final odk a = ii8.a(gva);
        final boolean f = gva.f((Object)null);
        final boolean f2 = gva.f((Object)a);
        final Object r = gva.R();
        final cib a2 = bi6.a;
        Object o;
        if ((f | f2) || (o = r) == a2) {
            o = a.d((Class)st4.class, (emi)null);
            gva.q0(o);
        }
        final st4 st4 = (st4)o;
        final odk a3 = ii8.a(gva);
        final boolean f3 = gva.f((Object)null);
        final boolean f4 = gva.f((Object)a3);
        final Object r2 = gva.R();
        Object o2;
        if ((f3 | f4) || (o2 = r2) == a2) {
            o2 = a3.d((Class)stb.class, (emi)null);
            gva.q0(o2);
        }
        final stb stb = (stb)o2;
        final odk a4 = ii8.a(gva);
        final boolean f5 = gva.f((Object)null);
        final boolean f6 = gva.f((Object)a4);
        final Object r3 = gva.R();
        Object o3;
        if ((f5 | f6) || (o3 = r3) == a2) {
            o3 = a4.d((Class)ttb.class, (emi)null);
            gva.q0(o3);
        }
        final ttb ttb = (ttb)o3;
        Object r4;
        if ((r4 = gva.R()) == a2) {
            r4 = new cm6((byte)16);
            gva.q0(r4);
        }
        final bnf bnf = (bnf)mlc.a0(new Object[0], (jta)r4, gva, 48);
        final bnf w = o50.W((Object)jta, gva);
        final bnf w2 = o50.W((Object)lta, gva);
        final bnf w3 = o50.W((Object)jta2, gva);
        final boolean f7 = gva.f((Object)st4);
        final boolean f8 = gva.f((Object)stb);
        final boolean f9 = gva.f((Object)ttb);
        final boolean f10 = gva.f((Object)bnf);
        final Object r5 = gva.R();
        x37 x37;
        if ((f7 | f8 | f9 | f10) || (x37 = (x37)r5) == a2) {
            x37 = new x37(st4, stb, ttb, new ny1(w3, (byte)6), new ny1(w, (byte)7), new jy1(w2, (byte)5), bnf);
            gva.q0((Object)x37);
        }
        return x37;
    }
    
    public static final long e(final long n) {
        final int i = j86.i;
        return n << 32;
    }
    
    public static final avl e0(final xvl xvl, jta jta, final jta jta2, final oc7 oc7, final jta jta3, final jta jta4, final gva gva, final int n, int n2) {
        xvl d;
        if ((n2 & 0x1) != 0x0) {
            d = uul.d;
        }
        else {
            d = xvl;
        }
        if ((n2 & 0x2) != 0x0) {
            jta = null;
        }
        jta jta5;
        if ((n2 & 0x4) != 0x0) {
            jta5 = null;
        }
        else {
            jta5 = jta2;
        }
        final cib a = bi6.a;
        oc7 oc8;
        if ((n2 & 0x8) != 0x0) {
            Object o;
            if ((o = gva.R()) == a) {
                o = mlc.z((hc7)o89.v, gva);
                gva.q0(o);
            }
            oc8 = (oc7)o;
        }
        else {
            oc8 = oc7;
        }
        Object o2;
        if ((n2 & 0x10) != 0x0) {
            o2 = null;
        }
        else {
            o2 = jta3;
        }
        ilc ilc;
        if (d.a()) {
            gva.g0(1686346216);
            Object r;
            if ((r = gva.R()) == a) {
                r = new Object();
                gva.q0(r);
            }
            ilc = (ilc)r;
            gva.q(false);
        }
        else {
            gva.g0(1686384004);
            gva.q(false);
            ilc = null;
        }
        final int n3 = 1;
        if ((((n & 0x70) ^ 0x30) > 32 && gva.f((Object)jta)) || (n & 0x30) == 0x20) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final boolean b = (((n & 0x380) ^ 0x180) > 256 && gva.f((Object)jta5)) || (n & 0x180) == 0x100;
        final Object r2 = gva.R();
        Object o3;
        if ((n2 | (b ? 1 : 0)) != 0x0 || (o3 = r2) == a) {
            o3 = new d9c(jta, jta5, (byte)5);
            gva.q0(o3);
        }
        final jta jta6 = (jta)o3;
        n2 = ((n & 0xE) | 0x40);
        final boolean b2 = ri2.b0(gva);
        final boolean b3 = (d != xvl.v && d != xvl.w) || b2;
        final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
        float c;
        if (d == xvl.x) {
            c = uul.c;
        }
        else {
            c = Float.NaN;
        }
        final boolean f = gva.f((Object)xc8);
        final boolean c2 = gva.c(c);
        final Object r3 = gva.R();
        Float value;
        if ((f | c2) || (value = (Float)r3) == a) {
            if (qs8.e(c, Float.NaN)) {
                value = null;
            }
            else {
                value = xc8.w0(c);
            }
            gva.q0((Object)value);
        }
        final Float n4 = value;
        final Object o4 = new Object();
        final bnf w = o50.W((Object)jta6, gva);
        final bnf w2 = o50.W((Object)b2, gva);
        gva.d0(-1182523210, (Object)b3);
        if ((((n2 & 0xE) ^ 0x6) > 4 && gva.d(((Enum)d).ordinal())) || (n2 & 0x6) == 0x4) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final Object r4 = gva.R();
        Object o5;
        if (n2 != 0 || (o5 = r4) == a) {
            o5 = new qe(o4, (Object)ilc, (Object)n4, w2, (Object)w, (byte)4);
            gva.q0(o5);
        }
        final zvl w3 = r6k.W(b3, (lta)o5, gva, 0, 0);
        gva.q(false);
        if ((((b4j)o4).v = w3) != null) {
            boolean b4;
            if (jta != null) {
                b4 = true;
            }
            else {
                b4 = false;
            }
            final bnf w4 = o50.W((Object)jta4, gva);
            final bnf w5 = o50.W(o2, gva);
            final boolean f2 = gva.f((Object)w3);
            final boolean g = gva.g(b4);
            Label_0766: {
                if (((n & 0x1C00) ^ 0xC00) > 2048) {
                    n2 = n3;
                    if (gva.f((Object)oc8)) {
                        break Label_0766;
                    }
                }
                if ((n & 0xC00) == 0x800) {
                    n2 = n3;
                }
                else {
                    n2 = 0;
                }
            }
            final Object r5 = gva.R();
            avl avl;
            if ((((f2 | g) ? 1 : 0) | n2) != 0x0 || (avl = (avl)r5) == a) {
                avl = new avl(w3, d, b4, ilc, oc8, new swk(w4, (byte)18), new swk(w5, (byte)19));
                gva.q0((Object)avl);
            }
            return avl;
        }
        mlc.j0("sheetState");
        throw null;
    }
    
    public static final void f(final rad rad, gbd gbd, final jta jta, final gva gva, final int n) {
        gva.i0(-709389590);
        int n2;
        if (gva.h((Object)jta)) {
            n2 = 256;
        }
        else {
            n2 = 128;
        }
        final int n3 = n | 0x10 | n2;
        if (gva.W(n3 & 0x1, (n3 & 0x93) != 0x92)) {
            gva.b0();
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                gbd = (gbd)gva.j((sei)uod.a);
            }
            gva.r();
            if (rad == rad.ON_DESTROY) {
                en9.s("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            final bnf w = o50.W((Object)jta, gva);
            final boolean f = gva.f((Object)w);
            final boolean h = gva.h((Object)gbd);
            final Object r = gva.R();
            Object o;
            if ((f | h) || (o = r) == bi6.a) {
                o = new qqb((Object)gbd, (Object)rad, (Object)w, (byte)8);
                gva.q0(o);
            }
            mlc.a((Object)gbd, (lta)o, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new t28(n, (Object)rad, (Object)gbd, (Object)jta, (byte)20);
        }
    }
    
    public static Object f0(final zta zta) {
        return mlc.e0((hc7)o89.v, zta);
    }
    
    public static final void g(final Object o, gbd gbd, final lta lta, final gva gva, final int n) {
        gva.i0(1220373486);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h(o)) {
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
            n4 = (n3 | 0x10);
        }
        int n5 = n4;
        if ((n & 0x180) == 0x0) {
            int n6;
            if (gva.h((Object)lta)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n5 = (n4 | n6);
        }
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            gva.b0();
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                gbd = (gbd)gva.j((sei)uod.a);
            }
            gva.r();
            final boolean f = gva.f(o);
            final boolean f2 = gva.f((Object)gbd);
            final Object r = gva.R();
            mbd mbd;
            if ((f | f2) || (mbd = (mbd)r) == bi6.a) {
                mbd = new mbd(gbd.d());
                gva.q0((Object)mbd);
            }
            j(gbd, mbd, lta, gva, n5 & 0xFFFFFF8F & 0x380);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wf0(n, o, (Object)gbd, (Object)lta, (byte)9);
        }
    }
    
    public static final void g0(final jfg jfg, final int n, final Object o) {
        jfg.g[jfg.h - jfg.c[jfg.d - 1].b + n] = o;
    }
    
    public static final void h(final Object o, final Object o2, gbd gbd, final lta lta, final gva gva, final int n) {
        gva.i0(752680142);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h(o)) {
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
            if (gva.h(o2)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            n6 = (n4 | 0x80);
        }
        int n7 = n6;
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.h((Object)lta)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n7 = (n6 | n8);
        }
        if (gva.W(n7 & 0x1, (n7 & 0x493) != 0x492)) {
            gva.b0();
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                gbd = (gbd)gva.j((sei)uod.a);
            }
            gva.r();
            final boolean f = gva.f(o);
            final boolean f2 = gva.f(o2);
            final boolean f3 = gva.f((Object)gbd);
            final Object r = gva.R();
            mbd mbd;
            if ((f | f2 | f3) || (mbd = (mbd)r) == bi6.a) {
                mbd = new mbd(gbd.d());
                gva.q0((Object)mbd);
            }
            j(gbd, mbd, lta, gva, (n7 & 0xFFFFFC7F) >> 3 & 0x380);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new zad(o, o2, gbd, lta, n, (byte)1);
        }
    }
    
    public static final void h0(final jfg jfg, final int n, final Object o, final int n2, final Object o2) {
        final int n3 = jfg.h - jfg.c[jfg.d - 1].b;
        final Object[] g = jfg.g;
        g[n + n3] = o;
        g[n3 + n2] = o2;
    }
    
    public static final void i(final Object o, final Object o2, final Object o3, gbd gbd, final lta lta, final gva gva, final int n) {
        gva.i0(-485941842);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h(o)) {
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
            if (gva.h(o2)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.h(o3)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0xC00) == 0x0) {
            n8 = (n6 | 0x400);
        }
        int n9 = n8;
        if ((n & 0x6000) == 0x0) {
            int n10;
            if (gva.h((Object)lta)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n9 = (n8 | n10);
        }
        if (gva.W(n9 & 0x1, (n9 & 0x2493) != 0x2492)) {
            gva.b0();
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                gbd = (gbd)gva.j((sei)uod.a);
            }
            gva.r();
            final boolean f = gva.f(o);
            final boolean f2 = gva.f(o2);
            final boolean f3 = gva.f(o3);
            final boolean f4 = gva.f((Object)gbd);
            final Object r = gva.R();
            mbd mbd;
            if ((f | f2 | f3 | f4) || (mbd = (mbd)r) == bi6.a) {
                mbd = new mbd(gbd.d());
                gva.q0((Object)mbd);
            }
            j(gbd, mbd, lta, gva, (n9 & 0xFFFFE3FF) >> 6 & 0x380);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new gf0(o, o2, o3, (Object)gbd, (Object)lta, n, (byte)2);
        }
    }
    
    public static final void i0(final jfg jfg, final Object o, final Object o2, final Object o3) {
        final int n = jfg.h - jfg.c[jfg.d - 1].b;
        final Object[] g = jfg.g;
        g[n] = o;
        g[n + 1] = o2;
        g[n + 2] = o3;
    }
    
    public static final void j(final gbd gbd, final mbd mbd, final lta lta, final gva gva, final int n) {
        gva.i0(912823238);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)gbd)) {
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
            if (gva.h((Object)mbd)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.h((Object)lta)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        boolean b = false;
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            final boolean h = gva.h((Object)mbd);
            if ((n6 & 0x380) == 0x100) {
                b = true;
            }
            final boolean h2 = gva.h((Object)gbd);
            final Object r = gva.R();
            Object o;
            if ((h | b | h2) || (o = r) == bi6.a) {
                o = new rx1((byte)16, lta, (Object)gbd, (Object)mbd);
                gva.q0(o);
            }
            mlc.b((Object)gbd, (Object)mbd, (lta)o, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wf0(n, (Object)gbd, (Object)mbd, (Object)lta, (byte)10);
        }
    }
    
    public static boolean j0(final Activity activity, final String s) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 33 && TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)s)) {
            return false;
        }
        if (sdk_INT >= 32) {
            return activity.shouldShowRequestPermissionRationale(s);
        }
        if (sdk_INT == 31) {
            return l6r.o(activity, s);
        }
        return activity.shouldShowRequestPermissionRationale(s);
    }
    
    public static final void k(final Object o, gbd gbd, final lta lta, final gva gva, final int n) {
        gva.i0(-1408314671);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h(o)) {
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
            n4 = (n3 | 0x10);
        }
        int n5 = n4;
        if ((n & 0x180) == 0x0) {
            int n6;
            if (gva.h((Object)lta)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n5 = (n4 | n6);
        }
        if (gva.W(n5 & 0x1, (n5 & 0x93) != 0x92)) {
            gva.b0();
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                gbd = (gbd)gva.j((sei)uod.a);
            }
            gva.r();
            final boolean f = gva.f(o);
            final boolean f2 = gva.f((Object)gbd);
            final Object r = gva.R();
            qbd qbd;
            if ((f | f2) || (qbd = (qbd)r) == bi6.a) {
                qbd = new qbd(gbd.d());
                gva.q0((Object)qbd);
            }
            m(gbd, qbd, lta, gva, n5 & 0xFFFFFF8F & 0x380);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new yl8(n, o, (Object)gbd, (Object)lta, (byte)11);
        }
    }
    
    public static void k0(final Context context, final z54 z54) {
        final NotificationManager notificationManager = (NotificationManager)context.getSystemService((Class)NotificationManager.class);
        if (notificationManager == null) {
            return;
        }
        final ComponentName component = new ComponentName(context.getPackageName(), "com.anthropic.claude.deeplink.DeepLinkActivity");
        final Intent intent = new Intent("android.intent.action.VIEW");
        intent.setComponent(component);
        intent.setFlags(805306368);
        intent.putExtra("com.anthropic.claude.intent.extra.CHAT_ID", z54.c());
        intent.putExtra("com.anthropic.claude.intent.extra.ACCOUNT_ID", z54.a());
        intent.putExtra("com.anthropic.claude.intent.extra.ORGANIZATION_ID", z54.h());
        intent.putExtra("com.anthropic.claude.intent.extra.SOURCE", z54.i());
        final j2g f = z54.f();
        if (f != null) {
            intent.putExtra("com.anthropic.claude.intent.extra.FEATURE_CATEGORY", f.b());
        }
        final PendingIntent activity = PendingIntent.getActivity(context, z54.c().hashCode(), intent, 201326592);
        final int hashCode = z54.c().hashCode();
        final f1g f1g = new f1g(context, wbe.h(z54.b()));
        f1g.k(z54.e());
        f1g.j(z54.d());
        f1g.p(2131231134);
        f1g.g(true);
        f1g.i(activity);
        f1g.o(1);
        final e1g e1g = new e1g((byte)0);
        e1g.e(z54.d());
        f1g.q((h2g)e1g);
        final hub g = z54.g();
        if (g != null) {
            t6r.n(f1g, context, z54, g, hashCode);
        }
        notificationManager.notify(hashCode, f1g.d());
    }
    
    public static final void l(final Object o, final Object o2, gbd gbd, final lta lta, final gva gva, final int n) {
        gva.i0(696924721);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h(o)) {
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
            if (gva.h(o2)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            n6 = (n4 | 0x80);
        }
        int n7 = n6;
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.h((Object)lta)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n7 = (n6 | n8);
        }
        if (gva.W(n7 & 0x1, (n7 & 0x493) != 0x492)) {
            gva.b0();
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                gbd = (gbd)gva.j((sei)uod.a);
            }
            gva.r();
            final boolean f = gva.f(o);
            final boolean f2 = gva.f(o2);
            final boolean f3 = gva.f((Object)gbd);
            final Object r = gva.R();
            qbd qbd;
            if ((f | f2 | f3) || (qbd = (qbd)r) == bi6.a) {
                qbd = new qbd(gbd.d());
                gva.q0((Object)qbd);
            }
            m(gbd, qbd, lta, gva, (n7 & 0xFFFFFC7F) >> 3 & 0x380);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new zad(o, o2, gbd, lta, n, (byte)0);
        }
    }
    
    public static hv0 l0(final float n) {
        return new hv0(n, true, (iv0)new en9((byte)2));
    }
    
    public static final void m(final gbd gbd, final qbd qbd, final lta lta, final gva gva, final int n) {
        gva.i0(228371534);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)gbd)) {
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
            if (gva.h((Object)qbd)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            int n7;
            if (gva.h((Object)lta)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        boolean b = false;
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            final boolean h = gva.h((Object)qbd);
            if ((n6 & 0x380) == 0x100) {
                b = true;
            }
            final boolean h2 = gva.h((Object)gbd);
            final Object r = gva.R();
            Object o;
            if ((h | b | h2) || (o = r) == bi6.a) {
                o = new rx1((byte)15, lta, (Object)gbd, (Object)qbd);
                gva.q0(o);
            }
            mlc.b((Object)gbd, (Object)qbd, (lta)o, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wf0(n, (Object)gbd, (Object)qbd, (Object)lta, (byte)8);
        }
    }
    
    public static final Object m0(final mdk mdk, final boolean b, Object o, final zta zta) {
        Label_0207: {
            Label_0100: {
                try {
                    if (!(zta instanceof wv1)) {
                        final hc7 context = ((q0)mdk).getContext();
                        Object o2;
                        if (context == o89.v) {
                            o2 = new plc((f07)mdk);
                        }
                        else {
                            o2 = new qlc((f07)mdk, context);
                        }
                        omo.v(2, (Object)zta);
                        o = zta.d(o, o2);
                        break Label_0100;
                    }
                    omo.v(2, (Object)zta);
                    o = zta.d(o, (Object)mdk);
                    break Label_0100;
                }
                catch (final DispatchException ex) {
                    break Label_0207;
                }
                o = new cd6((Throwable)o, false);
            }
            final pc7 v = pc7.v;
            if (o != v) {
                final Object u = ((bqc)mdk).U(o);
                if (u != cqc.b) {
                    mdk.o0();
                    if (u instanceof cd6) {
                        if (!b) {
                            final Throwable a = ((cd6)u).a;
                            if (a instanceof TimeoutCancellationException && ((TimeoutCancellationException)a).v == mdk) {
                                if (!(o instanceof cd6)) {
                                    return o;
                                }
                                throw ((cd6)o).a;
                            }
                        }
                        throw ((cd6)u).a;
                    }
                    o = cqc.a(u);
                    return o;
                }
            }
            return v;
        }
        ((bqc)mdk).S((Object)new cd6(((DispatchException)o).v, false));
    }
    
    public static final void n(final boolean b, final oc4 oc4, final j14 j14, final gwj gwj, final gwj gwj2, final zr4 zr4, final ql3 ql3, final x1o x1o, final jta jta, final float n, final igf igf, final gva gva, final int n2) {
        gva.i0(-2014845583);
        int n3;
        if (gva.g(b)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (gva.f((Object)oc4)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        int n5;
        if (gva.h((Object)j14)) {
            n5 = 256;
        }
        else {
            n5 = 128;
        }
        int n6;
        if (gva.f((Object)gwj)) {
            n6 = 2048;
        }
        else {
            n6 = 1024;
        }
        int n7;
        if (gva.f((Object)gwj2)) {
            n7 = 16384;
        }
        else {
            n7 = 8192;
        }
        int n8;
        if (gva.h((Object)zr4)) {
            n8 = 131072;
        }
        else {
            n8 = 65536;
        }
        int n9;
        if (gva.f((Object)ql3)) {
            n9 = 1048576;
        }
        else {
            n9 = 524288;
        }
        int n10;
        if (gva.f((Object)x1o)) {
            n10 = 8388608;
        }
        else {
            n10 = 4194304;
        }
        int n11;
        if (gva.h((Object)jta)) {
            n11 = 67108864;
        }
        else {
            n11 = 33554432;
        }
        int n12;
        if (gva.c(n)) {
            n12 = 536870912;
        }
        else {
            n12 = 268435456;
        }
        final int n13 = n2 | n3 | n4 | n5 | n6 | n7 | n8 | n9 | n10 | n11 | n12;
        int n14;
        if (gva.f((Object)igf)) {
            n14 = 4;
        }
        else {
            n14 = 2;
        }
        int n15 = 1;
        if (gva.W(n13 & 0x1, (n13 & 0x12492493) != 0x12492492 || (n14 & 0x3) != 0x2)) {
            final int n16 = n13 & 0xE;
            soh.e((n13 >> 18 & 0x380) | n16, 2, jta, gva, (igf)null, b);
            c5q.e((n13 >> 21 & 0x70) | n16, 0, jta, gva, b);
            if (b) {
                gva.g0(763674665);
                mi9.a(jta, gva, n13 >> 24 & 0xE);
            }
            else {
                gva.g0(-2095866095);
            }
            gva.q(false);
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o = r;
            if (r == a) {
                o = new v5d(2);
                gva.q0(o);
            }
            final v5d v5d = (v5d)o;
            final boolean c = gva.c(1.0f);
            final Object r2 = gva.R();
            cwl cwl;
            if (c || (cwl = (cwl)r2) == a) {
                cwl = new cwl();
                gva.q0((Object)cwl);
            }
            final cwl cwl2 = cwl;
            if (n16 != 4) {
                n15 = 0;
            }
            final boolean f = gva.f((Object)cwl2);
            final Object r3 = gva.R();
            Object o2;
            if ((n15 | (f ? 1 : 0)) || (o2 = r3) == a) {
                o2 = new m10(b, cwl2, (f07)null);
                gva.q0(o2);
            }
            mlc.f((zta)o2, gva, (Object)b);
            final alo i0 = ri2.I0(300, 0, (u09)null, 6);
            Object r4;
            if ((r4 = gva.R()) == a) {
                r4 = new avd((byte)21);
                gva.q0(r4);
            }
            final id9 p13 = pc9.p((bfa)i0, (lta)r4);
            final alo i2 = ri2.I0(250, 0, (u09)null, 6);
            Object r5;
            if ((r5 = gva.R()) == a) {
                r5 = new avd((byte)21);
                gva.q0(r5);
            }
            ljq.h(b, igf, p13, pc9.s((bfa)i2, (lta)r5), (String)null, (bua)uuj.t0(1000817225, (aua)new qae(n, cwl2, v5d, jta, oc4, j14, gwj, gwj2, zr4, ql3, x1o), gva), gva, n16 | 0x30D80 | (n14 << 3 & 0x70), 16);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new rae(b, oc4, j14, gwj, gwj2, zr4, ql3, x1o, jta, n, igf, n2);
        }
    }
    
    public static final long n0(long n, final long n2) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n2 >> 32));
        final float intBitsToFloat3 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        final float intBitsToFloat4 = Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL));
        n = Float.floatToRawIntBits(intBitsToFloat2 * intBitsToFloat);
        return ((long)Float.floatToRawIntBits(intBitsToFloat4 * intBitsToFloat3) & 0xFFFFFFFFL) | n << 32;
    }
    
    public static final lvj o(final k2j k2j, final long n, final long n2, final long n3, final long n4) {
        return new lvj(k2j.a, k2j.b, k2j.c, k2j.d, n, n2, n3, n4);
    }
    
    public static final int o0(final long n) {
        final float[] a = x86.a;
        return (int)(j86.a(n, (u86)x86.e) >>> 32);
    }
    
    public static final lvj p(final float n, final float n2, final float n3, final float n4, long n5) {
        n5 = ((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n5 >> 32))) << 32 | (0xFFFFFFFFL & (long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(n5 & 0xFFFFFFFFL)))));
        return new lvj(n, n2, n3, n4, n5, n5, n5, n5);
    }
    
    public static final String p0(final f07 f07) {
        if (f07 instanceof oo8) {
            return ((oo8)f07).toString();
        }
        Object string = null;
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append((Object)f07);
            sb.append('@');
            sb.append(L(f07));
            sb.toString();
        }
        finally {
            final Throwable t;
            string = new jpj(t);
        }
        if (kpj.a(string) != null) {
            final StringBuilder sb2 = new StringBuilder(f07.getClass().getName());
            sb2.append('@');
            sb2.append(L(f07));
            string = sb2.toString();
        }
        return (String)string;
    }
    
    public static final long q(final float n, final float n2, final float n3, final float n4, final u86 u86) {
        if (u86.c()) {
            final long n5 = (int)(n4 * 255.0f + 0.5f) << 24 | (int)(n * 255.0f + 0.5f) << 16 | (int)(n2 * 255.0f + 0.5f) << 8 | (int)(255.0f * n3 + 0.5f);
            final int i = j86.i;
            return n5 << 32;
        }
        final int floatToRawIntBits = Float.floatToRawIntBits(n);
        final int n6 = floatToRawIntBits >>> 31;
        int n7 = floatToRawIntBits >>> 23 & 0xFF;
        final int n8 = floatToRawIntBits & 0x7FFFFF;
        final int n9 = 49;
        final int n10 = 512;
        final int n11 = 0;
        while (true) {
            int n12 = 0;
            Label_0279: {
                if (n7 == 255) {
                    if (n8 != 0) {
                        n12 = 512;
                    }
                    else {
                        n12 = 0;
                    }
                    n7 = 31;
                    break Label_0279;
                }
                n7 -= 112;
                if (n7 >= 31) {
                    n7 = 49;
                    n12 = 0;
                    break Label_0279;
                }
                int n15;
                if (n7 <= 0) {
                    if (n7 >= -10) {
                        int n14;
                        final int n13 = n14 = (n8 | 0x800000) >> 1 - n7;
                        if ((n13 & 0x1000) != 0x0) {
                            n14 = n13 + 8192;
                        }
                        n12 = n14 >> 13;
                        n7 = 0;
                        break Label_0279;
                    }
                    n12 = 0;
                    n7 = 0;
                    break Label_0279;
                }
                else {
                    n12 = n8 >> 13;
                    if ((floatToRawIntBits & 0x1000) == 0x0) {
                        break Label_0279;
                    }
                    n15 = ((n7 << 10 | n12) + 1 | n6 << 15);
                }
                final short n16 = (short)n15;
                final int floatToRawIntBits2 = Float.floatToRawIntBits(n2);
                final int n17 = floatToRawIntBits2 >>> 31;
                int n18 = floatToRawIntBits2 >>> 23 & 0xFF;
                final int n19 = floatToRawIntBits2 & 0x7FFFFF;
                while (true) {
                    int n20 = 0;
                    Label_0491: {
                        if (n18 == 255) {
                            if (n19 != 0) {
                                n20 = 512;
                            }
                            else {
                                n20 = 0;
                            }
                            n18 = 31;
                            break Label_0491;
                        }
                        n18 -= 112;
                        if (n18 >= 31) {
                            n18 = 49;
                            n20 = 0;
                            break Label_0491;
                        }
                        int n23;
                        if (n18 <= 0) {
                            if (n18 >= -10) {
                                int n22;
                                final int n21 = n22 = (n19 | 0x800000) >> 1 - n18;
                                if ((n21 & 0x1000) != 0x0) {
                                    n22 = n21 + 8192;
                                }
                                n20 = n22 >> 13;
                                n18 = 0;
                                break Label_0491;
                            }
                            n20 = 0;
                            n18 = 0;
                            break Label_0491;
                        }
                        else {
                            n20 = n19 >> 13;
                            if ((floatToRawIntBits2 & 0x1000) == 0x0) {
                                break Label_0491;
                            }
                            n23 = ((n18 << 10 | n20) + 1 | n17 << 15);
                        }
                        final short n24 = (short)n23;
                        final int floatToRawIntBits3 = Float.floatToRawIntBits(n3);
                        final int n25 = floatToRawIntBits3 >>> 31;
                        int n26 = floatToRawIntBits3 >>> 23 & 0xFF;
                        final int n27 = 0x7FFFFF & floatToRawIntBits3;
                        while (true) {
                            int n29 = 0;
                            Label_0712: {
                                if (n26 == 255) {
                                    int n28;
                                    if (n27 != 0) {
                                        n28 = n10;
                                    }
                                    else {
                                        n28 = 0;
                                    }
                                    n29 = n28;
                                    n26 = 31;
                                    break Label_0712;
                                }
                                n26 -= 112;
                                if (n26 >= 31) {
                                    n26 = n9;
                                    n29 = n11;
                                    break Label_0712;
                                }
                                int n33;
                                if (n26 <= 0) {
                                    if (n26 >= -10) {
                                        int n31;
                                        final int n30 = n31 = (n27 | 0x800000) >> 1 - n26;
                                        if ((n30 & 0x1000) != 0x0) {
                                            n31 = n30 + 8192;
                                        }
                                        final int n32 = 0;
                                        n29 = n31 >> 13;
                                        n26 = n32;
                                        break Label_0712;
                                    }
                                    n26 = 0;
                                    n29 = n11;
                                    break Label_0712;
                                }
                                else {
                                    n29 = n27 >> 13;
                                    if ((floatToRawIntBits3 & 0x1000) == 0x0) {
                                        break Label_0712;
                                    }
                                    n33 = ((n26 << 10 | n29) + 1 | n25 << 15);
                                }
                                final short n34 = (short)n33;
                                final int n35 = (int)(Math.max(0.0f, Math.min(n4, 1.0f)) * 1023.0f + 0.5f);
                                final int c = u86.c;
                                final long n36 = n16;
                                final long n37 = n24;
                                final long n38 = n34;
                                final long n39 = n35;
                                final long n40 = c;
                                final int j = j86.i;
                                return (n38 & 0xFFFFL) << 16 | ((n36 & 0xFFFFL) << 48 | (n37 & 0xFFFFL) << 32) | (n39 & 0x3FFL) << 6 | (n40 & 0x3FL);
                            }
                            int n33 = n25 << 15 | n26 << 10 | n29;
                            continue;
                        }
                    }
                    int n23 = n20 | (n17 << 15 | n18 << 10);
                    continue;
                }
            }
            int n15 = n12 | (n6 << 15 | n7 << 10);
            continue;
        }
    }
    
    public static Icon q0(final IconCompat iconCompat, final Context context) {
        final int a = iconCompat.a;
        Icon icon = null;
        switch (a) {
            default: {
                en9.s("Unknown type");
                return null;
            }
            case 6: {
                if (Build$VERSION.SDK_INT >= 30) {
                    icon = a0c.a(iconCompat.f());
                    break;
                }
                if (context == null) {
                    c2.f((Object)iconCompat.f(), "Context is required to resolve the file uri of the icon: ");
                    return null;
                }
                final InputStream g = iconCompat.g(context);
                if (g != null) {
                    icon = c7r.n(BitmapFactory.decodeStream(g));
                    break;
                }
                uy8.o((Object)iconCompat.f(), "Cannot load adaptive icon from uri: ");
                return null;
            }
            case 5: {
                icon = c7r.n((Bitmap)iconCompat.b);
                break;
            }
            case 4: {
                icon = Icon.createWithContentUri((String)iconCompat.b);
                break;
            }
            case 3: {
                icon = Icon.createWithData((byte[])iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            }
            case 2: {
                String s;
                if (a == -1) {
                    s = O(iconCompat.b);
                }
                else {
                    if (a != 2) {
                        uy8.n((Object)iconCompat, "called getResPackage() on ");
                        return null;
                    }
                    final String j = iconCompat.j;
                    if (j != null && !TextUtils.isEmpty((CharSequence)j)) {
                        s = iconCompat.j;
                    }
                    else {
                        s = ((String)iconCompat.b).split(":", -1)[0];
                    }
                }
                icon = Icon.createWithResource(s, iconCompat.e);
                break;
            }
            case 1: {
                icon = Icon.createWithBitmap((Bitmap)iconCompat.b);
                break;
            }
            case -1: {
                return (Icon)iconCompat.b;
            }
        }
        final ColorStateList g2 = iconCompat.g;
        if (g2 != null) {
            icon.setTintList(g2);
        }
        final PorterDuff$Mode h = iconCompat.h;
        if (h != IconCompat.k) {
            icon.setTintMode(h);
        }
        return icon;
    }
    
    public static int s(final Context context, final String s) {
        if (s == null) {
            fvd.k("permission must be non-null");
            return 0;
        }
        if (Build$VERSION.SDK_INT >= 33 || !TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)s)) {
            return context.checkPermission(s, Process.myPid(), Process.myUid());
        }
        if (m2g.b(context).a()) {
            return 0;
        }
        return -1;
    }
    
    public static final bnf t(final llf llf, final gva gva, int n) {
        final Object r = gva.R();
        final cib a = bi6.a;
        Object q = r;
        if (r == a) {
            q = o50.Q((Object)Boolean.FALSE);
            gva.q0(q);
        }
        final bnf bnf = (bnf)q;
        if ((((n & 0xE) ^ 0x6) > 4 && gva.f((Object)llf)) || (n & 0x6) == 0x4) {
            n = 1;
        }
        else {
            n = 0;
        }
        final Object r2 = gva.R();
        Object o;
        if (n != 0 || (o = r2) == a) {
            o = new qt8(llf, bnf, null, (byte)2);
            gva.q0(o);
        }
        mlc.f((zta)o, gva, (Object)llf);
        return bnf;
    }
    
    public static final void u(final ddb ddb, final String s, final String s2) {
        final ArrayList a = ddb.a;
        a.add((Object)s);
        a.add((Object)kym.B1((CharSequence)s2).toString());
    }
    
    public static final fdb v(final ddb ddb) {
        return new fdb((String[])ddb.a.toArray((Object[])new String[0]));
    }
    
    public static final String w(final fdb fdb, final int n) {
        final String s = (String)iw0.a1(n * 2, (Object[])fdb.v);
        if (s != null) {
            return s;
        }
        final StringBuilder sb = new StringBuilder("name[");
        sb.append(n);
        sb.append(']');
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public static final ddb x(final fdb fdb) {
        final ddb ddb = new ddb((byte)0);
        h86.u0((Collection)ddb.a, (Object[])fdb.v);
        return ddb;
    }
    
    public static final String y(final fdb fdb, final int n) {
        final String s = (String)iw0.a1(n * 2 + 1, (Object[])fdb.v);
        if (s != null) {
            return s;
        }
        final StringBuilder sb = new StringBuilder("value[");
        sb.append(n);
        sb.append(']');
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public static final long z(long a, final long n) {
        a = j86.a(a, j86.e(n));
        final float c = j86.c(n);
        final float c2 = j86.c(a);
        final float n2 = 1.0f - c2;
        final float n3 = c * n2 + c2;
        final float g = j86.g(a);
        final float g2 = j86.g(n);
        float n4 = 0.0f;
        final float n5 = fcmpg(n3, 0.0f);
        float n6;
        if (n5 == 0) {
            n6 = 0.0f;
        }
        else {
            n6 = (g2 * c * n2 + g * c2) / n3;
        }
        final float f = j86.f(a);
        final float f2 = j86.f(n);
        float n7;
        if (n5 == 0) {
            n7 = 0.0f;
        }
        else {
            n7 = (f2 * c * n2 + f * c2) / n3;
        }
        final float d = j86.d(a);
        final float d2 = j86.d(n);
        if (n5 != 0) {
            n4 = (d2 * c * n2 + d * c2) / n3;
        }
        return q(n6, n7, n4, n3, j86.e(n));
    }
    
    public abstract String B();
    
    public void T(t2k d1, final Object o) {
        if (o == null) {
            return;
        }
        d1 = (t2k)d1.d1(this.B());
        try {
            this.r((b3k)d1, o);
            ((b3k)d1).Z0();
            r9n.m((AutoCloseable)d1, null);
        }
        finally {
            try {}
            finally {
                final Throwable t;
                r9n.m((AutoCloseable)d1, t);
            }
        }
    }
    
    public abstract void r(final b3k p0, final Object p1);
}
