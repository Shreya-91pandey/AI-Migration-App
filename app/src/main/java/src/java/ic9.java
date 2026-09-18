import com.segment.analytics.kotlin.core.BaseEvent;
import java.util.Map;
import java.util.UUID;
import io.sentry.okhttp.b;
import java.util.ArrayList;
import io.sentry.q1;

public final class ic9 extends qxc implements lta
{
    public final byte w;
    public final Object x;
    public final Object y;
    
    public ic9(final p3 p3, final ru7 x, final tjc y) {
        this.w = 2;
        this.x = x;
        this.y = y;
        super(1);
    }
    
    @Override
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final Object y = this.y;
        final Object x = this.x;
        switch (w) {
            default: {
                final q1 q1 = (q1)o;
                q1.q((Object)x, "domain_name");
                final ArrayList list = (ArrayList)y;
                if (!list.isEmpty()) {
                    q1.q((Object)c86.N0((Iterable)list, (CharSequence)null, (String)null, (String)null, (lta)b.x, 31), "dns_addresses");
                }
                return a;
            }
            case 4: {
                ((n8h)o).f((o8h)x, 0, 0, ((bbq)y).J);
                return a;
            }
            case 3: {
                ((xv7)x).d((oi9)o, y, 3);
                return a;
            }
            case 2: {
                final UUID uuid = (UUID)o;
                final tjc tjc = (tjc)y;
                if (uuid == null) {
                    final ru7 ru7 = (ru7)x;
                    final UUID randomUUID = UUID.randomUUID();
                    randomUUID.getClass();
                    ru7.s(randomUUID, new ier((byte)23));
                    tjc.p(randomUUID);
                }
                else {
                    tjc.p(uuid);
                }
                return a;
            }
            case 1: {
                final Map map = (Map)o;
                final StringBuilder sb = new StringBuilder("event-");
                sb.append((Object)((BaseEvent)x).h());
                map.put((Object)"message", (Object)sb.toString());
                final deh deh = (deh)y;
                if (deh instanceof lnk) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object)ceh.x);
                    sb2.append("-Segment.io");
                    map.put((Object)"plugin", (Object)sb2.toString());
                }
                else {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append((Object)deh.getType());
                    sb3.append('-');
                    sb3.append((Object)deh.getClass());
                    map.put((Object)"plugin", (Object)sb3.toString());
                }
                return a;
            }
            case 0: {
                final xeo xeo = (xeo)o;
                final ec9 v = ec9.v;
                final ec9 w2 = ec9.w;
                bfa bfa;
                if (xeo.e(v, w2)) {
                    final w3a a2 = ((id9)x).a.a;
                    if (a2 == null || (bfa = a2.b) == null) {
                        bfa = pc9.b;
                    }
                }
                else if (xeo.e(w2, ec9.x)) {
                    final w3a a3 = ((ev9)y).a.a;
                    if (a3 == null || (bfa = a3.b) == null) {
                        bfa = pc9.b;
                    }
                }
                else {
                    bfa = pc9.b;
                }
                return bfa;
            }
        }
    }
}
