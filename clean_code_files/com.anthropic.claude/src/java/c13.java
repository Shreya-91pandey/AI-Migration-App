public final class c13 implements qma
{
    public static final c13 a;
    public static Boolean b;
    
    static {
        a = (c13)new Object();
    }
    
    @Override
    public final boolean a() {
        final Boolean b = c13.b;
        if (b != null) {
            return b;
        }
        throw ge9.x("canFocus is read before it is written");
    }
    
    @Override
    public final void b(final boolean b) {
        c13.b = b;
    }
}
