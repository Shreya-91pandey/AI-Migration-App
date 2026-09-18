public final class hv0 implements gv0, jv0
{
    public final float v;
    public final boolean w;
    public final iv0 x;
    public final float y;
    
    public hv0(final float n, final boolean w, final iv0 x) {
        this.v = n;
        this.w = w;
        this.x = x;
        this.y = n;
    }
    
    public final float d() {
        return this.y;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof hv0) {
                final hv0 hv0 = (hv0)o;
                if (qs8.e(this.v, hv0.v)) {
                    if (this.w == hv0.w) {
                        if (mlc.q((Object)this.x, (Object)hv0.x)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final void h(final xc8 xc8, int e, final int[] array, final qzc qzc, final int[] array2) {
        if (array.length != 0) {
            final int l0 = xc8.L0(this.v);
            final boolean w = this.w;
            final int n = 0;
            final boolean b = w && qzc == qzc.w;
            int n5;
            if (b) {
                final int length = array.length;
                final int n2 = 0;
                final int n3;
                int min = n3 = 0;
                int n4 = e;
                e = n3;
                for (int i = n2; i < length; ++i, ++e) {
                    final int max = Math.max(0, n4 - array[i]);
                    array2[e] = max;
                    min = Math.min(l0, max);
                    n4 = array2[e] - min;
                }
                n5 = n4 + min;
            }
            else {
                final int length2 = array.length;
                final int n6 = 0;
                int n7 = 0;
                int n9;
                int n10;
                int min3;
                int n11;
                for (int n8 = n9 = n7, j = n6; j < length2; ++j, n9 = min3, n7 = n11 + n10 + min3, ++n8) {
                    n10 = array[j];
                    final int min2 = Math.min(n7, e - n10);
                    array2[n8] = min2;
                    min3 = Math.min(l0, e - min2 - n10);
                    n11 = array2[n8];
                }
                n5 = e - (n7 - n9);
            }
            final iv0 x = this.x;
            if (x != null && n5 > 0) {
                final int n12 = e = x.e(n5, qzc);
                if (b) {
                    e = n12 - n5;
                }
                if (e != 0) {
                    for (int length3 = array2.length, k = n; k < length3; ++k) {
                        array2[k] += e;
                    }
                }
            }
        }
    }
    
    @Override
    public final int hashCode() {
        final int l = smk.l(Float.hashCode(this.v) * 31, 31, this.w);
        final iv0 x = this.x;
        int hashCode;
        if (x == null) {
            hashCode = 0;
        }
        else {
            hashCode = x.hashCode();
        }
        return l + hashCode;
    }
    
    public final void r(final xc8 xc8, final int n, final int[] array, final int[] array2) {
        this.h(xc8, n, array, qzc.v, array2);
    }
    
    @Override
    public final String toString() {
        String s;
        if (this.w) {
            s = "";
        }
        else {
            s = "Absolute";
        }
        final String f = qs8.f(this.v);
        final StringBuilder sb = new StringBuilder(s);
        sb.append("Arrangement#spacedAligned(");
        sb.append(f);
        sb.append(", ");
        sb.append((Object)this.x);
        sb.append(")");
        return sb.toString();
    }
}
