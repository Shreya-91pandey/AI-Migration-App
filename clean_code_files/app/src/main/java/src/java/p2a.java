import java.util.Map;
import java.util.List;
import androidx.window.extensions.layout.WindowLayoutInfo;
import android.app.Activity;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import androidx.window.extensions.layout.WindowLayoutComponent;

public class p2a extends n2a
{
    public final WindowLayoutComponent a;
    public final bw6 b;
    public final ReentrantLock c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    
    public p2a(final WindowLayoutComponent a, final bw6 b) {
        this.a = a;
        this.b = b;
        this.c = new ReentrantLock();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
    }
    
    @Override
    public void a(final ira ira) {
        final LinkedHashMap d = this.d;
        final LinkedHashMap e = this.e;
        final ReentrantLock c = this.c;
        c.lock();
        Label_0128: {
            try {
                final Context context = (Context)e.get((Object)ira);
                if (context == null) {
                    c.unlock();
                    return;
                }
                final MulticastConsumer multicastConsumer = (MulticastConsumer)d.get((Object)context);
                if (multicastConsumer == null) {
                    c.unlock();
                    return;
                }
                multicastConsumer.c((yv6)ira);
                ((Map)e).remove((Object)ira);
                if (multicastConsumer.b()) {
                    ((Map)d).remove((Object)context);
                    final aw6 aw6 = (aw6)((Map)this.f).remove((Object)multicastConsumer);
                    if (aw6 != null) {
                        aw6.a();
                    }
                }
            }
            finally {
                break Label_0128;
            }
            c.unlock();
            return;
        }
        c.unlock();
    }
    
    @Override
    public void b(final Context context, ou0 c, final ira ira) {
        final LinkedHashMap d = this.d;
        c = (ou0)this.c;
        ((ReentrantLock)c).lock();
        Label_0191: {
            Label_0164: {
                LinkedHashMap e;
                try {
                    final MulticastConsumer multicastConsumer = (MulticastConsumer)d.get((Object)context);
                    e = this.e;
                    if (multicastConsumer != null) {
                        multicastConsumer.a(ira);
                        ((Map)e).put((Object)ira, (Object)context);
                        break Label_0164;
                    }
                }
                finally {
                    break Label_0191;
                }
                final Activity activity;
                final MulticastConsumer multicastConsumer2 = new MulticastConsumer((Context)activity);
                ((Map)d).put((Object)activity, (Object)multicastConsumer2);
                ((Map)e).put((Object)ira, (Object)activity);
                multicastConsumer2.a(ira);
                if (!(activity instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo((List)r89.v));
                    ((ReentrantLock)c).unlock();
                    return;
                }
                ((Map)this.f).put((Object)multicastConsumer2, (Object)this.b.a(this.a, v4j.a((Class)WindowLayoutInfo.class), activity, new o2a(multicastConsumer2)));
            }
            ((ReentrantLock)c).unlock();
            return;
        }
        ((ReentrantLock)c).unlock();
    }
}
