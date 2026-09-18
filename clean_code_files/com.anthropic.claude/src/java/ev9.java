import java.util.Map;
import java.util.LinkedHashMap;

public final class ev9
{
    public static final ev9 b;
    public static final ev9 c;
    public final dfo a;
    
    static {
        b = new ev9(new dfo(null, null, null, null, null, 127));
        c = new ev9(new dfo(null, null, null, null, null, 95));
    }
    
    public ev9(final dfo a) {
        this.a = a;
    }
    
    public final ev9 a(final ev9 ev9) {
        w3a w3a;
        if ((w3a = ev9.a.a) == null) {
            w3a = this.a.a;
        }
        final dfo a = ev9.a;
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
        final boolean e = a.e;
        final dfo a2 = this.a;
        return new ev9(new dfo(w3a, m4m, rd3, aak, e || a2.e, (Map)y5e.e0(a2.f, a.f)));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ev9 && ((ev9)o).a.equals(this.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        if (this.equals(ev9.b)) {
            return "ExitTransition.None";
        }
        if (this.equals(ev9.c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
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
        final boolean e = a.e;
        final StringBuilder t = oz1.t("ExitTransition:  Fade - ", string2, ",  Slide - ", string3, ",  Shrink - ");
        oz1.A(t, string4, ",  Scale - ", string, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        t.append(e);
        return t.toString();
    }
}
