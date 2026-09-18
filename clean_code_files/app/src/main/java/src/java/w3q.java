public enum w3q
{
    public static final w3q[] A;
    public static final enum k3q x;
    public static final enum n3q y;
    public static final enum q3q z;
    public final z3q v;
    public final byte w;
    
    static {
        final w3q w3q = new w3q("DOUBLE", 0, z3q.y, 1);
        final w3q w3q2 = new w3q("FLOAT", 1, z3q.x, 5);
        final z3q w = z3q.w;
        final w3q w3q3 = new w3q("INT64", 2, w, 0);
        final w3q w3q4 = new w3q("UINT64", 3, w, 0);
        final z3q v = z3q.v;
        final w3q w3q5 = new w3q("INT32", 4, v, 0);
        final w3q w3q6 = new w3q("FIXED64", 5, w, 1);
        final w3q w3q7 = new w3q("FIXED32", 6, v, 5);
        final w3q w3q8 = new w3q("BOOL", 7, z3q.z, 0);
        final k3q k3q = x = (k3q)new w3q("STRING", 8, z3q.A, 2);
        final z3q d = z3q.D;
        A = new w3q[] { w3q, w3q2, w3q3, w3q4, w3q5, w3q6, w3q7, w3q8, k3q, y = (n3q)new w3q("GROUP", 9, d, 3), z = (q3q)new w3q("MESSAGE", 10, d, 2), new w3q("BYTES", 11, z3q.B, 2), new w3q("UINT32", 12, v, 0), new w3q("ENUM", 13, z3q.C, 0), new w3q("SFIXED32", 14, v, 5), new w3q("SFIXED64", 15, w, 1), new w3q("SINT32", 16, v, 0), new w3q("SINT64", 17, w, 0) };
    }
    
    public w3q(final String s, final int n, final z3q v, final int w) {
        this.v = v;
        this.w = (byte)w;
    }
}
