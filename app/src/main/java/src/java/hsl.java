public final class hsl
{
    public final ksg a;
    public final ksg b;
    public final byl c;
    public final long d;
    public nzc e;
    public long f;
    public float g;
    public float h;
    public long i;
    public long j;
    public float k;
    public g7p l;
    
    public hsl() {
        final Boolean booleanFalse = Boolean.FALSE;
        this.a = o50.Q(false);
        this.b = o50.Q(false);
        this.c = new byl();
        this.d = bhf.b();
        this.f = j86.g;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = jeo.b;
        this.j = 0L;
        this.k = 1.0f;
    }
    
    public final eg0 a() {
        final boolean c = this.c();
        Float value = null;
        if (c) {
            final g7p l = this.l;
            if (l != null) {
                final float b = l.b();
                if (!Float.isNaN(b)) {
                    value = b;
                }
                if (value != null) {
                    final float floatValue = value;
                    return new eg0(floatValue);
                }
            }
            final float floatValue = 0.0f;
            return new eg0(floatValue);
        }
        return null;
    }
    
    public final fg0 b() {
        final boolean c = this.c();
        fg0 fg0 = null;
        final Float n = null;
        if (c) {
            final float d = f7p.d(0L);
            Float value = d;
            if (Float.isNaN(d)) {
                value = null;
            }
            float floatValue = 0.0f;
            float floatValue2;
            if (value != null) {
                floatValue2 = value;
            }
            else {
                floatValue2 = 0.0f;
            }
            final float e = f7p.e(0L);
            Float value2 = n;
            if (!Float.isNaN(e)) {
                value2 = e;
            }
            if (value2 != null) {
                floatValue = value2;
            }
            fg0 = new fg0(floatValue2, floatValue);
        }
        return fg0;
    }
    
    public final boolean c() {
        return (boolean)this.b.getValue();
    }
    
    public final boolean d() {
        return (boolean)this.a.getValue();
    }
    
    public final void e(final boolean b) {
        final ksg a = this.a;
        final boolean booleanValue = (boolean)a.getValue();
        final ksg b2 = this.b;
        if (booleanValue && !b) {
            b2.setValue((Object)Boolean.TRUE);
        }
        else if (b) {
            b2.setValue((Object)Boolean.FALSE);
        }
        a.setValue((Object)b);
    }
}
