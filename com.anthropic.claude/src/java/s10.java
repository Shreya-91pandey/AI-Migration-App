import com.segment.analytics.kotlin.core.TrackEvent;
import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.ScreenEvent;
import java.util.UUID;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;

public abstract class s10 implements s1n
{
    public static lrd B;
    public static final j10 Companion;
    public boolean A;
    public final vn6 v;
    public final tze w;
    public final l7n x;
    public final l7n y;
    public k2p z;
    
    static {
        Companion = (j10)new Object();
        s10.B = (lrd)new vzq((byte)13);
    }
    
    public s10(final vn6 v, final tze w) {
        this.v = v;
        this.w = w;
        final ink ink = (ink)this;
        this.x = new l7n((jta)new r10(ink, (byte)1));
        this.y = new l7n((jta)new r10(ink, (byte)0));
        final h2p companion = k2p.Companion;
        final atm c = this.c();
        companion.getClass();
        final String a = c.a(1);
        final iqc d = jqc.d;
        String a2;
        if ((a2 = c.a(2)) == null) {
            a2 = "{}";
        }
        d.getClass();
        final JsonObject jsonObject = (JsonObject)((jqc)d).b(a2, (KSerializer)k8e.v(JsonObject.Companion.serializer()));
        String s;
        if ((s = c.a(3)) == null) {
            s = UUID.randomUUID().toString();
            s.getClass();
        }
        this.z = new k2p(s, a, jsonObject);
        this.A = true;
        if (!kym.Y0((CharSequence)v.a)) {
            this.a((deh)new uom());
            this.a((deh)new az6());
            this.a(new w7h((byte)1));
            zcn.v.c((lta)new k10((Object)ink, (byte)0), "analytics_mobile.invoke");
            rhc.G((oc7)w.y, (hc7)w.x, 0, (zta)new l10((byte)0, (f07)null, (Object)ink), 2);
            return;
        }
        en9.s("invalid configuration");
        throw null;
    }
    
    public static void f(final s10 s10, final String s11, JsonObject a, final int n) {
        if ((n & 0x2) != 0x0) {
            a = ts9.a;
        }
        s10.e((BaseEvent)new ScreenEvent(s11, "", a));
    }
    
    public static void g(final s10 s10, final String s11, JsonObject a, final int n) {
        if ((n & 0x2) != 0x0) {
            a = ts9.a;
        }
        s10.e((BaseEvent)new TrackEvent(s11, a));
    }
    
    public final void a(final deh deh) {
        this.d().a(deh);
    }
    
    public final void b(final lta lta) {
        this.d().b(lta);
    }
    
    public final atm c() {
        return (atm)this.y.getValue();
    }
    
    public final rwn d() {
        return (rwn)this.x.getValue();
    }
    
    public final void e(final BaseEvent baseEvent) {
        if (!this.A) {
            return;
        }
        onk.Companion.getClass();
        baseEvent.o(nnk.a());
        baseEvent.l(ts9.a);
        final String string = UUID.randomUUID().toString();
        string.getClass();
        baseEvent.n(string);
        final StringBuilder sb = new StringBuilder("applying base attributes on ");
        sb.append(Thread.currentThread().getName());
        uuj.z0(3, sb.toString());
        final tze w = this.w;
        rhc.G((oc7)w.y, (hc7)w.x, 0, (zta)new p10(baseEvent, this, (f07)null), 2);
    }
}
