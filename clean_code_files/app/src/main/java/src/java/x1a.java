public abstract class x1a
{
    public static final Class a;
    
    static {
        Class<?> forName;
        try {
            forName = Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        }
        catch (final ClassNotFoundException ex) {
            forName = null;
        }
        a = forName;
    }
}
