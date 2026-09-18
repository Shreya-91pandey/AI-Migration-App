import java.util.List;
import java.util.Collection;

public final class szl extends r1
{
    public umf A;
    public stk B;
    public final e0j C;
    public final re D;
    public Object x;
    public Object y;
    public umf z;
    
    public szl() {
        super((byte)4);
        this.C = new e0j((Object)this, (byte)11);
        final f0l f0l = new f0l((Object)this, (byte)1);
        g8m.b((lta)g8m.a);
        final Object c = g8m.c;
        synchronized (c) {
            g8m.h = (List)c86.a1((Collection)g8m.h, (Object)f0l);
            monitorexit(c);
            this.D = new re(f0l, (byte)13);
        }
    }
    
    public final void d(final stk stk) {
        this.y = null;
        this.A = null;
    }
    
    public final void e() {
        final Object w;
        monitorenter(w = super.w);
        Label_0082: {
            Label_0078: {
                try {
                    this.x = this.y;
                    if (this.A == null) {
                        this.z = null;
                        break Label_0078;
                    }
                }
                finally {
                    break Label_0082;
                }
                umf z;
                if ((z = this.z) == null) {
                    final umf a = kak.a;
                    z = new umf();
                    this.z = z;
                }
                this.z = this.A;
                this.A = z;
            }
            monitorexit(w);
            return;
        }
        monitorexit(w);
    }
    
    public final void g() {
        this.D.i();
        this.y = null;
        this.A = null;
        final Object w = super.w;
        synchronized (w) {
            this.B = null;
            this.x = null;
            this.z = null;
        }
    }
    
    public final lta m(final stk stk) {
        final stk b = this.B;
        if (b != null) {
            if (!b.equals(stk)) {
                pih.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
            }
        }
        this.B = stk;
        return (lta)this.C;
    }
    
    public final void n(final xd3 xd3) {
        this.B = null;
        this.y = null;
        this.A = null;
        this.e();
    }
}
