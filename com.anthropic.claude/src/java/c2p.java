import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public final class c2p
{
    public final ArrayList a;
    
    public c2p() {
        this.a = new ArrayList();
    }
    
    public final Object a(final h07 h07) {
        b2p b2p2 = null;
        Label_0047: {
            if (h07 instanceof b2p) {
                final b2p b2p = (b2p)h07;
                final int y = b2p.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    b2p.y = y + Integer.MIN_VALUE;
                    b2p2 = b2p;
                    break Label_0047;
                }
            }
            b2p2 = new b2p(this, h07);
        }
        final Object w = b2p2.w;
        final int y2 = b2p2.y;
        Iterator v;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = b2p2.v;
            vt4.g0(w);
        }
        else {
            vt4.g0(w);
            final ArrayList a = this.a;
            final List s1 = c86.s1((Iterable)a);
            a.clear();
            v = ((Iterable)s1).iterator();
        }
        while (v.hasNext()) {
            final c2p c2p = (c2p)v.next();
            b2p2.v = v;
            b2p2.y = 1;
            final Object a2 = c2p.a(b2p2);
            final pc7 v2 = pc7.v;
            if (a2 == v2) {
                return v2;
            }
        }
        return lqo.a;
    }
}
