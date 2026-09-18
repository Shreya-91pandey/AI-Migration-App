import java.util.List;
import com.anthropic.claude.api.account.AccountSettings;

public final class yq0 extends m6n implements zta
{
    public final String A;
    public byte w;
    public final boolean x;
    public final er0 y;
    public final boolean z;
    
    public yq0(final boolean x, final er0 y, final boolean z, final String a, final f07 f07) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new yq0(this.x, this.y, this.z, this.A, f07);
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((yq0)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final er0 y = this.y;
        final rp0 a = y.a;
        final byte w = this.w;
        final lqo a2 = lqo.a;
        final String a3 = this.A;
        final pc7 v = pc7.v;
        if (w != 0) {
            if (w != 1) {
                if (w == 2) {
                    vt4.g0(o);
                    return a2;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                vt4.g0(o);
            }
        }
        else {
            vt4.g0(o);
            if (this.x) {
                final AccountSettings h = y.b.a().h;
                if (h != null) {
                    this.w = 1;
                    o = a.d(a3, (lta)new y((Object)a, (Object)h, (byte)11), (h07)this);
                    if (o != v) {
                        o = a2;
                    }
                    if (o == v) {
                        return v;
                    }
                }
            }
        }
        if (!this.z) {
            return a2;
        }
        final List a4 = y.c.a(a3);
        this.w = 2;
        o = a.d(a3, (lta)new lp0(a4, (byte)0), (h07)this);
        if (o != v) {
            o = a2;
        }
        if (o != v) {
            return a2;
        }
        return v;
    }
}
