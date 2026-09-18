import android.net.Network;
import java.util.Iterator;
import android.net.NetworkRequest;
import java.util.Map$Entry;
import java.util.ArrayList;
import android.net.NetworkCapabilities;
import java.util.LinkedHashMap;
import android.net.ConnectivityManager$NetworkCallback;

public final class isl extends ConnectivityManager$NetworkCallback
{
    public static final isl a;
    public static final Object b;
    public static final LinkedHashMap c;
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;
    
    static {
        a = (isl)new ConnectivityManager$NetworkCallback();
        b = new Object();
        c = new LinkedHashMap();
    }
    
    public static void a() {
        while (true) {
            final ArrayList list = new ArrayList();
            final Object b;
            monitorenter(b = isl.b);
            Label_0257: {
                Label_0240: {
                Label_0188:
                    while (true) {
                        lta lta = null;
                        final lv6 lv6;
                        Label_0164: {
                            try {
                                if (!isl.e || isl.f == null) {
                                    break Label_0240;
                                }
                                final Iterator iterator = ((Iterable)isl.c.entrySet()).iterator();
                                if (!iterator.hasNext()) {
                                    break Label_0188;
                                }
                                final Map$Entry map$Entry = (Map$Entry)iterator.next();
                                lta = (lta)map$Entry.getKey();
                                final NetworkRequest networkRequest = (NetworkRequest)map$Entry.getValue();
                                final isl a = isl.a;
                                final NetworkCapabilities d = isl.d;
                                a.getClass();
                                final Boolean f = isl.f;
                                f.getClass();
                                if (!f && p4.x(networkRequest, d)) {
                                    final kv6 a2 = kv6.a;
                                    break Label_0164;
                                }
                            }
                            finally {
                                break Label_0257;
                            }
                            lv6 = new lv6(7);
                        }
                        list.add((Object)new yog((Object)lta, (Object)lv6));
                        continue;
                    }
                    monitorexit(b);
                    for (final yog yog : list) {
                        ((lta)yog.v).b((Object)yog.w);
                    }
                    return;
                }
                final krd c = krd.c();
                final int a3 = n4q.a;
                c.getClass();
                monitorexit(b);
                return;
            }
            monitorexit(b);
        }
    }
    
    public final void onBlockedStatusChanged(final Network network, final boolean b) {
        final krd c = krd.c();
        final int a = n4q.a;
        c.getClass();
        final Object b2 = isl.b;
        synchronized (b2) {
            if (mlc.q((Object)isl.f, (Object)b)) {
                return;
            }
            isl.f = b;
            a();
        }
    }
    
    public final void onCapabilitiesChanged(final Network network, final NetworkCapabilities d) {
        final krd c = krd.c();
        final int a = n4q.a;
        c.getClass();
        final Object b = isl.b;
        synchronized (b) {
            isl.d = d;
            isl.e = true;
            a();
        }
    }
    
    public final void onLost(final Network network) {
        final krd c = krd.c();
        final int a = n4q.a;
        c.getClass();
        final Object b;
        monitorenter(b = isl.b);
        Label_0094: {
            try {
                isl.d = null;
                final Iterator iterator = ((Iterable)isl.c.keySet()).iterator();
                while (iterator.hasNext()) {
                    ((lta)iterator.next()).b((Object)new lv6(7));
                }
            }
            finally {
                break Label_0094;
            }
            monitorexit(b);
            return;
        }
        monitorexit(b);
    }
}
