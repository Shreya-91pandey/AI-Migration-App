public final class zin
{
    public static final cib f;
    public final peo a;
    public final mnn b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    
    static {
        f = new cib((byte)26);
    }
    
    public zin(final peo a, final mnn b, final boolean c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append((Object)this.a);
        sb.append(", textStyle=");
        sb.append((Object)this.b);
        sb.append(", singleLine=");
        p3g.i(sb, this.c, ", softWrap=", this.d, ", isKeyboardTypePhone=");
        return ge9.t(sb, this.e, ")");
    }
}
