public final class pvg extends gwg
{
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    
    public pvg(final float c, final float d, final float e, final float f, final float g, final float h) {
        super(2);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pvg)) {
            return false;
        }
        final pvg pvg = (pvg)o;
        return Float.compare(this.c, pvg.c) == 0 && Float.compare(this.d, pvg.d) == 0 && Float.compare(this.e, pvg.e) == 0 && Float.compare(this.f, pvg.f) == 0 && Float.compare(this.g, pvg.g) == 0 && Float.compare(this.h, pvg.h) == 0;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.h) + oz1.d(this.g, oz1.d(this.f, oz1.d(this.e, oz1.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = hia.r("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        oz1.z(r, this.e, ", y2=", this.f, ", x3=");
        r.append(this.g);
        r.append(", y3=");
        r.append(this.h);
        r.append(")");
        return r.toString();
    }
}
