import java.lang.ref.Reference;
import android.view.InputEvent;
import java.util.concurrent.Future;
import android.view.inputmethod.InputConnection;
import com.anthropic.claude.api.chat.ChatConversation;
import android.view.InputDevice;
import android.view.KeyEvent;
import java.util.function.Function;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.VoiceEvents$BadTranscriptionReported;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.List;
import androidx.work.impl.WorkerStoppedException;

public final class n90 implements lta
{
    public final byte v;
    public final Object w;
    public final Object x;
    
    public final Object b(Object o) {
        final byte v = this.v;
        boolean b = true;
        final boolean b2 = true;
        int i = 0;
        switch (v) {
            default: {
                final Throwable t = (Throwable)o;
                if (t instanceof WorkerStoppedException) {
                    ((nld)this.w).c.compareAndSet(-256, ((WorkerStoppedException)t).v);
                }
                ((Future)this.x).cancel(false);
                return lqo.a;
            }
            case 10: {
                final Throwable t2 = (Throwable)o;
                ((peo)this.w).a.h.k((Object)this.x);
                return lqo.a;
            }
            case 9: {
                final KeyEvent b3 = ((nuc)o).b();
                final mma mma = (mma)this.w;
                final InputDevice device = ((InputEvent)b3).getDevice();
                if (device != null) {
                    if (device.supportsSource(513)) {
                        if (!device.isVirtual() || b3.getSource() == 33554433) {
                            if (hbr.c(ibr.j(b3), 2)) {
                                if (b3.getSource() != 257) {
                                    if (liq.o(19, b3)) {
                                        return mma.a(5);
                                    }
                                    if (liq.o(20, b3)) {
                                        return mma.a(6);
                                    }
                                    if (liq.o(21, b3)) {
                                        return mma.a(3);
                                    }
                                    if (liq.o(22, b3)) {
                                        return mma.a(4);
                                    }
                                    if (liq.o(23, b3)) {
                                        final z9m c = ((j7d)this.x).c;
                                        boolean b4 = b2;
                                        if (c != null) {
                                            ((ga8)c).b();
                                            b4 = b2;
                                            return b4;
                                        }
                                        return b4;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            case 8: {
                final int intValue = ((Number)o).intValue();
                return ((f0l)this.w).d((Object)intValue, ((List)this.x).get(intValue));
            }
            case 7: {
                final KeyEvent b5 = ((nuc)o).b();
                final nx8 nx8 = (nx8)this.w;
                if (nx8.c() && hbr.c(ibr.j(b5), 1)) {
                    final long j = ibr.i(b5);
                    final int o2 = huc.O;
                    if (huc.a(j, cbr.o())) {
                        rhc.G((oc7)this.x, (hc7)null, 0, (zta)new vu4(nx8, (f07)null, (byte)6), 3);
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }
            case 6: {
                final e8m e8m = (e8m)o;
                o = g8m.c;
                synchronized (o) {
                    final long e = g8m.e;
                    g8m.e = 1L + e;
                    monitorexit(o);
                    return new zmf(e, e8m, (lta)this.w, (lta)this.x);
                }
            }
            case 5: {
                final String a = ((OrganizationId)o).a;
                return new d9b((jqc)this.w, (z9b)this.x);
            }
            case 4: {
                final KeyEvent b7 = ((nuc)o).b();
                if (((j7d)this.w).a() == tbb.w && gbr.c(b7)) {
                    ((dkn)this.x).i(null);
                }
                else {
                    b = false;
                }
                return b;
            }
            case 3: {
                final String a2 = ((MessageId)o).a;
                final String s = "";
                final st4 st4 = (st4)this.w;
                final oc4 oc4 = (oc4)this.x;
                final String d = oc4.y.d;
                final ChatConversation p = oc4.p0();
                String a3 = s;
                if (p != null) {
                    a3 = p.a;
                    if (a3 == null) {
                        a3 = s;
                    }
                }
                o = new VoiceEvents$BadTranscriptionReported(d, a3, a2);
                final KSerializer serializer = VoiceEvents$BadTranscriptionReported.Companion.serializer();
                vt4.b0(serializer);
                st4.b((v10)o, (KSerializer)serializer);
                return lqo.a;
            }
            case 2: {
                final OrganizationId organizationId = (OrganizationId)o;
                final String a4 = organizationId.a;
                o = ((ConcurrentHashMap)this.w).computeIfAbsent((Object)organizationId, (Function)new zg0((lta)new gx2((lta)this.x, (byte)0), (byte)2));
                o.getClass();
                return o;
            }
            case 1: {
                final Throwable t3 = (Throwable)o;
                final gc0 gc0 = (gc0)this.w;
                final hc0 hc0 = (hc0)this.x;
                o = gc0.y;
                synchronized (o) {
                    gc0.A.remove((Object)hc0);
                    return lqo.a;
                }
            }
            case 0: {
                final Throwable t4 = (Throwable)o;
                final wcc wcc = (wcc)this.w;
                o = wcc.c;
                final Object o3;
                monitorenter(o3 = o);
                Label_1061: {
                    try {
                        wcc.e = true;
                        final inf d2 = wcc.d;
                        final Object[] v2 = d2.v;
                        while (i < d2.x) {
                            final k3g k3g = (k3g)((Reference)v2[i]).get();
                            if (k3g != null) {
                                final InputConnection b8 = k3g.b;
                                if (b8 != null) {
                                    b8.closeConnection();
                                    k3g.b = null;
                                }
                            }
                            ++i;
                        }
                    }
                    finally {
                        break Label_1061;
                    }
                    final wcc wcc2;
                    wcc2.d.h();
                    monitorexit(o3);
                    final amn w = ((o90)this.x).w;
                    w.b.set((Object)null);
                    w.a.c();
                    return lqo.a;
                }
                monitorexit(o3);
                break;
            }
        }
    }
}
