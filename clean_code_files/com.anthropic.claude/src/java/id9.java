import java.util.LinkedHashMap;

public final class id9
{
    public static final id9 b;
    public final dfo a;
    
    static {
        b = new id9(new dfo(null, null, null, null, null, 127));
    }
    
    public id9(final dfo a) {
        this.a = a;
    }
    
    public final id9 a(final id9 id9) {
        w3a w3a;
        if ((w3a = id9.a.a) == null) {
            w3a = this.a.a;
        }
        final dfo a = id9.a;
        m4m m4m;
        if ((m4m = a.b) == null) {
            m4m = this.a.b;
        }
        rd3 rd3;
        if ((rd3 = a.c) == null) {
            rd3 = this.a.c;
        }
        aak aak;
        if ((aak = a.d) == null) {
            aak = this.a.d;
        }
        return new id9(new dfo(w3a, m4m, rd3, aak, y5e.e0(this.a.f, a.f), 32));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof id9 && ((id9)o).a.equals(this.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        if (this.equals(id9.b)) {
            return "EnterTransition.None";
        }
        final dfo a = this.a;
        final w3a a2 = a.a;
        String string = null;
        String string2;
        if (a2 != null) {
            string2 = a2.toString();
        }
        else {
            string2 = null;
        }
        final m4m b = a.b;
        String string3;
        if (b != null) {
            string3 = b.toString();
        }
        else {
            string3 = null;
        }
        final rd3 c = a.c;
        String string4;
        if (c != null) {
            string4 = c.toString();
        }
        else {
            string4 = null;
        }
        final aak d = a.d;
        if (d != null) {
            string = d.toString();
        }
        return oz1.q(oz1.t("EnterTransition: Fade - ", string2, ", Slide - ", string3, ", Shrink - "), string4, ", Scale - ", string, ", Veil - null");
    }
}
