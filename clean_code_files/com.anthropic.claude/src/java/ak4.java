import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import android.content.SharedPreferences;

public final class ak4
{
    public static final long h;
    public static final int i = 0;
    public final SharedPreferences a;
    public final hsg b;
    public final ksg c;
    public final hsg d;
    public final hsg e;
    public final ksg f;
    public final ksg g;
    
    static {
        final awp w = lz8.w;
        h = ri2.E0(7, pz8.C);
    }
    
    public ak4(final SharedPreferences a) {
        this.a = a;
        this.b = new hsg(a.getInt("completion_notification_count", 0));
        final boolean contains = a.contains("completion_notification_last_shown_at");
        final dig dig = null;
        Long value;
        if (contains) {
            value = a.getLong("completion_notification_last_shown_at", 0L);
        }
        else {
            value = null;
        }
        this.c = o50.Q((Object)value);
        this.d = new hsg(a.getInt("completion_notification_dismissal_count", 0));
        this.e = new hsg(a.getInt("completion_notification_reprompt_impression_count", 0));
        final String string = a.getString("os_notification_permission_prompt_history", (String)null);
        final Iterator iterator = ((n1)dig.B).iterator();
        Object next;
        do {
            next = dig;
            if (!iterator.hasNext()) {
                break;
            }
            next = iterator.next();
        } while (!((dig)next).v.equals(string));
        dig w;
        if ((w = (dig)next) == null) {
            w = dig.w;
        }
        this.f = o50.Q((Object)w);
        this.g = ge9.m(this.a, "voice_sharing_picker_shown", false);
    }
    
    public final dig a() {
        return (dig)this.f.getValue();
    }
    
    public final void b(final dig value) {
        this.f.setValue((Object)value);
        final SharedPreferences$Editor edit = this.a.edit();
        edit.getClass();
        edit.putString("os_notification_permission_prompt_history", value.v);
        edit.apply();
    }
}
