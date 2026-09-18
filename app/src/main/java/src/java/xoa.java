import java.util.ArrayList;
import java.util.List;

public final class xoa
{
    public final List a;
    
    public xoa(final uoa... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            final String b = array[i].b();
            final int length2 = array.length;
            int j = 0;
            int n = 0;
            while (j < length2) {
                int n2 = n;
                if (mlc.q((Object)array[j].b(), (Object)b)) {
                    n2 = n + 1;
                }
                ++j;
                n = n2;
            }
            if (n != 1) {
                final ArrayList list = new ArrayList();
                for (final uoa uoa : array) {
                    if (mlc.q((Object)uoa.b(), (Object)b)) {
                        list.add((Object)uoa);
                    }
                }
                final StringBuilder sb = new StringBuilder("'");
                sb.append(b);
                sb.append("' must be unique. Actual [");
                sb.append((Object)list);
                sb.append("]");
                hac.a(sb.toString());
            }
        }
        this.a = iw0.m1((Object[])array);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof xoa) {
                if (this.a.equals(((xoa)o).a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return hia.l("Settings(settings=", ")", this.a);
    }
}
