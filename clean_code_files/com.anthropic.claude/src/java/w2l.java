import android.content.Context;

public final class w2l extends h07
{
    public Object v;
    public final p3 w;
    public int x;
    
    public w2l(final p3 w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(Object q) {
        this.v = q;
        this.x |= Integer.MIN_VALUE;
        q = this.w.q((ux4)null, (Context)null, (ep0)null, (h07)this);
        if (q == pc7.v) {
            return q;
        }
        final odk odk = (odk)q;
        if (odk != null) {
            return new ndk(odk);
        }
        return null;
    }
}
