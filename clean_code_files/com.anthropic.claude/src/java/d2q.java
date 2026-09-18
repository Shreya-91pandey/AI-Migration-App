import android.graphics.Rect;
import java.util.List;
import android.view.WindowInsets;

public final class d2q extends c2q
{
    public d2q(final h2q h2q, final WindowInsets windowInsets) {
        super(h2q, windowInsets);
    }
    
    public d2q(final h2q h2q, final d2q d2q) {
        super(h2q, d2q);
    }
    
    @Override
    public List<Rect> f(final int n) {
        return (List<Rect>)d1j.d(super.c, g2q.a(n));
    }
    
    @Override
    public List<Rect> g(final int n) {
        return (List<Rect>)d1j.k(super.c, g2q.a(n));
    }
    
    @Override
    public void q() {
    }
}
