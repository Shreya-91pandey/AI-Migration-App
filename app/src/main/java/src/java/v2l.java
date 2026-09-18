import android.content.Context;

public final class v2l extends h07
{
    public Object v;
    public final p3 w;
    public int x;
    
    public v2l(final p3 w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(Object p) {
        this.v = p;
        this.x |= Integer.MIN_VALUE;
        p = this.w.p((ux4)null, (Context)null, (ep0)null, (h07)this);
        if (p == pc7.v) {
            return p;
        }
        final odk odk = (odk)p;
        if (odk != null) {
            return new ndk(odk);
        }
        return null;
    }
}
