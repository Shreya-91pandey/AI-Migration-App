import java.util.List;
import android.content.Context;

public final class hjh
{
    public final String a;
    public final j9j b;
    public final lta c;
    public final oc7 d;
    public final Object e;
    public volatile gjh f;
    
    public hjh(final String a, final j9j b, final lta c, final oc7 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new Object();
    }
    
    public final Object a(Object e) {
        final Context context = (Context)e;
        final gjh f = this.f;
        if (f != null) {
            return f;
        }
        e = this.e;
        final Object o;
        monitorenter(o = e);
        Label_0121: {
            try {
                if (this.f == null) {
                    final Context applicationContext = context.getApplicationContext();
                    final j9j b = this.b;
                    final lta c = this.c;
                    applicationContext.getClass();
                    this.f = mlc.x(b, (List)c.b((Object)applicationContext), this.d, (jta)new nob((Object)applicationContext, (Object)this, (byte)24));
                }
            }
            finally {
                break Label_0121;
            }
            final gjh f2 = this.f;
            f2.getClass();
            monitorexit(o);
            return f2;
        }
        monitorexit(o);
    }
}
