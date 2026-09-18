import java.util.Collection;
import android.os.Build;
import android.os.Build$VERSION;
import java.util.HashSet;

public abstract class bj0
{
    public static final HashSet c;
    public final String a;
    public final String b;
    
    static {
        c = new HashSet();
    }
    
    public bj0(final String a, final String b) {
        this.a = a;
        this.b = b;
        bj0.c.add((Object)this);
    }
    
    public boolean a() {
        return Build$VERSION.SDK_INT >= 33;
    }
    
    public boolean b() {
        final HashSet a = zi0.a;
        final String b = this.b;
        if (!a.contains((Object)b)) {
            final String type = Build.TYPE;
            if ((!"eng".equals((Object)type) && !"userdebug".equals((Object)type)) || !((Collection)a).contains((Object)b.concat(":dev"))) {
                return false;
            }
        }
        return true;
    }
}
