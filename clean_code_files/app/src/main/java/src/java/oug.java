public final class oug implements CharSequence
{
    public CharSequence v;
    public cva w;
    public int x;
    public int y;
    
    public final void a(int n, final int n2, final CharSequence charSequence, final int n3, final int n4) {
        if (n > n2) {
            final StringBuilder sb = new StringBuilder("start=");
            sb.append(n);
            sb.append(" > end=");
            sb.append(n2);
            jac.a(sb.toString());
        }
        if (n3 > n4) {
            final StringBuilder sb2 = new StringBuilder("textStart=");
            sb2.append(n3);
            sb2.append(" > textEnd=");
            sb2.append(n4);
            jac.a(sb2.toString());
        }
        if (n < 0) {
            final StringBuilder sb3 = new StringBuilder("start must be non-negative, but was ");
            sb3.append(n);
            jac.a(sb3.toString());
        }
        if (n3 < 0) {
            final StringBuilder sb4 = new StringBuilder("textStart must be non-negative, but was ");
            sb4.append(n3);
            jac.a(sb4.toString());
        }
        final cva w = this.w;
        final int n5 = n4 - n3;
        if (w == null) {
            final int max = Math.max(255, n5 + 128);
            final char[] array = new char[max];
            final int min = Math.min(n, 64);
            final int min2 = Math.min(this.v.length() - n2, 64);
            final CharSequence v = this.v;
            final int x = n - min;
            i2r.s(v, array, 0, x, n);
            final CharSequence v2 = this.v;
            n = max - min2;
            final int y = min2 + n2;
            i2r.s(v2, array, n, n2, y);
            i2r.s(charSequence, array, min, n3, n4);
            this.w = new cva(array, min + n5, n, (byte)1);
            this.x = x;
            this.y = y;
            return;
        }
        final int x2 = this.x;
        final int n6 = n - x2;
        final int n7 = n2 - x2;
        if (n6 >= 0 && n7 <= w.d()) {
            w.e(n6, n7, charSequence, n3, n4);
            return;
        }
        this.v = (CharSequence)this.toString();
        this.w = null;
        this.x = -1;
        this.y = -1;
        this.a(n, n2, charSequence, n3, n4);
    }
    
    public final char charAt(final int n) {
        final cva w = this.w;
        if (w == null) {
            return this.v.charAt(n);
        }
        if (n < this.x) {
            return this.v.charAt(n);
        }
        final int d = w.d();
        final int x = this.x;
        if (n < d + x) {
            return w.c(n - x);
        }
        return this.v.charAt(n - (d - this.y + x));
    }
    
    public final int length() {
        final cva w = this.w;
        final CharSequence v = this.v;
        if (w == null) {
            return v.length();
        }
        return w.d() + (v.length() - (this.y - this.x));
    }
    
    public final CharSequence subSequence(final int n, final int n2) {
        return this.toString().subSequence(n, n2);
    }
    
    @Override
    public final String toString() {
        final cva w = this.w;
        if (w == null) {
            return this.v.toString();
        }
        final StringBuilder sb = new StringBuilder(this.v.length() + (w.d() + this.x) - this.y);
        sb.append(this.v, 0, this.x);
        w.a(sb);
        final CharSequence v = this.v;
        sb.append(v, this.y, v.length());
        return sb.toString();
    }
}
