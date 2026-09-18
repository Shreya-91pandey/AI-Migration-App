public abstract class m2a
{
    public static final h2a a;
    public static final h2a b;
    
    static {
        a = (h2a)new Object();
        final Class a2 = w30.a;
        h2a b2 = null;
        while (true) {
            try {
                b2 = (h2a)Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class<?>[])null).newInstance((Object[])null);
                b = b2;
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
}
