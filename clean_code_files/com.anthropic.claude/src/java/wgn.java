import java.util.List;
import java.util.ArrayList;

public final class wgn
{
    public static final wgn b;
    public static final wgn c;
    public static final wgn d;
    public final int a;
    
    static {
        b = new wgn(0);
        c = new wgn(1);
        d = new wgn(2);
    }
    
    public wgn(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wgn && this.a == ((wgn)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        if (a == 0) {
            return "TextDecoration.None";
        }
        final ArrayList list = new ArrayList();
        if ((a & 0x1) != 0x0) {
            list.add((Object)"Underline");
        }
        if ((a & 0x2) != 0x0) {
            list.add((Object)"LineThrough");
        }
        if (list.size() == 1) {
            return smk.r(list.get(0), "TextDecoration.");
        }
        return hia.k("TextDecoration[", ald.a((List)list, ", ", null, 62), "]");
    }
}
