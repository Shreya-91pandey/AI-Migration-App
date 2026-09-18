import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.a;

public final class cqi
{
    public final a a;
    public final String b;
    public final Object[] c;
    public final int d;
    
    public cqi(final f a, final String b, final Object[] c) {
        this.a = (a)a;
        this.b = b;
        this.c = c;
        final char char1 = b.charAt(0);
        if (char1 < '\ud800') {
            this.d = char1;
            return;
        }
        int n = char1 & '\u1fff';
        int n2 = 13;
        int n3 = 1;
        char char2;
        while (true) {
            char2 = b.charAt(n3);
            if (char2 < '\ud800') {
                break;
            }
            n |= (char2 & '\u1fff') << n2;
            n2 += 13;
            ++n3;
        }
        this.d = (n | char2 << n2);
    }
    
    public final int a() {
        final int d = this.d;
        if ((d & 0x1) != 0x0) {
            return 1;
        }
        if ((d & 0x4) == 0x4) {
            return 3;
        }
        return 2;
    }
}
