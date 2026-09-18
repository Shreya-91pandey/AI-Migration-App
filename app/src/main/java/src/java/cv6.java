import java.util.LinkedHashSet;
import android.content.Context;

public abstract class cv6
{
    public final f5q a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;
    
    public cv6(Context applicationContext, final f5q a) {
        this.a = a;
        applicationContext = applicationContext.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }
    
    public abstract Object a();
    
    public final void b(final Object obj) {
        final Object c;
        monitorenter(c = this.c);
        Label_0087: {
            try {
                final Object e = this.e;
                if (e != null && e.equals(obj)) {
                    monitorexit(c);
                    return;
                }
            }
            finally {
                break Label_0087;
            }
            final Throwable e2;
            this.e = e2;
            this.a.d.execute((Runnable)new ue((Object)c86.s1((Iterable)this.d), (Object)this, (byte)13));
            monitorexit(c);
            return;
        }
        monitorexit(c);
    }
    
    public abstract void c();
    
    public abstract void d();
}
