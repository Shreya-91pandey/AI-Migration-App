import java.lang.ref.Reference;
import java.util.LinkedHashMap;
import java.lang.ref.WeakReference;
import android.content.res.Configuration;
import android.content.ComponentCallbacks2;

public final class i70 implements ComponentCallbacks2
{
    public final byte v;
    public final Object w;
    
    private final void a(final Configuration configuration) {
    }
    
    private final void b(final Configuration configuration) {
    }
    
    private final void c() {
    }
    
    private final void d() {
    }
    
    private final void e(final int n) {
        if (n >= 40) {
            final Object o = this.w;
            final jmq e = ((k70)o).e;
            Label_0070: {
                if (e != null) {
                    final jmq jmq;
                    monitorenter(jmq = e);
                    Label_0065: {
                        try {
                            final tmf tmf = (tmf)e.w;
                            if (tmf != null) {
                                tmf.a();
                            }
                        }
                        finally {
                            break Label_0065;
                        }
                        e.x = null;
                        monitorexit(jmq);
                        break Label_0070;
                    }
                    monitorexit(jmq);
                }
            }
            ((k70)o).e = null;
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        switch (this.v) {
            default: {
                final gb0 gb0 = (gb0)this.w;
                synchronized (gb0) {
                    if (((Reference)gb0.w).get() == null) {
                        gb0.e();
                    }
                }
            }
            case 0:
            case 1: {}
        }
    }
    
    public final void onLowMemory() {
        switch (this.v) {
            default: {
                this.onTrimMemory(80);
            }
            case 0:
            case 1: {}
        }
    }
    
    public final void onTrimMemory(final int n) {
        switch (this.v) {
            default: {
                final gb0 gb0 = (gb0)this.w;
                final gb0 gb2;
                monitorenter(gb2 = gb0);
                Label_0301: {
                    Label_0297: {
                        Label_0292: {
                            Object o;
                            try {
                                final oti oti = (oti)((Reference)gb0.w).get();
                                if (oti == null) {
                                    break Label_0292;
                                }
                                o = oti.a;
                                if (n >= 40) {
                                    o = oti.c();
                                    if (o == null) {
                                        break Label_0297;
                                    }
                                    final Object c = ((sti)o).c;
                                    synchronized (c) {
                                        ((fui)((sti)o).a.c).d(-1L);
                                        final qd6 b = ((sti)o).b;
                                        b.w = 0;
                                        ((LinkedHashMap)b.x).clear();
                                    }
                                }
                            }
                            finally {
                                break Label_0301;
                            }
                            if (n >= 20) {
                                ((fb0)gb0.x).a(((lti)o).a);
                                break Label_0297;
                            }
                            if (n < 10) {
                                break Label_0297;
                            }
                            final oti oti2;
                            final sti c2 = oti2.c();
                            if (c2 == null) {
                                break Label_0297;
                            }
                            final Object c3 = c2.c;
                            synchronized (c3) {
                                final long b2 = ((fui)c2.a.c).b();
                                monitorexit(c3);
                                final long n2 = b2 / 2L;
                                synchronized (c2.c) {
                                    ((fui)c2.a.c).d(n2);
                                }
                            }
                        }
                        gb0.e();
                    }
                    monitorexit(gb2);
                    return;
                }
                monitorexit(gb2);
                break;
            }
            case 1: {
                if (n >= 40) {
                    ((h87)this.w).a();
                }
                return;
            }
            case 0: {
                this.e(n);
            }
        }
    }
}
