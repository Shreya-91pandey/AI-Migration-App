import android.os.BaseBundle;
import java.util.Random;
import java.net.URLConnection;
import java.util.Map;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.Comparator;
import com.anthropic.claude.core.telemetry.SilentException;
import android.provider.CalendarContract$Events;
import com.anthropic.claude.tool.calendar.EventInfo;
import android.content.ContentValues;
import java.time.OffsetDateTime;
import java.security.SecureRandom;
import java.util.zip.GZIPOutputStream;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseConversion;
import com.anthropic.claude.analytics.events.MapsEvents$MapsViewed;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.MapsEvents$MapsSurface;
import com.anthropic.claude.analytics.events.MapsEvents$MapsInteracted;
import java.util.concurrent.CancellationException;
import android.content.Intent;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import android.os.Bundle;
import java.util.List;
import android.net.Uri;
import android.os.Build$VERSION;
import android.view.View;
import java.nio.channels.FileChannel;
import org.json.JSONException;
import java.io.FileOutputStream;
import org.json.JSONObject;
import java.util.Iterator;
import java.util.Map$Entry;
import android.view.autofill.AutofillManager;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ExecutorService;
import java.util.ArrayList;
import android.content.Context;
import java.util.HashMap;
import androidx.compose.ui.node.LayoutNode;

public final class e3a implements i1n, vzk, gfi, n03, mjc, q13, u7k
{
    public final byte v;
    public Object w = new ArrayList();
    public Object x = x;
    
    public e3a(final byte v) {
        switch (this.v = v) {
            default: {
                final elo e = yi2.e;
                final Float value = 0.0f;
                this.x = new dg0((dlo)e, (Object)value, (ig0)e.a.b((Object)value), Long.MIN_VALUE, Long.MIN_VALUE, false);
                return;
            }
            case 19: {
                this.x = new float[64];
                return;
            }
            case 17: {
                this.w = new inf(0, (Object[])new LayoutNode[16]);
                return;
            }
            case 13: {
                this.w = new tmf();
                this.x = new tmf();
            }
        }
    }
    
    public e3a(final double n) {
        this.v = 24;
        final HashMap x = new HashMap(0);
        this.x = x;
        double n2 = 0.0;
        Label_0048: {
            if (n >= 0.0) {
                n2 = n;
                if (n <= 1.0) {
                    break Label_0048;
                }
            }
            n2 = 1.0;
        }
        this.w = new ke8(n2);
    }
    
    public e3a(final float n) {
        this.v = 23;
        final je8 w = new je8(n, (byte)1);
        this.w = w;
        this.x = new l7n((jta)rn6.H);
    }
    
    public e3a(final Context w) {
        this.v = 10;
        this.x = null;
        this.w = w;
    }
    
    public e3a(final LayoutNode w, final moe moe) {
        this.v = 4;
        this.w = w;
        this.x = o50.Q((Object)moe);
    }
    
    public e3a(final b4d w) {
        this.v = 6;
        this.w = w;
        final amf a = i4g.a;
        this.x = new amf();
    }
    
    public e3a(final f7g x, final m03 w) {
        this.v = 15;
        this.x = x;
        this.w = w;
    }
    
    public e3a(final i9k w) {
        this.v = 29;
        this.w = w;
        this.x = new e3a(w, false, (byte)28);
    }
    
    public e3a(final String s) {
        this.v = 1;
        this.w = s.concat(".lck");
    }
    
    public e3a(final ExecutorService w) {
        this.v = 26;
        this.x = new myl(0);
        this.w = w;
    }
    
    public e3a(final qn1 w) {
        this.v = 18;
        this.w = w;
        this.x = new AtomicInteger(0);
    }
    
    public e3a(final t2k w) {
        this.v = 22;
        this.w = w;
        this.x = new lyd(25);
    }
    
    public e3a(final vra w) {
        this.v = 2;
        this.w = w;
        this.x = new CopyOnWriteArrayList();
    }
    
    public static e3a I(final String... array) {
        try {
            final is2[] array2 = new is2[array.length];
            final Object o = new Object();
            for (int i = 0; i < array.length; ++i) {
                htc.O0((an2)o, array[i]);
                ((an2)o).readByte();
                array2[i] = ((an2)o).u(((an2)o).w);
            }
            return new e3a(array.clone(), mlc.V(array2), (byte)5);
        }
        catch (final IOException ex) {
            en9.g((Object)ex);
            return null;
        }
    }
    
    public static void j(final LayoutNode layoutNode) {
        if (layoutNode.i0 > 0) {
            layoutNode.k();
            int i = 0;
            layoutNode.h0 = false;
            final inf m = layoutNode.M();
            final Object[] v = m.v;
            while (i < m.x) {
                j((LayoutNode)v[i]);
                ++i;
            }
        }
    }
    
    public File A() {
        if (this.w == null) {
            monitorenter(this);
            Label_0119: {
                try {
                    if (this.w != null) {
                        break Label_0119;
                    }
                    final StringBuilder sb = new StringBuilder("PersistedInstallation.");
                    sb.append(((ffa)this.x).c());
                    sb.append(".json");
                    final String string = sb.toString();
                    final ffa ffa = (ffa)this.x;
                    ffa.a();
                    final File w = new File(ffa.a.getNoBackupFilesDir(), string);
                    this.w = w;
                    if (w.exists()) {
                        final File file = (File)this.w;
                        monitorexit(this);
                        return file;
                    }
                    break Label_0119;
                }
                finally {
                    monitorexit(this);
                    while (true) {
                        Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", (Throwable)new IOException("Unable to move the file from back up to non back up directory"));
                        monitorexit(this);
                        return;
                        monitorexit(this);
                        return (File)this.w;
                        final ffa ffa2 = (ffa)this.x;
                        ffa2.a();
                        final String string;
                        file2 = new File(ffa2.a.getFilesDir(), string);
                        iftrue(Label_0195:)(!file2.exists() || file2.renameTo((File)this.w));
                        continue;
                    }
                }
            }
        }
        return (File)this.w;
    }
    
    public moe B() {
        return (moe)((ksg)this.x).getValue();
    }
    
    public AutofillManager C() {
        final AutofillManager autofillManager = (AutofillManager)this.x;
        if (autofillManager != null) {
            return autofillManager;
        }
        final AutofillManager x = (AutofillManager)((Context)this.w).getSystemService((Class)AutofillManager.class);
        if (x != null) {
            return (AutofillManager)(this.x = x);
        }
        en9.q("Could not locate AutofillManager from context");
        return null;
    }
    
    public Float D() {
        final float floatValue = ((Number)Float.valueOf(((je8)this.w).x)).floatValue();
        float n = 0.0f;
        final qjc v = qjc.v;
        if (floatValue < 0.0f) {
            rjc.j.getClass();
            c5q.E((rjc)pjc.b, 4, v, (jta)new le8(floatValue, (byte)2), (Throwable)null, false, 56);
        }
        else {
            final float n2 = 100.0f;
            n = floatValue;
            if (floatValue > 100.0f) {
                rjc.j.getClass();
                c5q.E((rjc)pjc.b, 4, v, (jta)new le8(floatValue, (byte)3), (Throwable)null, false, 56);
                n = n2;
            }
        }
        return n;
    }
    
    public h9k E(final String s) {
        Object o = this.w;
        final vzq c;
        monitorenter(c = ((i9k)o).c);
        Label_0118: {
            try {
                final Iterator iterator = ((i9k)o).d.entrySet().iterator();
                do {
                    final boolean hasNext = iterator.hasNext();
                    o = null;
                    final h9k h9k = null;
                    if (!hasNext) {
                        break;
                    }
                    final Map$Entry map$Entry = (Map$Entry)iterator.next();
                    o = map$Entry.getKey();
                    final h9k h9k2 = (h9k)map$Entry.getValue();
                    final boolean q = mlc.q(o, (Object)s);
                    o = h9k;
                    if (!q) {
                        continue;
                    }
                    o = h9k2;
                } while (o == null);
            }
            finally {
                break Label_0118;
            }
            monitorexit(c);
            return (h9k)o;
        }
        monitorexit(c);
    }
    
    public void F(final rl1 rl1) {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("Fid", (Object)rl1.a);
            jsonObject.put("Status", ge9.D(rl1.b));
            jsonObject.put("AuthToken", (Object)rl1.c);
            jsonObject.put("RefreshToken", (Object)rl1.d);
            jsonObject.put("TokenCreationEpochInSecs", rl1.f);
            jsonObject.put("ExpiresInSecs", rl1.e);
            jsonObject.put("FisError", (Object)rl1.g);
            final ffa ffa = (ffa)this.x;
            ffa.a();
            final File tempFile = File.createTempFile("PersistedInstallation", "tmp", ffa.a.getFilesDir());
            final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            fileOutputStream.write(jsonObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (tempFile.renameTo(this.A())) {
                return;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        catch (final JSONException | IOException ex) {}
    }
    
    public void G() {
        final String s = (String)this.w;
        if (this.x != null) {
            return;
        }
        Label_0051: {
            try {
                final File file = new File(s);
                final File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                break Label_0051;
            }
            finally {
                final FileChannel fileChannel = (FileChannel)this.x;
                if (fileChannel != null) {
                    ((AbstractInterruptibleChannel)fileChannel).close();
                }
                this.x = null;
                final Throwable t;
                fvd.o(hia.k("Unable to lock file: '", s, "'."), t);
                return;
                while (true) {
                    final FileChannel channel;
                    channel.lock();
                    return;
                    final File file;
                    channel = new FileOutputStream(file).getChannel();
                    iftrue(Label_0079:)((this.x = channel) == null);
                    continue;
                }
                Label_0079:;
            }
        }
    }
    
    public void H(final View view, final int n, final boolean b) {
        if (Build$VERSION.SDK_INT >= 27) {
            am1.a(this.C(), view, n, b);
        }
    }
    
    public boolean J(final l4e l4e) {
        final lta lta = (lta)this.x;
        try {
            String c = l4e.c();
            Uri parse = null;
            Label_0058: {
                if (c != null) {
                    if (!skq.m(c)) {
                        c = null;
                    }
                    if (c != null) {
                        parse = Uri.parse(c);
                        parse.getClass();
                        break Label_0058;
                    }
                }
                parse = null;
            }
            if (parse == null || !this.S(parse, null)) {
                String s;
                if (!kym.Y0((CharSequence)l4e.d())) {
                    final double a = l4e.a();
                    final double b = l4e.b();
                    final String encode = Uri.encode(l4e.d());
                    final StringBuilder sb = new StringBuilder("geo:");
                    sb.append(a);
                    sb.append(",");
                    sb.append(b);
                    sb.append("?q=");
                    sb.append(encode);
                    s = sb.toString();
                }
                else {
                    final double a2 = l4e.a();
                    final double b2 = l4e.b();
                    final StringBuilder sb2 = new StringBuilder("geo:");
                    sb2.append(a2);
                    sb2.append(",");
                    sb2.append(b2);
                    s = sb2.toString();
                }
                final Uri parse2 = Uri.parse(s);
                parse2.getClass();
                if (!this.S(parse2, "com.google.android.apps.maps")) {
                    if (!this.S(parse2, null)) {
                        final double a3 = l4e.a();
                        final double b3 = l4e.b();
                        final StringBuilder sb3 = new StringBuilder("https://www.google.com/maps/search/?api=1&query=");
                        sb3.append(a3);
                        sb3.append(",");
                        sb3.append(b3);
                        final Uri parse3 = Uri.parse(sb3.toString());
                        parse3.getClass();
                        if (!this.S(parse3, null)) {
                            final tqd l = uqd.l;
                            lta.b((Object)new ph9(2131757524, 0, (fa4)null, (ai9)null, 14));
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        catch (final Exception ex) {
            final tqd i = uqd.l;
            lta.b((Object)new vh9());
            return false;
        }
    }
    
    public boolean K(final List list, final ufo ufo) {
        final lta lta = (lta)this.x;
        final String a = c4b.a(list, ufo);
        if (a == null) {
            return false;
        }
        try {
            final Uri parse = Uri.parse(a);
            parse.getClass();
            if (!this.S(parse, "com.google.android.apps.maps")) {
                if (!this.S(parse, null)) {
                    final tqd l = uqd.l;
                    lta.b((Object)new ph9(2131757524, 0, (fa4)null, (ai9)null, 14));
                    return false;
                }
            }
            return true;
        }
        catch (final Exception ex) {
            final tqd i = uqd.l;
            lta.b((Object)new vh9());
            return false;
        }
    }
    
    public void L(final String s, final ArrayList list) {
        final int length = s.length();
        int n = 0;
        int i = 0;
        int n2;
        while (true) {
            n2 = length;
            if (i >= length) {
                break;
            }
            n2 = length;
            if (mlc.u((int)s.charAt(i), 32) > 0) {
                break;
            }
            ++i;
        }
        while (n2 > i && mlc.u((int)s.charAt(n2 - 1), 32) <= 0) {
            --n2;
        }
        int n3 = 0;
        while (i < n2) {
            int n4 = i;
            int char1;
            while (true) {
                i = n4 + 1;
                char1 = s.charAt(n4);
                final int n5 = char1 | ' ';
                if ((n5 - 122) * (n5 - 97) <= 0 && n5 != 101) {
                    break;
                }
                if (i >= n2) {
                    char1 = n;
                    break;
                }
                n4 = i;
            }
            if (char1 != 0) {
                final int n6 = char1 | ' ';
                int n7 = i;
                if (n6 != 122) {
                    while (i < n2 && mlc.u((int)s.charAt(i), 32) <= 0) {
                        ++i;
                    }
                    int n8;
                    if (n6 == 97) {
                        n8 = 1;
                    }
                    else {
                        n8 = n;
                    }
                    int n9 = n;
                    int n10 = i;
                    float intBitsToFloat;
                    int n13;
                    int n14;
                    do {
                        long n11;
                        if (n8 != 0 && 3 <= n9 && n9 < 5) {
                            n11 = ach.Y(n10, Math.min(n10 + 1, n2), s);
                        }
                        else {
                            n11 = ach.Y(n10, n2, s);
                        }
                        final int n12 = (int)(n11 >>> 32);
                        intBitsToFloat = Float.intBitsToFloat((int)(n11 & 0xFFFFFFFFL));
                        n13 = n12;
                        n14 = n9;
                        if (!Float.isNaN(intBitsToFloat)) {
                            final float[] array = (float[])this.x;
                            n14 = n9 + 1;
                            array[n9] = intBitsToFloat;
                            if (n14 >= array.length) {
                                System.arraycopy((Object)array, n, this.x = new float[n14 * 2], n, array.length);
                            }
                            n13 = n12;
                        }
                        while (n13 < n2 && (mlc.u((int)s.charAt(n13), 32) <= 0 || s.charAt(n13) == ',')) {
                            ++n13;
                        }
                        if (n13 >= n2) {
                            break;
                        }
                        n10 = n13;
                        n9 = n14;
                    } while (!Float.isNaN(intBitsToFloat));
                    n3 = n14;
                    n7 = n13;
                }
                final float[] array2 = (float[])this.x;
                int n15 = 2;
                Label_1861: {
                    int n17 = 0;
                    Label_0682: {
                        switch (char1) {
                            default: {
                                final StringBuilder sb = new StringBuilder("Unknown command for: ");
                                sb.append((char)char1);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            case 118: {
                                int n16 = n;
                                while (true) {
                                    n17 = n;
                                    if (n16 > n3 - 1) {
                                        break Label_0682;
                                    }
                                    ((List)list).add((Object)new ewg(array2[n16]));
                                    ++n16;
                                }
                                break;
                            }
                            case 116: {
                                int n18 = n;
                                while (true) {
                                    n17 = n;
                                    if (n18 > n3 - 2) {
                                        break Label_0682;
                                    }
                                    ((List)list).add((Object)new dwg(array2[n18], array2[n18 + 1]));
                                    n18 += 2;
                                }
                                break;
                            }
                            case 115: {
                                int n19 = n;
                                while (true) {
                                    n17 = n;
                                    if (n19 > n3 - 4) {
                                        break Label_0682;
                                    }
                                    ((List)list).add((Object)new cwg(array2[n19], array2[n19 + 1], array2[n19 + 2], array2[n19 + 3]));
                                    n19 += 4;
                                }
                                break;
                            }
                            case 113: {
                                int n20 = n;
                                while (true) {
                                    n17 = n;
                                    if (n20 > n3 - 4) {
                                        break Label_0682;
                                    }
                                    ((List)list).add((Object)new bwg(array2[n20], array2[n20 + 1], array2[n20 + 2], array2[n20 + 3]));
                                    n20 += 4;
                                }
                                break;
                            }
                            case 109: {
                                final int n21 = n3 - 2;
                                n17 = n;
                                if (n21 < 0) {
                                    break;
                                }
                                ((List)list).add((Object)new awg(array2[n], array2[1]));
                                while (true) {
                                    n17 = n;
                                    if (n15 > n21) {
                                        break Label_0682;
                                    }
                                    ((List)list).add((Object)new zvg(array2[n15], array2[n15 + 1]));
                                    n15 += 2;
                                }
                                break;
                            }
                            case 108: {
                                int n22 = n;
                                while (true) {
                                    n17 = n;
                                    if (n22 > n3 - 2) {
                                        break Label_0682;
                                    }
                                    ((List)list).add((Object)new zvg(array2[n22], array2[n22 + 1]));
                                    n22 += 2;
                                }
                                break;
                            }
                            case 104: {
                                int n23 = n;
                                while (true) {
                                    n17 = n;
                                    if (n23 > n3 - 1) {
                                        break Label_0682;
                                    }
                                    ((List)list).add((Object)new yvg(array2[n23]));
                                    ++n23;
                                }
                                break;
                            }
                            case 99: {
                                int n24 = n;
                                while (true) {
                                    n17 = n;
                                    if (n24 > n3 - 6) {
                                        break Label_0682;
                                    }
                                    ((List)list).add((Object)new xvg(array2[n24], array2[n24 + 1], array2[n24 + 2], array2[n24 + 3], array2[n24 + 4], array2[n24 + 5]));
                                    n24 += 6;
                                }
                                break;
                            }
                            case 97: {
                                int n25 = n;
                                while (true) {
                                    n17 = n;
                                    if (n25 > n3 - 7) {
                                        break Label_0682;
                                    }
                                    final float n26 = array2[n25];
                                    final float n27 = array2[n25 + 1];
                                    final float n28 = array2[n25 + 2];
                                    int n29;
                                    if (Float.compare(array2[n25 + 3], 0.0f) != 0) {
                                        n29 = 1;
                                    }
                                    else {
                                        n29 = n;
                                    }
                                    int n30;
                                    if (Float.compare(array2[n25 + 4], 0.0f) != 0) {
                                        n30 = 1;
                                    }
                                    else {
                                        n30 = n;
                                    }
                                    ((List)list).add((Object)new wvg(n26, n27, n28, (boolean)(n29 != 0), (boolean)(n30 != 0), array2[n25 + 5], array2[n25 + 6]));
                                    n25 += 7;
                                }
                                break;
                            }
                            case 90:
                            case 122: {
                                list.add((Object)ovg.c);
                                break Label_1861;
                            }
                            case 86: {
                                int n32;
                                final int n31 = n32 = n;
                                while (true) {
                                    n = n31;
                                    if (n32 > n3 - 1) {
                                        break Label_1861;
                                    }
                                    ((List)list).add((Object)new fwg(array2[n32]));
                                    ++n32;
                                }
                                break;
                            }
                            case 84: {
                                int n34;
                                final int n33 = n34 = n;
                                while (true) {
                                    n = n33;
                                    if (n34 > n3 - 2) {
                                        break Label_1861;
                                    }
                                    ((List)list).add((Object)new vvg(array2[n34], array2[n34 + 1]));
                                    n34 += 2;
                                }
                                break;
                            }
                            case 83: {
                                int n36;
                                final int n35 = n36 = n;
                                while (true) {
                                    n = n35;
                                    if (n36 > n3 - 4) {
                                        break Label_1861;
                                    }
                                    ((List)list).add((Object)new uvg(array2[n36], array2[n36 + 1], array2[n36 + 2], array2[n36 + 3]));
                                    n36 += 4;
                                }
                                break;
                            }
                            case 81: {
                                int n38;
                                final int n37 = n38 = n;
                                while (true) {
                                    n = n37;
                                    if (n38 > n3 - 4) {
                                        break Label_1861;
                                    }
                                    ((List)list).add((Object)new tvg(array2[n38], array2[n38 + 1], array2[n38 + 2], array2[n38 + 3]));
                                    n38 += 4;
                                }
                                break;
                            }
                            case 77: {
                                final int n39 = n;
                                final int n40 = n3 - 2;
                                n = n39;
                                if (n40 < 0) {
                                    break Label_1861;
                                }
                                ((List)list).add((Object)new svg(array2[n39], array2[1]));
                                while (true) {
                                    n = n39;
                                    if (n15 > n40) {
                                        break Label_1861;
                                    }
                                    ((List)list).add((Object)new rvg(array2[n15], array2[n15 + 1]));
                                    n15 += 2;
                                }
                                break;
                            }
                            case 76: {
                                int n42;
                                final int n41 = n42 = n;
                                while (true) {
                                    n = n41;
                                    if (n42 > n3 - 2) {
                                        break Label_1861;
                                    }
                                    ((List)list).add((Object)new rvg(array2[n42], array2[n42 + 1]));
                                    n42 += 2;
                                }
                                break;
                            }
                            case 72: {
                                int n44;
                                final int n43 = n44 = n;
                                while (true) {
                                    n = n43;
                                    if (n44 > n3 - 1) {
                                        break Label_1861;
                                    }
                                    ((List)list).add((Object)new qvg(array2[n44]));
                                    ++n44;
                                }
                                break;
                            }
                            case 67: {
                                int n46;
                                final int n45 = n46 = n;
                                while (true) {
                                    n = n45;
                                    if (n46 > n3 - 6) {
                                        break Label_1861;
                                    }
                                    ((List)list).add((Object)new pvg(array2[n46], array2[n46 + 1], array2[n46 + 2], array2[n46 + 3], array2[n46 + 4], array2[n46 + 5]));
                                    n46 += 6;
                                }
                                break;
                            }
                            case 65: {
                                int n48;
                                final int n47 = n48 = n;
                                while (true) {
                                    n = n47;
                                    if (n48 > n3 - 7) {
                                        break Label_1861;
                                    }
                                    final float n49 = array2[n48];
                                    final float n50 = array2[n48 + 1];
                                    final float n51 = array2[n48 + 2];
                                    int n52;
                                    if (Float.compare(array2[n48 + 3], 0.0f) != 0) {
                                        n52 = 1;
                                    }
                                    else {
                                        n52 = n47;
                                    }
                                    int n53;
                                    if (Float.compare(array2[n48 + 4], 0.0f) != 0) {
                                        n53 = 1;
                                    }
                                    else {
                                        n53 = n47;
                                    }
                                    ((List)list).add((Object)new nvg(n49, n50, n51, (boolean)(n52 != 0), (boolean)(n53 != 0), array2[n48 + 5], array2[n48 + 6]));
                                    n48 += 7;
                                }
                                break;
                            }
                        }
                    }
                    n = n17;
                }
                i = n7;
            }
        }
    }
    
    public void M(final Bundle bundle) {
        final i9k i9k = (i9k)this.w;
        final j9k a = i9k.a;
        if (!i9k.e) {
            i9k.a();
        }
        if (((gbd)a).d().b().a(tad.y)) {
            fvd.j((Object)((gbd)a).d().b(), "performRestore cannot be called when owner is ");
            return;
        }
        if (!i9k.g) {
            Bundle p = null;
            if (bundle != null) {
                p = p;
                if (ek.j(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    p = ek.p(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
            }
            i9k.f = p;
            i9k.g = true;
            return;
        }
        en9.q("SavedStateRegistry was already restored.");
    }
    
    public void N(final Bundle bundle) {
        final i9k i9k = (i9k)this.w;
        final Bundle v = ach.v((yog[])Arrays.copyOf((Object[])new yog[0], 0));
        final Bundle f = i9k.f;
        if (f != null) {
            v.putAll(f);
        }
        final vzq c;
        monitorenter(c = i9k.c);
        Label_0142: {
            try {
                for (final Map$Entry map$Entry : i9k.d.entrySet()) {
                    v.putBundle((String)map$Entry.getKey(), ((h9k)map$Entry.getValue()).a());
                }
            }
            finally {
                break Label_0142;
            }
            monitorexit(c);
            if (!ek.t(v)) {
                final Bundle bundle2;
                bundle2.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", v);
            }
            return;
        }
        monitorexit(c);
    }
    
    public rl1 O() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[16384];
        JSONObject jsonObject2 = null;
        Label_0117: {
            try {
                final FileInputStream fileInputStream = new FileInputStream(this.A());
                Label_0074: {
                    try {
                        final int read = fileInputStream.read(array, 0, 16384);
                        if (read < 0) {
                            final JSONObject jsonObject = new JSONObject(byteArrayOutputStream.toString());
                            fileInputStream.close();
                            break Label_0117;
                        }
                        break Label_0074;
                    }
                    finally {
                        try {
                            fileInputStream.close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)jsonObject2).addSuppressed(t);
                        }
                        final int read;
                        byteArrayOutputStream.write(array, 0, read);
                    }
                }
            }
            catch (final IOException | JSONException ex) {
                jsonObject2 = new JSONObject();
            }
        }
        final String optString = jsonObject2.optString("Fid", (String)null);
        final int optInt = jsonObject2.optInt("Status", 0);
        final String optString2 = jsonObject2.optString("AuthToken", (String)null);
        final String optString3 = jsonObject2.optString("RefreshToken", (String)null);
        final long optLong = jsonObject2.optLong("TokenCreationEpochInSecs", 0L);
        final long optLong2 = jsonObject2.optLong("ExpiresInSecs", 0L);
        final String optString4 = jsonObject2.optString("FisError", (String)null);
        final int h = rl1.h;
        final byte b = (byte)(0x0 | 0x2 | 0x1);
        final int n = ge9.F(5)[optInt];
        if (n == 0) {
            fvd.k("Null registrationStatus");
            return null;
        }
        final byte b2 = (byte)((byte)(b | 0x2) | 0x1);
        if (b2 == 3 && n != 0) {
            return new rl1(optString, n, optString2, optString3, optLong2, optLong, optString4);
        }
        final StringBuilder sb = new StringBuilder();
        if (n == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 0x1) == 0x0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 0x2) == 0x0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        uy8.n((Object)sb, "Missing required properties:");
        return null;
    }
    
    public void P(final String s, final h9k h9k) {
        final i9k i9k = (i9k)this.w;
        final vzq c;
        monitorenter(c = i9k.c);
        Label_0068: {
            try {
                if (!((Map)i9k.d).containsKey((Object)s)) {
                    ((Map)i9k.d).put((Object)s, (Object)h9k);
                    monitorexit(c);
                    return;
                }
            }
            finally {
                break Label_0068;
            }
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
        monitorexit(c);
    }
    
    public void Q() {
        if (((i9k)this.w).h) {
            i2j x;
            if ((x = (i2j)this.x) == null) {
                x = new i2j(this);
            }
            this.x = x;
            try {
                f7d.class.getDeclaredConstructor((Class<?>[])null);
                final i2j i2j = (i2j)this.x;
                if (i2j != null) {
                    i2j.b(f7d.class.getName());
                }
                return;
            }
            catch (final NoSuchMethodException ex) {
                final String simpleName = f7d.class.getSimpleName();
                final StringBuilder sb = new StringBuilder("Class ");
                sb.append(simpleName);
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), (Throwable)ex);
            }
        }
        en9.q("Can not perform this action after onSaveInstanceState");
    }
    
    public nbb R(final String s) {
        final String s2 = (String)this.w;
        final StringBuilder sb = new StringBuilder("https://");
        sb.append(s);
        sb.append("/projects/");
        sb.append(s2);
        sb.append("/settings");
        final HttpURLConnection n = wab.n(sb.toString());
        ((URLConnection)n).setRequestProperty("Content-Type", "application/json; charset=utf-8");
        final int responseCode = n.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream;
            try {
                inputStream = ((URLConnection)n).getInputStream();
            }
            catch (final IOException ex) {
                inputStream = n.getErrorStream();
            }
            return new nbb(n, inputStream, (OutputStream)null, (byte)0);
        }
        n.disconnect();
        final StringBuilder p = hia.p(responseCode, "HTTP ", ": ");
        p.append(n.getResponseMessage());
        throw new IOException(p.toString());
    }
    
    public boolean S(final Uri uri, final String package1) {
        final Context context = (Context)this.w;
        final Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (package1 != null) {
            intent.setPackage(package1);
        }
        intent.setFlags(268435456);
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }
    
    public void T() {
        final wmm wmm = (wmm)this.w;
        if (wmm != null) {
            ((bqc)wmm).g((CancellationException)null);
        }
        this.x = new dg0((dlo)yi2.e, (Object)0.0f, (ig0)null, 60);
    }
    
    public void U(final MapsEvents$MapsInteracted mapsEvents$MapsInteracted) {
        if (mapsEvents$MapsInteracted.d().length() == 0) {
            return;
        }
        final st4 st4 = (st4)this.w;
        final MapsEvents$MapsInteracted b = MapsEvents$MapsInteracted.b(mapsEvents$MapsInteracted, (MapsEvents$MapsSurface)this.x);
        final KSerializer serializer = MapsEvents$MapsInteracted.Companion.serializer();
        vt4.b0(serializer);
        st4.b((v10)b, (KSerializer)serializer);
    }
    
    public void V(final MapsEvents$MapsViewed mapsEvents$MapsViewed) {
        if (mapsEvents$MapsViewed.c().length() == 0) {
            return;
        }
        final st4 st4 = (st4)this.w;
        final MapsEvents$MapsViewed b = MapsEvents$MapsViewed.b(mapsEvents$MapsViewed, (MapsEvents$MapsSurface)this.x);
        final KSerializer serializer = MapsEvents$MapsViewed.Companion.serializer();
        vt4.b0(serializer);
        st4.b((v10)b, (KSerializer)serializer);
    }
    
    public void W(final MapsEvents$MapsInteracted mapsEvents$MapsInteracted) {
        this.U(mapsEvents$MapsInteracted);
        final st4 st4 = (st4)this.w;
        final MobileAppUseEvents$MobileAppUseConversion mobileAppUseEvents$MobileAppUseConversion = new MobileAppUseEvents$MobileAppUseConversion(mapsEvents$MapsInteracted.c());
        final KSerializer serializer = MobileAppUseEvents$MobileAppUseConversion.Companion.serializer();
        vt4.b0(serializer);
        st4.b((v10)mobileAppUseEvents$MobileAppUseConversion, (KSerializer)serializer);
    }
    
    public void X(final float n, xc8 e, final oc7 oc7) {
        if (n <= e.w0(1.0f)) {
            return;
        }
        final r7m a = q7m.a();
        if (a != null) {
            e = (xc8)a.e();
        }
        else {
            e = null;
        }
        final r7m b = q7m.b(a);
        Label_0188: {
            float floatValue;
            try {
                floatValue = ((Number)((dg0)this.x).w.getValue()).floatValue();
                final wmm wmm = (wmm)this.w;
                if (wmm != null) {
                    ((bqc)wmm).g((CancellationException)null);
                }
            }
            finally {
                break Label_0188;
            }
            final dg0 dg0 = (dg0)this.x;
            if (dg0.A) {
                this.x = yi2.q(dg0, floatValue - n, 0.0f, 30);
            }
            else {
                this.x = new dg0((dlo)yi2.e, (Object)(-n), (ig0)null, 60);
            }
            final oc7 oc8;
            this.w = rhc.G(oc8, (hc7)null, 0, (zta)new ja8((byte)26, (f07)null, (Object)this), 3);
            q7m.d(a, b, (lta)e);
            return;
        }
        q7m.d(a, b, (lta)e);
    }
    
    public nbb Y(String requestProperty) {
        final HttpURLConnection r = ((wab)this.x).r(requestProperty);
        if ((requestProperty = ((URLConnection)r).getRequestProperty("Content-Encoding")) == null) {
            requestProperty = "";
        }
        Object outputStream;
        if (kym.I0((CharSequence)requestProperty, (CharSequence)"gzip", false)) {
            outputStream = new GZIPOutputStream(((URLConnection)r).getOutputStream());
        }
        else {
            outputStream = ((URLConnection)r).getOutputStream();
            outputStream.getClass();
        }
        return new nbb(r, (InputStream)null, (OutputStream)outputStream, (byte)1);
    }
    
    public void Z(final iif iif) {
        final tmf tmf = (tmf)this.w;
        final Object g = ((tmf)this.x).g((Object)iif);
        if (g != null) {
            if (g instanceof emf) {
                final emf emf = (emf)g;
                final Object[] a = emf.a;
                for (int b = emf.b, i = 0; i < b; ++i) {
                    final Object o = a[i];
                    o.getClass();
                    gkf.c(tmf, (gif)o, (lta)new trf((Object)iif, (byte)0));
                }
            }
            else {
                gkf.c(tmf, (gif)g, (lta)new trf((Object)iif, (byte)0));
            }
        }
    }
    
    public int a(final char[] array, final int n, final int n2) {
        final qn2 qn2 = (qn2)this.x;
        final Character c = (Character)this.w;
        int n3;
        if (c != null) {
            array[n] = c;
            this.w = null;
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        while (n3 < n2 && !qn2.I()) {
            final int o0 = qn2.o0();
            if (o0 <= 65535) {
                array[n + n3] = (char)o0;
                ++n3;
            }
            else {
                final char c2 = (char)((o0 >>> 10) + 55232);
                final char c3 = (char)((o0 & 0x3FF) + 56320);
                array[n + n3] = c2;
                final int n4 = n3 + 1;
                if (n4 < n2) {
                    array[n4 + n] = c3;
                    n3 += 2;
                }
                else {
                    this.w = c3;
                    n3 = n4;
                }
            }
        }
        if (n3 > 0) {
            return n3;
        }
        return -1;
    }
    
    @Override
    public void b(final h1n h1n) {
        final amf amf = (amf)this.x;
        amf.a();
        final fmf v = h1n.v;
        final Object[] b = v.b;
        final long[] c = v.c;
        int n;
        for (int i = v.e; i != Integer.MAX_VALUE; i = n) {
            n = (int)(c[i] >> 31 & 0x7FFFFFFFL);
            final Object o = b[i];
            final Object b2 = ((b4d)this.w).b(o);
            final int d = amf.d(b2);
            int n2;
            if (d >= 0) {
                n2 = amf.c[d];
            }
            else {
                n2 = 0;
            }
            if (n2 == 7) {
                h1n.remove(o);
            }
            else {
                amf.g(n2 + 1, b2);
            }
        }
    }
    
    public void c(final Object o, final String s) {
        final int length = s.length();
        final String value = String.valueOf(o);
        ((ArrayList)this.w).add((Object)lmf.u(new StringBuilder(length + 1 + value.length()), s, "=", value));
    }
    
    public void cancel() {
        if (!((AtomicInteger)this.x).compareAndSet(1, 1)) {
            ((qn1)this.w).a();
        }
    }
    
    public boolean d(final Object o) {
        final float floatValue = this.D();
        if (floatValue != 0.0f) {
            if (floatValue != 100.0f) {
                if (((Random)((l7n)this.x).getValue()).nextFloat() * 100.0f > floatValue) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public Bundle e(final String s) {
        final i9k i9k = (i9k)this.w;
        if (!i9k.g) {
            en9.q("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        final Bundle f = i9k.f;
        if (f == null) {
            return null;
        }
        Bundle p;
        if (ek.j(f, s)) {
            p = ek.p(f, s);
        }
        else {
            p = null;
        }
        f.remove(s);
        if (ek.t(f)) {
            i9k.f = null;
        }
        return p;
    }
    
    public Uri f(final String s, final String s2, final OffsetDateTime offsetDateTime, final ContentValues contentValues, final boolean b) {
        final wz2 wz2 = (wz2)this.x;
        final Uri uri = null;
        String d;
        while (true) {
            try {
                final EventInfo eventInfo = (EventInfo)c86.I0(wz2.b(lq6.X((Object)s)));
                if (eventInfo != null) {
                    d = eventInfo.d();
                }
                else {
                    d = null;
                }
            }
            catch (final Exception ex) {
                final tqd l = uqd.l;
                continue;
            }
            break;
        }
        Label_0222: {
            Uri build;
            try {
                if (d == null) {
                    throw new IllegalStateException("Cannot find sync ID for recurring event: ".concat(s));
                }
                if (b) {
                    build = CalendarContract$Events.CONTENT_EXCEPTION_URI.buildUpon().appendPath(s).build();
                }
                else {
                    build = (Uri)wz2.a(s2).v;
                }
                if (build == null) {
                    throw new IllegalStateException("Cannot build exception URI for calendar: ".concat(s2));
                }
                contentValues.put("original_sync_id", d);
                contentValues.put("originalInstanceTime", Long.valueOf(offsetDateTime.toInstant().toEpochMilli()));
                if (!b) {
                    contentValues.put("calendar_id", s2);
                }
            }
            catch (final Exception ex2) {
                break Label_0222;
            }
            final Uri insert = ((Context)this.w).getContentResolver().insert(build, contentValues);
            if (insert != null) {
                final tqd i = uqd.l;
            }
            else {
                final tqd j = uqd.l;
            }
            return insert;
        }
        final tqd k = uqd.l;
        final Exception ex2;
        SilentException.a(new SilentException("Failed to create recurrence exception instance: ".concat(t4r.e((Throwable)ex2))), lpl.w, (List)null, 6);
        return uri;
    }
    
    public void g() {
        final inf inf = (inf)this.w;
        final Object[] v = inf.v;
        final int x = inf.x;
        int i = 0;
        Arrays.sort(v, 0, x, (Comparator)w8g.w);
        final int x2 = inf.x;
        final LayoutNode[] array = (LayoutNode[])this.x;
        LayoutNode[] x3 = null;
        Label_0072: {
            if (array != null) {
                x3 = array;
                if (array.length >= x2) {
                    break Label_0072;
                }
            }
            x3 = new LayoutNode[Math.max(16, x2)];
        }
        this.x = null;
        while (i < x2) {
            x3[i] = (LayoutNode)inf.v[i];
            ++i;
        }
        inf.h();
        for (int n = x2 - 1; -1 < n; --n) {
            final LayoutNode layoutNode = x3[n];
            layoutNode.getClass();
            if (layoutNode.h0) {
                j(layoutNode);
            }
            x3[n] = null;
        }
        this.x = x3;
    }
    
    public Object get() {
        switch (this.v) {
            default: {
                return new a3k((l55)new eup((byte)27), (l55)new p3((byte)27), gl1.f, (gdk)((gfi)this.w).get(), (gfi)this.x);
            }
            case 11: {
                return new o8f((Context)((o3a)this.w).v, (zn0)((v2b)this.x).get());
            }
        }
    }
    
    public void h(dti dti, final snj snj) {
        dti = (dti)this.w;
        final f7g f7g = (f7g)this.x;
        try {
            final rnj c = f7g.c(snj);
            try {
                ((m03)dti).f((c03)f7g, c);
            }
            finally {
                ri2.B0((Throwable)dti);
                ((Throwable)dti).printStackTrace();
            }
        }
        finally {
            final Throwable t;
            ri2.B0(t);
            try {
                ((m03)dti).i((c03)f7g, t);
            }
            finally {
                final Throwable t2;
                ri2.B0(t2);
                t2.printStackTrace();
            }
        }
    }
    
    @Override
    public boolean i(final Object o, final Object o2) {
        final b4d b4d = (b4d)this.w;
        return mlc.q(b4d.b(o), b4d.b(o2));
    }
    
    public void k(final hra hra, final boolean b) {
        final hra y = ((vra)this.w).y;
        if (y != null) {
            y.j().o.k(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public void l(final dti dti, final IOException ex) {
        try {
            ((m03)this.w).i((c03)this.x, (Throwable)ex);
        }
        finally {
            final Throwable t;
            ri2.B0(t);
            t.printStackTrace();
        }
    }
    
    public String m(Object a) {
        a = ((i0k)this.w).a(a);
        if (a == null) {
            return null;
        }
        return ((k0k)this.x).m(a);
    }
    
    public void n(final hra hra, final boolean b) {
        final vra vra = (vra)this.w;
        final Context y = vra.w.y;
        final hra y2 = vra.y;
        if (y2 != null) {
            y2.j().o.n(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public void o(final hra hra, final boolean b) {
        final hra y = ((vra)this.w).y;
        if (y != null) {
            y.j().o.o(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public void p(final hra hra, final boolean b) {
        final hra y = ((vra)this.w).y;
        if (y != null) {
            y.j().o.p(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public void q(final hra hra, final boolean b) {
        final hra y = ((vra)this.w).y;
        if (y != null) {
            y.j().o.q(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public void r(final hra hra, final boolean b) {
        final hra y = ((vra)this.w).y;
        if (y != null) {
            y.j().o.r(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public void s(final hra hra, final boolean b) {
        final vra vra = (vra)this.w;
        final Context y = vra.w.y;
        final hra y2 = vra.y;
        if (y2 != null) {
            y2.j().o.s(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public void t(final hra hra, final boolean b) {
        final hra y = ((vra)this.w).y;
        if (y != null) {
            y.j().o.t(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 14: {
                final StringBuilder sb = new StringBuilder(100);
                sb.append(this.x.getClass().getSimpleName());
                sb.append('{');
                final ArrayList list = (ArrayList)this.w;
                for (int size = list.size(), i = 0; i < size; ++i) {
                    sb.append((String)list.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            }
        }
    }
    
    public void u(final hra hra, final boolean b) {
        final hra y = ((vra)this.w).y;
        if (y != null) {
            y.j().o.u(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public void v(final hra hra, final Bundle bundle, final boolean b) {
        final hra y = ((vra)this.w).y;
        if (y != null) {
            y.j().o.v(hra, bundle, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public void w(final hra hra, final boolean b) {
        final hra y = ((vra)this.w).y;
        if (y != null) {
            y.j().o.w(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public void x(final hra hra, final boolean b) {
        final hra y = ((vra)this.w).y;
        if (y != null) {
            y.j().o.x(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public void y(final hra hra, final boolean b) {
        final hra y = ((vra)this.w).y;
        if (y != null) {
            y.j().o.y(hra, true);
        }
        final Iterator iterator = ((CopyOnWriteArrayList)this.x).iterator();
        iterator.getClass();
        if (!iterator.hasNext()) {
            return;
        }
        ge9.C(iterator.next());
        if (b) {
            throw null;
        }
        throw null;
    }
    
    public CctBackendFactory z(String className) {
        Object empty_MAP;
        if ((empty_MAP = this.x) == null) {
            final Context context = (Context)this.w;
            Object metaData = null;
            Label_0125: {
                while (true) {
                    try {
                        final PackageManager packageManager = context.getPackageManager();
                        if (packageManager == null) {
                            Log.w("BackendRegistry", "Context has no PackageManager.");
                        }
                        else {
                            final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class)TransportBackendDiscovery.class), 128);
                            if (serviceInfo != null) {
                                metaData = serviceInfo.metaData;
                                break Label_0125;
                            }
                            Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        }
                        metaData = null;
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        Log.w("BackendRegistry", "Application info not found.");
                        continue;
                    }
                    break;
                }
            }
            if (metaData == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                empty_MAP = Collections.EMPTY_MAP;
            }
            else {
                final HashMap hashMap = new HashMap();
                for (final String s : ((BaseBundle)metaData).keySet()) {
                    final Object value = ((BaseBundle)metaData).get(s);
                    if (value instanceof String && s.startsWith("backend:")) {
                        final String[] split = ((String)value).split(",", -1);
                        for (int length = split.length, i = 0; i < length; ++i) {
                            final String trim = split[i].trim();
                            if (!trim.isEmpty()) {
                                hashMap.put((Object)trim, (Object)s.substring(8));
                            }
                        }
                    }
                }
                empty_MAP = hashMap;
            }
            this.x = empty_MAP;
        }
        className = (String)((Map)empty_MAP).get((Object)className);
        if (className == null) {
            return null;
        }
        Label_0492: {
            Label_0447: {
                Label_0402: {
                    Label_0383: {
                        try {
                            return (CctBackendFactory)Class.forName(className).asSubclass(CctBackendFactory.class).getDeclaredConstructor((Class<?>[])null).newInstance((Object[])null);
                        }
                        catch (final InvocationTargetException ex2) {}
                        catch (final NoSuchMethodException ex3) {
                            break Label_0383;
                        }
                        catch (final InstantiationException ex4) {
                            break Label_0402;
                        }
                        catch (final IllegalAccessException ex5) {
                            break Label_0447;
                        }
                        catch (final ClassNotFoundException ex6) {
                            break Label_0492;
                        }
                        final InvocationTargetException ex2;
                        Log.w("BackendRegistry", "Could not instantiate ".concat(className), (Throwable)ex2);
                        return null;
                    }
                    final NoSuchMethodException ex3;
                    Log.w("BackendRegistry", "Could not instantiate ".concat(className), (Throwable)ex3);
                    return null;
                }
                final StringBuilder sb = new StringBuilder("Could not instantiate ");
                sb.append(className);
                sb.append(".");
                final InstantiationException ex4;
                Log.w("BackendRegistry", sb.toString(), (Throwable)ex4);
                return null;
            }
            final StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(className);
            sb2.append(".");
            final IllegalAccessException ex5;
            Log.w("BackendRegistry", sb2.toString(), (Throwable)ex5);
            return null;
        }
        final StringBuilder sb3 = new StringBuilder("Class ");
        sb3.append(className);
        sb3.append(" is not found.");
        final ClassNotFoundException ex6;
        Log.w("BackendRegistry", sb3.toString(), (Throwable)ex6);
        return null;
    }
}
