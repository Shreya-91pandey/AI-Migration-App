import java.util.List;

public final class hhn implements CharSequence
{
    public final yog A;
    public final List v;
    public final lln w;
    public final CharSequence x;
    public final long y;
    public final dnn z;
    
    public hhn(final CharSequence charSequence, long n, dnn dnn, yog yog, List v, final List list, lln w, final int n2) {
        final yog yog2 = null;
        if ((n2 & 0x4) != 0x0) {
            dnn = null;
        }
        if ((n2 & 0x8) != 0x0) {
            yog = null;
        }
        if ((n2 & 0x10) != 0x0) {
            v = null;
        }
        if ((n2 & 0x40) != 0x0) {
            w = null;
        }
        this.v = v;
        this.w = w;
        CharSequence x;
        if (charSequence instanceof hhn) {
            x = ((hhn)charSequence).x;
        }
        else {
            x = charSequence;
        }
        this.x = x;
        this.y = rhc.j(charSequence.length(), n);
        dnn z;
        if (dnn != null) {
            n = dnn.a;
            z = new dnn(rhc.j(charSequence.length(), n));
        }
        else {
            z = null;
        }
        this.z = z;
        yog a = yog2;
        if (yog != null) {
            n = ((dnn)yog.w).a;
            a = new yog(yog.v, (Object)new dnn(rhc.j(charSequence.length(), n)));
        }
        this.A = a;
    }
    
    public final char charAt(final int n) {
        return this.x.charAt(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (hhn.class != o.getClass()) {
            return false;
        }
        final hhn hhn = (hhn)o;
        return dnn.c(this.y, hhn.y) && mlc.q((Object)this.z, (Object)hhn.z) && mlc.q((Object)this.A, (Object)hhn.A) && mlc.q((Object)this.v, (Object)hhn.v) && rym.u0(this.x, hhn.x) && mlc.q((Object)this.w, (Object)hhn.w);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.x.hashCode();
        final int c = dnn.c;
        final int d = hia.d(hashCode * 31, this.y, 31);
        int hashCode2 = 0;
        final dnn z = this.z;
        int hashCode3;
        if (z != null) {
            hashCode3 = Long.hashCode(z.a);
        }
        else {
            hashCode3 = 0;
        }
        final yog a = this.A;
        int hashCode4;
        if (a != null) {
            hashCode4 = a.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final List v = this.v;
        int hashCode5;
        if (v != null) {
            hashCode5 = v.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final lln w = this.w;
        if (w != null) {
            hashCode2 = w.hashCode();
        }
        return (((d + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
    }
    
    public final int length() {
        return this.x.length();
    }
    
    public final CharSequence subSequence(final int n, final int n2) {
        return this.x.subSequence(n, n2);
    }
    
    @Override
    public final String toString() {
        return this.x.toString();
    }
}
