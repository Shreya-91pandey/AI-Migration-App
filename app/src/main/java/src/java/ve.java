import java.util.Map;
import java.util.Iterator;
import java.util.Locale;
import com.datadog.android.rum.DdRumContentProvider;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.view.Window;
import java.util.Collection;
import java.io.File;

public final class ve extends qxc implements jta
{
    public final byte w;
    public final Object x;
    
    public ve(final yn2 yn2, final v28 x) {
        this.w = 7;
        this.x = x;
        super(0);
    }
    
    @Override
    public final Object a() {
        final byte w = this.w;
        Object string = null;
        boolean b = true;
        boolean b2 = true;
        int i = 0;
        final lqo a = lqo.a;
        final Object x = this.x;
        switch (w) {
            default: {
                final yxl yxl = (yxl)x;
                return ((vba)yxl.x).a((File)yxl.w);
            }
            case 13: {
                return new cco(((eco)x).v.v());
            }
            case 12: {
                ((ntm)x).d();
                return a;
            }
            case 11: {
                x90.z((bw8)x);
                return a;
            }
            case 10: {
                final Iterable iterable = (Iterable)((Map)((itl)x).E.g().c).values();
                if (!(iterable instanceof Collection) || !((Collection)iterable).isEmpty()) {
                    for (final url url : iterable) {
                        if (url.d() || url.e()) {
                            break;
                        }
                    }
                }
                return a;
            }
            case 9: {
                final Window window = (Window)x;
                final StringBuilder sb = new StringBuilder("Starting jankStats for window ");
                sb.append((Object)window);
                return sb.toString();
            }
            case 8: {
                return ((hba)x).a.c();
            }
            case 7: {
                ((v28)x).a.a().getClass();
                long n = System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
                final long w2 = DdRumContentProvider.w;
                final boolean b3 = n > w2;
                if (w2 - n <= v28.c) {
                    b2 = false;
                }
                if (b3 || b2) {
                    n = w2;
                }
                return n;
            }
            case 6: {
                String string2;
                final String s = string2 = (String)x;
                if (s.length() > 0) {
                    final StringBuilder sb2 = new StringBuilder();
                    final char char1 = s.charAt(0);
                    String s2;
                    if (Character.isLowerCase(char1)) {
                        final Locale us = Locale.US;
                        us.getClass();
                        s2 = lq6.o0(char1, us);
                    }
                    else {
                        s2 = String.valueOf(char1);
                    }
                    sb2.append((Object)s2);
                    sb2.append(s.substring(1));
                    string2 = sb2.toString();
                }
                return string2;
            }
            case 5: {
                return ((hx7)x).c().l;
            }
            case 4: {
                final wt7 wt7 = (wt7)x;
                final String property = System.getProperty("http.agent");
                if (property != null) {
                    final StringBuilder sb3 = new StringBuilder();
                    while (i < property.length()) {
                        final char char2 = property.charAt(i);
                        if (char2 == '\t' || (' ' <= char2 && char2 < '\u007f')) {
                            sb3.append(char2);
                        }
                        ++i;
                    }
                    string = sb3.toString();
                }
                String s3;
                if ((s3 = (String)string) == null) {
                    s3 = "";
                }
                String q = s3;
                if (kym.Y0((CharSequence)s3)) {
                    final String y = wt7.y;
                    final p70 z = wt7.z;
                    q = oz1.q(oz1.t("Datadog/", y, " (Linux; U; Android ", z.A(), "; "), z.x(), " Build/", z.t(), ")");
                }
                return q;
            }
            case 3: {
                final efo efo = (efo)x;
                final Object j = efo.a.i();
                final ec9 x2 = ec9.x;
                if (j != x2 || efo.d.getValue() != x2) {
                    b = false;
                }
                return b;
            }
            case 2: {
                ((bnf)x).setValue((Object)Boolean.FALSE);
                return a;
            }
            case 1: {
                final j80 j2 = (j80)x;
                final jbd e = j2.E;
                if (e != null) {
                    e.a((fbd)j2);
                    return a;
                }
                mlc.j0("lifecycle");
                throw null;
            }
            case 0: {
                return ((md)x).c().n("rum-activity-tracking");
            }
        }
    }
}
