import java.util.LinkedHashMap;
import java.util.Map;

public final class dfo
{
    public final w3a a;
    public final m4m b;
    public final rd3 c;
    public final aak d;
    public final boolean e;
    public final Map f;
    
    public dfo(final w3a a, final m4m b, final rd3 c, final aak d, final boolean e, final Map f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dfo)) {
            return false;
        }
        final dfo dfo = (dfo)o;
        return mlc.q(this.a, dfo.a) && mlc.q(this.b, dfo.b) && mlc.q(this.c, dfo.c) && mlc.q(this.d, dfo.d) && this.e == dfo.e && mlc.q(this.f, dfo.f);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final w3a a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final m4m b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final rd3 c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final aak d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return this.f.hashCode() + smk.l((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode) * 961, 31, this.e);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TransitionData(fade=");
        sb.append((Object)this.a);
        sb.append(", slide=");
        sb.append((Object)this.b);
        sb.append(", changeSize=");
        sb.append((Object)this.c);
        sb.append(", scale=");
        sb.append((Object)this.d);
        sb.append(", veil=null, hold=");
        sb.append(this.e);
        sb.append(", effectsMap=");
        sb.append((Object)this.f);
        sb.append(")");
        return sb.toString();
    }
}
