import android.content.Context;

public final class vsf implements l8a
{
    public final l7n a;
    public final l7n b;
    public final vhk c;
    public final l7n d;
    
    public vsf(final jta jta) {
        final mff mff = new mff((byte)4);
        final usf c = usf.C;
        final mff mff2 = new mff((byte)5);
        this.a = new l7n(jta);
        this.b = new l7n((jta)mff);
        final vhk c2 = new vhk((byte)7, false);
        c2.w = c;
        c2.x = p3.D;
        this.c = c2;
        this.d = new l7n((jta)mff2);
    }
    
    @Override
    public final m8a a(Object x, final pfg pfg, final oti oti) {
        final uyo uyo = (uyo)x;
        if (!mlc.q((Object)uyo.c, (Object)"http") && !mlc.q((Object)uyo.c, (Object)"https")) {
            return null;
        }
        final String a = uyo.a;
        final l7n a2 = this.a;
        final l7n l7n = new l7n((jta)new pyd((Object)oti, (byte)14));
        final l7n b = this.b;
        final vhk c = this.c;
        final Context b2 = pfg.b();
        x = c.x;
        final p3 d = p3.D;
        Label_0161: {
            if (x != d) {
                break Label_0161;
            }
            synchronized (c) {
                x = c.x;
                if (x == d) {
                    final lta lta = (lta)c.w;
                    lta.getClass();
                    x = lta.b((Object)b2);
                    c.x = x;
                    c.w = null;
                }
                monitorexit(c);
                return (m8a)new zsf(a, pfg, a2, l7n, b, new x9c(x), this.d);
            }
        }
    }
}
