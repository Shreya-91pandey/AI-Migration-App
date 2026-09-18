import java.text.DateFormat;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayDeque;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import io.sentry.util.m;

public final class ec0 extends ThreadLocal
{
    public final byte a;
    
    public final Object initialValue() {
        switch (this.a) {
            default: {
                return new m();
            }
            case 4: {
                return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
            }
            case 3: {
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSzzz", Locale.ROOT);
                ((DateFormat)simpleDateFormat).setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            }
            case 2: {
                final SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                ((DateFormat)simpleDateFormat2).setLenient(false);
                ((DateFormat)simpleDateFormat2).setTimeZone(icq.a);
                return simpleDateFormat2;
            }
            case 1: {
                final Object o = new Object();
                new ArrayDeque();
                return o;
            }
            case 0: {
                final Choreographer instance = Choreographer.getInstance();
                final Looper myLooper = Looper.myLooper();
                hc7 s0;
                if (myLooper != null) {
                    final gc0 gc0 = new gc0(instance, uoo.y(myLooper));
                    s0 = uuj.s0((hc7)gc0, (hc7)gc0.F);
                }
                else {
                    en9.q("no Looper on this thread");
                    s0 = null;
                }
                return s0;
            }
        }
    }
}
