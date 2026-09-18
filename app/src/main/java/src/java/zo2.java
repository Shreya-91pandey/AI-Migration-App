import java.io.File;

public abstract class zo2
{
    public static final int a = 0;
    
    static {
        final o55 a;
        monitorenter(a = o55.A);
        Label_0125: {
            Label_0116: {
                String property;
                try {
                    property = System.getProperty("androidx.sqlite.driver.bundled.path");
                    final String property2 = System.getProperty("androidx.sqlite.driver.bundled.name");
                    if (property == null || property2 == null) {
                        break Label_0116;
                    }
                    final File file = new File(property, property2);
                    if (file.exists()) {
                        System.load(file.getAbsolutePath());
                        monitorexit(a);
                        return;
                    }
                }
                finally {
                    break Label_0125;
                }
                final StringBuilder sb = new StringBuilder("Cannot find a suitable SQLite binary at the configured path(androidx.sqlite.driver.bundled.path = ");
                sb.append(property);
                sb.append("). File ");
                final Throwable t;
                sb.append((Object)t);
                sb.append(" does not exist.");
                throw new IllegalStateException(sb.toString().toString());
            }
            System.loadLibrary("sqliteJni");
            monitorexit(a);
            return;
        }
        monitorexit(a);
    }
}
