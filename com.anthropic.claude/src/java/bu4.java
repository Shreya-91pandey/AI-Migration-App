import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public enum bu4
{
    A("already_verified"), 
    B("must_upgrade"), 
    C("prompt is too long"), 
    D("purchase_token_already_used"), 
    E(17, "EXCEEDED_MAX_IMAGE_LIMIT_PER_CHAT", "exceeded_max_image_limit_per_chat", lq6.X((Object)"Exceeded upload limit per chat")), 
    F("wiggle_container_in_use"), 
    G("recents_cursor_invalid"), 
    H("recents_section_unknown"), 
    I("conversation_ended_by_model"), 
    J("conversation_upgraded"), 
    K("project_upgraded"), 
    L("output_blocked_by_content_filter");
    
    public static final bu4[] M;
    public static final ier x;
    public static final Map y;
    
    z("default_unknown_error");
    
    public final String v;
    public final List w;
    
    static {
        x = new ier((byte)27);
        final ArrayList list = new ArrayList();
        final td9 td9;
        final k1 k1 = new k1((Object)td9, (byte)0);
        while (k1.hasNext()) {
            final bu4 bu4 = (bu4)k1.next();
            final ArrayList z2 = c86.Z0((Collection)lq6.X((Object)bu4.v), (Iterable)bu4.w);
            final ArrayList list2 = new ArrayList(d86.p0((Iterable)z2, 10));
            final Iterator iterator = z2.iterator();
            while (iterator.hasNext()) {
                list2.add((Object)new yog((Object)iterator.next(), (Object)bu4));
            }
            h86.t0((Collection)list, (Iterable)list2);
        }
        y = y5e.k0((List)list);
    }
    
    public bu4(final int n, final String s, final String v, final List w) {
        this.v = v;
        this.w = w;
    }
}
