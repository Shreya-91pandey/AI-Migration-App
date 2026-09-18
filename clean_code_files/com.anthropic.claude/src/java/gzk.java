import java.util.concurrent.ExecutorService;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class gzk implements Executor
{
    public final byte v;
    public final ArrayDeque w;
    public Runnable x;
    public final Object y;
    public final Executor z;
    
    public gzk(final Executor z) {
        this.v = 1;
        this.z = z;
        this.w = new ArrayDeque();
        this.y = new Object();
    }
    
    public gzk(final ExecutorService z) {
        this.v = 0;
        this.z = (Executor)z;
        this.w = new ArrayDeque();
        this.y = new Object();
    }
    
    public final void a() {
        switch (this.v) {
            default: {
                final Object y;
                monitorenter(y = this.y);
                Label_0077: {
                    try {
                        final Object poll = this.w.poll();
                        final Runnable x = (Runnable)poll;
                        this.x = x;
                        if (poll != null) {
                            this.z.execute(x);
                        }
                    }
                    finally {
                        break Label_0077;
                    }
                    monitorexit(y);
                    return;
                }
                monitorexit(y);
                break;
            }
            case 0: {
                final Runnable x2 = (Runnable)this.w.poll();
                this.x = x2;
                if (x2 != null) {
                    ((Executor)this.z).execute(x2);
                }
            }
        }
    }
    
    public final void execute(final Runnable runnable) {
        switch (this.v) {
            default: {
                final Object y;
                monitorenter(y = this.y);
                Label_0081: {
                    try {
                        this.w.offer((Object)new pfa((Object)runnable, (Object)this, (byte)27));
                        if (this.x == null) {
                            this.a();
                        }
                    }
                    finally {
                        break Label_0081;
                    }
                    monitorexit(y);
                    return;
                }
                monitorexit(y);
                break;
            }
            case 0: {
                final Object y2;
                monitorenter(y2 = this.y);
                Label_0139: {
                    try {
                        this.w.add((Object)new o98(this, runnable, false, (byte)3));
                        if (this.x == null) {
                            this.a();
                        }
                        break Label_0139;
                    }
                    finally {
                        monitorexit(y2);
                        monitorexit(y2);
                        return;
                    }
                }
                break;
            }
        }
    }
}
