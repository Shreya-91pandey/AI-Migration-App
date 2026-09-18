public abstract class w30
{
    public static final Class a;
    public static final boolean b;
    
    static {
        final Class clazz = null;
        Class a2;
        try {
            Class.forName("libcore.io.Memory");
        }
        finally {
            a2 = null;
        }
        a = a2;
        while (true) {
            try {
                final Class<?> forName = Class.forName("org.robolectric.Robolectric");
                b = (forName != null);
            }
            finally {
                final Class<?> forName = clazz;
                continue;
            }
            break;
        }
    }
    
    public static boolean a() {
        return w30.a != null && !w30.b;
    }
}
