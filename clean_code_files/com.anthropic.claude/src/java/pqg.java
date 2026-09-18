import java.util.List;

public final class pqg
{
    public final int a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    public final List f;
    
    public pqg(final int a, final float b, final int c, final float d, final float e, final List f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static pqg a(final pqg pqg, final int n, float b, final int n2) {
        if ((n2 & 0x2) != 0x0) {
            b = pqg.b;
        }
        final int c = pqg.c;
        final float d = pqg.d;
        float e;
        if ((n2 & 0x10) != 0x0) {
            e = pqg.e;
        }
        else {
            e = 360.0f;
        }
        Object o;
        if ((n2 & 0x20) != 0x0) {
            o = pqg.f;
        }
        else {
            o = r89.v;
        }
        return new pqg(n, b, c, d, e, (List)o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof pqg) {
                final pqg pqg = (pqg)o;
                if (this.a == pqg.a) {
                    if (qs8.e(this.b, pqg.b)) {
                        if (this.c == pqg.c) {
                            if (qs8.e(this.d, pqg.d)) {
                                if (qs8.e(this.e, pqg.e)) {
                                    if (qs8.e(420.0f, 420.0f)) {
                                        if (mlc.q((Object)this.f, (Object)pqg.f)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode() + oz1.d(420.0f, oz1.d(this.e, oz1.d(this.d, (oz1.d(this.b, this.a * 31, 31) + this.c) * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final String f = qs8.f(this.b);
        final String f2 = qs8.f(this.d);
        final String f3 = qs8.f(this.e);
        final String f4 = qs8.f(420.0f);
        final int size = this.f.size();
        final StringBuilder w = lmf.w(this.a, "PaneScaffoldDirective(maxHorizontalPartitions=", ", horizontalPartitionSpacerSize=", f, ", maxVerticalPartitions=");
        w.append(this.c);
        w.append(", verticalPartitionSpacerSize=");
        w.append(f2);
        w.append(", defaultPanePreferredWidth=");
        oz1.A(w, f3, ", defaultPanePreferredHeight=", f4, ", number of excluded bounds=");
        return smk.q(size, ")", w);
    }
}
