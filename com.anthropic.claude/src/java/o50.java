import java.util.Collection;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import android.view.ViewParent;
import java.util.HashSet;
import java.util.Set;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.anthropic.claude.login.WelcomeNotice;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.design.icon.a;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Executor;
import java.util.Map;
import com.anthropic.claude.api.errors.ClaudeApiError$AuthError;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.graphics.Shader;
import java.util.List;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import android.content.pm.ResolveInfo;
import android.os.Trace;
import android.util.Log;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import java.util.WeakHashMap;
import android.view.View;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;

public abstract class o50
{
    public static final char[] b;
    public static final int[] c;
    public static final long[] d;
    public static final Object[] e;
    public static jy7 f;
    public static String g;
    public static final Object h;
    public static final SerialDescriptor[] i;
    public static final p90 j;
    public final byte a;
    
    public static final int B(final b3k b3k, final String s) {
        final int s2 = x90.s(b3k, s);
        if (s2 >= 0) {
            return s2;
        }
        final int columnCount = b3k.getColumnCount();
        final ArrayList list = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; ++i) {
            list.add((Object)b3k.getColumnName(i));
        }
        en9.s(lmf.t("Column '", s, "' does not exist. Available columns: [", c86.N0((Iterable)list, (CharSequence)null, (String)null, (String)null, (lta)null, 63), "]"));
        return 0;
    }
    
    public static final hc7 C(final quj quj, final h07 h07) {
        final xdo xdo = (xdo)h07.getContext().M0((gc7)xdo.w);
        Object o;
        if (xdo != null) {
            o = xdo.v;
        }
        else {
            o = null;
        }
        final fz6 a = quj.a;
        if (a != null) {
            final hc7 c0 = a.v.c0((gc7)o55.z);
            if (o == null) {
                o = o89.v;
            }
            return c0.F0((hc7)o);
        }
        mlc.j0("coroutineScope");
        throw null;
    }
    
    public static l2q D(final View view) {
        final WeakHashMap x = l2q.x;
        final WeakHashMap weakHashMap;
        monitorenter(weakHashMap = x);
        Label_0054: {
            Object value;
            try {
                if ((value = x.get((Object)view)) == null) {
                    value = new l2q(view);
                    x.put((Object)view, value);
                }
            }
            finally {
                break Label_0054;
            }
            final l2q l2q = (l2q)value;
            monitorexit(weakHashMap);
            return l2q;
        }
        monitorexit(weakHashMap);
    }
    
    public static ApplicationInfo E(final Context context) {
        xzg.n("HttpFlagsLoader#getProviderApplicationInfo");
        try {
            final ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent("android.net.http.FLAGS_FILE_PROVIDER"), 1048576);
            if (resolveService == null) {
                Log.i("HttpFlagsLoader", "Unable to resolve the HTTP flags file provider package. This is expected if the host system is not set up to provide HTTP flags.");
                Trace.endSection();
                return null;
            }
            final ApplicationInfo applicationInfo = resolveService.serviceInfo.applicationInfo;
            Trace.endSection();
            return applicationInfo;
        }
        finally {
            try {
                Trace.endSection();
            }
            finally {
                final Throwable t;
                ((Throwable)context).addSuppressed(t);
            }
        }
    }
    
    public static final boolean F(final float[] array, final float[] array2) {
        if (array.length < 16 || array2.length < 16) {
            return false;
        }
        final float n = array[0];
        final float n2 = array[1];
        final float n3 = array[2];
        final float n4 = array[3];
        final float n5 = array[4];
        final float n6 = array[5];
        final float n7 = array[6];
        final float n8 = array[7];
        final float n9 = array[8];
        final float n10 = array[9];
        final float n11 = array[10];
        final float n12 = array[11];
        final float n13 = array[12];
        final float n14 = array[13];
        final float n15 = array[14];
        final float n16 = array[15];
        final float n17 = n * n6 - n2 * n5;
        final float n18 = n * n7 - n3 * n5;
        final float n19 = n * n8 - n4 * n5;
        final float n20 = n2 * n7 - n3 * n6;
        final float n21 = n2 * n8 - n4 * n6;
        final float n22 = n3 * n8 - n4 * n7;
        final float n23 = n9 * n14 - n10 * n13;
        final float n24 = n9 * n15 - n11 * n13;
        final float n25 = n9 * n16 - n12 * n13;
        final float n26 = n10 * n15 - n11 * n14;
        final float n27 = n10 * n16 - n12 * n14;
        final float n28 = n11 * n16 - n12 * n15;
        final float n29 = n22 * n23 + (n20 * n25 + (n19 * n26 + (n17 * n28 - n18 * n27)) - n21 * n24);
        final float n30 = fcmpg(n29, 0.0f);
        if (n30 != 0) {
            final float n31 = 1.0f / n29;
            array2[0] = (n8 * n26 + (n6 * n28 - n7 * n27)) * n31;
            array2[1] = (n3 * n27 + -n2 * n28 - n4 * n26) * n31;
            array2[2] = (n16 * n20 + (n14 * n22 - n15 * n21)) * n31;
            array2[3] = (n11 * n21 + -n10 * n22 - n12 * n20) * n31;
            final float n32 = -n5;
            array2[4] = (n7 * n25 + n32 * n28 - n8 * n24) * n31;
            array2[5] = (n4 * n24 + (n28 * n - n3 * n25)) * n31;
            final float n33 = -n13;
            array2[6] = (n15 * n19 + n33 * n22 - n16 * n18) * n31;
            array2[7] = (n12 * n18 + (n22 * n9 - n11 * n19)) * n31;
            array2[8] = (n8 * n23 + (n5 * n27 - n6 * n25)) * n31;
            array2[9] = (n25 * n2 + -n * n27 - n4 * n23) * n31;
            array2[10] = (n16 * n17 + (n13 * n21 - n14 * n19)) * n31;
            array2[11] = (n19 * n10 + -n9 * n21 - n12 * n17) * n31;
            array2[12] = (n6 * n24 + n32 * n26 - n7 * n23) * n31;
            array2[13] = (n3 * n23 + (n * n26 - n2 * n24)) * n31;
            array2[14] = (n14 * n18 + n33 * n20 - n15 * n17) * n31;
            array2[15] = (n11 * n17 + (n9 * n20 - n10 * n18)) * n31;
        }
        return n30 == 0 ^ true;
    }
    
    public static final KSerializer G(Object invoke, final KSerializer... array) {
        try {
            final int length = array.length;
            int i = 0;
            Class[] array2;
            if (length == 0) {
                array2 = new Class[0];
            }
            else {
                final int length2 = array.length;
                array2 = new Class[length2];
                while (i < length2) {
                    array2[i] = KSerializer.class;
                    ++i;
                }
            }
            invoke = invoke.getClass().getDeclaredMethod("serializer", (Class<?>[])Arrays.copyOf((Object[])array2, array2.length)).invoke(invoke, Arrays.copyOf((Object[])array, array.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer)invoke;
            }
            goto Label_0137;
        }
        catch (final InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause != null) {
                String s;
                if ((s = cause.getMessage()) == null) {
                    s = ((Throwable)ex).getMessage();
                }
                throw new InvocationTargetException(cause, s);
            }
            throw ex;
        }
        catch (final NoSuchMethodException ex2) {
            goto Label_0137;
        }
    }
    
    public static final boolean H(final rtc rtc) {
        return qt7.z(rtc).isInterface();
    }
    
    public static final boolean I(final gtf gtf) {
        return ((hq6)((v80)gtf).c.getValue()) instanceof eq6 ^ true;
    }
    
    public static final boolean J(final gtf gtf) {
        return ((hq6)((v80)gtf).c.getValue()) instanceof eq6;
    }
    
    public static final rtc K(final buc buc) {
        final rtc c = buc.c();
        if (c instanceof rtc) {
            return c;
        }
        uy8.l((Object)c, "Only KClass supported as classifier, got ");
        return null;
    }
    
    public static qha L(final Context context) {
        try {
            final ApplicationInfo e = E(context);
            if (e != null) {
                final File file = new File(new File(new File(e.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
                file.getAbsolutePath();
                final qha m = M(file);
                if (m != null) {
                    ((zwa)m).toString();
                    return m;
                }
            }
            return null;
        }
        catch (final RuntimeException ex) {
            Log.i("HttpFlagsLoader", "Unable to load HTTP flags file", (Throwable)ex);
            return null;
        }
    }
    
    public static qha M(final File file) {
        xzg.n("HttpFlagsLoader#loadFlagsFile");
        try {
            final FileInputStream fileInputStream = new FileInputStream(file);
            try {
                final qha h = qha.h(fileInputStream);
                fileInputStream.close();
                Trace.endSection();
                return h;
            }
            finally {
                try {
                    fileInputStream.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
        }
        catch (final IOException ex) {
            final RuntimeException ex2 = new(java.lang.RuntimeException.class)();
            final RuntimeException ex4;
            final RuntimeException ex3 = ex4 = ex2;
            final String s = "Unable to read HTTP flags file";
            final Throwable t3 = (Throwable)ex;
            new RuntimeException(s, t3);
            throw ex3;
        }
        catch (final FileNotFoundException ex6) {
            final String path = file.getPath();
            final StringBuilder sb = new StringBuilder("HTTP flags file `");
            sb.append(path);
            sb.append("` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.");
            Log.i("HttpFlagsLoader", sb.toString());
            Trace.endSection();
            return null;
        }
        finally {
            try {
                Trace.endSection();
            }
            finally {
                final Throwable t4;
                ((Throwable)file).addSuppressed(t4);
            }
        }
        try {
            final RuntimeException ex2 = new(java.lang.RuntimeException.class)();
            final RuntimeException ex4;
            final RuntimeException ex3 = ex4 = ex2;
            final String s = "Unable to read HTTP flags file";
            final IOException ex;
            final Throwable t3 = (Throwable)ex;
            new RuntimeException(s, t3);
            throw ex3;
        }
        finally {}
    }
    
    public static final p4c N(final Resources$Theme resources$Theme, final Resources resources, final XmlResourceParser c, final int n) {
        final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)c);
        final Object o = new Object();
        ((lc0)o).c = c;
        ((lc0)o).a = 0;
        ((lc0)o).e = new e3a((byte)19);
        final XmlPullParser xmlPullParser = (XmlPullParser)((lc0)o).c;
        final int[] a = rml.a;
        TypedArray typedArray;
        if (resources$Theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, a);
        }
        else {
            typedArray = resources$Theme.obtainStyledAttributes(attributeSet, a, 0, 0);
        }
        ((lc0)o).e(typedArray.getChangingConfigurations());
        final boolean b = vt4.M((XmlPullParser)c, "autoMirrored") && typedArray.getBoolean(5, false);
        ((lc0)o).e(typedArray.getChangingConfigurations());
        final float c2 = ((lc0)o).c(typedArray, "viewportWidth", 7, 0.0f);
        final float c3 = ((lc0)o).c(typedArray, "viewportHeight", 8, 0.0f);
        if (c2 <= 0.0f) {
            throw new XmlPullParserException(smk.z(typedArray.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
        }
        if (c3 > 0.0f) {
            final float dimension = typedArray.getDimension(3, 0.0f);
            ((lc0)o).e(typedArray.getChangingConfigurations());
            final float dimension2 = typedArray.getDimension(2, 0.0f);
            ((lc0)o).e(typedArray.getChangingConfigurations());
            long n2;
            if (typedArray.hasValue(1)) {
                final TypedValue typedValue = new TypedValue();
                typedArray.getValue(1, typedValue);
                if (typedValue.type == 2) {
                    n2 = j86.h;
                }
                else {
                    ColorStateList list;
                    if (((XmlPullParser)c).getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                        final TypedValue typedValue2 = new TypedValue();
                        typedArray.getValue(1, typedValue2);
                        final int type = typedValue2.type;
                        if (type == 2) {
                            oyl.h((Object)typedValue2, "Failed to resolve attribute at index 1: ");
                            return null;
                        }
                        if (type >= 28 && type <= 31) {
                            list = ColorStateList.valueOf(typedValue2.data);
                        }
                        else {
                            list = y86.c(typedArray.getResources(), typedArray.getResourceId(1, 0), resources$Theme);
                        }
                    }
                    else {
                        list = null;
                    }
                    ((lc0)o).e(typedArray.getChangingConfigurations());
                    if (list != null) {
                        n2 = t08.c(list.getDefaultColor());
                    }
                    else {
                        n2 = j86.h;
                    }
                }
            }
            else {
                n2 = j86.h;
            }
            final int int1 = typedArray.getInt(6, -1);
            ((lc0)o).e(typedArray.getChangingConfigurations());
            int n3 = 0;
            Label_0513: {
                Label_0476: {
                    if (int1 != -1) {
                        if (int1 == 3) {
                            n3 = 3;
                            break Label_0513;
                        }
                        if (int1 != 5) {
                            if (int1 != 9) {
                                switch (int1) {
                                    default: {
                                        break Label_0476;
                                    }
                                    case 16: {
                                        n3 = 12;
                                        break;
                                    }
                                    case 15: {
                                        n3 = 14;
                                        break;
                                    }
                                    case 14: {
                                        n3 = 13;
                                        break;
                                    }
                                }
                            }
                            else {
                                n3 = 9;
                            }
                            break Label_0513;
                        }
                    }
                }
                n3 = 5;
            }
            final float n4 = dimension / resources.getDisplayMetrics().density;
            final float n5 = dimension2 / resources.getDisplayMetrics().density;
            typedArray.recycle();
            final int n6 = 1;
            final n4c n4c = new n4c((String)null, n4, n5, c2, c3, n2, n3, b, 1);
            int n7 = 0;
            int n8 = n6;
            while (((XmlPullParser)c).getEventType() != n8 && (((XmlPullParser)c).getDepth() >= n8 || ((XmlPullParser)c).getEventType() != 3)) {
                final e3a e3a = (e3a)((lc0)o).e;
                final int eventType = xmlPullParser.getEventType();
            Label_1967:
                while (true) {
                    Label_0747: {
                        Label_0744: {
                            if (eventType != 2) {
                                if (eventType == 3) {
                                    int n9 = n7;
                                    if (!"group".equals(xmlPullParser.getName())) {
                                        break Label_0740;
                                    }
                                    for (int i = 0; i < n7 + 1; ++i) {
                                        n4c.f();
                                    }
                                    final int[] array = (int[])((lc0)o).d;
                                    if (array == null) {
                                        break Label_0747;
                                    }
                                    int b2 = ((lc0)o).b;
                                    if (b2 == 0) {
                                        break Label_0747;
                                    }
                                    --b2;
                                    ((lc0)o).b = b2;
                                    n9 = array[b2];
                                    break Label_0740;
                                }
                            }
                            else {
                                final String name = xmlPullParser.getName();
                                final int n9 = n7;
                                if (name == null) {
                                    break Label_0740;
                                }
                                final int hashCode = name.hashCode();
                                Object v = r89.v;
                                if (hashCode != -1649314686) {
                                    if (hashCode != 3433509) {
                                        if (hashCode == 98629247) {
                                            if (name.equals((Object)"group")) {
                                                final int[] b3 = rml.b;
                                                TypedArray typedArray2;
                                                if (resources$Theme == null) {
                                                    typedArray2 = resources.obtainAttributes(attributeSet, b3);
                                                }
                                                else {
                                                    typedArray2 = resources$Theme.obtainStyledAttributes(attributeSet, b3, 0, 0);
                                                }
                                                ((lc0)o).e(typedArray2.getChangingConfigurations());
                                                final float c4 = ((lc0)o).c(typedArray2, "rotation", 5, 0.0f);
                                                final float float1 = typedArray2.getFloat(n8, 0.0f);
                                                ((lc0)o).e(typedArray2.getChangingConfigurations());
                                                final float float2 = typedArray2.getFloat(2, 0.0f);
                                                ((lc0)o).e(typedArray2.getChangingConfigurations());
                                                final float c5 = ((lc0)o).c(typedArray2, "scaleX", 3, 1.0f);
                                                final float c6 = ((lc0)o).c(typedArray2, "scaleY", 4, 1.0f);
                                                final float c7 = ((lc0)o).c(typedArray2, "translateX", 6, 0.0f);
                                                final float c8 = ((lc0)o).c(typedArray2, "translateY", 7, 0.0f);
                                                String string = typedArray2.getString(0);
                                                ((lc0)o).e(typedArray2.getChangingConfigurations());
                                                if (string == null) {
                                                    string = "";
                                                }
                                                typedArray2.recycle();
                                                final int a2 = l6p.a;
                                                n4c.a(string, c4, float1, float2, c5, c6, c7, c8, (List)v);
                                                final int[] array2 = (int[])((lc0)o).d;
                                                int[] copy;
                                                if (array2 == null) {
                                                    copy = new int[4];
                                                    ((lc0)o).d = copy;
                                                }
                                                else {
                                                    copy = array2;
                                                    if (((lc0)o).b >= array2.length) {
                                                        copy = Arrays.copyOf(array2, array2.length * 2);
                                                        ((lc0)o).d = copy;
                                                    }
                                                }
                                                copy[((lc0)o).b++] = n7;
                                                break Label_0747;
                                            }
                                        }
                                    }
                                    else if (name.equals((Object)"path")) {
                                        final int[] c9 = rml.c;
                                        TypedArray typedArray3;
                                        if (resources$Theme == null) {
                                            typedArray3 = resources.obtainAttributes(attributeSet, c9);
                                        }
                                        else {
                                            typedArray3 = resources$Theme.obtainStyledAttributes(attributeSet, c9, 0, 0);
                                        }
                                        ((lc0)o).e(typedArray3.getChangingConfigurations());
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                            String string2 = typedArray3.getString(0);
                                            ((lc0)o).e(typedArray3.getChangingConfigurations());
                                            if (string2 == null) {
                                                string2 = "";
                                            }
                                            final String string3 = typedArray3.getString(2);
                                            ((lc0)o).e(typedArray3.getChangingConfigurations());
                                            Object o2;
                                            if (string3 == null) {
                                                final int a3 = l6p.a;
                                                o2 = v;
                                            }
                                            else {
                                                o2 = new ArrayList();
                                                e3a.L(string3, (ArrayList)o2);
                                            }
                                            final qd6 b4 = ((lc0)o).b(typedArray3, resources$Theme, "fillColor", n8);
                                            final float c10 = ((lc0)o).c(typedArray3, "fillAlpha", 12, 1.0f);
                                            int int2;
                                            if (!vt4.M(xmlPullParser, "strokeLineCap")) {
                                                int2 = -1;
                                            }
                                            else {
                                                int2 = typedArray3.getInt(8, -1);
                                            }
                                            ((lc0)o).e(typedArray3.getChangingConfigurations());
                                            int n10 = 0;
                                            Label_1395: {
                                                if (int2 != 0) {
                                                    if (int2 == n8) {
                                                        n10 = n8;
                                                        break Label_1395;
                                                    }
                                                    if (int2 == 2) {
                                                        n10 = 2;
                                                        break Label_1395;
                                                    }
                                                }
                                                n10 = 0;
                                            }
                                            int int3;
                                            if (!vt4.M(xmlPullParser, "strokeLineJoin")) {
                                                int3 = -1;
                                            }
                                            else {
                                                int3 = typedArray3.getInt(9, -1);
                                            }
                                            ((lc0)o).e(typedArray3.getChangingConfigurations());
                                            Label_1468: {
                                                if (int3 != 0) {
                                                    if (int3 == n8) {
                                                        break Label_1468;
                                                    }
                                                    if (int3 == 2) {
                                                        n8 = 2;
                                                        break Label_1468;
                                                    }
                                                }
                                                n8 = 0;
                                            }
                                            final float c11 = ((lc0)o).c(typedArray3, "strokeMiterLimit", 10, 4.0f);
                                            final qd6 b5 = ((lc0)o).b(typedArray3, resources$Theme, "strokeColor", 3);
                                            final float c12 = ((lc0)o).c(typedArray3, "strokeAlpha", 11, 1.0f);
                                            final float c13 = ((lc0)o).c(typedArray3, "strokeWidth", 4, 1.0f);
                                            final float c14 = ((lc0)o).c(typedArray3, "trimPathEnd", 6, 1.0f);
                                            final float c15 = ((lc0)o).c(typedArray3, "trimPathOffset", 7, 0.0f);
                                            final float c16 = ((lc0)o).c(typedArray3, "trimPathStart", 5, 0.0f);
                                            int int4;
                                            if (!vt4.M(xmlPullParser, "fillType")) {
                                                int4 = 0;
                                            }
                                            else {
                                                int4 = typedArray3.getInt(13, 0);
                                            }
                                            ((lc0)o).e(typedArray3.getChangingConfigurations());
                                            typedArray3.recycle();
                                            final Shader shader = (Shader)b4.x;
                                            final int w = b4.w;
                                            Object b6 = null;
                                            Label_1679: {
                                                if (shader == null) {
                                                    if (w == 0) {
                                                        b6 = null;
                                                        break Label_1679;
                                                    }
                                                }
                                                if (shader != null) {
                                                    b6 = n1r.b(shader);
                                                }
                                                else {
                                                    b6 = new cam(t08.c(w));
                                                }
                                            }
                                            final Shader shader2 = (Shader)b5.x;
                                            final int w2 = b5.w;
                                            Object b7 = null;
                                            Label_1744: {
                                                if (shader2 == null) {
                                                    if (w2 == 0) {
                                                        b7 = null;
                                                        break Label_1744;
                                                    }
                                                }
                                                if (shader2 != null) {
                                                    b7 = n1r.b(shader2);
                                                }
                                                else {
                                                    b7 = new cam(t08.c(w2));
                                                }
                                            }
                                            int n11;
                                            if (int4 == 0) {
                                                n11 = 0;
                                            }
                                            else {
                                                n11 = 1;
                                            }
                                            n4c.c(c10, c12, c13, c11, c16, c14, c15, n11, n10, n8, (qm2)b6, (qm2)b7, string2, (List)o2);
                                            n8 = 1;
                                            break Label_0744;
                                        }
                                        en9.s("No path data available");
                                        return null;
                                    }
                                }
                                else {
                                    if (!name.equals((Object)"clip-path")) {
                                        n8 = 1;
                                        break Label_1967;
                                    }
                                    final int[] d = rml.d;
                                    TypedArray typedArray4;
                                    if (resources$Theme == null) {
                                        typedArray4 = resources.obtainAttributes(attributeSet, d);
                                    }
                                    else {
                                        typedArray4 = resources$Theme.obtainStyledAttributes(attributeSet, d, 0, 0);
                                    }
                                    ((lc0)o).e(typedArray4.getChangingConfigurations());
                                    final String string4 = typedArray4.getString(0);
                                    ((lc0)o).e(typedArray4.getChangingConfigurations());
                                    String s = string4;
                                    if (string4 == null) {
                                        s = "";
                                    }
                                    n8 = 1;
                                    final String string5 = typedArray4.getString(1);
                                    ((lc0)o).e(typedArray4.getChangingConfigurations());
                                    if (string5 == null) {
                                        final int a4 = l6p.a;
                                    }
                                    else {
                                        v = new ArrayList();
                                        e3a.L(string5, (ArrayList)v);
                                    }
                                    typedArray4.recycle();
                                    n4c.b(n4c, s, (List)v);
                                    ++n7;
                                    break Label_1967;
                                }
                            }
                            int n9 = n7;
                            n7 = n9;
                        }
                        break Label_1967;
                    }
                    int n9 = 0;
                    continue;
                }
                ((XmlPullParser)c).next();
            }
            return new p4c(n4c.e(), n | ((lc0)o).a);
        }
        throw new XmlPullParserException(smk.z(typedArray.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
    }
    
    public static final ArrayList O(final List list, final jta jta) {
        if (jta.a()) {
            final ArrayList list2 = new ArrayList(list.size());
            for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
                final goe goe = (goe)list.get(i);
                final Object z = goe.z();
                z.getClass();
                final oe6 v = ((enn)z).v;
                final umn umn = (umn)v.w;
                final ng0 ng0 = (ng0)v.x;
                final omn omn = (omn)umn.a.getValue();
                fc2 fc2;
                if (omn == null) {
                    fc2 = new fc2(0, 0, (jta)new smn((byte)0));
                }
                else {
                    final ng0 c = umn.c(ng0, omn);
                    if (c == null) {
                        fc2 = new fc2(0, 0, (jta)new smn((byte)1));
                    }
                    else {
                        final ygc b0 = omo.b0(omn.k(c.b, c.c).g());
                        fc2 = new fc2(b0.f(), b0.c(), (jta)new wfk((Object)b0, (byte)19));
                    }
                }
                final int v2 = fc2.v;
                final int w = fc2.w;
                list2.add((Object)new yog((Object)goe.u(ri2.F(v2, v2, w, w)), (Object)fc2.x));
            }
            return list2;
        }
        return null;
    }
    
    public static final x8m P() {
        return new x8m();
    }
    
    public static ksg Q(final Object o) {
        return new ksg(o, (q8m)def.D);
    }
    
    public static final String R(final rtc rtc) {
        String c;
        if ((c = ((us4)rtc).c()) == null) {
            c = "<local class name not available>";
        }
        return hia.k("Serializer for class '", c, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }
    
    public static final void T(final float[] array, final float[] array2) {
        final float x = x(array2, 0, array, 0);
        final float x2 = x(array2, 0, array, 1);
        final float x3 = x(array2, 0, array, 2);
        final float x4 = x(array2, 0, array, 3);
        final float x5 = x(array2, 1, array, 0);
        final float x6 = x(array2, 1, array, 1);
        final float x7 = x(array2, 1, array, 2);
        final float x8 = x(array2, 1, array, 3);
        final float x9 = x(array2, 2, array, 0);
        final float x10 = x(array2, 2, array, 1);
        final float x11 = x(array2, 2, array, 2);
        final float x12 = x(array2, 2, array, 3);
        final float x13 = x(array2, 3, array, 0);
        final float x14 = x(array2, 3, array, 1);
        final float x15 = x(array2, 3, array, 2);
        final float x16 = x(array2, 3, array, 3);
        array[0] = x;
        array[1] = x2;
        array[2] = x3;
        array[3] = x4;
        array[4] = x5;
        array[5] = x6;
        array[6] = x7;
        array[7] = x8;
        array[8] = x9;
        array[9] = x10;
        array[10] = x11;
        array[11] = x12;
        array[12] = x13;
        array[13] = x14;
        array[14] = x15;
        array[15] = x16;
    }
    
    public static final void U(final float[] array, final float n, final float n2, final float[] array2) {
        l8e.d(array2);
        l8e.g(array2, n, n2);
        T(array, array2);
    }
    
    public static final srm V(final boolean b, final boolean b2, final jta jta, final gva gva, final int n) {
        final yl2 yl2 = (yl2)gva.j((sei)am2.a);
        final qzc qzc = (qzc)gva.j((sei)hm6.n);
        boolean b3 = false;
        final boolean b4 = (((n & 0x380) ^ 0x180) > 256 && gva.f((Object)jta)) || (n & 0x180) == 0x100;
        final boolean b5 = (((n & 0xE) ^ 0x6) > 4 && gva.g(b)) || (n & 0x6) == 0x4;
        final boolean d = gva.d(((Enum)qzc).ordinal());
        final boolean f = gva.f((Object)yl2);
        if ((((n & 0x70) ^ 0x30) > 32 && gva.g(b2)) || (n & 0x30) == 0x20) {
            b3 = true;
        }
        final Object r = gva.R();
        srm srm;
        if ((b4 | b5 | d | f | b3) || (srm = (srm)r) == bi6.a) {
            srm = new srm(jta, b, qzc, b2, yl2);
            gva.q0((Object)srm);
        }
        return srm;
    }
    
    public static final bnf W(final Object value, final gva gva) {
        Object o;
        if ((o = gva.R()) == bi6.a) {
            o = Q(value);
            gva.q0(o);
        }
        final bnf bnf = (bnf)o;
        bnf.setValue(value);
        return bnf;
    }
    
    public static String X(final String s) {
        if (s != null) {
            if (s.length() <= 64) {
                if (hhb.g.g((CharSequence)s)) {
                    final String s2 = s;
                    if (!nhb.a.a((CharSequence)s)) {
                        return s2;
                    }
                }
            }
        }
        return null;
    }
    
    public static final igf Y(final igf igf, final og0 og0, final mnn mnn, final lta lta, final int n, final boolean b, final int n2, final int n3, final tna tna, final List list, final lta lta2, final iqk iqk, final lta lta3, final rfn rfn) {
        if (iqk == null) {
            return igf.E((igf)fgf.v).E((igf)new TextAnnotatedStringElement(og0, mnn, tna, lta, n, b, n2, n3, list, lta2, rfn, lta3));
        }
        return igf.E(iqk.b()).E((igf)new SelectableTextAnnotatedStringElement(og0, mnn, tna, lta, n, b, n2, n3, list, lta2, iqk, rfn));
    }
    
    public static final void Z(final t98 t98, final Object o, final lta lta) {
        if (!t98.z0().I) {
            gac.c("visitAncestors called on an unattached node");
        }
        final hgf z = t98.z0().z;
        LayoutNode layoutNode = soh.L(t98);
        Object o2 = z;
    Label_0390:
        while (layoutNode != null) {
            if ((((hgf)layoutNode.Z.B).y & 0x40000) != 0x0) {
                for (Object z2 = o2; z2 != null; z2 = ((hgf)z2).z) {
                    if ((((hgf)z2).x & 0x40000) != 0x0) {
                        hgf g = (hgf)z2;
                        inf inf = null;
                        while (g != null) {
                            final boolean b = g instanceof wfo;
                            boolean booleanValue = true;
                            inf inf2;
                            if (b) {
                                final wfo wfo = (wfo)g;
                                if (o.equals(wfo.u())) {
                                    booleanValue = (boolean)lta.b(wfo);
                                }
                                inf2 = inf;
                                if (!booleanValue) {
                                    break Label_0390;
                                }
                            }
                            else {
                                inf2 = inf;
                                if ((g.x & 0x40000) != 0x0) {
                                    inf2 = inf;
                                    if (g instanceof v98) {
                                        hgf hgf = ((v98)g).K;
                                        int n = 0;
                                        while (hgf != null) {
                                            v98 v98 = (v98)g;
                                            inf inf3 = inf;
                                            int n2 = n;
                                            if ((hgf.x & 0x40000) != 0x0) {
                                                n2 = n + 1;
                                                if (n2 == 1) {
                                                    v98 = (v98)hgf;
                                                    inf3 = inf;
                                                }
                                                else {
                                                    inf inf4;
                                                    if ((inf4 = inf) == null) {
                                                        inf4 = new inf(0, (Object[])new hgf[16]);
                                                    }
                                                    v98 v99;
                                                    if ((v99 = (v98)g) != null) {
                                                        inf4.b((Object)g);
                                                        v99 = null;
                                                    }
                                                    inf4.b((Object)hgf);
                                                    inf3 = inf4;
                                                    v98 = v99;
                                                }
                                            }
                                            hgf = hgf.A;
                                            g = v98;
                                            inf = inf3;
                                            n = n2;
                                        }
                                        inf2 = inf;
                                        if (n == 1) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            g = soh.G(inf2);
                            inf = inf2;
                        }
                    }
                }
            }
            layoutNode = layoutNode.G();
            if (layoutNode != null) {
                final rxf z3 = layoutNode.Z;
                if (z3 != null) {
                    o2 = z3.A;
                    continue;
                }
            }
            o2 = null;
        }
    }
    
    public static final void a(igf v, final gva gva, final int n) {
        gva.i0(986503592);
        final int n2 = n | 0x6;
        if (gva.W(n2 & 0x1, (n2 & 0x3) != 0x2)) {
            final nh9 nh9 = new nh9((eu4)new ClaudeApiError$AuthError(yt4.y, (String)null, (String)null, (String)null, (Integer)null, (String)null, (String)null, (Boolean)null, (String)null, (String)null, 1022));
            v = (igf)fgf.v;
            vp7.f((xh9)nh9, v, (bi9)null, (String)null, (jta)null, gva, 56, 28);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new hq(v, n, (byte)1);
        }
    }
    
    public static final void a0(final wfo wfo, final lta lta) {
        final hgf hgf = (hgf)wfo;
        if (!hgf.v.I) {
            gac.c("visitAncestors called on an unattached node");
        }
        Object z = hgf.v.z;
        LayoutNode layoutNode = soh.L(wfo);
    Label_0431:
        while (layoutNode != null) {
            if ((((hgf)layoutNode.Z.B).y & 0x40000) != 0x0) {
                for (Object z2 = z; z2 != null; z2 = ((hgf)z2).z) {
                    if ((((hgf)z2).x & 0x40000) != 0x0) {
                        hgf g = (hgf)z2;
                        inf inf = null;
                        while (g != null) {
                            final boolean b = g instanceof wfo;
                            final boolean b2 = true;
                            inf inf2;
                            if (b) {
                                final wfo wfo2 = (wfo)g;
                                int booleanValue = b2 ? 1 : 0;
                                if (mlc.q(wfo.u(), wfo2.u())) {
                                    booleanValue = (b2 ? 1 : 0);
                                    if (wfo.getClass() == wfo2.getClass()) {
                                        booleanValue = (((boolean)lta.b(wfo2)) ? 1 : 0);
                                    }
                                }
                                inf2 = inf;
                                if (booleanValue == 0) {
                                    break Label_0431;
                                }
                            }
                            else {
                                inf2 = inf;
                                if ((g.x & 0x40000) != 0x0) {
                                    inf2 = inf;
                                    if (g instanceof v98) {
                                        hgf hgf2 = ((v98)g).K;
                                        int n = 0;
                                        while (hgf2 != null) {
                                            v98 v98 = (v98)g;
                                            inf inf3 = inf;
                                            int n2 = n;
                                            if ((hgf2.x & 0x40000) != 0x0) {
                                                n2 = n + 1;
                                                if (n2 == 1) {
                                                    v98 = (v98)hgf2;
                                                    inf3 = inf;
                                                }
                                                else {
                                                    inf inf4;
                                                    if ((inf4 = inf) == null) {
                                                        inf4 = new inf(0, (Object[])new hgf[16]);
                                                    }
                                                    v98 v99;
                                                    if ((v99 = (v98)g) != null) {
                                                        inf4.b((Object)g);
                                                        v99 = null;
                                                    }
                                                    inf4.b((Object)hgf2);
                                                    inf3 = inf4;
                                                    v98 = v99;
                                                }
                                            }
                                            hgf2 = hgf2.A;
                                            g = v98;
                                            inf = inf3;
                                            n = n2;
                                        }
                                        inf2 = inf;
                                        if (n == 1) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            g = soh.G(inf2);
                            inf = inf2;
                        }
                    }
                }
            }
            layoutNode = layoutNode.G();
            if (layoutNode != null) {
                final rxf z3 = layoutNode.Z;
                if (z3 != null) {
                    z = z3.A;
                    continue;
                }
            }
            z = null;
        }
    }
    
    public static final void b(igf v, final float n, final gva gva, final int n2) {
        gva.i0(1852513795);
        int n4;
        final int n3 = n4 = (n2 | 0x6);
        if ((n2 & 0x30) == 0x0) {
            int n5;
            if (gva.c(n)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final cy4 a = qy4.a;
            final mnn mnn = (mnn)((uy4)qy4.c(gva).k.v).x;
            final String s = soh.S(2131755132, gva);
            final long b = mnn.a.b;
            tsf.s(b);
            final long q = tsf.Q(vnn.c(b) * n, b & 0xFF00000000L);
            long n6 = mnn.b.c;
            final long n7 = 0xFF00000000L & n6;
            if (n7 != 0L) {
                tsf.s(n6);
                n6 = tsf.Q(vnn.c(n6) * n, n7);
            }
            final mnn a2 = mnn.a(mnn, 0L, q, zoa.z, (soa)null, (una)null, 0L, (wgn)null, 0, n6, (idd)null, 0, 16646137);
            final kfn kfn = new kfn(3);
            v = (igf)fgf.v;
            lmn.b(s, v, 0L, 0L, (zoa)null, (una)null, 0L, (wgn)null, kfn, 0L, 0, false, 0, 0, (lta)null, a2, gva, n4 << 3 & 0x70, 0, 130044);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new if0(v, n, n2);
        }
    }
    
    public static final void b0(hgf v, final String s, final lta lta) {
        if (!v.v.I) {
            gac.c("visitSubtreeIf called on an unattached node");
        }
        final inf inf = new inf(0, (Object[])new hgf[16]);
        v = v.v;
        final hgf a = v.A;
        if (a == null) {
            soh.i(inf, v);
        }
        else {
            inf.b((Object)a);
        }
    Label_0416:
        while (true) {
            final int x = inf.x;
            if (x == 0) {
                break;
            }
            final hgf hgf = (hgf)inf.l(x - 1);
            if ((hgf.y & 0x40000) != 0x0) {
                for (hgf a2 = hgf; a2 != null && a2.I; a2 = a2.A) {
                    if ((a2.x & 0x40000) != 0x0) {
                        hgf g = a2;
                        inf inf2 = null;
                        while (g != null) {
                            inf inf3;
                            if (g instanceof wfo) {
                                final wfo wfo = (wfo)g;
                                vfo v2;
                                if (s.equals(wfo.u())) {
                                    v2 = (vfo)lta.b(wfo);
                                }
                                else {
                                    v2 = vfo.v;
                                }
                                if (v2 == vfo.x) {
                                    break Label_0416;
                                }
                                if (v2 == vfo.w) {
                                    continue Label_0416;
                                }
                                inf3 = inf2;
                            }
                            else {
                                inf3 = inf2;
                                if ((g.x & 0x40000) != 0x0) {
                                    inf3 = inf2;
                                    if (g instanceof v98) {
                                        hgf hgf2 = ((v98)g).K;
                                        int n = 0;
                                        while (hgf2 != null) {
                                            hgf hgf3 = g;
                                            inf inf4 = inf2;
                                            int n2 = n;
                                            if ((hgf2.x & 0x40000) != 0x0) {
                                                n2 = n + 1;
                                                if (n2 == 1) {
                                                    hgf3 = hgf2;
                                                    inf4 = inf2;
                                                }
                                                else {
                                                    inf inf5;
                                                    if ((inf5 = inf2) == null) {
                                                        inf5 = new inf(0, (Object[])new hgf[16]);
                                                    }
                                                    if ((v = g) != null) {
                                                        inf5.b((Object)g);
                                                        v = null;
                                                    }
                                                    inf5.b((Object)hgf2);
                                                    inf4 = inf5;
                                                    hgf3 = v;
                                                }
                                            }
                                            hgf2 = hgf2.A;
                                            g = hgf3;
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
                            g = soh.G(inf3);
                            inf2 = inf3;
                        }
                    }
                }
            }
            soh.i(inf, hgf);
        }
    }
    
    public static final void c(final og0 og0, final igf igf, final mnn mnn, final lta lta, int hashCode, final boolean b, int n, int n2, Map v, final gva gva, final int n3, final int n4, final int n5) {
        gva.i0(-1343466571);
        int n7;
        if ((n3 & 0x6) == 0x0) {
            int n6;
            if (gva.f((Object)og0)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n7 = (n6 | n3);
        }
        else {
            n7 = n3;
        }
        final int n8 = n5 & 0x2;
        int n11 = 0;
        Label_0113: {
            int n9;
            if (n8 != 0) {
                n9 = (n7 | 0x30);
            }
            else {
                n9 = n7;
                if ((n3 & 0x30) == 0x0) {
                    int n10;
                    if (gva.f((Object)igf)) {
                        n10 = 32;
                    }
                    else {
                        n10 = 16;
                    }
                    n11 = (n7 | n10);
                    break Label_0113;
                }
            }
            n11 = n9;
        }
        if ((n3 & 0x180) == 0x0) {
            int n12;
            if (gva.f((Object)mnn)) {
                n12 = 256;
            }
            else {
                n12 = 128;
            }
            n11 |= n12;
        }
        final int n13 = n5 & 0x8;
        int n16 = 0;
        Label_0226: {
            int n14;
            if (n13 != 0) {
                n14 = (n11 | 0xC00);
            }
            else {
                n14 = n11;
                if ((n3 & 0xC00) == 0x0) {
                    int n15;
                    if (gva.h((Object)lta)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n11 | n15);
                    break Label_0226;
                }
            }
            n16 = n14;
        }
        lta lta2 = lta;
        final int n17 = n5 & 0x10;
        int n20 = 0;
        Label_0298: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((n3 & 0x6000) == 0x0) {
                    int n19;
                    if (gva.d(hashCode)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0298;
                }
            }
            n20 = n18;
        }
        int n21 = hashCode;
        if ((0x30000 & n3) == 0x0) {
            if (gva.g(b)) {
                hashCode = 131072;
            }
            else {
                hashCode = 65536;
            }
            n20 |= hashCode;
        }
        final int n22 = n5 & 0x40;
        if (n22 != 0) {
            hashCode = (n20 | 0x180000);
        }
        else {
            hashCode = n20;
            if ((n3 & 0x180000) == 0x0) {
                if (gva.d(n)) {
                    hashCode = 1048576;
                }
                else {
                    hashCode = 524288;
                }
                hashCode |= n20;
            }
        }
        final int n23 = n5 & 0x80;
        int n24;
        if (n23 != 0) {
            n24 = (hashCode | 0xC00000);
        }
        else {
            n24 = hashCode;
            if ((n3 & 0xC00000) == 0x0) {
                int n25;
                if (gva.d(n2)) {
                    n25 = 8388608;
                }
                else {
                    n25 = 4194304;
                }
                n24 = (hashCode | n25);
            }
        }
        final int n26 = n5 & 0x100;
        if (n26 != 0) {
            hashCode = (n24 | 0x6000000);
        }
        else {
            hashCode = n24;
            if ((n3 & 0x6000000) == 0x0) {
                if (gva.h((Object)v)) {
                    hashCode = 67108864;
                }
                else {
                    hashCode = 33554432;
                }
                hashCode |= n24;
            }
        }
        final int n27 = hashCode | 0x30000000;
        if ((n5 & 0x400) != 0x0) {
            hashCode = (n4 | 0x6);
        }
        else if ((n4 & 0x6) == 0x0) {
            boolean b2;
            if ((n4 & 0x8) == 0x0) {
                b2 = gva.f((Object)null);
            }
            else {
                b2 = gva.h((Object)null);
            }
            if (b2) {
                hashCode = 4;
            }
            else {
                hashCode = 2;
            }
            hashCode |= n4;
        }
        else {
            hashCode = n4;
        }
        Object v2;
        if (gva.W(n27 & 0x1, (n27 & 0x12492493) != 0x12492492 || (hashCode & 0x3) != 0x2)) {
            v2 = igf;
            if (n8 != 0) {
                v2 = fgf.v;
            }
            if (n13 != 0) {
                lta2 = null;
            }
            if (n17 != 0) {
                n21 = 1;
            }
            if (n22 != 0) {
                n = Integer.MAX_VALUE;
            }
            if (n23 != 0) {
                n2 = 1;
            }
            if (n26 != 0) {
                v = (Map)s89.v;
            }
            xp7.a0(n2, n);
            final frk frk = (frk)gva.j((sei)hrk.a);
            final cib a = bi6.a;
            iqk iqk2;
            if (frk != null) {
                gva.g0(1588272647);
                final long b3 = ((gnn)gva.j((sei)hnn.a)).b;
                final n9k n9k = new n9k((lta)new ot1((byte)16), (zta)new n7((Object)frk, (byte)13));
                final boolean h = gva.h((Object)frk);
                Object r = gva.R();
                if (h || r == a) {
                    r = new gy1(frk, (byte)0);
                    gva.q0(r);
                }
                final long longValue = ((Number)mlc.b0(new Object[] { frk }, (m9k)n9k, (jta)r, gva, 0)).longValue();
                final boolean e = gva.e(longValue);
                final boolean f = gva.f((Object)frk);
                final boolean e2 = gva.e(b3);
                final Object r2 = gva.R();
                iqk iqk;
                if ((e | f | e2) || (iqk = (iqk)r2) == a) {
                    iqk = new iqk(longValue, frk, b3);
                    gva.q0((Object)iqk);
                }
                iqk2 = iqk;
                gva.q(false);
            }
            else {
                gva.g0(1588900273);
                gva.q(false);
                iqk2 = null;
            }
            final yog a2 = rg0.a;
            final int length = og0.w.length();
            final List v3 = og0.v;
            boolean b4 = false;
            Label_1145: {
                if (v3 != null) {
                    for (int size = ((Collection)v3).size(), i = 0; i < size; ++i) {
                        final ng0 ng0 = (ng0)v3.get(i);
                        if (ng0.a instanceof sxm && "androidx.compose.foundation.text.inlineContent".equals(ng0.d) && pg0.c(0, length, ng0.b, ng0.c)) {
                            b4 = true;
                            break Label_1145;
                        }
                    }
                }
                b4 = false;
            }
            final boolean d = og0.d(og0.w.length());
            final tna tna = (tna)gva.j((sei)hm6.k);
            if (!b4 && !d) {
                gva.g0(1589148149);
                qy1.a(og0, mnn, tna, (List)null, b, gva);
                final igf y = Y((igf)v2, og0, mnn, lta2, n21, b, n, n2, tna, null, null, iqk2, null, null);
                final qj2 c = qj2.c;
                hashCode = Long.hashCode(gva.T);
                final igf b5 = ien.B(gva, y);
                final e3h l = gva.l();
                vh6.e.getClass();
                gva.k0();
                if (gva.S) {
                    gva.k((jta)LayoutNode.n0);
                }
                else {
                    gva.t0();
                }
                k8e.P((zta)awp.A, gva, c);
                k8e.P((zta)awp.z, gva, l);
                k8e.C(gva);
                k8e.P((zta)awp.y, gva, b5);
                k8e.P((zta)awp.B, gva, hashCode);
                gva.q(true);
                gva.q(false);
            }
            else {
                gva.g0(1590195670);
                final boolean b6 = (n27 & 0xE) == 0x4;
                final Object r3 = gva.R();
                Object q;
                if (b6 || (q = r3) == a) {
                    q = Q(og0);
                    gva.q0(q);
                }
                final bnf bnf = (bnf)q;
                final og0 og2 = (og0)((xom)bnf).getValue();
                final boolean f2 = gva.f((Object)bnf);
                final Object r4 = gva.R();
                Object o;
                if (f2 || (o = r4) == a) {
                    o = new jy1(bnf, (byte)0);
                    gva.q0(o);
                }
                final lta lta3 = (lta)o;
                final int n28 = n27 << 6;
                h((igf)v2, og2, lta2, b4, v, mnn, n21, b, n, n2, tna, iqk2, lta3, null, gva, (n27 >> 3 & 0x38E) | (n27 >> 12 & 0xE000) | (n27 << 9 & 0x70000) | (0x380000 & n28) | (0x1C00000 & n28) | (0xE000000 & n28) | (n28 & 0x70000000), (n27 >> 21 & 0x380) | (hashCode << 12 & 0xE000));
                gva.q(false);
            }
            hashCode = n;
        }
        else {
            gva.Z();
            v2 = igf;
            hashCode = n;
        }
        final b0j v4 = gva.v();
        if (v4 != null) {
            v4.d = (zta)new ky1(og0, (igf)v2, mnn, lta2, n21, b, hashCode, n2, v, n3, n4, n5);
        }
    }
    
    public static final void c0(final wfo wfo, final lta lta) {
        final hgf hgf = (hgf)wfo;
        if (!hgf.v.I) {
            gac.c("visitSubtreeIf called on an unattached node");
        }
        final inf inf = new inf(0, (Object[])new hgf[16]);
        final hgf v = hgf.v;
        final hgf a = v.A;
        if (a == null) {
            soh.i(inf, v);
        }
        else {
            inf.b((Object)a);
        }
    Label_0454:
        while (true) {
            final int x = inf.x;
            if (x == 0) {
                break;
            }
            final hgf hgf2 = (hgf)inf.l(x - 1);
            if ((hgf2.y & 0x40000) != 0x0) {
                for (hgf a2 = hgf2; a2 != null && a2.I; a2 = a2.A) {
                    if ((a2.x & 0x40000) != 0x0) {
                        hgf g = a2;
                        inf inf2 = null;
                        while (g != null) {
                            inf inf3;
                            if (g instanceof wfo) {
                                final wfo wfo2 = (wfo)g;
                                vfo v2;
                                if (mlc.q(wfo.u(), wfo2.u()) && wfo.getClass() == wfo2.getClass()) {
                                    v2 = (vfo)lta.b(wfo2);
                                }
                                else {
                                    v2 = vfo.v;
                                }
                                if (v2 == vfo.x) {
                                    break Label_0454;
                                }
                                if (v2 == vfo.w) {
                                    continue Label_0454;
                                }
                                inf3 = inf2;
                            }
                            else {
                                inf3 = inf2;
                                if ((g.x & 0x40000) != 0x0) {
                                    inf3 = inf2;
                                    if (g instanceof v98) {
                                        hgf hgf3 = ((v98)g).K;
                                        int n = 0;
                                        while (hgf3 != null) {
                                            hgf hgf4 = g;
                                            inf inf4 = inf2;
                                            int n2 = n;
                                            if ((hgf3.x & 0x40000) != 0x0) {
                                                n2 = n + 1;
                                                if (n2 == 1) {
                                                    hgf4 = hgf3;
                                                    inf4 = inf2;
                                                }
                                                else {
                                                    inf inf5;
                                                    if ((inf5 = inf2) == null) {
                                                        inf5 = new inf(0, (Object[])new hgf[16]);
                                                    }
                                                    v98 v3;
                                                    if ((v3 = (v98)g) != null) {
                                                        inf5.b((Object)g);
                                                        v3 = null;
                                                    }
                                                    inf5.b((Object)hgf3);
                                                    inf4 = inf5;
                                                    hgf4 = v3;
                                                }
                                            }
                                            hgf3 = hgf3.A;
                                            g = hgf4;
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
                            g = soh.G(inf3);
                            inf2 = inf3;
                        }
                    }
                }
            }
            soh.i(inf, hgf2);
        }
    }
    
    public static final void d(final String s, igf d, mnn mnn, lta v, int n, boolean b, int n2, int n3, rfn rfn, final gva gva, final int n4, final int n5) {
        gva.i0(-1040751001);
        int n7;
        if ((n4 & 0x6) == 0x0) {
            int n6;
            if (gva.f((Object)s)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n7 = (n6 | n4);
        }
        else {
            n7 = n4;
        }
        final int n8 = n5 & 0x2;
        int n11 = 0;
        Label_0113: {
            int n9;
            if (n8 != 0) {
                n9 = (n7 | 0x30);
            }
            else {
                n9 = n7;
                if ((n4 & 0x30) == 0x0) {
                    int n10;
                    if (gva.f((Object)d)) {
                        n10 = 32;
                    }
                    else {
                        n10 = 16;
                    }
                    n11 = (n7 | n10);
                    break Label_0113;
                }
            }
            n11 = n9;
        }
        final int n12 = n5 & 0x4;
        int n15 = 0;
        Label_0181: {
            int n13;
            if (n12 != 0) {
                n13 = (n11 | 0x180);
            }
            else {
                n13 = n11;
                if ((n4 & 0x180) == 0x0) {
                    int n14;
                    if (gva.f((Object)mnn)) {
                        n14 = 256;
                    }
                    else {
                        n14 = 128;
                    }
                    n15 = (n11 | n14);
                    break Label_0181;
                }
            }
            n15 = n13;
        }
        final int n16 = n5 & 0x8;
        int n19 = 0;
        Label_0250: {
            int n17;
            if (n16 != 0) {
                n17 = (n15 | 0xC00);
            }
            else {
                n17 = n15;
                if ((n4 & 0xC00) == 0x0) {
                    int n18;
                    if (gva.h((Object)v)) {
                        n18 = 2048;
                    }
                    else {
                        n18 = 1024;
                    }
                    n19 = (n15 | n18);
                    break Label_0250;
                }
            }
            n19 = n17;
        }
        final int n20 = n5 & 0x10;
        int n23 = 0;
        Label_0320: {
            int n21;
            if (n20 != 0) {
                n21 = (n19 | 0x6000);
            }
            else {
                n21 = n19;
                if ((n4 & 0x6000) == 0x0) {
                    int n22;
                    if (gva.d(n)) {
                        n22 = 16384;
                    }
                    else {
                        n22 = 8192;
                    }
                    n23 = (n19 | n22);
                    break Label_0320;
                }
            }
            n23 = n21;
        }
        final int n24 = n5 & 0x20;
        int n25;
        if (n24 != 0) {
            n25 = (n23 | 0x30000);
        }
        else {
            n25 = n23;
            if ((n4 & 0x30000) == 0x0) {
                int n26;
                if (gva.g(b)) {
                    n26 = 131072;
                }
                else {
                    n26 = 65536;
                }
                n25 = (n23 | n26);
            }
        }
        final int n27 = n5 & 0x40;
        int n28;
        if (n27 != 0) {
            n28 = (n25 | 0x180000);
        }
        else {
            n28 = n25;
            if ((n4 & 0x180000) == 0x0) {
                int n29;
                if (gva.d(n2)) {
                    n29 = 1048576;
                }
                else {
                    n29 = 524288;
                }
                n28 = (n25 | n29);
            }
        }
        final int n30 = n5 & 0x80;
        int n31;
        if (n30 != 0) {
            n31 = (n28 | 0xC00000);
        }
        else {
            n31 = n28;
            if ((n4 & 0xC00000) == 0x0) {
                int n32;
                if (gva.d(n3)) {
                    n32 = 8388608;
                }
                else {
                    n32 = 4194304;
                }
                n31 = (n28 | n32);
            }
        }
        final int n33 = n31 | 0x6000000;
        final int n34 = n5 & 0x200;
        int n35;
        if (n34 != 0) {
            n35 = (n31 | 0x36000000);
        }
        else {
            n35 = n33;
            if ((0x30000000 & n4) == 0x0) {
                boolean b2;
                if ((0x40000000 & n4) == 0x0) {
                    b2 = gva.f((Object)rfn);
                }
                else {
                    b2 = gva.h((Object)rfn);
                }
                int n36;
                if (b2) {
                    n36 = 536870912;
                }
                else {
                    n36 = 268435456;
                }
                n35 = (n33 | n36);
            }
        }
        int f;
        if ((n35 & 0x12492493) != 0x12492492) {
            f = 1;
        }
        else {
            f = 0;
        }
        Label_1410: {
            if (!gva.W(n35 & 0x1, (boolean)(f != 0))) {
                break Label_1410;
            }
            Object v2 = d;
            if (n8 != 0) {
                v2 = fgf.v;
            }
            if (n12 != 0) {
                d = (igf)mnn.d;
            }
            else {
                d = (igf)mnn;
            }
            iqk iqk = null;
            if (n16 != 0) {
                v = null;
            }
            if (n20 != 0) {
                n = 1;
            }
            if (n24 != 0) {
                b = true;
            }
            if (n27 != 0) {
                n2 = Integer.MAX_VALUE;
            }
            if (n30 != 0) {
                n3 = 1;
            }
            if (n34 != 0) {
                rfn = null;
            }
            xp7.a0(n3, n2);
            Object b3 = gva.j((sei)hrk.a);
            if (b3 != null) {
                gva.g0(356427477);
                final long b4 = ((gnn)gva.j((sei)hnn.a)).b;
                final n9k n9k = new n9k((lta)new ot1((byte)16), (zta)new n7(b3, (byte)13));
                final boolean h = gva.h(b3);
                final Object r = gva.R();
                final cib a = bi6.a;
                Object o;
                if (h || (o = r) == a) {
                    o = new gy1((frk)b3, (byte)1);
                    gva.q0(o);
                }
                final long longValue = ((Number)mlc.b0(new Object[] { b3 }, (m9k)n9k, (jta)o, gva, 0)).longValue();
                final boolean e = gva.e(longValue);
                f = (gva.f(b3) ? 1 : 0);
                final boolean e2 = gva.e(b4);
                final Object o2 = gva.R();
                iqk iqk2;
                if (((e ? 1 : 0) | f | (e2 ? 1 : 0)) || (iqk2 = (iqk)o2) == a) {
                    iqk2 = new iqk(longValue, (frk)b3, b4);
                    gva.q0((Object)iqk2);
                }
                iqk = iqk2;
                gva.q(false);
            }
            else {
                gva.g0(357055103);
                gva.q(false);
            }
            mnn = (mnn)gva.j((sei)hm6.k);
            final Executor executor = (Executor)gva.j((sei)qy1.a);
            Label_1157: {
                if (executor == null || !qy1.b(s.length())) {
                    break Label_1157;
                }
                gva.g0(-1250263182);
                final qzc qzc = (qzc)gva.j((sei)hm6.n);
                final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
                b3 = mnn;
                Object o2 = d;
                f = (b ? 1 : 0);
                while (true) {
                    try {
                        try {
                            final py1 py1 = new py1((mnn)d, qzc, s, xc8, (tna)mnn, b);
                            b3 = mnn;
                            o2 = d;
                            f = (b ? 1 : 0);
                            executor.execute((Runnable)py1);
                        }
                        catch (final RejectedExecutionException ex) {}
                        gva.q(false);
                    Label_1422_Outer:
                        while (true) {
                            igf igf;
                            if (iqk != null || v != null || rfn != null) {
                                gva.g0(357432497);
                                igf = Y((igf)v2, new og0(s), (mnn)d, v, n, b, n2, n3, (tna)gva.j((sei)hm6.k), null, null, iqk, null, rfn);
                                gva.q(false);
                            }
                            else {
                                gva.g0(358076243);
                                gva.q(false);
                                igf = ((igf)v2).E((igf)new TextStringSimpleElement(s, (mnn)d, (tna)mnn, n, b, n2, n3));
                            }
                            o2 = qj2.c;
                            final int hashCode = Long.hashCode(gva.T);
                            b3 = ien.B(gva, igf);
                            final e3h l = gva.l();
                            vh6.e.getClass();
                            gva.k0();
                            if (gva.S) {
                                gva.k((jta)LayoutNode.n0);
                            }
                            else {
                                gva.t0();
                            }
                            k8e.P((zta)awp.A, gva, o2);
                            k8e.P((zta)awp.z, gva, l);
                            k8e.C(gva);
                            k8e.P((zta)awp.y, gva, b3);
                            k8e.P((zta)awp.B, gva, hashCode);
                            gva.q(true);
                            lta lta = v;
                            while (true) {
                                v = (lta)gva.v();
                                if (v != null) {
                                    ((b0j)v).d = (zta)new iy1(s, (igf)v2, (mnn)d, lta, n, b, n2, n3, rfn, n4, n5);
                                }
                                return;
                                gva.Z();
                                v2 = d;
                                d = (igf)mnn;
                                lta = v;
                                continue;
                            }
                            gva.g0(-1248455541);
                            gva.q(false);
                            continue Label_1422_Outer;
                        }
                    }
                    catch (final RejectedExecutionException ex2) {
                        mnn = (mnn)b3;
                        d = (igf)o2;
                        b = (f != 0);
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static b6p d0(final int n, final String s) {
        return new b6p(new mec(0, 0, 0, 0), s);
    }
    
    public static final void e(final lh0 lh0, final String s, igf igf, d93 d93, long a, final gva gva, final int n, final int n2) {
        gva.i0(57236726);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)lh0)) {
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
        int n5 = n4;
        if ((n & 0x30) == 0x0) {
            int n6;
            if (gva.f((Object)s)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        final int n7 = n2 & 0x4;
        int n8;
        if (n7 != 0) {
            n8 = (n5 | 0x180);
        }
        else {
            n8 = n5;
            if ((n & 0x180) == 0x0) {
                int n9;
                if (gva.f((Object)igf)) {
                    n9 = 256;
                }
                else {
                    n9 = 128;
                }
                n8 = (n5 | n9);
            }
        }
        final int n10 = n2 & 0x8;
        int n11;
        if (n10 != 0) {
            n11 = (n8 | 0xC00);
        }
        else {
            n11 = n8;
            if ((n & 0xC00) == 0x0) {
                int ordinal;
                if (d93 == null) {
                    ordinal = -1;
                }
                else {
                    ordinal = ((Enum)d93).ordinal();
                }
                int n12;
                if (gva.d(ordinal)) {
                    n12 = 2048;
                }
                else {
                    n12 = 1024;
                }
                n11 = (n8 | n12);
            }
        }
        int n13 = n11;
        if ((n & 0x6000) == 0x0) {
            int n14;
            if ((n2 & 0x10) == 0x0 && gva.e(a)) {
                n14 = 16384;
            }
            else {
                n14 = 8192;
            }
            n13 = (n11 | n14);
        }
        if (gva.W(n13 & 0x1, (n13 & 0x2493) != 0x2492)) {
            gva.b0();
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n15 = n13;
                if ((n2 & 0x10) != 0x0) {
                    n15 = (n13 & 0xFFFF1FFF);
                }
                n13 = n15;
            }
            else {
                Object v = igf;
                if (n7 != 0) {
                    v = fgf.v;
                }
                d93 y;
                if (n10 != 0) {
                    y = d93.y;
                }
                else {
                    y = d93;
                }
                if ((n2 & 0x10) != 0x0) {
                    a = ((j86)gva.j((sei)dx6.a)).a;
                    n13 &= 0xFFFF1FFF;
                    d93 = y;
                    igf = (igf)v;
                }
                else {
                    d93 = y;
                    igf = (igf)v;
                }
            }
            gva.r();
            e0c.b(a.a(lh0, gva), s, androidx.compose.foundation.layout.b.p(igf, d93.v), a, gva, (n13 & 0x70) | 0x8 | (n13 >> 3 & 0x1C00), 0);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new c93(lh0, s, igf, d93, a, n, n2);
        }
    }
    
    public static final o4c e0(int n, final gva gva) {
        final Context context = (Context)gva.j((sei)q50.b);
        final Resources resources = (Resources)gva.j((sei)q50.c);
        final Resources$Theme theme = context.getTheme();
        final Configuration configuration = resources.getConfiguration();
        final boolean d = gva.d(n);
        final boolean f = gva.f((Object)resources);
        final boolean f2 = gva.f((Object)theme);
        final boolean f3 = gva.f((Object)configuration);
        final Object r = gva.R();
        o4c a;
        if ((f3 | (d | f | f2)) || (a = (o4c)r) == bi6.a) {
            final TypedValue typedValue = new TypedValue();
            resources.getValue(n, typedValue, true);
            XmlResourceParser xml;
            for (xml = resources.getXml(n), n = ((XmlPullParser)xml).next(); n != 2 && n != 1; n = ((XmlPullParser)xml).next()) {}
            if (n != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            a = N(theme, resources, xml, typedValue.changingConfigurations).a;
            gva.q0((Object)a);
        }
        return a;
    }
    
    public static final void f(final py4 py4, final igf igf, final float n, final gva gva, final int n2) {
        final Integer value = 2131756466;
        gva.i0(-1590162582);
        int n4;
        if ((n2 & 0x6) == 0x0) {
            int n3;
            if (gva.d(((Enum)py4).ordinal())) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5;
        if (gva.f((Object)igf)) {
            n5 = 32;
        }
        else {
            n5 = 16;
        }
        final int n6 = n4 | n5;
        if (gva.W(n6 & 0x1, (n6 & 0x93) != 0x92)) {
            final int ordinal = ((Enum)py4).ordinal();
            yog yog;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            en9.r();
                            return;
                        }
                        yog = new yog((Object)2131231135, (Object)value);
                    }
                    else {
                        yog = new yog((Object)2131231137, (Object)2131756467);
                    }
                }
                else {
                    yog = new yog((Object)2131231136, (Object)value);
                }
            }
            else {
                yog = new yog((Object)2131231134, (Object)2131756465);
            }
            k8e.f(lw8.b(((Context)gva.j((sei)q50.b)).getDrawable(((Number)yog.v).intValue()), gva), soh.S(((Number)yog.w).intValue(), gva), androidx.compose.foundation.layout.b.p(igf, n), null, null, 0.0f, null, gva, 8, 120);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new oy4(py4, igf, n, n2);
        }
    }
    
    public static final void g(final pud pud, final float n, final WelcomeNotice welcomeNotice, igf igf, boolean b, final gva gva, final int n2, final int n3) {
        gva.i0(514909363);
        int n5;
        if ((n2 & 0x6) == 0x0) {
            int n4;
            if (gva.f((Object)pud)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n2);
        }
        else {
            n5 = n2;
        }
        int n6 = n5;
        if ((n2 & 0x30) == 0x0) {
            int n7;
            if (gva.c(n)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        int n8 = n6;
        if ((n2 & 0x180) == 0x0) {
            int ordinal;
            if (welcomeNotice == null) {
                ordinal = -1;
            }
            else {
                ordinal = ((Enum)welcomeNotice).ordinal();
            }
            int n9;
            if (gva.d(ordinal)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 = (n6 | n9);
        }
        final int n10 = n3 & 0x8;
        int n11;
        if (n10 != 0) {
            n11 = (n8 | 0xC00);
        }
        else {
            n11 = n8;
            if ((n2 & 0xC00) == 0x0) {
                int n12;
                if (gva.f((Object)igf)) {
                    n12 = 2048;
                }
                else {
                    n12 = 1024;
                }
                n11 = (n8 | n12);
            }
        }
        final int n13 = n3 & 0x10;
        int n14;
        if (n13 != 0) {
            n14 = (n11 | 0x6000);
        }
        else {
            n14 = n11;
            if ((n2 & 0x6000) == 0x0) {
                int n15;
                if (gva.g(b)) {
                    n15 = 16384;
                }
                else {
                    n15 = 8192;
                }
                n14 = (n11 | n15);
            }
        }
        if (gva.W(n14 & 0x1, (n14 & 0x2493) != 0x2492)) {
            final Object v = fgf.v;
            if (n10 != 0) {
                igf = (igf)v;
            }
            if (n13 != 0) {
                b = false;
            }
            final kb2 k = wab.K;
            final ev0 c = t08.c;
            final igf y = omo.Y(igf, 0.0f, 24.0f, 0.0f, 0.0f, 13);
            final v96 a = u96.a((jv0)c, (dx)k, gva, 54);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, y);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, a);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b2);
            Object o;
            if (b) {
                o = new a2d(1.0f, false);
            }
            else {
                o = v;
            }
            i(pud, lq6.W((igf)o, (bua)new jf0(n)), gva, n14 & 0xE);
            x90.l(gva, b.f((igf)v, 16.0f * n));
            b(null, n, gva, n14 & 0x70);
            if (welcomeNotice != null) {
                ge9.z(16.0f, -34477680, gva, gva, (fgf)v);
                final int ordinal2 = ((Enum)welcomeNotice).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        throw ge9.y(1384362895, gva, false);
                    }
                    gva.g0(1384369794);
                    a(null, gva, 0);
                    gva.q(false);
                }
                else {
                    gva.g0(1384365408);
                    vp7.g(soh.S(2131757419, gva), (igf)null, (bi9)null, (String)null, (jta)null, gva, 0, 30);
                    gva.q(false);
                }
                gva.q(false);
            }
            else {
                gva.g0(-34161511);
                gva.q(false);
            }
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new hf0(pud, n, welcomeNotice, igf, b, n2, n3);
        }
    }
    
    public static final void h(final igf igf, final og0 og0, final lta lta, final boolean b, final Map map, final mnn mnn, final int n, final boolean b2, final int n2, final int n3, final tna tna, final iqk iqk, final lta lta2, final rfn rfn, final gva gva, final int n4, final int n5) {
        gva.i0(-2118572703);
        int n7;
        if ((n4 & 0x6) == 0x0) {
            int n6;
            if (gva.f((Object)igf)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n7 = (n6 | n4);
        }
        else {
            n7 = n4;
        }
        int n8 = n7;
        if ((n4 & 0x30) == 0x0) {
            int n9;
            if (gva.f((Object)og0)) {
                n9 = 32;
            }
            else {
                n9 = 16;
            }
            n8 = (n7 | n9);
        }
        int n10 = n8;
        if ((n4 & 0x180) == 0x0) {
            int n11;
            if (gva.h((Object)lta)) {
                n11 = 256;
            }
            else {
                n11 = 128;
            }
            n10 = (n8 | n11);
        }
        final int n12 = 1024;
        int n13 = n10;
        if ((n4 & 0xC00) == 0x0) {
            int n14;
            if (gva.g(b)) {
                n14 = 2048;
            }
            else {
                n14 = 1024;
            }
            n13 = (n10 | n14);
        }
        final int n15 = 8192;
        int n16 = n13;
        if ((n4 & 0x6000) == 0x0) {
            int n17;
            if (gva.h((Object)map)) {
                n17 = 16384;
            }
            else {
                n17 = 8192;
            }
            n16 = (n13 | n17);
        }
        int n19;
        if ((0x30000 & n4) == 0x0) {
            int n18;
            if (gva.f((Object)mnn)) {
                n18 = 131072;
            }
            else {
                n18 = 65536;
            }
            n19 = (n16 | n18);
        }
        else {
            n19 = n16;
        }
        int n20 = n19;
        if ((n4 & 0x180000) == 0x0) {
            int n21;
            if (gva.d(n)) {
                n21 = 1048576;
            }
            else {
                n21 = 524288;
            }
            n20 = (n19 | n21);
        }
        int n22 = n20;
        if ((n4 & 0xC00000) == 0x0) {
            int n23;
            if (gva.g(b2)) {
                n23 = 8388608;
            }
            else {
                n23 = 4194304;
            }
            n22 = (n20 | n23);
        }
        int n24 = n22;
        if ((n4 & 0x6000000) == 0x0) {
            int n25;
            if (gva.d(n2)) {
                n25 = 67108864;
            }
            else {
                n25 = 33554432;
            }
            n24 = (n22 | n25);
        }
        int n26 = n24;
        if ((n4 & 0x30000000) == 0x0) {
            int n27;
            if (gva.d(n3)) {
                n27 = 536870912;
            }
            else {
                n27 = 268435456;
            }
            n26 = (n24 | n27);
        }
        int n29;
        if ((n5 & 0x6) == 0x0) {
            int n28;
            if (gva.h((Object)tna)) {
                n28 = 4;
            }
            else {
                n28 = 2;
            }
            n29 = (n5 | n28);
        }
        else {
            n29 = n5;
        }
        int n30 = n29;
        if ((n5 & 0x30) == 0x0) {
            int n31;
            if (gva.h((Object)iqk)) {
                n31 = 32;
            }
            else {
                n31 = 16;
            }
            n30 = (n29 | n31);
        }
        int n32 = n30;
        if ((n5 & 0x180) == 0x0) {
            int n33;
            if (gva.h((Object)null)) {
                n33 = 256;
            }
            else {
                n33 = 128;
            }
            n32 = (n30 | n33);
        }
        if ((n5 & 0xC00) == 0x0) {
            int n34 = n12;
            if (gva.h((Object)lta2)) {
                n34 = 2048;
            }
            n32 |= n34;
        }
        int n35 = n32;
        if ((n5 & 0x6000) == 0x0) {
            boolean b3;
            if ((0x8000 & n5) == 0x0) {
                b3 = gva.f((Object)rfn);
            }
            else {
                b3 = gva.h((Object)rfn);
            }
            int n36 = n15;
            if (b3) {
                n36 = 16384;
            }
            n35 = (n32 | n36);
        }
        if (gva.W(n26 & 0x1, (n26 & 0x12492493) != 0x12492492 || (n35 & 0x2493) != 0x2492)) {
            final boolean d = og0.d(og0.w.length());
            final String w = og0.w;
            final cib a = bi6.a;
            umn umn2;
            if (d) {
                gva.g0(145641571);
                final boolean b4 = (n26 & 0x70) == 0x20;
                final Object r = gva.R();
                umn umn;
                if (b4 || (umn = (umn)r) == a) {
                    umn = new umn(og0);
                    gva.q0((Object)umn);
                }
                umn2 = umn;
                gva.q(false);
            }
            else {
                gva.g0(145707228);
                gva.q(false);
                umn2 = null;
            }
            jta jta;
            if (og0.d(w.length())) {
                gva.g0(145905443);
                final boolean b5 = (n26 & 0x70) == 0x20;
                final boolean f = gva.f((Object)umn2);
                final Object r2 = gva.R();
                Object o;
                if ((b5 | f) || (o = r2) == a) {
                    o = new jd0((Object)umn2, (Object)og0, (byte)8);
                    gva.q0(o);
                }
                jta = (jta)o;
                gva.q(false);
            }
            else {
                gva.g0(146002721);
                final boolean b6 = (n26 & 0x70) == 0x20;
                final Object r3 = gva.R();
                Object o2;
                if (b6 || (o2 = r3) == a) {
                    o2 = new p1((Object)og0, (byte)7);
                    gva.q0(o2);
                }
                jta = (jta)o2;
                gva.q(false);
            }
            yog a4 = null;
            if (b) {
                Label_1246: {
                    if (map != null) {
                        final yog a2 = rg0.a;
                        if (!map.isEmpty()) {
                            final List c = og0.c(0, w.length(), "androidx.compose.foundation.text.inlineContent");
                            final ArrayList list = new ArrayList();
                            final ArrayList list2 = new ArrayList();
                            for (int size = ((Collection)c).size(), i = 0; i < size; ++i) {
                                final ng0 ng0 = (ng0)c.get(i);
                                final Object a3 = ng0.a;
                                final int c2 = ng0.c;
                                final int b7 = ng0.b;
                                final ybc ybc = (ybc)map.get(a3);
                                if (ybc != null) {
                                    list.add((Object)new ng0(b7, c2, (Object)ybc.b()));
                                    list2.add((Object)new ng0(b7, c2, (Object)ybc.a()));
                                }
                            }
                            a4 = new yog((Object)list, (Object)list2);
                            break Label_1246;
                        }
                    }
                    a4 = rg0.a;
                }
            }
            else {
                a4 = new yog((Object)null, (Object)null);
            }
            lta lta3 = null;
            final List list3 = (List)a4.v;
            final List list4 = (List)a4.w;
            bnf bnf;
            if (b) {
                gva.g0(146318828);
                Object o3;
                if ((o3 = gva.R()) == a) {
                    o3 = Q(null);
                    gva.q0(o3);
                }
                bnf = (bnf)o3;
                gva.q(false);
            }
            else {
                gva.g0(146406588);
                gva.q(false);
                bnf = null;
            }
            if (b) {
                gva.g0(146499837);
                final boolean f2 = gva.f((Object)bnf);
                final Object r4 = gva.R();
                Object o4;
                if (f2 || (o4 = r4) == a) {
                    o4 = new jy1(bnf, (byte)1);
                    gva.q0(o4);
                }
                lta3 = (lta)o4;
                gva.q(false);
            }
            else {
                gva.g0(146571260);
                gva.q(false);
            }
            qy1.a(og0, mnn, tna, list3, b2, gva);
            final og0 og2 = (og0)jta.a();
            final boolean h = gva.h((Object)umn2);
            final boolean b8 = (n26 & 0x380) == 0x100;
            final Object r5 = gva.R();
            Object o5;
            if ((h | b8) || (o5 = r5) == a) {
                o5 = new ly1(umn2, lta, (byte)0);
                gva.q0(o5);
            }
            final igf y = Y(igf, og2, mnn, (lta)o5, n, b2, n2, n3, tna, list3, lta3, iqk, lta2, rfn);
            Object o6;
            if (!b) {
                gva.g0(147779703);
                final boolean h2 = gva.h((Object)umn2);
                Object r6 = gva.R();
                if (h2 || r6 == a) {
                    r6 = new my1(umn2, (byte)0);
                    gva.q0(r6);
                }
                o6 = new qgd((jta)r6);
                gva.q(false);
            }
            else {
                gva.g0(147956465);
                final boolean h3 = gva.h((Object)umn2);
                final Object r7 = gva.R();
                Object o7;
                if (h3 || (o7 = r7) == a) {
                    o7 = new my1(umn2, (byte)1);
                    gva.q0(o7);
                }
                final jta jta2 = (jta)o7;
                final boolean f3 = gva.f((Object)bnf);
                final Object r8 = gva.R();
                Object o8;
                if (!f3 && r8 != a) {
                    o8 = r8;
                }
                else {
                    o8 = new ny1(bnf, (byte)0);
                    gva.q0(o8);
                }
                o6 = new t90((Object)jta2, (Object)o8, (byte)1);
                gva.q(false);
            }
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b9 = ien.B(gva, y);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, o6);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b9);
            if (umn2 == null) {
                gva.g0(-433557001);
            }
            else {
                gva.g0(-291080374);
                umn2.a(0, gva);
            }
            gva.q(false);
            if (list4 == null) {
                gva.g0(-433506223);
            }
            else {
                gva.g0(-433506222);
                rg0.a(og0, list4, gva, n26 >> 3 & 0xE);
            }
            gva.q(false);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new hy1(igf, og0, lta, b, map, mnn, n, b2, n2, n3, tna, iqk, lta2, rfn, n4, n5);
        }
    }
    
    public static final void i(final pud pud, final igf igf, final gva gva, final int n) {
        gva.i0(1568663381);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)pud)) {
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
            if (gva.f((Object)igf)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        final boolean b = false;
        while (true) {
            Label_0699: {
                if (!gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
                    gva.Z();
                    break Label_0699;
                }
                final String s = soh.S(2131757409, gva);
                final cy4 a = qy4.a;
                final long o = qy4.a(gva).O;
                final long c = qy4.a(gva).c;
                final cib a2 = bi6.a;
                if (pud != null) {
                    gva.g0(-1487970579);
                    gva.q(false);
                    final boolean booleanValue = (boolean)gva.j((sei)nec.a);
                    Object o2;
                    if ((o2 = gva.R()) == a2) {
                        float n6;
                        if (booleanValue) {
                            n6 = 181.0f;
                        }
                        else {
                            n6 = 0.0f;
                        }
                        o2 = zn2.a(n6);
                        gva.q0(o2);
                    }
                    final id0 id0 = (id0)o2;
                    if (!booleanValue) {
                        gva.g0(-1487541508);
                        final boolean b2 = (n4 & 0xE) == 0x4;
                        final boolean h = gva.h((Object)id0);
                        final Object r = gva.R();
                        Object o3;
                        if ((b2 | h) || (o3 = r) == a2) {
                            o3 = new oud(pud, id0, (f07)null);
                            gva.q0(o3);
                        }
                        mlc.f((zta)o3, gva, pud);
                        gva.q(false);
                    }
                    else {
                        gva.g0(-1486725619);
                        gva.q(false);
                    }
                    final int n7 = n4 & 0xE;
                    final boolean b3 = n7 == 4;
                    final Object r2 = gva.R();
                    Object b4;
                    if (b3 || (b4 = r2) == a2) {
                        b4 = r8m.b((jta)new nob((Object)id0, (Object)pud, (byte)14));
                        gva.q0(b4);
                    }
                    final xom xom = (xom)b4;
                    final boolean f = gva.f((Object)s);
                    final Object r3 = gva.R();
                    Object o4;
                    if (f || (o4 = r3) == a2) {
                        o4 = new jy4(s, (byte)10);
                        gva.q0(o4);
                    }
                    final igf b5 = wsk.b((lta)o4, igf, false);
                    boolean b6 = b;
                    if (n7 == 4) {
                        b6 = true;
                    }
                    final boolean f2 = gva.f((Object)xom);
                    final boolean e = gva.e(c);
                    final boolean e2 = gva.e(o);
                    final Object r4 = gva.R();
                    Object o5;
                    if ((f2 | b6 | e | e2) || (o5 = r4) == a2) {
                        o5 = new mud(pud, xom, c, o);
                        gva.q0(o5);
                    }
                    x90.l(gva, t08.F(b5, (lta)o5));
                    break Label_0699;
                }
                gva.g0(-1488060913);
                final boolean f3 = gva.f((Object)s);
                final Object r5 = gva.R();
                Object o6;
                if (f3 || (o6 = r5) == a2) {
                    o6 = new jy4(s, (byte)9);
                    gva.q0(o6);
                }
                x90.l(gva, wsk.b((lta)o6, igf, false));
                gva.q(false);
                final b0j v = gva.v();
                if (v == null) {
                    return;
                }
                final lud d = new lud(pud, igf, n, (byte)0);
                final b0j b0j = v;
                b0j.d = (zta)d;
                return;
            }
            final b0j v2 = gva.v();
            if (v2 != null) {
                final lud d = new lud(pud, igf, n, (byte)1);
                final b0j b0j = v2;
                continue;
            }
            break;
        }
    }
    
    public static final void j(cjo cjo, final gva gva, final int n) {
        gva.i0(-948803786);
        final int n2 = n | 0x2;
        while (true) {
            Label_0302: {
                if (!gva.W(n2 & 0x1, (n2 & 0x3) != 0x2)) {
                    gva.Z();
                    break Label_0302;
                }
                gva.b0();
                final cib a = bi6.a;
                if ((n & 0x1) != 0x0 && !gva.C()) {
                    gva.Z();
                }
                else {
                    final odk a2 = ii8.a(gva);
                    final boolean f = gva.f((Object)null);
                    final boolean f2 = gva.f((Object)a2);
                    final Object r = gva.R();
                    if ((f | f2) || (cjo = (cjo)r) == a) {
                        cjo = (cjo)a2.d((Class)cjo.class, (emi)null);
                        gva.q0((Object)cjo);
                    }
                    cjo = cjo;
                }
                gva.r();
                final mzg mzg = (mzg)cjo.m.getValue();
                if (mzg != null) {
                    final boolean f3 = gva.f((Object)cjo);
                    final Object r2 = gva.R();
                    Object o;
                    if (f3 || (o = r2) == a) {
                        o = new f5i(cjo);
                        gva.q0(o);
                    }
                    final lta lta = (lta)o;
                    final int ordinal = ((Enum)mzg.c).ordinal();
                    int n3;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            en9.r();
                            return;
                        }
                        n3 = 2131756436;
                    }
                    else {
                        n3 = 2131758549;
                    }
                    vkq.a(mzg, lta, soh.S(n3, gva), gva, 0, 0);
                    break Label_0302;
                }
                final b0j v = gva.v();
                if (v == null) {
                    return;
                }
                final cvi d = new cvi(cjo, n, (byte)0);
                final b0j b0j = v;
                b0j.d = (zta)d;
                return;
            }
            final b0j v2 = gva.v();
            if (v2 != null) {
                final cvi d = new cvi(cjo, n, (byte)1);
                final b0j b0j = v2;
                continue;
            }
            break;
        }
    }
    
    public static final void k(final igf igf, cv8 cv8, wu8 wu8, final bv8 bv8, final llf llf, final gva gva, final int n) {
        gva.i0(1693656835);
        int n2;
        if (gva.f((Object)igf)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n | n2 | 0x490;
        wu8 wu9;
        bv8 bv10;
        if (gva.W(n3 & 0x1, (n3 & 0x2493) != 0x2492)) {
            gva.b0();
            cv8 cv9;
            bv8 i;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                cv9 = cv8;
                i = bv8;
            }
            else {
                final cv8 a = l8p.a;
                final b09 a2 = h8e.a;
                final r86 a3 = ((e8e)gva.j((sei)a2)).a;
                wu8 a4;
                if ((a4 = a3.a0) == null) {
                    a4 = new wu8(s86.c(a3, 23), s86.c(a3, 17), s86.c(a3, 17));
                    a3.a0 = a4;
                }
                final eql c = ((e8e)gva.j((sei)a2)).c;
                final bv8 j = c.i;
                cv9 = a;
                i = j;
                wu8 = a4;
                if (j == null) {
                    i = new bv8(vt4.G(c, 6), vt4.G(c, 12), vt4.G(c, 12));
                    c.i = i;
                    wu8 = a4;
                    cv9 = a;
                }
            }
            gva.r();
            final cib a5 = bi6.a;
            llf llf2;
            if (llf == null) {
                gva.g0(-1544621928);
                Object o;
                if ((o = gva.R()) == a5) {
                    o = oz1.g(gva);
                }
                llf2 = (llf)o;
                gva.q(false);
            }
            else {
                gva.g0(-188374497);
                gva.q(false);
                llf2 = llf;
            }
            final bnf p7 = xp7.p(llf2, gva, 0);
            Object o2;
            if ((o2 = gva.R()) == a5) {
                o2 = Q(Boolean.FALSE);
                gva.q0(o2);
            }
            final bnf bnf = (bnf)o2;
            final olb a6 = hic.a;
            final igf d = c5q.D(igf.E((igf)w9f.v), llf2);
            Object r;
            if ((r = gva.R()) == a5) {
                r = new ny1(bnf, (byte)10);
                gva.q0(r);
            }
            final jta jta = (jta)r;
            Object r2;
            if ((r2 = gva.R()) == a5) {
                r2 = new ny1(bnf, (byte)11);
                gva.q0(r2);
            }
            final igf b = p6n.b(d, (Object)llf2, (PointerInputEventHandler)new zu8(jta, (jta)r2));
            final boolean f = gva.f((Object)p7);
            final boolean f2 = gva.f((Object)i);
            final Object r3 = gva.R();
            Object o3;
            if ((f | f2) || (o3 = r3) == a5) {
                o3 = new rx1((Object)i, (Object)p7, bnf, (byte)12);
                gva.q0(o3);
            }
            final igf f3 = zrn.F(b, (lta)o3);
            final boolean f4 = gva.f((Object)p7);
            final boolean f5 = gva.f((Object)cv9);
            final Object r4 = gva.R();
            Object o4;
            if ((f4 | f5) || (o4 = r4) == a5) {
                o4 = new xu8((Object)cv9, (Object)p7, (Object)bnf, (byte)0);
                gva.q0(o4);
            }
            final igf w = lq6.W(f3, (bua)o4);
            final boolean f6 = gva.f((Object)p7);
            final boolean f7 = gva.f((Object)wu8);
            final Object r5 = gva.R();
            Object o5;
            if ((f6 | f7) || (o5 = r5) == a5) {
                o5 = new rx1((Object)wu8, (Object)p7, bnf, (byte)13);
                gva.q0(o5);
            }
            rj2.a(w7c.a(t08.E(w, (lta)o5), llf2, (a8c)utj.a(false, 0.0f, 0L, (aql)null, 255)), gva, 0);
            final bv8 bv9 = i;
            cv8 = cv9;
            wu9 = wu8;
            bv10 = bv9;
        }
        else {
            gva.Z();
            final wu8 wu10 = wu8;
            bv10 = bv8;
            wu9 = wu10;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new bv4(igf, cv8, wu9, bv10, llf, n);
        }
    }
    
    public static final void l(final zup zup, final pud pud, final WelcomeNotice welcomeNotice, final dng dng, final jta jta, igf o, final gva gva, final int n) {
        gva.i0(970048775);
        int n2;
        if (gva.f((Object)zup)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)pud)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int ordinal;
        if (welcomeNotice == null) {
            ordinal = -1;
        }
        else {
            ordinal = ((Enum)welcomeNotice).ordinal();
        }
        int n4;
        if (gva.d(ordinal)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.f((Object)dng)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        int n6;
        if (gva.h((Object)jta)) {
            n6 = 16384;
        }
        else {
            n6 = 8192;
        }
        final int n7 = n | n2 | n3 | n4 | n5 | n6 | 0x30000;
        if (gva.W(n7 & 0x1, (0x12493 & n7) != 0x12492)) {
            final boolean b = qs8.b((float)((Configuration)gva.j((sei)q50.a)).screenHeightDp, 480.0f) < 0;
            final mb2 y = wab.y;
            final igf w = vt4.w(omo.T((igf)androidx.compose.foundation.layout.b.c, dng), dng);
            final moe c = rj2.c((gx)y, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, w);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b2);
            o = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.w((igf)androidx.compose.foundation.layout.b.b, 0.0f, 600.0f, 1), 1.0f);
            if (b) {
                gva.g0(-1602182883);
                m(zup, pud, welcomeNotice, jta, (igf)o, gva, (n7 & 0xE) | 0x6000 | (n7 & 0x70) | (n7 & 0x380) | (n7 >> 3 & 0x1C00));
                gva.q(false);
            }
            else {
                gva.g0(-1601500108);
                n(zup, pud, welcomeNotice, jta, (igf)o, gva, (n7 & 0xE) | 0x6000 | (n7 & 0x70) | (n7 & 0x380) | (n7 >> 3 & 0x1C00));
                gva.q(false);
            }
            gva.q(true);
            o = fgf.v;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new cf0((Object)zup, (Object)pud, (Object)welcomeNotice, (Object)dng, (Object)jta, o, n, (byte)0);
        }
    }
    
    public static final void m(final zup zup, final pud pud, final WelcomeNotice welcomeNotice, final jta jta, final igf igf, final gva gva, final int n) {
        gva.i0(1513273695);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)zup)) {
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
        if ((n & 0x30) == 0x0) {
            int n4;
            if (gva.f((Object)pud)) {
                n4 = 32;
            }
            else {
                n4 = 16;
            }
            n3 |= n4;
        }
        int n5 = n3;
        if ((n & 0x180) == 0x0) {
            int ordinal;
            if (welcomeNotice == null) {
                ordinal = -1;
            }
            else {
                ordinal = ((Enum)welcomeNotice).ordinal();
            }
            int n6;
            if (gva.d(ordinal)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n5 = (n3 | n6);
        }
        int n7 = n5;
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.h((Object)jta)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n7 = (n5 | n8);
        }
        int n9 = n7;
        if ((n & 0x6000) == 0x0) {
            int n10;
            if (gva.f((Object)igf)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n9 = (n7 | n10);
        }
        if (gva.W(n9 & 0x1, (n9 & 0x2493) != 0x2492)) {
            final kb2 k = wab.K;
            final igf w = omo.W(rhc.e0(lq6.T(igf), rhc.T(0, 1, gva), 14), 24.0f, 0.0f, 2);
            final v96 a = u96.a((jv0)t08.c, (dx)k, gva, 48);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, w);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, a);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b);
            final int n11 = n9 >> 3;
            g(pud, 1.0f, welcomeNotice, null, false, gva, (n11 & 0xE) | 0x30 | (n9 & 0x380), 24);
            final fgf v = fgf.v;
            x90.l(gva, androidx.compose.foundation.layout.b.f((igf)v, 24.0f));
            if (zup.N.getValue()) {
                gva.g0(-693437337);
                ncq.d(n11 & 0x380, 8, jta, gva, null, (boolean)zup.M.getValue() ^ true, (boolean)zup.L.getValue());
                gva.q(false);
            }
            else {
                gva.g0(-693235527);
                gva.q(false);
            }
            ncq.i(zup, androidx.compose.foundation.layout.b.d((igf)v, 1.0f), gva, (n9 & 0xE) | 0x30);
            x90.c(omo.V((igf)v, 8.0f, 16.0f), null, null, gva, 0);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new nj((Object)zup, (Object)pud, (Object)welcomeNotice, (Object)jta, (Object)igf, n, (byte)4);
        }
    }
    
    public static final void n(final zup zup, final pud pud, final WelcomeNotice welcomeNotice, final jta jta, final igf igf, final gva gva, final int n) {
        gva.i0(138988097);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)zup)) {
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
            if (gva.f((Object)pud)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x180) == 0x0) {
            int ordinal;
            if (welcomeNotice == null) {
                ordinal = -1;
            }
            else {
                ordinal = ((Enum)welcomeNotice).ordinal();
            }
            int n7;
            if (gva.d(ordinal)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0xC00) == 0x0) {
            int n9;
            if (gva.h((Object)jta)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n & 0x6000) == 0x0) {
            int n11;
            if (gva.f((Object)igf)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        if (gva.W(n10 & 0x1, (n10 & 0x2493) != 0x2492)) {
            final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
            final WeakHashMap x = l2q.x;
            final boolean b = w(gva).s.e().d > xc8.L0(150.0f);
            final boolean b2 = Math.max(w(gva).t.e().d, w(gva).s.e().d) > xc8.L0(150.0f);
            float n12;
            if (b) {
                n12 = 0.65f;
            }
            else {
                n12 = 1.0f;
            }
            final wq7 a = x09.a;
            final xom b3 = md0.b(n12, ri2.I0(300, 0, a, 2), "heroScale", gva, 3072, 20);
            float n13;
            if (b) {
                n13 = 0.0f;
            }
            else {
                n13 = 1.0f;
            }
            final xom b4 = md0.b(n13, ri2.I0(300, 0, a, 2), "googleAlpha", gva, 3072, 20);
            final Object r = gva.R();
            final cib a2 = bi6.a;
            Object o = r;
            if (r == a2) {
                o = new y5((byte)18);
                gva.q0(o);
            }
            final hsg hsg = (hsg)mlc.a0(new Object[0], (jta)o, gva, 48);
            final kb2 k = wab.K;
            final igf w = omo.W(igf, 24.0f, 0.0f, 2);
            final ev0 c = t08.c;
            final v96 a3 = u96.a((jv0)c, (dx)k, gva, 48);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b5 = ien.B(gva, w);
            vh6.e.getClass();
            gva.k0();
            final boolean s = gva.S;
            final lrc n14 = LayoutNode.n0;
            if (s) {
                gva.k((jta)n14);
            }
            else {
                gva.t0();
            }
            final rg6 a4 = awp.A;
            k8e.P((zta)a4, gva, a3);
            final rg6 z = awp.z;
            k8e.P((zta)z, gva, l);
            final rg6 b6 = awp.B;
            k8e.P((zta)b6, gva, hashCode);
            k8e.C(gva);
            final rg6 y = awp.y;
            k8e.P((zta)y, gva, b5);
            final float floatValue = ((Number)b3.getValue()).floatValue();
            final a2d a2d = new a2d(1.0f, true);
            final int n15 = n10 >> 3;
            g(pud, floatValue, welcomeNotice, (igf)a2d, true, gva, (n10 & 0x380) | ((n15 & 0xE) | 0x6000), 0);
            final mb2 e = wab.E;
            final fgf v = fgf.v;
            final igf d = androidx.compose.foundation.layout.b.d((igf)v, 1.0f);
            final moe c2 = rj2.c((gx)e, false);
            final int hashCode2 = Long.hashCode(gva.T);
            final e3h i = gva.l();
            final igf b7 = ien.B(gva, d);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n14);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a4, gva, c2);
            k8e.P((zta)z, gva, i);
            oz1.v(hashCode2, gva, b6, gva);
            k8e.P((zta)y, gva, b7);
            if (zup.N.getValue()) {
                gva.g0(-1236395805);
                final boolean b8 = !b && !(boolean)zup.M.getValue();
                final boolean booleanValue = (boolean)zup.L.getValue();
                Object t;
                if (b2) {
                    t = v;
                }
                else {
                    t = lq6.T((igf)v);
                }
                final igf y2 = omo.Y((igf)t, 0.0f, 0.0f, 0.0f, xc8.e0(hsg.h()), 7);
                final boolean f = gva.f((Object)b4);
                final Object r2 = gva.R();
                Object o2;
                if (f || (o2 = r2) == a2) {
                    o2 = new ef0(b4, (byte)0);
                    gva.q0(o2);
                }
                final igf f2 = zrn.F(y2, (lta)o2);
                final boolean g = gva.g(b);
                Object r3 = gva.R();
                if (g || r3 == a2) {
                    r3 = new ff0((byte)0, b);
                    gva.q0(r3);
                }
                ncq.d(n15 & 0x380, 0, jta, gva, wsk.b((lta)r3, f2, false), b8, booleanValue);
                gva.q(false);
            }
            else {
                gva.g0(-1235748091);
                gva.q(false);
            }
            final lta lta = (lta)a2;
            final igf t2 = lq6.T(androidx.compose.foundation.layout.b.d((igf)v, 1.0f));
            final moe c3 = rj2.c((gx)wab.x, false);
            final int hashCode3 = Long.hashCode(gva.T);
            final e3h j = gva.l();
            final igf b9 = ien.B(gva, t2);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n14);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a4, gva, c3);
            k8e.P((zta)z, gva, j);
            oz1.v(hashCode3, gva, b6, gva);
            k8e.P((zta)y, gva, b9);
            final igf d2 = androidx.compose.foundation.layout.b.d((igf)v, 1.0f);
            final boolean f3 = gva.f((Object)hsg);
            final Object r4 = gva.R();
            Object o3;
            if (f3 || (o3 = r4) == lta) {
                o3 = new i1((Object)hsg, (byte)4);
                gva.q0(o3);
            }
            final igf m = zrn.M(d2, (lta)o3);
            final v96 a5 = u96.a((jv0)c, (dx)k, gva, 48);
            final int hashCode4 = Long.hashCode(gva.T);
            final e3h l2 = gva.l();
            final igf b10 = ien.B(gva, m);
            gva.k0();
            if (gva.S) {
                gva.k((jta)n14);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)a4, gva, a5);
            k8e.P((zta)z, gva, l2);
            oz1.v(hashCode4, gva, b6, gva);
            k8e.P((zta)y, gva, b10);
            ncq.i(zup, androidx.compose.foundation.layout.b.d((igf)v, 1.0f), gva, (n10 & 0xE) | 0x30);
            x90.c(omo.V((igf)v, 8.0f, 16.0f), null, null, gva, 0);
            gva.q(true);
            gva.q(true);
            gva.q(true);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new gf0((Object)zup, (Object)pud, (Object)welcomeNotice, (Object)jta, (Object)igf, n, (byte)0);
        }
    }
    
    public static final int o(int n, final int n2, final int[] array) {
        --n;
        int i = 0;
        while (i <= n) {
            final int n3 = i + n >>> 1;
            final int n4 = array[n3];
            if (n4 < n2) {
                i = n3 + 1;
            }
            else {
                if (n4 <= n2) {
                    return n3;
                }
                n = n3 - 1;
            }
        }
        return ~i;
    }
    
    public static final int p(final long[] array, int n, final long n2) {
        --n;
        int i = 0;
        while (i <= n) {
            final int n3 = i + n >>> 1;
            final long n4 = lcmp(array[n3], n2);
            if (n4 < 0) {
                i = n3 + 1;
            }
            else {
                if (n4 <= 0) {
                    return n3;
                }
                n = n3 - 1;
            }
        }
        return ~i;
    }
    
    public static final Set q(final SerialDescriptor serialDescriptor) {
        if (serialDescriptor instanceof fx2) {
            return ((fx2)serialDescriptor).c();
        }
        final HashSet set = new HashSet(serialDescriptor.f());
        for (int f = serialDescriptor.f(), i = 0; i < f; ++i) {
            set.add((Object)serialDescriptor.g(i));
        }
        return (Set)set;
    }
    
    public static final p03 r(final zta zta) {
        return new p03(zta, (hc7)o89.v, -2, 1);
    }
    
    public static final SerialDescriptor[] s(final List list) {
        Object o = null;
        Label_0017: {
            if (list != null) {
                o = list;
                if (!((Collection)list).isEmpty()) {
                    break Label_0017;
                }
            }
            o = null;
        }
        if (o != null) {
            final SerialDescriptor[] array = (SerialDescriptor[])((Collection)o).toArray((Object[])new SerialDescriptor[0]);
            if (array != null) {
                return array;
            }
        }
        return o50.i;
    }
    
    public static final KSerializer t(final Class p0, final KSerializer... p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Class.isEnum:()Z
        //     4: ifeq            60
        //     7: aload_0        
        //     8: ldc_w           Ljzk;.class
        //    11: invokevirtual   java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //    14: ifnonnull       60
        //    17: aload_0        
        //    18: ldc_w           Ljfh;.class
        //    21: invokevirtual   java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //    24: ifnonnull       60
        //    27: aload_0        
        //    28: invokevirtual   java/lang/Class.getEnumConstants:()[Ljava/lang/Object;
        //    31: astore_1       
        //    32: aload_0        
        //    33: invokevirtual   java/lang/Class.getCanonicalName:()Ljava/lang/String;
        //    36: astore_0       
        //    37: aload_0        
        //    38: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    41: pop            
        //    42: aload_1        
        //    43: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    46: pop            
        //    47: new             Lxd9;
        //    50: dup            
        //    51: aload_0        
        //    52: aload_1        
        //    53: checkcast       [Ljava/lang/Enum;
        //    56: invokespecial   xd9.<init>:(Ljava/lang/String;[Ljava/lang/Enum;)V
        //    59: areturn        
        //    60: aload_1        
        //    61: aload_1        
        //    62: arraylength    
        //    63: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //    66: checkcast       [Lkotlinx/serialization/KSerializer;
        //    69: astore          7
        //    71: aconst_null    
        //    72: astore          8
        //    74: aload_0        
        //    75: ldc_w           "Companion"
        //    78: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    81: astore          6
        //    83: aload           6
        //    85: iconst_1       
        //    86: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //    89: aload           6
        //    91: aconst_null    
        //    92: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    95: astore          6
        //    97: goto            105
        //   100: astore          6
        //   102: aconst_null    
        //   103: astore          6
        //   105: aload           6
        //   107: ifnonnull       116
        //   110: aconst_null    
        //   111: astore          6
        //   113: goto            134
        //   116: aload           6
        //   118: aload           7
        //   120: aload           7
        //   122: arraylength    
        //   123: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   126: checkcast       [Lkotlinx/serialization/KSerializer;
        //   129: invokestatic    o50.G:(Ljava/lang/Object;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;
        //   132: astore          6
        //   134: aload           6
        //   136: ifnull          142
        //   139: aload           6
        //   141: areturn        
        //   142: aload_0        
        //   143: invokevirtual   java/lang/Class.getCanonicalName:()Ljava/lang/String;
        //   146: astore          6
        //   148: aload           6
        //   150: ifnull          318
        //   153: aload           6
        //   155: ldc_w           "java."
        //   158: iconst_0       
        //   159: invokestatic    rym.E0:(Ljava/lang/String;Ljava/lang/String;Z)Z
        //   162: ifne            318
        //   165: aload           6
        //   167: ldc_w           "kotlin."
        //   170: iconst_0       
        //   171: invokestatic    rym.E0:(Ljava/lang/String;Ljava/lang/String;Z)Z
        //   174: ifeq            180
        //   177: goto            318
        //   180: aload_0        
        //   181: invokevirtual   java/lang/Class.getDeclaredFields:()[Ljava/lang/reflect/Field;
        //   184: astore          10
        //   186: aload           10
        //   188: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   191: pop            
        //   192: aload           10
        //   194: arraylength    
        //   195: istore          5
        //   197: aconst_null    
        //   198: astore          6
        //   200: iconst_0       
        //   201: istore_3       
        //   202: iconst_0       
        //   203: istore          4
        //   205: iload_3        
        //   206: iload           5
        //   208: if_icmpge       305
        //   211: aload           10
        //   213: iload_3        
        //   214: aaload         
        //   215: astore          9
        //   217: iload           4
        //   219: istore_2       
        //   220: aload           6
        //   222: astore          7
        //   224: aload           9
        //   226: invokevirtual   java/lang/reflect/Field.getName:()Ljava/lang/String;
        //   229: ldc_w           "INSTANCE"
        //   232: invokestatic    mlc.q:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   235: ifeq            292
        //   238: iload           4
        //   240: istore_2       
        //   241: aload           6
        //   243: astore          7
        //   245: aload           9
        //   247: invokevirtual   java/lang/reflect/Field.getType:()Ljava/lang/Class;
        //   250: aload_0        
        //   251: invokestatic    mlc.q:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   254: ifeq            292
        //   257: iload           4
        //   259: istore_2       
        //   260: aload           6
        //   262: astore          7
        //   264: aload           9
        //   266: invokevirtual   java/lang/reflect/Field.getModifiers:()I
        //   269: invokestatic    java/lang/reflect/Modifier.isStatic:(I)Z
        //   272: ifeq            292
        //   275: iload           4
        //   277: ifeq            286
        //   280: aconst_null    
        //   281: astore          6
        //   283: goto            313
        //   286: iconst_1       
        //   287: istore_2       
        //   288: aload           9
        //   290: astore          7
        //   292: iinc            3, 1
        //   295: iload_2        
        //   296: istore          4
        //   298: aload           7
        //   300: astore          6
        //   302: goto            205
        //   305: iload           4
        //   307: ifne            313
        //   310: goto            280
        //   313: aload           6
        //   315: ifnonnull       324
        //   318: aconst_null    
        //   319: astore          6
        //   321: goto            504
        //   324: aload           6
        //   326: aconst_null    
        //   327: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   330: astore          10
        //   332: aload_0        
        //   333: invokevirtual   java/lang/Class.getMethods:()[Ljava/lang/reflect/Method;
        //   336: astore          11
        //   338: aload           11
        //   340: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   343: pop            
        //   344: aload           11
        //   346: arraylength    
        //   347: istore          5
        //   349: aconst_null    
        //   350: astore          6
        //   352: iconst_0       
        //   353: istore          4
        //   355: iconst_0       
        //   356: istore_2       
        //   357: iload           4
        //   359: iload           5
        //   361: if_icmpge       464
        //   364: aload           11
        //   366: iload           4
        //   368: aaload         
        //   369: astore          9
        //   371: iload_2        
        //   372: istore_3       
        //   373: aload           6
        //   375: astore          7
        //   377: aload           9
        //   379: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //   382: ldc_w           "serializer"
        //   385: invokestatic    mlc.q:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   388: ifeq            452
        //   391: aload           9
        //   393: invokevirtual   java/lang/reflect/Method.getParameterTypes:()[Ljava/lang/Class;
        //   396: astore          12
        //   398: aload           12
        //   400: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   403: pop            
        //   404: iload_2        
        //   405: istore_3       
        //   406: aload           6
        //   408: astore          7
        //   410: aload           12
        //   412: arraylength    
        //   413: ifne            452
        //   416: iload_2        
        //   417: istore_3       
        //   418: aload           6
        //   420: astore          7
        //   422: aload           9
        //   424: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   427: ldc_w           Lkotlinx/serialization/KSerializer;.class
        //   430: invokestatic    mlc.q:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   433: ifeq            452
        //   436: iload_2        
        //   437: ifeq            446
        //   440: aconst_null    
        //   441: astore          6
        //   443: goto            471
        //   446: iconst_1       
        //   447: istore_3       
        //   448: aload           9
        //   450: astore          7
        //   452: iinc            4, 1
        //   455: iload_3        
        //   456: istore_2       
        //   457: aload           7
        //   459: astore          6
        //   461: goto            357
        //   464: iload_2        
        //   465: ifne            471
        //   468: goto            440
        //   471: aload           6
        //   473: ifnonnull       479
        //   476: goto            318
        //   479: aload           6
        //   481: aload           10
        //   483: aconst_null    
        //   484: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   487: astore          6
        //   489: aload           6
        //   491: instanceof      Lkotlinx/serialization/KSerializer;
        //   494: ifeq            318
        //   497: aload           6
        //   499: checkcast       Lkotlinx/serialization/KSerializer;
        //   502: astore          6
        //   504: aload           6
        //   506: ifnull          512
        //   509: aload           6
        //   511: areturn        
        //   512: aload_1        
        //   513: aload_1        
        //   514: arraylength    
        //   515: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   518: checkcast       [Lkotlinx/serialization/KSerializer;
        //   521: astore          6
        //   523: aload_0        
        //   524: invokevirtual   java/lang/Class.getDeclaredFields:()[Ljava/lang/reflect/Field;
        //   527: astore          7
        //   529: aload           7
        //   531: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   534: pop            
        //   535: aload           7
        //   537: arraylength    
        //   538: istore_3       
        //   539: iconst_0       
        //   540: istore_2       
        //   541: iload_2        
        //   542: iload_3        
        //   543: if_icmpge       583
        //   546: aload           7
        //   548: iload_2        
        //   549: aaload         
        //   550: astore_1       
        //   551: aload_1        
        //   552: invokevirtual   java/lang/reflect/Field.getModifiers:()I
        //   555: invokestatic    java/lang/reflect/Modifier.isStatic:(I)Z
        //   558: ifeq            577
        //   561: aload_1        
        //   562: invokevirtual   java/lang/reflect/Field.getType:()Ljava/lang/Class;
        //   565: ldc_w           Lpof;.class
        //   568: invokevirtual   java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   571: ifnull          577
        //   574: goto            585
        //   577: iinc            2, 1
        //   580: goto            541
        //   583: aconst_null    
        //   584: astore_1       
        //   585: aload_1        
        //   586: ifnonnull       594
        //   589: aconst_null    
        //   590: astore_1       
        //   591: goto            605
        //   594: aload_1        
        //   595: iconst_1       
        //   596: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   599: aload_1        
        //   600: aconst_null    
        //   601: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   604: astore_1       
        //   605: aload_1        
        //   606: ifnull          632
        //   609: aload_1        
        //   610: aload           6
        //   612: aload           6
        //   614: arraylength    
        //   615: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   618: checkcast       [Lkotlinx/serialization/KSerializer;
        //   621: invokestatic    o50.G:(Ljava/lang/Object;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;
        //   624: astore_1       
        //   625: aload_1        
        //   626: ifnull          632
        //   629: goto            759
        //   632: aload_0        
        //   633: invokevirtual   java/lang/Class.getDeclaredClasses:()[Ljava/lang/Class;
        //   636: astore          7
        //   638: aload           7
        //   640: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   643: pop            
        //   644: aload           7
        //   646: arraylength    
        //   647: istore          5
        //   649: aconst_null    
        //   650: astore_1       
        //   651: iconst_0       
        //   652: istore_3       
        //   653: iconst_0       
        //   654: istore_2       
        //   655: iload_3        
        //   656: iload           5
        //   658: if_icmpge       708
        //   661: aload           7
        //   663: iload_3        
        //   664: aaload         
        //   665: astore          6
        //   667: iload_2        
        //   668: istore          4
        //   670: aload           6
        //   672: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   675: ldc_w           "$serializer"
        //   678: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   681: ifeq            699
        //   684: iload_2        
        //   685: ifeq            693
        //   688: aconst_null    
        //   689: astore_1       
        //   690: goto            715
        //   693: iconst_1       
        //   694: istore          4
        //   696: aload           6
        //   698: astore_1       
        //   699: iinc            3, 1
        //   702: iload           4
        //   704: istore_2       
        //   705: goto            655
        //   708: iload_2        
        //   709: ifne            715
        //   712: goto            688
        //   715: aload_1        
        //   716: ifnull          740
        //   719: aload_1        
        //   720: ldc_w           "INSTANCE"
        //   723: invokevirtual   java/lang/Class.getField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //   726: astore_1       
        //   727: aload_1        
        //   728: ifnull          740
        //   731: aload_1        
        //   732: aconst_null    
        //   733: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   736: astore_1       
        //   737: goto            742
        //   740: aconst_null    
        //   741: astore_1       
        //   742: aload_1        
        //   743: instanceof      Lkotlinx/serialization/KSerializer;
        //   746: ifeq            757
        //   749: aload_1        
        //   750: checkcast       Lkotlinx/serialization/KSerializer;
        //   753: astore_1       
        //   754: goto            759
        //   757: aconst_null    
        //   758: astore_1       
        //   759: aload_1        
        //   760: ifnull          765
        //   763: aload_1        
        //   764: areturn        
        //   765: aload_0        
        //   766: ldc_w           Ljfh;.class
        //   769: invokevirtual   java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   772: ifnull          778
        //   775: goto            823
        //   778: aload_0        
        //   779: ldc_w           Ljzk;.class
        //   782: invokevirtual   java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   785: checkcast       Ljzk;
        //   788: astore          6
        //   790: aload           8
        //   792: astore_1       
        //   793: aload           6
        //   795: ifnull          835
        //   798: aload           8
        //   800: astore_1       
        //   801: aload           6
        //   803: invokeinterface jzk.with:()Ljava/lang/Class;
        //   808: invokestatic    v4j.a:(Ljava/lang/Class;)Lus4;
        //   811: ldc_w           Lnfh;.class
        //   814: invokestatic    v4j.a:(Ljava/lang/Class;)Lus4;
        //   817: invokevirtual   us4.equals:(Ljava/lang/Object;)Z
        //   820: ifeq            835
        //   823: new             Lnfh;
        //   826: dup            
        //   827: aload_0        
        //   828: invokestatic    v4j.a:(Ljava/lang/Class;)Lus4;
        //   831: invokespecial   nfh.<init>:(Lrtc;)V
        //   834: astore_1       
        //   835: aload_1        
        //   836: areturn        
        //   837: astore_1       
        //   838: goto            589
        //   841: astore_1       
        //   842: goto            757
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  74     97     100    105    Any
        //  594    605    837    841    Any
        //  632    649    841    845    Ljava/lang/NoSuchFieldException;
        //  670    684    841    845    Ljava/lang/NoSuchFieldException;
        //  719    727    841    845    Ljava/lang/NoSuchFieldException;
        //  731    737    841    845    Ljava/lang/NoSuchFieldException;
        //  742    754    841    845    Ljava/lang/NoSuchFieldException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0632:
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
    
    public static final boolean u(final View obj, final View view) {
        if (!view.equals(obj)) {
            for (ViewParent viewParent = view.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
                if (viewParent == obj) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static final ExecutorService v(final boolean b) {
        final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), (ThreadFactory)new xn6(b));
        fixedThreadPool.getClass();
        return fixedThreadPool;
    }
    
    public static l2q w(final gva gva) {
        final View view = (View)gva.j((sei)q50.f);
        final l2q d = D(view);
        final boolean h = gva.h((Object)d);
        final boolean h2 = gva.h((Object)view);
        final Object r = gva.R();
        Object o;
        if ((h | h2) || (o = r) == bi6.a) {
            o = new tyl((Object)d, (Object)view, (byte)19);
            gva.q0(o);
        }
        mlc.a(d, (lta)o, gva);
        return d;
    }
    
    public static final float x(final float[] array, int n, final float[] array2, final int n2) {
        n *= 4;
        return array[n + 3] * array2[12 + n2] + (array[n + 2] * array2[8 + n2] + (array[n + 1] * array2[4 + n2] + array[n] * array2[n2]));
    }
    
    public static hb y(final zrc zrc) {
        Label_0080: {
            Label_0071: {
                Label_0062: {
                    String i = null;
                    String j = null;
                    Label_0045: {
                        try {
                            i = zrc.o("id").i();
                            final irc o = zrc.o("current_locale");
                            if (o != null) {
                                j = o.i();
                                break Label_0045;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0062;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0071;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0080;
                        }
                        j = null;
                    }
                    i.getClass();
                    return new hb(i, j);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Application", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Application", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Application", (Throwable)ex3);
        return null;
    }
    
    public static zlj z(final zrc zrc) {
        Label_0114: {
            Label_0105: {
                Label_0096: {
                    String i = null;
                    String j = null;
                    String k = null;
                    Label_0056: {
                        try {
                            i = zrc.o("name").i();
                            j = zrc.o("version").i();
                            final irc o = zrc.o("build");
                            if (o != null) {
                                k = o.i();
                                break Label_0056;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0096;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0105;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0114;
                        }
                        k = null;
                    }
                    final String l = zrc.o("version_major").i();
                    i.getClass();
                    j.getClass();
                    l.getClass();
                    return new zlj(i, j, k, l);
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
    
    public Object A(final us4 us4) {
        return null;
    }
    
    public o50 S(final us4 us4, final Object o) {
        if (o != null) {
            return (o50)new fgd(us4, o, this);
        }
        return this;
    }
    
    @Override
    public int hashCode() {
        switch (this.a) {
            default: {
                return super.hashCode();
            }
            case 24: {
                return this.toString().hashCode();
            }
        }
    }
    
    @Override
    public String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 24: {
                final String c = v4j.a((Class)this.getClass()).c();
                c.getClass();
                return c;
            }
        }
    }
}
