import java.util.List;

public final class xin extends lpm
{
    public CharSequence c;
    public List d;
    public dnn e;
    public mnn f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public qzc k;
    public tna l;
    public long m;
    public omn n;
    
    public xin() {
        super(g8m.h().g());
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.m = hv6.b(0, 0, 0, 0, 15);
    }
    
    @Override
    public final void a(final lpm lpm) {
        lpm.getClass();
        final xin xin = (xin)lpm;
        this.c = xin.c;
        this.d = xin.d;
        this.e = xin.e;
        this.f = xin.f;
        this.g = xin.g;
        this.h = xin.h;
        this.i = xin.i;
        this.j = xin.j;
        this.k = xin.k;
        this.l = xin.l;
        this.m = xin.m;
        this.n = xin.n;
    }
    
    @Override
    public final lpm b() {
        return new xin();
    }
    
    @Override
    public final String toString() {
        final CharSequence c = this.c;
        final List d = this.d;
        final dnn e = this.e;
        final mnn f = this.f;
        final boolean g = this.g;
        final boolean h = this.h;
        final float i = this.i;
        final float j = this.j;
        final qzc k = this.k;
        final tna l = this.l;
        final String m = gv6.m(this.m);
        final omn n = this.n;
        final StringBuilder sb = new StringBuilder("CacheRecord(visualText=");
        sb.append((Object)c);
        sb.append(", annotations=");
        sb.append((Object)d);
        sb.append(", composition=");
        sb.append((Object)e);
        sb.append(", textStyle=");
        sb.append((Object)f);
        sb.append(", singleLine=");
        p3g.i(sb, g, ", softWrap=", h, ", densityValue=");
        oz1.z(sb, i, ", fontScale=", j, ", layoutDirection=");
        sb.append((Object)k);
        sb.append(", fontFamilyResolver=");
        sb.append((Object)l);
        sb.append(", constraints=");
        sb.append(m);
        sb.append(", layoutResult=");
        sb.append((Object)n);
        sb.append(")");
        return sb.toString();
    }
}
