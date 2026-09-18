import android.util.Log;
import android.os.Trace;
import android.os.Build$VERSION;

public abstract class wbo
{
    public static final int a = 0;
    
    static {
        if (Build$VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong((Object)null);
                final Class type = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", type);
                final Class type2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", type, String.class, type2);
                Trace.class.getMethod("asyncTraceEnd", type, String.class, type2);
                Trace.class.getMethod("traceCounter", type, String.class, type2);
            }
            catch (final Exception ex) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", (Throwable)ex);
            }
        }
    }
}
