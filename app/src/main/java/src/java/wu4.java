import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import com.anthropic.claude.types.strings.ProjectId;

public final class wu4 implements lta
{
    public final frg v;
    public final st4 w;
    public final oc7 x;
    public final nx8 y;
    
    public wu4(final st4 w, final oc7 x, final nx8 y, final frg v) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
    }
    
    public final Object b(final Object o) {
        final String a = ((ProjectId)o).a;
        zu4.b(this.w, this.x, this.y, DrawerEvents$DrawerItem.A);
        final ClaudeAppDestination.List.ProjectDetails projectDetails = new ClaudeAppDestination.List.ProjectDetails(new ProjectDetailsScreenParams(a, 0));
        final fo3 z = fo3.z;
        final frg v = this.v;
        v.b((lta)new tu4(projectDetails, v, (byte)1), (zta)z);
        if (((rp4)v.w.getValue()).d == zp4.v) {
            r6k.k((brg)v);
        }
        return lqo.a;
    }
}
