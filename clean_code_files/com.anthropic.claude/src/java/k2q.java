import android.view.WindowInsetsController;

public final class k2q extends j2q
{
    @Override
    public final boolean L() {
        return (gsp.b(super.d) & 0x8) != 0x0;
    }
    
    @Override
    public final void X(final boolean b) {
        final WindowInsetsController d = super.d;
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        z1q.e(d, n);
    }
    
    @Override
    public final void Y(final boolean b) {
        final WindowInsetsController d = super.d;
        int n;
        if (b) {
            n = 8;
        }
        else {
            n = 0;
        }
        z1q.i(d, n);
    }
}
