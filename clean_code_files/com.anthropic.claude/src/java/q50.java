public abstract class q50
{
    public static final b09 a;
    public static final b09 b;
    public static final jm6 c;
    public static final b09 d;
    public static final b09 e;
    public static final b09 f;
    
    static {
        a = new b09((jta)new y5((byte)11), (byte)0);
        b = new b09((jta)new y5((byte)12), (byte)1);
        c = new jm6((lta)new p50((byte)0));
        d = new b09((jta)new y5((byte)13), (byte)1);
        e = new b09((jta)new y5((byte)14), (byte)1);
        f = new b09((jta)new y5((byte)15), (byte)1);
    }
    
    public static final void a(final String s) {
        final StringBuilder sb = new StringBuilder("CompositionLocal ");
        sb.append(s);
        sb.append(" not present");
        throw new IllegalStateException(sb.toString().toString());
    }
}
