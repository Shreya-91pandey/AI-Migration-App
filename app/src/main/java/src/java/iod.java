import android.content.ContextWrapper;

public abstract class iod
{
    public static final b09 a;
    
    static {
        a = new b09((jta)new lrc((byte)4), (byte)0);
    }
    
    public static te a(final gva gva) {
        te te = (te)gva.j((sei)iod.a);
        Label_0067: {
            if (te == null) {
                gva.g0(1213380307);
                while (true) {
                    for (Object baseContext = gva.j((sei)q50.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper)baseContext).getBaseContext()) {
                        if (baseContext instanceof te) {
                            te = (te)baseContext;
                            break Label_0067;
                        }
                    }
                    Object baseContext = null;
                    continue;
                }
            }
            gva.g0(1213379439);
        }
        gva.q(false);
        return te;
    }
}
