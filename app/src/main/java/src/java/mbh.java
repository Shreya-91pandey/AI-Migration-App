import java.util.Collection;
import java.util.List;
import android.view.textclassifier.TextClassification;
import android.app.RemoteAction;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.content.Context;

public abstract class mbh
{
    public static final b09 a;
    public static final hu4 b;
    
    static {
        a = new b09((jta)new mff((byte)28), (byte)1);
        b = new hu4((byte)3);
    }
    
    public static final void a(final egn egn, final Context context, final boolean b, final CharSequence charSequence, final dnn dnn, final lbh lbh, final lta lta) {
        if (Build$VERSION.SDK_INT >= 28 && charSequence != null && dnn != null && lbh != null && lbh instanceof lbh) {
            final long a = dnn.a;
            final Object h = lbh.h;
            final cof e = lbh.e;
            final boolean f = e.f();
            final agn agn = null;
            agn agn2;
            if (!f) {
                agn2 = agn;
            }
            else {
                agn2 = (agn)lbh.g.getValue();
                if (agn2 == null || !dnn.c(a, agn2.b()) || !mlc.q((Object)charSequence, (Object)agn2.c())) {
                    agn2 = null;
                }
                e.g((Object)null);
            }
            if (agn2 == null) {
                lta.b((Object)egn);
            }
            else {
                final TextClassification d = agn2.d();
                final boolean empty = ((Collection)roe.o(d)).isEmpty();
                int i = 0;
                if (!empty) {
                    unh.j(egn, h, d, 0, (Drawable)((ArrayList)agn2.a()).get(0));
                }
                else if (ai0.r(d)) {
                    unh.j(egn, h, d, -1, d.getIcon());
                }
                lta.b((Object)egn);
                for (List f2 = ypm.f(d); i < ((Collection)f2).size(); ++i) {
                    final RemoteAction remoteAction = (RemoteAction)f2.get(i);
                    if (i > 0) {
                        unh.j(egn, h, d, i, (Drawable)((ArrayList)agn2.a()).get(i));
                    }
                }
            }
            e3r.i(egn, context, b, charSequence, dnn.a);
            return;
        }
        lta.b((Object)egn);
        if (charSequence != null && dnn != null) {
            e3r.i(egn, context, b, charSequence, dnn.a);
        }
    }
    
    public static final lbh b(final upk upk, final jpd jpd, final gva gva, int n) {
        gva.g0(430530635);
        if (Build$VERSION.SDK_INT < 28) {
            gva.q(false);
            return null;
        }
        final Context context = (Context)gva.j((sei)q50.b);
        final hc7 hc7 = (hc7)gva.j((sei)mbh.a);
        final boolean f = gva.f((Object)hc7);
        final boolean f2 = gva.f((Object)context);
        if ((((n & 0x70) ^ 0x30) > 32 && gva.f((Object)jpd)) || (n & 0x30) == 0x20) {
            n = 1;
        }
        else {
            n = 0;
        }
        final Object r = gva.R();
        lbh lbh;
        if ((n | ((f | f2) ? 1 : 0)) != 0x0 || (lbh = (lbh)r) == bi6.a) {
            mbh.b.getClass();
            lbh = new lbh(hc7, context, upk, jpd);
            gva.q0((Object)lbh);
        }
        final lbh lbh2 = lbh;
        gva.q(false);
        return lbh2;
    }
}
