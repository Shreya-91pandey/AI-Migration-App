import java.util.Map;
import java.util.Set;
import java.util.LinkedHashSet;
import androidx.window.extensions.core.util.function.Consumer;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class q2a extends p2a
{
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    
    public q2a(final WindowLayoutComponent windowLayoutComponent, final bw6 bw6) {
        super(windowLayoutComponent, bw6);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }
    
    @Override
    public final void a(final ira ira) {
        final LinkedHashMap h = this.h;
        final LinkedHashMap i = this.i;
        final ReentrantLock g = this.g;
        g.lock();
        Label_0143: {
            Context context;
            jkf jkf;
            ReentrantLock b;
            try {
                context = (Context)i.get((Object)ira);
                if (context == null) {
                    g.unlock();
                    return;
                }
                jkf = (jkf)h.get((Object)context);
                if (jkf == null) {
                    g.unlock();
                    return;
                }
                b = jkf.b;
                b.lock();
                final jkf jkf2 = jkf;
                final LinkedHashSet set = jkf2.d;
                final ira ira2 = ira;
                ((Set)set).remove((Object)ira2);
                final ReentrantLock reentrantLock = b;
                reentrantLock.unlock();
                final Object o = i;
                final ira ira3 = ira;
                ((Map)o).remove((Object)ira3);
                final jkf jkf3 = jkf;
                final LinkedHashSet set2 = jkf3.d;
                final boolean b2 = ((Set)set2).isEmpty();
                if (b2) {
                    final Object o2 = h;
                    final Context context2 = context;
                    ((Map)o2).remove((Object)context2);
                    final q2a q2a = this;
                    final WindowLayoutComponent windowLayoutComponent = q2a.a;
                    final Consumer consumer = (Consumer)jkf;
                    final Consumer consumer2 = consumer;
                    windowLayoutComponent.removeWindowLayoutInfoListener(consumer2);
                    break Label_0143;
                }
                break Label_0143;
            }
            finally {
                break Label_0143;
            }
            try {
                final jkf jkf2 = jkf;
                final LinkedHashSet set = jkf2.d;
                final ira ira2 = ira;
                ((Set)set).remove((Object)ira2);
                final ReentrantLock reentrantLock = b;
                reentrantLock.unlock();
                final Object o = i;
                final ira ira3 = ira;
                ((Map)o).remove((Object)ira3);
                final jkf jkf3 = jkf;
                final LinkedHashSet set2 = jkf3.d;
                final boolean b2 = ((Set)set2).isEmpty();
                if (b2) {
                    final Object o2 = h;
                    final Context context2 = context;
                    ((Map)o2).remove((Object)context2);
                    final q2a q2a = this;
                    final WindowLayoutComponent windowLayoutComponent = q2a.a;
                    final Consumer consumer = (Consumer)jkf;
                    final Consumer consumer2 = consumer;
                    windowLayoutComponent.removeWindowLayoutInfoListener(consumer2);
                }
                g.unlock();
                return;
            }
            finally {
                b.unlock();
            }
        }
        g.unlock();
    }
    
    @Override
    public final void b(final Context context, ou0 g, final ira ira) {
        final LinkedHashMap h = this.h;
        g = (ou0)this.g;
        ((ReentrantLock)g).lock();
        Label_0118: {
            Label_0113: {
                LinkedHashMap i;
                try {
                    final jkf jkf = (jkf)h.get((Object)context);
                    i = this.i;
                    if (jkf != null) {
                        jkf.a(ira);
                        ((Map)i).put((Object)ira, (Object)context);
                        break Label_0113;
                    }
                }
                finally {
                    break Label_0118;
                }
                final Context context2;
                final jkf jkf2 = new jkf(context2);
                ((Map)h).put((Object)context2, (Object)jkf2);
                ((Map)i).put((Object)ira, (Object)context2);
                jkf2.a(ira);
                super.a.addWindowLayoutInfoListener(context2, (Consumer)jkf2);
            }
            ((ReentrantLock)g).unlock();
            return;
        }
        ((ReentrantLock)g).unlock();
    }
}
