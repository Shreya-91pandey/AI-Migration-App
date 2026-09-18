import java.util.Iterator;
import com.anthropic.claude.core.events.b;
import com.anthropic.claude.observability.EventFlushWorker;
import com.anthropic.claude.widget.WidgetChatListRefreshWorker;
import androidx.work.WorkerParameters;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

public final class um9 extends c6q
{
    public final byte a;
    public final Object b;
    
    public um9() {
        this.a = 2;
        this.b = new CopyOnWriteArrayList();
    }
    
    public final nld a(final Context context, String n, final WorkerParameters workerParameters) {
        final byte a = this.a;
        Object o = null;
        final nld nld = null;
        final c6q c6q = null;
        final Object b = this.b;
        switch (a) {
            default: {
                final Iterator iterator = ((CopyOnWriteArrayList)b).iterator();
                Object a2;
                while (true) {
                    a2 = c6q;
                    if (iterator.hasNext()) {
                        a2 = iterator.next();
                        try {
                            a2 = ((c6q)a2).a(context, n, workerParameters);
                            if (a2 == null) {
                                continue;
                            }
                        }
                        finally {
                            n = smk.n(')', "Unable to instantiate a ListenableWorker (", n);
                            krd.c().b(ia8.a(), n, (Throwable)context);
                        }
                        break;
                    }
                    break;
                }
                return (nld)a2;
            }
            case 1: {
                final di8 di8 = (di8)b;
                if (n.equals(WidgetChatListRefreshWorker.class.getName())) {
                    o = new WidgetChatListRefreshWorker(context, workerParameters, (pzp)di8.d().d((Class)pzp.class, (emi)null), (wo8)di8.d().d((Class)wo8.class, (emi)null), (d05)di8.d().d((Class)d05.class, (emi)null), (pwp)di8.d().d((Class)pwp.class, (emi)null));
                }
                return (nld)o;
            }
            case 0: {
                final di8 di9 = (di8)b;
                Object o2 = nld;
                if (n.equals(EventFlushWorker.class.getName())) {
                    o2 = new EventFlushWorker(context, workerParameters, (t2b)di9.d().d((Class)t2b.class, (emi)null), (n2b)di9.d().d((Class)n2b.class, (emi)null), (ux4)di9.d().d((Class)ux4.class, (emi)null), (ep0)di9.d().d((Class)ep0.class, (emi)null), (b)di9.d().d((Class)b.class, (emi)null), (rt7)di9.d().d((Class)rt7.class, (emi)null), (wo8)di9.d().d((Class)wo8.class, (emi)null));
                }
                return (nld)o2;
            }
        }
    }
    
    public void c(final c6q c6q) {
        ((CopyOnWriteArrayList)this.b).add((Object)c6q);
    }
}
