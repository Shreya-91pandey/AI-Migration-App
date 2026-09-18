public abstract class e4e
{
    public static final z3e a;
    public static final z3e b;
    
    static {
        final Class a2 = w30.a;
        z3e a3 = null;
        while (true) {
            try {
                a3 = (z3e)Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class<?>[])null).newInstance((Object[])null);
                a = a3;
                b = (z3e)new Object();
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
}
