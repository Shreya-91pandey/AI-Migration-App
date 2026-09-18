import java.util.HashMap;
import android.content.pm.PackageManager;
import android.content.Context;
import java.util.Iterator;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Trace;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Collection;
import java.util.Arrays;
import java.io.File;
import java.util.ArrayList;
import android.os.Build$VERSION;
import android.provider.Settings$Secure;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.content.pm.PackageManager$NameNotFoundException;

public final class v69 implements Runnable
{
    public final byte v;
    
    public final void run() {
    Block_12_Outer:
        while (true) {
            while (true) {
                Object o = null;
                switch (this.v) {
                    default: {
                        final qr0 d = sxl.d;
                        if (!d.a.j().d && d.f != null && !d.j) {
                            d.c();
                        }
                        else {
                            d.b();
                        }
                        final rf8 c = sxl.c;
                        o = c.b;
                        Object o2 = ((Context)o).getPackageManager();
                        final String s = "rf8";
                        Label_0203: {
                            String s2 = null;
                            Label_0176: {
                                ApplicationInfo applicationInfo = null;
                                Label_0127: {
                                    if (o2 != null) {
                                        try {
                                            applicationInfo = ((PackageManager)o2).getApplicationInfo(((Context)o).getPackageName(), 0);
                                            break Label_0127;
                                        }
                                        catch (final PackageManager$NameNotFoundException o2) {
                                            s2 = null;
                                            break Label_0176;
                                        }
                                    }
                                    applicationInfo = null;
                                }
                                if (o2 != null) {
                                    s2 = (String)((PackageManager)o2).getApplicationLabel(applicationInfo);
                                }
                                else {
                                    s2 = null;
                                }
                                Label_0199: {
                                    if (o2 != null) {
                                        try {
                                            o2 = ((PackageManager)o2).getPackageInfo(((Context)o).getPackageName(), 0).versionName;
                                            break Label_0199;
                                        }
                                        catch (final PackageManager$NameNotFoundException ex) {}
                                        break Label_0176;
                                    }
                                    o2 = null;
                                }
                                final Object a = s2;
                                break Label_0203;
                            }
                            Log.e("rf8", "Encountered NameNotFoundException in get", (Throwable)o2);
                            o2 = null;
                            final Object a = s2;
                        }
                        final TelephonyManager telephonyManager = (TelephonyManager)((Context)o).getSystemService("phone");
                        if (telephonyManager != null) {
                            final String networkOperatorName = telephonyManager.getNetworkOperatorName();
                        }
                        else {
                            final String networkOperatorName = null;
                        }
                        if (telephonyManager != null) {
                            final String simCountryIso = telephonyManager.getSimCountryIso();
                        }
                        else {
                            final String simCountryIso = null;
                        }
                        final String string = Settings$Secure.getString(((Context)o).getContentResolver(), "android_id");
                        final String release = Build$VERSION.RELEASE;
                        final ArrayList list = new ArrayList();
                        final String[] c2 = rf8.c;
                        for (int i = 0; i < 10; ++i) {
                            final String s3 = c2[i];
                            if (new File(s3).exists()) {
                                list.add((Object)s3);
                            }
                        }
                        final ArrayList list2 = new ArrayList();
                        list2.addAll((Collection)Arrays.asList((Object[])rf8.d));
                        list2.addAll((Collection)Arrays.asList((Object[])rf8.e));
                        list2.addAll((Collection)Arrays.asList((Object[])rf8.f));
                        final Object o3 = ((Context)o).getPackageManager();
                        final ArrayList list3 = new ArrayList();
                        if (o3 != null) {
                            o = list2.iterator();
                            break;
                        }
                        break Label_0440;
                    }
                    case 0: {
                        Label_1155: {
                            break Label_1155;
                            final String s4 = (String)((Iterator)o).next();
                            try {
                                Object o3 = null;
                                ((PackageManager)o3).getPackageInfo(s4, 0);
                                final ArrayList list3;
                                list3.add((Object)s4);
                                break;
                                while (true) {
                                    final rf8 c;
                                    Object o2 = null;
                                    final String s;
                                    Object a = null;
                                    final String networkOperatorName;
                                    final String simCountryIso;
                                    final String string;
                                    final ArrayList list;
                                    String s5 = null;
                                    ArrayList list4 = null;
                                    int length = 0;
                                    int n = 0;
                                    String[] split;
                                    int n2;
                                    qf8 h = null;
                                    int n3 = 0;
                                    int length2;
                                    int n4 = 0;
                                    int a2;
                                    int a3;
                                    ArrayList list5 = null;
                                    String s6;
                                    String message;
                                    int length3;
                                    Iterator iterator;
                                    String s7;
                                    String s8 = null;
                                    String[] g = null;
                                    String s9 = null;
                                    Label_0586:Label_0562_Outer:
                                    while (true) {
                                    Label_0571:
                                        while (true) {
                                            Block_20: {
                                                while (true) {
                                                    Label_0804_Outer:Block_33_Outer:Label_0923_Outer:
                                                    while (true) {
                                                        Log.e(s, "Error formatting mount: ".concat(s5));
                                                    Label_0923:
                                                        while (true) {
                                                            Label_0883:Label_0609_Outer:
                                                            while (true) {
                                                            Label_0609:
                                                                while (true) {
                                                                    Block_22: {
                                                                    Block_27_Outer:
                                                                        while (true) {
                                                                            while (true) {
                                                                            Label_0734:
                                                                                while (true) {
                                                                                    while (true) {
                                                                                        Label_0967: {
                                                                                            break Label_0967;
                                                                                            list4 = new ArrayList();
                                                                                            length = ((j60)o3).length;
                                                                                            n = 0;
                                                                                            break Label_0883;
                                                                                            iftrue(Label_0955:)(!split[n2].equalsIgnoreCase("rw"));
                                                                                            break Label_0586;
                                                                                            Label_0795: {
                                                                                                while (true) {
                                                                                                    o = "";
                                                                                                    iftrue(Label_0519:)(o3 != null);
                                                                                                    break Block_20;
                                                                                                    try {
                                                                                                        Label_0748: {
                                                                                                            o3 = new Scanner((InputStream)o3).useDelimiter("\\A").next();
                                                                                                        }
                                                                                                    }
                                                                                                    catch (NoSuchElementException o3) {
                                                                                                        Log.e("rf8", "Error reading mount", (Throwable)o3);
                                                                                                        o3 = o;
                                                                                                    }
                                                                                                    break Label_0795;
                                                                                                    Label_0955: {
                                                                                                        ++n2;
                                                                                                    }
                                                                                                    break Label_0923;
                                                                                                    h = rf8.h;
                                                                                                    try {
                                                                                                        o3 = Runtime.getRuntime().exec("getprop").getInputStream();
                                                                                                    }
                                                                                                    catch (final IOException o) {
                                                                                                        o3 = ((Throwable)o).getMessage();
                                                                                                        if (o3 == null || !((String)o3).contains((CharSequence)"No such file or directory")) {
                                                                                                            Log.e("rf8", "Error reading properties", (Throwable)o);
                                                                                                        }
                                                                                                        o3 = null;
                                                                                                    }
                                                                                                    continue Label_0923_Outer;
                                                                                                }
                                                                                                iftrue(Label_0676:)(n3 >= length2);
                                                                                                break Block_22;
                                                                                                iftrue(Label_0967:)(n4 >= 7);
                                                                                                break Label_0804_Outer;
                                                                                                while (true) {
                                                                                                    break Label_0609;
                                                                                                    try {
                                                                                                        a2 = wbo.a;
                                                                                                        Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                                                                                                        if (q69.d()) {
                                                                                                            q69.a().f();
                                                                                                        }
                                                                                                        Trace.endSection();
                                                                                                        return;
                                                                                                    }
                                                                                                    finally {
                                                                                                        a3 = wbo.a;
                                                                                                        Trace.endSection();
                                                                                                    }
                                                                                                    ++n4;
                                                                                                    continue Label_0883;
                                                                                                    list5.add((Object)s6);
                                                                                                    continue Label_0609_Outer;
                                                                                                }
                                                                                            }
                                                                                            o3 = ((String)o3).split("\n");
                                                                                            continue Block_33_Outer;
                                                                                        }
                                                                                        ++n;
                                                                                        break Label_0883;
                                                                                        try {
                                                                                            Label_0676: {
                                                                                                o3 = Runtime.getRuntime().exec("mount").getInputStream();
                                                                                            }
                                                                                        }
                                                                                        catch (IOException o3) {
                                                                                            message = ((Throwable)o3).getMessage();
                                                                                            if (message == null || !message.contains((CharSequence)"No such file or directory")) {
                                                                                                Log.e("rf8", "Error reading mount", (Throwable)o3);
                                                                                            }
                                                                                            o3 = null;
                                                                                        }
                                                                                        break Label_0734;
                                                                                        o3 = new String[0];
                                                                                        continue Block_33_Outer;
                                                                                    }
                                                                                    iftrue(Label_0961:)(n2 >= length3);
                                                                                    continue Label_0923_Outer;
                                                                                }
                                                                                iftrue(Label_0748:)(o3 != null);
                                                                                continue Label_0562_Outer;
                                                                            }
                                                                            iftrue(Label_0670:)(!iterator.hasNext());
                                                                            Block_23: {
                                                                                break Block_23;
                                                                                Label_0670: {
                                                                                    ++n3;
                                                                                }
                                                                                continue Label_0586;
                                                                            }
                                                                            s7 = (String)iterator.next();
                                                                            iftrue(Label_0667:)(!s6.contains((CharSequence)s7) || !s6.contains((CharSequence)((HashMap)h).get((Object)s7)));
                                                                            continue Block_27_Outer;
                                                                        }
                                                                        Label_0973: {
                                                                            o3 = new j60();
                                                                        }
                                                                        ((j60)o3).c((String)a);
                                                                        ((j60)o3).d((String)o2);
                                                                        ((j60)o3).o();
                                                                        ((j60)o3).b(string);
                                                                        o2 = Build.MANUFACTURER;
                                                                        ((j60)o3).f();
                                                                        o2 = Build.MODEL;
                                                                        ((j60)o3).g();
                                                                        ((j60)o3).m(networkOperatorName);
                                                                        ((j60)o3).n(simCountryIso);
                                                                        ((j60)o3).h();
                                                                        o2 = Build.TAGS;
                                                                        ((j60)o3).e();
                                                                        ((j60)o3).j(list);
                                                                        ((j60)o3).k(list3);
                                                                        ((j60)o3).l(list5);
                                                                        ((j60)o3).i(list4);
                                                                        a = c.a;
                                                                        o2 = new Object();
                                                                        ((hcf)o2).f((j60)o3);
                                                                        ((hcf)o2).g(((j60)o3).a());
                                                                        ((hcf)o2).h(Long.valueOf(System.currentTimeMillis()));
                                                                        ((xzj)((byl)a).x).g((Runnable)new yxl((byl)a, "siftscience.android.device", (hcf)o2));
                                                                        return;
                                                                        o3 = ((String)o3).split("\n");
                                                                        break Label_0571;
                                                                    }
                                                                    s6 = o3[n3];
                                                                    iterator = ((HashMap)h).keySet().iterator();
                                                                    continue Label_0609;
                                                                }
                                                                Label_0864: {
                                                                    s8 = o[1];
                                                                }
                                                                o = o[3];
                                                                g = rf8.g;
                                                                n4 = 0;
                                                                continue Label_0883;
                                                            }
                                                            iftrue(Label_0973:)(n >= length);
                                                            break Label_0923;
                                                            split = ((String)o).split(",");
                                                            length3 = split.length;
                                                            n2 = 0;
                                                            continue Label_0923;
                                                        }
                                                        s5 = o3[n];
                                                        o = s5.split(" ");
                                                        iftrue(Label_0864:)(((String)o).length >= 4);
                                                        continue Label_0804_Outer;
                                                    }
                                                    s9 = g[n4];
                                                    iftrue(Label_0961:)(!s8.equalsIgnoreCase(s9));
                                                    continue;
                                                }
                                            }
                                            o3 = new String[0];
                                            break Label_0571;
                                            try {
                                                Label_0519: {
                                                    o3 = new Scanner((InputStream)o3).useDelimiter("\\A").next();
                                                }
                                            }
                                            catch (NoSuchElementException o3) {
                                                Log.e("rf8", "Error reading properties", (Throwable)o3);
                                                o3 = "";
                                            }
                                            continue;
                                        }
                                        list5 = new ArrayList();
                                        length2 = ((j60)o3).length;
                                        n3 = 0;
                                        continue Label_0586;
                                    }
                                    list4.add((Object)s9);
                                    continue;
                                }
                            }
                            catch (final PackageManager$NameNotFoundException ex2) {
                                break;
                            }
                        }
                        break;
                    }
                }
                if (((Iterator)o).hasNext()) {
                    continue;
                }
                break;
            }
            continue Block_12_Outer;
        }
    }
}
