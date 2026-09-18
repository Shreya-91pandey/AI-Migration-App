public final class mln
{
    public static final n9k d;
    public final og0 a;
    public final long b;
    public final dnn c;
    
    static {
        d = new n9k((lta)new jkn((byte)1), (zta)new dtk((byte)13));
    }
    
    public mln(String s, long b, final int n) {
        if ((n & 0x1) != 0x0) {
            s = "";
        }
        if ((n & 0x2) != 0x0) {
            b = dnn.b;
        }
        this(new og0(s), b, null);
    }
    
    public mln(final og0 a, long a2, final dnn dnn) {
        this.a = a;
        this.b = rhc.j(a.w.length(), a2);
        dnn c;
        if (dnn != null) {
            a2 = dnn.a;
            c = new dnn(rhc.j(a.w.length(), a2));
        }
        else {
            c = null;
        }
        this.c = c;
    }
    
    public static mln a(final mln mln, og0 a, long b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = mln.a;
        }
        if ((n & 0x2) != 0x0) {
            b = mln.b;
        }
        dnn c;
        if ((n & 0x4) != 0x0) {
            c = mln.c;
        }
        else {
            c = null;
        }
        mln.getClass();
        return new mln(a, b, c);
    }
    
    public static mln b(final mln mln, final String s, long b, final int n) {
        if ((n & 0x2) != 0x0) {
            b = mln.b;
        }
        final dnn c = mln.c;
        mln.getClass();
        return new mln(new og0(s), b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof mln)) {
            return false;
        }
        final mln mln = (mln)o;
        return dnn.c(this.b, mln.b) && mlc.q((Object)this.c, (Object)mln.c) && mlc.q((Object)this.a, (Object)mln.a);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int c = dnn.c;
        final int d = hia.d(hashCode * 31, this.b, 31);
        final dnn c2 = this.c;
        int hashCode2;
        if (c2 != null) {
            hashCode2 = Long.hashCode(c2.a);
        }
        else {
            hashCode2 = 0;
        }
        return d + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String i = dnn.i(this.b);
        final StringBuilder sb = new StringBuilder("TextFieldValue(text='");
        sb.append((Object)this.a);
        sb.append("', selection=");
        sb.append(i);
        sb.append(", composition=");
        sb.append((Object)this.c);
        sb.append(")");
        return sb.toString();
    }
}
