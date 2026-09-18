import android.net.Uri;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public final class o33 extends m6n implements zta
{
    public final byte w;
    public boolean x;
    public Object y;
    public final r33 z;
    
    public final f07 create(final Object o, final f07 f07) {
        final byte w = this.w;
        final r33 z = this.z;
        switch (w) {
            default: {
                final o33 o2 = new o33(z, f07, (byte)1);
                o2.y = o;
                return (f07)o2;
            }
            case 0: {
                final o33 o3 = new o33(z, f07, (byte)0);
                o3.y = o;
                return (f07)o3;
            }
        }
    }
    
    public final Object d(final Object o, final Object o2) {
        final byte w = this.w;
        final lqo a = lqo.a;
        switch (w) {
            default: {
                return ((o33)this.create(o, (f07)o2)).invokeSuspend(a);
            }
            case 0: {
                return ((o33)this.create(o, (f07)o2)).invokeSuspend(a);
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final pc7 v = pc7.v;
        final r33 z = this.z;
        switch (w) {
            default: {
                final jja jja = (jja)this.y;
                final boolean x = this.x;
                lqo lqo;
                if (x) {
                    if (x) {
                        vt4.g0(o);
                        lqo = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        lqo = null;
                    }
                }
                else {
                    final b4j e = hia.e(o);
                    final Uri b = r33.b;
                    final ija p = ri2.p((ija)o50.r((zta)new o33(z, null, (byte)0)), -1);
                    final te0 te0 = new te0((Object)e, (Object)z, (Object)jja, (byte)1);
                    this.y = null;
                    this.x = true;
                    lqo = a;
                    if (p.a((jja)te0, (f07)this) == v) {
                        lqo = (lqo)v;
                    }
                }
                return lqo;
            }
            case 0: {
                final jrh jrh = (jrh)this.y;
                final boolean x2 = this.x;
                Object o2;
                if (x2) {
                    if (x2) {
                        vt4.g0(o);
                        o2 = a;
                    }
                    else {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        o2 = null;
                    }
                }
                else {
                    vt4.g0(o);
                    final dm2 dm2 = new dm2(jrh, (byte)1);
                    t08.c0(z.a, (BroadcastReceiver)dm2, new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED"), (String)null, 2);
                    jrh.e((Object)a);
                    final jd0 jd0 = new jd0((Object)z, (Object)dm2, (byte)13);
                    this.y = null;
                    this.x = true;
                    o2 = a;
                    if (uuj.U(jrh, (jta)jd0, (f07)this) == v) {
                        o2 = v;
                    }
                }
                return o2;
            }
        }
    }
}
