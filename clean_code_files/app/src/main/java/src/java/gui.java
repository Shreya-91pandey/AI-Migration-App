import java.util.LinkedHashMap;
import java.util.Map;
import android.text.TextUtils;
import org.json.JSONException;
import android.util.Log;
import org.json.JSONObject;

public final class gui
{
    public final long a;
    public final Object b;
    public final Object c;
    
    public gui(final long a, final String b, final String c) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public gui(final long a, final qd6 b) {
        this.a = a;
        this.b = b;
        this.c = new fui(this, a);
    }
    
    public static String a(final long n, String string, final String s) {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("token", (Object)string);
            jsonObject.put("appVersion", (Object)s);
            jsonObject.put("timestamp", n);
            string = jsonObject.toString();
            return string;
        }
        catch (final JSONException ex) {
            final StringBuilder sb = new StringBuilder("Failed to encode token: ");
            sb.append((Object)ex);
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }
    
    public static gui b(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return null;
        }
        if (string.startsWith("{")) {
            try {
                final JSONObject jsonObject = new JSONObject(string);
                final String string2 = jsonObject.getString("token");
                string = jsonObject.getString("appVersion");
                return new gui(jsonObject.getLong("timestamp"), string2, string);
            }
            catch (final JSONException ex) {
                final StringBuilder sb = new StringBuilder("Failed to parse token: ");
                sb.append((Object)ex);
                Log.w("FirebaseMessaging", sb.toString());
                return null;
            }
        }
        return new gui(0L, string, null);
    }
    
    public void c(final vse vse, final a1c a1c, final Map map, long b) {
        final fui fui = (fui)this.c;
        final long b2 = fui.b;
        final LinkedHashMap a = fui.a;
        if (b <= b2) {
            final eui eui = new eui(a1c, map, b);
            final Object put = ((Map)a).put((Object)vse, (Object)eui);
            b = fui.b();
            fui.c = fui.c(vse, eui) + b;
            if (put != null) {
                fui.c = fui.b() - fui.c(vse, put);
                fui.a(vse, put, eui);
            }
            fui.d(fui.b);
            return;
        }
        final Object remove = ((Map)a).remove((Object)vse);
        if (remove != null) {
            fui.c = fui.b() - fui.c(vse, remove);
            fui.a(vse, remove, null);
        }
        ((qd6)this.b).x(vse, a1c, map, b);
    }
}
