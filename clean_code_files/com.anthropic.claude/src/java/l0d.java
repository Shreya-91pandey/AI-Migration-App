import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.LayoutNode;

public abstract class l0d
{
    public static final ad8 a;
    
    static {
        a = r6k.a();
    }
    
    public static final Owner a(final LayoutNode layoutNode) {
        final Owner j = layoutNode.J;
        if (j != null) {
            return j;
        }
        throw ge9.x("LayoutNode should be attached to an owner");
    }
}
