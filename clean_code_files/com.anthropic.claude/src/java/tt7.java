import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class tt7 extends m6n implements zta
{
    public int A;
    public int B;
    public byte C;
    public Object D;
    public final List E;
    public final ArrayList F;
    public List w;
    public Iterator x;
    public msl y;
    public Object z;
    
    public tt7(final List e, final ArrayList f, final f07 f2) {
        this.E = e;
        this.F = f;
        super(2, f2);
    }
    
    public final f07 create(final Object d, final f07 f07) {
        final tt7 tt7 = new tt7(this.E, this.F, f07);
        tt7.D = d;
        return (f07)tt7;
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((tt7)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object h) {
        final Object d = this.D;
        final byte c = this.C;
        final pc7 v = pc7.v;
        while (true) {
            int b = 0;
            int n = 0;
            Object z = null;
            msl y = null;
            Iterator iterator = null;
            Object o = null;
            Object a = null;
            Label_0220: {
                if (c != 0) {
                    if (c == 1) {
                        b = this.B;
                        n = this.A;
                        z = this.z;
                        y = this.y;
                        iterator = this.x;
                        o = this.w;
                        vt4.g0(h);
                        a = h;
                        break Label_0220;
                    }
                    if (c != 2) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n = this.A;
                    iterator = this.x;
                    o = this.w;
                    vt4.g0(h);
                }
                else {
                    vt4.g0(h);
                    iterator = ((Iterable)this.E).iterator();
                    o = this.F;
                    n = 0;
                    h = d;
                }
                if (!iterator.hasNext()) {
                    return h;
                }
                y = (msl)iterator.next();
                this.D = null;
                this.w = (List)o;
                this.x = iterator;
                this.y = y;
                this.z = h;
                this.A = n;
                this.B = 0;
                this.C = 1;
                a = y.a(h, (h07)this);
                if (a == v) {
                    return v;
                }
                b = 0;
                z = h;
            }
            if (!(boolean)a) {
                h = z;
                continue;
            }
            ((List)o).add((Object)new un((byte)6, (f07)null, (Object)y));
            this.D = null;
            this.w = (List)o;
            this.x = iterator;
            this.y = null;
            this.z = null;
            this.A = n;
            this.B = b;
            this.C = 2;
            h = y.b.h(new rsl((SharedPreferences)y.e.getValue(), y.f), z, this);
            Label_0337: {
                if (h != v) {
                    break Label_0337;
                }
                return v;
            }
            continue;
        }
    }
}
