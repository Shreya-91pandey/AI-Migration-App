public class lua extends l03 implements kua, qtc, aua
{
    public final byte B;
    
    public lua(final int n, final Class clazz, final String s, final String s2, final int n2) {
        this(n, k03.v, clazz, s, s2, n2);
    }
    
    public lua(final int b, final Object o, final Class clazz, final String s, final String s2, final int n) {
        boolean b2 = true;
        if ((n & 0x1) != 0x1) {
            b2 = false;
        }
        super(o, clazz, s, s2, b2);
        this.B = (byte)b;
    }
    
    @Override
    public final int e() {
        return this.B;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof lua) {
                final lua lua = (lua)o;
                if (super.y.equals((Object)lua.y) && super.z.equals((Object)lua.z) && mlc.q(super.w, lua.w) && mlc.q(this.i(), lua.i())) {
                    return true;
                }
            }
            else if (o instanceof lua) {
                qtc v = super.v;
                if (v == null) {
                    this.c();
                    super.v = this;
                    v = this;
                }
                return o.equals(v);
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.i() == null) {
            n = 0;
        }
        else {
            n = this.i().hashCode() * 31;
        }
        return super.z.hashCode() + smk.j(n, 31, super.y);
    }
    
    @Override
    public final String toString() {
        qtc v;
        if ((v = super.v) == null) {
            this.c();
            super.v = this;
            v = this;
        }
        if (v != this) {
            return v.toString();
        }
        final String y = super.y;
        if ("<init>".equals((Object)y)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return hia.k("function ", y, " (Kotlin reflection is not available)");
    }
}
