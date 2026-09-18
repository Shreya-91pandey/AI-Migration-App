public final class mx6
{
    public final tl2 a;
    public final l13 b;
    
    public mx6(final tl2 a, final l13 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final l13 b = this.b;
        final lc7 lc7 = (lc7)b.z.M0((gc7)lc7.x);
        String w;
        if (lc7 != null) {
            w = lc7.w;
        }
        else {
            w = null;
        }
        final int hashCode = this.hashCode();
        lq6.u(16);
        final String string = Integer.toString(hashCode, 16);
        string.getClass();
        String k;
        if (w != null) {
            k = hia.k("[", w, "](");
        }
        else {
            k = "(";
        }
        final Object a = this.a.a();
        final StringBuilder sb = new StringBuilder("Request@");
        sb.append(string);
        sb.append(k);
        sb.append("currentBounds()=");
        sb.append(a);
        sb.append(", continuation=");
        sb.append((Object)b);
        sb.append(")");
        return sb.toString();
    }
}
