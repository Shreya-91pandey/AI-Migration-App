import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.node.LayoutNode;

public final class roo extends v
{
    public final void a(final int n, final Object o) {
        ((LayoutNode)super.b).O(n, (LayoutNode)o);
    }
    
    public final void c() {
        ((LayoutNode)super.b).i();
    }
    
    public final void d(final int n, final int n2, final int n3) {
        ((LayoutNode)super.b).g0(n, n2, n3);
    }
    
    public final void e(final int n, final int n2) {
        ((LayoutNode)super.b).o0(n, n2);
    }
    
    public final void h(final int n, final Object o) {
        final LayoutNode layoutNode = (LayoutNode)o;
    }
    
    public final void i() {
        final Owner j = ((LayoutNode)super.a).J;
        if (j != null) {
            ((AndroidComposeView)j).v();
        }
    }
    
    public final void m() {
        ((LayoutNode)super.a).n0();
    }
}
