import java.lang.ref.Reference;
import androidx.concurrent.futures.b;

public final class s03 extends b3
{
    public final t03 C;
    
    public s03(final t03 c) {
        this.C = c;
    }
    
    @Override
    public final String l() {
        final b b = (b)((Reference)this.C.v).get();
        if (b == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        final StringBuilder sb = new StringBuilder("tag=[");
        sb.append(b.a);
        sb.append("]");
        return sb.toString();
    }
}
