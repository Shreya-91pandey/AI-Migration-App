public final class pu0 extends x90
{
    public static volatile pu0 j;
    public static final ou0 k;
    public final s78 i;
    
    static {
        k = new ou0((byte)0);
    }
    
    public pu0() {
        this.i = new s78();
    }
    
    public static pu0 O() {
        if (pu0.j != null) {
            return pu0.j;
        }
        final Class<pu0> clazz;
        monitorenter(clazz = pu0.class);
        Label_0040: {
            try {
                if (pu0.j == null) {
                    pu0.j = new pu0();
                }
                break Label_0040;
            }
            finally {
                monitorexit(clazz);
                monitorexit(clazz);
                return pu0.j;
            }
        }
    }
}
