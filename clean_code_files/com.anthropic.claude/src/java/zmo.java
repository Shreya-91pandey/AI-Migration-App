public final class zmo
{
    public final una a;
    public final zoa b;
    public final int c;
    public final int d;
    public final Object e;
    
    public zmo(final una a, final zoa b, final int c, final int d, final Object e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zmo)) {
            return false;
        }
        final zmo zmo = (zmo)o;
        return mlc.q((Object)this.a, (Object)zmo.a) && mlc.q((Object)this.b, (Object)zmo.b) && (this.c == zmo.c && this.d == zmo.d) && mlc.q(this.e, zmo.e);
    }
    
    @Override
    public final int hashCode() {
        final int n = 0;
        final una a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int y = hia.y(this.d, hia.y(this.c, (hashCode * 31 + this.b.v) * 31, 31), 31);
        final Object e = this.e;
        int hashCode2;
        if (e == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = e.hashCode();
        }
        return y + hashCode2;
    }
    
    @Override
    public final String toString() {
        String s = "Invalid";
        final int c = this.c;
        String s2;
        if (c == 0) {
            s2 = "Normal";
        }
        else if (c == 1) {
            s2 = "Italic";
        }
        else {
            s2 = "Invalid";
        }
        final int d = this.d;
        if (d == 0) {
            s = "None";
        }
        else if (d == 1) {
            s = "Weight";
        }
        else if (d == 2) {
            s = "Style";
        }
        else if (d == 65535) {
            s = "All";
        }
        final StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append((Object)this.a);
        sb.append(", fontWeight=");
        sb.append((Object)this.b);
        sb.append(", fontStyle=");
        oz1.A(sb, s2, ", fontSynthesis=", s, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
