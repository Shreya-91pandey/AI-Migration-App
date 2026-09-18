import java.util.ArrayList;
import java.util.List;
import android.graphics.RenderEffect;

public abstract class r1 implements hwn
{
    public final byte v;
    public Object w;
    
    public r1(final byte v) {
        switch (this.v = v) {
            default: {
                this.w = new l7n((jta)new p1((Object)this, (byte)0));
                return;
            }
            case 5: {
                this.w = o50.Q(Boolean.FALSE);
                return;
            }
            case 4: {
                this.w = new Object();
                return;
            }
            case 3: {
                return;
            }
            case 1: {
                final jlf a = tgc.a;
                this.w = new jlf();
            }
        }
    }
    
    public r1(final Boolean w) {
        this.v = 2;
        this.w = w;
    }
    
    @Override
    public fc6 H() {
        final long l = this.l();
        final long longValue = ((Number)((l7n)this.w).getValue()).longValue();
        final awp w = lz8.w;
        return (fc6)new q1(l - longValue, this);
    }
    
    public abstract void b(final Boolean p0, final Boolean p1);
    
    public RenderEffect c() {
        RenderEffect f;
        if ((f = (RenderEffect)this.w) == null) {
            f = this.f();
            this.w = f;
        }
        return f;
    }
    
    public abstract void d(final stk p0);
    
    public abstract void e();
    
    public abstract RenderEffect f();
    
    public abstract void g();
    
    public abstract g4d h(final int p0, final int p1, final int p2, final long p3);
    
    public abstract Object i();
    
    public List j(final f4d f4d, final int n, final long n2) {
        final jlf jlf = (jlf)this.w;
        final List list = (List)jlf.b(n);
        if (list != null) {
            return list;
        }
        final List a = f4d.a(n);
        final int size = a.size();
        final ArrayList list2 = new ArrayList(size);
        for (int i = 0; i < size; ++i) {
            list2.add((Object)((goe)a.get(i)).u(n2));
        }
        jlf.i(n, list2);
        return (List)list2;
    }
    
    public abstract Object k();
    
    public abstract long l();
    
    public abstract lta m(final stk p0);
    
    public abstract void n(final xd3 p0);
    
    public abstract void o(final Object p0);
    
    public void p(final efo efo) {
    }
    
    public void q() {
    }
    
    @Override
    public String toString() {
        switch (this.v) {
            default: {
                return super.toString();
            }
            case 2: {
                final StringBuilder sb = new StringBuilder("ObservableProperty(value=");
                sb.append((Object)this.w);
                sb.append(')');
                return sb.toString();
            }
        }
    }
}
