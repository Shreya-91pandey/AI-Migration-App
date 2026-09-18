import java.util.Set;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import java.util.Map$Entry;
import androidx.compose.ui.node.LayoutNode;
import java.io.File;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.project.Project;
import java.util.Comparator;

public final class w8g implements Comparator
{
    public static final w8g w;
    public final byte v;
    
    static {
        w = new w8g((byte)0);
    }
    
    public final int compare(final Object o, final Object o2) {
        final byte v = this.v;
        final int n = 1;
        switch (v) {
            default: {
                final cwp cwp = (cwp)o;
                final awp x = cwp.x;
                x.getClass();
                final Set y = cwp.y;
                final boolean contains = y.contains((Object)cwp);
                final cwp cwp2 = (cwp)o2;
                x.getClass();
                return ((Comparable)Boolean.valueOf(contains)).compareTo((Object)y.contains((Object)cwp2));
            }
            case 13: {
                return Integer.valueOf(((Enum)((azc)o).getId()).ordinal()).compareTo((Object)((Enum)((azc)o2).getId()).ordinal());
            }
            case 12: {
                return ach.y((Comparable)((Project)o2).n(), (Comparable)((Project)o).n());
            }
            case 11: {
                final Boolean e = ((McpServer)o).e;
                final Boolean true = Boolean.TRUE;
                return ((Comparable)Boolean.valueOf(mlc.q((Object)e, (Object)true) ^ true)).compareTo((Object)(mlc.q((Object)((McpServer)o2).e, (Object)true) ^ true));
            }
            case 10: {
                return ((Comparable)o).compareTo((Object)o2);
            }
            case 9: {
                return Integer.valueOf(((vwc)o).b.schemaIndex()).compareTo((Object)((vwc)o2).b.schemaIndex());
            }
            case 8: {
                return ach.y((Comparable)((File)o2).getName(), (Comparable)((File)o).getName());
            }
            case 7: {
                return ((Comparable)Long.valueOf(((File)o).lastModified())).compareTo((Object)((File)o2).lastModified());
            }
            case 6: {
                return ((Comparable)Integer.valueOf(((ci8)o).a.c)).compareTo((Object)((ci8)o2).a.c);
            }
            case 5: {
                final LayoutNode layoutNode = (LayoutNode)o;
                final LayoutNode layoutNode2 = (LayoutNode)o2;
                int n2 = mlc.u(layoutNode.L, layoutNode2.L);
                if (n2 == 0) {
                    n2 = mlc.u(layoutNode.hashCode(), layoutNode2.hashCode());
                }
                return n2;
            }
            case 4: {
                return ((Comparable)Long.valueOf(((pn1)((Map$Entry)o).getValue()).c())).compareTo((Object)((pn1)((Map$Entry)o2).getValue()).c());
            }
            case 3: {
                return ach.y((Comparable)((ChatConversationWithProjectReference)o2).c, (Comparable)((ChatConversationWithProjectReference)o).c);
            }
            case 2: {
                final x7l x7l = (x7l)o2;
                hfc hfc = x7l.f();
                if (hfc == null) {
                    hfc = x7l.e();
                    if (hfc == null) {
                        final hfc x2 = hfc.x;
                        hfc = o55.w(-3217862419201L, 999999999L);
                    }
                }
                final x7l x7l2 = (x7l)o;
                hfc hfc2 = x7l2.f();
                if (hfc2 == null) {
                    hfc2 = x7l2.e();
                    if (hfc2 == null) {
                        final hfc x3 = hfc.x;
                        hfc2 = o55.w(-3217862419201L, 999999999L);
                    }
                }
                return ach.y((Comparable)hfc, (Comparable)hfc2);
            }
            case 1: {
                final String s = (String)o;
                final String s2 = (String)o2;
                int n3;
                while (true) {
                    for (int min = Math.min(s.length(), s2.length()), i = 4; i < min; ++i) {
                        final char char1 = s.charAt(i);
                        final char char2 = s2.charAt(i);
                        if (char1 != char2) {
                            n3 = n;
                            if (mlc.u((int)char1, (int)char2) < 0) {
                                n3 = -1;
                            }
                            return n3;
                        }
                    }
                    final int length = s.length();
                    final int length2 = s2.length();
                    if (length == length2) {
                        n3 = 0;
                        return n3;
                    }
                    n3 = n;
                    if (length < length2) {
                        continue;
                    }
                    break;
                }
                return n3;
            }
            case 0: {
                final LayoutNode layoutNode3 = (LayoutNode)o;
                final LayoutNode layoutNode4 = (LayoutNode)o2;
                int n4 = mlc.u(layoutNode4.L, layoutNode3.L);
                if (n4 == 0) {
                    n4 = mlc.u(layoutNode3.hashCode(), layoutNode4.hashCode());
                }
                return n4;
            }
        }
    }
}
